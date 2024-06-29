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

@OriginalClass("client!ap")
public class class435 extends class635 {

    @OriginalMember(owner = "client!ap", name = "tc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5829 = new Hashtable();

    @OriginalMember(owner = "client!ap", name = "de", descriptor = "I")
    public int field5917 = 128;

    @OriginalMember(owner = "client!ap", name = "he", descriptor = "Lkd;")
    private class255 field5921 = new class255();

    @OriginalMember(owner = "client!ap", name = "ie", descriptor = "Lpb;")
    private class598 field5922 = new class598();

    @OriginalMember(owner = "client!ap", name = "je", descriptor = "Lpb;")
    public class598 field5923 = new class598();

    @OriginalMember(owner = "client!ap", name = "ne", descriptor = "I")
    public int field5927 = 3;

    @OriginalMember(owner = "client!ap", name = "qe", descriptor = "Z")
    private boolean field5930 = false;

    @OriginalMember(owner = "client!ap", name = "ke", descriptor = "I")
    public int field5924 = 8;

    @OriginalMember(owner = "client!ap", name = "oe", descriptor = "Lmfa;")
    private class562 field5928 = new class562();

    @OriginalMember(owner = "client!ap", name = "te", descriptor = "I")
    private int field5933 = -1;

    @OriginalMember(owner = "client!ap", name = "we", descriptor = "I")
    private int field5936 = -1;

    @OriginalMember(owner = "client!ap", name = "xe", descriptor = "[Ljt;")
    private class91[] field5937 = new class91[4];

    @OriginalMember(owner = "client!ap", name = "ve", descriptor = "I")
    private int field5935 = -1;

    @OriginalMember(owner = "client!ap", name = "ue", descriptor = "[Ljt;")
    private class91[] field5934 = new class91[4];

    @OriginalMember(owner = "client!ap", name = "ye", descriptor = "[Ljt;")
    private class91[] field5938 = new class91[4];

    @OriginalMember(owner = "client!ap", name = "Ae", descriptor = "Lmfa;")
    private class562 field5940;

    @OriginalMember(owner = "client!ap", name = "De", descriptor = "Lmfa;")
    private class562 field5943;

    @OriginalMember(owner = "client!ap", name = "Ee", descriptor = "Lmfa;")
    private class562 field5944;

    @OriginalMember(owner = "client!ap", name = "Fe", descriptor = "Lmfa;")
    private class562 field5945;

    @OriginalMember(owner = "client!ap", name = "Ge", descriptor = "Lmfa;")
    private class562 field5946;

    @OriginalMember(owner = "client!ap", name = "He", descriptor = "Lmfa;")
    private class562 field5947;

    @OriginalMember(owner = "client!ap", name = "Ie", descriptor = "Lmfa;")
    private class562 field5948;

    @OriginalMember(owner = "client!ap", name = "Ye", descriptor = "F")
    public float field5964;

    @OriginalMember(owner = "client!ap", name = "pf", descriptor = "I")
    private int field5980;

    @OriginalMember(owner = "client!ap", name = "jf", descriptor = "I")
    private int field5974;

    @OriginalMember(owner = "client!ap", name = "Ve", descriptor = "[F")
    private float[] field5961;

    @OriginalMember(owner = "client!ap", name = "Af", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!ap", name = "Df", descriptor = "I")
    public int field5994;

    @OriginalMember(owner = "client!ap", name = "If", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!ap", name = "yf", descriptor = "F")
    public float field5989;

    @OriginalMember(owner = "client!ap", name = "Zf", descriptor = "I")
    private int field6016;

    @OriginalMember(owner = "client!ap", name = "sf", descriptor = "F")
    public float field5983;

    @OriginalMember(owner = "client!ap", name = "of", descriptor = "[F")
    private float[] field5979;

    @OriginalMember(owner = "client!ap", name = "Cf", descriptor = "[Lod;")
    private class463[] field5993;

    @OriginalMember(owner = "client!ap", name = "uf", descriptor = "I")
    private int field5985;

    @OriginalMember(owner = "client!ap", name = "og", descriptor = "F")
    public float field6031;

    @OriginalMember(owner = "client!ap", name = "cg", descriptor = "I")
    public int field6019;

    @OriginalMember(owner = "client!ap", name = "kf", descriptor = "Z")
    private boolean field5975;

    @OriginalMember(owner = "client!ap", name = "rg", descriptor = "I")
    private int field6034;

    @OriginalMember(owner = "client!ap", name = "Rf", descriptor = "F")
    private float field6008;

    @OriginalMember(owner = "client!ap", name = "Mf", descriptor = "F")
    private float field6003;

    @OriginalMember(owner = "client!ap", name = "Gg", descriptor = "[F")
    private float[] field6049;

    @OriginalMember(owner = "client!ap", name = "Wf", descriptor = "I")
    public int field6013;

    @OriginalMember(owner = "client!ap", name = "wg", descriptor = "I")
    public int field6039;

    @OriginalMember(owner = "client!ap", name = "Fg", descriptor = "F")
    private float field6048;

    @OriginalMember(owner = "client!ap", name = "dg", descriptor = "[F")
    public float[] field6020;

    @OriginalMember(owner = "client!ap", name = "Of", descriptor = "F")
    public float field6005;

    @OriginalMember(owner = "client!ap", name = "Sf", descriptor = "I")
    public int field6009;

    @OriginalMember(owner = "client!ap", name = "zg", descriptor = "I")
    public int field6042;

    @OriginalMember(owner = "client!ap", name = "Ig", descriptor = "F")
    private float field6051;

    @OriginalMember(owner = "client!ap", name = "Ne", descriptor = "I")
    private int field5953;

    @OriginalMember(owner = "client!ap", name = "Ag", descriptor = "I")
    public int field6043;

    @OriginalMember(owner = "client!ap", name = "Tf", descriptor = "F")
    private float field6010;

    @OriginalMember(owner = "client!ap", name = "Eg", descriptor = "[F")
    private float[] field6047;

    @OriginalMember(owner = "client!ap", name = "Og", descriptor = "I")
    private int field6057;

    @OriginalMember(owner = "client!ap", name = "vg", descriptor = "I")
    private int field6038;

    @OriginalMember(owner = "client!ap", name = "Rg", descriptor = "I")
    private int field6060;

    @OriginalMember(owner = "client!ap", name = "Nf", descriptor = "F")
    public float field6004;

    @OriginalMember(owner = "client!ap", name = "Qg", descriptor = "I")
    private int field6059;

    @OriginalMember(owner = "client!ap", name = "Tg", descriptor = "I")
    public int field6062;

    @OriginalMember(owner = "client!ap", name = "mg", descriptor = "I")
    public int field6029;

    @OriginalMember(owner = "client!ap", name = "Ng", descriptor = "F")
    private float field6056;

    @OriginalMember(owner = "client!ap", name = "Xg", descriptor = "F")
    public float field6066;

    @OriginalMember(owner = "client!ap", name = "qg", descriptor = "Ljh;")
    public class146 field6033;

    @OriginalMember(owner = "client!ap", name = "bh", descriptor = "[I")
    public int[] field6070;

    @OriginalMember(owner = "client!ap", name = "ah", descriptor = "[I")
    public int[] field6069;

    @OriginalMember(owner = "client!ap", name = "eh", descriptor = "[B")
    public byte[] field6073;

    @OriginalMember(owner = "client!ap", name = "fh", descriptor = "[I")
    public int[] field6074;

    @OriginalMember(owner = "client!ap", name = "id", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5870;

    @OriginalMember(owner = "client!ap", name = "lb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5769;

    @OriginalMember(owner = "client!ap", name = "Yd", descriptor = "I")
    public int field5912;

    @OriginalMember(owner = "client!ap", name = "Tb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5803;

    @OriginalMember(owner = "client!ap", name = "vc", descriptor = "J")
    private long field5831;

    @OriginalMember(owner = "client!ap", name = "Yb", descriptor = "J")
    private long field5808;

    @OriginalMember(owner = "client!ap", name = "ng", descriptor = "Z")
    public boolean field6030;

    @OriginalMember(owner = "client!ap", name = "tg", descriptor = "I")
    public int field6036;

    @OriginalMember(owner = "client!ap", name = "yg", descriptor = "Ljava/lang/String;")
    private String field6041;

    @OriginalMember(owner = "client!ap", name = "ig", descriptor = "Z")
    private boolean field6025;

    @OriginalMember(owner = "client!ap", name = "Yg", descriptor = "Z")
    public boolean field6067;

    @OriginalMember(owner = "client!ap", name = "wf", descriptor = "Z")
    public boolean field5987;

    @OriginalMember(owner = "client!ap", name = "Vf", descriptor = "Z")
    public boolean field6012;

    @OriginalMember(owner = "client!ap", name = "Se", descriptor = "Z")
    private boolean field5958;

    @OriginalMember(owner = "client!ap", name = "ff", descriptor = "Z")
    public boolean field5971;

    @OriginalMember(owner = "client!ap", name = "Pf", descriptor = "Ljava/lang/String;")
    private String field6006;

    @OriginalMember(owner = "client!ap", name = "Ug", descriptor = "Z")
    public boolean field6063;

    @OriginalMember(owner = "client!ap", name = "Le", descriptor = "Z")
    private boolean field5951;

    @OriginalMember(owner = "client!ap", name = "be", descriptor = "Lui;")
    private class209 field5915;

    @OriginalMember(owner = "client!ap", name = "pe", descriptor = "Lef;")
    public class445 field5929;

    @OriginalMember(owner = "client!ap", name = "ae", descriptor = "Llca;")
    private class588 field5914;

    @OriginalMember(owner = "client!ap", name = "ee", descriptor = "Lvn;")
    private class281 field5918;

    @OriginalMember(owner = "client!ap", name = "fe", descriptor = "Lhn;")
    private class658 field5919;

    @OriginalMember(owner = "client!ap", name = "Nb", descriptor = "Z")
    public static boolean field5797 = false;

    @OriginalMember(owner = "client!ap", name = "Sc", descriptor = "Lqo;")
    public static class21 field5854 = new class21();

    @OriginalMember(owner = "client!ap", name = "zd", descriptor = "I")
    public static int field5887 = 0;

    @OriginalMember(owner = "client!ap", name = "Ue", descriptor = "F")
    public float field5960;

    @OriginalMember(owner = "client!ap", name = "af", descriptor = "F")
    private float field5966;

    @OriginalMember(owner = "client!ap", name = "mf", descriptor = "F")
    public float field5977;

    @OriginalMember(owner = "client!ap", name = "Gf", descriptor = "F")
    public float field5997;

    @OriginalMember(owner = "client!ap", name = "Jf", descriptor = "F")
    public float field6000;

    @OriginalMember(owner = "client!ap", name = "Lf", descriptor = "F")
    public float field6002;

    @OriginalMember(owner = "client!ap", name = "jg", descriptor = "F")
    private float field6026;

    @OriginalMember(owner = "client!ap", name = "lg", descriptor = "F")
    private float field6028;

    @OriginalMember(owner = "client!ap", name = "Jg", descriptor = "F")
    private float field6052;

    @OriginalMember(owner = "client!ap", name = "Mg", descriptor = "F")
    public float field6055;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!ap", name = "I", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!ap", name = "L", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ap", name = "O", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!ap", name = "P", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!ap", name = "Q", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ap", name = "R", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!ap", name = "S", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!ap", name = "T", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!ap", name = "U", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!ap", name = "V", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!ap", name = "W", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!ap", name = "X", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!ap", name = "Y", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!ap", name = "Z", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!ap", name = "ab", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!ap", name = "bb", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!ap", name = "cb", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ap", name = "db", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!ap", name = "eb", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!ap", name = "fb", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!ap", name = "gb", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!ap", name = "hb", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ap", name = "ib", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!ap", name = "jb", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ap", name = "kb", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!ap", name = "mb", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ap", name = "nb", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ap", name = "ob", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!ap", name = "pb", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ap", name = "qb", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ap", name = "rb", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ap", name = "sb", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ap", name = "tb", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ap", name = "ub", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ap", name = "vb", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ap", name = "wb", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ap", name = "xb", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!ap", name = "yb", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ap", name = "zb", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ap", name = "Ab", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ap", name = "Bb", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ap", name = "Cb", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!ap", name = "Db", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!ap", name = "Eb", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!ap", name = "Fb", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!ap", name = "Gb", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ap", name = "Hb", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!ap", name = "Ib", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!ap", name = "Jb", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!ap", name = "Kb", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!ap", name = "Lb", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!ap", name = "Mb", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!ap", name = "Ob", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!ap", name = "Pb", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!ap", name = "Qb", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!ap", name = "Rb", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!ap", name = "Sb", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!ap", name = "Ub", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!ap", name = "Vb", descriptor = "I")
    public int field5805;

    @OriginalMember(owner = "client!ap", name = "Wb", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!ap", name = "Xb", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!ap", name = "Zb", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!ap", name = "ac", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!ap", name = "bc", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!ap", name = "cc", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ap", name = "dc", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!ap", name = "ec", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ap", name = "fc", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!ap", name = "gc", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ap", name = "hc", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!ap", name = "ic", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!ap", name = "jc", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ap", name = "kc", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!ap", name = "lc", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ap", name = "mc", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!ap", name = "nc", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!ap", name = "oc", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!ap", name = "pc", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!ap", name = "qc", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!ap", name = "rc", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!ap", name = "sc", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!ap", name = "uc", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!ap", name = "wc", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!ap", name = "xc", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!ap", name = "yc", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!ap", name = "zc", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ap", name = "Ac", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!ap", name = "Bc", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ap", name = "Cc", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!ap", name = "Dc", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!ap", name = "Ec", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!ap", name = "Fc", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!ap", name = "Gc", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ap", name = "Hc", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ap", name = "Ic", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ap", name = "Jc", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!ap", name = "Kc", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ap", name = "Lc", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ap", name = "Mc", descriptor = "I")
    private int field5848;

    @OriginalMember(owner = "client!ap", name = "Nc", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ap", name = "Oc", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!ap", name = "Pc", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ap", name = "Qc", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!ap", name = "Rc", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!ap", name = "Tc", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ap", name = "Uc", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ap", name = "Vc", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ap", name = "Wc", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!ap", name = "Xc", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!ap", name = "Yc", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ap", name = "Zc", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!ap", name = "ad", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!ap", name = "bd", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!ap", name = "cd", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!ap", name = "dd", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!ap", name = "ed", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ap", name = "fd", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!ap", name = "gd", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!ap", name = "hd", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ap", name = "jd", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ap", name = "kd", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!ap", name = "ld", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!ap", name = "md", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!ap", name = "nd", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!ap", name = "od", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!ap", name = "pd", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!ap", name = "qd", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!ap", name = "rd", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!ap", name = "sd", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!ap", name = "td", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!ap", name = "ud", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!ap", name = "vd", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!ap", name = "wd", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!ap", name = "xd", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!ap", name = "yd", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!ap", name = "Ad", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!ap", name = "Bd", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!ap", name = "Cd", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!ap", name = "Dd", descriptor = "I")
    private int field5891;

    @OriginalMember(owner = "client!ap", name = "Ed", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!ap", name = "Fd", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!ap", name = "Gd", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!ap", name = "Hd", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!ap", name = "Id", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!ap", name = "Jd", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!ap", name = "Kd", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ap", name = "Ld", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!ap", name = "Md", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!ap", name = "Nd", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!ap", name = "Od", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ap", name = "Pd", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!ap", name = "Qd", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!ap", name = "Rd", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ap", name = "Sd", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!ap", name = "Td", descriptor = "I")
    public int field5907;

    @OriginalMember(owner = "client!ap", name = "Ud", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!ap", name = "Vd", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!ap", name = "Wd", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!ap", name = "Xd", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!ap", name = "Zd", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ap", name = "ce", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!ap", name = "ge", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!ap", name = "me", descriptor = "I")
    public int field5926;

    @OriginalMember(owner = "client!ap", name = "ze", descriptor = "I")
    public int field5939;

    @OriginalMember(owner = "client!ap", name = "Be", descriptor = "I")
    private int field5941;

    @OriginalMember(owner = "client!ap", name = "Ce", descriptor = "I")
    public int field5942;

    @OriginalMember(owner = "client!ap", name = "bf", descriptor = "I")
    private int field5967;

    @OriginalMember(owner = "client!ap", name = "df", descriptor = "I")
    private int field5969;

    @OriginalMember(owner = "client!ap", name = "gf", descriptor = "I")
    private int field5972;

    @OriginalMember(owner = "client!ap", name = "nf", descriptor = "I")
    private int field5978;

    @OriginalMember(owner = "client!ap", name = "vf", descriptor = "I")
    public int field5986;

    @OriginalMember(owner = "client!ap", name = "xf", descriptor = "I")
    private int field5988;

    @OriginalMember(owner = "client!ap", name = "Qf", descriptor = "I")
    private int field6007;

    @OriginalMember(owner = "client!ap", name = "fg", descriptor = "I")
    private int field6022;

    @OriginalMember(owner = "client!ap", name = "kg", descriptor = "I")
    private int field6027;

    @OriginalMember(owner = "client!ap", name = "xg", descriptor = "I")
    public int field6040;

    @OriginalMember(owner = "client!ap", name = "Cg", descriptor = "I")
    public int field6045;

    @OriginalMember(owner = "client!ap", name = "Hg", descriptor = "I")
    private int field6050;

    @OriginalMember(owner = "client!ap", name = "Pg", descriptor = "I")
    public int field6058;

    @OriginalMember(owner = "client!ap", name = "Vg", descriptor = "I")
    private int field6064;

    @OriginalMember(owner = "client!ap", name = "Zg", descriptor = "I")
    private int field6068;

    @OriginalMember(owner = "client!ap", name = "ch", descriptor = "I")
    private int field6071;

    @OriginalMember(owner = "client!ap", name = "dh", descriptor = "I")
    private int field6072;

    @OriginalMember(owner = "client!ap", name = "Kf", descriptor = "J")
    private long field6001;

    @OriginalMember(owner = "client!ap", name = "Kg", descriptor = "Lei;")
    public class162 field6053;

    @OriginalMember(owner = "client!ap", name = "Ke", descriptor = "Lrh;")
    public class241 field5950;

    @OriginalMember(owner = "client!ap", name = "Qe", descriptor = "Lrh;")
    public class241 field5956;

    @OriginalMember(owner = "client!ap", name = "Te", descriptor = "Lrh;")
    public class241 field5959;

    @OriginalMember(owner = "client!ap", name = "hf", descriptor = "Lrh;")
    public class241 field5973;

    @OriginalMember(owner = "client!ap", name = "lf", descriptor = "Lrh;")
    public class241 field5976;

    @OriginalMember(owner = "client!ap", name = "zf", descriptor = "Lrh;")
    public class241 field5990;

    @OriginalMember(owner = "client!ap", name = "hg", descriptor = "Lrh;")
    public class241 field6024;

    @OriginalMember(owner = "client!ap", name = "sg", descriptor = "Lrh;")
    public class241 field6035;

    @OriginalMember(owner = "client!ap", name = "Lg", descriptor = "Lrh;")
    public class241 field6054;

    @OriginalMember(owner = "client!ap", name = "Wg", descriptor = "Lrh;")
    public class241 field6065;

    @OriginalMember(owner = "client!ap", name = "Re", descriptor = "Ljl;")
    public class245 field5957;

    @OriginalMember(owner = "client!ap", name = "Ff", descriptor = "Ljl;")
    public class245 field5996;

    @OriginalMember(owner = "client!ap", name = "Yf", descriptor = "Lhea;")
    private class385 field6015;

    @OriginalMember(owner = "client!ap", name = "Bg", descriptor = "Lkp;")
    public class446 field6044;

    @OriginalMember(owner = "client!ap", name = "Xe", descriptor = "Lpb;")
    public class598 field5963;

    @OriginalMember(owner = "client!ap", name = "Uf", descriptor = "Lpb;")
    public class598 field6011;

    @OriginalMember(owner = "client!ap", name = "ag", descriptor = "Lev;")
    private class633 field6017;

    @OriginalMember(owner = "client!ap", name = "ef", descriptor = "Lrl;")
    private class659 field5970;

    @OriginalMember(owner = "client!ap", name = "bg", descriptor = "Lrl;")
    private class659 field6018;

    @OriginalMember(owner = "client!ap", name = "qf", descriptor = "Lfm;")
    private class669 field5981;

    @OriginalMember(owner = "client!ap", name = "re", descriptor = "Ljt;")
    private class91 field5931;

    @OriginalMember(owner = "client!ap", name = "se", descriptor = "Ljt;")
    private class91 field5932;

    @OriginalMember(owner = "client!ap", name = "le", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5925;

    @OriginalMember(owner = "client!ap", name = "Je", descriptor = "Z")
    public boolean field5949;

    @OriginalMember(owner = "client!ap", name = "Oe", descriptor = "Z")
    private boolean field5954;

    @OriginalMember(owner = "client!ap", name = "Pe", descriptor = "Z")
    public boolean field5955;

    @OriginalMember(owner = "client!ap", name = "We", descriptor = "Z")
    private boolean field5962;

    @OriginalMember(owner = "client!ap", name = "Ze", descriptor = "Z")
    private boolean field5965;

    @OriginalMember(owner = "client!ap", name = "cf", descriptor = "Z")
    private boolean field5968;

    @OriginalMember(owner = "client!ap", name = "rf", descriptor = "Z")
    private boolean field5982;

    @OriginalMember(owner = "client!ap", name = "tf", descriptor = "Z")
    private boolean field5984;

    @OriginalMember(owner = "client!ap", name = "Bf", descriptor = "Z")
    public boolean field5992;

    @OriginalMember(owner = "client!ap", name = "Ef", descriptor = "Z")
    private boolean field5995;

    @OriginalMember(owner = "client!ap", name = "Hf", descriptor = "Z")
    private boolean field5998;

    @OriginalMember(owner = "client!ap", name = "Xf", descriptor = "Z")
    public boolean field6014;

    @OriginalMember(owner = "client!ap", name = "eg", descriptor = "Z")
    public boolean field6021;

    @OriginalMember(owner = "client!ap", name = "gg", descriptor = "Z")
    public boolean field6023;

    @OriginalMember(owner = "client!ap", name = "pg", descriptor = "Z")
    private boolean field6032;

    @OriginalMember(owner = "client!ap", name = "ug", descriptor = "Z")
    private boolean field6037;

    @OriginalMember(owner = "client!ap", name = "Dg", descriptor = "Z")
    public boolean field6046;

    @OriginalMember(owner = "client!ap", name = "Sg", descriptor = "Z")
    public boolean field6061;

    @OriginalMember(owner = "client!ap", name = "Me", descriptor = "[Luda;")
    private class412[] field5952;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V", line = 3)
    public final void method2321(int arg0, byte arg1) {
        this.method2348(true, -117, arg0);
        ++field5846;
        if (arg1 != 95) {
            this.field6059 = -117;
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)V", line = 20)
    public static final void method2322(int arg0, int arg1) {
        if (arg0 != -910) {
            method2335(true);
        }
        class455.field6330 = 1000000000L / (long) arg1;
        ++field5861;
    }

    @OriginalMember(owner = "client!ap", name = "AA", descriptor = "(IIII)V", line = 31)
    public final void method278(int arg0, int arg1, int arg2, int arg3) {
        this.field5985 = arg1;
        this.field6043 = arg2;
        this.field6019 = arg3;
        ++field5910;
        this.field6023 = true;
        this.field6045 = arg0;
        this.field5919.method3712(3, (byte) -114, false, 0, 0, false);
        this.field5919.field9393.method49(34336);
        this.method2367(34847);
        this.method2361(false);
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(II)I", line = 51)
    public final int method2323(int arg0, int arg1) {
        ++field5731;
        int var3 = -24 / ((arg0 - 8) / 41);
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg1 != 5123 && ~arg1 != -5123) {
                if (~arg1 != -5126 && arg1 != 5124 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "()Z", line = 72)
    public final boolean method315() {
        ++field5888;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "L", descriptor = "(ILfa;II)V", line = 82)
    public final void method328(int arg0, class213 arg1, int arg2, int arg3) {
        ++field5823;
        class690 var5 = (class690) arg1;
        class385 var6 = var5.field9740;
        this.method2391((byte) -103);
        this.method2388((byte) 81, var5.field9740);
        this.method2378(true, 1);
        this.method2371(7681, 8448, -96);
        this.method2372(0, false, 768, 34167);
        float var7 = var6.field5143 / (float) var6.field5148;
        float var8 = var6.field5147 / (float) var6.field5151;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5953) * var7, (float) (this.field6057 - arg3) * var8);
        OpenGL.glVertex2i(this.field5953, this.field6057);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5953) * var7, (float) (-arg3 + this.field5974) * var8);
        OpenGL.glVertex2i(this.field5953, this.field5974);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6034) * var7, (float) (-arg3 + this.field5974) * var8);
        OpenGL.glVertex2i(this.field6034, this.field5974);
        OpenGL.glTexCoord2f((float) (this.field6034 - arg2) * var7, (float) (this.field6057 - arg3) * var8);
        OpenGL.glVertex2i(this.field6034, this.field6057);
        OpenGL.glEnd();
        this.method2372(0, false, 768, 5890);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V", line = 116)
    private final void method2324(byte arg0) {
        ++field5818;
        if (arg0 <= -39) {
            if (this.field5969 != 1) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (~this.field5805 < -1 && ~this.field5907 < -1) {
                    OpenGL.glOrtho(0.0D, (double) this.field5805, (double) this.field5907, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field6064 &= -25;
                this.field5969 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V", line = 140)
    private final void method2325(int arg0) {
        OpenGL.glDepthMask(this.field5954 && this.field5975);
        if (arg0 != 14) {
            this.field6045 = -76;
        }
        ++field5847;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(JZ)V", line = 156)
    public final synchronized void method2326(long arg0, boolean arg1) {
        if (!arg1) {
            ++field5726;
            class270 var4 = new class270();
            var4.field3405 = arg0;
            this.field5948.method3164(var4, 256);
        }
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(II)V", line = 170)
    public final void method2327(int arg0, int arg1) {
        ++field5838;
        class201.field2459[2] = (float) class203.method1246(arg1, 255) / 255.0F;
        class201.field2459[0] = (float) class203.method1246(16711680, arg1) / 1.671168E7F;
        if (arg0 == -28003) {
            class201.field2459[3] = (float) (arg1 >>> 24) / 255.0F;
            class201.field2459[1] = (float) class203.method1246(arg1, 65280) / 65280.0F;
            OpenGL.glTexEnvfv(8960, 8705, class201.field2459, 0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIF)Lod;", line = 185)
    public final class463 method319(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5817;
        return new class451(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "(I)V", line = 197)
    private final void method2328(int arg0) {
        ++field5830;
        int var2;
        for (var2 = 0; this.field6022 > var2; ++var2) {
            class463 var3 = this.field5993[var2];
            int var4 = var2 + 16386;
            class507.field7292[0] = (float) var3.method2640(-2049);
            class507.field7292[1] = (float) var3.method2638((byte) -100);
            class507.field7292[2] = (float) var3.method2641((byte) -14);
            class507.field7292[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class507.field7292, 0);
            int var5 = var3.method2634(true);
            float var6 = var3.method2635(4) / 255.0F;
            class507.field7292[2] = var6 * (float) class203.method1246(var5, 255);
            class507.field7292[0] = var6 * (float) class203.method1246(255, var5 >> 16);
            class507.field7292[1] = var6 * (float) (class203.method1246(65377, var5) >> 8);
            OpenGL.glLightfv(var4, 4609, class507.field7292, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2637(arg0 + 13032) * var3.method2637(98)));
            OpenGL.glEnable(var4);
        }
        while (var2 < this.field6007) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field6007 = this.field6022;
        if (arg0 != -12910) {
            this.method2348(false, 13, -76);
        }
    }

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "(I)V", line = 246)
    private final void method2329(int arg0) {
        ++field5733;
        if (arg0 != 13091) {
            this.method2341((class91) null, (byte) 81);
        }
        OpenGL.glViewport(this.field6016, this.field6060, this.field5805, this.field5907);
    }

    @OriginalMember(owner = "client!ap", name = "YA", descriptor = "(IFFFFF)V", line = 257)
    public final void method320(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5881;
        boolean var7 = ~this.field6059 != ~arg0;
        if (var7 || this.field6066 != arg1 || this.field5964 != arg2) {
            this.field6059 = arg0;
            this.field5964 = arg2;
            this.field6066 = arg1;
            if (var7) {
                this.field6004 = (float) (this.field6059 & 65280) / 65280.0F;
                this.field5989 = (float) (255 & this.field6059) / 255.0F;
                this.field6031 = (float) (16711680 & this.field6059) / 1.671168E7F;
                this.method2370((byte) -56);
            }
            this.method2398((byte) -90);
        }
        if (this.field6047[0] != arg3 || this.field6047[1] != arg4 || this.field6047[2] != arg5) {
            this.field6047[0] = arg3;
            this.field6047[2] = arg5;
            this.field6047[1] = arg4;
            this.field5961[1] = -arg4;
            this.field5961[0] = -arg3;
            this.field5961[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6020[0] = arg3 * var8;
            this.field6020[2] = arg5 * var8;
            this.field6020[1] = arg4 * var8;
            this.field5979[0] = -this.field6020[0];
            this.field5979[2] = -this.field6020[2];
            this.field5979[1] = -this.field6020[1];
            this.method2399(-126);
            this.field6058 = (int) (arg3 * 256.0F / arg4);
            this.field6040 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "(I)V", line = 307)
    private final void method2330(int arg0) {
        this.method2321(-2, (byte) 95);
        ++field5754;
        for (int var2 = this.field5986 + -1; ~var2 <= -1; --var2) {
            this.method2380(var2, (byte) -124);
            this.method2388((byte) -35, (class412) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2371(8448, 8448, -67);
        this.method2372(2, false, 770, 34168);
        this.method2403(55);
        this.field6050 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field5988 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field5962 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5984 = true;
        this.method2377(true, false);
        this.method2400((byte) 123, true);
        this.method2386(true, -118);
        this.method2382(true, -32);
        this.method2375(-32);
        this.field5803.setSwapInterval(0);
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
        int var5 = 51 / ((59 - arg0) / 57);
        while (var4 < 8) {
            int var6 = var4 + 16384;
            OpenGL.glLightfv(var6, 4608, var3, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
            ++var4;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field6059 = this.field6013 = -1;
        this.method378();
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(Z)V", line = 378)
    public final void method346(boolean arg0) {
        ++field5736;
    }

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "()F", line = 387)
    public final float method2331() {
        ++field5755;
        return this.field6056;
    }

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "(I)V", line = 398)
    private final void method2332(int arg0) {
        this.field6002 = (float) (-this.field6062 + this.field6057);
        this.field5960 = (float) (-this.field5999 + this.field5953);
        if (arg0 == 4611) {
            this.field6000 = (float) (-this.field6062 + this.field5974);
            ++field5732;
            this.field5977 = (float) (this.field6034 - this.field5999);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V", line = 412)
    public final synchronized void method2333(int arg0, int arg1, int arg2) {
        ++field5774;
        if (arg0 != -11235) {
            this.method2337(-41);
        }
        class337 var4 = new class337(arg1);
        var4.field3405 = (long) arg2;
        this.field5943.method3164(var4, arg0 + 11491);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lpb;I)V", line = 426)
    public final void method2334(class598 arg0, int arg1) {
        OpenGL.glLoadMatrixf(arg0.method3342((byte) 121), 0);
        ++field5743;
        if (arg1 != -1) {
            this.method2372(31, false, -1, -10);
        }
    }

    @OriginalMember(owner = "client!ap", name = "ma", descriptor = "(IIIIII[BII)V", line = 438)
    public final void method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5809;
        float var10;
        float var11;
        if (this.field6015 != null && ~this.field6015.field6130 <= ~arg2 && ~arg3 >= ~this.field6015.field6125) {
            this.field6015.method2471(arg6, 110, 0, 0, 0, 0, arg3, false, arg2, 6406);
            var10 = (float) arg3 * this.field6015.field5147 / (float) this.field6015.field6125;
            var11 = (float) arg2 * this.field6015.field5143 / (float) this.field6015.field6130;
        } else {
            this.field6015 = class387.method2118(false, arg6, arg2, this, 6406, 6406, arg3, 34037);
            this.field6015.method2467(false, false, 27);
            var11 = this.field6015.field5143;
            var10 = this.field6015.field5147;
        }
        this.method2391((byte) -103);
        this.method2388((byte) -43, this.field6015);
        this.method2378(true, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2327(-28003, arg5);
        this.method2371(34165, 34165, -126);
        this.method2372(0, false, 768, 34166);
        this.method2372(2, false, 770, 5890);
        this.method2390(34166, true, 0, 770);
        this.method2390(5890, true, 2, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2372(0, false, 768, 5890);
        this.method2372(2, false, 770, 34166);
        this.method2390(5890, true, 0, 770);
        this.method2390(34166, true, 2, 770);
    }

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "()Z", line = 500)
    public final boolean method323() {
        ++field5745;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[Lod;)V", line = 510)
    public final void method355(int arg0, class463[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5993[var3] = arg1[var3];
        }
        ++field5721;
        this.field6022 = arg0;
        if (~this.field5969 != -2) {
            this.method2328(-12910);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIILfa;II)V", line = 536)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class213 arg6, int arg7, int arg8) {
        ++field5900;
        class690 var10 = (class690) arg6;
        class385 var11 = var10.field9740;
        this.method2391((byte) -103);
        this.method2388((byte) -19, var10.field9740);
        this.method2378(true, arg5);
        this.method2371(7681, 8448, -80);
        this.method2372(0, false, 768, 34167);
        float var12 = var11.field5143 / (float) var11.field5148;
        float var13 = var11.field5147 / (float) var11.field5151;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method2372(0, false, 768, 5890);
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(Z)V", line = 576)
    public static void method2335(boolean arg0) {
        field5854 = null;
        if (!arg0) {
            field5854 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(Z)V", line = 586)
    public final void method293(boolean arg0) {
        ++field5850;
    }

    @OriginalMember(owner = "client!ap", name = "ka", descriptor = "(FF)V", line = 593)
    public final void method366(float arg0, float arg1) {
        ++field5892;
        if (this.field6056 != arg0 || this.field6052 != arg1) {
            this.field6056 = arg0;
            this.field6052 = arg1;
            this.method2353(0);
            if (~this.field5969 == -4) {
                this.method2356(-895654192);
                return;
            }
            if (this.field5969 != 2) {
                return;
            }
            this.method2363(-7228);
        }
    }

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "(I)V", line = 616)
    private final void method2336(int arg0) {
        ++field5779;
        float[] var2 = this.field6049;
        float var3 = (float) (-this.field5999 * this.field5994) / (float) this.field6029;
        float var4 = (float) ((-this.field5999 + this.field5805) * this.field5994) / (float) this.field6029;
        float var5 = (float) (this.field6062 * this.field5994) / (float) this.field6039;
        float var6 = (float) ((-this.field5907 + this.field6062) * this.field5994) / (float) this.field6039;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5994 * 2.0F;
            var2[12] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[4] = 0.0F;
            var2[11] = -1.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[10] = this.field6028 = (float) (-(this.field6042 - -this.field5994)) / (float) (-this.field5994 + this.field6042);
            var2[15] = 0.0F;
            var2[14] = this.field6026 = -((float) this.field6042 * var7) / (float) (-this.field5994 + this.field6042);
            var2[0] = var7 / (-var3 + var4);
            var2[7] = 0.0F;
            var2[1] = 0.0F;
        } else {
            var2[15] = 1.0F;
            var2[2] = 0.0F;
            var2[3] = 0.0F;
            var2[13] = 0.0F;
            var2[8] = 0.0F;
            var2[10] = 1.0F;
            var2[5] = 1.0F;
            var2[12] = 0.0F;
            var2[1] = 0.0F;
            var2[11] = 0.0F;
            var2[9] = 0.0F;
            var2[0] = 1.0F;
            var2[14] = 0.0F;
            var2[4] = 0.0F;
            var2[6] = 0.0F;
            var2[7] = 0.0F;
        }
        if (arg0 > -86) {
            this.method369(-72);
        }
        this.method2353(0);
    }

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "(I)V", line = 678)
    private final void method2337(int arg0) {
        if (~this.field5969 != -4) {
            this.field5969 = 3;
            this.method2356(-895654192);
            this.method2385(89);
            this.field6064 &= -8;
        }
        if (arg0 == 16274) {
            ++field5791;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(FFFI)V", line = 698)
    private final void method2338(float arg0, float arg1, float arg2, int arg3) {
        OpenGL.glMatrixMode(5890);
        ++field5725;
        if (this.field6037) {
            OpenGL.glLoadIdentity();
        }
        if (arg3 <= 113) {
            this.field5999 = 93;
        }
        OpenGL.glTranslatef(arg0, arg2, arg1);
        OpenGL.glMatrixMode(5888);
        this.field6037 = true;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)V", line = 719)
    public final synchronized void method2339(int arg0, int arg1, int arg2) {
        ++field5904;
        if (arg2 <= 18) {
            this.method376();
        }
        class337 var4 = new class337(arg0);
        var4.field3405 = (long) arg1;
        this.field5944.method3164(var4, 256);
    }

    @OriginalMember(owner = "client!ap", name = "KA", descriptor = "(IIII)[I", line = 733)
    public final int[] method277(int arg0, int arg1, int arg2, int arg3) {
        ++field5913;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field5907, arg2, 1, 32993, this.field6036, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)I", line = 755)
    public final int method2340(int arg0, boolean arg1) {
        ++field5751;
        if (arg1) {
            this.method2361(false);
        }
        if (arg0 != 6406 && arg0 != 6409) {
            if (arg0 != 6410 && arg0 != 34846 && arg0 != 34844) {
                if (~arg0 != -6408) {
                    if (arg0 != 6408 && arg0 != 34847) {
                        if (~arg0 == -34844) {
                            return 6;
                        } else if (~arg0 != -34843) {
                            if (~arg0 == -6403) {
                                return 3;
                            } else if (~arg0 == -6402) {
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

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljt;B)V", line = 797)
    public final void method2341(class91 arg0, byte arg1) {
        ++field5833;
        if (arg1 != -91) {
            this.field5984 = true;
        }
        if (!this.field6014) {
            if (this.field5935 >= 0 && this.field5937[this.field5935] == arg0) {
                this.field5937[this.field5935--] = null;
                arg0.method580(-128);
                if (this.field5935 >= 0) {
                    this.field5931 = this.field5932 = this.field5937[this.field5935];
                    this.field5931.method577((byte) 6);
                } else {
                    this.field5931 = this.field5932 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method2374(125, arg0);
            this.method2342(arg1 + -19, arg0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIII)V", line = 832)
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5810;
        OpenGL.glLineWidth((float) arg5);
        this.method353(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjt;)V", line = 844)
    public final void method2342(int arg0, class91 arg1) {
        ++field5816;
        if (~this.field5933 <= -1 && this.field5938[this.field5933] == arg1) {
            this.field5938[this.field5933--] = null;
            if (arg0 <= -51) {
                arg1.method582(-5540);
                if (~this.field5933 > -1) {
                    this.field5932 = null;
                } else {
                    this.field5932 = this.field5938[this.field5933];
                    this.field5932.method581(77);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ap", name = "ha", descriptor = "(F)V", line = 869)
    public final void method368(float arg0) {
        if (this.field6055 != arg0) {
            this.field6055 = arg0;
            this.method2370((byte) -56);
        }
        ++field5775;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[I[I)Lfa;", line = 885)
    public final class213 method362(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5783;
        return class21.method86((byte) -1, arg1, arg0, arg2, arg3, this);
    }

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "(IIIIII)V", line = 893)
    public final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5868;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2346((byte) -18);
        float var10 = (float) arg3 + var8;
        this.method2378(true, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5982) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5982) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "()F", line = 927)
    public final float method2343() {
        ++field5898;
        return this.field6052;
    }

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "()Lq;", line = 937)
    public final class389 method371() {
        ++field5789;
        return new class598();
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(IIIIII)V", line = 946)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5735;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method2346((byte) -18);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2378(true, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5982) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5982) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "()Z", line = 981)
    public final boolean method380() {
        ++field5832;
        return this.field5919.method3714((byte) -85, 3);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)V", line = 989)
    public final void method2344(boolean arg0, int arg1) {
        if (arg1 == 9845) {
            if (arg0 == !this.field5995) {
                this.field5995 = arg0;
                this.method2392(arg1 + -6949);
            }
            ++field5873;
        }
    }

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "(I)I", line = 1006)
    private final int method2345(int arg0) {
        ++field5836;
        int var2 = 0;
        this.field6006 = OpenGL.glGetString(7936).toLowerCase();
        this.field6041 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field6006.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field6006.indexOf("brian paul") != 0 || ~this.field6006.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class107.method674(var3.replace('.', ' '), arg0 + 5124, ' ');
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class399.method2185(var4[0], (byte) -34);
                int var6 = class399.method2185(var4[1], (byte) -34);
                this.field5972 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field5972 > -13) {
            var2 |= 2;
        }
        if (!this.field5803.method3210("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5803.method3210("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5986 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5967 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5978 = var7[0];
        if (~this.field5986 > -3 || ~this.field5967 > -3 || ~this.field5978 > -3) {
            var2 |= 16;
        }
        this.field6030 = Stream.method3440();
        this.field5803.arePbuffersAvailable();
        if (arg0 != -5123) {
            this.field5803 = null;
        }
        this.field6025 = this.field5803.method3210("GL_ARB_vertex_buffer_object");
        this.field5982 = this.field5803.method3210("GL_ARB_multisample");
        this.field5949 = this.field5803.method3210("GL_ARB_vertex_program");
        this.field5803.method3210("GL_ARB_fragment_program");
        this.field6021 = this.field5803.method3210("GL_ARB_vertex_shader");
        this.field5955 = this.field5803.method3210("GL_ARB_fragment_shader");
        this.field6067 = this.field5803.method3210("GL_EXT_texture3D");
        this.field6012 = this.field5803.method3210("GL_ARB_texture_rectangle");
        this.field6046 = this.field5803.method3210("GL_ARB_texture_cube_map");
        this.field5987 = this.field5803.method3210("GL_ARB_texture_float");
        this.field6061 = false;
        this.field6063 = this.field5803.method3210("GL_EXT_framebuffer_object");
        this.field6014 = this.field5803.method3210("GL_EXT_framebuffer_blit");
        this.field5992 = this.field5803.method3210("GL_EXT_framebuffer_multisample");
        this.field5998 = this.field6014 & this.field5992;
        OpenGL.glGetFloatv(2834, class201.field2459, 0);
        this.field6003 = class201.field2459[0];
        this.field6048 = class201.field2459[1];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V", line = 1096)
    private final void method2346(byte arg0) {
        if (arg0 != -18) {
            this.field5985 = 100;
        }
        if (this.field6064 != 1) {
            this.method2324((byte) -43);
            this.method2377(false, false);
            this.method2400((byte) 105, false);
            this.method2386(false, -73);
            this.method2382(false, arg0 + -14);
            this.method2388((byte) 123, (class412) null);
            this.method2321(-2, (byte) 95);
            this.method2396(1, -1);
            this.field6064 = 1;
        }
        ++field5885;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljaclib/memory/Buffer;IZZI)Lrl;", line = 1123)
    public final class659 method2347(Buffer arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field5795;
        if (!this.field6025 || arg3 && !this.field5958) {
            return !arg2 ? null : new class140(this, arg1, arg0);
        } else {
            return new class508(this, arg1, arg0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZII)V", line = 1141)
    public final void method2348(boolean arg0, int arg1, int arg2) {
        this.method2373((byte) -70, true, arg0, arg2);
        ++field5903;
        int var4 = 106 / ((-61 - arg1) / 35);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILfm;)V", line = 1152)
    public final void method2349(int arg0, class669 arg1) {
        ++field5901;
        if (arg0 <= -59) {
            if (this.field5981 != arg1) {
                if (this.field6025) {
                    OpenGL.glBindBufferARB(34963, arg1.method2(-9));
                }
                this.field5981 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BF)V", line = 1175)
    public final void method2350(byte arg0, float arg1) {
        if (this.field6008 != arg1) {
            this.field6008 = arg1;
            if (~this.field5969 == -4) {
                this.method2356(-895654192);
            }
        }
        ++field5756;
        if (arg0 != 26) {
            this.method282(-111, 91, (int[][]) null, (int[][]) null, -3, 12, -33);
        }
    }

    @OriginalMember(owner = "client!ap", name = "SA", descriptor = "()I", line = 1193)
    public final int method345() {
        ++field5785;
        int var1 = this.field6072;
        this.field6072 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Li;)V", line = 1206)
    public final void method292(class37 arg0) {
        this.field5925 = ((class265) arg0).field3345;
        ++field5837;
        if (this.field6018 == null) {
            class146 var2 = new class146(80);
            if (this.field6030) {
                var2.method797(-1.0F, (byte) 87);
                var2.method797(-1.0F, (byte) -31);
                var2.method797(0.0F, (byte) -127);
                var2.method797(0.0F, (byte) -125);
                var2.method797(1.0F, (byte) 97);
                var2.method797(1.0F, (byte) -125);
                var2.method797(-1.0F, (byte) 121);
                var2.method797(0.0F, (byte) 117);
                var2.method797(1.0F, (byte) 107);
                var2.method797(1.0F, (byte) 82);
                var2.method797(1.0F, (byte) 97);
                var2.method797(1.0F, (byte) 123);
                var2.method797(0.0F, (byte) -17);
                var2.method797(1.0F, (byte) 119);
                var2.method797(0.0F, (byte) -84);
                var2.method797(-1.0F, (byte) -47);
                var2.method797(1.0F, (byte) 111);
                var2.method797(0.0F, (byte) 127);
                var2.method797(0.0F, (byte) 122);
                var2.method797(0.0F, (byte) 127);
            } else {
                var2.method796(6144, -1.0F);
                var2.method796(6144, -1.0F);
                var2.method796(6144, 0.0F);
                var2.method796(6144, 0.0F);
                var2.method796(6144, 1.0F);
                var2.method796(6144, 1.0F);
                var2.method796(6144, -1.0F);
                var2.method796(6144, 0.0F);
                var2.method796(6144, 1.0F);
                var2.method796(6144, 1.0F);
                var2.method796(6144, 1.0F);
                var2.method796(6144, 1.0F);
                var2.method796(6144, 0.0F);
                var2.method796(6144, 1.0F);
                var2.method796(6144, 0.0F);
                var2.method796(6144, -1.0F);
                var2.method796(6144, 1.0F);
                var2.method796(6144, 0.0F);
                var2.method796(6144, 0.0F);
                var2.method796(6144, 0.0F);
            }
            this.field6018 = this.method2397(var2.field6209, false, 20, var2.field6215, (byte) -60);
            this.field5996 = new class245(this.field6018, 5126, 3, 0);
            this.field5957 = new class245(this.field6018, 5126, 2, 12);
            this.field5921.method1464((byte) -92, this);
        }
    }

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "(I)V", line = 1279)
    private final void method2351(int arg0) {
        this.field5963 = new class598();
        ++field5864;
        this.field6011 = new class598();
        this.field5952 = new class412[this.field5986];
        this.field6044 = new class446(this, 3553, 6408, 1, arg0);
        new class446(this, 3553, 6408, 1, 1);
        new class446(this, 3553, 6408, 1, 1);
        this.field5950 = new class241(this);
        this.field5956 = new class241(this);
        this.field6065 = new class241(this);
        this.field5976 = new class241(this);
        this.field6035 = new class241(this);
        this.field5959 = new class241(this);
        this.field5990 = new class241(this);
        this.field5973 = new class241(this);
        this.field6024 = new class241(this);
        this.field6054 = new class241(this);
        if (this.field6063) {
            this.field6053 = new class162(this);
            new class162(this);
        }
    }

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "()Z", line = 1316)
    public final boolean method336() {
        ++field5835;
        return this.field5982 && (!this.method310() || this.field5998);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ldga;)V", line = 1326)
    public final void method384(class190 arg0) {
        ++field5763;
        this.field6017 = (class633) arg0;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(III)V", line = 1334)
    public final synchronized void method2352(int arg0, int arg1, int arg2) {
        if (arg2 != 65280) {
            this.field6016 = 113;
        }
        ++field5865;
        class337 var4 = new class337(arg1);
        var4.field3405 = (long) arg0;
        this.field5946.method3164(var4, 256);
    }

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "(I)V", line = 1348)
    private final void method2353(int arg0) {
        if ((float) arg0 != this.field6052) {
            float var2 = this.field6056 / (this.field6056 + this.field6052);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field6026 * (-var2 + 1.0F) / this.field6052;
            this.field6049[14] = this.field6026 * var3;
            this.field6049[10] = this.field6028 + var4;
        } else {
            this.field6049[10] = this.field6028;
            this.field6049[14] = this.field6026;
        }
        ++field5882;
        this.field5983 = (this.field6049[14] - (float) this.field6042) / this.field6049[10];
        this.field6005 = (float) this.field6042 + -this.field6052;
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(B)V", line = 1387)
    public final void method2354(byte arg0) {
        int var2 = 82 % ((-56 - arg0) / 61);
        if (this.field6064 != 4) {
            this.method2324((byte) -52);
            this.method2377(false, false);
            this.method2400((byte) 117, false);
            this.method2386(false, -114);
            this.method2382(false, -32);
            this.method2321(-2, (byte) 95);
            this.method2378(true, 1);
            this.field6064 = 4;
        }
        ++field5764;
    }

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "()Z", line = 1409)
    public final boolean method291() {
        ++field5876;
        if (this.field5918 != null) {
            if (!this.field5918.method2887(-23)) {
                if (!this.field5914.method3297(this.field5918, 105)) {
                    return false;
                }
                this.field5915.method1261(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "()V", line = 1437)
    public final void method280() {
        if (this.field5918 != null && this.field5918.method2887(-45)) {
            this.field5914.method3306(0, this.field5918);
            this.field5915.method1261(false);
        }
        ++field5794;
    }

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "(I)V", line = 1457)
    public final void method2355(int arg0) {
        ++field5878;
        if (arg0 > 38) {
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)Li;", line = 1469)
    public final class37 method308(int arg0) {
        ++field5799;
        class265 var2 = new class265(arg0);
        this.field5928.method3164(var2, 256);
        return var2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lqda;IIII)Lba;", line = 1481)
    public final class350 method375(class90 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5748;
        return new class241(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "(I)V", line = 1489)
    private final void method2356(int arg0) {
        ++field5812;
        float var2 = (float) (-this.field5999) * this.field6008 / (float) this.field6029;
        float var3 = (float) (-this.field6062) * this.field6008 / (float) this.field6039;
        if (arg0 == -895654192) {
            float var4 = (float) (this.field5805 - this.field5999) * this.field6008 / (float) this.field6029;
            float var5 = (float) (-this.field6062 + this.field5907) * this.field6008 / (float) this.field6039;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field5994 - this.field6052), (double) ((float) this.field6042 - this.field6052));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(IIIIII)V", line = 1515)
    public final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5871;
        this.method2346((byte) -18);
        this.method2378(true, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var11 = var8 * var9;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var10 + 0.35F, (float) arg3 + var11 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "(I)V", line = 1539)
    public final void method2357(int arg0) {
        if (arg0 <= 21) {
            this.method345();
        }
        OpenGL.glPopMatrix();
        ++field5866;
    }

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "()V", line = 1550)
    public final void method367() {
        ++field5750;
        if (this.field5951 && ~this.field5805 < -1 && ~this.field5907 < -1) {
            int var1 = this.field5953;
            int var2 = this.field6034;
            int var3 = this.field6057;
            int var4 = this.field5974;
            this.method378();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2375(-32);
            this.method2377(false, false);
            this.method2400((byte) 112, false);
            this.method2386(false, -57);
            this.method2382(false, -32);
            this.method2388((byte) -73, (class412) null);
            this.method2321(-2, (byte) 95);
            this.method2396(1, -1);
            this.method2378(true, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5805, this.field5907, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method314(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lq;)V", line = 1598)
    public final void method311(class389 arg0) {
        ++field5857;
        this.field5963 = (class598) arg0;
        this.field6011.method3343(this.field5963, (byte) -94);
        if (this.field5969 != 1) {
            this.method2385(87);
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(IIIIII)Ldga;", line = 1613)
    public final class190 method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5874;
        return this.field6046 ? new class288(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "()Z", line = 1621)
    public final boolean method360() {
        ++field5724;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(FFF)V", line = 1630)
    public final void method317(float arg0, float arg1, float arg2) {
        class277.field3491 = arg0;
        class425.field5652 = arg2;
        class166.field1998 = arg1;
        ++field5916;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Led;[Laaa;Z)Lta;", line = 1642)
    public final class195 method349(class645 arg0, class563[] arg1, boolean arg2) {
        ++field5728;
        return new class123(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIII)V", line = 1650)
    public final void method2358(byte arg0, int arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg3, arg1, arg2);
        ++field5843;
        if (arg0 != -69) {
            this.field6051 = 0.2685981F;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Laaa;Z)Lxa;", line = 1663)
    public final class458 method351(class563 arg0, boolean arg1) {
        ++field5781;
        int[] var3 = new int[arg0.field8005 * arg0.field8002];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field8001 != null) {
            for (int var6 = 0; arg0.field8005 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field8002 < ~var7; ++var7) {
                    var3[var5++] = class139.method776(arg0.field8000[class203.method1246(255, arg0.field8006[var4])], arg0.field8001[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; var8 < arg0.field8005; ++var8) {
                for (int var10 = 0; ~arg0.field8002 < ~var10; ++var10) {
                    int var11 = arg0.field8000[arg0.field8006[var4++] & 255];
                    var3[var5++] = var11 == 0 ? 0 : class139.method776(-16777216, var11);
                }
            }
        }
        class458 var9 = this.method326(var3, 0, arg0.field8002, arg0.field8002, arg0.field8005);
        var9.method409(arg0.field8004, arg0.field8007, arg0.field8003, arg0.field7999);
        return var9;
    }

    @OriginalMember(owner = "client!ap", name = "FA", descriptor = "(IIIIII)Z", line = 1724)
    public final boolean method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5855;
        float var7 = (float) arg2 * this.field5963.field8503 + (float) arg0 * this.field5963.field8484 + (float) arg1 * this.field5963.field8502 + this.field5963.field8481;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5963.field8503 + (float) arg3 * this.field5963.field8484 + (float) arg4 * this.field5963.field8502 + this.field5963.field8481;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field5994) || !(var8 < (float) this.field5994)) && (!(var7 > (float) this.field6042) || !((float) this.field6042 < var8))) {
            int var9 = (int) (((float) arg2 * this.field5963.field8494 + (float) arg0 * this.field5963.field8497 + (float) arg1 * this.field5963.field8491 + this.field5963.field8493) * (float) this.field6029 / var7);
            int var10 = (int) (((float) arg5 * this.field5963.field8494 + (float) arg3 * this.field5963.field8497 + (float) arg4 * this.field5963.field8491 + this.field5963.field8493) * (float) this.field6029 / var8);
            if ((float) var9 < this.field5960 && this.field5960 > (float) var10 || (float) var9 > this.field5977 && (float) var10 > this.field5977) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5963.field8501 + (float) arg0 * this.field5963.field8475 + (float) arg1 * this.field5963.field8476 + this.field5963.field8488) * (float) this.field6039 / var7);
                int var12 = (int) (((float) arg5 * this.field5963.field8501 + (float) arg3 * this.field5963.field8475 + (float) arg4 * this.field5963.field8476 + this.field5963.field8488) * (float) this.field6039 / var8);
                return (!(this.field6002 > (float) var11) || !(this.field6002 > (float) var12)) && (!((float) var11 > this.field6000) || !(this.field6000 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "()V", line = 1765)
    public final void method295() {
        for (class270 var1 = this.field5928.method3174((byte) 49); var1 != null; var1 = this.field5928.method3168(false)) {
            ((class265) var1).method1503((byte) -14);
        }
        ++field5723;
        if (this.field5914 != null) {
            this.field5914.method3296(false);
        }
        if (this.field5803 != null) {
            this.method2360(1);
            Enumeration var2 = this.field5829.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5829.get(var3);
                this.field5803.releaseSurface(var3, var4);
            }
            this.field5803.release();
            this.field5803 = null;
        }
        if (this.field5930) {
            class462.method2627((byte) 83, true, false);
            this.field5930 = false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "()Lq;", line = 1811)
    public final class389 method297() {
        ++field5772;
        return this.field5922;
    }

    @OriginalMember(owner = "client!ap", name = "JA", descriptor = "(I)V", line = 1819)
    public final void method369(int arg0) {
        this.field5927 = 0;
        ++field5757;
        while (~arg0 < -2) {
            ++this.field5927;
            arg0 >>= 1;
        }
        this.field5924 = 1 << this.field5927;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)V", line = 1835)
    public final void method296(int arg0, int arg1, int arg2, int arg3) {
        this.field5914.method3305(arg2, arg3, -11463, arg1, arg0);
        ++field5863;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(FFI)V", line = 1846)
    public final void method2359(float arg0, float arg1, int arg2) {
        this.field6051 = arg1;
        this.field6010 = arg0;
        ++field5729;
        int var4 = -95 / ((37 - arg2) / 61);
        if (!this.field6023) {
            this.method2367(34847);
        }
    }

    @OriginalMember(owner = "client!ap", name = "X", descriptor = "(III)V", line = 1860)
    public final void method363(int arg0, int arg1, int arg2) {
        if (~this.field6013 != ~arg0 || ~this.field5991 != ~arg1 || ~this.field6009 != ~arg2) {
            this.field5991 = arg1;
            this.field6009 = arg2;
            this.field6013 = arg0;
            if (!this.field6023) {
                this.method2367(34847);
                this.method2361(false);
            }
        }
        ++field5722;
    }

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "(I)V", line = 1884)
    public final void method343(int arg0) {
        ++field5905;
        this.method2378(true, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lba;Ltg;Lq;[Lmr;I)V", line = 1896)
    public final void method373(class350[] arg0, class211 arg1, class389 arg2, class130[] arg3, int arg4) {
        ++field5825;
        this.method381(arg0, arg2, arg3, arg4);
        this.method283(arg1);
    }

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "(I)V", line = 1908)
    private final void method2360(int arg0) {
        this.field5803.method3211();
        ++field5852;
        if (arg0 != 1) {
            this.field5829 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIZ)Lxa;", line = 1923)
    public final class458 method279(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5906;
        return new class680(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "(Z)V", line = 1934)
    private final void method2361(boolean arg0) {
        if (this.field5968 && this.field5991 >= 0 | this.field6023) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field5902;
        if (arg0) {
            this.field5948 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "()Lhl;", line = 1952)
    public final class482 method298() {
        ++field5867;
        int var1 = -1;
        if (this.field6006.indexOf("nvidia") == -1) {
            if (~this.field6006.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (~this.field6006.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class482(var1, "OpenGL", this.field5972, this.field6041, 0L);
    }

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "(I)V", line = 1974)
    private final void method2362(int arg0) {
        if (arg0 == 5) {
            ++field5788;
            int var2 = 0;
            while (!this.field5803.method3212()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class370.method2025(arg0 ^ -6, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "aa", descriptor = "()I", line = 2001)
    public final int method385() {
        ++field5793;
        int var1 = this.field6071;
        this.field6071 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "()Z", line = 2013)
    public final boolean method376() {
        ++field5813;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "(I)V", line = 2021)
    private final void method2363(int arg0) {
        if (arg0 != -7228) {
            this.field5966 = -0.26149657F;
        }
        ++field5819;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field6049, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 2034)
    public final class137 method282(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5806;
        return new class575(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "(IIIII)V", line = 2042)
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field5742;
        if (~this.field5953 >= ~(arg0 + arg2) && ~(arg0 - arg2) >= ~this.field6034 && this.field6057 <= arg1 + arg2 && ~this.field5974 <= ~(-arg2 + arg1)) {
            this.method2346((byte) -18);
            this.method2378(true, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field6003 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field6048) {
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
                int var10 = class687.method3819(var9, (byte) 111);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class264.field3340[var11] * (float) arg2 + var6, class264.field3341[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIBLfm;)V", line = 2114)
    public final void method2364(int arg0, int arg1, int arg2, byte arg3, class669 arg4) {
        ++field5826;
        int var6 = arg4.method3(29970);
        int var7 = arg1 * this.method2323(114, var6);
        this.method2349(-73, arg4);
        int var8 = -47 / ((arg3 - 26) / 47);
        OpenGL.glDrawElements(arg2, arg0, var6, arg4.method6(1151) - -((long) var7));
    }

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "(I)V", line = 2130)
    public final void method2365(int arg0) {
        if (arg0 < 40) {
            this.field5933 = 72;
        }
        ++field5784;
        if (~this.field6064 != -9) {
            this.method2404(0);
            this.method2377(true, false);
            this.method2386(true, -101);
            this.method2382(true, -32);
            this.method2378(true, 1);
            this.field6064 = 8;
        }
    }

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "(I)V", line = 2151)
    private final void method2366(int arg0) {
        if (this.field6034 >= this.field5953 && ~this.field6057 >= ~this.field5974) {
            OpenGL.glScissor(this.field6016 + this.field5953, this.field6060 - this.field5974 + this.field5907, -this.field5953 + this.field6034, -this.field6057 + this.field5974);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 0) {
            this.method283((class211) null);
        }
        ++field5801;
    }

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "()V", line = 2166)
    public final void method339() {
        ++field5840;
        this.field6023 = false;
        this.field5919.method3712(0, (byte) -121, false, 0, 0, false);
        this.method2367(34847);
        this.method2361(false);
    }

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "()I", line = 2185)
    public final int method352() {
        ++field5770;
        return 4;
    }

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "(I)V", line = 2193)
    private final void method2367(int arg0) {
        ++field5746;
        int var2;
        if (this.field6023) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field5985;
        } else {
            this.field5966 = (float) (this.field6042 - this.field6009) + -this.field6051;
            this.field5997 = -((float) this.field5991 * this.field6010) + this.field5966;
            if (this.field5997 < (float) this.field5994) {
                this.field5997 = (float) this.field5994;
            }
            OpenGL.glFogf(2915, this.field5997);
            OpenGL.glFogf(2916, this.field5966);
            var2 = this.field6013;
        }
        class201.field2459[1] = (float) class203.method1246(var2, 65280) / 65280.0F;
        class201.field2459[0] = (float) class203.method1246(16711680, var2) / 1.671168E7F;
        if (arg0 == 34847) {
            class201.field2459[2] = (float) class203.method1246(255, var2) / 255.0F;
            OpenGL.glFogfv(2918, class201.field2459, 0);
            if (this.field6023) {
                this.field5919.field9393.method51((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljt;I)V", line = 2231)
    public final void method2368(class91 arg0, int arg1) {
        ++field5786;
        if (this.field5936 >= 3) {
            throw new RuntimeException();
        } else if (arg1 == 255) {
            if (this.field5936 >= 0) {
                this.field5934[this.field5936].method579(24738);
            }
            this.field5931 = this.field5934[++this.field5936] = arg0;
            this.field5931.method578(-118);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([IIIII)Lxa;", line = 2256)
    public final class458 method326(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5860;
        return new class680(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(FIFFF)V", line = 2264)
    public final void method2369(float arg0, int arg1, float arg2, float arg3, float arg4) {
        ++field5834;
        class201.field2459[3] = arg2;
        class201.field2459[1] = arg4;
        if (arg1 == -21409) {
            class201.field2459[2] = arg3;
            class201.field2459[0] = arg0;
            OpenGL.glTexEnvfv(8960, 8705, class201.field2459, 0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(B)V", line = 2279)
    private final void method2370(byte arg0) {
        class201.field2459[3] = 1.0F;
        ++field5920;
        class201.field2459[2] = this.field6055 * this.field5989;
        class201.field2459[0] = this.field6055 * this.field6031;
        class201.field2459[1] = this.field6055 * this.field6004;
        if (arg0 == -56) {
            OpenGL.glLightModelfv(2899, class201.field2459, 0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V", line = 2294)
    public final void method322(int arg0) {
        ++field5821;
        this.method2360(1);
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(III)V", line = 2303)
    public final void method2371(int arg0, int arg1, int arg2) {
        ++field5853;
        if (arg2 < -61) {
            if (~this.field6068 == -1) {
                boolean var4 = false;
                if (~this.field6038 != ~arg0) {
                    OpenGL.glTexEnvi(8960, 34161, arg0);
                    var4 = true;
                    this.field6038 = arg0;
                }
                if (this.field5980 != arg1) {
                    OpenGL.glTexEnvi(8960, 34162, arg1);
                    this.field5980 = arg1;
                    var4 = true;
                }
                if (var4) {
                    this.field6064 &= -30;
                    return;
                }
            } else {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                OpenGL.glTexEnvi(8960, 34162, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "()V", line = 2345)
    public final void method347() {
        ++field5760;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZII)V", line = 2354)
    public final void method2372(int arg0, boolean arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34176 - -arg0, arg3);
        if (arg1) {
            this.method2338(-0.013472156F, 0.8395926F, -0.47663015F, -34);
        }
        ++field5768;
        OpenGL.glTexEnvi(8960, 34192 - -arg0, arg2);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 2367)
    public final void method307(int arg0) {
        ++field5739;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field5917 = arg0;
            this.field5915.method1261(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZZI)V", line = 2380)
    public final void method2373(byte arg0, boolean arg1, boolean arg2, int arg3) {
        ++field5877;
        if (~this.field6027 != ~arg3) {
            if (~arg3 > -1) {
                this.method2403(88);
                this.method2388((byte) 84, (class412) null);
                this.method2396(0, -1);
                if (!this.field6023) {
                    this.field5919.method3712(0, (byte) -88, arg2, 0, 0, arg1);
                }
            } else {
                class446 var5 = this.field5915.method1263(arg3, (byte) 59);
                class414 var6 = super.field8990.method846((byte) -122, arg3);
                if (~var6.field5491 == -1 && ~var6.field5501 == -1) {
                    this.method2403(arg0 + -55);
                } else {
                    int var7 = var6.field5499 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2338((float) (this.field5926 % var8 * var6.field5491) / (float) var8, 0.0F, (float) (this.field5926 % var8 * var6.field5501) / (float) var8, arg0 ^ -57);
                }
                if (this.field6023) {
                    this.method2388((byte) -128, var5);
                    this.method2396(var6.field5495, arg0 + 69);
                } else {
                    this.field5919.method3712(var6.field5486, (byte) -66, arg2, var6.field5483, var6.field5488, arg1);
                    if (!this.field5919.method3713(arg0 + -622, var5, var6.field5495)) {
                        this.method2388((byte) -71, var5);
                        this.method2396(var6.field5495, -1);
                    }
                }
            }
            this.field6027 = arg3;
        }
        if (arg0 == -70) {
            this.field6064 &= -8;
        }
    }

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "()Z", line = 2444)
    public final boolean method338() {
        ++field5824;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILjt;)V", line = 2456)
    public final void method2374(int arg0, class91 arg1) {
        ++field5798;
        if (arg0 < 93) {
            this.field6035 = null;
        }
        if (this.field5936 >= 0 && this.field5934[this.field5936] == arg1) {
            this.field5934[this.field5936--] = null;
            arg1.method579(24738);
            if (this.field5936 >= 0) {
                this.field5931 = this.field5934[this.field5936];
                this.field5931.method578(-124);
            } else {
                this.field5931 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "(I)V", line = 2481)
    public final void method2375(int arg0) {
        if (~this.field5969 != -1) {
            this.field6064 &= -32;
            this.field5969 = 0;
        }
        ++field5911;
        if (arg0 != -32) {
            this.method2393((byte) 56);
        }
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(II)I", line = 2499)
    public final int method2376(int arg0, int arg1) {
        ++field5740;
        int var3 = 0 % ((arg0 - -54) / 37);
        if (arg1 == 1) {
            return 7681;
        } else if (~arg1 == -1) {
            return 8448;
        } else if (~arg1 != -3) {
            if (arg1 == 3) {
                return 260;
            } else if (arg1 == 4) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "()Z", line = 2533)
    public final boolean method332() {
        ++field5767;
        return false;
    }

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "()V", line = 2541)
    public final void method305() {
        ++field5738;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZZ)V", line = 2548)
    public final void method2377(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field5986 = -124;
        }
        if (!arg0 == this.field5968) {
            this.field5968 = arg0;
            this.method2361(false);
            this.field6064 &= -32;
        }
        ++field5753;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(ZI)V", line = 2569)
    public final void method2378(boolean arg0, int arg1) {
        if (!arg0) {
            this.method305();
        }
        if (this.field6050 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg1 != -3) {
                if (arg1 != 128) {
                    var5 = 0;
                    var4 = true;
                    var3 = false;
                } else {
                    var4 = true;
                    var3 = true;
                    var5 = 3;
                }
            } else {
                var3 = false;
                var4 = true;
                var5 = 2;
            }
            if (!this.field5984 == var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field5984 = var4;
            }
            if (this.field5962 != var3) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field5962 = var3;
            }
            if (~this.field5988 != ~var5) {
                if (var5 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var5 == -3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (~var5 != -4) {
                    OpenGL.glDisable(3042);
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                }
                this.field5988 = var5;
            }
            this.field6064 &= -29;
            this.field6050 = arg1;
        }
        ++field5811;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "()Z", line = 2662)
    public final boolean method310() {
        ++field5804;
        return this.field5918 != null && this.field5918.method2887(-23);
    }

    @OriginalMember(owner = "client!ap", name = "IA", descriptor = "()I", line = 2670)
    public final int method321() {
        ++field5827;
        return this.field6042;
    }

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "()Z", line = 2682)
    public final boolean method275() {
        ++field5761;
        return this.field5918 != null && (this.field5912 <= 1 || this.field5998);
    }

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "([I)V", line = 2692)
    public final void method274(int[] arg0) {
        ++field5890;
        arg0[1] = this.field6057;
        arg0[0] = this.field5953;
        arg0[3] = this.field5974;
        arg0[2] = this.field6034;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljl;ILjl;Ljl;Ljl;)V", line = 2704)
    public final void method2379(class245 arg0, int arg1, class245 arg2, class245 arg3, class245 arg4) {
        if (arg0 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2384(arg0.field3163, 876814312);
            OpenGL.glVertexPointer(arg0.field3167, arg0.field3168, this.field5970.method778(-13931), this.field5970.method781(false) + (long) arg0.field3165);
            OpenGL.glEnableClientState(32884);
        }
        if (arg1 != 15132) {
            this.field6057 = -40;
        }
        ++field5884;
        if (arg4 != null) {
            this.method2384(arg4.field3163, 876814312);
            OpenGL.glNormalPointer(arg4.field3168, this.field5970.method778(-13931), this.field5970.method781(false) + (long) arg4.field3165);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method2384(arg3.field3163, arg1 ^ 876815604);
            OpenGL.glColorPointer(arg3.field3167, arg3.field3168, this.field5970.method778(-13931), this.field5970.method781(false) + (long) arg3.field3165);
            OpenGL.glEnableClientState(32886);
        }
        if (arg2 != null) {
            this.method2384(arg2.field3163, 876814312);
            OpenGL.glTexCoordPointer(arg2.field3167, arg2.field3168, this.field5970.method778(-13931), this.field5970.method781(false) + (long) arg2.field3165);
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(IB)V", line = 2750)
    public final void method2380(int arg0, byte arg1) {
        if (arg1 <= -68) {
            ++field5744;
            if (this.field6068 != arg0) {
                OpenGL.glActiveTexture(arg0 + 33984);
                this.field6068 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V", line = 2768)
    public final void method333(int arg0) {
        ++field5875;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lba;Ltg;Lq;Lmr;I)V", line = 2778)
    public final void method301(class350 arg0, class211 arg1, class389 arg2, class130 arg3, int arg4) {
        ++field5766;
        arg0.method904(arg2, arg3, arg4);
        this.method283(arg1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZB[BII)Lfm;", line = 2787)
    public final class669 method2381(boolean arg0, byte arg1, byte[] arg2, int arg3, int arg4) {
        ++field5730;
        if (arg1 != -76) {
            return null;
        } else {
            return (class669) (!this.field6025 || arg0 && !this.field5958 ? new class1(this, arg4, arg2, arg3) : new class193(this, arg4, arg2, arg3, arg0));
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;I)V", line = 2806)
    public class435(Canvas arg0, class486 arg1, int arg2) {
        super(arg1);
        new class474();
        new class572(16);
        this.field5940 = new class562();
        this.field5943 = new class562();
        this.field5944 = new class562();
        this.field5945 = new class562();
        this.field5946 = new class562();
        this.field5947 = new class562();
        this.field5948 = new class562();
        this.field5964 = -1.0F;
        this.field5980 = 8448;
        this.field5974 = 0;
        this.field5961 = new float[4];
        this.field5991 = -1;
        this.field5994 = 50;
        this.field5999 = 0;
        this.field5989 = 1.0F;
        this.field6016 = 0;
        this.field5983 = 3584.0F;
        this.field5979 = new float[4];
        this.field5993 = new class463[class235.field2991];
        this.field5985 = -1;
        this.field6031 = 1.0F;
        this.field6019 = 0;
        this.field5975 = true;
        this.field6034 = 0;
        this.field6008 = 1.0F;
        this.field6003 = -1.0F;
        this.field6049 = new float[16];
        this.field6013 = -1;
        this.field6039 = 512;
        this.field6048 = -1.0F;
        this.field6020 = new float[4];
        this.field6005 = 3584.0F;
        this.field6009 = 0;
        this.field6042 = 3584;
        this.field6051 = 0.0F;
        this.field5953 = 0;
        this.field6043 = -1;
        this.field6010 = 1.0F;
        this.field6047 = new float[4];
        this.field6057 = 0;
        this.field6038 = 8448;
        this.field6060 = 0;
        this.field6004 = 1.0F;
        this.field6059 = -1;
        this.field6062 = 0;
        this.field6029 = 512;
        this.field6056 = 3000.0F;
        this.field6066 = -1.0F;
        this.field6033 = new class146(8192);
        this.field6070 = new int[1];
        this.field6069 = new int[1];
        this.field6073 = new byte[16384];
        this.field6074 = new int[1];
        this.field5769 = this.field5870 = arg0;
        this.field5912 = arg2;
        if (!class527.method2998("jaclib", (byte) 14)) {
            throw new RuntimeException("");
        } else if (!class527.method2998("jaggl", (byte) 14)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field5803 = new OpenGL();
                this.field5808 = this.field5831 = this.field5803.init(arg0, 8, 8, 8, 24, 0, this.field5912);
                if (~this.field5831 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2362(5);
                    int var4 = this.method2345(-5123);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field6036 = !this.field6030 ? 5121 : 33639;
                        if (this.field6041.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class107.method674(this.field6041.replace('/', ' '), 1, ' ');
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && ~var10.length() <= -4 && class630.method3530(60, var10.substring(1, 3))) {
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
                                            if (var10.length() >= 4 && class630.method3530(68, var10.substring(0, 4))) {
                                                var5 = class399.method2185(var10.substring(0, 4), (byte) -34);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field6025 = false;
                                }
                                if (var5 >= 7000 && var5 <= 9250) {
                                    this.field6067 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field5987 = false;
                            }
                            this.field6012 &= this.field5803.method3210("GL_ARB_half_float_pixel");
                            this.field5958 = this.field6025;
                            this.field5971 = true;
                        }
                        if (~this.field6006.indexOf("intel") != 0) {
                            this.field6063 = false;
                        }
                        this.field5951 = !this.field6006.equals("s3 graphics");
                        if (this.field6025) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class672.method3769(-117, true, false);
                        this.field5930 = true;
                        this.field5915 = new class209(this, super.field8990);
                        this.method2351(1);
                        this.field5929 = new class445(this);
                        this.field5914 = new class588(this);
                        if (this.field5914.method3301(25443)) {
                            this.field5918 = new class281(this);
                            if (!this.field5918.method1606((byte) 49)) {
                                this.field5918.method1607((byte) -122);
                                this.field5918 = null;
                            }
                        }
                        this.field5919 = new class658(this);
                        this.method2330(121);
                        this.method2402((byte) 118);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field5803.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (~(var12++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class370.method2025(-1, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method295();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2976)
    public final void method273(Canvas arg0) {
        ++field5896;
        if (this.field5870 == arg0) {
            throw new RuntimeException();
        } else if (this.field5829.containsKey(arg0)) {
            Long var2 = (Long) this.field5829.get(arg0);
            this.field5803.releaseSurface(arg0, var2);
            this.field5829.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(ZI)V", line = 2995)
    public final void method2382(boolean arg0, int arg1) {
        ++field5759;
        if (arg1 != -32) {
            this.field6005 = 0.53625244F;
        }
        if (arg0 == !this.field5954) {
            this.field5954 = arg0;
            this.method2325(arg1 ^ -18);
            this.field6064 &= -32;
        }
    }

    @OriginalMember(owner = "client!ap", name = "Q", descriptor = "(IIII)V", line = 3013)
    public final void method330(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field5953 > ~arg0) {
            this.field5953 = arg0;
        }
        if (~this.field6034 < ~arg2) {
            this.field6034 = arg2;
        }
        ++field5777;
        if (arg1 > this.field6057) {
            this.field6057 = arg1;
        }
        if (~this.field5974 < ~arg3) {
            this.field5974 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method2332(4611);
        this.method2366(0);
    }

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "()V", line = 3039)
    public final void method358() {
        this.method2382(true, -32);
        ++field5776;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(Z)V", line = 3052)
    public final void method329(boolean arg0) {
        ++field5897;
        this.field5975 = arg0;
        this.method2325(14);
    }

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "()V", line = 3063)
    public final void method324() {
        ++field5741;
        this.field5914.method3298(17966);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lpb;I)V", line = 3073)
    public final void method2383(class598 arg0, int arg1) {
        ++field5778;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method3342((byte) 112), arg1);
    }

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "(I)V", line = 3082)
    public final void method288(int arg0) {
        ++field5845;
        this.method2362(5);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lrl;I)V", line = 3090)
    public final void method2384(class659 arg0, int arg1) {
        if (arg1 != 876814312) {
            this.field5958 = false;
        }
        ++field5908;
        if (this.field5970 != arg0) {
            if (this.field6025) {
                OpenGL.glBindBufferARB(34962, arg0.method779(54));
            }
            this.field5970 = arg0;
        }
    }

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "(I)V", line = 3112)
    private final void method2385(int arg0) {
        ++field5899;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        int var2 = -28 / ((arg0 - 35) / 46);
        OpenGL.glMultMatrixf(this.field5963.method3342((byte) 103), 0);
        if (this.field6023) {
            this.field5919.field9393.method49(34336);
        }
        this.method2399(-122);
        this.method2328(-12910);
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(ZI)V", line = 3129)
    public final void method2386(boolean arg0, int arg1) {
        if (!arg0 != !this.field6032) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field6032 = arg0;
            this.field6064 &= -32;
        }
        ++field5800;
        if (arg1 > -40) {
            this.method2346((byte) -110);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 3152)
    public final void method285(Rectangle[] arg0, int arg1) throws class295 {
        this.method341();
        ++field5734;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "()Z", line = 3166)
    public final boolean method386() {
        ++field5765;
        return false;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(IB)V", line = 3179)
    public final synchronized void method2387(int arg0, byte arg1) {
        ++field5909;
        if (arg1 < 52) {
            this.field5924 = 36;
        }
        class270 var3 = new class270();
        var3.field3405 = (long) arg0;
        this.field5947.method3164(var3, 256);
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(IIIII)V", line = 3194)
    public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5792;
        this.method2346((byte) -18);
        this.method2378(true, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ap", name = "ya", descriptor = "(IIIII)V", line = 3216)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2346((byte) -18);
        ++field5895;
        this.method2378(true, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ltg;)V", line = 3237)
    public final void method283(class211 arg0) {
        this.field5921.method1458((byte) 112, this, arg0);
        ++field5859;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLuda;)V", line = 3245)
    public final void method2388(byte arg0, class412 arg1) {
        int var3 = -18 % ((arg0 - 31) / 46);
        ++field5802;
        class412 var4 = this.field5952[this.field6068];
        if (arg1 != var4) {
            if (arg1 != null) {
                if (var4 == null) {
                    OpenGL.glEnable(arg1.field5464);
                } else if (arg1.field5464 != var4.field5464) {
                    OpenGL.glDisable(var4.field5464);
                    OpenGL.glEnable(arg1.field5464);
                }
                OpenGL.glBindTexture(arg1.field5464, arg1.method2235((byte) 53));
            } else {
                OpenGL.glDisable(var4.field5464);
            }
            this.field5952[this.field6068] = arg1;
        }
        this.field6064 &= -2;
    }

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "()Z", line = 3285)
    public final boolean method276() {
        ++field5782;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BII)V", line = 3293)
    public final void method2389(byte arg0, int arg1, int arg2) {
        this.field6060 = arg1;
        this.field6016 = arg2;
        ++field5889;
        if (arg0 < 83) {
            this.method2372(-28, false, 35, 121);
        }
        this.method2329(13091);
        this.method2366(0);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(IZII)V", line = 3308)
    public final void method2390(int arg0, boolean arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg0);
        ++field5820;
        OpenGL.glTexEnvi(8960, 34200 - -arg2, arg3);
        if (!arg1) {
            this.field5925 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "()V", line = 3320)
    public final void method378() {
        this.field6057 = 0;
        this.field6034 = this.field5805;
        this.field5953 = 0;
        ++field5747;
        this.field5974 = this.field5907;
        OpenGL.glDisable(3089);
        this.method2332(4611);
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 3336)
    public final void method284(Canvas arg0) {
        ++field5844;
        this.field5808 = 0L;
        this.field5769 = null;
        if (arg0 != null && this.field5870 != arg0) {
            if (this.field5829.containsKey(arg0)) {
                Long var2 = (Long) this.field5829.get(arg0);
                this.field5808 = var2;
                this.field5769 = arg0;
            }
        } else {
            this.field5769 = this.field5870;
            this.field5808 = this.field5831;
        }
        if (this.field5769 != null && this.field5808 != 0L) {
            this.field5803.setSurface(this.field5808);
            this.method2402((byte) 118);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(B)V", line = 3367)
    public final void method2391(byte arg0) {
        if (arg0 == -103) {
            if (this.field6064 != 2) {
                this.method2324((byte) -115);
                this.method2377(false, false);
                this.method2400((byte) 126, false);
                this.method2386(false, -83);
                this.method2382(false, -32);
                this.method2321(-2, (byte) 95);
                this.field6064 = 2;
            }
            ++field5737;
        }
    }

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "(I)V", line = 3388)
    private final void method2392(int arg0) {
        if (arg0 == 2896) {
            ++field5828;
            if (this.field5965 && !this.field5995) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "(B)V", line = 3403)
    public final void method2393(byte arg0) {
        ++field5790;
        if (this.field6064 != 16) {
            this.method2337(16274);
            this.method2377(true, false);
            this.method2386(true, -93);
            this.method2382(true, -32);
            this.method2378(true, 1);
            this.field6064 = 16;
        }
        int var2 = -54 % ((arg0 - -39) / 39);
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 3422)
    public final void method374(Canvas arg0) {
        ++field5894;
        if (this.field5870 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5829.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5803.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field5829.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "(I)Lng;", line = 3459)
    public final class310 method2394(int arg0) {
        ++field5851;
        int var2 = 63 / ((-57 - arg0) / 40);
        return this.field6017 == null ? null : this.field6017.method1631(-62);
    }

    @OriginalMember(owner = "client!ap", name = "sa", descriptor = "(II)V", line = 3470)
    public final void method342(int arg0, int arg1) {
        if (this.field5994 != arg0 || ~this.field6042 != ~arg1) {
            this.field5994 = arg0;
            this.field6042 = arg1;
            this.method2336(-88);
            this.method2367(34847);
            if (this.field5969 != 3) {
                if (this.field5969 == 2) {
                    this.method2363(-7228);
                }
            } else {
                this.method2356(-895654192);
            }
        }
        ++field5872;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ldga;Ldga;FLdga;)Ldga;", line = 3495)
    public final class190 method290(class190 arg0, class190 arg1, float arg2, class190 arg3) {
        ++field5762;
        if (arg0 != null && arg1 != null && this.field6046 && this.field6063) {
            class347 var5 = null;
            class633 var6 = (class633) arg0;
            class633 var7 = (class633) arg1;
            class310 var8 = var6.method1631(-39);
            class310 var9 = var7.method1631(-17);
            if (var8 != null && var9 != null) {
                int var10 = var9.field4018 < var8.field4018 ? var8.field4018 : var9.field4018;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class347) {
                    class347 var11 = (class347) arg3;
                    if (var10 == var11.method1925(-32480)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class347(this, var10);
                }
                if (var5.method1928((byte) 60, arg2, var9, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "()Z", line = 3549)
    public final boolean method316() {
        ++field5880;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lba;Lq;[Lmr;I)V", line = 3558)
    public final void method381(class350[] arg0, class389 arg1, class130[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method904(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field5841;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLjt;)V", line = 3577)
    public final void method2395(boolean arg0, class91 arg1) {
        ++field5780;
        if (arg0) {
            if (!this.field6014) {
                if (~this.field5935 <= -4) {
                    throw new RuntimeException();
                } else {
                    if (this.field5935 >= 0) {
                        this.field5937[this.field5935].method580(-3);
                    }
                    this.field5931 = this.field5932 = this.field5937[++this.field5935] = arg1;
                    this.field5931.method577((byte) 6);
                }
            } else {
                this.method2368(arg1, 255);
                this.method2405(arg1, 3089);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIIII)V", line = 3606)
    public final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method2346((byte) -18);
        ++field5869;
        this.method2378(true, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "(II)V", line = 3627)
    public final void method2396(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method333(-54);
        }
        if (~arg0 != -2) {
            if (~arg0 != -1) {
                if (~arg0 == -3) {
                    this.method2371(34165, 7681, arg1 ^ 118);
                } else if (~arg0 == -4) {
                    this.method2371(260, 8448, -126);
                } else if (arg0 == 4) {
                    this.method2371(34023, 34023, -128);
                }
            } else {
                this.method2371(8448, 8448, arg1 ^ 116);
            }
        } else {
            this.method2371(7681, 7681, -106);
        }
        ++field5752;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I", line = 3658)
    public final int method372(int arg0, int arg1) {
        ++field5807;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([BZIIB)Lrl;", line = 3669)
    public final class659 method2397(byte[] arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        ++field5787;
        if (!this.field6025 || arg1 && !this.field5958) {
            if (arg4 > -45) {
                this.method2404(-88);
            }
            return new class140(this, arg2, arg0, arg3);
        } else {
            return new class508(this, arg2, arg0, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "(B)V", line = 3690)
    private final void method2398(byte arg0) {
        class201.field2459[1] = this.field6066 * this.field6004;
        class201.field2459[2] = this.field6066 * this.field5989;
        ++field5815;
        class201.field2459[3] = 1.0F;
        class201.field2459[0] = this.field6066 * this.field6031;
        OpenGL.glLightfv(16384, 4609, class201.field2459, 0);
        if (arg0 > -37) {
            this.field6049 = null;
        }
        class201.field2459[3] = 1.0F;
        class201.field2459[0] = -this.field5964 * this.field6031;
        class201.field2459[1] = -this.field5964 * this.field6004;
        class201.field2459[2] = -this.field5964 * this.field5989;
        OpenGL.glLightfv(16385, 4609, class201.field2459, 0);
    }

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "(I)V", line = 3711)
    public final void method2399(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field6020, 0);
        ++field5758;
        OpenGL.glLightfv(16385, 4611, this.field5979, 0);
        if (arg0 >= -119) {
            this.method381((class350[]) null, (class389) null, (class130[]) null, 125);
        }
    }

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "()I", line = 3726)
    public final int method302() {
        ++field5771;
        return this.field5941 + this.field5939 - -this.field5942;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZ)V", line = 3736)
    public final void method2400(byte arg0, boolean arg1) {
        if (this.field5965 != arg1) {
            this.field5965 = arg1;
            this.method2392(2896);
            this.field6064 &= -8;
        }
        if (arg0 < 96) {
            this.method2346((byte) -20);
        }
        ++field5814;
    }

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "(II)V", line = 3755)
    public final synchronized void method2401(int arg0, int arg1) {
        ++field5839;
        class337 var3 = new class337(arg1);
        this.field5945.method3164(var3, 256);
        if (arg0 != 20155) {
            this.method2378(false, -122);
        }
    }

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "(B)V", line = 3773)
    private final void method2402(byte arg0) {
        ++field5727;
        if (arg0 != 118) {
            method2322(109, 46);
        }
        if (this.field5769 != null) {
            Dimension var2 = this.field5769.getSize();
            this.field5848 = var2.height;
            this.field5891 = var2.width;
        } else {
            this.field5891 = this.field5848 = 0;
        }
        if (this.field5932 == null) {
            this.field5907 = this.field5848;
            this.field5805 = this.field5891;
            this.method2329(13091);
        }
        this.method2375(-32);
        this.method378();
    }

    @OriginalMember(owner = "client!ap", name = "ca", descriptor = "(IIII)V", line = 3802)
    public final void method314(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field5907 > ~arg3) {
            arg3 = this.field5907;
        }
        if (~this.field5805 > ~arg2) {
            arg2 = this.field5805;
        }
        ++field5796;
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field5974 = arg3;
        this.field6034 = arg2;
        this.field6057 = arg1;
        this.field5953 = arg0;
        OpenGL.glEnable(3089);
        this.method2332(4611);
        this.method2366(0);
    }

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "(I)V", line = 3832)
    private final void method2403(int arg0) {
        if (this.field6037) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field6037 = false;
        }
        int var2 = -73 / ((arg0 - -59) / 57);
        ++field5858;
    }

    @OriginalMember(owner = "client!ap", name = "LA", descriptor = "(IIII)V", line = 3849)
    public final void method299(int arg0, int arg1, int arg2, int arg3) {
        ++field5773;
        if (!this.field6023) {
            throw new RuntimeException("");
        } else {
            this.field6045 = arg0;
            this.field6019 = arg3;
            this.field6043 = arg2;
            this.field5985 = arg1;
            this.field5919.field9393.method49(34336);
            this.method2367(34847);
        }
    }

    @OriginalMember(owner = "client!ap", name = "U", descriptor = "()I", line = 3868)
    public final int method337() {
        ++field5883;
        return this.field5994;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3880)
    public final void method325(Canvas arg0) {
        ++field5822;
        long var2 = 0L;
        if (arg0 != null && this.field5870 != arg0) {
            if (this.field5829.containsKey(arg0)) {
                Long var4 = (Long) this.field5829.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5831;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field5803.surfaceResized(var2);
            if (this.field5769 == arg0) {
                this.method2402((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "(I)V", line = 3914)
    private final void method2404(int arg0) {
        if (~this.field5969 != -3) {
            this.field5969 = 2;
            this.method2363(-7228);
            this.method2385(86);
            this.field6064 &= -8;
        }
        if (arg0 != 0) {
            this.method322(-61);
        }
        ++field5893;
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "()V", line = 3938)
    public final void method341() throws class295 {
        ++field5849;
        try {
            this.field5803.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "()Z", line = 3955)
    public final boolean method377() {
        ++field5879;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "na", descriptor = "(III[I)V", line = 3965)
    public final void method331(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5862;
        float var5 = (float) arg2 * this.field5963.field8503 + (float) arg0 * this.field5963.field8484 + (float) arg1 * this.field5963.field8502 + this.field5963.field8481;
        if (!((float) this.field5994 > var5) && !(var5 > (float) this.field6042)) {
            int var6 = (int) (((float) arg2 * this.field5963.field8494 + (float) arg0 * this.field5963.field8497 + (float) arg1 * this.field5963.field8491 + this.field5963.field8493) * (float) this.field6029 / var5);
            int var7 = (int) (((float) arg2 * this.field5963.field8501 + (float) arg0 * this.field5963.field8475 + (float) arg1 * this.field5963.field8476 + this.field5963.field8488) * (float) this.field6039 / var5);
            if (this.field5960 <= (float) var6 && (float) var6 <= this.field5977 && this.field6002 <= (float) var7 && (float) var7 <= this.field6000) {
                arg3[0] = (int) ((float) var6 + -this.field5960);
                arg3[1] = (int) ((float) var7 - this.field6002);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)I", line = 3995)
    public final int method312(int arg0, int arg1) {
        ++field5749;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Ljt;I)V", line = 4003)
    public final void method2405(class91 arg0, int arg1) {
        ++field5842;
        if (~this.field5933 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field5933 <= -1) {
                this.field5938[this.field5933].method582(-5540);
            }
            if (arg1 != 3089) {
                this.field5924 = 77;
            }
            this.field5932 = this.field5938[++this.field5933] = arg0;
            this.field5932.method581(120);
        }
    }

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "(IIII)V", line = 4021)
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
        this.field6029 = arg2;
        this.field5999 = arg0;
        ++field5856;
        this.field6062 = arg1;
        this.field6039 = arg3;
        this.method2336(-122);
        this.method2332(4611);
        if (~this.field5969 == -4) {
            this.method2356(-895654192);
        } else if (this.field5969 == 2) {
            this.method2363(-7228);
        }
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)V", line = 4043)
    public final synchronized void method304(int arg0) {
        ++field5886;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field5943.method3161((byte) 87)) {
            class337 var12 = (class337) this.field5943.method3171(768);
            class323.field4207[var3++] = (int) var12.field3405;
            this.field5939 -= var12.field4415;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class323.field4207, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class323.field4207, 0);
            var3 = 0;
        }
        while (!this.field5944.method3161((byte) 106)) {
            class337 var11 = (class337) this.field5944.method3171(768);
            class323.field4207[var3++] = (int) var11.field3405;
            this.field5942 -= var11.field4415;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class323.field4207, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class323.field4207, 0);
            var3 = 0;
        }
        while (!this.field5945.method3161((byte) 124)) {
            class337 var10 = (class337) this.field5945.method3171(768);
            class323.field4207[var3++] = var10.field4415;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class323.field4207, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class323.field4207, 0);
            var3 = 0;
        }
        while (!this.field5946.method3161((byte) 109)) {
            class337 var9 = (class337) this.field5946.method3171(768);
            class323.field4207[var3++] = (int) var9.field3405;
            this.field5941 -= var9.field4415;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class323.field4207, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class323.field4207, 0);
            boolean var4 = false;
        }
        while (!this.field5940.method3161((byte) 86)) {
            class337 var8 = (class337) this.field5940.method3171(768);
            OpenGL.glDeleteLists((int) var8.field3405, var8.field4415);
        }
        while (!this.field5947.method3161((byte) 105)) {
            class270 var7 = this.field5947.method3171(768);
            OpenGL.glDeleteProgramARB((int) var7.field3405);
        }
        while (!this.field5948.method3161((byte) 125)) {
            class270 var6 = this.field5948.method3171(768);
            OpenGL.glDeleteObjectARB(var6.field3405);
        }
        while (!this.field5940.method3161((byte) 112)) {
            class337 var5 = (class337) this.field5940.method3171(768);
            OpenGL.glDeleteLists((int) var5.field3405, var5.field4415);
        }
        this.field5915.method1260(15146);
        if (~this.method302() < -100663297 && ~class641.method3604(false) < ~(this.field6001 + 60000L)) {
            System.gc();
            this.field6001 = class641.method3604(false);
        }
        this.field5926 = var2;
    }
}
