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

@OriginalClass("client!ml")
public class class194 extends class18 {

    @OriginalMember(owner = "client!ml", name = "Rf", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2666 = new Hashtable();

    @OriginalMember(owner = "client!ml", name = "og", descriptor = "I")
    public int field2747 = 128;

    @OriginalMember(owner = "client!ml", name = "sb", descriptor = "Luq;")
    private class556 field2750 = new class556();

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "Lgj;")
    private class70 field2756 = new class70();

    @OriginalMember(owner = "client!ml", name = "jb", descriptor = "Lgj;")
    public class70 field2757 = new class70();

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "I")
    public int field2758 = 8;

    @OriginalMember(owner = "client!ml", name = "Xf", descriptor = "I")
    public int field2760 = 3;

    @OriginalMember(owner = "client!ml", name = "Yg", descriptor = "Z")
    private boolean field2764 = false;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "Ltf;")
    private class524 field2762 = new class524();

    @OriginalMember(owner = "client!ml", name = "Yd", descriptor = "I")
    private int field2771 = -1;

    @OriginalMember(owner = "client!ml", name = "Kf", descriptor = "[Laq;")
    private class69[] field2768 = new class69[4];

    @OriginalMember(owner = "client!ml", name = "Ag", descriptor = "[Laq;")
    private class69[] field2773 = new class69[4];

    @OriginalMember(owner = "client!ml", name = "De", descriptor = "I")
    private int field2766 = -1;

    @OriginalMember(owner = "client!ml", name = "Cg", descriptor = "[Laq;")
    private class69[] field2767 = new class69[4];

    @OriginalMember(owner = "client!ml", name = "ng", descriptor = "I")
    private int field2769 = -1;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Ltf;")
    private class524 field2777;

    @OriginalMember(owner = "client!ml", name = "rd", descriptor = "Ltf;")
    private class524 field2779;

    @OriginalMember(owner = "client!ml", name = "Fc", descriptor = "Ltf;")
    private class524 field2780;

    @OriginalMember(owner = "client!ml", name = "rc", descriptor = "Ltf;")
    private class524 field2781;

    @OriginalMember(owner = "client!ml", name = "Lf", descriptor = "Ltf;")
    private class524 field2782;

    @OriginalMember(owner = "client!ml", name = "ud", descriptor = "Ltf;")
    private class524 field2783;

    @OriginalMember(owner = "client!ml", name = "cc", descriptor = "Ltf;")
    private class524 field2784;

    @OriginalMember(owner = "client!ml", name = "Pb", descriptor = "Lgj;")
    public class70 field2786;

    @OriginalMember(owner = "client!ml", name = "Td", descriptor = "Lgj;")
    public class70 field2794;

    @OriginalMember(owner = "client!ml", name = "Bb", descriptor = "Lgj;")
    public class70 field2795;

    @OriginalMember(owner = "client!ml", name = "nd", descriptor = "F")
    private float field2797;

    @OriginalMember(owner = "client!ml", name = "rg", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!ml", name = "zg", descriptor = "[F")
    public float[] field2803;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "Z")
    private boolean field2813;

    @OriginalMember(owner = "client!ml", name = "qg", descriptor = "F")
    public float field2817;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "F")
    public float field2834;

    @OriginalMember(owner = "client!ml", name = "ve", descriptor = "F")
    public float field2866;

    @OriginalMember(owner = "client!ml", name = "Ob", descriptor = "I")
    private int field2815;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "F")
    public float field2863;

    @OriginalMember(owner = "client!ml", name = "mc", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "F")
    private float field2849;

    @OriginalMember(owner = "client!ml", name = "hg", descriptor = "F")
    private float field2832;

    @OriginalMember(owner = "client!ml", name = "pg", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!ml", name = "wb", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!ml", name = "tg", descriptor = "[F")
    private float[] field2878;

    @OriginalMember(owner = "client!ml", name = "we", descriptor = "I")
    private int field2809;

    @OriginalMember(owner = "client!ml", name = "Xe", descriptor = "F")
    public float field2853;

    @OriginalMember(owner = "client!ml", name = "of", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!ml", name = "Bg", descriptor = "F")
    private float field2844;

    @OriginalMember(owner = "client!ml", name = "ff", descriptor = "F")
    public float field2808;

    @OriginalMember(owner = "client!ml", name = "gg", descriptor = "Z")
    private boolean field2872;

    @OriginalMember(owner = "client!ml", name = "Oe", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!ml", name = "zb", descriptor = "I")
    private int field2823;

    @OriginalMember(owner = "client!ml", name = "kb", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!ml", name = "td", descriptor = "I")
    private int field2825;

    @OriginalMember(owner = "client!ml", name = "rh", descriptor = "[F")
    private float[] field2891;

    @OriginalMember(owner = "client!ml", name = "ye", descriptor = "[F")
    private float[] field2840;

    @OriginalMember(owner = "client!ml", name = "fg", descriptor = "F")
    public float field2889;

    @OriginalMember(owner = "client!ml", name = "lc", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!ml", name = "Lb", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!ml", name = "Mf", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!ml", name = "Of", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!ml", name = "Zb", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!ml", name = "ke", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!ml", name = "Bd", descriptor = "F")
    private float field2880;

    @OriginalMember(owner = "client!ml", name = "Dd", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!ml", name = "Fg", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!ml", name = "Ch", descriptor = "[Lta;")
    private class330[] field2900;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "[F")
    private float[] field2851;

    @OriginalMember(owner = "client!ml", name = "nc", descriptor = "I")
    public int field2897;

    @OriginalMember(owner = "client!ml", name = "Ef", descriptor = "I")
    private int field2852;

    @OriginalMember(owner = "client!ml", name = "Kd", descriptor = "Lfca;")
    public class318 field2890;

    @OriginalMember(owner = "client!ml", name = "uc", descriptor = "[I")
    public int[] field2907;

    @OriginalMember(owner = "client!ml", name = "yb", descriptor = "[I")
    public int[] field2909;

    @OriginalMember(owner = "client!ml", name = "nh", descriptor = "[I")
    public int[] field2908;

    @OriginalMember(owner = "client!ml", name = "Sg", descriptor = "[B")
    public byte[] field2912;

    @OriginalMember(owner = "client!ml", name = "Ie", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!ml", name = "Tf", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2548;

    @OriginalMember(owner = "client!ml", name = "Rc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2744;

    @OriginalMember(owner = "client!ml", name = "Hg", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2635;

    @OriginalMember(owner = "client!ml", name = "Vf", descriptor = "J")
    private long field2657;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "J")
    private long field2568;

    @OriginalMember(owner = "client!ml", name = "tb", descriptor = "Z")
    public boolean field2842;

    @OriginalMember(owner = "client!ml", name = "jf", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!ml", name = "od", descriptor = "Ljava/lang/String;")
    private String field2904;

    @OriginalMember(owner = "client!ml", name = "pc", descriptor = "Z")
    private boolean field2812;

    @OriginalMember(owner = "client!ml", name = "Wd", descriptor = "Z")
    public boolean field2901;

    @OriginalMember(owner = "client!ml", name = "Wg", descriptor = "Z")
    public boolean field2802;

    @OriginalMember(owner = "client!ml", name = "Zg", descriptor = "Z")
    public boolean field2884;

    @OriginalMember(owner = "client!ml", name = "kh", descriptor = "Z")
    public boolean field2861;

    @OriginalMember(owner = "client!ml", name = "Hd", descriptor = "Z")
    private boolean field2800;

    @OriginalMember(owner = "client!ml", name = "gc", descriptor = "Ljava/lang/String;")
    private String field2883;

    @OriginalMember(owner = "client!ml", name = "zc", descriptor = "Z")
    public boolean field2806;

    @OriginalMember(owner = "client!ml", name = "Ig", descriptor = "Z")
    private boolean field2882;

    @OriginalMember(owner = "client!ml", name = "Af", descriptor = "Lgk;")
    private class749 field2748;

    @OriginalMember(owner = "client!ml", name = "vh", descriptor = "Lbk;")
    public class209 field2759;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Ltq;")
    private class561 field2752;

    @OriginalMember(owner = "client!ml", name = "Kb", descriptor = "Ltt;")
    private class504 field2755;

    @OriginalMember(owner = "client!ml", name = "qf", descriptor = "Ljda;")
    private class463 field2751;

    @OriginalMember(owner = "client!ml", name = "Dh", descriptor = "[Ljava/lang/String;")
    private static final String[] field2913 = new String[] { method1691(method1690("zNES*?")), method1691(method1690("yW\u0007p")), method1691(method1690("l\fE2\u0012")), method1691(method1690("zNEX%?")), method1691(method1690("zNEJ+?")), method1691(method1690("zNEW*?")), method1691(method1690("zNEP,?")), method1691(method1690("zNEMG")), method1691(method1690("zNES-?")), method1691(method1690("zNET,?")), method1691(method1690("zNE]%?")), method1691(method1690("zNER&?")), method1691(method1690("zNEY*?")), method1691(method1690("zNE_*?")), method1691(method1690("zNEZ%?")), method1691(method1690("zNERG")), method1691(method1690("zNEU-?")), method1691(method1690("zNE[+?")), method1691(method1690("zNEY-?")), method1691(method1690("zNEVG")), method1691(method1690("zNEH-?")), method1691(method1690("zNES)?")), method1691(method1690("zNE]-?")), method1691(method1690("zNEKG")), method1691(method1690("zNEZ,?")), method1691(method1690("zNEM*?")), method1691(method1690("zNEQ,?")), method1691(method1690("zNE^)?")), method1691(method1690("zNE],?")), method1691(method1690("zNEL.?")), method1691(method1690("zNEX,?")), method1691(method1690("zNEI+?")), method1691(method1690("zNED.?")), method1691(method1690("zNEP-?")), method1691(method1690("zNEl\u000e?")), method1691(method1690("zNEI&?")), method1691(method1690("zNET-?")), method1691(method1690("zNE_+?")), method1691(method1690("zNEf\u000e?")), method1691(method1690("zNE[,?")), method1691(method1690("zNEHG")), method1691(method1690("zNE^%?")), method1691(method1690("zNEQ)?")), method1691(method1690("zNEQ*?")), method1691(method1690("zNEX'?")), method1691(method1690("zNEV*?")), method1691(method1690("zNE^G")), method1691(method1690("zNEL*?")), method1691(method1690("zNEM)?")), method1691(method1690("zNEI.?")), method1691(method1690("zNEW,?")), method1691(method1690("zNEX-?")), method1691(method1690("zNEN,?")), method1691(method1690("zNE]G")), method1691(method1690("zNEW.?")), method1691(method1690("zNEK,?")), method1691(method1690("zNEuG")), method1691(method1690("zNEO,?")), method1691(method1690("zNEX*?")), method1691(method1690("zNEQG")), method1691(method1690("zNEJ,?")), method1691(method1690("zNEJ-?")), method1691(method1690("zNENG")), method1691(method1690("zNEJ.?")), method1691(method1690("zNES,?")), method1691(method1690("zNEW&?")), method1691(method1690("zNEM.?")), method1691(method1690("zNE]*?")), method1691(method1690("zNER.?")), method1691(method1690("zNE_)?")), method1691(method1690("zNEV+?")), method1691(method1690("XR\u000er([")), method1691(method1690("~L\u001fy\u0003")), method1691(method1690("yT\u0002x\u0006v")), method1691(method1690("vV\u0002")), method1691(method1690("zNEQ&?")), method1691(method1690("zNET.?")), method1691(method1690("zNER,?")), method1691(method1690("zNEW-?")), method1691(method1690("zNEQ.?")), method1691(method1690("zNE_G")), method1691(method1690("zNET(?")), method1691(method1690("zNEU*?")), method1691(method1690("zNEL,?")), method1691(method1690("zNER*?")), method1691(method1690("zNEN(?")), method1691(method1690("zNE~G")), method1691(method1690("zNEQ-?")), method1691(method1690("zNEI-?")), method1691(method1690("zNELG")), method1691(method1690("zNES'?")), method1691(method1690("zNE_(?")), method1691(method1690("zNE]+?")), method1691(method1690("zNEK&?")), method1691(method1690("zNEV.?")), method1691(method1690("zNEJ&?")), method1691(method1690("zNE^,?")), method1691(method1690("zNEnG")), method1691(method1690("zNEH,?")), method1691(method1690("zNES.?")), method1691(method1690("zNEI,?")), method1691(method1690("zNEe\u000e?")), method1691(method1690("zNEM+?")), method1691(method1690("zNE[G")), method1691(method1690("zNEIG")), method1691(method1690("zNET'?")), method1691(method1690("zNEY.?")), method1691(method1690("zNEU,?")), method1691(method1690("zNE[*?")), method1691(method1690("zNEEG")), method1691(method1690("zNEd\u000e?")), method1691(method1690("zNEW)?")), method1691(method1690("zNE])?")), method1691(method1690("zNE^*?")), method1691(method1690("zNE]'?")), method1691(method1690("zNEO*?")), method1691(method1690("zNEZ-?")), method1691(method1690("zC\b")), method1691(method1690("Pn4]=U}\u001fy\u0017cW\u0019y0tW\ty0zC\u001b")), method1691(method1690("Pn4]=U}\u001dy\u001dcG\u0013C\rbD\ry\u001dHM\tv\ntV")), method1691(method1690("Pn4Y7C}\rn\u000ezG\ti\tqG\u0019C\r{K\u001f")), method1691(method1690("Pn4]=U}\u001dy\u001dcG\u0013C\u001c\u007fC\u000fy\u001d")), method1691(method1690("zG\u0018}")), method1691(method1690("Pn4]=U}\u001fy\u0017cW\u0019y0qN\u0004}\u001b")), method1691(method1690("zK\bn\u0000dM\rh")), method1691(method1690("Pn4]=U}\rn\u000epO\u000er\u001bHQ\u0003}\u000brP")), method1691(method1690("Pn4Y7C}\rn\u000ezG\ti\tqG\u0019C\u0000uH\u000e\u007f\u001b")), method1691(method1690("Pn4]=U}\rn\u000epO\u000er\u001bHR\u0019s\beC\u0006")), method1691(method1690("Pn4]=U}\u0006i\u0003cK\u001fy\u0017cW\u0019y")), method1691(method1690("uP\u0002}\u00017R\ni\u0003")), method1691(method1690("Pn4]=U}\u001fy\u0017cW\u0019y0rL\u001dC\fxO\tu\u0001r")), method1691(method1690("Pn4Y7C}\rn\u000ezG\ti\tqG\u0019C\u0002bN\u001fu\u001cvO\u001bp\n")), method1691(method1690("Pn4]=U}\u001dy\u001dcG\u0013C\u001feM\fn\u000ez")), method1691(method1690("Pn4]=U}\u0006i\u0003cK\u0018}\u0002gN\u000e")), method1691(method1690("zNE_,?")), method1691(method1690("Pn4]=U}\u001fy\u0017cW\u0019y0eG\bh\u000eyE\u0007y")), method1691(method1690("Pn4Y7C}\u001fy\u0017cW\u0019y\\S")), method1691(method1690("zNEOG")), method1691(method1690("zNEP&?")), method1691(method1690("zNESG")), method1691(method1690("zNEO.?")), method1691(method1690("zNEH.?")), method1691(method1690("zNEK+?")), method1691(method1690("zNEF.?")), method1691(method1690("zNEY,?")), method1691(method1690("zNEZ)?")), method1691(method1690("zNES&?")), method1691(method1690("zNEM-?")), method1691(method1690("zNEH&?")), method1691(method1690("zNE}\u000e?")), method1691(method1690("zNEX+?")), method1691(method1690("zNEN*?")), method1691(method1690("zNEU.?")), method1691(method1690("zNEX.?")), method1691(method1690("zNEWG")), method1691(method1690("zNEQ+?")), method1691(method1690("zNET*?")), method1691(method1690("zNER+?")), method1691(method1690("zNEL(?")), method1691(method1690("zNEH+?")), method1691(method1690("zNEY%?")), method1691(method1690("zNEZ'?")), method1691(method1690("zNE[-?")), method1691(method1690("zNEx\u000e?")), method1691(method1690("zNEJG")), method1691(method1690("zNEM,?")), method1691(method1690("zNER'?")), method1691(method1690("zNE].?")), method1691(method1690("zNEN.?")), method1691(method1690("zNEr\u000e?")), method1691(method1690("zNEY)?")), method1691(method1690("zNEUG")), method1691(method1690("zNET+?")), method1691(method1690("zNE^-?")), method1691(method1690("zNEV,?")), method1691(method1690("zNEL+?")), method1691(method1690("zNEDG")), method1691(method1690("zNEP.?")), method1691(method1690("zNEV-?")), method1691(method1690("zNEYG")), method1691(method1690("zNEJ)?")), method1691(method1690("}C\u001d}AvU\u001f2,vL\u001d}\u001c")), method1691(method1690("dG\u001fU\byM\u0019y=rR\nu\u0001c")), method1691(method1690("zNEX)?")), method1691(method1690("zNEZG")), method1691(method1690("zNEK.?")), method1691(method1690("zNE_-?")), method1691(method1690("zNES+?")), method1691(method1690("zNE^.?")), method1691(method1690("zNEXG")), method1691(method1690("zNEPG")), method1691(method1690("zNEP+?")), method1691(method1690("zNEN-?")), method1691(method1690("zNEO-?")), method1691(method1690("zNE_.?")), method1691(method1690("zNEZ*?")), method1691(method1690("zNEL&?")), method1691(method1690("zNER-?")), method1691(method1690("zNEP*?")), method1691(method1690("zNEO&?")), method1691(method1690("zNEI(?")), method1691(method1690("zNEZ+?")), method1691(method1690("zNEH(?")), method1691(method1690("zNEM&?")), method1691(method1690("zNEU+?")), method1691(method1690("zNEK-?")), method1691(method1690("zNEN+?")), method1691(method1690("zNEW+?")), method1691(method1690("zNE^+?")), method1691(method1690("zNEL-?")), method1691(method1690("zNEZ.?")), method1691(method1690("zNEP'?")), method1691(method1690("zNE_%?")), method1691(method1690("zNEzG")), method1691(method1690("zNETG")), method1691(method1690("zNE[.?")), method1691(method1690("eC\u000fy\u0000y")), method1691(method1690("}C\bp\u0006u")), method1691(method1690("d\u0011K{\u001dvR\u0003u\fd")), method1691(method1690("}C\f{\u0003")), method1691(method1690("zNE \u0006yK\u001f\"G")), method1691(method1690("Pn4]=U}\u0003}\u0003q}\rp\u0000vV4l\u0006oG\u0007")), method1691(method1690("\u007fF")), method1691(method1690("zNEJ(?")), method1691(method1690("zNEO+?")), method1691(method1690("zNEp\u000e?")), method1691(method1690("zNEn\u000e?")), method1691(method1690("zNEY+?")) };

    @OriginalMember(owner = "client!ml", name = "Lg", descriptor = "[I")
    public static int[] field2706 = new int[2];

    @OriginalMember(owner = "client!ml", name = "re", descriptor = "I")
    public static int field2682 = 7000;

    @OriginalMember(owner = "client!ml", name = "lf", descriptor = "I")
    public static int field2686 = field2682;

    @OriginalMember(owner = "client!ml", name = "Tb", descriptor = "Lmv;")
    public static class125 field2551 = new class125(8, 4);

    @OriginalMember(owner = "client!ml", name = "Ic", descriptor = "F")
    public float field2804;

    @OriginalMember(owner = "client!ml", name = "cb", descriptor = "F")
    private float field2836;

    @OriginalMember(owner = "client!ml", name = "Kc", descriptor = "F")
    private float field2839;

    @OriginalMember(owner = "client!ml", name = "zh", descriptor = "F")
    private float field2845;

    @OriginalMember(owner = "client!ml", name = "fe", descriptor = "F")
    public float field2854;

    @OriginalMember(owner = "client!ml", name = "wc", descriptor = "F")
    public float field2864;

    @OriginalMember(owner = "client!ml", name = "cf", descriptor = "F")
    public float field2865;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "F")
    public float field2871;

    @OriginalMember(owner = "client!ml", name = "ug", descriptor = "F")
    public float field2893;

    @OriginalMember(owner = "client!ml", name = "Vg", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ml", name = "eb", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ml", name = "Jd", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ml", name = "ub", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ml", name = "tc", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ml", name = "gd", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ml", name = "Sb", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ml", name = "bf", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ml", name = "me", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ml", name = "Qe", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ml", name = "kc", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ml", name = "Uc", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ml", name = "mg", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ml", name = "Ye", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ml", name = "ib", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ml", name = "sg", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ml", name = "he", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ml", name = "qd", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ml", name = "mf", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ml", name = "gb", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ml", name = "Ub", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ml", name = "Ue", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ml", name = "ic", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ml", name = "Qf", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ml", name = "Gc", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!ml", name = "nb", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ml", name = "Bc", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ml", name = "bd", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ml", name = "xh", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!ml", name = "zf", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ml", name = "Wb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ml", name = "hf", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ml", name = "ee", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ml", name = "qc", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ml", name = "Gd", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ml", name = "Md", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ml", name = "be", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ml", name = "yh", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ml", name = "Be", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ml", name = "Ab", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ml", name = "Gf", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ml", name = "Ug", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ml", name = "Kg", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ml", name = "ec", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ml", name = "xg", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ml", name = "Zd", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ml", name = "Mc", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ml", name = "ld", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ml", name = "Ee", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ml", name = "wf", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ml", name = "yg", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ml", name = "Qb", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ml", name = "Db", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ml", name = "ce", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ml", name = "Ng", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ml", name = "hh", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ml", name = "Nb", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ml", name = "yc", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ml", name = "Nc", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ml", name = "Jg", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ml", name = "Me", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ml", name = "le", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ml", name = "We", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ml", name = "He", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ml", name = "db", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ml", name = "mh", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ml", name = "Og", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ml", name = "jh", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!ml", name = "af", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ml", name = "dd", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ml", name = "tf", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ml", name = "ed", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ml", name = "Fb", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ml", name = "Gg", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ml", name = "Sc", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ml", name = "ah", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ml", name = "bc", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ml", name = "Xd", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ml", name = "Gb", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ml", name = "jc", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ml", name = "vd", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ml", name = "yf", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ml", name = "vb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ml", name = "ze", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ml", name = "Ud", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ml", name = "xc", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ml", name = "rb", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ml", name = "Eg", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ml", name = "ch", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ml", name = "df", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ml", name = "cg", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ml", name = "dg", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ml", name = "Sd", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ml", name = "uf", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ml", name = "Pd", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ml", name = "Zf", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ml", name = "Od", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ml", name = "fh", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ml", name = "sd", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ml", name = "Zc", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!ml", name = "ue", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ml", name = "Yc", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ml", name = "pd", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ml", name = "te", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ml", name = "Xb", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ml", name = "cd", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ml", name = "Yb", descriptor = "I")
    private int field2662;

    @OriginalMember(owner = "client!ml", name = "xb", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ml", name = "hc", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ml", name = "Ce", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ml", name = "se", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ml", name = "Ec", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ml", name = "Nf", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ml", name = "lg", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ml", name = "Je", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ml", name = "Ff", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ml", name = "xd", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ml", name = "ae", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ml", name = "ag", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ml", name = "gh", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ml", name = "de", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ml", name = "hd", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ml", name = "Hf", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ml", name = "Ac", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ml", name = "fd", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ml", name = "Df", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ml", name = "eg", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ml", name = "lh", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ml", name = "Ib", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!ml", name = "pe", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ml", name = "Jf", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ml", name = "Fd", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ml", name = "qb", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ml", name = "Ve", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ml", name = "pf", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ml", name = "oh", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ml", name = "dh", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ml", name = "Rb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ml", name = "Xg", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ml", name = "Ze", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ml", name = "wd", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ml", name = "sc", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ml", name = "bh", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ml", name = "oe", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ml", name = "pb", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ml", name = "Dg", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ml", name = "rf", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ml", name = "ph", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ml", name = "ob", descriptor = "I")
    private int field2710;

    @OriginalMember(owner = "client!ml", name = "Qd", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ml", name = "Oc", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ml", name = "Id", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ml", name = "eh", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ml", name = "md", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ml", name = "Vd", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ml", name = "Ah", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!ml", name = "fb", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ml", name = "Bf", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ml", name = "uh", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ml", name = "Cb", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ml", name = "Wc", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!ml", name = "mb", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ml", name = "Rd", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ml", name = "Le", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ml", name = "Ld", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ml", name = "Pg", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ml", name = "Ne", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ml", name = "Tg", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ml", name = "Nd", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!ml", name = "Ge", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ml", name = "zd", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ml", name = "sh", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ml", name = "bg", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ml", name = "wh", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!ml", name = "xe", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!ml", name = "Dc", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ml", name = "Yf", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ml", name = "Rg", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ml", name = "dc", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ml", name = "Se", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ml", name = "ef", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!ml", name = "ie", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!ml", name = "kd", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!ml", name = "fc", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ml", name = "xf", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!ml", name = "yd", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!ml", name = "oc", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!ml", name = "Qg", descriptor = "I")
    private int field2778;

    @OriginalMember(owner = "client!ml", name = "vc", descriptor = "I")
    private int field2788;

    @OriginalMember(owner = "client!ml", name = "gf", descriptor = "I")
    private int field2791;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!ml", name = "id", descriptor = "I")
    private int field2798;

    @OriginalMember(owner = "client!ml", name = "Tc", descriptor = "I")
    private int field2799;

    @OriginalMember(owner = "client!ml", name = "qe", descriptor = "I")
    private int field2830;

    @OriginalMember(owner = "client!ml", name = "qh", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!ml", name = "hb", descriptor = "I")
    private int field2846;

    @OriginalMember(owner = "client!ml", name = "Jc", descriptor = "I")
    private int field2855;

    @OriginalMember(owner = "client!ml", name = "ih", descriptor = "I")
    private int field2867;

    @OriginalMember(owner = "client!ml", name = "lb", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!ml", name = "Bh", descriptor = "I")
    private int field2879;

    @OriginalMember(owner = "client!ml", name = "vf", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!ml", name = "Vb", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!ml", name = "Re", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!ml", name = "Pf", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!ml", name = "ig", descriptor = "J")
    private long field2792;

    @OriginalMember(owner = "client!ml", name = "Xc", descriptor = "Lbp;")
    public class117 field2833;

    @OriginalMember(owner = "client!ml", name = "ac", descriptor = "Lse;")
    private class162 field2774;

    @OriginalMember(owner = "client!ml", name = "Ae", descriptor = "Lbda;")
    private class181 field2856;

    @OriginalMember(owner = "client!ml", name = "Fe", descriptor = "Lgda;")
    private class268 field2829;

    @OriginalMember(owner = "client!ml", name = "Ad", descriptor = "Lso;")
    public class316 field2819;

    @OriginalMember(owner = "client!ml", name = "Vc", descriptor = "Lso;")
    public class316 field2822;

    @OriginalMember(owner = "client!ml", name = "Cd", descriptor = "Lcea;")
    public class435 field2801;

    @OriginalMember(owner = "client!ml", name = "Pc", descriptor = "Lcea;")
    public class435 field2820;

    @OriginalMember(owner = "client!ml", name = "Cf", descriptor = "Lcea;")
    public class435 field2837;

    @OriginalMember(owner = "client!ml", name = "jd", descriptor = "Lcea;")
    public class435 field2838;

    @OriginalMember(owner = "client!ml", name = "Eb", descriptor = "Lcea;")
    public class435 field2850;

    @OriginalMember(owner = "client!ml", name = "Ed", descriptor = "Lcea;")
    public class435 field2862;

    @OriginalMember(owner = "client!ml", name = "wg", descriptor = "Lcea;")
    public class435 field2868;

    @OriginalMember(owner = "client!ml", name = "Wf", descriptor = "Lcea;")
    public class435 field2885;

    @OriginalMember(owner = "client!ml", name = "Ke", descriptor = "Lcea;")
    public class435 field2895;

    @OriginalMember(owner = "client!ml", name = "Uf", descriptor = "Lcea;")
    public class435 field2896;

    @OriginalMember(owner = "client!ml", name = "kf", descriptor = "Llga;")
    public static class47 field2701;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "Lhb;")
    private class513 field2765;

    @OriginalMember(owner = "client!ml", name = "Mg", descriptor = "Lhb;")
    public class513 field2841;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lor;")
    private class58 field2831;

    @OriginalMember(owner = "client!ml", name = "Hb", descriptor = "Laq;")
    private class69 field2770;

    @OriginalMember(owner = "client!ml", name = "If", descriptor = "Laq;")
    private class69 field2772;

    @OriginalMember(owner = "client!ml", name = "je", descriptor = "Laj;")
    private class94 field2859;

    @OriginalMember(owner = "client!ml", name = "Qc", descriptor = "Laj;")
    private class94 field2898;

    @OriginalMember(owner = "client!ml", name = "nf", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2761;

    @OriginalMember(owner = "client!ml", name = "ne", descriptor = "Z")
    private boolean field2785;

    @OriginalMember(owner = "client!ml", name = "Hc", descriptor = "Z")
    private boolean field2787;

    @OriginalMember(owner = "client!ml", name = "Sf", descriptor = "Z")
    private boolean field2789;

    @OriginalMember(owner = "client!ml", name = "ad", descriptor = "Z")
    private boolean field2790;

    @OriginalMember(owner = "client!ml", name = "Cc", descriptor = "Z")
    private boolean field2805;

    @OriginalMember(owner = "client!ml", name = "kg", descriptor = "Z")
    private boolean field2807;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Z")
    public boolean field2814;

    @OriginalMember(owner = "client!ml", name = "Te", descriptor = "Z")
    private boolean field2818;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Z")
    private boolean field2826;

    @OriginalMember(owner = "client!ml", name = "th", descriptor = "Z")
    public boolean field2847;

    @OriginalMember(owner = "client!ml", name = "Mb", descriptor = "Z")
    private boolean field2858;

    @OriginalMember(owner = "client!ml", name = "Pe", descriptor = "Z")
    public boolean field2860;

    @OriginalMember(owner = "client!ml", name = "Jb", descriptor = "Z")
    public boolean field2873;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "Z")
    public boolean field2874;

    @OriginalMember(owner = "client!ml", name = "vg", descriptor = "Z")
    private boolean field2875;

    @OriginalMember(owner = "client!ml", name = "sf", descriptor = "Z")
    private boolean field2876;

    @OriginalMember(owner = "client!ml", name = "jg", descriptor = "Z")
    public boolean field2877;

    @OriginalMember(owner = "client!ml", name = "ge", descriptor = "Z")
    public boolean field2888;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "Z")
    public boolean field2892;

    @OriginalMember(owner = "client!ml", name = "Lc", descriptor = "Z")
    public boolean field2899;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "[Lica;")
    private class469[] field2810;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 3)
    public final void method146(boolean arg0) {
        try {
            ++field2617;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[146] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "da", descriptor = "(III[I)V", line = 14)
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field2664;
            float var5 = (float) arg2 * this.field2786.field1001 + (float) arg0 * this.field2786.field1000 + (float) arg1 * this.field2786.field1032 + this.field2786.field995;
            if (!(var5 < (float) this.field2816) && !(var5 > (float) this.field2852)) {
                int var6 = (int) (((float) arg2 * this.field2786.field1030 + (float) arg0 * this.field2786.field1010 + (float) arg1 * this.field2786.field1005 + this.field2786.field996) * (float) this.field2796 / var5);
                int var7 = (int) (((float) arg2 * this.field2786.field1002 + (float) arg0 * this.field2786.field1018 + (float) arg1 * this.field2786.field1027 + this.field2786.field1028) * (float) this.field2886 / var5);
                if ((float) var6 >= this.field2804 && this.field2854 >= (float) var6 && (float) var7 >= this.field2865 && this.field2864 >= (float) var7) {
                    arg3[2] = (int) var5;
                    arg3[0] = (int) ((float) var6 + -this.field2804);
                    arg3[1] = (int) ((float) var7 - this.field2865);
                } else {
                    arg3[0] = arg3[1] = arg3[2] = -1;
                }
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2913[163] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V", line = 44)
    public final synchronized void method175(int arg0) {
        try {
            ++field2670;
            int var14 = arg0 & Integer.MAX_VALUE;
            int var2 = 0;
            while (!this.field2779.method3974(-22016)) {
                class529 var3 = (class529) this.field2779.method3980(-27119);
                class522.field7615[var2++] = (int) var3.field8378;
                this.field2776 -= var3.field7679;
                if (~var2 == -1001) {
                    OpenGL.glDeleteBuffersARB(var2, class522.field7615, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteBuffersARB(var2, class522.field7615, 0);
                var2 = 0;
            }
            while (!this.field2780.method3974(-22016)) {
                class529 var4 = (class529) this.field2780.method3980(-27119);
                class522.field7615[var2++] = (int) var4.field8378;
                this.field2775 -= var4.field7679;
                if (~var2 == -1001) {
                    OpenGL.glDeleteTextures(var2, class522.field7615, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteTextures(var2, class522.field7615, 0);
                var2 = 0;
            }
            while (!this.field2781.method3974(-22016)) {
                class529 var5 = (class529) this.field2781.method3980(-27119);
                class522.field7615[var2++] = var5.field7679;
                if (~var2 == -1001) {
                    OpenGL.glDeleteFramebuffersEXT(var2, class522.field7615, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteFramebuffersEXT(var2, class522.field7615, 0);
                var2 = 0;
            }
            while (!this.field2782.method3974(-22016)) {
                class529 var6 = (class529) this.field2782.method3980(-27119);
                class522.field7615[var2++] = (int) var6.field8378;
                this.field2778 -= var6.field7679;
                if (~var2 == -1001) {
                    OpenGL.glDeleteRenderbuffersEXT(var2, class522.field7615, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class522.field7615, 0);
                boolean var7 = false;
            }
            while (!this.field2777.method3974(-22016)) {
                class529 var8 = (class529) this.field2777.method3980(-27119);
                OpenGL.glDeleteLists((int) var8.field8378, var8.field7679);
            }
            while (!this.field2783.method3974(-22016)) {
                class578 var9 = this.field2783.method3980(-27119);
                OpenGL.glDeleteProgramARB((int) var9.field8378);
            }
            while (!this.field2784.method3974(-22016)) {
                class578 var10 = this.field2784.method3980(-27119);
                OpenGL.glDeleteObjectARB(var10.field8378);
            }
            while (!this.field2777.method3974(-22016)) {
                class529 var11 = (class529) this.field2777.method3980(-27119);
                OpenGL.glDeleteLists((int) var11.field8378, var11.field7679);
            }
            this.field2748.method5421(6408);
            if (this.method122() > 100663296 && this.field2792 + 60000L < class614.method4531(-33)) {
                System.gc();
                this.field2792 = class614.method4531(-57);
            }
            this.field2763 = var14;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field2913[166] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "()Z", line = 211)
    public final boolean method158() {
        try {
            ++field2634;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[211] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "()Z", line = 219)
    public final boolean method186() {
        try {
            ++field2630;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[82] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "()V", line = 227)
    public final void method135() {
        try {
            ++field2587;
            this.field2752.method4198(64);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[196] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "()Z", line = 239)
    public final boolean method202() {
        try {
            ++field2622;
            return false;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[197] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "(IIIIII[BII)V", line = 247)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            ++field2612;
            float var10;
            float var11;
            if (this.field2829 != null && ~this.field2829.field1485 <= ~arg2 && arg3 <= this.field2829.field1482) {
                this.field2829.method1064(0, arg6, 0, 6406, arg2, false, 0, arg3, (byte) 62, 0);
                var10 = (float) arg3 * this.field2829.field3803 / (float) this.field2829.field1482;
                var11 = (float) arg2 * this.field2829.field3802 / (float) this.field2829.field1485;
            } else {
                this.field2829 = class172.method1453(34037, arg3, arg6, false, this, arg2, 6406, 6406);
                this.field2829.method1065(false, (byte) 127, false);
                var10 = this.field2829.field3803;
                var11 = this.field2829.field3802;
            }
            this.method1620((byte) 121);
            this.method1618((byte) 33, this.field2829);
            this.method1670(arg8, (byte) 113);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            this.method1638(false, arg5);
            this.method1628(34165, 34165, 34162);
            this.method1669(768, 0, 34166, (byte) -113);
            this.method1669(770, 2, 5890, (byte) -110);
            this.method1650(0, (byte) -109, 770, 34166);
            this.method1650(2, (byte) -109, 770, 5890);
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
            this.method1669(768, 0, 5890, (byte) -119);
            this.method1669(770, 2, 34166, (byte) -120);
            this.method1650(0, (byte) -109, 770, 5890);
            this.method1650(2, (byte) -109, 770, 34166);
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field2913[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2913[2] : field2913[1]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lrha;IIII)Lka;", line = 305)
    public final class761 method197(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2584;
            return new class435(this, arg0, arg1, arg3, arg4, arg2);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[69] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lcu;Z)Ltb;", line = 314)
    public final class392 method231(class66 arg0, boolean arg1) {
        try {
            ++field2653;
            int[] var3 = new int[arg0.field981 * arg0.field977];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field976 != null) {
                for (int var6 = 0; arg0.field977 > var6; ++var6) {
                    for (int var7 = 0; var7 < arg0.field981; ++var7) {
                        var3[var5++] = class10.method71(arg0.field979[class434.method3377(arg0.field982[var4], 255)], arg0.field976[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~var8 > ~arg0.field977; ++var8) {
                    for (int var9 = 0; ~arg0.field981 < ~var9; ++var9) {
                        int var10 = arg0.field979[255 & arg0.field982[var4++]];
                        var3[var5++] = var10 != 0 ? class10.method71(-16777216, var10) : 0;
                    }
                }
            }
            class392 var11 = this.method201(arg0.field977, arg0.field981, var3, arg0.field981, (byte) 125, 0);
            var11.method1379(arg0.field984, arg0.field983, arg0.field978, arg0.field980);
            return var11;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field2913[200] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "(I)[I", line = 375)
    public static final int[] method1606(int arg0) {
        try {
            ++field2597;
            if (arg0 != 5) {
                method1668(-26);
            }
            return new int[] { class121.field1536, class717.field10218, class55.field775 };
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[206] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "()[I", line = 386)
    public final int[] method157() {
        try {
            ++field2691;
            return new int[] { this.field2848, this.field2811, this.field2796, this.field2886 };
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[109] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IJ)V", line = 398)
    public final synchronized void method1607(int arg0, long arg1) {
        try {
            ++field2708;
            int var4 = 103 % ((arg0 - 12) / 46);
            class578 var5 = new class578();
            var5.field8378 = arg1;
            this.field2784.method3984(var5, 0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[188] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Lza;", line = 411)
    public final class348 method214(int arg0) {
        try {
            ++field2654;
            class775 var2 = new class775(arg0);
            this.field2762.method3984(var2, 0);
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[107] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "(B)I", line = 423)
    private final int method1608(byte arg0) {
        try {
            ++field2598;
            int var2 = 0;
            this.field2883 = OpenGL.glGetString(7936).toLowerCase();
            this.field2904 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field2883.indexOf(field2913[124]) != -1) {
                var2 |= 1;
            }
            if (this.field2883.indexOf(field2913[129]) != -1 || ~this.field2883.indexOf(field2913[122]) != 0) {
                var2 |= 1;
            }
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class793.method5716(' ', var3.replace('.', ' '), arg0 + -94);
            if (~var4.length <= -3) {
                try {
                    int var5 = class425.method3299(var4[0], (byte) 104);
                    int var6 = class425.method3299(var4[1], (byte) 121);
                    this.field2867 = var5 * 10 + var6;
                } catch (NumberFormatException var9) {
                    var2 |= 4;
                }
            } else {
                var2 |= 4;
            }
            if (~this.field2867 > -13) {
                var2 |= 2;
            }
            if (!this.field2635.method5238(field2913[128])) {
                var2 |= 8;
            }
            if (!this.field2635.method5238(field2913[130])) {
                var2 |= 32;
            }
            int[] var7 = new int[1];
            OpenGL.glGetIntegerv(34018, var7, 0);
            this.field2906 = var7[0];
            OpenGL.glGetIntegerv(34929, var7, 0);
            this.field2846 = var7[0];
            OpenGL.glGetIntegerv(34930, var7, 0);
            this.field2902 = var7[0];
            if (~this.field2906 > -3 || ~this.field2846 > -3 || this.field2902 < 2) {
                var2 |= 16;
            }
            this.field2842 = Stream.method3200();
            this.field2805 = this.field2635.arePbuffersAvailable();
            this.field2812 = this.field2635.method5238(field2913[119]);
            this.field2818 = this.field2635.method5238(field2913[133]);
            this.field2873 = this.field2635.method5238(field2913[132]);
            this.field2635.method5238(field2913[127]);
            this.field2888 = this.field2635.method5238(field2913[121]);
            this.field2892 = this.field2635.method5238(field2913[125]);
            this.field2901 = this.field2635.method5238(field2913[136]);
            this.field2884 = this.field2635.method5238(field2913[135]);
            this.field2860 = this.field2635.method5238(field2913[118]);
            this.field2802 = this.field2635.method5238(field2913[123]);
            this.field2899 = false;
            this.field2806 = this.field2635.method5238(field2913[126]);
            if (arg0 != 10) {
                return -25;
            } else {
                this.field2847 = this.field2635.method5238(field2913[120]);
                this.field2814 = this.field2635.method5238(field2913[131]);
                this.field2876 = this.field2814 & this.field2847;
                this.field2877 = class447.field6571.startsWith(field2913[117]);
                OpenGL.glGetFloatv(2834, class686.field9610, 0);
                this.field2849 = class686.field9610[0];
                this.field2797 = class686.field9610[1];
                return ~var2 == -1 ? 0 : var2;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2913[134] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 512)
    private final void method1609(int arg0) {
        try {
            if (~this.field2855 != -3) {
                this.field2855 = 2;
                this.method1683(-106);
                this.method1689((byte) 45);
                this.field2788 &= -8;
            }
            ++field2594;
            if (arg0 != 4650) {
                this.method217();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[141] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 530)
    public final void method156(Canvas arg0) {
        try {
            ++field2615;
            this.field2568 = 0L;
            this.field2744 = null;
            if (arg0 != null && this.field2548 != arg0) {
                if (this.field2666.containsKey(arg0)) {
                    Long var2 = (Long) this.field2666.get(arg0);
                    this.field2568 = var2;
                    this.field2744 = arg0;
                }
            } else {
                this.field2744 = this.field2548;
                this.field2568 = this.field2657;
            }
            if (this.field2744 != null && this.field2568 != 0L) {
                this.field2635.setSurface(this.field2568);
                this.method1641((byte) -65);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[19] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(II)V", line = 569)
    public final void method120(int arg0, int arg1) {
        try {
            if (~this.field2816 != ~arg0 || this.field2852 != arg1) {
                this.field2852 = arg1;
                this.field2816 = arg0;
                this.method1679(113);
                this.method1666(-118);
                if (this.field2855 != 3) {
                    if (~this.field2855 == -3) {
                        this.method1683(-99);
                    }
                } else {
                    this.method1687((byte) -5);
                }
            }
            ++field2712;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[213] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Laq;I)V", line = 595)
    public final void method1610(class69 arg0, int arg1) {
        try {
            int var3 = -42 % ((arg1 - -62) / 58);
            ++field2578;
            if (this.field2766 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field2766 >= 0) {
                    this.field2773[this.field2766].method716(15302);
                }
                this.field2770 = this.field2773[++this.field2766] = arg0;
                this.field2770.method715((byte) -113);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[0] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "()V", line = 612)
    public final void method238() {
        try {
            ++field2575;
            if (this.field2882 && this.field2737 > 0 && this.field2746 > 0) {
                int var1 = this.field2823;
                int var2 = this.field2857;
                int var3 = this.field2809;
                int var4 = this.field2881;
                this.method240();
                OpenGL.glReadBuffer(1028);
                OpenGL.glDrawBuffer(1029);
                this.method1616((byte) 61);
                this.method1673(8, false);
                this.method1684(false, (byte) -84);
                this.method1640(false, (byte) -50);
                this.method1632(false, true);
                this.method1618((byte) -93, (class469) null);
                this.method1625(126, -2);
                this.method1631(1, 7681);
                this.method1670(0, (byte) 116);
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                OpenGL.glRasterPos2i(0, 0);
                OpenGL.glCopyPixels(0, 0, this.field2737, this.field2746, 6144);
                OpenGL.glFlush();
                OpenGL.glReadBuffer(1029);
                OpenGL.glDrawBuffer(1029);
                this.method208(var1, var3, var2, var4);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[199] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "()Z", line = 656)
    public final boolean method133() {
        try {
            ++field2605;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[49] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "JA", descriptor = "(IIIIII)I", line = 670)
    public final int method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2681;
            int var7 = 0;
            float var8 = (float) arg2 * this.field2786.field1001 + (float) arg0 * this.field2786.field1000 + (float) arg1 * this.field2786.field1032 + this.field2786.field995;
            if (var8 < 1.0F) {
                var8 = 1.0F;
            }
            float var9 = (float) arg5 * this.field2786.field1001 + (float) arg3 * this.field2786.field1000 + (float) arg4 * this.field2786.field1032 + this.field2786.field995;
            if (var9 < 1.0F) {
                var9 = 1.0F;
            }
            if ((float) this.field2816 > var8 && var9 < (float) this.field2816) {
                var7 |= 16;
            } else if (var8 > (float) this.field2852 && var9 > (float) this.field2852) {
                var7 |= 32;
            }
            int var10 = (int) (((float) arg2 * this.field2786.field1030 + (float) arg0 * this.field2786.field1010 + (float) arg1 * this.field2786.field1005 + this.field2786.field996) * (float) this.field2796 / var8);
            int var11 = (int) (((float) arg5 * this.field2786.field1030 + (float) arg3 * this.field2786.field1010 + (float) arg4 * this.field2786.field1005 + this.field2786.field996) * (float) this.field2796 / var9);
            if ((float) var10 < this.field2804 && (float) var11 < this.field2804) {
                var7 |= 1;
            } else if ((float) var10 > this.field2854 && (float) var11 > this.field2854) {
                var7 |= 2;
            }
            int var12 = (int) (((float) arg2 * this.field2786.field1002 + (float) arg0 * this.field2786.field1018 + (float) arg1 * this.field2786.field1027 + this.field2786.field1028) * (float) this.field2886 / var8);
            int var13 = (int) (((float) arg5 * this.field2786.field1002 + (float) arg3 * this.field2786.field1018 + (float) arg4 * this.field2786.field1027 + this.field2786.field1028) * (float) this.field2886 / var9);
            if ((float) var12 < this.field2865 && (float) var13 < this.field2865) {
                var7 |= 4;
            } else if ((float) var12 > this.field2864 && (float) var13 > this.field2864) {
                var7 |= 8;
            }
            return var7;
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field2913[94] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(II)Lbha;", line = 724)
    public final class545 method179(int arg0, int arg1) {
        try {
            ++field2544;
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V", line = 732)
    public final void method151(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2752.method4201(arg3, false, arg0, arg1, arg2);
            ++field2705;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[160] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(IIIII)V", line = 742)
    public static final void method1611(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg2 != -2535) {
                method1668(-100);
            }
            ++field2636;
            float var5 = (float) class534.field7759 / (float) class534.field7747;
            int var6 = arg0;
            int var7 = arg1;
            if (!(var5 < 1.0F)) {
                var6 = (int) ((float) arg1 / var5);
            } else {
                var7 = (int) ((float) arg0 * var5);
            }
            int var11 = arg4 - (-var7 + arg1) / 2;
            int var10 = arg3 - (-var6 + arg0) / 2;
            class573.field8301 = -1;
            class30.field383 = -(class534.field7759 * var11 / var7) + class534.field7759;
            class601.field8605 = class534.field7747 * var10 / var6;
            class801.field11652 = -1;
            class308.method2457(true);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2913[87] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "()V", line = 771)
    public final void method138() {
        try {
            OpenGL.glFinish();
            ++field2650;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[138] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([IIIIIZ)Ltb;", line = 782)
    public final class392 method180(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field2606;
            return new class162(this, arg3, arg4, arg0, arg1, arg2);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2913[91] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZIZ[B)Lbda;", line = 790)
    public final class181 method1612(int arg0, boolean arg1, int arg2, boolean arg3, byte[] arg4) {
        try {
            ++field2647;
            if (!arg3) {
                this.method153(94, (class685) null, 51, -33);
            }
            return (class181) (!this.field2812 || arg1 && !this.field2800 ? new class526(this, arg2, arg4, arg0) : new class443(this, arg2, arg4, arg0, arg1));
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[195] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "([I)V", line = 809)
    public final void method229(int[] arg0) {
        try {
            arg0[0] = this.field2823;
            ++field2550;
            arg0[3] = this.field2881;
            arg0[1] = this.field2809;
            arg0[2] = this.field2857;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[154] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "()Z", line = 820)
    public final boolean method137() {
        try {
            ++field2565;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[161] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "()V", line = 828)
    public final void method167() {
        try {
            for (class578 var1 = this.field2762.method3977((byte) -76); var1 != null; var1 = this.field2762.method3987(0)) {
                ((class775) var1).method5582(113);
            }
            ++field2648;
            if (this.field2752 != null) {
                this.field2752.method4204(false);
            }
            if (this.field2635 != null) {
                this.method1622((byte) -57);
                Enumeration var2 = this.field2666.keys();
                while (var2.hasMoreElements()) {
                    Canvas var3 = (Canvas) var2.nextElement();
                    Long var4 = (Long) this.field2666.get(var3);
                    this.field2635.releaseSurface(var3, var4);
                }
                this.field2635.release();
                this.field2635 = null;
            }
            if (this.field2764) {
                class485.method3742(false, true, -18448);
                this.field2764 = false;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[113] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLaq;)V", line = 875)
    public final void method1613(byte arg0, class69 arg1) {
        try {
            ++field2603;
            if (!this.field2847) {
                if (this.field2771 >= 3) {
                    throw new RuntimeException();
                }
                if (this.field2771 >= 0) {
                    this.field2767[this.field2771].method713(arg0 ^ 39);
                }
                this.field2772 = this.field2770 = this.field2767[++this.field2771] = arg1;
                this.field2772.method717((byte) 59);
            } else {
                this.method1675(-118, arg1);
                this.method1610(arg1, arg0 + -200);
            }
            if (arg0 != 77) {
                this.method189(-125, (class330[]) null);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[209] + arg0 + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "()I", line = 905)
    public final int method122() {
        try {
            ++field2545;
            return this.field2776 + this.field2775 - -this.field2778;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[179] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(II)Lkb;", line = 916)
    public final class102 method191(int arg0, int arg1) {
        try {
            ++field2566;
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[203] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(B)V", line = 926)
    private final void method1614(byte arg0) {
        try {
            OpenGL.glViewport(this.field2821, this.field2825, this.field2737, this.field2746);
            ++field2714;
            if (arg0 != 20) {
                this.method186();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[205] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIIII)Lsn;", line = 941)
    public final class369 method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2558;
            return this.field2860 ? new class771(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2913[96] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "(IIII)V", line = 950)
    public final void method230(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 < this.field2857) {
                this.field2857 = arg2;
            }
            if (~arg3 > ~this.field2881) {
                this.field2881 = arg3;
            }
            if (~arg0 < ~this.field2823) {
                this.field2823 = arg0;
            }
            ++field2690;
            if (~arg1 < ~this.field2809) {
                this.field2809 = arg1;
            }
            OpenGL.glEnable(3089);
            this.method1671(11405);
            this.method1667((byte) 72);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "(III[I)V", line = 979)
    public final void method223(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field2588;
            float var5 = (float) arg2 * this.field2786.field1001 + (float) arg0 * this.field2786.field1000 + (float) arg1 * this.field2786.field1032 + this.field2786.field995;
            if (var5 == 0.0F) {
                arg3[0] = arg3[1] = arg3[2] = -1;
            } else {
                int var6 = (int) (((float) arg2 * this.field2786.field1030 + (float) arg0 * this.field2786.field1010 + (float) arg1 * this.field2786.field1005 + this.field2786.field996) * (float) this.field2796 / var5);
                int var7 = (int) (((float) arg2 * this.field2786.field1002 + (float) arg0 * this.field2786.field1018 + (float) arg1 * this.field2786.field1027 + this.field2786.field1028) * (float) this.field2886 / var5);
                arg3[0] = (int) ((float) var6 - this.field2804);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field2865);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2913[214] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "()Z", line = 1002)
    public final boolean method217() {
        try {
            ++field2637;
            return this.field2755 != null && this.field2755.method1807(89);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[65] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 1011)
    public final void method205(int arg0) {
        try {
            this.method1629(120);
            ++field2716;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[115] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(FFBF)V", line = 1020)
    private final void method1615(float arg0, float arg1, byte arg2, float arg3) {
        try {
            ++field2549;
            if (arg2 != 86) {
                this.field2817 = 0.23695129F;
            }
            OpenGL.glMatrixMode(5890);
            if (this.field2858) {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glTranslatef(arg3, arg1, arg0);
            OpenGL.glMatrixMode(5888);
            this.field2858 = true;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[28] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(FFF)V", line = 1037)
    public final void method160(float arg0, float arg1, float arg2) {
        try {
            class475.field6978 = arg0;
            ++field2624;
            class191.field2535 = arg1;
            class308.field4254 = arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "(B)V", line = 1053)
    public final void method1616(byte arg0) {
        try {
            ++field2673;
            if (arg0 != 61) {
                this.method1634(true);
            }
            if (~this.field2855 != -1) {
                this.field2855 = 0;
                this.field2788 &= -32;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBIZLjaclib/memory/Buffer;)Laj;", line = 1070)
    public final class94 method1617(int arg0, byte arg1, int arg2, boolean arg3, Buffer arg4) {
        try {
            ++field2672;
            if (this.field2812 && (!arg3 || this.field2800)) {
                return new class493(this, arg2, arg4, arg0, arg3);
            } else {
                return arg1 != 51 ? null : new class304(this, arg2, arg4);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[162] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "(I)V", line = 1088)
    public final void method209(int arg0) {
        try {
            ++field2632;
            this.field2760 = 0;
            while (~arg0 < -2) {
                ++this.field2760;
                arg0 >>= 1;
            }
            this.field2758 = 1 << this.field2760;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[176] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLica;)V", line = 1105)
    public final void method1618(byte arg0, class469 arg1) {
        try {
            ++field2680;
            class469 var3 = this.field2810[this.field2799];
            int var4 = -15 % ((-42 - arg0) / 40);
            if (arg1 != var3) {
                if (arg1 != null) {
                    if (var3 == null) {
                        OpenGL.glEnable(arg1.field6861);
                    } else if (arg1.field6861 != var3.field6861) {
                        OpenGL.glDisable(var3.field6861);
                        OpenGL.glEnable(arg1.field6861);
                    }
                    OpenGL.glBindTexture(arg1.field6861, arg1.method3602((byte) -28));
                } else {
                    OpenGL.glDisable(var3.field6861);
                }
                this.field2810[this.field2799] = arg1;
            }
            this.field2788 &= -2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[173] + arg0 + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V", line = 1145)
    public final void method1619(int arg0, byte arg1) {
        try {
            if (~this.field2799 != ~arg0) {
                OpenGL.glActiveTexture(arg0 + 33984);
                this.field2799 = arg0;
            }
            ++field2627;
            if (arg1 != 125) {
                this.field2852 = 63;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[227] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(IIIIII)V", line = 1161)
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2553;
            this.method1672(8960);
            this.method1670(arg5, (byte) 101);
            float var7 = (float) (-arg0) + (float) arg2;
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
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field2913[114] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "(B)V", line = 1194)
    public final void method1620(byte arg0) {
        try {
            if (arg0 < 107) {
                this.method1675(104, (class69) null);
            }
            if (~this.field2788 != -3) {
                this.method1642(1);
                this.method1673(8, false);
                this.method1684(false, (byte) -70);
                this.method1640(false, (byte) -82);
                this.method1632(false, true);
                this.method1625(51, -2);
                this.field2788 = 2;
            }
            ++field2554;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[78] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "(I)V", line = 1215)
    public final void method1621(int arg0) {
        try {
            ++field2582;
            OpenGL.glLightfv(16384, arg0, this.field2803, 0);
            OpenGL.glLightfv(16385, 4611, this.field2851, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V", line = 1224)
    private final void method1622(byte arg0) {
        try {
            if (arg0 < -56) {
                this.field2635.method5237();
                ++field2659;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[60] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIII)V", line = 1237)
    public final void method1623(byte arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 != 7) {
                this.field2868 = null;
            }
            ++field2620;
            OpenGL.glDrawArrays(arg1, arg3, arg2);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[155] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "(I)V", line = 1250)
    private final void method1624(int arg0) {
        try {
            if (this.field2855 != 3) {
                this.field2855 = 3;
                this.method1687((byte) -5);
                this.method1689((byte) -57);
                this.field2788 &= -8;
            }
            if (arg0 != 5611) {
                this.field2813 = true;
            }
            ++field2561;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[57] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "(II)V", line = 1268)
    public final void method1625(int arg0, int arg1) {
        try {
            if (arg0 >= 49) {
                this.method1685(true, (byte) 47, arg1);
                ++field2586;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[25] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(III)V", line = 1280)
    public final synchronized void method1626(int arg0, int arg1, int arg2) {
        try {
            int var4 = 111 / ((arg0 - -1) / 60);
            ++field2709;
            class529 var5 = new class529(arg1);
            var5.field8378 = (long) arg2;
            this.field2780.method3984(var5, 0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[50] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "EA", descriptor = "(IIII)V", line = 1296)
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2616;
            if (!this.field2874) {
                throw new RuntimeException("");
            } else {
                this.field2905 = arg2;
                this.field2870 = arg0;
                this.field2835 = arg3;
                this.field2897 = arg1;
                if (this.field2872) {
                    this.field2751.field6746.method678(106);
                    this.field2751.field6746.method680(-108);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[106] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "(B)V", line = 1322)
    private final void method1627(byte arg0) {
        try {
            class686.field9610[0] = this.field2893 * this.field2853;
            if (arg0 != 123) {
                this.field2830 = -80;
            }
            class686.field9610[1] = this.field2893 * this.field2866;
            ++field2733;
            class686.field9610[2] = this.field2893 * this.field2808;
            class686.field9610[3] = 1.0F;
            OpenGL.glLightModelfv(2899, class686.field9610, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[175] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V", line = 1342)
    public final void method1628(int arg0, int arg1, int arg2) {
        try {
            ++field2564;
            if (this.field2799 == 0) {
                boolean var4 = false;
                if (this.field2894 != arg1) {
                    OpenGL.glTexEnvi(8960, 34161, arg1);
                    var4 = true;
                    this.field2894 = arg1;
                }
                if (~this.field2887 != ~arg0) {
                    OpenGL.glTexEnvi(8960, 34162, arg0);
                    this.field2887 = arg0;
                    var4 = true;
                }
                if (var4) {
                    this.field2788 &= -30;
                }
            } else {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                OpenGL.glTexEnvi(8960, 34162, arg0);
            }
            if (arg2 != 34162) {
                this.field2826 = false;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[62] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "(I)V", line = 1383)
    private final void method1629(int arg0) {
        try {
            ++field2644;
            if (arg0 < 81) {
                this.method163();
            }
            int var2 = 0;
            while (!this.field2635.method5239()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class449.method3474(20817, 1000L);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[46] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V", line = 1406)
    public final void method130(int arg0) {
        try {
            ++field2671;
            this.method1622((byte) -124);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "ZA", descriptor = "(IFFFFF)V", line = 1414)
    public final void method235(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        try {
            ++field2736;
            boolean var7 = this.field2815 != arg0;
            if (var7 || this.field2889 != arg1 || this.field2817 != arg2) {
                this.field2815 = arg0;
                this.field2889 = arg1;
                this.field2817 = arg2;
                if (var7) {
                    this.field2866 = (float) (65280 & this.field2815) / 65280.0F;
                    this.field2808 = (float) (255 & this.field2815) / 255.0F;
                    this.field2853 = (float) (this.field2815 & 16711680) / 1.671168E7F;
                    this.method1627((byte) 123);
                }
                this.method1654(78);
            }
            if (this.field2840[0] != arg3 || this.field2840[1] != arg4 || this.field2840[2] != arg5) {
                this.field2840[0] = arg3;
                this.field2840[2] = arg5;
                this.field2840[1] = arg4;
                this.field2878[2] = -arg5;
                this.field2878[1] = -arg4;
                this.field2878[0] = -arg3;
                float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
                this.field2803[0] = arg3 * var8;
                this.field2803[1] = arg4 * var8;
                this.field2803[2] = arg5 * var8;
                this.field2851[1] = -this.field2803[1];
                this.field2851[2] = -this.field2803[2];
                this.field2851[0] = -this.field2803[0];
                this.method1621(4611);
                this.field2843 = (int) (arg5 * 256.0F / arg4);
                this.field2903 = (int) (arg3 * 256.0F / arg4);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2913[143] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "XA", descriptor = "()I", line = 1467)
    public final int method187() {
        try {
            ++field2696;
            return this.field2852;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[32] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BII)V", line = 1475)
    public final synchronized void method1630(byte arg0, int arg1, int arg2) {
        try {
            ++field2591;
            if (arg0 != -5) {
                this.field2858 = true;
            }
            class529 var4 = new class529(arg1);
            var4.field8378 = (long) arg2;
            this.field2782.method3984(var4, arg0 ^ -5);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[30] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "(II)V", line = 1489)
    public final void method1631(int arg0, int arg1) {
        try {
            if (arg1 == 7681) {
                ++field2711;
                if (~arg0 != -2) {
                    if (arg0 != 0) {
                        if (arg0 != 2) {
                            if (~arg0 == -4) {
                                this.method1628(8448, 260, 34162);
                                return;
                            }
                            if (arg0 == 4) {
                                this.method1628(34023, 34023, 34162);
                                return;
                            }
                        } else {
                            this.method1628(7681, 34165, arg1 + 26481);
                        }
                    } else {
                        this.method1628(8448, 8448, 34162);
                    }
                } else {
                    this.method1628(7681, 7681, 34162);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[150] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)V", line = 1519)
    public final void method1632(boolean arg0, boolean arg1) {
        try {
            if (!arg1) {
                this.field2820 = null;
            }
            ++field2685;
            if (this.field2790 != arg0) {
                this.field2790 = arg0;
                this.method1657(0);
                this.field2788 &= -32;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[189] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "(Z)V", line = 1538)
    public final void method119(boolean arg0) {
        try {
            this.field2813 = arg0;
            ++field2543;
            this.method1657(0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[80] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IZ)V", line = 1549)
    public final void method1633(int arg0, boolean arg1) {
        try {
            if (arg0 != 262144) {
                method1668(67);
            }
            if (!this.field2826 == arg1) {
                this.field2826 = arg1;
                this.method1660(-104);
            }
            ++field2596;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[151] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)V", line = 1565)
    private final void method1634(boolean arg0) {
        try {
            this.field2891[10] = this.field2836;
            ++field2697;
            if (arg0) {
                this.field2891[14] = this.field2839;
                this.field2863 = (this.field2891[14] - (float) this.field2852) / this.field2891[10];
                this.field2834 = (float) this.field2852;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[33] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(ILaq;)V", line = 1584)
    public final void method1635(int arg0, class69 arg1) {
        try {
            ++field2668;
            if (this.field2847) {
                this.method1646(arg1, true);
                this.method1663(true, arg1);
            } else {
                if (~this.field2771 > -1 || this.field2767[this.field2771] != arg1) {
                    throw new RuntimeException();
                }
                this.field2767[this.field2771--] = null;
                arg1.method713(-21);
                if (this.field2771 >= 0) {
                    this.field2772 = this.field2770 = this.field2767[this.field2771];
                    this.field2772.method717((byte) 95);
                } else {
                    this.field2772 = this.field2770 = null;
                }
            }
            if (arg0 < 109) {
                this.method1675(-98, (class69) null);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[192] + arg0 + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1619)
    public final void method220(Canvas arg0) {
        try {
            ++field2600;
            if (this.field2548 == arg0) {
                throw new RuntimeException();
            } else if (this.field2666.containsKey(arg0)) {
                Long var2 = (Long) this.field2666.get(arg0);
                this.field2635.releaseSurface(arg0, var2);
                this.field2666.remove(arg0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[193] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 1639)
    public final void method203(int arg0) {
        try {
            ++field2602;
            if (~arg0 != -2) {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[204] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "()Z", line = 1650)
    public final boolean method125() {
        try {
            ++field2573;
            return this.field2751.method3555(3, 12712);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[116] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "(I)V", line = 1658)
    public final void method1636(int arg0) {
        try {
            if (this.field2788 != 8) {
                this.method1609(4650);
                this.method1673(8, true);
                this.method1640(true, (byte) -37);
                this.method1632(true, true);
                this.method1670(1, (byte) 115);
                this.field2788 = 8;
            }
            if (arg0 != 1) {
                this.field2898 = null;
            }
            ++field2639;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[207] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IB)I", line = 1678)
    public final int method1637(int arg0, byte arg1) {
        try {
            ++field2640;
            if (arg0 == 1) {
                return 7681;
            } else if (arg0 == 0) {
                return 8448;
            } else if (~arg0 == -3) {
                return 34165;
            } else if (~arg0 == -4) {
                return 260;
            } else if (arg0 == 4) {
                return 34023;
            } else {
                if (arg1 < 122) {
                    this.method120(-102, -7);
                }
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[185] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "(IIIIIII)I", line = 1711)
    public final int method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field2592;
            float var8 = (float) arg2 * this.field2786.field1001 + (float) arg0 * this.field2786.field1000 + (float) arg1 * this.field2786.field1032 + this.field2786.field995;
            float var9 = (float) arg5 * this.field2786.field1001 + (float) arg3 * this.field2786.field1000 + (float) arg4 * this.field2786.field1032 + this.field2786.field995;
            int var10 = 0;
            if (var8 < (float) this.field2816 && (float) this.field2816 > var9) {
                var10 |= 16;
            } else if ((float) this.field2852 < var8 && (float) this.field2852 < var9) {
                var10 |= 32;
            }
            int var11 = (int) (((float) arg2 * this.field2786.field1030 + (float) arg0 * this.field2786.field1010 + (float) arg1 * this.field2786.field1005 + this.field2786.field996) * (float) this.field2796 / (float) arg6);
            int var12 = (int) (((float) arg5 * this.field2786.field1030 + (float) arg3 * this.field2786.field1010 + (float) arg4 * this.field2786.field1005 + this.field2786.field996) * (float) this.field2796 / (float) arg6);
            if ((float) var11 < this.field2804 && (float) var12 < this.field2804) {
                var10 |= 1;
            } else if (this.field2854 < (float) var11 && (float) var12 > this.field2854) {
                var10 |= 2;
            }
            int var13 = (int) (((float) arg2 * this.field2786.field1002 + (float) arg0 * this.field2786.field1018 + (float) arg1 * this.field2786.field1027 + this.field2786.field1028) * (float) this.field2886 / (float) arg6);
            int var14 = (int) (((float) arg5 * this.field2786.field1002 + (float) arg3 * this.field2786.field1018 + (float) arg4 * this.field2786.field1027 + this.field2786.field1028) * (float) this.field2886 / (float) arg6);
            if (this.field2865 > (float) var13 && this.field2865 > (float) var14) {
                var10 |= 4;
            } else if (this.field2864 < (float) var13 && (float) var14 > this.field2864) {
                var10 |= 8;
            }
            return var10;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field2913[97] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V", line = 1754)
    public final void method1638(boolean arg0, int arg1) {
        try {
            class686.field9610[3] = (float) (arg1 >>> 24) / 255.0F;
            if (!arg0) {
                class686.field9610[1] = (float) class434.method3377(65280, arg1) / 65280.0F;
                ++field2726;
                class686.field9610[2] = (float) class434.method3377(255, arg1) / 255.0F;
                class686.field9610[0] = (float) class434.method3377(arg1, 16711680) / 1.671168E7F;
                OpenGL.glTexEnvfv(8960, 8705, class686.field9610, 0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[23] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "(I)V", line = 1769)
    public final void method1639(int arg0) {
        try {
            ++field2723;
            if (arg0 != 0) {
                this.field2824 = -111;
            }
            OpenGL.glPushMatrix();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[210] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(ZB)V", line = 1782)
    public final void method1640(boolean arg0, byte arg1) {
        try {
            if (!arg0 == this.field2789) {
                if (arg0) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
                this.field2789 = arg0;
                this.field2788 &= -32;
            }
            ++field2619;
            int var3 = -75 % ((29 - arg1) / 57);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[99] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "(B)V", line = 1802)
    private final void method1641(byte arg0) {
        try {
            if (this.field2744 != null) {
                Dimension var2 = this.field2744.getSize();
                this.field2710 = var2.height;
                this.field2662 = var2.width;
            } else {
                this.field2662 = this.field2710 = 0;
            }
            ++field2556;
            if (arg0 > -48) {
                this.method226(91, 119);
            }
            if (this.field2770 == null) {
                this.field2737 = this.field2662;
                this.field2746 = this.field2710;
                this.method1614((byte) 20);
            }
            this.method1616((byte) 61);
            this.method240();
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[191] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "(I)V", line = 1833)
    private final void method1642(int arg0) {
        try {
            if (this.field2855 != arg0) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (~this.field2737 < -1 && ~this.field2746 < -1) {
                    OpenGL.glOrtho(0.0D, (double) this.field2737, (double) this.field2746, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field2788 &= -25;
                this.field2855 = 1;
            }
            ++field2676;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[37] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "()V", line = 1855)
    public final void method163() {
        try {
            ++field2649;
            if (this.field2755 != null && this.field2755.method1807(102)) {
                this.field2752.method4197(94, this.field2755);
                this.field2748.method5422((byte) -99);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[35] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "()Z", line = 1870)
    public final boolean method216() {
        try {
            ++field2541;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[158] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 1878)
    public class194(Canvas arg0, class673 arg1, int arg2) {
        super(arg1);
        new class514();
        new class477(16);
        this.field2777 = new class524();
        this.field2779 = new class524();
        this.field2780 = new class524();
        this.field2781 = new class524();
        this.field2782 = new class524();
        this.field2783 = new class524();
        this.field2784 = new class524();
        this.field2786 = new class70();
        this.field2794 = new class70();
        this.field2795 = new class70();
        this.field2797 = -1.0F;
        this.field2796 = 512;
        this.field2803 = new float[4];
        this.field2813 = true;
        this.field2817 = -1.0F;
        this.field2834 = 3584.0F;
        this.field2866 = 1.0F;
        this.field2815 = -1;
        this.field2863 = 3584.0F;
        this.field2821 = 0;
        this.field2849 = -1.0F;
        this.field2832 = 0.0F;
        this.field2848 = 0;
        this.field2827 = -1;
        this.field2878 = new float[4];
        this.field2809 = 0;
        this.field2853 = 1.0F;
        this.field2881 = 0;
        this.field2844 = 1.0F;
        this.field2808 = 1.0F;
        this.field2872 = false;
        this.field2894 = 8448;
        this.field2823 = 0;
        this.field2811 = 0;
        this.field2825 = 0;
        this.field2891 = new float[16];
        this.field2840 = new float[4];
        this.field2889 = -1.0F;
        this.field2816 = 50;
        this.field2886 = 512;
        this.field2887 = 8448;
        this.field2869 = 0;
        this.field2828 = -1;
        this.field2835 = 0;
        this.field2880 = 1.0F;
        this.field2905 = -1;
        this.field2857 = 0;
        this.field2900 = new class330[class60.field927];
        this.field2851 = new float[4];
        this.field2897 = -1;
        this.field2852 = 3584;
        this.field2890 = new class318(8192);
        this.field2907 = new int[1];
        this.field2909 = new int[1];
        this.field2908 = new int[1];
        this.field2912 = new byte[16384];
        try {
            this.field2749 = arg2;
            this.field2744 = this.field2548 = arg0;
            if (!class743.method5382(field2913[217], true)) {
                throw new RuntimeException("");
            } else if (!class743.method5382(field2913[219], true)) {
                throw new RuntimeException("");
            } else {
                try {
                    this.field2635 = new OpenGL();
                    this.field2568 = this.field2657 = this.field2635.init(arg0, 8, 8, 8, 24, 0, this.field2749);
                    if (this.field2657 == 0L) {
                        throw new RuntimeException("");
                    } else {
                        this.method1629(95);
                        int var4 = this.method1608((byte) 10);
                        if (var4 != 0) {
                            throw new RuntimeException("");
                        } else {
                            this.field2824 = !this.field2842 ? 5121 : 33639;
                            if (~this.field2904.indexOf(field2913[216]) != 0) {
                                int var5 = 0;
                                boolean var6 = false;
                                boolean var7 = false;
                                String[] var8 = class793.method5716(' ', this.field2904.replace('/', ' '), -85);
                                for (int var9 = 0; var9 < var8.length; ++var9) {
                                    String var10 = var8[var9];
                                    try {
                                        if (~var10.length() < -1) {
                                            if (~var10.charAt(0) == -121 && ~var10.length() <= -4 && class756.method5486(0, var10.substring(1, 3))) {
                                                var10 = var10.substring(1);
                                                var7 = true;
                                            }
                                            if (var10.equals(field2913[222])) {
                                                var6 = true;
                                            } else {
                                                if (var10.startsWith(field2913[222])) {
                                                    var10 = var10.substring(2);
                                                    var6 = true;
                                                }
                                                if (var10.length() >= 4 && class756.method5486(0, var10.substring(0, 4))) {
                                                    var5 = class425.method3299(var10.substring(0, 4), (byte) 110);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var15) {
                                    }
                                }
                                if (!var7 && !var6) {
                                    if (~var5 <= -7001 && ~var5 >= -8000) {
                                        this.field2812 = false;
                                    }
                                    if (var5 >= 7000 && var5 <= 9250) {
                                        this.field2901 = false;
                                    }
                                }
                                if (!var6 || var5 < 4000) {
                                    this.field2802 = false;
                                }
                                this.field2884 &= this.field2635.method5238(field2913[221]);
                                this.field2861 = true;
                                this.field2800 = this.field2812;
                            }
                            if (~this.field2883.indexOf(field2913[72]) != 0) {
                                this.field2806 = false;
                            }
                            this.field2882 = !this.field2883.equals(field2913[218]);
                            if (this.field2812) {
                                try {
                                    int[] var11 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var11, 0);
                                } catch (Throwable var14) {
                                    throw new RuntimeException("");
                                }
                            }
                            class445.method3458(true, (byte) 71, false);
                            this.field2764 = true;
                            this.field2748 = new class749(this, super.field237);
                            this.method1688(false);
                            this.field2759 = new class209(this);
                            this.field2752 = new class561(this);
                            if (this.field2752.method4202(true)) {
                                this.field2755 = new class504(this);
                                if (!this.field2755.method3853(-13)) {
                                    this.field2755.method1803(false);
                                    this.field2755 = null;
                                }
                            }
                            this.field2751 = new class463(this);
                            this.method1680(0);
                            this.method1641((byte) -109);
                            this.method238();
                        }
                    }
                } catch (Throwable var16) {
                    var16.printStackTrace();
                    this.method167();
                    throw new RuntimeException("");
                }
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field2913[220] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2030)
    public final class751 method206(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        try {
            ++field2661;
            return new class622(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2913[157] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2913[2] : field2913[1]) + ',' + (arg3 != null ? field2913[2] : field2913[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "KA", descriptor = "(IIII)V", line = 2038)
    public final void method208(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (~arg0 > -1) {
                arg0 = 0;
            }
            ++field2641;
            if (arg1 < 0) {
                arg1 = 0;
            }
            if (~arg3 < ~this.field2746) {
                arg3 = this.field2746;
            }
            if (~this.field2737 > ~arg2) {
                arg2 = this.field2737;
            }
            this.field2881 = arg3;
            this.field2809 = arg1;
            this.field2857 = arg2;
            this.field2823 = arg0;
            OpenGL.glEnable(3089);
            this.method1671(11405);
            this.method1667((byte) 72);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[54] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "(I)V", line = 2069)
    private final void method1643(int arg0) {
        try {
            ++field2732;
            if (this.field2875 && ~this.field2828 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
            if (arg0 != -1) {
                this.method155((class369) null, (class369) null, -0.6633902F, (class369) null);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[100] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "()I", line = 2088)
    public final int method195() {
        try {
            ++field2717;
            return this.field2816;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[56] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lgj;B)V", line = 2096)
    public final void method1644(class70 arg0, byte arg1) {
        try {
            OpenGL.glLoadMatrixf(arg0.method727(2), 0);
            if (arg1 <= 112) {
                this.method231((class66) null, true);
            }
            ++field2700;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[164] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[Lta;)V", line = 2107)
    public final void method189(int arg0, class330[] arg1) {
        try {
            for (int var3 = 0; arg0 > var3; ++var3) {
                this.field2900[var3] = arg1[var3];
            }
            ++field2590;
            this.field2830 = arg0;
            if (~this.field2855 != -2) {
                this.method1648(-20420);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[68] + arg0 + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[I[I)Laa;", line = 2131)
    public final class685 method236(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            ++field2724;
            return class475.method3673(arg0, arg1, arg2, arg3, this, (byte) -96);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[67] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2913[2] : field2913[1]) + ',' + (arg3 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "()I", line = 2140)
    public final int method198() {
        try {
            ++field2655;
            return 4;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[90] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(II)V", line = 2152)
    public final synchronized void method1645(int arg0, int arg1) {
        try {
            ++field2693;
            class529 var3 = new class529(arg0);
            this.field2781.method3984(var3, arg1 ^ arg1);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[43] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Laq;Z)V", line = 2162)
    public final void method1646(class69 arg0, boolean arg1) {
        try {
            ++field2628;
            if (~this.field2769 <= -1 && this.field2768[this.field2769] == arg0) {
                this.field2768[this.field2769--] = null;
                if (!arg1) {
                    this.method1613((byte) 47, (class69) null);
                }
                arg0.method714((byte) -81);
                if (this.field2769 < 0) {
                    this.field2772 = null;
                } else {
                    this.field2772 = this.field2768[this.field2769];
                    this.field2772.method712(-8119);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[144] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)V", line = 2187)
    public final void method132(int arg0, int arg1) throws class142 {
        try {
            ++field2719;
            try {
                this.field2635.swapBuffers();
            } catch (Exception var4) {
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[148] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILbda;II)V", line = 2204)
    public final void method1647(int arg0, int arg1, class181 arg2, int arg3, int arg4) {
        try {
            ++field2741;
            int var6 = arg2.method1508(25946);
            int var9 = arg0 * this.method1665(19175, var6);
            this.method1658(arg2, 1);
            if (arg3 >= -49) {
                this.field2811 = 51;
            }
            OpenGL.glDrawElements(arg4, arg1, var6, (long) var9 + arg2.method1506((byte) -64));
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2913[83] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2913[2] : field2913[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "(I)V", line = 2221)
    private final void method1648(int arg0) {
        try {
            if (arg0 != -20420) {
                this.field2887 = 106;
            }
            ++field2727;
            int var2;
            for (var2 = 0; ~var2 > ~this.field2830; ++var2) {
                class330 var3 = this.field2900[var2];
                int var4 = var2 + 16386;
                class435.field6329[0] = (float) var3.method2595((byte) 92);
                class435.field6329[1] = (float) var3.method2590((byte) 100);
                class435.field6329[2] = (float) var3.method2592(true);
                class435.field6329[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class435.field6329, 0);
                int var5 = var3.method2591(arg0 + 31482);
                float var6 = var3.method2597(2) / 255.0F;
                class435.field6329[0] = var6 * (float) (class434.method3377(var5, 16765488) >> 16);
                class435.field6329[1] = (float) (class434.method3377(65476, var5) >> 8) * var6;
                class435.field6329[2] = var6 * (float) class434.method3377(255, var5);
                OpenGL.glLightfv(var4, 4609, class435.field6329, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2594((byte) 21) * var3.method2594((byte) 21)));
                OpenGL.glEnable(var4);
            }
            while (~var2 > ~this.field2879) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field2879 = this.field2830;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2913[47] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V", line = 2267)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2631;
            float var7 = (float) arg0 + 0.35F;
            float var8 = (float) arg1 + 0.35F;
            float var9 = (float) arg2 + var7 - 1.0F;
            this.method1672(8960);
            float var10 = (float) arg3 + var8 + -1.0F;
            this.method1670(arg5, (byte) 123);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            if (this.field2818) {
                OpenGL.glDisable(32925);
            }
            OpenGL.glBegin(2);
            OpenGL.glVertex2f(var7, var8);
            OpenGL.glVertex2f(var7, var10);
            OpenGL.glVertex2f(var9, var10);
            OpenGL.glVertex2f(var9, var8);
            OpenGL.glEnd();
            if (this.field2818) {
                OpenGL.glEnable(32925);
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field2913[224] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "ra", descriptor = "(IIII)V", line = 2301)
    public final void method150(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2835 = arg3;
            ++field2722;
            this.field2870 = arg0;
            this.field2897 = arg1;
            this.field2905 = arg2;
            this.field2874 = true;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[226] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()Z", line = 2320)
    public final boolean method166() {
        try {
            ++field2643;
            return this.field2755 != null && (~this.field2749 >= -2 || this.field2876);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[180] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "ya", descriptor = "()V", line = 2328)
    public final void method225() {
        try {
            ++field2574;
            this.method1632(true, true);
            OpenGL.glClear(256);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[101] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 2339)
    public final void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            this.method1672(8960);
            ++field2694;
            this.method1670(arg12, (byte) 125);
            OpenGL.glBegin(4);
            OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
            OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
            OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
            OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
            OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
            OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
            OpenGL.glEnd();
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field2913[223] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "()V", line = 2361)
    public final void method234() {
        try {
            ++field2599;
            if (this.field2806) {
                if (this.field2770 != this.field2765) {
                    throw new RuntimeException();
                }
                this.field2765.method3926(0, (byte) 78);
                this.field2765.method3926(8, (byte) 78);
                this.method1635(118, this.field2765);
            } else {
                if (!this.field2805) {
                    throw new RuntimeException("");
                }
                this.field2774.method873(0, 0, this.field2737, this.field2746, 0, 0);
                this.field2635.setSurface(this.field2568);
            }
            this.field2746 = this.field2710;
            this.field2737 = this.field2662;
            this.field2774 = null;
            this.method1616((byte) 61);
            this.method1614((byte) 20);
            this.method240();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[14] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBZ[B)Laj;", line = 2393)
    public final class94 method1649(int arg0, int arg1, byte arg2, boolean arg3, byte[] arg4) {
        try {
            if (arg2 != 67) {
                return null;
            } else {
                ++field2720;
                return (class94) (!this.field2812 || arg3 && !this.field2800 ? new class304(this, arg0, arg4, arg1) : new class493(this, arg0, arg4, arg1, arg3));
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[186] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()Z", line = 2409)
    public final boolean method164() {
        try {
            ++field2629;
            if (this.field2755 != null) {
                if (!this.field2755.method1807(108)) {
                    if (!this.field2752.method4200(this.field2755, -1)) {
                        return false;
                    }
                    this.field2748.method5422((byte) -108);
                }
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[212] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBII)V", line = 2435)
    public final void method1650(int arg0, byte arg1, int arg2, int arg3) {
        try {
            ++field2715;
            OpenGL.glTexEnvi(8960, arg0 + 34184, arg3);
            if (arg1 == -109) {
                OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[137] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(B)Lgfa;", line = 2447)
    public final class112 method1651(byte arg0) {
        try {
            ++field2593;
            if (arg0 != -118) {
                this.method181();
            }
            return this.field2831 == null ? null : this.field2831.method491((byte) -108);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[159] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IF)V", line = 2460)
    public final void method1652(int arg0, float arg1) {
        try {
            if (arg0 != -4) {
                this.field2878 = null;
            }
            if (this.field2844 != arg1) {
                this.field2844 = arg1;
                if (~this.field2855 == -4) {
                    this.method1687((byte) -5);
                }
            }
            ++field2656;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[55] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "aa", descriptor = "(IIIIII)V", line = 2480)
    public final void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2669;
            float var7 = (float) arg0 + 0.35F;
            float var8 = (float) arg1 + 0.35F;
            float var9 = (float) arg2 + var7;
            this.method1672(8960);
            float var10 = (float) arg3 + var8;
            this.method1670(arg5, (byte) 105);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            if (this.field2818) {
                OpenGL.glDisable(32925);
            }
            OpenGL.glBegin(7);
            OpenGL.glVertex2f(var7, var8);
            OpenGL.glVertex2f(var7, var10);
            OpenGL.glVertex2f(var9, var10);
            OpenGL.glVertex2f(var9, var8);
            OpenGL.glEnd();
            if (this.field2818) {
                OpenGL.glEnable(32925);
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field2913[149] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILso;Lso;Lso;Lso;)V", line = 2514)
    public final void method1653(int arg0, class316 arg1, class316 arg2, class316 arg3, class316 arg4) {
        try {
            if (arg4 == null) {
                OpenGL.glDisableClientState(32884);
            } else {
                this.method1676(arg4.field4326, 768);
                OpenGL.glVertexPointer(arg4.field4328, arg4.field4324, this.field2859.method945(true), this.field2859.method942((byte) 127) + (long) arg4.field4331);
                OpenGL.glEnableClientState(32884);
            }
            ++field2610;
            if (arg3 == null) {
                OpenGL.glDisableClientState(32885);
            } else {
                this.method1676(arg3.field4326, 768);
                OpenGL.glNormalPointer(arg3.field4324, this.field2859.method945(true), this.field2859.method942((byte) -30) + (long) arg3.field4331);
                OpenGL.glEnableClientState(32885);
            }
            if (arg0 != -3461) {
                this.method1631(120, -114);
            }
            if (arg1 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method1676(arg1.field4326, 768);
                OpenGL.glColorPointer(arg1.field4328, arg1.field4324, this.field2859.method945(true), this.field2859.method942((byte) -84) + (long) arg1.field4331);
                OpenGL.glEnableClientState(32886);
            }
            if (arg2 != null) {
                this.method1676(arg2.field4326, 768);
                OpenGL.glTexCoordPointer(arg2.field4328, arg2.field4324, this.field2859.method945(true), this.field2859.method942((byte) 123) + (long) arg2.field4331);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[61] + arg0 + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ',' + (arg2 != null ? field2913[2] : field2913[1]) + ',' + (arg3 != null ? field2913[2] : field2913[1]) + ',' + (arg4 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lbha;Lkb;)Ltha;", line = 2560)
    public final class296 method134(class545 arg0, class102 arg1) {
        try {
            ++field2754;
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[41] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ltha;)V", line = 2568)
    public final void method165(class296 arg0) {
        try {
            ++field2621;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[93] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "(I)V", line = 2576)
    private final void method1654(int arg0) {
        try {
            class686.field9610[0] = this.field2889 * this.field2853;
            class686.field9610[2] = this.field2889 * this.field2808;
            class686.field9610[3] = 1.0F;
            ++field2601;
            class686.field9610[1] = this.field2889 * this.field2866;
            OpenGL.glLightfv(16384, 4609, class686.field9610, 0);
            class686.field9610[3] = 1.0F;
            class686.field9610[0] = -this.field2817 * this.field2853;
            class686.field9610[2] = -this.field2817 * this.field2808;
            class686.field9610[1] = -this.field2817 * this.field2866;
            if (arg0 < 50) {
                this.method160(0.3839282F, 1.0157528F, -0.66821474F);
            }
            OpenGL.glLightfv(16385, 4609, class686.field9610, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[139] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "()Lqa;", line = 2601)
    public final class104 method136() {
        try {
            ++field2728;
            return this.field2756;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[17] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(III)V", line = 2618)
    public final void method1655(int arg0, int arg1, int arg2) {
        try {
            this.field2821 = arg2;
            ++field2608;
            this.field2825 = arg1;
            this.method1614((byte) 20);
            this.method1667((byte) 72);
            if (arg0 != 0) {
                this.field2845 = 0.7367108F;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "xa", descriptor = "(F)V", line = 2634)
    public final void method127(float arg0) {
        try {
            if (this.field2893 != arg0) {
                this.field2893 = arg0;
                this.method1627((byte) 123);
            }
            ++field2611;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[110] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2651)
    public final void method168(Canvas arg0, int arg1, int arg2) {
        try {
            ++field2704;
            long var4 = 0L;
            if (arg0 != null && this.field2548 != arg0) {
                if (this.field2666.containsKey(arg0)) {
                    Long var6 = (Long) this.field2666.get(arg0);
                    var4 = var6;
                }
            } else {
                var4 = this.field2657;
            }
            if (~var4 == -1L) {
                throw new RuntimeException();
            } else {
                this.field2635.surfaceResized(var4);
                if (this.field2744 == arg0) {
                    this.method1641((byte) -73);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2913[81] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2682)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8) {
        try {
            ++field2562;
            class581 var10 = (class581) arg6;
            class268 var11 = var10.field8395;
            this.method1620((byte) 112);
            this.method1618((byte) -85, var10.field8395);
            this.method1670(arg5, (byte) 116);
            this.method1628(8448, 7681, 34162);
            this.method1669(768, 0, 34167, (byte) -116);
            float var12 = var11.field3802 / (float) var11.field3804;
            float var13 = var11.field3803 / (float) var11.field3799;
            float var14 = (float) (-arg0) + (float) arg2;
            float var15 = (float) (-arg1) + (float) arg3;
            float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
            float var17 = var15 * var16;
            float var18 = var14 * var16;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            OpenGL.glBegin(1);
            OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
            OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
            OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
            OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
            OpenGL.glEnd();
            this.method1669(768, 0, 5890, (byte) -121);
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field2913[58] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2913[2] : field2913[1]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "(III)V", line = 2720)
    public final void method232(int arg0, int arg1, int arg2) {
        try {
            if (~this.field2827 != ~arg0 || this.field2828 != arg1 || this.field2869 != arg2) {
                this.field2828 = arg1;
                this.field2869 = arg2;
                this.field2827 = arg0;
                this.method1666(-107);
                this.method1643(-1);
            }
            ++field2734;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[190] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "(IIIII)V", line = 2739)
    public final void method124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2638;
            this.method1672(8960);
            this.method1670(arg4, (byte) 109);
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var6, var7);
            OpenGL.glVertex2f(var6, (float) arg2 + var7);
            OpenGL.glEnd();
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2913[89] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIZ)Ltb;", line = 2763)
    public final class392 method196(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            ++field2589;
            return new class162(this, arg0, arg1, arg2, arg3);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[156] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V", line = 2772)
    public final void method1656(byte arg0) {
        try {
            if (arg0 < 28) {
                this.method1607(-27, -113L);
            }
            OpenGL.glPopMatrix();
            ++field2577;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[45] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "()Lcba;", line = 2784)
    public final class254 method210() {
        try {
            ++field2660;
            int var1 = -1;
            if (~this.field2883.indexOf(field2913[73]) != 0) {
                var1 = 4318;
            } else if (this.field2883.indexOf(field2913[72]) != -1) {
                var1 = 32902;
            } else if (~this.field2883.indexOf(field2913[74]) != 0) {
                var1 = 4098;
            }
            return new class254(var1, field2913[71], this.field2867, this.field2904, 0L);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[75] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([I)V", line = 2806)
    public final void method170(int[] arg0) {
        try {
            arg0[0] = this.field2737;
            ++field2729;
            arg0[1] = this.field2746;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[8] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "()I", line = 2815)
    public final int method184() {
        try {
            ++field2572;
            int var1 = this.field2911;
            this.field2911 = 0;
            return var1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[59] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "(I)V", line = 2829)
    private final void method1657(int arg0) {
        try {
            OpenGL.glDepthMask(this.field2790 && this.field2813);
            if (arg0 != 0) {
                this.method207((class348) null);
            }
            ++field2667;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[167] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "GA", descriptor = "(I)V", line = 2841)
    public final void method243(int arg0) {
        try {
            this.method1670(0, (byte) 102);
            ++field2570;
            OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
            OpenGL.glClear(16384);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[215] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lbda;I)V", line = 2860)
    public final void method1658(class181 arg0, int arg1) {
        try {
            ++field2563;
            if (arg1 != 1) {
                this.field2854 = -0.8482864F;
            }
            if (this.field2856 != arg0) {
                if (this.field2812) {
                    OpenGL.glBindBufferARB(34963, arg0.method1505(11874));
                }
                this.field2856 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[4] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "()Z", line = 2880)
    public final boolean method181() {
        try {
            ++field2581;
            return this.field2818 && (!this.method217() || this.field2876);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[52] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIII)V", line = 2890)
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field2560;
            if (arg0 != arg2 || arg1 != arg3) {
                this.method1672(8960);
                this.method1670(arg5, (byte) 110);
                float var10 = (float) arg2 - (float) arg0;
                float var11 = (float) arg3 - (float) arg1;
                float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
                float var13 = var10 * var12;
                OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
                int var27 = arg8 % (arg6 + arg7);
                float var14 = var11 * var12;
                float var15 = (float) arg6 * var13;
                float var16 = (float) arg6 * var14;
                float var17 = 0.0F;
                float var18 = 0.0F;
                float var19 = var15;
                float var20 = var16;
                if (~var27 < ~arg6) {
                    var18 = (float) (-var27 + arg7 + arg6) * var14;
                    var17 = (float) (arg6 + arg7 + -var27) * var13;
                } else {
                    var20 = (float) (-var27 + arg6) * var14;
                    var19 = (float) (arg6 - var27) * var13;
                }
                float var21 = (float) arg0 + 0.35F + var17;
                float var22 = (float) arg1 + 0.35F + var18;
                float var23 = (float) arg7 * var13;
                float var24 = (float) arg7 * var14;
                while (true) {
                    if (arg0 >= arg2) {
                        if (var21 < (float) arg2 + 0.35F) {
                            break;
                        }
                        if (var19 + var21 < (float) arg2) {
                            var19 = (float) arg2 - var21;
                        }
                    } else {
                        if (var21 > (float) arg2 + 0.35F) {
                            break;
                        }
                        if ((float) arg2 < var19 + var21) {
                            var19 = (float) arg2 - var21;
                        }
                    }
                    if (arg3 > arg1) {
                        if ((float) arg3 + 0.35F < var22) {
                            break;
                        }
                        if ((float) arg3 < var20 + var22) {
                            var20 = (float) arg3 - var22;
                        }
                    } else {
                        if ((float) arg3 + 0.35F > var22) {
                            break;
                        }
                        if ((float) arg3 > var20 + var22) {
                            var20 = (float) arg3 - var22;
                        }
                    }
                    OpenGL.glBegin(1);
                    OpenGL.glVertex2f(var21, var22);
                    OpenGL.glVertex2f(var19 + var21, var20 + var22);
                    var21 += var19 + var23;
                    var22 += var20 + var24;
                    OpenGL.glEnd();
                    var20 = var16;
                    var19 = var15;
                }
            }
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field2913[165] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lcd;[Lcu;Z)Lda;", line = 3001)
    public final class216 method145(class161 arg0, class66[] arg1, boolean arg2) {
        try {
            ++field2567;
            return new class629(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[85] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "la", descriptor = "()V", line = 3009)
    public final void method240() {
        try {
            this.field2857 = this.field2737;
            this.field2881 = this.field2746;
            this.field2809 = 0;
            this.field2823 = 0;
            ++field2646;
            OpenGL.glDisable(3089);
            this.method1671(11405);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[225] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZFFFF)V", line = 3025)
    public final void method1659(boolean arg0, float arg1, float arg2, float arg3, float arg4) {
        try {
            if (arg0) {
                this.method1660(-40);
            }
            class686.field9610[0] = arg3;
            class686.field9610[1] = arg1;
            ++field2645;
            class686.field9610[3] = arg2;
            class686.field9610[2] = arg4;
            OpenGL.glTexEnvfv(8960, 8705, class686.field9610, 0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[84] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lza;)V", line = 3040)
    public final void method207(class348 arg0) {
        try {
            this.field2761 = ((class775) arg0).field11054;
            ++field2618;
            if (this.field2898 == null) {
                class318 var2 = new class318(80);
                if (!this.field2842) {
                    var2.method2527(160744152, -1.0F);
                    var2.method2527(160744152, -1.0F);
                    var2.method2527(160744152, 0.0F);
                    var2.method2527(160744152, 0.0F);
                    var2.method2527(160744152, 1.0F);
                    var2.method2527(160744152, 1.0F);
                    var2.method2527(160744152, -1.0F);
                    var2.method2527(160744152, 0.0F);
                    var2.method2527(160744152, 1.0F);
                    var2.method2527(160744152, 1.0F);
                    var2.method2527(160744152, 1.0F);
                    var2.method2527(160744152, 1.0F);
                    var2.method2527(160744152, 0.0F);
                    var2.method2527(160744152, 1.0F);
                    var2.method2527(160744152, 0.0F);
                    var2.method2527(160744152, -1.0F);
                    var2.method2527(160744152, 1.0F);
                    var2.method2527(160744152, 0.0F);
                    var2.method2527(160744152, 0.0F);
                    var2.method2527(160744152, 0.0F);
                } else {
                    var2.method2524(-1.0F, true);
                    var2.method2524(-1.0F, true);
                    var2.method2524(0.0F, true);
                    var2.method2524(0.0F, true);
                    var2.method2524(1.0F, true);
                    var2.method2524(1.0F, true);
                    var2.method2524(-1.0F, true);
                    var2.method2524(0.0F, true);
                    var2.method2524(1.0F, true);
                    var2.method2524(1.0F, true);
                    var2.method2524(1.0F, true);
                    var2.method2524(1.0F, true);
                    var2.method2524(0.0F, true);
                    var2.method2524(1.0F, true);
                    var2.method2524(0.0F, true);
                    var2.method2524(-1.0F, true);
                    var2.method2524(1.0F, true);
                    var2.method2524(0.0F, true);
                    var2.method2524(0.0F, true);
                    var2.method2524(0.0F, true);
                }
                this.field2898 = this.method1649(20, var2.field9945, (byte) 67, false, var2.field9996);
                this.field2822 = new class316(this.field2898, 5126, 3, 0);
                this.field2819 = new class316(this.field2898, 5126, 2, 12);
                this.field2750.method4160(this, 0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[147] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 3108)
    public final void method218(int arg0) {
        try {
            ++field2559;
            if (~arg0 <= -129 && ~arg0 >= -1025) {
                this.field2747 = arg0;
                this.field2748.method5422((byte) -108);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[48] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "(I)V", line = 3121)
    private final void method1660(int arg0) {
        try {
            if (this.field2807 && !this.field2826) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            if (arg0 <= -83) {
                ++field2692;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "DA", descriptor = "(IIII)V", line = 3136)
    public final void method233(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2811 = arg1;
            ++field2684;
            this.field2886 = arg3;
            this.field2848 = arg0;
            this.field2796 = arg2;
            this.method1679(49);
            this.method1671(11405);
            if (~this.field2855 == -4) {
                this.method1687((byte) -5);
            } else if (this.field2855 == 2) {
                this.method1683(-105);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[153] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "za", descriptor = "(IIIII)V", line = 3163)
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2699;
            if (arg2 < 0) {
                arg2 = -arg2;
            }
            if (this.field2823 <= arg0 + arg2 && ~(-arg2 + arg0) >= ~this.field2857 && this.field2809 <= arg1 + arg2 && ~(-arg2 + arg1) >= ~this.field2881) {
                this.method1672(8960);
                this.method1670(arg4, (byte) 103);
                OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
                float var6 = (float) arg0 + 0.35F;
                float var7 = (float) arg1 + 0.35F;
                int var8 = arg2 << 1;
                if ((float) var8 < this.field2849) {
                    OpenGL.glBegin(7);
                    OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                    OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                    OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                    OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                    OpenGL.glEnd();
                } else if (this.field2797 >= (float) var8) {
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
                    int var10 = class482.method3720((byte) 60, var9);
                    OpenGL.glVertex2f((float) arg2 + var6, var7);
                    for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                        OpenGL.glVertex2f(class615.field8782[var11] * (float) arg2 + var6, class615.field8783[var11] * (float) arg2 + var7);
                    }
                    OpenGL.glVertex2f((float) arg2 + var6, var7);
                    OpenGL.glEnd();
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field2913[38] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "(II)V", line = 3239)
    public final void method149(int arg0, int arg1) {
        try {
            ++field2633;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[184] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3247)
    public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            ++field2626;
            if (arg0 != arg2 || arg1 != arg3) {
                class581 var13 = (class581) arg6;
                class268 var14 = var13.field8395;
                this.method1620((byte) 123);
                this.method1618((byte) 126, var13.field8395);
                this.method1670(arg5, (byte) 117);
                this.method1628(8448, 7681, 34162);
                this.method1669(768, 0, 34167, (byte) -121);
                float var15 = var14.field3802 / (float) var14.field3804;
                float var16 = var14.field3803 / (float) var14.field3799;
                float var17 = (float) arg2 - (float) arg0;
                float var18 = (float) arg3 - (float) arg1;
                float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
                int var34 = arg11 % (arg9 + arg10);
                OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
                float var20 = var17 * var19;
                float var21 = var18 * var19;
                float var22 = (float) arg9 * var20;
                float var23 = (float) arg9 * var21;
                float var24 = 0.0F;
                float var25 = 0.0F;
                float var26 = var22;
                float var27 = var23;
                if (~arg9 > ~var34) {
                    var24 = (float) (arg9 + arg10 + -var34) * var20;
                    var25 = (float) (arg9 + arg10 + -var34) * var21;
                } else {
                    var26 = (float) (-var34 + arg9) * var20;
                    var27 = (float) (arg9 - var34) * var21;
                }
                float var28 = (float) arg0 + 0.35F + var24;
                float var29 = (float) arg1 + 0.35F + var25;
                float var30 = (float) arg10 * var20;
                float var31 = (float) arg10 * var21;
                while (true) {
                    if (~arg2 >= ~arg0) {
                        if (var28 < (float) arg2 + 0.35F) {
                            break;
                        }
                        if (var26 + var28 < (float) arg2) {
                            var26 = (float) arg2 + -var28;
                        }
                    } else {
                        if (var28 > (float) arg2 + 0.35F) {
                            break;
                        }
                        if (var26 + var28 > (float) arg2) {
                            var26 = (float) arg2 - var28;
                        }
                    }
                    if (arg3 <= arg1) {
                        if ((float) arg3 + 0.35F > var29) {
                            break;
                        }
                        if (var27 + var29 < (float) arg3) {
                            var27 = (float) arg3 + -var29;
                        }
                    } else {
                        if ((float) arg3 + 0.35F < var29) {
                            break;
                        }
                        if ((float) arg3 < var27 + var29) {
                            var27 = (float) arg3 - var29;
                        }
                    }
                    OpenGL.glBegin(1);
                    OpenGL.glTexCoord2f((var28 - (float) arg7) * var15, (var29 - (float) arg8) * var16);
                    OpenGL.glVertex2f(var28, var29);
                    OpenGL.glTexCoord2f((var26 + var28 - (float) arg7) * var15, (var27 + var29 - (float) arg8) * var16);
                    OpenGL.glVertex2f(var26 + var28, var27 + var29);
                    OpenGL.glEnd();
                    var29 += var27 + var31;
                    var28 += var26 + var30;
                    var26 = var22;
                    var27 = var23;
                }
                this.method1669(768, 0, 5890, (byte) -123);
            }
        } catch (RuntimeException var33) {
            throw class665.method4799(var33, field2913[77] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2913[2] : field2913[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)I", line = 3372)
    public final int method1661(byte arg0, int arg1) {
        try {
            ++field2623;
            if (arg0 != -68) {
                return 106;
            } else if (~arg1 != -6407 && ~arg1 != -6410) {
                if (arg1 != 6410 && arg1 != 34846 && ~arg1 != -34845) {
                    if (arg1 == 6407) {
                        return 3;
                    } else if (arg1 != 6408 && arg1 != 34847) {
                        if (~arg1 != -34844) {
                            if (~arg1 != -34843) {
                                if (arg1 == 6402) {
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
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[98] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 3416)
    public final void method224(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class142 {
        try {
            this.method132(arg2, arg3);
            ++field2614;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[95] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "()Lqa;", line = 3424)
    public final class104 method129() {
        try {
            ++field2642;
            return this.field2786;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[112] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(B)V", line = 3434)
    public final void method1662(byte arg0) {
        try {
            ++field2557;
            if (arg0 != 83) {
                this.field2747 = 117;
            }
            if (this.field2788 != 4) {
                this.method1642(1);
                this.method1673(8, false);
                this.method1684(false, (byte) -23);
                this.method1640(false, (byte) 91);
                this.method1632(false, true);
                this.method1625(98, -2);
                this.method1670(1, (byte) 121);
                this.field2788 = 4;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLaq;)V", line = 3457)
    public final void method1663(boolean arg0, class69 arg1) {
        try {
            ++field2735;
            if (~this.field2766 <= -1 && this.field2773[this.field2766] == arg1) {
                this.field2773[this.field2766--] = null;
                if (!arg0) {
                    this.field2799 = -40;
                }
                arg1.method716(15302);
                if (~this.field2766 > -1) {
                    this.field2770 = null;
                } else {
                    this.field2770 = this.field2773[this.field2766];
                    this.field2770.method715((byte) -113);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[108] + arg0 + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "(II)V", line = 3481)
    public final synchronized void method1664(int arg0, int arg1) {
        try {
            ++field2703;
            class578 var3 = new class578();
            var3.field8378 = (long) arg0;
            this.field2783.method3984(var3, arg1 ^ arg1);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[29] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "(II)I", line = 3495)
    public final int method1665(int arg0, int arg1) {
        try {
            ++field2753;
            if (arg0 != 19175) {
                this.field2851 = null;
            }
            if (~arg1 != -5122 && ~arg1 != -5121) {
                if (arg1 != 5123 && ~arg1 != -5123) {
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
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[140] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "(I)V", line = 3517)
    private final void method1666(int arg0) {
        try {
            if (arg0 > -14) {
                this.method234();
            }
            ++field2569;
            this.field2845 = (float) (-this.field2869 + this.field2852) - this.field2832;
            this.field2871 = this.field2845 - (float) this.field2828 * this.field2880;
            if (this.field2871 < (float) this.field2816) {
                this.field2871 = (float) this.field2816;
            }
            OpenGL.glFogf(2915, this.field2871);
            OpenGL.glFogf(2916, this.field2845);
            class686.field9610[1] = (float) class434.method3377(65280, this.field2827) / 65280.0F;
            class686.field9610[0] = (float) class434.method3377(16711680, this.field2827) / 1.671168E7F;
            class686.field9610[2] = (float) class434.method3377(this.field2827, 255) / 255.0F;
            OpenGL.glFogfv(2918, class686.field9610, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[63] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lsn;Lsn;FLsn;)Lsn;", line = 3540)
    public final class369 method155(class369 arg0, class369 arg1, float arg2, class369 arg3) {
        try {
            ++field2609;
            if (arg0 != null && arg1 != null && this.field2860 && this.field2806) {
                class46 var5 = null;
                class58 var6 = (class58) arg0;
                class58 var7 = (class58) arg1;
                class112 var8 = var6.method491((byte) -103);
                class112 var9 = var7.method491((byte) -112);
                if (var8 != null && var9 != null) {
                    int var10 = ~var8.field1448 >= ~var9.field1448 ? var9.field1448 : var8.field1448;
                    if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class46) {
                        class46 var11 = (class46) arg3;
                        if (var11.method493(-546) == var10) {
                            var5 = var11;
                        }
                    }
                    if (var5 == null) {
                        var5 = new class46(this, var10);
                    }
                    if (var5.method495(arg2, -15829, var9, var8)) {
                        return var5;
                    }
                }
            }
            return arg2 < 0.5F ? arg0 : arg1;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field2913[11] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ',' + arg2 + ',' + (arg3 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "(I)V", line = 3587)
    public final void method154(int arg0) {
        try {
            ++field2663;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[152] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lqa;)V", line = 3595)
    public final void method204(class104 arg0) {
        try {
            this.field2786.method733(arg0);
            ++field2713;
            this.field2794.method733(this.field2786);
            this.field2794.method726(0);
            this.field2795.method728(this.field2794, (byte) 96);
            if (this.field2855 != 1) {
                this.method1689((byte) 107);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[145] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "()Z", line = 3612)
    public final boolean method215() {
        try {
            ++field2707;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[21] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V", line = 3620)
    private final void method1667(byte arg0) {
        try {
            ++field2739;
            if (~this.field2823 >= ~this.field2857 && this.field2881 >= this.field2809) {
                OpenGL.glScissor(this.field2823 + this.field2821, -this.field2881 + this.field2746 + this.field2825, -this.field2823 + this.field2857, this.field2881 - this.field2809);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
            if (arg0 != 72) {
                this.field2710 = -16;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[64] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "(IIIII)V", line = 3636)
    public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method1672(8960);
            ++field2718;
            this.method1670(arg4, (byte) 116);
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var6, var7);
            OpenGL.glVertex2f((float) arg2 + var6, var7);
            OpenGL.glEnd();
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2913[104] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lkia;I)V", line = 3658)
    public final void method193(class788 arg0, int arg1) {
        try {
            this.field2750.method4161(arg0, 60, arg1, this);
            ++field2738;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[27] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "(I)V", line = 3669)
    public static void method1668(int arg0) {
        try {
            field2706 = null;
            if (arg0 != -26520) {
                field2706 = null;
            }
            field2701 = null;
            field2551 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[172] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIB)V", line = 3681)
    public final void method1669(int arg0, int arg1, int arg2, byte arg3) {
        try {
            ++field2555;
            OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
            OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
            if (arg3 > -108) {
                this.method1637(-59, (byte) -89);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(IB)V", line = 3693)
    public final void method1670(int arg0, byte arg1) {
        try {
            ++field2651;
            if (arg1 >= 99) {
                if (this.field2791 != arg0) {
                    byte var3;
                    boolean var4;
                    boolean var5;
                    if (arg0 != 1) {
                        if (arg0 == 2) {
                            var3 = 2;
                            var4 = false;
                            var5 = true;
                        } else if (arg0 != 128) {
                            var4 = false;
                            var5 = true;
                            var3 = 0;
                        } else {
                            var5 = true;
                            var3 = 3;
                            var4 = true;
                        }
                    } else {
                        var3 = 1;
                        var4 = true;
                        var5 = true;
                    }
                    if (!var5 == this.field2785) {
                        OpenGL.glColorMask(var5, var5, var5, true);
                        this.field2785 = var5;
                    }
                    if (var4 == !this.field2787) {
                        if (!var4) {
                            OpenGL.glDisable(3008);
                        } else {
                            OpenGL.glEnable(3008);
                        }
                        this.field2787 = var4;
                    }
                    if (this.field2793 != var3) {
                        if (~var3 != -2) {
                            if (var3 == 2) {
                                OpenGL.glEnable(3042);
                                OpenGL.glBlendFunc(1, 1);
                            } else if (var3 != 3) {
                                OpenGL.glDisable(3042);
                            } else {
                                OpenGL.glEnable(3042);
                                OpenGL.glBlendFunc(774, 1);
                            }
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(770, 771);
                        }
                        this.field2793 = var3;
                    }
                    this.field2791 = arg0;
                    this.field2788 &= -29;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[16] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V", line = 3788)
    public final void method199(boolean arg0) {
        try {
            ++field2652;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[170] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "HA", descriptor = "(IIII[I)V", line = 3796)
    public final void method171(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        try {
            ++field2552;
            float var6 = (float) arg2 * this.field2786.field1001 + (float) arg0 * this.field2786.field1000 + (float) arg1 * this.field2786.field1032 + this.field2786.field995;
            if (!((float) this.field2816 > var6) && !(var6 > (float) this.field2852)) {
                int var7 = (int) (((float) arg2 * this.field2786.field1030 + (float) arg0 * this.field2786.field1010 + (float) arg1 * this.field2786.field1005 + this.field2786.field996) * (float) this.field2796 / (float) arg3);
                int var8 = (int) (((float) arg2 * this.field2786.field1002 + (float) arg0 * this.field2786.field1018 + (float) arg1 * this.field2786.field1027 + this.field2786.field1028) * (float) this.field2886 / (float) arg3);
                if ((float) var7 >= this.field2804 && (float) var7 <= this.field2854 && (float) var8 >= this.field2865 && this.field2864 >= (float) var8) {
                    arg4[2] = (int) var6;
                    arg4[1] = (int) ((float) var8 + -this.field2865);
                    arg4[0] = (int) ((float) var7 - this.field2804);
                } else {
                    arg4[0] = arg4[1] = arg4[2] = -1;
                }
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2913[76] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V", line = 3826)
    public final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field2683;
            OpenGL.glLineWidth((float) arg5);
            this.method219(arg0, arg1, arg2, arg3, arg4, arg6);
            OpenGL.glLineWidth(1.0F);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2913[88] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "(I)V", line = 3843)
    private final void method1671(int arg0) {
        try {
            ++field2743;
            this.field2804 = (float) (-this.field2848 + this.field2823);
            this.field2854 = (float) (-this.field2848 + this.field2857);
            this.field2864 = (float) (-this.field2811 + this.field2881);
            this.field2865 = (float) (-this.field2811 + this.field2809);
            if (arg0 != 11405) {
                this.field2792 = -84L;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[168] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "(I)V", line = 3863)
    private final void method1672(int arg0) {
        try {
            if (arg0 == 8960) {
                if (this.field2788 != 1) {
                    this.method1642(1);
                    this.method1673(8, false);
                    this.method1684(false, (byte) -67);
                    this.method1640(false, (byte) -56);
                    this.method1632(false, true);
                    this.method1618((byte) 104, (class469) null);
                    this.method1625(arg0 ^ 9033, -2);
                    this.method1631(1, 7681);
                    this.field2788 = 1;
                }
                ++field2580;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[208] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "()Z", line = 3890)
    public final boolean method172() {
        try {
            ++field2678;
            return false;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[39] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(II)I", line = 3898)
    public final int method226(int arg0, int arg1) {
        try {
            ++field2740;
            return arg0 & arg1 ^ arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[202] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V", line = 3906)
    public final void method1673(int arg0, boolean arg1) {
        try {
            ++field2677;
            if (arg1 == !this.field2875) {
                this.field2875 = arg1;
                this.method1643(arg0 ^ -9);
                this.field2788 &= -32;
            }
            if (arg0 != 8) {
                this.field2907 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[31] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "pa", descriptor = "()V", line = 3924)
    public final void method169() {
        try {
            this.field2874 = false;
            ++field2665;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[34] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lsn;)V", line = 3935)
    public final void method228(class369 arg0) {
        try {
            this.field2831 = (class58) arg0;
            ++field2604;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[6] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(FIF)V", line = 3943)
    public final void method1674(float arg0, int arg1, float arg2) {
        try {
            ++field2542;
            this.field2832 = arg0;
            this.field2880 = arg2;
            if (arg1 == 1) {
                this.method1666(-23);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[187] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILaq;)V", line = 3957)
    public final void method1675(int arg0, class69 arg1) {
        try {
            ++field2702;
            if (this.field2769 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field2769 >= 0) {
                    this.field2768[this.field2769].method714((byte) -119);
                }
                if (arg0 > -93) {
                    this.field2799 = -71;
                }
                this.field2772 = this.field2768[++this.field2769] = arg1;
                this.field2772.method712(-8119);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[18] + arg0 + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Laj;I)V", line = 3976)
    public final void method1676(class94 arg0, int arg1) {
        try {
            if (arg1 != 768) {
                this.field2755 = null;
            }
            ++field2613;
            if (this.field2859 != arg0) {
                if (this.field2812) {
                    OpenGL.glBindBufferARB(34962, arg0.method944((byte) 57));
                }
                this.field2859 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[194] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)I", line = 3995)
    public final int method194(int arg0, int arg1) {
        try {
            ++field2687;
            return arg0 | arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[44] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "()I", line = 4004)
    public final int method139() {
        try {
            ++field2571;
            int var1 = this.field2910;
            this.field2910 = 0;
            return var1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[171] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lgj;I)V", line = 4019)
    public final void method1677(class70 arg0, int arg1) {
        try {
            ++field2688;
            OpenGL.glPushMatrix();
            OpenGL.glMultMatrixf(arg0.method727(arg1 ^ 2), arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[201] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIID)V", line = 4031)
    public final void method174(int arg0, int arg1, int arg2, int arg3, double arg4) {
        try {
            ++field2742;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2913[86] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "(I)V", line = 4040)
    private final void method1678(int arg0) {
        try {
            ++field2576;
            if (this.field2858) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field2858 = false;
            }
            if (arg0 != 5888) {
                this.field2666 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[102] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "(I)V", line = 4066)
    private final void method1679(int arg0) {
        try {
            ++field2679;
            float[] var2 = this.field2891;
            float var3 = (float) (-this.field2848 * this.field2816) / (float) this.field2796;
            float var4 = (float) ((-this.field2848 + this.field2737) * this.field2816) / (float) this.field2796;
            float var5 = (float) (this.field2816 * this.field2811) / (float) this.field2886;
            float var6 = (float) ((this.field2811 - this.field2746) * this.field2816) / (float) this.field2886;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field2816 * 2.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[15] = 0.0F;
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[14] = this.field2839 = -((float) this.field2852 * var7) / (float) (-this.field2816 + this.field2852);
                var2[2] = 0.0F;
                var2[11] = -1.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[7] = 0.0F;
                var2[10] = this.field2836 = (float) (-(this.field2852 - -this.field2816)) / (float) (-this.field2816 + this.field2852);
                var2[13] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = var7 / (var4 - var3);
            } else {
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[10] = 1.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
            }
            int var8 = 38 / (-arg0 / 43);
            this.method1634(true);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2913[66] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 4127)
    public final void method148(Canvas arg0, int arg1, int arg2) {
        try {
            ++field2674;
            if (this.field2548 == arg0) {
                throw new RuntimeException();
            } else if (!this.field2666.containsKey(arg0)) {
                if (!arg0.isShowing()) {
                    throw new RuntimeException();
                } else {
                    try {
                        Class var4 = Class.forName(field2913[181]);
                        Method var5 = var4.getMethod(field2913[182], Boolean.TYPE);
                        var5.invoke(arg0, Boolean.TRUE);
                    } catch (Exception var9) {
                    }
                    long var6 = this.field2635.prepareSurface(arg0);
                    if (~var6 == 0L) {
                        throw new RuntimeException();
                    } else {
                        this.field2666.put(arg0, new Long(var6));
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2913[183] + (arg0 != null ? field2913[2] : field2913[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "(I)V", line = 4165)
    private final void method1680(int arg0) {
        try {
            ++field2595;
            this.method1625(54, -2);
            for (int var2 = this.field2906 + -1; ~var2 <= -1; --var2) {
                this.method1619(var2, (byte) 125);
                this.method1618((byte) 67, (class469) null);
                OpenGL.glTexEnvi(8960, 8704, 34160);
            }
            this.method1628(8448, 8448, arg0 ^ 34162);
            this.method1669(770, 2, 34168, (byte) -112);
            this.method1678(arg0 + 5888);
            this.field2791 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field2793 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field2787 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field2785 = true;
            this.method1673(arg0 + 8, true);
            this.method1684(true, (byte) -23);
            this.method1640(true, (byte) 123);
            this.method1632(true, true);
            this.method1616((byte) 61);
            this.field2635.setSwapInterval(0);
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
            for (int var4 = arg0; ~var4 > -9; ++var4) {
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
            this.field2815 = this.field2827 = -1;
            this.method240();
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "()Lqa;", line = 4235)
    public final class104 method221() {
        try {
            ++field2625;
            return new class70();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[92] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "()V", line = 4247)
    public final void method123() {
        try {
            ++field2585;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[178] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V", line = 4254)
    public final synchronized void method1681(int arg0, int arg1, int arg2) {
        try {
            ++field2730;
            class529 var4 = new class529(arg2);
            if (arg1 >= -6) {
                this.field2790 = true;
            }
            var4.field8378 = (long) arg0;
            this.field2779.method3984(var4, 0);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2913[103] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIZI)V", line = 4269)
    public final void method1682(boolean arg0, int arg1, boolean arg2, int arg3) {
        try {
            if (this.field2798 != arg1 || this.field2874 == !this.field2872) {
                class117 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = this.field2874 ? 3 : 0;
                if (arg1 < 0) {
                    this.method1678(5888);
                } else {
                    var5 = this.field2748.method5423(arg1, -60);
                    class684 var10 = super.field237.method4500(-23641, arg1);
                    if (~var10.field9598 == -1 && ~var10.field9592 == -1) {
                        this.method1678(5888);
                    } else {
                        int var11 = !var10.field9599 ? 128 : 64;
                        int var12 = var11 * 50;
                        this.method1615(0.0F, (float) (this.field2763 % var12 * var10.field9592) / (float) var12, (byte) 86, (float) (this.field2763 % var12 * var10.field9598) / (float) var12);
                    }
                    if (!this.field2874) {
                        var7 = var10.field9600;
                        var8 = var10.field9588;
                        var9 = var10.field9605;
                    }
                    var6 = var10.field9593;
                }
                this.field2751.method3556(var8, arg0, arg2, var9, -105, var7);
                if (!this.field2751.method3560(Integer.MAX_VALUE, var5, var6)) {
                    this.method1618((byte) 37, var5);
                    this.method1631(var6, 7681);
                }
                this.field2872 = this.field2874;
                this.field2798 = arg1;
            }
            ++field2725;
            if (arg3 > 73) {
                this.field2788 &= -8;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field2913[174] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "(I)V", line = 4335)
    private final void method1683(int arg0) {
        try {
            OpenGL.glMatrixMode(5889);
            ++field2547;
            if (arg0 <= -54) {
                OpenGL.glLoadMatrixf(this.field2891, 0);
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[36] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZB)V", line = 4351)
    public final void method1684(boolean arg0, byte arg1) {
        try {
            if (arg1 > -7) {
                this.method231((class66) null, false);
            }
            if (arg0 == !this.field2807) {
                this.field2807 = arg0;
                this.method1660(-86);
                this.field2788 &= -8;
            }
            ++field2689;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[70] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZBI)V", line = 4372)
    public final void method1685(boolean arg0, byte arg1, int arg2) {
        try {
            ++field2745;
            this.method1682(true, arg2, arg0, 86);
            if (arg1 != 47) {
                this.method145((class161) null, (class66[]) null, false);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[79] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIF)Lta;", line = 4388)
    public final class330 method142(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            ++field2721;
            return new class404(arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2913[177] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "()Z", line = 4396)
    public final boolean method140() {
        try {
            ++field2695;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2913[42] + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZ)Ltb;", line = 4405)
    public final class392 method222(int arg0, int arg1, boolean arg2) {
        try {
            ++field2731;
            return new class162(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2913[105] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "(I)V", line = 4413)
    public final void method1686(int arg0) {
        try {
            if (this.field2788 != 16) {
                this.method1624(5611);
                this.method1673(8, true);
                this.method1640(true, (byte) -49);
                this.method1632(true, true);
                this.method1670(1, (byte) 104);
                this.field2788 = 16;
            }
            ++field2607;
            if (arg0 < 5) {
                this.field2892 = false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[142] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "(ILaa;II)V", line = 4434)
    public final void method153(int arg0, class685 arg1, int arg2, int arg3) {
        try {
            ++field2546;
            class581 var5 = (class581) arg1;
            class268 var6 = var5.field8395;
            this.method1620((byte) 118);
            this.method1618((byte) 116, var5.field8395);
            this.method1670(1, (byte) 111);
            this.method1628(8448, 7681, 34162);
            this.method1669(768, 0, 34167, (byte) -124);
            float var7 = var6.field3802 / (float) var6.field3804;
            float var8 = var6.field3803 / (float) var6.field3799;
            OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2823) * var7, (float) (-arg3 + this.field2809) * var8);
            OpenGL.glVertex2i(this.field2823, this.field2809);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2823) * var7, (float) (-arg3 + this.field2881) * var8);
            OpenGL.glVertex2i(this.field2823, this.field2881);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2857) * var7, (float) (-arg3 + this.field2881) * var8);
            OpenGL.glVertex2i(this.field2857, this.field2881);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2857) * var7, (float) (this.field2809 - arg3) * var8);
            OpenGL.glVertex2i(this.field2857, this.field2809);
            OpenGL.glEnd();
            this.method1669(768, 0, 5890, (byte) -112);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2913[53] + arg0 + ',' + (arg1 != null ? field2913[2] : field2913[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "(B)V", line = 4466)
    private final void method1687(byte arg0) {
        try {
            ++field2579;
            float var2 = (float) (-this.field2848) * this.field2844 / (float) this.field2796;
            float var3 = (float) (-this.field2811) * this.field2844 / (float) this.field2886;
            if (arg0 != -5) {
                this.method1610((class69) null, -13);
            }
            float var4 = (float) (this.field2737 - this.field2848) * this.field2844 / (float) this.field2796;
            float var5 = (float) (-this.field2811 + this.field2746) * this.field2844 / (float) this.field2886;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field2816, (double) this.field2852);
            }
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2913[198] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lkia;)V", line = 4491)
    public final void method126(class788 arg0) {
        try {
            this.field2750.method4161(arg0, 112, -1, this);
            ++field2583;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[111] + (arg0 != null ? field2913[2] : field2913[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(Z)V", line = 4501)
    private final void method1688(boolean arg0) {
        try {
            this.field2810 = new class469[this.field2906];
            ++field2698;
            this.field2833 = new class117(this, 3553, 6408, 1, 1);
            new class117(this, 3553, 6408, 1, 1);
            new class117(this, 3553, 6408, 1, 1);
            this.field2838 = new class435(this);
            this.field2801 = new class435(this);
            this.field2862 = new class435(this);
            this.field2896 = new class435(this);
            this.field2895 = new class435(this);
            this.field2868 = new class435(this);
            if (arg0) {
                this.field2766 = -71;
            }
            this.field2885 = new class435(this);
            this.field2850 = new class435(this);
            this.field2837 = new class435(this);
            this.field2820 = new class435(this);
            if (this.field2806) {
                this.field2841 = new class513(this);
                new class513(this);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2913[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "(B)V", line = 4552)
    private final void method1689(byte arg0) {
        try {
            OpenGL.glLoadIdentity();
            ++field2658;
            OpenGL.glMultMatrixf(this.field2794.method727(2), 0);
            if (this.field2872) {
                this.field2751.field6746.method678(98);
            }
            int var2 = -86 % ((-1 - arg0) / 38);
            this.method1621(4611);
            this.method1648(-20420);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2913[51] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "na", descriptor = "(IIII)[I", line = 4569)
    public final int[] method227(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2675;
            int[] var5 = new int[arg2 * arg3];
            for (int var6 = 0; arg3 > var6; ++var6) {
                OpenGL.glReadPixelsi(arg0, -arg1 + this.field2746 + -var6, arg2, 1, 32993, this.field2824, var5, arg2 * var6);
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2913[169] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1690(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 111);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1691(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
