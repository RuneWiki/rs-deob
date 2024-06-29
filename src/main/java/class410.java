import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class410 extends class162 {

    @OriginalMember(owner = "client!ht", name = "fd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5796 = new Hashtable();

    @OriginalMember(owner = "client!ht", name = "le", descriptor = "I")
    public int field5854 = 128;

    @OriginalMember(owner = "client!ht", name = "ge", descriptor = "Lrh;")
    private class172 field5849 = new class172();

    @OriginalMember(owner = "client!ht", name = "pe", descriptor = "Law;")
    private class53 field5858 = new class53();

    @OriginalMember(owner = "client!ht", name = "qe", descriptor = "Law;")
    public class53 field5859 = new class53();

    @OriginalMember(owner = "client!ht", name = "we", descriptor = "I")
    public int field5865 = 8;

    @OriginalMember(owner = "client!ht", name = "ve", descriptor = "Z")
    private boolean field5864 = false;

    @OriginalMember(owner = "client!ht", name = "xe", descriptor = "I")
    public int field5866 = 3;

    @OriginalMember(owner = "client!ht", name = "re", descriptor = "Lwo;")
    private class522 field5860 = new class522();

    @OriginalMember(owner = "client!ht", name = "ze", descriptor = "I")
    private int field5868 = -1;

    @OriginalMember(owner = "client!ht", name = "Ae", descriptor = "[Lts;")
    private class372[] field5869 = new class372[4];

    @OriginalMember(owner = "client!ht", name = "ye", descriptor = "[Lts;")
    private class372[] field5867 = new class372[4];

    @OriginalMember(owner = "client!ht", name = "Ce", descriptor = "I")
    private int field5871 = -1;

    @OriginalMember(owner = "client!ht", name = "De", descriptor = "I")
    private int field5872 = -1;

    @OriginalMember(owner = "client!ht", name = "Fe", descriptor = "[Lts;")
    private class372[] field5874 = new class372[4];

    @OriginalMember(owner = "client!ht", name = "Ie", descriptor = "Lwo;")
    private class522 field5877;

    @OriginalMember(owner = "client!ht", name = "Ke", descriptor = "Lwo;")
    private class522 field5879;

    @OriginalMember(owner = "client!ht", name = "Le", descriptor = "Lwo;")
    private class522 field5880;

    @OriginalMember(owner = "client!ht", name = "Me", descriptor = "Lwo;")
    private class522 field5881;

    @OriginalMember(owner = "client!ht", name = "Ne", descriptor = "Lwo;")
    private class522 field5882;

    @OriginalMember(owner = "client!ht", name = "Oe", descriptor = "Lwo;")
    private class522 field5883;

    @OriginalMember(owner = "client!ht", name = "Pe", descriptor = "Lwo;")
    private class522 field5884;

    @OriginalMember(owner = "client!ht", name = "kf", descriptor = "[F")
    private float[] field5904;

    @OriginalMember(owner = "client!ht", name = "mf", descriptor = "F")
    public float field5906;

    @OriginalMember(owner = "client!ht", name = "tf", descriptor = "I")
    public int field5913;

    @OriginalMember(owner = "client!ht", name = "zf", descriptor = "F")
    private float field5919;

    @OriginalMember(owner = "client!ht", name = "pf", descriptor = "I")
    public int field5909;

    @OriginalMember(owner = "client!ht", name = "of", descriptor = "[F")
    private float[] field5908;

    @OriginalMember(owner = "client!ht", name = "qf", descriptor = "I")
    private int field5910;

    @OriginalMember(owner = "client!ht", name = "Ve", descriptor = "I")
    private int field5890;

    @OriginalMember(owner = "client!ht", name = "fg", descriptor = "I")
    private int field5951;

    @OriginalMember(owner = "client!ht", name = "Uf", descriptor = "[F")
    public float[] field5940;

    @OriginalMember(owner = "client!ht", name = "Qf", descriptor = "I")
    private int field5936;

    @OriginalMember(owner = "client!ht", name = "cg", descriptor = "[F")
    private float[] field5948;

    @OriginalMember(owner = "client!ht", name = "bf", descriptor = "I")
    public int field5896;

    @OriginalMember(owner = "client!ht", name = "pg", descriptor = "I")
    public int field5961;

    @OriginalMember(owner = "client!ht", name = "tg", descriptor = "F")
    private float field5965;

    @OriginalMember(owner = "client!ht", name = "Af", descriptor = "F")
    public float field5920;

    @OriginalMember(owner = "client!ht", name = "hg", descriptor = "I")
    public int field5953;

    @OriginalMember(owner = "client!ht", name = "Xe", descriptor = "F")
    public float field5892;

    @OriginalMember(owner = "client!ht", name = "dg", descriptor = "F")
    public float field5949;

    @OriginalMember(owner = "client!ht", name = "Jg", descriptor = "I")
    public int field5981;

    @OriginalMember(owner = "client!ht", name = "Yf", descriptor = "I")
    private int field5944;

    @OriginalMember(owner = "client!ht", name = "Vf", descriptor = "I")
    private int field5941;

    @OriginalMember(owner = "client!ht", name = "ng", descriptor = "F")
    public float field5959;

    @OriginalMember(owner = "client!ht", name = "Qg", descriptor = "I")
    private int field5988;

    @OriginalMember(owner = "client!ht", name = "Mg", descriptor = "I")
    public int field5984;

    @OriginalMember(owner = "client!ht", name = "Zg", descriptor = "F")
    public float field5997;

    @OriginalMember(owner = "client!ht", name = "Yg", descriptor = "F")
    private float field5996;

    @OriginalMember(owner = "client!ht", name = "Cf", descriptor = "F")
    public float field5922;

    @OriginalMember(owner = "client!ht", name = "Cg", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!ht", name = "ig", descriptor = "[Lpe;")
    private class432[] field5954;

    @OriginalMember(owner = "client!ht", name = "Sf", descriptor = "I")
    private int field5938;

    @OriginalMember(owner = "client!ht", name = "xg", descriptor = "[F")
    private float[] field5969;

    @OriginalMember(owner = "client!ht", name = "Xg", descriptor = "I")
    private int field5995;

    @OriginalMember(owner = "client!ht", name = "lg", descriptor = "I")
    public int field5957;

    @OriginalMember(owner = "client!ht", name = "Ue", descriptor = "F")
    public float field5889;

    @OriginalMember(owner = "client!ht", name = "ef", descriptor = "I")
    public int field5899;

    @OriginalMember(owner = "client!ht", name = "jf", descriptor = "I")
    public int field5903;

    @OriginalMember(owner = "client!ht", name = "Te", descriptor = "Z")
    private boolean field5888;

    @OriginalMember(owner = "client!ht", name = "Pg", descriptor = "I")
    private int field5987;

    @OriginalMember(owner = "client!ht", name = "ee", descriptor = "I")
    public int field5847;

    @OriginalMember(owner = "client!ht", name = "X", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5684;

    @OriginalMember(owner = "client!ht", name = "Md", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5829;

    @OriginalMember(owner = "client!ht", name = "Ub", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5733;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "J")
    private long field5667;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "J")
    private long field5655;

    @OriginalMember(owner = "client!ht", name = "Lf", descriptor = "Z")
    public boolean field5931;

    @OriginalMember(owner = "client!ht", name = "rg", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!ht", name = "eg", descriptor = "Ljava/lang/String;")
    private String field5950;

    @OriginalMember(owner = "client!ht", name = "sf", descriptor = "Z")
    public boolean field5912;

    @OriginalMember(owner = "client!ht", name = "Hf", descriptor = "Z")
    private boolean field5927;

    @OriginalMember(owner = "client!ht", name = "hh", descriptor = "Z")
    public boolean field6005;

    @OriginalMember(owner = "client!ht", name = "lf", descriptor = "Z")
    public boolean field5905;

    @OriginalMember(owner = "client!ht", name = "bh", descriptor = "Z")
    private boolean field5999;

    @OriginalMember(owner = "client!ht", name = "Jf", descriptor = "Ljava/lang/String;")
    private String field5929;

    @OriginalMember(owner = "client!ht", name = "cf", descriptor = "Z")
    public boolean field5897;

    @OriginalMember(owner = "client!ht", name = "Og", descriptor = "Z")
    private boolean field5986;

    @OriginalMember(owner = "client!ht", name = "ne", descriptor = "Leh;")
    public class241 field5856;

    @OriginalMember(owner = "client!ht", name = "se", descriptor = "Lfl;")
    public class519 field5861;

    @OriginalMember(owner = "client!ht", name = "ke", descriptor = "Ler;")
    private class68 field5853;

    @OriginalMember(owner = "client!ht", name = "je", descriptor = "Lhe;")
    private class249 field5852;

    @OriginalMember(owner = "client!ht", name = "oe", descriptor = "Ldv;")
    private class468 field5857;

    @OriginalMember(owner = "client!ht", name = "Jd", descriptor = "Luf;")
    public static class310 field5826 = new class310(88, 3);

    @OriginalMember(owner = "client!ht", name = "he", descriptor = "I")
    public static int field5850 = 0;

    @OriginalMember(owner = "client!ht", name = "fe", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5848 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ht", name = "Ze", descriptor = "F")
    public float field5894;

    @OriginalMember(owner = "client!ht", name = "af", descriptor = "F")
    public float field5895;

    @OriginalMember(owner = "client!ht", name = "ff", descriptor = "F")
    public float field5900;

    @OriginalMember(owner = "client!ht", name = "vf", descriptor = "F")
    public float field5915;

    @OriginalMember(owner = "client!ht", name = "Df", descriptor = "F")
    private float field5923;

    @OriginalMember(owner = "client!ht", name = "Ff", descriptor = "F")
    private float field5925;

    @OriginalMember(owner = "client!ht", name = "og", descriptor = "F")
    public float field5960;

    @OriginalMember(owner = "client!ht", name = "Ig", descriptor = "F")
    public float field5980;

    @OriginalMember(owner = "client!ht", name = "Lg", descriptor = "F")
    private float field5983;

    @OriginalMember(owner = "client!ht", name = "Wg", descriptor = "F")
    public float field5994;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!ht", name = "I", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!ht", name = "N", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!ht", name = "P", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!ht", name = "Q", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ht", name = "R", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!ht", name = "S", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!ht", name = "T", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!ht", name = "U", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!ht", name = "V", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!ht", name = "W", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!ht", name = "Y", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!ht", name = "Z", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!ht", name = "ab", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!ht", name = "bb", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!ht", name = "cb", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!ht", name = "db", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!ht", name = "eb", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!ht", name = "fb", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!ht", name = "gb", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!ht", name = "hb", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!ht", name = "ib", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!ht", name = "jb", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!ht", name = "kb", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!ht", name = "lb", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!ht", name = "mb", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!ht", name = "nb", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!ht", name = "ob", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!ht", name = "pb", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!ht", name = "qb", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!ht", name = "rb", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!ht", name = "sb", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!ht", name = "tb", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!ht", name = "ub", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!ht", name = "vb", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!ht", name = "wb", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!ht", name = "xb", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!ht", name = "yb", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!ht", name = "zb", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!ht", name = "Ab", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!ht", name = "Bb", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!ht", name = "Cb", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!ht", name = "Db", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!ht", name = "Eb", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!ht", name = "Fb", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!ht", name = "Gb", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!ht", name = "Hb", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!ht", name = "Ib", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!ht", name = "Jb", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!ht", name = "Kb", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!ht", name = "Lb", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!ht", name = "Mb", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!ht", name = "Nb", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!ht", name = "Ob", descriptor = "I")
    private int field5727;

    @OriginalMember(owner = "client!ht", name = "Pb", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ht", name = "Qb", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ht", name = "Rb", descriptor = "I")
    public int field5730;

    @OriginalMember(owner = "client!ht", name = "Sb", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!ht", name = "Tb", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!ht", name = "Vb", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ht", name = "Wb", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!ht", name = "Xb", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!ht", name = "Yb", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ht", name = "Zb", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ht", name = "ac", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!ht", name = "bc", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!ht", name = "cc", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ht", name = "dc", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!ht", name = "ec", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ht", name = "fc", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!ht", name = "gc", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ht", name = "hc", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!ht", name = "ic", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!ht", name = "jc", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ht", name = "kc", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!ht", name = "lc", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!ht", name = "mc", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!ht", name = "nc", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!ht", name = "oc", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!ht", name = "pc", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!ht", name = "qc", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!ht", name = "rc", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!ht", name = "sc", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!ht", name = "tc", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!ht", name = "uc", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!ht", name = "vc", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ht", name = "wc", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!ht", name = "xc", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!ht", name = "yc", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!ht", name = "zc", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!ht", name = "Ac", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ht", name = "Bc", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!ht", name = "Cc", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ht", name = "Dc", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!ht", name = "Ec", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ht", name = "Fc", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ht", name = "Gc", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ht", name = "Hc", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!ht", name = "Ic", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ht", name = "Jc", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ht", name = "Kc", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ht", name = "Lc", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ht", name = "Mc", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ht", name = "Nc", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ht", name = "Oc", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ht", name = "Pc", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ht", name = "Qc", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!ht", name = "Rc", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ht", name = "Sc", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ht", name = "Tc", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ht", name = "Uc", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ht", name = "Vc", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!ht", name = "Wc", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!ht", name = "Xc", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!ht", name = "Yc", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!ht", name = "Zc", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ht", name = "ad", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!ht", name = "bd", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!ht", name = "cd", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!ht", name = "dd", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!ht", name = "ed", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!ht", name = "gd", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!ht", name = "hd", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!ht", name = "id", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!ht", name = "jd", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!ht", name = "kd", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!ht", name = "ld", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!ht", name = "md", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!ht", name = "nd", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!ht", name = "od", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!ht", name = "pd", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!ht", name = "qd", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!ht", name = "rd", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!ht", name = "sd", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!ht", name = "td", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!ht", name = "ud", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!ht", name = "vd", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ht", name = "wd", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!ht", name = "xd", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ht", name = "yd", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!ht", name = "zd", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ht", name = "Ad", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!ht", name = "Bd", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!ht", name = "Cd", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ht", name = "Dd", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!ht", name = "Ed", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ht", name = "Fd", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!ht", name = "Gd", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!ht", name = "Hd", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!ht", name = "Id", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!ht", name = "Kd", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!ht", name = "Ld", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!ht", name = "Nd", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!ht", name = "Od", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!ht", name = "Pd", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!ht", name = "Qd", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!ht", name = "Rd", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!ht", name = "Sd", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ht", name = "Td", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!ht", name = "Ud", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ht", name = "Vd", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!ht", name = "Wd", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!ht", name = "Xd", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!ht", name = "Yd", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!ht", name = "Zd", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ht", name = "ae", descriptor = "I")
    private int field5843;

    @OriginalMember(owner = "client!ht", name = "be", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ht", name = "ce", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!ht", name = "de", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ht", name = "ie", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ht", name = "me", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ht", name = "ue", descriptor = "I")
    public int field5863;

    @OriginalMember(owner = "client!ht", name = "Ge", descriptor = "I")
    private int field5875;

    @OriginalMember(owner = "client!ht", name = "He", descriptor = "I")
    public int field5876;

    @OriginalMember(owner = "client!ht", name = "Je", descriptor = "I")
    public int field5878;

    @OriginalMember(owner = "client!ht", name = "Qe", descriptor = "I")
    public int field5885;

    @OriginalMember(owner = "client!ht", name = "Se", descriptor = "I")
    private int field5887;

    @OriginalMember(owner = "client!ht", name = "hf", descriptor = "I")
    private int field5902;

    @OriginalMember(owner = "client!ht", name = "rf", descriptor = "I")
    private int field5911;

    @OriginalMember(owner = "client!ht", name = "wf", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!ht", name = "Bf", descriptor = "I")
    private int field5921;

    @OriginalMember(owner = "client!ht", name = "Mf", descriptor = "I")
    private int field5932;

    @OriginalMember(owner = "client!ht", name = "Rf", descriptor = "I")
    public int field5937;

    @OriginalMember(owner = "client!ht", name = "Wf", descriptor = "I")
    private int field5942;

    @OriginalMember(owner = "client!ht", name = "Zf", descriptor = "I")
    public int field5945;

    @OriginalMember(owner = "client!ht", name = "gg", descriptor = "I")
    private int field5952;

    @OriginalMember(owner = "client!ht", name = "jg", descriptor = "I")
    private int field5955;

    @OriginalMember(owner = "client!ht", name = "qg", descriptor = "I")
    public int field5962;

    @OriginalMember(owner = "client!ht", name = "yg", descriptor = "I")
    private int field5970;

    @OriginalMember(owner = "client!ht", name = "Ag", descriptor = "I")
    private int field5972;

    @OriginalMember(owner = "client!ht", name = "Fg", descriptor = "I")
    private int field5977;

    @OriginalMember(owner = "client!ht", name = "eh", descriptor = "I")
    private int field6002;

    @OriginalMember(owner = "client!ht", name = "Ye", descriptor = "J")
    private long field5893;

    @OriginalMember(owner = "client!ht", name = "vg", descriptor = "Lmg;")
    private class100 field5967;

    @OriginalMember(owner = "client!ht", name = "Eg", descriptor = "Lds;")
    public class12 field5976;

    @OriginalMember(owner = "client!ht", name = "fh", descriptor = "Lds;")
    public class12 field6003;

    @OriginalMember(owner = "client!ht", name = "If", descriptor = "Lqv;")
    public class308 field5928;

    @OriginalMember(owner = "client!ht", name = "ug", descriptor = "Lqv;")
    public class308 field5966;

    @OriginalMember(owner = "client!ht", name = "Kg", descriptor = "Lqv;")
    public class308 field5982;

    @OriginalMember(owner = "client!ht", name = "Rg", descriptor = "Lcq;")
    private class325 field5989;

    @OriginalMember(owner = "client!ht", name = "Be", descriptor = "Lts;")
    private class372 field5870;

    @OriginalMember(owner = "client!ht", name = "Ee", descriptor = "Lts;")
    private class372 field5873;

    @OriginalMember(owner = "client!ht", name = "Re", descriptor = "Lor;")
    public class452 field5886;

    @OriginalMember(owner = "client!ht", name = "Ef", descriptor = "Lor;")
    public class452 field5924;

    @OriginalMember(owner = "client!ht", name = "Gf", descriptor = "Lor;")
    public class452 field5926;

    @OriginalMember(owner = "client!ht", name = "Xf", descriptor = "Lor;")
    public class452 field5943;

    @OriginalMember(owner = "client!ht", name = "bg", descriptor = "Lor;")
    public class452 field5947;

    @OriginalMember(owner = "client!ht", name = "Bg", descriptor = "Lor;")
    public class452 field5973;

    @OriginalMember(owner = "client!ht", name = "Dg", descriptor = "Lor;")
    public class452 field5975;

    @OriginalMember(owner = "client!ht", name = "Vg", descriptor = "Lor;")
    public class452 field5993;

    @OriginalMember(owner = "client!ht", name = "ch", descriptor = "Lor;")
    public class452 field6000;

    @OriginalMember(owner = "client!ht", name = "gh", descriptor = "Lor;")
    public class452 field6004;

    @OriginalMember(owner = "client!ht", name = "wg", descriptor = "Lnk;")
    private class502 field5968;

    @OriginalMember(owner = "client!ht", name = "mg", descriptor = "Llr;")
    public class527 field5958;

    @OriginalMember(owner = "client!ht", name = "Ng", descriptor = "Llr;")
    public class527 field5985;

    @OriginalMember(owner = "client!ht", name = "xf", descriptor = "Law;")
    public class53 field5917;

    @OriginalMember(owner = "client!ht", name = "Sg", descriptor = "Law;")
    public class53 field5990;

    @OriginalMember(owner = "client!ht", name = "sg", descriptor = "Lbm;")
    private class74 field5964;

    @OriginalMember(owner = "client!ht", name = "zg", descriptor = "Lbm;")
    private class74 field5971;

    @OriginalMember(owner = "client!ht", name = "te", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field5862;

    @OriginalMember(owner = "client!ht", name = "We", descriptor = "Z")
    private boolean field5891;

    @OriginalMember(owner = "client!ht", name = "df", descriptor = "Z")
    public boolean field5898;

    @OriginalMember(owner = "client!ht", name = "gf", descriptor = "Z")
    public boolean field5901;

    @OriginalMember(owner = "client!ht", name = "nf", descriptor = "Z")
    public boolean field5907;

    @OriginalMember(owner = "client!ht", name = "uf", descriptor = "Z")
    private boolean field5914;

    @OriginalMember(owner = "client!ht", name = "yf", descriptor = "Z")
    public boolean field5918;

    @OriginalMember(owner = "client!ht", name = "Kf", descriptor = "Z")
    private boolean field5930;

    @OriginalMember(owner = "client!ht", name = "Nf", descriptor = "Z")
    public boolean field5933;

    @OriginalMember(owner = "client!ht", name = "Pf", descriptor = "Z")
    private boolean field5935;

    @OriginalMember(owner = "client!ht", name = "Tf", descriptor = "Z")
    private boolean field5939;

    @OriginalMember(owner = "client!ht", name = "ag", descriptor = "Z")
    private boolean field5946;

    @OriginalMember(owner = "client!ht", name = "kg", descriptor = "Z")
    public boolean field5956;

    @OriginalMember(owner = "client!ht", name = "Gg", descriptor = "Z")
    private boolean field5978;

    @OriginalMember(owner = "client!ht", name = "Hg", descriptor = "Z")
    private boolean field5979;

    @OriginalMember(owner = "client!ht", name = "Tg", descriptor = "Z")
    public boolean field5991;

    @OriginalMember(owner = "client!ht", name = "Ug", descriptor = "Z")
    private boolean field5992;

    @OriginalMember(owner = "client!ht", name = "ah", descriptor = "Z")
    public boolean field5998;

    @OriginalMember(owner = "client!ht", name = "dh", descriptor = "Z")
    private boolean field6001;

    @OriginalMember(owner = "client!ht", name = "Of", descriptor = "[Lao;")
    private class188[] field5934;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "()Z")
    public final boolean method485() {
        ++field5740;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BI)V")
    public final void method2356(byte arg0, int arg1) {
        if (arg0 == -21) {
            ++field5744;
            if (~this.field5887 != ~arg1) {
                boolean var3;
                boolean var4;
                byte var5;
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -129) {
                            var3 = false;
                            var4 = true;
                            var5 = 0;
                        } else {
                            var4 = true;
                            var3 = true;
                            var5 = 3;
                        }
                    } else {
                        var3 = false;
                        var5 = 2;
                        var4 = true;
                    }
                } else {
                    var4 = true;
                    var5 = 1;
                    var3 = true;
                }
                if (this.field5946 == !var4) {
                    OpenGL.glColorMask(var4, var4, var4, true);
                    this.field5946 = var4;
                }
                if (!var3 != !this.field6001) {
                    if (var3) {
                        OpenGL.glEnable(3008);
                    } else {
                        OpenGL.glDisable(3008);
                    }
                    this.field6001 = var3;
                }
                if (~this.field5952 != ~var5) {
                    if (var5 != 1) {
                        if (var5 == 2) {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(1, 1);
                        } else if (var5 == 3) {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        } else {
                            OpenGL.glDisable(3042);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(770, 771);
                    }
                    this.field5952 = var5;
                }
                this.field5887 = arg1;
                this.field5921 &= -29;
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(Z)V")
    public static void method2357(boolean arg0) {
        field5848 = null;
        field5826 = null;
        if (!arg0) {
            method2357(false);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZZ)V")
    public final void method2358(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method482((class531) null, false);
        }
        ++field5656;
        if (!arg0 != !this.field5930) {
            this.field5930 = arg0;
            this.method2432(2896);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(IIIIIIIIII)V")
    public static final void method2359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5704;
        if (class478.method2809(arg7, false)) {
            if (class25.field396[arg7] != null) {
                client.method1201(class25.field396[arg7], -1, arg2, arg1, arg6, arg3, arg5, arg4, arg9, arg8);
            } else {
                client.method1201(class522.field7701[arg7], -1, arg2, arg1, arg6, arg3, arg5, arg4, arg9, arg8);
            }
            if (arg0 != -1) {
                method2359(117, -10, 82, 88, 35, 17, 32, 10, -118, -110);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "ba", descriptor = "(IIII)V")
    public final void method466(int arg0, int arg1, int arg2, int arg3) {
        ++field5708;
        if (!this.field5898) {
            throw new RuntimeException("");
        } else {
            this.field5974 = arg2;
            this.field5957 = arg3;
            this.field5910 = arg1;
            this.field5962 = arg0;
            this.field5857.field6838.method542(-25279);
            this.method2410(-104);
        }
    }

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "(I)V")
    private final void method2360(int arg0) {
        if (this.field5921 != 1) {
            this.method2400(0);
            this.method2395(8, false);
            this.method2433(false, (byte) -48);
            this.method2411(10217, false);
            this.method2431(false, -31688);
            this.method2412((byte) 4, (class188) null);
            this.method2366(-2, 1874);
            this.method2365(true, 1);
            this.field5921 = 1;
        }
        int var2 = 90 / ((arg0 - -67) / 36);
        ++field5669;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public final void method527(int arg0) {
        ++field5688;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field5854 = arg0;
            this.field5856.method1425(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZZZ)V")
    public final void method2361(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        if (this.field5972 != arg0) {
            if (arg0 < 0) {
                this.method2381(false);
                this.method2412((byte) 4, (class188) null);
                this.method2365(true, 0);
                if (!this.field5898) {
                    this.field5857.method2751(0, arg1, -111, arg2);
                }
            } else {
                class308 var5 = this.field5856.method1422(6797, arg0);
                class501 var6 = super.field2312.method830(arg0, (byte) 71);
                if (~var6.field7382 == -1 && var6.field7358 == 0) {
                    this.method2381(false);
                } else {
                    int var7 = var6.field7380 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2418((float) (this.field5863 % var8 * var6.field7358) / (float) var8, (byte) 114, (float) (this.field5863 % var8 * var6.field7382) / (float) var8, 0.0F);
                }
                if (this.field5898) {
                    this.field5857.method2751(3, arg1, -122, arg2);
                    this.method2412((byte) 4, var5);
                    this.method2365(true, var6.field7369);
                } else {
                    this.field5857.method2751(var6.field7366, arg1, -110, arg2);
                    this.field5857.method2752(var6.field7383, var6.field7377, Integer.MAX_VALUE);
                    if (!this.field5857.method2750(var5, (byte) -42, var6.field7369)) {
                        this.method2412((byte) 4, var5);
                        this.method2365(true, var6.field7369);
                    }
                }
            }
            this.field5972 = arg0;
        }
        ++field5754;
        if (arg3) {
            this.field5857 = null;
        }
        this.field5921 &= -8;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBII)V")
    public final void method2362(int arg0, byte arg1, int arg2, int arg3) {
        ++field5701;
        OpenGL.glTexEnvi(8960, 34176 - -arg3, arg0);
        if (arg1 != 65) {
            method2359(-96, -107, -9, 0, -64, 79, -43, 104, -52, 88);
        }
        OpenGL.glTexEnvi(8960, 34192 - -arg3, arg2);
    }

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "(I)V")
    private final void method2363(int arg0) {
        if (arg0 == 0) {
            ++field5828;
            OpenGL.glViewport(this.field5941, this.field5938, this.field5730, this.field5680);
        }
    }

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "(I)V")
    private final void method2364(int arg0) {
        if (arg0 == 0) {
            ++field5725;
            if (this.field5829 == null) {
                this.field5843 = this.field5727 = 0;
            } else {
                Dimension var2 = this.field5829.getSize();
                this.field5727 = var2.height;
                this.field5843 = var2.width;
            }
            if (this.field5873 == null) {
                this.field5730 = this.field5843;
                this.field5680 = this.field5727;
                this.method2363(arg0);
            }
            this.method2404(-36);
            this.method526();
        }
    }

    @OriginalMember(owner = "client!ht", name = "aa", descriptor = "(IIIIII[BII)V")
    public final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5762;
        float var10;
        float var11;
        if (this.field5989 != null && ~arg2 >= ~this.field5989.field4219 && this.field5989.field4220 >= arg3) {
            this.field5989.method1746(arg6, false, 6406, 0, arg3, 0, false, 0, arg2, 0);
            var10 = (float) arg2 * this.field5989.field4467 / (float) this.field5989.field4219;
            var11 = (float) arg3 * this.field5989.field4466 / (float) this.field5989.field4220;
        } else {
            this.field5989 = class288.method1647(arg3, arg6, 6406, 6406, (byte) 21, this, arg2, false);
            this.field5989.method1751(false, false, (byte) 90);
            var10 = this.field5989.field4467;
            var11 = this.field5989.field4466;
        }
        this.method2423(8448);
        this.method2412((byte) 4, this.field5989);
        this.method2356((byte) -21, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2408(arg5, (byte) 85);
        this.method2383(34165, 83, 34165);
        this.method2362(34166, (byte) 65, 768, 0);
        this.method2362(5890, (byte) 65, 770, 2);
        this.method2379(770, (byte) -82, 34166, 0);
        this.method2379(770, (byte) -110, 5890, 2);
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
        this.method2362(5890, (byte) 65, 768, 0);
        this.method2362(34166, (byte) 65, 770, 2);
        this.method2379(770, (byte) -104, 5890, 0);
        this.method2379(770, (byte) -66, 34166, 2);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIILea;II)V")
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class382 arg6, int arg7, int arg8) {
        ++field5657;
        class482 var10 = (class482) arg6;
        class325 var11 = var10.field7073;
        this.method2423(8448);
        this.method2412((byte) 4, var10.field7073);
        this.method2356((byte) -21, arg5);
        this.method2383(7681, 112, 8448);
        this.method2362(34167, (byte) 65, 768, 0);
        float var12 = var11.field4467 / (float) var11.field4461;
        float var13 = var11.field4466 / (float) var11.field4470;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2362(5890, (byte) 65, 768, 0);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V")
    public final void method2365(boolean arg0, int arg1) {
        if (~arg1 != -2) {
            if (arg1 == 0) {
                this.method2383(8448, 91, 8448);
            } else if (arg1 != 2) {
                if (arg1 != 3) {
                    if (arg1 == 4) {
                        this.method2383(34023, 73, 34023);
                    }
                } else {
                    this.method2383(260, 69, 8448);
                }
            } else {
                this.method2383(34165, 72, 7681);
            }
        } else {
            this.method2383(7681, 93, 7681);
        }
        if (arg0) {
            ++field5838;
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;ILkj;)V")
    public class410(int arg0, Canvas arg1, class126 arg2, int arg3, class397 arg4) {
        super(arg0, arg2);
        new class225();
        new class159(16);
        this.field5877 = new class522();
        this.field5879 = new class522();
        this.field5880 = new class522();
        this.field5881 = new class522();
        this.field5882 = new class522();
        this.field5883 = new class522();
        this.field5884 = new class522();
        this.field5904 = new float[4];
        this.field5906 = 1.0F;
        this.field5913 = 512;
        this.field5919 = 1.0F;
        this.field5909 = 50;
        this.field5908 = new float[16];
        this.field5910 = -1;
        this.field5890 = 8448;
        this.field5951 = 0;
        this.field5940 = new float[4];
        this.field5936 = 0;
        this.field5948 = new float[4];
        this.field5896 = 3584;
        this.field5961 = -1;
        this.field5965 = 0.0F;
        this.field5920 = -1.0F;
        this.field5953 = -1;
        this.field5892 = -1.0F;
        this.field5949 = 3000.0F;
        this.field5981 = 0;
        this.field5944 = 8448;
        this.field5941 = 0;
        this.field5959 = 1.0F;
        this.field5988 = -1;
        this.field5984 = 0;
        this.field5997 = 1.0F;
        this.field5996 = 1.0F;
        this.field5922 = 3584.0F;
        this.field5974 = -1;
        this.field5954 = new class432[class100.field1371];
        this.field5938 = 0;
        this.field5969 = new float[4];
        this.field5995 = 0;
        this.field5957 = 0;
        this.field5889 = 3584.0F;
        this.field5899 = 512;
        this.field5903 = 0;
        this.field5888 = true;
        this.field5987 = 0;
        this.field5847 = arg3;
        this.field5829 = this.field5684 = arg1;
        try {
            if (class142.field2031 == null || !class142.field2031) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method2289(false, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2289(false, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method2289(false, "libjaggl.so").toString());
                    }
                    class142.field2031 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class142.field2031 = Boolean.TRUE;
                }
            }
            if (class142.field2031 != null && class142.field2031) {
                this.field5733 = new OpenGL();
                this.field5655 = this.field5667 = this.field5733.init(arg1, 8, 8, 8, 24, 0, this.field5847);
                if (~this.field5667 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2394(-25821);
                    int var7 = this.method2397((byte) 0);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field5963 = !this.field5931 ? 5121 : 33639;
                        if (this.field5950.indexOf("radeon") != -1) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class96.method654(this.field5950.replace('/', ' '), ' ', false);
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class258.method1501(84, var13.substring(1, 3))) {
                                            var13 = var13.substring(1);
                                            var10 = true;
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var9 = true;
                                                var13 = var13.substring(2);
                                            }
                                            if (var13.length() >= 4 && class258.method1501(76, var13.substring(0, 4))) {
                                                var8 = class47.method298(false, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && var8 <= 9250) {
                                    this.field5912 = false;
                                }
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field5927 = false;
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field6005 = false;
                            }
                            this.field5905 &= this.field5733.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field5999 = this.field5927;
                        }
                        if (this.field5929.indexOf("intel") != -1) {
                            this.field5897 = false;
                        }
                        this.field5986 = !this.field5929.equals("s3 graphics");
                        if (this.field5927) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class51.method315(true, true, 0);
                        this.field5864 = true;
                        this.field5856 = new class241(this, super.field2312);
                        this.method2421(127);
                        this.field5861 = new class519(this);
                        this.field5853 = new class68(this);
                        if (this.field5853.method425((byte) -96)) {
                            this.field5852 = new class249(this);
                            if (!this.field5852.method1460((byte) 57)) {
                                this.field5852.method1468(false);
                                this.field5852 = null;
                            }
                        }
                        this.field5857 = new class468(this);
                        this.method2372((byte) -65);
                        this.method2364(0);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field5733.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class496.method2931((byte) 123, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var20) {
            var20.printStackTrace();
            this.method535();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "(IIIII)V")
    public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5817;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "()Z")
    public final boolean method529() {
        ++field5836;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(II)V")
    public final void method2366(int arg0, int arg1) {
        if (arg1 == 1874) {
            this.method2417(arg1 + -1999, arg0, true);
            ++field5676;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLts;)V")
    public final void method2367(byte arg0, class372 arg1) {
        ++field5756;
        if (~this.field5872 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field5872 <= -1) {
                this.field5869[this.field5872].method2152((byte) -29);
            }
            this.field5870 = this.field5869[++this.field5872] = arg1;
            this.field5870.method2153(-6210);
            if (arg0 != 21) {
                this.field5860 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZIILjaggl/memory/NativeBuffer;I)Lbm;")
    public final class74 method2368(boolean arg0, int arg1, int arg2, NativeBuffer arg3, int arg4) {
        ++field5765;
        if (!this.field5927 || arg0 && !this.field5999) {
            if (arg2 != 0) {
                this.field5875 = 104;
            }
            return new class91(this, arg1, arg3);
        } else {
            return new class520(this, arg1, arg3, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(Z)V")
    private final void method2369(boolean arg0) {
        ++field5768;
        if (this.field5970 != 2) {
            this.field5970 = 2;
            this.method2405(14757);
            this.method2387(-1);
            this.field5921 &= -8;
        }
        if (!arg0) {
            this.field5849 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "(I)Lil;")
    public final class7 method2370(int arg0) {
        if (arg0 != 5) {
            return null;
        } else {
            ++field5713;
            return this.field5967 == null ? null : this.field5967.method665(26263);
        }
    }

    @OriginalMember(owner = "client!ht", name = "da", descriptor = "(IIIII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5780;
        this.method2360(54);
        this.method2356((byte) -21, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ht", name = "fa", descriptor = "(IIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3) {
        this.field5962 = arg0;
        this.field5898 = true;
        this.field5974 = arg2;
        this.field5957 = arg3;
        this.field5910 = arg1;
        ++field5697;
        this.field5857.method2751(3, false, -113, false);
        this.field5857.field6838.method542(-25279);
        this.method2410(127);
        this.method2426(-59);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(FI)V")
    public final void method2371(float arg0, int arg1) {
        if (arg1 > 105) {
            if (this.field5919 != arg0) {
                this.field5919 = arg0;
                if (this.field5970 == 3) {
                    this.method2416(5889);
                }
            }
            ++field5807;
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)V")
    private final void method2372(byte arg0) {
        this.method2366(-2, 1874);
        ++field5690;
        for (int var2 = this.field5885 + -1; var2 >= 0; --var2) {
            this.method2398(var2, (byte) -12);
            this.method2412((byte) 4, (class188) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2383(8448, 109, 8448);
        this.method2362(34168, (byte) 65, 770, 2);
        this.method2381(false);
        this.field5887 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field5952 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field6001 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5946 = true;
        this.method2395(95, true);
        this.method2433(true, (byte) -111);
        this.method2411(10217, true);
        this.method2431(true, -31688);
        this.method2404(115);
        this.field5733.setSwapInterval(0);
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
        if (arg0 > -1) {
            this.method2420(121, 43, -99, (class502) null, -15);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field5988 = this.field5961 = -1;
        this.method526();
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
    public final synchronized void method2373(int arg0, int arg1, int arg2) {
        ++field5816;
        class330 var4 = new class330(arg1);
        var4.field7342 = (long) arg2;
        this.field5880.method3070(var4, (byte) -120);
        if (arg0 <= 59) {
            this.field5829 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "na", descriptor = "(I)V")
    public final void method522(int arg0) {
        ++field5671;
        this.field5866 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field5866;
        }
        this.field5865 = 1 << this.field5866;
    }

    @OriginalMember(owner = "client!ht", name = "FA", descriptor = "()I")
    public final int method484() {
        ++field5724;
        return this.field5876 - -this.field5875 + this.field5878;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(FFFFI)V")
    public final void method2374(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class456.field6666[1] = arg1;
        class456.field6666[0] = arg3;
        if (arg4 > 124) {
            ++field5692;
            class456.field6666[2] = arg2;
            class456.field6666[3] = arg0;
            OpenGL.glTexEnvfv(8960, 8705, class456.field6666, 0);
        }
    }

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "()V")
    public final void method508() {
        ++field5753;
        if (this.field5852 != null && this.field5852.method2714(64)) {
            this.field5853.method427((byte) 107, this.field5852);
            this.field5856.method1425(false);
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(B)V")
    public final void method2375(byte arg0) {
        ++field5668;
        if (arg0 != 123) {
            this.method2435(91);
        }
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "()Z")
    public final boolean method471() {
        ++field5827;
        return this.field5852 != null && (this.field5847 <= 1 || this.field5979);
    }

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "()Z")
    public final boolean method487() {
        ++field5781;
        if (this.field5852 != null) {
            if (!this.field5852.method2714(64)) {
                if (!this.field5853.method429(-18461, this.field5852)) {
                    return false;
                }
                this.field5856.method1425(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(II)V")
    public final synchronized void method2376(int arg0, int arg1) {
        ++field5674;
        int var3 = 55 / ((56 - arg0) / 62);
        class499 var4 = new class499();
        var4.field7342 = (long) arg1;
        this.field5883.method3070(var4, (byte) -119);
    }

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "(I)V")
    private final void method2377(int arg0) {
        if (this.field5994 == 0.0F) {
            this.field5908[10] = this.field5983;
            this.field5908[14] = this.field5923;
        } else {
            float var2 = this.field5949 / (this.field5994 + this.field5949);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field5923 * (1.0F - var2) / this.field5994;
            this.field5908[10] = this.field5983 + var4;
            this.field5908[14] = this.field5923 * var3;
        }
        ++field5734;
        this.field5889 = (this.field5908[14] + (float) (-this.field5896)) / this.field5908[10];
        this.field5922 = (float) this.field5896 + -this.field5994;
        int var5 = 118 / ((arg0 - 22) / 49);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Law;I)V")
    public final void method2378(class53 arg0, int arg1) {
        ++field5729;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method326(-5445), 0);
        if (arg1 <= 50) {
            this.field5862 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lqb;)V")
    public final void method436(class148 arg0) {
        this.field5849.method1063(-65, arg0, this);
        ++field5791;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lgv;[Lmp;Z)Loa;")
    public final class490 method519(class56 arg0, class531[] arg1, boolean arg2) {
        ++field5738;
        return new class447(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ht", name = "SA", descriptor = "(IIIIII)Z")
    public final boolean method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5717;
        float var7 = (float) arg2 * this.field5917.field730 + (float) arg0 * this.field5917.field727 + (float) arg1 * this.field5917.field721 + this.field5917.field723;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5917.field730 + (float) arg3 * this.field5917.field727 + (float) arg4 * this.field5917.field721 + this.field5917.field723;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5909 > var7) || !((float) this.field5909 > var8)) && (!(var7 > (float) this.field5896) || !(var8 > (float) this.field5896))) {
            int var9 = (int) (((float) arg2 * this.field5917.field729 + (float) arg0 * this.field5917.field709 + (float) arg1 * this.field5917.field738 + this.field5917.field707) * (float) this.field5899 / var7);
            int var10 = (int) (((float) arg5 * this.field5917.field729 + (float) arg3 * this.field5917.field709 + (float) arg4 * this.field5917.field738 + this.field5917.field707) * (float) this.field5899 / var8);
            if ((float) var9 < this.field5894 && (float) var10 < this.field5894 || (float) var9 > this.field5915 && this.field5915 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5917.field735 + (float) arg0 * this.field5917.field731 + (float) arg1 * this.field5917.field732 + this.field5917.field718) * (float) this.field5913 / var7);
                int var12 = (int) (((float) arg5 * this.field5917.field735 + (float) arg3 * this.field5917.field731 + (float) arg4 * this.field5917.field732 + this.field5917.field718) * (float) this.field5913 / var8);
                return (!((float) var11 < this.field5980) || !((float) var12 < this.field5980)) && (!(this.field5895 < (float) var11) || !(this.field5895 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ht", name = "xa", descriptor = "()I")
    public final int method509() {
        ++field5664;
        int var1 = this.field5942;
        this.field5942 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "()Z")
    public final boolean method450() {
        ++field5793;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "S", descriptor = "()V")
    public final void method510() {
        this.field5898 = false;
        ++field5801;
        this.field5857.method2751(0, false, -122, false);
        this.method2410(-80);
        this.method2426(-88);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(IBII)V")
    public final void method2379(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -48) {
            this.method2421(-118);
        }
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg2);
        ++field5839;
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg0);
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(B)V")
    private final void method2380(byte arg0) {
        ++field5769;
        if (arg0 == -23) {
            this.field5733.detach();
        }
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "()V")
    public final void method446() {
        this.method2431(true, -31688);
        ++field5666;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ht", name = "JA", descriptor = "(II)V")
    public final void method458(int arg0, int arg1) {
        if (this.field5909 != arg0 || ~this.field5896 != ~arg1) {
            this.field5896 = arg1;
            this.field5909 = arg0;
            this.method2414(true);
            this.method2410(125);
            if (~this.field5970 != -4) {
                if (~this.field5970 == -3) {
                    this.method2405(14757);
                }
            } else {
                this.method2416(5889);
            }
        }
        ++field5747;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method473(Canvas arg0) {
        ++field5776;
        if (this.field5684 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5796.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5733.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field5796.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(Z)V")
    private final void method2381(boolean arg0) {
        if (this.field5978) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5978 = false;
        }
        if (arg0) {
            this.field5863 = -106;
        }
        ++field5788;
    }

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "()V")
    public final void method433() {
        ++field5799;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BII)V")
    public final synchronized void method2382(byte arg0, int arg1, int arg2) {
        ++field5749;
        class330 var4 = new class330(arg1);
        if (arg0 >= -111) {
            this.method450();
        }
        var4.field7342 = (long) arg2;
        this.field5882.method3070(var4, (byte) -119);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(III)V")
    public final void method2383(int arg0, int arg1, int arg2) {
        ++field5809;
        if (arg1 <= 59) {
            this.field5891 = false;
        }
        if (~this.field5932 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (this.field5944 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field5944 = arg0;
            }
            if (~this.field5890 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field5890 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field5921 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
    public final void method500(boolean arg0) {
        ++field5771;
    }

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "(FF)V")
    public final void method440(float arg0, float arg1) {
        if (this.field5949 != arg0 || this.field5994 != arg1) {
            this.field5949 = arg0;
            this.field5994 = arg1;
            this.method2377(100);
            if (~this.field5970 == -4) {
                this.method2416(5889);
            } else if (~this.field5970 == -3) {
                this.method2405(14757);
            }
        }
        ++field5746;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZI)V")
    public final synchronized void method2384(int arg0, boolean arg1, int arg2) {
        ++field5709;
        class330 var4 = new class330(arg2);
        var4.field7342 = (long) arg0;
        this.field5879.method3070(var4, (byte) -124);
        if (!arg1) {
            this.field5909 = 120;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILbm;)V")
    public final void method2385(int arg0, class74 arg1) {
        if (this.field5971 != arg1) {
            if (this.field5927) {
                OpenGL.glBindBufferARB(34962, arg1.method553((byte) -43));
            }
            this.field5971 = arg1;
        }
        ++field5840;
        if (arg0 != 34962) {
            this.field5969 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "()Z")
    public final boolean method531() {
        ++field5779;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class529 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5783;
        return new class379(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "()I")
    public final int method432() {
        ++field5700;
        int var1 = this.field5902;
        this.field5902 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "()Z")
    public final boolean method481() {
        ++field5737;
        return this.field5857.method2749(53, 3);
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)V")
    public final void method534(int arg0) {
        this.method2394(-25821);
        ++field5789;
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(II)I")
    public final int method2386(int arg0, int arg1) {
        ++field5689;
        if (arg0 != 5121 && arg0 != 5120) {
            if (~arg0 != -5124 && arg0 != 5122) {
                if (arg1 > -40) {
                    return -93;
                } else if (~arg0 != -5126 && arg0 != 5124 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "()Z")
    public final boolean method536() {
        ++field5831;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "()Z")
    public final boolean method470() {
        ++field5745;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "(I)V")
    private final void method2387(int arg0) {
        ++field5782;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg0 != -1) {
            this.field5998 = true;
        }
        OpenGL.glMultMatrixf(this.field5917.method326(-5445), 0);
        if (this.field5898) {
            this.field5857.field6838.method542(-25279);
        }
        this.method2437((byte) -97);
        this.method2390((byte) -68);
    }

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "(I)V")
    public final void method2388(int arg0) {
        ++field5705;
        if (arg0 != -7174) {
            this.method2358(true, true);
        }
        if (this.field5921 != 8) {
            this.method2369(true);
            this.method2395(-111, true);
            this.method2411(10217, true);
            this.method2431(true, arg0 + -24514);
            this.method2356((byte) -21, 1);
            this.method2365(true, 0);
            this.field5921 = 8;
        }
    }

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "(ILea;II)V")
    public final void method517(int arg0, class382 arg1, int arg2, int arg3) {
        ++field5823;
        class482 var5 = (class482) arg1;
        class325 var6 = var5.field7073;
        this.method2423(8448);
        this.method2412((byte) 4, var5.field7073);
        this.method2356((byte) -21, 1);
        this.method2383(7681, 113, 8448);
        this.method2362(34167, (byte) 65, 768, 0);
        float var7 = var6.field4467 / (float) var6.field4461;
        float var8 = var6.field4466 / (float) var6.field4470;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field5995 - arg2) * var7, (float) (-arg3 + this.field5987) * var8);
        OpenGL.glVertex2i(this.field5995, this.field5987);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5995) * var7, (float) (-arg3 + this.field5936) * var8);
        OpenGL.glVertex2i(this.field5995, this.field5936);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5951) * var7, (float) (-arg3 + this.field5936) * var8);
        OpenGL.glVertex2i(this.field5951, this.field5936);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5951) * var7, (float) (-arg3 + this.field5987) * var8);
        OpenGL.glVertex2i(this.field5951, this.field5987);
        OpenGL.glEnd();
        this.method2362(5890, (byte) 65, 768, 0);
    }

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "()F")
    public final float method439() {
        ++field5751;
        return this.field5994;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI[BII)Lbm;")
    public final class74 method2389(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        ++field5732;
        if (arg3 != 1145) {
            this.method512((class121) null, (class148) null, (class415) null, (class525) null, -37);
        }
        return (class74) (!this.field5927 || arg0 && !this.field5999 ? new class91(this, arg1, arg2, arg4) : new class520(this, arg1, arg2, arg4, arg0));
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "()Z")
    public final boolean method441() {
        ++field5759;
        return false;
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(B)V")
    private final void method2390(byte arg0) {
        int var2 = 43 / ((arg0 - 12) / 55);
        ++field5763;
        int var3;
        for (var3 = 0; ~var3 > ~this.field5977; ++var3) {
            class432 var4 = this.field5954[var3];
            int var5 = 16386 - -var3;
            class304.field4165[0] = (float) var4.method2578(true);
            class304.field4165[1] = (float) var4.method2573(-118);
            class304.field4165[2] = (float) var4.method2572(false);
            class304.field4165[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class304.field4165, 0);
            int var6 = var4.method2577(127);
            float var7 = var4.method2575(-67) / 255.0F;
            class304.field4165[2] = (float) class118.method750(var6, 255) * var7;
            class304.field4165[1] = (float) (class118.method750(var6, 65480) >> 8) * var7;
            class304.field4165[0] = var7 * (float) class118.method750(var6 >> 16, 255);
            OpenGL.glLightfv(var5, 4609, class304.field4165, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var4.method2574(false) * var4.method2574(false)));
            OpenGL.glEnable(var5);
        }
        while (this.field6002 > var3) {
            OpenGL.glDisable(var3 + 16386);
            ++var3;
        }
        this.field6002 = this.field5977;
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "()I")
    public final int method447() {
        ++field5677;
        return this.field5909;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5814;
    }

    @OriginalMember(owner = "client!ht", name = "la", descriptor = "()F")
    public final float method499() {
        ++field5821;
        return this.field5949;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([Lc;Lqb;Lia;[Lnh;I)V")
    public final void method457(class121[] arg0, class148 arg1, class415 arg2, class525[] arg3, int arg4) {
        this.method453(arg0, arg2, arg3, arg4);
        ++field5804;
        this.method436(arg1);
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(B)V")
    private final void method2391(byte arg0) {
        ++field5720;
        OpenGL.glDepthMask(this.field5939 && this.field5888);
        if (arg0 != 38) {
            this.method2437((byte) 40);
        }
    }

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "(I)Lae;")
    public static final class163 method2392(int arg0) {
        ++field5694;
        int var1 = 67 / ((1 - arg0) / 53);
        class163 var2 = (class163) class142.field2032.method1328((byte) -121);
        if (var2 != null) {
            var2.method2946(-123);
            var2.method581(4);
            return var2;
        } else {
            class163 var3;
            do {
                var3 = (class163) class341.field4702.method1328((byte) -104);
                if (var3 == null) {
                    return null;
                }
                if (var3.method1014(458752) > class333.method1850(-3562)) {
                    return null;
                }
                var3.method2946(-123);
                var3.method581(4);
            } while (~(var3.field1140 & Long.MIN_VALUE) == -1L);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIF)Lpe;")
    public final class432 method455(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5679;
        return new class175(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "()V")
    public final void method535() {
        for (class499 var1 = this.field5860.method3072((byte) 52); var1 != null; var1 = this.field5860.method3066(2)) {
            ((class471) var1).method2775(-4);
        }
        ++field5712;
        if (this.field5853 != null) {
            this.field5853.method421(0);
        }
        if (this.field5733 != null) {
            this.method2380((byte) -23);
            Enumeration var2 = this.field5796.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5796.get(var3);
                this.field5733.releaseSurface(var3, var4);
            }
            this.field5733.release();
            this.field5733 = null;
        }
        if (this.field5864) {
            class455.method2686(true, 22485, true);
            this.field5864 = false;
        }
    }

    @OriginalMember(owner = "client!ht", name = "V", descriptor = "(III)V")
    public final void method448(int arg0, int arg1, int arg2) {
        ++field5662;
        if (~this.field5961 != ~arg0 || this.field5953 != arg1 || this.field5903 != arg2) {
            this.field5953 = arg1;
            this.field5903 = arg2;
            this.field5961 = arg0;
            if (this.field5898) {
                return;
            }
            this.method2410(125);
            this.method2426(-103);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)I")
    public final int method472(int arg0, int arg1) {
        ++field5825;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "(I)V")
    public final void method2393(int arg0) {
        ++field5842;
        if (arg0 != 23741) {
            this.field5849 = null;
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "(I)V")
    private final void method2394(int arg0) {
        ++field5787;
        if (arg0 == -25821) {
            int var2 = 0;
            while (!this.field5733.attach()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class496.method2931((byte) 126, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
    public final void method2395(int arg0, boolean arg1) {
        if (!arg1 != !this.field5914) {
            this.field5914 = arg1;
            this.method2426(-92);
            this.field5921 &= -32;
        }
        ++field5687;
        int var3 = 76 % ((-39 - arg0) / 43);
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "(II)V")
    public final synchronized void method2396(int arg0, int arg1) {
        ++field5815;
        if (arg1 > -51) {
            this.method2361(7, true, true, true);
        }
        class330 var3 = new class330(arg0);
        this.field5881.method3070(var3, (byte) -119);
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "(B)I")
    private final int method2397(byte arg0) {
        ++field5660;
        this.field5929 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field5950 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field5929.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field5929.indexOf("brian paul") != 0 || ~this.field5929.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class96.method654(var3.replace('.', ' '), ' ', false);
        if (var4.length >= 2) {
            try {
                int var5 = class47.method298(false, var4[0]);
                int var6 = class47.method298(false, var4[1]);
                this.field5911 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field5911 > -13) {
            var2 |= 2;
        }
        if (!this.field5733.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5733.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5885 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5916 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5955 = var7[0];
        if (this.field5885 < 2 || ~this.field5916 > -3 || ~this.field5955 > -3) {
            var2 |= 16;
        }
        this.field5931 = NativeStream.method2623();
        this.field5733.arePbuffersAvailable();
        if (arg0 != 0) {
            this.method2387(31);
        }
        this.field5927 = this.field5733.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field5935 = this.field5733.isExtensionAvailable("GL_ARB_multisample");
        this.field5998 = this.field5733.isExtensionAvailable("GL_ARB_vertex_program");
        this.field5733.isExtensionAvailable("GL_ARB_fragment_program");
        this.field5907 = this.field5733.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field5918 = this.field5733.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field5912 = this.field5733.isExtensionAvailable("GL_EXT_texture3D");
        this.field5905 = this.field5733.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field5933 = this.field5733.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field6005 = this.field5733.isExtensionAvailable("GL_ARB_texture_float");
        this.field5991 = false;
        this.field5897 = this.field5733.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field5901 = this.field5733.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field5956 = this.field5733.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field5979 = this.field5956 & this.field5901;
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)V")
    public final void method2398(int arg0, byte arg1) {
        int var3 = 6 % ((arg1 - 63) / 34);
        if (~this.field5932 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field5932 = arg0;
        }
        ++field5735;
    }

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "()Z")
    public final boolean method513() {
        ++field5723;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "(I)V")
    private final void method2399(int arg0) {
        ++field5855;
        if (this.field5970 != 3) {
            this.field5970 = 3;
            this.method2416(5889);
            this.method2387(-1);
            this.field5921 &= -8;
        }
        if (arg0 != -8) {
            this.field5884 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "()Z")
    public final boolean method465() {
        ++field5691;
        return false;
    }

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "(I)V")
    private final void method2400(int arg0) {
        if (this.field5970 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field5730 > 0 && ~this.field5680 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field5730, (double) this.field5680, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5921 &= -25;
            this.field5970 = 1;
        }
        ++field5755;
        if (arg0 != 0) {
            this.field5920 = -0.39123803F;
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method538(Canvas arg0) {
        ++field5681;
        long var2 = 0L;
        if (arg0 != null && this.field5684 != arg0) {
            if (this.field5796.containsKey(arg0)) {
                Long var4 = (Long) this.field5796.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5667;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field5733.surfaceResized(var2);
            if (this.field5829 == arg0) {
                this.method2364(0);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIB)V")
    public final void method2401(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 102 % ((arg3 - -5) / 57);
        ++field5707;
        OpenGL.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II[BZI)Lnk;")
    public final class502 method2402(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        if (arg0 != 1) {
            this.field5847 = 41;
        }
        ++field5770;
        return (class502) (!this.field5927 || arg3 && !this.field5999 ? new class342(this, arg4, arg2, arg1) : new class474(this, arg4, arg2, arg1, arg3));
    }

    @OriginalMember(owner = "client!ht", name = "va", descriptor = "()V")
    public final void method526() {
        this.field5995 = 0;
        ++field5741;
        this.field5951 = this.field5730;
        this.field5987 = 0;
        this.field5936 = this.field5680;
        OpenGL.glDisable(3089);
        this.method2407(0);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "()Z")
    public final boolean method474() {
        ++field5665;
        return this.field5852 != null && this.field5852.method2714(64);
    }

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "()Lia;")
    public final class415 method491() {
        ++field5766;
        return new class53();
    }

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "(I)V")
    public final void method2403(int arg0) {
        ++field5659;
        if (this.field5921 != 16) {
            this.method2399(-8);
            this.method2395(-123, true);
            this.method2411(arg0 + 10217, true);
            this.method2431(true, -31688);
            this.method2356((byte) -21, 1);
            this.method2365(true, 0);
            this.field5921 = 16;
        }
        if (arg0 != 0) {
            this.field5910 = 109;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)I")
    public final int method463(int arg0, int arg1) {
        ++field5835;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "(I)V")
    public final void method2404(int arg0) {
        ++field5715;
        int var2 = 111 / ((arg0 - 17) / 32);
        if (~this.field5970 != -1) {
            this.field5921 &= -32;
            this.field5970 = 0;
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
    public final void method486(int arg0) {
        ++field5670;
        this.method2380((byte) -23);
    }

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "(I)V")
    public final void method532(int arg0) {
        ++field5706;
        this.method2356((byte) -21, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(FFF)V")
    public final void method483(float arg0, float arg1, float arg2) {
        class86.field1190 = arg0;
        class414.field6074 = arg2;
        class438.field6395 = arg1;
        ++field5736;
    }

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "(I)V")
    private final void method2405(int arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0 != 14757) {
            this.method437((class415) null);
        }
        ++field5845;
        OpenGL.glLoadMatrixf(this.field5908, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
    public final void method442(int arg0) {
        ++field5774;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public final class35 method518(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5699;
        return new class67(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "(B)V")
    public final void method2406(byte arg0) {
        ++field5803;
        if (~this.field5921 != -5) {
            this.method2400(0);
            this.method2395(-87, false);
            this.method2433(false, (byte) 122);
            this.method2411(10217, false);
            this.method2431(false, -31688);
            this.method2366(-2, 1874);
            this.method2356((byte) -21, 1);
            this.method2365(true, 0);
            this.field5921 = 4;
        }
        int var2 = -19 % ((arg0 - 57) / 50);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lmp;Z)Lf;")
    public final class529 method482(class531 arg0, boolean arg1) {
        ++field5851;
        int[] var3 = new int[arg0.field7821 * arg0.field7815];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field7813 != null) {
            for (int var6 = 0; ~arg0.field7815 < ~var6; ++var6) {
                for (int var7 = 0; arg0.field7821 > var7; ++var7) {
                    var3[var5++] = class25.method183(arg0.field7816[class118.method750(255, arg0.field7817[var4])], arg0.field7813[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~arg0.field7815 < ~var8; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field7821; ++var10) {
                    int var11 = arg0.field7816[255 & arg0.field7817[var4++]];
                    var3[var5++] = var11 != 0 ? class25.method183(var11, -16777216) : 0;
                }
            }
        }
        class529 var9 = this.method476(var3, 0, arg0.field7821, arg0.field7821, arg0.field7815);
        var9.method118(arg0.field7814, arg0.field7820, arg0.field7818, arg0.field7819);
        return var9;
    }

    @OriginalMember(owner = "client!ht", name = "Z", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        if (~arg2 > ~this.field5951) {
            this.field5951 = arg2;
        }
        if (arg3 < this.field5936) {
            this.field5936 = arg3;
        }
        ++field5698;
        if (~this.field5987 > ~arg1) {
            this.field5987 = arg1;
        }
        if (~arg0 < ~this.field5995) {
            this.field5995 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method2407(0);
        this.method2428(0);
    }

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "(I)V")
    private final void method2407(int arg0) {
        this.field5894 = (float) (-this.field5981 + this.field5995);
        this.field5895 = (float) (-this.field5984 + this.field5936);
        this.field5915 = (float) (-this.field5981 + this.field5951);
        ++field5775;
        if (arg0 != 0) {
            this.method2376(-105, -60);
        }
        this.field5980 = (float) (-this.field5984 + this.field5987);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lpv;Lpv;FLpv;)Lpv;")
    public final class50 method464(class50 arg0, class50 arg1, float arg2, class50 arg3) {
        ++field5739;
        if (arg0 != null && arg1 != null && this.field5933 && this.field5897 && this.field5901) {
            class419 var5 = null;
            class100 var6 = (class100) arg0;
            class100 var7 = (class100) arg1;
            class7 var8 = var6.method665(26263);
            class7 var9 = var7.method665(26263);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field71 >= ~var9.field71 ? var9.field71 : var8.field71;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class419) {
                    class419 var11 = (class419) arg3;
                    if (~var11.method2510(false) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class419(this, var10);
                }
                if (var5.method2509(2060, arg2, var9, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(IB)V")
    public final void method2408(int arg0, byte arg1) {
        class456.field6666[1] = (float) class118.method750(arg0, 65280) / 65280.0F;
        class456.field6666[2] = (float) class118.method750(255, arg0) / 255.0F;
        ++field5819;
        class456.field6666[3] = (float) (arg0 >>> 24) / 255.0F;
        if (arg1 != 85) {
            this.method435();
        }
        class456.field6666[0] = (float) class118.method750(16711680, arg0) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class456.field6666, 0);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lc;Lqb;Lia;Lnh;I)V")
    public final void method512(class121 arg0, class148 arg1, class415 arg2, class525 arg3, int arg4) {
        arg0.method781(arg2, arg3, arg4);
        ++field5761;
        this.method436(arg1);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIII)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3) {
        ++field5663;
        this.field5853.method424(arg1, 0, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILts;)V")
    public final void method2409(int arg0, class372 arg1) {
        ++field5728;
        if (arg0 != 32718) {
            this.method535();
        }
        if (this.field5872 >= 0 && this.field5869[this.field5872] == arg1) {
            this.field5869[this.field5872--] = null;
            arg1.method2152((byte) -90);
            if (~this.field5872 <= -1) {
                this.field5870 = this.field5869[this.field5872];
                this.field5870.method2153(-6210);
            } else {
                this.field5870 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ht", name = "NA", descriptor = "(IIIIII)V")
    public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5722;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2360(37);
        float var10 = (float) arg3 + var8;
        this.method2356((byte) -21, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5935) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5935) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "(I)V")
    private final void method2410(int arg0) {
        ++field5696;
        int var2;
        if (!this.field5898) {
            this.field5925 = (float) (this.field5896 - this.field5903) - this.field5965;
            this.field5900 = -((float) this.field5953 * this.field5996) + this.field5925;
            if (this.field5900 < (float) this.field5909) {
                this.field5900 = (float) this.field5909;
            }
            OpenGL.glFogf(2915, this.field5900);
            OpenGL.glFogf(2916, this.field5925);
            var2 = this.field5961;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field5910;
        }
        class456.field6666[0] = (float) class118.method750(16711680, var2) / 1.671168E7F;
        int var3 = -101 % ((arg0 - 72) / 52);
        class456.field6666[2] = (float) class118.method750(var2, 255) / 255.0F;
        class456.field6666[1] = (float) class118.method750(65280, var2) / 65280.0F;
        OpenGL.glFogfv(2918, class456.field6666, 0);
        if (this.field5898) {
            this.field5857.field6838.method541((byte) -46);
        }
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method449(Canvas arg0) {
        ++field5811;
        this.field5829 = null;
        this.field5655 = 0L;
        if (arg0 != null && this.field5684 != arg0) {
            if (this.field5796.containsKey(arg0)) {
                Long var2 = (Long) this.field5796.get(arg0);
                this.field5655 = var2;
                this.field5829 = arg0;
            }
        } else {
            this.field5829 = this.field5684;
            this.field5655 = this.field5667;
        }
        if (this.field5829 != null && this.field5655 != 0L) {
            this.field5733.setSurface(this.field5655);
            this.method2364(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "()Lia;")
    public final class415 method539() {
        ++field5716;
        return this.field5858;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(IZ)V")
    public final void method2411(int arg0, boolean arg1) {
        if (this.field5891 != arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field5921 &= -32;
            this.field5891 = arg1;
        }
        if (arg0 != 10217) {
            this.method2369(true);
        }
        ++field5792;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLao;)V")
    public final void method2412(byte arg0, class188 arg1) {
        ++field5711;
        if (arg0 != 4) {
            this.method462(3, -58, 14, 88);
        }
        class188 var3 = this.field5934[this.field5932];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field2613);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field2613);
                } else if (arg1.field2613 != var3.field2613) {
                    OpenGL.glDisable(var3.field2613);
                    OpenGL.glEnable(arg1.field2613);
                }
                OpenGL.glBindTexture(arg1.field2613, arg1.method1133(-45));
            }
            this.field5934[this.field5932] = arg1;
        }
        this.field5921 &= -2;
    }

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "(I)V")
    private final void method2413(int arg0) {
        class456.field6666[2] = this.field5997 * this.field5960;
        class456.field6666[0] = this.field5960 * this.field5959;
        ++field5693;
        class456.field6666[3] = 1.0F;
        class456.field6666[1] = this.field5960 * this.field5906;
        OpenGL.glLightModelfv(2899, class456.field6666, 0);
        int var2 = 32 % ((arg0 - 12) / 35);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method461(Rectangle[] arg0, int arg1) {
        ++field5695;
        this.method435();
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(IIIIII)V")
    public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2360(-109);
        ++field5818;
        this.method2356((byte) -21, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "(Z)V")
    private final void method2414(boolean arg0) {
        ++field5778;
        if (!arg0) {
            this.method538((Canvas) null);
        }
        float[] var2 = this.field5908;
        float var3 = (float) (-this.field5981 * this.field5909) / (float) this.field5899;
        float var4 = (float) ((-this.field5981 + this.field5730) * this.field5909) / (float) this.field5899;
        float var5 = (float) (this.field5984 * this.field5909) / (float) this.field5913;
        float var6 = (float) ((-this.field5680 + this.field5984) * this.field5909) / (float) this.field5913;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5909 * 2.0F;
            var2[1] = 0.0F;
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[15] = 0.0F;
            var2[6] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[12] = 0.0F;
            var2[11] = -1.0F;
            var2[14] = this.field5923 = -((float) this.field5896 * var7) / (float) (-this.field5909 + this.field5896);
            var2[4] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[7] = 0.0F;
            var2[10] = this.field5983 = (float) (-(this.field5909 + this.field5896)) / (float) (this.field5896 - this.field5909);
            var2[2] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
        } else {
            var2[2] = 0.0F;
            var2[15] = 1.0F;
            var2[13] = 0.0F;
            var2[0] = 1.0F;
            var2[5] = 1.0F;
            var2[9] = 0.0F;
            var2[10] = 1.0F;
            var2[11] = 0.0F;
            var2[3] = 0.0F;
            var2[7] = 0.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[6] = 0.0F;
            var2[12] = 0.0F;
            var2[8] = 0.0F;
            var2[14] = 0.0F;
        }
        this.method2377(-89);
    }

    @OriginalMember(owner = "client!ht", name = "pa", descriptor = "(IIII)V")
    public final void method462(int arg0, int arg1, int arg2, int arg3) {
        ++field5834;
        if (~this.field5680 > ~arg3) {
            arg3 = this.field5680;
        }
        if (arg2 > this.field5730) {
            arg2 = this.field5730;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field5936 = arg3;
        this.field5995 = arg0;
        this.field5987 = arg1;
        this.field5951 = arg2;
        OpenGL.glEnable(3089);
        this.method2407(0);
        this.method2428(0);
    }

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "()V")
    public final void method435() {
        try {
            this.field5733.swapBuffers();
        } catch (Exception var1) {
        }
        ++field5806;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(BLts;)V")
    public final void method2415(byte arg0, class372 arg1) {
        if (arg0 == -122) {
            ++field5750;
            if (~this.field5868 <= -1 && this.field5874[this.field5868] == arg1) {
                this.field5874[this.field5868--] = null;
                arg1.method2156((byte) -82);
                if (~this.field5868 <= -1) {
                    this.field5873 = this.field5874[this.field5868];
                    this.field5873.method2155((byte) 12);
                } else {
                    this.field5873 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "(I)V")
    private final void method2416(int arg0) {
        ++field5841;
        float var2 = (float) (-this.field5981) * this.field5919 / (float) this.field5899;
        float var3 = (float) (-this.field5984) * this.field5919 / (float) this.field5913;
        float var4 = (float) (-this.field5981 + this.field5730) * this.field5919 / (float) this.field5899;
        float var5 = (float) (-this.field5984 + this.field5680) * this.field5919 / (float) this.field5913;
        OpenGL.glMatrixMode(arg0);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field5909 - this.field5994), (double) ((float) this.field5896 + -this.field5994));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II[I[I)Lea;")
    public final class382 method434(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5673;
        return class85.method597(arg0, this, 119, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)V")
    public final synchronized void method496(int arg0) {
        ++field5757;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field5879.method3068(83)) {
            class330 var12 = (class330) this.field5879.method3071((byte) 52);
            class399.field5553[var2++] = (int) var12.field7342;
            this.field5876 -= var12.field4495;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class399.field5553, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class399.field5553, 0);
            var2 = 0;
        }
        while (!this.field5880.method3068(83)) {
            class330 var11 = (class330) this.field5880.method3071((byte) -120);
            class399.field5553[var2++] = (int) var11.field7342;
            this.field5878 -= var11.field4495;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class399.field5553, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class399.field5553, 0);
            var2 = 0;
        }
        while (!this.field5881.method3068(83)) {
            class330 var10 = (class330) this.field5881.method3071((byte) -118);
            class399.field5553[var2++] = var10.field4495;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class399.field5553, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class399.field5553, 0);
            var2 = 0;
        }
        while (!this.field5882.method3068(83)) {
            class330 var9 = (class330) this.field5882.method3071((byte) -119);
            class399.field5553[var2++] = (int) var9.field7342;
            this.field5875 -= var9.field4495;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class399.field5553, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class399.field5553, 0);
            boolean var4 = false;
        }
        while (!this.field5877.method3068(83)) {
            class330 var8 = (class330) this.field5877.method3071((byte) 106);
            OpenGL.glDeleteLists((int) var8.field7342, var8.field4495);
        }
        while (!this.field5883.method3068(83)) {
            class499 var7 = this.field5883.method3071((byte) 113);
            OpenGL.glDeleteProgramARB((int) var7.field7342);
        }
        while (!this.field5884.method3068(83)) {
            class499 var6 = this.field5884.method3071((byte) 113);
            OpenGL.glDeleteObjectARB(var6.field7342);
        }
        while (!this.field5877.method3068(83)) {
            class330 var5 = (class330) this.field5877.method3071((byte) -121);
            OpenGL.glDeleteLists((int) var5.field7342, var5.field4495);
        }
        this.field5856.method1424((byte) 127);
        if (this.method484() > 100663296 && this.field5893 - -60000L < class333.method1850(-3562)) {
            System.gc();
            this.field5893 = class333.method1850(-3562);
        }
        this.field5863 = var3;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIZ)V")
    public final void method2417(int arg0, int arg1, boolean arg2) {
        this.method2361(arg1, arg2, true, false);
        int var4 = -102 % ((arg0 - -33) / 62);
        ++field5790;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(FBFF)V")
    private final void method2418(float arg0, byte arg1, float arg2, float arg3) {
        ++field5795;
        OpenGL.glMatrixMode(5890);
        if (this.field5978) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg0, arg3);
        OpenGL.glMatrixMode(5888);
        if (arg1 < 113) {
            this.field5929 = null;
        }
        this.field5978 = true;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lwk;IIII)Lc;")
    public final class121 method540(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5767;
        return new class452(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5683;
        OpenGL.glLineWidth((float) arg5);
        this.method504(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "(II)I")
    public final int method2419(int arg0, int arg1) {
        if (arg0 != -17837) {
            return 76;
        } else {
            ++field5703;
            if (arg1 != 6406 && arg1 != 6409) {
                if (arg1 != 6410 && ~arg1 != -34847 && ~arg1 != -34845) {
                    if (arg1 == 6407) {
                        return 3;
                    } else if (arg1 != 6408 && arg1 != 34847) {
                        if (arg1 != 34843) {
                            if (~arg1 != -34843) {
                                if (~arg1 == -6403) {
                                    return 3;
                                } else if (arg1 == 6401) {
                                    return 1;
                                } else {
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 8;
                            }
                        } else {
                            return 6;
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
    }

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "(Lia;)V")
    public final void method437(class415 arg0) {
        ++field5743;
        this.field5917 = (class53) arg0;
        this.field5990.method331(this.field5917, 91);
        if (this.field5970 != 1) {
            this.method2387(-1);
        }
    }

    @OriginalMember(owner = "client!ht", name = "ua", descriptor = "(F)V")
    public final void method525(float arg0) {
        if (this.field5960 != arg0) {
            this.field5960 = arg0;
            this.method2413(61);
        }
        ++field5798;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIILnk;I)V")
    public final void method2420(int arg0, int arg1, int arg2, class502 arg3, int arg4) {
        ++field5785;
        int var6 = arg3.method1912(-21436);
        int var7 = arg0 * this.method2386(var6, -58);
        this.method2438(3584, arg3);
        int var8 = 61 / ((arg2 - 25) / 50);
        OpenGL.glDrawElements(arg4, arg1, var6, arg3.method1909(-127) - -((long) var7));
    }

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "(I)V")
    private final void method2421(int arg0) {
        this.field5917 = new class53();
        ++field5675;
        this.field5990 = new class53();
        this.field5934 = new class188[this.field5885];
        this.field5928 = new class308(this, 3553, 6408, 1, 1);
        this.field5982 = new class308(this, 3553, 6408, 1, 1);
        this.field5966 = new class308(this, 3553, 6408, 1, 1);
        if (arg0 < 64) {
            this.field5967 = null;
        }
        this.field5886 = new class452(this);
        this.field6000 = new class452(this);
        this.field5993 = new class452(this);
        this.field5973 = new class452(this);
        this.field5943 = new class452(this);
        this.field6004 = new class452(this);
        this.field5975 = new class452(this);
        this.field5924 = new class452(this);
        this.field5947 = new class452(this);
        this.field5926 = new class452(this);
        if (this.field5897) {
            this.field5958 = new class527(this);
            this.field5985 = new class527(this);
        }
    }

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "()V")
    public final void method498() {
        ++field5820;
        if (this.field5986 && ~this.field5730 < -1 && ~this.field5680 < -1) {
            int var1 = this.field5995;
            int var2 = this.field5951;
            int var3 = this.field5987;
            int var4 = this.field5936;
            this.method526();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2404(-112);
            this.method2395(-101, false);
            this.method2433(false, (byte) -63);
            this.method2411(10217, false);
            this.method2431(false, -31688);
            this.method2412((byte) 4, (class188) null);
            this.method2366(-2, 1874);
            this.method2365(true, 1);
            this.method2356((byte) -21, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5730, this.field5680, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method462(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(IIIIII)Lpv;")
    public final class50 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5714;
        return !this.field5933 ? null : new class488(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZLts;)V")
    public final void method2422(boolean arg0, class372 arg1) {
        ++field5812;
        if (this.field5868 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field5868 <= -1) {
                this.field5874[this.field5868].method2156((byte) 88);
            }
            this.field5873 = this.field5874[++this.field5868] = arg1;
            if (!arg0) {
                this.method431(-33, -86, -36, 123, 53, 47);
            }
            this.field5873.method2155((byte) 12);
        }
    }

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "()I")
    public final int method528() {
        ++field5777;
        return 4;
    }

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "(I)V")
    public final void method2423(int arg0) {
        if (arg0 != 8448) {
            this.field5899 = 16;
        }
        ++field5726;
        if (~this.field5921 != -3) {
            this.method2400(0);
            this.method2395(54, false);
            this.method2433(false, (byte) -101);
            this.method2411(arg0 ^ 1769, false);
            this.method2431(false, -31688);
            this.method2366(-2, 1874);
            this.field5921 = 2;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IFF)V")
    public final void method2424(int arg0, float arg1, float arg2) {
        this.field5965 = arg1;
        this.field5996 = arg2;
        if (arg0 >= -110) {
            this.method446();
        }
        ++field5742;
        if (!this.field5898) {
            this.method2410(-21);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lts;I)V")
    public final void method2425(class372 arg0, int arg1) {
        ++field5837;
        int var3 = -125 / ((-20 - arg1) / 49);
        if (this.field5901) {
            this.method2409(32718, arg0);
            this.method2415((byte) -122, arg0);
        } else if (this.field5871 >= 0 && this.field5867[this.field5871] == arg0) {
            this.field5867[this.field5871--] = null;
            arg0.method2151((byte) -27);
            if (this.field5871 < 0) {
                this.field5870 = this.field5873 = null;
            } else {
                this.field5870 = this.field5873 = this.field5867[this.field5871];
                this.field5870.method2154(13781);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Ll;")
    public final class16 method501(int arg0) {
        ++field5808;
        class471 var2 = new class471(arg0);
        this.field5860.method3070(var2, (byte) -127);
        return var2;
    }

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "()Z")
    public final boolean method495() {
        ++field5718;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "W", descriptor = "()I")
    public final int method460() {
        ++field5678;
        return this.field5896;
    }

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "(I)V")
    private final void method2426(int arg0) {
        ++field5719;
        if (this.field5914 && this.field5953 >= 0 | this.field5898) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 >= -36) {
            this.field5891 = true;
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method503(Canvas arg0) {
        ++field5752;
        if (this.field5684 == arg0) {
            throw new RuntimeException();
        } else if (this.field5796.containsKey(arg0)) {
            Long var2 = (Long) this.field5796.get(arg0);
            this.field5733.releaseSurface(arg0, var2);
            this.field5796.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "(II)I")
    public final int method2427(int arg0, int arg1) {
        ++field5824;
        if (~arg0 == -2) {
            return 7681;
        } else if (arg0 == 0) {
            return 8448;
        } else if (~arg0 != -3) {
            if (arg0 == 3) {
                return 260;
            } else if (arg0 == 4) {
                return 34023;
            } else {
                if (arg1 != 3089) {
                    this.field5900 = 0.43957168F;
                }
                throw new IllegalArgumentException();
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!ht", name = "GA", descriptor = "(IIII)V")
    public final void method467(int arg0, int arg1, int arg2, int arg3) {
        this.field5981 = arg0;
        this.field5913 = arg3;
        this.field5984 = arg1;
        this.field5899 = arg2;
        ++field5672;
        this.method2414(true);
        this.method2407(0);
        if (this.field5970 == 3) {
            this.method2416(5889);
        } else if (this.field5970 == 2) {
            this.method2405(14757);
        }
    }

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "(I)V")
    private final void method2428(int arg0) {
        ++field5805;
        if (arg0 != 0) {
            this.method2363(68);
        }
        if (this.field5951 >= this.field5995 && this.field5936 >= this.field5987) {
            OpenGL.glScissor(this.field5941 - -this.field5995, -this.field5936 + this.field5938 + this.field5680, -this.field5995 + this.field5951, this.field5936 - this.field5987);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ht", name = "XA", descriptor = "(IFFFFF)V")
    public final void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5802;
        boolean var7 = this.field5988 != arg0;
        if (var7 || this.field5892 != arg1 || this.field5920 != arg2) {
            this.field5892 = arg1;
            this.field5988 = arg0;
            this.field5920 = arg2;
            if (var7) {
                this.field5906 = (float) (this.field5988 & 65280) / 65280.0F;
                this.field5959 = (float) (this.field5988 & 16711680) / 1.671168E7F;
                this.field5997 = (float) (255 & this.field5988) / 255.0F;
                this.method2413(-32);
            }
            this.method2435(2);
        }
        if (this.field5904[0] != arg3 || this.field5904[1] != arg4 || this.field5904[2] != arg5) {
            this.field5904[1] = arg4;
            this.field5904[0] = arg3;
            this.field5904[2] = arg5;
            this.field5969[0] = -arg3;
            this.field5969[1] = -arg4;
            this.field5969[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5940[1] = arg4 * var8;
            this.field5940[0] = arg3 * var8;
            this.field5940[2] = arg5 * var8;
            this.field5948[1] = -this.field5940[1];
            this.field5948[0] = -this.field5940[0];
            this.field5948[2] = -this.field5940[2];
            this.method2437((byte) -97);
            this.field5937 = (int) (arg5 * 256.0F / arg4);
            this.field5945 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I[Lpe;)V")
    public final void method490(int arg0, class432[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field5954[var3] = arg1[var3];
        }
        ++field5764;
        this.field5977 = arg0;
        if (~this.field5970 != -2) {
            this.method2390((byte) 78);
        }
    }

    @OriginalMember(owner = "client!ht", name = "U", descriptor = "(IIIII)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2360(-128);
        ++field5833;
        this.method2356((byte) -21, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([Lc;Lia;[Lnh;I)V")
    public final void method453(class121[] arg0, class415 arg1, class525[] arg2, int arg3) {
        ++field5773;
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method781(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBI)V")
    public final void method2429(int arg0, byte arg1, int arg2) {
        ++field5797;
        if (arg1 == 7) {
            this.field5938 = arg2;
            this.field5941 = arg0;
            this.method2363(0);
            this.method2428(arg1 ^ 7);
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "()V")
    public final void method505() {
        ++field5794;
        this.field5853.method423(126);
    }

    @OriginalMember(owner = "client!ht", name = "IA", descriptor = "(IIII)[I")
    public final int[] method443(int arg0, int arg1, int arg2, int arg3) {
        ++field5710;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field5680 + -arg1, arg2, 1, 32993, this.field5963, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIB)I")
    public static final int method2430(int arg0, int arg1, byte arg2) {
        ++field5758;
        int var3 = class229.method1341(arg1 - 1, arg0 + -1, -6418) - -class229.method1341(arg1 + -1, arg0 + 1, -6418) - (-class229.method1341(arg1 + 1, arg0 + -1, -6418) + -class229.method1341(arg1 + 1, arg0 + 1, -6418));
        if (arg2 < 117) {
            method2359(-70, 28, 112, -22, 99, 58, 31, -66, 124, -41);
        }
        int var4 = class229.method1341(arg1, arg0 + -1, -6418) - -class229.method1341(arg1, arg0 + 1, -6418) - (-class229.method1341(arg1 - 1, arg0, -6418) + -class229.method1341(arg1 + 1, arg0, -6418));
        int var5 = class229.method1341(arg1, arg0, -6418);
        return var3 / 16 + (var4 / 8 - -(var5 / 4));
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(ZI)V")
    public final void method2431(boolean arg0, int arg1) {
        if (!this.field5939 == arg0) {
            this.field5939 = arg0;
            this.method2391((byte) 38);
            this.field5921 &= -32;
        }
        ++field5658;
        if (arg1 != -31688) {
            this.field5945 = -61;
        }
    }

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "(I)V")
    private final void method2432(int arg0) {
        if (this.field5992 && !this.field5930) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 2896) {
            this.method540((class94) null, -26, -60, -121, -10);
        }
        ++field5721;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZB)V")
    public final void method2433(boolean arg0, byte arg1) {
        if (this.field5992 != arg0) {
            this.field5992 = arg0;
            this.method2432(2896);
            this.field5921 &= -8;
        }
        int var3 = -46 / ((25 - arg1) / 63);
        ++field5810;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(ILts;)V")
    public final void method2434(int arg0, class372 arg1) {
        ++field5748;
        if (!this.field5901) {
            if (this.field5871 >= 3) {
                throw new RuntimeException();
            }
            if (this.field5871 >= 0) {
                this.field5867[this.field5871].method2151((byte) -27);
            }
            this.field5870 = this.field5873 = this.field5867[++this.field5871] = arg1;
            this.field5870.method2154(13781);
        } else {
            this.method2367((byte) 21, arg1);
            this.method2422(true, arg1);
        }
        int var3 = 28 / ((arg0 - -40) / 38);
    }

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "(I)V")
    private final void method2435(int arg0) {
        class456.field6666[1] = this.field5906 * this.field5892;
        ++field5830;
        class456.field6666[0] = this.field5959 * this.field5892;
        class456.field6666[2] = this.field5997 * this.field5892;
        class456.field6666[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class456.field6666, 0);
        class456.field6666[3] = 1.0F;
        class456.field6666[1] = -this.field5920 * this.field5906;
        class456.field6666[0] = -this.field5920 * this.field5959;
        class456.field6666[arg0] = -this.field5920 * this.field5997;
        OpenGL.glLightfv(16385, 4609, class456.field6666, 0);
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(Z)V")
    public final void method469(boolean arg0) {
        this.field5888 = arg0;
        ++field5661;
        this.method2391((byte) 38);
    }

    @OriginalMember(owner = "client!ht", name = "ia", descriptor = "(III[I)V")
    public final void method533(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5822;
        float var5 = (float) arg2 * this.field5917.field730 + (float) arg0 * this.field5917.field727 + (float) arg1 * this.field5917.field721 + this.field5917.field723;
        if (!((float) this.field5909 > var5) && !((float) this.field5896 < var5)) {
            int var6 = (int) (((float) arg2 * this.field5917.field729 + (float) arg0 * this.field5917.field709 + (float) arg1 * this.field5917.field738 + this.field5917.field707) * (float) this.field5899 / var5);
            int var7 = (int) (((float) arg2 * this.field5917.field735 + (float) arg0 * this.field5917.field731 + (float) arg1 * this.field5917.field732 + this.field5917.field718) * (float) this.field5913 / var5);
            if ((float) var6 >= this.field5894 && (float) var6 <= this.field5915 && (float) var7 >= this.field5980 && this.field5895 >= (float) var7) {
                arg3[1] = (int) ((float) var7 + -this.field5980);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field5894);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([IIIII)Lf;")
    public final class529 method476(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5800;
        return new class379(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BJ)V")
    public final synchronized void method2436(byte arg0, long arg1) {
        ++field5786;
        if (arg0 > -33) {
            this.method514((int[]) null);
        }
        class499 var4 = new class499();
        var4.field7342 = arg1;
        this.field5884.method3070(var4, (byte) -124);
    }

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "([I)V")
    public final void method514(int[] arg0) {
        arg0[3] = this.field5936;
        arg0[2] = this.field5951;
        arg0[0] = this.field5995;
        arg0[1] = this.field5987;
        ++field5702;
    }

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "(B)V")
    public final void method2437(byte arg0) {
        int var2 = 112 / ((arg0 - -38) / 55);
        ++field5772;
        OpenGL.glLightfv(16384, 4611, this.field5940, 0);
        OpenGL.glLightfv(16385, 4611, this.field5948, 0);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lpv;)V")
    public final void method524(class50 arg0) {
        this.field5967 = (class100) arg0;
        ++field5686;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILnk;)V")
    public final void method2438(int arg0, class502 arg1) {
        ++field5682;
        if (arg0 != 3584) {
            this.field5972 = 39;
        }
        if (this.field5968 != arg1) {
            if (this.field5927) {
                OpenGL.glBindBufferARB(34963, arg1.method1910(-125));
            }
            this.field5968 = arg1;
        }
    }

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "()Z")
    public final boolean method515() {
        ++field5784;
        return this.field5935 && (!this.method474() || this.field5979);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lds;BLds;Lds;Lds;)V")
    public final void method2439(class12 arg0, byte arg1, class12 arg2, class12 arg3, class12 arg4) {
        if (arg1 < -4) {
            if (arg2 == null) {
                OpenGL.glDisableClientState(32884);
            } else {
                this.method2385(34962, arg2.field142);
                OpenGL.glVertexPointer(arg2.field133, arg2.field136, this.field5971.method552((byte) 112), this.field5971.method551((byte) -56) - -((long) arg2.field137));
                OpenGL.glEnableClientState(32884);
            }
            ++field5731;
            if (arg4 != null) {
                this.method2385(34962, arg4.field142);
                OpenGL.glNormalPointer(arg4.field136, this.field5971.method552((byte) 102), this.field5971.method551((byte) -68) - -((long) arg4.field137));
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg3 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method2385(34962, arg3.field142);
                OpenGL.glColorPointer(arg3.field133, arg3.field136, this.field5971.method552((byte) 81), this.field5971.method551((byte) -53) + (long) arg3.field137);
                OpenGL.glEnableClientState(32886);
            }
            if (arg0 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method2385(34962, arg0.field142);
                OpenGL.glTexCoordPointer(arg0.field133, arg0.field136, this.field5971.method552((byte) 91), this.field5971.method551((byte) -73) + (long) arg0.field137);
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ll;)V")
    public final void method478(class16 arg0) {
        ++field5685;
        this.field5862 = ((class471) arg0).field6885;
        if (this.field5964 == null) {
            class251 var2 = new class251(80);
            if (!this.field5931) {
                var2.method1476(13, -1.0F);
                var2.method1476(-112, -1.0F);
                var2.method1476(-101, 0.0F);
                var2.method1476(43, 0.0F);
                var2.method1476(56, 1.0F);
                var2.method1476(-113, 1.0F);
                var2.method1476(61, -1.0F);
                var2.method1476(58, 0.0F);
                var2.method1476(93, 1.0F);
                var2.method1476(-107, 1.0F);
                var2.method1476(7, 1.0F);
                var2.method1476(82, 1.0F);
                var2.method1476(-124, 0.0F);
                var2.method1476(44, 1.0F);
                var2.method1476(96, 0.0F);
                var2.method1476(-122, -1.0F);
                var2.method1476(-121, 1.0F);
                var2.method1476(92, 0.0F);
                var2.method1476(109, 0.0F);
                var2.method1476(-108, 0.0F);
            } else {
                var2.method1477(-1.0F, (byte) 121);
                var2.method1477(-1.0F, (byte) -11);
                var2.method1477(0.0F, (byte) 127);
                var2.method1477(0.0F, (byte) -23);
                var2.method1477(1.0F, (byte) -69);
                var2.method1477(1.0F, (byte) -20);
                var2.method1477(-1.0F, (byte) 118);
                var2.method1477(0.0F, (byte) 14);
                var2.method1477(1.0F, (byte) 126);
                var2.method1477(1.0F, (byte) -66);
                var2.method1477(1.0F, (byte) 26);
                var2.method1477(1.0F, (byte) -120);
                var2.method1477(0.0F, (byte) 127);
                var2.method1477(1.0F, (byte) -18);
                var2.method1477(0.0F, (byte) -7);
                var2.method1477(-1.0F, (byte) -101);
                var2.method1477(1.0F, (byte) 125);
                var2.method1477(0.0F, (byte) -99);
                var2.method1477(0.0F, (byte) -78);
                var2.method1477(0.0F, (byte) 21);
            }
            this.field5964 = this.method2389(false, 20, var2.field5073, 1145, var2.field5069);
            this.field5976 = new class12(this, this.field5964, 5126, 3, 0);
            this.field6003 = new class12(this, this.field5964, 5126, 2, 12);
            this.field5849.method1069(this, -1);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILaw;)V")
    public final void method2440(int arg0, class53 arg1) {
        OpenGL.glLoadMatrixf(arg1.method326(-5445), 0);
        if (arg0 < 10) {
            this.method2412((byte) 123, (class188) null);
        }
        ++field5832;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIII)V")
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5813;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2360(-122);
        this.method2356((byte) -21, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5935) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5935) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(Z)V")
    public final void method451(boolean arg0) {
        ++field5846;
    }
}
