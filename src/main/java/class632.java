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

@OriginalClass("client!nd")
public abstract class class632 extends class167 {

    @OriginalMember(owner = "client!nd", name = "od", descriptor = "Lfea;")
    private class47 field9023 = new class47();

    @OriginalMember(owner = "client!nd", name = "Fd", descriptor = "Z")
    public boolean field9040 = true;

    @OriginalMember(owner = "client!nd", name = "xd", descriptor = "Leda;")
    public class516 field9032 = new class516();

    @OriginalMember(owner = "client!nd", name = "Xd", descriptor = "Leda;")
    public class516 field9058 = new class516();

    @OriginalMember(owner = "client!nd", name = "Yd", descriptor = "Leda;")
    public class516 field9059 = new class516();

    @OriginalMember(owner = "client!nd", name = "Zd", descriptor = "Leda;")
    public class516 field9060 = new class516();

    @OriginalMember(owner = "client!nd", name = "ae", descriptor = "Leda;")
    private class516 field9061 = new class516();

    @OriginalMember(owner = "client!nd", name = "be", descriptor = "Leda;")
    private class516 field9062 = new class516();

    @OriginalMember(owner = "client!nd", name = "he", descriptor = "F")
    public float field9068 = 3584.0F;

    @OriginalMember(owner = "client!nd", name = "fe", descriptor = "Lbg;")
    public class340 field9066 = class631.field8868;

    @OriginalMember(owner = "client!nd", name = "je", descriptor = "I")
    public int field9070 = 0;

