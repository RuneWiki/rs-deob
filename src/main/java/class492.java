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

@OriginalClass("client!pga")
public abstract class class492 extends class545 {

    @OriginalMember(owner = "client!pga", name = "Nd", descriptor = "Lfha;")
    private class522 field6779 = new class522();

    @OriginalMember(owner = "client!pga", name = "ge", descriptor = "Z")
    public boolean field6798 = true;

    @OriginalMember(owner = "client!pga", name = "ce", descriptor = "Ljs;")
    public class173 field6794 = new class173();

    @OriginalMember(owner = "client!pga", name = "je", descriptor = "Ljs;")
    public class173 field6801 = new class173();

    @OriginalMember(owner = "client!pga", name = "ne", descriptor = "Ljs;")
    public class173 field6805 = new class173();

    @OriginalMember(owner = "client!pga", name = "pe", descriptor = "Ljs;")
    public class173 field6807 = new class173();

    @OriginalMember(owner = "client!pga", name = "qe", descriptor = "Ljs;")
    private class173 field6808 = new class173();

    @OriginalMember(owner = "client!pga", name = "re", descriptor = "Ljs;")
    private class173 field6809 = new class173();

    @OriginalMember(owner = "client!pga", name = "se", descriptor = "F")
    public float field6810 = 1.0F;

    @OriginalMember(owner = "client!pga", name = "Fe", descriptor = "I")
    public int field6823 = 8;

    @OriginalMember(owner = "client!pga", name = "Le", descriptor = "I")
    public int field6829 = 0;

    @OriginalMember(owner = "client!pga", name = "We", descriptor = "Z")
    private boolean field6840 = false;

    @OriginalMember(owner = "client!pga", name = "ye", descriptor = "I")
    private int field6816 = 16777215;

    @OriginalMember(owner = "client!pga", name = "bf", descriptor = "Z")
    private boolean field6845 = false;

    @OriginalMember(owner = "client!pga", name = "ff", descriptor = "I")
    public int field6849 = 0;

    @OriginalMember(owner = "client!pga", name = "Ne", descriptor = "I")
    private int field6831 = 0;

    @OriginalMember(owner = "client!pga", name = "gf", descriptor = "F")
    public float field6850 = 1.0F;

    @OriginalMember(owner = "client!pga", name = "Ue", descriptor = "I")
    public int field6838 = 0;

    @OriginalMember(owner = "client!pga", name = "lf", descriptor = "[F")
    private float[] field6854 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pga", name = "ze", descriptor = "I")
    private int field6817 = 0;

    @OriginalMember(owner = "client!pga", name = "rf", descriptor = "I")
    public int field6860 = 0;

    @OriginalMember(owner = "client!pga", name = "Ze", descriptor = "I")
    private int field6843 = 1;

    @OriginalMember(owner = "client!pga", name = "qf", descriptor = "Z")
    public boolean field6859 = true;

    @OriginalMember(owner = "client!pga", name = "Ie", descriptor = "F")
    public float field6826 = -1.0F;

    @OriginalMember(owner = "client!pga", name = "De", descriptor = "I")
    public int field6821 = 512;

    @OriginalMember(owner = "client!pga", name = "Me", descriptor = "I")
    public int field6830 = -1;

    @OriginalMember(owner = "client!pga", name = "Te", descriptor = "I")
    public int field6837 = 128;

    @OriginalMember(owner = "client!pga", name = "Xe", descriptor = "Z")
    public boolean field6841 = false;

    @OriginalMember(owner = "client!pga", name = "nf", descriptor = "Z")
    public boolean field6856 = true;

    @OriginalMember(owner = "client!pga", name = "Ce", descriptor = "I")
    public int field6820 = 0;

    @OriginalMember(owner = "client!pga", name = "Pe", descriptor = "F")
    private float field6833 = 1.0F;

    @OriginalMember(owner = "client!pga", name = "Cf", descriptor = "Z")
    private boolean field6871 = false;

    @OriginalMember(owner = "client!pga", name = "hf", descriptor = "[F")
    private float[] field6851 = new float[16];

    @OriginalMember(owner = "client!pga", name = "Gf", descriptor = "I")
    public int field6875 = 3584;

    @OriginalMember(owner = "client!pga", name = "Mf", descriptor = "F")
    public float field6881 = 1.0F;

    @OriginalMember(owner = "client!pga", name = "Ye", descriptor = "I")
    public int field6842 = 0;

    @OriginalMember(owner = "client!pga", name = "jf", descriptor = "I")
    public int field6852 = 0;

    @OriginalMember(owner = "client!pga", name = "Hf", descriptor = "Z")
    public boolean field6876 = true;

    @OriginalMember(owner = "client!pga", name = "ag", descriptor = "Z")
    public boolean field6895 = false;

    @OriginalMember(owner = "client!pga", name = "zf", descriptor = "I")
    private int field6868 = 0;

    @OriginalMember(owner = "client!pga", name = "yf", descriptor = "[F")
    private float[] field6867 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pga", name = "Df", descriptor = "I")
    private int field6872 = -1;

    @OriginalMember(owner = "client!pga", name = "Vf", descriptor = "Z")
    public boolean field6890 = false;

    @OriginalMember(owner = "client!pga", name = "kf", descriptor = "I")
    private int field6853 = 0;

