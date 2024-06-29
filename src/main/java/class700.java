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

@OriginalClass("client!pc")
public class class700 extends class66 {

    @OriginalMember(owner = "client!pc", name = "Yb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field9591 = new Hashtable();

    @OriginalMember(owner = "client!pc", name = "oe", descriptor = "I")
    public int field9711 = 128;

    @OriginalMember(owner = "client!pc", name = "se", descriptor = "Lia;")
    private class616 field9715 = new class616();

    @OriginalMember(owner = "client!pc", name = "ze", descriptor = "Lhea;")
    private class446 field9722 = new class446();

    @OriginalMember(owner = "client!pc", name = "Ae", descriptor = "Lhea;")
    public class446 field9723 = new class446();

    @OriginalMember(owner = "client!pc", name = "Ee", descriptor = "I")
    public int field9727 = 3;

    @OriginalMember(owner = "client!pc", name = "Be", descriptor = "I")
    public int field9724 = 8;

    @OriginalMember(owner = "client!pc", name = "He", descriptor = "Z")
    private boolean field9730 = false;

    @OriginalMember(owner = "client!pc", name = "Ge", descriptor = "Lifa;")
    private class450 field9729 = new class450();

    @OriginalMember(owner = "client!pc", name = "Ke", descriptor = "[Lve;")
    private class530[] field9733 = new class530[4];

    @OriginalMember(owner = "client!pc", name = "Qe", descriptor = "[Lve;")
    private class530[] field9739 = new class530[4];

    @OriginalMember(owner = "client!pc", name = "Le", descriptor = "[Lve;")
    private class530[] field9734 = new class530[4];

    @OriginalMember(owner = "client!pc", name = "Pe", descriptor = "I")
    private int field9738 = -1;

    @OriginalMember(owner = "client!pc", name = "Me", descriptor = "I")
    private int field9735 = -1;

    @OriginalMember(owner = "client!pc", name = "Re", descriptor = "I")
    private int field9740 = -1;

    @OriginalMember(owner = "client!pc", name = "Ve", descriptor = "Lifa;")
    private class450 field9744;

    @OriginalMember(owner = "client!pc", name = "We", descriptor = "Lifa;")
    private class450 field9745;

    @OriginalMember(owner = "client!pc", name = "Xe", descriptor = "Lifa;")
    private class450 field9746;

    @OriginalMember(owner = "client!pc", name = "Ye", descriptor = "Lifa;")
    private class450 field9747;

    @OriginalMember(owner = "client!pc", name = "Ze", descriptor = "Lifa;")
    private class450 field9748;

    @OriginalMember(owner = "client!pc", name = "af", descriptor = "Lifa;")
    private class450 field9749;

    @OriginalMember(owner = "client!pc", name = "bf", descriptor = "Lifa;")
    private class450 field9750;

    @OriginalMember(owner = "client!pc", name = "ff", descriptor = "Lhea;")
    public class446 field9754;

    @OriginalMember(owner = "client!pc", name = "mf", descriptor = "Lhea;")
    public class446 field9760;

    @OriginalMember(owner = "client!pc", name = "nf", descriptor = "Lhea;")
    public class446 field9761;

    @OriginalMember(owner = "client!pc", name = "Hf", descriptor = "F")
    public float field9781;

    @OriginalMember(owner = "client!pc", name = "bg", descriptor = "I")
    public int field9801;

    @OriginalMember(owner = "client!pc", name = "rf", descriptor = "I")
    private int field9765;

    @OriginalMember(owner = "client!pc", name = "lg", descriptor = "[F")
    private float[] field9811;

    @OriginalMember(owner = "client!pc", name = "wf", descriptor = "I")
    private int field9770;

    @OriginalMember(owner = "client!pc", name = "mg", descriptor = "I")
    public int field9812;

    @OriginalMember(owner = "client!pc", name = "of", descriptor = "Z")
    private boolean field9762;

    @OriginalMember(owner = "client!pc", name = "Wf", descriptor = "[F")
    private float[] field9796;

    @OriginalMember(owner = "client!pc", name = "ng", descriptor = "F")
    public float field9813;

    @OriginalMember(owner = "client!pc", name = "ag", descriptor = "I")
    public int field9800;

    @OriginalMember(owner = "client!pc", name = "Cf", descriptor = "I")
    public int field9776;

    @OriginalMember(owner = "client!pc", name = "xg", descriptor = "I")
    private int field9823;

    @OriginalMember(owner = "client!pc", name = "sg", descriptor = "I")
    private int field9818;

    @OriginalMember(owner = "client!pc", name = "Ig", descriptor = "I")
    public int field9834;

    @OriginalMember(owner = "client!pc", name = "Fg", descriptor = "Z")
    private boolean field9831;

    @OriginalMember(owner = "client!pc", name = "Gf", descriptor = "F")
    private float field9780;

    @OriginalMember(owner = "client!pc", name = "vf", descriptor = "I")
    public int field9769;

    @OriginalMember(owner = "client!pc", name = "Bf", descriptor = "I")
    private int field9775;

    @OriginalMember(owner = "client!pc", name = "Pf", descriptor = "I")
    private int field9789;

    @OriginalMember(owner = "client!pc", name = "Lg", descriptor = "[F")
    private float[] field9837;

    @OriginalMember(owner = "client!pc", name = "Eg", descriptor = "F")
    public float field9830;

    @OriginalMember(owner = "client!pc", name = "yg", descriptor = "I")
    public int field9824;

    @OriginalMember(owner = "client!pc", name = "Of", descriptor = "F")
    public float field9788;

    @OriginalMember(owner = "client!pc", name = "ig", descriptor = "I")
    private int field9808;

    @OriginalMember(owner = "client!pc", name = "hg", descriptor = "F")
    private float field9807;

    @OriginalMember(owner = "client!pc", name = "ug", descriptor = "F")
    public float field9820;

    @OriginalMember(owner = "client!pc", name = "Tg", descriptor = "F")
    private float field9845;

    @OriginalMember(owner = "client!pc", name = "Vg", descriptor = "I")
    public int field9847;

    @OriginalMember(owner = "client!pc", name = "Zf", descriptor = "[F")
    private float[] field9799;

    @OriginalMember(owner = "client!pc", name = "fh", descriptor = "F")
    public float field9857;

    @OriginalMember(owner = "client!pc", name = "Jg", descriptor = "I")
    private int field9835;

    @OriginalMember(owner = "client!pc", name = "fg", descriptor = "I")
    public int field9805;

    @OriginalMember(owner = "client!pc", name = "eh", descriptor = "I")
    public int field9856;

    @OriginalMember(owner = "client!pc", name = "Rf", descriptor = "I")
    private int field9791;

    @OriginalMember(owner = "client!pc", name = "oh", descriptor = "[Lkp;")
    private class515[] field9866;

    @OriginalMember(owner = "client!pc", name = "rh", descriptor = "[F")
    public float[] field9869;

    @OriginalMember(owner = "client!pc", name = "kh", descriptor = "F")
    public float field9862;

    @OriginalMember(owner = "client!pc", name = "lh", descriptor = "F")
    private float field9863;

    @OriginalMember(owner = "client!pc", name = "dh", descriptor = "I")
    public int field9855;

    @OriginalMember(owner = "client!pc", name = "uh", descriptor = "I")
    private int field9872;

    @OriginalMember(owner = "client!pc", name = "dg", descriptor = "F")
    private float field9803;

    @OriginalMember(owner = "client!pc", name = "Ff", descriptor = "Lwja;")
    public class283 field9779;

    @OriginalMember(owner = "client!pc", name = "vh", descriptor = "[I")
    public int[] field9873;

    @OriginalMember(owner = "client!pc", name = "wh", descriptor = "[I")
    public int[] field9874;

    @OriginalMember(owner = "client!pc", name = "yh", descriptor = "[I")
    public int[] field9876;

    @OriginalMember(owner = "client!pc", name = "zh", descriptor = "[B")
    public byte[] field9877;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9533;

    @OriginalMember(owner = "client!pc", name = "Kd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9681;

    @OriginalMember(owner = "client!pc", name = "xe", descriptor = "I")
    public int field9720;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field9543;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "J")
    private long field9513;

    @OriginalMember(owner = "client!pc", name = "vb", descriptor = "J")
    private long field9562;

    @OriginalMember(owner = "client!pc", name = "yf", descriptor = "Z")
    public boolean field9772;

    @OriginalMember(owner = "client!pc", name = "Ef", descriptor = "I")
    public int field9778;

    @OriginalMember(owner = "client!pc", name = "tg", descriptor = "Ljava/lang/String;")
    private String field9819;

    @OriginalMember(owner = "client!pc", name = "ih", descriptor = "Z")
    private boolean field9860;

    @OriginalMember(owner = "client!pc", name = "Tf", descriptor = "Z")
    public boolean field9793;

    @OriginalMember(owner = "client!pc", name = "Jf", descriptor = "Z")
    public boolean field9783;

    @OriginalMember(owner = "client!pc", name = "Qg", descriptor = "Z")
    public boolean field9842;

    @OriginalMember(owner = "client!pc", name = "Rg", descriptor = "Z")
    public boolean field9843;

    @OriginalMember(owner = "client!pc", name = "Uf", descriptor = "Z")
    private boolean field9794;

    @OriginalMember(owner = "client!pc", name = "qg", descriptor = "Ljava/lang/String;")
    private String field9816;

    @OriginalMember(owner = "client!pc", name = "Pg", descriptor = "Z")
    public boolean field9841;

    @OriginalMember(owner = "client!pc", name = "sh", descriptor = "Z")
    private boolean field9870;

    @OriginalMember(owner = "client!pc", name = "me", descriptor = "Lbp;")
    private class406 field9709;

    @OriginalMember(owner = "client!pc", name = "Fe", descriptor = "Lq;")
    public class451 field9728;

    @OriginalMember(owner = "client!pc", name = "pe", descriptor = "Lkj;")
    private class593 field9712;

    @OriginalMember(owner = "client!pc", name = "qe", descriptor = "Lfka;")
    private class742 field9713;

    @OriginalMember(owner = "client!pc", name = "ve", descriptor = "Llr;")
    private class784 field9718;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Lps;")
    public static class105 field9521 = new class105();

    @OriginalMember(owner = "client!pc", name = "cd", descriptor = "Llja;")
    public static class744 field9647 = new class744(84, -1);

    @OriginalMember(owner = "client!pc", name = "ge", descriptor = "Llja;")
    public static class744 field9703 = new class744(54, 8);

    @OriginalMember(owner = "client!pc", name = "zf", descriptor = "F")
    public float field9773;

    @OriginalMember(owner = "client!pc", name = "Mf", descriptor = "F")
    private float field9786;

    @OriginalMember(owner = "client!pc", name = "Sf", descriptor = "F")
    public float field9792;

    @OriginalMember(owner = "client!pc", name = "gg", descriptor = "F")
    private float field9806;

    @OriginalMember(owner = "client!pc", name = "Dg", descriptor = "F")
    public float field9829;

    @OriginalMember(owner = "client!pc", name = "Yg", descriptor = "F")
    public float field9850;

    @OriginalMember(owner = "client!pc", name = "bh", descriptor = "F")
    public float field9853;

    @OriginalMember(owner = "client!pc", name = "ch", descriptor = "F")
    public float field9854;

    @OriginalMember(owner = "client!pc", name = "th", descriptor = "F")
    private float field9871;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field9511;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field9519;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field9525;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private int field9530;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public int field9535;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!pc", name = "ub", descriptor = "I")
    public static int field9561;

    @OriginalMember(owner = "client!pc", name = "wb", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!pc", name = "xb", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!pc", name = "yb", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!pc", name = "zb", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!pc", name = "Ab", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!pc", name = "Bb", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!pc", name = "Cb", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!pc", name = "Db", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!pc", name = "Eb", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!pc", name = "Fb", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!pc", name = "Gb", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!pc", name = "Hb", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!pc", name = "Ib", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!pc", name = "Jb", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!pc", name = "Kb", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!pc", name = "Lb", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!pc", name = "Mb", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!pc", name = "Nb", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!pc", name = "Ob", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!pc", name = "Pb", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!pc", name = "Qb", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!pc", name = "Rb", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!pc", name = "Sb", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!pc", name = "Tb", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!pc", name = "Ub", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!pc", name = "Vb", descriptor = "I")
    public static int field9588;

    @OriginalMember(owner = "client!pc", name = "Wb", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!pc", name = "Xb", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!pc", name = "Zb", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!pc", name = "ac", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!pc", name = "bc", descriptor = "I")
    public static int field9594;

    @OriginalMember(owner = "client!pc", name = "cc", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!pc", name = "dc", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!pc", name = "ec", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!pc", name = "fc", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!pc", name = "gc", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!pc", name = "hc", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!pc", name = "ic", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!pc", name = "jc", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!pc", name = "kc", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!pc", name = "lc", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!pc", name = "mc", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!pc", name = "nc", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!pc", name = "oc", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!pc", name = "pc", descriptor = "I")
    public int field9608;

    @OriginalMember(owner = "client!pc", name = "qc", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!pc", name = "rc", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!pc", name = "sc", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!pc", name = "tc", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!pc", name = "uc", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!pc", name = "vc", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!pc", name = "wc", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!pc", name = "xc", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!pc", name = "yc", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!pc", name = "zc", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!pc", name = "Ac", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!pc", name = "Bc", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!pc", name = "Cc", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!pc", name = "Dc", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!pc", name = "Ec", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!pc", name = "Fc", descriptor = "I")
    public static int field9624;

    @OriginalMember(owner = "client!pc", name = "Gc", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!pc", name = "Hc", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!pc", name = "Ic", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!pc", name = "Jc", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!pc", name = "Kc", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!pc", name = "Lc", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!pc", name = "Mc", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!pc", name = "Nc", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!pc", name = "Oc", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!pc", name = "Pc", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!pc", name = "Qc", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!pc", name = "Rc", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!pc", name = "Sc", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!pc", name = "Tc", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!pc", name = "Uc", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!pc", name = "Vc", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!pc", name = "Wc", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!pc", name = "Xc", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!pc", name = "Yc", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!pc", name = "Zc", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!pc", name = "ad", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!pc", name = "bd", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!pc", name = "dd", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!pc", name = "ed", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!pc", name = "fd", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!pc", name = "gd", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!pc", name = "hd", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!pc", name = "id", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!pc", name = "jd", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!pc", name = "kd", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!pc", name = "ld", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!pc", name = "md", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!pc", name = "nd", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!pc", name = "od", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!pc", name = "pd", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!pc", name = "qd", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!pc", name = "rd", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!pc", name = "sd", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!pc", name = "td", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!pc", name = "ud", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!pc", name = "vd", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!pc", name = "wd", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!pc", name = "xd", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!pc", name = "yd", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!pc", name = "zd", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!pc", name = "Ad", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!pc", name = "Bd", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!pc", name = "Cd", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!pc", name = "Dd", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!pc", name = "Ed", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!pc", name = "Fd", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!pc", name = "Gd", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!pc", name = "Hd", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!pc", name = "Id", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!pc", name = "Jd", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!pc", name = "Ld", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!pc", name = "Md", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!pc", name = "Nd", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!pc", name = "Od", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!pc", name = "Pd", descriptor = "I")
    private int field9686;

    @OriginalMember(owner = "client!pc", name = "Qd", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!pc", name = "Rd", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!pc", name = "Sd", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!pc", name = "Td", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!pc", name = "Ud", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!pc", name = "Vd", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!pc", name = "Wd", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!pc", name = "Xd", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!pc", name = "Yd", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!pc", name = "Zd", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!pc", name = "ae", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!pc", name = "be", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!pc", name = "ce", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!pc", name = "de", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!pc", name = "ee", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!pc", name = "fe", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!pc", name = "he", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!pc", name = "ie", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!pc", name = "je", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!pc", name = "ke", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!pc", name = "le", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!pc", name = "ne", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!pc", name = "re", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!pc", name = "te", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!pc", name = "ue", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!pc", name = "we", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!pc", name = "ye", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!pc", name = "De", descriptor = "I")
    public int field9726;

    @OriginalMember(owner = "client!pc", name = "Se", descriptor = "I")
    public int field9741;

    @OriginalMember(owner = "client!pc", name = "Te", descriptor = "I")
    public int field9742;

    @OriginalMember(owner = "client!pc", name = "Ue", descriptor = "I")
    private int field9743;

    @OriginalMember(owner = "client!pc", name = "df", descriptor = "I")
    private int field9752;

    @OriginalMember(owner = "client!pc", name = "ef", descriptor = "I")
    private int field9753;

    @OriginalMember(owner = "client!pc", name = "gf", descriptor = "I")
    private int field9755;

    @OriginalMember(owner = "client!pc", name = "qf", descriptor = "I")
    private int field9764;

    @OriginalMember(owner = "client!pc", name = "Kf", descriptor = "I")
    public int field9784;

    @OriginalMember(owner = "client!pc", name = "Lf", descriptor = "I")
    public int field9785;

    @OriginalMember(owner = "client!pc", name = "Nf", descriptor = "I")
    private int field9787;

    @OriginalMember(owner = "client!pc", name = "Qf", descriptor = "I")
    private int field9790;

    @OriginalMember(owner = "client!pc", name = "Xf", descriptor = "I")
    public int field9797;

    @OriginalMember(owner = "client!pc", name = "Yf", descriptor = "I")
    public int field9798;

    @OriginalMember(owner = "client!pc", name = "cg", descriptor = "I")
    private int field9802;

    @OriginalMember(owner = "client!pc", name = "eg", descriptor = "I")
    private int field9804;

    @OriginalMember(owner = "client!pc", name = "kg", descriptor = "I")
    private int field9810;

    @OriginalMember(owner = "client!pc", name = "hh", descriptor = "I")
    private int field9859;

    @OriginalMember(owner = "client!pc", name = "ph", descriptor = "I")
    private int field9867;

    @OriginalMember(owner = "client!pc", name = "xh", descriptor = "I")
    private int field9875;

    @OriginalMember(owner = "client!pc", name = "Ah", descriptor = "I")
    private int field9878;

    @OriginalMember(owner = "client!pc", name = "kf", descriptor = "J")
    private long field9758;

    @OriginalMember(owner = "client!pc", name = "sf", descriptor = "Lld;")
    public class182 field9766;

    @OriginalMember(owner = "client!pc", name = "Ie", descriptor = "Lvda;")
    private class195 field9731;

    @OriginalMember(owner = "client!pc", name = "Cg", descriptor = "Lvda;")
    public class195 field9828;

    @OriginalMember(owner = "client!pc", name = "wg", descriptor = "Lrha;")
    private class235 field9822;

    @OriginalMember(owner = "client!pc", name = "Je", descriptor = "Lkv;")
    private class284 field9732;

    @OriginalMember(owner = "client!pc", name = "Gg", descriptor = "Len;")
    private class339 field9832;

    @OriginalMember(owner = "client!pc", name = "qh", descriptor = "Len;")
    private class339 field9868;

    @OriginalMember(owner = "client!pc", name = "pf", descriptor = "Ldf;")
    public class421 field9763;

    @OriginalMember(owner = "client!pc", name = "Df", descriptor = "Ldf;")
    public class421 field9777;

    @OriginalMember(owner = "client!pc", name = "If", descriptor = "Ldf;")
    public class421 field9782;

    @OriginalMember(owner = "client!pc", name = "jg", descriptor = "Ldf;")
    public class421 field9809;

    @OriginalMember(owner = "client!pc", name = "vg", descriptor = "Ldf;")
    public class421 field9821;

    @OriginalMember(owner = "client!pc", name = "Ag", descriptor = "Ldf;")
    public class421 field9826;

    @OriginalMember(owner = "client!pc", name = "Bg", descriptor = "Ldf;")
    public class421 field9827;

    @OriginalMember(owner = "client!pc", name = "Mg", descriptor = "Ldf;")
    public class421 field9838;

    @OriginalMember(owner = "client!pc", name = "ah", descriptor = "Ldf;")
    public class421 field9852;

    @OriginalMember(owner = "client!pc", name = "jh", descriptor = "Ldf;")
    public class421 field9861;

    @OriginalMember(owner = "client!pc", name = "xf", descriptor = "Lbia;")
    private class525 field9771;

    @OriginalMember(owner = "client!pc", name = "Ne", descriptor = "Lve;")
    private class530 field9736;

    @OriginalMember(owner = "client!pc", name = "Oe", descriptor = "Lve;")
    private class530 field9737;

    @OriginalMember(owner = "client!pc", name = "tf", descriptor = "Lsf;")
    public class550 field9767;

    @OriginalMember(owner = "client!pc", name = "rg", descriptor = "Lsf;")
    public class550 field9817;

    @OriginalMember(owner = "client!pc", name = "Og", descriptor = "Lqt;")
    private class664 field9840;

    @OriginalMember(owner = "client!pc", name = "Ce", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9725;

    @OriginalMember(owner = "client!pc", name = "cf", descriptor = "Z")
    private boolean field9751;

    @OriginalMember(owner = "client!pc", name = "hf", descriptor = "Z")
    private boolean field9756;

    @OriginalMember(owner = "client!pc", name = "jf", descriptor = "Z")
    private boolean field9757;

    @OriginalMember(owner = "client!pc", name = "lf", descriptor = "Z")
    private boolean field9759;

    @OriginalMember(owner = "client!pc", name = "uf", descriptor = "Z")
    public boolean field9768;

    @OriginalMember(owner = "client!pc", name = "Af", descriptor = "Z")
    public boolean field9774;

    @OriginalMember(owner = "client!pc", name = "Vf", descriptor = "Z")
    public boolean field9795;

    @OriginalMember(owner = "client!pc", name = "og", descriptor = "Z")
    private boolean field9814;

    @OriginalMember(owner = "client!pc", name = "pg", descriptor = "Z")
    private boolean field9815;

    @OriginalMember(owner = "client!pc", name = "zg", descriptor = "Z")
    private boolean field9825;

    @OriginalMember(owner = "client!pc", name = "Hg", descriptor = "Z")
    public boolean field9833;

    @OriginalMember(owner = "client!pc", name = "Kg", descriptor = "Z")
    private boolean field9836;

    @OriginalMember(owner = "client!pc", name = "Sg", descriptor = "Z")
    public boolean field9844;

    @OriginalMember(owner = "client!pc", name = "Ug", descriptor = "Z")
    public boolean field9846;

    @OriginalMember(owner = "client!pc", name = "Wg", descriptor = "Z")
    private boolean field9848;

    @OriginalMember(owner = "client!pc", name = "Xg", descriptor = "Z")
    private boolean field9849;

    @OriginalMember(owner = "client!pc", name = "Zg", descriptor = "Z")
    public boolean field9851;

    @OriginalMember(owner = "client!pc", name = "gh", descriptor = "Z")
    public boolean field9858;

    @OriginalMember(owner = "client!pc", name = "mh", descriptor = "Z")
    public boolean field9864;

    @OriginalMember(owner = "client!pc", name = "nh", descriptor = "Z")
    private boolean field9865;

    @OriginalMember(owner = "client!pc", name = "Ng", descriptor = "[Lfha;")
    private class400[] field9839;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(BI)V")
    public final void method3888(byte arg0, int arg1) {
        if (arg0 <= 1) {
            this.field9795 = false;
        }
        if (this.field9755 != arg1) {
            boolean var3;
            byte var4;
            boolean var5;
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 == 128) {
                        var3 = true;
                        var4 = 3;
                        var5 = true;
                    } else {
                        var5 = true;
                        var4 = 0;
                        var3 = false;
                    }
                } else {
                    var3 = false;
                    var5 = true;
                    var4 = 2;
                }
            } else {
                var3 = true;
                var4 = 1;
                var5 = true;
            }
            if (this.field9759 != var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field9759 = var5;
            }
            if (!var3 == this.field9756) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field9756 = var3;
            }
            if (this.field9752 != var4) {
                if (var4 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var4 == 2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (~var4 != -4) {
                    OpenGL.glDisable(3042);
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                }
                this.field9752 = var4;
            }
            this.field9755 = arg1;
            this.field9753 &= -29;
        }
        ++field9601;
    }

    @OriginalMember(owner = "client!pc", name = "pa", descriptor = "()V")
    public final void method564() {
        ++field9522;
        this.field9851 = false;
    }

    @OriginalMember(owner = "client!pc", name = "ra", descriptor = "(IIII)V")
    public final void method560(int arg0, int arg1, int arg2, int arg3) {
        this.field9805 = arg2;
        this.field9800 = arg3;
        this.field9851 = true;
        this.field9847 = arg1;
        ++field9704;
        this.field9797 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public final void method3889(int arg0, int arg1, int arg2) {
        this.field9808 = arg0;
        ++field9545;
        this.field9791 = arg2;
        this.method3939((byte) -125);
        if (arg1 != -1) {
            this.method3893(68);
        }
        this.method3954(95);
    }

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "()V")
    public final void method647() {
        ++field9629;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lve;I)V")
    public final void method3890(class530 arg0, int arg1) {
        ++field9577;
        if (arg1 == -12737) {
            if (this.field9740 >= 0 && this.field9733[this.field9740] == arg0) {
                this.field9733[this.field9740--] = null;
                arg0.method1279(arg1 + -13331);
                if (this.field9740 >= 0) {
                    this.field9736 = this.field9733[this.field9740];
                    this.field9736.method1281((byte) 127);
                } else {
                    this.field9736 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lso;IIII)Lka;")
    public final class498 method567(class496 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9617;
        return new class421(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "()I")
    public final int method616() {
        ++field9531;
        return this.field9741 - (-this.field9743 + -this.field9742);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[Lkp;)V")
    public final void method587(int arg0, class515[] arg1) {
        ++field9625;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field9866[var3] = arg1[var3];
        }
        this.field9859 = arg0;
        if (this.field9867 != 1) {
            this.method3899(115);
        }
    }

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "()Z")
    public final boolean method54() {
        ++field9538;
        return this.field9713 != null && this.field9713.method3305(48);
    }

    @OriginalMember(owner = "client!pc", name = "EA", descriptor = "(IIII)V")
    public final void method555(int arg0, int arg1, int arg2, int arg3) {
        ++field9655;
        if (!this.field9851) {
            throw new RuntimeException("");
        } else {
            this.field9800 = arg3;
            this.field9797 = arg0;
            this.field9847 = arg1;
            this.field9805 = arg2;
            if (this.field9762) {
                this.field9718.field10815.method177(-103);
                this.field9718.field10815.method182(-71);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    private final void method3891(int arg0) {
        if (arg0 <= 18) {
            this.method3948((byte) 39, 12, -108, (byte[]) null, true);
        }
        ++field9698;
        this.field9543.method3691();
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Lza;")
    public final class435 method585(int arg0) {
        ++field9613;
        class190 var2 = new class190(arg0);
        this.field9729.method2732(var2, 21939);
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
    public final void method3892(boolean arg0, int arg1) {
        if (arg1 != 1) {
            this.field9874 = null;
        }
        if (!this.field9825 != !arg0) {
            this.field9825 = arg0;
            this.method3910(2896);
            this.field9753 &= -8;
        }
        ++field9607;
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "(I)V")
    private final void method3893(int arg0) {
        if (arg0 == 0) {
            if (this.field9867 != 1) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (this.field9608 > 0 && ~this.field9535 < -1) {
                    OpenGL.glOrtho(0.0D, (double) this.field9608, (double) this.field9535, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field9753 &= -25;
                this.field9867 = 1;
            }
            ++field9671;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V")
    public final void method40(int arg0, int arg1, int arg2, int arg3) {
        this.field9712.method3397((byte) -122, arg0, arg3, arg1, arg2);
        ++field9566;
    }

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "(I)V")
    public final void method3894(int arg0) {
        ++field9638;
        OpenGL.glLightfv(16384, 4611, this.field9869, 0);
        OpenGL.glLightfv(16385, 4611, this.field9799, 0);
        if (arg0 != -18017) {
            this.method3953(40, -43);
        }
    }

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "(III[I)V")
    public final void method570(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9676;
        float var5 = (float) arg2 * this.field9754.field5977 + (float) arg0 * this.field9754.field6007 + (float) arg1 * this.field9754.field5983 + this.field9754.field5995;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field9754.field5999 + (float) arg0 * this.field9754.field5987 + (float) arg1 * this.field9754.field5976 + this.field9754.field5993) * (float) this.field9855 / var5);
            int var7 = (int) (((float) arg2 * this.field9754.field5981 + (float) arg0 * this.field9754.field5986 + (float) arg1 * this.field9754.field5982 + this.field9754.field5969) * (float) this.field9776 / var5);
            arg3[0] = (int) ((float) var6 - this.field9853);
            arg3[1] = (int) ((float) var7 + -this.field9792);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "()V")
    public final void method53() {
        ++field9624;
        for (class379 var1 = this.field9729.method2725(37); var1 != null; var1 = this.field9729.method2726(-118)) {
            ((class190) var1).method1249(-22897);
        }
        if (this.field9712 != null) {
            this.field9712.method3401((byte) -111);
        }
        if (this.field9543 != null) {
            this.method3891(123);
            Enumeration var2 = this.field9591.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field9591.get(var3);
                this.field9543.releaseSurface(var3, var4);
            }
            this.field9543.release();
            this.field9543 = null;
        }
        if (this.field9730) {
            class738.method4150(true, false, 0);
            this.field9730 = false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
    private final int method3895(byte arg0) {
        ++field9576;
        int var2 = 0;
        this.field9816 = OpenGL.glGetString(7936).toLowerCase();
        this.field9819 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field9816.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field9816.indexOf("brian paul") != 0 || ~this.field9816.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class708.method4017(' ', (byte) 32, var3.replace('.', ' '));
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class445.method2623(0, var4[0]);
                int var6 = class445.method2623(0, var4[1]);
                this.field9787 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field9787 < 12) {
            var2 |= 2;
        }
        if (!this.field9543.method3689("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field9543.method3689("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field9798 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field9764 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field9804 = var7[0];
        if (this.field9798 < 2 || this.field9764 < 2 || this.field9804 < 2) {
            var2 |= 16;
        }
        this.field9772 = Stream.method3985();
        this.field9865 = this.field9543.arePbuffersAvailable();
        this.field9860 = this.field9543.method3689("GL_ARB_vertex_buffer_object");
        this.field9815 = this.field9543.method3689("GL_ARB_multisample");
        this.field9833 = this.field9543.method3689("GL_ARB_vertex_program");
        this.field9543.method3689("GL_ARB_fragment_program");
        this.field9774 = this.field9543.method3689("GL_ARB_vertex_shader");
        this.field9768 = this.field9543.method3689("GL_ARB_fragment_shader");
        if (arg0 < 64) {
            this.method572(-59, -33, 98, -69, 80, -11, 10);
        }
        this.field9793 = this.field9543.method3689("GL_EXT_texture3D");
        this.field9842 = this.field9543.method3689("GL_ARB_texture_rectangle");
        this.field9858 = this.field9543.method3689("GL_ARB_texture_cube_map");
        this.field9783 = this.field9543.method3689("GL_ARB_texture_float");
        this.field9846 = false;
        this.field9841 = this.field9543.method3689("GL_EXT_framebuffer_object");
        this.field9795 = this.field9543.method3689("GL_EXT_framebuffer_blit");
        this.field9864 = this.field9543.method3689("GL_EXT_framebuffer_multisample");
        this.field9849 = this.field9864 & this.field9795;
        this.field9844 = class329.field4066.startsWith("mac");
        OpenGL.glGetFloatv(2834, class36.field544, 0);
        this.field9845 = class36.field544[0];
        this.field9803 = class36.field544[1];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Laf;I)V")
    public final void method590(class460 arg0, int arg1) {
        ++field9602;
        this.field9715.method3486(this, 52, arg1, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIIIZ)Ltf;")
    public final class312 method652(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9588;
        return new class284(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbia;I)V")
    public final void method3896(class525 arg0, int arg1) {
        if (arg1 == -204) {
            if (this.field9771 != arg0) {
                if (this.field9860) {
                    OpenGL.glBindBufferARB(34963, arg0.method1321(-124));
                }
                this.field9771 = arg0;
            }
            ++field9694;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method92(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class677 {
        this.method5(arg2, arg3);
        ++field9650;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field9526;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            this.method3930(1);
            this.method3888((byte) 78, arg5);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var13 = arg8 % (arg7 - -arg6);
            float var14 = var11 * var12;
            float var15 = var10 * var12;
            float var16 = (float) arg6 * var15;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (var13 > arg6) {
                var19 = (float) (arg6 + arg7 + -var13) * var14;
                var18 = (float) (-var13 + arg7 + arg6) * var15;
            } else {
                var20 = (float) (-var13 + arg6) * var15;
                var21 = (float) (-var13 + arg6) * var14;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var15;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (arg2 <= arg0) {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (~arg1 > ~arg3) {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 - var23;
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
                var23 += var21 + var25;
                OpenGL.glEnd();
                var22 += var20 + var24;
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILhea;)V")
    public final void method3897(int arg0, class446 arg1) {
        ++field9570;
        OpenGL.glLoadMatrixf(arg1.method2633((byte) 48), arg0);
    }

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "(I)V")
    private final void method3898(int arg0) {
        ++field9628;
        this.field9839 = new class400[this.field9798];
        this.field9766 = new class182(this, 3553, 6408, 1, arg0);
        new class182(this, 3553, 6408, 1, 1);
        new class182(this, 3553, 6408, 1, 1);
        this.field9782 = new class421(this);
        this.field9861 = new class421(this);
        this.field9852 = new class421(this);
        this.field9826 = new class421(this);
        this.field9838 = new class421(this);
        this.field9827 = new class421(this);
        this.field9763 = new class421(this);
        this.field9809 = new class421(this);
        this.field9821 = new class421(this);
        this.field9777 = new class421(this);
        if (this.field9841) {
            this.field9828 = new class195(this);
            new class195(this);
        }
    }

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "(I)V")
    private final void method3899(int arg0) {
        ++field9575;
        if (arg0 > 101) {
            int var2;
            for (var2 = 0; this.field9859 > var2; ++var2) {
                class515 var3 = this.field9866[var2];
                int var4 = 16386 - -var2;
                class538.field7577[0] = (float) var3.method3084(0);
                class538.field7577[1] = (float) var3.method3086((byte) -99);
                class538.field7577[2] = (float) var3.method3085(true);
                class538.field7577[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class538.field7577, 0);
                int var5 = var3.method3089(25215);
                float var6 = var3.method3083(126) / 255.0F;
                class538.field7577[2] = var6 * (float) class296.method1733(255, var5);
                class538.field7577[0] = (float) (class296.method1733(16772189, var5) >> 16) * var6;
                class538.field7577[1] = var6 * (float) (class296.method1733(var5, 65486) >> 8);
                OpenGL.glLightfv(var4, 4609, class538.field7577, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3088(21915) * var3.method3088(21915)));
                OpenGL.glEnable(var4);
            }
            while (var2 < this.field9802) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field9802 = this.field9859;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(BI)I")
    public final int method3900(byte arg0, int arg1) {
        if (arg0 < 61) {
            this.method65((class645) null, (class645) null, -0.174043F, (class645) null);
        }
        ++field9618;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (arg1 != 6410 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 != 6408 && arg1 != 34847) {
                    if (arg1 != 34843) {
                        if (arg1 != 34842) {
                            if (arg1 != 6402) {
                                if (~arg1 == -6402) {
                                    return 1;
                                } else {
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

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
    public final synchronized void method56(int arg0) {
        ++field9537;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field9745.method2724((byte) 109)) {
            class365 var12 = (class365) this.field9745.method2730(-31260);
            class721.field10130[var2++] = (int) var12.field4809;
            this.field9741 -= var12.field4537;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class721.field10130, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class721.field10130, 0);
            var2 = 0;
        }
        while (!this.field9746.method2724((byte) 75)) {
            class365 var11 = (class365) this.field9746.method2730(-31260);
            class721.field10130[var2++] = (int) var11.field4809;
            this.field9742 -= var11.field4537;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class721.field10130, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class721.field10130, 0);
            var2 = 0;
        }
        while (!this.field9747.method2724((byte) 127)) {
            class365 var10 = (class365) this.field9747.method2730(-31260);
            class721.field10130[var2++] = var10.field4537;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class721.field10130, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class721.field10130, 0);
            var2 = 0;
        }
        while (!this.field9748.method2724((byte) -59)) {
            class365 var9 = (class365) this.field9748.method2730(-31260);
            class721.field10130[var2++] = (int) var9.field4809;
            this.field9743 -= var9.field4537;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class721.field10130, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class721.field10130, 0);
            boolean var4 = false;
        }
        while (!this.field9744.method2724((byte) 54)) {
            class365 var8 = (class365) this.field9744.method2730(-31260);
            OpenGL.glDeleteLists((int) var8.field4809, var8.field4537);
        }
        while (!this.field9749.method2724((byte) -93)) {
            class379 var7 = this.field9749.method2730(-31260);
            OpenGL.glDeleteProgramARB((int) var7.field4809);
        }
        while (!this.field9750.method2724((byte) 59)) {
            class379 var6 = this.field9750.method2730(-31260);
            OpenGL.glDeleteObjectARB(var6.field4809);
        }
        while (!this.field9744.method2724((byte) 48)) {
            class365 var5 = (class365) this.field9744.method2730(-31260);
            OpenGL.glDeleteLists((int) var5.field4809, var5.field4537);
        }
        this.field9709.method2435(25410);
        if (~this.method616() < -100663297 && class349.method2069(true) > this.field9758 + 60000L) {
            System.gc();
            this.field9758 = class349.method2069(true);
        }
        this.field9726 = var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
    public final void method3901(int arg0, boolean arg1) {
        ++field9597;
        this.method3966(arg0, (byte) 122, true);
        if (arg1) {
            this.method3909(-8, -110);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)V")
    private final void method3902(boolean arg0) {
        this.field9837[10] = this.field9871;
        ++field9708;
        if (arg0) {
            this.field9837[14] = this.field9806;
            this.field9820 = (this.field9837[14] + (float) (-this.field9818)) / this.field9837[10];
            this.field9862 = (float) this.field9818;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIII)V")
    public final void method3903(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= -104) {
            OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
            ++field9697;
            OpenGL.glTexEnvi(8960, 34192 - -arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBZ[BI)Len;")
    public final class339 method3904(int arg0, byte arg1, boolean arg2, byte[] arg3, int arg4) {
        if (arg1 != 124) {
            this.field9733 = null;
        }
        ++field9702;
        return (class339) (!this.field9860 || arg2 && !this.field9794 ? new class347(this, arg4, arg3, arg0) : new class50(this, arg4, arg3, arg0, arg2));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZIZ)V")
    public final void method3905(int arg0, boolean arg1, int arg2, boolean arg3) {
        int var5 = 44 % ((-23 - arg2) / 48);
        if (this.field9790 != arg0 || this.field9851 != this.field9762) {
            class182 var6 = null;
            int var7 = 0;
            byte var8 = 0;
            int var9 = 0;
            int var10 = !this.field9851 ? 0 : 3;
            if (arg0 < 0) {
                this.method3918(28366);
            } else {
                var6 = this.field9709.method2436((byte) -128, arg0);
                class359 var11 = super.field890.method1138(arg0, 115);
                if (var11.field4444 == 0 && ~var11.field4449 == -1) {
                    this.method3918(28366);
                } else {
                    int var12 = var11.field4451 ? 64 : 128;
                    int var13 = var12 * 50;
                    this.method3947((float) (this.field9726 % var13 * var11.field4449) / (float) var13, (float) (this.field9726 % var13 * var11.field4444) / (float) var13, false, 0.0F);
                }
                if (!this.field9851) {
                    var8 = var11.field4445;
                    var10 = var11.field4459;
                    var9 = var11.field4456;
                }
                var7 = var11.field4450;
            }
            this.field9718.method4348(var9, arg3, arg1, (byte) -90, var8, var10);
            if (!this.field9718.method4345(var7, var6, 2)) {
                this.method3936(false, var6);
                this.method3932(var7, (byte) 71);
            }
            this.field9762 = this.field9851;
            this.field9790 = arg0;
        }
        ++field9549;
        this.field9753 &= -8;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljia;)V")
    public final void method558(class645 arg0) {
        this.field9822 = (class235) arg0;
        ++field9557;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ZI)V")
    public final void method3906(boolean arg0, int arg1) {
        if (this.field9757 != arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field9753 &= -32;
            this.field9757 = arg0;
        }
        ++field9546;
        if (arg1 != 32884) {
            this.method3928(57, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!pc", name = "XA", descriptor = "()I")
    public final int method568() {
        ++field9581;
        return this.field9818;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lcr;Z)Ltf;")
    public final class312 method640(class600 arg0, boolean arg1) {
        ++field9649;
        int[] var3 = new int[arg0.field8123 * arg0.field8116];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field8119 != null) {
            for (int var6 = 0; arg0.field8116 > var6; ++var6) {
                for (int var7 = 0; arg0.field8123 > var7; ++var7) {
                    var3[var5++] = class5.method105(arg0.field8119[var4] << 24, arg0.field8120[class296.method1733(255, arg0.field8122[var4])]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field8116 > var8; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field8123; ++var10) {
                    int var11 = arg0.field8120[255 & arg0.field8122[var4++]];
                    var3[var5++] = var11 == 0 ? 0 : class5.method105(-16777216, var11);
                }
            }
        }
        class312 var9 = this.method623(var3, arg0.field8116, 1, arg0.field8123, arg0.field8123, 0);
        var9.method1632(arg0.field8118, arg0.field8124, arg0.field8121, arg0.field8117);
        return var9;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
    public final synchronized void method3907(int arg0, int arg1, int arg2) {
        ++field9635;
        if (arg0 != 0) {
            this.field9846 = false;
        }
        class365 var4 = new class365(arg1);
        var4.field4809 = (long) arg2;
        this.field9748.method2732(var4, arg0 ^ 21939);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Laf;)V")
    public final void method582(class460 arg0) {
        this.field9715.method3486(this, 77, -1, arg0);
        ++field9593;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method637(Canvas arg0, int arg1, int arg2) {
        ++field9574;
        if (this.field9533 == arg0) {
            throw new RuntimeException();
        } else if (!this.field9591.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field9543.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field9591.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "(IIII)V")
    public final void method607(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9775 < arg1) {
            this.field9775 = arg1;
        }
        if (~this.field9835 < ~arg3) {
            this.field9835 = arg3;
        }
        if (~this.field9789 < ~arg2) {
            this.field9789 = arg2;
        }
        ++field9569;
        if (~arg0 < ~this.field9872) {
            this.field9872 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method3949(false);
        this.method3954(94);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZB)V")
    public final void method3908(boolean arg0, byte arg1) {
        if (arg1 < 115) {
            this.field9760 = null;
        }
        ++field9706;
        if (arg0 == !this.field9751) {
            this.field9751 = arg0;
            this.method3920(102);
            this.field9753 &= -32;
        }
    }

    @OriginalMember(owner = "client!pc", name = "da", descriptor = "(III[I)V")
    public final void method642(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9691;
        float var5 = (float) arg2 * this.field9754.field5977 + (float) arg0 * this.field9754.field6007 + (float) arg1 * this.field9754.field5983 + this.field9754.field5995;
        if (!(var5 < (float) this.field9824) && !((float) this.field9818 < var5)) {
            int var6 = (int) (((float) arg2 * this.field9754.field5999 + (float) arg0 * this.field9754.field5987 + (float) arg1 * this.field9754.field5976 + this.field9754.field5993) * (float) this.field9855 / var5);
            int var7 = (int) (((float) arg2 * this.field9754.field5981 + (float) arg0 * this.field9754.field5986 + (float) arg1 * this.field9754.field5982 + this.field9754.field5969) * (float) this.field9776 / var5);
            if ((float) var6 >= this.field9853 && this.field9829 >= (float) var6 && this.field9792 <= (float) var7 && (float) var7 <= this.field9773) {
                arg3[0] = (int) ((float) var6 - this.field9853);
                arg3[1] = (int) ((float) var7 - this.field9792);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(II)V")
    public final synchronized void method3909(int arg0, int arg1) {
        ++field9673;
        if (arg0 != 5890) {
            this.method3888((byte) -114, -81);
        }
        class365 var3 = new class365(arg1);
        this.field9747.method2732(var3, arg0 ^ 17073);
    }

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "(I)V")
    private final void method3910(int arg0) {
        if (this.field9825 && !this.field9848) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field9517;
        if (arg0 != 2896) {
            this.field9729 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        ++field9721;
    }

    @OriginalMember(owner = "client!pc", name = "DA", descriptor = "(IIII)V")
    public final void method565(int arg0, int arg1, int arg2, int arg3) {
        this.field9855 = arg2;
        ++field9675;
        this.field9812 = arg1;
        this.field9769 = arg0;
        this.field9776 = arg3;
        this.method3915((byte) 106);
        this.method3949(false);
        if (~this.field9867 != -4) {
            if (~this.field9867 == -3) {
                this.method3917(false);
                return;
            }
        } else {
            this.method3967((byte) -127);
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(Z)V")
    private final void method3911(boolean arg0) {
        if (this.field9836 && this.field9856 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (!arg0) {
            this.method572(72, 52, -42, 11, 103, 74, 71);
        }
        ++field9609;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lnm;)V")
    public final void method67(class499 arg0) {
        ++field9541;
    }

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "()Z")
    public final boolean method603() {
        ++field9560;
        return this.field9713 != null && (this.field9720 <= 1 || this.field9849);
    }

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "(I)V")
    public final void method3912(int arg0) {
        ++field9564;
        if (this.field9867 != 0) {
            this.field9867 = 0;
            this.field9753 &= -32;
        }
        if (arg0 != -9014) {
            this.method606(66, -65);
        }
    }

    @OriginalMember(owner = "client!pc", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method578(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field9534;
        boolean var7 = this.field9823 != arg0;
        if (var7 || this.field9830 != arg1 || this.field9788 != arg2) {
            this.field9830 = arg1;
            this.field9788 = arg2;
            this.field9823 = arg0;
            if (var7) {
                this.field9813 = (float) (255 & this.field9823) / 255.0F;
                this.field9857 = (float) (65280 & this.field9823) / 65280.0F;
                this.field9781 = (float) (this.field9823 & 16711680) / 1.671168E7F;
                this.method3929(7);
            }
            this.method3914((byte) 40);
        }
        if (this.field9811[0] != arg3 || this.field9811[1] != arg4 || this.field9811[2] != arg5) {
            this.field9811[2] = arg5;
            this.field9811[0] = arg3;
            this.field9811[1] = arg4;
            this.field9796[0] = -arg3;
            this.field9796[1] = -arg4;
            this.field9796[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9869[0] = arg3 * var8;
            this.field9869[2] = arg5 * var8;
            this.field9869[1] = arg4 * var8;
            this.field9799[2] = -this.field9869[2];
            this.field9799[1] = -this.field9869[1];
            this.field9799[0] = -this.field9869[0];
            this.method3894(-18017);
            this.field9784 = (int) (arg3 * 256.0F / arg4);
            this.field9785 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class296 method557(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field9670;
        return new class227(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field9589;
        this.method592(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
    public final void method615(int arg0) {
        ++field9664;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IZ)V")
    public final void method3913(int arg0, boolean arg1) {
        ++field9660;
        if (arg0 != -9373) {
            this.method61(-0.29681396F, 0.24605663F, -0.77132374F);
        }
        if (this.field9836 != arg1) {
            this.field9836 = arg1;
            this.method3911(true);
            this.field9753 &= -32;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
    private final void method3914(byte arg0) {
        class36.field544[2] = this.field9830 * this.field9813;
        if (arg0 != 40) {
            this.field9770 = -23;
        }
        class36.field544[3] = 1.0F;
        ++field9662;
        class36.field544[1] = this.field9857 * this.field9830;
        class36.field544[0] = this.field9830 * this.field9781;
        OpenGL.glLightfv(16384, 4609, class36.field544, 0);
        class36.field544[0] = -this.field9788 * this.field9781;
        class36.field544[1] = -this.field9788 * this.field9857;
        class36.field544[3] = 1.0F;
        class36.field544[2] = -this.field9788 * this.field9813;
        OpenGL.glLightfv(16385, 4609, class36.field544, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([I)V")
    public final void method648(int[] arg0) {
        arg0[0] = this.field9608;
        ++field9663;
        arg0[1] = this.field9535;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
    private final void method3915(byte arg0) {
        ++field9648;
        float[] var2 = this.field9837;
        if (arg0 != 106) {
            this.method579((class307) null, (class600[]) null, false);
        }
        float var3 = (float) (-this.field9769 * this.field9824) / (float) this.field9855;
        float var4 = (float) ((-this.field9769 + this.field9608) * this.field9824) / (float) this.field9855;
        float var5 = (float) (this.field9824 * this.field9812) / (float) this.field9776;
        float var6 = (float) ((-this.field9535 + this.field9812) * this.field9824) / (float) this.field9776;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field9824 * 2.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[14] = this.field9806 = -((float) this.field9818 * var7) / (float) (this.field9818 - this.field9824);
            var2[2] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[11] = -1.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[12] = 0.0F;
            var2[15] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[6] = 0.0F;
            var2[10] = this.field9871 = (float) (-(this.field9824 + this.field9818)) / (float) (-this.field9824 + this.field9818);
            var2[7] = 0.0F;
        } else {
            var2[6] = 0.0F;
            var2[15] = 1.0F;
            var2[11] = 0.0F;
            var2[3] = 0.0F;
            var2[9] = 0.0F;
            var2[8] = 0.0F;
            var2[10] = 1.0F;
            var2[0] = 1.0F;
            var2[4] = 0.0F;
            var2[1] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = 1.0F;
            var2[2] = 0.0F;
            var2[14] = 0.0F;
        }
        this.method3902(true);
    }

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "(I)V")
    private final void method3916(int arg0) {
        ++field9661;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field9760.method2633((byte) 77), arg0);
        if (this.field9762) {
            this.field9718.field10815.method177(-93);
        }
        this.method3894(-18017);
        this.method3899(106);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljia;Ljia;FLjia;)Ljia;")
    public final class645 method65(class645 arg0, class645 arg1, float arg2, class645 arg3) {
        ++field9559;
        if (arg0 != null && arg1 != null && this.field9858 && this.field9841) {
            class55 var5 = null;
            class235 var6 = (class235) arg0;
            class235 var7 = (class235) arg1;
            class331 var8 = var6.method483(0);
            class331 var9 = var7.method483(0);
            if (var8 != null && var9 != null) {
                int var10 = var9.field4101 < var8.field4101 ? var8.field4101 : var9.field4101;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class55) {
                    class55 var11 = (class55) arg3;
                    if (var11.method485((byte) 26) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class55(this, var10);
                }
                if (var5.method488(arg2, var8, var9, -128)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lsea;Lup;)Lnm;")
    public final class499 method70(class726 arg0, class292 arg1) {
        ++field9630;
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "()Z")
    public final boolean method639() {
        ++field9616;
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lsea;")
    public final class726 method44(int arg0, int arg1) {
        ++field9658;
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(Z)V")
    private final void method3917(boolean arg0) {
        OpenGL.glMatrixMode(5889);
        ++field9636;
        OpenGL.glLoadMatrixf(this.field9837, 0);
        if (arg0) {
            this.field9843 = true;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pc", name = "KA", descriptor = "(IIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~this.field9608 > ~arg2) {
            arg2 = this.field9608;
        }
        ++field9525;
        if (~this.field9535 > ~arg3) {
            arg3 = this.field9535;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        this.field9789 = arg2;
        this.field9872 = arg0;
        this.field9775 = arg1;
        this.field9835 = arg3;
        OpenGL.glEnable(3089);
        this.method3949(false);
        this.method3954(115);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field9615;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            class575 var13 = (class575) arg6;
            class664 var14 = var13.field7865;
            this.method3951(-106);
            this.method3936(false, var13.field7865);
            this.method3888((byte) 23, arg5);
            this.method3961(8448, 7681, 16127);
            this.method3903(34167, 0, 768, -116);
            float var15 = var14.field9127 / (float) var14.field9120;
            float var16 = var14.field9123 / (float) var14.field9126;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg9 + arg10);
            float var21 = var17 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var22 = var18 * var19;
            float var23 = (float) arg9 * var21;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (arg9 < var20) {
                var26 = (float) (arg9 - -arg10 + -var20) * var22;
                var25 = (float) (arg9 + arg10 - var20) * var21;
            } else {
                var28 = (float) (-var20 + arg9) * var22;
                var27 = (float) (arg9 - var20) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var21;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (~arg2 >= ~arg0) {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (arg1 >= arg3) {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var30 += var28 + var32;
                var29 += var27 + var31;
                var27 = var23;
                var28 = var24;
            }
            this.method3903(5890, 0, 768, -106);
        }
    }

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "(I)V")
    private final void method3918(int arg0) {
        if (this.field9814) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field9814 = false;
        }
        if (arg0 == 28366) {
            ++field9684;
        }
    }

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "()Z")
    public final boolean method646() {
        ++field9645;
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method608(Canvas arg0) {
        ++field9610;
        if (this.field9533 == arg0) {
            throw new RuntimeException();
        } else if (this.field9591.containsKey(arg0)) {
            Long var2 = (Long) this.field9591.get(arg0);
            this.field9543.releaseSurface(arg0, var2);
            this.field9591.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ZB)V")
    public final void method3919(boolean arg0, byte arg1) {
        if (arg1 <= -6) {
            ++field9590;
            if (arg0 == !this.field9848) {
                this.field9848 = arg0;
                this.method3910(2896);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lza;)V")
    public final void method581(class435 arg0) {
        this.field9725 = ((class190) arg0).field2278;
        ++field9516;
        if (this.field9868 == null) {
            class283 var2 = new class283(80);
            if (this.field9772) {
                var2.method1628(-1.0F, 8625);
                var2.method1628(-1.0F, 8625);
                var2.method1628(0.0F, 8625);
                var2.method1628(0.0F, 8625);
                var2.method1628(1.0F, 8625);
                var2.method1628(1.0F, 8625);
                var2.method1628(-1.0F, 8625);
                var2.method1628(0.0F, 8625);
                var2.method1628(1.0F, 8625);
                var2.method1628(1.0F, 8625);
                var2.method1628(1.0F, 8625);
                var2.method1628(1.0F, 8625);
                var2.method1628(0.0F, 8625);
                var2.method1628(1.0F, 8625);
                var2.method1628(0.0F, 8625);
                var2.method1628(-1.0F, 8625);
                var2.method1628(1.0F, 8625);
                var2.method1628(0.0F, 8625);
                var2.method1628(0.0F, 8625);
                var2.method1628(0.0F, 8625);
            } else {
                var2.method1626(-1.0F, -44927608);
                var2.method1626(-1.0F, -44927608);
                var2.method1626(0.0F, -44927608);
                var2.method1626(0.0F, -44927608);
                var2.method1626(1.0F, -44927608);
                var2.method1626(1.0F, -44927608);
                var2.method1626(-1.0F, -44927608);
                var2.method1626(0.0F, -44927608);
                var2.method1626(1.0F, -44927608);
                var2.method1626(1.0F, -44927608);
                var2.method1626(1.0F, -44927608);
                var2.method1626(1.0F, -44927608);
                var2.method1626(0.0F, -44927608);
                var2.method1626(1.0F, -44927608);
                var2.method1626(0.0F, -44927608);
                var2.method1626(-1.0F, -44927608);
                var2.method1626(1.0F, -44927608);
                var2.method1626(0.0F, -44927608);
                var2.method1626(0.0F, -44927608);
                var2.method1626(0.0F, -44927608);
            }
            this.field9868 = this.method3904(var2.field5262, (byte) 124, false, var2.field5275, 20);
            this.field9767 = new class550(this.field9868, 5126, 3, 0);
            this.field9817 = new class550(this.field9868, 5126, 2, 12);
            this.field9715.method3490(this, 17542);
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "()Lnh;")
    public final class778 method576() {
        ++field9672;
        return this.field9722;
    }

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "(I)V")
    private final void method3920(int arg0) {
        OpenGL.glDepthMask(this.field9751 && this.field9831);
        ++field9643;
        if (arg0 < 88) {
            this.method3968((class530) null, 36);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()Z")
    public final boolean method71() {
        ++field9687;
        if (this.field9713 != null) {
            if (!this.field9713.method3305(28)) {
                if (!this.field9712.method3402(this.field9713, true)) {
                    return false;
                }
                this.field9709.method2437(-4466);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "(I)V")
    private final void method3921(int arg0) {
        this.method3901(-2, false);
        ++field9631;
        for (int var2 = this.field9798 + -1; var2 >= 0; --var2) {
            this.method3925((byte) 125, var2);
            this.method3936(false, (class400) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3961(8448, 8448, 16127);
        this.method3903(34168, 2, 770, arg0 ^ -16489);
        this.method3918(28366);
        this.field9755 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field9752 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field9756 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field9759 = true;
        this.method3913(-9373, true);
        this.method3892(true, 1);
        this.method3906(true, arg0 ^ 49268);
        this.method3908(true, (byte) 124);
        this.method3912(-9014);
        this.field9543.setSwapInterval(0);
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
        OpenGL.glEnable(arg0);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field9823 = this.field9834 = -1;
        this.method634();
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(B)V")
    private final void method3922(byte arg0) {
        if (arg0 < -127) {
            if (this.field9681 != null) {
                Dimension var2 = this.field9681.getSize();
                this.field9686 = var2.height;
                this.field9530 = var2.width;
            } else {
                this.field9530 = this.field9686 = 0;
            }
            ++field9717;
            if (this.field9737 == null) {
                this.field9608 = this.field9530;
                this.field9535 = this.field9686;
                this.method3939((byte) -124);
            }
            this.method3912(-9014);
            this.method634();
        }
    }

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "(I)V")
    public final void method3923(int arg0) {
        OpenGL.glPopMatrix();
        ++field9623;
        if (arg0 != -1) {
            this.field9738 = 34;
        }
    }

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "()V")
    public final void method20() {
        ++field9550;
        if (!this.field9841) {
            if (!this.field9865) {
                throw new RuntimeException("");
            }
            this.field9732.method239(0, 0, this.field9608, this.field9535, 0, 0);
            this.field9543.setSurface(this.field9562);
        } else {
            if (this.field9737 != this.field9731) {
                throw new RuntimeException();
            }
            this.field9731.method1284(21450, 0);
            this.field9731.method1284(21450, 8);
            this.method3964(this.field9731, -1);
        }
        this.field9732 = null;
        this.field9608 = this.field9530;
        this.field9535 = this.field9686;
        this.method3912(-9014);
        this.method3939((byte) 56);
        this.method634();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Len;Z)V")
    public final void method3924(class339 arg0, boolean arg1) {
        if (this.field9832 != arg0) {
            if (this.field9860) {
                OpenGL.glBindBufferARB(34962, arg0.method469(-30665));
            }
            this.field9832 = arg0;
        }
        if (!arg1) {
            this.method52(115, 103);
        }
        ++field9705;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbq;[Lcr;Z)Lda;")
    public final class67 method579(class307 arg0, class600[] arg1, boolean arg2) {
        ++field9529;
        return new class564(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(BI)V")
    public final void method3925(byte arg0, int arg1) {
        ++field9547;
        if (~this.field9810 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field9810 = arg1;
        }
        int var3 = 101 % ((arg0 - -39) / 54);
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "()I")
    public final int method610() {
        ++field9699;
        return this.field9824;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lnh;)V")
    public final void method628(class778 arg0) {
        this.field9754.method141(arg0);
        ++field9568;
        this.field9760.method141(this.field9754);
        this.field9760.method2629(false);
        this.field9761.method2627(-127, this.field9760);
        if (this.field9867 != 1) {
            this.method3916(0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[I[I)Laa;")
    public final class513 method643(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field9595;
        return class47.method419(arg2, arg3, arg0, 20334, arg1, this);
    }

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "()Z")
    public final boolean method604() {
        ++field9573;
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "(I)V")
    public final void method571(int arg0) {
        this.field9727 = 0;
        ++field9651;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field9727;
        }
        this.field9724 = 1 << this.field9727;
    }

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field9587;
        float var10;
        float var11;
        if (this.field9840 != null && arg2 <= this.field9840.field2215 && ~this.field9840.field2221 <= ~arg3) {
            this.field9840.method1218(6406, false, 0, arg6, 0, (byte) 124, arg3, 0, 0, arg2);
            var10 = (float) arg3 * this.field9840.field9123 / (float) this.field9840.field2221;
            var11 = (float) arg2 * this.field9840.field9127 / (float) this.field9840.field2215;
        } else {
            this.field9840 = class30.method287(false, 6406, 2, 6406, this, arg2, arg6, arg3);
            this.field9840.method1221(false, -1, false);
            var10 = this.field9840.field9123;
            var11 = this.field9840.field9127;
        }
        this.method3951(-42);
        this.method3936(false, this.field9840);
        this.method3888((byte) 13, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3953(arg5, -122);
        this.method3961(34165, 34165, 16127);
        this.method3903(34166, 0, 768, -115);
        this.method3903(5890, 2, 770, -126);
        this.method3931(0, 8960, 770, 34166);
        this.method3931(2, 8960, 770, 5890);
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
        this.method3903(5890, 0, 768, -107);
        this.method3903(34166, 2, 770, -128);
        this.method3931(0, 8960, 770, 5890);
        this.method3931(2, 8960, 770, 34166);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjaclib/memory/Buffer;IZI)Len;")
    public final class339 method3926(byte arg0, Buffer arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 != -57) {
            this.field9828 = null;
        }
        ++field9605;
        return (class339) (!this.field9860 || arg3 && !this.field9794 ? new class347(this, arg2, arg1) : new class50(this, arg2, arg1, arg4, arg3));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
    public final synchronized void method3927(byte arg0, long arg1) {
        ++field9598;
        class379 var4 = new class379();
        var4.field4809 = arg1;
        this.field9750.method2732(var4, 21939);
        if (arg0 != 31) {
            this.field9828 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)I")
    public final int method620(int arg0, int arg1) {
        ++field9692;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
    public final synchronized void method3928(int arg0, byte arg1) {
        ++field9634;
        class379 var3 = new class379();
        var3.field4809 = (long) arg0;
        this.field9749.method2732(var3, 21939);
        if (arg1 <= 33) {
            this.method20();
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(IIIIII)Ljia;")
    public final class645 method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9644;
        return !this.field9858 ? null : new class471(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
    public final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3930(1);
        ++field9620;
        this.method3888((byte) 82, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
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

    @OriginalMember(owner = "client!pc", name = "na", descriptor = "(IIII)[I")
    public final int[] method87(int arg0, int arg1, int arg2, int arg3) {
        ++field9637;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field9535 - arg1 + -var6, arg2, 1, 32993, this.field9778, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()V")
    public final void method2() {
        ++field9719;
        if (this.field9713 != null && this.field9713.method3305(-122)) {
            this.field9712.method3395(this.field9713, false);
            this.field9709.method2437(-4466);
        }
    }

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "(I)V")
    private final void method3929(int arg0) {
        class36.field544[3] = 1.0F;
        if (arg0 == 7) {
            ++field9520;
            class36.field544[0] = this.field9850 * this.field9781;
            class36.field544[1] = this.field9857 * this.field9850;
            class36.field544[2] = this.field9850 * this.field9813;
            OpenGL.glLightModelfv(2899, class36.field544, 0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "(I)V")
    private final void method3930(int arg0) {
        ++field9701;
        if (arg0 != 1) {
            this.field9759 = false;
        }
        if (~this.field9753 != -2) {
            this.method3893(0);
            this.method3913(arg0 ^ -9374, false);
            this.method3892(false, 1);
            this.method3906(false, 32884);
            this.method3908(false, (byte) 117);
            this.method3936(false, (class400) null);
            this.method3901(-2, false);
            this.method3932(1, (byte) 102);
            this.field9753 = 1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "()V")
    public final void method32() {
        this.field9712.method3398(963);
        ++field9659;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(IIII)V")
    public final void method3931(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(arg1, arg0 + 34184, arg3);
        ++field9680;
        OpenGL.glTexEnvi(8960, 34200 - -arg0, arg2);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)V")
    public final void method3932(int arg0, byte arg1) {
        int var3 = 52 % (-arg1 / 54);
        if (~arg0 == -2) {
            this.method3961(7681, 7681, 16127);
        } else if (arg0 != 0) {
            if (arg0 != 2) {
                if (~arg0 != -4) {
                    if (arg0 == 4) {
                        this.method3961(34023, 34023, 16127);
                    }
                } else {
                    this.method3961(8448, 260, 16127);
                }
            } else {
                this.method3961(7681, 34165, 16127);
            }
        } else {
            this.method3961(8448, 8448, 16127);
        }
        ++field9667;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "()Lnh;")
    public final class778 method574() {
        ++field9556;
        return this.field9754;
    }

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "(I)V")
    private final void method3933(int arg0) {
        if (arg0 == 9948) {
            if (~this.field9867 != -4) {
                this.field9867 = 3;
                this.method3967((byte) -125);
                this.method3916(0);
                this.field9753 &= -8;
            }
            ++field9511;
        }
    }

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "(I)V")
    public final void method3934(int arg0) {
        if (arg0 < 125) {
            this.method3915((byte) 96);
        }
        if (~this.field9753 != -17) {
            this.method3933(9948);
            this.method3913(-9373, true);
            this.method3906(true, 32884);
            this.method3908(true, (byte) 117);
            this.method3888((byte) 5, 1);
            this.field9753 = 16;
        }
        ++field9614;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lsf;Lsf;Lsf;Lsf;I)V")
    public final void method3935(class550 arg0, class550 arg1, class550 arg2, class550 arg3, int arg4) {
        if (arg1 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method3924(arg1.field7650, true);
            OpenGL.glVertexPointer(arg1.field7645, arg1.field7647, this.field9832.method470(arg4 + -2499), this.field9832.method466((byte) 81) - -((long) arg1.field7648));
            OpenGL.glEnableClientState(32884);
        }
        ++field9585;
        if (arg3 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method3924(arg3.field7650, true);
            OpenGL.glNormalPointer(arg3.field7647, this.field9832.method470(-91), this.field9832.method466((byte) -109) + (long) arg3.field7648);
            OpenGL.glEnableClientState(32885);
        }
        if (arg4 != 2407) {
            this.method620(38, 34);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3924(arg2.field7650, true);
            OpenGL.glColorPointer(arg2.field7645, arg2.field7647, this.field9832.method470(-123), this.field9832.method466((byte) 26) - -((long) arg2.field7648));
            OpenGL.glEnableClientState(32886);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3924(arg0.field7650, true);
            OpenGL.glTexCoordPointer(arg0.field7645, arg0.field7647, this.field9832.method470(-128), this.field9832.method466((byte) -75) - -((long) arg0.field7648));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLfha;)V")
    public final void method3936(boolean arg0, class400 arg1) {
        ++field9641;
        if (arg0) {
            this.field9802 = 19;
        }
        class400 var3 = this.field9839[this.field9810];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field5235);
            } else {
                if (var3 != null) {
                    if (arg1.field5235 != var3.field5235) {
                        OpenGL.glDisable(var3.field5235);
                        OpenGL.glEnable(arg1.field5235);
                    }
                } else {
                    OpenGL.glEnable(arg1.field5235);
                }
                OpenGL.glBindTexture(arg1.field5235, arg1.method2340(false));
            }
            this.field9839[this.field9810] = arg1;
        }
        this.field9753 &= -2;
    }

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "(III)V")
    public final void method650(int arg0, int arg1, int arg2) {
        ++field9555;
        if (~this.field9834 != ~arg0 || ~this.field9856 != ~arg1 || ~this.field9801 != ~arg2) {
            this.field9834 = arg0;
            this.field9801 = arg2;
            this.field9856 = arg1;
            this.method3952(28410);
            this.method3911(true);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field9669;
        this.method3930(1);
        this.method3888((byte) 18, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
    public final void method5(int arg0, int arg1) throws class677 {
        try {
            this.field9543.swapBuffers();
        } catch (Exception var3) {
        }
        ++field9682;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFF)V")
    public final void method61(float arg0, float arg1, float arg2) {
        class337.field4165 = arg0;
        class591.field8028 = arg1;
        class669.field9182 = arg2;
        ++field9688;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
    public final void method31(boolean arg0) {
        ++field9689;
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(II)I")
    public final int method3937(int arg0, int arg1) {
        if (arg1 != -1) {
            return 65;
        } else {
            ++field9611;
            if (~arg0 != -2) {
                if (~arg0 != -1) {
                    if (~arg0 == -3) {
                        return 34165;
                    } else if (~arg0 == -4) {
                        return 260;
                    } else if (arg0 == 4) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 8448;
                }
            } else {
                return 7681;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "JA", descriptor = "(IIIIII)I")
    public final int method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9677;
        int var7 = 0;
        float var8 = (float) arg2 * this.field9754.field5977 + (float) arg0 * this.field9754.field6007 + (float) arg1 * this.field9754.field5983 + this.field9754.field5995;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field9754.field5977 + (float) arg3 * this.field9754.field6007 + (float) arg4 * this.field9754.field5983 + this.field9754.field5995;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field9824 > var8 && (float) this.field9824 > var9) {
            var7 |= 16;
        } else if ((float) this.field9818 < var8 && var9 > (float) this.field9818) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field9754.field5999 + (float) arg0 * this.field9754.field5987 + (float) arg1 * this.field9754.field5976 + this.field9754.field5993) * (float) this.field9855 / var8);
        int var11 = (int) (((float) arg5 * this.field9754.field5999 + (float) arg3 * this.field9754.field5987 + (float) arg4 * this.field9754.field5976 + this.field9754.field5993) * (float) this.field9855 / var9);
        if ((float) var10 < this.field9853 && (float) var11 < this.field9853) {
            var7 |= 1;
        } else if (this.field9829 < (float) var10 && (float) var11 > this.field9829) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field9754.field5981 + (float) arg0 * this.field9754.field5986 + (float) arg1 * this.field9754.field5982 + this.field9754.field5969) * (float) this.field9776 / var8);
        int var13 = (int) (((float) arg5 * this.field9754.field5981 + (float) arg3 * this.field9754.field5986 + (float) arg4 * this.field9754.field5982 + this.field9754.field5969) * (float) this.field9776 / var9);
        if ((float) var12 < this.field9792 && this.field9792 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field9773 && (float) var13 > this.field9773) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "(IIIIIII)I")
    public final int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9512;
        float var8 = (float) arg2 * this.field9754.field5977 + (float) arg0 * this.field9754.field6007 + (float) arg1 * this.field9754.field5983 + this.field9754.field5995;
        float var9 = (float) arg5 * this.field9754.field5977 + (float) arg3 * this.field9754.field6007 + (float) arg4 * this.field9754.field5983 + this.field9754.field5995;
        int var10 = 0;
        if (var8 < (float) this.field9824 && (float) this.field9824 > var9) {
            var10 |= 16;
        } else if ((float) this.field9818 < var8 && var9 > (float) this.field9818) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field9754.field5999 + (float) arg0 * this.field9754.field5987 + (float) arg1 * this.field9754.field5976 + this.field9754.field5993) * (float) this.field9855 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field9754.field5999 + (float) arg3 * this.field9754.field5987 + (float) arg4 * this.field9754.field5976 + this.field9754.field5993) * (float) this.field9855 / (float) arg6);
        if (this.field9853 > (float) var11 && (float) var12 < this.field9853) {
            var10 |= 1;
        } else if (this.field9829 < (float) var11 && this.field9829 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field9754.field5981 + (float) arg0 * this.field9754.field5986 + (float) arg1 * this.field9754.field5982 + this.field9754.field5969) * (float) this.field9776 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field9754.field5981 + (float) arg3 * this.field9754.field5986 + (float) arg4 * this.field9754.field5982 + this.field9754.field5969) * (float) this.field9776 / (float) arg6);
        if ((float) var13 < this.field9792 && this.field9792 > (float) var14) {
            var10 |= 4;
        } else if (this.field9773 < (float) var13 && this.field9773 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)V")
    public final synchronized void method3938(int arg0, int arg1, int arg2) {
        if (arg2 > -127) {
            this.field9745 = null;
        }
        ++field9665;
        class365 var4 = new class365(arg1);
        var4.field4809 = (long) arg0;
        this.field9745.method2732(var4, 21939);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public final void method589(int arg0) {
        ++field9674;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field9711 = arg0;
            this.field9709.method2437(-4466);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public final void method586(boolean arg0) {
        ++field9622;
    }

    @OriginalMember(owner = "client!pc", name = "GA", descriptor = "(I)V")
    public final void method13(int arg0) {
        ++field9633;
        this.method3888((byte) 121, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(B)V")
    private final void method3939(byte arg0) {
        ++field9514;
        OpenGL.glViewport(this.field9791, this.field9808, this.field9608, this.field9535);
        int var2 = -27 % ((arg0 - -57) / 63);
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(II)I")
    public final int method632(int arg0, int arg1) {
        ++field9652;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "([I)V")
    public final void method566(int[] arg0) {
        ++field9700;
        arg0[2] = this.field9789;
        arg0[0] = this.field9872;
        arg0[3] = this.field9835;
        arg0[1] = this.field9775;
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "()V")
    public final void method25() {
        ++field9563;
        if (this.field9870 && ~this.field9608 < -1 && ~this.field9535 < -1) {
            int var1 = this.field9872;
            int var2 = this.field9789;
            int var3 = this.field9775;
            int var4 = this.field9835;
            this.method634();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3912(-9014);
            this.method3913(-9373, false);
            this.method3892(false, 1);
            this.method3906(false, 32884);
            this.method3908(false, (byte) 119);
            this.method3936(false, (class400) null);
            this.method3901(-2, false);
            this.method3932(1, (byte) -61);
            this.method3888((byte) 118, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field9608, this.field9535, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method556(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method3940(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9707;
        int var7 = arg1 - -arg5;
        int var8 = -arg5 + arg3;
        for (int var9 = arg1; var7 > var9; ++var9) {
            class455.method2755(arg6, class4.field49[var9], (byte) 90, arg2, arg4);
        }
        int var10 = arg4 - -arg5;
        for (int var11 = arg3; var8 < var11; --var11) {
            class455.method2755(arg6, class4.field49[var11], (byte) 104, arg2, arg4);
        }
        int var12 = -arg5 + arg2;
        if (!arg0) {
            method3940(false, 97, -41, 109, 71, -107, -69);
        }
        for (int var13 = var7; ~var8 <= ~var13; ++var13) {
            int[] var14 = class4.field49[var13];
            class455.method2755(arg6, var14, (byte) 34, var10, arg4);
            class455.method2755(arg6, var14, (byte) 100, arg2, var12);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public final void method584(int arg0) {
        this.method3891(36);
        ++field9565;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIZ)V")
    public final synchronized void method3941(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field9579;
            class365 var4 = new class365(arg1);
            var4.field4809 = (long) arg0;
            this.field9746.method2732(var4, 21939);
        }
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(B)V")
    public final void method3942(byte arg0) {
        if (~this.field9753 != -9) {
            this.method3959(22392);
            this.method3913(-9373, true);
            this.method3906(true, 32884);
            this.method3908(true, (byte) 125);
            this.method3888((byte) 21, 1);
            this.field9753 = 8;
        }
        ++field9604;
        if (arg0 < 120) {
            this.method2();
        }
    }

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "(ILaa;II)V")
    public final void method617(int arg0, class513 arg1, int arg2, int arg3) {
        ++field9642;
        class575 var5 = (class575) arg1;
        class664 var6 = var5.field7865;
        this.method3951(-122);
        this.method3936(false, var5.field7865);
        this.method3888((byte) 60, 1);
        this.method3961(8448, 7681, 16127);
        this.method3903(34167, 0, 768, -110);
        float var7 = var6.field9127 / (float) var6.field9120;
        float var8 = var6.field9123 / (float) var6.field9126;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9872) * var7, (float) (-arg3 + this.field9775) * var8);
        OpenGL.glVertex2i(this.field9872, this.field9775);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9872) * var7, (float) (-arg3 + this.field9835) * var8);
        OpenGL.glVertex2i(this.field9872, this.field9835);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9789) * var7, (float) (-arg3 + this.field9835) * var8);
        OpenGL.glVertex2i(this.field9789, this.field9835);
        OpenGL.glTexCoord2f((float) (this.field9789 - arg2) * var7, (float) (-arg3 + this.field9775) * var8);
        OpenGL.glVertex2i(this.field9789, this.field9775);
        OpenGL.glEnd();
        this.method3903(5890, 0, 768, -122);
    }

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "()Z")
    public final boolean method625() {
        ++field9668;
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8) {
        ++field9619;
        class575 var10 = (class575) arg6;
        class664 var11 = var10.field7865;
        this.method3951(-89);
        this.method3936(false, var10.field7865);
        this.method3888((byte) 73, arg5);
        this.method3961(8448, 7681, 16127);
        this.method3903(34167, 0, 768, -107);
        float var12 = var11.field9127 / (float) var11.field9120;
        float var13 = var11.field9123 / (float) var11.field9126;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method3903(5890, 0, 768, -118);
    }

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "()I")
    public final int method81() {
        ++field9696;
        int var1 = this.field9878;
        this.field9878 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "()[I")
    public final int[] method569() {
        ++field9554;
        return new int[] { this.field9769, this.field9812, this.field9855, this.field9776 };
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lve;I)V")
    public final void method3943(class530 arg0, int arg1) {
        ++field9714;
        if (arg1 != -1297) {
            this.method652((int[]) null, 124, 22, 127, 20, false);
        }
        if (this.field9738 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field9738 <= -1) {
                this.field9734[this.field9738].method1269(-26779);
            }
            this.field9737 = this.field9734[++this.field9738] = arg0;
            this.field9737.method1283(-25911);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBILbia;)V")
    public final void method3944(int arg0, int arg1, byte arg2, int arg3, class525 arg4) {
        ++field9518;
        if (arg2 != 78) {
            this.field9730 = true;
        }
        int var6 = arg4.method1317((byte) 96);
        int var7 = arg1 * this.method3946(var6, true);
        this.method3896(arg4, -204);
        OpenGL.glDrawElements(arg0, arg3, var6, arg4.method1323(arg2 ^ -7276) - -((long) var7));
    }

    @OriginalMember(owner = "client!pc", name = "HA", descriptor = "(IIII[I)V")
    public final void method651(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field9552;
        float var6 = (float) arg2 * this.field9754.field5977 + (float) arg0 * this.field9754.field6007 + (float) arg1 * this.field9754.field5983 + this.field9754.field5995;
        if (!((float) this.field9824 > var6) && !(var6 > (float) this.field9818)) {
            int var7 = (int) (((float) arg2 * this.field9754.field5999 + (float) arg0 * this.field9754.field5987 + (float) arg1 * this.field9754.field5976 + this.field9754.field5993) * (float) this.field9855 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field9754.field5981 + (float) arg0 * this.field9754.field5986 + (float) arg1 * this.field9754.field5982 + this.field9754.field5969) * (float) this.field9776 / (float) arg3);
            if ((float) var7 >= this.field9853 && this.field9829 >= (float) var7 && this.field9792 <= (float) var8 && (float) var8 <= this.field9773) {
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field9792);
                arg4[0] = (int) ((float) var7 - this.field9853);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public final void method609(int arg0) {
        ++field9603;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(IIII)V")
    public final void method3945(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 3) {
            this.method616();
        }
        ++field9594;
        OpenGL.glDrawArrays(arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "()Z")
    public final boolean method629() {
        ++field9654;
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(IZ)I")
    public final int method3946(int arg0, boolean arg1) {
        ++field9584;
        if (!arg1) {
            this.field9800 = 24;
        }
        if (~arg0 != -5122 && ~arg0 != -5121) {
            if (arg0 != 5123 && ~arg0 != -5123) {
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

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFZF)V")
    private final void method3947(float arg0, float arg1, boolean arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field9600;
        if (this.field9814) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg0, arg3);
        if (arg2) {
            this.field9809 = null;
        }
        OpenGL.glMatrixMode(5888);
        this.field9814 = true;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(II)V")
    public final void method606(int arg0, int arg1) {
        ++field9592;
        if (~this.field9824 != ~arg0 || ~this.field9818 != ~arg1) {
            this.field9824 = arg0;
            this.field9818 = arg1;
            this.method3915((byte) 106);
            this.method3952(28410);
            if (this.field9867 == 3) {
                this.method3967((byte) -123);
                return;
            }
            if (~this.field9867 != -3) {
                return;
            }
            this.method3917(false);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ)Ltf;")
    public final class312 method638(int arg0, int arg1, boolean arg2) {
        ++field9539;
        return new class284(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "()Z")
    public final boolean method622() {
        ++field9524;
        return this.field9718.method4342(3, Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()Z")
    public final boolean method561() {
        ++field9561;
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII[BZ)Lbia;")
    public final class525 method3948(byte arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        if (arg0 != -120) {
            this.field9513 = -116L;
        }
        ++field9627;
        return (class525) (!this.field9860 || arg4 && !this.field9794 ? new class209(this, arg2, arg3, arg1) : new class380(this, arg2, arg3, arg1, arg4));
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lup;")
    public final class292 method52(int arg0, int arg1) {
        ++field9586;
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "(Z)V")
    public final void method635(boolean arg0) {
        ++field9666;
        this.field9831 = arg0;
        this.method3920(102);
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(Z)V")
    private final void method3949(boolean arg0) {
        this.field9853 = (float) (-this.field9769 + this.field9872);
        this.field9773 = (float) (-this.field9812 + this.field9835);
        if (arg0) {
            this.method56(-58);
        }
        this.field9792 = (float) (-this.field9812 + this.field9775);
        this.field9829 = (float) (-this.field9769 + this.field9789);
        ++field9578;
    }

    @OriginalMember(owner = "client!pc", name = "xa", descriptor = "(F)V")
    public final void method626(float arg0) {
        if (this.field9850 != arg0) {
            this.field9850 = arg0;
            this.method3929(7);
        }
        ++field9558;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLve;)V")
    public final void method3950(byte arg0, class530 arg1) {
        ++field9540;
        if (~this.field9738 <= -1 && this.field9734[this.field9738] == arg1) {
            this.field9734[this.field9738--] = null;
            arg1.method1269(-26779);
            if (arg0 != -46) {
                this.method579((class307) null, (class600[]) null, false);
            }
            if (~this.field9738 <= -1) {
                this.field9737 = this.field9734[this.field9738];
                this.field9737.method1283(-25911);
            } else {
                this.field9737 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "()V")
    public final void method36() {
        ++field9612;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "(I)V")
    public final void method3951(int arg0) {
        ++field9542;
        if (arg0 >= 0) {
            this.method613(-87, -61, 49, 62, 80, 72, -55, -53, 23);
        }
        if (~this.field9753 != -3) {
            this.method3893(0);
            this.method3913(-9373, false);
            this.method3892(false, 1);
            this.method3906(false, 32884);
            this.method3908(false, (byte) 123);
            this.method3901(-2, false);
            this.field9753 = 2;
        }
    }

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "(I)V")
    private final void method3952(int arg0) {
        ++field9572;
        if (arg0 != 28410) {
            this.method3905(-60, true, 84, true);
        }
        this.field9786 = (float) (this.field9818 - this.field9801) - this.field9807;
        this.field9854 = this.field9786 - (float) this.field9856 * this.field9863;
        if (this.field9854 < (float) this.field9824) {
            this.field9854 = (float) this.field9824;
        }
        OpenGL.glFogf(2915, this.field9854);
        OpenGL.glFogf(2916, this.field9786);
        class36.field544[1] = (float) class296.method1733(this.field9834, 65280) / 65280.0F;
        class36.field544[2] = (float) class296.method1733(this.field9834, 255) / 255.0F;
        class36.field544[0] = (float) class296.method1733(16711680, this.field9834) / 1.671168E7F;
        OpenGL.glFogfv(2918, class36.field544, 0);
    }

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "()I")
    public final int method562() {
        ++field9693;
        int var1 = this.field9875;
        this.field9875 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIF)Lkp;")
    public final class515 method573(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field9548;
        return new class115(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(II)V")
    public final void method3953(int arg0, int arg1) {
        class36.field544[1] = (float) class296.method1733(65280, arg0) / 65280.0F;
        class36.field544[3] = (float) (arg0 >>> 24) / 255.0F;
        class36.field544[0] = (float) class296.method1733(16711680, arg0) / 1.671168E7F;
        int var3 = 98 % ((-76 - arg1) / 38);
        class36.field544[2] = (float) class296.method1733(arg0, 255) / 255.0F;
        ++field9515;
        OpenGL.glTexEnvfv(8960, 8705, class36.field544, 0);
    }

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "(I)V")
    private final void method3954(int arg0) {
        if (arg0 <= 77) {
            this.method61(-0.109041855F, -1.1216313F, -1.3776369F);
        }
        if (~this.field9872 >= ~this.field9789 && this.field9775 <= this.field9835) {
            OpenGL.glScissor(this.field9872 + this.field9791, this.field9808 + this.field9535 + -this.field9835, -this.field9872 + this.field9789, this.field9835 - this.field9775);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field9532;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class700(Canvas arg0, class162 arg1, int arg2) {
        super(arg1);
        new class136();
        new class362(16);
        this.field9744 = new class450();
        this.field9745 = new class450();
        this.field9746 = new class450();
        this.field9747 = new class450();
        this.field9748 = new class450();
        this.field9749 = new class450();
        this.field9750 = new class450();
        this.field9754 = new class446();
        this.field9760 = new class446();
        this.field9761 = new class446();
        this.field9781 = 1.0F;
        this.field9801 = 0;
        this.field9765 = 8448;
        this.field9811 = new float[4];
        this.field9770 = 8448;
        this.field9812 = 0;
        this.field9762 = false;
        this.field9796 = new float[4];
        this.field9813 = 1.0F;
        this.field9800 = 0;
        this.field9776 = 512;
        this.field9823 = -1;
        this.field9818 = 3584;
        this.field9834 = -1;
        this.field9831 = true;
        this.field9780 = 1.0F;
        this.field9769 = 0;
        this.field9775 = 0;
        this.field9789 = 0;
        this.field9837 = new float[16];
        this.field9830 = -1.0F;
        this.field9824 = 50;
        this.field9788 = -1.0F;
        this.field9808 = 0;
        this.field9807 = 0.0F;
        this.field9820 = 3584.0F;
        this.field9845 = -1.0F;
        this.field9847 = -1;
        this.field9799 = new float[4];
        this.field9857 = 1.0F;
        this.field9835 = 0;
        this.field9805 = -1;
        this.field9856 = -1;
        this.field9791 = 0;
        this.field9866 = new class515[class34.field523];
        this.field9869 = new float[4];
        this.field9862 = 3584.0F;
        this.field9863 = 1.0F;
        this.field9855 = 512;
        this.field9872 = 0;
        this.field9803 = -1.0F;
        this.field9779 = new class283(8192);
        this.field9873 = new int[1];
        this.field9874 = new int[1];
        this.field9876 = new int[1];
        this.field9877 = new byte[16384];
        this.field9681 = this.field9533 = arg0;
        this.field9720 = arg2;
        if (!class37.method326((byte) 116, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class37.method326((byte) 109, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field9543 = new OpenGL();
                this.field9562 = this.field9513 = this.field9543.init(arg0, 8, 8, 8, 24, 0, this.field9720);
                if (this.field9513 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method3970((byte) -120);
                    int var4 = this.method3895((byte) 111);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field9778 = !this.field9772 ? 5121 : 33639;
                        if (~this.field9819.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class708.method4017(' ', (byte) 32, this.field9819.replace('/', ' '));
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class480.method2854((byte) 96, var10.substring(1, 3))) {
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
                                            if (var10.length() >= 4 && class480.method2854((byte) 67, var10.substring(0, 4))) {
                                                var5 = class445.method2623(0, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field9860 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field9793 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field9783 = false;
                            }
                            this.field9842 &= this.field9543.method3689("GL_ARB_half_float_pixel");
                            this.field9843 = true;
                            this.field9794 = this.field9860;
                        }
                        if (~this.field9816.indexOf("intel") != 0) {
                            this.field9841 = false;
                        }
                        this.field9870 = !this.field9816.equals("s3 graphics");
                        if (this.field9860) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class322.method1922(false, (byte) 102, true);
                        this.field9730 = true;
                        this.field9709 = new class406(this, super.field890);
                        this.method3898(1);
                        this.field9728 = new class451(this);
                        this.field9712 = new class593(this);
                        if (this.field9712.method3399((byte) 76)) {
                            this.field9713 = new class742(this);
                            if (!this.field9713.method4166(false)) {
                                this.field9713.method3317((byte) 44);
                                this.field9713 = null;
                            }
                        }
                        this.field9718 = new class784(this);
                        this.method3921(16384);
                        this.method3922((byte) -128);
                        this.method25();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method53();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method627(Canvas arg0) {
        this.field9562 = 0L;
        this.field9681 = null;
        ++field9640;
        if (arg0 != null && this.field9533 != arg0) {
            if (this.field9591.containsKey(arg0)) {
                Long var2 = (Long) this.field9591.get(arg0);
                this.field9562 = var2;
                this.field9681 = arg0;
            }
        } else {
            this.field9562 = this.field9513;
            this.field9681 = this.field9533;
        }
        if (this.field9681 != null && ~this.field9562 != -1L) {
            this.field9543.setSurface(this.field9562);
            this.method3922((byte) -128);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIZ)Ltf;")
    public final class312 method644(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field9527;
        return new class284(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "()Z")
    public final boolean method599() {
        ++field9695;
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "(IIIII)V")
    public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9544;
        this.method3930(1);
        this.method3888((byte) 36, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "()I")
    public final int method583() {
        ++field9621;
        return 4;
    }

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "()Lub;")
    public final class22 method60() {
        ++field9528;
        int var1 = -1;
        if (this.field9816.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field9816.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (this.field9816.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class22(var1, "OpenGL", this.field9787, this.field9819, 0L);
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(B)V")
    public final void method3955(byte arg0) {
        if (~this.field9753 != -5) {
            this.method3893(0);
            this.method3913(-9373, false);
            this.method3892(false, 1);
            this.method3906(false, 32884);
            this.method3908(false, (byte) 120);
            this.method3901(-2, false);
            this.method3888((byte) 25, 1);
            this.field9753 = 4;
        }
        if (arg0 != 44) {
            this.method3896((class525) null, -81);
        }
        ++field9519;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLve;)V")
    public final void method3956(boolean arg0, class530 arg1) {
        ++field9653;
        if (this.field9795) {
            this.method3968(arg1, -13419);
            this.method3943(arg1, -1297);
        } else {
            if (~this.field9735 <= -4) {
                throw new RuntimeException();
            }
            if (this.field9735 >= 0) {
                this.field9739[this.field9735].method1282(24191);
            }
            this.field9736 = this.field9737 = this.field9739[++this.field9735] = arg1;
            this.field9736.method1271((byte) 98);
        }
        if (arg0) {
            this.method558((class645) null);
        }
    }

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "(I)V")
    public static void method3957(int arg0) {
        field9647 = null;
        if (arg0 <= -29) {
            field9703 = null;
            field9521 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "aa", descriptor = "(IIIIII)V")
    public final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9683;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method3930(1);
        float var10 = (float) arg3 + var8;
        this.method3888((byte) 110, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9815) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9815) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IF)V")
    public final void method3958(int arg0, float arg1) {
        if (this.field9780 != arg1) {
            this.field9780 = arg1;
            if (this.field9867 == 3) {
                this.method3967((byte) -125);
            }
        }
        if (arg0 == -895270824) {
            ++field9679;
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(IIIIII)V")
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9567;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method3930(1);
        this.method3888((byte) 28, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9815) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9815) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "(I)V")
    private final void method3959(int arg0) {
        ++field9571;
        if (arg0 == 22392) {
            if (~this.field9867 != -3) {
                this.field9867 = 2;
                this.method3917(false);
                this.method3916(0);
                this.field9753 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "za", descriptor = "(IIIII)V")
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field9583;
        if (arg0 - -arg2 >= this.field9872 && -arg2 + arg0 <= this.field9789 && arg1 - -arg2 >= this.field9775 && this.field9835 >= arg1 - arg2) {
            this.method3930(1);
            this.method3888((byte) 107, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field9845 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field9803) {
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
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class381.method2234(-125, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class655.field9026[var11] * (float) arg2 + var6, class655.field9029[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFFFI)V")
    public final void method3960(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class36.field544[1] = arg0;
        class36.field544[0] = arg3;
        class36.field544[3] = arg2;
        ++field9523;
        class36.field544[2] = arg1;
        if (arg4 < -8) {
            OpenGL.glTexEnvfv(8960, 8705, class36.field544, 0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(III)V")
    public final void method3961(int arg0, int arg1, int arg2) {
        if (arg2 == 16127) {
            ++field9678;
            if (this.field9810 == 0) {
                boolean var4 = false;
                if (this.field9770 != arg1) {
                    OpenGL.glTexEnvi(8960, 34161, arg1);
                    this.field9770 = arg1;
                    var4 = true;
                }
                if (~this.field9765 != ~arg0) {
                    OpenGL.glTexEnvi(8960, 34162, arg0);
                    this.field9765 = arg0;
                    var4 = true;
                }
                if (var4) {
                    this.field9753 &= -30;
                    return;
                }
            } else {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                OpenGL.glTexEnvi(8960, 34162, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "(I)Lhfa;")
    public final class331 method3962(int arg0) {
        if (arg0 != 3) {
            return null;
        } else {
            ++field9582;
            return this.field9822 == null ? null : this.field9822.method483(0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "ya", descriptor = "()V")
    public final void method6() {
        this.method3908(true, (byte) 127);
        ++field9656;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "(I)V")
    public final void method3963(int arg0) {
        OpenGL.glPushMatrix();
        ++field9553;
        if (arg0 >= -65) {
            this.field9790 = 59;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method595(Canvas arg0, int arg1, int arg2) {
        ++field9580;
        long var4 = 0L;
        if (arg0 != null && this.field9533 != arg0) {
            if (this.field9591.containsKey(arg0)) {
                Long var6 = (Long) this.field9591.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field9513;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field9543.surfaceResized(var4);
            if (this.field9681 == arg0) {
                this.method3922((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Lve;I)V")
    public final void method3964(class530 arg0, int arg1) {
        if (arg1 == -1) {
            ++field9551;
            if (!this.field9795) {
                if (~this.field9735 <= -1 && this.field9739[this.field9735] == arg0) {
                    this.field9739[this.field9735--] = null;
                    arg0.method1282(24191);
                    if (this.field9735 >= 0) {
                        this.field9736 = this.field9737 = this.field9739[this.field9735];
                        this.field9736.method1271((byte) -87);
                    } else {
                        this.field9736 = this.field9737 = null;
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.method3890(arg0, -12737);
                this.method3950((byte) -46, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "()Z")
    public final boolean method601() {
        ++field9536;
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lhea;B)V")
    public final void method3965(class446 arg0, byte arg1) {
        OpenGL.glPushMatrix();
        ++field9690;
        if (arg1 != 95) {
            this.method3902(true);
        }
        OpenGL.glMultMatrixf(arg0.method2633((byte) -127), 0);
    }

    @OriginalMember(owner = "client!pc", name = "la", descriptor = "()V")
    public final void method634() {
        ++field9606;
        this.field9789 = this.field9608;
        this.field9775 = 0;
        this.field9835 = this.field9535;
        this.field9872 = 0;
        OpenGL.glDisable(3089);
        this.method3949(false);
    }

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "()Lnh;")
    public final class778 method614() {
        ++field9596;
        return new class446();
    }

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "(IIIII)V")
    public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3930(1);
        ++field9639;
        this.method3888((byte) 38, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBZ)V")
    public final void method3966(int arg0, byte arg1, boolean arg2) {
        int var4 = -6 / ((arg1 - -8) / 52);
        this.method3905(arg0, true, -93, arg2);
        ++field9685;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public final void method605(int arg0) {
        this.method3970((byte) 93);
        ++field9599;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIIID)V")
    public final void method50(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field9657;
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "(B)V")
    private final void method3967(byte arg0) {
        if (arg0 < -120) {
            ++field9646;
            float var2 = (float) (-this.field9769) * this.field9780 / (float) this.field9855;
            float var3 = (float) (-this.field9812) * this.field9780 / (float) this.field9776;
            float var4 = (float) (this.field9608 - this.field9769) * this.field9780 / (float) this.field9855;
            float var5 = (float) (this.field9535 - this.field9812) * this.field9780 / (float) this.field9776;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field9824, (double) this.field9818);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "()Z")
    public final boolean method612() {
        ++field9716;
        return this.field9815 && (!this.method54() || this.field9849);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(Lve;I)V")
    public final void method3968(class530 arg0, int arg1) {
        ++field9710;
        if (this.field9740 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field9740 >= 0) {
                this.field9733[this.field9740].method1279(-26068);
            }
            if (arg1 != -13419) {
                this.method3910(-16);
            }
            this.field9736 = this.field9733[++this.field9740] = arg0;
            this.field9736.method1281((byte) 127);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFB)V")
    public final void method3969(float arg0, float arg1, byte arg2) {
        this.field9863 = arg0;
        this.field9807 = arg1;
        ++field9626;
        this.method3952(28410);
        if (arg2 > -100) {
            this.field9748 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "(B)V")
    private final void method3970(byte arg0) {
        ++field9632;
        int var2 = -85 / ((-43 - arg0) / 61);
        int var3 = 0;
        while (!this.field9543.method3690()) {
            if (~(var3++) < -6) {
                throw new RuntimeException("");
            }
            class594.method3405(1000L, 16711680);
        }
    }
}
