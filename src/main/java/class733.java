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

@OriginalClass("client!ck")
public class class733 extends class570 {

    @OriginalMember(owner = "client!ck", name = "dc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field9677 = new Hashtable();

    @OriginalMember(owner = "client!ck", name = "we", descriptor = "I")
    public int field9800 = 128;

    @OriginalMember(owner = "client!ck", name = "ne", descriptor = "Lug;")
    private class65 field9791 = new class65();

    @OriginalMember(owner = "client!ck", name = "xe", descriptor = "Lno;")
    private class75 field9801 = new class75();

    @OriginalMember(owner = "client!ck", name = "ye", descriptor = "Lno;")
    public class75 field9802 = new class75();

    @OriginalMember(owner = "client!ck", name = "Ae", descriptor = "I")
    public int field9804 = 3;

    @OriginalMember(owner = "client!ck", name = "ze", descriptor = "Z")
    private boolean field9803 = false;

    @OriginalMember(owner = "client!ck", name = "Be", descriptor = "I")
    public int field9805 = 8;

    @OriginalMember(owner = "client!ck", name = "Fe", descriptor = "Lfca;")
    private class661 field9809 = new class661();

    @OriginalMember(owner = "client!ck", name = "Ge", descriptor = "[Ldk;")
    private class95[] field9810 = new class95[4];

    @OriginalMember(owner = "client!ck", name = "Je", descriptor = "I")
    private int field9813 = -1;

    @OriginalMember(owner = "client!ck", name = "He", descriptor = "I")
    private int field9811 = -1;

    @OriginalMember(owner = "client!ck", name = "Le", descriptor = "[Ldk;")
    private class95[] field9815 = new class95[4];

    @OriginalMember(owner = "client!ck", name = "Ie", descriptor = "I")
    private int field9812 = -1;

    @OriginalMember(owner = "client!ck", name = "Me", descriptor = "[Ldk;")
    private class95[] field9816 = new class95[4];

    @OriginalMember(owner = "client!ck", name = "Se", descriptor = "Lfca;")
    private class661 field9822;

    @OriginalMember(owner = "client!ck", name = "Ue", descriptor = "Lfca;")
    private class661 field9824;

    @OriginalMember(owner = "client!ck", name = "Ve", descriptor = "Lfca;")
    private class661 field9825;

    @OriginalMember(owner = "client!ck", name = "We", descriptor = "Lfca;")
    private class661 field9826;

    @OriginalMember(owner = "client!ck", name = "Xe", descriptor = "Lfca;")
    private class661 field9827;

    @OriginalMember(owner = "client!ck", name = "Ye", descriptor = "Lfca;")
    private class661 field9828;

    @OriginalMember(owner = "client!ck", name = "Ze", descriptor = "Lfca;")
    private class661 field9829;

    @OriginalMember(owner = "client!ck", name = "bf", descriptor = "Lno;")
    public class75 field9831;

    @OriginalMember(owner = "client!ck", name = "kf", descriptor = "Lno;")
    public class75 field9839;

    @OriginalMember(owner = "client!ck", name = "lf", descriptor = "Lno;")
    public class75 field9840;

    @OriginalMember(owner = "client!ck", name = "mf", descriptor = "I")
    private int field9841;

    @OriginalMember(owner = "client!ck", name = "nf", descriptor = "I")
    public int field9842;

    @OriginalMember(owner = "client!ck", name = "Cf", descriptor = "I")
    private int field9857;

    @OriginalMember(owner = "client!ck", name = "sf", descriptor = "I")
    public int field9847;

    @OriginalMember(owner = "client!ck", name = "xf", descriptor = "I")
    public int field9852;

    @OriginalMember(owner = "client!ck", name = "Tf", descriptor = "F")
    private float field9874;

    @OriginalMember(owner = "client!ck", name = "cg", descriptor = "F")
    private float field9883;

    @OriginalMember(owner = "client!ck", name = "Uf", descriptor = "F")
    private float field9875;

    @OriginalMember(owner = "client!ck", name = "Bf", descriptor = "I")
    public int field9856;

    @OriginalMember(owner = "client!ck", name = "Mf", descriptor = "I")
    public int field9867;

    @OriginalMember(owner = "client!ck", name = "bg", descriptor = "F")
    public float field9882;

    @OriginalMember(owner = "client!ck", name = "of", descriptor = "I")
    public int field9843;

    @OriginalMember(owner = "client!ck", name = "wg", descriptor = "[F")
    public float[] field9903;

    @OriginalMember(owner = "client!ck", name = "ug", descriptor = "F")
    public float field9901;

    @OriginalMember(owner = "client!ck", name = "Og", descriptor = "F")
    public float field9921;

    @OriginalMember(owner = "client!ck", name = "Sg", descriptor = "F")
    public float field9925;

    @OriginalMember(owner = "client!ck", name = "Jg", descriptor = "I")
    private int field9916;

    @OriginalMember(owner = "client!ck", name = "Ff", descriptor = "I")
    public int field9860;

    @OriginalMember(owner = "client!ck", name = "Pg", descriptor = "I")
    private int field9922;

    @OriginalMember(owner = "client!ck", name = "mg", descriptor = "F")
    private float field9893;

    @OriginalMember(owner = "client!ck", name = "Wg", descriptor = "F")
    public float field9929;

    @OriginalMember(owner = "client!ck", name = "Rf", descriptor = "I")
    private int field9872;

    @OriginalMember(owner = "client!ck", name = "pf", descriptor = "I")
    public int field9844;

    @OriginalMember(owner = "client!ck", name = "Dg", descriptor = "[F")
    private float[] field9910;

    @OriginalMember(owner = "client!ck", name = "Of", descriptor = "I")
    private int field9869;

    @OriginalMember(owner = "client!ck", name = "hg", descriptor = "[F")
    private float[] field9888;

    @OriginalMember(owner = "client!ck", name = "Kg", descriptor = "[F")
    private float[] field9917;

    @OriginalMember(owner = "client!ck", name = "Rg", descriptor = "F")
    public float field9924;

    @OriginalMember(owner = "client!ck", name = "tf", descriptor = "I")
    public int field9848;

    @OriginalMember(owner = "client!ck", name = "kh", descriptor = "I")
    public int field9943;

    @OriginalMember(owner = "client!ck", name = "sg", descriptor = "F")
    public float field9899;

    @OriginalMember(owner = "client!ck", name = "Xf", descriptor = "[Lgu;")
    private class757[] field9878;

    @OriginalMember(owner = "client!ck", name = "qh", descriptor = "[F")
    private float[] field9949;

    @OriginalMember(owner = "client!ck", name = "yg", descriptor = "I")
    public int field9905;

    @OriginalMember(owner = "client!ck", name = "zg", descriptor = "I")
    private int field9906;

    @OriginalMember(owner = "client!ck", name = "bh", descriptor = "F")
    private float field9934;

    @OriginalMember(owner = "client!ck", name = "Mg", descriptor = "Z")
    private boolean field9919;

    @OriginalMember(owner = "client!ck", name = "mh", descriptor = "Z")
    private boolean field9945;

    @OriginalMember(owner = "client!ck", name = "lg", descriptor = "I")
    private int field9892;

    @OriginalMember(owner = "client!ck", name = "sh", descriptor = "I")
    private int field9951;

    @OriginalMember(owner = "client!ck", name = "ih", descriptor = "I")
    private int field9941;

    @OriginalMember(owner = "client!ck", name = "Vg", descriptor = "Lqca;")
    public class333 field9928;

    @OriginalMember(owner = "client!ck", name = "wh", descriptor = "[I")
    public int[] field9955;

    @OriginalMember(owner = "client!ck", name = "th", descriptor = "[I")
    public int[] field9952;

    @OriginalMember(owner = "client!ck", name = "vh", descriptor = "[I")
    public int[] field9954;

    @OriginalMember(owner = "client!ck", name = "yh", descriptor = "[B")
    public byte[] field9957;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9606;

    @OriginalMember(owner = "client!ck", name = "md", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9738;

    @OriginalMember(owner = "client!ck", name = "qe", descriptor = "I")
    public int field9794;

    @OriginalMember(owner = "client!ck", name = "wc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field9696;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "J")
    private long field9611;

    @OriginalMember(owner = "client!ck", name = "Gb", descriptor = "J")
    private long field9654;

    @OriginalMember(owner = "client!ck", name = "Kf", descriptor = "Z")
    public boolean field9865;

    @OriginalMember(owner = "client!ck", name = "gg", descriptor = "I")
    public int field9887;

    @OriginalMember(owner = "client!ck", name = "zf", descriptor = "Ljava/lang/String;")
    private String field9854;

    @OriginalMember(owner = "client!ck", name = "ig", descriptor = "Z")
    public boolean field9889;

    @OriginalMember(owner = "client!ck", name = "Fg", descriptor = "Z")
    public boolean field9912;

    @OriginalMember(owner = "client!ck", name = "Gg", descriptor = "Z")
    private boolean field9913;

    @OriginalMember(owner = "client!ck", name = "Vf", descriptor = "Z")
    public boolean field9876;

    @OriginalMember(owner = "client!ck", name = "Bg", descriptor = "Z")
    private boolean field9908;

    @OriginalMember(owner = "client!ck", name = "tg", descriptor = "Z")
    public boolean field9900;

    @OriginalMember(owner = "client!ck", name = "nh", descriptor = "Ljava/lang/String;")
    private String field9946;

    @OriginalMember(owner = "client!ck", name = "Zf", descriptor = "Z")
    public boolean field9880;

    @OriginalMember(owner = "client!ck", name = "xg", descriptor = "Z")
    private boolean field9904;

    @OriginalMember(owner = "client!ck", name = "re", descriptor = "Lpja;")
    private class149 field9795;

    @OriginalMember(owner = "client!ck", name = "Ee", descriptor = "Lfaa;")
    public class34 field9808;

    @OriginalMember(owner = "client!ck", name = "pe", descriptor = "Lkea;")
    private class82 field9793;

    @OriginalMember(owner = "client!ck", name = "ve", descriptor = "Ljs;")
    private class182 field9799;

    @OriginalMember(owner = "client!ck", name = "te", descriptor = "Lts;")
    private class231 field9797;

    @OriginalMember(owner = "client!ck", name = "kc", descriptor = "D")
    public static double field9684;

    @OriginalMember(owner = "client!ck", name = "qf", descriptor = "F")
    public float field9845;

    @OriginalMember(owner = "client!ck", name = "Pf", descriptor = "F")
    public float field9870;

    @OriginalMember(owner = "client!ck", name = "Yf", descriptor = "F")
    private float field9879;

    @OriginalMember(owner = "client!ck", name = "ag", descriptor = "F")
    private float field9881;

    @OriginalMember(owner = "client!ck", name = "fg", descriptor = "F")
    public float field9886;

    @OriginalMember(owner = "client!ck", name = "Tg", descriptor = "F")
    private float field9926;

    @OriginalMember(owner = "client!ck", name = "eh", descriptor = "F")
    public float field9937;

    @OriginalMember(owner = "client!ck", name = "fh", descriptor = "F")
    public float field9938;

    @OriginalMember(owner = "client!ck", name = "hh", descriptor = "F")
    public float field9940;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field9594;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    private int field9616;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    public static int field9624;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!ck", name = "hb", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!ck", name = "ib", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!ck", name = "jb", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!ck", name = "kb", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!ck", name = "lb", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!ck", name = "mb", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!ck", name = "nb", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!ck", name = "ob", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!ck", name = "pb", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!ck", name = "qb", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!ck", name = "rb", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!ck", name = "sb", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!ck", name = "tb", descriptor = "I")
    private int field9641;

    @OriginalMember(owner = "client!ck", name = "ub", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!ck", name = "vb", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!ck", name = "wb", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!ck", name = "xb", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!ck", name = "yb", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!ck", name = "zb", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!ck", name = "Ab", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!ck", name = "Bb", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!ck", name = "Cb", descriptor = "I")
    public int field9650;

    @OriginalMember(owner = "client!ck", name = "Db", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!ck", name = "Eb", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!ck", name = "Fb", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!ck", name = "Hb", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!ck", name = "Ib", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!ck", name = "Jb", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!ck", name = "Kb", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!ck", name = "Lb", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!ck", name = "Mb", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!ck", name = "Nb", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!ck", name = "Ob", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!ck", name = "Pb", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!ck", name = "Qb", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!ck", name = "Rb", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!ck", name = "Sb", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!ck", name = "Tb", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!ck", name = "Ub", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!ck", name = "Vb", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!ck", name = "Wb", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!ck", name = "Xb", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!ck", name = "Yb", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!ck", name = "Zb", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!ck", name = "ac", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!ck", name = "bc", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!ck", name = "cc", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!ck", name = "ec", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!ck", name = "fc", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!ck", name = "gc", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!ck", name = "hc", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!ck", name = "ic", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!ck", name = "jc", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!ck", name = "lc", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!ck", name = "mc", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!ck", name = "nc", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!ck", name = "oc", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!ck", name = "pc", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!ck", name = "qc", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!ck", name = "rc", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!ck", name = "sc", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!ck", name = "tc", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!ck", name = "uc", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!ck", name = "vc", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!ck", name = "xc", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!ck", name = "yc", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!ck", name = "zc", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!ck", name = "Ac", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!ck", name = "Bc", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!ck", name = "Cc", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!ck", name = "Dc", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!ck", name = "Ec", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!ck", name = "Fc", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!ck", name = "Gc", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!ck", name = "Hc", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!ck", name = "Ic", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!ck", name = "Jc", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!ck", name = "Kc", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!ck", name = "Lc", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!ck", name = "Mc", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!ck", name = "Nc", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!ck", name = "Oc", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!ck", name = "Pc", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!ck", name = "Qc", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!ck", name = "Rc", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!ck", name = "Sc", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!ck", name = "Tc", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!ck", name = "Uc", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!ck", name = "Vc", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!ck", name = "Wc", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!ck", name = "Xc", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!ck", name = "Yc", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!ck", name = "Zc", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!ck", name = "ad", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!ck", name = "bd", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!ck", name = "cd", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!ck", name = "dd", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!ck", name = "ed", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!ck", name = "fd", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!ck", name = "gd", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!ck", name = "hd", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!ck", name = "id", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!ck", name = "jd", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!ck", name = "kd", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!ck", name = "ld", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!ck", name = "nd", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!ck", name = "od", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!ck", name = "pd", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!ck", name = "qd", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!ck", name = "rd", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!ck", name = "sd", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!ck", name = "td", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!ck", name = "ud", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!ck", name = "vd", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!ck", name = "wd", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!ck", name = "xd", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!ck", name = "yd", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!ck", name = "zd", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!ck", name = "Ad", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!ck", name = "Bd", descriptor = "I")
    public static int field9753;

    @OriginalMember(owner = "client!ck", name = "Cd", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!ck", name = "Dd", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!ck", name = "Ed", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!ck", name = "Fd", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!ck", name = "Gd", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!ck", name = "Hd", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!ck", name = "Id", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!ck", name = "Jd", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!ck", name = "Kd", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!ck", name = "Ld", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!ck", name = "Md", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!ck", name = "Nd", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!ck", name = "Od", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!ck", name = "Pd", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!ck", name = "Qd", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!ck", name = "Rd", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!ck", name = "Sd", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!ck", name = "Td", descriptor = "I")
    public static int field9771;

    @OriginalMember(owner = "client!ck", name = "Ud", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!ck", name = "Vd", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!ck", name = "Wd", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!ck", name = "Xd", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!ck", name = "Yd", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!ck", name = "Zd", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!ck", name = "ae", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!ck", name = "be", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!ck", name = "ce", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!ck", name = "de", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!ck", name = "ee", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!ck", name = "fe", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ck", name = "ge", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!ck", name = "he", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!ck", name = "ie", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!ck", name = "je", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!ck", name = "ke", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!ck", name = "le", descriptor = "I")
    public int field9789;

    @OriginalMember(owner = "client!ck", name = "me", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!ck", name = "oe", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!ck", name = "se", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!ck", name = "ue", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!ck", name = "De", descriptor = "I")
    public int field9807;

    @OriginalMember(owner = "client!ck", name = "Qe", descriptor = "I")
    public int field9820;

    @OriginalMember(owner = "client!ck", name = "Re", descriptor = "I")
    private int field9821;

    @OriginalMember(owner = "client!ck", name = "Te", descriptor = "I")
    public int field9823;

    @OriginalMember(owner = "client!ck", name = "df", descriptor = "I")
    private int field9833;

    @OriginalMember(owner = "client!ck", name = "gf", descriptor = "I")
    private int field9836;

    @OriginalMember(owner = "client!ck", name = "hf", descriptor = "I")
    private int field9837;

    @OriginalMember(owner = "client!ck", name = "rf", descriptor = "I")
    public int field9846;

    @OriginalMember(owner = "client!ck", name = "Ef", descriptor = "I")
    public int field9859;

    @OriginalMember(owner = "client!ck", name = "Gf", descriptor = "I")
    private int field9861;

    @OriginalMember(owner = "client!ck", name = "eg", descriptor = "I")
    private int field9885;

    @OriginalMember(owner = "client!ck", name = "ng", descriptor = "I")
    private int field9894;

    @OriginalMember(owner = "client!ck", name = "pg", descriptor = "I")
    private int field9896;

    @OriginalMember(owner = "client!ck", name = "Eg", descriptor = "I")
    private int field9911;

    @OriginalMember(owner = "client!ck", name = "Qg", descriptor = "I")
    private int field9923;

    @OriginalMember(owner = "client!ck", name = "ah", descriptor = "I")
    public int field9933;

    @OriginalMember(owner = "client!ck", name = "ch", descriptor = "I")
    public int field9935;

    @OriginalMember(owner = "client!ck", name = "dh", descriptor = "I")
    private int field9936;

    @OriginalMember(owner = "client!ck", name = "oh", descriptor = "I")
    private int field9947;

    @OriginalMember(owner = "client!ck", name = "uh", descriptor = "I")
    private int field9953;

    @OriginalMember(owner = "client!ck", name = "xh", descriptor = "I")
    private int field9956;

    @OriginalMember(owner = "client!ck", name = "jf", descriptor = "J")
    private long field9838;

    @OriginalMember(owner = "client!ck", name = "rh", descriptor = "Lpm;")
    private class250 field9950;

    @OriginalMember(owner = "client!ck", name = "Wf", descriptor = "Ldea;")
    public class375 field9877;

    @OriginalMember(owner = "client!ck", name = "jg", descriptor = "Ldea;")
    public class375 field9890;

    @OriginalMember(owner = "client!ck", name = "Ne", descriptor = "Lvd;")
    private class39 field9817;

    @OriginalMember(owner = "client!ck", name = "jh", descriptor = "Lvd;")
    public class39 field9942;

    @OriginalMember(owner = "client!ck", name = "Qf", descriptor = "Lnk;")
    private class447 field9871;

    @OriginalMember(owner = "client!ck", name = "Ug", descriptor = "Lnk;")
    private class447 field9927;

    @OriginalMember(owner = "client!ck", name = "lh", descriptor = "Lgha;")
    public class520 field9944;

    @OriginalMember(owner = "client!ck", name = "Ig", descriptor = "Lrc;")
    private class59 field9915;

    @OriginalMember(owner = "client!ck", name = "Pe", descriptor = "Lca;")
    private class634 field9819;

    @OriginalMember(owner = "client!ck", name = "yf", descriptor = "Lto;")
    public class745 field9853;

    @OriginalMember(owner = "client!ck", name = "Af", descriptor = "Lto;")
    public class745 field9855;

    @OriginalMember(owner = "client!ck", name = "Df", descriptor = "Lto;")
    public class745 field9858;

    @OriginalMember(owner = "client!ck", name = "If", descriptor = "Lto;")
    public class745 field9863;

    @OriginalMember(owner = "client!ck", name = "Lf", descriptor = "Lto;")
    public class745 field9866;

    @OriginalMember(owner = "client!ck", name = "Nf", descriptor = "Lto;")
    public class745 field9868;

    @OriginalMember(owner = "client!ck", name = "vg", descriptor = "Lto;")
    public class745 field9902;

    @OriginalMember(owner = "client!ck", name = "Lg", descriptor = "Lto;")
    public class745 field9918;

    @OriginalMember(owner = "client!ck", name = "Ng", descriptor = "Lto;")
    public class745 field9920;

    @OriginalMember(owner = "client!ck", name = "Zg", descriptor = "Lto;")
    public class745 field9932;

    @OriginalMember(owner = "client!ck", name = "Jf", descriptor = "Lgaa;")
    private class76 field9864;

    @OriginalMember(owner = "client!ck", name = "Ke", descriptor = "Ldk;")
    private class95 field9814;

    @OriginalMember(owner = "client!ck", name = "Oe", descriptor = "Ldk;")
    private class95 field9818;

    @OriginalMember(owner = "client!ck", name = "Ce", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9806;

    @OriginalMember(owner = "client!ck", name = "af", descriptor = "Z")
    private boolean field9830;

    @OriginalMember(owner = "client!ck", name = "cf", descriptor = "Z")
    private boolean field9832;

    @OriginalMember(owner = "client!ck", name = "ef", descriptor = "Z")
    private boolean field9834;

    @OriginalMember(owner = "client!ck", name = "ff", descriptor = "Z")
    private boolean field9835;

    @OriginalMember(owner = "client!ck", name = "uf", descriptor = "Z")
    public boolean field9849;

    @OriginalMember(owner = "client!ck", name = "vf", descriptor = "Z")
    private boolean field9850;

    @OriginalMember(owner = "client!ck", name = "wf", descriptor = "Z")
    public boolean field9851;

    @OriginalMember(owner = "client!ck", name = "Hf", descriptor = "Z")
    private boolean field9862;

    @OriginalMember(owner = "client!ck", name = "Sf", descriptor = "Z")
    private boolean field9873;

    @OriginalMember(owner = "client!ck", name = "dg", descriptor = "Z")
    public boolean field9884;

    @OriginalMember(owner = "client!ck", name = "kg", descriptor = "Z")
    public boolean field9891;

    @OriginalMember(owner = "client!ck", name = "og", descriptor = "Z")
    private boolean field9895;

    @OriginalMember(owner = "client!ck", name = "qg", descriptor = "Z")
    public boolean field9897;

    @OriginalMember(owner = "client!ck", name = "rg", descriptor = "Z")
    private boolean field9898;

    @OriginalMember(owner = "client!ck", name = "Ag", descriptor = "Z")
    public boolean field9907;

    @OriginalMember(owner = "client!ck", name = "Cg", descriptor = "Z")
    public boolean field9909;

    @OriginalMember(owner = "client!ck", name = "Hg", descriptor = "Z")
    private boolean field9914;

    @OriginalMember(owner = "client!ck", name = "Yg", descriptor = "Z")
    public boolean field9931;

    @OriginalMember(owner = "client!ck", name = "gh", descriptor = "Z")
    public boolean field9939;

    @OriginalMember(owner = "client!ck", name = "ph", descriptor = "Z")
    private boolean field9948;

    @OriginalMember(owner = "client!ck", name = "Xg", descriptor = "[Lwj;")
    private class128[] field9930;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
    private final void method3908(int arg0) {
        if (arg0 != 25921) {
            this.field9841 = -32;
        }
        ++field9633;
        int var2 = 0;
        while (!this.field9696.method3175()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class591.method3181(1000L, arg0 + -25921);
        }
    }

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "(I)V")
    public final void method3909(int arg0) {
        ++field9682;
        if (this.field9837 != 16) {
            this.method3936(48);
            this.method3923(-32, true);
            this.method3978(true, (byte) 127);
            this.method3986((byte) -124, true);
            this.method3920(1, 9770);
            this.field9837 = 16;
        }
        int var2 = 115 / ((64 - arg0) / 42);
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(II)V")
    public final synchronized void method3910(int arg0, int arg1) {
        ++field9600;
        class337 var3 = new class337();
        var3.field4108 = (long) arg0;
        if (arg1 > -96) {
            this.method1001(-111, 114);
        }
        this.field9828.method3593(var3, 15);
    }

    @OriginalMember(owner = "client!ck", name = "pa", descriptor = "()V")
    public final void method918() {
        ++field9694;
        this.field9939 = false;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZ)Lpu;")
    public final class772 method990(int arg0, int arg1, boolean arg2) {
        ++field9757;
        return new class634(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Llq;)V")
    public static final void method3911(class210 arg0) {
        if (arg0 != null) {
            for (int var1 = 0; var1 < 2; ++var1) {
                class210 var2 = null;
                for (class210 var3 = class177.field2327[var1]; var3 != null; var3 = var3.field2890) {
                    if (arg0 == var3) {
                        if (var2 != null) {
                            var2.field2890 = var3.field2890;
                        } else {
                            class177.field2327[var1] = var3.field2890;
                        }
                        class689.field8852 = true;
                        return;
                    }
                    var2 = var3;
                }
                class210 var4 = null;
                for (class210 var5 = class336.field4089[var1]; var5 != null; var5 = var5.field2890) {
                    if (arg0 == var5) {
                        if (var4 != null) {
                            var4.field2890 = var5.field2890;
                        } else {
                            class336.field4089[var1] = var5.field2890;
                        }
                        class689.field8852 = true;
                        return;
                    }
                    var4 = var5;
                }
                class210 var6 = null;
                for (class210 var7 = class640.field8187[var1]; var7 != null; var7 = var7.field2890) {
                    if (arg0 == var7) {
                        if (var6 != null) {
                            var6.field2890 = var7.field2890;
                        } else {
                            class640.field8187[var1] = var7.field2890;
                        }
                        class689.field8852 = true;
                        return;
                    }
                    var6 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([BZIII)Lnk;")
    public final class447 method3912(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field9597;
        if (arg4 != 1365) {
            this.method3960(false, -126, -32);
        }
        return (class447) (!this.field9913 || arg1 && !this.field9908 ? new class515(this, arg3, arg0, arg2) : new class650(this, arg3, arg0, arg2, arg1));
    }

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "(I)V")
    private final void method3913(int arg0) {
        ++field9720;
        if (arg0 != 256) {
            this.field9616 = -27;
        }
        float[] var2 = this.field9888;
        float var3 = (float) (-this.field9867 * this.field9860) / (float) this.field9847;
        float var4 = (float) ((-this.field9867 + this.field9650) * this.field9860) / (float) this.field9847;
        float var5 = (float) (this.field9943 * this.field9860) / (float) this.field9844;
        float var6 = (float) ((-this.field9789 + this.field9943) * this.field9860) / (float) this.field9844;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field9860 * 2.0F;
            var2[7] = 0.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[15] = 0.0F;
            var2[1] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[2] = 0.0F;
            var2[3] = 0.0F;
            var2[14] = this.field9926 = -((float) this.field9906 * var7) / (float) (this.field9906 - this.field9860);
            var2[11] = -1.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[5] = var7 / (var5 - var6);
            var2[10] = this.field9879 = (float) (-(this.field9906 + this.field9860)) / (float) (this.field9906 - this.field9860);
            var2[0] = var7 / (var4 - var3);
            var2[12] = 0.0F;
            var2[4] = 0.0F;
        } else {
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = 1.0F;
            var2[1] = 0.0F;
            var2[14] = 0.0F;
            var2[4] = 0.0F;
            var2[9] = 0.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[8] = 0.0F;
            var2[15] = 1.0F;
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[0] = 1.0F;
            var2[10] = 1.0F;
            var2[11] = 0.0F;
        }
        this.method3925(10);
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "()Loha;")
    public final class465 method880() {
        ++field9686;
        return this.field9831;
    }

    @OriginalMember(owner = "client!ck", name = "EA", descriptor = "(IIII)V")
    public final void method971(int arg0, int arg1, int arg2, int arg3) {
        ++field9796;
        if (!this.field9939) {
            throw new RuntimeException("");
        } else {
            this.field9856 = arg1;
            this.field9933 = arg0;
            this.field9843 = arg3;
            this.field9852 = arg2;
            if (this.field9945) {
                this.field9797.field3110.method553(true);
                this.field9797.field3110.method555(true);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public final void method3914(byte arg0) {
        ++field9646;
        if (~this.field9837 != -3) {
            this.method3983(25340);
            this.method3923(-32, false);
            this.method3974(false, 5);
            this.method3978(false, (byte) 126);
            this.method3986((byte) -124, false);
            this.method3935(-2, (byte) -42);
            this.field9837 = 2;
        }
        if (arg0 >= -63) {
            this.field9803 = true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Loha;)V")
    public final void method991(class465 arg0) {
        this.field9831.method468(arg0);
        ++field9596;
        this.field9839.method468(this.field9831);
        this.field9839.method464(2);
        this.field9840.method451(10, this.field9839);
        if (~this.field9894 != -2) {
            this.method3969(true);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method3971(-20110);
        ++field9630;
        this.method3920(arg12, 9770);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(FFBF)V")
    private final void method3915(float arg0, float arg1, byte arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field9673;
        if (this.field9898) {
            OpenGL.glLoadIdentity();
        }
        if (arg2 >= 99) {
            OpenGL.glTranslatef(arg1, arg0, arg3);
            OpenGL.glMatrixMode(5888);
            this.field9898 = true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)I")
    public final int method3916(int arg0, boolean arg1) {
        ++field9752;
        if (arg0 != 5121 && arg0 != 5120) {
            if (!arg1) {
                return 27;
            } else if (~arg0 != -5124 && ~arg0 != -5123) {
                if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "(I)V")
    public final void method982(int arg0) {
        ++field9700;
        this.method3931((byte) 111);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)I")
    public final int method941(int arg0, int arg1) {
        ++field9782;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lvi;Z)Lpu;")
    public final class772 method977(class388 arg0, boolean arg1) {
        ++field9719;
        int[] var3 = new int[arg0.field4950 * arg0.field4946];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4947 != null) {
            for (int var6 = 0; ~arg0.field4946 < ~var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field4950; ++var7) {
                    var3[var5++] = class77.method473(arg0.field4951[class249.method1625(255, arg0.field4949[var4])], arg0.field4947[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~var8 > ~arg0.field4946; ++var8) {
                for (int var10 = 0; arg0.field4950 > var10; ++var10) {
                    int var11 = arg0.field4951[255 & arg0.field4949[var4++]];
                    var3[var5++] = ~var11 != -1 ? class77.method473(-16777216, var11) : 0;
                }
            }
        }
        class772 var9 = this.method3078((byte) 71, arg0.field4946, arg0.field4950, var3, 0, arg0.field4950);
        var9.method626(arg0.field4948, arg0.field4945, arg0.field4953, arg0.field4952);
        return var9;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII)Ltea;")
    public final class589 method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9698;
        return this.field9907 ? new class154(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public final void method3917(int arg0, int arg1, int arg2) {
        ++field9668;
        if (this.field9911 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (this.field9841 != arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var4 = true;
                this.field9841 = arg1;
            }
            if (this.field9916 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                var4 = true;
                this.field9916 = arg2;
            }
            if (var4) {
                this.field9837 &= -30;
            }
        }
        if (arg0 <= 0) {
            this.method3976(5);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILdk;)V")
    public final void method3918(int arg0, class95 arg1) {
        ++field9771;
        if (this.field9851) {
            this.method3962(true, arg1);
            this.method3964((byte) 95, arg1);
        } else {
            if (~this.field9812 > -1 || this.field9815[this.field9812] != arg1) {
                throw new RuntimeException();
            }
            this.field9815[this.field9812--] = null;
            arg1.method242(13352);
            if (this.field9812 >= 0) {
                this.field9818 = this.field9814 = this.field9815[this.field9812];
                this.field9818.method241(-4114);
            } else {
                this.field9818 = this.field9814 = null;
            }
        }
        if (arg0 != 4609) {
            this.method976(-122, -38);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[I[I)Laa;")
    public final class596 method947(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field9695;
        return class327.method1905(arg2, arg1, this, -126, arg0, arg3);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)Lod;")
    public final class539 method1001(int arg0, int arg1) {
        ++field9706;
        return null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILpm;)V")
    public final void method3919(int arg0, class250 arg1) {
        if (arg0 > -58) {
            this.field9877 = null;
        }
        ++field9731;
        if (this.field9950 != arg1) {
            if (this.field9913) {
                OpenGL.glBindBufferARB(34963, arg1.method1631((byte) -112));
            }
            this.field9950 = arg1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(II)V")
    public final void method3920(int arg0, int arg1) {
        if (~this.field9836 != ~arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg0 == 1) {
                var3 = 1;
                var4 = true;
                var5 = true;
            } else if (arg0 != 2) {
                if (arg0 != 128) {
                    var5 = true;
                    var4 = false;
                    var3 = 0;
                } else {
                    var4 = true;
                    var5 = true;
                    var3 = 3;
                }
            } else {
                var5 = true;
                var3 = 2;
                var4 = false;
            }
            if (!this.field9834 == var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field9834 = var5;
            }
            if (var4 == !this.field9832) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field9832 = var4;
            }
            if (~this.field9833 != ~var3) {
                if (~var3 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var3 != 2) {
                    if (var3 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field9833 = var3;
            }
            this.field9837 &= -29;
            this.field9836 = arg0;
        }
        if (arg1 == 9770) {
            ++field9687;
        }
    }

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "()Z")
    public final boolean method914() {
        ++field9610;
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method881(Canvas arg0, int arg1, int arg2) {
        ++field9643;
        long var4 = 0L;
        if (arg0 != null && this.field9606 != arg0) {
            if (this.field9677.containsKey(arg0)) {
                Long var6 = (Long) this.field9677.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field9611;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field9696.surfaceResized(var4);
            if (this.field9738 == arg0) {
                this.method3989(4);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(II)V")
    public final void method3921(int arg0, int arg1) {
        class570.field7210[0] = (float) class249.method1625(16711680, arg0) / 1.671168E7F;
        class570.field7210[2] = (float) class249.method1625(255, arg0) / 255.0F;
        class570.field7210[3] = (float) (arg0 >>> 24) / 255.0F;
        class570.field7210[1] = (float) class249.method1625(65280, arg0) / 65280.0F;
        if (arg1 != 7077) {
            this.method968(122, 111, 73, 70);
        }
        ++field9697;
        OpenGL.glTexEnvfv(8960, 8705, class570.field7210, 0);
    }

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "(II)V")
    public final void method988(int arg0, int arg1) {
        ++field9739;
    }

    @OriginalMember(owner = "client!ck", name = "xa", descriptor = "(F)V")
    public final void method946(float arg0) {
        if (this.field9870 != arg0) {
            this.field9870 = arg0;
            this.method3976(-16);
        }
        ++field9761;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(IIIIII)V")
    public final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3971(-20110);
        ++field9683;
        this.method3920(arg5, 9770);
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

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lmd;)V")
    public final void method905(class649 arg0) {
        ++field9637;
    }

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "(ILaa;II)V")
    public final void method940(int arg0, class596 arg1, int arg2, int arg3) {
        ++field9709;
        class787 var5 = (class787) arg1;
        class59 var6 = var5.field10781;
        this.method3914((byte) -118);
        this.method3975((byte) 122, var5.field10781);
        this.method3920(1, 9770);
        this.method3917(115, 7681, 8448);
        this.method3954(0, 768, 34167, (byte) 103);
        float var7 = var6.field772 / (float) var6.field770;
        float var8 = var6.field768 / (float) var6.field771;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9951) * var7, (float) (-arg3 + this.field9869) * var8);
        OpenGL.glVertex2i(this.field9951, this.field9869);
        OpenGL.glTexCoord2f((float) (this.field9951 - arg2) * var7, (float) (-arg3 + this.field9857) * var8);
        OpenGL.glVertex2i(this.field9951, this.field9857);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9922) * var7, (float) (this.field9857 - arg3) * var8);
        OpenGL.glVertex2i(this.field9922, this.field9857);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9922) * var7, (float) (-arg3 + this.field9869) * var8);
        OpenGL.glVertex2i(this.field9922, this.field9869);
        OpenGL.glEnd();
        this.method3954(0, 768, 5890, (byte) 110);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIII)V")
    public final void method3922(int arg0, int arg1, int arg2, int arg3) {
        ++field9618;
        if (arg1 != 1) {
            this.field9895 = true;
        }
        OpenGL.glTexEnvi(8960, arg0 + 34184, arg3);
        OpenGL.glTexEnvi(8960, 34200 - -arg0, arg2);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class733(Canvas arg0, class284 arg1, int arg2) {
        super(arg1);
        new class719();
        new class467(16);
        this.field9822 = new class661();
        this.field9824 = new class661();
        this.field9825 = new class661();
        this.field9826 = new class661();
        this.field9827 = new class661();
        this.field9828 = new class661();
        this.field9829 = new class661();
        this.field9831 = new class75();
        this.field9839 = new class75();
        this.field9840 = new class75();
        this.field9841 = 8448;
        this.field9842 = -1;
        this.field9857 = 0;
        this.field9847 = 512;
        this.field9852 = -1;
        this.field9874 = 0.0F;
        this.field9883 = 1.0F;
        this.field9875 = -1.0F;
        this.field9856 = -1;
        this.field9867 = 0;
        this.field9882 = 3584.0F;
        this.field9843 = 0;
        this.field9903 = new float[4];
        this.field9901 = 1.0F;
        this.field9921 = 1.0F;
        this.field9925 = -1.0F;
        this.field9916 = 8448;
        this.field9860 = 50;
        this.field9922 = 0;
        this.field9893 = 1.0F;
        this.field9929 = -1.0F;
        this.field9872 = 0;
        this.field9844 = 512;
        this.field9910 = new float[4];
        this.field9869 = 0;
        this.field9888 = new float[16];
        this.field9917 = new float[4];
        this.field9924 = 3584.0F;
        this.field9848 = -1;
        this.field9943 = 0;
        this.field9899 = 1.0F;
        this.field9878 = new class757[class490.field6298];
        this.field9949 = new float[4];
        this.field9905 = 0;
        this.field9906 = 3584;
        this.field9934 = -1.0F;
        this.field9919 = true;
        this.field9945 = false;
        this.field9892 = 0;
        this.field9951 = 0;
        this.field9941 = -1;
        this.field9928 = new class333(8192);
        this.field9955 = new int[1];
        this.field9952 = new int[1];
        this.field9954 = new int[1];
        this.field9957 = new byte[16384];
        this.field9738 = this.field9606 = arg0;
        this.field9794 = arg2;
        if (!class382.method2194("jaclib", 31749)) {
            throw new RuntimeException("");
        } else if (!class382.method2194("jaggl", 31749)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field9696 = new OpenGL();
                this.field9654 = this.field9611 = this.field9696.init(arg0, 8, 8, 8, 24, 0, this.field9794);
                if (~this.field9611 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method3908(25921);
                    int var4 = this.method3930((byte) -66);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field9887 = this.field9865 ? 33639 : 5121;
                        if (this.field9854.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class340.method1966(1, ' ', this.field9854.replace('/', ' '));
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && ~var10.length() <= -4 && class296.method1771(var10.substring(1, 3), -95)) {
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
                                            if (var10.length() >= 4 && class296.method1771(var10.substring(0, 4), 81)) {
                                                var5 = class530.method2908((byte) 66, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field9889 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field9912 = false;
                                }
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field9913 = false;
                                }
                            }
                            this.field9876 &= this.field9696.method3176("GL_ARB_half_float_pixel");
                            this.field9908 = this.field9913;
                            this.field9900 = true;
                        }
                        if (~this.field9946.indexOf("intel") != 0) {
                            this.field9880 = false;
                        }
                        this.field9904 = !this.field9946.equals("s3 graphics");
                        if (this.field9913) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class385.method2206(1708, true, false);
                        this.field9803 = true;
                        this.field9795 = new class149(this, super.field7199);
                        this.method3956(-46);
                        this.field9808 = new class34(this);
                        this.field9793 = new class82(this);
                        if (this.field9793.method516(-5704)) {
                            this.field9799 = new class182(this);
                            if (!this.field9799.method1222(127)) {
                                this.field9799.method1224(-116);
                                this.field9799 = null;
                            }
                        }
                        this.field9797 = new class231(this);
                        this.method3943((byte) -119);
                        this.method3989(4);
                        this.method970();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method919();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "XA", descriptor = "()I")
    public final int method985() {
        ++field9690;
        return this.field9906;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public final void method989(int arg0) {
        ++field9680;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field9800 = arg0;
            this.field9795.method850(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IZ)V")
    public final void method3923(int arg0, boolean arg1) {
        if (this.field9914 != arg1) {
            this.field9914 = arg1;
            this.method3934((byte) 62);
            this.field9837 &= -32;
        }
        ++field9591;
        if (arg0 != -32) {
            this.method3982(-117);
        }
    }

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "(I)V")
    public final void method3924(int arg0) {
        if (this.field9837 != 4) {
            this.method3983(25340);
            this.method3923(-32, false);
            this.method3974(false, 5);
            this.method3978(false, (byte) 127);
            this.method3986((byte) -124, false);
            this.method3935(-2, (byte) -42);
            this.method3920(1, 9770);
            this.field9837 = 4;
        }
        ++field9790;
        int var2 = -68 / ((arg0 - -12) / 41);
    }

    @OriginalMember(owner = "client!ck", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method997(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field9785;
        boolean var7 = this.field9941 != arg0;
        if (var7 || this.field9925 != arg1 || this.field9929 != arg2) {
            this.field9925 = arg1;
            this.field9929 = arg2;
            this.field9941 = arg0;
            if (var7) {
                this.field9921 = (float) (this.field9941 & 255) / 255.0F;
                this.field9899 = (float) (this.field9941 & 65280) / 65280.0F;
                this.field9901 = (float) (16711680 & this.field9941) / 1.671168E7F;
                this.method3976(-105);
            }
            this.method3961((byte) -118);
        }
        if (this.field9910[0] != arg3 || this.field9910[1] != arg4 || this.field9910[2] != arg5) {
            this.field9910[0] = arg3;
            this.field9910[1] = arg4;
            this.field9910[2] = arg5;
            this.field9917[1] = -arg4;
            this.field9917[2] = -arg5;
            this.field9917[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9903[0] = arg3 * var8;
            this.field9903[1] = arg4 * var8;
            this.field9903[2] = arg5 * var8;
            this.field9949[1] = -this.field9903[1];
            this.field9949[0] = -this.field9903[0];
            this.field9949[2] = -this.field9903[2];
            this.method3929(4611);
            this.field9935 = (int) (arg5 * 256.0F / arg4);
            this.field9859 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "(I)V")
    public final void method944(int arg0) {
        this.field9804 = 0;
        ++field9679;
        while (arg0 > 1) {
            ++this.field9804;
            arg0 >>= 1;
        }
        this.field9805 = 1 << this.field9804;
    }

    @OriginalMember(owner = "client!ck", name = "JA", descriptor = "(IIIIII)I")
    public final int method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9605;
        int var7 = 0;
        float var8 = (float) arg2 * this.field9831.field1031 + (float) arg0 * this.field9831.field1060 + (float) arg1 * this.field9831.field1063 + this.field9831.field1035;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field9831.field1031 + (float) arg3 * this.field9831.field1060 + (float) arg4 * this.field9831.field1063 + this.field9831.field1035;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field9860 > var8 && var9 < (float) this.field9860) {
            var7 |= 16;
        } else if (var8 > (float) this.field9906 && (float) this.field9906 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field9831.field1055 + (float) arg0 * this.field9831.field1043 + (float) arg1 * this.field9831.field1047 + this.field9831.field1051) * (float) this.field9847 / var8);
        int var11 = (int) (((float) arg5 * this.field9831.field1055 + (float) arg3 * this.field9831.field1043 + (float) arg4 * this.field9831.field1047 + this.field9831.field1051) * (float) this.field9847 / var9);
        if ((float) var10 < this.field9937 && this.field9937 > (float) var11) {
            var7 |= 1;
        } else if (this.field9886 < (float) var10 && this.field9886 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field9831.field1037 + (float) arg0 * this.field9831.field1046 + (float) arg1 * this.field9831.field1062 + this.field9831.field1033) * (float) this.field9844 / var8);
        int var13 = (int) (((float) arg5 * this.field9831.field1037 + (float) arg3 * this.field9831.field1046 + (float) arg4 * this.field9831.field1062 + this.field9831.field1033) * (float) this.field9844 / var9);
        if ((float) var12 < this.field9845 && (float) var13 < this.field9845) {
            var7 |= 4;
        } else if (this.field9940 < (float) var12 && this.field9940 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "(I)V")
    private final void method3925(int arg0) {
        this.field9888[arg0] = this.field9879;
        this.field9888[14] = this.field9926;
        ++field9780;
        this.field9882 = (this.field9888[14] + (float) (-this.field9906)) / this.field9888[10];
        this.field9924 = (float) this.field9906;
    }

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "()I")
    public final int method949() {
        ++field9763;
        int var1 = this.field9953;
        this.field9953 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ck", name = "GA", descriptor = "(I)V")
    public final void method907(int arg0) {
        this.method3920(0, 9770);
        ++field9657;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "()Z")
    public final boolean method879() {
        ++field9631;
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "(I)V")
    private final void method3926(int arg0) {
        ++field9736;
        if (arg0 != 5888) {
            this.method946(1.1705087F);
        }
        if (this.field9898) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field9898 = false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lza;)V")
    public final void method929(class270 arg0) {
        ++field9756;
        this.field9806 = ((class5) arg0).field59;
        if (this.field9871 == null) {
            class333 var2 = new class333(80);
            if (!this.field9865) {
                var2.method1923(-1.0F, -2061505808);
                var2.method1923(-1.0F, -2061505808);
                var2.method1923(0.0F, -2061505808);
                var2.method1923(0.0F, -2061505808);
                var2.method1923(1.0F, -2061505808);
                var2.method1923(1.0F, -2061505808);
                var2.method1923(-1.0F, -2061505808);
                var2.method1923(0.0F, -2061505808);
                var2.method1923(1.0F, -2061505808);
                var2.method1923(1.0F, -2061505808);
                var2.method1923(1.0F, -2061505808);
                var2.method1923(1.0F, -2061505808);
                var2.method1923(0.0F, -2061505808);
                var2.method1923(1.0F, -2061505808);
                var2.method1923(0.0F, -2061505808);
                var2.method1923(-1.0F, -2061505808);
                var2.method1923(1.0F, -2061505808);
                var2.method1923(0.0F, -2061505808);
                var2.method1923(0.0F, -2061505808);
                var2.method1923(0.0F, -2061505808);
            } else {
                var2.method1926((byte) 19, -1.0F);
                var2.method1926((byte) -121, -1.0F);
                var2.method1926((byte) -121, 0.0F);
                var2.method1926((byte) -125, 0.0F);
                var2.method1926((byte) 83, 1.0F);
                var2.method1926((byte) -126, 1.0F);
                var2.method1926((byte) -127, -1.0F);
                var2.method1926((byte) 42, 0.0F);
                var2.method1926((byte) 39, 1.0F);
                var2.method1926((byte) 43, 1.0F);
                var2.method1926((byte) 70, 1.0F);
                var2.method1926((byte) -126, 1.0F);
                var2.method1926((byte) 122, 0.0F);
                var2.method1926((byte) 49, 1.0F);
                var2.method1926((byte) -125, 0.0F);
                var2.method1926((byte) 89, -1.0F);
                var2.method1926((byte) -122, 1.0F);
                var2.method1926((byte) 85, 0.0F);
                var2.method1926((byte) 13, 0.0F);
                var2.method1926((byte) 118, 0.0F);
            }
            this.field9871 = this.method3912(var2.field3193, false, var2.field3133, 20, 1365);
            this.field9890 = new class375(this.field9871, 5126, 3, 0);
            this.field9877 = new class375(this.field9871, 5126, 2, 12);
            this.field9791.method379(this, false);
        }
    }

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "()Z")
    public final boolean method960() {
        ++field9676;
        return false;
    }

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "(I)V")
    public final void method3927(int arg0) {
        if (arg0 != 4733) {
            this.field9797 = null;
        }
        if (~this.field9894 != -1) {
            this.field9837 &= -32;
            this.field9894 = 0;
        }
        ++field9658;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method931(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class15 {
        ++field9635;
        this.method925(arg2, arg3);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)V")
    public final synchronized void method3928(int arg0, int arg1, int arg2) {
        ++field9766;
        if (arg2 == 2) {
            class405 var4 = new class405(arg0);
            var4.field4108 = (long) arg1;
            this.field9827.method3593(var4, arg2 ^ 13);
        }
    }

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "()V")
    public final void method962() {
        ++field9627;
        if (!this.field9880) {
            if (!this.field9850) {
                throw new RuntimeException("");
            }
            this.field9819.method622(0, 0, this.field9650, this.field9789, 0, 0);
            this.field9696.setSurface(this.field9654);
        } else {
            if (this.field9814 != this.field9817) {
                throw new RuntimeException();
            }
            this.field9817.method236(0, -3);
            this.field9817.method236(8, -3);
            this.method3918(4609, this.field9817);
        }
        this.field9650 = this.field9641;
        this.field9819 = null;
        this.field9789 = this.field9616;
        this.method3927(4733);
        this.method3955(-3325);
        this.method957();
    }

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field9647;
        float var10;
        float var11;
        if (this.field9915 != null && arg2 <= this.field9915.field6614 && arg3 <= this.field9915.field6617) {
            this.field9915.method2874((byte) -93, 0, arg6, arg3, 0, arg2, 0, 0, false, 6406);
            var10 = (float) arg3 * this.field9915.field768 / (float) this.field9915.field6617;
            var11 = (float) arg2 * this.field9915.field772 / (float) this.field9915.field6614;
        } else {
            this.field9915 = class683.method3666(arg3, 6406, 6406, this, arg6, false, arg2, 3553);
            this.field9915.method2873(-26403, false, false);
            var10 = this.field9915.field768;
            var11 = this.field9915.field772;
        }
        this.method3914((byte) -127);
        this.method3975((byte) 114, this.field9915);
        this.method3920(arg8, 9770);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3921(arg5, 7077);
        this.method3917(5, 34165, 34165);
        this.method3954(0, 768, 34166, (byte) 116);
        this.method3954(2, 770, 5890, (byte) 102);
        this.method3922(0, 1, 770, 34166);
        this.method3922(2, 1, 770, 5890);
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
        this.method3954(0, 768, 5890, (byte) 109);
        this.method3954(2, 770, 34166, (byte) 122);
        this.method3922(0, 1, 770, 5890);
        this.method3922(2, 1, 770, 34166);
    }

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "(IIIIIII)I")
    public final int method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9733;
        float var8 = (float) arg2 * this.field9831.field1031 + (float) arg0 * this.field9831.field1060 + (float) arg1 * this.field9831.field1063 + this.field9831.field1035;
        float var9 = (float) arg5 * this.field9831.field1031 + (float) arg3 * this.field9831.field1060 + (float) arg4 * this.field9831.field1063 + this.field9831.field1035;
        int var10 = 0;
        if (var8 < (float) this.field9860 && (float) this.field9860 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field9906 && (float) this.field9906 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field9831.field1055 + (float) arg0 * this.field9831.field1043 + (float) arg1 * this.field9831.field1047 + this.field9831.field1051) * (float) this.field9847 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field9831.field1055 + (float) arg3 * this.field9831.field1043 + (float) arg4 * this.field9831.field1047 + this.field9831.field1051) * (float) this.field9847 / (float) arg6);
        if (this.field9937 > (float) var11 && this.field9937 > (float) var12) {
            var10 |= 1;
        } else if (this.field9886 < (float) var11 && this.field9886 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field9831.field1037 + (float) arg0 * this.field9831.field1046 + (float) arg1 * this.field9831.field1062 + this.field9831.field1033) * (float) this.field9844 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field9831.field1037 + (float) arg3 * this.field9831.field1046 + (float) arg4 * this.field9831.field1062 + this.field9831.field1033) * (float) this.field9844 / (float) arg6);
        if (this.field9845 > (float) var13 && this.field9845 > (float) var14) {
            var10 |= 4;
        } else if (this.field9940 < (float) var13 && (float) var14 > this.field9940) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        ++field9774;
        class787 var10 = (class787) arg6;
        class59 var11 = var10.field10781;
        this.method3914((byte) -77);
        this.method3975((byte) 118, var10.field10781);
        this.method3920(arg5, 9770);
        this.method3917(1, 7681, 8448);
        this.method3954(0, 768, 34167, (byte) 115);
        float var12 = var11.field772 / (float) var11.field770;
        float var13 = var11.field768 / (float) var11.field771;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method3954(0, 768, 5890, (byte) 115);
    }

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "(I)V")
    public final void method3929(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field9903, 0);
        ++field9669;
        OpenGL.glLightfv(16385, arg0, this.field9949, 0);
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)Lza;")
    public final class270 method975(int arg0) {
        ++field9619;
        class5 var2 = new class5(arg0);
        this.field9809.method3593(var2, 15);
        return var2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
    public final int method886(int arg0, int arg1) {
        ++field9592;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)I")
    private final int method3930(byte arg0) {
        ++field9725;
        int var2 = 0;
        this.field9946 = OpenGL.glGetString(7936).toLowerCase();
        this.field9854 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field9946.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field9946.indexOf("brian paul") != 0 || ~this.field9946.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class340.method1966(1, ' ', var3.replace('.', ' '));
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class530.method2908((byte) -56, var4[0]);
                int var6 = class530.method2908((byte) -82, var4[1]);
                this.field9885 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field9885 < 12) {
            var2 |= 2;
        }
        if (!this.field9696.method3176("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field9696.method3176("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field9846 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field9947 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field9861 = var7[0];
        if (~this.field9846 > -3 || this.field9947 < 2 || this.field9861 < 2) {
            var2 |= 16;
        }
        this.field9865 = Stream.method2528();
        this.field9850 = this.field9696.arePbuffersAvailable();
        this.field9913 = this.field9696.method3176("GL_ARB_vertex_buffer_object");
        this.field9873 = this.field9696.method3176("GL_ARB_multisample");
        this.field9849 = this.field9696.method3176("GL_ARB_vertex_program");
        this.field9696.method3176("GL_ARB_fragment_program");
        this.field9909 = this.field9696.method3176("GL_ARB_vertex_shader");
        if (arg0 >= -3) {
            return -52;
        } else {
            this.field9884 = this.field9696.method3176("GL_ARB_fragment_shader");
            this.field9912 = this.field9696.method3176("GL_EXT_texture3D");
            this.field9876 = this.field9696.method3176("GL_ARB_texture_rectangle");
            this.field9907 = this.field9696.method3176("GL_ARB_texture_cube_map");
            this.field9889 = this.field9696.method3176("GL_ARB_texture_float");
            this.field9891 = false;
            this.field9880 = this.field9696.method3176("GL_EXT_framebuffer_object");
            this.field9851 = this.field9696.method3176("GL_EXT_framebuffer_blit");
            this.field9931 = this.field9696.method3176("GL_EXT_framebuffer_multisample");
            this.field9948 = this.field9931 & this.field9851;
            this.field9897 = class377.field4615.startsWith("mac");
            OpenGL.glGetFloatv(2834, class570.field7210, 0);
            this.field9875 = class570.field7210[0];
            this.field9934 = class570.field7210[1];
            return ~var2 != -1 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    private final void method3931(byte arg0) {
        this.field9696.method3177();
        ++field9661;
        if (arg0 != 111) {
            this.method3933(false);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lno;Z)V")
    public final void method3932(class75 arg0, boolean arg1) {
        ++field9613;
        if (!arg1) {
            OpenGL.glPushMatrix();
            OpenGL.glMultMatrixf(arg0.method455(122), 0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "(I)V")
    public final void method995(int arg0) {
        ++field9705;
        this.method3908(25921);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(II)Lic;")
    public final class537 method938(int arg0, int arg1) {
        ++field9777;
        return null;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)Lmaa;")
    public final class528 method3933(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field9688;
            return this.field9864 == null ? null : this.field9864.method94((byte) -113);
        }
    }

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "([I)V")
    public final void method924(int[] arg0) {
        arg0[1] = this.field9869;
        ++field9770;
        arg0[0] = this.field9951;
        arg0[2] = this.field9922;
        arg0[3] = this.field9857;
    }

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "()[I")
    public final int[] method916() {
        ++field9750;
        return new int[] { this.field9867, this.field9943, this.field9847, this.field9844 };
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method889(Canvas arg0, int arg1, int arg2) {
        ++field9693;
        if (this.field9606 == arg0) {
            throw new RuntimeException();
        } else if (!this.field9677.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field9696.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field9677.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "()V")
    public final void method891() {
        ++field9678;
        if (this.field9799 != null && this.field9799.method1664(1)) {
            this.field9793.method521(this.field9799, (byte) 38);
            this.field9795.method850(0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
    private final void method3934(byte arg0) {
        int var2 = -12 % ((arg0 - -52) / 52);
        ++field9636;
        if (this.field9914 && this.field9842 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
    public final synchronized void method963(int arg0) {
        ++field9648;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field9824.method3596(-121)) {
            class405 var12 = (class405) this.field9824.method3599(-53);
            class134.field1773[var2++] = (int) var12.field4108;
            this.field9823 -= var12.field5378;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class134.field1773, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class134.field1773, 0);
            var2 = 0;
        }
        while (!this.field9825.method3596(-83)) {
            class405 var11 = (class405) this.field9825.method3599(-56);
            class134.field1773[var2++] = (int) var11.field4108;
            this.field9820 -= var11.field5378;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class134.field1773, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class134.field1773, 0);
            var2 = 0;
        }
        while (!this.field9826.method3596(-89)) {
            class405 var10 = (class405) this.field9826.method3599(-77);
            class134.field1773[var2++] = var10.field5378;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class134.field1773, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class134.field1773, 0);
            var2 = 0;
        }
        while (!this.field9827.method3596(-105)) {
            class405 var9 = (class405) this.field9827.method3599(-70);
            class134.field1773[var2++] = (int) var9.field4108;
            this.field9821 -= var9.field5378;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class134.field1773, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class134.field1773, 0);
            boolean var4 = false;
        }
        while (!this.field9822.method3596(-102)) {
            class405 var8 = (class405) this.field9822.method3599(-72);
            OpenGL.glDeleteLists((int) var8.field4108, var8.field5378);
        }
        while (!this.field9828.method3596(-112)) {
            class337 var7 = this.field9828.method3599(-89);
            OpenGL.glDeleteProgramARB((int) var7.field4108);
        }
        while (!this.field9829.method3596(-112)) {
            class337 var6 = this.field9829.method3599(-50);
            OpenGL.glDeleteObjectARB(var6.field4108);
        }
        while (!this.field9822.method3596(-116)) {
            class405 var5 = (class405) this.field9822.method3599(-56);
            OpenGL.glDeleteLists((int) var5.field4108, var5.field5378);
        }
        this.field9795.method849(false);
        if (~this.method981() < -100663297 && class502.method2786(-7114) > this.field9838 - -60000L) {
            System.gc();
            this.field9838 = class502.method2786(-7114);
        }
        this.field9807 = var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
    public final void method3935(int arg0, byte arg1) {
        ++field9762;
        this.method3960(true, arg1 ^ 115, arg0);
        if (arg1 != -42) {
            this.method960();
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V")
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field9614;
        this.method973(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method888(Canvas arg0) {
        this.field9654 = 0L;
        ++field9593;
        this.field9738 = null;
        if (arg0 != null && this.field9606 != arg0) {
            if (this.field9677.containsKey(arg0)) {
                Long var2 = (Long) this.field9677.get(arg0);
                this.field9654 = var2;
                this.field9738 = arg0;
            }
        } else {
            this.field9654 = this.field9611;
            this.field9738 = this.field9606;
        }
        if (this.field9738 != null && this.field9654 != 0L) {
            this.field9696.setSurface(this.field9654);
            this.method3989(4);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "na", descriptor = "(IIII)[I")
    public final int[] method968(int arg0, int arg1, int arg2, int arg3) {
        ++field9729;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field9789 + -arg1, arg2, 1, 32993, this.field9887, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "(I)V")
    private final void method3936(int arg0) {
        ++field9717;
        if (this.field9894 != 3) {
            this.field9894 = 3;
            this.method3963((byte) -115);
            this.method3969(true);
            this.field9837 &= -8;
        }
        if (arg0 <= 32) {
            this.field9856 = 122;
        }
    }

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "(I)V")
    private final void method3937(int arg0) {
        ++field9748;
        this.field9881 = (float) (-this.field9905 + this.field9906) - this.field9874;
        this.field9938 = -((float) this.field9842 * this.field9883) + this.field9881;
        if ((float) this.field9860 > this.field9938) {
            this.field9938 = (float) this.field9860;
        }
        OpenGL.glFogf(2915, this.field9938);
        OpenGL.glFogf(2916, this.field9881);
        class570.field7210[2] = (float) class249.method1625(255, this.field9848) / 255.0F;
        class570.field7210[0] = (float) class249.method1625(this.field9848, 16711680) / 1.671168E7F;
        class570.field7210[1] = (float) class249.method1625(arg0, this.field9848) / 65280.0F;
        OpenGL.glFogfv(2918, class570.field7210, 0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V")
    public final void method3938(boolean arg0, int arg1) {
        ++field9742;
        int var3 = -42 % ((-74 - arg1) / 48);
        if (!this.field9862 != !arg0) {
            this.field9862 = arg0;
            this.method3953(94);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lwq;)V")
    public final void method912(class705 arg0) {
        this.field9791.method383(this, -1, (byte) -77, arg0);
        ++field9737;
    }

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "()V")
    public final void method909() {
        ++field9714;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public final void method892(int arg0) {
        ++field9622;
    }

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "(IIII)V")
    public final void method928(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field9857 < ~arg3) {
            this.field9857 = arg3;
        }
        if (~this.field9951 > ~arg0) {
            this.field9951 = arg0;
        }
        if (~arg1 < ~this.field9869) {
            this.field9869 = arg1;
        }
        if (~arg2 > ~this.field9922) {
            this.field9922 = arg2;
        }
        ++field9767;
        OpenGL.glEnable(3089);
        this.method3985((byte) 107);
        this.method3948(3553);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
    public final void method3939(byte arg0) {
        if (arg0 == -114) {
            ++field9621;
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ldk;B)V")
    public final void method3940(class95 arg0, byte arg1) {
        ++field9792;
        if (arg1 == 108) {
            if (~this.field9811 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field9811 >= 0) {
                    this.field9810[this.field9811].method235(9412);
                }
                this.field9818 = this.field9810[++this.field9811] = arg0;
                this.field9818.method250((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(Z)V")
    private final void method3941(boolean arg0) {
        if (arg0) {
            this.method906();
        }
        ++field9651;
        int var2;
        for (var2 = 0; var2 < this.field9936; ++var2) {
            class757 var3 = this.field9878[var2];
            class295.field3750[0] = (float) var3.method4121((byte) -124);
            int var4 = var2 + 16386;
            class295.field3750[1] = (float) var3.method4117(true);
            class295.field3750[2] = (float) var3.method4123(22290);
            class295.field3750[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class295.field3750, 0);
            int var5 = var3.method4124(false);
            float var6 = var3.method4120(-128) / 255.0F;
            class295.field3750[0] = (float) (class249.method1625(16713327, var5) >> 16) * var6;
            class295.field3750[2] = var6 * (float) class249.method1625(var5, 255);
            class295.field3750[1] = (float) class249.method1625(var5 >> 8, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class295.field3750, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method4122(-125) * var3.method4122(124)));
            OpenGL.glEnable(var4);
        }
        while (~this.field9923 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field9923 = this.field9936;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IFF)V")
    public final void method3942(int arg0, float arg1, float arg2) {
        this.field9883 = arg1;
        this.field9874 = arg2;
        if (arg0 == -13019) {
            ++field9608;
            this.method3937(65280);
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V")
    private final void method3943(byte arg0) {
        this.method3935(-2, (byte) -42);
        ++field9759;
        for (int var2 = this.field9846 - 1; ~var2 <= -1; --var2) {
            this.method3945(var2, false);
            this.method3975((byte) 112, (class128) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3917(63, 8448, 8448);
        this.method3954(2, 770, 34168, (byte) 125);
        this.method3926(5888);
        this.field9836 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field9833 = 1;
        OpenGL.glEnable(3008);
        if (arg0 < -7) {
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field9832 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field9834 = true;
            this.method3923(-32, true);
            this.method3974(true, 5);
            this.method3978(true, (byte) 126);
            this.method3986((byte) -124, true);
            this.method3927(4733);
            this.field9696.setSwapInterval(0);
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
            for (int var4 = 0; var4 < 8; ++var4) {
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
            this.field9941 = this.field9848 = -1;
            this.method957();
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)V")
    public final synchronized void method3944(int arg0, int arg1, int arg2) {
        ++field9607;
        class405 var4 = new class405(arg1);
        var4.field4108 = (long) arg2;
        this.field9824.method3593(var4, 15);
        if (arg0 != 33639) {
            this.method944(75);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(IZ)V")
    public final void method3945(int arg0, boolean arg1) {
        if (arg1) {
            this.method972(87, 67, -120, -49, 111, -127, 36, -55, -114, 60, -54, 26, -113);
        }
        if (~this.field9911 != ~arg0) {
            OpenGL.glActiveTexture(33984 - -arg0);
            this.field9911 = arg0;
        }
        ++field9628;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)I")
    public final int method3946(int arg0, byte arg1) {
        ++field9667;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && ~arg0 != -34847 && arg0 != 34844) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (arg0 != 6408 && ~arg0 != -34848) {
                    if (arg0 != 34843) {
                        if (arg0 != 34842) {
                            if (arg0 != 6402) {
                                if (arg0 == 6401) {
                                    return 1;
                                } else {
                                    if (arg1 != -50) {
                                        this.field9927 = null;
                                    }
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 3;
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

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ldea;Ldea;Ldea;Ldea;I)V")
    public final void method3947(class375 arg0, class375 arg1, class375 arg2, class375 arg3, int arg4) {
        if (arg0 != null) {
            this.method3958(13, arg0.field4583);
            OpenGL.glVertexPointer(arg0.field4586, arg0.field4587, this.field9927.method2562(13349), this.field9927.method2559((byte) -118) + (long) arg0.field4585);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field9659;
        if (arg3 != null) {
            this.method3958(13, arg3.field4583);
            OpenGL.glNormalPointer(arg3.field4587, this.field9927.method2562(arg4 + -19537), this.field9927.method2559((byte) -38) + (long) arg3.field4585);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3958(13, arg2.field4583);
            OpenGL.glColorPointer(arg2.field4586, arg2.field4587, this.field9927.method2562(arg4 + -19537), this.field9927.method2559((byte) -81) - -((long) arg2.field4585));
            OpenGL.glEnableClientState(32886);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3958(arg4 + -32873, arg1.field4583);
            OpenGL.glTexCoordPointer(arg1.field4586, arg1.field4587, this.field9927.method2562(arg4 + -19537), this.field9927.method2559((byte) -45) + (long) arg1.field4585);
            OpenGL.glEnableClientState(32888);
        }
        if (arg4 != 32886) {
            this.field9862 = true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "(I)V")
    private final void method3948(int arg0) {
        ++field9691;
        if (~this.field9922 <= ~this.field9951 && this.field9869 <= this.field9857) {
            OpenGL.glScissor(this.field9951 + this.field9872, this.field9892 + this.field9789 + -this.field9857, -this.field9951 + this.field9922, -this.field9869 + this.field9857);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 3553) {
            this.method908(116, (class757[]) null);
        }
    }

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "()V")
    public final void method919() {
        ++field9671;
        for (class337 var1 = this.field9809.method3591(0); var1 != null; var1 = this.field9809.method3600((byte) 52)) {
            ((class5) var1).method15(71);
        }
        if (this.field9793 != null) {
            this.field9793.method522(0);
        }
        if (this.field9696 != null) {
            this.method3931((byte) 111);
            Enumeration var2 = this.field9677.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field9677.get(var3);
                this.field9696.releaseSurface(var3, var4);
            }
            this.field9696.release();
            this.field9696 = null;
        }
        if (this.field9803) {
            class497.method2760(true, true, false);
            this.field9803 = false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "(II)V")
    public final synchronized void method3949(int arg0, int arg1) {
        ++field9655;
        class405 var3 = new class405(arg0);
        this.field9826.method3593(var3, 15);
        if (arg1 != 3553) {
            this.method3960(true, 105, 109);
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(II)V")
    public final void method925(int arg0, int arg1) throws class15 {
        ++field9632;
        try {
            this.field9696.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "(I)V")
    public final void method3950(int arg0) {
        if (~this.field9837 != -9) {
            this.method3952(false);
            this.method3923(-32, true);
            this.method3978(true, (byte) 127);
            this.method3986((byte) -124, true);
            this.method3920(1, 9770);
            this.field9837 = 8;
        }
        int var2 = 8 / ((-10 - arg0) / 34);
        ++field9681;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(III)V")
    public final void method3951(int arg0, int arg1, int arg2) {
        this.field9892 = arg1;
        this.field9872 = arg0;
        if (arg2 != 27289) {
            this.field9861 = -124;
        }
        ++field9784;
        this.method3955(-3325);
        this.method3948(3553);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "()Z")
    public final boolean method993() {
        ++field9723;
        return this.field9799 != null && (~this.field9794 >= -2 || this.field9948);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(Z)V")
    private final void method3952(boolean arg0) {
        ++field9703;
        if (!arg0) {
            if (this.field9894 != 2) {
                this.field9894 = 2;
                this.method3982(125);
                this.method3969(!arg0);
                this.field9837 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "(IIIII)V")
    public final void method896(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3971(-20110);
        ++field9718;
        this.method3920(arg4, 9770);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "(I)V")
    private final void method3953(int arg0) {
        int var2 = -33 % ((25 - arg0) / 39);
        if (this.field9895 && !this.field9862) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field9599;
    }

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "()Loha;")
    public final class465 method994() {
        ++field9728;
        return new class75();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIB)V")
    public final void method3954(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 100) {
            this.field9832 = false;
        }
        ++field9715;
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
        OpenGL.glTexEnvi(8960, 34192 - -arg0, arg1);
    }

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "()V")
    public final void method943() {
        OpenGL.glFinish();
        ++field9769;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIID)V")
    public final void method894(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field9765;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([IIIIIZ)Lpu;")
    public final class772 method885(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9612;
        return new class634(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)V")
    public final void method983(int arg0, int arg1, int arg2, int arg3) {
        ++field9722;
        this.field9793.method515((byte) -102, arg2, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "(I)V")
    private final void method3955(int arg0) {
        OpenGL.glViewport(this.field9872, this.field9892, this.field9650, this.field9789);
        if (arg0 != -3325) {
            this.field9928 = null;
        }
        ++field9604;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(FFF)V")
    public final void method898(float arg0, float arg1, float arg2) {
        ++field9672;
        class168.field2232 = arg0;
        class48.field551 = arg2;
        class560.field7125 = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "()Z")
    public final boolean method917() {
        ++field9755;
        return this.field9797.method1480(3, 9);
    }

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "(I)V")
    private final void method3956(int arg0) {
        ++field9751;
        this.field9930 = new class128[this.field9846];
        this.field9944 = new class520(this, 3553, 6408, 1, 1);
        new class520(this, 3553, 6408, 1, 1);
        new class520(this, 3553, 6408, 1, 1);
        this.field9868 = new class745(this);
        this.field9918 = new class745(this);
        this.field9866 = new class745(this);
        this.field9902 = new class745(this);
        this.field9853 = new class745(this);
        this.field9855 = new class745(this);
        this.field9932 = new class745(this);
        this.field9858 = new class745(this);
        this.field9863 = new class745(this);
        this.field9920 = new class745(this);
        if (arg0 >= -6) {
            this.field9949 = null;
        }
        if (this.field9880) {
            this.field9942 = new class39(this);
            new class39(this);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field9603;
        if (arg0 != arg2 || arg1 != arg3) {
            class787 var13 = (class787) arg6;
            class59 var14 = var13.field10781;
            this.method3914((byte) -127);
            this.method3975((byte) 121, var13.field10781);
            this.method3920(arg5, 9770);
            this.method3917(125, 7681, 8448);
            this.method3954(0, 768, 34167, (byte) 119);
            float var15 = var14.field772 / (float) var14.field770;
            float var16 = var14.field768 / (float) var14.field771;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var20 = var17 * var19;
            float var21 = var18 * var19;
            int var22 = arg11 % (arg10 - -arg9);
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 <= ~var22) {
                var28 = (float) (arg9 - var22) * var21;
                var27 = (float) (-var22 + arg9) * var20;
            } else {
                var26 = (float) (arg9 + arg10 + -var22) * var21;
                var25 = (float) (arg9 + arg10 + -var22) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (arg0 < arg2) {
                    if ((float) arg2 + 0.35F < var29) {
                        break;
                    }
                    if ((float) arg2 < var27 + var29) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 + -var29;
                    }
                }
                if (arg3 > arg1) {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var30 += var28 + var32;
                var29 += var27 + var31;
                OpenGL.glEnd();
                var28 = var24;
                var27 = var23;
            }
            this.method3954(0, 768, 5890, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method979(Canvas arg0) {
        ++field9660;
        if (this.field9606 == arg0) {
            throw new RuntimeException();
        } else if (this.field9677.containsKey(arg0)) {
            Long var2 = (Long) this.field9677.get(arg0);
            this.field9696.releaseSurface(arg0, var2);
            this.field9677.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "ra", descriptor = "(IIII)V")
    public final void method952(int arg0, int arg1, int arg2, int arg3) {
        this.field9843 = arg3;
        ++field9675;
        this.field9933 = arg0;
        this.field9856 = arg1;
        this.field9939 = true;
        this.field9852 = arg2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZZ)V")
    public final void method3957(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (~this.field9896 != ~arg1 || !this.field9939 == this.field9945) {
            class520 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field9939 ? 0 : 3;
            if (arg1 < 0) {
                this.method3926(5888);
            } else {
                var5 = this.field9795.method848((byte) 113, arg1);
                class191 var10 = super.field7199.method1732((byte) -44, arg1);
                if (~var10.field2662 == -1 && var10.field2665 == 0) {
                    this.method3926(5888);
                } else {
                    int var11 = !var10.field2673 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method3915((float) (this.field9807 % var12 * var10.field2665) / (float) var12, (float) (this.field9807 % var12 * var10.field2662) / (float) var12, (byte) 113, 0.0F);
                }
                var6 = var10.field2677;
                if (!this.field9939) {
                    var7 = var10.field2680;
                    var8 = var10.field2664;
                    var9 = var10.field2678;
                }
            }
            this.field9797.method1479(4, var8, var7, arg3, arg2, var9);
            if (!this.field9797.method1481(9, var5, var6)) {
                this.method3975((byte) 121, var5);
                this.method3979((byte) 62, var6);
            }
            this.field9945 = this.field9939;
            this.field9896 = arg1;
        }
        ++field9663;
        this.field9837 &= -8;
        int var13 = -16 / ((arg0 - 8) / 57);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()Lfga;")
    public final class291 method927() {
        ++field9642;
        int var1 = -1;
        if (this.field9946.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (~this.field9946.indexOf("intel") != 0) {
            var1 = 32902;
        } else if (~this.field9946.indexOf("ati") != 0) {
            var1 = 4098;
        }
        return new class291(var1, "OpenGL", this.field9885, this.field9854, 0L);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILnk;)V")
    public final void method3958(int arg0, class447 arg1) {
        if (arg0 != 13) {
            this.method901(69, 56, 47, (int[]) null);
        }
        if (this.field9927 != arg1) {
            if (this.field9913) {
                OpenGL.glBindBufferARB(34962, arg1.method2560((byte) -100));
            }
            this.field9927 = arg1;
        }
        ++field9638;
    }

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "(III)V")
    public final void method884(int arg0, int arg1, int arg2) {
        ++field9743;
        if (~this.field9848 != ~arg0 || ~this.field9842 != ~arg1 || this.field9905 != arg2) {
            this.field9905 = arg2;
            this.field9848 = arg0;
            this.field9842 = arg1;
            this.method3937(65280);
            this.method3934((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3959(String arg0, byte arg1) {
        System.out.println("Error: " + class446.method2558(arg0, "%0a", "\n", arg1 ^ 21360));
        if (arg1 != -95) {
            field9684 = 0.270692408247058D;
        }
        ++field9601;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII)V")
    public final void method3960(boolean arg0, int arg1, int arg2) {
        ++field9665;
        if (arg1 >= -74) {
            this.method3915(-0.6608523F, 0.3983246F, (byte) -72, 1.0351582F);
        }
        this.method3957(115, arg2, arg0, true);
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(B)V")
    private final void method3961(byte arg0) {
        ++field9772;
        class570.field7210[0] = this.field9925 * this.field9901;
        class570.field7210[2] = this.field9925 * this.field9921;
        class570.field7210[1] = this.field9925 * this.field9899;
        class570.field7210[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class570.field7210, 0);
        class570.field7210[0] = -this.field9929 * this.field9901;
        if (arg0 < -31) {
            class570.field7210[3] = 1.0F;
            class570.field7210[1] = -this.field9929 * this.field9899;
            class570.field7210[2] = -this.field9929 * this.field9921;
            OpenGL.glLightfv(16385, 4609, class570.field7210, 0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "()Z")
    public final boolean method926() {
        ++field9787;
        if (this.field9799 != null) {
            if (!this.field9799.method1664(1)) {
                if (!this.field9793.method518(this.field9799, 0)) {
                    return false;
                }
                this.field9795.method850(0);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lsu;IIII)Lka;")
    public final class299 method930(class615 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9745;
        return new class745(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLdk;)V")
    public final void method3962(boolean arg0, class95 arg1) {
        ++field9710;
        if (this.field9811 >= 0 && this.field9810[this.field9811] == arg1) {
            this.field9810[this.field9811--] = null;
            if (!arg0) {
                this.method3949(71, -42);
            }
            arg1.method235(9412);
            if (this.field9811 >= 0) {
                this.field9818 = this.field9810[this.field9811];
                this.field9818.method250((byte) 126);
            } else {
                this.field9818 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(B)V")
    private final void method3963(byte arg0) {
        if (arg0 >= -105) {
            this.field9884 = false;
        }
        ++field9653;
        float var2 = (float) (-this.field9867) * this.field9893 / (float) this.field9847;
        float var3 = (float) (-this.field9943) * this.field9893 / (float) this.field9844;
        float var4 = (float) (-this.field9867 + this.field9650) * this.field9893 / (float) this.field9847;
        float var5 = (float) (-this.field9943 + this.field9789) * this.field9893 / (float) this.field9844;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field9860, (double) this.field9906);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "()Z")
    public final boolean method965() {
        ++field9740;
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public final void method934(boolean arg0) {
        ++field9721;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLdk;)V")
    public final void method3964(byte arg0, class95 arg1) {
        ++field9730;
        if (this.field9813 >= 0 && this.field9816[this.field9813] == arg1) {
            if (arg0 >= 19) {
                this.field9816[this.field9813--] = null;
                arg1.method244(-8040);
                if (~this.field9813 <= -1) {
                    this.field9814 = this.field9816[this.field9813];
                    this.field9814.method248(true);
                } else {
                    this.field9814 = null;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "()V")
    public final void method970() {
        ++field9615;
        if (this.field9904 && this.field9650 > 0 && this.field9789 > 0) {
            int var1 = this.field9951;
            int var2 = this.field9922;
            int var3 = this.field9869;
            int var4 = this.field9857;
            this.method957();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3927(4733);
            this.method3923(-32, false);
            this.method3974(false, 5);
            this.method3978(false, (byte) 127);
            this.method3986((byte) -124, false);
            this.method3975((byte) 121, (class128) null);
            this.method3935(-2, (byte) -42);
            this.method3979((byte) 103, 1);
            this.method3920(0, 9770);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field9650, this.field9789, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method915(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([I)V")
    public final void method942(int[] arg0) {
        ++field9662;
        arg0[0] = this.field9650;
        arg0[1] = this.field9789;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[Lgu;)V")
    public final void method908(int arg0, class757[] arg1) {
        ++field9674;
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field9878[var3] = arg1[var3];
        }
        this.field9936 = arg0;
        if (this.field9894 != 1) {
            this.method3941(false);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(FFFFI)V")
    public final void method3965(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class570.field7210[2] = arg0;
        class570.field7210[1] = arg1;
        class570.field7210[arg4] = arg3;
        class570.field7210[3] = arg2;
        ++field9652;
        OpenGL.glTexEnvfv(8960, 8705, class570.field7210, 0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(JZ)V")
    public final synchronized void method3966(long arg0, boolean arg1) {
        ++field9724;
        class337 var4 = new class337();
        var4.field4108 = arg0;
        this.field9829.method3593(var4, 15);
        if (arg1) {
            this.method969(30, -60, 2, 14, 32, -93, -26);
        }
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(B)V")
    private final void method3967(byte arg0) {
        OpenGL.glDepthMask(this.field9835 && this.field9919);
        int var2 = -62 % ((24 - arg0) / 58);
        ++field9798;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BF)V")
    public final void method3968(byte arg0, float arg1) {
        if (arg0 != 84) {
            this.method3920(-11, 120);
        }
        if (this.field9893 != arg1) {
            this.field9893 = arg1;
            if (~this.field9894 == -4) {
                this.method3963((byte) -118);
            }
        }
        ++field9634;
    }

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "(IIIII)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3971(-20110);
        ++field9775;
        this.method3920(arg4, 9770);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(Z)V")
    private final void method3969(boolean arg0) {
        OpenGL.glLoadIdentity();
        ++field9760;
        OpenGL.glMultMatrixf(this.field9839.method455(74), 0);
        if (!arg0) {
            this.method908(-87, (class757[]) null);
        }
        if (this.field9945) {
            this.field9797.field3110.method553(true);
        }
        this.method3929(4611);
        this.method3941(!arg0);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()Z")
    public final boolean method906() {
        ++field9726;
        return false;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lwq;I)V")
    public final void method980(class705 arg0, int arg1) {
        ++field9764;
        this.field9791.method383(this, arg1, (byte) 125, arg0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILjaclib/memory/Buffer;ZB)Lnk;")
    public final class447 method3970(int arg0, int arg1, Buffer arg2, boolean arg3, byte arg4) {
        ++field9758;
        if (arg4 != -106) {
            this.method3935(96, (byte) 123);
        }
        return (class447) (!this.field9913 || arg3 && !this.field9908 ? new class515(this, arg0, arg2) : new class650(this, arg0, arg2, arg1, arg3));
    }

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "(I)V")
    private final void method3971(int arg0) {
        ++field9701;
        if (arg0 == -20110) {
            if (~this.field9837 != -2) {
                this.method3983(25340);
                this.method3923(-32, false);
                this.method3974(false, 5);
                this.method3978(false, (byte) 126);
                this.method3986((byte) -124, false);
                this.method3975((byte) 127, (class128) null);
                this.method3935(-2, (byte) -42);
                this.method3979((byte) 48, 1);
                this.field9837 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "()Loha;")
    public final class465 method948() {
        ++field9685;
        return this.field9801;
    }

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "(I)V")
    public final void method3972(int arg0) {
        OpenGL.glPopMatrix();
        if (arg0 != 0) {
            this.method990(-12, -111, true);
        }
        ++field9735;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ltea;)V")
    public final void method910(class589 arg0) {
        this.field9864 = (class76) arg0;
        ++field9779;
    }

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "()Z")
    public final boolean method900() {
        ++field9625;
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "ya", descriptor = "()V")
    public final void method937() {
        ++field9781;
        this.method3986((byte) -124, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "()V")
    public final void method999() {
        this.field9793.method520(119);
        ++field9754;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIIII)V")
    public final void method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9699;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method3971(-20110);
        this.method3920(arg5, 9770);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9873) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9873) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "()Z")
    public final boolean method899() {
        ++field9664;
        return this.field9799 != null && this.field9799.method1664(1);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
    public final synchronized void method3973(int arg0, byte arg1, int arg2) {
        if (arg1 != -122) {
            this.method973(62, 93, -64, 71, 29, -85);
        }
        ++field9711;
        class405 var4 = new class405(arg0);
        var4.field4108 = (long) arg2;
        this.field9825.method3593(var4, arg1 ^ -119);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(ZI)V")
    public final void method3974(boolean arg0, int arg1) {
        ++field9629;
        if (arg1 != 5) {
            this.method3921(55, 87);
        }
        if (!arg0 != !this.field9895) {
            this.field9895 = arg0;
            this.method3953(-105);
            this.field9837 &= -8;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lod;Lic;)Lmd;")
    public final class649 method878(class539 arg0, class537 arg1) {
        ++field9609;
        return null;
    }

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "()Z")
    public final boolean method903() {
        ++field9713;
        return this.field9873 && (!this.method899() || this.field9948);
    }

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "(Z)V")
    public final void method883(boolean arg0) {
        this.field9919 = arg0;
        ++field9712;
        this.method3967((byte) 84);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLwj;)V")
    public final void method3975(byte arg0, class128 arg1) {
        ++field9594;
        class128 var3 = this.field9930[this.field9911];
        if (arg0 >= 111) {
            if (arg1 != var3) {
                if (arg1 == null) {
                    OpenGL.glDisable(var3.field1710);
                } else {
                    if (var3 == null) {
                        OpenGL.glEnable(arg1.field1710);
                    } else if (~arg1.field1710 != ~var3.field1710) {
                        OpenGL.glDisable(var3.field1710);
                        OpenGL.glEnable(arg1.field1710);
                    }
                    OpenGL.glBindTexture(arg1.field1710, arg1.method750((byte) 65));
                }
                this.field9930[this.field9911] = arg1;
            }
            this.field9837 &= -2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "()I")
    public final int method951() {
        ++field9704;
        return this.field9860;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;")
    public final class589 method920(class589 arg0, class589 arg1, float arg2, class589 arg3) {
        ++field9640;
        if (arg0 != null && arg1 != null && this.field9907 && this.field9880) {
            class21 var5 = null;
            class76 var6 = (class76) arg0;
            class76 var7 = (class76) arg1;
            class528 var8 = var6.method94((byte) 123);
            class528 var9 = var7.method94((byte) -124);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field6706 <= ~var8.field6706 ? var9.field6706 : var8.field6706;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class21) {
                    class21 var11 = (class21) arg3;
                    if (var11.method92((byte) 61) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class21(this, var10);
                }
                if (var5.method96(16619, arg2, var9, var8)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "(I)V")
    private final void method3976(int arg0) {
        if (arg0 >= -3) {
            this.field9802 = null;
        }
        class570.field7210[0] = this.field9901 * this.field9870;
        class570.field7210[1] = this.field9899 * this.field9870;
        ++field9645;
        class570.field7210[2] = this.field9921 * this.field9870;
        class570.field7210[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class570.field7210, 0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIZ)Lpu;")
    public final class772 method955(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field9749;
        return new class634(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lno;I)V")
    public final void method3977(class75 arg0, int arg1) {
        OpenGL.glLoadMatrixf(arg0.method455(91), arg1);
        ++field9617;
    }

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "()Z")
    public final boolean method953() {
        ++field9626;
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public final void method984(boolean arg0) {
        ++field9620;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZB)V")
    public final void method3978(boolean arg0, byte arg1) {
        ++field9598;
        if (this.field9830 != arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field9830 = arg0;
            this.field9837 &= -32;
        }
        if (arg1 < 125) {
            this.field9870 = -1.2943239F;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
    public final void method3979(byte arg0, int arg1) {
        int var3 = -18 / ((arg0 - 5) / 43);
        if (~arg1 != -2) {
            if (arg1 == 0) {
                this.method3917(20, 8448, 8448);
            } else if (arg1 != 2) {
                if (~arg1 == -4) {
                    this.method3917(5, 260, 8448);
                } else if (~arg1 == -5) {
                    this.method3917(95, 34023, 34023);
                }
            } else {
                this.method3917(9, 34165, 7681);
            }
        } else {
            this.method3917(69, 7681, 7681);
        }
        ++field9666;
    }

    @OriginalMember(owner = "client!ck", name = "la", descriptor = "()V")
    public final void method957() {
        this.field9951 = 0;
        this.field9857 = this.field9789;
        ++field9595;
        this.field9869 = 0;
        this.field9922 = this.field9650;
        OpenGL.glDisable(3089);
        this.method3985((byte) 42);
    }

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "()I")
    public final int method950() {
        ++field9639;
        int var1 = this.field9956;
        this.field9956 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "(III[I)V")
    public final void method901(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9656;
        float var5 = (float) arg2 * this.field9831.field1031 + (float) arg0 * this.field9831.field1060 + (float) arg1 * this.field9831.field1063 + this.field9831.field1035;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field9831.field1055 + (float) arg0 * this.field9831.field1043 + (float) arg1 * this.field9831.field1047 + this.field9831.field1051) * (float) this.field9847 / var5);
            arg3[0] = (int) ((float) var6 - this.field9937);
            int var7 = (int) (((float) arg2 * this.field9831.field1037 + (float) arg0 * this.field9831.field1046 + (float) arg1 * this.field9831.field1062 + this.field9831.field1033) * (float) this.field9844 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 - this.field9845);
        }
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
    public final void method939(int arg0) {
        ++field9649;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lpm;IZII)V")
    public final void method3980(class250 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field9716;
        int var6 = arg0.method1632(-124);
        int var7 = arg4 * this.method3916(var6, arg2);
        this.method3919(-103, arg0);
        OpenGL.glDrawElements(arg3, arg1, var6, (long) var7 + arg0.method1629(24497));
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZ[BI)Lpm;")
    public final class250 method3981(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        if (arg4 != 13) {
            this.field9811 = -9;
        }
        ++field9753;
        return (class250) (!this.field9913 || arg2 && !this.field9908 ? new class304(this, arg0, arg3, arg1) : new class448(this, arg0, arg3, arg1, arg2));
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field9727;
        if (arg0 != arg2 || arg1 != arg3) {
            this.method3971(-20110);
            this.method3920(arg5, 9770);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var11 * var12;
            float var14 = var10 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var13;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~var15 < ~arg6) {
                var18 = (float) (-var15 + arg7 + arg6) * var14;
                var19 = (float) (-var15 + arg7 + arg6) * var13;
            } else {
                var20 = (float) (arg6 - var15) * var14;
                var21 = (float) (-var15 + arg6) * var13;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var13;
            while (true) {
                if (~arg2 < ~arg0) {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                }
                if (arg3 <= arg1) {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                } else {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                OpenGL.glEnd();
                var22 += var20 + var24;
                var23 += var21 + var25;
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "za", descriptor = "(IIIII)V")
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9744;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (this.field9951 <= arg0 + arg2 && ~this.field9922 <= ~(-arg2 + arg0) && arg1 + arg2 >= this.field9869 && ~(-arg2 + arg1) >= ~this.field9857) {
            this.method3971(-20110);
            this.method3920(arg4, 9770);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field9875) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field9934 >= (float) var8) {
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
                if (var9 <= 64) {
                    var9 = 64;
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class681.method3659(-126, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class465.field6031[var11] * (float) arg2 + var6, class465.field6033[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIF)Lgu;")
    public final class757 method913(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field9707;
        return new class32(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "(I)V")
    private final void method3982(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field9732;
        OpenGL.glLoadMatrixf(this.field9888, 0);
        if (arg0 >= 80) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ck", name = "HA", descriptor = "(IIII[I)V")
    public final void method923(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field9783;
        float var6 = (float) arg2 * this.field9831.field1031 + (float) arg0 * this.field9831.field1060 + (float) arg1 * this.field9831.field1063 + this.field9831.field1035;
        if (!((float) this.field9860 > var6) && !((float) this.field9906 < var6)) {
            int var7 = (int) (((float) arg2 * this.field9831.field1055 + (float) arg0 * this.field9831.field1043 + (float) arg1 * this.field9831.field1047 + this.field9831.field1051) * (float) this.field9847 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field9831.field1037 + (float) arg0 * this.field9831.field1046 + (float) arg1 * this.field9831.field1062 + this.field9831.field1033) * (float) this.field9844 / (float) arg3);
            if ((float) var7 >= this.field9937 && this.field9886 >= (float) var7 && (float) var8 >= this.field9845 && (float) var8 <= this.field9940) {
                arg4[0] = (int) ((float) var7 - this.field9937);
                arg4[1] = (int) ((float) var8 - this.field9845);
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "()I")
    public final int method893() {
        ++field9670;
        return 4;
    }

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "(I)V")
    private final void method3983(int arg0) {
        if (arg0 != 25340) {
            this.method985();
        }
        ++field9708;
        if (~this.field9894 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field9650 < -1 && ~this.field9789 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field9650, (double) this.field9789, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field9837 &= -25;
            this.field9894 = 1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "KA", descriptor = "(IIII)V")
    public final void method915(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9650 < arg2) {
            arg2 = this.field9650;
        }
        ++field9746;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg3 < ~this.field9789) {
            arg3 = this.field9789;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        this.field9869 = arg1;
        this.field9951 = arg0;
        this.field9857 = arg3;
        this.field9922 = arg2;
        OpenGL.glEnable(3089);
        this.method3985((byte) 105);
        this.method3948(3553);
    }

    @OriginalMember(owner = "client!ck", name = "DA", descriptor = "(IIII)V")
    public final void method967(int arg0, int arg1, int arg2, int arg3) {
        this.field9844 = arg3;
        ++field9788;
        this.field9847 = arg2;
        this.field9867 = arg0;
        this.field9943 = arg1;
        this.method3913(256);
        this.method3985((byte) 75);
        if (~this.field9894 == -4) {
            this.method3963((byte) -110);
        } else if (this.field9894 == 2) {
            this.method3982(120);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lne;[Lvi;Z)Lda;")
    public final class420 method1002(class166 arg0, class388[] arg1, boolean arg2) {
        ++field9776;
        return new class692(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(ILdk;)V")
    public final void method3984(int arg0, class95 arg1) {
        ++field9689;
        if (this.field9813 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field9813 <= -1) {
                this.field9816[this.field9813].method244(-8040);
            }
            this.field9814 = this.field9816[++this.field9813] = arg1;
            this.field9814.method248(true);
            int var3 = 102 / ((arg0 - 29) / 52);
        }
    }

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "()Z")
    public final boolean method992() {
        ++field9768;
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "(B)V")
    private final void method3985(byte arg0) {
        if (arg0 > 30) {
            this.field9937 = (float) (this.field9951 - this.field9867);
            this.field9886 = (float) (-this.field9867 + this.field9922);
            ++field9602;
            this.field9940 = (float) (-this.field9943 + this.field9857);
            this.field9845 = (float) (-this.field9943 + this.field9869);
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(II)V")
    public final void method976(int arg0, int arg1) {
        ++field9623;
        if (~this.field9860 != ~arg0 || this.field9906 != arg1) {
            this.field9860 = arg0;
            this.field9906 = arg1;
            this.method3913(256);
            this.method3937(65280);
            if (~this.field9894 == -4) {
                this.method3963((byte) -113);
                return;
            }
            if (this.field9894 != 2) {
                return;
            }
            this.method3982(96);
        }
    }

    @OriginalMember(owner = "client!ck", name = "da", descriptor = "(III[I)V")
    public final void method987(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9778;
        float var5 = (float) arg2 * this.field9831.field1031 + (float) arg0 * this.field9831.field1060 + (float) arg1 * this.field9831.field1063 + this.field9831.field1035;
        if (!((float) this.field9860 > var5) && !(var5 > (float) this.field9906)) {
            int var6 = (int) (((float) arg2 * this.field9831.field1055 + (float) arg0 * this.field9831.field1043 + (float) arg1 * this.field9831.field1047 + this.field9831.field1051) * (float) this.field9847 / var5);
            int var7 = (int) (((float) arg2 * this.field9831.field1037 + (float) arg0 * this.field9831.field1046 + (float) arg1 * this.field9831.field1062 + this.field9831.field1033) * (float) this.field9844 / var5);
            if ((float) var6 >= this.field9937 && this.field9886 >= (float) var6 && (float) var7 >= this.field9845 && (float) var7 <= this.field9940) {
                arg3[0] = (int) ((float) var6 + -this.field9937);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field9845);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BZ)V")
    public final void method3986(byte arg0, boolean arg1) {
        if (arg0 != -124) {
            this.method3916(-83, true);
        }
        if (!this.field9835 == arg1) {
            this.field9835 = arg1;
            this.method3967((byte) 127);
            this.field9837 &= -32;
        }
        ++field9702;
    }

    @OriginalMember(owner = "client!ck", name = "aa", descriptor = "(IIIIII)V")
    public final void method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9747;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3971(-20110);
        this.method3920(arg5, 9770);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9873) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9873) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIII)V")
    public final void method3987(boolean arg0, int arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg3, arg2, arg1);
        ++field9644;
        if (arg0) {
            this.field9889 = false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ldk;I)V")
    public final void method3988(class95 arg0, int arg1) {
        ++field9741;
        if (arg1 >= -110) {
            this.method3945(-126, true);
        }
        if (this.field9851) {
            this.method3940(arg0, (byte) 108);
            this.method3984(-122, arg0);
        } else if (this.field9812 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field9812 <= -1) {
                this.field9815[this.field9812].method242(13352);
            }
            this.field9818 = this.field9814 = this.field9815[++this.field9812] = arg0;
            this.field9818.method241(-4114);
        }
    }

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "(I)V")
    private final void method3989(int arg0) {
        if (this.field9738 == null) {
            this.field9641 = this.field9616 = 0;
        } else {
            Dimension var2 = this.field9738.getSize();
            this.field9641 = var2.width;
            this.field9616 = var2.height;
        }
        ++field9773;
        if (this.field9814 == null) {
            this.field9789 = this.field9616;
            this.field9650 = this.field9641;
            this.method3955(-3325);
        }
        this.method3927(4733);
        if (arg0 == 4) {
            this.method957();
        }
    }

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "()I")
    public final int method981() {
        ++field9786;
        return this.field9823 - -this.field9820 - -this.field9821;
    }

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "(II)I")
    public final int method3990(int arg0, int arg1) {
        ++field9624;
        int var3 = 121 % ((arg0 - -15) / 51);
        if (~arg1 == -2) {
            return 7681;
        } else if (~arg1 == -1) {
            return 8448;
        } else if (arg1 != 2) {
            if (arg1 != 3) {
                if (~arg1 == -5) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class358 method890(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field9734;
        return new class455(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }
}
