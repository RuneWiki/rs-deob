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

@OriginalClass("client!nv")
public class class417 extends class58 {

    @OriginalMember(owner = "client!nv", name = "te", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5903 = new Hashtable();

    @OriginalMember(owner = "client!nv", name = "ye", descriptor = "I")
    public int field5908 = 128;

    @OriginalMember(owner = "client!nv", name = "Ae", descriptor = "Lwe;")
    private class406 field5910 = new class406();

    @OriginalMember(owner = "client!nv", name = "Ce", descriptor = "Leb;")
    private class624 field5912 = new class624();

    @OriginalMember(owner = "client!nv", name = "De", descriptor = "Leb;")
    public class624 field5913 = new class624();

    @OriginalMember(owner = "client!nv", name = "He", descriptor = "I")
    public int field5917 = 8;

    @OriginalMember(owner = "client!nv", name = "Ge", descriptor = "Z")
    private boolean field5916 = false;

    @OriginalMember(owner = "client!nv", name = "Ke", descriptor = "I")
    public int field5920 = 3;

    @OriginalMember(owner = "client!nv", name = "Fe", descriptor = "Lbq;")
    private class289 field5915 = new class289();

    @OriginalMember(owner = "client!nv", name = "Me", descriptor = "I")
    private int field5922 = -1;

    @OriginalMember(owner = "client!nv", name = "Ne", descriptor = "[Lgk;")
    private class473[] field5923 = new class473[4];

    @OriginalMember(owner = "client!nv", name = "Oe", descriptor = "[Lgk;")
    private class473[] field5924 = new class473[4];

    @OriginalMember(owner = "client!nv", name = "Pe", descriptor = "[Lgk;")
    private class473[] field5925 = new class473[4];

    @OriginalMember(owner = "client!nv", name = "Se", descriptor = "I")
    private int field5928 = -1;

    @OriginalMember(owner = "client!nv", name = "Te", descriptor = "I")
    private int field5929 = -1;

    @OriginalMember(owner = "client!nv", name = "Xe", descriptor = "Lbq;")
    private class289 field5933;

    @OriginalMember(owner = "client!nv", name = "Ze", descriptor = "Lbq;")
    private class289 field5935;

    @OriginalMember(owner = "client!nv", name = "af", descriptor = "Lbq;")
    private class289 field5936;

    @OriginalMember(owner = "client!nv", name = "bf", descriptor = "Lbq;")
    private class289 field5937;

    @OriginalMember(owner = "client!nv", name = "cf", descriptor = "Lbq;")
    private class289 field5938;

    @OriginalMember(owner = "client!nv", name = "df", descriptor = "Lbq;")
    private class289 field5939;

    @OriginalMember(owner = "client!nv", name = "ef", descriptor = "Lbq;")
    private class289 field5940;

    @OriginalMember(owner = "client!nv", name = "hf", descriptor = "Leb;")
    public class624 field5943;

    @OriginalMember(owner = "client!nv", name = "pf", descriptor = "Leb;")
    public class624 field5950;

    @OriginalMember(owner = "client!nv", name = "qf", descriptor = "Leb;")
    public class624 field5951;

    @OriginalMember(owner = "client!nv", name = "Mf", descriptor = "F")
    public float field5973;

    @OriginalMember(owner = "client!nv", name = "wf", descriptor = "I")
    private int field5957;

    @OriginalMember(owner = "client!nv", name = "Zf", descriptor = "I")
    private int field5986;

    @OriginalMember(owner = "client!nv", name = "kg", descriptor = "I")
    public int field5997;

    @OriginalMember(owner = "client!nv", name = "Nf", descriptor = "F")
    public float field5974;

    @OriginalMember(owner = "client!nv", name = "xf", descriptor = "[F")
    private float[] field5958;

    @OriginalMember(owner = "client!nv", name = "Bf", descriptor = "I")
    private int field5962;

    @OriginalMember(owner = "client!nv", name = "qg", descriptor = "[F")
    public float[] field6003;

    @OriginalMember(owner = "client!nv", name = "dg", descriptor = "[F")
    private float[] field5990;

    @OriginalMember(owner = "client!nv", name = "yg", descriptor = "F")
    private float field6011;

    @OriginalMember(owner = "client!nv", name = "zg", descriptor = "I")
    public int field6012;

    @OriginalMember(owner = "client!nv", name = "Hg", descriptor = "F")
    private float field6020;

    @OriginalMember(owner = "client!nv", name = "Gg", descriptor = "I")
    private int field6019;

    @OriginalMember(owner = "client!nv", name = "Xf", descriptor = "I")
    public int field5984;

    @OriginalMember(owner = "client!nv", name = "Of", descriptor = "I")
    private int field5975;

    @OriginalMember(owner = "client!nv", name = "xg", descriptor = "I")
    public int field6010;

    @OriginalMember(owner = "client!nv", name = "Lf", descriptor = "F")
    private float field5972;

    @OriginalMember(owner = "client!nv", name = "If", descriptor = "F")
    public float field5969;

    @OriginalMember(owner = "client!nv", name = "Fg", descriptor = "I")
    private int field6018;

    @OriginalMember(owner = "client!nv", name = "Ff", descriptor = "F")
    private float field5966;

    @OriginalMember(owner = "client!nv", name = "gh", descriptor = "Z")
    private boolean field6045;

    @OriginalMember(owner = "client!nv", name = "Zg", descriptor = "F")
    public float field6038;

    @OriginalMember(owner = "client!nv", name = "eg", descriptor = "I")
    private int field5991;

    @OriginalMember(owner = "client!nv", name = "fh", descriptor = "I")
    public int field6044;

    @OriginalMember(owner = "client!nv", name = "Jg", descriptor = "F")
    private float field6022;

    @OriginalMember(owner = "client!nv", name = "Qg", descriptor = "F")
    public float field6029;

    @OriginalMember(owner = "client!nv", name = "Uf", descriptor = "I")
    private int field5981;

    @OriginalMember(owner = "client!nv", name = "Bg", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!nv", name = "pg", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!nv", name = "ah", descriptor = "I")
    public int field6039;

    @OriginalMember(owner = "client!nv", name = "lh", descriptor = "F")
    public float field6050;

    @OriginalMember(owner = "client!nv", name = "jh", descriptor = "Z")
    private boolean field6048;

    @OriginalMember(owner = "client!nv", name = "dh", descriptor = "I")
    public int field6042;

    @OriginalMember(owner = "client!nv", name = "ng", descriptor = "[Lada;")
    private class163[] field6000;

    @OriginalMember(owner = "client!nv", name = "Kg", descriptor = "I")
    private int field6023;

    @OriginalMember(owner = "client!nv", name = "nh", descriptor = "F")
    public float field6052;

    @OriginalMember(owner = "client!nv", name = "rh", descriptor = "I")
    public int field6056;

    @OriginalMember(owner = "client!nv", name = "Vg", descriptor = "[F")
    private float[] field6034;

    @OriginalMember(owner = "client!nv", name = "Ag", descriptor = "I")
    private int field6013;

    @OriginalMember(owner = "client!nv", name = "vh", descriptor = "I")
    public int field6060;

    @OriginalMember(owner = "client!nv", name = "oh", descriptor = "[F")
    private float[] field6053;

    @OriginalMember(owner = "client!nv", name = "uh", descriptor = "Lbs;")
    public class685 field6059;

    @OriginalMember(owner = "client!nv", name = "Bh", descriptor = "[B")
    public byte[] field6066;

    @OriginalMember(owner = "client!nv", name = "yh", descriptor = "[I")
    public int[] field6063;

    @OriginalMember(owner = "client!nv", name = "zh", descriptor = "[I")
    public int[] field6064;

    @OriginalMember(owner = "client!nv", name = "xh", descriptor = "[I")
    public int[] field6062;

    @OriginalMember(owner = "client!nv", name = "ce", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5886;

    @OriginalMember(owner = "client!nv", name = "ub", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5748;

    @OriginalMember(owner = "client!nv", name = "xe", descriptor = "I")
    public int field5907;

    @OriginalMember(owner = "client!nv", name = "oc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5794;

    @OriginalMember(owner = "client!nv", name = "rb", descriptor = "J")
    private long field5745;

    @OriginalMember(owner = "client!nv", name = "fb", descriptor = "J")
    private long field5733;

    @OriginalMember(owner = "client!nv", name = "fg", descriptor = "Z")
    public boolean field5992;

    @OriginalMember(owner = "client!nv", name = "Pg", descriptor = "I")
    public int field6028;

    @OriginalMember(owner = "client!nv", name = "bh", descriptor = "Ljava/lang/String;")
    private String field6040;

    @OriginalMember(owner = "client!nv", name = "kh", descriptor = "Z")
    public boolean field6049;

    @OriginalMember(owner = "client!nv", name = "rf", descriptor = "Z")
    private boolean field5952;

    @OriginalMember(owner = "client!nv", name = "Ef", descriptor = "Z")
    public boolean field5965;

    @OriginalMember(owner = "client!nv", name = "jg", descriptor = "Z")
    public boolean field5996;

    @OriginalMember(owner = "client!nv", name = "Wf", descriptor = "Z")
    public boolean field5983;

    @OriginalMember(owner = "client!nv", name = "Hf", descriptor = "Z")
    private boolean field5968;

    @OriginalMember(owner = "client!nv", name = "vf", descriptor = "Ljava/lang/String;")
    private String field5956;

    @OriginalMember(owner = "client!nv", name = "Ug", descriptor = "Z")
    public boolean field6033;

    @OriginalMember(owner = "client!nv", name = "Ng", descriptor = "Z")
    private boolean field6026;

    @OriginalMember(owner = "client!nv", name = "Be", descriptor = "Lce;")
    private class308 field5911;

    @OriginalMember(owner = "client!nv", name = "Ee", descriptor = "Lnea;")
    public class712 field5914;

    @OriginalMember(owner = "client!nv", name = "ze", descriptor = "Les;")
    private class382 field5909;

    @OriginalMember(owner = "client!nv", name = "ue", descriptor = "Lld;")
    private class169 field5904;

    @OriginalMember(owner = "client!nv", name = "we", descriptor = "Lpba;")
    private class331 field5906;

    @OriginalMember(owner = "client!nv", name = "V", descriptor = "Ljava/lang/String;")
    public static String field5723 = "";

    @OriginalMember(owner = "client!nv", name = "Bc", descriptor = "Lpia;")
    public static class94 field5807 = new class94(0, 18);

    @OriginalMember(owner = "client!nv", name = "Tf", descriptor = "F")
    private float field5980;

    @OriginalMember(owner = "client!nv", name = "Vf", descriptor = "F")
    public float field5982;

    @OriginalMember(owner = "client!nv", name = "cg", descriptor = "F")
    private float field5989;

    @OriginalMember(owner = "client!nv", name = "hg", descriptor = "F")
    public float field5994;

    @OriginalMember(owner = "client!nv", name = "lg", descriptor = "F")
    public float field5998;

    @OriginalMember(owner = "client!nv", name = "wg", descriptor = "F")
    public float field6009;

    @OriginalMember(owner = "client!nv", name = "Sg", descriptor = "F")
    private float field6031;

    @OriginalMember(owner = "client!nv", name = "eh", descriptor = "F")
    public float field6043;

    @OriginalMember(owner = "client!nv", name = "th", descriptor = "F")
    public float field6058;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!nv", name = "Q", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!nv", name = "R", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!nv", name = "S", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!nv", name = "T", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!nv", name = "U", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!nv", name = "W", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!nv", name = "X", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!nv", name = "Y", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!nv", name = "Z", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!nv", name = "ab", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!nv", name = "bb", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!nv", name = "cb", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!nv", name = "db", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!nv", name = "eb", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!nv", name = "gb", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!nv", name = "hb", descriptor = "I")
    private int field5735;

    @OriginalMember(owner = "client!nv", name = "ib", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!nv", name = "jb", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!nv", name = "kb", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!nv", name = "lb", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!nv", name = "mb", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!nv", name = "nb", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!nv", name = "ob", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!nv", name = "pb", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!nv", name = "qb", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!nv", name = "sb", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!nv", name = "tb", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!nv", name = "vb", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!nv", name = "wb", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!nv", name = "xb", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!nv", name = "yb", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!nv", name = "zb", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!nv", name = "Ab", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!nv", name = "Bb", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!nv", name = "Cb", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!nv", name = "Db", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!nv", name = "Eb", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!nv", name = "Fb", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!nv", name = "Gb", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!nv", name = "Hb", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!nv", name = "Ib", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!nv", name = "Jb", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!nv", name = "Kb", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!nv", name = "Lb", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!nv", name = "Mb", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!nv", name = "Nb", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!nv", name = "Ob", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!nv", name = "Pb", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!nv", name = "Qb", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!nv", name = "Rb", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!nv", name = "Sb", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!nv", name = "Tb", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!nv", name = "Ub", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!nv", name = "Vb", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!nv", name = "Wb", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!nv", name = "Xb", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!nv", name = "Yb", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!nv", name = "Zb", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!nv", name = "ac", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!nv", name = "bc", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!nv", name = "cc", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!nv", name = "dc", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!nv", name = "ec", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!nv", name = "fc", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!nv", name = "gc", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!nv", name = "hc", descriptor = "I")
    private int field5787;

    @OriginalMember(owner = "client!nv", name = "ic", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!nv", name = "jc", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!nv", name = "kc", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!nv", name = "lc", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!nv", name = "mc", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!nv", name = "nc", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!nv", name = "pc", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!nv", name = "qc", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!nv", name = "rc", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!nv", name = "sc", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!nv", name = "tc", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!nv", name = "uc", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!nv", name = "vc", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!nv", name = "wc", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!nv", name = "xc", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!nv", name = "yc", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!nv", name = "zc", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!nv", name = "Ac", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!nv", name = "Cc", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!nv", name = "Dc", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!nv", name = "Ec", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!nv", name = "Fc", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!nv", name = "Gc", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!nv", name = "Hc", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!nv", name = "Ic", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!nv", name = "Jc", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!nv", name = "Kc", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!nv", name = "Lc", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!nv", name = "Mc", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!nv", name = "Nc", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!nv", name = "Oc", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!nv", name = "Pc", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!nv", name = "Qc", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!nv", name = "Rc", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!nv", name = "Sc", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!nv", name = "Tc", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!nv", name = "Uc", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!nv", name = "Vc", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!nv", name = "Wc", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!nv", name = "Xc", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!nv", name = "Yc", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!nv", name = "Zc", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!nv", name = "ad", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!nv", name = "bd", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!nv", name = "cd", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!nv", name = "dd", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!nv", name = "ed", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!nv", name = "fd", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!nv", name = "gd", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!nv", name = "hd", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!nv", name = "id", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!nv", name = "jd", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!nv", name = "kd", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!nv", name = "ld", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!nv", name = "md", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!nv", name = "nd", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!nv", name = "od", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!nv", name = "pd", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!nv", name = "qd", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!nv", name = "rd", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!nv", name = "sd", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!nv", name = "td", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!nv", name = "ud", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!nv", name = "vd", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!nv", name = "wd", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!nv", name = "xd", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!nv", name = "yd", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!nv", name = "zd", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!nv", name = "Ad", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!nv", name = "Bd", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!nv", name = "Cd", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!nv", name = "Dd", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!nv", name = "Ed", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!nv", name = "Fd", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!nv", name = "Gd", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!nv", name = "Hd", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!nv", name = "Id", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!nv", name = "Jd", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!nv", name = "Kd", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!nv", name = "Ld", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!nv", name = "Md", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!nv", name = "Nd", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!nv", name = "Od", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!nv", name = "Pd", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!nv", name = "Qd", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!nv", name = "Rd", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!nv", name = "Sd", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!nv", name = "Td", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!nv", name = "Ud", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!nv", name = "Vd", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!nv", name = "Wd", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!nv", name = "Xd", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!nv", name = "Yd", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!nv", name = "Zd", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!nv", name = "ae", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!nv", name = "be", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!nv", name = "de", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!nv", name = "ee", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!nv", name = "fe", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!nv", name = "ge", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!nv", name = "he", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!nv", name = "ie", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!nv", name = "je", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!nv", name = "ke", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!nv", name = "le", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!nv", name = "me", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!nv", name = "ne", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!nv", name = "oe", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!nv", name = "pe", descriptor = "I")
    public int field5899;

    @OriginalMember(owner = "client!nv", name = "qe", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!nv", name = "re", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!nv", name = "se", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!nv", name = "Je", descriptor = "I")
    public int field5919;

    @OriginalMember(owner = "client!nv", name = "Ve", descriptor = "I")
    private int field5931;

    @OriginalMember(owner = "client!nv", name = "We", descriptor = "I")
    public int field5932;

    @OriginalMember(owner = "client!nv", name = "Ye", descriptor = "I")
    public int field5934;

    @OriginalMember(owner = "client!nv", name = "kf", descriptor = "I")
    private int field5945;

    @OriginalMember(owner = "client!nv", name = "mf", descriptor = "I")
    private int field5947;

    @OriginalMember(owner = "client!nv", name = "of", descriptor = "I")
    private int field5949;

    @OriginalMember(owner = "client!nv", name = "yf", descriptor = "I")
    public int field5959;

    @OriginalMember(owner = "client!nv", name = "zf", descriptor = "I")
    public int field5960;

    @OriginalMember(owner = "client!nv", name = "Cf", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!nv", name = "Gf", descriptor = "I")
    private int field5967;

    @OriginalMember(owner = "client!nv", name = "Kf", descriptor = "I")
    private int field5971;

    @OriginalMember(owner = "client!nv", name = "bg", descriptor = "I")
    private int field5988;

    @OriginalMember(owner = "client!nv", name = "Eg", descriptor = "I")
    private int field6017;

    @OriginalMember(owner = "client!nv", name = "Ig", descriptor = "I")
    private int field6021;

    @OriginalMember(owner = "client!nv", name = "Lg", descriptor = "I")
    private int field6024;

    @OriginalMember(owner = "client!nv", name = "Mg", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!nv", name = "Og", descriptor = "I")
    public int field6027;

    @OriginalMember(owner = "client!nv", name = "sh", descriptor = "I")
    private int field6057;

    @OriginalMember(owner = "client!nv", name = "Ah", descriptor = "I")
    private int field6065;

    @OriginalMember(owner = "client!nv", name = "Ch", descriptor = "I")
    private int field6067;

    @OriginalMember(owner = "client!nv", name = "ff", descriptor = "J")
    private long field5941;

    @OriginalMember(owner = "client!nv", name = "Ue", descriptor = "Ler;")
    private class106 field5930;

    @OriginalMember(owner = "client!nv", name = "ph", descriptor = "Ler;")
    public class106 field6054;

    @OriginalMember(owner = "client!nv", name = "Tg", descriptor = "Ltea;")
    private class238 field6032;

    @OriginalMember(owner = "client!nv", name = "Le", descriptor = "Lao;")
    private class286 field5921;

    @OriginalMember(owner = "client!nv", name = "Qe", descriptor = "Lgk;")
    private class473 field5926;

    @OriginalMember(owner = "client!nv", name = "Re", descriptor = "Lgk;")
    private class473 field5927;

    @OriginalMember(owner = "client!nv", name = "ug", descriptor = "Ltv;")
    private class558 field6007;

    @OriginalMember(owner = "client!nv", name = "ag", descriptor = "Lid;")
    private class583 field5987;

    @OriginalMember(owner = "client!nv", name = "tg", descriptor = "Lid;")
    private class583 field6006;

    @OriginalMember(owner = "client!nv", name = "Jf", descriptor = "Lji;")
    private class608 field5970;

    @OriginalMember(owner = "client!nv", name = "tf", descriptor = "Llea;")
    public class610 field5954;

    @OriginalMember(owner = "client!nv", name = "uf", descriptor = "Llea;")
    public class610 field5955;

    @OriginalMember(owner = "client!nv", name = "Qf", descriptor = "Llea;")
    public class610 field5977;

    @OriginalMember(owner = "client!nv", name = "Sf", descriptor = "Llea;")
    public class610 field5979;

    @OriginalMember(owner = "client!nv", name = "og", descriptor = "Llea;")
    public class610 field6001;

    @OriginalMember(owner = "client!nv", name = "rg", descriptor = "Llea;")
    public class610 field6004;

    @OriginalMember(owner = "client!nv", name = "Cg", descriptor = "Llea;")
    public class610 field6015;

    @OriginalMember(owner = "client!nv", name = "Dg", descriptor = "Llea;")
    public class610 field6016;

    @OriginalMember(owner = "client!nv", name = "Wg", descriptor = "Llea;")
    public class610 field6035;

    @OriginalMember(owner = "client!nv", name = "Xg", descriptor = "Llea;")
    public class610 field6036;

    @OriginalMember(owner = "client!nv", name = "ig", descriptor = "Lpw;")
    public class704 field5995;

    @OriginalMember(owner = "client!nv", name = "sg", descriptor = "Lpw;")
    public class704 field6005;

    @OriginalMember(owner = "client!nv", name = "vg", descriptor = "Lwn;")
    public class720 field6008;

    @OriginalMember(owner = "client!nv", name = "Ie", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5918;

    @OriginalMember(owner = "client!nv", name = "gf", descriptor = "Z")
    private boolean field5942;

    @OriginalMember(owner = "client!nv", name = "jf", descriptor = "Z")
    private boolean field5944;

    @OriginalMember(owner = "client!nv", name = "lf", descriptor = "Z")
    private boolean field5946;

    @OriginalMember(owner = "client!nv", name = "nf", descriptor = "Z")
    private boolean field5948;

    @OriginalMember(owner = "client!nv", name = "sf", descriptor = "Z")
    public boolean field5953;

    @OriginalMember(owner = "client!nv", name = "Af", descriptor = "Z")
    public boolean field5961;

    @OriginalMember(owner = "client!nv", name = "Df", descriptor = "Z")
    private boolean field5964;

    @OriginalMember(owner = "client!nv", name = "Pf", descriptor = "Z")
    public boolean field5976;

    @OriginalMember(owner = "client!nv", name = "Rf", descriptor = "Z")
    public boolean field5978;

    @OriginalMember(owner = "client!nv", name = "Yf", descriptor = "Z")
    private boolean field5985;

    @OriginalMember(owner = "client!nv", name = "gg", descriptor = "Z")
    private boolean field5993;

    @OriginalMember(owner = "client!nv", name = "Rg", descriptor = "Z")
    public boolean field6030;

    @OriginalMember(owner = "client!nv", name = "Yg", descriptor = "Z")
    public boolean field6037;

    @OriginalMember(owner = "client!nv", name = "ch", descriptor = "Z")
    public boolean field6041;

    @OriginalMember(owner = "client!nv", name = "hh", descriptor = "Z")
    private boolean field6046;

    @OriginalMember(owner = "client!nv", name = "ih", descriptor = "Z")
    private boolean field6047;

    @OriginalMember(owner = "client!nv", name = "mh", descriptor = "Z")
    private boolean field6051;

    @OriginalMember(owner = "client!nv", name = "qh", descriptor = "Z")
    private boolean field6055;

    @OriginalMember(owner = "client!nv", name = "wh", descriptor = "Z")
    public boolean field6061;

    @OriginalMember(owner = "client!nv", name = "mg", descriptor = "[Ltha;")
    private class292[] field5999;

    @OriginalMember(owner = "client!nv", name = "ve", descriptor = "[Z")
    public static boolean[] field5905;

    @OriginalMember(owner = "client!nv", name = "X", descriptor = "(I)V")
    public final void method398(int arg0) {
        this.field5920 = 0;
        ++field5801;
        while (arg0 > 1) {
            ++this.field5920;
            arg0 >>= 1;
        }
        this.field5917 = 1 << this.field5920;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lid;B)V")
    public final void method2544(class583 arg0, byte arg1) {
        if (this.field6006 != arg0) {
            if (this.field5952) {
                OpenGL.glBindBufferARB(34962, arg0.method17((byte) 82));
            }
            this.field6006 = arg0;
        }
        ++field5779;
        if (arg1 != 4) {
            this.method355(-31, 2, 10, 1);
        }
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "()Z")
    public final boolean method358() {
        ++field5860;
        return this.field5904 != null && this.field5904.method2456(-1);
    }

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "()Loba;")
    public final class261 method395() {
        ++field5874;
        int var1 = -1;
        if (~this.field5956.indexOf("nvidia") == 0) {
            if (~this.field5956.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (~this.field5956.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class261(var1, "OpenGL", this.field5971, this.field6040, 0L);
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(II)V")
    public final void method2545(int arg0, int arg1) {
        ++field5781;
        if (this.field5988 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field5988 = arg1;
        }
        if (arg0 != 32886) {
            this.field5951 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "()V")
    public final void method384() {
        ++field5875;
        this.field5909.method2347(0);
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(Z)V")
    private final void method2546(boolean arg0) {
        this.field6043 = (float) (-this.field6002 + this.field5991);
        this.field5994 = (float) (-this.field6044 + this.field5981);
        this.field5998 = (float) (-this.field6044 + this.field5986);
        if (arg0) {
            this.method2551((byte) -7, true);
        }
        ++field5778;
        this.field5982 = (float) (-this.field6002 + this.field5975);
    }

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "(Z)V")
    public final void method364(boolean arg0) {
        this.field6045 = arg0;
        ++field5709;
        this.method2588(true);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "()V")
    public final void method322() {
        for (class134 var1 = this.field5915.method1719(65280); var1 != null; var1 = this.field5915.method1723(-20665)) {
            ((class105) var1).method721((byte) -39);
        }
        ++field5857;
        if (this.field5909 != null) {
            this.field5909.method2354((byte) -70);
        }
        if (this.field5794 != null) {
            this.method2580(true);
            Enumeration var2 = this.field5903.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5903.get(var3);
                this.field5794.releaseSurface(var3, var4);
            }
            this.field5794.release();
            this.field5794 = null;
        }
        if (this.field5916) {
            class125.method797(false, false, true);
            this.field5916 = false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lza;)V")
    public final void method385(class413 arg0) {
        ++field5889;
        this.field5918 = ((class105) arg0).field1090;
        if (this.field5987 == null) {
            class685 var2 = new class685(80);
            if (!this.field5992) {
                var2.method3880(-1.0F, 94);
                var2.method3880(-1.0F, -119);
                var2.method3880(0.0F, -107);
                var2.method3880(0.0F, -107);
                var2.method3880(1.0F, 41);
                var2.method3880(1.0F, -107);
                var2.method3880(-1.0F, 72);
                var2.method3880(0.0F, -121);
                var2.method3880(1.0F, -113);
                var2.method3880(1.0F, 68);
                var2.method3880(1.0F, 71);
                var2.method3880(1.0F, -115);
                var2.method3880(0.0F, 37);
                var2.method3880(1.0F, 116);
                var2.method3880(0.0F, -110);
                var2.method3880(-1.0F, 86);
                var2.method3880(1.0F, 24);
                var2.method3880(0.0F, -108);
                var2.method3880(0.0F, -117);
                var2.method3880(0.0F, -124);
            } else {
                var2.method3878((byte) 69, -1.0F);
                var2.method3878((byte) 69, -1.0F);
                var2.method3878((byte) 69, 0.0F);
                var2.method3878((byte) 69, 0.0F);
                var2.method3878((byte) 69, 1.0F);
                var2.method3878((byte) 69, 1.0F);
                var2.method3878((byte) 69, -1.0F);
                var2.method3878((byte) 69, 0.0F);
                var2.method3878((byte) 69, 1.0F);
                var2.method3878((byte) 69, 1.0F);
                var2.method3878((byte) 69, 1.0F);
                var2.method3878((byte) 69, 1.0F);
                var2.method3878((byte) 69, 0.0F);
                var2.method3878((byte) 69, 1.0F);
                var2.method3878((byte) 69, 0.0F);
                var2.method3878((byte) 69, -1.0F);
                var2.method3878((byte) 69, 1.0F);
                var2.method3878((byte) 69, 0.0F);
                var2.method3878((byte) 69, 0.0F);
                var2.method3878((byte) 69, 0.0F);
            }
            this.field5987 = this.method2598(var2.field2912, 34168, false, var2.field2903, 20);
            this.field6005 = new class704(this.field5987, 5126, 3, 0);
            this.field5995 = new class704(this.field5987, 5126, 2, 12);
            this.field5910.method2499(false, this);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
    public final void method2547(byte arg0) {
        ++field5710;
        int var2 = -80 / ((arg0 - 51) / 33);
        if (~this.field5947 != -5) {
            this.method2629((byte) 124);
            this.method2597((byte) 56, false);
            this.method2625((byte) 89, false);
            this.method2551((byte) -116, false);
            this.method2556(false, -72);
            this.method2624(-2, 2);
            this.method2606(1, -24754);
            this.field5947 = 4;
        }
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(II)I")
    public final int method2548(int arg0, int arg1) {
        ++field5701;
        if (arg0 >= 0) {
            this.field5978 = true;
        }
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (~arg1 != -6411 && arg1 != 34846 && arg1 != 34844) {
                if (arg1 != 6407) {
                    if (~arg1 != -6409 && arg1 != 34847) {
                        if (arg1 == 34843) {
                            return 6;
                        } else if (arg1 != 34842) {
                            if (~arg1 == -6403) {
                                return 3;
                            } else if (~arg1 == -6402) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 8;
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

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public final void method347(boolean arg0) {
        ++field5782;
    }

    @OriginalMember(owner = "client!nv", name = "U", descriptor = "(IIIII)V")
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5727;
        this.method2560((byte) 127);
        this.method2606(arg4, -24754);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nv", name = "ya", descriptor = "()V")
    public final void method319() {
        this.method2556(true, -112);
        ++field5803;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "(I)V")
    public final void method433(int arg0) {
        ++field5718;
        this.method2580(true);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method369(Canvas arg0, int arg1, int arg2) {
        ++field5764;
        if (this.field5886 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5903.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field5794.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field5903.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "ra", descriptor = "(IIII)V")
    public final void method323(int arg0, int arg1, int arg2, int arg3) {
        this.field6037 = true;
        this.field5959 = arg0;
        this.field6042 = arg1;
        ++field5844;
        this.field6056 = arg3;
        this.field6010 = arg2;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
    public static void method2549(byte arg0) {
        if (arg0 != -42) {
            field5807 = null;
        }
        field5807 = null;
        field5723 = null;
        field5905 = null;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Ltc;")
    public final class351 method2550(int arg0) {
        if (arg0 != -20140) {
            this.field6049 = true;
        }
        ++field5780;
        return this.field5970 == null ? null : this.field5970.method2889(-88);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BZ)V")
    public final void method2551(byte arg0, boolean arg1) {
        if (this.field5946 != arg1) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field5947 &= -32;
            this.field5946 = arg1;
        }
        ++field5770;
        if (arg0 > -41) {
            this.field6032 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(III)V")
    public final void method2552(int arg0, int arg1, int arg2) {
        ++field5706;
        this.field6023 = arg2;
        this.field6018 = arg1;
        this.method2622(119);
        this.method2570(arg0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IFF)V")
    public final void method2553(int arg0, float arg1, float arg2) {
        ++field5792;
        this.field6020 = arg1;
        this.field6022 = arg2;
        this.method2627((byte) 124);
        if (arg0 != -21816) {
            method2604((byte) -113, -102, true, 79);
        }
    }

    @OriginalMember(owner = "client!nv", name = "na", descriptor = "(IIII)[I")
    public final int[] method356(int arg0, int arg1, int arg2, int arg3) {
        ++field5738;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field5837 + -var6, arg2, 1, 32993, this.field6028, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBI)V")
    public final synchronized void method2554(int arg0, byte arg1, int arg2) {
        ++field5804;
        class716 var4 = new class716(arg2);
        var4.field1522 = (long) arg0;
        int var5 = 70 % ((54 - arg1) / 63);
        this.field5936.method1721((byte) 117, var4);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2555(int arg0, String arg1) {
        ++field5724;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; ++var4) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg0 != -1317272632) {
            return null;
        } else {
            for (int var6 = 0; ~var2 < ~var6; ++var6) {
                char var7 = arg1.charAt(var6);
                if (var7 == '<') {
                    var5.append("<lt>");
                } else if (var7 == '>') {
                    var5.append("<gt>");
                } else {
                    var5.append(var7);
                }
            }
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI)V")
    public final void method2556(boolean arg0, int arg1) {
        if (arg1 >= -58) {
            this.method361(44, 79, 29, -23, -45, 45, -41);
        }
        if (this.field5948 != arg0) {
            this.field5948 = arg0;
            this.method2588(true);
            this.field5947 &= -32;
        }
        ++field5704;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V")
    public final void method2557(byte arg0) {
        ++field5797;
        if (arg0 != -57) {
            this.field6027 = 41;
        }
        if (this.field5947 != 16) {
            this.method2602(true);
            this.method2597((byte) 56, true);
            this.method2551((byte) -58, true);
            this.method2556(true, -110);
            this.method2606(1, -24754);
            this.field5947 = 16;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method427(Canvas arg0, int arg1, int arg2) {
        ++field5783;
        long var4 = 0L;
        if (arg0 != null && this.field5886 != arg0) {
            if (this.field5903.containsKey(arg0)) {
                Long var6 = (Long) this.field5903.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field5745;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field5794.surfaceResized(var4);
            if (this.field5748 == arg0) {
                this.method2559((byte) 78);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(III)V")
    public final void method2558(int arg0, int arg1, int arg2) {
        if (~this.field5988 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (~this.field6013 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field6013 = arg0;
            }
            if (this.field5957 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                var4 = true;
                this.field5957 = arg2;
            }
            if (var4) {
                this.field5947 &= -30;
            }
        }
        ++field5867;
        if (arg1 != 0) {
            this.method346();
        }
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
    private final void method2559(byte arg0) {
        ++field5734;
        if (this.field5748 == null) {
            this.field5787 = this.field5735 = 0;
        } else {
            Dimension var2 = this.field5748.getSize();
            this.field5787 = var2.width;
            this.field5735 = var2.height;
        }
        if (this.field5927 == null) {
            this.field5899 = this.field5787;
            this.field5837 = this.field5735;
            this.method2622(118);
        }
        if (arg0 == 78) {
            this.method2611(30814);
            this.method393();
        }
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(B)V")
    private final void method2560(byte arg0) {
        ++field5786;
        if (arg0 > 121) {
            if (~this.field5947 != -2) {
                this.method2629((byte) 124);
                this.method2597((byte) 56, false);
                this.method2625((byte) 121, false);
                this.method2551((byte) -122, false);
                this.method2556(false, -114);
                this.method2621(-2, (class292) null);
                this.method2624(-2, 2);
                this.method2573(1, false);
                this.field5947 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(B)V")
    public final void method2561(byte arg0) {
        if (arg0 < 99) {
            this.field5967 = -24;
        }
        OpenGL.glPopMatrix();
        ++field5896;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method375(Canvas arg0) {
        ++field5813;
        if (this.field5886 == arg0) {
            throw new RuntimeException();
        } else if (this.field5903.containsKey(arg0)) {
            Long var2 = (Long) this.field5903.get(arg0);
            this.field5794.releaseSurface(arg0, var2);
            this.field5903.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "(III[I)V")
    public final void method333(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5762;
        float var5 = (float) arg2 * this.field5943.field8962 + (float) arg0 * this.field5943.field8959 + (float) arg1 * this.field5943.field8940 + this.field5943.field8955;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field5943.field8961 + (float) arg0 * this.field5943.field8954 + (float) arg1 * this.field5943.field8951 + this.field5943.field8939) * (float) this.field5984 / var5);
            arg3[0] = (int) ((float) var6 - this.field6043);
            int var7 = (int) (((float) arg2 * this.field5943.field8942 + (float) arg0 * this.field5943.field8958 + (float) arg1 * this.field5943.field8968 + this.field5943.field8944) * (float) this.field5997 / var5);
            arg3[1] = (int) ((float) var7 + -this.field5994);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[I[I)Laa;")
    public final class485 method345(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5819;
        return class356.method2095(122, arg3, this, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLgk;)V")
    public final void method2562(byte arg0, class473 arg1) {
        ++field5751;
        if (this.field5929 >= 0 && this.field5923[this.field5929] == arg1) {
            this.field5923[this.field5929--] = null;
            arg1.method731(56);
            if (arg0 > -80) {
                this.field5989 = 0.28416425F;
            }
            if (this.field5929 >= 0) {
                this.field5926 = this.field5923[this.field5929];
                this.field5926.method729(91);
            } else {
                this.field5926 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)Lza;")
    public final class413 method408(int arg0) {
        ++field5812;
        class105 var2 = new class105(arg0);
        this.field5915.method1721((byte) -35, var2);
        return var2;
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "()I")
    public final int method350() {
        ++field5842;
        return 4;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "()V")
    public final void method331() {
        ++field5759;
    }

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "(I)V")
    private final void method2563(int arg0) {
        if (~this.field6024 != -3) {
            this.field6024 = 2;
            this.method2590(arg0 ^ -24263);
            this.method2568((byte) 100);
            this.field5947 &= -8;
        }
        ++field5732;
        if (arg0 != -7879) {
            this.field5906 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "(I)V")
    private final void method2564(int arg0) {
        ++field5833;
        float[] var2 = this.field5990;
        float var3 = (float) (-this.field6002 * this.field6039) / (float) this.field5984;
        float var4 = (float) ((-this.field6002 + this.field5899) * this.field6039) / (float) this.field5984;
        float var5 = (float) (this.field6044 * this.field6039) / (float) this.field5997;
        float var6 = (float) ((-this.field5837 + this.field6044) * this.field6039) / (float) this.field5997;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field6039 * 2.0F;
            var2[7] = 0.0F;
            var2[6] = 0.0F;
            var2[12] = 0.0F;
            var2[1] = 0.0F;
            var2[2] = 0.0F;
            var2[4] = 0.0F;
            var2[14] = this.field5980 = -((float) this.field5962 * var7) / (float) (-this.field6039 + this.field5962);
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[5] = var7 / (var5 - var6);
            var2[15] = 0.0F;
            var2[13] = 0.0F;
            var2[11] = -1.0F;
            var2[3] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[10] = this.field6031 = (float) (-(this.field6039 + this.field5962)) / (float) (-this.field6039 + this.field5962);
        } else {
            var2[10] = 1.0F;
            var2[9] = 0.0F;
            var2[2] = 0.0F;
            var2[15] = 1.0F;
            var2[12] = 0.0F;
            var2[8] = 0.0F;
            var2[0] = 1.0F;
            var2[11] = 0.0F;
            var2[5] = 1.0F;
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[7] = 0.0F;
            var2[14] = 0.0F;
            var2[6] = 0.0F;
            var2[1] = 0.0F;
        }
        if (arg0 == 13) {
            this.method2616(14);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BZI)V")
    public final void method2565(byte arg0, boolean arg1, int arg2) {
        if (arg0 != 94) {
            this.field5994 = 0.25264636F;
        }
        this.method2577(arg2, true, arg1, 0);
        ++field5705;
    }

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "(I)V")
    public final void method2566(int arg0) {
        if (arg0 != 1) {
            this.field5947 = 35;
        }
        ++field5793;
        if (~this.field5947 != -9) {
            this.method2563(-7879);
            this.method2597((byte) 56, true);
            this.method2551((byte) -59, true);
            this.method2556(true, -60);
            this.method2606(1, arg0 ^ -24753);
            this.field5947 = 8;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lkm;)V")
    public final void method348(class353 arg0) {
        this.field5970 = (class608) arg0;
        ++field5754;
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "(II)I")
    public final int method2567(int arg0, int arg1) {
        ++field5871;
        if (arg0 != 7681) {
            return 93;
        } else if (arg1 != 1) {
            if (arg1 == 0) {
                return 8448;
            } else if (~arg1 != -3) {
                if (arg1 == 3) {
                    return 260;
                } else if (~arg1 == -5) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 34165;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ldfa;)V")
    public final void method339(class165 arg0) {
        ++field5749;
        this.field5943.method1028(arg0);
        this.field5950.method1028(this.field5943);
        this.field5950.method3580((byte) 31);
        this.field5951.method3582((byte) 31, this.field5950);
        if (~this.field6024 != -2) {
            this.method2568((byte) -107);
        }
    }

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "()Z")
    public final boolean method431() {
        ++field5898;
        if (this.field5904 != null) {
            if (!this.field5904.method2456(-1)) {
                if (!this.field5909.method2346((byte) 78, this.field5904)) {
                    return false;
                }
                this.field5911.method1838(2);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "HA", descriptor = "(IIII[I)V")
    public final void method363(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field5737;
        float var6 = (float) arg2 * this.field5943.field8962 + (float) arg0 * this.field5943.field8959 + (float) arg1 * this.field5943.field8940 + this.field5943.field8955;
        if (!(var6 < (float) this.field6039) && !((float) this.field5962 < var6)) {
            int var7 = (int) (((float) arg2 * this.field5943.field8961 + (float) arg0 * this.field5943.field8954 + (float) arg1 * this.field5943.field8951 + this.field5943.field8939) * (float) this.field5984 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field5943.field8942 + (float) arg0 * this.field5943.field8958 + (float) arg1 * this.field5943.field8968 + this.field5943.field8944) * (float) this.field5997 / (float) arg3);
            if (this.field6043 <= (float) var7 && this.field5982 >= (float) var7 && this.field5994 <= (float) var8 && this.field5998 >= (float) var8) {
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 + -this.field6043);
                arg4[1] = (int) ((float) var8 - this.field5994);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field5852;
        this.method380(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "()I")
    public final int method320() {
        ++field5894;
        return this.field6039;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljj;)V")
    public final void method357(class118 arg0) {
        ++field5881;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Liaa;")
    public final class493 method337(int arg0, int arg1) {
        ++field5831;
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "GA", descriptor = "(I)V")
    public final void method378(int arg0) {
        ++field5878;
        this.method2606(0, -24754);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(B)V")
    private final void method2568(byte arg0) {
        OpenGL.glLoadIdentity();
        ++field5775;
        OpenGL.glMultMatrixf(this.field5950.method3579(111), 0);
        if (this.field6048) {
            this.field5906.field4289.method281((byte) -28);
        }
        this.method2578(-16667);
        this.method2614((byte) -105);
        int var2 = 6 / ((-7 - arg0) / 62);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIF)Lada;")
    public final class163 method368(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5756;
        return new class717(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[Lada;)V")
    public final void method321(int arg0, class163[] arg1) {
        ++field5752;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field6000[var3] = arg1[var3];
        }
        this.field6021 = arg0;
        if (this.field6024 != 1) {
            this.method2614((byte) -79);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)V")
    public final synchronized void method2569(int arg0, byte arg1) {
        ++field5729;
        int var3 = -72 / ((74 - arg1) / 52);
        class716 var4 = new class716(arg0);
        this.field5937.method1721((byte) -64, var4);
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "()V")
    public final void method351() {
        if (this.field5904 != null && this.field5904.method2456(-1)) {
            this.field5909.method2353(-115, this.field5904);
            this.field5911.method1838(2);
        }
        ++field5719;
    }

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "(I)V")
    private final void method2570(int arg0) {
        if (arg0 != 0) {
            this.method435();
        }
        ++field5826;
        if (~this.field5991 >= ~this.field5975 && ~this.field5981 >= ~this.field5986) {
            OpenGL.glScissor(this.field6018 + this.field5991, this.field6023 + this.field5837 + -this.field5986, this.field5975 - this.field5991, this.field5986 - this.field5981);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIZ)Lhu;")
    public final class131 method396(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5853;
        return new class286(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "()Ldfa;")
    public final class165 method414() {
        ++field5877;
        return this.field5943;
    }

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "(I)V")
    private final void method2571(int arg0) {
        ++field5785;
        if (arg0 != 34165) {
            this.field5946 = false;
        }
        int var2 = 0;
        while (!this.field5794.method3569()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class524.method3076(1, 1000L);
        }
    }

    @OriginalMember(owner = "client!nv", name = "EA", descriptor = "(IIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        ++field5714;
        if (!this.field6037) {
            throw new RuntimeException("");
        } else {
            this.field5959 = arg0;
            this.field6056 = arg3;
            this.field6010 = arg2;
            this.field6042 = arg1;
            if (this.field6048) {
                this.field5906.field4289.method281((byte) -28);
                this.field5906.field4289.method284((byte) -25);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIB)V")
    public final void method2572(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glDrawArrays(arg1, arg2, arg0);
        if (arg3 == -45) {
            ++field5758;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)V")
    public final void method2573(int arg0, boolean arg1) {
        if (arg0 == 1) {
            this.method2558(7681, 0, 7681);
        } else if (arg0 != 0) {
            if (~arg0 == -3) {
                this.method2558(34165, 0, 7681);
            } else if (arg0 != 3) {
                if (arg0 == 4) {
                    this.method2558(34023, 0, 34023);
                }
            } else {
                this.method2558(260, 0, 8448);
            }
        } else {
            this.method2558(8448, 0, 8448);
        }
        ++field5791;
        if (arg1) {
            this.field6011 = -1.3935164F;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(FZ)V")
    public final void method2574(float arg0, boolean arg1) {
        if (this.field5972 != arg0) {
            this.field5972 = arg0;
            if (~this.field6024 == -4) {
                this.method2591((byte) -99);
            }
        }
        ++field5841;
        if (!arg1) {
            method2555(-21, (String) null);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(FIFFF)V")
    public final void method2575(float arg0, int arg1, float arg2, float arg3, float arg4) {
        class342.field4437[3] = arg4;
        class342.field4437[0] = arg2;
        class342.field4437[2] = arg0;
        ++field5855;
        class342.field4437[1] = arg3;
        OpenGL.glTexEnvfv(8960, 8705, class342.field4437, 0);
        if (arg1 != 6294) {
            this.field6066 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)V")
    public final void method439(int arg0, int arg1, int arg2, int arg3) {
        ++field5755;
        this.field5909.method2348(arg2, arg0, arg3, 54, arg1);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)I")
    public final int method404(int arg0, int arg1) {
        ++field5767;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!nv", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5879;
        float var10;
        float var11;
        if (this.field6032 != null && arg2 <= this.field6032.field10099 && ~arg3 >= ~this.field6032.field10100) {
            this.field6032.method4013(0, arg2, 107, arg3, arg6, 0, false, 0, 6406, 0);
            var10 = (float) arg3 * this.field6032.field2835 / (float) this.field6032.field10100;
            var11 = (float) arg2 * this.field6032.field2830 / (float) this.field6032.field10099;
        } else {
            this.field6032 = class735.method4094(6406, arg2, arg3, false, arg6, 6406, this, 108);
            this.field6032.method4018(false, false, (byte) 125);
            var11 = this.field6032.field2830;
            var10 = this.field6032.field2835;
        }
        this.method2620(false);
        this.method2621(-2, this.field6032);
        this.method2606(arg8, -24754);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2581((byte) -59, arg5);
        this.method2558(34165, 0, 34165);
        this.method2626(8960, 768, 0, 34166);
        this.method2626(8960, 770, 2, 5890);
        this.method2630(34166, 0, 770, 34166);
        this.method2630(34166, 2, 770, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2626(8960, 768, 0, 5890);
        this.method2626(8960, 770, 2, 34166);
        this.method2630(34166, 0, 770, 5890);
        this.method2630(34166, 2, 770, 34166);
    }

    @OriginalMember(owner = "client!nv", name = "KA", descriptor = "(IIII)V")
    public final void method432(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5899 < arg2) {
            arg2 = this.field5899;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (this.field5837 < arg3) {
            arg3 = this.field5837;
        }
        ++field5859;
        this.field5975 = arg2;
        this.field5981 = arg1;
        this.field5986 = arg3;
        this.field5991 = arg0;
        OpenGL.glEnable(3089);
        this.method2546(false);
        this.method2570(0);
    }

    @OriginalMember(owner = "client!nv", name = "JA", descriptor = "(IIIIII)I")
    public final int method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5720;
        int var7 = 0;
        float var8 = (float) arg2 * this.field5943.field8962 + (float) arg0 * this.field5943.field8959 + (float) arg1 * this.field5943.field8940 + this.field5943.field8955;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field5943.field8962 + (float) arg3 * this.field5943.field8959 + (float) arg4 * this.field5943.field8940 + this.field5943.field8955;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field6039 && (float) this.field6039 > var9) {
            var7 |= 16;
        } else if ((float) this.field5962 < var8 && (float) this.field5962 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field5943.field8961 + (float) arg0 * this.field5943.field8954 + (float) arg1 * this.field5943.field8951 + this.field5943.field8939) * (float) this.field5984 / var8);
        int var11 = (int) (((float) arg5 * this.field5943.field8961 + (float) arg3 * this.field5943.field8954 + (float) arg4 * this.field5943.field8951 + this.field5943.field8939) * (float) this.field5984 / var9);
        if ((float) var10 < this.field6043 && this.field6043 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field5982 && (float) var11 > this.field5982) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field5943.field8942 + (float) arg0 * this.field5943.field8958 + (float) arg1 * this.field5943.field8968 + this.field5943.field8944) * (float) this.field5997 / var8);
        int var13 = (int) (((float) arg5 * this.field5943.field8942 + (float) arg3 * this.field5943.field8958 + (float) arg4 * this.field5943.field8968 + this.field5943.field8944) * (float) this.field5997 / var9);
        if ((float) var12 < this.field5994 && this.field5994 > (float) var13) {
            var7 |= 4;
        } else if (this.field5998 < (float) var12 && (float) var13 > this.field5998) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "(I)V")
    private final void method2576(int arg0) {
        ++field5811;
        if (this.field5993) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5993 = false;
        }
        if (arg0 <= 23) {
            this.method2565((byte) 122, true, 11);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5776;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            this.method2560((byte) 123);
            this.method2606(arg5, -24754);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var13 = arg8 % (arg6 + arg7);
            float var14 = var11 * var12;
            float var15 = var10 * var12;
            float var16 = (float) arg6 * var15;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (arg6 >= var13) {
                var20 = (float) (-var13 + arg6) * var15;
                var21 = (float) (-var13 + arg6) * var14;
            } else {
                var18 = (float) (arg6 - -arg7 + -var13) * var15;
                var19 = (float) (arg6 + arg7 + -var13) * var14;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var15;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (~arg0 <= ~arg2) {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                }
                if (~arg3 < ~arg1) {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 + -var23;
                    }
                } else {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var22 += var20 + var24;
                var23 += var21 + var25;
                OpenGL.glEnd();
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "(II)V")
    public final void method386(int arg0, int arg1) {
        ++field5843;
    }

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "()Z")
    public final boolean method421() {
        ++field5761;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZZI)V")
    public final void method2577(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field6025 != arg0 || !this.field6037 != !this.field6048) {
            class720 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field6037 ? 0 : 3;
            if (arg0 < 0) {
                this.method2576(110);
            } else {
                var5 = this.field5911.method1835(arg0, (byte) -29);
                class298 var10 = super.field578.method931(arg0, true);
                if (~var10.field3704 == -1 && ~var10.field3699 == -1) {
                    this.method2576(110);
                } else {
                    int var11 = var10.field3711 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method2596((float) (this.field5919 % var12 * var10.field3704) / (float) var12, (float) (this.field5919 % var12 * var10.field3699) / (float) var12, arg3 ^ -22744, 0.0F);
                }
                if (!this.field6037) {
                    var9 = var10.field3702;
                    var8 = var10.field3712;
                    var7 = var10.field3695;
                }
                var6 = var10.field3705;
            }
            this.field5906.method1985(arg2, var9, var8, arg1, var7, (byte) -75);
            if (!this.field5906.method1983(var6, false, var5)) {
                this.method2621(-2, var5);
                this.method2573(var6, false);
            }
            this.field6025 = arg0;
            this.field6048 = this.field6037;
        }
        ++field5897;
        if (arg3 == 0) {
            this.field5947 &= -8;
        }
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        ++field5798;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "(I)V")
    public final void method2578(int arg0) {
        ++field5876;
        OpenGL.glLightfv(16384, 4611, this.field6003, 0);
        if (arg0 == -16667) {
            OpenGL.glLightfv(16385, 4611, this.field6034, 0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILeb;)V")
    public final void method2579(int arg0, class624 arg1) {
        OpenGL.glLoadMatrixf(arg1.method3579(110), arg0);
        ++field5713;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(Z)V")
    private final void method2580(boolean arg0) {
        this.field5794.method3567();
        ++field5895;
        if (!arg0) {
            this.method424(-122, -27, (int[][]) null, (int[][]) null, -83, -31, -35);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)V")
    public final void method2581(byte arg0, int arg1) {
        class342.field4437[3] = (float) (arg1 >>> 24) / 255.0F;
        ++field5697;
        class342.field4437[1] = (float) class327.method1956(arg1, 65280) / 65280.0F;
        class342.field4437[0] = (float) class327.method1956(16711680, arg1) / 1.671168E7F;
        class342.field4437[2] = (float) class327.method1956(arg1, 255) / 255.0F;
        if (arg0 != -59) {
            this.method2544((class583) null, (byte) -126);
        }
        OpenGL.glTexEnvfv(8960, 8705, class342.field4437, 0);
    }

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "()Z")
    public final boolean method376() {
        ++field5817;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "(B)I")
    public static final int method2582(byte arg0) {
        ++field5888;
        int var1 = 109 / ((47 - arg0) / 58);
        class620 var2 = class529.field7530;
        synchronized (class529.field7530) {
            return class529.field7530.method3543(-125);
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(III)V")
    public final synchronized void method2583(int arg0, int arg1, int arg2) {
        ++field5725;
        class716 var4 = new class716(arg0);
        var4.field1522 = (long) arg1;
        this.field5935.method1721((byte) -127, var4);
        if (arg2 >= -123) {
            this.method2570(-27);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(BI)Lvga;")
    public static final class85 method2584(byte arg0, int arg1) {
        ++field5777;
        if (arg0 != -97) {
            field5795 = -47;
        }
        class85 var2 = (class85) class251.field3036.method1613((long) arg1, 86);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class544.field7827.method2481(arg1, 0, (byte) 118);
            if (var3 != null && ~var3.length < -2) {
                class85 var4;
                try {
                    var4 = class497.method2963(var3, 0);
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg1);
                }
                class251.field3036.method1611((long) arg1, (byte) 88, var4);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(FFF)V")
    public final void method401(float arg0, float arg1, float arg2) {
        ++field5832;
        class306.field3819 = arg2;
        class515.field7346 = arg1;
        class265.field3292 = arg0;
    }

    @OriginalMember(owner = "client!nv", name = "xa", descriptor = "(F)V")
    public final void method360(float arg0) {
        ++field5790;
        if (this.field6058 != arg0) {
            this.field6058 = arg0;
            this.method2619(-107);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BII)V")
    public final synchronized void method2585(byte arg0, int arg1, int arg2) {
        ++field5743;
        class716 var4 = new class716(arg2);
        var4.field1522 = (long) arg1;
        this.field5938.method1721((byte) -52, var4);
        if (arg0 >= -82) {
            this.field6015 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field5788;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            class291 var13 = (class291) arg6;
            class238 var14 = var13.field3585;
            this.method2620(false);
            this.method2621(-2, var13.field3585);
            this.method2606(arg5, -24754);
            this.method2558(7681, 0, 8448);
            this.method2626(8960, 768, 0, 34167);
            float var15 = var14.field2830 / (float) var14.field2834;
            float var16 = var14.field2835 / (float) var14.field2836;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg9 + arg10);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var21 = var17 * var19;
            float var22 = var18 * var19;
            float var23 = (float) arg9 * var21;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (arg9 >= var20) {
                var28 = (float) (-var20 + arg9) * var22;
                var27 = (float) (-var20 + arg9) * var21;
            } else {
                var26 = (float) (-var20 + arg10 + arg9) * var22;
                var25 = (float) (arg9 - (-arg10 + var20)) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var21;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (~arg0 <= ~arg2) {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var29) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (arg1 >= arg3) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 + -var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var29 += var27 + var31;
                OpenGL.glEnd();
                var30 += var28 + var32;
                var27 = var23;
                var28 = var24;
            }
            this.method2626(8960, 768, 0, 5890);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BFFF)I")
    public static final int method2586(byte arg0, float arg1, float arg2, float arg3) {
        ++field5866;
        if (arg0 >= -119) {
            field5795 = 14;
        }
        float var4 = arg2 < 0.0F ? -arg2 : arg2;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = !(arg3 < 0.0F) ? arg3 : -arg3;
        if (var5 > var4 && var6 < var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg3 > 0.0F ? 2 : 3;
        } else {
            return arg2 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIII)Lkm;")
    public final class353 method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5825;
        return this.field5953 ? new class632(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class278 method424(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5818;
        return new class296(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "(B)V")
    private final void method2587(byte arg0) {
        class342.field4437[2] = this.field6029 * this.field5974;
        ++field5839;
        class342.field4437[1] = this.field6050 * this.field6029;
        class342.field4437[3] = 1.0F;
        class342.field4437[0] = this.field6029 * this.field5969;
        OpenGL.glLightfv(16384, 4609, class342.field4437, 0);
        class342.field4437[3] = 1.0F;
        class342.field4437[2] = -this.field6038 * this.field5974;
        class342.field4437[0] = -this.field6038 * this.field5969;
        class342.field4437[1] = -this.field6038 * this.field6050;
        OpenGL.glLightfv(16385, 4609, class342.field4437, 0);
        if (arg0 < 71) {
            this.field5973 = -0.6330711F;
        }
    }

    @OriginalMember(owner = "client!nv", name = "la", descriptor = "()V")
    public final void method393() {
        this.field5991 = 0;
        ++field5715;
        this.field5975 = this.field5899;
        this.field5981 = 0;
        this.field5986 = this.field5837;
        OpenGL.glDisable(3089);
        this.method2546(false);
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(Z)V")
    private final void method2588(boolean arg0) {
        ++field5757;
        if (!arg0) {
            this.method404(100, -110);
        }
        OpenGL.glDepthMask(this.field5948 && this.field6045);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field5835;
        this.method2560((byte) 122);
        this.method2606(arg12, -24754);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "()Z")
    public final boolean method420() {
        ++field5872;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lpw;Lpw;Lpw;ZLpw;)V")
    public final void method2589(class704 arg0, class704 arg1, class704 arg2, boolean arg3, class704 arg4) {
        ++field5708;
        if (arg4 != null) {
            this.method2544(arg4.field9914, (byte) 4);
            OpenGL.glVertexPointer(arg4.field9912, arg4.field9921, this.field6006.method22(true), this.field6006.method20(-22317) - -((long) arg4.field9919));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg3) {
            this.field6011 = 1.0026438F;
        }
        if (arg1 != null) {
            this.method2544(arg1.field9914, (byte) 4);
            OpenGL.glNormalPointer(arg1.field9921, this.field6006.method22(!arg3), this.field6006.method20(-22317) - -((long) arg1.field9919));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg0 != null) {
            this.method2544(arg0.field9914, (byte) 4);
            OpenGL.glColorPointer(arg0.field9912, arg0.field9921, this.field6006.method22(true), this.field6006.method20(-22317) + (long) arg0.field9919);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 != null) {
            this.method2544(arg2.field9914, (byte) 4);
            OpenGL.glTexCoordPointer(arg2.field9912, arg2.field9921, this.field6006.method22(true), this.field6006.method20(-22317) + (long) arg2.field9919);
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lpca;I)V")
    public final void method402(class713 arg0, int arg1) {
        this.field5910.method2497(64, this, arg1, arg0);
        ++field5849;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "()Z")
    public final boolean method328() {
        ++field5769;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "()I")
    public final int method346() {
        ++field5814;
        int var1 = this.field6067;
        this.field6067 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([IIIIIZ)Lhu;")
    public final class131 method324(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5810;
        return new class286(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "(I)V")
    private final void method2590(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field5730;
        OpenGL.glLoadMatrixf(this.field5990, 0);
        if (arg0 != 16384) {
            this.field5943 = null;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nv", name = "Y", descriptor = "()[I")
    public final int[] method327() {
        ++field5854;
        return new int[] { this.field6002, this.field6044, this.field5984, this.field5997 };
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "()V")
    public final void method334() {
        ++field5884;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class417(Canvas arg0, class150 arg1, int arg2) {
        super(arg1);
        new class347();
        new class295(16);
        this.field5933 = new class289();
        this.field5935 = new class289();
        this.field5936 = new class289();
        this.field5937 = new class289();
        this.field5938 = new class289();
        this.field5939 = new class289();
        this.field5940 = new class289();
        this.field5943 = new class624();
        this.field5950 = new class624();
        this.field5951 = new class624();
        this.field5973 = 3584.0F;
        this.field5957 = 8448;
        this.field5986 = 0;
        this.field5997 = 512;
        this.field5974 = 1.0F;
        this.field5958 = new float[4];
        this.field5962 = 3584;
        this.field6003 = new float[4];
        this.field5990 = new float[16];
        this.field6011 = -1.0F;
        this.field6012 = -1;
        this.field6020 = 0.0F;
        this.field6019 = -1;
        this.field5984 = 512;
        this.field5975 = 0;
        this.field6010 = -1;
        this.field5972 = 1.0F;
        this.field5969 = 1.0F;
        this.field6018 = 0;
        this.field5966 = -1.0F;
        this.field6045 = true;
        this.field6038 = -1.0F;
        this.field5991 = 0;
        this.field6044 = 0;
        this.field6022 = 1.0F;
        this.field6029 = -1.0F;
        this.field5981 = 0;
        this.field6014 = -1;
        this.field6002 = 0;
        this.field6039 = 50;
        this.field6050 = 1.0F;
        this.field6048 = false;
        this.field6042 = -1;
        this.field6000 = new class163[class304.field3793];
        this.field6023 = 0;
        this.field6052 = 3584.0F;
        this.field6056 = 0;
        this.field6034 = new float[4];
        this.field6013 = 8448;
        this.field6060 = 0;
        this.field6053 = new float[4];
        this.field6059 = new class685(8192);
        this.field6066 = new byte[16384];
        this.field6063 = new int[1];
        this.field6064 = new int[1];
        this.field6062 = new int[1];
        this.field5748 = this.field5886 = arg0;
        this.field5907 = arg2;
        if (!class79.method555(33, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class79.method555(33, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field5794 = new OpenGL();
                this.field5733 = this.field5745 = this.field5794.init(arg0, 8, 8, 8, 24, 0, this.field5907);
                if (~this.field5745 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2571(34165);
                    int var4 = this.method2605(-126);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field6028 = this.field5992 ? 33639 : 5121;
                        if (this.field6040.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class625.method3586(this.field6040.replace('/', ' '), ' ', -16647);
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class260.method1567((byte) -115, var10.substring(1, 3))) {
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
                                            if (~var10.length() <= -5 && class260.method1567((byte) -114, var10.substring(0, 4))) {
                                                var5 = class219.method1282((byte) -86, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field6049 = false;
                                }
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field5952 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field5965 = false;
                            }
                            this.field5996 &= this.field5794.method3568("GL_ARB_half_float_pixel");
                            this.field5983 = true;
                            this.field5968 = this.field5952;
                        }
                        if (this.field5956.indexOf("intel") != -1) {
                            this.field6033 = false;
                        }
                        this.field6026 = !this.field5956.equals("s3 graphics");
                        if (this.field5952) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class246.method1492(false, true, (byte) 107);
                        this.field5916 = true;
                        this.field5911 = new class308(this, super.field578);
                        this.method2613(false);
                        this.field5914 = new class712(this);
                        this.field5909 = new class382(this);
                        if (this.field5909.method2349(0)) {
                            this.field5904 = new class169(this);
                            if (!this.field5904.method1049(0)) {
                                this.field5904.method1050(-3058);
                                this.field5904 = null;
                            }
                        }
                        this.field5906 = new class331(this);
                        this.method2610((byte) 114);
                        this.method2559((byte) 78);
                        this.method362();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method322();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "(B)V")
    private final void method2591(byte arg0) {
        ++field5869;
        float var2 = (float) (-this.field6002) * this.field5972 / (float) this.field5984;
        int var3 = 28 / ((arg0 - -36) / 32);
        float var4 = (float) (-this.field6044) * this.field5972 / (float) this.field5997;
        float var5 = (float) (-this.field6002 + this.field5899) * this.field5972 / (float) this.field5984;
        float var6 = (float) (this.field5837 - this.field6044) * this.field5972 / (float) this.field5997;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var5 && var4 != var6) {
            OpenGL.glOrtho((double) var2, (double) var5, (double) (-var6), (double) (-var4), (double) this.field6039, (double) this.field5962);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "()Z")
    public final boolean method326() {
        ++field5823;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lg;Z)Lhu;")
    public final class131 method434(class155 arg0, boolean arg1) {
        ++field5740;
        int[] var3 = new int[arg0.field1708 * arg0.field1706];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1707 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field1706; ++var6) {
                for (int var7 = 0; ~arg0.field1708 < ~var7; ++var7) {
                    int var8 = arg0.field1710[arg0.field1702[var4++] & 255];
                    var3[var5++] = var8 == 0 ? 0 : class695.method3919(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field1706; ++var9) {
                for (int var11 = 0; ~var11 > ~arg0.field1708; ++var11) {
                    var3[var5++] = class695.method3919(arg0.field1710[class327.method1956(arg0.field1702[var4], 255)], arg0.field1707[var4] << 24);
                    ++var4;
                }
            }
        }
        class131 var10 = this.method430(arg0.field1706, -95, var3, arg0.field1708, arg0.field1708, 0);
        var10.method511(arg0.field1709, arg0.field1703, arg0.field1704, arg0.field1705);
        return var10;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lur;[Lg;Z)Lda;")
    public final class59 method373(class535 arg0, class155[] arg1, boolean arg2) {
        ++field5774;
        return new class365(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(BI)I")
    public final int method2592(byte arg0, int arg1) {
        ++field5856;
        if (arg0 >= -46) {
            field5905 = null;
        }
        if (~arg1 != -5122 && arg1 != 5120) {
            if (~arg1 != -5124 && arg1 != 5122) {
                if (arg1 != 5125 && arg1 != 5124 && ~arg1 != -5127) {
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

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "(IIIII)V")
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5865;
        this.method2560((byte) 123);
        this.method2606(arg4, -24754);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "()I")
    public final int method406() {
        ++field5883;
        return this.field5934 + this.field5932 + this.field5931;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILtv;BI)V")
    public final void method2593(int arg0, int arg1, class558 arg2, byte arg3, int arg4) {
        ++field5753;
        int var6 = arg2.method922(-25300);
        int var7 = arg4 * this.method2592((byte) -128, var6);
        this.method2594(arg2, (byte) -58);
        OpenGL.glDrawElements(arg0, arg1, var6, (long) var7 + arg2.method920(-26521));
        if (arg3 != -9) {
            this.method2552(-103, 59, -13);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ltv;B)V")
    public final void method2594(class558 arg0, byte arg1) {
        ++field5892;
        if (this.field6007 != arg0) {
            if (this.field5952) {
                OpenGL.glBindBufferARB(34963, arg0.method921(-5325));
            }
            this.field6007 = arg0;
        }
        if (arg1 != -58) {
            this.method2592((byte) -93, -21);
        }
    }

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "()Z")
    public final boolean method394() {
        ++field5711;
        return this.field5906.method1980(3, -124);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IJ)V")
    public final synchronized void method2595(int arg0, long arg1) {
        ++field5716;
        if (arg0 != 128) {
            this.method2587((byte) -86);
        }
        class134 var4 = new class134();
        var4.field1522 = arg1;
        this.field5940.method1721((byte) -125, var4);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([I)V")
    public final void method372(int[] arg0) {
        ++field5699;
        arg0[0] = this.field5899;
        arg0[1] = this.field5837;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(FFIF)V")
    private final void method2596(float arg0, float arg1, int arg2, float arg3) {
        ++field5696;
        OpenGL.glMatrixMode(5890);
        if (this.field5993) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg1, arg3);
        OpenGL.glMatrixMode(5888);
        this.field5993 = true;
        if (arg2 != -22744) {
            this.field5940 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(BZ)V")
    public final void method2597(byte arg0, boolean arg1) {
        if (!arg1 == this.field6047) {
            this.field6047 = arg1;
            this.method2599((byte) 92);
            this.field5947 &= -32;
        }
        if (arg0 != 56) {
            this.field6065 = -47;
        }
        ++field5820;
    }

    @OriginalMember(owner = "client!nv", name = "za", descriptor = "(IIIII)V")
    public final void method382(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5712;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (~(arg0 + arg2) <= ~this.field5991 && this.field5975 >= -arg2 + arg0 && ~(arg1 + arg2) <= ~this.field5981 && -arg2 + arg1 <= this.field5986) {
            this.method2560((byte) 122);
            this.method2606(arg4, -24754);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field6011 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field5966) {
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
                if (~var9 < -65) {
                    if (~var9 < -513) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class687.method3886(84, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class247.field3003[var11] * (float) arg2 + var6, class247.field3004[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class266 {
        ++field5829;
        this.method429(arg2, arg3);
    }

    @OriginalMember(owner = "client!nv", name = "pa", descriptor = "()V")
    public final void method419() {
        ++field5698;
        this.field6037 = false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([BIZII)Lid;")
    public final class583 method2598(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field5741;
        if (arg1 != 34168) {
            this.method2612(-98, (class473) null);
        }
        return (class583) (!this.field5952 || arg2 && !this.field5968 ? new class472(this, arg4, arg0, arg3) : new class5(this, arg4, arg0, arg3, arg2));
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "(B)V")
    private final void method2599(byte arg0) {
        int var2 = -67 % ((55 - arg0) / 37);
        ++field5846;
        if (this.field6047 && ~this.field6012 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "()Z")
    public final boolean method359() {
        ++field5707;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(II)Lkv;")
    public final class268 method425(int arg0, int arg1) {
        ++field5796;
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "()Z")
    public final boolean method440() {
        ++field5901;
        return this.field5964 && (!this.method358() || this.field6055);
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(IIIIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5760;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2560((byte) 126);
        this.method2606(arg5, -24754);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5964) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5964) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lkm;Lkm;FLkm;)Lkm;")
    public final class353 method341(class353 arg0, class353 arg1, float arg2, class353 arg3) {
        ++field5700;
        if (arg0 != null && arg1 != null && this.field5953 && this.field6033) {
            class480 var5 = null;
            class608 var6 = (class608) arg0;
            class608 var7 = (class608) arg1;
            class351 var8 = var6.method2889(-84);
            class351 var9 = var7.method2889(-122);
            if (var8 != null && var9 != null) {
                int var10 = var8.field4518 <= var9.field4518 ? var9.field4518 : var8.field4518;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class480) {
                    class480 var11 = (class480) arg3;
                    if (var11.method2886(2048) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class480(this, var10);
                }
                if (var5.method2887(-30757, var9, arg2, var8)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lkv;Liaa;)Ljj;")
    public final class118 method423(class268 arg0, class493 arg1) {
        ++field5873;
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lgk;I)V")
    public final void method2600(class473 arg0, int arg1) {
        ++field5861;
        if (this.field5922 >= 0 && this.field5924[this.field5922] == arg0) {
            if (arg1 != 1) {
                field5807 = null;
            }
            this.field5924[this.field5922--] = null;
            arg0.method736((byte) 70);
            if (~this.field5922 > -1) {
                this.field5927 = null;
            } else {
                this.field5927 = this.field5924[this.field5922];
                this.field5927.method724(-3090);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "()Z")
    public final boolean method413() {
        ++field5808;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "()Ldfa;")
    public final class165 method422() {
        ++field5765;
        return this.field5912;
    }

    @OriginalMember(owner = "client!nv", name = "T", descriptor = "(IIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3) {
        if (~arg2 > ~this.field5975) {
            this.field5975 = arg2;
        }
        if (this.field5991 < arg0) {
            this.field5991 = arg0;
        }
        if (arg3 < this.field5986) {
            this.field5986 = arg3;
        }
        ++field5721;
        if (~arg1 < ~this.field5981) {
            this.field5981 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method2546(false);
        this.method2570(0);
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "()Ldfa;")
    public final class165 method352() {
        ++field5809;
        return new class624();
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
    public final void method366(int arg0) {
        ++field5799;
    }

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "(I)V")
    public final void method2601(int arg0) {
        ++field5890;
        OpenGL.glPushMatrix();
        if (arg0 != 0) {
            this.field5918 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(Z)V")
    private final void method2602(boolean arg0) {
        if (arg0) {
            ++field5742;
            if (~this.field6024 != -4) {
                this.field6024 = 3;
                this.method2591((byte) 9);
                this.method2568((byte) 89);
                this.field5947 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZB)V")
    public final void method2603(boolean arg0, byte arg1) {
        ++field5771;
        if (!arg0 != !this.field6046) {
            this.field6046 = arg0;
            this.method2609(56);
        }
        if (arg1 != -121) {
            this.field6045 = true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "aa", descriptor = "(IIIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5845;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2560((byte) 125);
        float var10 = (float) arg3 + var8;
        this.method2606(arg5, -24754);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5964) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5964) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "()V")
    public final void method426() {
        ++field5891;
        if (this.field6033) {
            if (this.field5927 != this.field5930) {
                throw new RuntimeException();
            }
            this.field5930.method737(0, (byte) -118);
            this.field5930.method737(8, (byte) -118);
            this.method2617((byte) -76, this.field5930);
        } else {
            if (!this.field6051) {
                throw new RuntimeException("");
            }
            this.field5921.method826(0, 0, this.field5899, this.field5837, 0, 0);
            this.field5794.setSurface(this.field5733);
        }
        this.field5921 = null;
        this.field5837 = this.field5735;
        this.field5899 = this.field5787;
        this.method2611(30814);
        this.method2622(118);
        this.method393();
    }

    @OriginalMember(owner = "client!nv", name = "XA", descriptor = "()I")
    public final int method435() {
        ++field5802;
        return this.field5962;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BIZI)Ljava/lang/String;")
    public static final String method2604(byte arg0, int arg1, boolean arg2, int arg3) {
        ++field5863;
        if (arg1 >= 2 && ~arg1 >= -37) {
            if (arg2 && arg3 >= 0) {
                int var4 = 2;
                int var5 = arg3 / arg1;
                while (~var5 != -1) {
                    var5 /= arg1;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                int var7 = var4 + -1;
                if (arg0 != -37) {
                    method2604((byte) 116, 87, false, -1);
                }
                while (var7 > 0) {
                    int var8 = arg3;
                    arg3 /= arg1;
                    int var9 = -(arg1 * arg3) + var8;
                    if (~var9 <= -11) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                    --var7;
                }
                return new String(var6);
            } else {
                return Integer.toString(arg3, arg1);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "(III)V")
    public final void method342(int arg0, int arg1, int arg2) {
        if (~this.field6014 != ~arg0 || this.field6012 != arg1 || this.field6060 != arg2) {
            this.field6012 = arg1;
            this.field6060 = arg2;
            this.field6014 = arg0;
            this.method2627((byte) 120);
            this.method2599((byte) 112);
        }
        ++field5870;
    }

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "(I)I")
    private final int method2605(int arg0) {
        ++field5882;
        this.field5956 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field6040 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field5956.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field5956.indexOf("brian paul") != -1 || this.field5956.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class625.method3586(var3.replace('.', ' '), ' ', -16647);
        if (var4.length >= 2) {
            try {
                int var5 = class219.method1282((byte) -23, var4[0]);
                int var6 = class219.method1282((byte) -21, var4[1]);
                this.field5971 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field5971 < 12) {
            var2 |= 2;
        }
        if (!this.field5794.method3568("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5794.method3568("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5963 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field6057 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5967 = var7[0];
        if (~this.field5963 > -3 || this.field6057 < 2 || this.field5967 < 2) {
            var2 |= 16;
        }
        this.field5992 = Stream.method3823();
        this.field6051 = this.field5794.arePbuffersAvailable();
        this.field5952 = this.field5794.method3568("GL_ARB_vertex_buffer_object");
        this.field5964 = this.field5794.method3568("GL_ARB_multisample");
        this.field5978 = this.field5794.method3568("GL_ARB_vertex_program");
        if (arg0 >= -104) {
            return 60;
        } else {
            this.field5794.method3568("GL_ARB_fragment_program");
            this.field6041 = this.field5794.method3568("GL_ARB_vertex_shader");
            this.field6030 = this.field5794.method3568("GL_ARB_fragment_shader");
            this.field6049 = this.field5794.method3568("GL_EXT_texture3D");
            this.field5996 = this.field5794.method3568("GL_ARB_texture_rectangle");
            this.field5953 = this.field5794.method3568("GL_ARB_texture_cube_map");
            this.field5965 = this.field5794.method3568("GL_ARB_texture_float");
            this.field6061 = false;
            this.field6033 = this.field5794.method3568("GL_EXT_framebuffer_object");
            this.field5976 = this.field5794.method3568("GL_EXT_framebuffer_blit");
            this.field5961 = this.field5794.method3568("GL_EXT_framebuffer_multisample");
            this.field6055 = this.field5976 & this.field5961;
            OpenGL.glGetFloatv(2834, class342.field4437, 0);
            this.field5966 = class342.field4437[1];
            this.field6011 = class342.field4437[0];
            return ~var2 != -1 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(IIIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5800;
        this.method2560((byte) 124);
        this.method2606(arg5, -24754);
        float var7 = (float) arg2 - (float) arg0;
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

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Luk;IIII)Lka;")
    public final class470 method383(class260 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5816;
        return new class610(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "(II)V")
    public final void method2606(int arg0, int arg1) {
        ++field5747;
        if (~this.field5945 != ~arg0) {
            boolean var3;
            byte var4;
            boolean var5;
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    var3 = true;
                    var4 = 2;
                    var5 = false;
                } else if (arg0 == 128) {
                    var4 = 3;
                    var3 = true;
                    var5 = true;
                } else {
                    var4 = 0;
                    var5 = false;
                    var3 = true;
                }
            } else {
                var4 = 1;
                var5 = true;
                var3 = true;
            }
            if (this.field5944 != var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field5944 = var3;
            }
            if (!var5 == this.field5942) {
                if (var5) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field5942 = var5;
            }
            if (~this.field5949 != ~var4) {
                if (var4 != 1) {
                    if (var4 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var4 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field5949 = var4;
            }
            this.field5945 = arg0;
            this.field5947 &= -29;
        }
        if (arg1 != -24754) {
            this.method362();
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZILjaclib/memory/Buffer;B)Lid;")
    public final class583 method2607(int arg0, boolean arg1, int arg2, Buffer arg3, byte arg4) {
        ++field5828;
        if (!this.field5952 || arg1 && !this.field5968) {
            if (arg4 != -47) {
                this.method2612(-28, (class473) null);
            }
            return new class472(this, arg0, arg3);
        } else {
            return new class5(this, arg0, arg3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIZ[B)Ltv;")
    public final class558 method2608(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field5864;
        if (arg2 != 2) {
            this.field5988 = -58;
        }
        return (class558) (!this.field5952 || arg3 && !this.field5968 ? new class579(this, arg0, arg4, arg1) : new class148(this, arg0, arg4, arg1, arg3));
    }

    @OriginalMember(owner = "client!nv", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method325(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5836;
        boolean var7 = this.field6019 != arg0;
        if (var7 || this.field6029 != arg1 || this.field6038 != arg2) {
            this.field6019 = arg0;
            this.field6029 = arg1;
            this.field6038 = arg2;
            if (var7) {
                this.field5969 = (float) (this.field6019 & 16711680) / 1.671168E7F;
                this.field5974 = (float) (255 & this.field6019) / 255.0F;
                this.field6050 = (float) (this.field6019 & 65280) / 65280.0F;
                this.method2619(-83);
            }
            this.method2587((byte) 95);
        }
        if (this.field6053[0] != arg3 || this.field6053[1] != arg4 || this.field6053[2] != arg5) {
            this.field6053[2] = arg5;
            this.field6053[1] = arg4;
            this.field6053[0] = arg3;
            this.field5958[0] = -arg3;
            this.field5958[2] = -arg5;
            this.field5958[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6003[2] = arg5 * var8;
            this.field6003[1] = arg4 * var8;
            this.field6003[0] = arg3 * var8;
            this.field6034[1] = -this.field6003[1];
            this.field6034[2] = -this.field6003[2];
            this.field6034[0] = -this.field6003[0];
            this.method2578(-16667);
            this.field5960 = (int) (arg3 * 256.0F / arg4);
            this.field6027 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)I")
    public final int method418(int arg0, int arg1) {
        ++field5772;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "(I)V")
    private final void method2609(int arg0) {
        int var2 = 9 % ((-17 - arg0) / 37);
        ++field5731;
        if (this.field5985 && !this.field6046) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "(B)V")
    private final void method2610(byte arg0) {
        this.method2624(-2, 2);
        ++field5838;
        for (int var2 = this.field5963 + -1; ~var2 <= -1; --var2) {
            this.method2545(arg0 + 32772, var2);
            this.method2621(-2, (class292) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2558(8448, arg0 ^ 114, 8448);
        this.method2626(8960, 770, 2, 34168);
        this.method2576(89);
        this.field5945 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field5949 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field5942 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5944 = true;
        this.method2597((byte) 56, true);
        this.method2625((byte) 91, true);
        this.method2551((byte) -72, true);
        this.method2556(true, -118);
        this.method2611(arg0 + 30700);
        this.field5794.setSwapInterval(0);
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
        for (int var4 = 0; ~var4 > -9; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        if (arg0 != 114) {
            this.field5733 = 104L;
        }
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field6019 = this.field6014 = -1;
        this.method393();
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(II)V")
    public final void method429(int arg0, int arg1) throws class266 {
        ++field5893;
        try {
            this.field5794.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(I)V")
    public final synchronized void method415(int arg0) {
        ++field5868;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field5935.method1717((byte) 28)) {
            class716 var12 = (class716) this.field5935.method1729(662);
            class108.field1139[var2++] = (int) var12.field1522;
            this.field5932 -= var12.field10054;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class108.field1139, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class108.field1139, 0);
            var2 = 0;
        }
        while (!this.field5936.method1717((byte) 28)) {
            class716 var11 = (class716) this.field5936.method1729(662);
            class108.field1139[var2++] = (int) var11.field1522;
            this.field5934 -= var11.field10054;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class108.field1139, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class108.field1139, 0);
            var2 = 0;
        }
        while (!this.field5937.method1717((byte) 28)) {
            class716 var10 = (class716) this.field5937.method1729(662);
            class108.field1139[var2++] = var10.field10054;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class108.field1139, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class108.field1139, 0);
            var2 = 0;
        }
        while (!this.field5938.method1717((byte) 28)) {
            class716 var9 = (class716) this.field5938.method1729(662);
            class108.field1139[var2++] = (int) var9.field1522;
            this.field5931 -= var9.field10054;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class108.field1139, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class108.field1139, 0);
            boolean var4 = false;
        }
        while (!this.field5933.method1717((byte) 28)) {
            class716 var8 = (class716) this.field5933.method1729(662);
            OpenGL.glDeleteLists((int) var8.field1522, var8.field10054);
        }
        while (!this.field5939.method1717((byte) 28)) {
            class134 var7 = this.field5939.method1729(662);
            OpenGL.glDeleteProgramARB((int) var7.field1522);
        }
        while (!this.field5940.method1717((byte) 28)) {
            class134 var6 = this.field5940.method1729(662);
            OpenGL.glDeleteObjectARB(var6.field1522);
        }
        while (!this.field5933.method1717((byte) 28)) {
            class716 var5 = (class716) this.field5933.method1729(662);
            OpenGL.glDeleteLists((int) var5.field1522, var5.field10054);
        }
        this.field5911.method1839(2);
        if (~this.method406() < -100663297 && class652.method3700(-1) > this.field5941 - -60000L) {
            System.gc();
            this.field5941 = class652.method3700(-1);
        }
        this.field5919 = var3;
    }

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "(I)V")
    public final void method2611(int arg0) {
        if (arg0 != 30814) {
            this.method2624(-56, -28);
        }
        if (this.field6024 != 0) {
            this.field6024 = 0;
            this.field5947 &= -32;
        }
        ++field5902;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lpca;)V")
    public final void method391(class713 arg0) {
        ++field5739;
        this.field5910.method2497(64, this, -1, arg0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILgk;)V")
    public final void method2612(int arg0, class473 arg1) {
        ++field5880;
        if (~this.field5922 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field5922 <= -1) {
                this.field5924[this.field5922].method736((byte) 70);
            }
            if (arg0 != 10272) {
                this.method424(82, -55, (int[][]) null, (int[][]) null, 114, -74, -50);
            }
            this.field5927 = this.field5924[++this.field5922] = arg1;
            this.field5927.method724(-3090);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(IIIID)V")
    public final void method403(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field5784;
    }

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "(IIIIIII)I")
    public final int method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5763;
        float var8 = (float) arg2 * this.field5943.field8962 + (float) arg0 * this.field5943.field8959 + (float) arg1 * this.field5943.field8940 + this.field5943.field8955;
        float var9 = (float) arg5 * this.field5943.field8962 + (float) arg3 * this.field5943.field8959 + (float) arg4 * this.field5943.field8940 + this.field5943.field8955;
        int var10 = 0;
        if (var8 < (float) this.field6039 && (float) this.field6039 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field5962 && (float) this.field5962 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field5943.field8961 + (float) arg0 * this.field5943.field8954 + (float) arg1 * this.field5943.field8951 + this.field5943.field8939) * (float) this.field5984 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field5943.field8961 + (float) arg3 * this.field5943.field8954 + (float) arg4 * this.field5943.field8951 + this.field5943.field8939) * (float) this.field5984 / (float) arg6);
        if ((float) var11 < this.field6043 && (float) var12 < this.field6043) {
            var10 |= 1;
        } else if (this.field5982 < (float) var11 && this.field5982 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field5943.field8942 + (float) arg0 * this.field5943.field8958 + (float) arg1 * this.field5943.field8968 + this.field5943.field8944) * (float) this.field5997 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field5943.field8942 + (float) arg3 * this.field5943.field8958 + (float) arg4 * this.field5943.field8968 + this.field5943.field8944) * (float) this.field5997 / (float) arg6);
        if ((float) var13 < this.field5994 && (float) var14 < this.field5994) {
            var10 |= 4;
        } else if ((float) var13 > this.field5998 && (float) var14 > this.field5998) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(Z)V")
    private final void method2613(boolean arg0) {
        ++field5858;
        this.field5999 = new class292[this.field5963];
        this.field6008 = new class720(this, 3553, 6408, 1, 1);
        new class720(this, 3553, 6408, 1, 1);
        new class720(this, 3553, 6408, 1, 1);
        this.field5977 = new class610(this);
        if (!arg0) {
            this.field6015 = new class610(this);
            this.field6004 = new class610(this);
            this.field6035 = new class610(this);
            this.field5954 = new class610(this);
            this.field6036 = new class610(this);
            this.field6001 = new class610(this);
            this.field6016 = new class610(this);
            this.field5979 = new class610(this);
            this.field5955 = new class610(this);
            if (this.field6033) {
                this.field6054 = new class106(this);
                new class106(this);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Z)V")
    public final void method407(boolean arg0) {
        ++field5789;
    }

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "(ILaa;II)V")
    public final void method389(int arg0, class485 arg1, int arg2, int arg3) {
        ++field5885;
        class291 var5 = (class291) arg1;
        class238 var6 = var5.field3585;
        this.method2620(false);
        this.method2621(-2, var5.field3585);
        this.method2606(1, -24754);
        this.method2558(7681, 0, 8448);
        this.method2626(8960, 768, 0, 34167);
        float var7 = var6.field2830 / (float) var6.field2834;
        float var8 = var6.field2835 / (float) var6.field2836;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5991) * var7, (float) (this.field5981 - arg3) * var8);
        OpenGL.glVertex2i(this.field5991, this.field5981);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5991) * var7, (float) (-arg3 + this.field5986) * var8);
        OpenGL.glVertex2i(this.field5991, this.field5986);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5975) * var7, (float) (-arg3 + this.field5986) * var8);
        OpenGL.glVertex2i(this.field5975, this.field5986);
        OpenGL.glTexCoord2f((float) (this.field5975 - arg2) * var7, (float) (this.field5981 - arg3) * var8);
        OpenGL.glVertex2i(this.field5975, this.field5981);
        OpenGL.glEnd();
        this.method2626(8960, 768, 0, 5890);
    }

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "(B)V")
    private final void method2614(byte arg0) {
        ++field5821;
        int var2;
        for (var2 = 0; ~this.field6021 < ~var2; ++var2) {
            class163 var3 = this.field6000[var2];
            class411.field5618[0] = (float) var3.method1012((byte) 127);
            int var4 = var2 + 16386;
            class411.field5618[1] = (float) var3.method1006(31079);
            class411.field5618[2] = (float) var3.method1013(9179409);
            class411.field5618[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class411.field5618, 0);
            int var5 = var3.method1010(-5636);
            float var6 = var3.method1011(24617) / 255.0F;
            class411.field5618[2] = (float) class327.method1956(255, var5) * var6;
            class411.field5618[1] = var6 * (float) (class327.method1956(var5, 65356) >> 8);
            class411.field5618[0] = (float) class327.method1956(var5 >> 16, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class411.field5618, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1007(86) * var3.method1007(40)));
            OpenGL.glEnable(var4);
        }
        if (arg0 <= -61) {
            while (~var2 > ~this.field6017) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field6017 = this.field6021;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lgk;Z)V")
    public final void method2615(class473 arg0, boolean arg1) {
        ++field5702;
        if (arg1) {
            if (!this.field5976) {
                if (this.field5928 >= 3) {
                    throw new RuntimeException();
                } else {
                    if (this.field5928 >= 0) {
                        this.field5925[this.field5928].method726(-65);
                    }
                    this.field5926 = this.field5927 = this.field5925[++this.field5928] = arg0;
                    this.field5926.method723(25631);
                }
            } else {
                this.method2618(arg0, -14227);
                this.method2612(10272, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "(I)V")
    private final void method2616(int arg0) {
        ++field5850;
        this.field5990[14] = this.field5980;
        this.field5990[10] = this.field6031;
        this.field6052 = (float) this.field5962;
        this.field5973 = (this.field5990[arg0] - (float) this.field5962) / this.field5990[10];
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(BLgk;)V")
    public final void method2617(byte arg0, class473 arg1) {
        ++field5717;
        if (arg0 >= -2) {
            this.field6001 = null;
        }
        if (!this.field5976) {
            if (this.field5928 >= 0 && this.field5925[this.field5928] == arg1) {
                this.field5925[this.field5928--] = null;
                arg1.method726(-91);
                if (this.field5928 >= 0) {
                    this.field5926 = this.field5927 = this.field5925[this.field5928];
                    this.field5926.method723(25631);
                } else {
                    this.field5926 = this.field5927 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method2562((byte) -85, arg1);
            this.method2600(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "()V")
    public final void method362() {
        ++field5773;
        if (this.field6026 && ~this.field5899 < -1 && ~this.field5837 < -1) {
            int var1 = this.field5991;
            int var2 = this.field5975;
            int var3 = this.field5981;
            int var4 = this.field5986;
            this.method393();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2611(30814);
            this.method2597((byte) 56, false);
            this.method2625((byte) 122, false);
            this.method2551((byte) -70, false);
            this.method2556(false, -100);
            this.method2621(-2, (class292) null);
            this.method2624(-2, 2);
            this.method2573(1, false);
            this.method2606(0, -24754);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5899, this.field5837, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method432(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Lgk;I)V")
    public final void method2618(class473 arg0, int arg1) {
        if (arg1 == -14227) {
            ++field5840;
            if (this.field5929 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field5929 >= 0) {
                    this.field5923[this.field5929].method731(115);
                }
                this.field5926 = this.field5923[++this.field5929] = arg0;
                this.field5926.method729(98);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method417(Canvas arg0) {
        this.field5748 = null;
        ++field5815;
        this.field5733 = 0L;
        if (arg0 != null && this.field5886 != arg0) {
            if (this.field5903.containsKey(arg0)) {
                Long var2 = (Long) this.field5903.get(arg0);
                this.field5733 = var2;
                this.field5748 = arg0;
            }
        } else {
            this.field5733 = this.field5745;
            this.field5748 = this.field5886;
        }
        if (this.field5748 != null && this.field5733 != 0L) {
            this.field5794.setSurface(this.field5733);
            this.method2559((byte) 78);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(II)V")
    public final void method381(int arg0, int arg1) {
        ++field5766;
        if (this.field6039 != arg0 || ~this.field5962 != ~arg1) {
            this.field6039 = arg0;
            this.field5962 = arg1;
            this.method2564(13);
            this.method2627((byte) 127);
            if (~this.field6024 == -4) {
                this.method2591((byte) -117);
                return;
            }
            if (~this.field6024 != -3) {
                return;
            }
            this.method2590(16384);
        }
    }

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "(I)V")
    private final void method2619(int arg0) {
        class342.field4437[1] = this.field6058 * this.field6050;
        ++field5703;
        class342.field4437[2] = this.field6058 * this.field5974;
        class342.field4437[0] = this.field6058 * this.field5969;
        class342.field4437[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class342.field4437, 0);
        if (arg0 >= -35) {
            this.method2595(-57, 57L);
        }
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(Z)V")
    public final void method2620(boolean arg0) {
        if (arg0) {
            this.method340(83, -122, -86, -83, -121);
        }
        ++field5847;
        if (~this.field5947 != -3) {
            this.method2629((byte) 126);
            this.method2597((byte) 56, false);
            this.method2625((byte) 83, false);
            this.method2551((byte) -119, false);
            this.method2556(false, -94);
            this.method2624(-2, 2);
            this.field5947 = 2;
        }
    }

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "()I")
    public final int method318() {
        ++field5768;
        int var1 = this.field6065;
        this.field6065 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "()Z")
    public final boolean method411() {
        ++field5744;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILtha;)V")
    public final void method2621(int arg0, class292 arg1) {
        ++field5806;
        class292 var3 = this.field5999[this.field5988];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field3591);
            } else {
                if (var3 != null) {
                    if (~arg1.field3591 != ~var3.field3591) {
                        OpenGL.glDisable(var3.field3591);
                        OpenGL.glEnable(arg1.field3591);
                    }
                } else {
                    OpenGL.glEnable(arg1.field3591);
                }
                OpenGL.glBindTexture(arg1.field3591, arg1.method1734((byte) -34));
            }
            this.field5999[this.field5988] = arg1;
        }
        this.field5947 &= arg0;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZ)Lhu;")
    public final class131 method332(int arg0, int arg1, boolean arg2) {
        ++field5726;
        return new class286(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "(I)V")
    private final void method2622(int arg0) {
        OpenGL.glViewport(this.field6018, this.field6023, this.field5899, this.field5837);
        if (arg0 < 102) {
            this.method381(66, 66);
        }
        ++field5722;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V")
    public final void method365(int arg0) {
        ++field5834;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field5908 = arg0;
            this.field5911.method1838(2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "(II)V")
    public final synchronized void method2623(int arg0, int arg1) {
        ++field5822;
        class134 var3 = new class134();
        var3.field1522 = (long) arg0;
        this.field5939.method1721((byte) 127, var3);
        if (arg1 >= -83) {
            this.field5917 = -12;
        }
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "(II)V")
    public final void method2624(int arg0, int arg1) {
        this.method2565((byte) 94, true, arg0);
        ++field5728;
        if (arg1 != 2) {
            this.method355(-51, -114, 66, -96);
        }
    }

    @OriginalMember(owner = "client!nv", name = "DA", descriptor = "(IIII)V")
    public final void method400(int arg0, int arg1, int arg2, int arg3) {
        ++field5827;
        this.field6044 = arg1;
        this.field5997 = arg3;
        this.field6002 = arg0;
        this.field5984 = arg2;
        this.method2564(13);
        this.method2546(false);
        if (this.field6024 != 3) {
            if (this.field6024 == 2) {
                this.method2590(16384);
                return;
            }
        } else {
            this.method2591((byte) 77);
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(BZ)V")
    public final void method2625(byte arg0, boolean arg1) {
        if (arg0 > 68) {
            ++field5736;
            if (this.field5985 != arg1) {
                this.field5985 = arg1;
                this.method2609(61);
                this.field5947 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)V")
    public final void method392(int arg0) {
        ++field5746;
        this.method2571(34165);
    }

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "()Z")
    public final boolean method353() {
        ++field5862;
        return this.field5904 != null && (~this.field5907 >= -2 || this.field6055);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(IIII)V")
    public final void method2626(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(arg0, 34176 - -arg2, arg3);
        ++field5900;
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8) {
        ++field5851;
        class291 var10 = (class291) arg6;
        class238 var11 = var10.field3585;
        this.method2620(false);
        this.method2621(-2, var10.field3585);
        this.method2606(arg5, -24754);
        this.method2558(7681, 0, 8448);
        this.method2626(8960, 768, 0, 34167);
        float var12 = var11.field2830 / (float) var11.field2834;
        float var13 = var11.field2835 / (float) var11.field2836;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method2626(8960, 768, 0, 5890);
    }

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "(B)V")
    private final void method2627(byte arg0) {
        this.field5989 = (float) (-this.field6060 + this.field5962) - this.field6020;
        ++field5848;
        this.field6009 = -((float) this.field6012 * this.field6022) + this.field5989;
        if ((float) this.field6039 > this.field6009) {
            this.field6009 = (float) this.field6039;
        }
        OpenGL.glFogf(2915, this.field6009);
        OpenGL.glFogf(2916, this.field5989);
        if (arg0 < 119) {
            this.field5954 = null;
        }
        class342.field4437[2] = (float) class327.method1956(255, this.field6014) / 255.0F;
        class342.field4437[0] = (float) class327.method1956(16711680, this.field6014) / 1.671168E7F;
        class342.field4437[1] = (float) class327.method1956(this.field6014, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class342.field4437, 0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLeb;)V")
    public final void method2628(byte arg0, class624 arg1) {
        if (arg0 == -107) {
            OpenGL.glPushMatrix();
            ++field5830;
            OpenGL.glMultMatrixf(arg1.method3579(arg0 ^ -82), 0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "(B)V")
    private final void method2629(byte arg0) {
        ++field5805;
        if (arg0 < 112) {
            this.method431();
        }
        if (~this.field6024 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field5899 < -1 && ~this.field5837 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field5899, (double) this.field5837, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5947 &= -25;
            this.field6024 = 1;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(IIII)V")
    public final void method2630(int arg0, int arg1, int arg2, int arg3) {
        ++field5887;
        if (arg0 != 34166) {
            this.field6029 = -0.3136906F;
        }
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "da", descriptor = "(III[I)V")
    public final void method436(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5824;
        float var5 = (float) arg2 * this.field5943.field8962 + (float) arg0 * this.field5943.field8959 + (float) arg1 * this.field5943.field8940 + this.field5943.field8955;
        if (!(var5 < (float) this.field6039) && !(var5 > (float) this.field5962)) {
            int var6 = (int) (((float) arg2 * this.field5943.field8961 + (float) arg0 * this.field5943.field8954 + (float) arg1 * this.field5943.field8951 + this.field5943.field8939) * (float) this.field5984 / var5);
            int var7 = (int) (((float) arg2 * this.field5943.field8942 + (float) arg0 * this.field5943.field8958 + (float) arg1 * this.field5943.field8968 + this.field5943.field8944) * (float) this.field5997 / var5);
            if ((float) var6 >= this.field6043 && (float) var6 <= this.field5982 && (float) var7 >= this.field5994 && (float) var7 <= this.field5998) {
                arg3[1] = (int) ((float) var7 + -this.field5994);
                arg3[0] = (int) ((float) var6 - this.field6043);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "([I)V")
    public final void method354(int[] arg0) {
        arg0[2] = this.field5975;
        arg0[3] = this.field5986;
        arg0[1] = this.field5981;
        ++field5750;
        arg0[0] = this.field5991;
    }
}
