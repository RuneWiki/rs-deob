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

@OriginalClass("client!kd")
public class class188 extends class38 {

    @OriginalMember(owner = "client!kd", name = "Dc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2940 = new Hashtable();

    @OriginalMember(owner = "client!kd", name = "be", descriptor = "I")
    public int field3016 = 128;

    @OriginalMember(owner = "client!kd", name = "he", descriptor = "Lvq;")
    private class324 field3022 = new class324();

    @OriginalMember(owner = "client!kd", name = "ie", descriptor = "Lqg;")
    private class325 field3023 = new class325();

    @OriginalMember(owner = "client!kd", name = "je", descriptor = "Lqg;")
    public class325 field3024 = new class325();

    @OriginalMember(owner = "client!kd", name = "pe", descriptor = "Z")
    private boolean field3030 = false;

    @OriginalMember(owner = "client!kd", name = "ne", descriptor = "I")
    public int field3028 = 3;

    @OriginalMember(owner = "client!kd", name = "ke", descriptor = "I")
    public int field3025 = 8;

    @OriginalMember(owner = "client!kd", name = "qe", descriptor = "Loe;")
    private class137 field3031 = new class137();

    @OriginalMember(owner = "client!kd", name = "re", descriptor = "[Lsf;")
    private class365[] field3032 = new class365[4];

    @OriginalMember(owner = "client!kd", name = "se", descriptor = "[Lsf;")
    private class365[] field3033 = new class365[4];

    @OriginalMember(owner = "client!kd", name = "we", descriptor = "I")
    private int field3037 = -1;

    @OriginalMember(owner = "client!kd", name = "te", descriptor = "I")
    private int field3034 = -1;

    @OriginalMember(owner = "client!kd", name = "ye", descriptor = "I")
    private int field3039 = -1;

    @OriginalMember(owner = "client!kd", name = "ve", descriptor = "[Lsf;")
    private class365[] field3036 = new class365[4];

    @OriginalMember(owner = "client!kd", name = "ze", descriptor = "Loe;")
    private class137 field3040;

    @OriginalMember(owner = "client!kd", name = "De", descriptor = "Loe;")
    private class137 field3044;

    @OriginalMember(owner = "client!kd", name = "Ee", descriptor = "Loe;")
    private class137 field3045;

    @OriginalMember(owner = "client!kd", name = "Fe", descriptor = "Loe;")
    private class137 field3046;

    @OriginalMember(owner = "client!kd", name = "Ge", descriptor = "Loe;")
    private class137 field3047;

    @OriginalMember(owner = "client!kd", name = "He", descriptor = "Loe;")
    private class137 field3048;

    @OriginalMember(owner = "client!kd", name = "Ie", descriptor = "Loe;")
    private class137 field3049;

    @OriginalMember(owner = "client!kd", name = "Re", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!kd", name = "Ve", descriptor = "F")
    public float field3062;

    @OriginalMember(owner = "client!kd", name = "gf", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!kd", name = "pf", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!kd", name = "Yf", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!kd", name = "Se", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!kd", name = "sf", descriptor = "[F")
    private float[] field3084;

    @OriginalMember(owner = "client!kd", name = "of", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!kd", name = "yf", descriptor = "F")
    public float field3090;

    @OriginalMember(owner = "client!kd", name = "Hf", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!kd", name = "wf", descriptor = "F")
    public float field3088;

    @OriginalMember(owner = "client!kd", name = "eg", descriptor = "I")
    private int field3122;

    @OriginalMember(owner = "client!kd", name = "Pf", descriptor = "I")
    private int field3107;

    @OriginalMember(owner = "client!kd", name = "uf", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!kd", name = "Df", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!kd", name = "Ye", descriptor = "F")
    public float field3065;

    @OriginalMember(owner = "client!kd", name = "dg", descriptor = "F")
    public float field3121;

    @OriginalMember(owner = "client!kd", name = "Rf", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!kd", name = "gg", descriptor = "F")
    private float field3124;

    @OriginalMember(owner = "client!kd", name = "kg", descriptor = "Z")
    private boolean field3128;

    @OriginalMember(owner = "client!kd", name = "tf", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!kd", name = "vg", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!kd", name = "sg", descriptor = "F")
    public float field3136;

    @OriginalMember(owner = "client!kd", name = "jg", descriptor = "I")
    private int field3127;

    @OriginalMember(owner = "client!kd", name = "xf", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!kd", name = "Gg", descriptor = "F")
    private float field3150;

    @OriginalMember(owner = "client!kd", name = "Jf", descriptor = "[F")
    private float[] field3101;

    @OriginalMember(owner = "client!kd", name = "Eg", descriptor = "[F")
    private float[] field3148;

    @OriginalMember(owner = "client!kd", name = "cg", descriptor = "F")
    private float field3120;

    @OriginalMember(owner = "client!kd", name = "Dg", descriptor = "[F")
    public float[] field3147;

    @OriginalMember(owner = "client!kd", name = "Ng", descriptor = "I")
    private int field3157;

    @OriginalMember(owner = "client!kd", name = "Lg", descriptor = "F")
    public float field3155;

    @OriginalMember(owner = "client!kd", name = "Cg", descriptor = "[Lqp;")
    private class470[] field3146;

    @OriginalMember(owner = "client!kd", name = "Tf", descriptor = "[F")
    private float[] field3111;

    @OriginalMember(owner = "client!kd", name = "mg", descriptor = "F")
    public float field3130;

    @OriginalMember(owner = "client!kd", name = "Og", descriptor = "I")
    private int field3158;

    @OriginalMember(owner = "client!kd", name = "lg", descriptor = "I")
    private int field3129;

    @OriginalMember(owner = "client!kd", name = "Cf", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!kd", name = "ug", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!kd", name = "Oe", descriptor = "Luc;")
    public class23 field3055;

    @OriginalMember(owner = "client!kd", name = "Yg", descriptor = "[I")
    public int[] field3168;

    @OriginalMember(owner = "client!kd", name = "Zg", descriptor = "[I")
    public int[] field3169;

    @OriginalMember(owner = "client!kd", name = "ch", descriptor = "[I")
    public int[] field3172;

    @OriginalMember(owner = "client!kd", name = "ah", descriptor = "[B")
    public byte[] field3170;

    @OriginalMember(owner = "client!kd", name = "Bd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2990;

    @OriginalMember(owner = "client!kd", name = "Ad", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2989;

    @OriginalMember(owner = "client!kd", name = "ce", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!kd", name = "ub", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2879;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "J")
    private long field2841;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "J")
    private long field2825;

    @OriginalMember(owner = "client!kd", name = "xg", descriptor = "Z")
    public boolean field3141;

    @OriginalMember(owner = "client!kd", name = "mf", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!kd", name = "ig", descriptor = "Ljava/lang/String;")
    private String field3126;

    @OriginalMember(owner = "client!kd", name = "Ig", descriptor = "Z")
    public boolean field3152;

    @OriginalMember(owner = "client!kd", name = "df", descriptor = "Z")
    private boolean field3070;

    @OriginalMember(owner = "client!kd", name = "Vg", descriptor = "Z")
    public boolean field3165;

    @OriginalMember(owner = "client!kd", name = "Ke", descriptor = "Z")
    public boolean field3051;

    @OriginalMember(owner = "client!kd", name = "vf", descriptor = "Z")
    private boolean field3087;

    @OriginalMember(owner = "client!kd", name = "Wf", descriptor = "Z")
    public boolean field3114;

    @OriginalMember(owner = "client!kd", name = "Sg", descriptor = "Ljava/lang/String;")
    private String field3162;

    @OriginalMember(owner = "client!kd", name = "Bg", descriptor = "Z")
    public boolean field3145;

    @OriginalMember(owner = "client!kd", name = "Bf", descriptor = "Z")
    private boolean field3093;

    @OriginalMember(owner = "client!kd", name = "ge", descriptor = "Lml;")
    public class266 field3021;

    @OriginalMember(owner = "client!kd", name = "le", descriptor = "Lle;")
    public class203 field3026;

    @OriginalMember(owner = "client!kd", name = "fe", descriptor = "Lun;")
    private class294 field3020;

    @OriginalMember(owner = "client!kd", name = "ee", descriptor = "Lbm;")
    private class76 field3019;

    @OriginalMember(owner = "client!kd", name = "de", descriptor = "Lvc;")
    private class209 field3018;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!kd", name = "Md", descriptor = "I")
    public static int field3001 = 2;

    @OriginalMember(owner = "client!kd", name = "Le", descriptor = "F")
    public float field3052;

    @OriginalMember(owner = "client!kd", name = "Pe", descriptor = "F")
    public float field3056;

    @OriginalMember(owner = "client!kd", name = "Kf", descriptor = "F")
    private float field3102;

    @OriginalMember(owner = "client!kd", name = "Mf", descriptor = "F")
    private float field3104;

    @OriginalMember(owner = "client!kd", name = "Nf", descriptor = "F")
    public float field3105;

    @OriginalMember(owner = "client!kd", name = "Vf", descriptor = "F")
    public float field3113;

    @OriginalMember(owner = "client!kd", name = "qg", descriptor = "F")
    public float field3134;

    @OriginalMember(owner = "client!kd", name = "wg", descriptor = "F")
    public float field3140;

    @OriginalMember(owner = "client!kd", name = "Jg", descriptor = "F")
    private float field3153;

    @OriginalMember(owner = "client!kd", name = "Ug", descriptor = "F")
    public float field3164;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!kd", name = "sb", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!kd", name = "tb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!kd", name = "yb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!kd", name = "zb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!kd", name = "Ab", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!kd", name = "Bb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!kd", name = "Eb", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!kd", name = "Fb", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!kd", name = "Gb", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!kd", name = "Hb", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!kd", name = "Ib", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!kd", name = "Jb", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!kd", name = "Kb", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!kd", name = "Lb", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!kd", name = "Mb", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!kd", name = "Nb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!kd", name = "Ob", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!kd", name = "Pb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!kd", name = "Qb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!kd", name = "Rb", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!kd", name = "Sb", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!kd", name = "Tb", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!kd", name = "Ub", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!kd", name = "Vb", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!kd", name = "Wb", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!kd", name = "Xb", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!kd", name = "Yb", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!kd", name = "Zb", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!kd", name = "ac", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!kd", name = "bc", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!kd", name = "cc", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!kd", name = "dc", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!kd", name = "ec", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!kd", name = "fc", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!kd", name = "gc", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!kd", name = "hc", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!kd", name = "ic", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!kd", name = "jc", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!kd", name = "kc", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!kd", name = "lc", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!kd", name = "mc", descriptor = "I")
    private int field2923;

    @OriginalMember(owner = "client!kd", name = "nc", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!kd", name = "oc", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!kd", name = "pc", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!kd", name = "qc", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!kd", name = "rc", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!kd", name = "sc", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!kd", name = "tc", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!kd", name = "uc", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!kd", name = "vc", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!kd", name = "wc", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!kd", name = "xc", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!kd", name = "yc", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!kd", name = "zc", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!kd", name = "Ac", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!kd", name = "Bc", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!kd", name = "Cc", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!kd", name = "Ec", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!kd", name = "Fc", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!kd", name = "Gc", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!kd", name = "Hc", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!kd", name = "Ic", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!kd", name = "Jc", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!kd", name = "Kc", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!kd", name = "Lc", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!kd", name = "Mc", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!kd", name = "Nc", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!kd", name = "Oc", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!kd", name = "Pc", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!kd", name = "Qc", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!kd", name = "Rc", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!kd", name = "Sc", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!kd", name = "Tc", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!kd", name = "Uc", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!kd", name = "Vc", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!kd", name = "Wc", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!kd", name = "Xc", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!kd", name = "Yc", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!kd", name = "Zc", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!kd", name = "ad", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!kd", name = "bd", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!kd", name = "cd", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!kd", name = "dd", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!kd", name = "ed", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!kd", name = "fd", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!kd", name = "gd", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!kd", name = "hd", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!kd", name = "id", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!kd", name = "jd", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!kd", name = "kd", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!kd", name = "ld", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!kd", name = "md", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!kd", name = "nd", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!kd", name = "od", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!kd", name = "pd", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!kd", name = "qd", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!kd", name = "rd", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!kd", name = "sd", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!kd", name = "td", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!kd", name = "ud", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!kd", name = "vd", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!kd", name = "wd", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!kd", name = "xd", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!kd", name = "yd", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!kd", name = "zd", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!kd", name = "Cd", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!kd", name = "Dd", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!kd", name = "Ed", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!kd", name = "Fd", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!kd", name = "Gd", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!kd", name = "Hd", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!kd", name = "Id", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!kd", name = "Jd", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!kd", name = "Kd", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!kd", name = "Ld", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!kd", name = "Nd", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!kd", name = "Od", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!kd", name = "Pd", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!kd", name = "Qd", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!kd", name = "Rd", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!kd", name = "Sd", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!kd", name = "Td", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!kd", name = "Ud", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!kd", name = "Vd", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!kd", name = "Wd", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!kd", name = "Xd", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!kd", name = "Yd", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!kd", name = "Zd", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!kd", name = "ae", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!kd", name = "me", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!kd", name = "Ae", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!kd", name = "Be", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!kd", name = "Ce", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!kd", name = "Ze", descriptor = "I")
    private int field3066;

    @OriginalMember(owner = "client!kd", name = "af", descriptor = "I")
    private int field3067;

    @OriginalMember(owner = "client!kd", name = "ff", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!kd", name = "kf", descriptor = "I")
    private int field3076;

    @OriginalMember(owner = "client!kd", name = "Ff", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!kd", name = "Gf", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!kd", name = "Lf", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!kd", name = "Xf", descriptor = "I")
    private int field3115;

    @OriginalMember(owner = "client!kd", name = "fg", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!kd", name = "Ag", descriptor = "I")
    private int field3144;

    @OriginalMember(owner = "client!kd", name = "Hg", descriptor = "I")
    private int field3151;

    @OriginalMember(owner = "client!kd", name = "Kg", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!kd", name = "Pg", descriptor = "I")
    private int field3159;

    @OriginalMember(owner = "client!kd", name = "Rg", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!kd", name = "Tg", descriptor = "I")
    private int field3163;

    @OriginalMember(owner = "client!kd", name = "bh", descriptor = "I")
    private int field3171;

    @OriginalMember(owner = "client!kd", name = "dh", descriptor = "I")
    private int field3173;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "J")
    public static long field2867;

    @OriginalMember(owner = "client!kd", name = "yg", descriptor = "J")
    private long field3142;

    @OriginalMember(owner = "client!kd", name = "og", descriptor = "Lwu;")
    private class253 field3132;

    @OriginalMember(owner = "client!kd", name = "Xg", descriptor = "Lwu;")
    private class253 field3167;

    @OriginalMember(owner = "client!kd", name = "Ue", descriptor = "Lqg;")
    public class325 field3061;

    @OriginalMember(owner = "client!kd", name = "We", descriptor = "Lqg;")
    public class325 field3063;

    @OriginalMember(owner = "client!kd", name = "bf", descriptor = "Lfo;")
    public class361 field3068;

    @OriginalMember(owner = "client!kd", name = "ue", descriptor = "Lsf;")
    private class365 field3035;

    @OriginalMember(owner = "client!kd", name = "xe", descriptor = "Lsf;")
    private class365 field3038;

    @OriginalMember(owner = "client!kd", name = "Sf", descriptor = "Ltv;")
    public class395 field3110;

    @OriginalMember(owner = "client!kd", name = "Zf", descriptor = "Lpl;")
    private class463 field3117;

    @OriginalMember(owner = "client!kd", name = "rf", descriptor = "Lgi;")
    public class481 field3083;

    @OriginalMember(owner = "client!kd", name = "Uf", descriptor = "Lgi;")
    public class481 field3112;

    @OriginalMember(owner = "client!kd", name = "Je", descriptor = "Llu;")
    public class504 field3050;

    @OriginalMember(owner = "client!kd", name = "Ne", descriptor = "Llu;")
    public class504 field3054;

    @OriginalMember(owner = "client!kd", name = "Xe", descriptor = "Llu;")
    public class504 field3064;

    @OriginalMember(owner = "client!kd", name = "ef", descriptor = "Llu;")
    public class504 field3071;

    @OriginalMember(owner = "client!kd", name = "nf", descriptor = "Llu;")
    public class504 field3079;

    @OriginalMember(owner = "client!kd", name = "qf", descriptor = "Llu;")
    public class504 field3082;

    @OriginalMember(owner = "client!kd", name = "hg", descriptor = "Llu;")
    public class504 field3125;

    @OriginalMember(owner = "client!kd", name = "ng", descriptor = "Llu;")
    public class504 field3131;

    @OriginalMember(owner = "client!kd", name = "rg", descriptor = "Llu;")
    public class504 field3135;

    @OriginalMember(owner = "client!kd", name = "tg", descriptor = "Llu;")
    public class504 field3137;

    @OriginalMember(owner = "client!kd", name = "Mg", descriptor = "Lf;")
    private class533 field3156;

    @OriginalMember(owner = "client!kd", name = "If", descriptor = "Loi;")
    private class53 field3100;

    @OriginalMember(owner = "client!kd", name = "oe", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field3029;

    @OriginalMember(owner = "client!kd", name = "Me", descriptor = "Z")
    private boolean field3053;

    @OriginalMember(owner = "client!kd", name = "Qe", descriptor = "Z")
    private boolean field3057;

    @OriginalMember(owner = "client!kd", name = "Te", descriptor = "Z")
    private boolean field3060;

    @OriginalMember(owner = "client!kd", name = "cf", descriptor = "Z")
    public boolean field3069;

    @OriginalMember(owner = "client!kd", name = "hf", descriptor = "Z")
    public boolean field3074;

    @OriginalMember(owner = "client!kd", name = "jf", descriptor = "Z")
    public boolean field3075;

    @OriginalMember(owner = "client!kd", name = "lf", descriptor = "Z")
    public boolean field3077;

    @OriginalMember(owner = "client!kd", name = "zf", descriptor = "Z")
    private boolean field3091;

    @OriginalMember(owner = "client!kd", name = "Af", descriptor = "Z")
    public boolean field3092;

    @OriginalMember(owner = "client!kd", name = "Ef", descriptor = "Z")
    private boolean field3096;

    @OriginalMember(owner = "client!kd", name = "Of", descriptor = "Z")
    private boolean field3106;

    @OriginalMember(owner = "client!kd", name = "Qf", descriptor = "Z")
    private boolean field3108;

    @OriginalMember(owner = "client!kd", name = "ag", descriptor = "Z")
    private boolean field3118;

    @OriginalMember(owner = "client!kd", name = "bg", descriptor = "Z")
    public boolean field3119;

    @OriginalMember(owner = "client!kd", name = "pg", descriptor = "Z")
    public boolean field3133;

    @OriginalMember(owner = "client!kd", name = "Fg", descriptor = "Z")
    private boolean field3149;

    @OriginalMember(owner = "client!kd", name = "Qg", descriptor = "Z")
    private boolean field3160;

    @OriginalMember(owner = "client!kd", name = "Wg", descriptor = "Z")
    public boolean field3166;

    @OriginalMember(owner = "client!kd", name = "zg", descriptor = "[Lav;")
    private class454[] field3143;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "()I", line = 5)
    public final int method315() {
        ++field2987;
        int var1 = this.field3171;
        this.field3171 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "ca", descriptor = "(ILma;II)V", line = 18)
    public final void method270(int arg0, class10 arg1, int arg2, int arg3) {
        ++field3005;
        class289 var5 = (class289) arg1;
        class53 var6 = var5.field4353;
        this.method1314(2);
        this.method1289(-19391, var5.field4353);
        this.method1291(1, false);
        this.method1242(34162, 8448, 7681);
        this.method1266(768, 0, 34167, 8960);
        float var7 = var6.field664 / (float) var6.field663;
        float var8 = var6.field658 / (float) var6.field656;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field3127 - arg2) * var7, (float) (this.field3129 - arg3) * var8);
        OpenGL.glVertex2i(this.field3127, this.field3129);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3127) * var7, (float) (this.field3085 - arg3) * var8);
        OpenGL.glVertex2i(this.field3127, this.field3085);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3081) * var7, (float) (this.field3085 - arg3) * var8);
        OpenGL.glVertex2i(this.field3081, this.field3085);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3081) * var7, (float) (-arg3 + this.field3129) * var8);
        OpenGL.glVertex2i(this.field3081, this.field3129);
        OpenGL.glEnd();
        this.method1266(768, 0, 5890, 8960);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)V", line = 54)
    private final void method1241(boolean arg0) {
        if (!arg0) {
            this.field3076 = 106;
        }
        ++field2850;
        this.field2879.detach();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIF)Lqp;", line = 67)
    public final class470 method322(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3008;
        return new class97(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "()Z", line = 77)
    public final boolean method347() {
        ++field3000;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 87)
    public final void method1242(int arg0, int arg1, int arg2) {
        if (arg0 != 34162) {
            this.field3150 = 0.22247869F;
        }
        ++field2871;
        if (this.field3154 == 0) {
            boolean var4 = false;
            if (this.field3080 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                this.field3080 = arg2;
                var4 = true;
            }
            if (this.field3122 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field3122 = arg1;
            }
            if (var4) {
                this.field3076 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "()V", line = 129)
    public final void method331() {
        this.field3092 = false;
        ++field2887;
        this.field3018.method1448(false, false, false, 0);
        this.method1323(-68);
        this.method1317(2912);
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V", line = 142)
    private final void method1243(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field2849;
        OpenGL.glLoadMatrixf(this.field3111, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 >= -22) {
            this.method1260(55, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)V", line = 156)
    private final void method1244(int arg0) {
        OpenGL.glLoadIdentity();
        ++field2983;
        if (arg0 != 26632) {
            this.field3071 = null;
        }
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field3063.method2073(-80), 0);
        if (this.field3092) {
            this.field3018.field3411.method2383(-23971);
        }
        this.method1305(arg0 + -26680);
        this.method1301((byte) 114);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FB)V", line = 176)
    public final void method1245(float arg0, byte arg1) {
        if (arg1 < 25) {
            this.field3155 = -1.6674663F;
        }
        ++field2995;
        if (this.field3124 != arg0) {
            this.field3124 = arg0;
            if (this.field3103 == 3) {
                this.method1293(5889);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILpl;)V", line = 194)
    public final void method1246(int arg0, class463 arg1) {
        if (arg0 <= 119) {
            this.field3066 = 53;
        }
        ++field2911;
        if (this.field3117 != arg1) {
            if (this.field3070) {
                OpenGL.glBindBufferARB(34963, arg1.method159(80));
            }
            this.field3117 = arg1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)V", line = 217)
    private final void method1247(int arg0) {
        ++field2959;
        float[] var2 = this.field3111;
        float var3 = (float) (-this.field3095 * this.field3086) / (float) this.field3109;
        float var4 = (float) ((-this.field3095 + this.field3014) * this.field3086) / (float) this.field3109;
        if (arg0 < -115) {
            float var5 = (float) (this.field3089 * this.field3086) / (float) this.field3099;
            float var6 = (float) ((-this.field2993 + this.field3089) * this.field3086) / (float) this.field3099;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field3086 * 2.0F;
                var2[14] = this.field3102 = -((float) this.field3138 * var7) / (float) (-this.field3086 + this.field3138);
                var2[5] = var7 / (var5 - var6);
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[13] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[0] = var7 / (var4 - var3);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[15] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = this.field3153 = (float) (-(this.field3138 + this.field3086)) / (float) (-this.field3086 + this.field3138);
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[11] = -1.0F;
            } else {
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[14] = 0.0F;
                var2[5] = 1.0F;
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
            }
            this.method1300(78);
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()Z", line = 284)
    public final boolean method295() {
        ++field2927;
        return this.field3060 && (!this.method340() || this.field3149);
    }

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "()F", line = 292)
    public final float method335() {
        ++field2970;
        return this.field3088;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V", line = 300)
    public final void method334(int arg0) {
        ++field2908;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIII)V", line = 314)
    public final void method304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2992;
        this.method1290((byte) -123);
        this.method1291(arg4, false);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V", line = 334)
    public final void method1248(int arg0, boolean arg1) {
        ++field2875;
        if (~arg0 != -2) {
            if (arg0 == 0) {
                this.method1242(34162, 8448, 8448);
            } else if (~arg0 != -3) {
                if (arg0 != 3) {
                    if (~arg0 == -5) {
                        this.method1242(34162, 34023, 34023);
                    }
                } else {
                    this.method1242(34162, 8448, 260);
                }
            } else {
                this.method1242(34162, 7681, 34165);
            }
        } else {
            this.method1242(34162, 7681, 7681);
        }
        if (!arg1) {
            this.method1254(-51);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V", line = 367)
    private final void method1249(byte arg0) {
        this.method1304(-26349, -2);
        ++field2982;
        for (int var2 = this.field3097 + -1; var2 >= 0; --var2) {
            this.method1307(var2, (byte) 92);
            this.method1289(arg0 + -19327, (class454) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1242(34162, 8448, 8448);
        if (arg0 == -64) {
            this.method1266(770, 2, 34168, 8960);
            this.method1278(arg0 ^ -5950);
            this.field3151 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field3067 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field3057 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field3096 = true;
            this.method1303(true, 20873);
            this.method1272(true, -39);
            this.method1299(false, true);
            this.method1294(true, 34165);
            this.method1287(0);
            this.field2879.setSwapInterval(0);
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
            this.field3107 = this.field3073 = -1;
            this.method267();
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V", line = 439)
    public final void method289(boolean arg0) {
        ++field2885;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lt;Lkp;Lc;[Lju;I)V", line = 447)
    public final void method279(class475[] arg0, class341 arg1, class125 arg2, class83[] arg3, int arg4) {
        ++field3015;
        this.method273(arg0, arg2, arg3, arg4);
        this.method368(arg1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[I[I)Lma;", line = 456)
    public final class10 method325(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field2828;
        return class275.method1805(arg1, arg3, arg0, this, 255, arg2);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[Lqp;)V", line = 465)
    public final void method359(int arg0, class470[] arg1) {
        ++field2834;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field3146[var3] = arg1[var3];
        }
        this.field3066 = arg0;
        if (this.field3103 != 1) {
            this.method1301((byte) 100);
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V", line = 486)
    public final synchronized void method1250(int arg0, int arg1) {
        ++field3004;
        class308 var3 = new class308(arg0);
        this.field3046.method994(var3, -3610);
        if (arg1 != 8448) {
            this.field3136 = -0.6902254F;
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "()Z", line = 499)
    public final boolean method307() {
        ++field2883;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "(IFFFFF)V", line = 507)
    public final void method324(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field2874;
        boolean var7 = ~this.field3107 != ~arg0;
        if (var7 || this.field3121 != arg1 || this.field3062 != arg2) {
            this.field3062 = arg2;
            this.field3121 = arg1;
            this.field3107 = arg0;
            if (var7) {
                this.field3155 = (float) (255 & this.field3107) / 255.0F;
                this.field3130 = (float) (this.field3107 & 16711680) / 1.671168E7F;
                this.field3136 = (float) (this.field3107 & 65280) / 65280.0F;
                this.method1274((byte) 80);
            }
            this.method1256((byte) -40);
        }
        if (this.field3084[0] != arg3 || this.field3084[1] != arg4 || this.field3084[2] != arg5) {
            this.field3084[2] = arg5;
            this.field3084[1] = arg4;
            this.field3084[0] = arg3;
            this.field3101[2] = -arg5;
            this.field3101[1] = -arg4;
            this.field3101[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3147[0] = arg3 * var8;
            this.field3147[1] = arg4 * var8;
            this.field3147[2] = arg5 * var8;
            this.field3148[0] = -this.field3147[0];
            this.field3148[1] = -this.field3147[1];
            this.field3148[2] = -this.field3147[2];
            this.method1305(127);
            this.field3161 = (int) (arg3 * 256.0F / arg4);
            this.field3123 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "YA", descriptor = "()I", line = 558)
    public final int method299() {
        ++field2919;
        return this.field3138;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)Lu;", line = 568)
    public final class54 method337(int arg0) {
        ++field2892;
        class511 var2 = new class511(arg0);
        this.field3031.method994(var2, -3610);
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpc;Lpc;FLpc;)Lpc;", line = 580)
    public final class477 method338(class477 arg0, class477 arg1, float arg2, class477 arg3) {
        ++field2917;
        if (arg0 != null && arg1 != null && this.field3069 && this.field3145) {
            class127 var5 = null;
            class533 var6 = (class533) arg0;
            class533 var7 = (class533) arg1;
            class428 var8 = var6.method930(-11536);
            class428 var9 = var7.method930(-11536);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field6368 >= ~var9.field6368 ? var9.field6368 : var8.field6368;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class127) {
                    class127 var11 = (class127) arg3;
                    if (~var10 == ~var11.method931((byte) 111)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class127(this, var10);
                }
                if (var5.method926(var9, arg2, var8, true)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)V", line = 627)
    private final void method1251(int arg0) {
        ++field2848;
        if (arg0 == -6) {
            int var2 = 0;
            while (!this.field2879.attach()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class434.method2690(10, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "()Z", line = 650)
    public final boolean method346() {
        ++field2846;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lqg;Z)V", line = 659)
    public final void method1252(class325 arg0, boolean arg1) {
        if (arg1) {
            this.field3052 = -0.8356462F;
        }
        OpenGL.glPushMatrix();
        ++field2962;
        OpenGL.glMultMatrixf(arg0.method2073(-123), 0);
    }

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "()Z", line = 674)
    public final boolean method348() {
        ++field2868;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lkp;)V", line = 682)
    public final void method368(class341 arg0) {
        this.field3022.method2060((byte) 122, this, arg0);
        ++field2847;
    }

    @OriginalMember(owner = "client!kd", name = "GA", descriptor = "(IIII)V", line = 691)
    public final void method342(int arg0, int arg1, int arg2, int arg3) {
        ++field2876;
        if (!this.field3092) {
            throw new RuntimeException("");
        } else {
            this.field3139 = arg1;
            this.field3116 = arg3;
            this.field3059 = arg2;
            this.field3098 = arg0;
            this.field3018.field3411.method2383(-23971);
            this.method1323(-73);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIII)V", line = 710)
    public final void method1253(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg2, arg1, arg3);
        ++field2918;
        if (arg0 != 1) {
            this.field3109 = 19;
        }
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "(I)V", line = 723)
    private final void method1254(int arg0) {
        if (~this.field3081 <= ~this.field3127 && ~this.field3085 <= ~this.field3129) {
            OpenGL.glScissor(this.field3158 + this.field3127, -this.field3085 + this.field3157 - -this.field2993, -this.field3127 + this.field3081, -this.field3129 + this.field3085);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field2900;
        if (arg0 != 0) {
            this.method274((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "(IIIIII)V", line = 738)
    public final void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2976;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1290((byte) -123);
        float var10 = (float) arg3 + var8;
        this.method1291(arg5, false);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3060) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3060) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "(IIII)[I", line = 772)
    public final int[] method280(int arg0, int arg1, int arg2, int arg3) {
        ++field2914;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field2993 - var6, arg2, 1, 32993, this.field3078, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "()Z", line = 795)
    public final boolean method358() {
        ++field2972;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()Z", line = 803)
    public final boolean method283() {
        ++field2939;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "()V", line = 812)
    public final void method267() {
        this.field3085 = this.field2993;
        this.field3127 = 0;
        this.field3129 = 0;
        ++field2860;
        this.field3081 = this.field3014;
        OpenGL.glDisable(3089);
        this.method1310(-469);
    }

    @OriginalMember(owner = "client!kd", name = "ZA", descriptor = "()I", line = 827)
    public final int method341() {
        ++field2899;
        int var1 = this.field3173;
        this.field3173 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V", line = 838)
    public final void method287(int arg0, int arg1, int arg2, int arg3) {
        ++field2937;
        this.field3020.method1917(arg3, arg2, arg0, 27795, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "ia", descriptor = "(II)V", line = 850)
    public final void method292(int arg0, int arg1) {
        ++field3010;
        if (~this.field3086 != ~arg0 || ~this.field3138 != ~arg1) {
            this.field3086 = arg0;
            this.field3138 = arg1;
            this.method1247(-127);
            this.method1323(-106);
            if (this.field3103 != 3) {
                if (~this.field3103 == -3) {
                    this.method1243(-119);
                    return;
                }
            } else {
                this.method1293(5889);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLwu;)V", line = 875)
    public final void method1255(byte arg0, class253 arg1) {
        if (arg0 >= 79) {
            ++field2859;
            if (this.field3167 != arg1) {
                if (this.field3070) {
                    OpenGL.glBindBufferARB(34962, arg1.method780(true));
                }
                this.field3167 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 893)
    public final void method290(int arg0) {
        ++field2931;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field3016 = arg0;
            this.field3021.method1770((byte) 127);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[[I[[IIII)Lta;", line = 905)
    public final class145 method361(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2831;
        return new class417(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V", line = 913)
    public final void method318(int arg0) {
        ++field2916;
        this.method1251(-6);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;ILod;)V", line = 921)
    public class188(int arg0, Canvas arg1, class279 arg2, int arg3, class352 arg4) {
        super(arg0, arg2);
        new class143();
        new class412(16);
        this.field3040 = new class137();
        this.field3044 = new class137();
        this.field3045 = new class137();
        this.field3046 = new class137();
        this.field3047 = new class137();
        this.field3048 = new class137();
        this.field3049 = new class137();
        this.field3058 = 0;
        this.field3062 = -1.0F;
        this.field3073 = -1;
        this.field3081 = 0;
        this.field3116 = 0;
        this.field3059 = -1;
        this.field3084 = new float[4];
        this.field3080 = 8448;
        this.field3090 = 3584.0F;
        this.field3099 = 512;
        this.field3088 = 3000.0F;
        this.field3122 = 8448;
        this.field3107 = -1;
        this.field3086 = 50;
        this.field3095 = 0;
        this.field3065 = 3584.0F;
        this.field3121 = -1.0F;
        this.field3109 = 512;
        this.field3124 = 1.0F;
        this.field3128 = true;
        this.field3085 = 0;
        this.field3139 = -1;
        this.field3136 = 1.0F;
        this.field3127 = 0;
        this.field3089 = 0;
        this.field3150 = 1.0F;
        this.field3101 = new float[4];
        this.field3148 = new float[4];
        this.field3120 = 0.0F;
        this.field3147 = new float[4];
        this.field3157 = 0;
        this.field3155 = 1.0F;
        this.field3146 = new class470[class200.field3325];
        this.field3111 = new float[16];
        this.field3130 = 1.0F;
        this.field3158 = 0;
        this.field3129 = 0;
        this.field3094 = -1;
        this.field3138 = 3584;
        this.field3055 = new class23(8192);
        this.field3168 = new int[1];
        this.field3169 = new int[1];
        this.field3172 = new int[1];
        this.field3170 = new byte[16384];
        this.field2989 = this.field2990 = arg1;
        this.field3017 = arg3;
        try {
            if (class345.field5113 == null || !class345.field5113) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class345.field5113 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (!var6.startsWith("mac")) {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2196(false, "jaggl.dll").toString());
                        } else {
                            System.load(arg4.method2196(false, "libjaggl.jnilib").toString());
                        }
                    } else {
                        System.load(arg4.method2196(false, "libjaggl.so").toString());
                    }
                    class345.field5113 = Boolean.TRUE;
                }
            }
            if (class345.field5113 != null && class345.field5113) {
                this.field2879 = new OpenGL();
                this.field2825 = this.field2841 = this.field2879.init(arg1, 8, 8, 8, 24, 0, this.field3017);
                if (this.field2841 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method1251(-6);
                    int var7 = this.method1259(0);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field3078 = !this.field3141 ? 5121 : 33639;
                        if (~this.field3126.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class23.method170(16943, ' ', this.field3126.replace('/', ' '));
                            for (int var12 = 0; var12 < var11.length; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (var13.length() > 0) {
                                        if (~var13.charAt(0) == -121 && var13.length() >= 3 && class4.method13(-71, var13.substring(1, 3))) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (~var13.length() <= -5 && class4.method13(-125, var13.substring(0, 4))) {
                                                var8 = class64.method555((byte) 124, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && var8 <= 9250) {
                                    this.field3152 = false;
                                }
                                if (var8 >= 7000 && ~var8 >= -8000) {
                                    this.field3070 = false;
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field3165 = false;
                            }
                            this.field3051 &= this.field2879.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field3087 = this.field3070;
                            this.field3114 = true;
                        }
                        if (~this.field3162.indexOf("intel") != 0) {
                            this.field3145 = false;
                        }
                        this.field3093 = !this.field3162.equals("s3 graphics");
                        if (this.field3070) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class257.method1714((byte) -89, false, true);
                        this.field3030 = true;
                        this.field3021 = new class266(this, super.field524);
                        this.method1279((byte) -106);
                        this.field3026 = new class203(this);
                        this.field3020 = new class294(this);
                        if (this.field3020.method1910(0)) {
                            this.field3019 = new class76(this);
                            if (!this.field3019.method651((byte) 66)) {
                                this.field3019.method649(-27396);
                                this.field3019 = null;
                            }
                        }
                        this.field3018 = new class209(this);
                        this.method1249((byte) -64);
                        this.method1286(125);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field2879.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class434.method2690(10, 100L);
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
            this.method349();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V", line = 1121)
    private final void method1256(byte arg0) {
        class108.field1515[0] = this.field3130 * this.field3121;
        class108.field1515[1] = this.field3136 * this.field3121;
        class108.field1515[2] = this.field3155 * this.field3121;
        ++field2961;
        class108.field1515[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class108.field1515, 0);
        class108.field1515[0] = -this.field3062 * this.field3130;
        if (arg0 < -7) {
            class108.field1515[1] = -this.field3062 * this.field3136;
            class108.field1515[2] = -this.field3062 * this.field3155;
            class108.field1515[3] = 1.0F;
            OpenGL.glLightfv(16385, 4609, class108.field1515, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIZ)V", line = 1146)
    public final void method1257(int arg0, boolean arg1, int arg2, boolean arg3) {
        ++field2952;
        if (arg2 <= 7) {
            this.method1243(34);
        }
        if (this.field3072 != arg0) {
            if (~arg0 > -1) {
                this.method1278(5890);
                this.method1289(-19391, (class454) null);
                this.method1248(0, true);
                if (!this.field3092) {
                    this.field3018.method1448(arg3, arg1, false, 0);
                }
            } else {
                class361 var5 = this.field3021.method1771((byte) 112, arg0);
                class281 var6 = super.field524.method584(true, arg0);
                if (~var6.field4269 == -1 && var6.field4276 == 0) {
                    this.method1278(5890);
                } else {
                    int var7 = !var6.field4257 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method1275((float) (this.field3027 % var8 * var6.field4269) / (float) var8, (byte) -34, (float) (this.field3027 % var8 * var6.field4276) / (float) var8, 0.0F);
                }
                if (this.field3092) {
                    this.field3018.method1448(arg3, arg1, false, 3);
                    this.method1289(-19391, var5);
                    this.method1248(var6.field4266, true);
                } else {
                    this.field3018.method1448(arg3, arg1, false, var6.field4261);
                    this.field3018.method1450(var6.field4264, var6.field4258, 0);
                    if (!this.field3018.method1446(var5, var6.field4266, (byte) -88)) {
                        this.method1289(-19391, var5);
                        this.method1248(var6.field4266, true);
                    }
                }
            }
            this.field3072 = arg0;
        }
        this.field3076 &= -8;
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "()V", line = 1211)
    public final void method306() {
        this.method1294(true, 34165);
        ++field2968;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FFFBF)V", line = 1224)
    public final void method1258(float arg0, float arg1, float arg2, byte arg3, float arg4) {
        class108.field1515[2] = arg4;
        if (arg3 <= 112) {
            this.field3045 = null;
        }
        class108.field1515[3] = arg1;
        ++field2844;
        class108.field1515[1] = arg2;
        class108.field1515[0] = arg0;
        OpenGL.glTexEnvfv(8960, 8705, class108.field1515, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 1242)
    public final void method265(int arg0) {
        ++field2928;
        this.method1241(true);
    }

    @OriginalMember(owner = "client!kd", name = "IA", descriptor = "()I", line = 1252)
    public final int method353() {
        ++field2901;
        return this.field3041 - -this.field3042 + this.field3043;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII)V", line = 1260)
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2967;
    }

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "()V", line = 1268)
    public final void method343() {
        ++field3002;
        this.field3020.method1914(96);
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)I", line = 1278)
    private final int method1259(int arg0) {
        ++field2973;
        this.field3162 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = arg0;
        this.field3126 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field3162.indexOf("microsoft") != -1) {
            var2 = arg0 | 1;
        }
        if (this.field3162.indexOf("brian paul") != -1 || this.field3162.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class23.method170(16943, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class64.method555((byte) 124, var4[0]);
                int var6 = class64.method555((byte) 124, var4[1]);
                this.field3144 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field3144 > -13) {
            var2 |= 2;
        }
        if (!this.field2879.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field2879.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field3097 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field3115 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field3163 = var7[0];
        if (this.field3097 < 2 || ~this.field3115 > -3 || this.field3163 < 2) {
            var2 |= 16;
        }
        this.field3141 = NativeStream.method2725();
        this.field2879.arePbuffersAvailable();
        this.field3070 = this.field2879.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3060 = this.field2879.isExtensionAvailable("GL_ARB_multisample");
        this.field3074 = this.field2879.isExtensionAvailable("GL_ARB_vertex_program");
        this.field2879.isExtensionAvailable("GL_ARB_fragment_program");
        this.field3119 = this.field2879.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field3166 = this.field2879.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field3152 = this.field2879.isExtensionAvailable("GL_EXT_texture3D");
        this.field3051 = this.field2879.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field3069 = this.field2879.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field3165 = this.field2879.isExtensionAvailable("GL_ARB_texture_float");
        this.field3077 = false;
        this.field3145 = this.field2879.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field3133 = this.field2879.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field3075 = this.field2879.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field3149 = this.field3133 & this.field3075;
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "()Z", line = 1356)
    public final boolean method327() {
        ++field2842;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 1364)
    public final synchronized void method1260(int arg0, byte arg1) {
        ++field3006;
        class431 var3 = new class431();
        var3.field6388 = (long) arg0;
        if (arg1 > 54) {
            this.field3048.method994(var3, -3610);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1378)
    public final void method272(Canvas arg0) {
        this.field2989 = null;
        ++field3013;
        this.field2825 = 0L;
        if (arg0 != null && this.field2990 != arg0) {
            if (this.field2940.containsKey(arg0)) {
                Long var2 = (Long) this.field2940.get(arg0);
                this.field2825 = var2;
                this.field2989 = arg0;
            }
        } else {
            this.field2989 = this.field2990;
            this.field2825 = this.field2841;
        }
        if (this.field2989 != null && ~this.field2825 != -1L) {
            this.field2879.setSurface(this.field2825);
            this.method1286(106);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "(I)Lgl;", line = 1409)
    public final class428 method1261(int arg0) {
        if (arg0 != 16386) {
            this.field3018 = null;
        }
        ++field2977;
        return this.field3156 != null ? this.field3156.method930(-11536) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lu;)V", line = 1420)
    public final void method281(class54 arg0) {
        this.field3029 = ((class511) arg0).field7462;
        ++field2971;
        if (this.field3132 == null) {
            class23 var2 = new class23(80);
            if (!this.field3141) {
                var2.method171(-1.0F, (byte) 51);
                var2.method171(-1.0F, (byte) 51);
                var2.method171(0.0F, (byte) 51);
                var2.method171(0.0F, (byte) 51);
                var2.method171(1.0F, (byte) 51);
                var2.method171(1.0F, (byte) 51);
                var2.method171(-1.0F, (byte) 51);
                var2.method171(0.0F, (byte) 51);
                var2.method171(1.0F, (byte) 51);
                var2.method171(1.0F, (byte) 51);
                var2.method171(1.0F, (byte) 51);
                var2.method171(1.0F, (byte) 51);
                var2.method171(0.0F, (byte) 51);
                var2.method171(1.0F, (byte) 51);
                var2.method171(0.0F, (byte) 51);
                var2.method171(-1.0F, (byte) 51);
                var2.method171(1.0F, (byte) 51);
                var2.method171(0.0F, (byte) 51);
                var2.method171(0.0F, (byte) 51);
                var2.method171(0.0F, (byte) 51);
            } else {
                var2.method173(-1.0F, 101127152);
                var2.method173(-1.0F, 101127152);
                var2.method173(0.0F, 101127152);
                var2.method173(0.0F, 101127152);
                var2.method173(1.0F, 101127152);
                var2.method173(1.0F, 101127152);
                var2.method173(-1.0F, 101127152);
                var2.method173(0.0F, 101127152);
                var2.method173(1.0F, 101127152);
                var2.method173(1.0F, 101127152);
                var2.method173(1.0F, 101127152);
                var2.method173(1.0F, 101127152);
                var2.method173(0.0F, 101127152);
                var2.method173(1.0F, 101127152);
                var2.method173(0.0F, 101127152);
                var2.method173(-1.0F, 101127152);
                var2.method173(1.0F, 101127152);
                var2.method173(0.0F, 101127152);
                var2.method173(0.0F, 101127152);
                var2.method173(0.0F, 101127152);
            }
            this.field3132 = this.method1320(20, false, 107, var2.field3572, var2.field3556);
            this.field3083 = new class481(this.field3132, 5126, 3, 0);
            this.field3112 = new class481(this.field3132, 5126, 2, 12);
            this.field3022.method2065(this, -74);
        }
    }

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "()Z", line = 1485)
    public final boolean method340() {
        ++field2872;
        return this.field3019 != null && this.field3019.method2828(47);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V", line = 1495)
    public final synchronized void method1262(int arg0, int arg1, int arg2) {
        ++field2835;
        class308 var4 = new class308(arg2);
        var4.field6388 = (long) arg1;
        if (arg0 < -64) {
            this.field3047.method994(var4, -3610);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)Lsr;", line = 1517)
    public static final class168 method1263(int arg0, int arg1, int arg2) {
        class138 var3 = client.field3311[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2115;
    }

    @OriginalMember(owner = "client!kd", name = "JA", descriptor = "(IIIIII)Z", line = 1524)
    public final boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3011;
        float var7 = (float) arg2 * this.field3063.field4864 + (float) arg0 * this.field3063.field4885 + (float) arg1 * this.field3063.field4884 + this.field3063.field4889;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3063.field4864 + (float) arg3 * this.field3063.field4885 + (float) arg4 * this.field3063.field4884 + this.field3063.field4889;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field3086) || !(var8 < (float) this.field3086)) && (!((float) this.field3138 < var7) || !((float) this.field3138 < var8))) {
            int var9 = (int) (((float) arg2 * this.field3063.field4871 + (float) arg0 * this.field3063.field4877 + (float) arg1 * this.field3063.field4879 + this.field3063.field4875) * (float) this.field3109 / var7);
            int var10 = (int) (((float) arg5 * this.field3063.field4871 + (float) arg3 * this.field3063.field4877 + (float) arg4 * this.field3063.field4879 + this.field3063.field4875) * (float) this.field3109 / var8);
            if ((float) var9 < this.field3056 && (float) var10 < this.field3056 || (float) var9 > this.field3105 && (float) var10 > this.field3105) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field3063.field4895 + (float) arg0 * this.field3063.field4876 + (float) arg1 * this.field3063.field4894 + this.field3063.field4887) * (float) this.field3099 / var7);
                int var12 = (int) (((float) arg5 * this.field3063.field4895 + (float) arg3 * this.field3063.field4876 + (float) arg4 * this.field3063.field4894 + this.field3063.field4887) * (float) this.field3099 / var8);
                return (!((float) var11 < this.field3113) || !((float) var12 < this.field3113)) && (!((float) var11 > this.field3052) || !((float) var12 > this.field3052));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsf;I)V", line = 1563)
    public final void method1264(class365 arg0, int arg1) {
        ++field2863;
        if (this.field3039 >= 0 && this.field3032[this.field3039] == arg0) {
            this.field3032[this.field3039--] = null;
            if (arg1 != -112) {
                this.method281((class54) null);
            }
            arg0.method2286(arg1 ^ 30315);
            if (~this.field3039 > -1) {
                this.field3035 = null;
            } else {
                this.field3035 = this.field3032[this.field3039];
                this.field3035.method2287(4509);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIIII)Lpc;", line = 1587)
    public final class477 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2936;
        return !this.field3069 ? null : new class221(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "(I)V", line = 1595)
    private final void method1265(int arg0) {
        OpenGL.glDepthMask(this.field3108 && this.field3128);
        if (arg0 == 0) {
            ++field2905;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIII)V", line = 1607)
    public final void method1266(int arg0, int arg1, int arg2, int arg3) {
        ++field2947;
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
        OpenGL.glTexEnvi(arg3, arg1 + 34192, arg0);
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "()Lc;", line = 1620)
    public final class125 method296() {
        ++field2855;
        return this.field3023;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lgi;Lgi;BLgi;Lgi;)V", line = 1629)
    public final void method1267(class481 arg0, class481 arg1, byte arg2, class481 arg3, class481 arg4) {
        ++field2884;
        if (arg3 != null) {
            this.method1255((byte) 105, arg3.field6921);
            OpenGL.glVertexPointer(arg3.field6923, arg3.field6919, this.field3167.method782(-10485), this.field3167.method784(17555) + (long) arg3.field6922);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg0 != null) {
            this.method1255((byte) 124, arg0.field6921);
            OpenGL.glNormalPointer(arg0.field6919, this.field3167.method782(-10485), this.field3167.method784(17555) + (long) arg0.field6922);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg2 > -32) {
            this.method269(42, -21, 6, 100, false);
        }
        if (arg4 != null) {
            this.method1255((byte) 88, arg4.field6921);
            OpenGL.glColorPointer(arg4.field6923, arg4.field6919, this.field3167.method782(-10485), this.field3167.method784(17555) - -((long) arg4.field6922));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg1 != null) {
            this.method1255((byte) 113, arg1.field6921);
            OpenGL.glTexCoordPointer(arg1.field6923, arg1.field6919, this.field3167.method782(-10485), this.field3167.method784(17555) - -((long) arg1.field6922));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "()Z", line = 1679)
    public final boolean method355() {
        ++field3007;
        return this.field3019 != null && (~this.field3017 >= -2 || this.field3149);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V", line = 1687)
    public final void method1268(byte arg0) {
        ++field2934;
        if (arg0 == -58) {
            if (~this.field3076 != -17) {
                this.method1295((byte) -116);
                this.method1303(true, 20873);
                this.method1299(false, true);
                this.method1294(true, 34165);
                this.method1291(1, false);
                this.method1248(0, true);
                this.field3076 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1711)
    public final void method300(Canvas arg0) {
        ++field2997;
        if (this.field2990 == arg0) {
            throw new RuntimeException();
        } else if (!this.field2940.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field2879.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field2940.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsf;B)V", line = 1746)
    public final void method1269(class365 arg0, byte arg1) {
        ++field2827;
        if (this.field3037 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg1 < 47) {
                this.method307();
            }
            if (~this.field3037 <= -1) {
                this.field3033[this.field3037].method2283(true);
            }
            this.field3038 = this.field3033[++this.field3037] = arg0;
            this.field3038.method2288(21884);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1766)
    public final void method294(Canvas arg0) {
        ++field2888;
        if (this.field2990 == arg0) {
            throw new RuntimeException();
        } else if (this.field2940.containsKey(arg0)) {
            Long var2 = (Long) this.field2940.get(arg0);
            this.field2879.releaseSurface(arg0, var2);
            this.field2940.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpl;IIII)V", line = 1786)
    public final void method1270(class463 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2926;
        int var6 = arg0.method154((byte) -90);
        if (arg4 != -2) {
            this.method1287(15);
        }
        int var7 = arg2 * this.method1311(var6, (byte) -67);
        this.method1246(120, arg0);
        OpenGL.glDrawElements(arg3, arg1, var6, (long) var7 + arg0.method157(arg4 + -78));
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIZ)Ll;", line = 1805)
    public final class16 method269(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2882;
        return new class485(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "(I)V", line = 1815)
    public final void method1271(int arg0) {
        if (arg0 == -9744) {
            if (this.field3076 != 8) {
                this.method1285((byte) 66);
                this.method1303(true, 20873);
                this.method1299(false, true);
                this.method1294(true, arg0 + 43909);
                this.method1291(1, false);
                this.method1248(0, true);
                this.field3076 = 8;
            }
            ++field2889;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V", line = 1837)
    public final void method1272(boolean arg0, int arg1) {
        ++field2880;
        if (!arg0 == this.field3106) {
            this.field3106 = arg0;
            this.method1309((byte) -88);
            this.field3076 &= -8;
        }
        int var3 = 1 % ((27 - arg1) / 49);
    }

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "(I)V", line = 1855)
    public final void method360(int arg0) {
        ++field3003;
        this.method1291(0, false);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLqg;)V", line = 1868)
    public final void method1273(byte arg0, class325 arg1) {
        ++field2829;
        int var3 = 110 % ((-12 - arg0) / 55);
        OpenGL.glLoadMatrixf(arg1.method2073(-68), 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 1879)
    public final void method282(boolean arg0) {
        this.field3128 = arg0;
        ++field2910;
        this.method1265(0);
    }

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "(III[I)V", line = 1892)
    public final void method356(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2946;
        float var5 = (float) arg2 * this.field3063.field4864 + (float) arg0 * this.field3063.field4885 + (float) arg1 * this.field3063.field4884 + this.field3063.field4889;
        if (!((float) this.field3086 > var5) && !((float) this.field3138 < var5)) {
            int var6 = (int) (((float) arg2 * this.field3063.field4871 + (float) arg0 * this.field3063.field4877 + (float) arg1 * this.field3063.field4879 + this.field3063.field4875) * (float) this.field3109 / var5);
            int var7 = (int) (((float) arg2 * this.field3063.field4895 + (float) arg0 * this.field3063.field4876 + (float) arg1 * this.field3063.field4894 + this.field3063.field4887) * (float) this.field3099 / var5);
            if ((float) var6 >= this.field3056 && this.field3105 >= (float) var6 && this.field3113 <= (float) var7 && (float) var7 <= this.field3052) {
                arg3[0] = (int) ((float) var6 + -this.field3056);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field3113);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V", line = 1924)
    private final void method1274(byte arg0) {
        if (arg0 != 80) {
            this.field3058 = -4;
        }
        class108.field1515[3] = 1.0F;
        ++field2956;
        class108.field1515[0] = this.field3134 * this.field3130;
        class108.field1515[1] = this.field3136 * this.field3134;
        class108.field1515[2] = this.field3155 * this.field3134;
        OpenGL.glLightModelfv(2899, class108.field1515, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FBFF)V", line = 1940)
    private final void method1275(float arg0, byte arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        if (arg1 < -32) {
            ++field2951;
            if (this.field3091) {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glTranslatef(arg0, arg2, arg3);
            OpenGL.glMatrixMode(5888);
            this.field3091 = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V", line = 1958)
    public final synchronized void method1276(long arg0, int arg1) {
        if (arg1 < 61) {
            this.method315();
        }
        ++field2965;
        class431 var4 = new class431();
        var4.field6388 = arg0;
        this.field3049.method994(var4, -3610);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIII)Ll;", line = 1972)
    public final class16 method350(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2913;
        return new class485(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kd", name = "AA", descriptor = "(IIII)V", line = 1981)
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        this.field3116 = arg3;
        this.field3092 = true;
        this.field3059 = arg2;
        this.field3098 = arg0;
        this.field3139 = arg1;
        ++field2903;
        this.field3018.method1448(false, false, false, 3);
        this.field3018.field3411.method2383(-23971);
        this.method1323(-104);
        this.method1317(2912);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)I", line = 2001)
    public final int method1277(int arg0, byte arg1) {
        ++field3012;
        if (arg0 != 1) {
            if (arg0 == 0) {
                return 8448;
            } else if (~arg0 == -3) {
                return 34165;
            } else if (~arg0 == -4) {
                return 260;
            } else if (~arg0 == -5) {
                return 34023;
            } else if (arg1 > -93) {
                return 1;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!kd", name = "da", descriptor = "([I)V", line = 2032)
    public final void method351(int[] arg0) {
        arg0[2] = this.field3081;
        ++field2833;
        arg0[0] = this.field3127;
        arg0[1] = this.field3129;
        arg0[3] = this.field3085;
    }

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "(I)V", line = 2043)
    private final void method1278(int arg0) {
        ++field2896;
        if (this.field3091) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field3091 = false;
        }
        if (arg0 != 5890) {
            this.method325(61, -121, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)V", line = 2061)
    private final void method1279(byte arg0) {
        this.field3063 = new class325();
        ++field2932;
        this.field3061 = new class325();
        this.field3143 = new class454[this.field3097];
        this.field3068 = new class361(this, 3553, 6408, 1, 1);
        new class361(this, 3553, 6408, 1, 1);
        new class361(this, 3553, 6408, 1, 1);
        if (arg0 > -72) {
            this.field3136 = 1.0050539F;
        }
        this.field3135 = new class504(this);
        this.field3064 = new class504(this);
        this.field3071 = new class504(this);
        this.field3050 = new class504(this);
        this.field3131 = new class504(this);
        this.field3054 = new class504(this);
        this.field3137 = new class504(this);
        this.field3125 = new class504(this);
        this.field3079 = new class504(this);
        this.field3082 = new class504(this);
        if (this.field3145) {
            this.field3110 = new class395(this);
            new class395(this);
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "()V", line = 2104)
    public final void method320() {
        ++field2839;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(III)V", line = 2111)
    public final synchronized void method1280(int arg0, int arg1, int arg2) {
        ++field2895;
        if (arg0 <= 42) {
            this.field3108 = false;
        }
        class308 var4 = new class308(arg1);
        var4.field6388 = (long) arg2;
        this.field3044.method994(var4, -3610);
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "()Z", line = 2126)
    public final boolean method328() {
        ++field2838;
        if (this.field3019 != null) {
            if (!this.field3019.method2828(47)) {
                if (!this.field3020.method1909(this.field3019, 115)) {
                    return false;
                }
                this.field3021.method1770((byte) 123);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(III)V", line = 2151)
    public final void method1281(int arg0, int arg1, int arg2) {
        int var4 = 23 / ((-44 - arg0) / 49);
        ++field2843;
        this.field3157 = arg1;
        this.field3158 = arg2;
        this.method1298((byte) 109);
        this.method1254(0);
    }

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "(I)V", line = 2169)
    public final void method1282(int arg0) {
        OpenGL.glPushMatrix();
        ++field2957;
        int var2 = -32 / ((9 - arg0) / 40);
    }

    @OriginalMember(owner = "client!kd", name = "xa", descriptor = "()F", line = 2184)
    public final float method275() {
        ++field2938;
        return this.field3164;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2192)
    public final void method274(Canvas arg0) {
        ++field2922;
        long var2 = 0L;
        if (arg0 != null && this.field2990 != arg0) {
            if (this.field2940.containsKey(arg0)) {
                Long var4 = (Long) this.field2940.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field2841;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field2879.surfaceResized(var2);
            if (this.field2989 == arg0) {
                this.method1286(90);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "()V", line = 2223)
    public final void method297() {
        if (this.field3019 != null && this.field3019.method2828(47)) {
            this.field3020.method1916(this.field3019, (byte) 11);
            this.field3021.method1770((byte) 124);
        }
        ++field2854;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsf;Z)V", line = 2239)
    public final void method1283(class365 arg0, boolean arg1) {
        ++field2830;
        if (!arg1) {
            this.method1323(76);
        }
        if (!this.field3133) {
            if (~this.field3034 <= -1 && this.field3036[this.field3034] == arg0) {
                this.field3036[this.field3034--] = null;
                arg0.method2284(-69);
                if (~this.field3034 <= -1) {
                    this.field3038 = this.field3035 = this.field3036[this.field3034];
                    this.field3038.method2285(-27017);
                } else {
                    this.field3038 = this.field3035 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method1318(arg0, 120);
            this.method1264(arg0, -112);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V", line = 2274)
    public final void method329(boolean arg0) {
        ++field2886;
    }

    @OriginalMember(owner = "client!kd", name = "DA", descriptor = "(IIIIII[BII)V", line = 2283)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field2943;
        float var10;
        float var11;
        if (this.field3100 != null && ~arg2 >= ~this.field3100.field5353 && arg3 <= this.field3100.field5357) {
            this.field3100.method2265(arg6, 0, 0, false, 0, 0, arg2, 6406, arg3, -107);
            var10 = (float) arg3 * this.field3100.field658 / (float) this.field3100.field5357;
            var11 = (float) arg2 * this.field3100.field664 / (float) this.field3100.field5353;
        } else {
            this.field3100 = class100.method806((byte) -102, arg2, 6406, arg3, false, this, 6406, arg6);
            this.field3100.method2270(false, false, 10243);
            var11 = this.field3100.field664;
            var10 = this.field3100.field658;
        }
        this.method1314(2);
        this.method1289(-19391, this.field3100);
        this.method1291(arg8, false);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1292(arg5, false);
        this.method1242(34162, 34165, 34165);
        this.method1266(768, 0, 34166, 8960);
        this.method1266(770, 2, 5890, 8960);
        this.method1296(770, 34166, 0, (byte) 99);
        this.method1296(770, 5890, 2, (byte) -88);
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
        this.method1266(768, 0, 5890, 8960);
        this.method1266(770, 2, 34166, 8960);
        this.method1296(770, 5890, 0, (byte) -99);
        this.method1296(770, 34166, 2, (byte) -118);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILsf;)V", line = 2340)
    public final void method1284(int arg0, class365 arg1) {
        if (arg0 == 5122) {
            ++field2958;
            if (this.field3133) {
                this.method1269(arg1, (byte) 71);
                this.method1315(arg0 ^ 5122, arg1);
            } else if (~this.field3034 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field3034 >= 0) {
                    this.field3036[this.field3034].method2284(-110);
                }
                this.field3038 = this.field3035 = this.field3036[++this.field3034] = arg1;
                this.field3038.method2285(-27017);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)V", line = 2370)
    private final void method1285(byte arg0) {
        ++field2963;
        if (this.field3103 != 2) {
            this.field3103 = 2;
            this.method1243(arg0 + -138);
            this.method1244(26632);
            this.field3076 &= -8;
        }
        if (arg0 != 66) {
            this.field3072 = 57;
        }
    }

    @OriginalMember(owner = "client!kd", name = "UA", descriptor = "(III)V", line = 2388)
    public final void method371(int arg0, int arg1, int arg2) {
        ++field2836;
        if (~this.field3073 != ~arg0 || this.field3094 != arg1 || ~this.field3058 != ~arg2) {
            this.field3058 = arg2;
            this.field3073 = arg0;
            this.field3094 = arg1;
            if (this.field3092) {
                return;
            }
            this.method1323(-91);
            this.method1317(2912);
        }
    }

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "(I)V", line = 2414)
    private final void method1286(int arg0) {
        if (arg0 <= 72) {
            this.method282(true);
        }
        ++field2857;
        if (this.field2989 != null) {
            Dimension var2 = this.field2989.getSize();
            this.field2921 = var2.width;
            this.field2923 = var2.height;
        } else {
            this.field2921 = this.field2923 = 0;
        }
        if (this.field3035 == null) {
            this.field2993 = this.field2923;
            this.field3014 = this.field2921;
            this.method1298((byte) 85);
        }
        this.method1287(0);
        this.method267();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpc;)V", line = 2444)
    public final void method370(class477 arg0) {
        this.field3156 = (class533) arg0;
        ++field2878;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 2452)
    public final synchronized void method302(int arg0) {
        ++field2840;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field3044.method1005((byte) 111)) {
            class308 var12 = (class308) this.field3044.method1001(-16153);
            class80.field1144[var3++] = (int) var12.field6388;
            this.field3041 -= var12.field4638;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class80.field1144, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class80.field1144, 0);
            var3 = 0;
        }
        while (!this.field3045.method1005((byte) 81)) {
            class308 var11 = (class308) this.field3045.method1001(-16153);
            class80.field1144[var3++] = (int) var11.field6388;
            this.field3042 -= var11.field4638;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class80.field1144, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class80.field1144, 0);
            var3 = 0;
        }
        while (!this.field3046.method1005((byte) -83)) {
            class308 var10 = (class308) this.field3046.method1001(-16153);
            class80.field1144[var3++] = var10.field4638;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class80.field1144, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class80.field1144, 0);
            var3 = 0;
        }
        while (!this.field3047.method1005((byte) -62)) {
            class308 var9 = (class308) this.field3047.method1001(-16153);
            class80.field1144[var3++] = (int) var9.field6388;
            this.field3043 -= var9.field4638;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class80.field1144, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class80.field1144, 0);
            boolean var4 = false;
        }
        while (!this.field3040.method1005((byte) -127)) {
            class308 var8 = (class308) this.field3040.method1001(-16153);
            OpenGL.glDeleteLists((int) var8.field6388, var8.field4638);
        }
        while (!this.field3048.method1005((byte) 65)) {
            class431 var7 = this.field3048.method1001(-16153);
            OpenGL.glDeleteProgramARB((int) var7.field6388);
        }
        while (!this.field3049.method1005((byte) 91)) {
            class431 var6 = this.field3049.method1001(-16153);
            OpenGL.glDeleteObjectARB(var6.field6388);
        }
        while (!this.field3040.method1005((byte) -101)) {
            class308 var5 = (class308) this.field3040.method1001(-16153);
            OpenGL.glDeleteLists((int) var5.field6388, var5.field4638);
        }
        this.field3021.method1774(5);
        if (~this.method353() < -100663297 && ~(this.field3142 - -60000L) > ~class493.method2937(-83)) {
            System.gc();
            this.field3142 = class493.method2937(-85);
        }
        this.field3027 = var2;
    }

    @OriginalMember(owner = "client!kd", name = "MA", descriptor = "(I)V", line = 2617)
    public final void method321(int arg0) {
        this.field3028 = 0;
        ++field2861;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field3028;
        }
        this.field3025 = 1 << this.field3028;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()Lc;", line = 2632)
    public final class125 method291() {
        ++field2935;
        return new class325();
    }

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "(I)V", line = 2640)
    public final void method1287(int arg0) {
        if (this.field3103 != arg0) {
            this.field3103 = 0;
            this.field3076 &= -32;
        }
        ++field2999;
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)V", line = 2654)
    private final void method1288(byte arg0) {
        if (this.field3103 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field3014 > 0 && ~this.field2993 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field3014, (double) this.field2993, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field3103 = 1;
            this.field3076 &= -25;
        }
        if (arg0 != -102) {
            this.method306();
        }
        ++field2832;
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "()V", line = 2679)
    public final void method357() {
        try {
            this.field2879.swapBuffers();
        } catch (Exception var1) {
        }
        ++field2945;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILav;)V", line = 2700)
    public final void method1289(int arg0, class454 arg1) {
        ++field2948;
        if (arg0 == -19391) {
            class454 var3 = this.field3143[this.field3154];
            if (arg1 != var3) {
                if (arg1 == null) {
                    OpenGL.glDisable(var3.field6610);
                } else {
                    if (var3 == null) {
                        OpenGL.glEnable(arg1.field6610);
                    } else if (arg1.field6610 != var3.field6610) {
                        OpenGL.glDisable(var3.field6610);
                        OpenGL.glEnable(arg1.field6610);
                    }
                    OpenGL.glBindTexture(arg1.field6610, arg1.method2761(3));
                }
                this.field3143[this.field3154] = arg1;
            }
            this.field3076 &= -2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)V", line = 2739)
    private final void method1290(byte arg0) {
        ++field2941;
        if (arg0 != -123) {
            this.field2940 = null;
        }
        if (this.field3076 != 1) {
            this.method1288((byte) -102);
            this.method1303(false, 20873);
            this.method1272(false, -120);
            this.method1299(false, false);
            this.method1294(false, 34165);
            this.method1289(-19391, (class454) null);
            this.method1304(-26349, -2);
            this.method1248(1, true);
            this.field3076 = 1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)V", line = 2764)
    public final void method1291(int arg0, boolean arg1) {
        if (arg1) {
            this.method328();
        }
        if (~this.field3151 != ~arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg0 == 1) {
                var3 = 1;
                var4 = true;
                var5 = true;
            } else if (arg0 != 2) {
                if (~arg0 != -129) {
                    var5 = false;
                    var4 = true;
                    var3 = 0;
                } else {
                    var4 = true;
                    var3 = 3;
                    var5 = true;
                }
            } else {
                var4 = true;
                var3 = 2;
                var5 = false;
            }
            if (this.field3096 != var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field3096 = var4;
            }
            if (this.field3057 == !var5) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field3057 = var5;
            }
            if (~this.field3067 != ~var3) {
                if (~var3 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var3 == 2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (var3 != 3) {
                    OpenGL.glDisable(3042);
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                }
                this.field3067 = var3;
            }
            this.field3151 = arg0;
            this.field3076 &= -29;
        }
        ++field2891;
    }

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "()V", line = 2862)
    public final void method349() {
        for (class431 var1 = this.field3031.method1004((byte) -95); var1 != null; var1 = this.field3031.method996(1)) {
            ((class511) var1).method3037((byte) -14);
        }
        ++field2890;
        if (this.field3020 != null) {
            this.field3020.method1911((byte) -121);
        }
        if (this.field2879 != null) {
            this.method1241(true);
            Enumeration var2 = this.field2940.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field2940.get(var3);
                this.field2879.releaseSurface(var3, var4);
            }
            this.field2879.release();
            this.field2879 = null;
        }
        if (this.field3030) {
            class130.method964((byte) -126, true, false);
            this.field3030 = false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IZ)V", line = 2906)
    public final void method1292(int arg0, boolean arg1) {
        class108.field1515[0] = (float) class74.method644(16711680, arg0) / 1.671168E7F;
        ++field2920;
        class108.field1515[1] = (float) class74.method644(arg0, 65280) / 65280.0F;
        if (arg1) {
            this.method301();
        }
        class108.field1515[3] = (float) (arg0 >>> 24) / 255.0F;
        class108.field1515[2] = (float) class74.method644(255, arg0) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class108.field1515, 0);
    }

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "()Z", line = 2921)
    public final boolean method354() {
        ++field2907;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)I", line = 2931)
    public final int method317(int arg0, int arg1) {
        ++field2974;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "(IIII)V", line = 2940)
    public final void method268(int arg0, int arg1, int arg2, int arg3) {
        ++field2877;
        this.field3099 = arg3;
        this.field3089 = arg1;
        this.field3109 = arg2;
        this.field3095 = arg0;
        this.method1247(-118);
        this.method1310(-469);
        if (this.field3103 != 3) {
            if (this.field3103 == 2) {
                this.method1243(-52);
                return;
            }
        } else {
            this.method1293(5889);
        }
    }

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "(I)V", line = 2963)
    private final void method1293(int arg0) {
        ++field2873;
        float var2 = (float) (-this.field3095) * this.field3124 / (float) this.field3109;
        float var3 = (float) (-this.field3089) * this.field3124 / (float) this.field3099;
        float var4 = (float) (-this.field3095 + this.field3014) * this.field3124 / (float) this.field3109;
        float var5 = (float) (-this.field3089 + this.field2993) * this.field3124 / (float) this.field3099;
        OpenGL.glMatrixMode(arg0);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field3086 + -this.field3164), (double) ((float) this.field3138 + -this.field3164));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "(F)V", line = 2985)
    public final void method271(float arg0) {
        ++field2991;
        if (this.field3134 != arg0) {
            this.field3134 = arg0;
            this.method1274((byte) 80);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V", line = 3003)
    public final void method1294(boolean arg0, int arg1) {
        ++field2960;
        if (arg1 == 34165) {
            if (!this.field3108 == arg0) {
                this.field3108 = arg0;
                this.method1265(0);
                this.field3076 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIIII)V", line = 3024)
    public final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2975;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method1290((byte) -123);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method1291(arg5, false);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3060) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3060) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(B)V", line = 3057)
    private final void method1295(byte arg0) {
        ++field2969;
        if (arg0 > -77) {
            this.field3118 = true;
        }
        if (this.field3103 != 3) {
            this.field3103 = 3;
            this.method1293(5889);
            this.method1244(26632);
            this.field3076 &= -8;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIB)V", line = 3077)
    public final void method1296(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glTexEnvi(8960, 34184 - -arg2, arg1);
        ++field2869;
        OpenGL.glTexEnvi(8960, 34200 - -arg2, arg0);
        int var5 = -112 / ((arg3 - 14) / 48);
    }

    @OriginalMember(owner = "client!kd", name = "fa", descriptor = "(IIII)V", line = 3090)
    public final void method344(int arg0, int arg1, int arg2, int arg3) {
        ++field2979;
        if (this.field3129 < arg1) {
            this.field3129 = arg1;
        }
        if (~arg0 < ~this.field3127) {
            this.field3127 = arg0;
        }
        if (~arg3 > ~this.field3085) {
            this.field3085 = arg3;
        }
        if (~arg2 > ~this.field3081) {
            this.field3081 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method1310(-469);
        this.method1254(0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FBF)V", line = 3115)
    public final void method1297(float arg0, byte arg1, float arg2) {
        this.field3150 = arg2;
        this.field3120 = arg0;
        if (arg1 == 121) {
            ++field2984;
            if (!this.field3092) {
                this.method1323(arg1 + -200);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(B)V", line = 3132)
    private final void method1298(byte arg0) {
        ++field2862;
        int var2 = -44 / ((2 - arg0) / 51);
        OpenGL.glViewport(this.field3158, this.field3157, this.field3014, this.field2993);
    }

    @OriginalMember(owner = "client!kd", name = "ea", descriptor = "(Lc;)V", line = 3146)
    public final void method362(class125 arg0) {
        ++field2985;
        this.field3063 = (class325) arg0;
        this.field3061.method2074((byte) 61, this.field3063);
        if (~this.field3103 != -2) {
            this.method1244(26632);
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(IIIIII)V", line = 3162)
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1290((byte) -123);
        ++field2929;
        this.method1291(arg5, false);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 3179)
    public final void method264(Rectangle[] arg0, int arg1) {
        ++field2930;
        this.method357();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V", line = 3190)
    public final void method1299(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method306();
        }
        ++field2942;
        if (!this.field3053 != !arg1) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field3053 = arg1;
            this.field3076 &= -32;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)I", line = 3213)
    public final int method314(int arg0, int arg1) {
        ++field2864;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "(I)V", line = 3224)
    private final void method1300(int arg0) {
        if (this.field3164 != 0.0F) {
            float var2 = this.field3088 / (this.field3164 + this.field3088);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field3102 * (-var2 + 1.0F) / this.field3164;
            this.field3111[14] = this.field3102 * var3;
            this.field3111[10] = this.field3153 + var4;
        } else {
            this.field3111[14] = this.field3102;
            this.field3111[10] = this.field3153;
        }
        ++field2981;
        this.field3090 = (this.field3111[14] + (float) (-this.field3138)) / this.field3111[10];
        if (arg0 <= 21) {
            this.field3126 = null;
        }
        this.field3065 = (float) this.field3138 + -this.field3164;
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "(B)V", line = 3257)
    private final void method1301(byte arg0) {
        ++field2996;
        int var2;
        for (var2 = 0; var2 < this.field3066; ++var2) {
            class470 var3 = this.field3146[var2];
            int var4 = var2 + 16386;
            class26.field321[0] = (float) var3.method2835(-30143);
            class26.field321[1] = (float) var3.method2832(false);
            class26.field321[2] = (float) var3.method2833((byte) 70);
            class26.field321[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class26.field321, 0);
            int var5 = var3.method2836((byte) -126);
            float var6 = var3.method2834(101) / 255.0F;
            class26.field321[0] = var6 * (float) class74.method644(var5 >> 16, 255);
            class26.field321[1] = (float) class74.method644(255, var5 >> 8) * var6;
            class26.field321[2] = (float) class74.method644(255, var5) * var6;
            OpenGL.glLightfv(var4, 4609, class26.field321, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2838((byte) -111) * var3.method2838((byte) -97)));
            OpenGL.glEnable(var4);
        }
        if (arg0 <= 82) {
            this.method300((Canvas) null);
        }
        while (var2 < this.field3159) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field3159 = this.field3066;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZBILjaggl/memory/NativeBuffer;I)Lwu;", line = 3302)
    public final class253 method1302(boolean arg0, byte arg1, int arg2, NativeBuffer arg3, int arg4) {
        ++field2898;
        int var6 = 42 % ((-56 - arg1) / 54);
        return (class253) (!this.field3070 || arg0 && !this.field3087 ? new class96(this, arg2, arg3) : new class331(this, arg2, arg3, arg4, arg0));
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(ZI)V", line = 3322)
    public final void method1303(boolean arg0, int arg1) {
        if (arg1 == 20873) {
            if (this.field3160 != arg0) {
                this.field3160 = arg0;
                this.method1317(arg1 ^ 23273);
                this.field3076 &= -32;
            }
            ++field2853;
        }
    }

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "()V", line = 3339)
    public final void method367() {
        ++field2980;
        if (this.field3093 && ~this.field3014 < -1 && this.field2993 > 0) {
            int var1 = this.field3127;
            int var2 = this.field3081;
            int var3 = this.field3129;
            int var4 = this.field3085;
            this.method267();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1287(0);
            this.method1303(false, 20873);
            this.method1272(false, -29);
            this.method1299(false, false);
            this.method1294(false, 34165);
            this.method1289(-19391, (class454) null);
            this.method1304(-26349, -2);
            this.method1248(1, true);
            this.method1291(0, false);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3014, this.field2993, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method313(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)V", line = 3387)
    public final void method1304(int arg0, int arg1) {
        this.method1319(34184, true, arg1);
        ++field2851;
        if (arg0 != -26349) {
            this.method352(126, -65, -18, -83, 109, -8);
        }
    }

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "(I)V", line = 3399)
    public final void method1305(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field3147, 0);
        int var2 = -128 % ((20 - arg0) / 49);
        ++field2904;
        OpenGL.glLightfv(16385, 4611, this.field3148, 0);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(ZI)I", line = 3410)
    public final int method1306(boolean arg0, int arg1) {
        ++field2955;
        if (arg0) {
            this.method285(57, 13, 44, 49, -112, 6, 56, -35, 14, 2);
        }
        if (arg1 != 6406 && arg1 != 6409) {
            if (arg1 != 6410 && ~arg1 != -34847 && arg1 != 34844) {
                if (~arg1 != -6408) {
                    if (~arg1 != -6409 && arg1 != 34847) {
                        if (arg1 == 34843) {
                            return 6;
                        } else if (~arg1 != -34843) {
                            if (arg1 != 6402) {
                                if (arg1 == 6401) {
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

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FFF)V", line = 3454)
    public final void method339(float arg0, float arg1, float arg2) {
        class289.field4356 = arg2;
        ++field2881;
        class238.field3817 = arg1;
        class304.field4593 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V", line = 3468)
    public final void method319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2949;
        OpenGL.glLineWidth((float) arg5);
        this.method352(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ldi;Z)Ll;", line = 3481)
    public final class16 method345(class84 arg0, boolean arg1) {
        ++field3009;
        int[] var3 = new int[arg0.field1207 * arg0.field1204];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1210 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field1207; ++var6) {
                for (int var7 = 0; var7 < arg0.field1204; ++var7) {
                    int var8 = arg0.field1208[255 & arg0.field1211[var4++]];
                    var3[var5++] = var8 != 0 ? class264.method1763(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; arg0.field1207 > var9; ++var9) {
                for (int var11 = 0; arg0.field1204 > var11; ++var11) {
                    var3[var5++] = class264.method1763(arg0.field1208[class74.method644(255, arg0.field1211[var4])], arg0.field1210[var4] << 24);
                    ++var4;
                }
            }
        }
        class16 var10 = this.method350(var3, 0, arg0.field1204, arg0.field1204, arg0.field1207);
        var10.method130(arg0.field1205, arg0.field1209, arg0.field1206, arg0.field1212);
        return var10;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Llm;[Ldi;Z)Lla;", line = 3542)
    public final class317 method366(class348 arg0, class84[] arg1, boolean arg2) {
        ++field2837;
        return new class278(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IB)V", line = 3550)
    public final void method1307(int arg0, byte arg1) {
        if (~this.field3154 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field3154 = arg0;
        }
        if (arg1 == 92) {
            ++field2865;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)V", line = 3568)
    public final synchronized void method1308(int arg0, byte arg1, int arg2) {
        ++field2894;
        if (arg1 < 28) {
            this.method1288((byte) 87);
        }
        class308 var4 = new class308(arg2);
        var4.field6388 = (long) arg0;
        this.field3045.method994(var4, -3610);
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "(B)V", line = 3582)
    private final void method1309(byte arg0) {
        if (arg0 <= -37) {
            if (this.field3106 && !this.field3118) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field2870;
        }
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "(I)V", line = 3597)
    private final void method1310(int arg0) {
        this.field3105 = (float) (-this.field3095 + this.field3081);
        ++field2954;
        this.field3113 = (float) (-this.field3089 + this.field3129);
        if (arg0 != -469) {
            this.field3106 = false;
        }
        this.field3056 = (float) (-this.field3095 + this.field3127);
        this.field3052 = (float) (this.field3085 - this.field3089);
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "()I", line = 3614)
    public final int method301() {
        ++field2902;
        return 4;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(IB)I", line = 3623)
    public final int method1311(int arg0, byte arg1) {
        ++field2964;
        if (arg1 != -67) {
            this.method267();
        }
        if (~arg0 != -5122 && ~arg0 != -5121) {
            if (~arg0 != -5124 && arg0 != 5122) {
                if (~arg0 != -5126 && arg0 != 5124 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!kd", name = "TA", descriptor = "(IIIII)V", line = 3647)
    public final void method369(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1290((byte) -123);
        ++field2988;
        this.method1291(arg4, false);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "(B)V", line = 3678)
    public final void method1312(byte arg0) {
        if (arg0 != 112) {
            this.field3125 = null;
        }
        OpenGL.glPopMatrix();
        ++field2950;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(IZ)V", line = 3698)
    public final void method1313(int arg0, boolean arg1) {
        if (!this.field3118 != !arg1) {
            this.field3118 = arg1;
            this.method1309((byte) -81);
        }
        int var3 = 25 % ((33 - arg0) / 40);
        ++field2994;
    }

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "(I)V", line = 3715)
    public final void method1314(int arg0) {
        ++field2944;
        if (this.field3076 != arg0) {
            this.method1288((byte) -102);
            this.method1303(false, 20873);
            this.method1272(false, arg0 ^ -63);
            this.method1299(false, false);
            this.method1294(false, 34165);
            this.method1304(-26349, -2);
            this.field3076 = 2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ILsf;)V", line = 3734)
    public final void method1315(int arg0, class365 arg1) {
        ++field2909;
        if (~this.field3039 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field3039 >= arg0) {
                this.field3032[this.field3039].method2286(arg0 + -30213);
            }
            this.field3035 = this.field3032[++this.field3039] = arg1;
            this.field3035.method2287(4509);
        }
    }

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "(I)I", line = 3749)
    public static final int method1316(int arg0) {
        if (arg0 > -68) {
            return 72;
        } else {
            ++field2953;
            return 2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "()Z", line = 3760)
    public final boolean method372() {
        ++field2856;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(FF)V", line = 3773)
    public final void method365(float arg0, float arg1) {
        ++field2986;
        if (this.field3088 != arg0 || this.field3164 != arg1) {
            this.field3088 = arg0;
            this.field3164 = arg1;
            this.method1300(59);
            if (~this.field3103 == -4) {
                this.method1293(5889);
                return;
            }
            if (~this.field3103 != -3) {
                return;
            }
            this.method1243(-64);
        }
    }

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "(I)V", line = 3798)
    private final void method1317(int arg0) {
        ++field2978;
        if (this.field3160 && this.field3094 >= 0 | this.field3092) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 2912) {
            this.method264((Rectangle[]) null, 79);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ltp;IIII)Lt;", line = 3813)
    public final class475 method330(class374 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2966;
        return new class504(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kd", name = "NA", descriptor = "(IIIII)V", line = 3823)
    public final void method336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2906;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lsf;I)V", line = 3833)
    public final void method1318(class365 arg0, int arg1) {
        ++field2826;
        if (arg1 <= 107) {
            this.method272((Canvas) null);
        }
        if (~this.field3037 <= -1 && this.field3033[this.field3037] == arg0) {
            this.field3033[this.field3037--] = null;
            arg0.method2283(true);
            if (~this.field3037 > -1) {
                this.field3038 = null;
            } else {
                this.field3038 = this.field3033[this.field3037];
                this.field3038.method2288(21884);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lt;Lkp;Lc;Lju;I)V", line = 3864)
    public final void method311(class475 arg0, class341 arg1, class125 arg2, class83 arg3, int arg4) {
        arg0.method439(arg2, arg3, arg4);
        ++field2858;
        this.method368(arg1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI)V", line = 3876)
    public final void method1319(int arg0, boolean arg1, int arg2) {
        this.method1257(arg2, arg1, 80, true);
        ++field2912;
        if (arg0 != 34184) {
            this.method314(-16, -121);
        }
    }

    @OriginalMember(owner = "client!kd", name = "OA", descriptor = "(IIII)V", line = 3887)
    public final void method313(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field2993) {
            arg3 = this.field2993;
        }
        if (~arg2 < ~this.field3014) {
            arg2 = this.field3014;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        ++field2852;
        this.field3129 = arg1;
        this.field3085 = arg3;
        this.field3081 = arg2;
        this.field3127 = arg0;
        OpenGL.glEnable(3089);
        this.method1310(-469);
        this.method1254(0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI[BI)Lwu;", line = 3921)
    public final class253 method1320(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        ++field2866;
        if (arg2 <= 6) {
            this.field3080 = -93;
        }
        return (class253) (!this.field3070 || arg1 && !this.field3087 ? new class96(this, arg0, arg3, arg4) : new class331(this, arg0, arg3, arg4, arg1));
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()I", line = 3938)
    public final int method308() {
        ++field2925;
        return this.field3086;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BZIZ)Lpl;", line = 3946)
    public final class463 method1321(int arg0, byte[] arg1, boolean arg2, int arg3, boolean arg4) {
        ++field2924;
        if (!arg4) {
            this.method313(31, 31, 86, 19);
        }
        return (class463) (!this.field3070 || arg2 && !this.field3087 ? new class469(this, arg0, arg1, arg3) : new class19(this, arg0, arg1, arg3, arg2));
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "(B)V", line = 3962)
    public final void method1322(byte arg0) {
        ++field2933;
        if (this.field3076 != 4) {
            this.method1288((byte) -102);
            this.method1303(false, 20873);
            this.method1272(false, -125);
            this.method1299(false, false);
            this.method1294(false, 34165);
            this.method1304(-26349, -2);
            this.method1291(1, false);
            this.method1248(0, true);
            this.field3076 = 4;
        }
        int var2 = -8 % ((-30 - arg0) / 57);
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "()Z", line = 3986)
    public final boolean method323() {
        ++field2915;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIILma;II)V", line = 3998)
    public final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        ++field2845;
        class289 var10 = (class289) arg6;
        class53 var11 = var10.field4353;
        this.method1314(2);
        this.method1289(-19391, var10.field4353);
        this.method1291(arg5, false);
        this.method1242(34162, 8448, 7681);
        this.method1266(768, 0, 34167, 8960);
        float var12 = var11.field664 / (float) var11.field663;
        float var13 = var11.field658 / (float) var11.field656;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method1266(768, 0, 5890, 8960);
    }

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "(I)V", line = 4033)
    private final void method1323(int arg0) {
        if (arg0 <= -67) {
            ++field2897;
            int var2;
            if (!this.field3092) {
                this.field3104 = (float) (-this.field3058 + this.field3138) + -this.field3120;
                this.field3140 = this.field3104 - (float) this.field3094 * this.field3150;
                if (this.field3140 < (float) this.field3086) {
                    this.field3140 = (float) this.field3086;
                }
                OpenGL.glFogf(2915, this.field3140);
                OpenGL.glFogf(2916, this.field3104);
                var2 = this.field3073;
            } else {
                OpenGL.glFogf(2915, 0.0F);
                OpenGL.glFogf(2916, 1.0F);
                var2 = this.field3139;
            }
            class108.field1515[0] = (float) class74.method644(16711680, var2) / 1.671168E7F;
            class108.field1515[2] = (float) class74.method644(255, var2) / 255.0F;
            class108.field1515[1] = (float) class74.method644(65280, var2) / 65280.0F;
            OpenGL.glFogfv(2918, class108.field1515, 0);
            if (this.field3092) {
                this.field3018.field3411.method2379(0);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lt;Lc;[Lju;I)V", line = 4072)
    public final void method273(class475[] arg0, class125 arg1, class83[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method439(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field2893;
    }

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "()Z", line = 4091)
    public final boolean method333() {
        ++field2998;
        return this.field3018.method1449(3, (byte) 107);
    }
}
