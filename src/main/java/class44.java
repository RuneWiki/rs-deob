import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class44 extends class288 {

    @OriginalMember(owner = "client!da", name = "fc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field698 = new Hashtable();

    @OriginalMember(owner = "client!da", name = "Ud", descriptor = "I")
    public int field791 = 128;

    @OriginalMember(owner = "client!da", name = "ae", descriptor = "Lbh;")
    private class28 field797 = new class28();

    @OriginalMember(owner = "client!da", name = "ee", descriptor = "Loq;")
    private class242 field801 = new class242();

    @OriginalMember(owner = "client!da", name = "fe", descriptor = "Loq;")
    public class242 field802 = new class242();

    @OriginalMember(owner = "client!da", name = "he", descriptor = "I")
    public int field804 = 8;

    @OriginalMember(owner = "client!da", name = "ge", descriptor = "Z")
    private boolean field803 = false;

    @OriginalMember(owner = "client!da", name = "ke", descriptor = "I")
    public int field807 = 3;

    @OriginalMember(owner = "client!da", name = "ie", descriptor = "Lmf;")
    private class291 field805 = new class291();

    @OriginalMember(owner = "client!da", name = "pe", descriptor = "I")
    private int field812 = -1;

    @OriginalMember(owner = "client!da", name = "oe", descriptor = "[Lem;")
    private class152[] field811 = new class152[4];

    @OriginalMember(owner = "client!da", name = "re", descriptor = "I")
    private int field814 = -1;

    @OriginalMember(owner = "client!da", name = "qe", descriptor = "[Lem;")
    private class152[] field813 = new class152[4];

    @OriginalMember(owner = "client!da", name = "ne", descriptor = "I")
    private int field810 = -1;

    @OriginalMember(owner = "client!da", name = "te", descriptor = "[Lem;")
    private class152[] field816 = new class152[4];

    @OriginalMember(owner = "client!da", name = "ye", descriptor = "Lmf;")
    private class291 field821;

    @OriginalMember(owner = "client!da", name = "ze", descriptor = "Lmf;")
    private class291 field822;

    @OriginalMember(owner = "client!da", name = "Ae", descriptor = "Lmf;")
    private class291 field823;

    @OriginalMember(owner = "client!da", name = "Be", descriptor = "Lmf;")
    private class291 field824;

    @OriginalMember(owner = "client!da", name = "Ce", descriptor = "Lmf;")
    private class291 field825;

    @OriginalMember(owner = "client!da", name = "De", descriptor = "Lmf;")
    private class291 field826;

    @OriginalMember(owner = "client!da", name = "Ee", descriptor = "Lmf;")
    private class291 field827;

    @OriginalMember(owner = "client!da", name = "Se", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!da", name = "Xe", descriptor = "F")
    public float field846;

    @OriginalMember(owner = "client!da", name = "pf", descriptor = "[F")
    public float[] field863;

    @OriginalMember(owner = "client!da", name = "uf", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!da", name = "Oe", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "client!da", name = "Mf", descriptor = "[F")
    private float[] field886;

    @OriginalMember(owner = "client!da", name = "Tf", descriptor = "F")
    private float field893;

    @OriginalMember(owner = "client!da", name = "nf", descriptor = "[F")
    private float[] field861;

    @OriginalMember(owner = "client!da", name = "Qe", descriptor = "F")
    private float field839;

    @OriginalMember(owner = "client!da", name = "Lf", descriptor = "[F")
    private float[] field885;

    @OriginalMember(owner = "client!da", name = "Qf", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "client!da", name = "rf", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!da", name = "qf", descriptor = "F")
    public float field864;

    @OriginalMember(owner = "client!da", name = "wf", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!da", name = "Fe", descriptor = "F")
    public float field828;

    @OriginalMember(owner = "client!da", name = "Af", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!da", name = "og", descriptor = "F")
    private float field914;

    @OriginalMember(owner = "client!da", name = "Df", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!da", name = "kg", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "client!da", name = "Uf", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!da", name = "Rf", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "client!da", name = "zg", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!da", name = "tg", descriptor = "F")
    public float field919;

    @OriginalMember(owner = "client!da", name = "wg", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!da", name = "Gg", descriptor = "[F")
    private float[] field932;

    @OriginalMember(owner = "client!da", name = "ng", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!da", name = "of", descriptor = "F")
    public float field862;

    @OriginalMember(owner = "client!da", name = "fg", descriptor = "F")
    public float field905;

    @OriginalMember(owner = "client!da", name = "tf", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!da", name = "kf", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "client!da", name = "Mg", descriptor = "F")
    public float field938;

    @OriginalMember(owner = "client!da", name = "Ng", descriptor = "Z")
    private boolean field939;

    @OriginalMember(owner = "client!da", name = "pg", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "client!da", name = "Cf", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!da", name = "Cg", descriptor = "[Lbk;")
    private class256[] field928;

    @OriginalMember(owner = "client!da", name = "Og", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "client!da", name = "Pg", descriptor = "F")
    public float field941;

    @OriginalMember(owner = "client!da", name = "Sg", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "client!da", name = "Tg", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!da", name = "Ig", descriptor = "Lcb;")
    public class364 field934;

    @OriginalMember(owner = "client!da", name = "Ug", descriptor = "[I")
    public int[] field946;

    @OriginalMember(owner = "client!da", name = "Yg", descriptor = "[B")
    public byte[] field950;

    @OriginalMember(owner = "client!da", name = "Vg", descriptor = "[I")
    public int[] field947;

    @OriginalMember(owner = "client!da", name = "Zg", descriptor = "[I")
    public int[] field951;

    @OriginalMember(owner = "client!da", name = "Zd", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!da", name = "jc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field702;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field648;

    @OriginalMember(owner = "client!da", name = "Bd", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field772;

    @OriginalMember(owner = "client!da", name = "Gb", descriptor = "J")
    private long field673;

    @OriginalMember(owner = "client!da", name = "ub", descriptor = "J")
    private long field661;

    @OriginalMember(owner = "client!da", name = "yg", descriptor = "Z")
    public boolean field924;

    @OriginalMember(owner = "client!da", name = "Ke", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!da", name = "If", descriptor = "Ljava/lang/String;")
    private String field882;

    @OriginalMember(owner = "client!da", name = "jf", descriptor = "Z")
    public boolean field857;

    @OriginalMember(owner = "client!da", name = "Te", descriptor = "Z")
    private boolean field842;

    @OriginalMember(owner = "client!da", name = "ff", descriptor = "Z")
    public boolean field854;

    @OriginalMember(owner = "client!da", name = "Yf", descriptor = "Z")
    public boolean field898;

    @OriginalMember(owner = "client!da", name = "sf", descriptor = "Z")
    public boolean field866;

    @OriginalMember(owner = "client!da", name = "We", descriptor = "Z")
    private boolean field845;

    @OriginalMember(owner = "client!da", name = "Of", descriptor = "Ljava/lang/String;")
    private String field888;

    @OriginalMember(owner = "client!da", name = "ug", descriptor = "Z")
    public boolean field920;

    @OriginalMember(owner = "client!da", name = "ef", descriptor = "Z")
    private boolean field853;

    @OriginalMember(owner = "client!da", name = "Wd", descriptor = "Lqf;")
    public class483 field793;

    @OriginalMember(owner = "client!da", name = "le", descriptor = "Ltr;")
    public class194 field808;

    @OriginalMember(owner = "client!da", name = "Vd", descriptor = "Lsp;")
    private class453 field792;

    @OriginalMember(owner = "client!da", name = "Xd", descriptor = "Lci;")
    private class316 field794;

    @OriginalMember(owner = "client!da", name = "be", descriptor = "Lpi;")
    private class347 field798;

    @OriginalMember(owner = "client!da", name = "ec", descriptor = "Los;")
    public static class309 field697 = new class309("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!da", name = "Id", descriptor = "Lgh;")
    public static class388 field779 = null;

    @OriginalMember(owner = "client!da", name = "Pe", descriptor = "F")
    public float field838;

    @OriginalMember(owner = "client!da", name = "Ye", descriptor = "F")
    public float field847;

    @OriginalMember(owner = "client!da", name = "Ze", descriptor = "F")
    public float field848;

    @OriginalMember(owner = "client!da", name = "df", descriptor = "F")
    private float field852;

    @OriginalMember(owner = "client!da", name = "yf", descriptor = "F")
    private float field872;

    @OriginalMember(owner = "client!da", name = "zf", descriptor = "F")
    public float field873;

    @OriginalMember(owner = "client!da", name = "Ff", descriptor = "F")
    private float field879;

    @OriginalMember(owner = "client!da", name = "Zf", descriptor = "F")
    public float field899;

    @OriginalMember(owner = "client!da", name = "Fg", descriptor = "F")
    public float field931;

    @OriginalMember(owner = "client!da", name = "Lg", descriptor = "F")
    public float field937;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!da", name = "mb", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!da", name = "nb", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!da", name = "ob", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!da", name = "qb", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!da", name = "rb", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!da", name = "sb", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!da", name = "tb", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!da", name = "vb", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!da", name = "wb", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!da", name = "xb", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!da", name = "yb", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!da", name = "zb", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!da", name = "Ab", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!da", name = "Bb", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!da", name = "Cb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!da", name = "Db", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!da", name = "Eb", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!da", name = "Fb", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!da", name = "Hb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!da", name = "Ib", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!da", name = "Jb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!da", name = "Kb", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!da", name = "Lb", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!da", name = "Mb", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!da", name = "Nb", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!da", name = "Ob", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!da", name = "Pb", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!da", name = "Qb", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!da", name = "Rb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!da", name = "Sb", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!da", name = "Tb", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!da", name = "Ub", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!da", name = "Vb", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!da", name = "Wb", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!da", name = "Xb", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!da", name = "Yb", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!da", name = "Zb", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!da", name = "ac", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!da", name = "bc", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!da", name = "cc", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!da", name = "dc", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!da", name = "gc", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!da", name = "hc", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!da", name = "ic", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!da", name = "kc", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!da", name = "lc", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!da", name = "mc", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!da", name = "nc", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!da", name = "oc", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!da", name = "pc", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!da", name = "qc", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!da", name = "rc", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!da", name = "sc", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!da", name = "tc", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!da", name = "uc", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!da", name = "vc", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!da", name = "wc", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!da", name = "xc", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!da", name = "yc", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!da", name = "zc", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!da", name = "Ac", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!da", name = "Bc", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!da", name = "Cc", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!da", name = "Dc", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!da", name = "Ec", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!da", name = "Fc", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!da", name = "Gc", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!da", name = "Hc", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!da", name = "Ic", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!da", name = "Jc", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!da", name = "Kc", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!da", name = "Lc", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!da", name = "Mc", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!da", name = "Nc", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!da", name = "Oc", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!da", name = "Pc", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!da", name = "Qc", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!da", name = "Rc", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!da", name = "Sc", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!da", name = "Tc", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!da", name = "Uc", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!da", name = "Vc", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!da", name = "Wc", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!da", name = "Xc", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!da", name = "Yc", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!da", name = "Zc", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!da", name = "ad", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!da", name = "bd", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!da", name = "cd", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!da", name = "dd", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!da", name = "ed", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!da", name = "fd", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!da", name = "gd", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!da", name = "hd", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!da", name = "id", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!da", name = "jd", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!da", name = "kd", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!da", name = "ld", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!da", name = "md", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!da", name = "nd", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!da", name = "od", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!da", name = "pd", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!da", name = "qd", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!da", name = "rd", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!da", name = "sd", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!da", name = "td", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!da", name = "ud", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!da", name = "vd", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!da", name = "wd", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!da", name = "xd", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!da", name = "yd", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!da", name = "zd", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!da", name = "Ad", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!da", name = "Cd", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!da", name = "Dd", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!da", name = "Ed", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!da", name = "Fd", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!da", name = "Gd", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!da", name = "Hd", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!da", name = "Jd", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!da", name = "Kd", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!da", name = "Ld", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!da", name = "Md", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!da", name = "Nd", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!da", name = "Od", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!da", name = "Pd", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!da", name = "Qd", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!da", name = "Rd", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!da", name = "Sd", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!da", name = "Td", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!da", name = "ce", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!da", name = "de", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!da", name = "je", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!da", name = "ve", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!da", name = "we", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "client!da", name = "xe", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!da", name = "Ge", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!da", name = "Re", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "client!da", name = "Ue", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!da", name = "af", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "client!da", name = "xf", descriptor = "I")
    private int field871;

    @OriginalMember(owner = "client!da", name = "Hf", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!da", name = "ag", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!da", name = "cg", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "client!da", name = "jg", descriptor = "I")
    private int field909;

    @OriginalMember(owner = "client!da", name = "lg", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "client!da", name = "mg", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "client!da", name = "vg", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!da", name = "Ag", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!da", name = "Hg", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "client!da", name = "Kg", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "client!da", name = "Wg", descriptor = "I")
    private int field948;

    @OriginalMember(owner = "client!da", name = "Xg", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!da", name = "He", descriptor = "J")
    private long field830;

    @OriginalMember(owner = "client!da", name = "Wf", descriptor = "Lma;")
    private class10 field896;

    @OriginalMember(owner = "client!da", name = "Jf", descriptor = "Lgg;")
    private class118 field883;

    @OriginalMember(owner = "client!da", name = "Kf", descriptor = "Lgg;")
    private class118 field884;

    @OriginalMember(owner = "client!da", name = "xg", descriptor = "Lsq;")
    public class120 field923;

    @OriginalMember(owner = "client!da", name = "se", descriptor = "Lem;")
    private class152 field815;

    @OriginalMember(owner = "client!da", name = "ue", descriptor = "Lem;")
    private class152 field817;

    @OriginalMember(owner = "client!da", name = "Eg", descriptor = "Lvn;")
    public class206 field930;

    @OriginalMember(owner = "client!da", name = "mf", descriptor = "Loq;")
    public class242 field860;

    @OriginalMember(owner = "client!da", name = "eg", descriptor = "Loq;")
    public class242 field904;

    @OriginalMember(owner = "client!da", name = "Xf", descriptor = "Laf;")
    private class302 field897;

    @OriginalMember(owner = "client!da", name = "Gf", descriptor = "Lal;")
    private class67 field880;

    @OriginalMember(owner = "client!da", name = "Sf", descriptor = "Ler;")
    public class70 field892;

    @OriginalMember(owner = "client!da", name = "dg", descriptor = "Ler;")
    public class70 field903;

    @OriginalMember(owner = "client!da", name = "Je", descriptor = "Lgm;")
    public class81 field832;

    @OriginalMember(owner = "client!da", name = "Me", descriptor = "Lgm;")
    public class81 field835;

    @OriginalMember(owner = "client!da", name = "cf", descriptor = "Lgm;")
    public class81 field851;

    @OriginalMember(owner = "client!da", name = "gf", descriptor = "Lgm;")
    public class81 field855;

    @OriginalMember(owner = "client!da", name = "hf", descriptor = "Lgm;")
    public class81 field856;

    @OriginalMember(owner = "client!da", name = "vf", descriptor = "Lgm;")
    public class81 field869;

    @OriginalMember(owner = "client!da", name = "gg", descriptor = "Lgm;")
    public class81 field906;

    @OriginalMember(owner = "client!da", name = "ig", descriptor = "Lgm;")
    public class81 field908;

    @OriginalMember(owner = "client!da", name = "Qg", descriptor = "Lgm;")
    public class81 field942;

    @OriginalMember(owner = "client!da", name = "Rg", descriptor = "Lgm;")
    public class81 field943;

    @OriginalMember(owner = "client!da", name = "me", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field809;

    @OriginalMember(owner = "client!da", name = "Le", descriptor = "Z")
    private boolean field834;

    @OriginalMember(owner = "client!da", name = "Ne", descriptor = "Z")
    public boolean field836;

    @OriginalMember(owner = "client!da", name = "Ve", descriptor = "Z")
    public boolean field844;

    @OriginalMember(owner = "client!da", name = "bf", descriptor = "Z")
    public boolean field850;

    @OriginalMember(owner = "client!da", name = "lf", descriptor = "Z")
    public boolean field859;

    @OriginalMember(owner = "client!da", name = "Bf", descriptor = "Z")
    private boolean field875;

    @OriginalMember(owner = "client!da", name = "Ef", descriptor = "Z")
    public boolean field878;

    @OriginalMember(owner = "client!da", name = "Nf", descriptor = "Z")
    public boolean field887;

    @OriginalMember(owner = "client!da", name = "Pf", descriptor = "Z")
    private boolean field889;

    @OriginalMember(owner = "client!da", name = "Vf", descriptor = "Z")
    public boolean field895;

    @OriginalMember(owner = "client!da", name = "bg", descriptor = "Z")
    private boolean field901;

    @OriginalMember(owner = "client!da", name = "hg", descriptor = "Z")
    private boolean field907;

    @OriginalMember(owner = "client!da", name = "qg", descriptor = "Z")
    private boolean field916;

    @OriginalMember(owner = "client!da", name = "rg", descriptor = "Z")
    private boolean field917;

    @OriginalMember(owner = "client!da", name = "sg", descriptor = "Z")
    private boolean field918;

    @OriginalMember(owner = "client!da", name = "Bg", descriptor = "Z")
    private boolean field927;

    @OriginalMember(owner = "client!da", name = "Dg", descriptor = "Z")
    private boolean field929;

    @OriginalMember(owner = "client!da", name = "Jg", descriptor = "Z")
    public boolean field935;

    @OriginalMember(owner = "client!da", name = "Yd", descriptor = "[I")
    public static int[] field795;

    @OriginalMember(owner = "client!da", name = "Ie", descriptor = "[Lac;")
    private class381[] field831;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
    public final boolean method270() {
        ++field710;
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public final int method271(int arg0, int arg1) {
        ++field694;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lbk;")
    public final class256 method272(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field688;
        return new class140(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public final void method273(boolean arg0) {
        ++field672;
        this.field939 = arg0;
        this.method342(0);
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(I)V")
    private final void method274(int arg0) {
        ++field745;
        if (arg0 > -40) {
            this.method270();
        }
        int var2 = 0;
        while (!this.field772.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class50.method470(1000L, -5);
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Z)V")
    public static final void method275(boolean arg0) {
        ++field757;
        if (class99.field1922 != null) {
            class99.field1922.method1494((byte) 85);
        }
        if (arg0) {
            method275(false);
        }
        if (class52.field1122 != null) {
            class52.field1122.method1494((byte) 85);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    public final void method276(int arg0, int arg1, int arg2) {
        this.field858 = arg2;
        ++field687;
        this.field915 = arg0;
        this.method423(118);
        if (arg1 != -1) {
            this.field872 = -0.7793639F;
        }
        this.method424(44);
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "()V")
    public final void method277() {
        ++field780;
        if (this.field853 && ~this.field790 < -1 && ~this.field725 < -1) {
            int var1 = this.field837;
            int var2 = this.field910;
            int var3 = this.field925;
            int var4 = this.field891;
            this.method321();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method437(-122);
            this.method322(false, (byte) 30);
            this.method386(false, -8);
            this.method379(-28710, false);
            this.method447((byte) 46, false);
            this.method381((byte) 28, (class381) null);
            this.method430(-2, (byte) -76);
            this.method288((byte) -115, 1);
            this.method340((byte) 115, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field790, this.field725, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method371(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IIII)V")
    public final void method278(int arg0, int arg1, int arg2, int arg3) {
        this.field792.method2706(arg0, arg2, false, arg3, arg1);
        ++field692;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
    public final void method279(boolean arg0) {
        ++field658;
    }

    @OriginalMember(owner = "client!da", name = "t", descriptor = "()Z")
    public final boolean method280() {
        ++field643;
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
    public final void method281(int arg0, boolean arg1) {
        if (arg0 >= -82) {
            this.field831 = null;
        }
        if (!arg1 == this.field929) {
            this.field929 = arg1;
            this.method299(122);
        }
        ++field612;
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
    public final void method282() {
        ++field664;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[BZ)Lgg;")
    public final class118 method283(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        ++field729;
        if (arg2 > -26) {
            this.method326((class124) null);
        }
        return (class118) (!this.field842 || arg4 && !this.field845 ? new class274(this, arg1, arg3, arg0) : new class114(this, arg1, arg3, arg0, arg4));
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "()Z")
    public final boolean method284() {
        ++field751;
        return true;
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(I)V")
    private final void method285(int arg0) {
        if (arg0 == 2) {
            this.field847 = (float) (-this.field870 + this.field925);
            this.field848 = (float) (this.field837 - this.field945);
            ++field644;
            this.field838 = (float) (-this.field870 + this.field891);
            this.field931 = (float) (-this.field945 + this.field910);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static void method286(byte arg0) {
        field697 = null;
        if (arg0 != -117) {
            field795 = null;
        }
        field779 = null;
        field795 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public final void method287(boolean arg0) {
        ++field749;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
    public final void method288(byte arg0, int arg1) {
        ++field740;
        if (~arg1 == -2) {
            this.method426(7681, 7681, -24610);
        } else if (arg1 == 0) {
            this.method426(8448, 8448, -24610);
        } else if (arg1 == 2) {
            this.method426(34165, 7681, -24610);
        } else if (arg1 != 3) {
            if (~arg1 == -5) {
                this.method426(34023, 34023, -24610);
            }
        } else {
            this.method426(260, 8448, -24610);
        }
        int var3 = 12 % ((-43 - arg0) / 48);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
    private final void method289(byte arg0) {
        if (this.field899 != 0.0F) {
            float var2 = this.field941 / (this.field941 + this.field899);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field872 * (1.0F - var2) / this.field899;
            this.field861[14] = this.field872 * var3;
            this.field861[10] = this.field879 + var4;
        } else {
            this.field861[14] = this.field872;
            this.field861[10] = this.field879;
        }
        ++field789;
        this.field846 = (this.field861[14] + (float) (-this.field865)) / this.field861[10];
        this.field828 = (float) this.field865 + -this.field899;
        int var5 = 52 / ((13 - arg0) / 52);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)V")
    public final synchronized void method290(int arg0, int arg1) {
        ++field617;
        class100 var3 = new class100(arg0);
        this.field824.method1885(false, var3);
        if (arg1 != 34200) {
            this.field886 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "(I)V")
    private final void method291(int arg0) {
        ++field671;
        float var2 = (float) (-this.field945) * this.field914 / (float) this.field913;
        float var3 = (float) (-this.field870) * this.field914 / (float) this.field867;
        float var4 = (float) (-this.field945 + this.field790) * this.field914 / (float) this.field913;
        float var5 = (float) (-this.field870 + this.field725) * this.field914 / (float) this.field867;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field922 + -this.field899), (double) ((float) this.field865 - this.field899));
        }
        if (arg0 >= 3) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(Z)V")
    public final void method292(boolean arg0) {
        ++field763;
        if (!arg0) {
            if (this.field871 != 4) {
                this.method407(5888);
                this.method322(false, (byte) -91);
                this.method386(false, -8);
                this.method379(-28710, false);
                this.method447((byte) 46, false);
                this.method430(-2, (byte) -98);
                this.method340((byte) 105, 1);
                this.method288((byte) 80, 0);
                this.field871 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lqg;Lqg;FLqg;)Lqg;")
    public final class325 method293(class325 arg0, class325 arg1, float arg2, class325 arg3) {
        ++field675;
        if (arg0 != null && arg1 != null && this.field935 && this.field920) {
            class271 var5 = null;
            class10 var6 = (class10) arg0;
            class10 var7 = (class10) arg1;
            class46 var8 = var6.method59((byte) -123);
            class46 var9 = var7.method59((byte) -123);
            if (var8 != null && var9 != null) {
                int var10 = var9.field957 < var8.field957 ? var8.field957 : var9.field957;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class271) {
                    class271 var11 = (class271) arg3;
                    if (var10 == var11.method1717(false)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class271(this, var10);
                }
                if (var5.method1718(-115, var9, var8, arg2)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!da", name = "t", descriptor = "(I)V")
    public final void method294(int arg0) {
        this.method340((byte) -91, 0);
        ++field723;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILem;)V")
    public final void method295(int arg0, class152 arg1) {
        ++field746;
        if (~this.field814 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field814 <= -1) {
                this.field811[this.field814].method1118(-103);
            }
            this.field817 = this.field811[++this.field814] = arg1;
            this.field817.method1114(-26734);
            int var3 = 86 / ((6 - arg0) / 53);
        }
    }

    @OriginalMember(owner = "client!da", name = "k", descriptor = "(I)V")
    private final void method296(int arg0) {
        ++field769;
        this.method430(-2, (byte) -82);
        for (int var2 = this.field843 - 1; var2 >= 0; --var2) {
            this.method392((byte) 106, var2);
            this.method381((byte) 28, (class381) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method426(8448, 8448, arg0 + 2308);
        this.method412(2, 34168, 770, 91);
        this.method366(false);
        this.field912 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field849 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field875 = true;
        OpenGL.glColorMask(true, true, true, true);
        if (arg0 != -26918) {
            this.method412(-67, 70, -46, 59);
        }
        this.field917 = true;
        this.method322(true, (byte) -83);
        this.method386(true, -8);
        this.method379(-28710, true);
        this.method447((byte) 46, true);
        this.method437(-90);
        this.field772.setSwapInterval(0);
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
        this.field890 = this.field874 = -1;
        this.method321();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lpn;IIII)Le;")
    public final class374 method297(class528 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field754;
        return new class81(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Le;Lip;Lc;Lpr;I)V")
    public final void method298(class374 arg0, class502 arg1, class124 arg2, class313 arg3, int arg4) {
        ++field613;
        arg0.method723(arg2, arg3, arg4);
        this.method414(arg1);
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "(I)V")
    private final void method299(int arg0) {
        ++field657;
        if (this.field901 && !this.field929) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 <= 90) {
            this.field813 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(I)V")
    private final void method300(int arg0) {
        ++field655;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg0 == -24121) {
            OpenGL.glMultMatrixf(this.field904.method1585(arg0 + 23998), 0);
            if (this.field895) {
                this.field798.field5164.method2185(-98);
            }
            this.method442(true);
            this.method368((byte) -128);
        }
    }

    @OriginalMember(owner = "client!da", name = "K", descriptor = "(IIIIII[BII)V")
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field799;
        float var10;
        float var11;
        if (this.field880 != null && ~arg2 >= ~this.field880.field2097 && ~arg3 >= ~this.field880.field2107) {
            this.field880.method969(arg2, 0, false, 0, 2, 6406, arg3, arg6, 0, 0);
            var10 = (float) arg2 * this.field880.field1369 / (float) this.field880.field2097;
            var11 = (float) arg3 * this.field880.field1364 / (float) this.field880.field2107;
        } else {
            this.field880 = class301.method1938(-113, arg2, 6406, this, 6406, false, arg6, arg3);
            this.field880.method967(8276, false, false);
            var11 = this.field880.field1364;
            var10 = this.field880.field1369;
        }
        this.method315((byte) -37);
        this.method381((byte) 28, this.field880);
        this.method340((byte) -49, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method339(arg5, 30766);
        this.method426(34165, 34165, -24610);
        this.method412(0, 34166, 768, -46);
        this.method412(2, 5890, 770, -124);
        this.method325(34166, 5126, 770, 0);
        this.method325(5890, 5126, 770, 2);
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
        this.method412(0, 5890, 768, 100);
        this.method412(2, 34166, 770, -81);
        this.method325(5890, 5126, 770, 0);
        this.method325(34166, 5126, 770, 2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
    public final boolean method302() {
        ++field666;
        return true;
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(IFFFFF)V")
    public final void method303(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field635;
        boolean var7 = this.field890 != arg0;
        if (var7 || this.field938 != arg1 || this.field905 != arg2) {
            this.field938 = arg1;
            this.field890 = arg0;
            this.field905 = arg2;
            if (var7) {
                this.field862 = (float) (this.field890 & 16711680) / 1.671168E7F;
                this.field864 = (float) (this.field890 & 65280) / 65280.0F;
                this.field919 = (float) (255 & this.field890) / 255.0F;
                this.method384(true);
            }
            this.method336(2691);
        }
        if (this.field885[0] != arg3 || this.field885[1] != arg4 || this.field885[2] != arg5) {
            this.field885[2] = arg5;
            this.field885[1] = arg4;
            this.field885[0] = arg3;
            this.field886[2] = -arg5;
            this.field886[0] = -arg3;
            this.field886[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field863[0] = arg3 * var8;
            this.field863[2] = arg5 * var8;
            this.field863[1] = arg4 * var8;
            this.field932[2] = -this.field863[2];
            this.field932[1] = -this.field863[1];
            this.field932[0] = -this.field863[0];
            this.method442(true);
            this.field900 = (int) (arg5 * 256.0F / arg4);
            this.field881 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
    public final void method304(byte arg0) {
        if (~this.field871 != -9) {
            this.method390((byte) -66);
            this.method322(true, (byte) -92);
            this.method379(-28710, true);
            this.method447((byte) 46, true);
            this.method340((byte) -56, 1);
            this.method288((byte) 11, 0);
            this.field871 = 8;
        }
        if (arg0 == 124) {
            ++field676;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)V")
    public final synchronized void method305(int arg0, int arg1, boolean arg2) {
        ++field645;
        class100 var4 = new class100(arg0);
        var4.field3977 = (long) arg1;
        this.field825.method1885(arg2, var4);
        if (arg2) {
            this.method282();
        }
    }

    @OriginalMember(owner = "client!da", name = "n", descriptor = "(I)V")
    private final void method306(int arg0) {
        ++field608;
        if (~this.field909 != arg0) {
            this.field909 = 3;
            this.method291(112);
            this.method300(-24121);
            this.field871 &= -8;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public final synchronized void method307(int arg0) {
        ++field756;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field822.method1889((byte) -119)) {
            class100 var12 = (class100) this.field822.method1894((byte) -123);
            class491.field7199[var2++] = (int) var12.field3977;
            this.field818 -= var12.field1923;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class491.field7199, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class491.field7199, 0);
            var2 = 0;
        }
        while (!this.field823.method1889((byte) -114)) {
            class100 var11 = (class100) this.field823.method1894((byte) -122);
            class491.field7199[var2++] = (int) var11.field3977;
            this.field820 -= var11.field1923;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class491.field7199, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class491.field7199, 0);
            var2 = 0;
        }
        while (!this.field824.method1889((byte) -120)) {
            class100 var10 = (class100) this.field824.method1894((byte) -70);
            class491.field7199[var2++] = var10.field1923;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class491.field7199, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class491.field7199, 0);
            var2 = 0;
        }
        while (!this.field825.method1889((byte) -124)) {
            class100 var9 = (class100) this.field825.method1894((byte) -102);
            class491.field7199[var2++] = (int) var9.field3977;
            this.field819 -= var9.field1923;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class491.field7199, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class491.field7199, 0);
            boolean var4 = false;
        }
        while (!this.field821.method1889((byte) -125)) {
            class100 var8 = (class100) this.field821.method1894((byte) -98);
            OpenGL.glDeleteLists((int) var8.field3977, var8.field1923);
        }
        while (!this.field826.method1889((byte) -125)) {
            class261 var7 = this.field826.method1894((byte) -98);
            OpenGL.glDeleteProgramARB((int) var7.field3977);
        }
        while (!this.field827.method1889((byte) -127)) {
            class261 var6 = this.field827.method1894((byte) -124);
            OpenGL.glDeleteObjectARB(var6.field3977);
        }
        while (!this.field821.method1889((byte) -127)) {
            class100 var5 = (class100) this.field821.method1894((byte) -114);
            OpenGL.glDeleteLists((int) var5.field3977, var5.field1923);
        }
        this.field793.method2897((byte) -103);
        if (~this.method317() < -100663297 && ~(this.field830 + 60000L) > ~class423.method2578(-19698)) {
            System.gc();
            this.field830 = class423.method2578(-19698);
        }
        this.field806 = var3;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(II)I")
    public final int method308(int arg0, int arg1) {
        ++field771;
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg0 < 113) {
                return -70;
            } else if (arg1 != 5123 && ~arg1 != -5123) {
                if (~arg1 != -5126 && ~arg1 != -5125 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final boolean method309() {
        ++field681;
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field679;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method311(Canvas arg0) {
        ++field755;
        this.field648 = null;
        this.field661 = 0L;
        if (arg0 != null && this.field702 != arg0) {
            if (this.field698.containsKey(arg0)) {
                Long var2 = (Long) this.field698.get(arg0);
                this.field661 = var2;
                this.field648 = arg0;
            }
        } else {
            this.field648 = this.field702;
            this.field661 = this.field673;
        }
        if (this.field648 != null && ~this.field661 != -1L) {
            this.field772.setSurface(this.field661);
            this.method362(106);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(IIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3) {
        ++field744;
        if (arg3 == 7111) {
            OpenGL.glDrawArrays(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!da", name = "sa", descriptor = "(IIII)[I")
    public final int[] method313(int arg0, int arg1, int arg2, int arg3) {
        ++field767;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field725 - var6, arg2, 1, 32993, this.field833, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)I")
    public final int method314(int arg0, byte arg1) {
        ++field627;
        if (arg0 != 1) {
            if (~arg0 == -1) {
                return 8448;
            } else if (~arg0 == -3) {
                return 34165;
            } else if (~arg0 != -4) {
                if (~arg0 == -5) {
                    return 34023;
                } else {
                    int var3 = -107 % ((71 - arg1) / 55);
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
    public final void method315(byte arg0) {
        if (arg0 != -37) {
            this.field865 = 73;
        }
        ++field659;
        if (~this.field871 != -3) {
            this.method407(5888);
            this.method322(false, (byte) -85);
            this.method386(false, -8);
            this.method379(-28710, false);
            this.method447((byte) 46, false);
            this.method430(-2, (byte) -121);
            this.field871 = 2;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public final void method316(int arg0) {
        ++field785;
        this.method274(-125);
    }

    @OriginalMember(owner = "client!da", name = "pa", descriptor = "()I")
    public final int method317() {
        ++field784;
        return this.field819 + this.field818 - -this.field820;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method318(Canvas arg0) {
        ++field616;
        long var2 = 0L;
        if (arg0 != null && this.field702 != arg0) {
            if (this.field698.containsKey(arg0)) {
                Long var4 = (Long) this.field698.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field673;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field772.surfaceResized(var2);
            if (this.field648 == arg0) {
                this.method362(123);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILlt;)V")
    public class44(int arg0, Canvas arg1, class16 arg2, int arg3, class480 arg4) {
        super(arg0, arg2);
        new class83();
        new class249(16);
        this.field821 = new class291();
        this.field822 = new class291();
        this.field823 = new class291();
        this.field824 = new class291();
        this.field825 = new class291();
        this.field826 = new class291();
        this.field827 = new class291();
        this.field841 = 0;
        this.field846 = 3584.0F;
        this.field863 = new float[4];
        this.field868 = -1;
        this.field837 = 0;
        this.field886 = new float[4];
        this.field893 = 1.0F;
        this.field861 = new float[16];
        this.field839 = 0.0F;
        this.field885 = new float[4];
        this.field890 = -1;
        this.field865 = 3584;
        this.field864 = 1.0F;
        this.field870 = 0;
        this.field828 = 3584.0F;
        this.field874 = -1;
        this.field914 = 1.0F;
        this.field877 = -1;
        this.field910 = 0;
        this.field894 = 0;
        this.field891 = 0;
        this.field925 = 0;
        this.field919 = 1.0F;
        this.field922 = 50;
        this.field932 = new float[4];
        this.field913 = 512;
        this.field862 = 1.0F;
        this.field905 = -1.0F;
        this.field867 = 512;
        this.field858 = 0;
        this.field938 = -1.0F;
        this.field939 = true;
        this.field915 = 0;
        this.field876 = -1;
        this.field928 = new class256[class230.field3568];
        this.field940 = 8448;
        this.field941 = 3000.0F;
        this.field944 = 8448;
        this.field945 = 0;
        this.field934 = new class364(8192);
        this.field946 = new int[1];
        this.field950 = new byte[16384];
        this.field947 = new int[1];
        this.field951 = new int[1];
        this.field796 = arg3;
        this.field648 = this.field702 = arg1;
        try {
            if (class476.field7047 == null || !class476.field7047) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method2861("libjaggl.jnilib", 122).toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2861("jaggl.dll", 126).toString());
                        }
                    } else {
                        System.load(arg4.method2861("libjaggl.so", 124).toString());
                    }
                    class476.field7047 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class476.field7047 = Boolean.TRUE;
                }
            }
            if (class476.field7047 != null && class476.field7047) {
                this.field772 = new OpenGL();
                this.field661 = this.field673 = this.field772.init(arg1, 8, 8, 8, 24, 0, this.field796);
                if (this.field673 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method274(-52);
                    int var7 = this.method441(-118);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field833 = !this.field924 ? 5121 : 33639;
                        if (~this.field882.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class266.method1697(0, ' ', this.field882.replace('/', ' '));
                            for (int var12 = 0; var12 < var11.length; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (var13.length() > 0) {
                                        if (~var13.charAt(0) == -121 && ~var13.length() <= -4 && class257.method1657(var13.substring(1, 3), true)) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var9 = true;
                                                var13 = var13.substring(2);
                                            }
                                            if (~var13.length() <= -5 && class257.method1657(var13.substring(0, 4), true)) {
                                                var8 = class19.method129(-79, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field857 = false;
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field842 = false;
                                }
                                if (var8 >= 7000 && ~var8 >= -9251) {
                                    this.field854 = false;
                                }
                            }
                            this.field898 &= this.field772.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field866 = true;
                            this.field845 = this.field842;
                        }
                        if (this.field888.indexOf("intel") != -1) {
                            this.field920 = false;
                        }
                        this.field853 = !this.field888.equals("s3 graphics");
                        if (this.field842) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class140.method1050(1135383648, true, false);
                        this.field803 = true;
                        this.field793 = new class483(this, super.field4358);
                        this.method435(false);
                        this.field808 = new class194(this);
                        this.field792 = new class453(this);
                        if (this.field792.method2709(-119)) {
                            this.field794 = new class316(this);
                            if (!this.field794.method1994((byte) 112)) {
                                this.field794.method1061(0);
                                this.field794 = null;
                            }
                        }
                        this.field798 = new class347(this);
                        this.method296(-26918);
                        this.method362(120);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field772.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (~(var15++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class50.method470(100L, -5);
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
            this.method425();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lgg;B)V")
    public final void method319(class118 arg0, byte arg1) {
        if (this.field884 != arg0) {
            if (this.field842) {
                OpenGL.glBindBufferARB(34962, arg0.method953(-28043));
            }
            this.field884 = arg0;
        }
        if (arg1 == -28) {
            ++field715;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILta;II)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8) {
        ++field786;
        class171 var10 = (class171) arg6;
        class67 var11 = var10.field2770;
        this.method315((byte) -37);
        this.method381((byte) 28, var10.field2770);
        this.method340((byte) -73, arg5);
        this.method426(7681, 8448, -24610);
        this.method412(0, 34167, 768, 84);
        float var12 = var11.field1369 / (float) var11.field1365;
        float var13 = var11.field1364 / (float) var11.field1368;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method412(0, 5890, 768, 95);
    }

    @OriginalMember(owner = "client!da", name = "va", descriptor = "()V")
    public final void method321() {
        this.field891 = this.field725;
        this.field925 = 0;
        this.field837 = 0;
        this.field910 = this.field790;
        ++field634;
        OpenGL.glDisable(3089);
        this.method285(2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V")
    public final void method322(boolean arg0, byte arg1) {
        ++field693;
        int var3 = -32 / ((-31 - arg1) / 50);
        if (!arg0 == this.field918) {
            this.field918 = arg0;
            this.method439(2912);
            this.field871 &= -32;
        }
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(I)V")
    private final void method323(int arg0) {
        ++field776;
        if (arg0 == 1) {
            if (~this.field871 != -2) {
                this.method407(arg0 ^ 5889);
                this.method322(false, (byte) -101);
                this.method386(false, -8);
                this.method379(-28710, false);
                this.method447((byte) 46, false);
                this.method381((byte) 28, (class381) null);
                this.method430(-2, (byte) -86);
                this.method288((byte) 36, 1);
                this.field871 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "GA", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
        this.field913 = arg2;
        ++field775;
        this.field867 = arg3;
        this.field870 = arg1;
        this.field945 = arg0;
        this.method380(-115);
        this.method285(2);
        if (~this.field909 == -4) {
            this.method291(103);
        } else if (this.field909 == 2) {
            this.method433((byte) -51);
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIII)V")
    public final void method325(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 5126) {
            this.field801 = null;
        }
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg0);
        ++field686;
        OpenGL.glTexEnvi(8960, 34200 - -arg3, arg2);
    }

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(Lc;)V")
    public final void method326(class124 arg0) {
        ++field677;
        this.field904 = (class242) arg0;
        this.field860.method1581(-6354, this.field904);
        if (~this.field909 != -2) {
            this.method300(-24121);
        }
    }

    @OriginalMember(owner = "client!da", name = "P", descriptor = "(IIIIII)V")
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field718;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method323(1);
        this.method340((byte) 102, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field907) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field907) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IJ)V")
    public final synchronized void method328(int arg0, long arg1) {
        ++field717;
        class261 var4 = new class261();
        var4.field3977 = arg1;
        if (arg0 < 9) {
            this.method318((Canvas) null);
        }
        this.field827.method1885(false, var4);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()Z")
    public final boolean method329() {
        ++field647;
        return this.field798.method2170(false, 3);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(IIIIII)Lqg;")
    public final class325 method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field646;
        return this.field935 ? new class21(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "()I")
    public final int method331() {
        ++field760;
        int var1 = this.field948;
        this.field948 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lo;")
    public final class24 method332(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field716;
        return new class523(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()V")
    public final void method333() {
        ++field631;
        if (this.field794 != null && this.field794.method1065(3)) {
            this.field792.method2710(this.field794, 34842);
            this.field793.method2901(34842);
        }
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
    public final boolean method334() {
        ++field662;
        return this.field794 != null && this.field794.method1065(3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lo;")
    public final class24 method335(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field630;
        return new class523(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!da", name = "p", descriptor = "(I)V")
    private final void method336(int arg0) {
        class522.field7583[0] = this.field938 * this.field862;
        class522.field7583[1] = this.field938 * this.field864;
        ++field684;
        class522.field7583[2] = this.field938 * this.field919;
        class522.field7583[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class522.field7583, 0);
        class522.field7583[2] = -this.field905 * this.field919;
        class522.field7583[0] = -this.field905 * this.field862;
        class522.field7583[1] = -this.field905 * this.field864;
        class522.field7583[3] = 1.0F;
        if (arg0 != 2691) {
            this.method336(81);
        }
        OpenGL.glLightfv(16385, 4609, class522.field7583, 0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method337(Rectangle[] arg0, int arg1) {
        ++field747;
        this.method355();
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
    public final boolean method338() {
        ++field737;
        return this.field794 != null && (~this.field796 >= -2 || this.field927);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(II)V")
    public final void method339(int arg0, int arg1) {
        class522.field7583[0] = (float) class490.method2960(arg0, 16711680) / 1.671168E7F;
        class522.field7583[1] = (float) class490.method2960(65280, arg0) / 65280.0F;
        class522.field7583[3] = (float) (arg0 >>> 24) / 255.0F;
        class522.field7583[2] = (float) class490.method2960(arg0, 255) / 255.0F;
        ++field654;
        if (arg1 == 30766) {
            OpenGL.glTexEnvfv(8960, 8705, class522.field7583, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)V")
    public final void method340(byte arg0, int arg1) {
        if (this.field912 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg1 == 1) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg1 == -3) {
                var3 = false;
                var4 = true;
                var5 = 2;
            } else if (arg1 == 128) {
                var4 = true;
                var3 = true;
                var5 = 3;
            } else {
                var4 = true;
                var3 = false;
                var5 = 0;
            }
            if (this.field917 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field917 = var4;
            }
            if (this.field875 == !var3) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field875 = var3;
            }
            if (this.field849 != var5) {
                if (var5 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var5 != 2) {
                    if (~var5 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field849 = var5;
            }
            this.field912 = arg1;
            this.field871 &= -29;
        }
        int var6 = 25 % ((arg0 - 55) / 41);
        ++field764;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZZ)V")
    public final void method341(int arg0, boolean arg1, boolean arg2) {
        this.method429(arg2, arg1, arg0, (byte) -76);
        ++field611;
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "(I)V")
    private final void method342(int arg0) {
        ++field714;
        if (arg0 == 0) {
            OpenGL.glDepthMask(this.field834 && this.field939);
        }
    }

    @OriginalMember(owner = "client!da", name = "r", descriptor = "(I)V")
    public final void method343(int arg0) {
        int var2 = 101 % ((45 - arg0) / 35);
        ++field614;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "(IIII)V")
    public final void method344(int arg0, int arg1, int arg2, int arg3) {
        ++field719;
        if (~this.field910 < ~arg2) {
            this.field910 = arg2;
        }
        if (~arg3 > ~this.field891) {
            this.field891 = arg3;
        }
        if (arg0 > this.field837) {
            this.field837 = arg0;
        }
        if (this.field925 < arg1) {
            this.field925 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method285(2);
        this.method424(99);
    }

    @OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIII)V")
    public final void method345(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method323(1);
        ++field733;
        this.method340((byte) -101, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(I)V")
    public final void method346(int arg0) {
        ++field619;
        this.field807 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field807;
        }
        this.field804 = 1 << this.field807;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method347(Canvas arg0) {
        ++field633;
        if (this.field702 == arg0) {
            throw new RuntimeException();
        } else if (this.field698.containsKey(arg0)) {
            Long var2 = (Long) this.field698.get(arg0);
            this.field772.releaseSurface(arg0, var2);
            this.field698.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "AA", descriptor = "()I")
    public final int method348() {
        ++field607;
        return this.field922;
    }

    @OriginalMember(owner = "client!da", name = "v", descriptor = "(III[I)V")
    public final void method349(int arg0, int arg1, int arg2, int[] arg3) {
        ++field680;
        float var5 = (float) arg2 * this.field904.field3741 + (float) arg0 * this.field904.field3740 + (float) arg1 * this.field904.field3730 + this.field904.field3736;
        if (!(var5 < (float) this.field922) && !(var5 > (float) this.field865)) {
            int var6 = (int) (((float) arg2 * this.field904.field3734 + (float) arg0 * this.field904.field3744 + (float) arg1 * this.field904.field3735 + this.field904.field3733) * (float) this.field913 / var5);
            int var7 = (int) (((float) arg2 * this.field904.field3759 + (float) arg0 * this.field904.field3763 + (float) arg1 * this.field904.field3746 + this.field904.field3764) * (float) this.field867 / var5);
            if ((float) var6 >= this.field848 && this.field931 >= (float) var6 && (float) var7 >= this.field847 && this.field838 >= (float) var7) {
                arg3[0] = (int) ((float) var6 - this.field848);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field847);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lqg;)V")
    public final void method350(class325 arg0) {
        ++field738;
        this.field896 = (class10) arg0;
    }

    @OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
    public final boolean method351() {
        ++field689;
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILer;Ler;Ler;Ler;)V")
    public final void method352(int arg0, class70 arg1, class70 arg2, class70 arg3, class70 arg4) {
        ++field750;
        if (arg1 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method319(arg1.field1401, (byte) -28);
            OpenGL.glVertexPointer(arg1.field1409, arg1.field1405, this.field884.method952(22081), this.field884.method950(29002) - -((long) arg1.field1403));
            OpenGL.glEnableClientState(32884);
        }
        if (arg3 != null) {
            this.method319(arg3.field1401, (byte) -28);
            OpenGL.glNormalPointer(arg3.field1405, this.field884.method952(22081), this.field884.method950(29002) - -((long) arg3.field1403));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg4 != null) {
            this.method319(arg4.field1401, (byte) -28);
            OpenGL.glColorPointer(arg4.field1409, arg4.field1405, this.field884.method952(22081), this.field884.method950(29002) + (long) arg4.field1403);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method319(arg2.field1401, (byte) -28);
            OpenGL.glTexCoordPointer(arg2.field1409, arg2.field1405, this.field884.method952(22081), this.field884.method950(29002) + (long) arg2.field1403);
            OpenGL.glEnableClientState(32888);
        }
        int var6 = 42 % ((arg0 - -58) / 63);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
    public final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field720;
        OpenGL.glLineWidth((float) arg5);
        this.method398(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lem;Z)V")
    public final void method354(class152 arg0, boolean arg1) {
        ++field652;
        if (!this.field836) {
            if (~this.field812 > -1 || this.field813[this.field812] != arg0) {
                throw new RuntimeException();
            }
            this.field813[this.field812--] = null;
            arg0.method1113(31546);
            if (~this.field812 > -1) {
                this.field817 = this.field815 = null;
            } else {
                this.field817 = this.field815 = this.field813[this.field812];
                this.field817.method1115(16739);
            }
        } else {
            this.method416(-81, arg0);
            this.method410(!arg1, arg0);
        }
        if (!arg1) {
            this.field936 = -95;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
    public final void method355() {
        ++field739;
        try {
            this.field772.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!da", name = "ZA", descriptor = "(IIIII)V")
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field730;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lfj;[Lef;Z)Lla;")
    public final class317 method357(class470 arg0, class340[] arg1, boolean arg2) {
        ++field778;
        return new class37(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        ++field704;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!da", name = "s", descriptor = "(I)V")
    private final void method359(int arg0) {
        ++field651;
        int var2;
        if (!this.field895) {
            this.field852 = (float) (this.field865 - this.field841) + -this.field839;
            this.field873 = this.field852 - (float) this.field877 * this.field893;
            if ((float) this.field922 > this.field873) {
                this.field873 = (float) this.field922;
            }
            OpenGL.glFogf(2915, this.field873);
            OpenGL.glFogf(2916, this.field852);
            var2 = this.field874;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field868;
        }
        int var3 = 24 / ((arg0 - -61) / 46);
        class522.field7583[1] = (float) class490.method2960(var2, 65280) / 65280.0F;
        class522.field7583[2] = (float) class490.method2960(var2, 255) / 255.0F;
        class522.field7583[0] = (float) class490.method2960(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class522.field7583, 0);
        if (this.field895) {
            this.field798.field5164.method2186(115);
        }
    }

    @OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
    public final boolean method360() {
        ++field622;
        return false;
    }

    @OriginalMember(owner = "client!da", name = "VA", descriptor = "(IIIIII)Z")
    public final boolean method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field770;
        float var7 = (float) arg2 * this.field904.field3741 + (float) arg0 * this.field904.field3740 + (float) arg1 * this.field904.field3730 + this.field904.field3736;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field904.field3741 + (float) arg3 * this.field904.field3740 + (float) arg4 * this.field904.field3730 + this.field904.field3736;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field922 > var7) || !((float) this.field922 > var8)) && (!(var7 > (float) this.field865) || !(var8 > (float) this.field865))) {
            int var9 = (int) (((float) arg2 * this.field904.field3734 + (float) arg0 * this.field904.field3744 + (float) arg1 * this.field904.field3735 + this.field904.field3733) * (float) this.field913 / var7);
            int var10 = (int) (((float) arg5 * this.field904.field3734 + (float) arg3 * this.field904.field3744 + (float) arg4 * this.field904.field3735 + this.field904.field3733) * (float) this.field913 / var8);
            if ((float) var9 < this.field848 && this.field848 > (float) var10 || this.field931 < (float) var9 && this.field931 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field904.field3759 + (float) arg0 * this.field904.field3763 + (float) arg1 * this.field904.field3746 + this.field904.field3764) * (float) this.field867 / var7);
                int var12 = (int) (((float) arg5 * this.field904.field3759 + (float) arg3 * this.field904.field3763 + (float) arg4 * this.field904.field3746 + this.field904.field3764) * (float) this.field867 / var8);
                return (!(this.field847 > (float) var11) || !(this.field847 > (float) var12)) && (!(this.field838 < (float) var11) || !((float) var12 > this.field838));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "u", descriptor = "(I)V")
    private final void method362(int arg0) {
        ++field731;
        if (this.field648 != null) {
            Dimension var2 = this.field648.getSize();
            this.field682 = var2.height;
            this.field728 = var2.width;
        } else {
            this.field728 = this.field682 = 0;
        }
        if (this.field815 == null) {
            this.field790 = this.field728;
            this.field725 = this.field682;
            this.method423(117);
        }
        this.method437(-100);
        this.method321();
        if (arg0 < 72) {
            this.method348();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
    public final void method363(float arg0, float arg1, float arg2) {
        class18.field288 = arg0;
        class71.field1435 = arg2;
        ++field695;
        class498.field7311 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Lc;")
    public final class124 method364() {
        ++field602;
        return this.field801;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
    public final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field759;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method323(1);
        this.method340((byte) -86, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field907) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field907) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(Z)V")
    private final void method366(boolean arg0) {
        ++field742;
        if (arg0) {
            this.field793 = null;
        }
        if (this.field916) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field916 = false;
        }
    }

    @OriginalMember(owner = "client!da", name = "n", descriptor = "()V")
    public final void method367() {
        ++field623;
        this.field895 = false;
        this.field798.method2166(Integer.MAX_VALUE, 0, 0, 0, false, false);
        this.method359(101);
        this.method439(2912);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(B)V")
    private final void method368(byte arg0) {
        ++field605;
        int var2;
        for (var2 = 0; this.field933 > var2; ++var2) {
            class256 var3 = this.field928[var2];
            class515.field7476[0] = (float) var3.method1646(-112);
            int var4 = 16386 - -var2;
            class515.field7476[1] = (float) var3.method1655((byte) -110);
            class515.field7476[2] = (float) var3.method1653((byte) -123);
            class515.field7476[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class515.field7476, 0);
            int var5 = var3.method1652(-17454);
            float var6 = var3.method1650(-114) / 255.0F;
            class515.field7476[0] = (float) (class490.method2960(16755651, var5) >> 16) * var6;
            class515.field7476[2] = var6 * (float) class490.method2960(var5, 255);
            class515.field7476[1] = var6 * (float) class490.method2960(255, var5 >> 8);
            OpenGL.glLightfv(var4, 4609, class515.field7476, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1647(-126) * var3.method1647(-122)));
            OpenGL.glEnable(var4);
        }
        while (~this.field921 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field921 = this.field933;
        if (arg0 > -74) {
            this.method362(61);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFFI)V")
    private final void method369(float arg0, float arg1, float arg2, int arg3) {
        OpenGL.glMatrixMode(5890);
        ++field758;
        if (arg3 <= 91) {
            this.method434(116, (class152) null);
        }
        if (this.field916) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg1, arg2);
        OpenGL.glMatrixMode(5888);
        this.field916 = true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILaf;)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, class302 arg4) {
        ++field610;
        int var6 = arg4.method1906(true);
        int var7 = arg3 * this.method308(126, var6);
        this.method402(arg4, 98);
        if (arg2 >= -107) {
            this.field950 = null;
        }
        OpenGL.glDrawElements(arg1, arg0, var6, arg4.method1904(8976) - -((long) var7));
    }

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IIII)V")
    public final void method371(int arg0, int arg1, int arg2, int arg3) {
        if (this.field725 < arg3) {
            arg3 = this.field725;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (this.field790 < arg2) {
            arg2 = this.field790;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        ++field621;
        this.field837 = arg0;
        this.field910 = arg2;
        this.field925 = arg1;
        this.field891 = arg3;
        OpenGL.glEnable(3089);
        this.method285(2);
        this.method424(80);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lbk;)V")
    public final void method372(int arg0, class256[] arg1) {
        ++field722;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field928[var3] = arg1[var3];
        }
        this.field933 = arg0;
        if (~this.field909 != -2) {
            this.method368((byte) -111);
        }
    }

    @OriginalMember(owner = "client!da", name = "ra", descriptor = "(ILta;II)V")
    public final void method373(int arg0, class144 arg1, int arg2, int arg3) {
        ++field734;
        class171 var5 = (class171) arg1;
        class67 var6 = var5.field2770;
        this.method315((byte) -37);
        this.method381((byte) 28, var5.field2770);
        this.method340((byte) -90, 1);
        this.method426(7681, 8448, -24610);
        this.method412(0, 34167, 768, 117);
        float var7 = var6.field1369 / (float) var6.field1365;
        float var8 = var6.field1364 / (float) var6.field1368;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field837) * var7, (float) (this.field925 - arg3) * var8);
        OpenGL.glVertex2i(this.field837, this.field925);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field837) * var7, (float) (this.field891 - arg3) * var8);
        OpenGL.glVertex2i(this.field837, this.field891);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field910) * var7, (float) (-arg3 + this.field891) * var8);
        OpenGL.glVertex2i(this.field910, this.field891);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field910) * var7, (float) (-arg3 + this.field925) * var8);
        OpenGL.glVertex2i(this.field910, this.field925);
        OpenGL.glEnd();
        this.method412(0, 5890, 768, -89);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lef;Z)Lo;")
    public final class24 method374(class340 arg0, boolean arg1) {
        ++field609;
        int[] var3 = new int[arg0.field5115 * arg0.field5114];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field5116 != null) {
            for (int var6 = 0; arg0.field5115 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field5114 < ~var7; ++var7) {
                    var3[var5++] = class418.method2558(arg0.field5112[class490.method2960(255, arg0.field5113[var4])], arg0.field5116[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; var8 < arg0.field5115; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field5114; ++var10) {
                    int var11 = arg0.field5112[arg0.field5113[var4++] & 255];
                    var3[var5++] = var11 != 0 ? class418.method2558(var11, -16777216) : 0;
                }
            }
        }
        class24 var9 = this.method335(var3, 0, arg0.field5114, arg0.field5114, arg0.field5115);
        var9.method148(arg0.field5119, arg0.field5118, arg0.field5117, arg0.field5120);
        return var9;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3) {
        ++field701;
        if (!this.field895) {
            throw new RuntimeException("");
        } else {
            this.field829 = arg0;
            this.field868 = arg1;
            this.field894 = arg3;
            this.field876 = arg2;
            this.field798.field5164.method2185(-105);
            this.method359(-111);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public final class38 method376(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field649;
        return new class26(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "v", descriptor = "(I)V")
    public final void method377(int arg0) {
        ++field604;
        if (arg0 != -1767680616) {
            this.method300(-43);
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FI)V")
    public final void method378(float arg0, int arg1) {
        ++field721;
        if (arg1 != 30677) {
            this.method354((class152) null, false);
        }
        if (this.field914 != arg0) {
            this.field914 = arg0;
            if (this.field909 == 3) {
                this.method291(arg1 ^ 30624);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IZ)V")
    public final void method379(int arg0, boolean arg1) {
        ++field668;
        if (this.field889 != arg1) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field871 &= -32;
            this.field889 = arg1;
        }
        if (arg0 != -28710) {
            this.field864 = 0.705546F;
        }
    }

    @OriginalMember(owner = "client!da", name = "w", descriptor = "(I)V")
    private final void method380(int arg0) {
        ++field741;
        float[] var2 = this.field861;
        float var3 = (float) (-this.field945 * this.field922) / (float) this.field913;
        if (arg0 > -100) {
            this.field811 = null;
        }
        float var4 = (float) ((-this.field945 + this.field790) * this.field922) / (float) this.field913;
        float var5 = (float) (this.field922 * this.field870) / (float) this.field867;
        float var6 = (float) ((-this.field725 + this.field870) * this.field922) / (float) this.field867;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field922 * 2.0F;
            var2[1] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[4] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[12] = 0.0F;
            var2[15] = 0.0F;
            var2[10] = this.field879 = (float) (-(this.field922 + this.field865)) / (float) (-this.field922 + this.field865);
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[6] = 0.0F;
            var2[7] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[14] = this.field872 = -((float) this.field865 * var7) / (float) (-this.field922 + this.field865);
            var2[13] = 0.0F;
            var2[11] = -1.0F;
            var2[2] = 0.0F;
        } else {
            var2[15] = 1.0F;
            var2[12] = 0.0F;
            var2[10] = 1.0F;
            var2[6] = 0.0F;
            var2[14] = 0.0F;
            var2[13] = 0.0F;
            var2[8] = 0.0F;
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
            var2[0] = 1.0F;
            var2[4] = 0.0F;
            var2[2] = 0.0F;
            var2[11] = 0.0F;
            var2[9] = 0.0F;
            var2[7] = 0.0F;
        }
        this.method289((byte) 85);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLac;)V")
    public final void method381(byte arg0, class381 arg1) {
        ++field736;
        class381 var3 = this.field831[this.field926];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 != null) {
                    if (~arg1.field5578 != ~var3.field5578) {
                        OpenGL.glDisable(var3.field5578);
                        OpenGL.glEnable(arg1.field5578);
                    }
                } else {
                    OpenGL.glEnable(arg1.field5578);
                }
                OpenGL.glBindTexture(arg1.field5578, arg1.method2348(arg0 + -27));
            } else {
                OpenGL.glDisable(var3.field5578);
            }
            this.field831[this.field926] = arg1;
        }
        this.field871 &= -2;
        if (arg0 != 28) {
            this.field825 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "x", descriptor = "(I)V")
    private final void method382(int arg0) {
        ++field699;
        this.field772.detach();
        int var2 = 61 / ((arg0 - -49) / 54);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
    public final boolean method383() {
        ++field638;
        return true;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(Z)V")
    private final void method384(boolean arg0) {
        ++field762;
        class522.field7583[1] = this.field937 * this.field864;
        class522.field7583[2] = this.field937 * this.field919;
        class522.field7583[3] = 1.0F;
        class522.field7583[0] = this.field937 * this.field862;
        if (!arg0) {
            this.field819 = 13;
        }
        OpenGL.glLightModelfv(2899, class522.field7583, 0);
    }

    @OriginalMember(owner = "client!da", name = "da", descriptor = "(FF)V")
    public final void method385(float arg0, float arg1) {
        ++field665;
        if (this.field941 != arg0 || this.field899 != arg1) {
            this.field941 = arg0;
            this.field899 = arg1;
            this.method289((byte) -118);
            if (this.field909 != 3) {
                if (this.field909 == 2) {
                    this.method433((byte) -90);
                    return;
                }
            } else {
                this.method291(55);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
    public final void method386(boolean arg0, int arg1) {
        if (arg1 != -8) {
            this.field792 = null;
        }
        if (!arg0 != !this.field901) {
            this.field901 = arg0;
            this.method299(96);
            this.field871 &= -8;
        }
        ++field669;
    }

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "([I)V")
    public final void method387(int[] arg0) {
        arg0[3] = this.field891;
        arg0[0] = this.field837;
        arg0[2] = this.field910;
        ++field709;
        arg0[1] = this.field925;
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "()V")
    public final void method388() {
        this.method447((byte) 46, true);
        ++field752;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Le;Lc;[Lpr;I)V")
    public final void method389(class374[] arg0, class124 arg1, class313[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method723(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field781;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(B)V")
    private final void method390(byte arg0) {
        int var2 = 104 % ((43 - arg0) / 58);
        ++field773;
        if (~this.field909 != -3) {
            this.field909 = 2;
            this.method433((byte) -127);
            this.method300(-24121);
            this.field871 &= -8;
        }
    }

    @OriginalMember(owner = "client!da", name = "r", descriptor = "()I")
    public final int method391() {
        ++field800;
        return this.field865;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(BI)V")
    public final void method392(byte arg0, int arg1) {
        if (this.field926 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field926 = arg1;
        }
        if (arg0 != 106) {
            this.method359(95);
        }
        ++field663;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Le;Lip;Lc;[Lpr;I)V")
    public final void method393(class374[] arg0, class502 arg1, class124 arg2, class313[] arg3, int arg4) {
        this.method389(arg0, arg2, arg3, arg4);
        ++field712;
        this.method414(arg1);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
    public final int method394(int arg0, int arg1) {
        ++field656;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(B)Ldl;")
    public final class46 method395(byte arg0) {
        ++field629;
        if (arg0 != 42) {
            this.field682 = 95;
        }
        return this.field896 != null ? this.field896.method59((byte) -126) : null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
    public final boolean method396() {
        ++field606;
        if (this.field794 != null) {
            if (!this.field794.method1065(3)) {
                if (!this.field792.method2702(this.field794, (byte) 11)) {
                    return false;
                }
                this.field793.method2901(34842);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(F)V")
    public final void method397(float arg0) {
        if (this.field937 != arg0) {
            this.field937 = arg0;
            this.method384(true);
        }
        ++field707;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(IIIIII)V")
    public final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method323(1);
        ++field735;
        this.method340((byte) 103, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "()Lc;")
    public final class124 method399() {
        ++field748;
        return new class242();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLjaggl/memory/NativeBuffer;II)Lgg;")
    public final class118 method400(int arg0, boolean arg1, NativeBuffer arg2, int arg3, int arg4) {
        if (arg4 < 98) {
            this.field924 = false;
        }
        ++field783;
        return (class118) (!this.field842 || arg1 && !this.field845 ? new class274(this, arg3, arg2) : new class114(this, arg3, arg2, arg0, arg1));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lem;I)V")
    public final void method401(class152 arg0, int arg1) {
        ++field639;
        if (arg1 != -10504) {
            this.method351();
        }
        if (this.field810 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field810 >= 0) {
                this.field816[this.field810].method1117(104);
            }
            this.field815 = this.field816[++this.field810] = arg0;
            this.field815.method1116(24874);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Laf;I)V")
    public final void method402(class302 arg0, int arg1) {
        ++field782;
        if (arg1 < 42) {
            this.field899 = 0.27827582F;
        }
        if (this.field897 != arg0) {
            if (this.field842) {
                OpenGL.glBindBufferARB(34963, arg0.method1905(-128));
            }
            this.field897 = arg0;
        }
    }

    @OriginalMember(owner = "client!da", name = "s", descriptor = "()I")
    public final int method403() {
        ++field636;
        return 4;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Ln;")
    public final class15 method404(int arg0) {
        ++field703;
        class397 var2 = new class397(arg0);
        this.field805.method1885(false, var2);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "(IIIII)V")
    public final void method405(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field650;
        this.method323(1);
        this.method340((byte) 98, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZI[B)Laf;")
    public final class302 method406(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1 >= -46) {
            this.method411(-0.55512315F, -0.51850843F, -79, -0.41570237F, 0.755862F);
        }
        ++field670;
        return (class302) (!this.field842 || arg2 && !this.field845 ? new class338(this, arg3, arg4, arg0) : new class292(this, arg3, arg4, arg0, arg2));
    }

    @OriginalMember(owner = "client!da", name = "y", descriptor = "(I)V")
    private final void method407(int arg0) {
        if (arg0 == 5888) {
            ++field700;
            if (this.field909 != 1) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (~this.field790 < -1 && this.field725 > 0) {
                    OpenGL.glOrtho(0.0D, (double) this.field790, (double) this.field725, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field871 &= -25;
                this.field909 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
    public final boolean method408() {
        ++field618;
        return this.field907 && (!this.method334() || this.field927);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public final void method409(int arg0) {
        ++field753;
        this.method382(105);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLem;)V")
    public final void method410(boolean arg0, class152 arg1) {
        ++field774;
        if (~this.field810 <= -1 && this.field816[this.field810] == arg1) {
            this.field816[this.field810--] = null;
            if (arg0) {
                this.method398(-26, -64, -23, 123, -111, 55);
            }
            arg1.method1117(79);
            if (~this.field810 > -1) {
                this.field815 = null;
            } else {
                this.field815 = this.field816[this.field810];
                this.field815.method1116(24874);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFIFF)V")
    public final void method411(float arg0, float arg1, int arg2, float arg3, float arg4) {
        ++field620;
        if (arg2 != 19390) {
            this.field807 = 43;
        }
        class522.field7583[1] = arg0;
        class522.field7583[0] = arg1;
        class522.field7583[2] = arg4;
        class522.field7583[3] = arg3;
        OpenGL.glTexEnvfv(8960, 8705, class522.field7583, 0);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(IIII)V")
    public final void method412(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
        int var5 = -85 / ((37 - arg3) / 36);
        ++field706;
        OpenGL.glTexEnvi(8960, 34192 - -arg0, arg2);
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public final void method413(int arg0) {
        ++field724;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field791 = arg0;
            this.field793.method2901(34842);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lip;)V")
    public final void method414(class502 arg0) {
        ++field685;
        this.field797.method196(arg0, this, true);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(BI)V")
    public final synchronized void method415(byte arg0, int arg1) {
        ++field708;
        class261 var3 = new class261();
        var3.field3977 = (long) arg1;
        if (arg0 > -77) {
            this.field936 = 122;
        }
        this.field826.method1885(false, var3);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(ILem;)V")
    public final void method416(int arg0, class152 arg1) {
        ++field642;
        if (~this.field814 <= -1 && this.field811[this.field814] == arg1) {
            this.field811[this.field814--] = null;
            int var3 = -41 % ((arg0 - 45) / 33);
            arg1.method1118(100);
            if (~this.field814 > -1) {
                this.field817 = null;
            } else {
                this.field817 = this.field811[this.field814];
                this.field817.method1114(-26734);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "()F")
    public final float method417() {
        ++field732;
        return this.field899;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method418(Canvas arg0) {
        ++field678;
        if (this.field702 == arg0) {
            throw new RuntimeException();
        } else if (!this.field698.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field772.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field698.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "v", descriptor = "()V")
    public final void method419() {
        this.field792.method2707(13852);
        ++field624;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(BI)I")
    public final int method420(byte arg0, int arg1) {
        ++field777;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (~arg1 != -6411 && ~arg1 != -34847 && arg1 != 34844) {
                if (arg1 != 6407) {
                    if (~arg1 != -6409 && ~arg1 != -34848) {
                        if (~arg1 != -34844) {
                            if (~arg1 != -34843) {
                                if (~arg1 == -6403) {
                                    return 3;
                                } else if (arg1 == 6401) {
                                    return 1;
                                } else {
                                    if (arg0 != 89) {
                                        this.field725 = -85;
                                    }
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
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
    public final boolean method421() {
        ++field743;
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFZ)V")
    public final void method422(float arg0, float arg1, boolean arg2) {
        ++field626;
        this.field839 = arg1;
        this.field893 = arg0;
        if (!this.field895) {
            this.method359(35);
        }
        if (arg2) {
            this.method423(2);
        }
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "(I)V")
    private final void method423(int arg0) {
        ++field632;
        if (arg0 < 110) {
            this.field822 = null;
        }
        OpenGL.glViewport(this.field915, this.field858, this.field790, this.field725);
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "(I)V")
    private final void method424(int arg0) {
        if (this.field837 <= this.field910 && this.field925 <= this.field891) {
            OpenGL.glScissor(this.field915 + this.field837, -this.field891 + this.field858 + this.field725, -this.field837 + this.field910, -this.field925 + this.field891);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field640;
        if (arg0 < 13) {
            this.method444(-50, -2, 109);
        }
    }

    @OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
    public final void method425() {
        ++field674;
        for (class261 var1 = this.field805.method1892(127); var1 != null; var1 = this.field805.method1893((byte) -2)) {
            ((class397) var1).method2465(-75);
        }
        if (this.field792 != null) {
            this.field792.method2704(70);
        }
        if (this.field772 != null) {
            this.method382(74);
            Enumeration var2 = this.field698.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field698.get(var3);
                this.field772.releaseSurface(var3, var4);
            }
            this.field772.release();
            this.field772 = null;
        }
        if (this.field803) {
            class160.method1146(false, 301, true);
            this.field803 = false;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
    public final void method426(int arg0, int arg1, int arg2) {
        ++field625;
        if (arg2 != -24610) {
            this.method356(-81, 78, -44, -21, 106);
        }
        if (~this.field926 == -1) {
            boolean var4 = false;
            if (~this.field940 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                this.field940 = arg0;
                var4 = true;
            }
            if (~this.field944 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field944 = arg1;
            }
            if (var4) {
                this.field871 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public final int method427() {
        ++field660;
        int var1 = this.field949;
        this.field949 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "s", descriptor = "(IIII)V")
    public final void method428(int arg0, int arg1, int arg2, int arg3) {
        this.field868 = arg1;
        this.field829 = arg0;
        this.field876 = arg2;
        this.field894 = arg3;
        ++field787;
        this.field895 = true;
        this.field798.method2166(Integer.MAX_VALUE, 0, 0, 3, false, false);
        this.field798.field5164.method2185(-100);
        this.method359(113);
        this.method439(2912);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZIB)V")
    public final void method429(boolean arg0, boolean arg1, int arg2, byte arg3) {
        if (this.field936 != arg2) {
            if (~arg2 > -1) {
                this.method366(false);
                this.method381((byte) 28, (class381) null);
                this.method288((byte) 125, 0);
                if (!this.field895) {
                    this.field798.method2166(Integer.MAX_VALUE, 0, 0, 0, arg0, arg1);
                }
            } else {
                class120 var5 = this.field793.method2896(arg2, (byte) -79);
                class486 var6 = super.field4358.method105(-128, arg2);
                if (~var6.field7144 == -1 && var6.field7150 == 0) {
                    this.method366(false);
                } else {
                    int var7 = !var6.field7145 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method369((float) (this.field806 % var8 * var6.field7144) / (float) var8, (float) (this.field806 % var8 * var6.field7150) / (float) var8, 0.0F, 116);
                }
                if (this.field895) {
                    this.method381((byte) 28, var5);
                    this.method288((byte) -98, var6.field7151);
                } else {
                    this.field798.method2166(Integer.MAX_VALUE, var6.field7160, var6.field7163, var6.field7141, arg0, arg1);
                    if (!this.field798.method2167(var5, var6.field7151, 1)) {
                        this.method381((byte) 28, var5);
                        this.method288((byte) 25, var6.field7151);
                    }
                }
            }
            this.field936 = arg2;
        }
        ++field765;
        if (arg3 != -76) {
            this.field859 = false;
        }
        this.field871 &= -8;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)V")
    public final void method430(int arg0, byte arg1) {
        ++field615;
        this.method341(arg0, true, true);
        if (arg1 >= -44) {
            this.field862 = 0.35301024F;
        }
    }

    @OriginalMember(owner = "client!da", name = "T", descriptor = "()F")
    public final float method431() {
        ++field713;
        return this.field941;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ln;)V")
    public final void method432(class15 arg0) {
        ++field711;
        this.field809 = ((class397) arg0).field6031;
        if (this.field883 == null) {
            class364 var2 = new class364(80);
            if (!this.field924) {
                var2.method2232((byte) 112, -1.0F);
                var2.method2232((byte) 127, -1.0F);
                var2.method2232((byte) 107, 0.0F);
                var2.method2232((byte) 120, 0.0F);
                var2.method2232((byte) 127, 1.0F);
                var2.method2232((byte) -17, 1.0F);
                var2.method2232((byte) 107, -1.0F);
                var2.method2232((byte) 106, 0.0F);
                var2.method2232((byte) 111, 1.0F);
                var2.method2232((byte) 104, 1.0F);
                var2.method2232((byte) -116, 1.0F);
                var2.method2232((byte) -16, 1.0F);
                var2.method2232((byte) 127, 0.0F);
                var2.method2232((byte) -84, 1.0F);
                var2.method2232((byte) -98, 0.0F);
                var2.method2232((byte) -3, -1.0F);
                var2.method2232((byte) -14, 1.0F);
                var2.method2232((byte) -84, 0.0F);
                var2.method2232((byte) 108, 0.0F);
                var2.method2232((byte) 108, 0.0F);
            } else {
                var2.method2234(-1.0F, -1933021816);
                var2.method2234(-1.0F, -1933021816);
                var2.method2234(0.0F, -1933021816);
                var2.method2234(0.0F, -1933021816);
                var2.method2234(1.0F, -1933021816);
                var2.method2234(1.0F, -1933021816);
                var2.method2234(-1.0F, -1933021816);
                var2.method2234(0.0F, -1933021816);
                var2.method2234(1.0F, -1933021816);
                var2.method2234(1.0F, -1933021816);
                var2.method2234(1.0F, -1933021816);
                var2.method2234(1.0F, -1933021816);
                var2.method2234(0.0F, -1933021816);
                var2.method2234(1.0F, -1933021816);
                var2.method2234(0.0F, -1933021816);
                var2.method2234(-1.0F, -1933021816);
                var2.method2234(1.0F, -1933021816);
                var2.method2234(0.0F, -1933021816);
                var2.method2234(0.0F, -1933021816);
                var2.method2234(0.0F, -1933021816);
            }
            this.field883 = this.method283(var2.field4399, 20, -113, var2.field4408, false);
            this.field903 = new class70(this.field883, 5126, 3, 0);
            this.field892 = new class70(this.field883, 5126, 2, 12);
            this.field797.method197(this, -14135);
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(B)V")
    private final void method433(byte arg0) {
        if (arg0 > -32) {
            this.method431();
        }
        ++field603;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field861, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(ILem;)V")
    public final void method434(int arg0, class152 arg1) {
        if (arg0 != 10902) {
            this.method380(-41);
        }
        ++field761;
        if (!this.field836) {
            if (~this.field812 <= -4) {
                throw new RuntimeException();
            } else {
                if (~this.field812 <= -1) {
                    this.field813[this.field812].method1113(31546);
                }
                this.field817 = this.field815 = this.field813[++this.field812] = arg1;
                this.field817.method1115(arg0 + 5837);
            }
        } else {
            this.method295(96, arg1);
            this.method401(arg1, -10504);
        }
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(Z)V")
    private final void method435(boolean arg0) {
        ++field637;
        this.field904 = new class242();
        this.field860 = new class242();
        this.field831 = new class381[this.field843];
        this.field923 = new class120(this, 3553, 6408, 1, 1);
        new class120(this, 3553, 6408, 1, 1);
        if (arg0) {
            this.method358(-106);
        }
        new class120(this, 3553, 6408, 1, 1);
        this.field943 = new class81(this);
        this.field908 = new class81(this);
        this.field832 = new class81(this);
        this.field855 = new class81(this);
        this.field942 = new class81(this);
        this.field851 = new class81(this);
        this.field835 = new class81(this);
        this.field906 = new class81(this);
        this.field856 = new class81(this);
        this.field869 = new class81(this);
        if (this.field920) {
            this.field930 = new class206(this);
            new class206(this);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Loq;I)V")
    public final void method436(class242 arg0, int arg1) {
        if (arg1 >= -104) {
            this.field827 = null;
        }
        ++field653;
        OpenGL.glLoadMatrixf(arg0.method1585(-123), 0);
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I)V")
    public final void method437(int arg0) {
        if (arg0 > -82) {
            this.field880 = null;
        }
        if (this.field909 != 0) {
            this.field909 = 0;
            this.field871 &= -32;
        }
        ++field726;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Loq;I)V")
    public final void method438(class242 arg0, int arg1) {
        if (arg1 <= 106) {
            this.method333();
        }
        OpenGL.glPushMatrix();
        ++field788;
        OpenGL.glMultMatrixf(arg0.method1585(-118), 0);
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "(I)V")
    private final void method439(int arg0) {
        if (arg0 == 2912) {
            ++field683;
            if (this.field918 && this.field877 >= 0 | this.field895) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lta;")
    public final class144 method440(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field696;
        return class97.method864(arg0, -1, arg2, arg1, this, arg3);
    }

    @OriginalMember(owner = "client!da", name = "D", descriptor = "(I)I")
    private final int method441(int arg0) {
        ++field641;
        int var2 = 0;
        this.field888 = OpenGL.glGetString(7936).toLowerCase();
        this.field882 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field888.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field888.indexOf("brian paul") != 0 || this.field888.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class266.method1697(0, ' ', var3.replace('.', ' '));
        if (~var4.length <= -3) {
            try {
                int var5 = class19.method129(-77, var4[0]);
                int var6 = class19.method129(-111, var4[1]);
                this.field902 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field902 > -13) {
            var2 |= 2;
        }
        if (!this.field772.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field772.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field843 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field911 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field840 = var7[0];
        if (~this.field843 > -3 || this.field911 < 2 || ~this.field840 > -3) {
            var2 |= 16;
        }
        this.field924 = NativeStream.method2648();
        this.field772.arePbuffersAvailable();
        this.field842 = this.field772.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field907 = this.field772.isExtensionAvailable("GL_ARB_multisample");
        this.field844 = this.field772.isExtensionAvailable("GL_ARB_vertex_program");
        this.field772.isExtensionAvailable("GL_ARB_fragment_program");
        this.field859 = this.field772.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field887 = this.field772.isExtensionAvailable("GL_ARB_fragment_shader");
        if (arg0 >= -82) {
            return 1;
        } else {
            this.field854 = this.field772.isExtensionAvailable("GL_EXT_texture3D");
            this.field898 = this.field772.isExtensionAvailable("GL_ARB_texture_rectangle");
            this.field935 = this.field772.isExtensionAvailable("GL_ARB_texture_cube_map");
            this.field857 = this.field772.isExtensionAvailable("GL_ARB_texture_float");
            this.field878 = false;
            this.field920 = this.field772.isExtensionAvailable("GL_EXT_framebuffer_object");
            this.field836 = this.field772.isExtensionAvailable("GL_EXT_framebuffer_blit");
            this.field850 = this.field772.isExtensionAvailable("GL_EXT_framebuffer_multisample");
            this.field927 = this.field836 & this.field850;
            return var2 != 0 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        OpenGL.glLightfv(16384, 4611, this.field863, 0);
        ++field727;
        if (!arg0) {
            this.method274(-91);
        }
        OpenGL.glLightfv(16385, 4611, this.field932, 0);
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "(B)V")
    public final void method443(byte arg0) {
        if (~this.field871 != -17) {
            this.method306(-4);
            this.method322(true, (byte) 29);
            this.method379(-28710, true);
            this.method447((byte) 46, true);
            this.method340((byte) 122, 1);
            this.method288((byte) -128, 0);
            this.field871 = 16;
        }
        if (arg0 > 109) {
            ++field691;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(III)V")
    public final synchronized void method444(int arg0, int arg1, int arg2) {
        ++field667;
        class100 var4 = new class100(arg2);
        var4.field3977 = (long) arg0;
        this.field823.method1885(false, var4);
        if (arg1 != 1) {
            this.field927 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(III)V")
    public final synchronized void method445(int arg0, int arg1, int arg2) {
        ++field766;
        if (arg1 != 14550) {
            this.method394(37, 40);
        }
        class100 var4 = new class100(arg0);
        var4.field3977 = (long) arg2;
        this.field822.method1885(false, var4);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(II)V")
    public final void method446(int arg0, int arg1) {
        ++field768;
        if (~this.field922 != ~arg0 || ~this.field865 != ~arg1) {
            this.field922 = arg0;
            this.field865 = arg1;
            this.method380(-106);
            this.method359(35);
            if (~this.field909 == -4) {
                this.method291(29);
                return;
            }
            if (this.field909 != 2) {
                return;
            }
            this.method433((byte) -112);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BZ)V")
    public final void method447(byte arg0, boolean arg1) {
        if (arg1 == !this.field834) {
            this.field834 = arg1;
            this.method342(arg0 ^ 46);
            this.field871 &= -32;
        }
        if (arg0 == 46) {
            ++field628;
        }
    }

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(III)V")
    public final void method448(int arg0, int arg1, int arg2) {
        if (this.field874 != arg0 || ~this.field877 != ~arg1 || ~this.field841 != ~arg2) {
            this.field841 = arg2;
            this.field877 = arg1;
            this.field874 = arg0;
            if (!this.field895) {
                this.method359(-121);
                this.method439(2912);
            }
        }
        ++field705;
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
    public final boolean method449() {
        ++field690;
        return true;
    }
}