    @OriginalMember(owner = "client!pga", name = "sf", descriptor = "[F")
    public float[] field6861 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pga", name = "Je", descriptor = "[F")
    private float[] field6827 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pga", name = "ef", descriptor = "F")
    public float field6848 = 3584.0F;

    @OriginalMember(owner = "client!pga", name = "Zf", descriptor = "Z")
    private boolean field6894 = false;

    @OriginalMember(owner = "client!pga", name = "xf", descriptor = "F")
    public float field6866 = 3584.0F;

    @OriginalMember(owner = "client!pga", name = "Sf", descriptor = "Lmaa;")
    public class505 field6887 = class430.field5925;

    @OriginalMember(owner = "client!pga", name = "Se", descriptor = "[F")
    public float[] field6836 = this.field6867;

    @OriginalMember(owner = "client!pga", name = "Uf", descriptor = "I")
    public int field6889 = -1;

    @OriginalMember(owner = "client!pga", name = "pf", descriptor = "Z")
    private boolean field6858 = false;

    @OriginalMember(owner = "client!pga", name = "df", descriptor = "[F")
    public float[] field6847 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!pga", name = "Jf", descriptor = "I")
    public int field6878 = 50;

    @OriginalMember(owner = "client!pga", name = "Of", descriptor = "Lgha;")
    public class497 field6883 = class167.field2287;

    @OriginalMember(owner = "client!pga", name = "gg", descriptor = "I")
    private int field6901 = -1;

    @OriginalMember(owner = "client!pga", name = "Pf", descriptor = "[F")
    private float[] field6884 = new float[16];

    @OriginalMember(owner = "client!pga", name = "Ae", descriptor = "I")
    public int field6818 = 3;

    @OriginalMember(owner = "client!pga", name = "mg", descriptor = "Z")
    private boolean field6907 = false;

    @OriginalMember(owner = "client!pga", name = "fg", descriptor = "Z")
    public boolean field6900 = false;

    @OriginalMember(owner = "client!pga", name = "Yf", descriptor = "F")
    public float field6893 = 1.0F;

    @OriginalMember(owner = "client!pga", name = "Nf", descriptor = "I")
    public int field6882 = 512;

    @OriginalMember(owner = "client!pga", name = "kg", descriptor = "I")
    public int field6905 = 0;

    @OriginalMember(owner = "client!pga", name = "we", descriptor = "Z")
    public boolean field6814 = true;

    @OriginalMember(owner = "client!pga", name = "lg", descriptor = "[Lni;")
    private class512[] field6906 = new class512[10];

    @OriginalMember(owner = "client!pga", name = "Re", descriptor = "[F")
    private float[] field6835 = new float[16];

    @OriginalMember(owner = "client!pga", name = "cf", descriptor = "Z")
    public boolean field6846 = true;

    @OriginalMember(owner = "client!pga", name = "Ke", descriptor = "I")
    private int field6828 = -1;

    @OriginalMember(owner = "client!pga", name = "pg", descriptor = "F")
    public float field6910 = -1.0F;

    @OriginalMember(owner = "client!pga", name = "ig", descriptor = "I")
    public int field6903 = 0;

    @OriginalMember(owner = "client!pga", name = "Ge", descriptor = "I")
    public int field6824 = 0;

    @OriginalMember(owner = "client!pga", name = "Ee", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6822 = new Stream();

    @OriginalMember(owner = "client!pga", name = "rg", descriptor = "Ljs;")
    private class173 field6912 = new class173();

    @OriginalMember(owner = "client!pga", name = "Lb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6673;

    @OriginalMember(owner = "client!pga", name = "Cc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6716;

    @OriginalMember(owner = "client!pga", name = "mf", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!pga", name = "gd", descriptor = "Ljava/lang/Object;")
    public Object field6746;

    @OriginalMember(owner = "client!pga", name = "Lc", descriptor = "Ljava/lang/Object;")
    private Object field6725;

    @OriginalMember(owner = "client!pga", name = "ed", descriptor = "Lwu;")
    public class557 field6744;

    @OriginalMember(owner = "client!pga", name = "Rf", descriptor = "I")
    public int field6886;

    @OriginalMember(owner = "client!pga", name = "Y", descriptor = "I")
    private int field6634;

    @OriginalMember(owner = "client!pga", name = "Sc", descriptor = "I")
    public int field6732;

    @OriginalMember(owner = "client!pga", name = "gb", descriptor = "I")
    private int field6642;

    @OriginalMember(owner = "client!pga", name = "Qc", descriptor = "I")
    public int field6730;

    @OriginalMember(owner = "client!pga", name = "Xf", descriptor = "Lmf;")
    private class735 field6892;

    @OriginalMember(owner = "client!pga", name = "bd", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field6741;

    @OriginalMember(owner = "client!pga", name = "Yd", descriptor = "Lju;")
    public static class102 field6790 = new class102(27, 15);

    @OriginalMember(owner = "client!pga", name = "he", descriptor = "Lqk;")
    public static class148 field6799 = new class148(2, -2);

    @OriginalMember(owner = "client!pga", name = "ie", descriptor = "Ljia;")
    public static class336 field6800 = new class336();

    @OriginalMember(owner = "client!pga", name = "ke", descriptor = "Lbh;")
    public static class538 field6802 = new class538(128, 4);

    @OriginalMember(owner = "client!pga", name = "le", descriptor = "[[I")
    public static int[][] field6803 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!pga", name = "oe", descriptor = "I")
    public static int field6806 = 0;

    @OriginalMember(owner = "client!pga", name = "xe", descriptor = "F")
    public float field6815;

    @OriginalMember(owner = "client!pga", name = "Oe", descriptor = "F")
    public float field6832;

    @OriginalMember(owner = "client!pga", name = "vf", descriptor = "F")
    public float field6864;

    @OriginalMember(owner = "client!pga", name = "Wf", descriptor = "F")
    private float field6891;

    @OriginalMember(owner = "client!pga", name = "cg", descriptor = "F")
    public float field6897;

    @OriginalMember(owner = "client!pga", name = "jg", descriptor = "F")
    public float field6904;

    @OriginalMember(owner = "client!pga", name = "ng", descriptor = "F")
    public float field6908;

    @OriginalMember(owner = "client!pga", name = "og", descriptor = "F")
    private float field6909;

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!pga", name = "B", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!pga", name = "C", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!pga", name = "D", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!pga", name = "E", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!pga", name = "F", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!pga", name = "G", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!pga", name = "H", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!pga", name = "I", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!pga", name = "J", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!pga", name = "K", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!pga", name = "L", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!pga", name = "M", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!pga", name = "N", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!pga", name = "O", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!pga", name = "P", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!pga", name = "Q", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!pga", name = "R", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!pga", name = "S", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!pga", name = "T", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!pga", name = "U", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!pga", name = "V", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!pga", name = "W", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!pga", name = "X", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!pga", name = "Z", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!pga", name = "ab", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!pga", name = "bb", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!pga", name = "cb", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!pga", name = "db", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!pga", name = "eb", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!pga", name = "fb", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!pga", name = "hb", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!pga", name = "ib", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!pga", name = "jb", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!pga", name = "kb", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!pga", name = "lb", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!pga", name = "mb", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!pga", name = "nb", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!pga", name = "ob", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!pga", name = "pb", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!pga", name = "qb", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!pga", name = "rb", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!pga", name = "sb", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!pga", name = "tb", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!pga", name = "ub", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!pga", name = "vb", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!pga", name = "wb", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!pga", name = "xb", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!pga", name = "yb", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!pga", name = "zb", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!pga", name = "Ab", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!pga", name = "Bb", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!pga", name = "Cb", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!pga", name = "Db", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!pga", name = "Eb", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!pga", name = "Fb", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!pga", name = "Gb", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!pga", name = "Hb", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!pga", name = "Ib", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!pga", name = "Jb", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!pga", name = "Kb", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!pga", name = "Mb", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!pga", name = "Nb", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!pga", name = "Ob", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!pga", name = "Pb", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!pga", name = "Qb", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!pga", name = "Rb", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!pga", name = "Sb", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!pga", name = "Tb", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!pga", name = "Ub", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!pga", name = "Vb", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!pga", name = "Wb", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!pga", name = "Xb", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!pga", name = "Yb", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!pga", name = "Zb", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!pga", name = "ac", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!pga", name = "bc", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!pga", name = "cc", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!pga", name = "dc", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!pga", name = "ec", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!pga", name = "fc", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!pga", name = "gc", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!pga", name = "hc", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!pga", name = "ic", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!pga", name = "jc", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!pga", name = "kc", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!pga", name = "lc", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!pga", name = "mc", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!pga", name = "nc", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!pga", name = "oc", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!pga", name = "pc", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!pga", name = "qc", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!pga", name = "rc", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!pga", name = "sc", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!pga", name = "tc", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!pga", name = "uc", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!pga", name = "vc", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!pga", name = "wc", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!pga", name = "xc", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!pga", name = "yc", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!pga", name = "zc", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!pga", name = "Ac", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!pga", name = "Bc", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!pga", name = "Dc", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!pga", name = "Fc", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!pga", name = "Gc", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!pga", name = "Hc", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!pga", name = "Ic", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!pga", name = "Jc", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!pga", name = "Kc", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!pga", name = "Mc", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!pga", name = "Nc", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!pga", name = "Oc", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!pga", name = "Pc", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!pga", name = "Rc", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!pga", name = "Tc", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!pga", name = "Uc", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!pga", name = "Vc", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!pga", name = "Wc", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!pga", name = "Xc", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!pga", name = "Yc", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!pga", name = "Zc", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!pga", name = "ad", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!pga", name = "cd", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!pga", name = "dd", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!pga", name = "fd", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!pga", name = "hd", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!pga", name = "id", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!pga", name = "kd", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!pga", name = "ld", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!pga", name = "md", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!pga", name = "nd", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!pga", name = "od", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!pga", name = "pd", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!pga", name = "qd", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!pga", name = "rd", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!pga", name = "sd", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!pga", name = "td", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!pga", name = "ud", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!pga", name = "vd", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!pga", name = "wd", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!pga", name = "xd", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!pga", name = "yd", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!pga", name = "Ad", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!pga", name = "Bd", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!pga", name = "Cd", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!pga", name = "Dd", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!pga", name = "Ed", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!pga", name = "Fd", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!pga", name = "Gd", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!pga", name = "Hd", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!pga", name = "Id", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!pga", name = "Jd", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!pga", name = "Kd", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!pga", name = "Ld", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!pga", name = "Md", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!pga", name = "Od", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!pga", name = "Pd", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!pga", name = "Qd", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!pga", name = "Rd", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!pga", name = "Sd", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!pga", name = "Td", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!pga", name = "Ud", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!pga", name = "Vd", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!pga", name = "Wd", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!pga", name = "Xd", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!pga", name = "Zd", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!pga", name = "ae", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!pga", name = "de", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!pga", name = "ee", descriptor = "I")
    public int field6796;

    @OriginalMember(owner = "client!pga", name = "fe", descriptor = "I")
    public int field6797;

    @OriginalMember(owner = "client!pga", name = "me", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!pga", name = "te", descriptor = "I")
    public int field6811;

    @OriginalMember(owner = "client!pga", name = "ve", descriptor = "I")
    public int field6813;

    @OriginalMember(owner = "client!pga", name = "Be", descriptor = "I")
    private int field6819;

    @OriginalMember(owner = "client!pga", name = "tf", descriptor = "I")
    public int field6862;

    @OriginalMember(owner = "client!pga", name = "uf", descriptor = "I")
    public int field6863;

    @OriginalMember(owner = "client!pga", name = "Ef", descriptor = "I")
    private int field6873;

    @OriginalMember(owner = "client!pga", name = "If", descriptor = "I")
    public int field6877;

    @OriginalMember(owner = "client!pga", name = "Kf", descriptor = "I")
    public int field6879;

    @OriginalMember(owner = "client!pga", name = "Tf", descriptor = "I")
    public int field6888;

    @OriginalMember(owner = "client!pga", name = "hg", descriptor = "I")
    public int field6902;

    @OriginalMember(owner = "client!pga", name = "Ng", descriptor = "I")
    private int field6934;

    @OriginalMember(owner = "client!pga", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!pga", name = "Bf", descriptor = "Llo;")
    public class117 field6870;

    @OriginalMember(owner = "client!pga", name = "jd", descriptor = "Ljo;")
    public class20 field6749;

    @OriginalMember(owner = "client!pga", name = "Bg", descriptor = "Lho;")
    private class212 field6922;

    @OriginalMember(owner = "client!pga", name = "vg", descriptor = "Llk;")
    private class251 field6916;

    @OriginalMember(owner = "client!pga", name = "Ag", descriptor = "Llk;")
    private class251 field6921;

    @OriginalMember(owner = "client!pga", name = "Kg", descriptor = "Llk;")
    private class251 field6931;

    @OriginalMember(owner = "client!pga", name = "Ve", descriptor = "Lqia;")
    private class303 field6839;

    @OriginalMember(owner = "client!pga", name = "Qf", descriptor = "Lbv;")
    private class481 field6885;

    @OriginalMember(owner = "client!pga", name = "Ff", descriptor = "Lni;")
    private class512 field6874;

    @OriginalMember(owner = "client!pga", name = "qg", descriptor = "Lqd;")
    public class576 field6911;

    @OriginalMember(owner = "client!pga", name = "tg", descriptor = "Lqd;")
    public class576 field6914;

    @OriginalMember(owner = "client!pga", name = "ug", descriptor = "Lqd;")
    public class576 field6915;

    @OriginalMember(owner = "client!pga", name = "wg", descriptor = "Lqd;")
    public class576 field6917;

    @OriginalMember(owner = "client!pga", name = "xg", descriptor = "Lqd;")
    public class576 field6918;

    @OriginalMember(owner = "client!pga", name = "yg", descriptor = "Lqd;")
    public class576 field6919;

    @OriginalMember(owner = "client!pga", name = "Dg", descriptor = "Lqd;")
    public class576 field6924;

    @OriginalMember(owner = "client!pga", name = "Fg", descriptor = "Lqd;")
    public class576 field6926;

    @OriginalMember(owner = "client!pga", name = "Gg", descriptor = "Lqd;")
    public class576 field6927;

    @OriginalMember(owner = "client!pga", name = "Lg", descriptor = "Lqd;")
    public class576 field6932;

    @OriginalMember(owner = "client!pga", name = "sg", descriptor = "Ldha;")
    private class732 field6913;

    @OriginalMember(owner = "client!pga", name = "zg", descriptor = "Ldha;")
    public class732 field6920;

    @OriginalMember(owner = "client!pga", name = "Cg", descriptor = "Ldha;")
    private class732 field6923;

    @OriginalMember(owner = "client!pga", name = "Eg", descriptor = "Ldha;")
    public class732 field6925;

    @OriginalMember(owner = "client!pga", name = "Hg", descriptor = "Ldha;")
    private class732 field6928;

    @OriginalMember(owner = "client!pga", name = "Ig", descriptor = "Ldha;")
    public class732 field6929;

    @OriginalMember(owner = "client!pga", name = "Jg", descriptor = "Ldha;")
    public class732 field6930;

    @OriginalMember(owner = "client!pga", name = "Ec", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6718;

    @OriginalMember(owner = "client!pga", name = "zd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field6765;

    @OriginalMember(owner = "client!pga", name = "be", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6793;

    @OriginalMember(owner = "client!pga", name = "Qe", descriptor = "Z")
    public boolean field6834;

    @OriginalMember(owner = "client!pga", name = "af", descriptor = "Z")
    public boolean field6844;

    @OriginalMember(owner = "client!pga", name = "wf", descriptor = "Z")
    public boolean field6865;

    @OriginalMember(owner = "client!pga", name = "bg", descriptor = "Z")
    public boolean field6896;

    @OriginalMember(owner = "client!pga", name = "dg", descriptor = "Z")
    public boolean field6898;

    @OriginalMember(owner = "client!pga", name = "Mg", descriptor = "Z")
    public boolean field6933;

    @OriginalMember(owner = "client!pga", name = "ue", descriptor = "[Llo;")
    private class117[] field6812;

    @OriginalMember(owner = "client!pga", name = "Af", descriptor = "[Ljs;")
    public class173[] field6869;

    @OriginalMember(owner = "client!pga", name = "of", descriptor = "[Lefa;")
    public class528[] field6857;

    @OriginalMember(owner = "client!pga", name = "Lf", descriptor = "[Lhd;")
    public class595[] field6880;

    @OriginalMember(owner = "client!pga", name = "eg", descriptor = "[Lhd;")
    public class595[] field6899;

    @OriginalMember(owner = "client!pga", name = "He", descriptor = "[Lkb;")
    public class757[] field6825;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method2869(int arg0, boolean arg1) {
        if (arg0 != 13) {
            this.method2099();
        }
        if (!this.field6895 != !arg1) {
            this.field6895 = arg1;
            this.method597((byte) -88);
            this.field6819 &= -32;
        }
        ++field6633;
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(I)V", line = 29)
    private final void method2870(int arg0) {
        if (arg0 >= 125) {
            this.field6921 = this.method638((byte) -94, true);
            ++field6737;
            this.field6921.method1591(-17230, 24, 12);
            this.field6923 = this.method573(0, new class378[] { new class378(class91.field1226) });
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILwn;I)V", line = 44)
    public static final void method2871(int arg0, class583 arg1, int arg2) {
        ++field6736;
        boolean var3 = arg1.method3467(90, 1) == 1;
        if (var3) {
            class513.field7162[class724.field10204++] = arg2;
        }
        int var4 = arg1.method3467(-25, 2);
        class655 var5 = class40.field563[arg2];
        if (~var4 == -1) {
            if (var3) {
                var5.field9276 = false;
            } else if (class471.field6467 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class257 var6 = class175.field2382[arg2] = new class257();
                var6.field3517 = (var5.field8421[0] + class179.field2535 >> 6 << 14) + (var5.field9501 << 28) - -(var5.field8414[0] + class510.field7109 >> 6);
                if (~var5.field9244 != 0) {
                    var6.field3520 = var5.field9244;
                } else {
                    var6.field3520 = var5.field8327.method2661(120);
                }
                var6.field3519 = var5.field8342;
                var6.field3515 = var5.field9264;
                if (~var5.field9275 < -1) {
                    class467.method2786((byte) -93, var5);
                }
                class40.field563[arg2] = null;
                if (~arg1.method3467(-45, 1) != -1) {
                    class80.method478(arg2, arg1, (byte) 38);
                }
            }
        } else if (~var4 == -2) {
            int var7 = arg1.method3467(-125, 3);
            int var8 = var5.field8421[0];
            int var9 = var5.field8414[0];
            if (~var7 == -1) {
                --var8;
                --var9;
            } else if (var7 != 1) {
                if (var7 != 2) {
                    if (~var7 != -4) {
                        if (~var7 != -5) {
                            if (var7 != 5) {
                                if (var7 == 6) {
                                    ++var9;
                                } else if (~var7 == -8) {
                                    ++var8;
                                    ++var9;
                                }
                            } else {
                                ++var9;
                                --var8;
                            }
                        } else {
                            ++var8;
                        }
                    } else {
                        --var8;
                    }
                } else {
                    --var9;
                    ++var8;
                }
            } else {
                --var9;
            }
            if (!var3) {
                var5.method3783(var9, class634.field9025[arg2], (byte) 64, var8);
            } else {
                var5.field9258 = var8;
                var5.field9276 = true;
                var5.field9268 = var9;
            }
        } else if (arg0 == var4) {
            int var10 = arg1.method3467(arg0 + -35, 4);
            int var11 = var5.field8421[0];
            int var12 = var5.field8414[0];
            if (~var10 != -1) {
                if (~var10 != -2) {
                    if (var10 != 2) {
                        if (var10 != 3) {
                            if (var10 != 4) {
                                if (~var10 != -6) {
                                    if (var10 != 6) {
                                        if (~var10 != -8) {
                                            if (var10 == 8) {
                                                var11 += 2;
                                            } else if (~var10 == -10) {
                                                ++var12;
                                                var11 -= 2;
                                            } else if (var10 != 10) {
                                                if (~var10 == -12) {
                                                    var12 += 2;
                                                    var11 -= 2;
                                                } else if (var10 != 12) {
                                                    if (~var10 != -14) {
                                                        if (~var10 == -15) {
                                                            ++var11;
                                                            var12 += 2;
                                                        } else if (~var10 == -16) {
                                                            var11 += 2;
                                                            var12 += 2;
                                                        }
                                                    } else {
                                                        var12 += 2;
                                                    }
                                                } else {
                                                    --var11;
                                                    var12 += 2;
                                                }
                                            } else {
                                                var11 += 2;
                                                ++var12;
                                            }
                                        } else {
                                            var11 -= 2;
                                        }
                                    } else {
                                        --var12;
                                        var11 += 2;
                                    }
                                } else {
                                    --var12;
                                    var11 -= 2;
                                }
                            } else {
                                var12 -= 2;
                                var11 += 2;
                            }
                        } else {
                            ++var11;
                            var12 -= 2;
                        }
                    } else {
                        var12 -= 2;
                    }
                } else {
                    --var11;
                    var12 -= 2;
                }
            } else {
                var11 -= 2;
                var12 -= 2;
            }
            if (var3) {
                var5.field9258 = var11;
                var5.field9268 = var12;
                var5.field9276 = true;
            } else {
                var5.method3783(var12, class634.field9025[arg2], (byte) 81, var11);
            }
        } else {
            int var13 = arg1.method3467(93, 1);
            if (~var13 == -1) {
                int var14 = arg1.method3467(-99, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 1013) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = 31 & var14;
                if (~var17 < -16) {
                    var17 -= 32;
                }
                int var18 = var5.field8421[0] + var16;
                int var19 = var5.field8414[0] - -var17;
                if (var3) {
                    var5.field9258 = var18;
                    var5.field9268 = var19;
                    var5.field9276 = true;
                } else {
                    var5.method3783(var19, class634.field9025[arg2], (byte) 98, var18);
                }
                var5.field9501 = var5.field9495 = (byte) (3 & var5.field9501 + var15);
                if (class753.method4175(-12388, var19, var18)) {
                    ++var5.field9495;
                }
                if (~class471.field6467 == ~arg2) {
                    if (class392.field5459 != var5.field9501) {
                        class380.field5357 = true;
                    }
                    class392.field5459 = var5.field9501;
                }
            } else {
                int var20 = arg1.method3467(arg0 + 89, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 16383;
                int var23 = var20 & 16383;
                int var24 = (16383 & var5.field8421[0] + var22 - -class179.field2535) + -class179.field2535;
                int var25 = (16383 & var5.field8414[0] + class510.field7109 + var23) + -class510.field7109;
                if (!var3) {
                    var5.method3783(var25, class634.field9025[arg2], (byte) 112, var24);
                } else {
                    var5.field9276 = true;
                    var5.field9258 = var24;
                    var5.field9268 = var25;
                }
                var5.field9501 = var5.field9495 = (byte) (var5.field9501 + var21 & 3);
                if (class753.method4175(arg0 ^ -12386, var25, var24)) {
                    ++var5.field9495;
                }
                if (~class471.field6467 == ~arg2) {
                    class392.field5459 = var5.field9501;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)Ljs;", line = 369)
    public final class173 method2872(byte arg0) {
        ++field6768;
        int var2 = -1 % ((-50 - arg0) / 57);
        return this.field6869[this.field6838];
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILjs;)V", line = 383)
    public final void method2873(int arg0, class173 arg1) {
        ++field6668;
        if (arg0 != 0) {
            this.field6854 = null;
        }
        this.field6794.method864(arg1);
        this.field6798 = false;
        this.method2884(63);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIII)V", line = 399)
    public final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6753;
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
        if (this.method2940((float) arg1, 0.0F, (float) arg2 + var9, -9091, 0.0F, (float) arg0, (float) arg3 + var8)) {
            this.method2874((byte) -89);
            this.method2912((byte) 9, arg4);
            this.method2946(0, class123.field1675, (byte) 127);
            this.method2923(-110, 0, class123.field1675);
            this.method2945(arg5, 22630);
            this.method2886(357957308);
            this.method607((byte) 67, false);
            this.method2938(true);
            this.method607((byte) 67, true);
            this.method2923(-100, 0, class186.field2725);
            this.method2946(0, class186.field2725, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(B)V", line = 437)
    private final void method2874(byte arg0) {
        if (arg0 == -89) {
            if (~this.field6819 != -2) {
                this.method2918(30657);
                this.method2903((byte) 20, false);
                this.method2910(false, (byte) 119);
                this.method2869(arg0 + 102, false);
                this.method2885(false, 64);
                this.method2951(true, false, false, -2);
                this.method2881(1, -1);
                this.method2933((byte) -53, this.field6870);
                this.field6819 = 1;
            }
            ++field6727;
        }
    }

    @OriginalMember(owner = "client!pga", name = "Y", descriptor = "()[I", line = 461)
    public final int[] method2107() {
        ++field6611;
        return new int[] { this.field6829, this.field6905, this.field6821, this.field6882 };
    }

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "(I)V", line = 473)
    public final void method2875(int arg0) {
        if (arg0 != -2) {
            field6799 = null;
        }
        ++field6652;
        if (this.field6819 != 4) {
            this.method2918(arg0 + 30659);
            this.method2903((byte) 74, false);
            this.method2910(false, (byte) -30);
            this.method2869(arg0 ^ -13, false);
            this.method2885(false, 95);
            this.method2951(true, false, false, -2);
            this.method2945(1, 22630);
            this.method2881(0, arg0 + 1);
            this.field6819 = 4;
        }
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(B)V", line = 496)
    private final void method2876(byte arg0) {
        if (arg0 != 50) {
            this.method2893(-118);
        }
        this.field6894 = false;
        ++field6703;
        this.method2908((byte) 102);
        if (class77.field1058 == this.field6883) {
            this.method2929((byte) -98);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIZ)Lcw;", line = 512)
    public final class21 method2113(int arg0, int arg1, boolean arg2) {
        ++field6742;
        return new class68(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(B)V", line = 521)
    public final void method2877(byte arg0) {
        this.field6899 = new class595[this.field6863];
        ++field6674;
        this.field6812 = new class117[this.field6863];
        this.field6869 = new class173[this.field6863];
        this.field6880 = new class595[this.field6863];
        this.field6857 = new class528[this.field6863];
        for (int var2 = 0; ~var2 > ~this.field6863; ++var2) {
            this.field6880[var2] = class369.field4717;
            this.field6899[var2] = class369.field4717;
            this.field6857[var2] = class116.field1624;
            this.field6869[var2] = new class173();
        }
        this.field6825 = new class757[this.field6877 - 2];
        this.field6870 = this.method636(1, 1, class720.field10164, class4.field10, 124);
        this.method2177(new class97(262144));
        this.field6925 = this.method573(0, new class378[] { new class378(new class91[] { class91.field1226, class91.field1232 }) });
        this.field6929 = this.method573(0, new class378[] { new class378(new class91[] { class91.field1226, class91.field1230 }) });
        this.field6920 = this.method573(0, new class378[] { new class378(class91.field1226), new class378(class91.field1230), new class378(class91.field1232), new class378(class91.field1229) });
        this.field6930 = this.method573(0, new class378[] { new class378(class91.field1226), new class378(class91.field1230), new class378(class91.field1232) });
        this.field6915 = new class576(this, 0, 0, false, false);
        this.field6911 = new class576(this, 0, 0, true, true);
        this.field6924 = new class576(this, 0, 0, false, false);
        this.field6917 = new class576(this, 0, 0, true, true);
        this.field6926 = new class576(this, 0, 0, false, false);
        this.field6919 = new class576(this, 0, 0, true, true);
        this.field6932 = new class576(this, 0, 0, false, false);
        this.field6918 = new class576(this, 0, 0, true, true);
        if (arg0 > 107) {
            this.field6927 = new class576(this, 0, 0, false, false);
            this.field6914 = new class576(this, 0, 0, true, true);
            this.field6839 = new class303(this);
            this.field6922 = this.method634(true, true);
            this.method2921((byte) 100);
            this.field6749 = new class20(this);
            this.field6906[1] = this.method594(1, (byte) -110);
            this.field6906[2] = this.method594(2, (byte) -86);
            this.field6906[4] = this.method594(4, (byte) -126);
            this.field6906[5] = this.method594(5, (byte) -93);
            this.field6906[6] = this.method594(6, (byte) -116);
            this.field6906[7] = this.method594(7, (byte) -99);
            this.field6906[3] = this.method594(3, (byte) -88);
            this.field6906[8] = this.method594(8, (byte) -127);
            this.field6906[9] = this.method594(9, (byte) -85);
            if (!this.field6906[2].method35(-127)) {
                this.field6906[2] = this.method594(0, (byte) -96);
            }
            if (!this.field6906[4].method35(67)) {
                this.field6906[4] = this.field6906[2];
            }
            if (!this.field6906[8].method35(-118)) {
                this.field6906[8] = this.field6906[4];
            }
            if (!this.field6906[9].method35(-121)) {
                this.field6906[9] = this.field6906[8];
            }
            this.method566(34);
            this.method2198();
            this.method556();
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lhd;ILhd;)V", line = 596)
    public final void method2878(class595 arg0, int arg1, class595 arg2) {
        ++field6666;
        if (arg1 != 28768) {
            this.method2890(98);
        }
        boolean var4 = false;
        if (this.field6899[this.field6838] != arg2) {
            this.field6899[this.field6838] = arg2;
            this.method560(arg1 ^ -28780);
            var4 = true;
        }
        if (this.field6880[this.field6838] != arg0) {
            this.field6880[this.field6838] = arg0;
            var4 = true;
            this.method633((byte) 56);
        }
        if (var4) {
            this.field6819 &= -30;
        }
    }

    @OriginalMember(owner = "client!pga", name = "da", descriptor = "(III[I)V", line = 628)
    public final void method2123(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6758;
        float var5 = this.field6801.method1088((float) arg0, (byte) 124, (float) arg1, (float) arg2);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field6905;
            var7 = this.field6829;
        } else {
            var7 = (int) ((float) this.field6821 * this.field6801.method1089((float) arg0, (float) arg2, -82, (float) arg1) / var5);
            var6 = (int) ((float) this.field6882 * this.field6801.method1094((float) arg1, (float) arg0, (float) arg2, -20995) / var5);
        }
        arg3[0] = (int) ((float) var7 + -this.field6904);
        arg3[1] = (int) ((float) var6 + -this.field6908);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "(B)V", line = 655)
    public final void method2879(byte arg0) {
        ++field6661;
        this.method2906(class54.field758, 2, arg0 + -24586);
        if (arg0 != 3) {
            this.method2168(-27, -85, -56, -85, -45, 96);
        }
    }

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "(I)I", line = 666)
    public final int method2880(int arg0) {
        ++field6735;
        return arg0 != 8 ? 118 : this.field6872;
    }

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "(II)V", line = 678)
    public final void method2881(int arg0, int arg1) {
        if (~arg0 != -2) {
            if (~arg0 != -1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.method2878(class369.field4717, 28768, class35.field498);
                    } else if (arg0 == 4) {
                        this.method2878(class130.field1767, arg1 ^ -28769, class130.field1767);
                    }
                } else {
                    this.method2878(class253.field3501, arg1 + 28769, class438.field6017);
                }
            } else {
                this.method2878(class369.field4717, 28768, class369.field4717);
            }
        } else {
            this.method2878(class253.field3501, 28768, class253.field3501);
        }
        ++field6792;
        if (arg1 != -1) {
            this.method2224((Canvas) null, -59, -118);
        }
    }

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "()Luha;", line = 713)
    public final class723 method2135() {
        ++field6717;
        return this.field6801;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 724)
    public final void method2224(Canvas arg0, int arg1, int arg2) {
        ++field6694;
        Object var4 = null;
        if (arg0 != null && this.field6673 != arg0) {
            if (this.field6793.containsKey(arg0)) {
                var4 = this.field6793.get(arg0);
            }
        } else {
            var4 = this.field6725;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method571((byte) 3, arg0, var4);
            if (this.field6716 == arg0) {
                this.method2893(-6335);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BZ)V", line = 750)
    public final void method2882(byte arg0, boolean arg1) {
        ++field6670;
        if (arg0 <= -48) {
            if (this.field6900 != arg1) {
                this.field6900 = arg1;
                this.method629(104);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIF)Lkb;", line = 767)
    public final class757 method2225(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6696;
        return new class435(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pga", name = "K", descriptor = "([I)V", line = 777)
    public final void method2163(int[] arg0) {
        arg0[3] = this.field6842;
        arg0[0] = this.field6860;
        arg0[2] = this.field6849;
        ++field6722;
        arg0[1] = this.field6903;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZIIB[BLkea;)Loia;", line = 788)
    public final class51 method2883(boolean arg0, int arg1, int arg2, byte arg3, byte[] arg4, class77 arg5) {
        if (arg3 >= -61) {
            this.field6921 = null;
        }
        ++field6664;
        return this.method618(0, true, arg4, arg5, 0, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pga", name = "M", descriptor = "()I", line = 800)
    public final int method2223() {
        ++field6672;
        return this.field6934;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(IIIIII)V", line = 810)
    public final void method2166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6789;
        float var7 = this.method586(1);
        this.method2874((byte) -89);
        this.method2912((byte) 9, arg4);
        this.method2946(0, class123.field1675, (byte) 127);
        this.method2923(-98, 0, class123.field1675);
        this.method2945(arg5, 22630);
        this.field6794.method1091((float) (arg3 + -1), 1.0F, (float) (arg2 - 1), 1);
        this.field6794.method1093((float) arg1 - var7, 0.0F, (byte) -46, (float) arg0 - var7);
        this.method2901((byte) 53);
        this.method607((byte) 67, false);
        this.method2906(class86.field1191, 4, -24583);
        this.method607((byte) 67, true);
        this.method2923(-115, 0, class186.field2725);
        this.method2946(0, class186.field2725, (byte) 127);
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(II)I", line = 833)
    public final int method2101(int arg0, int arg1) {
        ++field6649;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "(I)V", line = 842)
    private final void method2884(int arg0) {
        ++field6617;
        if (class185.field2713 == this.field6883) {
            float var2 = this.method586(1);
            this.field6794.method1093(var2, 0.0F, (byte) -46, var2);
        }
        if (arg0 >= 31) {
            this.field6840 = false;
            this.method641(12);
            if (this.field6874 != null) {
                this.field6874.method2281((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "()Z", line = 865)
    public final boolean method2157() {
        ++field6780;
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(ZI)V", line = 873)
    public final void method2885(boolean arg0, int arg1) {
        if (!arg0 != !this.field6841) {
            this.field6841 = arg0;
            this.method575(false);
            this.field6819 &= -32;
        }
        if (arg1 <= 26) {
            this.method2910(true, (byte) -60);
        }
        ++field6624;
    }

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "(I)V", line = 891)
    public final void method2886(int arg0) {
        this.field6794.method860();
        ++field6637;
        this.field6798 = true;
        this.method2884(60);
        if (arg0 != 357957308) {
            this.field6839 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lwu;II)V", line = 905)
    public class492(Canvas arg0, Object arg1, class268 arg2, class557 arg3, int arg4, int arg5) {
        super(arg2);
        this.field6716 = this.field6673 = arg0;
        this.field6855 = arg4;
        this.field6725 = this.field6746 = arg1;
        this.field6744 = arg3;
        Dimension var7 = arg0.getSize();
        this.field6886 = arg5;
        this.field6732 = this.field6634 = var7.width;
        this.field6730 = this.field6642 = var7.height;
        class594.method3523(false, (byte) -126, true);
        if (super.field7694 != null) {
            this.field6892 = new class735(this, super.field7694);
            this.field6741 = new NativeInterface(super.field7694.method88(85), this.field6886);
            for (int var8 = 0; super.field7694.method88(-124) > var8; ++var8) {
                class468 var9 = super.field7694.method91(var8, -22805);
                if (var9 != null) {
                    this.field6741.initTextureMetrics(var8, var9.field6381, var9.field6399);
                }
            }
        } else {
            this.field6741 = new NativeInterface(0, this.field6886);
            this.field6892 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "(B)V", line = 948)
    public final void method2887(byte arg0) {
        this.method2919(-32);
        ++field6706;
        if (arg0 > 3) {
            this.method2929((byte) -103);
        }
    }

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "()Z", line = 960)
    public final boolean method2170() {
        ++field6721;
        return this.field6906[3].method35(-109);
    }

    @OriginalMember(owner = "client!pga", name = "L", descriptor = "(III)V", line = 970)
    public final void method2069(int arg0, int arg1, int arg2) {
        ++field6632;
        if (this.field6830 != arg0 || ~this.field6889 != ~arg1 || ~this.field6852 != ~arg2) {
            this.field6852 = arg2;
            this.field6830 = arg0;
            this.field6889 = arg1;
            this.method2944(false);
            this.method583(-12);
        }
    }

    @OriginalMember(owner = "client!pga", name = "H", descriptor = "(III[I)V", line = 989)
    public final void method2131(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6675;
        float var5 = this.field6801.method1088((float) arg0, (byte) 41, (float) arg1, (float) arg2);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field6829;
            var7 = this.field6905;
        } else {
            var6 = (int) ((float) this.field6821 * this.field6801.method1089((float) arg0, (float) arg2, -115, (float) arg1) / var5);
            var7 = (int) ((float) this.field6882 * this.field6801.method1094((float) arg1, (float) arg0, (float) arg2, -20995) / var5);
        }
        arg3[0] = (int) ((float) var6 - this.field6904);
        arg3[1] = (int) ((float) var7 + -this.field6908);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Z)V", line = 1014)
    public final void method2149(boolean arg0) {
        ++field6640;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z[F)[F", line = 1021)
    public final float[] method2888(boolean arg0, float[] arg1) {
        arg1[0] = this.field6836[0];
        arg1[8] = this.field6836[2];
        ++field6771;
        arg1[12] = this.field6836[3];
        arg1[4] = this.field6836[1];
        arg1[1] = this.field6836[4];
        if (arg0) {
            return null;
        } else {
            arg1[13] = this.field6836[7];
            arg1[2] = this.field6836[8];
            arg1[5] = this.field6836[5];
            arg1[9] = this.field6836[6];
            arg1[3] = this.field6836[12];
            arg1[14] = this.field6836[11];
            arg1[10] = this.field6836[10];
            arg1[6] = this.field6836[9];
            arg1[7] = this.field6836[13];
            arg1[11] = this.field6836[14];
            arg1[15] = this.field6836[15];
            return arg1;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIII)V", line = 1048)
    public final void method2201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6719;
        float var10 = (float) (-arg0) + (float) arg2;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method2874((byte) -89);
        this.method2912((byte) 9, arg4);
        this.method2946(0, class123.field1675, (byte) 127);
        this.method2923(-111, 0, class123.field1675);
        this.method2945(arg5, 22630);
        this.method2886(357957308);
        this.method607((byte) 67, false);
        int var14 = arg8 % (arg7 - -arg6);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~arg6 > ~var14) {
            var17 = (float) (arg6 + arg7 + -var14) * var12;
            var18 = (float) (-var14 + arg7 + arg6) * var11;
        } else {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg0 < arg2) {
                if (var21 > (float) arg2) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if (var21 < (float) arg2) {
                    break;
                }
                if (var19 + var21 < (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg3 > arg1) {
                if (var22 > (float) arg3) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if (var22 < (float) arg3) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method2940(var22, 0.0F, var19 + var21, -9091, 0.0F, var21, var20 + var22)) {
                return;
            }
            var21 += var19 + var23;
            this.method2938(true);
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
        }
        this.method607((byte) 67, true);
        this.method2923(-118, 0, class186.field2725);
        this.method2946(0, class186.field2725, (byte) 127);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIZZI)V", line = 1169)
    private final void method2889(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        boolean var7 = arg3 & this.method2170();
        ++field6698;
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            arg2 = 2;
            arg5 = ~arg2 != -5 ? 1 : arg1 & 1;
            arg1 = 0;
        }
        int var8 = -23 / ((arg0 - -43) / 40);
        if (~arg2 != -1 && arg4) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field6817 == arg2) {
            if (this.field6817 != 0) {
                this.field6906[Integer.MAX_VALUE & this.field6817].method33(true, arg4);
                if (this.field6868 != arg1 || ~this.field6831 != ~arg5) {
                    this.field6906[this.field6817 & Integer.MAX_VALUE].method38(arg1, arg5, false);
                    this.field6868 = arg1;
                    this.field6831 = arg5;
                }
                return;
            }
        } else {
            if (~this.field6817 != -1) {
                this.field6906[Integer.MAX_VALUE & this.field6817].method39(6);
            }
            if (~arg2 != -1) {
                this.field6874 = this.field6906[Integer.MAX_VALUE & arg2];
                this.field6874.method36(-96, arg4);
                this.field6874.method33(true, arg4);
                this.field6874.method38(arg1, arg5, false);
            } else {
                this.field6874 = null;
            }
            this.field6831 = arg5;
            this.field6868 = arg1;
            this.field6817 = arg2;
        }
    }

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "(I)V", line = 1227)
    public final void method2890(int arg0) {
        ++field6738;
        Enumeration var2 = this.field6793.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method558(this.field6793.get(var3), var3, -57);
        }
        this.field6916.method1398(false);
        if (arg0 != -14073) {
            this.method582(-97, (byte) -62, false, (class605) null, true);
        }
        this.field6921.method1398(false);
        this.field6931.method1398(false);
        this.field6911.method3436(120);
        this.field6917.method3436(arg0 + 14191);
        this.field6919.method3436(124);
        this.field6918.method3436(arg0 ^ -13959);
        this.field6914.method3436(arg0 + 14200);
        this.field6839.method1778(27694);
        this.field6922.method1398(false);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ltba;Z)Lcw;", line = 1259)
    public final class21 method2126(class320 arg0, boolean arg1) {
        ++field6708;
        class21 var10;
        if (~arg0.field4122 != -1 && ~arg0.field4121 != -1) {
            int[] var3 = new int[arg0.field4122 * arg0.field4121];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field4124 == null) {
                for (int var6 = 0; var6 < arg0.field4121; ++var6) {
                    for (int var7 = 0; var7 < arg0.field4122; ++var7) {
                        int var8 = arg0.field4128[255 & arg0.field4125[var4++]];
                        var3[var5++] = var8 != 0 ? class747.method4153(var8, -16777216) : 0;
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field4121; ++var9) {
                    for (int var11 = 0; arg0.field4122 > var11; ++var11) {
                        var3[var5++] = class747.method4153(arg0.field4128[class136.method878(255, arg0.field4125[var4])], arg0.field4124[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method3258(var3, 1, 0, arg0.field4122, arg0.field4122, arg0.field4121);
        } else {
            var10 = this.method3258(new int[1], 1, 0, 1, 1, 1);
        }
        var10.method106(arg0.field4127, arg0.field4123, arg0.field4126, arg0.field4120);
        return var10;
    }

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "(I)Ljs;", line = 1326)
    public final class173 method2891(int arg0) {
        if (arg0 > -36) {
            return null;
        } else {
            ++field6750;
            return this.field6794;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZIBI[FLkea;)Loia;", line = 1338)
    public final class51 method2892(boolean arg0, int arg1, byte arg2, int arg3, float[] arg4, class77 arg5) {
        ++field6760;
        if (arg2 != 25) {
            this.method2090(127, 2, -5, -40);
        }
        return this.method581(0, arg2 + -86, arg4, 0, arg0, arg3, arg5, arg1);
    }

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "()I", line = 1349)
    public final int method2124() {
        ++field6782;
        return this.field6877 + -2;
    }

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "(IIIIIII)I", line = 1358)
    public final int method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6614;
        int var8 = 0;
        float var9 = (float) arg2 * this.field6801.field2331 + (float) arg0 * this.field6801.field2332 + (float) arg1 * this.field6801.field2339 + this.field6801.field2328;
        float var10 = (float) arg5 * this.field6801.field2331 + (float) arg3 * this.field6801.field2332 + (float) arg4 * this.field6801.field2339 + this.field6801.field2328;
        if (var9 < (float) this.field6878 && (float) this.field6878 > var10) {
            var8 |= 16;
        } else if ((float) this.field6875 < var9 && var10 > (float) this.field6875) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field6801.field2370 + (float) arg0 * this.field6801.field2372 + (float) arg1 * this.field6801.field2352 + this.field6801.field2343) * (float) this.field6821 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field6801.field2370 + (float) arg3 * this.field6801.field2372 + (float) arg4 * this.field6801.field2352 + this.field6801.field2343) * (float) this.field6821 / (float) arg6);
        if (this.field6904 > (float) var11 && (float) var12 < this.field6904) {
            var8 |= 1;
        } else if (this.field6815 < (float) var11 && this.field6815 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field6801.field2335 + (float) arg0 * this.field6801.field2378 + (float) arg1 * this.field6801.field2364 + this.field6801.field2340) * (float) this.field6882 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field6801.field2335 + (float) arg3 * this.field6801.field2378 + (float) arg4 * this.field6801.field2364 + this.field6801.field2340) * (float) this.field6882 / (float) arg6);
        if (this.field6908 > (float) var13 && (float) var14 < this.field6908) {
            var8 |= 4;
        } else if (this.field6897 < (float) var13 && this.field6897 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 1405)
    public final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field6702;
    }

    @OriginalMember(owner = "client!pga", name = "DA", descriptor = "(IIII)V", line = 1415)
    public final void method2081(int arg0, int arg1, int arg2, int arg3) {
        this.field6882 = arg3;
        ++field6626;
        this.field6821 = arg2;
        this.field6905 = arg1;
        this.field6829 = arg0;
        this.method2876((byte) 50);
        this.method2930(6);
        this.method2919(-32);
        this.method2947(10090);
    }

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "(I)V", line = 1430)
    private final void method2893(int arg0) {
        ++field6704;
        if (this.field6716 != null) {
            Dimension var2 = this.field6716.getSize();
            this.field6634 = var2.width;
            this.field6642 = var2.height;
        } else {
            this.field6634 = this.field6642 = 1;
        }
        this.field6730 = this.field6642;
        this.field6732 = this.field6634;
        this.method2913(arg0 ^ 30276);
        this.method2930(arg0 + 6341);
        this.method2876((byte) 50);
        this.method606(1);
        this.method2947(10090);
        if (arg0 != -6335) {
            this.method2949(-55, 108);
        }
        this.method2919(-32);
        this.method2198();
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(BI)V", line = 1465)
    public final void method2894(byte arg0, int arg1) {
        this.method2912((byte) 9, arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
        int var3 = -53 % ((-48 - arg1) / 34);
        ++field6639;
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "()Z", line = 1480)
    public final boolean method2174() {
        ++field6620;
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "X", descriptor = "(I)V", line = 1488)
    public final void method2104(int arg0) {
        this.field6818 = 0;
        ++field6690;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field6818;
        }
        this.field6823 = 1 << this.field6818;
    }

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "()Luha;", line = 1504)
    public final class723 method2087() {
        ++field6731;
        return this.field6912;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "([IIIIIZ)Lcw;", line = 1512)
    public final class21 method2070(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6662;
        return new class68(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "(I)V", line = 1524)
    public final void method2071(int arg0) {
        ++field6752;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(Z)I", line = 1534)
    public final int method2895(boolean arg0) {
        if (arg0) {
            return 79;
        } else {
            ++field6630;
            return this.field6873;
        }
    }

    @OriginalMember(owner = "client!pga", name = "P", descriptor = "(IIIII)V", line = 1545)
    public final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6693;
        this.method2168(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pga", name = "HA", descriptor = "(IIII[I)V", line = 1554)
    public final void method2195(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field6648;
        float var6 = this.field6801.method1088((float) arg0, (byte) 45, (float) arg1, (float) arg2);
        if (!((float) this.field6878 > var6) && !((float) this.field6875 < var6)) {
            int var7 = (int) ((float) this.field6821 * this.field6801.method1089((float) arg0, (float) arg2, -74, (float) arg1) / (float) arg3);
            int var8 = (int) ((float) this.field6882 * this.field6801.method1094((float) arg1, (float) arg0, (float) arg2, -20995) / (float) arg3);
            arg4[0] = (int) ((float) var7 + -this.field6904);
            arg4[1] = (int) ((float) var8 + -this.field6908);
            arg4[2] = (int) var6;
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIILaa;II)V", line = 1576)
    public final void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8) {
        ++field6669;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IB)Lni;", line = 1583)
    public class512 method594(int arg0, byte arg1) {
        ++field6764;
        if (arg1 >= -81) {
            this.field6855 = 114;
        }
        if (arg0 != 6) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    return arg0 == 7 ? new class207(this) : new class662(this);
                } else {
                    return new class238(this, this.field6749);
                }
            } else {
                return new class8(this);
            }
        } else {
            return new class740(this);
        }
    }

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "(I)V", line = 1633)
    private final void method2896(int arg0) {
        if (!this.field6907) {
            float[] var2 = this.field6835;
            this.field6907 = true;
            if (this.field6732 != 0 && this.field6730 != 0) {
                var2[13] = 1.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = -1.0F;
                var2[3] = 0.0F;
                var2[10] = 0.5F;
                var2[14] = 0.5F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = -2.0F / (float) this.field6730;
                var2[0] = 2.0F / (float) this.field6732;
                var2[15] = 1.0F;
            } else {
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
            }
        }
        int var3 = 55 / ((arg0 - 72) / 53);
        ++field6687;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIZ)Lcw;", line = 1693)
    public final class21 method2119(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6710;
        class68 var6 = new class68(this, arg2, arg3, arg4);
        var6.method118(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "(B)Ljs;", line = 1706)
    public final class173 method2897(byte arg0) {
        if (arg0 != -51) {
            this.method587();
        }
        ++field6785;
        return this.field6869[this.field6838];
    }

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "(I)Lza;", line = 1717)
    public final class256 method2226(int arg0) {
        ++field6679;
        class97 var2 = new class97(arg0);
        this.field6779.method3116(29066, var2);
        return var2;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lza;)V", line = 1731)
    public final void method2177(class256 arg0) {
        this.field6718 = ((class97) arg0).field1404;
        ++field6740;
        this.field6765 = this.field6718.method2558(32768, false);
    }

    @OriginalMember(owner = "client!pga", name = "la", descriptor = "()V", line = 1742)
    public final void method2198() {
        this.field6903 = 0;
        this.field6860 = 0;
        this.field6842 = this.field6730;
        this.field6849 = this.field6732;
        ++field6635;
        if (this.field6933) {
            this.field6933 = false;
            this.method579(16);
        }
        this.method2947(10090);
    }

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "(B)Luia;", line = 1763)
    public final class273 method2898(byte arg0) {
        if (arg0 <= 30) {
            this.method604(26);
        }
        ++field6745;
        return this.field6885 == null ? null : this.field6885.method796(1);
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(ZI)V", line = 1778)
    public final void method2899(boolean arg0, int arg1) {
        if (this.field6814 == !arg0) {
            this.field6814 = arg0;
            this.method583(-12);
        }
        if (arg1 != -16777216) {
            field6790 = null;
        }
        ++field6685;
    }

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "(I)[F", line = 1798)
    public final float[] method2900(int arg0) {
        ++field6641;
        if (arg0 != 20112) {
            this.field6848 = -0.46289605F;
        }
        return this.field6867;
    }

    @OriginalMember(owner = "client!pga", name = "ra", descriptor = "(IIII)V", line = 1809)
    public final void method2151(int arg0, int arg1, int arg2, int arg3) {
        this.field6853 = arg3;
        this.field6898 = true;
        this.field6873 = arg0;
        this.field6872 = arg1;
        this.field6828 = arg2;
        ++field6628;
    }

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "(B)V", line = 1821)
    public final void method2901(byte arg0) {
        ++field6684;
        this.field6798 = false;
        this.method2884(arg0 + -15);
        if (arg0 != 53) {
            this.method2894((byte) -55, 33);
        }
    }

    @OriginalMember(owner = "client!pga", name = "za", descriptor = "(IIIII)V", line = 1836)
    public final void method2091(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2874((byte) -89);
        ++field6729;
        this.method2912((byte) 9, arg3);
        this.method2946(0, class123.field1675, (byte) 127);
        this.method2923(-123, 0, class123.field1675);
        this.method2945(arg4, 22630);
        this.field6794.method1091((float) arg2, 1.0F, (float) arg2, 1);
        this.field6794.method851(arg0, arg1, 0);
        this.method2901((byte) 53);
        this.method607((byte) 67, false);
        this.method564(0, this.field6931, false);
        this.method565(false, this.field6913);
        this.method580(0, 256, 91, class54.field758);
        this.method607((byte) 67, true);
        this.method2923(-118, 0, class186.field2725);
        this.method2946(0, class186.field2725, (byte) 127);
    }

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "(B)V", line = 1864)
    public final void method2902(byte arg0) {
        if (arg0 < -36) {
            if (this.field6819 != 2) {
                this.method2918(30657);
                this.method2903((byte) 81, false);
                this.method2910(false, (byte) 16);
                this.method2869(13, false);
                this.method2885(false, 36);
                this.method2951(true, false, false, -2);
                this.field6819 = 2;
            }
            ++field6777;
        }
    }

    @OriginalMember(owner = "client!pga", name = "E", descriptor = "()I", line = 1886)
    public final int method2179() {
        ++field6699;
        return this.field6797 + this.field6795 + this.field6796;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(BZ)V", line = 1894)
    public final void method2903(byte arg0, boolean arg1) {
        ++field6720;
        if (!arg1 == this.field6844) {
            this.field6844 = arg1;
            this.method583(-12);
            this.field6819 &= -32;
        }
        if (arg0 <= 5) {
            this.field6847 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(Z)V", line = 1912)
    private final void method2904(boolean arg0) {
        if (class96.field1400 != this.field6883) {
            class497 var2 = this.field6883;
            this.field6883 = class96.field1400;
            if (!var2.method2981(-122)) {
                this.method2942(32768);
            }
            this.method2926(-90);
            this.field6836 = this.field6851;
            this.method2929((byte) -91);
            this.field6819 &= -8;
        }
        ++field6747;
        if (arg0) {
            this.field6888 = -95;
        }
    }

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "(I)V", line = 1937)
    private final void method2905(int arg0) {
        ++field6754;
        this.field6916 = this.method638((byte) -91, false);
        this.field6916.method1591(-17230, 140, 28);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field6916.method1590((byte) 64, true);
            if (var3 != null) {
                Stream var4 = this.method2917(var3, false);
                if (Stream.method2541()) {
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(1.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(1.0F);
                    var4.method2552(0.0F);
                    var4.method2552(1.0F);
                    var4.method2552(1.0F);
                    var4.method2552(1.0F);
                    var4.method2552(0.0F);
                    var4.method2552(1.0F);
                    var4.method2552(1.0F);
                    var4.method2552(1.0F);
                    var4.method2552(1.0F);
                    var4.method2552(1.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(1.0F);
                    var4.method2552(0.0F);
                    var4.method2552(1.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                    var4.method2552(0.0F);
                } else {
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(1.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(1.0F);
                    var4.method2550(0.0F);
                    var4.method2550(1.0F);
                    var4.method2550(1.0F);
                    var4.method2550(1.0F);
                    var4.method2550(0.0F);
                    var4.method2550(1.0F);
                    var4.method2550(1.0F);
                    var4.method2550(1.0F);
                    var4.method2550(1.0F);
                    var4.method2550(1.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(1.0F);
                    var4.method2550(0.0F);
                    var4.method2550(1.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                    var4.method2550(0.0F);
                }
                var4.method2551();
                if (this.field6916.method1592(-14952)) {
                    break;
                }
            }
        }
        if (arg0 != -28620) {
            this.method2927((byte) -6);
        }
        this.field6928 = this.method573(0, new class378[] { new class378(new class91[] { class91.field1226, class91.field1232, class91.field1232 }) });
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 2053)
    public final void method2137(Canvas arg0, int arg1, int arg2) {
        ++field6625;
        if (this.field6673 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6793.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method596(124, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field6793.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lbfa;II)V", line = 2095)
    private final void method2906(class574 arg0, int arg1, int arg2) {
        this.method564(0, this.field6916, false);
        if (arg2 == -24583) {
            ++field6623;
            this.method565(false, this.field6928);
            this.method580(0, arg1, 97, arg0);
        }
    }

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "()V", line = 2113)
    public static final void method2907() {
        for (int var0 = 0; var0 < class523.field7347.length; ++var0) {
            class523.field7347[var0].method3395();
        }
        class523.field7347 = null;
    }

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "(B)V", line = 2123)
    private final void method2908(byte arg0) {
        ++field6787;
        if (arg0 > 38) {
            if (!this.field6894) {
                float[] var2 = this.field6884;
                float var3 = (float) this.field6878;
                float var4 = (float) this.field6875;
                float var5 = (float) (-this.field6905) * this.field6833 / (float) this.field6882;
                float var6 = (float) (-this.field6829) * this.field6833 / (float) this.field6821;
                float var7 = (float) (this.field6732 - this.field6829) * this.field6833 / (float) this.field6821;
                float var8 = (float) (-this.field6905 + this.field6730) * this.field6833 / (float) this.field6882;
                if (var6 != var7 && var5 != var8) {
                    var2[5] = 2.0F / (-var5 + var8);
                    var2[10] = 1.0F / (-var4 + var3);
                    var2[7] = 0.0F;
                    var2[8] = 0.0F;
                    var2[12] = (var6 + var7) / (-var7 + var6);
                    var2[11] = 0.0F;
                    var2[13] = (var5 + var8) / (var8 - var5);
                    var2[6] = 0.0F;
                    var2[3] = 0.0F;
                    var2[2] = 0.0F;
                    var2[15] = 1.0F;
                    var2[9] = 0.0F;
                    var2[1] = 0.0F;
                    var2[4] = 0.0F;
                    var2[0] = 2.0F / (var7 - var6);
                    var2[14] = var3 / (var3 - var4);
                } else {
                    var2[12] = 0.0F;
                    var2[15] = 1.0F;
                    var2[9] = 0.0F;
                    var2[2] = 0.0F;
                    var2[4] = 0.0F;
                    var2[0] = 1.0F;
                    var2[14] = 0.0F;
                    var2[13] = 0.0F;
                    var2[11] = 0.0F;
                    var2[10] = 1.0F;
                    var2[1] = 0.0F;
                    var2[8] = 0.0F;
                    var2[3] = 0.0F;
                    var2[5] = 1.0F;
                    var2[6] = 0.0F;
                    var2[7] = 0.0F;
                }
                this.method2948((byte) -80);
                this.field6894 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "()Z", line = 2193)
    public final boolean method2079() {
        ++field6723;
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Loq;[Ltba;Z)Lda;", line = 2202)
    public final class400 method2085(class742 arg0, class320[] arg1, boolean arg2) {
        ++field6786;
        return new class572(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "(I)V", line = 2210)
    public void method599(int arg0) {
        this.field6879 = this.field6888;
        ++field6700;
        if (arg0 != 3) {
            this.method2917((Buffer) null, false);
        }
        this.field6888 = 0;
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(ZI)Lho;", line = 2222)
    public final class212 method2909(boolean arg0, int arg1) {
        ++field6709;
        if (~(arg1 * 2) < ~this.field6922.method1683(!arg0)) {
            this.field6922.method1399(arg1, true);
        }
        return !arg0 ? null : this.field6922;
    }

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "()I", line = 2236)
    public final int method2230() {
        ++field6610;
        return this.field6878;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZB)V", line = 2244)
    public final void method2910(boolean arg0, byte arg1) {
        ++field6759;
        if (!this.field6890 != !arg0) {
            this.field6890 = arg0;
            this.method629(-76);
            this.field6819 &= -8;
        }
        int var3 = 58 / ((arg1 - 59) / 43);
    }

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "(B)V", line = 2260)
    private final void method2911(byte arg0) {
        this.method562((byte) -77);
        ++field6686;
        this.method640(arg0 + -110);
        this.method629(48);
        this.method599(arg0 + -108);
        this.method620((byte) 47);
        if (arg0 == 111) {
            this.method623((byte) -109);
            this.method609((byte) -60);
            this.method597((byte) -88);
            this.method575(false);
            this.method583(arg0 + -123);
            this.method615((byte) -128);
            this.method588(1);
            this.method603((byte) 71);
            this.method577(0);
            for (int var2 = this.field6863 + -1; ~var2 <= -1; --var2) {
                this.method2949(var2, 7544);
                this.method560(-12);
                this.method633((byte) 56);
                this.method2928(false);
            }
            this.method602(false);
            this.method606(arg0 + -110);
            this.method637(14);
            this.method641(12);
            this.method621((byte) -111);
        }
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "(I)V", line = 2306)
    public final void method2147(int arg0) {
        ++field6761;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 2318)
    public final void method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field6629;
    }

    @OriginalMember(owner = "client!pga", name = "xa", descriptor = "(F)V", line = 2325)
    public final void method2132(float arg0) {
        ++field6748;
        if (this.field6850 != arg0) {
            this.field6850 = arg0;
            this.field6741.setAmbient(arg0);
            this.method562((byte) -77);
            this.method623((byte) -119);
        }
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(BI)V", line = 2341)
    public final void method2912(byte arg0, int arg1) {
        if (arg0 != 9) {
            this.field6901 = -100;
        }
        if (this.field6813 != arg1) {
            this.field6813 = arg1;
            this.method602(false);
        }
        ++field6631;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V", line = 2359)
    public final void method2098(int arg0) {
        ++field6783;
    }

    @OriginalMember(owner = "client!pga", name = "C", descriptor = "(I)V", line = 2370)
    private final void method2913(int arg0) {
        ++field6734;
        this.field6907 = false;
        if (class185.field2713 == this.field6883) {
            this.method2896(-47);
            this.method2929((byte) -108);
        }
        if (arg0 != -28411) {
            this.method2170();
        }
    }

    @OriginalMember(owner = "client!pga", name = "E", descriptor = "(I)V", line = 2395)
    public final void method2914(int arg0) {
        if (this.field6819 != arg0) {
            this.method2904(false);
            this.method2903((byte) 44, true);
            this.method2869(13, true);
            this.method2885(true, 39);
            this.method2945(1, 22630);
            this.field6819 = 8;
        }
        ++field6645;
    }

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "()V", line = 2413)
    public void method587() {
        ++field6627;
        if (!this.field6858) {
            for (class513 var1 = this.field6779.method3118((byte) 73); var1 != null; var1 = this.field6779.method3111(124)) {
                ((class97) var1).method657(7875);
            }
            Enumeration var2 = this.field6793.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method558(this.field6793.get(var3), var3, -68);
            }
            class729.method4066(true, false, -2679);
            this.field6741.release();
            this.field6858 = true;
        }
    }

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "(ILaa;II)V", line = 2449)
    public final void method2093(int arg0, class571 arg1, int arg2, int arg3) {
        ++field6743;
        class82 var5 = (class82) arg1;
        class51 var6 = var5.field1111;
        this.method2902((byte) -112);
        this.method2933((byte) -88, var6);
        this.method2945(1, 22630);
        this.method2878(class253.field3501, 28768, class253.field3501);
        this.method2946(0, class123.field1675, (byte) 127);
        this.method2912((byte) 9, arg0);
        this.field6794.method1091((float) this.field6730, 0.0F, (float) this.field6732, 1);
        this.method2901((byte) 53);
        this.field6869[0].method1091(var6.method354(-23477, (float) this.field6730), 1.0F, var6.method353((byte) 118, (float) this.field6732), 1);
        this.field6869[0].method1093(var6.method354(-23477, (float) (-arg3)), 0.0F, (byte) -46, var6.method353((byte) 117, (float) (-arg2)));
        this.field6857[0] = class643.field9115;
        this.method2939((byte) -48);
        this.method2879((byte) 3);
        this.method2928(false);
        this.method2946(0, class186.field2725, (byte) 127);
    }

    @OriginalMember(owner = "client!pga", name = "U", descriptor = "(IIIII)V", line = 2476)
    public final void method2173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2168(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
        ++field6638;
    }

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "()Z", line = 2484)
    public final boolean method2162() {
        ++field6608;
        return this.field6834;
    }

    @OriginalMember(owner = "client!pga", name = "F", descriptor = "(I)Ljs;", line = 2492)
    public final class173 method2915(int arg0) {
        if (arg0 != 17967) {
            this.field6849 = 91;
        }
        ++field6695;
        return this.field6807;
    }

    @OriginalMember(owner = "client!pga", name = "G", descriptor = "(I)V", line = 2503)
    public static void method2916(int arg0) {
        field6799 = null;
        field6803 = null;
        if (arg0 < 126) {
            field6800 = null;
        }
        field6800 = null;
        field6790 = null;
        field6802 = null;
    }

    @OriginalMember(owner = "client!pga", name = "Q", descriptor = "(IIIIII[BII)V", line = 2517)
    public final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6739;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIIIII)Lcd;", line = 2528)
    public final class22 method2134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6755;
        return new class124(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljaclib/memory/Buffer;Z)Ljaclib/memory/Stream;", line = 2536)
    public final Stream method2917(Buffer arg0, boolean arg1) {
        this.field6822.method2547(arg0);
        ++field6654;
        if (arg1) {
            this.field6822 = null;
        }
        return this.field6822;
    }

    @OriginalMember(owner = "client!pga", name = "H", descriptor = "(I)V", line = 2548)
    private final void method2918(int arg0) {
        ++field6619;
        if (arg0 != 30657) {
            this.method2899(false, -100);
        }
        if (class185.field2713 != this.field6883) {
            class497 var2 = this.field6883;
            this.field6883 = class185.field2713;
            if (var2.method2981(-121)) {
                this.method2942(arg0 + 2111);
            }
            this.method2896(-114);
            this.field6836 = this.field6835;
            this.method2929((byte) -109);
            this.field6819 &= -25;
        }
    }

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "()Z", line = 2574)
    public final boolean method2180() {
        ++field6763;
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "I", descriptor = "(I)V", line = 2582)
    public final void method2919(int arg0) {
        if (class167.field2287 != this.field6883) {
            class497 var2 = this.field6883;
            this.field6883 = class167.field2287;
            if (var2.method2981(arg0 ^ 111)) {
                this.method2942(arg0 ^ -32800);
            }
            this.field6836 = this.field6867;
            this.field6819 &= -32;
        }
        ++field6656;
        if (arg0 != -32) {
            this.method2115(80, 126, -22, 7, 118, -109, (byte[]) null, -21, -122);
        }
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "()V", line = 2613)
    public final void method2203() {
        ++field6689;
        if (this.field6892 != null) {
            this.field6892.method4083(0);
        }
    }

    @OriginalMember(owner = "client!pga", name = "K", descriptor = "(I)V", line = 2626)
    private final void method2920(int arg0) {
        this.field6851[arg0] = this.field6891;
        ++field6658;
        this.field6851[10] = this.field6909;
        this.field6866 = (this.field6851[14] - (float) this.field6875) / this.field6851[10];
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Luha;)V", line = 2641)
    public final void method2068(class723 arg0) {
        this.field6801 = (class173) arg0;
        ++field6713;
        this.field6807.method864(this.field6801);
        this.field6807.method1095((byte) 124);
        this.field6808.method1085(this.field6807, (byte) -87);
        this.field6805.method1085(this.field6801, (byte) -87);
        if (this.field6883.method2981(-123)) {
            this.method2942(32768);
        }
    }

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "(B)V", line = 2660)
    public final void method2921(byte arg0) {
        int var2 = 43 / ((-57 - arg0) / 44);
        ++field6773;
        Hashtable var3 = new Hashtable();
        if (this.field6793 != null && !this.field6793.isEmpty()) {
            Enumeration var4 = this.field6793.keys();
            while (var4.hasMoreElements()) {
                Canvas var5 = (Canvas) var4.nextElement();
                var3.put(var5, this.method596(79, var5));
            }
        }
        this.field6793 = var3;
        this.method2905(-28620);
        this.method2870(127);
        this.method2937(0);
        this.field6839.method1779((byte) -60, this);
    }

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "(B)V", line = 2692)
    private final void method2922(byte arg0) {
        ++field6680;
        int var2 = 99 % ((arg0 - 27) / 46);
        if (class77.field1058 != this.field6883) {
            class497 var3 = this.field6883;
            this.field6883 = class77.field1058;
            if (!var3.method2981(-123)) {
                this.method2942(32768);
            }
            this.method2908((byte) 58);
            this.field6836 = this.field6884;
            this.method2929((byte) -90);
            this.field6819 &= -8;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IILqs;)V", line = 2715)
    public final void method2923(int arg0, int arg1, class605 arg2) {
        this.method624((byte) -83, arg2, false, arg1);
        if (arg0 >= -92) {
            this.field6890 = true;
        }
        ++field6715;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BIZ)Ljaclib/memory/heap/NativeHeapBuffer;", line = 2728)
    public final NativeHeapBuffer method2924(byte arg0, int arg1, boolean arg2) {
        if (arg0 != -60) {
            return null;
        } else {
            ++field6778;
            return this.field6718.method2558(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pga", name = "ZA", descriptor = "(IFFFFF)V", line = 2740)
    public final void method2161(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6762;
        boolean var7 = ~this.field6816 != ~arg0;
        if (var7 || this.field6826 != arg1 || this.field6910 != arg2) {
            this.field6826 = arg1;
            this.field6816 = arg0;
            this.field6910 = arg2;
            if (var7) {
                this.field6810 = (float) (this.field6816 & 65280) / 65280.0F;
                this.field6893 = (float) (this.field6816 & 16711680) / 1.671168E7F;
                this.field6881 = (float) (255 & this.field6816) / 255.0F;
                this.method562((byte) -77);
            }
            this.field6741.setSunColour(this.field6893, this.field6810, this.field6881, arg1, arg2);
            this.method640(1);
        }
        if (this.field6827[0] != arg3 || this.field6827[1] != arg4 || this.field6827[2] != arg5) {
            this.field6827[2] = arg5;
            this.field6827[0] = arg3;
            this.field6827[1] = arg4;
            this.field6854[0] = -arg3;
            this.field6854[2] = -arg5;
            this.field6854[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6861[1] = arg4 * var8;
            this.field6861[2] = arg5 * var8;
            this.field6861[0] = arg3 * var8;
            this.field6847[2] = -this.field6861[2];
            this.field6847[0] = -this.field6861[0];
            this.field6847[1] = -this.field6861[1];
            this.field6741.setSunDirection(this.field6861[0], this.field6861[1], this.field6861[2]);
            this.method620((byte) 47);
            this.field6902 = (int) (arg3 * 256.0F / arg4);
            this.field6862 = (int) (arg5 * 256.0F / arg4);
        }
        this.method623((byte) -111);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lefa;B)V", line = 2792)
    public final void method2925(class528 arg0, byte arg1) {
        ++field6766;
        this.field6857[this.field6838] = arg0;
        this.method2939((byte) -71);
        if (arg1 < 103) {
            this.method2895(false);
        }
    }

    @OriginalMember(owner = "client!pga", name = "O", descriptor = "(I)V", line = 2806)
    private final void method2926(int arg0) {
        if (!this.field6871) {
            float[] var2 = this.field6851;
            float var3 = (float) (-this.field6829 * this.field6878) / (float) this.field6821;
            float var4 = (float) ((-this.field6829 + this.field6732) * this.field6878) / (float) this.field6821;
            float var5 = (float) (this.field6905 * this.field6878) / (float) this.field6882;
            float var6 = (float) ((this.field6905 - this.field6730) * this.field6878) / (float) this.field6882;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field6878 * 2.0F;
                var2[15] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[11] = -1.0F;
                var2[3] = 0.0F;
                var2[14] = this.field6891 = (float) (this.field6878 * this.field6875) / (float) (this.field6878 - this.field6875);
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = this.field6909 = (float) this.field6875 / (float) (-this.field6875 + this.field6878);
                var2[13] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[5] = var7 / (var5 - var6);
            } else {
                var2[0] = 1.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = 1.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[3] = 0.0F;
            }
            this.method2920(14);
            this.field6871 = true;
        }
        ++field6636;
        int var8 = -28 / ((arg0 - 14) / 58);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lcd;)V", line = 2877)
    public final void method2136(class22 arg0) {
        ++field6756;
        this.field6885 = (class481) arg0;
    }

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "(B)Ljs;", line = 2887)
    public final class173 method2927(byte arg0) {
        if (arg0 != -92) {
            this.field6911 = null;
        }
        ++field6682;
        return this.field6808;
    }

    @OriginalMember(owner = "client!pga", name = "P", descriptor = "(I)V", line = 2898)
    public void method566(int arg0) {
        if (arg0 <= 16) {
            this.method2107();
        }
        this.method2911((byte) 111);
        ++field6724;
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "(Z)V", line = 2913)
    public final void method2928(boolean arg0) {
        ++field6711;
        if (this.field6857[this.field6838] != class116.field1624) {
            this.field6857[this.field6838] = class116.field1624;
            this.field6869[this.field6838].method860();
            this.method2939((byte) -99);
        }
        if (arg0) {
            this.field6825 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "()Z", line = 2930)
    public final boolean method2100() {
        ++field6769;
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "(B)V", line = 2939)
    private final void method2929(byte arg0) {
        ++field6775;
        this.method637(14);
        if (this.field6874 != null) {
            this.field6874.method2283((byte) 81);
        }
        if (arg0 > -85) {
            this.field6812 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "Q", descriptor = "(I)V", line = 2956)
    private final void method2930(int arg0) {
        ++field6660;
        if (arg0 != 6) {
            this.field6819 = 11;
        }
        this.field6871 = false;
        this.method2926(-91);
        if (class96.field1400 == this.field6883) {
            this.method2929((byte) -120);
        }
    }

    @OriginalMember(owner = "client!pga", name = "R", descriptor = "(I)I", line = 2972)
    public final int method2931(int arg0) {
        ++field6688;
        if (arg0 != 6) {
            this.field6858 = false;
        }
        return this.field6853;
    }

    @OriginalMember(owner = "client!pga", name = "XA", descriptor = "()I", line = 2987)
    public final int method2160() {
        ++field6613;
        return this.field6875;
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "(II)V", line = 2995)
    public final void method2143(int arg0, int arg1) {
        ++field6691;
        if (~this.field6878 != ~arg0 || ~this.field6875 != ~arg1) {
            this.field6878 = arg0;
            this.field6875 = arg1;
            this.method2930(6);
            this.method2876((byte) 50);
            this.method2944(false);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lev;I)V", line = 3013)
    public final void method2112(class347 arg0, int arg1) {
        ++field6751;
        this.field6839.method1774(this, arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "()Z", line = 3022)
    public final boolean method2086() {
        ++field6643;
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 3032)
    public final class339 method2213(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6697;
        return new class556(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FI)V", line = 3040)
    public final void method2932(float arg0, int arg1) {
        if (this.field6833 != arg0) {
            this.field6833 = arg0;
            this.method2876((byte) 50);
        }
        ++field6667;
        if (arg1 != 17736) {
            this.method629(-119);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLlo;)V", line = 3061)
    public final void method2933(byte arg0, class117 arg1) {
        int var3 = 42 / ((arg0 - 35) / 42);
        ++field6657;
        if (this.field6812[this.field6838] != arg1) {
            this.field6812[this.field6838] = arg1;
            if (arg1 == null) {
                this.method576(-86);
            } else {
                arg1.method770(-27531);
            }
            this.field6819 &= -2;
        }
    }

    @OriginalMember(owner = "client!pga", name = "S", descriptor = "(I)Ljs;", line = 3083)
    public final class173 method2934(int arg0) {
        if (!this.field6840) {
            this.field6809.method1097(this.field6807, this.field6794);
            this.field6840 = true;
        }
        int var2 = 98 / ((arg0 - -90) / 32);
        ++field6659;
        return this.field6809;
    }

    @OriginalMember(owner = "client!pga", name = "T", descriptor = "(I)I", line = 3102)
    public final int method2935(int arg0) {
        if (arg0 >= -102) {
            return -9;
        } else {
            ++field6712;
            return this.field6828;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3115)
    public final void method2095(Canvas arg0) {
        this.field6725 = null;
        this.field6716 = null;
        ++field6665;
        if (arg0 != null && this.field6673 != arg0) {
            if (this.field6793.containsKey(arg0)) {
                this.field6725 = this.field6793.get(arg0);
                this.field6716 = arg0;
            }
        } else {
            this.field6725 = this.field6746;
            this.field6716 = this.field6673;
        }
        if (this.field6716 != null && this.field6725 != null) {
            this.method567(this.field6725, this.field6716, 2);
            this.method2893(-6335);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lev;)V", line = 3144)
    public final void method2122(class347 arg0) {
        ++field6707;
        this.field6839.method1774(this, arg0, -1, 0);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZII[IB)Loia;", line = 3152)
    public final class51 method2936(boolean arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        if (arg4 != 103) {
            this.method2149(false);
        }
        ++field6767;
        return this.method601(0, arg1, arg4 + -24467, 0, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!pga", name = "U", descriptor = "(I)V", line = 3168)
    private final void method2937(int arg0) {
        this.field6931 = this.method638((byte) -84, false);
        ++field6677;
        this.field6931.method1591(-17230, 3096, 12);
        for (int var2 = arg0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field6931.method1590((byte) 64, true);
            if (var3 != null) {
                Stream var4 = this.method2917(var3, false);
                var4.method2552(0.0F);
                var4.method2552(0.0F);
                var4.method2552(0.0F);
                for (int var5 = 0; var5 <= 256; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (Stream.method2541()) {
                        var4.method2552(var9);
                        var4.method2552(var8);
                        var4.method2552(0.0F);
                    } else {
                        var4.method2550(var9);
                        var4.method2550(var8);
                        var4.method2550(0.0F);
                    }
                }
                var4.method2551();
                if (this.field6931.method1592(-14952)) {
                    break;
                }
            }
        }
        this.field6913 = this.method573(0, new class378[] { new class378(class91.field1226) });
    }

    @OriginalMember(owner = "client!pga", name = "T", descriptor = "(IIII)V", line = 3232)
    public final void method2090(int arg0, int arg1, int arg2, int arg3) {
        ++field6655;
        boolean var5 = false;
        if (arg0 > this.field6860) {
            this.field6860 = arg0;
            var5 = true;
        }
        if (this.field6849 > arg2) {
            this.field6849 = arg2;
            var5 = true;
        }
        if (arg1 > this.field6903) {
            var5 = true;
            this.field6903 = arg1;
        }
        if (~this.field6842 < ~arg3) {
            var5 = true;
            this.field6842 = arg3;
        }
        if (var5) {
            if (!this.field6933) {
                this.field6933 = true;
                this.method579(16);
            }
            this.method627(-20);
            this.method2947(10090);
        }
    }

    @OriginalMember(owner = "client!pga", name = "pa", descriptor = "()V", line = 3279)
    public final void method2200() {
        ++field6609;
        this.field6898 = false;
    }

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "(Z)V", line = 3292)
    private final void method2938(boolean arg0) {
        if (!arg0) {
            this.method2214();
        }
        ++field6776;
        this.method564(0, this.field6921, !arg0);
        this.method565(false, this.field6923);
        this.method580(0, 1, -127, class209.field2975);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3305)
    public final void method2211(Canvas arg0) {
        ++field6644;
        if (this.field6673 == arg0) {
            throw new RuntimeException();
        } else if (this.field6793.containsKey(arg0)) {
            this.method558(this.field6793.get(arg0), arg0, 119);
            this.field6793.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "(B)V", line = 3328)
    private final void method2939(byte arg0) {
        ++field6784;
        if (arg0 >= -17) {
            this.method2214();
        }
        this.method619(24);
        if (this.field6874 != null) {
            this.field6874.method1515(9370);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFFIFFF)Z", line = 3343)
    private final boolean method2940(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
        ++field6653;
        Buffer var8 = this.field6921.method1590((byte) 64, true);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2917(var8, false);
            if (arg3 != -9091) {
                this.field6830 = 84;
            }
            if (!Stream.method2541()) {
                var9.method2550(arg5);
                var9.method2550(arg0);
                var9.method2550(arg1);
                var9.method2550(arg2);
                var9.method2550(arg6);
                var9.method2550(arg4);
            } else {
                var9.method2552(arg5);
                var9.method2552(arg0);
                var9.method2552(arg1);
                var9.method2552(arg2);
                var9.method2552(arg6);
                var9.method2552(arg4);
            }
            var9.method2551();
            return this.field6921.method1592(arg3 ^ 6629);
        }
    }

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "(II)V", line = 3384)
    public static final void method2941(int arg0, int arg1) {
        if (arg0 == -1) {
            ++field6683;
            class501.field7010.method3204((byte) -73, arg1);
        }
    }

    @OriginalMember(owner = "client!pga", name = "Y", descriptor = "(I)V", line = 3399)
    private final void method2942(int arg0) {
        if (arg0 == 32768) {
            this.field6840 = false;
            ++field6705;
            if (this.field6874 != null) {
                this.field6874.method2282(3048);
            }
            this.method621((byte) -111);
        }
    }

    @OriginalMember(owner = "client!pga", name = "C", descriptor = "(Z)V", line = 3419)
    public final void method2148(boolean arg0) {
        ++field6647;
        this.field6876 = arg0;
        this.method575(false);
    }

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "()Luha;", line = 3428)
    public final class723 method2141() {
        ++field6676;
        return new class173();
    }

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "(I)V", line = 3440)
    public final void method2178(int arg0) {
        ++field6728;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)I", line = 3447)
    public final int method2105(int arg0, int arg1) {
        ++field6781;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IZ)V", line = 3457)
    public final void method2943(int arg0, boolean arg1) {
        if (arg0 == -20954) {
            ++field6616;
            if (arg1 == !this.field6856) {
                this.field6856 = arg1;
                this.method609((byte) -60);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[I[I)Laa;", line = 3474)
    public final class571 method2092(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6650;
        return class547.method3269(arg2, arg0, arg1, arg3, this, -18107);
    }

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "(Z)V", line = 3487)
    private final void method2944(boolean arg0) {
        if (this.field6874 != null) {
            this.field6874.method2284((byte) -45);
        }
        ++field6726;
        this.method615((byte) -128);
        if (arg0) {
            this.method2932(-1.3858925F, -36);
        }
    }

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "(II)V", line = 3509)
    public final void method2945(int arg0, int arg1) {
        if (arg1 == 22630) {
            if (this.field6843 != arg0) {
                class505 var3;
                boolean var4;
                boolean var5;
                if (arg0 == 1) {
                    var3 = class430.field5925;
                    var4 = true;
                    var5 = true;
                } else if (arg0 != 2) {
                    if (arg0 == 128) {
                        var3 = class471.field6466;
                        var5 = true;
                        var4 = true;
                    } else {
                        var5 = false;
                        var3 = class211.field2990;
                        var4 = false;
                    }
                } else {
                    var5 = true;
                    var3 = class97.field1413;
                    var4 = false;
                }
                if (!this.field6859 == var4) {
                    this.field6859 = var4;
                    this.method577(0);
                }
                if (var5 == !this.field6846) {
                    this.field6846 = var5;
                    this.method588(1);
                }
                if (this.field6887 != var3) {
                    this.field6887 = var3;
                    this.method603((byte) 71);
                }
                this.field6819 &= -29;
                this.field6843 = arg0;
            }
            ++field6612;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "([I)V", line = 3575)
    public final void method2127(int[] arg0) {
        arg0[0] = this.field6732;
        arg0[1] = this.field6730;
        ++field6651;
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "()Z", line = 3584)
    public final boolean method2140() {
        ++field6772;
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILqs;B)V", line = 3598)
    public final void method2946(int arg0, class605 arg1, byte arg2) {
        if (arg2 > 126) {
            ++field6678;
            this.method582(arg0, (byte) 23, false, arg1, false);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[Lkb;)V", line = 3609)
    public final void method2106(int arg0, class757[] arg1) {
        ++field6788;
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field6825[var3] = arg1[var3];
        }
        this.field6888 = arg0;
        if (this.field6883.method2981(-113)) {
            this.method599(3);
        }
    }

    @OriginalMember(owner = "client!pga", name = "JA", descriptor = "(IIIIII)I", line = 3628)
    public final int method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6791;
        int var7 = 0;
        float var8 = (float) arg2 * this.field6801.field2331 + (float) arg0 * this.field6801.field2332 + (float) arg1 * this.field6801.field2339 + this.field6801.field2328;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field6801.field2331 + (float) arg3 * this.field6801.field2332 + (float) arg4 * this.field6801.field2339 + this.field6801.field2328;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field6878 && (float) this.field6878 > var9) {
            var7 |= 16;
        } else if ((float) this.field6875 < var8 && (float) this.field6875 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field6801.field2370 + (float) arg0 * this.field6801.field2372 + (float) arg1 * this.field6801.field2352 + this.field6801.field2343) * (float) this.field6821 / var8);
        int var11 = (int) (((float) arg5 * this.field6801.field2370 + (float) arg3 * this.field6801.field2372 + (float) arg4 * this.field6801.field2352 + this.field6801.field2343) * (float) this.field6821 / var9);
        if (this.field6904 > (float) var10 && (float) var11 < this.field6904) {
            var7 |= 1;
        } else if (this.field6815 < (float) var10 && (float) var11 > this.field6815) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field6801.field2335 + (float) arg0 * this.field6801.field2378 + (float) arg1 * this.field6801.field2364 + this.field6801.field2340) * (float) this.field6882 / var8);
        int var13 = (int) (((float) arg5 * this.field6801.field2335 + (float) arg3 * this.field6801.field2378 + (float) arg4 * this.field6801.field2364 + this.field6801.field2340) * (float) this.field6882 / var9);
        if (this.field6908 > (float) var12 && (float) var13 < this.field6908) {
            var7 |= 4;
        } else if (this.field6897 < (float) var12 && this.field6897 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pga", name = "EA", descriptor = "(IIII)V", line = 3686)
    public final void method2186(int arg0, int arg1, int arg2, int arg3) {
        ++field6681;
        if (!this.field6898) {
            throw new RuntimeException("");
        } else {
            this.field6853 = arg3;
            this.field6828 = arg2;
            this.field6872 = arg1;
            this.field6873 = arg0;
            if (this.field6845) {
                this.field6906[3].method3062((byte) 126);
                this.field6906[3].method2284((byte) -45);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "bb", descriptor = "(I)V", line = 3709)
    private final void method2947(int arg0) {
        if (arg0 != 10090) {
            this.method2195(120, -27, 90, -64, (int[]) null);
        }
        this.field6904 = (float) (-this.field6829 + this.field6860);
        this.field6815 = (float) (-this.field6829 + this.field6849);
        ++field6618;
        this.field6908 = (float) (this.field6903 - this.field6905);
        this.field6897 = (float) (-this.field6905 + this.field6842);
    }

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "(B)V", line = 3725)
    private final void method2948(byte arg0) {
        if (arg0 != -80) {
            field6804 = -17;
        }
        ++field6671;
        this.field6848 = (float) this.field6875;
    }

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "()Z", line = 3738)
    public final boolean method2099() {
        ++field6646;
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "(II)V", line = 3746)
    public final void method2949(int arg0, int arg1) {
        if (this.field6838 != arg0) {
            this.field6838 = arg0;
            this.method604(0);
        }
        ++field6770;
        if (arg1 != 7544) {
            this.field6860 = -15;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 3763)
    public void method639(int arg0) {
        if (this.field6892 != null) {
            this.field6892.method4082(false);
        }
        ++field6714;
        this.field6811 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "(Z)I", line = 3774)
    public final int method2950(boolean arg0) {
        ++field6701;
        return !arg0 ? 32 : this.field6838;
    }

    @OriginalMember(owner = "client!pga", name = "KA", descriptor = "(IIII)V", line = 3785)
    public final void method2097(int arg0, int arg1, int arg2, int arg3) {
        ++field6663;
        if (~arg0 >= -1 && ~(this.field6732 + -1) >= ~arg2 && arg1 <= 0 && this.field6730 + -1 <= arg3) {
            this.method2198();
        } else {
            this.field6860 = arg0 < 0 ? 0 : arg0;
            this.field6849 = arg2 <= this.field6732 ? arg2 : 0;
            this.field6903 = arg1 < 0 ? 0 : arg1;
            this.field6842 = arg3 > this.field6732 ? 0 : arg3;
            if (!this.field6933) {
                this.field6933 = true;
                this.method579(16);
            }
            this.method627(116);
            this.method2947(10090);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZZZI)V", line = 3819)
    public final void method2951(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        ++field6757;
        if (!arg0) {
            this.field6934 = 62;
        }
        if (this.field6901 != arg3 || this.field6845 == !this.field6898) {
            class51 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field6898 ? 0 : 3;
            if (~arg3 > -1) {
                this.method2928(false);
            } else {
                var5 = this.field6892.method4078(true, arg3);
                class468 var10 = super.field7694.method91(arg3, -22805);
                if (~var10.field6388 == -1 && var10.field6390 == 0) {
                    this.method2928(false);
                } else {
                    int var11 = !var10.field6391 ? 128 : 64;
                    int var12 = var11 * 50;
                    class173 var13 = this.method2872((byte) -110);
                    var13.method1081((float) (this.field6811 % var12 * var10.field6390) / (float) var12, 0.0F, (float) (this.field6811 % var12 * var10.field6388) / (float) var12, 1);
                    this.method2925(class643.field9115, (byte) 125);
                }
                if (!this.field6898) {
                    var9 = var10.field6386;
                    var8 = var10.field6392;
                    var7 = var10.field6398;
                }
                var6 = var10.field6384;
            }
            this.method2889(-126, var7, var9, arg2, arg1, var8);
            if (this.field6874 == null) {
                this.method2933((byte) 120, var5);
                this.method2881(var6, -1);
            } else {
                this.field6874.method40(var6, -37, var5);
            }
            this.field6901 = arg3;
            this.field6845 = this.field6898;
        }
        this.field6819 &= -8;
    }

    @OriginalMember(owner = "client!pga", name = "aa", descriptor = "(IIIIII)V", line = 3887)
    public final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6622;
        this.method2874((byte) -89);
        this.method2912((byte) 9, arg4);
        this.method2946(0, class123.field1675, (byte) 127);
        this.method2923(-128, 0, class123.field1675);
        this.method2945(arg5, 22630);
        this.field6794.method1091((float) arg3, 1.0F, (float) arg2, 1);
        this.field6794.method851(arg0, arg1, 0);
        this.method2901((byte) 53);
        this.method607((byte) 67, false);
        this.method2879((byte) 3);
        this.method607((byte) 67, true);
        this.method2923(-122, 0, class186.field2725);
        this.method2946(0, class186.field2725, (byte) 127);
    }

    @OriginalMember(owner = "client!pga", name = "cb", descriptor = "(I)V", line = 3907)
    public final void method2952(int arg0) {
        if (this.field6819 != 16) {
            this.method2922((byte) -72);
            this.method2903((byte) 40, true);
            this.method2869(13, true);
            this.method2885(true, 114);
            this.method2945(1, 22630);
            this.field6819 = 16;
        }
        ++field6733;
        if (arg0 > -52) {
            this.method2898((byte) 60);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lkda;IIII)Lka;", line = 3927)
    public final class283 method2222(class64 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6692;
        return new class576(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "()Z", line = 3939)
    public final boolean method2214() {
        ++field6615;
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(I)V", line = 3947)
    public final void method2073(int arg0) {
        ++field6621;
        if (arg0 >= 128 && arg0 <= 1024) {
            if (this.field6892 != null) {
                this.field6892.method4083(0);
            }
            this.field6837 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIII)V", line = 3967)
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6774;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
    public abstract void method615(byte arg0);

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "(B)V")
    public abstract void method609(byte arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IBZLqs;Z)V")
    public abstract void method582(int arg0, byte arg1, boolean arg2, class605 arg3, boolean arg4);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)V")
    public abstract void method630(byte arg0, int arg1);

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "(B)V")
    public abstract void method633(byte arg0);

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "(I)V")
    public abstract void method627(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[[IIZ)Luia;")
    public abstract class273 method626(int arg0, int[][] arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lpf;B)V")
    public abstract void method592(class728 arg0, byte arg1);

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "(B)V")
    public abstract void method620(byte arg0);

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "(B)V")
    public abstract void method603(byte arg0);

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "(I)V")
    public abstract void method606(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILlk;Z)V")
    public abstract void method564(int arg0, class251 arg1, boolean arg2);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[Lot;)Ldha;")
    public abstract class732 method573(int arg0, class378[] arg1);

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "(I)F")
    public abstract float method586(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZLdha;)V")
    public abstract void method565(boolean arg0, class732 arg1);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lbfa;IIZILho;I)V")
    public abstract void method612(class574 arg0, int arg1, int arg2, boolean arg3, int arg4, class212 arg5, int arg6);

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "(I)V")
    public abstract void method588(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z[BILkea;II)Lco;")
    public abstract class722 method611(boolean arg0, byte[] arg1, int arg2, class77 arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "(I)V")
    public abstract void method579(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method571(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!pga", name = "B", descriptor = "(I)V")
    public abstract void method640(int arg0);

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(Z)V")
    public abstract void method575(boolean arg0);

    @OriginalMember(owner = "client!pga", name = "D", descriptor = "(I)V")
    public abstract void method583(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIZ[I)Loia;")
    public abstract class51 method601(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6);

    @OriginalMember(owner = "client!pga", name = "J", descriptor = "(I)V")
    public abstract void method637(int arg0);

    @OriginalMember(owner = "client!pga", name = "L", descriptor = "(I)V")
    public abstract void method576(int arg0);

    @OriginalMember(owner = "client!pga", name = "M", descriptor = "(I)V")
    public abstract void method577(int arg0);

    @OriginalMember(owner = "client!pga", name = "N", descriptor = "(I)V")
    public abstract void method604(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lkea;Lkf;B)Z")
    public abstract boolean method616(class77 arg0, class720 arg1, byte arg2);

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "(B)V")
    public abstract void method597(byte arg0);

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "(Z)V")
    public abstract void method602(boolean arg0);

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "(B)V")
    public abstract void method621(byte arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIILbfa;)V")
    public abstract void method580(int arg0, int arg1, int arg2, class574 arg3);

    @OriginalMember(owner = "client!pga", name = "V", descriptor = "(I)V")
    public abstract void method560(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZZ)Lho;")
    public abstract class212 method634(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method567(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(BZ)Llk;")
    public abstract class251 method638(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(BZ)V")
    public abstract void method607(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!pga", name = "W", descriptor = "(I)V")
    public abstract void method641(int arg0);

    @OriginalMember(owner = "client!pga", name = "Z", descriptor = "(I)V")
    public abstract void method619(int arg0);

    @OriginalMember(owner = "client!pga", name = "ab", descriptor = "(I)V")
    public abstract void method629(int arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[FIZILkea;I)Loia;")
    public abstract class51 method581(int arg0, int arg1, float[] arg2, int arg3, boolean arg4, int arg5, class77 arg6, int arg7);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLqs;ZI)V")
    public abstract void method624(byte arg0, class605 arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lkf;Lkea;I)Z")
    public abstract boolean method591(class720 arg0, class77 arg1, int arg2);

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "(B)V")
    public abstract void method623(byte arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method596(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method558(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ[BLkea;IZII)Loia;")
    public abstract class51 method618(int arg0, boolean arg1, byte[] arg2, class77 arg3, int arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "(B)V")
    public abstract void method562(byte arg0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IILkf;Lkea;I)Loia;")
    public abstract class51 method636(int arg0, int arg1, class720 arg2, class77 arg3, int arg4);
}
