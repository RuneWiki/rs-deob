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

@OriginalClass("client!vj")
public class class422 extends class564 {

    @OriginalMember(owner = "client!vj", name = "Gb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5682 = new Hashtable();

    @OriginalMember(owner = "client!vj", name = "ae", descriptor = "I")
    public int field5806 = 128;

    @OriginalMember(owner = "client!vj", name = "Xd", descriptor = "Las;")
    private class25 field5803 = new class25();

    @OriginalMember(owner = "client!vj", name = "je", descriptor = "Lkw;")
    private class185 field5815 = new class185();

    @OriginalMember(owner = "client!vj", name = "ke", descriptor = "Lkw;")
    public class185 field5816 = new class185();

    @OriginalMember(owner = "client!vj", name = "me", descriptor = "I")
    public int field5818 = 3;

    @OriginalMember(owner = "client!vj", name = "re", descriptor = "I")
    public int field5823 = 8;

    @OriginalMember(owner = "client!vj", name = "pe", descriptor = "Z")
    private boolean field5821 = false;

    @OriginalMember(owner = "client!vj", name = "ne", descriptor = "Lgk;")
    private class616 field5819 = new class616();

    @OriginalMember(owner = "client!vj", name = "we", descriptor = "[Lkp;")
    private class506[] field5828 = new class506[4];

    @OriginalMember(owner = "client!vj", name = "ue", descriptor = "I")
    private int field5826 = -1;

    @OriginalMember(owner = "client!vj", name = "se", descriptor = "I")
    private int field5824 = -1;

    @OriginalMember(owner = "client!vj", name = "ze", descriptor = "[Lkp;")
    private class506[] field5831 = new class506[4];

    @OriginalMember(owner = "client!vj", name = "Ae", descriptor = "I")
    private int field5832 = -1;

    @OriginalMember(owner = "client!vj", name = "Be", descriptor = "[Lkp;")
    private class506[] field5833 = new class506[4];

    @OriginalMember(owner = "client!vj", name = "Ce", descriptor = "Lth;")
    private class288 field5834 = new class288();

    @OriginalMember(owner = "client!vj", name = "De", descriptor = "Lwa;")
    private class661 field5835 = new class661(16);

    @OriginalMember(owner = "client!vj", name = "Ge", descriptor = "Lgk;")
    private class616 field5838 = new class616();

    @OriginalMember(owner = "client!vj", name = "Je", descriptor = "Lgk;")
    private class616 field5841 = new class616();

    @OriginalMember(owner = "client!vj", name = "Ke", descriptor = "Lgk;")
    private class616 field5842 = new class616();

    @OriginalMember(owner = "client!vj", name = "Le", descriptor = "Lgk;")
    private class616 field5843 = new class616();

    @OriginalMember(owner = "client!vj", name = "Me", descriptor = "Lgk;")
    private class616 field5844 = new class616();

    @OriginalMember(owner = "client!vj", name = "Ne", descriptor = "Lgk;")
    private class616 field5845 = new class616();

    @OriginalMember(owner = "client!vj", name = "Oe", descriptor = "Lgk;")
    private class616 field5846 = new class616();

    @OriginalMember(owner = "client!vj", name = "We", descriptor = "Lkw;")
    public class185 field5854 = new class185();

    @OriginalMember(owner = "client!vj", name = "Ye", descriptor = "Lkw;")
    public class185 field5856 = new class185();

    @OriginalMember(owner = "client!vj", name = "Ze", descriptor = "Lkw;")
    public class185 field5857 = new class185();

    @OriginalMember(owner = "client!vj", name = "nf", descriptor = "I")
    private int field5870 = 0;

    @OriginalMember(owner = "client!vj", name = "Ff", descriptor = "I")
    private int field5888 = 0;

    @OriginalMember(owner = "client!vj", name = "Hf", descriptor = "F")
    public float field5890 = 1.0F;

    @OriginalMember(owner = "client!vj", name = "Ef", descriptor = "I")
    public int field5887 = 0;

    @OriginalMember(owner = "client!vj", name = "yf", descriptor = "F")
    public float field5881 = 1.0F;

    @OriginalMember(owner = "client!vj", name = "fg", descriptor = "[F")
    private float[] field5914 = new float[4];

    @OriginalMember(owner = "client!vj", name = "Yf", descriptor = "I")
    public int field5907 = -1;

    @OriginalMember(owner = "client!vj", name = "tf", descriptor = "I")
    private int field5876 = 0;

    @OriginalMember(owner = "client!vj", name = "Wf", descriptor = "F")
    private float field5905 = -1.0F;

    @OriginalMember(owner = "client!vj", name = "ug", descriptor = "[F")
    private float[] field5929 = new float[16];

    @OriginalMember(owner = "client!vj", name = "pf", descriptor = "I")
    public int field5872 = -1;

    @OriginalMember(owner = "client!vj", name = "gg", descriptor = "I")
    public int field5915 = 0;

    @OriginalMember(owner = "client!vj", name = "kf", descriptor = "Z")
    private boolean field5867 = false;

    @OriginalMember(owner = "client!vj", name = "Qf", descriptor = "[F")
    public float[] field5899 = new float[4];

    @OriginalMember(owner = "client!vj", name = "cg", descriptor = "I")
    private int field5911 = 8448;

    @OriginalMember(owner = "client!vj", name = "lf", descriptor = "F")
    public float field5868 = 3584.0F;

    @OriginalMember(owner = "client!vj", name = "vg", descriptor = "I")
    private int field5930 = 0;

    @OriginalMember(owner = "client!vj", name = "lg", descriptor = "I")
    public int field5920 = 0;

    @OriginalMember(owner = "client!vj", name = "Df", descriptor = "F")
    private float field5886 = 1.0F;

    @OriginalMember(owner = "client!vj", name = "og", descriptor = "Z")
    private boolean field5923 = true;

    @OriginalMember(owner = "client!vj", name = "mg", descriptor = "F")
    private float field5921 = 0.0F;

    @OriginalMember(owner = "client!vj", name = "Uf", descriptor = "I")
    private int field5903 = -1;

    @OriginalMember(owner = "client!vj", name = "Jg", descriptor = "I")
    public int field5944 = 0;

    @OriginalMember(owner = "client!vj", name = "Hg", descriptor = "[F")
    private float[] field5942 = new float[4];

    @OriginalMember(owner = "client!vj", name = "jf", descriptor = "F")
    public float field5866 = -1.0F;

    @OriginalMember(owner = "client!vj", name = "ig", descriptor = "F")
    public float field5917 = 3584.0F;

    @OriginalMember(owner = "client!vj", name = "Sf", descriptor = "I")
    public int field5901 = 512;

    @OriginalMember(owner = "client!vj", name = "Gg", descriptor = "I")
    public int field5941 = 50;

    @OriginalMember(owner = "client!vj", name = "ng", descriptor = "F")
    private float field5922 = 1.0F;

    @OriginalMember(owner = "client!vj", name = "Mg", descriptor = "F")
    public float field5947 = 1.0F;

    @OriginalMember(owner = "client!vj", name = "Ag", descriptor = "I")
    private int field5935 = 8448;

    @OriginalMember(owner = "client!vj", name = "ah", descriptor = "I")
    public int field5961 = 512;

    @OriginalMember(owner = "client!vj", name = "Xg", descriptor = "[F")
    private float[] field5958 = new float[4];

    @OriginalMember(owner = "client!vj", name = "Tg", descriptor = "I")
    public int field5954 = -1;

    @OriginalMember(owner = "client!vj", name = "ch", descriptor = "I")
    public int field5963 = -1;

    @OriginalMember(owner = "client!vj", name = "Lg", descriptor = "F")
    private float field5946 = -1.0F;

    @OriginalMember(owner = "client!vj", name = "dh", descriptor = "I")
    private int field5964 = 0;

    @OriginalMember(owner = "client!vj", name = "Kg", descriptor = "F")
    public float field5945 = -1.0F;

    @OriginalMember(owner = "client!vj", name = "Eg", descriptor = "I")
    private int field5939 = 3584;

    @OriginalMember(owner = "client!vj", name = "gh", descriptor = "[Leq;")
    private class670[] field5967 = new class670[class416.field5574];

    @OriginalMember(owner = "client!vj", name = "Ig", descriptor = "I")
    private int field5943 = 0;

    @OriginalMember(owner = "client!vj", name = "eh", descriptor = "Lnea;")
    public class209 field5965 = new class209(8192);

    @OriginalMember(owner = "client!vj", name = "jh", descriptor = "[I")
    public int[] field5970 = new int[1];

    @OriginalMember(owner = "client!vj", name = "ih", descriptor = "[I")
    public int[] field5969 = new int[1];

    @OriginalMember(owner = "client!vj", name = "mh", descriptor = "[B")
    public byte[] field5973 = new byte[16384];

    @OriginalMember(owner = "client!vj", name = "lh", descriptor = "[I")
    public int[] field5972 = new int[1];

    @OriginalMember(owner = "client!vj", name = "he", descriptor = "I")
    public int field5813;

    @OriginalMember(owner = "client!vj", name = "Cc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5730;

    @OriginalMember(owner = "client!vj", name = "fb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5655;

    @OriginalMember(owner = "client!vj", name = "Od", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field5794;

    @OriginalMember(owner = "client!vj", name = "Lc", descriptor = "J")
    private long field5739;

    @OriginalMember(owner = "client!vj", name = "dc", descriptor = "J")
    private long field5705;

    @OriginalMember(owner = "client!vj", name = "rf", descriptor = "Z")
    public boolean field5874;

    @OriginalMember(owner = "client!vj", name = "Zf", descriptor = "I")
    public int field5908;

    @OriginalMember(owner = "client!vj", name = "Bg", descriptor = "Ljava/lang/String;")
    private String field5936;

    @OriginalMember(owner = "client!vj", name = "Kf", descriptor = "Z")
    public boolean field5893;

    @OriginalMember(owner = "client!vj", name = "zf", descriptor = "Z")
    private boolean field5882;

    @OriginalMember(owner = "client!vj", name = "Gf", descriptor = "Z")
    public boolean field5889;

    @OriginalMember(owner = "client!vj", name = "kg", descriptor = "Z")
    public boolean field5919;

    @OriginalMember(owner = "client!vj", name = "Cf", descriptor = "Z")
    public boolean field5885;

    @OriginalMember(owner = "client!vj", name = "Fg", descriptor = "Z")
    private boolean field5940;

    @OriginalMember(owner = "client!vj", name = "Mf", descriptor = "Ljava/lang/String;")
    private String field5895;

    @OriginalMember(owner = "client!vj", name = "Ng", descriptor = "Z")
    public boolean field5948;

    @OriginalMember(owner = "client!vj", name = "yg", descriptor = "Z")
    private boolean field5933;

    @OriginalMember(owner = "client!vj", name = "Vd", descriptor = "Ljj;")
    private class68 field5801;

    @OriginalMember(owner = "client!vj", name = "qe", descriptor = "Lih;")
    public class168 field5822;

    @OriginalMember(owner = "client!vj", name = "fe", descriptor = "Lkb;")
    private class187 field5811;

    @OriginalMember(owner = "client!vj", name = "Zd", descriptor = "Laq;")
    private class703 field5805;

    @OriginalMember(owner = "client!vj", name = "de", descriptor = "Ltba;")
    private class705 field5809;

    @OriginalMember(owner = "client!vj", name = "ud", descriptor = "[I")
    public static int[] field5774 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!vj", name = "bf", descriptor = "F")
    private float field5859;

    @OriginalMember(owner = "client!vj", name = "vf", descriptor = "F")
    public float field5878;

    @OriginalMember(owner = "client!vj", name = "Pf", descriptor = "F")
    private float field5898;

    @OriginalMember(owner = "client!vj", name = "Tf", descriptor = "F")
    public float field5902;

    @OriginalMember(owner = "client!vj", name = "wg", descriptor = "F")
    public float field5931;

    @OriginalMember(owner = "client!vj", name = "Og", descriptor = "F")
    public float field5949;

    @OriginalMember(owner = "client!vj", name = "Pg", descriptor = "F")
    private float field5950;

    @OriginalMember(owner = "client!vj", name = "Qg", descriptor = "F")
    public float field5951;

    @OriginalMember(owner = "client!vj", name = "bh", descriptor = "F")
    public float field5962;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!vj", name = "eb", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!vj", name = "gb", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!vj", name = "hb", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!vj", name = "ib", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!vj", name = "jb", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!vj", name = "kb", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!vj", name = "lb", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!vj", name = "mb", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!vj", name = "nb", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!vj", name = "ob", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!vj", name = "pb", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!vj", name = "qb", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!vj", name = "rb", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!vj", name = "sb", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!vj", name = "tb", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!vj", name = "ub", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!vj", name = "vb", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!vj", name = "wb", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!vj", name = "xb", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!vj", name = "yb", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!vj", name = "zb", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!vj", name = "Ab", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!vj", name = "Bb", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!vj", name = "Cb", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!vj", name = "Db", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!vj", name = "Eb", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!vj", name = "Fb", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!vj", name = "Hb", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!vj", name = "Ib", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!vj", name = "Jb", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!vj", name = "Kb", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!vj", name = "Lb", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!vj", name = "Mb", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!vj", name = "Nb", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!vj", name = "Ob", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!vj", name = "Pb", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!vj", name = "Qb", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!vj", name = "Rb", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!vj", name = "Sb", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!vj", name = "Tb", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!vj", name = "Ub", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!vj", name = "Vb", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!vj", name = "Wb", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!vj", name = "Xb", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!vj", name = "Yb", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!vj", name = "Zb", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!vj", name = "ac", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!vj", name = "bc", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!vj", name = "cc", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!vj", name = "ec", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!vj", name = "fc", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!vj", name = "gc", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!vj", name = "hc", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!vj", name = "ic", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!vj", name = "jc", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!vj", name = "kc", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!vj", name = "lc", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!vj", name = "mc", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!vj", name = "nc", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!vj", name = "oc", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!vj", name = "pc", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!vj", name = "qc", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!vj", name = "rc", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!vj", name = "sc", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!vj", name = "tc", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!vj", name = "uc", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!vj", name = "vc", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!vj", name = "wc", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!vj", name = "xc", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!vj", name = "yc", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!vj", name = "zc", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!vj", name = "Ac", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!vj", name = "Bc", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!vj", name = "Dc", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!vj", name = "Ec", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!vj", name = "Fc", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!vj", name = "Gc", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!vj", name = "Hc", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!vj", name = "Ic", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!vj", name = "Jc", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!vj", name = "Kc", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!vj", name = "Mc", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!vj", name = "Nc", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!vj", name = "Oc", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!vj", name = "Pc", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!vj", name = "Qc", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!vj", name = "Rc", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!vj", name = "Sc", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!vj", name = "Tc", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!vj", name = "Uc", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!vj", name = "Vc", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!vj", name = "Wc", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!vj", name = "Xc", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!vj", name = "Yc", descriptor = "I")
    private int field5752;

    @OriginalMember(owner = "client!vj", name = "Zc", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!vj", name = "ad", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!vj", name = "bd", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!vj", name = "cd", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!vj", name = "dd", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!vj", name = "ed", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!vj", name = "fd", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!vj", name = "gd", descriptor = "I")
    public int field5760;

    @OriginalMember(owner = "client!vj", name = "hd", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!vj", name = "id", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!vj", name = "jd", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!vj", name = "kd", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!vj", name = "ld", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!vj", name = "md", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!vj", name = "nd", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!vj", name = "od", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!vj", name = "pd", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!vj", name = "qd", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!vj", name = "rd", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!vj", name = "sd", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!vj", name = "td", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!vj", name = "vd", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!vj", name = "wd", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!vj", name = "xd", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!vj", name = "yd", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!vj", name = "zd", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!vj", name = "Ad", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!vj", name = "Bd", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!vj", name = "Cd", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!vj", name = "Dd", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!vj", name = "Ed", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!vj", name = "Fd", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!vj", name = "Gd", descriptor = "I")
    private int field5786;

    @OriginalMember(owner = "client!vj", name = "Hd", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!vj", name = "Id", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!vj", name = "Jd", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!vj", name = "Kd", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!vj", name = "Ld", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!vj", name = "Md", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!vj", name = "Nd", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!vj", name = "Pd", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!vj", name = "Qd", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!vj", name = "Rd", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!vj", name = "Sd", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!vj", name = "Td", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!vj", name = "Ud", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!vj", name = "Wd", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!vj", name = "Yd", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!vj", name = "be", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!vj", name = "ce", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!vj", name = "ee", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!vj", name = "ge", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!vj", name = "ie", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!vj", name = "le", descriptor = "I")
    public int field5817;

    @OriginalMember(owner = "client!vj", name = "Ee", descriptor = "I")
    private int field5836;

    @OriginalMember(owner = "client!vj", name = "Fe", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!vj", name = "He", descriptor = "I")
    private int field5839;

    @OriginalMember(owner = "client!vj", name = "Ie", descriptor = "I")
    public int field5840;

    @OriginalMember(owner = "client!vj", name = "Qe", descriptor = "I")
    private int field5848;

    @OriginalMember(owner = "client!vj", name = "Te", descriptor = "I")
    private int field5851;

    @OriginalMember(owner = "client!vj", name = "Ue", descriptor = "I")
    private int field5852;

    @OriginalMember(owner = "client!vj", name = "hf", descriptor = "I")
    private int field5865;

    @OriginalMember(owner = "client!vj", name = "of", descriptor = "I")
    public int field5871;

    @OriginalMember(owner = "client!vj", name = "uf", descriptor = "I")
    private int field5877;

    @OriginalMember(owner = "client!vj", name = "xf", descriptor = "I")
    public int field5880;

    @OriginalMember(owner = "client!vj", name = "Bf", descriptor = "I")
    private int field5884;

    @OriginalMember(owner = "client!vj", name = "If", descriptor = "I")
    private int field5891;

    @OriginalMember(owner = "client!vj", name = "ag", descriptor = "I")
    private int field5909;

    @OriginalMember(owner = "client!vj", name = "eg", descriptor = "I")
    public int field5913;

    @OriginalMember(owner = "client!vj", name = "hg", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!vj", name = "rg", descriptor = "I")
    public int field5926;

    @OriginalMember(owner = "client!vj", name = "tg", descriptor = "I")
    private int field5928;

    @OriginalMember(owner = "client!vj", name = "Rg", descriptor = "I")
    private int field5952;

    @OriginalMember(owner = "client!vj", name = "hh", descriptor = "I")
    private int field5968;

    @OriginalMember(owner = "client!vj", name = "kh", descriptor = "I")
    private int field5971;

    @OriginalMember(owner = "client!vj", name = "Xe", descriptor = "J")
    private long field5855;

    @OriginalMember(owner = "client!vj", name = "jg", descriptor = "Lbr;")
    private class196 field5918;

    @OriginalMember(owner = "client!vj", name = "df", descriptor = "Lut;")
    private class199 field5861;

    @OriginalMember(owner = "client!vj", name = "Wg", descriptor = "Lut;")
    private class199 field5957;

    @OriginalMember(owner = "client!vj", name = "xe", descriptor = "Lbe;")
    private class201 field5829;

    @OriginalMember(owner = "client!vj", name = "Lf", descriptor = "Lcn;")
    private class21 field5894;

    @OriginalMember(owner = "client!vj", name = "ye", descriptor = "Lwt;")
    private class24 field5830;

    @OriginalMember(owner = "client!vj", name = "qg", descriptor = "Lwt;")
    public class24 field5925;

    @OriginalMember(owner = "client!vj", name = "Xf", descriptor = "Lhea;")
    public class351 field5906;

    @OriginalMember(owner = "client!vj", name = "bg", descriptor = "Lhea;")
    public class351 field5910;

    @OriginalMember(owner = "client!vj", name = "af", descriptor = "Ljg;")
    public class366 field5858;

    @OriginalMember(owner = "client!vj", name = "ef", descriptor = "Ljg;")
    public class366 field5862;

    @OriginalMember(owner = "client!vj", name = "Of", descriptor = "Ljg;")
    public class366 field5897;

    @OriginalMember(owner = "client!vj", name = "dg", descriptor = "Ljg;")
    public class366 field5912;

    @OriginalMember(owner = "client!vj", name = "pg", descriptor = "Ljg;")
    public class366 field5924;

    @OriginalMember(owner = "client!vj", name = "sg", descriptor = "Ljg;")
    public class366 field5927;

    @OriginalMember(owner = "client!vj", name = "xg", descriptor = "Ljg;")
    public class366 field5932;

    @OriginalMember(owner = "client!vj", name = "zg", descriptor = "Ljg;")
    public class366 field5934;

    @OriginalMember(owner = "client!vj", name = "Ug", descriptor = "Ljg;")
    public class366 field5955;

    @OriginalMember(owner = "client!vj", name = "Vg", descriptor = "Ljg;")
    public class366 field5956;

    @OriginalMember(owner = "client!vj", name = "Nf", descriptor = "Lrr;")
    private class412 field5896;

    @OriginalMember(owner = "client!vj", name = "te", descriptor = "Lkp;")
    private class506 field5825;

    @OriginalMember(owner = "client!vj", name = "ve", descriptor = "Lkp;")
    private class506 field5827;

    @OriginalMember(owner = "client!vj", name = "Zg", descriptor = "Lg;")
    public class555 field5960;

    @OriginalMember(owner = "client!vj", name = "oe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5820;

    @OriginalMember(owner = "client!vj", name = "Pe", descriptor = "Z")
    private boolean field5847;

    @OriginalMember(owner = "client!vj", name = "Re", descriptor = "Z")
    private boolean field5849;

    @OriginalMember(owner = "client!vj", name = "Se", descriptor = "Z")
    private boolean field5850;

    @OriginalMember(owner = "client!vj", name = "Ve", descriptor = "Z")
    private boolean field5853;

    @OriginalMember(owner = "client!vj", name = "cf", descriptor = "Z")
    public boolean field5860;

    @OriginalMember(owner = "client!vj", name = "ff", descriptor = "Z")
    private boolean field5863;

    @OriginalMember(owner = "client!vj", name = "gf", descriptor = "Z")
    private boolean field5864;

    @OriginalMember(owner = "client!vj", name = "mf", descriptor = "Z")
    public boolean field5869;

    @OriginalMember(owner = "client!vj", name = "sf", descriptor = "Z")
    private boolean field5875;

    @OriginalMember(owner = "client!vj", name = "wf", descriptor = "Z")
    public boolean field5879;

    @OriginalMember(owner = "client!vj", name = "Af", descriptor = "Z")
    public boolean field5883;

    @OriginalMember(owner = "client!vj", name = "Jf", descriptor = "Z")
    public boolean field5892;

    @OriginalMember(owner = "client!vj", name = "Rf", descriptor = "Z")
    private boolean field5900;

    @OriginalMember(owner = "client!vj", name = "Vf", descriptor = "Z")
    private boolean field5904;

    @OriginalMember(owner = "client!vj", name = "Cg", descriptor = "Z")
    private boolean field5937;

    @OriginalMember(owner = "client!vj", name = "Dg", descriptor = "Z")
    public boolean field5938;

    @OriginalMember(owner = "client!vj", name = "Sg", descriptor = "Z")
    private boolean field5953;

    @OriginalMember(owner = "client!vj", name = "Yg", descriptor = "Z")
    public boolean field5959;

    @OriginalMember(owner = "client!vj", name = "fh", descriptor = "Z")
    public boolean field5966;

    @OriginalMember(owner = "client!vj", name = "qf", descriptor = "[Lav;")
    private class325[] field5873;

    @OriginalMember(owner = "client!vj", name = "ja", descriptor = "(I)V")
    public final void method1002(int arg0) {
        this.method2386(126, 0);
        ++field5800;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class534 method951(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5723;
        return new class201(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "(IIIII)V")
    public final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5750;
        this.method2362(255);
        this.method2386(126, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "(I)V")
    private final void method2357(int arg0) {
        ++field5797;
        float[] var2 = this.field5929;
        float var3 = (float) (-this.field5915 * this.field5941) / (float) this.field5901;
        float var4 = (float) ((this.field5760 - this.field5915) * this.field5941) / (float) this.field5901;
        float var5 = (float) (this.field5944 * this.field5941) / (float) this.field5961;
        float var6 = (float) ((this.field5944 - this.field5766) * this.field5941) / (float) this.field5961;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5941 * 2.0F;
            var2[14] = this.field5950 = -((float) this.field5939 * var7) / (float) (this.field5939 - this.field5941);
            var2[12] = 0.0F;
            var2[11] = -1.0F;
            var2[15] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[10] = this.field5859 = (float) (-(this.field5941 + this.field5939)) / (float) (this.field5939 - this.field5941);
            var2[13] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
        } else {
            var2[11] = 0.0F;
            var2[8] = 0.0F;
            var2[10] = 1.0F;
            var2[1] = 0.0F;
            var2[5] = 1.0F;
            var2[9] = 0.0F;
            var2[14] = 0.0F;
            var2[15] = 1.0F;
            var2[2] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[6] = 0.0F;
            var2[0] = 1.0F;
            var2[12] = 0.0F;
            var2[13] = 0.0F;
            var2[7] = 0.0F;
        }
        this.method2365((byte) 123);
        if (arg0 != 4) {
            this.method1020(-58, (class670[]) null);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZB)V")
    public final void method2358(boolean arg0, byte arg1) {
        ++field5635;
        if (this.field5850 != arg0) {
            this.field5850 = arg0;
            this.method2381((byte) 110);
            this.field5851 &= -32;
        }
        if (arg1 > -45) {
            this.method967();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIIII)Lf;")
    public final class534 method1017(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5642;
        return new class201(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V")
    public final void method954(boolean arg0) {
        ++field5727;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class598 arg6, int arg7, int arg8) {
        ++field5796;
        class417 var10 = (class417) arg6;
        class196 var11 = var10.field5585;
        this.method2397(122);
        this.method2396((byte) 36, var10.field5585);
        this.method2386(127, arg5);
        this.method2412((byte) -49, 7681, 8448);
        this.method2428(768, 34167, 0, -4);
        float var12 = var11.field2266 / (float) var11.field2262;
        float var13 = var11.field2267 / (float) var11.field2261;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method2428(768, 5890, 0, -4);
    }

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "()V")
    public final void method974() {
        OpenGL.glFinish();
        ++field5748;
    }

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "(IIIIII)V")
    public final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5718;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2362(255);
        this.method2386(122, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5863) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5863) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "()Lq;")
    public final class490 method950() {
        ++field5762;
        return this.field5815;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V")
    public final synchronized void method2359(int arg0, int arg1) {
        ++field5710;
        class22 var3 = new class22(arg0);
        if (arg1 != -356) {
            this.field5857 = null;
        }
        this.field5843.method3425(var3, false);
    }

    @OriginalMember(owner = "client!vj", name = "YA", descriptor = "(IIII)V")
    public final void method1031(int arg0, int arg1, int arg2, int arg3) {
        ++field5707;
        if (!this.field5869) {
            throw new RuntimeException("");
        } else {
            this.field5872 = arg2;
            this.field5887 = arg3;
            this.field5926 = arg0;
            this.field5907 = arg1;
            if (this.field5867) {
                this.field5809.field9910.method1586(false);
                this.field5809.field9910.method1587(true);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()V")
    public final void method1011() {
        ++field5659;
        if (this.field5933 && ~this.field5760 < -1 && ~this.field5766 < -1) {
            int var1 = this.field5943;
            int var2 = this.field5930;
            int var3 = this.field5964;
            int var4 = this.field5870;
            this.method1050();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2440((byte) -94);
            this.method2402(0, false);
            this.method2410(false, -95);
            this.method2382(false, 2929);
            this.method2358(false, (byte) -73);
            this.method2396((byte) 36, (class325) null);
            this.method2426(106, -2);
            this.method2421(1, 1);
            this.method2386(123, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5760, this.field5766, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method982(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "()I")
    public final int method971() {
        ++field5787;
        return this.field5939;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    private final void method2360(byte arg0) {
        ++field5680;
        if (this.field5928 != 2) {
            this.field5928 = 2;
            this.method2405(5889);
            this.method2437(110);
            this.field5851 &= -8;
        }
        if (arg0 <= 41) {
            this.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FBFFF)V")
    public final void method2361(float arg0, byte arg1, float arg2, float arg3, float arg4) {
        ++field5808;
        class489.field7120[3] = arg3;
        class489.field7120[2] = arg4;
        class489.field7120[0] = arg2;
        class489.field7120[1] = arg0;
        OpenGL.glTexEnvfv(8960, 8705, class489.field7120, 0);
        if (arg1 != -122) {
            this.field5864 = true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "(I)V")
    private final void method2362(int arg0) {
        if (arg0 != 255) {
            this.field5954 = 30;
        }
        if (~this.field5851 != -2) {
            this.method2416((byte) 124);
            this.method2402(0, false);
            this.method2410(false, -92);
            this.method2382(false, 2929);
            this.method2358(false, (byte) -63);
            this.method2396((byte) 36, (class325) null);
            this.method2426(124, -2);
            this.method2421(1, arg0 ^ 254);
            this.field5851 = 1;
        }
        ++field5675;
    }

    @OriginalMember(owner = "client!vj", name = "JA", descriptor = "()V")
    public final void method1050() {
        this.field5964 = 0;
        this.field5930 = this.field5760;
        this.field5870 = this.field5766;
        this.field5943 = 0;
        ++field5773;
        OpenGL.glDisable(3089);
        this.method2366((byte) 118);
    }

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "(I)V")
    private final void method2363(int arg0) {
        class489.field7120[3] = 1.0F;
        class489.field7120[2] = this.field5945 * this.field5881;
        class489.field7120[1] = this.field5945 * this.field5890;
        ++field5755;
        class489.field7120[0] = this.field5947 * this.field5945;
        OpenGL.glLightfv(16384, 4609, class489.field7120, arg0);
        class489.field7120[2] = -this.field5866 * this.field5881;
        class489.field7120[0] = -this.field5866 * this.field5947;
        class489.field7120[1] = -this.field5866 * this.field5890;
        class489.field7120[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class489.field7120, 0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lkp;B)V")
    public final void method2364(class506 arg0, byte arg1) {
        if (arg1 > -96) {
            this.field5875 = false;
        }
        ++field5686;
        if (this.field5892) {
            this.method2377(arg0, -1);
            this.method2413(-1, arg0);
        } else if (~this.field5832 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field5832 >= 0) {
                this.field5831[this.field5832].method126(29177);
            }
            this.field5827 = this.field5825 = this.field5831[++this.field5832] = arg0;
            this.field5827.method120((byte) 105);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
    private final void method2365(byte arg0) {
        this.field5929[14] = this.field5950;
        int var2 = -51 / ((arg0 - 53) / 49);
        ++field5785;
        this.field5929[10] = this.field5859;
        this.field5917 = (float) this.field5939;
        this.field5868 = (this.field5929[14] - (float) this.field5939) / this.field5929[10];
    }

    @OriginalMember(owner = "client!vj", name = "FA", descriptor = "(ILua;II)V")
    public final void method1036(int arg0, class598 arg1, int arg2, int arg3) {
        ++field5646;
        class417 var5 = (class417) arg1;
        class196 var6 = var5.field5585;
        this.method2397(100);
        this.method2396((byte) 36, var5.field5585);
        this.method2386(123, 1);
        this.method2412((byte) -49, 7681, 8448);
        this.method2428(768, 34167, 0, -4);
        float var7 = var6.field2266 / (float) var6.field2262;
        float var8 = var6.field2267 / (float) var6.field2261;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field5943 - arg2) * var7, (float) (-arg3 + this.field5964) * var8);
        OpenGL.glVertex2i(this.field5943, this.field5964);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5943) * var7, (float) (-arg3 + this.field5870) * var8);
        OpenGL.glVertex2i(this.field5943, this.field5870);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5930) * var7, (float) (-arg3 + this.field5870) * var8);
        OpenGL.glVertex2i(this.field5930, this.field5870);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5930) * var7, (float) (this.field5964 - arg3) * var8);
        OpenGL.glVertex2i(this.field5930, this.field5964);
        OpenGL.glEnd();
        this.method2428(768, 5890, 0, -4);
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V")
    public final void method942(int arg0) {
        ++field5765;
        this.method2383(-27326);
    }

    @OriginalMember(owner = "client!vj", name = "da", descriptor = "(IIII)V")
    public final void method982(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (this.field5766 < arg3) {
            arg3 = this.field5766;
        }
        if (arg2 > this.field5760) {
            arg2 = this.field5760;
        }
        ++field5666;
        this.field5964 = arg1;
        this.field5870 = arg3;
        this.field5943 = arg0;
        this.field5930 = arg2;
        OpenGL.glEnable(3089);
        this.method2366((byte) 127);
        this.method2424((byte) -102);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
    private final void method2366(byte arg0) {
        if (arg0 <= 91) {
            this.field5901 = -75;
        }
        ++field5644;
        this.field5931 = (float) (-this.field5944 + this.field5870);
        this.field5962 = (float) (-this.field5915 + this.field5943);
        this.field5878 = (float) (-this.field5915 + this.field5930);
        this.field5951 = (float) (-this.field5944 + this.field5964);
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "(I)Lfca;")
    public final class140 method2367(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field5780;
            return this.field5896 != null ? this.field5896.method1501(4) : null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "CA", descriptor = "(IIII)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3) {
        ++field5614;
        this.field5926 = arg0;
        this.field5869 = true;
        this.field5907 = arg1;
        this.field5872 = arg2;
        this.field5887 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "(I)V")
    private final void method2368(int arg0) {
        ++field5684;
        int var2 = 0;
        if (arg0 == 16386) {
            while (this.field5916 > var2) {
                class670 var3 = this.field5967[var2];
                int var4 = var2 + 16386;
                class605.field8499[0] = (float) var3.method3711(1795643394);
                class605.field8499[1] = (float) var3.method3703((byte) -29);
                class605.field8499[2] = (float) var3.method3706((byte) 125);
                class605.field8499[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class605.field8499, 0);
                int var5 = var3.method3710(false);
                float var6 = var3.method3704((byte) -94) / 255.0F;
                class605.field8499[2] = var6 * (float) class105.method572(var5, 255);
                class605.field8499[0] = (float) class105.method572(var5 >> 16, 255) * var6;
                class605.field8499[1] = (float) (class105.method572(var5, 65291) >> 8) * var6;
                OpenGL.glLightfv(var4, 4609, class605.field8499, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3708((byte) 83) * var3.method3708((byte) 83)));
                OpenGL.glEnable(var4);
                ++var2;
            }
            while (~this.field5952 < ~var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field5952 = this.field5916;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V")
    public final void method2369(byte arg0) {
        ++field5677;
        if (~this.field5851 != -5) {
            this.method2416((byte) 121);
            this.method2402(0, false);
            this.method2410(false, -101);
            this.method2382(false, 2929);
            this.method2358(false, (byte) -87);
            this.method2426(118, -2);
            this.method2386(123, 1);
            this.field5851 = 4;
        }
        if (arg0 > -5) {
            this.field5873 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "()Z")
    public final boolean method960() {
        ++field5772;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "(I)V")
    public final void method2370(int arg0) {
        if (arg0 == 16) {
            OpenGL.glPopMatrix();
            ++field5693;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIII)V")
    public final void method2371(int arg0, int arg1, int arg2, int arg3) {
        ++field5647;
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
        if (arg2 >= -28) {
            this.field5918 = null;
        }
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "()V")
    public final void method979() throws class20 {
        ++field5731;
        try {
            this.field5794.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "(I)V")
    private final void method2372(int arg0) {
        ++field5716;
        float var2 = (float) (-this.field5915) * this.field5922 / (float) this.field5901;
        float var3 = (float) (-this.field5944) * this.field5922 / (float) this.field5961;
        float var4 = (float) (-this.field5915 + this.field5760) * this.field5922 / (float) this.field5901;
        float var5 = (float) (-this.field5944 + this.field5766) * this.field5922 / (float) this.field5961;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field5941, (double) this.field5939);
        }
        OpenGL.glMatrixMode(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[Leq;)V")
    public final void method1020(int arg0, class670[] arg1) {
        ++field5745;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5967[var3] = arg1[var3];
        }
        this.field5916 = arg0;
        if (~this.field5928 != -2) {
            this.method2368(16386);
        }
    }

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "(I)V")
    private final void method2373(int arg0) {
        if (this.field5904 && !this.field5864) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field5788;
        if (arg0 >= -56) {
            this.field5818 = -63;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()Z")
    public final boolean method1052() {
        ++field5643;
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZII)V")
    public final void method2374(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field5923 = true;
        }
        if (~this.field5877 != ~arg2 || this.field5869 == !this.field5867) {
            class555 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field5869 ? 0 : 3;
            if (~arg2 > -1) {
                this.method2418(58);
            } else {
                var5 = this.field5801.method362(arg2, (byte) 0);
                class295 var10 = super.field8050.method140(arg2, 862);
                if (var10.field3673 == 0 && var10.field3681 == 0) {
                    this.method2418(121);
                } else {
                    int var11 = !var10.field3668 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method2384((float) (this.field5817 % var12 * var10.field3673) / (float) var12, arg3 ^ 108, 0.0F, (float) (this.field5817 % var12 * var10.field3681) / (float) var12);
                }
                var6 = var10.field3682;
                if (!this.field5869) {
                    var9 = var10.field3669;
                    var8 = var10.field3677;
                    var7 = var10.field3676;
                }
            }
            this.field5809.method3937(var7, var8, arg0, arg1, -111, var9);
            if (!this.field5809.method3939(23491, var5, var6)) {
                this.method2396((byte) 36, var5);
                this.method2421(var6, 1);
            }
            this.field5867 = this.field5869;
            this.field5877 = arg2;
        }
        ++field5751;
        this.field5851 &= -8;
    }

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "(I)V")
    public final void method2375(int arg0) {
        if (arg0 == -1) {
            ++field5784;
            OpenGL.glLightfv(16384, 4611, this.field5899, 0);
            OpenGL.glLightfv(16385, 4611, this.field5914, 0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BF)V")
    public final void method2376(byte arg0, float arg1) {
        ++field5703;
        int var3 = -78 / ((arg0 - 65) / 54);
        if (this.field5922 != arg1) {
            this.field5922 = arg1;
            if (~this.field5928 == -4) {
                this.method2372(5888);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lkp;I)V")
    public final void method2377(class506 arg0, int arg1) {
        ++field5746;
        if (this.field5824 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field5824 <= arg1) {
                this.field5828[this.field5824].method112(-20845);
            }
            this.field5827 = this.field5828[++this.field5824] = arg0;
            this.field5827.method118(arg1 + 10);
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "()Z")
    public final boolean method1044() {
        ++field5709;
        return this.field5805 != null && this.field5805.method3654((byte) -128);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIII)V")
    public final void method2378(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg0, arg3, arg2);
        ++field5701;
        if (arg1 != 0) {
            this.method1008();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method956(Canvas arg0) {
        ++field5697;
        long var2 = 0L;
        if (arg0 != null && this.field5730 != arg0) {
            if (this.field5682.containsKey(arg0)) {
                Long var4 = (Long) this.field5682.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5739;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field5794.surfaceResized(var2);
            if (this.field5655 == arg0) {
                this.method2435(125);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
    public final void method2379(boolean arg0, int arg1) {
        class489.field7120[2] = (float) class105.method572(arg1, 255) / 255.0F;
        class489.field7120[3] = (float) (arg1 >>> 24) / 255.0F;
        class489.field7120[0] = (float) class105.method572(arg1, 16711680) / 1.671168E7F;
        if (!arg0) {
            this.method2428(124, 111, 119, 29);
        }
        class489.field7120[1] = (float) class105.method572(65280, arg1) / 65280.0F;
        ++field5749;
        OpenGL.glTexEnvfv(8960, 8705, class489.field7120, 0);
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)Le;")
    public final class385 method1012(int arg0) {
        ++field5804;
        class630 var2 = new class630(arg0);
        this.field5819.method3425(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)V")
    public final synchronized void method2380(byte arg0, int arg1) {
        if (arg0 < 32) {
            this.method1042();
        }
        ++field5623;
        class333 var3 = new class333();
        var3.field4176 = (long) arg1;
        this.field5845.method3425(var3, false);
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "()Z")
    public final boolean method1008() {
        ++field5624;
        return this.field5863 && (!this.method1044() || this.field5875);
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "()Z")
    public final boolean method965() {
        ++field5650;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "ZA", descriptor = "(Z)V")
    public final void method955(boolean arg0) {
        this.field5923 = arg0;
        ++field5798;
        this.method2381((byte) 110);
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)V")
    private final void method2381(byte arg0) {
        OpenGL.glDepthMask(this.field5850 && this.field5923);
        ++field5725;
        if (arg0 != 110) {
            this.method2441(19, -55, 12);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(ZI)V")
    public final void method2382(boolean arg0, int arg1) {
        ++field5719;
        if (!this.field5847 != !arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field5851 &= -32;
            this.field5847 = arg0;
        }
        if (arg1 != 2929) {
            this.method2434(43, (class506) null);
        }
    }

    @OriginalMember(owner = "client!vj", name = "VA", descriptor = "(IFFFFF)V")
    public final void method1032(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5633;
        boolean var7 = ~this.field5903 != ~arg0;
        if (var7 || this.field5945 != arg1 || this.field5866 != arg2) {
            this.field5866 = arg2;
            this.field5903 = arg0;
            this.field5945 = arg1;
            if (var7) {
                this.field5881 = (float) (this.field5903 & 255) / 255.0F;
                this.field5890 = (float) (65280 & this.field5903) / 65280.0F;
                this.field5947 = (float) (16711680 & this.field5903) / 1.671168E7F;
                this.method2385(1524926288);
            }
            this.method2363(0);
        }
        if (this.field5958[0] != arg3 || this.field5958[1] != arg4 || this.field5958[2] != arg5) {
            this.field5958[0] = arg3;
            this.field5958[1] = arg4;
            this.field5958[2] = arg5;
            this.field5942[0] = -arg3;
            this.field5942[2] = -arg5;
            this.field5942[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5899[0] = arg3 * var8;
            this.field5899[2] = arg5 * var8;
            this.field5899[1] = arg4 * var8;
            this.field5914[0] = -this.field5899[0];
            this.field5914[1] = -this.field5899[1];
            this.field5914[2] = -this.field5899[2];
            this.method2375(-1);
            this.field5880 = (int) (arg5 * 256.0F / arg4);
            this.field5871 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "()Z")
    public final boolean method1038() {
        ++field5660;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "(I)V")
    private final void method2383(int arg0) {
        if (arg0 != -27326) {
            this.field5811 = null;
        }
        ++field5782;
        this.field5794.method3545();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FIFF)V")
    private final void method2384(float arg0, int arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field5795;
        if (this.field5953) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg3, arg2);
        int var5 = -90 / ((-3 - arg1) / 42);
        OpenGL.glMatrixMode(5888);
        this.field5953 = true;
    }

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "(I)V")
    private final void method2385(int arg0) {
        class489.field7120[0] = this.field5949 * this.field5947;
        class489.field7120[3] = 1.0F;
        if (arg0 == 1524926288) {
            ++field5789;
            class489.field7120[2] = this.field5949 * this.field5881;
            class489.field7120[1] = this.field5949 * this.field5890;
            OpenGL.glLightModelfv(2899, class489.field7120, 0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class274 method1001(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5685;
        return new class72(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "(IIII)V")
    public final void method941(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field5870 < ~arg3) {
            this.field5870 = arg3;
        }
        if (~this.field5930 < ~arg2) {
            this.field5930 = arg2;
        }
        if (~this.field5964 > ~arg1) {
            this.field5964 = arg1;
        }
        ++field5793;
        if (~this.field5943 > ~arg0) {
            this.field5943 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method2366((byte) 101);
        this.method2424((byte) -102);
    }

    @OriginalMember(owner = "client!vj", name = "pa", descriptor = "(III)V")
    public final void method937(int arg0, int arg1, int arg2) {
        if (this.field5963 != arg0 || ~this.field5954 != ~arg1 || this.field5920 != arg2) {
            this.field5963 = arg0;
            this.field5920 = arg2;
            this.field5954 = arg1;
            this.method2425(121);
            this.method2433(false);
        }
        ++field5744;
    }

    @OriginalMember(owner = "client!vj", name = "ya", descriptor = "()V")
    public final void method969() {
        this.method2358(true, (byte) -66);
        ++field5695;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)V")
    public final void method2386(int arg0, int arg1) {
        if (this.field5852 != arg1) {
            boolean var3;
            byte var4;
            boolean var5;
            if (arg1 == 1) {
                var3 = true;
                var4 = 1;
                var5 = true;
            } else if (arg1 == 2) {
                var3 = false;
                var5 = true;
                var4 = 2;
            } else if (~arg1 != -129) {
                var5 = true;
                var3 = false;
                var4 = 0;
            } else {
                var5 = true;
                var3 = true;
                var4 = 3;
            }
            if (var5 == !this.field5853) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field5853 = var5;
            }
            if (!this.field5849 == var3) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field5849 = var3;
            }
            if (this.field5848 != var4) {
                if (var4 != 1) {
                    if (var4 != 2) {
                        if (var4 == 3) {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        } else {
                            OpenGL.glDisable(3042);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field5848 = var4;
            }
            this.field5851 &= -29;
            this.field5852 = arg1;
        }
        ++field5620;
        if (arg0 <= 121) {
            this.method2419((class351) null, -42, (class351) null, (class351) null, (class351) null);
        }
    }

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "(I)V")
    private final void method2387(int arg0) {
        ++field5621;
        if (arg0 == 8960) {
            int var2 = 0;
            while (!this.field5794.method3544()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class452.method2602(1000L, (byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
    public final synchronized void method2388(int arg0, int arg1, int arg2) {
        int var4 = -39 % ((arg2 - -45) / 38);
        ++field5640;
        class22 var5 = new class22(arg0);
        var5.field4176 = (long) arg1;
        this.field5844.method3425(var5, false);
    }

    @OriginalMember(owner = "client!vj", name = "DA", descriptor = "()I")
    public final int method1021() {
        ++field5779;
        int var1 = this.field5971;
        this.field5971 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vj", name = "ra", descriptor = "(F)V")
    public final void method949(float arg0) {
        if (this.field5949 != arg0) {
            this.field5949 = arg0;
            this.method2385(1524926288);
        }
        ++field5791;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(II)I")
    public final int method2389(int arg0, int arg1) {
        if (arg1 != 2) {
            return 65;
        } else {
            ++field5631;
            if (arg0 == 1) {
                return 7681;
            } else if (~arg0 == -1) {
                return 8448;
            } else if (~arg0 != -3) {
                if (arg0 == 3) {
                    return 260;
                } else if (~arg0 == -5) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 34165;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "(I)V")
    private final void method2390(int arg0) {
        if (arg0 != -23189) {
            this.method2437(108);
        }
        ++field5654;
        if (~this.field5928 != -4) {
            this.field5928 = 3;
            this.method2372(5888);
            this.method2437(108);
            this.field5851 &= -8;
        }
    }

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "()Lq;")
    public final class490 method983() {
        ++field5683;
        return this.field5854;
    }

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "()Z")
    public final boolean method972() {
        ++field5694;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method993(Canvas arg0) {
        ++field5781;
        if (this.field5730 == arg0) {
            throw new RuntimeException();
        } else if (this.field5682.containsKey(arg0)) {
            Long var2 = (Long) this.field5682.get(arg0);
            this.field5794.releaseSurface(arg0, var2);
            this.field5682.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public final void method1015(boolean arg0) {
        ++field5692;
    }

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "()Z")
    public final boolean method939() {
        ++field5669;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIF)Leq;")
    public final class670 method1010(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5681;
        return new class48(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V")
    public final void method1018(int arg0) {
        this.method2387(8960);
        ++field5619;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lf;Z)V")
    public final void method990(class534 arg0, boolean arg1) {
        ++field5778;
        this.field5829 = (class201) arg0;
        if (this.field5948) {
            if (this.field5830 == null) {
                this.field5830 = new class24(this);
            }
            if (this.field5825 == this.field5830) {
                throw new RuntimeException();
            }
            this.method2364(this.field5830, (byte) -127);
            if (arg1) {
                class508 var3 = (class508) this.field5835.method3669((long) (this.field5829.method315() << 16 | this.field5829.method306()), -1);
                if (var3 == null) {
                    var3 = new class508(this, 6402, this.field5829.method315(), this.field5829.method306());
                    class508 var5;
                    for (this.field5839 += var3.field7290; ~this.field5839 < -2097153; this.field5839 -= var5.field7290) {
                        class617 var4 = this.field5834.method1676((byte) -13);
                        if (var4 == null) {
                            break;
                        }
                        var5 = (class508) var4;
                        var5.method3443(117);
                        var5.method1922(93);
                        var5.method2905((byte) -127);
                    }
                    this.field5835.method3671(false, var3, (long) (this.field5829.method315() << 16 | this.field5829.method306()));
                }
                this.field5834.method1674(var3, 24800);
                this.field5830.method113(var3, 8, (byte) -22);
            }
            this.field5830.method127(0, this.field5829.field2378, 4);
        } else {
            if (!this.field5900) {
                throw new RuntimeException("");
            }
            class571 var6 = (class571) this.field5835.method3669((long) (this.field5829.method315() << 16 | this.field5829.method306()), -1);
            if (var6 == null) {
                var6 = new class571(this, this.field5829.method315(), this.field5829.method306());
                class571 var8;
                for (this.field5839 += var6.field8105 * 4; this.field5839 > 2097152; this.field5839 -= var8.field8105) {
                    class617 var7 = this.field5834.method1676((byte) -13);
                    if (var7 == null) {
                        break;
                    }
                    var8 = (class571) var7;
                    var8.method3443(100);
                    var8.method1922(120);
                    this.field5794.releasePbuffer(var8.method3229((byte) -89));
                }
                this.field5835.method3671(false, var6, (long) (this.field5829.method315() << 16 | this.field5829.method306()));
            }
            this.field5834.method1674(var6, 24800);
            this.field5794.setPbuffer(var6.method3229((byte) -52));
        }
        this.field5760 = arg0.method315();
        this.field5766 = arg0.method306();
        this.method2440((byte) -94);
        this.method2430((byte) 87);
        this.method1050();
    }

    @OriginalMember(owner = "client!vj", name = "AA", descriptor = "(III[I)V")
    public final void method1019(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5717;
        float var5 = (float) arg2 * this.field5854.field2101 + (float) arg0 * this.field5854.field2102 + (float) arg1 * this.field5854.field2103 + this.field5854.field2072;
        if (!(var5 < (float) this.field5941) && !(var5 > (float) this.field5939)) {
            int var6 = (int) (((float) arg2 * this.field5854.field2073 + (float) arg0 * this.field5854.field2105 + (float) arg1 * this.field5854.field2092 + this.field5854.field2074) * (float) this.field5901 / var5);
            int var7 = (int) (((float) arg2 * this.field5854.field2087 + (float) arg0 * this.field5854.field2104 + (float) arg1 * this.field5854.field2098 + this.field5854.field2076) * (float) this.field5961 / var5);
            if ((float) var6 >= this.field5962 && (float) var6 <= this.field5878 && (float) var7 >= this.field5951 && this.field5931 >= (float) var7) {
                arg3[0] = (int) ((float) var6 - this.field5962);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field5951);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public final int method1004(int arg0, int arg1) {
        ++field5662;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)V")
    public final synchronized void method2391(int arg0, long arg1) {
        if (arg0 <= -43) {
            ++field5770;
            class333 var4 = new class333();
            var4.field4176 = arg1;
            this.field5846.method3425(var4, false);
        }
    }

    @OriginalMember(owner = "client!vj", name = "MA", descriptor = "(III[I)V")
    public final void method970(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5689;
        float var5 = (float) arg2 * this.field5854.field2101 + (float) arg0 * this.field5854.field2102 + (float) arg1 * this.field5854.field2103 + this.field5854.field2072;
        if (!((float) this.field5941 > var5) && !(var5 > (float) this.field5939)) {
            int var6 = (int) (((float) arg2 * this.field5854.field2073 + (float) arg0 * this.field5854.field2105 + (float) arg1 * this.field5854.field2092 + this.field5854.field2074) * (float) this.field5901 / var5);
            arg3[0] = (int) ((float) var6 + -this.field5962);
            int var7 = (int) (((float) arg2 * this.field5854.field2087 + (float) arg0 * this.field5854.field2104 + (float) arg1 * this.field5854.field2098 + this.field5854.field2076) * (float) this.field5961 / var5);
            arg3[1] = (int) ((float) var7 - this.field5951);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lqo;Z)Lf;")
    public final class534 method1041(class550 arg0, boolean arg1) {
        ++field5672;
        int[] var3 = new int[arg0.field7873 * arg0.field7872];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field7868 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field7872; ++var6) {
                for (int var7 = 0; arg0.field7873 > var7; ++var7) {
                    int var8 = arg0.field7871[255 & arg0.field7869[var4++]];
                    var3[var5++] = ~var8 == -1 ? 0 : method2436(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; var9 < arg0.field7872; ++var9) {
                for (int var11 = 0; ~arg0.field7873 < ~var11; ++var11) {
                    var3[var5++] = method2436(arg0.field7871[class105.method572(255, arg0.field7869[var4])], arg0.field7868[var4] << 24);
                    ++var4;
                }
            }
        }
        class534 var10 = this.method1017(var3, 0, arg0.field7873, arg0.field7873, arg0.field7872);
        var10.method313(arg0.field7870, arg0.field7867, arg0.field7875, arg0.field7874);
        return var10;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lcn;I)V")
    public final void method2392(class21 arg0, int arg1) {
        if (this.field5894 != arg0) {
            if (this.field5882) {
                OpenGL.glBindBufferARB(34963, arg0.method98(14463));
            }
            this.field5894 = arg0;
        }
        int var3 = 123 / ((arg1 - -15) / 39);
        ++field5690;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lkw;Z)V")
    public final void method2393(class185 arg0, boolean arg1) {
        if (!arg1) {
            this.field5872 = 125;
        }
        ++field5626;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method1128(-9586), 0);
    }

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "()Z")
    public final boolean method946() {
        ++field5637;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFF)V")
    public final void method975(float arg0, float arg1, float arg2) {
        class370.field5059 = arg1;
        class275.field3445 = arg0;
        class678.field9536 = arg2;
        ++field5814;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BFF)V")
    public final void method2394(byte arg0, float arg1, float arg2) {
        ++field5763;
        this.field5921 = arg1;
        this.field5886 = arg2;
        if (arg0 >= -114) {
            this.field5878 = 0.56025976F;
        }
        this.method2425(67);
    }

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "()V")
    public final void method1049() {
        this.field5811.method1132(true);
        ++field5641;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lkw;I)V")
    public final void method2395(class185 arg0, int arg1) {
        OpenGL.glLoadMatrixf(arg0.method1128(-9586), 0);
        if (arg1 != 2) {
            this.field5949 = 2.4462924F;
        }
        ++field5700;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
    public final void method1029() {
        for (class333 var1 = this.field5819.method3434((byte) 2); var1 != null; var1 = this.field5819.method3430(true)) {
            ((class630) var1).method3537(59);
        }
        ++field5714;
        if (this.field5811 != null) {
            this.field5811.method1136((byte) -120);
        }
        if (this.field5794 != null) {
            this.method2383(-27326);
            Enumeration var2 = this.field5682.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5682.get(var3);
                this.field5794.releaseSurface(var3, var4);
            }
            this.field5794.release();
            this.field5794 = null;
        }
        if (this.field5821) {
            class694.method3817(true, false, (byte) 43);
            this.field5821 = false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLav;)V")
    public final void method2396(byte arg0, class325 arg1) {
        ++field5712;
        if (arg0 == 36) {
            class325 var3 = this.field5873[this.field5884];
            if (arg1 != var3) {
                if (arg1 != null) {
                    if (var3 != null) {
                        if (arg1.field3988 != var3.field3988) {
                            OpenGL.glDisable(var3.field3988);
                            OpenGL.glEnable(arg1.field3988);
                        }
                    } else {
                        OpenGL.glEnable(arg1.field3988);
                    }
                    OpenGL.glBindTexture(arg1.field3988, arg1.method1831((byte) -120));
                } else {
                    OpenGL.glDisable(var3.field3988);
                }
                this.field5873[this.field5884] = arg1;
            }
            this.field5851 &= -2;
        }
    }

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "()Z")
    public final boolean method1005() {
        ++field5634;
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Llj;)V")
    public final void method947(class60 arg0) {
        ++field5617;
        this.field5896 = (class412) arg0;
    }

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "()I")
    public final int method952() {
        ++field5753;
        int var1 = this.field5968;
        this.field5968 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIIIII)V")
    public final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5688;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method2362(255);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2386(123, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5863) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5863) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "()V")
    public final void method1000() {
        ++field5758;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method968(Canvas arg0) {
        ++field5667;
        if (this.field5730 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5682.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5794.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field5682.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "(I)V")
    public final void method2397(int arg0) {
        if (arg0 >= 8) {
            if (this.field5851 != 2) {
                this.method2416((byte) 120);
                this.method2402(0, false);
                this.method2410(false, -91);
                this.method2382(false, 2929);
                this.method2358(false, (byte) -97);
                this.method2426(108, -2);
                this.field5851 = 2;
            }
            ++field5777;
        }
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "()Z")
    public final boolean method1042() {
        ++field5747;
        return this.field5809.method3938(3, 1);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5728;
        OpenGL.glLineWidth((float) arg5);
        this.method957(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Le;)V")
    public final void method1043(class385 arg0) {
        ++field5790;
        this.field5820 = ((class630) arg0).field8866;
        if (this.field5957 == null) {
            class209 var2 = new class209(80);
            if (this.field5874) {
                var2.method1242(-12989, -1.0F);
                var2.method1242(-12989, -1.0F);
                var2.method1242(-12989, 0.0F);
                var2.method1242(-12989, 0.0F);
                var2.method1242(-12989, 1.0F);
                var2.method1242(-12989, 1.0F);
                var2.method1242(-12989, -1.0F);
                var2.method1242(-12989, 0.0F);
                var2.method1242(-12989, 1.0F);
                var2.method1242(-12989, 1.0F);
                var2.method1242(-12989, 1.0F);
                var2.method1242(-12989, 1.0F);
                var2.method1242(-12989, 0.0F);
                var2.method1242(-12989, 1.0F);
                var2.method1242(-12989, 0.0F);
                var2.method1242(-12989, -1.0F);
                var2.method1242(-12989, 1.0F);
                var2.method1242(-12989, 0.0F);
                var2.method1242(-12989, 0.0F);
                var2.method1242(-12989, 0.0F);
            } else {
                var2.method1243(113, -1.0F);
                var2.method1243(59, -1.0F);
                var2.method1243(49, 0.0F);
                var2.method1243(77, 0.0F);
                var2.method1243(61, 1.0F);
                var2.method1243(63, 1.0F);
                var2.method1243(102, -1.0F);
                var2.method1243(120, 0.0F);
                var2.method1243(107, 1.0F);
                var2.method1243(110, 1.0F);
                var2.method1243(36, 1.0F);
                var2.method1243(97, 1.0F);
                var2.method1243(73, 0.0F);
                var2.method1243(66, 1.0F);
                var2.method1243(116, 0.0F);
                var2.method1243(115, -1.0F);
                var2.method1243(124, 1.0F);
                var2.method1243(80, 0.0F);
                var2.method1243(81, 0.0F);
                var2.method1243(118, 0.0F);
            }
            this.field5957 = this.method2438(var2.field1269, 20, (byte) -75, false, var2.field1218);
            this.field5906 = new class351(this.field5957, 5126, 3, 0);
            this.field5910 = new class351(this.field5957, 5126, 2, 12);
            this.field5803.method136(2, this);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ[BIZ)Lcn;")
    public final class21 method2398(int arg0, boolean arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field5733;
        if (!this.field5882 || arg1 && !this.field5940) {
            if (!arg4) {
                this.method1052();
            }
            return new class97(this, arg3, arg2, arg0);
        } else {
            return new class329(this, arg3, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
    public final synchronized void method2399(int arg0, int arg1, int arg2) {
        int var4 = -83 / (arg0 / 56);
        ++field5651;
        class22 var5 = new class22(arg1);
        var5.field4176 = (long) arg2;
        this.field5841.method3425(var5, false);
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
    public final synchronized void method948(int arg0) {
        ++field5687;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field5841.method3439((byte) -78)) {
            class22 var12 = (class22) this.field5841.method3440((byte) -8);
            class394.field5344[var2++] = (int) var12.field4176;
            this.field5840 -= var12.field168;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class394.field5344, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class394.field5344, 0);
            var2 = 0;
        }
        while (!this.field5842.method3439((byte) 102)) {
            class22 var11 = (class22) this.field5842.method3440((byte) 113);
            class394.field5344[var2++] = (int) var11.field4176;
            this.field5837 -= var11.field168;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class394.field5344, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class394.field5344, 0);
            var2 = 0;
        }
        while (!this.field5843.method3439((byte) 67)) {
            class22 var10 = (class22) this.field5843.method3440((byte) -113);
            class394.field5344[var2++] = var10.field168;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class394.field5344, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class394.field5344, 0);
            var2 = 0;
        }
        while (!this.field5844.method3439((byte) -38)) {
            class22 var9 = (class22) this.field5844.method3440((byte) 119);
            class394.field5344[var2++] = (int) var9.field4176;
            this.field5836 -= var9.field168;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class394.field5344, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class394.field5344, 0);
            boolean var4 = false;
        }
        while (!this.field5838.method3439((byte) -91)) {
            class22 var8 = (class22) this.field5838.method3440((byte) 121);
            OpenGL.glDeleteLists((int) var8.field4176, var8.field168);
        }
        while (!this.field5845.method3439((byte) 77)) {
            class333 var7 = this.field5845.method3440((byte) -92);
            OpenGL.glDeleteProgramARB((int) var7.field4176);
        }
        while (!this.field5846.method3439((byte) 82)) {
            class333 var6 = this.field5846.method3440((byte) -40);
            OpenGL.glDeleteObjectARB(var6.field4176);
        }
        while (!this.field5838.method3439((byte) 66)) {
            class22 var5 = (class22) this.field5838.method3440((byte) 125);
            OpenGL.glDeleteLists((int) var5.field4176, var5.field168);
        }
        this.field5801.method360(-118);
        if (~this.method981() < -100663297 && ~(this.field5855 - -60000L) > ~class557.method3157(-83)) {
            System.gc();
            this.field5855 = class557.method3157(-83);
        }
        this.field5817 = var3;
    }

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "()[I")
    public final int[] method938() {
        ++field5711;
        return new int[] { this.field5915, this.field5944, this.field5901, this.field5961 };
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public final void method991(int arg0) {
        ++field5735;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field5806 = arg0;
            this.field5801.method363((byte) -48);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZBI)V")
    public final void method2400(boolean arg0, byte arg1, int arg2) {
        this.method2374(true, arg0, arg2, 0);
        ++field5742;
        int var4 = -67 / ((73 - arg1) / 34);
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V")
    public final void method978(int arg0) {
        ++field5715;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(B)V")
    public static void method2401(byte arg0) {
        if (arg0 > -62) {
            field5774 = null;
        }
        field5774 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZ)Lf;")
    public final class534 method1025(int arg0, int arg1, boolean arg2) {
        ++field5737;
        return new class201(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method1006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5775;
        float var7 = (float) arg2 * this.field5854.field2101 + (float) arg0 * this.field5854.field2102 + (float) arg1 * this.field5854.field2103 + this.field5854.field2072;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5854.field2101 + (float) arg3 * this.field5854.field2102 + (float) arg4 * this.field5854.field2103 + this.field5854.field2072;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5941 > var7) || !((float) this.field5941 > var8)) && (!(var7 > (float) this.field5939) || !(var8 > (float) this.field5939))) {
            int var9 = (int) (((float) arg2 * this.field5854.field2073 + (float) arg0 * this.field5854.field2105 + (float) arg1 * this.field5854.field2092 + this.field5854.field2074) * (float) this.field5901 / var7);
            int var10 = (int) (((float) arg5 * this.field5854.field2073 + (float) arg3 * this.field5854.field2105 + (float) arg4 * this.field5854.field2092 + this.field5854.field2074) * (float) this.field5901 / var8);
            if (this.field5962 > (float) var9 && (float) var10 < this.field5962 || (float) var9 > this.field5878 && (float) var10 > this.field5878) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5854.field2087 + (float) arg0 * this.field5854.field2104 + (float) arg1 * this.field5854.field2098 + this.field5854.field2076) * (float) this.field5961 / var7);
                int var12 = (int) (((float) arg5 * this.field5854.field2087 + (float) arg3 * this.field5854.field2104 + (float) arg4 * this.field5854.field2098 + this.field5854.field2076) * (float) this.field5961 / var8);
                return (!((float) var11 < this.field5951) || !((float) var12 < this.field5951)) && (!(this.field5931 < (float) var11) || !((float) var12 > this.field5931));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V")
    public final void method2402(int arg0, boolean arg1) {
        if (this.field5937 != arg1) {
            this.field5937 = arg1;
            this.method2433(false);
            this.field5851 &= -32;
        }
        ++field5702;
        if (arg0 != 0) {
            this.method1027(-89);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lcn;IIII)V")
    public final void method2403(class21 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5754;
        if (arg4 < 108) {
            this.method1046(10, -25, -117, -11, 30, -74, 107);
        }
        int var6 = arg0.method96(-80);
        int var7 = arg1 * this.method2427(var6, (byte) 82);
        this.method2392(arg0, -86);
        OpenGL.glDrawElements(arg3, arg2, var6, arg0.method95(true) - -((long) var7));
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
    public final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2362(255);
        ++field5740;
        this.method2386(123, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vj", name = "GA", descriptor = "(II)V")
    public final void method1016(int arg0, int arg1) {
        ++field5696;
        if (~this.field5941 != ~arg0 || ~this.field5939 != ~arg1) {
            this.field5941 = arg0;
            this.field5939 = arg1;
            this.method2357(4);
            this.method2425(43);
            if (~this.field5928 != -4) {
                if (this.field5928 == 2) {
                    this.method2405(5889);
                    return;
                }
            } else {
                this.method2372(5888);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method988(Canvas arg0) {
        this.field5705 = 0L;
        ++field5810;
        this.field5655 = null;
        if (arg0 != null && this.field5730 != arg0) {
            if (this.field5682.containsKey(arg0)) {
                Long var2 = (Long) this.field5682.get(arg0);
                this.field5705 = var2;
                this.field5655 = arg0;
            }
        } else {
            this.field5655 = this.field5730;
            this.field5705 = this.field5739;
        }
        if (this.field5655 != null && ~this.field5705 != -1L) {
            this.field5794.setSurface(this.field5705);
            this.method2435(111);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([SIB)[S")
    public static final short[] method2404(short[] arg0, int arg1, byte arg2) {
        ++field5628;
        int var3 = -88 / ((-26 - arg2) / 62);
        short[] var4 = new short[arg1];
        class567.method3212(arg0, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "(I)V")
    private final void method2405(int arg0) {
        OpenGL.glMatrixMode(arg0);
        ++field5658;
        OpenGL.glLoadMatrixf(this.field5929, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BILjaclib/memory/Buffer;ZI)Lut;")
    public final class199 method2406(byte arg0, int arg1, Buffer arg2, boolean arg3, int arg4) {
        ++field5732;
        if (arg0 != -4) {
            this.field5831 = null;
        }
        return (class199) (!this.field5882 || arg3 && !this.field5940 ? new class180(this, arg4, arg2) : new class114(this, arg4, arg2, arg1, arg3));
    }

    @OriginalMember(owner = "client!vj", name = "va", descriptor = "(I)V")
    public final void method1027(int arg0) {
        this.field5818 = 0;
        ++field5618;
        while (arg0 > 1) {
            ++this.field5818;
            arg0 >>= 1;
        }
        this.field5823 = 1 << this.field5818;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(B)V")
    private final void method2407(byte arg0) {
        ++field5726;
        this.field5873 = new class325[this.field5913];
        this.field5960 = new class555(this, 3553, 6408, 1, 1);
        new class555(this, 3553, 6408, 1, 1);
        new class555(this, 3553, 6408, 1, 1);
        this.field5862 = new class366(this);
        this.field5932 = new class366(this);
        if (arg0 != -17) {
            this.field5890 = -1.3646518F;
        }
        this.field5858 = new class366(this);
        this.field5897 = new class366(this);
        this.field5955 = new class366(this);
        this.field5924 = new class366(this);
        this.field5934 = new class366(this);
        this.field5956 = new class366(this);
        this.field5927 = new class366(this);
        this.field5912 = new class366(this);
        if (this.field5948) {
            this.field5925 = new class24(this);
            new class24(this);
        }
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(B)V")
    private final void method2408(byte arg0) {
        ++field5630;
        this.method2426(119, -2);
        for (int var2 = this.field5913 - 1; var2 >= 0; --var2) {
            this.method2431((byte) -61, var2);
            this.method2396((byte) 36, (class325) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2412((byte) -49, 8448, 8448);
        this.method2428(770, 34168, 2, -4);
        this.method2418(58);
        this.field5852 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        if (arg0 >= -90) {
            this.method1006(-32, -17, 7, -41, -67, 62);
        }
        this.field5848 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field5849 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5853 = true;
        this.method2402(0, true);
        this.method2410(true, -91);
        this.method2382(true, 2929);
        this.method2358(true, (byte) -104);
        this.method2440((byte) -94);
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
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field5903 = this.field5963 = -1;
        this.method1050();
    }

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "(I)I")
    private final int method2409(int arg0) {
        ++field5661;
        int var2 = 0;
        this.field5895 = OpenGL.glGetString(7936).toLowerCase();
        this.field5936 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field5895.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field5895.indexOf("brian paul") != -1 || ~this.field5895.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class182.method1105(' ', (byte) -75, var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class274.method1607(var4[0], 1);
                int var6 = class274.method1607(var4[1], 1);
                this.field5909 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field5909 > -13) {
            var2 |= 2;
        }
        if (!this.field5794.method3546("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5794.method3546("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5913 = var7[arg0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5891 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5865 = var7[0];
        if (~this.field5913 > -3 || this.field5891 < 2 || this.field5865 < 2) {
            var2 |= 16;
        }
        this.field5874 = Stream.method3480();
        this.field5900 = this.field5794.arePbuffersAvailable();
        this.field5882 = this.field5794.method3546("GL_ARB_vertex_buffer_object");
        this.field5863 = this.field5794.method3546("GL_ARB_multisample");
        this.field5938 = this.field5794.method3546("GL_ARB_vertex_program");
        this.field5794.method3546("GL_ARB_fragment_program");
        this.field5959 = this.field5794.method3546("GL_ARB_vertex_shader");
        this.field5879 = this.field5794.method3546("GL_ARB_fragment_shader");
        this.field5893 = this.field5794.method3546("GL_EXT_texture3D");
        this.field5919 = this.field5794.method3546("GL_ARB_texture_rectangle");
        this.field5883 = this.field5794.method3546("GL_ARB_texture_cube_map");
        this.field5889 = this.field5794.method3546("GL_ARB_texture_float");
        this.field5966 = false;
        this.field5948 = this.field5794.method3546("GL_EXT_framebuffer_object");
        this.field5892 = this.field5794.method3546("GL_EXT_framebuffer_blit");
        this.field5860 = this.field5794.method3546("GL_EXT_framebuffer_multisample");
        this.field5875 = this.field5860 & this.field5892;
        OpenGL.glGetFloatv(2834, class489.field7120, 0);
        this.field5905 = class489.field7120[0];
        this.field5946 = class489.field7120[1];
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(ZI)V")
    public final void method2410(boolean arg0, int arg1) {
        if (this.field5904 == !arg0) {
            this.field5904 = arg0;
            this.method2373(-57);
            this.field5851 &= -8;
        }
        ++field5671;
        if (arg1 > -74) {
            this.field5856 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)V")
    public final void method2411(boolean arg0) {
        if (!arg0) {
            OpenGL.glPushMatrix();
            ++field5738;
        }
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(IIII)[I")
    public final int[] method944(int arg0, int arg1, int arg2, int arg3) {
        ++field5615;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field5766 + -var6, arg2, 1, 32993, this.field5908, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BII)V")
    public final void method2412(byte arg0, int arg1, int arg2) {
        ++field5679;
        if (arg0 != -49) {
            this.method2421(-47, -122);
        }
        if (this.field5884 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (~this.field5911 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var4 = true;
                this.field5911 = arg1;
            }
            if (~this.field5935 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                var4 = true;
                this.field5935 = arg2;
            }
            if (var4) {
                this.field5851 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "()I")
    public final int method953() {
        ++field5768;
        return 4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILkp;)V")
    public final void method2413(int arg0, class506 arg1) {
        ++field5664;
        if (~this.field5826 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field5826 >= 0) {
                this.field5833[this.field5826].method115(arg0 ^ 1017);
            }
            this.field5825 = this.field5833[++this.field5826] = arg1;
            this.field5825.method119((byte) -15);
            if (arg0 != -1) {
                this.method2391(-58, -96L);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "(I)V")
    public final void method2414(int arg0) {
        int var2 = 113 % ((-70 - arg0) / 52);
        ++field5670;
        if (this.field5851 != 8) {
            this.method2360((byte) 99);
            this.method2402(0, true);
            this.method2382(true, 2929);
            this.method2358(true, (byte) -102);
            this.method2386(123, 1);
            this.field5851 = 8;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lkp;Z)V")
    public final void method2415(class506 arg0, boolean arg1) {
        ++field5676;
        if (this.field5824 >= 0 && this.field5828[this.field5824] == arg0) {
            if (arg1) {
                this.field5817 = -88;
            }
            this.field5828[this.field5824--] = null;
            arg0.method112(-20845);
            if (~this.field5824 <= -1) {
                this.field5827 = this.field5828[this.field5824];
                this.field5827.method118(69);
            } else {
                this.field5827 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(B)V")
    private final void method2416(byte arg0) {
        if (~this.field5928 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field5760 > 0 && this.field5766 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field5760, (double) this.field5766, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5851 &= -25;
            this.field5928 = 1;
        }
        if (arg0 >= 118) {
            ++field5734;
        }
    }

    @OriginalMember(owner = "client!vj", name = "oa", descriptor = "([I)V")
    public final void method963(int[] arg0) {
        arg0[1] = this.field5964;
        ++field5649;
        arg0[3] = this.field5870;
        arg0[2] = this.field5930;
        arg0[0] = this.field5943;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lho;[Lqo;Z)Lla;")
    public final class413 method998(class463 arg0, class550[] arg1, boolean arg2) {
        ++field5636;
        return new class69(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "()Laj;")
    public final class286 method1037() {
        ++field5691;
        int var1 = -1;
        if (~this.field5895.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field5895.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (this.field5895.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class286(var1, "OpenGL", this.field5909, this.field5936, 0L);
    }

    @OriginalMember(owner = "client!vj", name = "la", descriptor = "(IIII)V")
    public final void method997(int arg0, int arg1, int arg2, int arg3) {
        this.field5901 = arg2;
        this.field5915 = arg0;
        this.field5961 = arg3;
        ++field5713;
        this.field5944 = arg1;
        this.method2357(4);
        this.method2366((byte) 124);
        if (~this.field5928 == -4) {
            this.method2372(5888);
        } else if (this.field5928 == 2) {
            this.method2405(5889);
        }
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "()Z")
    public final boolean method977() {
        ++field5761;
        if (this.field5805 != null) {
            if (!this.field5805.method3654((byte) -127)) {
                if (!this.field5811.method1138(this.field5805, (byte) -122)) {
                    return false;
                }
                this.field5801.method363((byte) -40);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(II)I")
    public final int method2417(int arg0, int arg1) {
        ++field5625;
        if (~arg0 != -6407 && arg0 != 6409) {
            if (arg0 != 6410 && ~arg0 != -34847 && arg0 != 34844) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (~arg0 != -6409 && ~arg0 != -34848) {
                    if (arg0 != 34843) {
                        if (~arg0 == -34843) {
                            return 8;
                        } else if (arg0 == 6402) {
                            return 3;
                        } else if (~arg0 == -6402) {
                            return 1;
                        } else {
                            if (arg1 != 3553) {
                                this.field5947 = -0.11099993F;
                            }
                            throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lqw;)V")
    public final void method1033(class332 arg0) {
        ++field5720;
        this.field5803.method137(arg0, -1, this, 16);
    }

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "(I)V")
    private final void method2418(int arg0) {
        ++field5704;
        if (arg0 < 36) {
            this.method1000();
        }
        if (this.field5953) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5953 = false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "XA", descriptor = "(IIIII)V")
    public final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5622;
        this.method2362(255);
        this.method2386(125, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lhea;ILhea;Lhea;Lhea;)V")
    public final void method2419(class351 arg0, int arg1, class351 arg2, class351 arg3, class351 arg4) {
        if (arg1 <= 76) {
            this.field5846 = null;
        }
        ++field5769;
        if (arg0 != null) {
            this.method2420((byte) 23, arg0.field4738);
            OpenGL.glVertexPointer(arg0.field4739, arg0.field4740, this.field5861.method607(31556), this.field5861.method608(-29334) - -((long) arg0.field4736));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method2420((byte) 23, arg4.field4738);
            OpenGL.glNormalPointer(arg4.field4740, this.field5861.method607(31556), this.field5861.method608(-29334) - -((long) arg4.field4736));
            OpenGL.glEnableClientState(32885);
        }
        if (arg2 != null) {
            this.method2420((byte) 23, arg2.field4738);
            OpenGL.glColorPointer(arg2.field4739, arg2.field4740, this.field5861.method607(31556), this.field5861.method608(-29334) - -((long) arg2.field4736));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method2420((byte) 23, arg3.field4738);
            OpenGL.glTexCoordPointer(arg3.field4739, arg3.field4740, this.field5861.method607(31556), this.field5861.method608(-29334) + (long) arg3.field4736);
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lef;IIII)Lda;")
    public final class473 method1051(class581 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5802;
        return new class366(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(IIIIII)Llj;")
    public final class60 method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5668;
        return !this.field5883 ? null : new class637(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLut;)V")
    public final void method2420(byte arg0, class199 arg1) {
        ++field5652;
        if (this.field5861 != arg1) {
            if (this.field5882) {
                OpenGL.glBindBufferARB(34962, arg1.method604(-18775));
            }
            this.field5861 = arg1;
        }
        if (arg0 != 23) {
            this.method948(96);
        }
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(II)V")
    public final void method2421(int arg0, int arg1) {
        if (arg0 != arg1) {
            if (arg0 == 0) {
                this.method2412((byte) -49, 8448, 8448);
            } else if (~arg0 == -3) {
                this.method2412((byte) -49, 34165, 7681);
            } else if (~arg0 == -4) {
                this.method2412((byte) -49, 260, 8448);
            } else if (~arg0 == -5) {
                this.method2412((byte) -49, 34023, 34023);
            }
        } else {
            this.method2412((byte) -49, 7681, 7681);
        }
        ++field5799;
    }

    @OriginalMember(owner = "client!vj", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5722;
        float var10;
        float var11;
        if (this.field5918 != null && ~arg2 >= ~this.field5918.field7931 && this.field5918.field7928 >= arg3) {
            this.field5918.method3149(false, 0, 0, arg3, arg2, arg6, 0, 4, 0, 6406);
            var10 = (float) arg2 * this.field5918.field2266 / (float) this.field5918.field7931;
            var11 = (float) arg3 * this.field5918.field2267 / (float) this.field5918.field7928;
        } else {
            this.field5918 = class254.method1503(6406, arg6, false, -121, arg2, arg3, this, 6406);
            this.field5918.method3148(10243, false, false);
            var10 = this.field5918.field2266;
            var11 = this.field5918.field2267;
        }
        this.method2397(125);
        this.method2396((byte) 36, this.field5918);
        this.method2386(122, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2379(true, arg5);
        this.method2412((byte) -49, 34165, 34165);
        this.method2428(768, 34166, 0, -4);
        this.method2428(770, 5890, 2, -4);
        this.method2371(770, 0, -72, 34166);
        this.method2371(770, 2, -98, 5890);
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
        this.method2428(768, 5890, 0, -4);
        this.method2428(770, 34166, 2, -4);
        this.method2371(770, 0, -75, 5890);
        this.method2371(770, 2, -72, 34166);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BZ)V")
    public final void method2422(byte arg0, boolean arg1) {
        ++field5756;
        if (this.field5864 == !arg1) {
            this.field5864 = arg1;
            this.method2373(-114);
        }
        if (arg0 != -90) {
            this.field5869 = false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(IIIII)V")
    public final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field5653;
        if (~(arg0 - -arg2) <= ~this.field5943 && this.field5930 >= -arg2 + arg0 && arg1 - -arg2 >= this.field5964 && ~(-arg2 + arg1) >= ~this.field5870) {
            this.method2362(255);
            this.method2386(123, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field5905 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field5946 >= (float) var8) {
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
                if (~var9 >= -65) {
                    var9 = 64;
                } else if (~var9 < -513) {
                    var9 = 512;
                }
                int var10 = class668.method3699(28069, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class358.field4800[var11] * (float) arg2 + var6, class358.field4799[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lq;)V")
    public final void method992(class490 arg0) {
        this.field5854.method15(arg0);
        ++field5665;
        this.field5856.method15(this.field5854);
        this.field5856.method1125(9538);
        this.field5857.method1122(this.field5856, (byte) 44);
        if (this.field5928 != 1) {
            this.method2437(108);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIFIFFI[BFFLvaa;I)V")
    public static final void method2423(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, float arg6, int arg7, byte[] arg8, float arg9, float arg10, class265 arg11, int arg12) {
        if (arg2 != 79) {
            field5774 = null;
        }
        for (int var13 = 0; arg0 > var13; ++var13) {
            class360.method2114(arg9, 127, arg5, arg12, arg8, arg3, arg10, arg6, arg11, arg7, arg1, arg4, var13, arg0);
            arg1 += arg4 * arg12;
        }
        ++field5663;
    }

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "()V")
    public final void method1047() {
        ++field5759;
        this.field5869 = false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method958(Rectangle[] arg0, int arg1) throws class20 {
        ++field5729;
        this.method979();
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
    public final int method973(int arg0, int arg1) {
        ++field5776;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "()Z")
    public final boolean method994() {
        ++field5743;
        return this.field5805 != null && (this.field5813 <= 1 || this.field5875);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[I[I)Lua;")
    public final class598 method940(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5771;
        return class74.method401(-14183, arg1, arg0, arg3, arg2, this);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V")
    public class422(Canvas arg0, class524 arg1, int arg2) {
        super(arg1);
        this.field5813 = arg2;
        this.field5655 = this.field5730 = arg0;
        if (!class166.method908("jaclib", (byte) 123)) {
            throw new RuntimeException("");
        } else if (!class166.method908("jaggl", (byte) 100)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field5794 = new OpenGL();
                this.field5705 = this.field5739 = this.field5794.init(arg0, 8, 8, 8, 24, 0, this.field5813);
                if (this.field5739 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2387(8960);
                    int var4 = this.method2409(0);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field5908 = this.field5874 ? 33639 : 5121;
                        if (this.field5936.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class182.method1105(' ', (byte) -75, this.field5936.replace('/', ' '));
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class63.method334(9394, var10.substring(1, 3))) {
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
                                            if (~var10.length() <= -5 && class63.method334(9394, var10.substring(0, 4))) {
                                                var5 = class274.method1607(var10.substring(0, 4), 1);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field5893 = false;
                                }
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field5882 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field5889 = false;
                            }
                            this.field5919 &= this.field5794.method3546("GL_ARB_half_float_pixel");
                            this.field5885 = true;
                            this.field5940 = this.field5882;
                        }
                        if (this.field5895.indexOf("intel") != -1) {
                            this.field5948 = false;
                        }
                        this.field5933 = !this.field5895.equals("s3 graphics");
                        if (this.field5882) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class370.method2159(-35, true, false);
                        this.field5821 = true;
                        this.field5801 = new class68(this, super.field8050);
                        this.method2407((byte) -17);
                        this.field5822 = new class168(this);
                        this.field5811 = new class187(this);
                        if (this.field5811.method1137((byte) -51)) {
                            this.field5805 = new class703(this);
                            if (!this.field5805.method3895(1)) {
                                this.field5805.method3655(7);
                                this.field5805 = null;
                            }
                        }
                        this.field5809 = new class705(this);
                        this.method2408((byte) -106);
                        this.method2435(102);
                        this.method1011();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method1029();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lqw;I)V")
    public final void method1048(class332 arg0, int arg1) {
        ++field5792;
        this.field5803.method137(arg0, arg1, this, 16);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
    public final void method976(int arg0, int arg1, int arg2, int arg3) {
        ++field5698;
        this.field5811.method1133(90, arg3, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "(B)V")
    private final void method2424(byte arg0) {
        ++field5639;
        if (this.field5943 <= this.field5930 && this.field5964 <= this.field5870) {
            OpenGL.glScissor(this.field5943 + this.field5888, this.field5876 - (-this.field5766 - -this.field5870), -this.field5943 + this.field5930, this.field5870 - this.field5964);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != -102) {
            this.field5811 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "()V")
    public final void method1045() {
        ++field5812;
        if (!this.field5948) {
            if (!this.field5900) {
                throw new RuntimeException("");
            }
            this.field5829.method485(0, 0, this.field5760, this.field5766, 0, 0);
            this.field5794.setSurface(this.field5705);
        } else {
            if (this.field5825 != this.field5830) {
                throw new RuntimeException();
            }
            this.field5830.method125(0, 1);
            this.field5830.method125(8, 1);
            this.method2429(-30575, this.field5830);
        }
        this.field5829 = null;
        this.field5760 = this.field5752;
        this.field5766 = this.field5786;
        this.method2440((byte) -94);
        this.method2430((byte) 79);
        this.method1050();
    }

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "(I)V")
    private final void method2425(int arg0) {
        this.field5898 = (float) (-this.field5920 + this.field5939) + -this.field5921;
        ++field5673;
        this.field5902 = -((float) this.field5954 * this.field5886) + this.field5898;
        if ((float) this.field5941 > this.field5902) {
            this.field5902 = (float) this.field5941;
        }
        if (arg0 <= 14) {
            this.field5966 = false;
        }
        OpenGL.glFogf(2915, this.field5902);
        OpenGL.glFogf(2916, this.field5898);
        class489.field7120[2] = (float) class105.method572(255, this.field5963) / 255.0F;
        class489.field7120[1] = (float) class105.method572(this.field5963, 65280) / 65280.0F;
        class489.field7120[0] = (float) class105.method572(16711680, this.field5963) / 1.671168E7F;
        OpenGL.glFogfv(2918, class489.field7120, 0);
    }

    @OriginalMember(owner = "client!vj", name = "BA", descriptor = "()I")
    public final int method966() {
        ++field5638;
        return this.field5941;
    }

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "()V")
    public final void method967() {
        ++field5674;
        if (this.field5805 != null && this.field5805.method3654((byte) -126)) {
            this.field5811.method1139(-2415, this.field5805);
            this.field5801.method363((byte) -91);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([I)V")
    public final void method996(int[] arg0) {
        arg0[0] = this.field5760;
        ++field5741;
        arg0[1] = this.field5766;
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(II)V")
    public final void method2426(int arg0, int arg1) {
        ++field5616;
        if (arg0 < 105) {
            this.method993((Canvas) null);
        }
        this.method2400(true, (byte) -123, arg1);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)I")
    public final int method2427(int arg0, byte arg1) {
        if (arg1 <= 37) {
            this.field5821 = true;
        }
        ++field5757;
        if (arg0 != 5121 && ~arg0 != -5121) {
            if (arg0 != 5123 && arg0 != 5122) {
                if (arg0 != 5125 && ~arg0 != -5125 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(IIII)V")
    public final void method2428(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34176 - -arg2, arg1);
        if (arg3 != -4) {
            this.method971();
        }
        ++field5764;
        OpenGL.glTexEnvi(8960, 34192 - -arg2, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "()Z")
    public final boolean method1053() {
        ++field5632;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(ILkp;)V")
    public final void method2429(int arg0, class506 arg1) {
        ++field5627;
        if (!this.field5892) {
            if (this.field5832 < 0 || this.field5831[this.field5832] != arg1) {
                throw new RuntimeException();
            }
            this.field5831[this.field5832--] = null;
            arg1.method126(29177);
            if (~this.field5832 <= -1) {
                this.field5827 = this.field5825 = this.field5831[this.field5832];
                this.field5827.method120((byte) 106);
            } else {
                this.field5827 = this.field5825 = null;
            }
        } else {
            this.method2415(arg1, false);
            this.method2434(-517, arg1);
        }
        if (arg0 != -30575) {
            this.field5820 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "(B)V")
    private final void method2430(byte arg0) {
        if (arg0 <= 70) {
            this.method2378(39, -118, -54, -125);
        }
        OpenGL.glViewport(this.field5888, this.field5876, this.field5760, this.field5766);
        ++field5699;
    }

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "()Lq;")
    public final class490 method1035() {
        ++field5767;
        return new class185();
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(BI)V")
    public final void method2431(byte arg0, int arg1) {
        if (arg0 > -22) {
            this.field5827 = null;
        }
        if (~this.field5884 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field5884 = arg1;
        }
        ++field5783;
    }

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "(I)V")
    public final void method2432(int arg0) {
        ++field5645;
        if (this.field5851 != arg0) {
            this.method2390(-23189);
            this.method2402(0, true);
            this.method2382(true, arg0 + 2913);
            this.method2358(true, (byte) -65);
            this.method2386(124, 1);
            this.field5851 = 16;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(Z)V")
    private final void method2433(boolean arg0) {
        if (this.field5937 && this.field5954 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field5706;
        if (arg0) {
            this.field5891 = -85;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(ILkp;)V")
    public final void method2434(int arg0, class506 arg1) {
        ++field5657;
        if (this.field5826 >= 0 && this.field5833[this.field5826] == arg1) {
            this.field5833[this.field5826--] = null;
            arg1.method115(arg0 ^ 509);
            if (arg0 != -517) {
                this.method2429(101, (class506) null);
            }
            if (~this.field5826 <= -1) {
                this.field5825 = this.field5833[this.field5826];
                this.field5825.method119((byte) -15);
            } else {
                this.field5825 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Llj;Llj;FLlj;)Llj;")
    public final class60 method959(class60 arg0, class60 arg1, float arg2, class60 arg3) {
        ++field5656;
        if (arg0 != null && arg1 != null && this.field5883 && this.field5948) {
            class254 var5 = null;
            class412 var6 = (class412) arg0;
            class412 var7 = (class412) arg1;
            class140 var8 = var6.method1501(4);
            class140 var9 = var7.method1501(4);
            if (var8 != null && var9 != null) {
                int var10 = var9.field1544 < var8.field1544 ? var8.field1544 : var9.field1544;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class254) {
                    class254 var11 = (class254) arg3;
                    if (~var11.method1498(0) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class254(this, var10);
                }
                if (var5.method1497(arg2, var9, 65534, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "(I)V")
    private final void method2435(int arg0) {
        if (this.field5655 == null) {
            this.field5752 = this.field5786 = 0;
        } else {
            Dimension var2 = this.field5655.getSize();
            this.field5786 = var2.height;
            this.field5752 = var2.width;
        }
        ++field5648;
        if (arg0 < 100) {
            this.field5904 = false;
        }
        if (this.field5825 == null) {
            this.field5760 = this.field5752;
            this.field5766 = this.field5786;
            this.method2430((byte) 98);
        }
        this.method2440((byte) -94);
        this.method1050();
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(II)I")
    public static int method2436(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()I")
    public final int method981() {
        ++field5721;
        return this.field5837 + this.field5836 + this.field5840;
    }

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "(I)V")
    private final void method2437(int arg0) {
        OpenGL.glLoadIdentity();
        ++field5807;
        OpenGL.glMultMatrixf(this.field5856.method1128(-9586), 0);
        if (this.field5867) {
            this.field5809.field9910.method1586(false);
        }
        if (arg0 <= 94) {
            this.method1049();
        }
        this.method2375(-1);
        this.method2368(16386);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([BIBZI)Lut;")
    public final class199 method2438(byte[] arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        ++field5736;
        if (arg2 != -75) {
            return null;
        } else {
            return (class199) (!this.field5882 || arg3 && !this.field5940 ? new class180(this, arg1, arg0, arg4) : new class114(this, arg1, arg0, arg4, arg3));
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5629;
        this.method2362(255);
        this.method2386(122, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V")
    public final synchronized void method2439(int arg0, int arg1, int arg2) {
        ++field5678;
        class22 var4 = new class22(arg1);
        var4.field4176 = (long) arg0;
        if (arg2 != 4318) {
            this.field5940 = false;
        }
        this.field5842.method3425(var4, false);
    }

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "(B)V")
    public final void method2440(byte arg0) {
        ++field5724;
        if (arg0 != -94) {
            this.field5961 = -89;
        }
        if (this.field5928 != 0) {
            this.field5928 = 0;
            this.field5851 &= -32;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(III)V")
    public final void method2441(int arg0, int arg1, int arg2) {
        this.field5888 = arg2;
        ++field5708;
        this.field5876 = arg1;
        this.method2430((byte) 108);
        if (arg0 == -13703) {
            this.method2424((byte) -102);
        }
    }
}