    @OriginalMember(owner = "client!nd", name = "ne", descriptor = "[F")
    private float[] field9074 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nd", name = "re", descriptor = "[F")
    private float[] field9078 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nd", name = "xe", descriptor = "Lfaa;")
    public class273 field9084 = class395.field5915;

    @OriginalMember(owner = "client!nd", name = "me", descriptor = "Z")
    public boolean field9073 = false;

    @OriginalMember(owner = "client!nd", name = "ce", descriptor = "I")
    public int field9063 = 8;

    @OriginalMember(owner = "client!nd", name = "ge", descriptor = "I")
    public int field9067 = 0;

    @OriginalMember(owner = "client!nd", name = "Be", descriptor = "I")
    private int field9088 = 1;

    @OriginalMember(owner = "client!nd", name = "ie", descriptor = "[F")
    public float[] field9069 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nd", name = "ue", descriptor = "I")
    public int field9081 = 0;

    @OriginalMember(owner = "client!nd", name = "De", descriptor = "[F")
    public float[] field9090 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!nd", name = "te", descriptor = "F")
    public float field9080 = 1.0F;

    @OriginalMember(owner = "client!nd", name = "Qe", descriptor = "F")
    private float field9103 = 3000.0F;

    @OriginalMember(owner = "client!nd", name = "Oe", descriptor = "Z")
    public boolean field9101 = true;

    @OriginalMember(owner = "client!nd", name = "Ke", descriptor = "I")
    public int field9097 = 0;

    @OriginalMember(owner = "client!nd", name = "kf", descriptor = "Z")
    private boolean field9122 = false;

    @OriginalMember(owner = "client!nd", name = "de", descriptor = "Z")
    private boolean field9064 = false;

    @OriginalMember(owner = "client!nd", name = "ve", descriptor = "I")
    public int field9082 = 0;

    @OriginalMember(owner = "client!nd", name = "Je", descriptor = "I")
    private int field9096 = -1;

    @OriginalMember(owner = "client!nd", name = "jf", descriptor = "F")
    public float field9121 = -1.0F;

    @OriginalMember(owner = "client!nd", name = "Ge", descriptor = "I")
    public int field9093 = 0;

    @OriginalMember(owner = "client!nd", name = "Ce", descriptor = "Z")
    public boolean field9089 = true;

    @OriginalMember(owner = "client!nd", name = "Ze", descriptor = "Z")
    public boolean field9112 = false;

    @OriginalMember(owner = "client!nd", name = "we", descriptor = "Z")
    public boolean field9083 = true;

    @OriginalMember(owner = "client!nd", name = "cf", descriptor = "F")
    public float field9115 = 1.0F;

    @OriginalMember(owner = "client!nd", name = "Fe", descriptor = "[Lrda;")
    private class92[] field9092 = new class92[10];

    @OriginalMember(owner = "client!nd", name = "vf", descriptor = "Z")
    private boolean field9133 = false;

    @OriginalMember(owner = "client!nd", name = "Ue", descriptor = "I")
    public int field9107 = 50;

    @OriginalMember(owner = "client!nd", name = "df", descriptor = "I")
    private int field9116 = 0;

    @OriginalMember(owner = "client!nd", name = "Ne", descriptor = "F")
    private float field9100 = 1.0F;

    @OriginalMember(owner = "client!nd", name = "ff", descriptor = "I")
    private int field9118 = -1;

    @OriginalMember(owner = "client!nd", name = "tf", descriptor = "[F")
    public float[] field9131 = this.field9078;

    @OriginalMember(owner = "client!nd", name = "uf", descriptor = "F")
    public float field9132 = 1.0F;

    @OriginalMember(owner = "client!nd", name = "Gf", descriptor = "Z")
    public boolean field9144 = true;

    @OriginalMember(owner = "client!nd", name = "pf", descriptor = "I")
    public int field9127 = 128;

    @OriginalMember(owner = "client!nd", name = "zf", descriptor = "[F")
    private float[] field9137 = new float[16];

    @OriginalMember(owner = "client!nd", name = "sf", descriptor = "F")
    public float field9130 = 3584.0F;

    @OriginalMember(owner = "client!nd", name = "Ef", descriptor = "Z")
    public boolean field9142 = false;

    @OriginalMember(owner = "client!nd", name = "Bf", descriptor = "I")
    public int field9139 = 3584;

    @OriginalMember(owner = "client!nd", name = "Df", descriptor = "F")
    public float field9141 = 1.0F;

    @OriginalMember(owner = "client!nd", name = "Cf", descriptor = "I")
    public int field9140 = 3;

    @OriginalMember(owner = "client!nd", name = "Ie", descriptor = "Z")
    public boolean field9095 = true;

    @OriginalMember(owner = "client!nd", name = "Jf", descriptor = "I")
    public int field9147 = -1;

    @OriginalMember(owner = "client!nd", name = "nf", descriptor = "[F")
    private float[] field9125 = new float[16];

    @OriginalMember(owner = "client!nd", name = "qf", descriptor = "I")
    public int field9128 = 0;

    @OriginalMember(owner = "client!nd", name = "ze", descriptor = "I")
    public int field9086 = 0;

    @OriginalMember(owner = "client!nd", name = "Kf", descriptor = "Z")
    private boolean field9148 = false;

    @OriginalMember(owner = "client!nd", name = "Sf", descriptor = "I")
    private int field9156 = 0;

    @OriginalMember(owner = "client!nd", name = "Lf", descriptor = "I")
    public int field9149 = 0;

    @OriginalMember(owner = "client!nd", name = "wf", descriptor = "[F")
    private float[] field9134 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nd", name = "Pf", descriptor = "Z")
    private boolean field9153 = false;

    @OriginalMember(owner = "client!nd", name = "ef", descriptor = "F")
    public float field9117 = -1.0F;

    @OriginalMember(owner = "client!nd", name = "of", descriptor = "Z")
    public boolean field9126 = false;

    @OriginalMember(owner = "client!nd", name = "Ff", descriptor = "I")
    public int field9143 = -1;

    @OriginalMember(owner = "client!nd", name = "Of", descriptor = "I")
    private int field9152 = 16777215;

    @OriginalMember(owner = "client!nd", name = "Hf", descriptor = "I")
    private int field9145 = 0;

    @OriginalMember(owner = "client!nd", name = "Tf", descriptor = "I")
    private int field9157 = 0;

    @OriginalMember(owner = "client!nd", name = "Pe", descriptor = "I")
    public int field9102 = -1;

    @OriginalMember(owner = "client!nd", name = "Vf", descriptor = "I")
    public int field9159 = 512;

    @OriginalMember(owner = "client!nd", name = "Xf", descriptor = "[F")
    private float[] field9161 = new float[16];

    @OriginalMember(owner = "client!nd", name = "Uf", descriptor = "I")
    public int field9158 = 512;

    @OriginalMember(owner = "client!nd", name = "Nf", descriptor = "I")
    public int field9151 = 0;

    @OriginalMember(owner = "client!nd", name = "se", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9079 = new Stream();

    @OriginalMember(owner = "client!nd", name = "dg", descriptor = "Leda;")
    private class516 field9167 = new class516();

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "Ljava/lang/Object;")
    public Object field8907;

    @OriginalMember(owner = "client!nd", name = "yc", descriptor = "Ljava/lang/Object;")
    private Object field8981;

    @OriginalMember(owner = "client!nd", name = "Ye", descriptor = "I")
    public int field9111;

    @OriginalMember(owner = "client!nd", name = "Pc", descriptor = "Lgp;")
    public class561 field8998;

    @OriginalMember(owner = "client!nd", name = "Oc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8997;

    @OriginalMember(owner = "client!nd", name = "Bc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8984;

    @OriginalMember(owner = "client!nd", name = "Af", descriptor = "I")
    public int field9138;

    @OriginalMember(owner = "client!nd", name = "Jb", descriptor = "I")
    private int field8940;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public int field8892;

    @OriginalMember(owner = "client!nd", name = "Bb", descriptor = "I")
    private int field8932;

    @OriginalMember(owner = "client!nd", name = "pc", descriptor = "I")
    public int field8972;

    @OriginalMember(owner = "client!nd", name = "He", descriptor = "Lli;")
    private class466 field9094;

    @OriginalMember(owner = "client!nd", name = "qc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field8973;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lpp;")
    public static class464 field8876 = new class464(23, 3);

    @OriginalMember(owner = "client!nd", name = "ee", descriptor = "F")
    public float field9065;

    @OriginalMember(owner = "client!nd", name = "qe", descriptor = "F")
    public float field9077;

    @OriginalMember(owner = "client!nd", name = "ye", descriptor = "F")
    private float field9085;

    @OriginalMember(owner = "client!nd", name = "Me", descriptor = "F")
    public float field9099;

    @OriginalMember(owner = "client!nd", name = "lf", descriptor = "F")
    private float field9123;

    @OriginalMember(owner = "client!nd", name = "xf", descriptor = "F")
    private float field9135;

    @OriginalMember(owner = "client!nd", name = "Rf", descriptor = "F")
    public float field9155;

    @OriginalMember(owner = "client!nd", name = "Wf", descriptor = "F")
    public float field9160;

    @OriginalMember(owner = "client!nd", name = "ag", descriptor = "F")
    public float field9164;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!nd", name = "qb", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!nd", name = "rb", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!nd", name = "sb", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!nd", name = "tb", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!nd", name = "ub", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!nd", name = "vb", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!nd", name = "wb", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!nd", name = "xb", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!nd", name = "yb", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!nd", name = "zb", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!nd", name = "Ab", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!nd", name = "Cb", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!nd", name = "Db", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!nd", name = "Eb", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!nd", name = "Fb", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!nd", name = "Gb", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!nd", name = "Hb", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!nd", name = "Ib", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!nd", name = "Kb", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!nd", name = "Lb", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!nd", name = "Mb", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!nd", name = "Nb", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!nd", name = "Ob", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!nd", name = "Pb", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!nd", name = "Qb", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!nd", name = "Sb", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!nd", name = "Tb", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!nd", name = "Ub", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!nd", name = "Vb", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!nd", name = "Wb", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!nd", name = "Xb", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!nd", name = "Yb", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!nd", name = "Zb", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!nd", name = "ac", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!nd", name = "bc", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!nd", name = "cc", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!nd", name = "dc", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!nd", name = "ec", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!nd", name = "fc", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!nd", name = "gc", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!nd", name = "hc", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!nd", name = "ic", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!nd", name = "jc", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!nd", name = "kc", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!nd", name = "mc", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!nd", name = "nc", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!nd", name = "oc", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!nd", name = "rc", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!nd", name = "sc", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!nd", name = "tc", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!nd", name = "uc", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!nd", name = "vc", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!nd", name = "wc", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!nd", name = "xc", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!nd", name = "zc", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!nd", name = "Ac", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!nd", name = "Cc", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!nd", name = "Dc", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!nd", name = "Ec", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!nd", name = "Fc", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!nd", name = "Gc", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!nd", name = "Hc", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!nd", name = "Ic", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!nd", name = "Jc", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!nd", name = "Kc", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!nd", name = "Lc", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!nd", name = "Mc", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!nd", name = "Nc", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!nd", name = "Qc", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!nd", name = "Rc", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!nd", name = "Sc", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!nd", name = "Tc", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!nd", name = "Uc", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!nd", name = "Vc", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!nd", name = "Wc", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!nd", name = "Xc", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!nd", name = "Yc", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!nd", name = "Zc", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!nd", name = "ad", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!nd", name = "bd", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!nd", name = "cd", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!nd", name = "dd", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!nd", name = "ed", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!nd", name = "fd", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!nd", name = "gd", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!nd", name = "hd", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!nd", name = "id", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!nd", name = "jd", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!nd", name = "kd", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!nd", name = "ld", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!nd", name = "md", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!nd", name = "nd", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!nd", name = "pd", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!nd", name = "qd", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!nd", name = "rd", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!nd", name = "td", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!nd", name = "ud", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!nd", name = "vd", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!nd", name = "wd", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!nd", name = "yd", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!nd", name = "zd", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!nd", name = "Ad", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!nd", name = "Bd", descriptor = "I")
    public int field9036;

    @OriginalMember(owner = "client!nd", name = "Cd", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!nd", name = "Dd", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!nd", name = "Ed", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!nd", name = "Gd", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!nd", name = "Hd", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!nd", name = "Id", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!nd", name = "Jd", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!nd", name = "Kd", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!nd", name = "Md", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!nd", name = "Nd", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!nd", name = "Od", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!nd", name = "Pd", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!nd", name = "Qd", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!nd", name = "Rd", descriptor = "I")
    public int field9052;

    @OriginalMember(owner = "client!nd", name = "Sd", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!nd", name = "Td", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!nd", name = "Ud", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!nd", name = "Vd", descriptor = "I")
    public int field9056;

    @OriginalMember(owner = "client!nd", name = "Wd", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!nd", name = "ke", descriptor = "I")
    public int field9071;

    @OriginalMember(owner = "client!nd", name = "oe", descriptor = "I")
    public int field9075;

    @OriginalMember(owner = "client!nd", name = "pe", descriptor = "I")
    public int field9076;

    @OriginalMember(owner = "client!nd", name = "Re", descriptor = "I")
    private int field9104;

    @OriginalMember(owner = "client!nd", name = "Te", descriptor = "I")
    public int field9106;

    @OriginalMember(owner = "client!nd", name = "We", descriptor = "I")
    public int field9109;

    @OriginalMember(owner = "client!nd", name = "yf", descriptor = "I")
    private int field9136;

    @OriginalMember(owner = "client!nd", name = "Mf", descriptor = "I")
    public int field9150;

    @OriginalMember(owner = "client!nd", name = "Yf", descriptor = "I")
    public int field9162;

    @OriginalMember(owner = "client!nd", name = "Zf", descriptor = "I")
    public int field9163;

    @OriginalMember(owner = "client!nd", name = "wg", descriptor = "I")
    private int field9186;

    @OriginalMember(owner = "client!nd", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!nd", name = "bf", descriptor = "Ldl;")
    private class112 field9114;

    @OriginalMember(owner = "client!nd", name = "cg", descriptor = "Loa;")
    public class211 field9166;

    @OriginalMember(owner = "client!nd", name = "gg", descriptor = "Loa;")
    public class211 field9170;

    @OriginalMember(owner = "client!nd", name = "jg", descriptor = "Loa;")
    public class211 field9173;

    @OriginalMember(owner = "client!nd", name = "kg", descriptor = "Loa;")
    public class211 field9174;

    @OriginalMember(owner = "client!nd", name = "mg", descriptor = "Loa;")
    public class211 field9176;

    @OriginalMember(owner = "client!nd", name = "ng", descriptor = "Loa;")
    public class211 field9177;

    @OriginalMember(owner = "client!nd", name = "og", descriptor = "Loa;")
    public class211 field9178;

    @OriginalMember(owner = "client!nd", name = "pg", descriptor = "Loa;")
    public class211 field9179;

    @OriginalMember(owner = "client!nd", name = "rg", descriptor = "Loa;")
    public class211 field9181;

    @OriginalMember(owner = "client!nd", name = "tg", descriptor = "Loa;")
    public class211 field9183;

    @OriginalMember(owner = "client!nd", name = "Rb", descriptor = "Lom;")
    public class331 field8948;

    @OriginalMember(owner = "client!nd", name = "fg", descriptor = "Lup;")
    private class342 field9169;

    @OriginalMember(owner = "client!nd", name = "hg", descriptor = "Lup;")
    private class342 field9171;

    @OriginalMember(owner = "client!nd", name = "Se", descriptor = "Lno;")
    private class483 field9105;

    @OriginalMember(owner = "client!nd", name = "bg", descriptor = "Lws;")
    public class530 field9165;

    @OriginalMember(owner = "client!nd", name = "ig", descriptor = "Lws;")
    private class530 field9172;

    @OriginalMember(owner = "client!nd", name = "lg", descriptor = "Lws;")
    public class530 field9175;

    @OriginalMember(owner = "client!nd", name = "qg", descriptor = "Lws;")
    public class530 field9180;

    @OriginalMember(owner = "client!nd", name = "sg", descriptor = "Lws;")
    public class530 field9182;

    @OriginalMember(owner = "client!nd", name = "ug", descriptor = "Lws;")
    private class530 field9184;

    @OriginalMember(owner = "client!nd", name = "Ld", descriptor = "Lgl;")
    public static class590 field9046;

    @OriginalMember(owner = "client!nd", name = "eg", descriptor = "Lsp;")
    private class620 field9168;

    @OriginalMember(owner = "client!nd", name = "Qf", descriptor = "Lrda;")
    private class92 field9154;

    @OriginalMember(owner = "client!nd", name = "gf", descriptor = "Lqv;")
    public class96 field9119;

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8915;

    @OriginalMember(owner = "client!nd", name = "lc", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field8968;

    @OriginalMember(owner = "client!nd", name = "sd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field9027;

    @OriginalMember(owner = "client!nd", name = "le", descriptor = "Z")
    public boolean field9072;

    @OriginalMember(owner = "client!nd", name = "Le", descriptor = "Z")
    public boolean field9098;

    @OriginalMember(owner = "client!nd", name = "af", descriptor = "Z")
    public boolean field9113;

    @OriginalMember(owner = "client!nd", name = "hf", descriptor = "Z")
    public boolean field9120;

    @OriginalMember(owner = "client!nd", name = "If", descriptor = "Z")
    public boolean field9146;

    @OriginalMember(owner = "client!nd", name = "vg", descriptor = "Z")
    public boolean field9185;

    @OriginalMember(owner = "client!nd", name = "Ee", descriptor = "[Lfd;")
    public class143[] field9091;

    @OriginalMember(owner = "client!nd", name = "Ve", descriptor = "[Lfd;")
    public class143[] field9108;

    @OriginalMember(owner = "client!nd", name = "Xe", descriptor = "[Lsq;")
    public class442[] field9110;

    @OriginalMember(owner = "client!nd", name = "Ae", descriptor = "[Leda;")
    public class516[] field9087;

    @OriginalMember(owner = "client!nd", name = "rf", descriptor = "[Luca;")
    public class637[] field9129;

    @OriginalMember(owner = "client!nd", name = "mf", descriptor = "[Lqv;")
    private class96[] field9124;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9009;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 16)
    public final void method605(Canvas arg0) {
        ++field8886;
        if (this.field8997 == arg0) {
            throw new RuntimeException();
        } else if (this.field9027.containsKey(arg0)) {
            this.method92(this.field9027.get(arg0), -113, arg0);
            this.field9027.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "()Z", line = 40)
    public final boolean method629() {
        ++field8992;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZZ)V", line = 48)
    public final void method3568(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg1 == 14511) {
            if (~this.field9096 != ~arg0) {
                if (arg0 < 0) {
                    this.method3627(arg1 ^ -14541);
                    this.method3577((class96) null, true);
                    this.method3600(-122, 0);
                    if (!this.field9120) {
                        this.method3598(arg2, arg3, 0, 0, 0, (byte) 121);
                    }
                } else {
                    class405 var5 = this.field9094.method2713(0, arg0);
                    class576 var6 = super.field2443.method2387((byte) 127, arg0);
                    if (~var6.field8215 == -1 && ~var6.field8214 == -1) {
                        this.method3627(-88);
                    } else {
                        int var7 = !var6.field8205 ? 128 : 64;
                        int var8 = var7 * 50;
                        class516 var9 = this.method3595((byte) 40);
                        var9.method2911(0.0F, (float) (this.field9162 % var8 * var6.field8214) / (float) var8, 16383, (float) (this.field9162 % var8 * var6.field8215) / (float) var8);
                        this.method3616(class577.field8230, (byte) 94);
                    }
                    if (!this.field9120) {
                        this.method3598(arg2, arg3, var6.field8203, var6.field8206, var6.field8210, (byte) 121);
                    }
                    if (this.field9154 != null) {
                        this.field9154.method672(0, var6.field8220, var5);
                    } else {
                        this.method3577(var5, true);
                        this.method3600(arg1 ^ -14545, var6.field8220);
                    }
                }
                this.field9096 = arg0;
            }
            ++field8925;
            this.field9104 &= -8;
        }
    }

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "()Z", line = 109)
    public final boolean method595() {
        ++field8995;
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "(I)V", line = 121)
    private final void method3569(int arg0) {
        if (arg0 > 104) {
            ++field8952;
            if (this.field9154 != null) {
                this.field9154.method812((byte) -31);
            }
            this.method125(-25370);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ldg;IB)V", line = 136)
    public final void method3570(class20 arg0, int arg1, byte arg2) {
        this.method88(arg1, false, arg0, false);
        ++field8970;
        int var4 = -53 % ((arg2 - -32) / 33);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V", line = 151)
    private final void method3571(byte arg0) {
        ++field9024;
        if (!this.field9148) {
            float[] var2 = this.field9161;
            float var3 = (float) this.field9107 + -this.field9135;
            float var4 = (float) this.field9139 + -this.field9135;
            float var5 = (float) (-this.field9097) * this.field9100 / (float) this.field9159;
            float var6 = (float) (-this.field9149) * this.field9100 / (float) this.field9158;
            float var7 = (float) (-this.field9149 + this.field8972) * this.field9100 / (float) this.field9158;
            float var8 = (float) (-this.field9097 + this.field8892) * this.field9100 / (float) this.field9159;
            if (var6 != var7 && var5 != var8) {
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[9] = 0.0F;
                var2[14] = var3 / (-var4 + var3);
                var2[0] = 2.0F / (-var6 + var7);
                var2[3] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[2] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[15] = 1.0F;
                var2[13] = (var5 + var8) / (var8 - var5);
            } else {
                var2[10] = 1.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[15] = 1.0F;
                var2[12] = 0.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
            }
            this.method3639(121);
            this.field9148 = true;
        }
        if (arg0 != -5) {
            this.field9135 = -2.0426316F;
        }
    }

    @OriginalMember(owner = "client!nd", name = "ra", descriptor = "()F", line = 221)
    public final float method613() {
        ++field9049;
        return this.field9135;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(Z)V", line = 232)
    public final void method3572(boolean arg0) {
        ++field8943;
        if (~this.field9104 != -5) {
            this.method3607(0);
            this.method3604(false, -72);
            this.method3630((byte) 85, false);
            this.method3622(false, (byte) 43);
            this.method3623(false, 124);
            this.method3568(-2, 14511, false, false);
            this.method3624(-70, 1);
            this.method3600(-105, 0);
            this.field9104 = 4;
        }
        if (arg0) {
            this.field8997 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(Z)V", line = 267)
    private final void method3573(boolean arg0) {
        if (arg0) {
            this.method126(59);
        }
        if (class214.field3244 != this.field9084) {
            class273 var2 = this.field9084;
            this.field9084 = class214.field3244;
            if (!var2.method1766((byte) 98)) {
                this.method3625(!arg0);
            }
            this.method3571((byte) -5);
            this.field9131 = this.field9161;
            this.method3636(2);
            this.field9104 &= -8;
        }
        ++field8893;
    }

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "()V", line = 304)
    public final void method657() {
        if (this.field9185) {
            this.field9185 = false;
            this.method100((byte) -61);
        }
        ++field8908;
        this.field9093 = 0;
        this.field9067 = this.field8972;
        this.field9081 = 0;
        this.field9086 = this.field8892;
        this.method3642(true);
    }

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "()Z", line = 322)
    public final boolean method635() {
        ++field8927;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIII)V", line = 330)
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field9051;
    }

    @OriginalMember(owner = "client!nd", name = "za", descriptor = "(IIIIII[BII)V", line = 338)
    public final void method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8918;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V", line = 346)
    public final void method3574(boolean arg0, int arg1) {
        if (arg0) {
            this.method399(-82);
        }
        if (this.field9076 != arg1) {
            this.field9076 = arg1;
            this.method129((byte) -95);
        }
        ++field9038;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(ZI)V", line = 368)
    public final void method3575(boolean arg0, int arg1) {
        if (arg1 < 33) {
            this.field9084 = null;
        }
        if (arg0 == !this.field9101) {
            this.field9101 = arg0;
            this.method81(5373);
        }
        ++field8969;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V", line = 394)
    public final void method621(boolean arg0) {
        this.field9095 = arg0;
        ++field9039;
        this.method154(-5163);
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(Z)V", line = 404)
    public final void method3576(boolean arg0) {
        if (arg0) {
            this.field8915 = null;
        }
        ++field8955;
        if (this.field9104 != 16) {
            this.method3573(false);
            this.method3604(true, -51);
            this.method3622(true, (byte) 43);
            this.method3623(true, 124);
            this.method3624(-34, 1);
            this.field9104 = 16;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lqv;Z)V", line = 427)
    public final void method3577(class96 arg0, boolean arg1) {
        ++field9054;
        if (this.field9124[this.field9082] != arg0) {
            this.field9124[this.field9082] = arg0;
            if (arg0 != null) {
                arg0.method841(86);
            } else {
                this.method155(1);
            }
            this.field9104 &= -2;
        }
        if (!arg1) {
            this.field9160 = 1.3789629F;
        }
    }

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "(I)V", line = 449)
    private final void method3578(int arg0) {
        if (!this.field9064) {
            float[] var2 = this.field9137;
            float var3 = (float) (-this.field9149 * this.field9107) / (float) this.field9158;
            float var4 = (float) ((-this.field9149 + this.field8972) * this.field9107) / (float) this.field9158;
            float var5 = (float) (this.field9107 * this.field9097) / (float) this.field9159;
            float var6 = (float) ((this.field9097 - this.field8892) * this.field9107) / (float) this.field9159;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field9107 * 2.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[15] = 0.0F;
                var2[10] = this.field9085 = (float) this.field9139 / (float) (-this.field9139 + this.field9107);
                var2[2] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = this.field9123 = (float) (this.field9139 * this.field9107) / (float) (this.field9107 - this.field9139);
                var2[13] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[4] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = -1.0F;
            } else {
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[13] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[2] = 0.0F;
            }
            this.method3580(6);
            this.field9064 = true;
        }
        ++field8934;
        if (arg0 != 1181) {
            this.method642(-74);
        }
    }

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "(I)V", line = 522)
    public final void method3579(int arg0) {
        this.field9040 = false;
        if (arg0 <= 59) {
            this.method129((byte) 120);
        }
        ++field8994;
        this.method3585(0);
    }

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "(I)V", line = 534)
    private final void method3580(int arg0) {
        if (arg0 != 6) {
            this.field9162 = 46;
        }
        if (this.field9135 == 0.0F) {
            this.field9137[14] = this.field9123;
            this.field9137[10] = this.field9085;
        } else {
            float var2 = this.field9103 / (this.field9135 + this.field9103);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field9123 * (1.0F - var2) / this.field9135;
            this.field9137[14] = this.field9123 * var3;
            this.field9137[10] = this.field9085 + var4;
        }
        ++field8996;
        this.field9068 = (this.field9137[14] - (float) this.field9139) / this.field9137[10];
    }

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "()Z", line = 565)
    public final boolean method555() {
        ++field9034;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ln;Lgp;II)V", line = 574)
    public class632(Canvas arg0, Object arg1, class472 arg2, class561 arg3, int arg4, int arg5) {
        super(arg2);
        this.field8981 = this.field8907 = arg1;
        this.field9111 = arg4;
        this.field8998 = arg3;
        this.field8984 = this.field8997 = arg0;
        Dimension var7 = arg0.getSize();
        this.field9138 = arg5;
        this.field8892 = this.field8940 = var7.height;
        this.field8972 = this.field8932 = var7.width;
        class327.method2034(2, true, false);
        this.field9094 = new class466(this, super.field2443);
        this.field8973 = new NativeInterface(super.field2443.method2391(105), this.field9138);
        for (int var8 = 0; var8 < super.field2443.method2391(100); ++var8) {
            class576 var9 = super.field2443.method2387((byte) 127, var8);
            if (var9 != null) {
                this.field8973.initTextureMetrics(var8, var9.field8212, var9.field8216);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "(IFFFFF)V", line = 611)
    public final void method600(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8990;
        boolean var7 = ~this.field9152 != ~arg0;
        if (var7 || this.field9121 != arg1 || this.field9117 != arg2) {
            this.field9117 = arg2;
            this.field9152 = arg0;
            this.field9121 = arg1;
            if (var7) {
                this.field9115 = (float) (16711680 & this.field9152) / 1.671168E7F;
                this.field9132 = (float) (this.field9152 & 65280) / 65280.0F;
                this.field9080 = (float) (255 & this.field9152) / 255.0F;
                this.method115(22);
            }
            this.field8973.setSunColour(this.field9115, this.field9132, this.field9080, arg1, arg2);
            this.method109((byte) -119);
        }
        if (this.field9134[0] != arg3 || this.field9134[1] != arg4 || this.field9134[2] != arg5) {
            this.field9134[2] = arg5;
            this.field9134[0] = arg3;
            this.field9134[1] = arg4;
            this.field9074[2] = -arg5;
            this.field9074[1] = -arg4;
            this.field9074[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9069[0] = arg3 * var8;
            this.field9069[1] = arg4 * var8;
            this.field9069[2] = arg5 * var8;
            this.field9090[0] = -this.field9069[0];
            this.field9090[2] = -this.field9069[2];
            this.field9090[1] = -this.field9069[1];
            this.field8973.setSunDirection(this.field9069[0], this.field9069[1], this.field9069[2]);
            this.method138(7);
            this.field9075 = (int) (arg3 * 256.0F / arg4);
            this.field9150 = (int) (arg5 * 256.0F / arg4);
        }
        this.method110(-19726);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILpca;)V", line = 662)
    private final void method3581(int arg0, int arg1, class362 arg2) {
        this.method114(this.field9184, (byte) -86);
        int var4 = -115 % ((arg0 - 37) / 49);
        ++field9045;
        this.method152(0, this.field9171, 124);
        this.method148(0, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 674)
    public final void method403(int arg0) {
        ++field8924;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIIIII)V", line = 691)
    public final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9026;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        if (this.method3628((float) arg2 + var11, (float) arg3 + var10, 0.0F, 0, (float) arg1, 0.0F, (float) arg0)) {
            this.method3634((byte) 96);
            this.method3574(false, arg4);
            this.method3601(-109, class104.field1753, 0);
            this.method3570(class104.field1753, 0, (byte) 78);
            this.method3624(-96, arg5);
            this.method3621(-91);
            this.method105(20636, false);
            this.method3593(0);
            this.method105(20636, true);
            this.method3570(class477.field6813, 0, (byte) -102);
            this.method3601(-51, class477.field6813, 0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 721)
    public final class542 method405(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8901;
        return new class460(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "(I)V", line = 730)
    public final void method3582(int arg0) {
        ++field8937;
        Hashtable var2 = new Hashtable();
        if (this.field9027 != null && !this.field9027.isEmpty()) {
            Enumeration var3 = this.field9027.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method106((byte) 2, var4));
            }
        }
        if (arg0 != 496) {
            this.method405(-7, -107, (int[][]) null, (int[][]) null, -32, 96, -16);
        }
        this.field9027 = var2;
        this.method3620(arg0 ^ 23058);
        this.method3626(arg0 + 26555);
        this.field9114.method934(-83, this);
    }

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "(IIII)V", line = 762)
    public final void method658(int arg0, int arg1, int arg2, int arg3) {
        this.field9156 = arg3;
        this.field9120 = true;
        this.field9118 = arg2;
        this.field9143 = arg1;
        this.field9136 = arg0;
        ++field8960;
        this.method3598(false, false, 3, 0, 0, (byte) 121);
        if (this.field9154 != null) {
            this.field9154.method821(1);
        }
        this.method3569(118);
        this.method86((byte) 122);
    }

    @OriginalMember(owner = "client!nd", name = "CA", descriptor = "()I", line = 783)
    public final int method531() {
        ++field9010;
        return this.field9139;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLfd;Lfd;)V", line = 791)
    public final void method3583(boolean arg0, class143 arg1, class143 arg2) {
        ++field9012;
        boolean var4 = arg0;
        if (this.field9091[this.field9082] != arg1) {
            this.field9091[this.field9082] = arg1;
            this.method96((byte) 66);
            var4 = true;
        }
        if (this.field9108[this.field9082] != arg2) {
            this.field9108[this.field9082] = arg2;
            this.method107((byte) 127);
            var4 = true;
        }
        if (var4) {
            this.field9104 &= -30;
        }
    }

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "()F", line = 826)
    public final float method542() {
        ++field8891;
        return this.field9103;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZI)Ljaclib/memory/heap/NativeHeapBuffer;", line = 836)
    public final NativeHeapBuffer method3584(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field9125 = null;
        }
        ++field9048;
        return this.field8915.method3233(arg2, arg0);
    }

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "()V", line = 848)
    public void method95() {
        ++field8989;
        if (!this.field9122) {
            for (class108 var1 = this.field9023.method427(true); var1 != null; var1 = this.field9023.method420(false)) {
                ((class191) var1).method1266(false);
            }
            Enumeration var2 = this.field9027.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method92(this.field9027.get(var3), -112, var3);
            }
            class246.method1560((byte) -103, false, true);
            this.field8973.release();
            this.field9122 = true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "(I)V", line = 886)
    private final void method3585(int arg0) {
        ++field8957;
        if (class617.field8730 == this.field9084) {
            float var2 = this.method82(-120);
            this.field9032.method2905(var2, -113, var2, 0.0F);
        }
        if (arg0 == 0) {
            this.field9153 = false;
            this.method132(false);
            if (this.field9154 != null) {
                this.field9154.method820((byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "(I)V", line = 912)
    public final void method3586(int arg0) {
        this.field9108 = new class143[this.field9109];
        this.field9110 = new class442[this.field9109];
        this.field9124 = new class96[this.field9109];
        this.field9087 = new class516[this.field9109];
        this.field9091 = new class143[this.field9109];
        ++field9019;
        for (int var2 = 0; var2 < this.field9109; ++var2) {
            this.field9108[var2] = class635.field9225;
            this.field9091[var2] = class635.field9225;
            this.field9110[var2] = class94.field1654;
            this.field9087[var2] = new class516();
        }
        this.field9129 = new class637[this.field9163 + -2];
        this.field9119 = this.method149(true, 1, 1, class343.field4922, class85.field1472);
        this.method593(new class191(262144));
        this.field9165 = this.method87(false, new class58[] { new class58(new class109[] { class109.field1807, class109.field1819 }) });
        this.field9175 = this.method87(false, new class58[] { new class58(new class109[] { class109.field1807, class109.field1817 }) });
        this.field9180 = this.method87(false, new class58[] { new class58(class109.field1807), new class58(class109.field1817), new class58(class109.field1819), new class58(class109.field1813) });
        this.field9182 = this.method87(false, new class58[] { new class58(class109.field1807), new class58(class109.field1817), new class58(class109.field1819) });
        this.field9179 = new class211(this, 0, 0, false, false);
        this.field9181 = new class211(this, 0, 0, true, true);
        this.field9173 = new class211(this, 0, 0, false, false);
        this.field9178 = new class211(this, 0, 0, true, true);
        this.field9166 = new class211(this, 0, 0, false, false);
        this.field9170 = new class211(this, 0, 0, true, true);
        this.field9174 = new class211(this, 0, 0, false, false);
        this.field9177 = new class211(this, 0, 0, true, true);
        this.field9176 = new class211(this, 0, 0, false, false);
        this.field9183 = new class211(this, arg0, 0, true, true);
        this.field9114 = new class112(this);
        this.field9168 = this.method98(true, (byte) 14);
        this.method3582(496);
        this.field8948 = new class331(this);
        this.field9092[1] = this.method113(1, arg0 + 7);
        this.field9092[2] = this.method113(2, class631.method3567(arg0, 7));
        this.field9092[4] = this.method113(4, 7);
        this.field9092[5] = this.method113(5, arg0 + 7);
        this.field9092[6] = this.method113(6, 7);
        this.field9092[7] = this.method113(7, 7);
        this.field9092[3] = this.method113(3, arg0 + 7);
        this.field9092[8] = this.method113(8, 7);
        this.field9092[9] = this.method113(9, 7);
        if (!this.field9092[2].method673(-1)) {
            this.field9092[2] = this.method113(0, 7);
        }
        if (!this.field9092[4].method673(-1)) {
            this.field9092[4] = this.field9092[2];
        }
        if (!this.field9092[8].method673(-1)) {
            this.field9092[8] = this.field9092[4];
        }
        if (!this.field9092[9].method673(-1)) {
            this.field9092[9] = this.field9092[8];
        }
        this.method161((byte) -104);
        this.method657();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI[IIB)Ldea;", line = 983)
    public final class405 method3587(boolean arg0, int arg1, int[] arg2, int arg3, byte arg4) {
        if (arg4 > -33) {
            this.method3582(44);
        }
        ++field8978;
        return this.method145(0, arg1, 0, arg2, arg3, 3, arg0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;", line = 995)
    public final Stream method3588(Buffer arg0, byte arg1) {
        this.field9079.method3243(arg0);
        int var3 = 65 / ((-18 - arg1) / 39);
        ++field8941;
        return this.field9079;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V", line = 1009)
    private final void method3589(byte arg0) {
        this.field9064 = false;
        ++field9043;
        this.method3578(arg0 + 1295);
        if (class313.field4564 == this.field9084) {
            this.method3636(arg0 ^ -116);
        }
        if (arg0 != -114) {
            this.method3570((class20) null, 127, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)I", line = 1026)
    public final int method649(int arg0, int arg1) {
        ++field8951;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "(I)V", line = 1037)
    public static final void method3590(int arg0) {
        ++field8897;
        if (arg0 <= -101) {
            for (int var1 = 0; var1 < 100; ++var1) {
                class555.field7860[var1] = null;
            }
            class424.field6208 = 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "()Z", line = 1055)
    public final boolean method407() {
        ++field8896;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "(F)V", line = 1066)
    public final void method569(float arg0) {
        if (this.field9141 != arg0) {
            this.field9141 = arg0;
            this.field8973.setAmbient(arg0);
            this.method115(117);
            this.method110(-19726);
        }
        ++field8905;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILkl;BI[F)Ldea;", line = 1083)
    public final class405 method3591(boolean arg0, int arg1, class468 arg2, byte arg3, int arg4, float[] arg5) {
        if (arg3 < 64) {
            this.field9059 = null;
        }
        ++field8900;
        return this.method162(arg1, 0, 2, arg0, arg2, arg5, arg4, 0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)V", line = 1094)
    public final void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8929;
        float var7 = this.method82(-104);
        this.method3634((byte) 111);
        this.method3574(false, arg4);
        this.method3601(-93, class104.field1753, 0);
        this.method3570(class104.field1753, 0, (byte) -76);
        this.method3624(-35, arg5);
        this.field9032.method2902((float) (arg2 + -1), (float) (arg3 + -1), (byte) 2, 1.0F);
        this.field9032.method2905((float) arg0 + -var7, -114, (float) arg1 - var7, 0.0F);
        this.method3579(102);
        this.method105(20636, false);
        this.method3581(-73, 4, class121.field1948);
        this.method105(20636, true);
        this.method3570(class477.field6813, 0, (byte) 90);
        this.method3601(-101, class477.field6813, 0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lr;Lsh;Lm;[Lpaa;I)V", line = 1118)
    public final void method397(class519[] arg0, class616 arg1, class105 arg2, class315[] arg3, int arg4) {
        this.method406(arg0, arg2, arg3, arg4);
        ++field8890;
        this.method563(arg1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B[F)[F", line = 1129)
    public final float[] method3592(byte arg0, float[] arg1) {
        arg1[12] = this.field9131[3];
        arg1[8] = this.field9131[2];
        arg1[0] = this.field9131[0];
        ++field8884;
        arg1[4] = this.field9131[1];
        arg1[13] = this.field9131[7];
        if (arg0 <= 3) {
            this.field9177 = null;
        }
        arg1[9] = this.field9131[6];
        arg1[1] = this.field9131[4];
        arg1[2] = this.field9131[8];
        arg1[5] = this.field9131[5];
        arg1[10] = this.field9131[10];
        arg1[7] = this.field9131[13];
        arg1[6] = this.field9131[9];
        arg1[14] = this.field9131[11];
        arg1[3] = this.field9131[12];
        arg1[15] = this.field9131[15];
        arg1[11] = this.field9131[14];
        return arg1;
    }

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "(I)V", line = 1159)
    private final void method3593(int arg0) {
        this.method114(this.field9172, (byte) -37);
        ++field8933;
        this.method152(0, this.field9169, 74);
        this.method148(0, class97.field1696, 1, arg0);
    }

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "(I)V", line = 1169)
    public final void method3594(int arg0) {
        if (this.field9104 != arg0) {
            this.method3614(-8);
            this.method3604(true, 120);
            this.method3622(true, (byte) 43);
            this.method3623(true, 122);
            this.method3624(-90, 1);
            this.field9104 = 8;
        }
        ++field8987;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)Leda;", line = 1187)
    public final class516 method3595(byte arg0) {
        if (arg0 != 40) {
            return null;
        } else {
            ++field8971;
            return this.field9087[this.field9082];
        }
    }

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "()Z", line = 1199)
    public final boolean method594() {
        ++field8880;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "()Z", line = 1207)
    public final boolean method618() {
        ++field8959;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1217)
    public final void method624(Canvas arg0) {
        ++field8947;
        if (this.field8997 == arg0) {
            throw new RuntimeException();
        } else if (!this.field9027.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method106((byte) 2, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field9027.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "la", descriptor = "(FF)V", line = 1254)
    public final void method517(float arg0, float arg1) {
        if (this.field9103 != arg0 || this.field9135 != arg1) {
            this.field9103 = arg0;
            this.field9135 = arg1;
            this.method3639(80);
            this.method3580(6);
            this.method3608((byte) 99);
            this.method3589((byte) -114);
        }
        ++field8873;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZI[BLkl;)Ldea;", line = 1271)
    public final class405 method3596(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, class468 arg5) {
        ++field9025;
        return arg3 != 0 ? null : this.method151(0, arg2, arg1, arg0, -85, arg5, arg4, 0);
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(Z)V", line = 1287)
    public final void method3597(boolean arg0) {
        if (class395.field5915 != this.field9084) {
            class273 var2 = this.field9084;
            this.field9084 = class395.field5915;
            if (var2.method1766((byte) 77)) {
                this.method3625(arg0);
            }
            this.field9131 = this.field9078;
            this.field9104 &= -32;
        }
        if (!arg0) {
            this.method3618(-37);
        }
        ++field8874;
    }

    @OriginalMember(owner = "client!nd", name = "JA", descriptor = "(IIII)V", line = 1311)
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        ++field8965;
        if (!this.field9120) {
            throw new RuntimeException("");
        } else {
            if (this.field9136 != arg0) {
                this.field9136 = arg0;
                if (this.field9154 != null) {
                    this.field9154.method821(1);
                }
            }
            this.field9118 = arg2;
            this.field9156 = arg3;
            this.field9143 = arg1;
            this.method3569(111);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZIIIB)V", line = 1338)
    private final void method3598(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field9053;
        boolean var7 = arg1 & this.method529();
        if (arg5 != 121) {
            this.method589(-79, -96, -60, 118, -127);
        }
        if (!var7 && (~arg2 == -5 || arg2 == 8 || ~arg2 == -10)) {
            arg2 = 2;
            arg4 = ~arg2 == -5 ? arg3 & 1 : 1;
            arg3 = 0;
        }
        if (arg2 != 0 && arg0) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (~this.field9157 == ~arg2) {
            if (~this.field9157 != -1) {
                this.field9092[Integer.MAX_VALUE & this.field9157].method676(arg0, arg5 ^ -32);
                if (this.field9116 != arg3 || ~this.field9145 != ~arg4) {
                    this.field9092[this.field9157 & Integer.MAX_VALUE].method675(true, arg4, arg3);
                    this.field9116 = arg3;
                    this.field9145 = arg4;
                }
                return;
            }
        } else {
            if (~this.field9157 != -1) {
                this.field9092[Integer.MAX_VALUE & this.field9157].method669((byte) 79);
            }
            if (~arg2 != -1) {
                this.field9154 = this.field9092[arg2 & Integer.MAX_VALUE];
                this.field9154.method671(arg0, (byte) 107);
                this.field9154.method676(arg0, -69);
                this.field9154.method675(true, arg4, arg3);
            } else {
                this.field9154 = null;
            }
            this.field9145 = arg4;
            this.field9157 = arg2;
            this.field9116 = arg3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 1395)
    public void method101(int arg0) {
        ++field8938;
        this.field9094.method2711(5);
        this.field9162 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(B)I", line = 1405)
    public final int method3599(byte arg0) {
        ++field8922;
        if (arg0 > -36) {
            this.method3583(false, (class143) null, (class143) null);
        }
        return this.field9136;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I", line = 1416)
    public final int method560(int arg0, int arg1) {
        ++field8983;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)V", line = 1426)
    public final void method525(boolean arg0) {
        ++field9014;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lu;)V", line = 1434)
    public final void method593(class424 arg0) {
        this.field8915 = ((class191) arg0).field2725;
        ++field8945;
        this.field8968 = this.field8915.method3233(32768, false);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)V", line = 1447)
    public final void method3600(int arg0, int arg1) {
        if (arg1 == 1) {
            this.method3583(false, class634.field9219, class634.field9219);
        } else if (~arg1 == -1) {
            this.method3583(false, class635.field9225, class635.field9225);
        } else if (~arg1 != -3) {
            if (arg1 != 3) {
                if (arg1 == 4) {
                    this.method3583(false, class466.field6716, class466.field6716);
                }
            } else {
                this.method3583(false, class211.field3065, class635.field9225);
            }
        } else {
            this.method3583(false, class609.field8665, class634.field9219);
        }
        if (arg0 > -68) {
            this.method3592((byte) 35, (float[]) null);
        }
        ++field8923;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILdg;I)V", line = 1476)
    public final void method3601(int arg0, class20 arg1, int arg2) {
        ++field8919;
        if (arg0 > -5) {
            this.field9108 = null;
        }
        this.method97(false, false, 8, arg1, arg2);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lr;Lm;[Lpaa;I)V", line = 1491)
    public final void method406(class519[] arg0, class105 arg1, class315[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1379(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field9016;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()Z", line = 1513)
    public final boolean method650() {
        ++field9022;
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "(I)V", line = 1523)
    public final void method3602(int arg0) {
        ++field9015;
        this.method3597(true);
        this.method3636(2);
        int var2 = -40 % ((arg0 - 56) / 41);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIILpa;II)V", line = 1534)
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class593 arg6, int arg7, int arg8) {
        ++field8946;
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(B)V", line = 1542)
    private final void method3603(byte arg0) {
        this.method130(20);
        ++field8928;
        if (this.field9154 != null) {
            this.field9154.method816(1);
        }
        if (arg0 != 4) {
            this.field9109 = -125;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()I", line = 1556)
    public final int method537() {
        ++field8872;
        return this.field9107;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()Lm;", line = 1564)
    public final class105 method637() {
        ++field8954;
        return this.field9167;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIII)V", line = 1572)
    public final void method519(int arg0, int arg1, int arg2, int arg3) {
        this.field9149 = arg0;
        this.field9097 = arg1;
        ++field8914;
        this.field9158 = arg2;
        this.field9159 = arg3;
        this.method3608((byte) 80);
        this.method3589((byte) -114);
        this.method3597(true);
        this.method3642(true);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(ZI)V", line = 1590)
    public final void method3604(boolean arg0, int arg1) {
        ++field8979;
        if (!this.field9113 != !arg0) {
            this.field9113 = arg0;
            this.method86((byte) 99);
            this.field9104 &= -32;
        }
        int var3 = -21 / ((32 - arg1) / 61);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(FB)V", line = 1607)
    public final void method3605(float arg0, byte arg1) {
        ++field8885;
        if (arg1 > 53) {
            if (this.field9100 != arg0) {
                this.field9100 = arg0;
                this.method3608((byte) 96);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V", line = 1632)
    public final void method3606(int arg0, byte arg1) {
        this.method3574(false, arg1 << 16 | arg1 << 24 | arg1 << 8 | arg1);
        ++field8930;
        if (arg0 != 7) {
            this.field9118 = 58;
        }
    }

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "(IIIII)V", line = 1643)
    public final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8916;
    }

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "(I)V", line = 1651)
    private final void method3607(int arg0) {
        if (class617.field8730 != this.field9084) {
            class273 var2 = this.field9084;
            this.field9084 = class617.field8730;
            if (var2.method1766((byte) 87)) {
                this.method3625(true);
            }
            this.method3631(-84);
            this.field9131 = this.field9125;
            this.method3636(2);
            this.field9104 &= -25;
        }
        if (arg0 == 0) {
            ++field8875;
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(IIIIII)V", line = 1675)
    public final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9035;
        this.method3634((byte) 106);
        this.method3574(false, arg4);
        this.method3601(-113, class104.field1753, 0);
        this.method3570(class104.field1753, 0, (byte) -113);
        this.method3624(-76, arg5);
        this.field9032.method2902((float) arg2, (float) arg3, (byte) 2, 1.0F);
        this.field9032.method877(arg0, arg1, 0);
        this.method3579(76);
        this.method105(20636, false);
        this.method3615((byte) -61);
        this.method105(20636, true);
        this.method3570(class477.field6813, 0, (byte) -69);
        this.method3601(-19, class477.field6813, 0);
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)Lrda;", line = 1695)
    public class92 method113(int arg0, int arg1) {
        ++field8899;
        if (arg1 != 7) {
            this.method555();
        }
        if (arg0 != 6) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    return arg0 == 7 ? new class497(this) : new class155(this);
                } else {
                    return new class563(this, this.field8948);
                }
            } else {
                return new class494(this);
            }
        } else {
            return new class68(this);
        }
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "(B)V", line = 1746)
    public void method161(byte arg0) {
        ++field8926;
        this.method3641(19);
        if (arg0 != -104) {
            this.method652(-115, -77, -16, -47, -67);
        }
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "(B)V", line = 1762)
    private final void method3608(byte arg0) {
        if (arg0 <= 56) {
            this.field9069 = null;
        }
        this.field9148 = false;
        ++field9008;
        if (class214.field3244 == this.field9084) {
            this.method3571((byte) -5);
            this.method3636(2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lld;IIII)Lr;", line = 1781)
    public final class519 method400(class560 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8906;
        return new class211(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lkk;)V", line = 1789)
    public final void method556(class149 arg0) {
        ++field9055;
        this.field9105 = (class483) arg0;
    }

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "(IIII)V", line = 1797)
    public final void method581(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > this.field9081) {
            this.field9081 = arg1;
        }
        if (this.field9086 > arg3) {
            this.field9086 = arg3;
        }
        if (this.field9067 > arg2) {
            this.field9067 = arg2;
        }
        if (~arg0 < ~this.field9093) {
            this.field9093 = arg0;
        }
        ++field8991;
        if (~this.field9093 >= -1 && this.field8972 <= this.field9067 && ~this.field9081 >= -1 && ~this.field8892 >= ~this.field9086) {
            this.method657();
        } else {
            if (!this.field9185) {
                this.field9185 = true;
                this.method100((byte) -61);
            }
            this.method137((byte) -110);
            this.method3642(true);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lr;Lsh;Lm;Lpaa;I)V", line = 1831)
    public final void method553(class519 arg0, class616 arg1, class105 arg2, class315 arg3, int arg4) {
        arg0.method1379(arg2, arg3, arg4);
        ++field9001;
        this.method563(arg1);
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1841)
    public final void method402(Canvas arg0) {
        ++field8902;
        Object var2 = null;
        if (arg0 != null && this.field8997 != arg0) {
            if (this.field9027.containsKey(arg0)) {
                var2 = this.field9027.get(arg0);
            }
        } else {
            var2 = this.field8981;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method112((byte) -25, var2, arg0);
            if (this.field8984 == arg0) {
                this.method3638(1);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "(I)Leda;", line = 1870)
    public final class516 method3609(int arg0) {
        int var2 = -3 % ((arg0 - 44) / 62);
        ++field8942;
        return this.field9060;
    }

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "(ILpa;II)V", line = 1880)
    public final void method592(int arg0, class593 arg1, int arg2, int arg3) {
        ++field8910;
        class117 var5 = (class117) arg1;
        class405 var6 = var5.field1904;
        this.method3618(107);
        this.method3577(var6, true);
        this.method3624(-35, 1);
        this.method3583(false, class634.field9219, class634.field9219);
        this.method3601(-123, class104.field1753, 0);
        this.method3574(false, arg0);
        this.field9032.method2902((float) this.field8972, (float) this.field8892, (byte) 2, 0.0F);
        this.method3579(79);
        this.field9087[0].method2902(var6.method1532(-8221, (float) this.field8972), var6.method1531(false, (float) this.field8892), (byte) 2, 1.0F);
        this.field9087[0].method2905(var6.method1532(-8221, (float) (-arg2)), -114, var6.method1531(false, (float) (-arg3)), 0.0F);
        this.field9110[0] = class577.field8230;
        this.method3603((byte) 4);
        this.method3615((byte) -126);
        this.method3627(-101);
        this.method3601(-29, class477.field6813, 0);
    }

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "(I)I", line = 1906)
    public final int method3610(int arg0) {
        ++field9033;
        if (arg0 != 1) {
            this.method587((class105) null);
        }
        return this.field9156;
    }

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "(I)I", line = 1919)
    public final int method3611(int arg0) {
        int var2 = -118 % ((-13 - arg0) / 63);
        ++field8963;
        return this.field9118;
    }

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "(I)V", line = 1930)
    public final void method3612(int arg0) {
        ++field9037;
        Enumeration var2 = this.field9027.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method92(this.field9027.get(var3), -48, var3);
        }
        this.field9171.method249(12416);
        this.field9169.method249(12416);
        this.field9181.method1365(-21369);
        this.field9178.method1365(-21369);
        this.field9170.method1365(-21369);
        this.field9177.method1365(-21369);
        this.field9183.method1365(-21369);
        if (arg0 <= -89) {
            this.field9114.method935(-110);
            this.field9168.method249(12416);
        }
    }

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "(I)V", line = 1962)
    public void method127(int arg0) {
        ++field8909;
        this.field9106 = this.field9071;
        int var2 = -37 % ((-83 - arg0) / 42);
        this.field9071 = 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIF)Luca;", line = 1976)
    public final class637 method601(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8988;
        return new class596(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "(I)Luba;", line = 1984)
    public final class628 method3613(int arg0) {
        if (arg0 <= 59) {
            this.field9184 = null;
        }
        ++field8961;
        return this.field9105 != null ? this.field9105.method2782((byte) -126) : null;
    }

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "(I)V", line = 1996)
    private final void method3614(int arg0) {
        if (class313.field4564 != this.field9084) {
            class273 var2 = this.field9084;
            this.field9084 = class313.field4564;
            if (!var2.method1766((byte) 92)) {
                this.method3625(true);
            }
            this.method3578(arg0 + 1189);
            this.field9131 = this.field9137;
            this.method3636(2);
            this.field9104 &= -8;
        }
        if (arg0 == -8) {
            ++field8936;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lrl;[Lfba;Z)Lra;", line = 2021)
    public final class259 method626(class633 arg0, class518[] arg1, boolean arg2) {
        ++field8999;
        return new class334(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()Z", line = 2029)
    public final boolean method559() {
        ++field9057;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 2037)
    public final void method398(int arg0) {
        ++field8977;
    }

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "(B)V", line = 2045)
    public final void method3615(byte arg0) {
        ++field9013;
        int var2 = 52 / ((-94 - arg0) / 32);
        this.method3581(-28, 2, class449.field6540);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lsq;B)V", line = 2056)
    public final void method3616(class442 arg0, byte arg1) {
        ++field8975;
        this.field9110[this.field9082] = arg0;
        if (arg1 == 94) {
            this.method3603((byte) 4);
        }
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "()Lm;", line = 2070)
    public final class105 method623() {
        ++field8967;
        return new class516();
    }

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "(I)Leda;", line = 2078)
    public final class516 method3617(int arg0) {
        ++field8920;
        int var2 = 113 % ((arg0 - -4) / 42);
        return this.field9032;
    }

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "(I)V", line = 2089)
    public final void method3618(int arg0) {
        if (arg0 <= 27) {
            this.method624((Canvas) null);
        }
        ++field9006;
        if (~this.field9104 != -3) {
            this.method3607(0);
            this.method3604(false, 93);
            this.method3630((byte) 68, false);
            this.method3622(false, (byte) 43);
            this.method3623(false, 123);
            this.method3568(-2, 14511, false, false);
            this.field9104 = 2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "(III)V", line = 2112)
    public final void method562(int arg0, int arg1, int arg2) {
        ++field8939;
        if (~this.field9102 != ~arg0 || this.field9147 != arg1 || ~this.field9070 != ~arg2) {
            this.field9102 = arg0;
            this.field9070 = arg2;
            this.field9147 = arg1;
            if (this.field9120) {
                return;
            }
            this.method3569(127);
            this.method86((byte) 109);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Leda;I)V", line = 2134)
    public final void method3619(class516 arg0, int arg1) {
        ++field8898;
        this.field9032.method878(arg0);
        this.field9040 = false;
        this.method3585(0);
        if (arg1 != 4) {
            this.method402((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "(I)V", line = 2151)
    private final void method3620(int arg0) {
        if (arg0 != 23522) {
            this.field9078 = null;
        }
        ++field8881;
        this.field9171 = this.method128(arg0 + -7282, false);
        this.field9171.method1343(28, 140, (byte) -118);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field9171.method251(true, (byte) 60);
            if (var3 != null) {
                Stream var4 = this.method3588(var3, (byte) -84);
                if (!Stream.method3248()) {
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(1.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(1.0F);
                    var4.method3247(0.0F);
                    var4.method3247(1.0F);
                    var4.method3247(1.0F);
                    var4.method3247(1.0F);
                    var4.method3247(0.0F);
                    var4.method3247(1.0F);
                    var4.method3247(1.0F);
                    var4.method3247(1.0F);
                    var4.method3247(1.0F);
                    var4.method3247(1.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(1.0F);
                    var4.method3247(0.0F);
                    var4.method3247(1.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                    var4.method3247(0.0F);
                } else {
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(1.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(1.0F);
                    var4.method3250(0.0F);
                    var4.method3250(1.0F);
                    var4.method3250(1.0F);
                    var4.method3250(1.0F);
                    var4.method3250(0.0F);
                    var4.method3250(1.0F);
                    var4.method3250(1.0F);
                    var4.method3250(1.0F);
                    var4.method3250(1.0F);
                    var4.method3250(1.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(1.0F);
                    var4.method3250(0.0F);
                    var4.method3250(1.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                    var4.method3250(0.0F);
                }
                var4.method3246();
                if (this.field9171.method245(-11359)) {
                    break;
                }
            }
        }
        this.field9184 = this.method87(false, new class58[] { new class58(new class109[] { class109.field1807, class109.field1819, class109.field1819 }) });
    }

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "(I)V", line = 2264)
    public final void method3621(int arg0) {
        ++field8894;
        this.field9032.method883();
        this.field9040 = true;
        this.method3585(0);
        int var2 = -48 % ((arg0 - 5) / 55);
    }

    @OriginalMember(owner = "client!nd", name = "UA", descriptor = "(IIIII)V", line = 2276)
    public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8950;
        this.method628(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(ZB)V", line = 2284)
    public final void method3622(boolean arg0, byte arg1) {
        ++field9002;
        if (this.field9126 != arg0) {
            this.field9126 = arg0;
            this.method146(-120);
            this.field9104 &= -32;
        }
        if (arg1 != 43) {
            this.method558(-89, 116, -1, -51, 29, 116);
        }
    }

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "(IIIIII)Z", line = 2307)
    public final boolean method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9005;
        float var7 = this.field9058.method2913((float) arg0, (float) arg2, (float) arg1, (byte) 87);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field9058.method2913((float) arg3, (float) arg5, (float) arg4, (byte) 107);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field9107) || !((float) this.field9107 > var8)) && (!((float) this.field9139 < var7) || !(var8 > (float) this.field9139))) {
            int var9 = (int) ((float) this.field9158 * this.field9058.method2897((float) arg0, (float) arg1, 1749, (float) arg2) / var7);
            int var10 = (int) ((float) this.field9158 * this.field9058.method2897((float) arg3, (float) arg4, 1749, (float) arg5) / var8);
            if (this.field9077 > (float) var9 && this.field9077 > (float) var10 || this.field9164 < (float) var9 && this.field9164 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field9159 * this.field9058.method2893((float) arg2, (float) arg0, 115, (float) arg1) / var7);
                int var12 = (int) ((float) this.field9159 * this.field9058.method2893((float) arg5, (float) arg3, -127, (float) arg4) / var8);
                return (!((float) var11 < this.field9155) || !(this.field9155 > (float) var12)) && (!(this.field9160 < (float) var11) || !((float) var12 > this.field9160));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lm;)V", line = 2345)
    public final void method587(class105 arg0) {
        ++field8974;
        this.field9058 = (class516) arg0;
        this.field9060.method878(this.field9058);
        this.field9060.method2899((byte) 117);
        this.field9061.method2903(15, this.field9060);
        this.field9059.method2903(15, this.field9058);
        if (this.field9084.method1766((byte) 112)) {
            this.method3625(true);
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(ZI)V", line = 2361)
    public final void method3623(boolean arg0, int arg1) {
        if (arg1 <= 116) {
            this.method403(64);
        }
        ++field8913;
        if (!arg0 != !this.field9073) {
            this.field9073 = arg0;
            this.method154(-5163);
            this.field9104 &= -32;
        }
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V", line = 2381)
    public final void method399(int arg0) {
        ++field9028;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(II)V", line = 2399)
    public final void method3624(int arg0, int arg1) {
        if (arg0 >= -24) {
            this.method3627(-46);
        }
        if (~this.field9088 != ~arg1) {
            class340 var3;
            boolean var4;
            boolean var5;
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -129) {
                        var3 = class276.field4036;
                        var4 = false;
                        var5 = false;
                    } else {
                        var4 = true;
                        var3 = class222.field3341;
                        var5 = true;
                    }
                } else {
                    var3 = class555.field7855;
                    var4 = false;
                    var5 = true;
                }
            } else {
                var4 = true;
                var3 = class631.field8868;
                var5 = true;
            }
            if (this.field9089 != var4) {
                this.field9089 = var4;
                this.method84(-118);
            }
            if (!this.field9083 != !var5) {
                this.field9083 = var5;
                this.method147(-4731);
            }
            if (this.field9066 != var3) {
                this.field9066 = var3;
                this.method90(-1);
            }
            this.field9088 = arg1;
            this.field9104 &= -29;
        }
        ++field8887;
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "(Z)V", line = 2467)
    private final void method3625(boolean arg0) {
        ++field8986;
        this.field9153 = false;
        if (!arg0) {
            this.field9023 = null;
        }
        if (this.field9154 != null) {
            this.field9154.method817(-104);
        }
        this.method126(0);
    }

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "(I)V", line = 2483)
    private final void method3626(int arg0) {
        this.field9169 = this.method128(arg0 ^ 22235, true);
        if (arg0 == 27051) {
            ++field8931;
            this.field9169.method1343(12, 24, (byte) -118);
            this.field9172 = this.method87(false, new class58[] { new class58(class109.field1807) });
        }
    }

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "(I)V", line = 2498)
    public final void method3627(int arg0) {
        ++field8895;
        if (this.field9110[this.field9082] != class94.field1654) {
            this.field9110[this.field9082] = class94.field1654;
            this.field9087[this.field9082].method883();
            this.method3603((byte) 4);
        }
        if (arg0 >= -75) {
            this.field9070 = -56;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIZ)Lha;", line = 2515)
    public final class116 method580(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8903;
        class310 var6 = new class310(this, arg2, arg3, arg4);
        var6.method662(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(FFFIFFF)Z", line = 2526)
    private final boolean method3628(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
        ++field8982;
        Buffer var8 = this.field9169.method251(true, (byte) 60);
        if (arg3 != 0) {
            this.method134((class362) null, -125, 58, 118, (class620) null, 114, 116);
        }
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method3588(var8, (byte) -126);
            if (!Stream.method3248()) {
                var9.method3247(arg6);
                var9.method3247(arg4);
                var9.method3247(arg5);
                var9.method3247(arg0);
                var9.method3247(arg1);
                var9.method3247(arg2);
            } else {
                var9.method3250(arg6);
                var9.method3250(arg4);
                var9.method3250(arg5);
                var9.method3250(arg0);
                var9.method3250(arg1);
                var9.method3250(arg2);
            }
            var9.method3246();
            return this.field9169.method245(-11359);
        }
    }

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "()Z", line = 2565)
    public final boolean method529() {
        ++field9018;
        return this.field9092[3].method673(-1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BZ)V", line = 2573)
    public final void method3629(byte arg0, boolean arg1) {
        ++field8964;
        if (!this.field9142 == arg1) {
            this.field9142 = arg1;
            this.method111(9751);
        }
        if (arg0 > -48) {
            this.method628(-38, 25, 127, -55, 68, -115);
        }
    }

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "()Z", line = 2590)
    public final boolean method645() {
        ++field9030;
        return this.field9098;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(BZ)V", line = 2598)
    public final void method3630(byte arg0, boolean arg1) {
        ++field8883;
        if (!this.field9112 != !arg1) {
            this.field9112 = arg1;
            this.method111(9751);
            this.field9104 &= -8;
        }
        if (arg0 < 50) {
            this.field9168 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "()I", line = 2617)
    public final int method612() {
        ++field8935;
        return this.field9163 + -2;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "([I)V", line = 2627)
    public final void method640(int[] arg0) {
        arg0[0] = this.field9093;
        arg0[2] = this.field9067;
        ++field8889;
        arg0[3] = this.field9086;
        arg0[1] = this.field9081;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(IIIIII)Lkk;", line = 2638)
    public final class149 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9044;
        return new class541(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "(I)V", line = 2652)
    private final void method3631(int arg0) {
        if (!this.field9133) {
            float[] var2 = this.field9125;
            this.field9133 = true;
            if (~this.field8972 != -1 && this.field8892 != 0) {
                var2[0] = 2.0F / (float) this.field8972;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = -2.0F / (float) this.field8892;
                var2[12] = -1.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[10] = 0.5F;
                var2[15] = 1.0F;
                var2[14] = 0.5F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 1.0F;
            } else {
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[14] = 0.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[0] = 1.0F;
                var2[6] = 0.0F;
            }
        }
        int var3 = 44 % ((arg0 - 30) / 40);
        ++field9042;
    }

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "(I)Leda;", line = 2707)
    public final class516 method3632(int arg0) {
        ++field9031;
        if (arg0 != 14310) {
            this.method3616((class442) null, (byte) -86);
        }
        return this.field9087[this.field9082];
    }

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "()V", line = 2719)
    public final void method567() {
        this.field9094.method2712(7);
        ++field8877;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 2729)
    public final void method521(int arg0) {
        ++field8966;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field9127 = arg0;
            this.field9094.method2712(7);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "(I)Leda;", line = 2741)
    public final class516 method3633(int arg0) {
        ++field8953;
        if (arg0 != -27388) {
            this.field9088 = -56;
        }
        return this.field9061;
    }

    @OriginalMember(owner = "client!nd", name = "xa", descriptor = "()V", line = 2752)
    public final void method585() {
        ++field8878;
        this.field9120 = false;
        this.method3598(false, false, 0, 0, 0, (byte) 121);
        this.method3569(118);
        this.method86((byte) 125);
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "()Z", line = 2765)
    public final boolean method660() {
        ++field9000;
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[I[I)Lpa;", line = 2774)
    public final class593 method582(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8944;
        return class52.method443(arg1, arg0, this, arg2, arg3, (byte) -1);
    }

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "(B)V", line = 2784)
    private final void method3634(byte arg0) {
        if (arg0 <= 95) {
            this.field9075 = 92;
        }
        if (~this.field9104 != -2) {
            this.method3607(0);
            this.method3604(false, -35);
            this.method3630((byte) 119, false);
            this.method3622(false, (byte) 43);
            this.method3623(false, 123);
            this.method3568(-2, 14511, false, false);
            this.method3600(-123, 1);
            this.method3577(this.field9119, true);
            this.field9104 = 1;
        }
        ++field8888;
    }

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "(I)V", line = 2808)
    public static void method3635(int arg0) {
        field8876 = null;
        if (arg0 != 50) {
            method3590(88);
        }
        field9046 = null;
    }

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "(I)V", line = 2819)
    private final void method3636(int arg0) {
        ++field8962;
        this.method117(false);
        if (arg0 == 2) {
            if (this.field9154 != null) {
                this.field9154.method814(2);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(II)Lsp;", line = 2836)
    public final class620 method3637(int arg0, int arg1) {
        ++field8917;
        if (~this.field9168.method248(-920) > ~(arg0 * arg1)) {
            this.field9168.method252(84, arg0);
        }
        return this.field9168;
    }

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "(I)V", line = 2849)
    private final void method3638(int arg0) {
        if (this.field8984 != null) {
            Dimension var2 = this.field8984.getSize();
            this.field8932 = var2.width;
            this.field8940 = var2.height;
        } else {
            this.field8932 = this.field8940 = 1;
        }
        ++field9011;
        this.field8892 = this.field8940;
        this.field8972 = this.field8932;
        this.method3646(arg0 ^ arg0);
        this.method3589((byte) -114);
        this.method3608((byte) 76);
        this.method135(arg0 + 89);
        this.method3642(true);
        this.method3597(true);
        this.method657();
    }

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "(I)V", line = 2881)
    private final void method3639(int arg0) {
        if (arg0 > 66) {
            this.field9130 = (float) this.field9139 - this.field9135;
            ++field8980;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(BZ)V", line = 2895)
    public final void method3640(byte arg0, boolean arg1) {
        if (arg0 != 97) {
            this.method529();
        }
        ++field9007;
        if (!this.field9144 == arg1) {
            this.field9144 = arg1;
            this.method86((byte) 114);
        }
    }

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "(IIII)V", line = 2915)
    public final void method615(int arg0, int arg1, int arg2, int arg3) {
        this.field9067 = ~this.field8972 <= ~arg2 ? arg2 : 0;
        this.field9086 = arg3 <= this.field8972 ? arg3 : 0;
        this.field9081 = ~arg1 <= -1 ? arg1 : 0;
        ++field8949;
        this.field9093 = arg0 < 0 ? 0 : arg0;
        if (~this.field9093 >= -1 && ~this.field9067 <= ~this.field8972 && this.field9081 <= 0 && ~this.field8892 >= ~this.field9086) {
            this.method657();
        } else {
            if (!this.field9185) {
                this.field9185 = true;
                this.method100((byte) -61);
            }
            this.method137((byte) -123);
            this.method3642(true);
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(IIIII)V", line = 2941)
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9003;
        this.method628(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIIII)Lha;", line = 2951)
    public final class116 method528(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8985;
        return new class310(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2960)
    public final void method394(Canvas arg0) {
        ++field8882;
        this.field8984 = null;
        this.field8981 = null;
        if (arg0 != null && this.field8997 != arg0) {
            if (this.field9027.containsKey(arg0)) {
                this.field8981 = this.field9027.get(arg0);
                this.field8984 = arg0;
            }
        } else {
            this.field8984 = this.field8997;
            this.field8981 = this.field8907;
        }
        if (this.field8984 != null && this.field8981 != null) {
            this.method133((byte) 115, this.field8984, this.field8981);
            this.method3638(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lsh;)V", line = 2989)
    public final void method563(class616 arg0) {
        this.field9114.method932(86, arg0, this);
        ++field8921;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lfba;Z)Lha;", line = 3002)
    public final class116 method548(class518 arg0, boolean arg1) {
        ++field9021;
        class116 var9;
        if (arg0.field7202 != 0 && ~arg0.field7195 != -1) {
            int[] var3 = new int[arg0.field7202 * arg0.field7195];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field7196 != null) {
                for (int var6 = 0; ~var6 > ~arg0.field7195; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field7202; ++var7) {
                        var3[var5++] = class188.method1258(arg0.field7198[class424.method2540(255, arg0.field7197[var4])], arg0.field7196[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~arg0.field7195 < ~var8; ++var8) {
                    for (int var10 = 0; ~arg0.field7202 < ~var10; ++var10) {
                        int var11 = arg0.field7198[255 & arg0.field7197[var4++]];
                        var3[var5++] = var11 != 0 ? class188.method1258(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method528(var3, 0, arg0.field7202, arg0.field7202, arg0.field7195);
        } else {
            var9 = this.method528(new int[1], 0, 1, 1, 1);
        }
        var9.method963(arg0.field7199, arg0.field7200, arg0.field7203, arg0.field7201);
        return var9;
    }

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "()I", line = 3071)
    public final int method565() {
        ++field8911;
        return this.field9056 + this.field9036 - -this.field9052;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[Luca;)V", line = 3082)
    public final void method586(int arg0, class637[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field9129[var3] = arg1[var3];
        }
        ++field8958;
        this.field9071 = arg0;
        if (this.field9084.method1766((byte) 112)) {
            this.method127(-126);
        }
    }

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "(I)V", line = 3100)
    private final void method3641(int arg0) {
        ++field9004;
        this.method115(61);
        this.method109((byte) 126);
        this.method111(9751);
        this.method127(-35);
        this.method138(7);
        if (arg0 > 7) {
            this.method110(-19726);
            this.method81(5373);
            this.method146(-124);
            this.method154(-5163);
            this.method86((byte) 102);
            this.method125(-25370);
            this.method147(-4731);
            this.method90(-1);
            this.method84(125);
            for (int var2 = this.field9109 + -1; ~var2 <= -1; --var2) {
                this.method3645(var2, (byte) 91);
                this.method96((byte) 66);
                this.method107((byte) 105);
                this.method3627(-96);
            }
            this.method129((byte) -95);
            this.method135(111);
            this.method117(false);
            this.method132(false);
            this.method126(0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "(Z)V", line = 3148)
    private final void method3642(boolean arg0) {
        this.field9160 = (float) (this.field9086 - this.field9097);
        this.field9077 = (float) (this.field9093 - this.field9149);
        this.field9155 = (float) (-this.field9097 + this.field9081);
        this.field9164 = (float) (-this.field9149 + this.field9067);
        ++field8879;
        if (!arg0) {
            this.method3599((byte) -108);
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)Lu;", line = 3164)
    public final class424 method614(int arg0) {
        ++field8956;
        class191 var2 = new class191(arg0);
        this.field9023.method414(var2, (byte) 14);
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "(B)I", line = 3182)
    public final int method3643(byte arg0) {
        ++field9017;
        if (arg0 >= -111) {
            this.field9072 = true;
        }
        return this.field9082;
    }

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "()Z", line = 3193)
    public final boolean method524() {
        ++field8912;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "IA", descriptor = "(III[I)V", line = 3201)
    public final void method568(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8993;
        float var5 = this.field9058.method2913((float) arg0, (float) arg2, (float) arg1, (byte) 109);
        if (!((float) this.field9107 > var5) && !(var5 > (float) this.field9139)) {
            int var6 = (int) ((float) this.field9158 * this.field9058.method2897((float) arg0, (float) arg1, 1749, (float) arg2) / var5);
            int var7 = (int) ((float) this.field9159 * this.field9058.method2893((float) arg2, (float) arg0, 107, (float) arg1) / var5);
            if (this.field9077 <= (float) var6 && (float) var6 <= this.field9164 && (float) var7 >= this.field9155 && this.field9160 >= (float) var7) {
                arg3[1] = (int) ((float) var7 - this.field9155);
                arg3[0] = (int) ((float) var6 - this.field9077);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "(I)Leda;", line = 3237)
    public final class516 method3644(int arg0) {
        if (!this.field9153) {
            this.field9062.method2910(this.field9060, this.field9032);
            this.field9153 = true;
        }
        if (arg0 >= -118) {
            this.method107((byte) -83);
        }
        ++field9041;
        return this.field9062;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)V", line = 3263)
    public final void method3645(int arg0, byte arg1) {
        if (this.field9082 != arg0) {
            this.field9082 = arg0;
            this.method119(-88);
        }
        if (arg1 != 91) {
            this.method3610(-126);
        }
        ++field9020;
    }

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "(I)V", line = 3280)
    public final void method642(int arg0) {
        ++field9029;
        this.field9140 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field9140;
        }
        this.field9063 = 1 << this.field9140;
    }

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "(I)V", line = 3295)
    private final void method3646(int arg0) {
        this.field9133 = false;
        if (arg0 != 0) {
            this.method3628(-0.134234F, -1.9278979F, -0.32202083F, -92, -0.3825832F, -2.7436485F, -1.326652F);
        }
        ++field8976;
        if (class617.field8730 == this.field9084) {
            this.method3631(arg0 + -68);
            this.method3636(2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "(I)[F", line = 3312)
    public final float[] method3647(int arg0) {
        ++field9047;
        return arg0 >= -54 ? null : this.field9078;
    }

    @OriginalMember(owner = "client!nd", name = "ba", descriptor = "()I", line = 3323)
    public final int method604() {
        ++field9050;
        return this.field9186;
    }

    @OriginalMember(owner = "client!nd", name = "ta", descriptor = "(II)V", line = 3336)
    public final void method557(int arg0, int arg1) {
        ++field8904;
        if (~this.field9107 != ~arg0 || this.field9139 != arg1) {
            this.field9139 = arg1;
            this.field9107 = arg0;
            this.method3589((byte) -114);
            this.method3608((byte) 104);
            this.method3569(107);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZB)Lsp;")
    public abstract class620 method98(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public abstract void method109(byte arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILkl;Lvt;)Z")
    public abstract boolean method91(int arg0, class468 arg1, class343 arg2);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZLdg;Z)V")
    public abstract void method88(int arg0, boolean arg1, class20 arg2, boolean arg3);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(Z)V")
    public abstract void method132(boolean arg0);

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "(I)V")
    public abstract void method126(int arg0);

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "(I)V")
    public abstract void method111(int arg0);

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "(I)V")
    public abstract void method125(int arg0);

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "(I)V")
    public abstract void method90(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILup;I)V")
    public abstract void method152(int arg0, class342 arg1, int arg2);

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "(I)V")
    public abstract void method155(int arg0);

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "(I)V")
    public abstract void method119(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([BIIIILkl;)Lve;")
    public abstract class228 method136(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class468 arg5);

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public abstract void method107(byte arg0);

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "(I)V")
    public abstract void method154(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method106(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method92(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lne;B)V")
    public abstract void method118(class175 arg0, byte arg1);

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "(I)V")
    public abstract void method81(int arg0);

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "(I)V")
    public abstract void method146(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
    public abstract void method102(byte arg0, int arg1);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)Lup;")
    public abstract class342 method128(int arg0, boolean arg1);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILpca;II)V")
    public abstract void method148(int arg0, class362 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "(I)V")
    public abstract void method84(int arg0);

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(B)V")
    public abstract void method137(byte arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lws;B)V")
    public abstract void method114(class530 arg0, byte arg1);

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "(I)V")
    public abstract void method110(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method112(byte arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lpca;IIILsp;II)V")
    public abstract void method134(class362 arg0, int arg1, int arg2, int arg3, class620 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "(I)V")
    public abstract void method130(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZILdg;I)V")
    public abstract void method97(boolean arg0, boolean arg1, int arg2, class20 arg3, int arg4);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIZLkl;[FII)Ldea;")
    public abstract class405 method162(int arg0, int arg1, int arg2, boolean arg3, class468 arg4, float[] arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILvt;Lkl;)Z")
    public abstract boolean method144(int arg0, class343 arg1, class468 arg2);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIILvt;Lkl;)Ldea;")
    public abstract class405 method149(boolean arg0, int arg1, int arg2, class343 arg3, class468 arg4);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[IIIZ)Ldea;")
    public abstract class405 method145(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "(B)V")
    public abstract void method86(byte arg0);

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "(B)V")
    public abstract void method96(byte arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method133(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[[IBZ)Luba;")
    public abstract class628 method93(int arg0, int[][] arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZIIILkl;[BI)Ldea;")
    public abstract class405 method151(int arg0, boolean arg1, int arg2, int arg3, int arg4, class468 arg5, byte[] arg6, int arg7);

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "(I)V")
    public abstract void method135(int arg0);

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "(I)F")
    public abstract float method82(int arg0);

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "(I)V")
    public abstract void method115(int arg0);

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "(Z)V")
    public abstract void method117(boolean arg0);

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "(I)V")
    public abstract void method138(int arg0);

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "(B)V")
    public abstract void method129(byte arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z[Lwg;)Lws;")
    public abstract class530 method87(boolean arg0, class58[] arg1);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IZ)V")
    public abstract void method105(int arg0, boolean arg1);

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "(B)V")
    public abstract void method100(byte arg0);
}
