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

@OriginalClass("client!lj")
public class class565 extends class166 {

    @OriginalMember(owner = "client!lj", name = "xb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7682 = new Hashtable();

    @OriginalMember(owner = "client!lj", name = "ce", descriptor = "I")
    public int field7817 = 128;

    @OriginalMember(owner = "client!lj", name = "Zd", descriptor = "Lpm;")
    private class541 field7814 = new class541();

    @OriginalMember(owner = "client!lj", name = "le", descriptor = "Lcf;")
    private class561 field7826 = new class561();

    @OriginalMember(owner = "client!lj", name = "me", descriptor = "Lcf;")
    public class561 field7827 = new class561();

    @OriginalMember(owner = "client!lj", name = "qe", descriptor = "I")
    public int field7831 = 8;

    @OriginalMember(owner = "client!lj", name = "re", descriptor = "Z")
    private boolean field7832 = false;

    @OriginalMember(owner = "client!lj", name = "pe", descriptor = "I")
    public int field7830 = 3;

    @OriginalMember(owner = "client!lj", name = "se", descriptor = "Lgca;")
    private class227 field7833 = new class227();

    @OriginalMember(owner = "client!lj", name = "ve", descriptor = "I")
    private int field7836 = -1;

    @OriginalMember(owner = "client!lj", name = "xe", descriptor = "[Lbw;")
    private class640[] field7838 = new class640[4];

    @OriginalMember(owner = "client!lj", name = "Be", descriptor = "I")
    private int field7842 = -1;

    @OriginalMember(owner = "client!lj", name = "Ae", descriptor = "I")
    private int field7841 = -1;

    @OriginalMember(owner = "client!lj", name = "Ee", descriptor = "[Lbw;")
    private class640[] field7845 = new class640[4];

    @OriginalMember(owner = "client!lj", name = "Fe", descriptor = "[Lbw;")
    private class640[] field7846 = new class640[4];

    @OriginalMember(owner = "client!lj", name = "we", descriptor = "Lje;")
    private class367 field7837 = new class367();

    @OriginalMember(owner = "client!lj", name = "Ge", descriptor = "Lfaa;")
    private class139 field7847 = new class139(16);

    @OriginalMember(owner = "client!lj", name = "He", descriptor = "Lgca;")
    private class227 field7848 = new class227();

    @OriginalMember(owner = "client!lj", name = "Me", descriptor = "Lgca;")
    private class227 field7853 = new class227();

    @OriginalMember(owner = "client!lj", name = "Ne", descriptor = "Lgca;")
    private class227 field7854 = new class227();

    @OriginalMember(owner = "client!lj", name = "Oe", descriptor = "Lgca;")
    private class227 field7855 = new class227();

    @OriginalMember(owner = "client!lj", name = "Pe", descriptor = "Lgca;")
    private class227 field7856 = new class227();

    @OriginalMember(owner = "client!lj", name = "Qe", descriptor = "Lgca;")
    private class227 field7857 = new class227();

    @OriginalMember(owner = "client!lj", name = "Re", descriptor = "Lgca;")
    private class227 field7858 = new class227();

    @OriginalMember(owner = "client!lj", name = "Ze", descriptor = "Lcf;")
    public class561 field7866 = new class561();

    @OriginalMember(owner = "client!lj", name = "bf", descriptor = "Lcf;")
    public class561 field7868 = new class561();

    @OriginalMember(owner = "client!lj", name = "cf", descriptor = "Lcf;")
    public class561 field7869 = new class561();

    @OriginalMember(owner = "client!lj", name = "rf", descriptor = "F")
    private float field7883 = 0.0F;

    @OriginalMember(owner = "client!lj", name = "qf", descriptor = "I")
    private int field7882 = -1;

    @OriginalMember(owner = "client!lj", name = "mf", descriptor = "[F")
    private float[] field7878 = new float[16];

    @OriginalMember(owner = "client!lj", name = "uf", descriptor = "I")
    public int field7886 = 0;

    @OriginalMember(owner = "client!lj", name = "sf", descriptor = "I")
    private int field7884 = 0;

    @OriginalMember(owner = "client!lj", name = "Pf", descriptor = "F")
    private float field7907 = -1.0F;

    @OriginalMember(owner = "client!lj", name = "ff", descriptor = "I")
    private int field7872 = 8448;

    @OriginalMember(owner = "client!lj", name = "nf", descriptor = "F")
    private float field7879 = 1.0F;

    @OriginalMember(owner = "client!lj", name = "wf", descriptor = "F")
    public float field7888 = 3584.0F;

    @OriginalMember(owner = "client!lj", name = "Yf", descriptor = "F")
    public float field7916 = -1.0F;

    @OriginalMember(owner = "client!lj", name = "og", descriptor = "I")
    private int field7932 = 0;

    @OriginalMember(owner = "client!lj", name = "gg", descriptor = "I")
    public int field7924 = 512;

    @OriginalMember(owner = "client!lj", name = "qg", descriptor = "I")
    private int field7934 = 0;

    @OriginalMember(owner = "client!lj", name = "Mf", descriptor = "I")
    public int field7904 = -1;

    @OriginalMember(owner = "client!lj", name = "xg", descriptor = "[F")
    private float[] field7941 = new float[4];

    @OriginalMember(owner = "client!lj", name = "vg", descriptor = "I")
    public int field7939 = 0;

    @OriginalMember(owner = "client!lj", name = "Dg", descriptor = "F")
    private float field7947 = -1.0F;

    @OriginalMember(owner = "client!lj", name = "fg", descriptor = "[F")
    public float[] field7923 = new float[4];

    @OriginalMember(owner = "client!lj", name = "Mg", descriptor = "I")
    public int field7956 = 512;

    @OriginalMember(owner = "client!lj", name = "Eg", descriptor = "F")
    public float field7948 = 1.0F;

    @OriginalMember(owner = "client!lj", name = "sg", descriptor = "I")
    private int field7936 = 0;

    @OriginalMember(owner = "client!lj", name = "wg", descriptor = "Z")
    private boolean field7940 = false;

    @OriginalMember(owner = "client!lj", name = "Zg", descriptor = "I")
    private int field7969 = 0;

    @OriginalMember(owner = "client!lj", name = "Gg", descriptor = "I")
    public int field7950 = 0;

    @OriginalMember(owner = "client!lj", name = "Tg", descriptor = "F")
    public float field7963 = 1.0F;

    @OriginalMember(owner = "client!lj", name = "Kf", descriptor = "F")
    public float field7902 = 3584.0F;

    @OriginalMember(owner = "client!lj", name = "ng", descriptor = "I")
    private int field7931 = 0;

    @OriginalMember(owner = "client!lj", name = "ig", descriptor = "I")
    private int field7926 = 3584;

    @OriginalMember(owner = "client!lj", name = "Cg", descriptor = "I")
    public int field7946 = -1;

    @OriginalMember(owner = "client!lj", name = "fh", descriptor = "F")
    public float field7975 = 1.0F;

    @OriginalMember(owner = "client!lj", name = "Bg", descriptor = "[F")
    private float[] field7945 = new float[4];

    @OriginalMember(owner = "client!lj", name = "ug", descriptor = "F")
    private float field7938 = 1.0F;

    @OriginalMember(owner = "client!lj", name = "Sg", descriptor = "I")
    public int field7962 = -1;

    @OriginalMember(owner = "client!lj", name = "vf", descriptor = "Z")
    private boolean field7887 = true;

    @OriginalMember(owner = "client!lj", name = "Ug", descriptor = "I")
    public int field7964 = 0;

    @OriginalMember(owner = "client!lj", name = "Rg", descriptor = "[F")
    private float[] field7961 = new float[4];

    @OriginalMember(owner = "client!lj", name = "hf", descriptor = "I")
    public int field7874 = 50;

    @OriginalMember(owner = "client!lj", name = "Wg", descriptor = "I")
    public int field7966 = -1;

    @OriginalMember(owner = "client!lj", name = "Rf", descriptor = "F")
    public float field7909 = -1.0F;

    @OriginalMember(owner = "client!lj", name = "Zf", descriptor = "I")
    private int field7917 = 8448;

    @OriginalMember(owner = "client!lj", name = "jh", descriptor = "[Ltw;")
    private class186[] field7979 = new class186[class474.field6530];

    @OriginalMember(owner = "client!lj", name = "Hf", descriptor = "Lwu;")
    public class340 field7899 = new class340(8192);

    @OriginalMember(owner = "client!lj", name = "mh", descriptor = "[I")
    public int[] field7982 = new int[1];

    @OriginalMember(owner = "client!lj", name = "lh", descriptor = "[I")
    public int[] field7981 = new int[1];

    @OriginalMember(owner = "client!lj", name = "oh", descriptor = "[I")
    public int[] field7984 = new int[1];

    @OriginalMember(owner = "client!lj", name = "ph", descriptor = "[B")
    public byte[] field7985 = new byte[16384];

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7655;

    @OriginalMember(owner = "client!lj", name = "ib", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7667;

    @OriginalMember(owner = "client!lj", name = "Wd", descriptor = "I")
    public int field7811;

    @OriginalMember(owner = "client!lj", name = "Ob", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field7699;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "J")
    private long field7625;

    @OriginalMember(owner = "client!lj", name = "Nb", descriptor = "J")
    private long field7698;

    @OriginalMember(owner = "client!lj", name = "dg", descriptor = "Z")
    public boolean field7921;

    @OriginalMember(owner = "client!lj", name = "yg", descriptor = "I")
    public int field7942;

    @OriginalMember(owner = "client!lj", name = "Xf", descriptor = "Ljava/lang/String;")
    private String field7915;

    @OriginalMember(owner = "client!lj", name = "Lg", descriptor = "Z")
    public boolean field7955;

    @OriginalMember(owner = "client!lj", name = "Ng", descriptor = "Z")
    public boolean field7957;

    @OriginalMember(owner = "client!lj", name = "gf", descriptor = "Z")
    private boolean field7873;

    @OriginalMember(owner = "client!lj", name = "dh", descriptor = "Z")
    public boolean field7973;

    @OriginalMember(owner = "client!lj", name = "eh", descriptor = "Z")
    public boolean field7974;

    @OriginalMember(owner = "client!lj", name = "Jf", descriptor = "Z")
    private boolean field7901;

    @OriginalMember(owner = "client!lj", name = "tf", descriptor = "Ljava/lang/String;")
    private String field7885;

    @OriginalMember(owner = "client!lj", name = "Fg", descriptor = "Z")
    public boolean field7949;

    @OriginalMember(owner = "client!lj", name = "Tf", descriptor = "Z")
    private boolean field7911;

    @OriginalMember(owner = "client!lj", name = "de", descriptor = "Lpu;")
    private class523 field7818;

    @OriginalMember(owner = "client!lj", name = "oe", descriptor = "Lof;")
    public class576 field7829;

    @OriginalMember(owner = "client!lj", name = "fe", descriptor = "Lpv;")
    private class63 field7820;

    @OriginalMember(owner = "client!lj", name = "be", descriptor = "Lcs;")
    private class311 field7816;

    @OriginalMember(owner = "client!lj", name = "Xd", descriptor = "Llt;")
    private class628 field7812;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Lin;")
    public static class78 field7638 = null;

    @OriginalMember(owner = "client!lj", name = "tb", descriptor = "[I")
    public static int[] field7678 = new int[2];

    @OriginalMember(owner = "client!lj", name = "he", descriptor = "I")
    public static int field7822 = 0;

    @OriginalMember(owner = "client!lj", name = "hg", descriptor = "F")
    public float field7925;

    @OriginalMember(owner = "client!lj", name = "jg", descriptor = "F")
    public float field7927;

    @OriginalMember(owner = "client!lj", name = "zg", descriptor = "F")
    public float field7943;

    @OriginalMember(owner = "client!lj", name = "Ag", descriptor = "F")
    private float field7944;

    @OriginalMember(owner = "client!lj", name = "Vg", descriptor = "F")
    private float field7965;

    @OriginalMember(owner = "client!lj", name = "ah", descriptor = "F")
    private float field7970;

    @OriginalMember(owner = "client!lj", name = "ch", descriptor = "F")
    public float field7972;

    @OriginalMember(owner = "client!lj", name = "gh", descriptor = "F")
    public float field7976;

    @OriginalMember(owner = "client!lj", name = "ih", descriptor = "F")
    public float field7978;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "I")
    public int field7663;

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!lj", name = "kb", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!lj", name = "mb", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!lj", name = "nb", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!lj", name = "ob", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!lj", name = "pb", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!lj", name = "qb", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!lj", name = "rb", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!lj", name = "sb", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!lj", name = "ub", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!lj", name = "vb", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!lj", name = "wb", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!lj", name = "yb", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!lj", name = "zb", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!lj", name = "Ab", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!lj", name = "Bb", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!lj", name = "Cb", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!lj", name = "Db", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!lj", name = "Eb", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!lj", name = "Fb", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!lj", name = "Gb", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!lj", name = "Hb", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!lj", name = "Ib", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!lj", name = "Jb", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!lj", name = "Kb", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!lj", name = "Lb", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!lj", name = "Mb", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!lj", name = "Pb", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!lj", name = "Qb", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!lj", name = "Rb", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!lj", name = "Sb", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!lj", name = "Tb", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!lj", name = "Ub", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!lj", name = "Vb", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!lj", name = "Wb", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!lj", name = "Xb", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!lj", name = "Yb", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!lj", name = "Zb", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!lj", name = "ac", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!lj", name = "bc", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!lj", name = "cc", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!lj", name = "dc", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!lj", name = "ec", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!lj", name = "fc", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!lj", name = "gc", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!lj", name = "hc", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!lj", name = "ic", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!lj", name = "jc", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!lj", name = "kc", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!lj", name = "lc", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!lj", name = "mc", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!lj", name = "nc", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!lj", name = "oc", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!lj", name = "pc", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!lj", name = "qc", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!lj", name = "rc", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!lj", name = "sc", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!lj", name = "tc", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!lj", name = "uc", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!lj", name = "vc", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!lj", name = "wc", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!lj", name = "xc", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!lj", name = "yc", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!lj", name = "zc", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!lj", name = "Ac", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!lj", name = "Bc", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!lj", name = "Cc", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!lj", name = "Dc", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!lj", name = "Ec", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!lj", name = "Fc", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!lj", name = "Gc", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!lj", name = "Hc", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!lj", name = "Ic", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!lj", name = "Jc", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!lj", name = "Kc", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!lj", name = "Lc", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!lj", name = "Nc", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!lj", name = "Oc", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!lj", name = "Pc", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!lj", name = "Qc", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!lj", name = "Rc", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!lj", name = "Sc", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!lj", name = "Tc", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!lj", name = "Uc", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!lj", name = "Vc", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!lj", name = "Wc", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!lj", name = "Xc", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!lj", name = "Yc", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!lj", name = "Zc", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!lj", name = "ad", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!lj", name = "bd", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!lj", name = "cd", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!lj", name = "dd", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!lj", name = "ed", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!lj", name = "fd", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!lj", name = "gd", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!lj", name = "hd", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!lj", name = "id", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!lj", name = "jd", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!lj", name = "kd", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!lj", name = "ld", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!lj", name = "md", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!lj", name = "nd", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!lj", name = "od", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!lj", name = "pd", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!lj", name = "qd", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!lj", name = "rd", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!lj", name = "sd", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!lj", name = "td", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!lj", name = "ud", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!lj", name = "vd", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!lj", name = "wd", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!lj", name = "xd", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!lj", name = "yd", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!lj", name = "zd", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!lj", name = "Ad", descriptor = "I")
    public int field7789;

    @OriginalMember(owner = "client!lj", name = "Bd", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!lj", name = "Cd", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!lj", name = "Dd", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!lj", name = "Ed", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!lj", name = "Fd", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!lj", name = "Gd", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!lj", name = "Hd", descriptor = "I")
    private int field7796;

    @OriginalMember(owner = "client!lj", name = "Id", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!lj", name = "Jd", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!lj", name = "Kd", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!lj", name = "Ld", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!lj", name = "Md", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!lj", name = "Nd", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!lj", name = "Od", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!lj", name = "Pd", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!lj", name = "Qd", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!lj", name = "Rd", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!lj", name = "Sd", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!lj", name = "Td", descriptor = "I")
    private int field7808;

    @OriginalMember(owner = "client!lj", name = "Ud", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!lj", name = "Vd", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!lj", name = "Yd", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!lj", name = "ae", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!lj", name = "ee", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!lj", name = "ge", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!lj", name = "ie", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!lj", name = "je", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!lj", name = "ke", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!lj", name = "ne", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!lj", name = "te", descriptor = "I")
    public int field7834;

    @OriginalMember(owner = "client!lj", name = "Ie", descriptor = "I")
    public int field7849;

    @OriginalMember(owner = "client!lj", name = "Je", descriptor = "I")
    private int field7850;

    @OriginalMember(owner = "client!lj", name = "Ke", descriptor = "I")
    public int field7851;

    @OriginalMember(owner = "client!lj", name = "Le", descriptor = "I")
    private int field7852;

    @OriginalMember(owner = "client!lj", name = "Ve", descriptor = "I")
    private int field7862;

    @OriginalMember(owner = "client!lj", name = "We", descriptor = "I")
    private int field7863;

    @OriginalMember(owner = "client!lj", name = "Xe", descriptor = "I")
    private int field7864;

    @OriginalMember(owner = "client!lj", name = "Cf", descriptor = "I")
    public int field7894;

    @OriginalMember(owner = "client!lj", name = "Ef", descriptor = "I")
    private int field7896;

    @OriginalMember(owner = "client!lj", name = "If", descriptor = "I")
    public int field7900;

    @OriginalMember(owner = "client!lj", name = "Vf", descriptor = "I")
    private int field7913;

    @OriginalMember(owner = "client!lj", name = "bg", descriptor = "I")
    public int field7919;

    @OriginalMember(owner = "client!lj", name = "cg", descriptor = "I")
    private int field7920;

    @OriginalMember(owner = "client!lj", name = "kg", descriptor = "I")
    private int field7928;

    @OriginalMember(owner = "client!lj", name = "mg", descriptor = "I")
    private int field7930;

    @OriginalMember(owner = "client!lj", name = "pg", descriptor = "I")
    private int field7933;

    @OriginalMember(owner = "client!lj", name = "tg", descriptor = "I")
    private int field7937;

    @OriginalMember(owner = "client!lj", name = "bh", descriptor = "I")
    private int field7971;

    @OriginalMember(owner = "client!lj", name = "hh", descriptor = "I")
    public int field7977;

    @OriginalMember(owner = "client!lj", name = "kh", descriptor = "I")
    private int field7980;

    @OriginalMember(owner = "client!lj", name = "nh", descriptor = "I")
    private int field7983;

    @OriginalMember(owner = "client!lj", name = "Se", descriptor = "J")
    private long field7859;

    @OriginalMember(owner = "client!lj", name = "Bf", descriptor = "Lcw;")
    public class164 field7893;

    @OriginalMember(owner = "client!lj", name = "eg", descriptor = "Leq;")
    private class194 field7922;

    @OriginalMember(owner = "client!lj", name = "Yg", descriptor = "Leq;")
    private class194 field7968;

    @OriginalMember(owner = "client!lj", name = "ye", descriptor = "Lvca;")
    private class254 field7839;

    @OriginalMember(owner = "client!lj", name = "xf", descriptor = "Lvca;")
    public class254 field7889;

    @OriginalMember(owner = "client!lj", name = "ag", descriptor = "Loq;")
    private class328 field7918;

    @OriginalMember(owner = "client!lj", name = "zf", descriptor = "Los;")
    public class407 field7891;

    @OriginalMember(owner = "client!lj", name = "Af", descriptor = "Los;")
    public class407 field7892;

    @OriginalMember(owner = "client!lj", name = "Df", descriptor = "Los;")
    public class407 field7895;

    @OriginalMember(owner = "client!lj", name = "Gf", descriptor = "Los;")
    public class407 field7898;

    @OriginalMember(owner = "client!lj", name = "Lf", descriptor = "Los;")
    public class407 field7903;

    @OriginalMember(owner = "client!lj", name = "Qf", descriptor = "Los;")
    public class407 field7908;

    @OriginalMember(owner = "client!lj", name = "Sf", descriptor = "Los;")
    public class407 field7910;

    @OriginalMember(owner = "client!lj", name = "lg", descriptor = "Los;")
    public class407 field7929;

    @OriginalMember(owner = "client!lj", name = "Jg", descriptor = "Los;")
    public class407 field7953;

    @OriginalMember(owner = "client!lj", name = "Qg", descriptor = "Los;")
    public class407 field7960;

    @OriginalMember(owner = "client!lj", name = "Ce", descriptor = "Liea;")
    private class442 field7843;

    @OriginalMember(owner = "client!lj", name = "jf", descriptor = "Lmq;")
    public class470 field7875;

    @OriginalMember(owner = "client!lj", name = "Of", descriptor = "Lmq;")
    public class470 field7906;

    @OriginalMember(owner = "client!lj", name = "kf", descriptor = "Lii;")
    private class514 field7876;

    @OriginalMember(owner = "client!lj", name = "ze", descriptor = "Lbw;")
    private class640 field7840;

    @OriginalMember(owner = "client!lj", name = "De", descriptor = "Lbw;")
    private class640 field7844;

    @OriginalMember(owner = "client!lj", name = "Mc", descriptor = "Lsea;")
    public static class648 field7749;

    @OriginalMember(owner = "client!lj", name = "Ig", descriptor = "Lnea;")
    private class665 field7952;

    @OriginalMember(owner = "client!lj", name = "ue", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7835;

    @OriginalMember(owner = "client!lj", name = "Te", descriptor = "Z")
    private boolean field7860;

    @OriginalMember(owner = "client!lj", name = "Ue", descriptor = "Z")
    private boolean field7861;

    @OriginalMember(owner = "client!lj", name = "Ye", descriptor = "Z")
    private boolean field7865;

    @OriginalMember(owner = "client!lj", name = "af", descriptor = "Z")
    private boolean field7867;

    @OriginalMember(owner = "client!lj", name = "df", descriptor = "Z")
    public boolean field7870;

    @OriginalMember(owner = "client!lj", name = "ef", descriptor = "Z")
    private boolean field7871;

    @OriginalMember(owner = "client!lj", name = "lf", descriptor = "Z")
    public boolean field7877;

    @OriginalMember(owner = "client!lj", name = "pf", descriptor = "Z")
    public boolean field7881;

    @OriginalMember(owner = "client!lj", name = "yf", descriptor = "Z")
    public boolean field7890;

    @OriginalMember(owner = "client!lj", name = "Ff", descriptor = "Z")
    private boolean field7897;

    @OriginalMember(owner = "client!lj", name = "Nf", descriptor = "Z")
    public boolean field7905;

    @OriginalMember(owner = "client!lj", name = "Uf", descriptor = "Z")
    private boolean field7912;

    @OriginalMember(owner = "client!lj", name = "Wf", descriptor = "Z")
    public boolean field7914;

    @OriginalMember(owner = "client!lj", name = "rg", descriptor = "Z")
    private boolean field7935;

    @OriginalMember(owner = "client!lj", name = "Hg", descriptor = "Z")
    public boolean field7951;

    @OriginalMember(owner = "client!lj", name = "Kg", descriptor = "Z")
    private boolean field7954;

    @OriginalMember(owner = "client!lj", name = "Og", descriptor = "Z")
    private boolean field7958;

    @OriginalMember(owner = "client!lj", name = "Pg", descriptor = "Z")
    public boolean field7959;

    @OriginalMember(owner = "client!lj", name = "Xg", descriptor = "Z")
    private boolean field7967;

    @OriginalMember(owner = "client!lj", name = "of", descriptor = "[Lvf;")
    private class136[] field7880;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)V", line = 4)
    public final void method3160(int arg0) {
        ++field7644;
        if (this.field7863 != 2) {
            this.method3211(true);
            this.method3177(false, 31);
            this.method3195((byte) 79, false);
            this.method3218(false, (byte) -116);
            this.method3213(false, -45);
            this.method3238(-7056, -2);
            this.field7863 = 2;
        }
        if (arg0 != 34168) {
            this.method184();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILbw;)V", line = 26)
    public final void method3161(int arg0, class640 arg1) {
        if (arg0 < 105) {
            this.field7846 = null;
        }
        ++field7665;
        if (~this.field7841 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field7841 >= 0) {
                this.field7845[this.field7841].method1554(false);
            }
            this.field7844 = this.field7845[++this.field7841] = arg1;
            this.field7844.method1552(-2028);
        }
    }

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "()V", line = 48)
    public final void method135() {
        ++field7712;
    }

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "(IIII)V", line = 57)
    public final void method123(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 < ~this.field7934) {
            this.field7934 = arg1;
        }
        ++field7632;
        if (~this.field7932 < ~arg3) {
            this.field7932 = arg3;
        }
        if (~arg2 > ~this.field7936) {
            this.field7936 = arg2;
        }
        if (this.field7969 < arg0) {
            this.field7969 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method3222((byte) -71);
        this.method3172(-3917);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V", line = 83)
    public final void method103(int arg0, int arg1, int arg2, int arg3) {
        this.field7820.method528(arg3, arg2, arg1, arg0, (byte) 64);
        ++field7658;
    }

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "()Z", line = 97)
    public final boolean method127() {
        ++field7672;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)V", line = 107)
    public final void method3162(boolean arg0, int arg1) {
        class51.field593[3] = (float) (arg1 >>> 24) / 255.0F;
        ++field7661;
        class51.field593[0] = (float) class136.method950(16711680, arg1) / 1.671168E7F;
        class51.field593[2] = (float) class136.method950(255, arg1) / 255.0F;
        class51.field593[1] = (float) class136.method950(arg1, 65280) / 65280.0F;
        if (arg0) {
            this.method3215(117, false, (byte) -7);
        }
        OpenGL.glTexEnvfv(8960, 8705, class51.field593, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lbw;B)V", line = 123)
    public final void method3163(class640 arg0, byte arg1) {
        ++field7648;
        if (~this.field7842 <= -1 && this.field7838[this.field7842] == arg0) {
            this.field7838[this.field7842--] = null;
            arg0.method1556((byte) -127);
            if (arg1 > -9) {
                this.method133();
            }
            if (~this.field7842 > -1) {
                this.field7840 = null;
            } else {
                this.field7840 = this.field7838[this.field7842];
                this.field7840.method1564(true);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIBI)V", line = 146)
    public final void method3164(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 81) {
            this.method191(-20);
        }
        ++field7738;
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg3);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIII)V", line = 162)
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7705;
        OpenGL.glLineWidth((float) arg5);
        this.method113(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "()Z", line = 174)
    public final boolean method109() {
        ++field7799;
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)I", line = 182)
    public final int method3165(int arg0, int arg1) {
        ++field7779;
        if (~arg0 != -5122 && arg0 != 5120) {
            if (arg0 != arg1 && arg0 != 5122) {
                if (~arg0 != -5126 && ~arg0 != -5125 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V", line = 201)
    public class565(Canvas arg0, class212 arg1, int arg2) {
        super(arg1);
        this.field7667 = this.field7655 = arg0;
        this.field7811 = arg2;
        if (!class28.method266(true, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class28.method266(true, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field7699 = new OpenGL();
                this.field7698 = this.field7625 = this.field7699.init(arg0, 8, 8, 8, 24, 0, this.field7811);
                if (this.field7625 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method3173(113);
                    int var4 = this.method3189((byte) -119);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field7942 = !this.field7921 ? 5121 : 33639;
                        if (this.field7915.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class48.method383(this.field7915.replace('/', ' '), 1, ' ');
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class568.method3250(var10.substring(1, 3), 10)) {
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
                                            if (var10.length() >= 4 && class568.method3250(var10.substring(0, 4), 10)) {
                                                var5 = class214.method1376(0, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field7955 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field7957 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field7873 = false;
                                }
                            }
                            this.field7973 &= this.field7699.method3303("GL_ARB_half_float_pixel");
                            this.field7974 = true;
                            this.field7901 = this.field7873;
                        }
                        if (this.field7885.indexOf("intel") != -1) {
                            this.field7949 = false;
                        }
                        this.field7911 = !this.field7885.equals("s3 graphics");
                        if (this.field7873) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class581.method3314(true, false, 117);
                        this.field7832 = true;
                        this.field7818 = new class523(this, super.field2418);
                        this.method3194(true);
                        this.field7829 = new class576(this);
                        this.field7820 = new class63(this);
                        if (this.field7820.method523((byte) -56)) {
                            this.field7816 = new class311(this);
                            if (!this.field7816.method1889(18226)) {
                                this.field7816.method1883(34842);
                                this.field7816 = null;
                            }
                        }
                        this.field7812 = new class628(this);
                        this.method3170((byte) -6);
                        this.method3204(-126);
                        this.method125();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method136();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lf;Z)V", line = 351)
    public final void method164(class702 arg0, boolean arg1) {
        this.field7843 = (class442) arg0;
        ++field7726;
        if (!this.field7949) {
            if (!this.field7935) {
                throw new RuntimeException("");
            }
            class427 var3 = (class427) this.field7847.method970((byte) 89, (long) (this.field7843.method1658() << 16 | this.field7843.method1653()));
            if (var3 == null) {
                var3 = new class427(this, this.field7843.method1658(), this.field7843.method1653());
                class427 var5;
                for (this.field7850 += var3.field5978 * 4; ~this.field7850 < -2097153; this.field7850 -= var5.field5978) {
                    class578 var4 = this.field7837.method2127((byte) 83);
                    if (var4 == null) {
                        break;
                    }
                    var5 = (class427) var4;
                    var5.method3301(40);
                    var5.method2340(120);
                    this.field7699.releasePbuffer(var5.method2456(0));
                }
                this.field7847.method968((long) (this.field7843.method1658() << 16 | this.field7843.method1653()), var3, -1);
            }
            this.field7837.method2122(var3, (byte) -113);
            this.field7699.setPbuffer(var3.method2456(0));
        } else {
            if (this.field7839 == null) {
                this.field7839 = new class254(this);
            }
            if (this.field7840 == this.field7839) {
                throw new RuntimeException();
            }
            this.method3200((byte) -47, this.field7839);
            if (arg1) {
                class624 var6 = (class624) this.field7847.method970((byte) 89, (long) (this.field7843.method1658() << 16 | this.field7843.method1653()));
                if (var6 == null) {
                    var6 = new class624(this, 6402, this.field7843.method1658(), this.field7843.method1653());
                    class624 var8;
                    for (this.field7850 += var6.field8659; this.field7850 > 2097152; this.field7850 -= var8.field8659) {
                        class578 var7 = this.field7837.method2127((byte) 83);
                        if (var7 == null) {
                            break;
                        }
                        var8 = (class624) var7;
                        var8.method3301(65);
                        var8.method2340(-83);
                        var8.method3469(true);
                    }
                    this.field7847.method968((long) (this.field7843.method1658() << 16 | this.field7843.method1653()), var6, -1);
                }
                this.field7837.method2122(var6, (byte) 110);
                this.field7839.method1562(true, 8, var6);
            }
            this.field7839.method1567(this.field7843.field6132, (byte) 40, 0);
        }
        this.field7663 = arg0.method1658();
        this.field7789 = arg0.method1653();
        this.method3224(1);
        this.method3193((byte) -103);
        this.method193();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 446)
    public final class37 method195(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7633;
        return new class453(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 454)
    public final void method204(Canvas arg0) {
        ++field7697;
        if (this.field7655 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7682.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7699.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field7682.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "DA", descriptor = "()I", line = 489)
    public final int method184() {
        ++field7725;
        int var1 = this.field7980;
        this.field7980 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lbw;B)V", line = 500)
    public final void method3166(class640 arg0, byte arg1) {
        ++field7736;
        if (arg1 != -126) {
            this.method3241(21);
        }
        if (this.field7959) {
            this.method3234(false, arg0);
            this.method3163(arg0, (byte) -88);
        } else if (~this.field7836 <= -1 && this.field7846[this.field7836] == arg0) {
            this.field7846[this.field7836--] = null;
            arg0.method1549(arg1 ^ 8324);
            if (this.field7836 >= 0) {
                this.field7844 = this.field7840 = this.field7846[this.field7836];
                this.field7844.method1558(-4243);
            } else {
                this.field7844 = this.field7840 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)V", line = 535)
    private final void method3167(int arg0) {
        if (arg0 != 2) {
            this.method3236(-100, -42, -52);
        }
        ++field7630;
        float[] var2 = this.field7878;
        float var3 = (float) (-this.field7950 * this.field7874) / (float) this.field7956;
        float var4 = (float) ((-this.field7950 + this.field7663) * this.field7874) / (float) this.field7956;
        float var5 = (float) (this.field7964 * this.field7874) / (float) this.field7924;
        float var6 = (float) ((-this.field7789 + this.field7964) * this.field7874) / (float) this.field7924;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field7874 * 2.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[3] = 0.0F;
            var2[6] = 0.0F;
            var2[14] = this.field7965 = -((float) this.field7926 * var7) / (float) (-this.field7874 + this.field7926);
            var2[7] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[15] = 0.0F;
            var2[1] = 0.0F;
            var2[12] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[11] = -1.0F;
            var2[2] = 0.0F;
            var2[13] = 0.0F;
            var2[10] = this.field7970 = (float) (-(this.field7926 + this.field7874)) / (float) (-this.field7874 + this.field7926);
            var2[4] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
        } else {
            var2[11] = 0.0F;
            var2[13] = 0.0F;
            var2[9] = 0.0F;
            var2[15] = 1.0F;
            var2[4] = 0.0F;
            var2[10] = 1.0F;
            var2[14] = 0.0F;
            var2[1] = 0.0F;
            var2[0] = 1.0F;
            var2[3] = 0.0F;
            var2[8] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[5] = 1.0F;
        }
        this.method3214(false);
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(IIIIII)Lwn;", line = 597)
    public final class674 method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7707;
        return this.field7914 ? new class422(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Lhda;", line = 610)
    public final class696 method3168(byte arg0) {
        ++field7823;
        if (arg0 >= -112) {
            return null;
        } else {
            return this.field7918 != null ? this.field7918.method988(11) : null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V", line = 621)
    public final void method157(boolean arg0) {
        ++field7772;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lnba;IIII)Lda;", line = 631)
    public final class55 method106(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7825;
        return new class407(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lj", name = "IA", descriptor = "(IIIIII[BII)V", line = 641)
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7790;
        float var10;
        float var11;
        if (this.field7952 != null && ~arg2 >= ~this.field7952.field2346 && this.field7952.field2350 >= arg3) {
            this.field7952.method1146(6406, 0, false, 0, 0, 0, arg2, (byte) 113, arg6, arg3);
            var10 = (float) arg3 * this.field7952.field9322 / (float) this.field7952.field2350;
            var11 = (float) arg2 * this.field7952.field9325 / (float) this.field7952.field2346;
        } else {
            this.field7952 = class128.method910(false, arg2, arg6, this, 6406, (byte) 126, arg3, 6406);
            this.field7952.method1151(false, 79, false);
            var10 = this.field7952.field9322;
            var11 = this.field7952.field9325;
        }
        this.method3160(34168);
        this.method3206(this.field7952, (byte) 26);
        this.method3237(16015, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3162(false, arg5);
        this.method3210(34165, 95, 34165);
        this.method3164(34166, 0, (byte) 104, 768);
        this.method3164(5890, 2, (byte) 124, 770);
        this.method3198(0, 34166, true, 770);
        this.method3198(2, 5890, true, 770);
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
        this.method3164(5890, 0, (byte) 111, 768);
        this.method3164(34166, 2, (byte) 125, 770);
        this.method3198(0, 5890, true, 770);
        this.method3198(2, 34166, true, 770);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Z)V", line = 698)
    public final void method3169(boolean arg0) {
        if (this.field7863 != 16) {
            this.method3217((byte) -66);
            this.method3177(true, 43);
            this.method3218(true, (byte) -116);
            this.method3213(true, -89);
            this.method3237(16015, 1);
            this.field7863 = 16;
        }
        if (!arg0) {
            ++field7715;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I", line = 719)
    public final int method134(int arg0, int arg1) {
        ++field7668;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "(IIIIII)Z", line = 727)
    public final boolean method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7791;
        float var7 = (float) arg2 * this.field7866.field7558 + (float) arg0 * this.field7866.field7576 + (float) arg1 * this.field7866.field7556 + this.field7866.field7560;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7866.field7558 + (float) arg3 * this.field7866.field7576 + (float) arg4 * this.field7866.field7556 + this.field7866.field7560;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7874) || !((float) this.field7874 > var8)) && (!(var7 > (float) this.field7926) || !((float) this.field7926 < var8))) {
            int var9 = (int) (((float) arg2 * this.field7866.field7563 + (float) arg0 * this.field7866.field7559 + (float) arg1 * this.field7866.field7552 + this.field7866.field7585) * (float) this.field7956 / var7);
            int var10 = (int) (((float) arg5 * this.field7866.field7563 + (float) arg3 * this.field7866.field7559 + (float) arg4 * this.field7866.field7552 + this.field7866.field7585) * (float) this.field7956 / var8);
            if ((float) var9 < this.field7972 && (float) var10 < this.field7972 || this.field7978 < (float) var9 && (float) var10 > this.field7978) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7866.field7550 + (float) arg0 * this.field7866.field7567 + (float) arg1 * this.field7866.field7578 + this.field7866.field7582) * (float) this.field7924 / var7);
                int var12 = (int) (((float) arg5 * this.field7866.field7550 + (float) arg3 * this.field7866.field7567 + (float) arg4 * this.field7866.field7578 + this.field7866.field7582) * (float) this.field7924 / var8);
                return (!(this.field7927 > (float) var11) || !((float) var12 < this.field7927)) && (!((float) var11 > this.field7925) || !((float) var12 > this.field7925));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "va", descriptor = "(I)V", line = 768)
    public final void method139(int arg0) {
        this.field7830 = 0;
        ++field7767;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field7830;
        }
        this.field7831 = 1 << this.field7830;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 785)
    private final void method3170(byte arg0) {
        ++field7794;
        this.method3238(-7056, -2);
        for (int var2 = this.field7919 + -1; var2 >= 0; --var2) {
            this.method3220(arg0 ^ -6, var2);
            this.method3206((class136) null, (byte) 26);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3210(8448, 9, 8448);
        this.method3164(34168, 2, (byte) 126, 770);
        this.method3216(-75);
        this.field7864 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7862 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7867 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7860 = true;
        this.method3177(true, 21);
        this.method3195((byte) 56, true);
        this.method3218(true, (byte) -116);
        this.method3213(true, -67);
        this.method3224(1);
        this.field7699.setSwapInterval(0);
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
        if (arg0 == -6) {
            this.field7882 = this.field7966 = -1;
            this.method193();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(FBFFF)V", line = 857)
    public final void method3171(float arg0, byte arg1, float arg2, float arg3, float arg4) {
        class51.field593[0] = arg3;
        if (arg1 == 89) {
            class51.field593[2] = arg4;
            class51.field593[1] = arg0;
            ++field7634;
            class51.field593[3] = arg2;
            OpenGL.glTexEnvfv(8960, 8705, class51.field593, 0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lqga;Z)Lf;", line = 872)
    public final class702 method146(class168 arg0, boolean arg1) {
        ++field7706;
        int[] var3 = new int[arg0.field2449 * arg0.field2445];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2447 == null) {
            for (int var6 = 0; var6 < arg0.field2449; ++var6) {
                for (int var7 = 0; arg0.field2445 > var7; ++var7) {
                    int var8 = arg0.field2442[255 & arg0.field2450[var4++]];
                    var3[var5++] = ~var8 != -1 ? class647.method3617(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; arg0.field2449 > var9; ++var9) {
                for (int var11 = 0; arg0.field2445 > var11; ++var11) {
                    var3[var5++] = class647.method3617(arg0.field2447[var4] << 24, arg0.field2442[class136.method950(255, arg0.field2450[var4])]);
                    ++var4;
                }
            }
        }
        class702 var10 = this.method175(var3, 0, arg0.field2445, arg0.field2445, arg0.field2449);
        var10.method1663(arg0.field2446, arg0.field2448, arg0.field2443, arg0.field2444);
        return var10;
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)V", line = 937)
    private final void method3172(int arg0) {
        if (this.field7936 >= this.field7969 && this.field7934 <= this.field7932) {
            OpenGL.glScissor(this.field7969 + this.field7931, this.field7884 + this.field7789 - this.field7932, -this.field7969 + this.field7936, -this.field7934 + this.field7932);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 == -3917) {
            ++field7759;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 953)
    public final void method152(Canvas arg0) {
        ++field7717;
        if (this.field7655 == arg0) {
            throw new RuntimeException();
        } else if (this.field7682.containsKey(arg0)) {
            Long var2 = (Long) this.field7682.get(arg0);
            this.field7699.releaseSurface(arg0, var2);
            this.field7682.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "()Z", line = 974)
    public final boolean method88() {
        ++field7708;
        return this.field7812.method3512(3, (byte) -40);
    }

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "(I)V", line = 982)
    private final void method3173(int arg0) {
        if (arg0 == 113) {
            ++field7788;
            int var2 = 0;
            while (!this.field7699.method3304()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class519.method2960(-125, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)V", line = 1005)
    public final void method3174(int arg0) {
        OpenGL.glPopMatrix();
        if (arg0 != 0) {
            this.field7910 = null;
        }
        ++field7751;
    }

    @OriginalMember(owner = "client!lj", name = "pa", descriptor = "(III)V", line = 1018)
    public final void method131(int arg0, int arg1, int arg2) {
        if (~this.field7966 != ~arg0 || ~this.field7904 != ~arg1 || this.field7886 != arg2) {
            this.field7966 = arg0;
            this.field7886 = arg2;
            this.field7904 = arg1;
            this.method3225(-81);
            this.method3223(2912);
        }
        ++field7653;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V", line = 1039)
    private final void method3175(byte arg0) {
        class51.field593[1] = this.field7963 * this.field7909;
        class51.field593[3] = 1.0F;
        class51.field593[0] = this.field7948 * this.field7909;
        ++field7700;
        class51.field593[2] = this.field7975 * this.field7909;
        OpenGL.glLightfv(16384, 4609, class51.field593, 0);
        int var2 = -99 % ((arg0 - 53) / 42);
        class51.field593[1] = -this.field7916 * this.field7963;
        class51.field593[2] = -this.field7916 * this.field7975;
        class51.field593[0] = -this.field7916 * this.field7948;
        class51.field593[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class51.field593, 0);
    }

    @OriginalMember(owner = "client!lj", name = "ra", descriptor = "(F)V", line = 1059)
    public final void method105(float arg0) {
        if (this.field7943 != arg0) {
            this.field7943 = arg0;
            this.method3191((byte) 84);
        }
        ++field7660;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lq;)V", line = 1074)
    public final void method93(class392 arg0) {
        this.field7866.method675(arg0);
        ++field7785;
        this.field7868.method675(this.field7866);
        this.field7868.method3133(13);
        this.field7869.method3134(this.field7868, true);
        if (this.field7971 != 1) {
            this.method3176(64);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([I)V", line = 1097)
    public final void method158(int[] arg0) {
        arg0[1] = this.field7789;
        arg0[0] = this.field7663;
        ++field7704;
    }

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "(I)V", line = 1107)
    private final void method3176(int arg0) {
        if (arg0 == 64) {
            ++field7694;
            OpenGL.glLoadIdentity();
            OpenGL.glMultMatrixf(this.field7868.method3132(true), 0);
            if (this.field7940) {
                this.field7812.field8703.method1631(0);
            }
            this.method3188(false);
            this.method3241(1720094544);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ZI)V", line = 1124)
    public final void method3177(boolean arg0, int arg1) {
        if (!arg0 != !this.field7967) {
            this.field7967 = arg0;
            this.method3223(2912);
            this.field7863 &= -32;
        }
        ++field7646;
        if (arg1 <= 2) {
            this.method3161(38, (class640) null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V", line = 1141)
    public final void method3178(int arg0, int arg1, int arg2) {
        ++field7721;
        if (arg1 != 34962) {
            this.field7964 = -70;
        }
        this.field7884 = arg2;
        this.field7931 = arg0;
        this.method3193((byte) -47);
        this.method3172(-3917);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 1156)
    public final void method159(int arg0) {
        this.method3187(15);
        ++field7688;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIIIZ)Lii;", line = 1165)
    public final class514 method3179(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7685;
        if (!this.field7873 || arg4 && !this.field7901) {
            return arg3 != 2 ? null : new class92(this, arg1, arg0, arg2);
        } else {
            return new class226(this, arg1, arg0, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!lj", name = "JA", descriptor = "()V", line = 1181)
    public final void method193() {
        this.field7934 = 0;
        this.field7936 = this.field7663;
        this.field7932 = this.field7789;
        this.field7969 = 0;
        ++field7680;
        OpenGL.glDisable(3089);
        this.method3222((byte) -57);
    }

    @OriginalMember(owner = "client!lj", name = "AA", descriptor = "(III[I)V", line = 1197)
    public final void method155(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7666;
        float var5 = (float) arg2 * this.field7866.field7558 + (float) arg0 * this.field7866.field7576 + (float) arg1 * this.field7866.field7556 + this.field7866.field7560;
        if (!(var5 < (float) this.field7874) && !((float) this.field7926 < var5)) {
            int var6 = (int) (((float) arg2 * this.field7866.field7563 + (float) arg0 * this.field7866.field7559 + (float) arg1 * this.field7866.field7552 + this.field7866.field7585) * (float) this.field7956 / var5);
            int var7 = (int) (((float) arg2 * this.field7866.field7550 + (float) arg0 * this.field7866.field7567 + (float) arg1 * this.field7866.field7578 + this.field7866.field7582) * (float) this.field7924 / var5);
            if (this.field7972 <= (float) var6 && (float) var6 <= this.field7978 && this.field7927 <= (float) var7 && (float) var7 <= this.field7925) {
                arg3[1] = (int) ((float) var7 + -this.field7927);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field7972);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V", line = 1229)
    private final void method3180(byte arg0) {
        ++field7782;
        float var2 = (float) (-this.field7950) * this.field7879 / (float) this.field7956;
        float var3 = (float) (-this.field7964) * this.field7879 / (float) this.field7924;
        float var4 = (float) (-this.field7950 + this.field7663) * this.field7879 / (float) this.field7956;
        float var5 = (float) (-this.field7964 + this.field7789) * this.field7879 / (float) this.field7924;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field7874, (double) this.field7926);
        }
        OpenGL.glMatrixMode(5888);
        if (arg0 > -6) {
            this.method126(72, 1, 26, -19, -88, -41, (byte[]) null, -38, 84);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(IIIIII)V", line = 1253)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7711;
        this.method3201((byte) 63);
        this.method3237(16015, arg5);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
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

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILcf;)V", line = 1285)
    public final void method3181(int arg0, class561 arg1) {
        ++field7784;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg1.method3132(true), arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(FFI)V", line = 1294)
    public final void method3182(float arg0, float arg1, int arg2) {
        this.field7938 = arg0;
        ++field7763;
        this.field7883 = arg1;
        if (arg2 == -1629144936) {
            this.method3225(110);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 1311)
    public final void method191(int arg0) {
        ++field7771;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)I", line = 1323)
    public final int method3183(int arg0, byte arg1) {
        ++field7652;
        if (arg1 != -49) {
            return -54;
        } else if (~arg0 != -6407 && arg0 != 6409) {
            if (arg0 != 6410 && arg0 != 34846 && ~arg0 != -34845) {
                if (~arg0 != -6408) {
                    if (arg0 != 6408 && arg0 != 34847) {
                        if (arg0 == 34843) {
                            return 6;
                        } else if (arg0 == 34842) {
                            return 8;
                        } else if (~arg0 == -6403) {
                            return 3;
                        } else if (~arg0 == -6402) {
                            return 1;
                        } else {
                            throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(IIIII)V", line = 1366)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7824;
        this.method3201((byte) 63);
        this.method3237(16015, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()V", line = 1386)
    public final void method136() {
        for (class401 var1 = this.field7833.method1436(28964); var1 != null; var1 = this.field7833.method1443((byte) 6)) {
            ((class5) var1).method13((byte) 72);
        }
        ++field7753;
        if (this.field7820 != null) {
            this.field7820.method520((byte) -95);
        }
        if (this.field7699 != null) {
            this.method3187(15);
            Enumeration var2 = this.field7682.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7682.get(var3);
                this.field7699.releaseSurface(var3, var4);
            }
            this.field7699.release();
            this.field7699 = null;
        }
        if (this.field7832) {
            class5.method14((byte) -121, false, true);
            this.field7832 = false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIILua;II)V", line = 1433)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class618 arg6, int arg7, int arg8) {
        ++field7828;
        class572 var10 = (class572) arg6;
        class665 var11 = var10.field8108;
        this.method3160(34168);
        this.method3206(var10.field8108, (byte) 26);
        this.method3237(16015, arg5);
        this.method3210(7681, 31, 8448);
        this.method3164(34167, 0, (byte) 84, 768);
        float var12 = var11.field9325 / (float) var11.field9321;
        float var13 = var11.field9322 / (float) var11.field9324;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method3164(5890, 0, (byte) 114, 768);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)V", line = 1471)
    public final synchronized void method3184(int arg0, int arg1, int arg2) {
        ++field7756;
        class72 var4 = new class72(arg0);
        var4.field5623 = (long) arg1;
        if (arg2 != -9614) {
            this.field7931 = -100;
        }
        this.field7853.method1441(var4, 0);
    }

    @OriginalMember(owner = "client!lj", name = "CA", descriptor = "(IIII)V", line = 1485)
    public final void method137(int arg0, int arg1, int arg2, int arg3) {
        this.field7900 = arg0;
        this.field7962 = arg1;
        ++field7629;
        this.field7946 = arg2;
        this.field7881 = true;
        this.field7939 = arg3;
    }

    @OriginalMember(owner = "client!lj", name = "BA", descriptor = "()I", line = 1499)
    public final int method133() {
        ++field7730;
        return this.field7874;
    }

    @OriginalMember(owner = "client!lj", name = "la", descriptor = "(IIII)V", line = 1507)
    public final void method161(int arg0, int arg1, int arg2, int arg3) {
        this.field7964 = arg1;
        this.field7950 = arg0;
        this.field7924 = arg3;
        ++field7650;
        this.field7956 = arg2;
        this.method3167(2);
        this.method3222((byte) -125);
        if (~this.field7971 == -4) {
            this.method3180((byte) -12);
        } else if (this.field7971 == 2) {
            this.method3229((byte) 104);
        }
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "()Z", line = 1529)
    public final boolean method130() {
        ++field7636;
        return this.field7897 && (!this.method120() || this.field7912);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JI)V", line = 1537)
    public final synchronized void method3185(long arg0, int arg1) {
        ++field7651;
        class401 var4 = new class401();
        var4.field5623 = arg0;
        if (arg1 != 2) {
            this.method99(true);
        }
        this.field7858.method1441(var4, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(FIFF)V", line = 1555)
    private final void method3186(float arg0, int arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(arg1);
        ++field7800;
        if (this.field7958) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg2, arg0);
        OpenGL.glMatrixMode(5888);
        this.field7958 = true;
    }

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "(I)V", line = 1570)
    private final void method3187(int arg0) {
        ++field7748;
        if (arg0 != 15) {
            this.field7880 = null;
        }
        this.field7699.method3305();
    }

    @OriginalMember(owner = "client!lj", name = "VA", descriptor = "(IFFFFF)V", line = 1587)
    public final void method117(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7732;
        boolean var7 = this.field7882 != arg0;
        if (var7 || this.field7909 != arg1 || this.field7916 != arg2) {
            this.field7916 = arg2;
            this.field7882 = arg0;
            this.field7909 = arg1;
            if (var7) {
                this.field7963 = (float) (65280 & this.field7882) / 65280.0F;
                this.field7975 = (float) (this.field7882 & 255) / 255.0F;
                this.field7948 = (float) (this.field7882 & 16711680) / 1.671168E7F;
                this.method3191((byte) 119);
            }
            this.method3175((byte) -53);
        }
        if (this.field7945[0] != arg3 || this.field7945[1] != arg4 || this.field7945[2] != arg5) {
            this.field7945[2] = arg5;
            this.field7945[1] = arg4;
            this.field7945[0] = arg3;
            this.field7961[0] = -arg3;
            this.field7961[1] = -arg4;
            this.field7961[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7923[0] = arg3 * var8;
            this.field7923[1] = arg4 * var8;
            this.field7923[2] = arg5 * var8;
            this.field7941[2] = -this.field7923[2];
            this.field7941[1] = -this.field7923[1];
            this.field7941[0] = -this.field7923[0];
            this.method3188(false);
            this.field7977 = (int) (arg3 * 256.0F / arg4);
            this.field7894 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(Z)V", line = 1640)
    public final void method3188(boolean arg0) {
        OpenGL.glLightfv(16384, 4611, this.field7923, 0);
        ++field7727;
        if (!arg0) {
            OpenGL.glLightfv(16385, 4611, this.field7941, 0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(B)I", line = 1655)
    private final int method3189(byte arg0) {
        ++field7806;
        int var2 = 0;
        this.field7885 = OpenGL.glGetString(7936).toLowerCase();
        if (arg0 != -119) {
            this.field7879 = -0.1023525F;
        }
        this.field7915 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field7885.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field7885.indexOf("brian paul") != 0 || ~this.field7885.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class48.method383(var3.replace('.', ' '), 1, ' ');
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class214.method1376(0, var4[0]);
                int var6 = class214.method1376(0, var4[1]);
                this.field7933 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field7933 > -13) {
            var2 |= 2;
        }
        if (!this.field7699.method3303("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7699.method3303("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7919 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7896 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7930 = var7[0];
        if (~this.field7919 > -3 || ~this.field7896 > -3 || this.field7930 < 2) {
            var2 |= 16;
        }
        this.field7921 = Stream.method3484();
        this.field7935 = this.field7699.arePbuffersAvailable();
        this.field7873 = this.field7699.method3303("GL_ARB_vertex_buffer_object");
        this.field7897 = this.field7699.method3303("GL_ARB_multisample");
        this.field7951 = this.field7699.method3303("GL_ARB_vertex_program");
        this.field7699.method3303("GL_ARB_fragment_program");
        this.field7877 = this.field7699.method3303("GL_ARB_vertex_shader");
        this.field7890 = this.field7699.method3303("GL_ARB_fragment_shader");
        this.field7957 = this.field7699.method3303("GL_EXT_texture3D");
        this.field7973 = this.field7699.method3303("GL_ARB_texture_rectangle");
        this.field7914 = this.field7699.method3303("GL_ARB_texture_cube_map");
        this.field7955 = this.field7699.method3303("GL_ARB_texture_float");
        this.field7870 = false;
        this.field7949 = this.field7699.method3303("GL_EXT_framebuffer_object");
        this.field7959 = this.field7699.method3303("GL_EXT_framebuffer_blit");
        this.field7905 = this.field7699.method3303("GL_EXT_framebuffer_multisample");
        this.field7912 = this.field7905 & this.field7959;
        OpenGL.glGetFloatv(2834, class51.field593, 0);
        this.field7907 = class51.field593[0];
        this.field7947 = class51.field593[1];
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(II)V", line = 1742)
    public final synchronized void method3190(int arg0, int arg1) {
        ++field7670;
        if (arg0 != -20520) {
            this.method166();
        }
        class401 var3 = new class401();
        var3.field5623 = (long) arg1;
        this.field7857.method1441(var3, 0);
    }

    @OriginalMember(owner = "client!lj", name = "oa", descriptor = "([I)V", line = 1756)
    public final void method174(int[] arg0) {
        ++field7681;
        arg0[1] = this.field7934;
        arg0[3] = this.field7932;
        arg0[0] = this.field7969;
        arg0[2] = this.field7936;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(B)V", line = 1767)
    private final void method3191(byte arg0) {
        if (arg0 > 64) {
            ++field7690;
            class51.field593[3] = 1.0F;
            class51.field593[2] = this.field7975 * this.field7943;
            class51.field593[0] = this.field7948 * this.field7943;
            class51.field593[1] = this.field7963 * this.field7943;
            OpenGL.glLightModelfv(2899, class51.field593, 0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLbw;)V", line = 1783)
    public final void method3192(boolean arg0, class640 arg1) {
        ++field7731;
        if (this.field7842 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field7842 >= 0) {
                this.field7838[this.field7842].method1556((byte) -107);
            }
            this.field7840 = this.field7838[++this.field7842] = arg1;
            if (!arg0) {
                this.field7840.method1564(true);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "()Lq;", line = 1804)
    public final class392 method144() {
        ++field7752;
        return this.field7866;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(B)V", line = 1812)
    private final void method3193(byte arg0) {
        ++field7729;
        if (arg0 > -33) {
            this.field7941 = null;
        }
        OpenGL.glViewport(this.field7931, this.field7884, this.field7663, this.field7789);
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(Z)V", line = 1827)
    private final void method3194(boolean arg0) {
        this.field7880 = new class136[this.field7919];
        ++field7709;
        this.field7893 = new class164(this, 3553, 6408, 1, 1);
        new class164(this, 3553, 6408, 1, 1);
        new class164(this, 3553, 6408, 1, 1);
        this.field7953 = new class407(this);
        this.field7892 = new class407(this);
        this.field7903 = new class407(this);
        this.field7895 = new class407(this);
        this.field7960 = new class407(this);
        this.field7891 = new class407(this);
        this.field7929 = new class407(this);
        this.field7908 = new class407(this);
        if (!arg0) {
            this.field7910 = null;
        }
        this.field7910 = new class407(this);
        this.field7898 = new class407(this);
        if (this.field7949) {
            this.field7889 = new class254(this);
            new class254(this);
        }
    }

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "()Lq;", line = 1863)
    public final class392 method168() {
        ++field7737;
        return new class561();
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1871)
    public final void method86(Canvas arg0) {
        ++field7809;
        this.field7698 = 0L;
        this.field7667 = null;
        if (arg0 != null && this.field7655 != arg0) {
            if (this.field7682.containsKey(arg0)) {
                Long var2 = (Long) this.field7682.get(arg0);
                this.field7698 = var2;
                this.field7667 = arg0;
            }
        } else {
            this.field7667 = this.field7655;
            this.field7698 = this.field7625;
        }
        if (this.field7667 != null && this.field7698 != 0L) {
            this.field7699.setSurface(this.field7698);
            this.method3204(-85);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1901)
    public final void method92(Rectangle[] arg0, int arg1) throws class39 {
        ++field7626;
        this.method100();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BZ)V", line = 1909)
    public final void method3195(byte arg0, boolean arg1) {
        if (this.field7954 != arg1) {
            this.field7954 = arg1;
            this.method3228((byte) -81);
            this.field7863 &= -8;
        }
        if (arg0 <= 1) {
            this.method3162(false, 90);
        }
        ++field7683;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZZIB)V", line = 1927)
    public final void method3196(boolean arg0, boolean arg1, int arg2, byte arg3) {
        if (~this.field7937 != ~arg2 || !this.field7881 != !this.field7940) {
            class164 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field7881 ? 3 : 0;
            if (~arg2 > -1) {
                this.method3216(-106);
            } else {
                var5 = this.field7818.method2983(109, arg2);
                class686 var10 = super.field2418.method1365(-17951, arg2);
                if (var10.field9785 == 0 && ~var10.field9787 == -1) {
                    this.method3216(-116);
                } else {
                    int var11 = !var10.field9795 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method3186(0.0F, 5890, (float) (this.field7834 % var12 * var10.field9787) / (float) var12, (float) (this.field7834 % var12 * var10.field9785) / (float) var12);
                }
                var6 = var10.field9798;
                if (!this.field7881) {
                    var8 = var10.field9790;
                    var7 = var10.field9788;
                    var9 = var10.field9797;
                }
            }
            this.field7812.method3508((byte) -100, arg0, var7, arg1, var9, var8);
            if (!this.field7812.method3515(var5, var6, (byte) 90)) {
                this.method3206(var5, (byte) 26);
                this.method3205(5123, var6);
            }
            this.field7937 = arg2;
            this.field7940 = this.field7881;
        }
        ++field7819;
        if (arg3 != 88) {
            this.method3206((class136) null, (byte) 51);
        }
        this.field7863 &= -8;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILii;)V", line = 1992)
    public final void method3197(int arg0, class514 arg1) {
        if (this.field7876 != arg1) {
            if (this.field7873) {
                OpenGL.glBindBufferARB(34963, arg1.method668(-7881));
            }
            this.field7876 = arg1;
        }
        ++field7744;
        if (arg0 <= 15) {
            this.field7848 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II[I[I)Lua;", line = 2018)
    public final class618 method180(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7693;
        return class570.method3269(0, arg0, arg3, this, arg2, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZI)V", line = 2027)
    public final void method3198(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7777;
        OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
        OpenGL.glTexEnvi(8960, arg0 + 34200, arg3);
        if (!arg2) {
            this.method129((class283) null, (class168[]) null, true);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ldk;I)V", line = 2044)
    public final void method167(class472 arg0, int arg1) {
        this.field7814.method3056((byte) -91, arg0, this, arg1);
        ++field7765;
    }

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "(IIIIII)V", line = 2052)
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7795;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3201((byte) 63);
        this.method3237(16015, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7897) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7897) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)V", line = 2084)
    public final synchronized void method3199(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method96();
        }
        ++field7745;
        class72 var4 = new class72(arg1);
        var4.field5623 = (long) arg2;
        this.field7854.method1441(var4, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLbw;)V", line = 2099)
    public final void method3200(byte arg0, class640 arg1) {
        if (arg0 != -47) {
            this.method3227((byte) 77);
        }
        ++field7724;
        if (this.field7959) {
            this.method3161(120, arg1);
            this.method3192(false, arg1);
        } else if (this.field7836 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field7836 <= -1) {
                this.field7846[this.field7836].method1549(-8442);
            }
            this.field7844 = this.field7840 = this.field7846[++this.field7836] = arg1;
            this.field7844.method1558(arg0 ^ 4284);
        }
    }

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "()V", line = 2128)
    public final void method100() throws class39 {
        ++field7722;
        try {
            this.field7699.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(B)V", line = 2148)
    private final void method3201(byte arg0) {
        ++field7627;
        if (~this.field7863 != -2) {
            this.method3211(true);
            this.method3177(false, 124);
            this.method3195((byte) 19, false);
            this.method3218(false, (byte) -116);
            this.method3213(false, -96);
            this.method3206((class136) null, (byte) 26);
            this.method3238(arg0 + -7119, -2);
            this.method3205(5123, 1);
            this.field7863 = 1;
        }
        if (arg0 != 63) {
            this.method180(-2, 42, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "()Z", line = 2175)
    public final boolean method201() {
        ++field7775;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ)Lf;", line = 2183)
    public final class702 method170(int arg0, int arg1, boolean arg2) {
        ++field7642;
        return new class442(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(ZI)V", line = 2195)
    public final void method3202(boolean arg0, int arg1) {
        if (!this.field7871 == arg0) {
            this.field7871 = arg0;
            this.method3228((byte) -35);
        }
        if (arg1 != 0) {
            this.field7980 = 79;
        }
        ++field7743;
    }

    @OriginalMember(owner = "client!lj", name = "da", descriptor = "(IIII)V", line = 2217)
    public final void method200(int arg0, int arg1, int arg2, int arg3) {
        ++field7735;
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg2 > this.field7663) {
            arg2 = this.field7663;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (this.field7789 < arg3) {
            arg3 = this.field7789;
        }
        this.field7932 = arg3;
        this.field7969 = arg0;
        this.field7936 = arg2;
        this.field7934 = arg1;
        OpenGL.glEnable(3089);
        this.method3222((byte) -67);
        this.method3172(-3917);
    }

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "(I)V", line = 2247)
    private final void method3203(int arg0) {
        if (arg0 == 7) {
            ++field7797;
            OpenGL.glDepthMask(this.field7865 && this.field7887);
        }
    }

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "(I)V", line = 2258)
    private final void method3204(int arg0) {
        if (this.field7667 != null) {
            Dimension var2 = this.field7667.getSize();
            this.field7796 = var2.width;
            this.field7808 = var2.height;
        } else {
            this.field7796 = this.field7808 = 0;
        }
        ++field7786;
        if (this.field7840 == null) {
            this.field7663 = this.field7796;
            this.field7789 = this.field7808;
            this.method3193((byte) -83);
        }
        int var3 = -41 / ((64 - arg0) / 40);
        this.method3224(1);
        this.method193();
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(II)V", line = 2290)
    public final void method3205(int arg0, int arg1) {
        if (~arg1 != -2) {
            if (arg1 == 0) {
                this.method3210(8448, arg0 + -5229, 8448);
            } else if (arg1 != 2) {
                if (arg1 == 3) {
                    this.method3210(260, arg0 ^ -5123, 8448);
                } else if (~arg1 == -5) {
                    this.method3210(34023, arg0 ^ -5214, 34023);
                }
            } else {
                this.method3210(34165, -92, 7681);
            }
        } else {
            this.method3210(7681, 121, 7681);
        }
        ++field7713;
        if (arg0 != 5123) {
            this.field7925 = 1.6726673F;
        }
    }

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "()V", line = 2321)
    public final void method98() {
        OpenGL.glFinish();
        ++field7805;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "()Z", line = 2329)
    public final boolean method132() {
        ++field7781;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "FA", descriptor = "(ILua;II)V", line = 2337)
    public final void method112(int arg0, class618 arg1, int arg2, int arg3) {
        ++field7742;
        class572 var5 = (class572) arg1;
        class665 var6 = var5.field8108;
        this.method3160(34168);
        this.method3206(var5.field8108, (byte) 26);
        this.method3237(16015, 1);
        this.method3210(7681, -122, 8448);
        this.method3164(34167, 0, (byte) 98, 768);
        float var7 = var6.field9325 / (float) var6.field9321;
        float var8 = var6.field9322 / (float) var6.field9324;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field7969 - arg2) * var7, (float) (this.field7934 - arg3) * var8);
        OpenGL.glVertex2i(this.field7969, this.field7934);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7969) * var7, (float) (this.field7932 - arg3) * var8);
        OpenGL.glVertex2i(this.field7969, this.field7932);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7936) * var7, (float) (-arg3 + this.field7932) * var8);
        OpenGL.glVertex2i(this.field7936, this.field7932);
        OpenGL.glTexCoord2f((float) (this.field7936 - arg2) * var7, (float) (this.field7934 - arg3) * var8);
        OpenGL.glVertex2i(this.field7936, this.field7934);
        OpenGL.glEnd();
        this.method3164(5890, 0, (byte) 108, 768);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lvf;B)V", line = 2369)
    public final void method3206(class136 arg0, byte arg1) {
        ++field7635;
        class136 var3 = this.field7880[this.field7920];
        if (arg1 == 26) {
            if (arg0 != var3) {
                if (arg0 != null) {
                    if (var3 != null) {
                        if (~arg0.field1925 != ~var3.field1925) {
                            OpenGL.glDisable(var3.field1925);
                            OpenGL.glEnable(arg0.field1925);
                        }
                    } else {
                        OpenGL.glEnable(arg0.field1925);
                    }
                    OpenGL.glBindTexture(arg0.field1925, arg0.method946((byte) -112));
                } else {
                    OpenGL.glDisable(var3.field1925);
                }
                this.field7880[this.field7920] = arg0;
            }
            this.field7863 &= -2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIIII)V", line = 2408)
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3201((byte) 63);
        ++field7769;
        this.method3237(16015, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2427)
    public final void method197(Canvas arg0) {
        ++field7750;
        long var2 = 0L;
        if (arg0 != null && this.field7655 != arg0) {
            if (this.field7682.containsKey(arg0)) {
                Long var4 = (Long) this.field7682.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7625;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field7699.surfaceResized(var2);
            if (this.field7667 == arg0) {
                this.method3204(13);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Le;)V", line = 2457)
    public final void method111(class493 arg0) {
        ++field7801;
        this.field7835 = ((class5) arg0).field40;
        if (this.field7922 == null) {
            class340 var2 = new class340(80);
            if (this.field7921) {
                var2.method1987(-1.0F, -368862280);
                var2.method1987(-1.0F, -368862280);
                var2.method1987(0.0F, -368862280);
                var2.method1987(0.0F, -368862280);
                var2.method1987(1.0F, -368862280);
                var2.method1987(1.0F, -368862280);
                var2.method1987(-1.0F, -368862280);
                var2.method1987(0.0F, -368862280);
                var2.method1987(1.0F, -368862280);
                var2.method1987(1.0F, -368862280);
                var2.method1987(1.0F, -368862280);
                var2.method1987(1.0F, -368862280);
                var2.method1987(0.0F, -368862280);
                var2.method1987(1.0F, -368862280);
                var2.method1987(0.0F, -368862280);
                var2.method1987(-1.0F, -368862280);
                var2.method1987(1.0F, -368862280);
                var2.method1987(0.0F, -368862280);
                var2.method1987(0.0F, -368862280);
                var2.method1987(0.0F, -368862280);
            } else {
                var2.method1992(-1.0F, 23507);
                var2.method1992(-1.0F, 23507);
                var2.method1992(0.0F, 23507);
                var2.method1992(0.0F, 23507);
                var2.method1992(1.0F, 23507);
                var2.method1992(1.0F, 23507);
                var2.method1992(-1.0F, 23507);
                var2.method1992(0.0F, 23507);
                var2.method1992(1.0F, 23507);
                var2.method1992(1.0F, 23507);
                var2.method1992(1.0F, 23507);
                var2.method1992(1.0F, 23507);
                var2.method1992(0.0F, 23507);
                var2.method1992(1.0F, 23507);
                var2.method1992(0.0F, 23507);
                var2.method1992(-1.0F, 23507);
                var2.method1992(1.0F, 23507);
                var2.method1992(0.0F, 23507);
                var2.method1992(0.0F, 23507);
                var2.method1992(0.0F, 23507);
            }
            this.field7922 = this.method3221(-7946, var2.field6892, false, var2.field6855, 20);
            this.field7875 = new class470(this.field7922, 5126, 3, 0);
            this.field7906 = new class470(this.field7922, 5126, 2, 12);
            this.field7814.method3059(this, 23563);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(FI)V", line = 2524)
    public final void method3207(float arg0, int arg1) {
        if (this.field7879 != arg0) {
            this.field7879 = arg0;
            if (~this.field7971 == -4) {
                this.method3180((byte) -41);
            }
        }
        if (arg1 == -4) {
            ++field7684;
        }
    }

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "()Lho;", line = 2543)
    public final class134 method151() {
        ++field7686;
        int var1 = -1;
        if (~this.field7885.indexOf("nvidia") == 0) {
            if (this.field7885.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (this.field7885.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class134(var1, "OpenGL", this.field7933, this.field7915, 0L);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lmq;BLmq;Lmq;Lmq;)V", line = 2565)
    public final void method3208(class470 arg0, byte arg1, class470 arg2, class470 arg3, class470 arg4) {
        if (arg3 != null) {
            this.method3232((byte) -98, arg3.field6485);
            OpenGL.glVertexPointer(arg3.field6484, arg3.field6491, this.field7968.method590(67), this.field7968.method593(-24269) + (long) arg3.field6488);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field7674;
        int var6 = -80 % ((-80 - arg1) / 34);
        if (arg2 != null) {
            this.method3232((byte) -68, arg2.field6485);
            OpenGL.glNormalPointer(arg2.field6491, this.field7968.method590(-64), this.field7968.method593(-24269) - -((long) arg2.field6488));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg4 != null) {
            this.method3232((byte) 97, arg4.field6485);
            OpenGL.glColorPointer(arg4.field6484, arg4.field6491, this.field7968.method590(-65), this.field7968.method593(-24269) + (long) arg4.field6488);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg0 != null) {
            this.method3232((byte) -58, arg0.field6485);
            OpenGL.glTexCoordPointer(arg0.field6484, arg0.field6491, this.field7968.method590(45), this.field7968.method593(-24269) + (long) arg0.field6488);
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(B)V", line = 2610)
    public final void method3209(byte arg0) {
        int var2 = -50 / ((arg0 - -48) / 49);
        if (~this.field7863 != -9) {
            this.method3230(-110);
            this.method3177(true, 104);
            this.method3218(true, (byte) -116);
            this.method3213(true, -67);
            this.method3237(16015, 1);
            this.field7863 = 8;
        }
        ++field7718;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)V", line = 2630)
    public final void method3210(int arg0, int arg1, int arg2) {
        int var4 = 111 % ((-41 - arg1) / 39);
        if (~this.field7920 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var5 = false;
            if (~this.field7872 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var5 = true;
                this.field7872 = arg0;
            }
            if (this.field7917 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field7917 = arg2;
                var5 = true;
            }
            if (var5) {
                this.field7863 &= -30;
            }
        }
        ++field7762;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(Z)V", line = 2672)
    private final void method3211(boolean arg0) {
        ++field7673;
        if (!arg0) {
            this.method128((class674) null);
        }
        if (~this.field7971 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field7663 < -1 && ~this.field7789 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field7663, (double) this.field7789, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7863 &= -25;
            this.field7971 = 1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIII)V", line = 2696)
    public final void method3212(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 18744) {
            this.method99(true);
        }
        ++field7780;
        OpenGL.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(ZI)V", line = 2711)
    public final void method3213(boolean arg0, int arg1) {
        ++field7766;
        if (arg0 == !this.field7865) {
            this.field7865 = arg0;
            this.method3203(7);
            this.field7863 &= -32;
        }
        if (arg1 > -41) {
            this.field7941 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIZ)Lf;", line = 2729)
    public final class702 method156(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7733;
        return new class442(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(Z)V", line = 2737)
    private final void method3214(boolean arg0) {
        this.field7878[10] = this.field7970;
        this.field7878[14] = this.field7965;
        ++field7798;
        this.field7902 = (float) this.field7926;
        if (arg0) {
            this.method204((Canvas) null);
        }
        this.field7888 = (this.field7878[14] + (float) (-this.field7926)) / this.field7878[10];
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZB)V", line = 2755)
    public final void method3215(int arg0, boolean arg1, byte arg2) {
        if (arg2 != 105) {
            this.field7964 = -27;
        }
        this.method3196(true, arg1, arg0, (byte) 88);
        ++field7719;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I", line = 2777)
    public final int method114(int arg0, int arg1) {
        ++field7760;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[Ltw;)V", line = 2785)
    public final void method183(int arg0, class186[] arg1) {
        ++field7656;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field7979[var3] = arg1[var3];
        }
        this.field7913 = arg0;
        if (this.field7971 != 1) {
            this.method3241(1720094544);
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 2808)
    public final synchronized void method194(int arg0) {
        ++field7821;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field7853.method1435((byte) -98)) {
            class72 var12 = (class72) this.field7853.method1442(-10011);
            class527.field7147[var2++] = (int) var12.field5623;
            this.field7849 -= var12.field956;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class527.field7147, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class527.field7147, 0);
            var2 = 0;
        }
        while (!this.field7854.method1435((byte) -98)) {
            class72 var11 = (class72) this.field7854.method1442(-10011);
            class527.field7147[var2++] = (int) var11.field5623;
            this.field7851 -= var11.field956;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class527.field7147, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class527.field7147, 0);
            var2 = 0;
        }
        while (!this.field7855.method1435((byte) -98)) {
            class72 var10 = (class72) this.field7855.method1442(-10011);
            class527.field7147[var2++] = var10.field956;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class527.field7147, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class527.field7147, 0);
            var2 = 0;
        }
        while (!this.field7856.method1435((byte) -98)) {
            class72 var9 = (class72) this.field7856.method1442(-10011);
            class527.field7147[var2++] = (int) var9.field5623;
            this.field7852 -= var9.field956;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class527.field7147, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class527.field7147, 0);
            boolean var4 = false;
        }
        while (!this.field7848.method1435((byte) -98)) {
            class72 var8 = (class72) this.field7848.method1442(-10011);
            OpenGL.glDeleteLists((int) var8.field5623, var8.field956);
        }
        while (!this.field7857.method1435((byte) -98)) {
            class401 var7 = this.field7857.method1442(-10011);
            OpenGL.glDeleteProgramARB((int) var7.field5623);
        }
        while (!this.field7858.method1435((byte) -98)) {
            class401 var6 = this.field7858.method1442(-10011);
            OpenGL.glDeleteObjectARB(var6.field5623);
        }
        while (!this.field7848.method1435((byte) -98)) {
            class72 var5 = (class72) this.field7848.method1442(-10011);
            OpenGL.glDeleteLists((int) var5.field5623, var5.field956);
        }
        this.field7818.method2981(15006);
        if (this.method169() > 100663296 && ~class577.method3295((byte) 15) < ~(this.field7859 + 60000L)) {
            System.gc();
            this.field7859 = class577.method3295((byte) 15);
        }
        this.field7834 = var3;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V", line = 2972)
    public final void method187(int arg0) {
        ++field7802;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field7817 = arg0;
            this.field7818.method2982(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lwn;)V", line = 2984)
    public final void method128(class674 arg0) {
        ++field7710;
        this.field7918 = (class328) arg0;
    }

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "()Z", line = 2993)
    public final boolean method192() {
        ++field7739;
        if (this.field7816 != null) {
            if (!this.field7816.method2669((byte) 114)) {
                if (!this.field7820.method522(0, this.field7816)) {
                    return false;
                }
                this.field7818.method2982(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "MA", descriptor = "(III[I)V", line = 3017)
    public final void method154(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7768;
        float var5 = (float) arg2 * this.field7866.field7558 + (float) arg0 * this.field7866.field7576 + (float) arg1 * this.field7866.field7556 + this.field7866.field7560;
        if (!(var5 < (float) this.field7874) && !((float) this.field7926 < var5)) {
            int var6 = (int) (((float) arg2 * this.field7866.field7563 + (float) arg0 * this.field7866.field7559 + (float) arg1 * this.field7866.field7552 + this.field7866.field7585) * (float) this.field7956 / var5);
            arg3[0] = (int) ((float) var6 - this.field7972);
            int var7 = (int) (((float) arg2 * this.field7866.field7550 + (float) arg0 * this.field7866.field7567 + (float) arg1 * this.field7866.field7578 + this.field7866.field7582) * (float) this.field7924 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field7927);
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "ja", descriptor = "(I)V", line = 3041)
    public final void method101(int arg0) {
        this.method3237(16015, 0);
        ++field7807;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "(I)V", line = 3058)
    private final void method3216(int arg0) {
        ++field7776;
        if (arg0 > -33) {
            this.field7907 = 0.3360879F;
        }
        if (this.field7958) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7958 = false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "()V", line = 3078)
    public final void method196() {
        ++field7701;
        if (this.field7816 != null && this.field7816.method2669((byte) -18)) {
            this.field7820.method521(this.field7816, 0);
            this.field7818.method2982(false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(B)V", line = 3094)
    private final void method3217(byte arg0) {
        if (arg0 >= -39) {
            this.field7903 = null;
        }
        if (~this.field7971 != -4) {
            this.field7971 = 3;
            this.method3180((byte) -39);
            this.method3176(64);
            this.field7863 &= -8;
        }
        ++field7723;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)Le;", line = 3112)
    public final class493 method185(int arg0) {
        ++field7659;
        class5 var2 = new class5(arg0);
        this.field7833.method1441(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lwn;Lwn;FLwn;)Lwn;", line = 3125)
    public final class674 method91(class674 arg0, class674 arg1, float arg2, class674 arg3) {
        ++field7773;
        if (arg0 != null && arg1 != null && this.field7914 && this.field7949) {
            class141 var5 = null;
            class328 var6 = (class328) arg0;
            class328 var7 = (class328) arg1;
            class696 var8 = var6.method988(11);
            class696 var9 = var7.method988(11);
            if (var8 != null && var9 != null) {
                int var10 = var8.field9889 <= var9.field9889 ? var9.field9889 : var8.field9889;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class141) {
                    class141 var11 = (class141) arg3;
                    if (var11.method986(7203) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class141(this, var10);
                }
                if (var5.method989(var9, arg2, -65534, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "()I", line = 3172)
    public final int method142() {
        ++field7696;
        return this.field7926;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZB)V", line = 3181)
    public final void method3218(boolean arg0, byte arg1) {
        ++field7720;
        if (arg1 != -116) {
            this.method164((class702) null, true);
        }
        if (!arg0 != !this.field7861) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field7861 = arg0;
            this.field7863 &= -32;
        }
    }

    @OriginalMember(owner = "client!lj", name = "YA", descriptor = "(IIII)V", line = 3207)
    public final void method153(int arg0, int arg1, int arg2, int arg3) {
        ++field7778;
        if (!this.field7881) {
            throw new RuntimeException("");
        } else {
            this.field7962 = arg1;
            this.field7939 = arg3;
            this.field7946 = arg2;
            this.field7900 = arg0;
            if (this.field7940) {
                this.field7812.field8703.method1631(0);
                this.field7812.field8703.method1633(-124);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(Z)V", line = 3231)
    public final void method3219(boolean arg0) {
        ++field7657;
        OpenGL.glPushMatrix();
        if (arg0) {
            this.method3189((byte) -75);
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(II)V", line = 3242)
    public final void method3220(int arg0, int arg1) {
        if (this.field7920 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field7920 = arg1;
        }
        ++field7734;
        if (arg0 != 0) {
            this.method156(113, -74, 34, 30, true);
        }
    }

    @OriginalMember(owner = "client!lj", name = "XA", descriptor = "(IIIII)V", line = 3259)
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3201((byte) 63);
        ++field7774;
        this.method3237(16015, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ[BI)Leq;", line = 3279)
    public final class194 method3221(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        if (arg0 != -7946) {
            this.method151();
        }
        ++field7662;
        return (class194) (!this.field7873 || arg2 && !this.field7901 ? new class329(this, arg4, arg3, arg1) : new class77(this, arg4, arg3, arg1, arg2));
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIF)Ltw;", line = 3295)
    public final class186 method108(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7649;
        return new class697(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "()Z", line = 3303)
    public final boolean method107() {
        ++field7761;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "GA", descriptor = "(II)V", line = 3311)
    public final void method182(int arg0, int arg1) {
        if (this.field7874 != arg0 || this.field7926 != arg1) {
            this.field7874 = arg0;
            this.field7926 = arg1;
            this.method3167(2);
            this.method3225(-85);
            if (~this.field7971 != -4) {
                if (~this.field7971 == -3) {
                    this.method3229((byte) 100);
                }
            } else {
                this.method3180((byte) -49);
            }
        }
        ++field7746;
    }

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "()V", line = 3339)
    public final void method96() {
        ++field7747;
        if (!this.field7949) {
            if (!this.field7935) {
                throw new RuntimeException("");
            }
            this.field7843.method936(0, 0, this.field7663, this.field7789, 0, 0);
            this.field7699.setSurface(this.field7698);
        } else {
            if (this.field7840 != this.field7839) {
                throw new RuntimeException();
            }
            this.field7839.method1565(114, 0);
            this.field7839.method1565(-83, 8);
            this.method3166(this.field7839, (byte) -126);
        }
        this.field7843 = null;
        this.field7663 = this.field7796;
        this.field7789 = this.field7808;
        this.method3224(1);
        this.method3193((byte) -44);
        this.method193();
    }

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "()I", line = 3376)
    public final int method97() {
        ++field7770;
        int var1 = this.field7983;
        this.field7983 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(B)V", line = 3388)
    private final void method3222(byte arg0) {
        int var2 = 12 % ((arg0 - 15) / 35);
        ++field7689;
        this.field7925 = (float) (this.field7932 - this.field7964);
        this.field7927 = (float) (-this.field7964 + this.field7934);
        this.field7978 = (float) (-this.field7950 + this.field7936);
        this.field7972 = (float) (-this.field7950 + this.field7969);
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V", line = 3403)
    public final void method173(int arg0) {
        this.method3173(113);
        ++field7679;
    }

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "(I)V", line = 3411)
    private final void method3223(int arg0) {
        if (arg0 == 2912) {
            if (this.field7967 && this.field7904 >= 0) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
            ++field7676;
        }
    }

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "(I)V", line = 3428)
    public final void method3224(int arg0) {
        if (arg0 != 1) {
            this.field7861 = true;
        }
        ++field7692;
        if (this.field7971 != 0) {
            this.field7863 &= -32;
            this.field7971 = 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([IIIII)Lf;", line = 3446)
    public final class702 method175(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7741;
        return new class442(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lj", name = "ZA", descriptor = "(Z)V", line = 3457)
    public final void method202(boolean arg0) {
        this.field7887 = arg0;
        ++field7695;
        this.method3203(7);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V", line = 3468)
    public final void method99(boolean arg0) {
        ++field7641;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V", line = 3477)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7728;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method3201((byte) 63);
        this.method3237(16015, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7897) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7897) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "(I)V", line = 3511)
    private final void method3225(int arg0) {
        ++field7757;
        this.field7944 = (float) (this.field7926 - this.field7886) + -this.field7883;
        int var2 = -82 / ((arg0 - 48) / 50);
        this.field7976 = -((float) this.field7904 * this.field7938) + this.field7944;
        if ((float) this.field7874 > this.field7976) {
            this.field7976 = (float) this.field7874;
        }
        OpenGL.glFogf(2915, this.field7976);
        OpenGL.glFogf(2916, this.field7944);
        class51.field593[0] = (float) class136.method950(this.field7966, 16711680) / 1.671168E7F;
        class51.field593[1] = (float) class136.method950(this.field7966, 65280) / 65280.0F;
        class51.field593[2] = (float) class136.method950(this.field7966, 255) / 255.0F;
        OpenGL.glFogfv(2918, class51.field593, 0);
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(IIIII)V", line = 3537)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7787;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (arg0 + arg2 >= this.field7969 && this.field7936 >= arg0 - arg2 && this.field7934 <= arg1 - -arg2 && ~(-arg2 + arg1) >= ~this.field7932) {
            this.method3201((byte) 63);
            this.method3237(16015, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field7907) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field7947 >= (float) var8) {
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
                int var10 = class180.method1240(var9, -1);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class562.field7596[var11] * (float) arg2 + var6, class562.field7595[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(ZI)V", line = 3613)
    public final synchronized void method3226(boolean arg0, int arg1) {
        if (arg0) {
            this.field7866 = null;
        }
        ++field7815;
        class72 var3 = new class72(arg1);
        this.field7855.method1441(var3, 0);
    }

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "()V", line = 3626)
    public final void method104() {
        ++field7804;
        this.field7820.method525((byte) 99);
    }

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "()[I", line = 3637)
    public final int[] method124() {
        ++field7813;
        return new int[] { this.field7950, this.field7964, this.field7956, this.field7924 };
    }

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "(B)V", line = 3650)
    public final void method3227(byte arg0) {
        ++field7645;
        if (~this.field7863 != -5) {
            this.method3211(true);
            this.method3177(false, 21);
            this.method3195((byte) 108, false);
            this.method3218(false, (byte) -116);
            this.method3213(false, -95);
            this.method3238(-7056, -2);
            this.method3237(16015, 1);
            this.field7863 = 4;
        }
        if (arg0 <= 98) {
            this.field7895 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "()Z", line = 3673)
    public final boolean method120() {
        ++field7740;
        return this.field7816 != null && this.field7816.method2669((byte) -47);
    }

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(B)V", line = 3686)
    private final void method3228(byte arg0) {
        if (arg0 >= -33) {
            this.field7836 = 100;
        }
        ++field7716;
        if (this.field7954 && !this.field7871) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "()Lq;", line = 3701)
    public final class392 method166() {
        ++field7810;
        return this.field7826;
    }

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "(B)V", line = 3711)
    private final void method3229(byte arg0) {
        ++field7783;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field7878, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 < 72) {
            this.field7922 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "()Z", line = 3724)
    public final boolean method87() {
        ++field7647;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()Z", line = 3732)
    public final boolean method116() {
        ++field7637;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "(I)V", line = 3741)
    private final void method3230(int arg0) {
        ++field7703;
        if (~this.field7971 != -3) {
            this.field7971 = 2;
            this.method3229((byte) 111);
            this.method3176(64);
            this.field7863 &= -8;
        }
        if (arg0 >= -103) {
            this.method3199(true, 46, -74);
        }
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(Z)V", line = 3760)
    public static void method3231(boolean arg0) {
        field7749 = null;
        field7638 = null;
        if (arg0) {
            field7758 = 79;
        }
        field7678 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLeq;)V", line = 3772)
    public final void method3232(byte arg0, class194 arg1) {
        if (this.field7968 != arg1) {
            if (this.field7873) {
                OpenGL.glBindBufferARB(34962, arg1.method591(true));
            }
            this.field7968 = arg1;
        }
        int var3 = -101 % ((40 - arg0) / 57);
        ++field7640;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IB)I", line = 3791)
    public final int method3233(int arg0, byte arg1) {
        if (arg1 != 47) {
            this.method3214(true);
        }
        ++field7628;
        if (~arg0 != -2) {
            if (arg0 != 0) {
                if (~arg0 == -3) {
                    return 34165;
                } else if (~arg0 != -4) {
                    if (arg0 == 4) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "()V", line = 3826)
    public final void method125() {
        ++field7643;
        if (this.field7911 && this.field7663 > 0 && ~this.field7789 < -1) {
            int var1 = this.field7969;
            int var2 = this.field7936;
            int var3 = this.field7934;
            int var4 = this.field7932;
            this.method193();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3224(1);
            this.method3177(false, 59);
            this.method3195((byte) 22, false);
            this.method3218(false, (byte) -116);
            this.method3213(false, -54);
            this.method3206((class136) null, (byte) 26);
            this.method3238(-7056, -2);
            this.method3205(5123, 1);
            this.method3237(16015, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7663, this.field7789, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method200(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(IIII)[I", line = 3870)
    public final int[] method148(int arg0, int arg1, int arg2, int arg3) {
        ++field7669;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field7789, arg2, 1, 32993, this.field7942, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ZLbw;)V", line = 3899)
    public final void method3234(boolean arg0, class640 arg1) {
        ++field7677;
        if (this.field7841 >= 0 && this.field7845[this.field7841] == arg1) {
            this.field7845[this.field7841--] = null;
            arg1.method1554(arg0);
            if (~this.field7841 <= -1) {
                this.field7844 = this.field7845[this.field7841];
                this.field7844.method1552(-2028);
            } else {
                this.field7844 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILii;ZI)V", line = 3923)
    public final void method3235(int arg0, int arg1, class514 arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method3170((byte) -58);
        }
        ++field7675;
        int var6 = arg2.method671(3566);
        int var7 = arg1 * this.method3165(var6, 5123);
        this.method3197(84, arg2);
        OpenGL.glDrawElements(arg4, arg0, var6, arg2.method667(25023) + (long) var7);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lvn;[Lqga;Z)Lla;", line = 3941)
    public final class417 method129(class283 arg0, class168[] arg1, boolean arg2) {
        ++field7624;
        return new class600(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "()Z", line = 3949)
    public final boolean method94() {
        ++field7803;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(FFF)V", line = 3957)
    public final void method147(float arg0, float arg1, float arg2) {
        class602.field8396 = arg1;
        ++field7639;
        class306.field4227 = arg0;
        class42.field494 = arg2;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(III)V", line = 3969)
    public final synchronized void method3236(int arg0, int arg1, int arg2) {
        ++field7792;
        class72 var4 = new class72(arg0);
        var4.field5623 = (long) arg2;
        this.field7856.method1441(var4, 0);
        if (arg1 <= 39) {
            this.field7923 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()I", line = 3987)
    public final int method203() {
        ++field7654;
        return 4;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(II)V", line = 4000)
    public final void method3237(int arg0, int arg1) {
        if (this.field7864 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg1 == 1) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (arg1 == 2) {
                var4 = false;
                var3 = true;
                var5 = 2;
            } else if (arg1 != 128) {
                var4 = false;
                var3 = true;
                var5 = 0;
            } else {
                var5 = 3;
                var4 = true;
                var3 = true;
            }
            if (!this.field7860 == var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field7860 = var3;
            }
            if (this.field7867 != var4) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field7867 = var4;
            }
            if (this.field7862 != var5) {
                if (~var5 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var5 != 2) {
                    if (var5 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field7862 = var5;
            }
            this.field7864 = arg1;
            this.field7863 &= -29;
        }
        if (arg0 != 16015) {
            this.field7848 = null;
        }
        ++field7664;
    }

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "()V", line = 4092)
    public final void method143() {
        this.field7881 = false;
        ++field7793;
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(II)V", line = 4104)
    public final void method3238(int arg0, int arg1) {
        ++field7755;
        this.method3215(arg1, true, (byte) 105);
        if (arg0 != -7056) {
            this.field7929 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "()Z", line = 4116)
    public final boolean method189() {
        ++field7687;
        return this.field7816 != null && (~this.field7811 >= -2 || this.field7912);
    }

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "()Z", line = 4124)
    public final boolean method178() {
        ++field7702;
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ldk;)V", line = 4136)
    public final void method163(class472 arg0) {
        ++field7754;
        this.field7814.method3056((byte) -102, arg0, this, -1);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()I", line = 4147)
    public final int method169() {
        ++field7631;
        return this.field7851 + this.field7849 - -this.field7852;
    }

    @OriginalMember(owner = "client!lj", name = "ya", descriptor = "()V", line = 4160)
    public final void method89() {
        this.method3213(true, -124);
        ++field7691;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZZLjaclib/memory/Buffer;)Leq;", line = 4171)
    public final class194 method3239(int arg0, int arg1, boolean arg2, boolean arg3, Buffer arg4) {
        if (!arg3) {
            return null;
        } else {
            ++field7671;
            return (class194) (!this.field7873 || arg2 && !this.field7901 ? new class329(this, arg0, arg4) : new class77(this, arg0, arg4, arg1, arg2));
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLcf;)V", line = 4188)
    public final void method3240(boolean arg0, class561 arg1) {
        OpenGL.glLoadMatrixf(arg1.method3132(arg0), 0);
        ++field7714;
    }

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "(I)V", line = 4196)
    private final void method3241(int arg0) {
        ++field7764;
        int var2 = 0;
        if (arg0 != 1720094544) {
            this.field7958 = true;
        }
        while (var2 < this.field7913) {
            class186 var3 = this.field7979[var2];
            int var4 = var2 + 16386;
            class154.field2267[0] = (float) var3.method1280(true);
            class154.field2267[1] = (float) var3.method1282((byte) 102);
            class154.field2267[2] = (float) var3.method1279(class324.method1944(arg0, 1720094544));
            class154.field2267[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class154.field2267, 0);
            int var5 = var3.method1283(0);
            float var6 = var3.method1285(-1120) / 255.0F;
            class154.field2267[2] = (float) class136.method950(255, var5) * var6;
            class154.field2267[0] = var6 * (float) (class136.method950(var5, 16741586) >> 16);
            class154.field2267[1] = (float) (class136.method950(65488, var5) >> 8) * var6;
            OpenGL.glLightfv(var4, 4609, class154.field2267, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1281(55) * var3.method1281(arg0 + -1720094456)));
            OpenGL.glEnable(var4);
            ++var2;
        }
        while (~this.field7928 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field7928 = this.field7913;
    }
}
