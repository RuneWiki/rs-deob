import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class197 extends class66 {

    @OriginalMember(owner = "client!ffa", name = "Gc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2686 = new Hashtable();

    @OriginalMember(owner = "client!ffa", name = "If", descriptor = "I")
    public int field2842 = 128;

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "Lkm;")
    private class372 field2830 = new class372();

    @OriginalMember(owner = "client!ffa", name = "qg", descriptor = "Lob;")
    private class768 field2846 = new class768();

    @OriginalMember(owner = "client!ffa", name = "uh", descriptor = "Lob;")
    public class768 field2847 = new class768();

    @OriginalMember(owner = "client!ffa", name = "ff", descriptor = "Z")
    private boolean field2850 = false;

    @OriginalMember(owner = "client!ffa", name = "P", descriptor = "I")
    public int field2849 = 8;

    @OriginalMember(owner = "client!ffa", name = "Fb", descriptor = "I")
    public int field2852 = 3;

    @OriginalMember(owner = "client!ffa", name = "lg", descriptor = "Lef;")
    private class513 field2854 = new class513();

    @OriginalMember(owner = "client!ffa", name = "nf", descriptor = "[Lnk;")
    private class746[] field2855 = new class746[4];

    @OriginalMember(owner = "client!ffa", name = "rg", descriptor = "I")
    private int field2859 = -1;

    @OriginalMember(owner = "client!ffa", name = "tc", descriptor = "I")
    private int field2863 = -1;

    @OriginalMember(owner = "client!ffa", name = "gd", descriptor = "[Lnk;")
    private class746[] field2862 = new class746[4];

    @OriginalMember(owner = "client!ffa", name = "of", descriptor = "[Lnk;")
    private class746[] field2861 = new class746[4];

    @OriginalMember(owner = "client!ffa", name = "id", descriptor = "I")
    private int field2864 = -1;

    @OriginalMember(owner = "client!ffa", name = "R", descriptor = "Lef;")
    private class513 field2867;

    @OriginalMember(owner = "client!ffa", name = "De", descriptor = "Lef;")
    private class513 field2869;

    @OriginalMember(owner = "client!ffa", name = "Mb", descriptor = "Lef;")
    private class513 field2870;

    @OriginalMember(owner = "client!ffa", name = "Of", descriptor = "Lef;")
    private class513 field2871;

    @OriginalMember(owner = "client!ffa", name = "Ob", descriptor = "Lef;")
    private class513 field2872;

    @OriginalMember(owner = "client!ffa", name = "Kf", descriptor = "Lef;")
    private class513 field2873;

    @OriginalMember(owner = "client!ffa", name = "rb", descriptor = "Lef;")
    private class513 field2874;

    @OriginalMember(owner = "client!ffa", name = "kc", descriptor = "Lob;")
    public class768 field2882;

    @OriginalMember(owner = "client!ffa", name = "Qe", descriptor = "Lob;")
    public class768 field2884;

    @OriginalMember(owner = "client!ffa", name = "Kc", descriptor = "Lob;")
    public class768 field2885;

    @OriginalMember(owner = "client!ffa", name = "lb", descriptor = "[F")
    public float[] field2888;

    @OriginalMember(owner = "client!ffa", name = "bf", descriptor = "F")
    private float field2910;

    @OriginalMember(owner = "client!ffa", name = "Xb", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!ffa", name = "ab", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!ffa", name = "Rc", descriptor = "F")
    private float field2890;

    @OriginalMember(owner = "client!ffa", name = "Lg", descriptor = "F")
    public float field2936;

    @OriginalMember(owner = "client!ffa", name = "lf", descriptor = "I")
    private int field2923;

    @OriginalMember(owner = "client!ffa", name = "Gf", descriptor = "I")
    private int field2924;

    @OriginalMember(owner = "client!ffa", name = "yh", descriptor = "Z")
    private boolean field2938;

    @OriginalMember(owner = "client!ffa", name = "Se", descriptor = "F")
    public float field2921;

    @OriginalMember(owner = "client!ffa", name = "Eg", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!ffa", name = "th", descriptor = "F")
    public float field2934;

    @OriginalMember(owner = "client!ffa", name = "Bb", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!ffa", name = "J", descriptor = "F")
    public float field2955;

    @OriginalMember(owner = "client!ffa", name = "xe", descriptor = "I")
    private int field2915;

    @OriginalMember(owner = "client!ffa", name = "Nf", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!ffa", name = "fd", descriptor = "F")
    private float field2945;

    @OriginalMember(owner = "client!ffa", name = "Wg", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!ffa", name = "oc", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!ffa", name = "Kg", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!ffa", name = "Jf", descriptor = "[F")
    private float[] field2953;

    @OriginalMember(owner = "client!ffa", name = "Ng", descriptor = "[F")
    private float[] field2976;

    @OriginalMember(owner = "client!ffa", name = "Z", descriptor = "F")
    private float field2979;

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!ffa", name = "tf", descriptor = "F")
    public float field2930;

    @OriginalMember(owner = "client!ffa", name = "T", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!ffa", name = "Kb", descriptor = "I")
    private int field2985;

    @OriginalMember(owner = "client!ffa", name = "Xd", descriptor = "I")
    private int field2981;

    @OriginalMember(owner = "client!ffa", name = "Uf", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!ffa", name = "gh", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!ffa", name = "Cg", descriptor = "[Luf;")
    private class471[] field2904;

    @OriginalMember(owner = "client!ffa", name = "kf", descriptor = "F")
    public float field2973;

    @OriginalMember(owner = "client!ffa", name = "gb", descriptor = "F")
    public float field2987;

    @OriginalMember(owner = "client!ffa", name = "wd", descriptor = "I")
    private int field2969;

    @OriginalMember(owner = "client!ffa", name = "Ff", descriptor = "[F")
    private float[] field2944;

    @OriginalMember(owner = "client!ffa", name = "df", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!ffa", name = "ne", descriptor = "[F")
    private float[] field2977;

    @OriginalMember(owner = "client!ffa", name = "dd", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!ffa", name = "Ee", descriptor = "F")
    private float field2991;

    @OriginalMember(owner = "client!ffa", name = "md", descriptor = "Z")
    private boolean field2988;

    @OriginalMember(owner = "client!ffa", name = "pb", descriptor = "Ljo;")
    public class353 field2994;

    @OriginalMember(owner = "client!ffa", name = "eh", descriptor = "[I")
    public int[] field3000;

    @OriginalMember(owner = "client!ffa", name = "nd", descriptor = "[I")
    public int[] field2998;

    @OriginalMember(owner = "client!ffa", name = "bc", descriptor = "[I")
    public int[] field3002;

    @OriginalMember(owner = "client!ffa", name = "ud", descriptor = "[B")
    public byte[] field2999;

    @OriginalMember(owner = "client!ffa", name = "uf", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2710;

    @OriginalMember(owner = "client!ffa", name = "Lb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2765;

    @OriginalMember(owner = "client!ffa", name = "Ne", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!ffa", name = "cc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2654;

    @OriginalMember(owner = "client!ffa", name = "ie", descriptor = "J")
    private long field2759;

    @OriginalMember(owner = "client!ffa", name = "X", descriptor = "J")
    private long field2821;

    @OriginalMember(owner = "client!ffa", name = "mb", descriptor = "Z")
    public boolean field2922;

    @OriginalMember(owner = "client!ffa", name = "Ud", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!ffa", name = "wg", descriptor = "Ljava/lang/String;")
    private String field2982;

    @OriginalMember(owner = "client!ffa", name = "Vd", descriptor = "Z")
    public boolean field2908;

    @OriginalMember(owner = "client!ffa", name = "Yd", descriptor = "Z")
    private boolean field2948;

    @OriginalMember(owner = "client!ffa", name = "gg", descriptor = "Z")
    public boolean field2968;

    @OriginalMember(owner = "client!ffa", name = "Pe", descriptor = "Z")
    public boolean field2964;

    @OriginalMember(owner = "client!ffa", name = "ng", descriptor = "Z")
    private boolean field2931;

    @OriginalMember(owner = "client!ffa", name = "ed", descriptor = "Z")
    public boolean field2914;

    @OriginalMember(owner = "client!ffa", name = "Vg", descriptor = "Ljava/lang/String;")
    private String field2996;

    @OriginalMember(owner = "client!ffa", name = "Gg", descriptor = "Z")
    public boolean field2983;

    @OriginalMember(owner = "client!ffa", name = "sc", descriptor = "Z")
    private boolean field2959;

    @OriginalMember(owner = "client!ffa", name = "ld", descriptor = "Lwv;")
    private class37 field2843;

    @OriginalMember(owner = "client!ffa", name = "hh", descriptor = "Lug;")
    public class587 field2851;

    @OriginalMember(owner = "client!ffa", name = "Mf", descriptor = "Lip;")
    private class734 field2834;

    @OriginalMember(owner = "client!ffa", name = "hd", descriptor = "Llea;")
    private class638 field2840;

    @OriginalMember(owner = "client!ffa", name = "Df", descriptor = "Lst;")
    private class457 field2824;

    @OriginalMember(owner = "client!ffa", name = "Bh", descriptor = "[Ljava/lang/String;")
    private static final String[] field3003 = new String[] { method1761(method1760("\u0016\u001e\u0007mA\u0011P")), method1761(method1760("\u0016\u001e\u0007m~1P")), method1761(method1760("\u0016\u001e\u0007mg5P")), method1761(method1760("\u0016\u001e\u0007mJ\u0011P")), method1761(method1760("\u0016\u001e\u0007m|4P")), method1761(method1760("\u0016\u001e\u0007mv4P")), method1761(method1760("\u0016\u001e\u0007mcX")), method1761(method1760("\u0016\u001e\u0007mc9P")), method1761(method1760("\u0016\u001e\u0007mwX")), method1761(method1760("\u000bVHmN")), method1761(method1760("\u001e\r\n/")), method1761(method1760("\u0016\u001e\u0007mi1P")), method1761(method1760("\u0016\u001e\u0007mw2P")), method1761(method1760("\u0016\u001e\u0007my:P")), method1761(method1760("\u0016\u001e\u0007ma1P")), method1761(method1760("\u0016\u001e\u0007mp3P")), method1761(method1760("\u0016\u001e\u0007m`7P")), method1761(method1760("\u0016\u001e\u0007mk1P")), method1761(method1760("\u0016\u001e\u0007mc6P")), method1761(method1760("\u0016\u001e\u0007md4P")), method1761(method1760("\u0016\u001e\u0007m\u007f2P")), method1761(method1760("\u0016\u001e\u0007mbX")), method1761(method1760("\u0016\u001e\u0007me6P")), method1761(method1760("\u0016\u001e\u0007mc4P")), method1761(method1760("\u0016\u001e\u0007mg4P")), method1761(method1760("\u0016\u001e\u0007my7P")), method1761(method1760("\u0016\u001e\u0007mf3P")), method1761(method1760("\u0016\u001e\u0007mq5P")), method1761(method1760("\u0016\u001e\u0007meX")), method1761(method1760("\u0016\u001e\u0007mu5P")), method1761(method1760("\u0016\u001e\u0007mR\u0011P")), method1761(method1760("\u0016\u001e\u0007md3P")), method1761(method1760("\u0016\u001e\u0007mw5P")), method1761(method1760("\u0016\u001e\u0007mp1P")), method1761(method1760("\u0016\u001e\u0007ma2P")), method1761(method1760("\u0016\u001e\u0007m_\u0011P")), method1761(method1760("\u0016\u001e\u0007m|X")), method1761(method1760("\u0016\u001e\u0007m|3P")), method1761(method1760("\u0016\u001e\u0007mc2P")), method1761(method1760("\u0016\u001e\u0007mw3P")), method1761(method1760("\u0016\u001e\u0007my2P")), method1761(method1760("\u0016\u001e\u0007mx2P")), method1761(method1760("\u0016\u001e\u0007mx1P")), method1761(method1760("\u0016\u001e\u0007mvX")), method1761(method1760("\u0016\u001e\u0007my3P")), method1761(method1760("\u0016\u001e\u0007m|5P")), method1761(method1760("\u0016\u001e\u0007ma8P")), method1761(method1760("\u0016\u001e\u0007mb9P")), method1761(method1760("\u0016\u001e\u0007m~X")), method1761(method1760("\u0003\u001d\u0012\nT\u001e\u0017\u0014&a\u0015\b\u0007*]\u0004")), method1761(method1760("\u001a\u0019\u0010\"\u001d\u0011\u000f\u0012mp\u0011\u0016\u0010\"@")), method1761(method1760("\u0016\u001e\u0007mt8P")), method1761(method1760("\u0016\u001e\u0007m{3P")), method1761(method1760("\u0016\u001e\u0007m|1P")), method1761(method1760("\u0016\u001e\u0007mt9P")), method1761(method1760("\u0016\u001e\u0007mz2P")), method1761(method1760("\u0016\u001e\u0007mu:P")), method1761(method1760("\u0016\u001e\u0007m}4P")), method1761(method1760("\u0016\u001e\u0007ma5P")), method1761(method1760("\u0016\u001e\u0007mv9P")), method1761(method1760("\u0016\u001e\u0007m~4P")), method1761(method1760("\u0016\u001e\u0007mzX")), method1761(method1760("\u0016\u001e\u0007mtX")), method1761(method1760("\u0016\u001e\u0007mrX")), method1761(method1760("\u0016\u001e\u0007m~8P")), method1761(method1760("\u0016\u001e\u0007mq2P")), method1761(method1760("\u0016\u001e\u0007mqX")), method1761(method1760("\u0016\u001e\u0007mu2P")), method1761(method1760("\u0016\u001e\u0007m`5P")), method1761(method1760("\u0016\u001e\u0007mq6P")), method1761(method1760("\u0016\u001e\u0007mt1P")), method1761(method1760("_\u0012")), method1761(method1760("\u0018\f\u00123\t_W")), method1761(method1760("_\u0014[")), method1761(method1760("\\\u0019T")), method1761(method1760("_\b[")), method1761(method1760("\\\u0017")), method1761(method1760("_\u0019[")), method1761(method1760("\u0016\u001e\u0007mb3P")), method1761(method1760("/\u000b\u0003/U")), method1761(method1760("\u0016\u001e\u0007mf5P")), method1761(method1760("\u0016\u001e\u0007mQX")), method1761(method1760("\u0016\u001e\u0007mx:P")), method1761(method1760("\u0016\u001e\u0007mt6P")), method1761(method1760("\u0016\u001e\u0007m~6P")), method1761(method1760("\u0016\u001e\u0007mc5P")), method1761(method1760("\u0016\u001e\u0007mt5P")), method1761(method1760("\u0016\u001e\u0007mq:P")), method1761(method1760("\u0016\u001e\u0007mr4P")), method1761(method1760("\u0016\u001e\u0007md9P")), method1761(method1760("\u0016\u001e\u0007m~9P")), method1761(method1760("\u0016\u001e\u0007m`9P")), method1761(method1760("\u0016\u001e\u0007mx5P")), method1761(method1760("\u0016\u001e\u0007mt:P")), method1761(method1760("\u0016\u001e\u0007mg2P")), method1761(method1760("\u0016\u001e\u0007mr9P")), method1761(method1760("\u0016\u001e\u0007my1P")), method1761(method1760("\u0016\u001e\u0007m|2P")), method1761(method1760("\u0016\u001e\u0007ma3P")), method1761(method1760("\u0016\u001e\u0007mb2P")), method1761(method1760("\u0016\u001e\u0007mt3P")), method1761(method1760("\u0016\u001e\u0007m}3P")), method1761(method1760("\u0016\u001e\u0007mp2P")), method1761(method1760("\u0016\u001e\u0007mx4P")), method1761(method1760("\u0016\u001e\u0007mw:P")), method1761(method1760("\u0016\u001e\u0007mf8P")), method1761(method1760("\u0016\u001e\u0007mAX")), method1761(method1760("\u0016\u001e\u0007mxX")), method1761(method1760("\u0016\u001e\u0007m\u007f5P")), method1761(method1760("\u0016\u001e\u0007m{2P")), method1761(method1760("\u0016\u001e\u0007mx3P")), method1761(method1760("\u0016\u001e\u0007mr6P")), method1761(method1760("\u0016\u001e\u0007me4P")), method1761(method1760("\u0016\u001e\u0007mv5P")), method1761(method1760("\u0016\u001e\u0007m{4P")), method1761(method1760("\u0016\u001e\u0007mf2P")), method1761(method1760("\u0019\u0016\u0012&_")), method1761(method1760("\u0011\f\u000f")), method1761(method1760("\u0016\u001e\u0007m\u007f:P")), method1761(method1760("?\b\u0003-t<")), method1761(method1760("\u001e\u000e\u000f'Z\u0011")), method1761(method1760("\u0016\u001e\u0007mr3P")), method1761(method1760("749\u0002a2'\u0012&K\u0004\r\u0014&l\u0002\u001d\u00057R\u001e\u001f\n&")), method1761(method1760("749\u0006k$'\u00001R\u001d\u001d\u00046U\u0016\u001d\u0014\u001cQ\u001c\u0011\u0012")), method1761(method1760("749\u0006k$'\u0012&K\u0004\r\u0014&\u00004")), method1761(method1760("749\u0002a2'\u000b6_\u0004\u0011\u0015\"^\u0000\u0014\u0003")), method1761(method1760("\u0012\n\u000f\"]P\b\u00076_")), method1761(method1760("749\u0002a2'\u000b6_\u0004\u0011\u0012&K\u0004\r\u0014&")), method1761(method1760("749\u0006k$'\u00001R\u001d\u001d\u00046U\u0016\u001d\u0014\u001c\\\u0012\u0012\u0003 G")), method1761(method1760("\u001d\u001d\u0015\"")), method1761(method1760("749\u0002a2'\u0012&K\u0004\r\u0014&l\u0013\r\u0004&l\u001d\u0019\u0016")), method1761(method1760("749\u0002a2'\u0010&A\u0004\u001d\u001e\u001c@\u0018\u0019\u0002&A")), method1761(method1760("\u0016\u001e\u0007m}2P")), method1761(method1760("749\u0002a2'\u00001R\u0017\u0015\u0003-G/\u000b\u000e\"W\u0015\n")), method1761(method1760("749\u0002a2'\u00001R\u0017\u0015\u0003-G/\b\u0014,T\u0002\u0019\u000b")), method1761(method1760("\u001d\u0019\u0005")), method1761(method1760("749\u0006k$'\u00001R\u001d\u001d\u00046U\u0016\u001d\u0014\u001c^\u0005\u0014\u0012*@\u0011\u0015\u0016/V")), method1761(method1760("749\u0002a2'\u0012&K\u0004\r\u0014&l\u0016\u0014\t\"G")), method1761(method1760("\u001d\u0011\u00051\\\u0003\u0017\u00007")), method1761(method1760("749\u0002a2'\u0012&K\u0004\r\u0014&l\u0015\u0016\u0010\u001cP\u001f\u0015\u0004*]\u0015")), method1761(method1760("749\u0002a2'\u0010&A\u0004\u001d\u001e\u001cC\u0002\u0017\u00011R\u001d")), method1761(method1760("749\u0002a2'\u0010&A\u0004\u001d\u001e\u001cQ\u0005\u001e\u0000&A/\u0017\u0004)V\u0013\f")), method1761(method1760("\u0016\u001e\u0007m{X")), method1761(method1760("\u0016\u001e\u0007mp5P")), method1761(method1760("\u0016\u001e\u0007m`2P")), method1761(method1760("\u0016\u001e\u0007mu1P")), method1761(method1760("\u0016\u001e\u0007mu4P")), method1761(method1760("\u0016\u001e\u0007mq3P")), method1761(method1760("\u0016\u001e\u0007m{1P")), method1761(method1760("\u0016\u001e\u0007m`3P")), method1761(method1760("\u0016\u001e\u0007ma4P")), method1761(method1760("\u0016\u001e\u0007md1P")), method1761(method1760("\u0016\u001e\u0007md5P")), method1761(method1760("\u0016\u001e\u0007mv2P")), method1761(method1760("\u0016\u001e\u0007muX")), method1761(method1760("\u0016\u001e\u0007m~3P")), method1761(method1760("\u0016\u001e\u0007m\u007f9P")), method1761(method1760("\u0016\u001e\u0007m\u000f\u0019\u0016\u000f7\rX")), method1761(method1760("\u001a\u0019\u0005/Z\u0012")), method1761(method1760("\u001a\u0019\u0001$_")), method1761(method1760("\u0018\u001c")), method1761(method1760("\u0002\u0019\u0002&\\\u001e")), method1761(method1760("\u0003KF$A\u0011\b\u000e*P\u0003")), method1761(method1760("749\u0002a2'\u000e\"_\u0016'\u0000/\\\u0011\f93Z\b\u001d\n")), method1761(method1760("\u0016\u001e\u0007m\u007fX")), method1761(method1760("\u0016\u001e\u0007mr5P")), method1761(method1760("\u0016\u001e\u0007mW\u0011P")), method1761(method1760("\u0016\u001e\u0007m`1P")), method1761(method1760("\u0016\u001e\u0007mdX")), method1761(method1760("\u0016\u001e\u0007mp4P")), method1761(method1760("\u0016\u001e\u0007mr:P")), method1761(method1760("\u0016\u001e\u0007mfX")), method1761(method1760("\u0016\u001e\u0007m}9P")), method1761(method1760("\u0016\u001e\u0007m`4P")), method1761(method1760("\u0016\u001e\u0007mb1P")), method1761(method1760("\u0016\u001e\u0007mC\u0011P")), method1761(method1760("\u0016\u001e\u0007md8P")), method1761(method1760("\u0016\u001e\u0007mkX")), method1761(method1760("\u0016\u001e\u0007me2P")), method1761(method1760("\u0016\u001e\u0007mg3P")), method1761(method1760("\u0016\u001e\u0007m}X")), method1761(method1760("\u0016\u001e\u0007mf1P")), method1761(method1760("\u0016\u001e\u0007me1P")), method1761(method1760("\u0016\u001e\u0007mw4P")), method1761(method1760("\u0016\u001e\u0007m\u007f3P")), method1761(method1760("\u0016\u001e\u0007mz3P")), method1761(method1760("\u0016\u001e\u0007mc3P")), method1761(method1760("\u0016\u001e\u0007mjX")), method1761(method1760("\u0016\u001e\u0007mpX")), method1761(method1760("\u0016\u001e\u0007mv1P")), method1761(method1760("\u0016\u001e\u0007mK\u0011P")), method1761(method1760("\u0016\u001e\u0007md2P")), method1761(method1760("\u0016\u001e\u0007mc1P")), method1761(method1760("\u0016\u001e\u0007mgX")), method1761(method1760("\u0016\u001e\u0007mz1P")), method1761(method1760("\u0016\u001e\u0007m{5P")), method1761(method1760("\u0016\u001e\u0007mu7P")), method1761(method1760("\u0016\u001e\u0007mu9P")), method1761(method1760("\u0016\u001e\u0007mu3P")), method1761(method1760("\u0016\u001e\u0007mb7P")), method1761(method1760("\u0016\u001e\u0007mz4P")), method1761(method1760("\u0016\u001e\u0007m}1P")), method1761(method1760("\u0016\u001e\u0007my4P")), method1761(method1760("\u0016\u001e\u0007mf4P")), method1761(method1760("\u0016\u001e\u0007m`X")), method1761(method1760("\u0016\u001e\u0007mw1P")), method1761(method1760("\u0016\u001e\u0007myX")), method1761(method1760("\u0016\u001e\u0007mI\u0011P")), method1761(method1760("\u0016\u001e\u0007m~5P")), method1761(method1760("\u0016\u001e\u0007mt4P")), method1761(method1760("\u0016\u001e\u0007m\u007f1P")), method1761(method1760("\u0016\u001e\u0007mt2P")), method1761(method1760("\u0016\u001e\u0007maX")), method1761(method1760("\u0016\u001e\u0007mf7P")), method1761(method1760("\u0016\u001e\u0007mv3P")), method1761(method1760("\u0016\u001e\u0007mUX")), method1761(method1760("\u0016\u001e\u0007mg1P")), method1761(method1760("\u0016\u001e\u0007mr2P")), method1761(method1760("\u0016\u001e\u0007mz5P")), method1761(method1760("\u0016\u001e\u0007mf6P")), method1761(method1760("\u0016\u001e\u0007my5P")), method1761(method1760("\u0016\u001e\u0007m}5P")), method1761(method1760("\u0016\u001e\u0007me3P")), method1761(method1760("\u0016\u001e\u0007m~2P")), method1761(method1760("\u0016\u001e\u0007mZX")), method1761(method1760("\u0016\u001e\u0007me5P")), method1761(method1760("\u0016\u001e\u0007mb4P")), method1761(method1760("\u0016\u001e\u0007mv:P")), method1761(method1760("\u0016\u001e\u0007m]\u0011P")), method1761(method1760("\u0016\u001e\u0007m{:P")), method1761(method1760("\u0016\u001e\u0007mb5P")), method1761(method1760("\u0016\u001e\u0007mq1P")), method1761(method1760("\u0016\u001e\u0007mr1P")), method1761(method1760("\u0016\u001e\u0007mq4P")), method1761(method1760("\u0016\u001e\u0007mz:P")), method1761(method1760("\u0016\u001e\u0007m\u007f4P")) };

    @OriginalMember(owner = "client!ffa", name = "Pg", descriptor = "[Lic;")
    public static class726[] field2685 = new class726[2048];

    @OriginalMember(owner = "client!ffa", name = "wb", descriptor = "F")
    private float field2893;

    @OriginalMember(owner = "client!ffa", name = "ze", descriptor = "F")
    public float field2916;

    @OriginalMember(owner = "client!ffa", name = "ue", descriptor = "F")
    public float field2920;

    @OriginalMember(owner = "client!ffa", name = "oh", descriptor = "F")
    private float field2928;

    @OriginalMember(owner = "client!ffa", name = "gc", descriptor = "F")
    public float field2965;

    @OriginalMember(owner = "client!ffa", name = "be", descriptor = "F")
    public float field2970;

    @OriginalMember(owner = "client!ffa", name = "ah", descriptor = "F")
    private float field2972;

    @OriginalMember(owner = "client!ffa", name = "Ze", descriptor = "F")
    public float field2992;

    @OriginalMember(owner = "client!ffa", name = "sd", descriptor = "F")
    public float field2993;

    @OriginalMember(owner = "client!ffa", name = "ae", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ffa", name = "L", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ffa", name = "Dc", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ffa", name = "Ed", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ffa", name = "xf", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ffa", name = "od", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ffa", name = "Sd", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ffa", name = "Fe", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ffa", name = "Sb", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ffa", name = "B", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ffa", name = "cg", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ffa", name = "tg", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ffa", name = "me", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ffa", name = "we", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ffa", name = "mg", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ffa", name = "Qc", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ffa", name = "Tg", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ffa", name = "jf", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ffa", name = "zg", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ffa", name = "te", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ffa", name = "He", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ffa", name = "ph", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!ffa", name = "Od", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ffa", name = "pg", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ffa", name = "hf", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ffa", name = "Lf", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ffa", name = "Cd", descriptor = "I")
    private int field2662;

    @OriginalMember(owner = "client!ffa", name = "Ig", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ffa", name = "yc", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ffa", name = "Ad", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ffa", name = "dc", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ffa", name = "Zg", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ffa", name = "Dg", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ffa", name = "Jd", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ffa", name = "Yg", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ffa", name = "ic", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ffa", name = "ad", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ffa", name = "Ac", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ffa", name = "re", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ffa", name = "ob", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ffa", name = "yf", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ffa", name = "qh", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ffa", name = "se", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ffa", name = "wc", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ffa", name = "Le", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ffa", name = "Ah", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ffa", name = "Zc", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ffa", name = "Ib", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ffa", name = "bb", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!ffa", name = "xc", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ffa", name = "Be", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ffa", name = "Fc", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ffa", name = "ib", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ffa", name = "Ld", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ffa", name = "Vb", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ffa", name = "vg", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ffa", name = "fb", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ffa", name = "A", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ffa", name = "uc", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ffa", name = "xd", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ffa", name = "td", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ffa", name = "de", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ffa", name = "qd", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ffa", name = "Qg", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ffa", name = "ag", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ffa", name = "zc", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ffa", name = "Mc", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ffa", name = "Ke", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ffa", name = "Dd", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ffa", name = "Wd", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ffa", name = "zh", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ffa", name = "wh", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ffa", name = "Bc", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ffa", name = "Y", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ffa", name = "jd", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ffa", name = "pf", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ffa", name = "ig", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!ffa", name = "pd", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ffa", name = "Bd", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ffa", name = "ef", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ffa", name = "M", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ffa", name = "rc", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ffa", name = "Xg", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!ffa", name = "Bf", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ffa", name = "Yf", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ffa", name = "kb", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ffa", name = "Me", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ffa", name = "Eb", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ffa", name = "vf", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ffa", name = "dg", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ffa", name = "cd", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!ffa", name = "Gd", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ffa", name = "vh", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!ffa", name = "Rf", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ffa", name = "Hf", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!ffa", name = "lh", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!ffa", name = "Rd", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ffa", name = "Pc", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ffa", name = "S", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ffa", name = "vb", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ffa", name = "mf", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ffa", name = "Pd", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!ffa", name = "Af", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!ffa", name = "Nd", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ffa", name = "fe", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ffa", name = "xh", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ffa", name = "Re", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ffa", name = "yg", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!ffa", name = "Cf", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!ffa", name = "ke", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!ffa", name = "Sc", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ffa", name = "Oe", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!ffa", name = "Oc", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!ffa", name = "sg", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ffa", name = "Ve", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ffa", name = "Kd", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!ffa", name = "ve", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!ffa", name = "je", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ffa", name = "qb", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ffa", name = "Ue", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ffa", name = "nb", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ffa", name = "Tc", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ffa", name = "Tb", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ffa", name = "ch", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ffa", name = "le", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ffa", name = "Xc", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!ffa", name = "Og", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ffa", name = "Uc", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ffa", name = "ug", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ffa", name = "wf", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ffa", name = "Hd", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ffa", name = "U", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ffa", name = "nh", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ffa", name = "mh", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ffa", name = "Rb", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ffa", name = "Wc", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ffa", name = "Fd", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ffa", name = "pe", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ffa", name = "ac", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ffa", name = "Te", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ffa", name = "zb", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ffa", name = "qc", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ffa", name = "bh", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ffa", name = "Hb", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ffa", name = "Yb", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ffa", name = "Jg", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ffa", name = "oe", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ffa", name = "Ab", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ffa", name = "Ic", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ffa", name = "nc", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ffa", name = "qf", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ffa", name = "Vc", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ffa", name = "lc", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ffa", name = "Gb", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ffa", name = "hg", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ffa", name = "Hc", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ffa", name = "Vf", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ffa", name = "N", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ffa", name = "zd", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ffa", name = "Ae", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ffa", name = "bd", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ffa", name = "V", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ffa", name = "hb", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ffa", name = "sb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ffa", name = "qe", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ffa", name = "fh", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!ffa", name = "Ub", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ffa", name = "Ef", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ffa", name = "Fg", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ffa", name = "eb", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ffa", name = "jh", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ffa", name = "ee", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ffa", name = "Md", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ffa", name = "eg", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ffa", name = "af", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ffa", name = "Ag", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ffa", name = "Sg", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ffa", name = "Zd", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ffa", name = "Wf", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ffa", name = "Nc", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ffa", name = "Pb", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ffa", name = "Td", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ffa", name = "We", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ffa", name = "Qb", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ffa", name = "fg", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ffa", name = "zf", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ffa", name = "yd", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ffa", name = "Jc", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ffa", name = "yb", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ffa", name = "kd", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ffa", name = "jg", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!ffa", name = "Zf", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!ffa", name = "cb", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!ffa", name = "Tf", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!ffa", name = "mc", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!ffa", name = "vd", descriptor = "I")
    private int field2877;

    @OriginalMember(owner = "client!ffa", name = "ec", descriptor = "I")
    private int field2879;

    @OriginalMember(owner = "client!ffa", name = "Cc", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!ffa", name = "Jb", descriptor = "I")
    private int field2901;

    @OriginalMember(owner = "client!ffa", name = "Xe", descriptor = "I")
    private int field2909;

    @OriginalMember(owner = "client!ffa", name = "Lc", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!ffa", name = "rf", descriptor = "I")
    public int field2913;

    @OriginalMember(owner = "client!ffa", name = "xb", descriptor = "I")
    private int field2919;

    @OriginalMember(owner = "client!ffa", name = "og", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!ffa", name = "Ug", descriptor = "I")
    private int field2961;

    @OriginalMember(owner = "client!ffa", name = "dh", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!ffa", name = "bg", descriptor = "I")
    private int field2986;

    @OriginalMember(owner = "client!ffa", name = "Qf", descriptor = "I")
    private int field2989;

    @OriginalMember(owner = "client!ffa", name = "kg", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!ffa", name = "Ie", descriptor = "I")
    private int field2997;

    @OriginalMember(owner = "client!ffa", name = "Pf", descriptor = "I")
    private int field3001;

    @OriginalMember(owner = "client!ffa", name = "Yc", descriptor = "J")
    private long field2883;

    @OriginalMember(owner = "client!ffa", name = "G", descriptor = "Lqda;")
    private class113 field2856;

    @OriginalMember(owner = "client!ffa", name = "ce", descriptor = "Lct;")
    private class156 field2858;

    @OriginalMember(owner = "client!ffa", name = "hc", descriptor = "Lct;")
    public class156 field2933;

    @OriginalMember(owner = "client!ffa", name = "Ce", descriptor = "Lml;")
    private class407 field2900;

    @OriginalMember(owner = "client!ffa", name = "pc", descriptor = "Lml;")
    private class407 field2958;

    @OriginalMember(owner = "client!ffa", name = "fc", descriptor = "Ljb;")
    public class519 field2891;

    @OriginalMember(owner = "client!ffa", name = "xg", descriptor = "Ljb;")
    public class519 field2902;

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "Ljb;")
    public class519 field2907;

    @OriginalMember(owner = "client!ffa", name = "jb", descriptor = "Ljb;")
    public class519 field2917;

    @OriginalMember(owner = "client!ffa", name = "Je", descriptor = "Ljb;")
    public class519 field2918;

    @OriginalMember(owner = "client!ffa", name = "Wb", descriptor = "Ljb;")
    public class519 field2926;

    @OriginalMember(owner = "client!ffa", name = "Nb", descriptor = "Ljb;")
    public class519 field2940;

    @OriginalMember(owner = "client!ffa", name = "Rg", descriptor = "Ljb;")
    public class519 field2957;

    @OriginalMember(owner = "client!ffa", name = "ge", descriptor = "Ljb;")
    public class519 field2960;

    @OriginalMember(owner = "client!ffa", name = "db", descriptor = "Ljb;")
    public class519 field2980;

    @OriginalMember(owner = "client!ffa", name = "rh", descriptor = "Luo;")
    public class602 field2886;

    @OriginalMember(owner = "client!ffa", name = "Mg", descriptor = "Luo;")
    public class602 field2925;

    @OriginalMember(owner = "client!ffa", name = "Xf", descriptor = "Lgda;")
    private class61 field2975;

    @OriginalMember(owner = "client!ffa", name = "ih", descriptor = "Lraa;")
    private class633 field2974;

    @OriginalMember(owner = "client!ffa", name = "O", descriptor = "Lbca;")
    public class689 field2954;

    @OriginalMember(owner = "client!ffa", name = "rd", descriptor = "Lnk;")
    private class746 field2857;

    @OriginalMember(owner = "client!ffa", name = "sf", descriptor = "Lnk;")
    private class746 field2860;

    @OriginalMember(owner = "client!ffa", name = "cf", descriptor = "Lcm;")
    private class758 field2892;

    @OriginalMember(owner = "client!ffa", name = "jc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2848;

    @OriginalMember(owner = "client!ffa", name = "ub", descriptor = "Z")
    private boolean field2875;

    @OriginalMember(owner = "client!ffa", name = "tb", descriptor = "Z")
    private boolean field2878;

    @OriginalMember(owner = "client!ffa", name = "kh", descriptor = "Z")
    private boolean field2880;

    @OriginalMember(owner = "client!ffa", name = "Bg", descriptor = "Z")
    private boolean field2881;

    @OriginalMember(owner = "client!ffa", name = "gf", descriptor = "Z")
    private boolean field2887;

    @OriginalMember(owner = "client!ffa", name = "he", descriptor = "Z")
    public boolean field2896;

    @OriginalMember(owner = "client!ffa", name = "Qd", descriptor = "Z")
    public boolean field2899;

    @OriginalMember(owner = "client!ffa", name = "sh", descriptor = "Z")
    private boolean field2906;

    @OriginalMember(owner = "client!ffa", name = "Ge", descriptor = "Z")
    public boolean field2911;

    @OriginalMember(owner = "client!ffa", name = "ye", descriptor = "Z")
    public boolean field2929;

    @OriginalMember(owner = "client!ffa", name = "Q", descriptor = "Z")
    public boolean field2932;

    @OriginalMember(owner = "client!ffa", name = "vc", descriptor = "Z")
    public boolean field2937;

    @OriginalMember(owner = "client!ffa", name = "Cb", descriptor = "Z")
    private boolean field2939;

    @OriginalMember(owner = "client!ffa", name = "Ye", descriptor = "Z")
    private boolean field2943;

    @OriginalMember(owner = "client!ffa", name = "W", descriptor = "Z")
    public boolean field2946;

    @OriginalMember(owner = "client!ffa", name = "Ec", descriptor = "Z")
    private boolean field2947;

    @OriginalMember(owner = "client!ffa", name = "Db", descriptor = "Z")
    private boolean field2952;

    @OriginalMember(owner = "client!ffa", name = "Zb", descriptor = "Z")
    public boolean field2956;

    @OriginalMember(owner = "client!ffa", name = "Sf", descriptor = "Z")
    public boolean field2962;

    @OriginalMember(owner = "client!ffa", name = "Hg", descriptor = "Z")
    private boolean field2966;

    @OriginalMember(owner = "client!ffa", name = "Id", descriptor = "[Lmw;")
    private class517[] field2898;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FIF)V")
    public final void method1675(float arg0, int arg1, float arg2) {
        try {
            ++field2826;
            this.field2979 = arg0;
            this.field2890 = arg2;
            this.method1707(-78);
            if (arg1 >= -98) {
                this.field2941 = -119;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[86] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class197(Canvas arg0, class160 arg1, int arg2) {
        super(arg1);
        new class540();
        new class112(16);
        this.field2867 = new class513();
        this.field2869 = new class513();
        this.field2870 = new class513();
        this.field2871 = new class513();
        this.field2872 = new class513();
        this.field2873 = new class513();
        this.field2874 = new class513();
        this.field2882 = new class768();
        this.field2884 = new class768();
        this.field2885 = new class768();
        this.field2888 = new float[4];
        this.field2910 = -1.0F;
        this.field2895 = 8448;
        this.field2905 = -1;
        this.field2890 = 0.0F;
        this.field2936 = 1.0F;
        this.field2923 = 3584;
        this.field2924 = 0;
        this.field2938 = true;
        this.field2921 = -1.0F;
        this.field2894 = 0;
        this.field2934 = 3584.0F;
        this.field2903 = 0;
        this.field2955 = -1.0F;
        this.field2915 = 0;
        this.field2967 = 0;
        this.field2945 = -1.0F;
        this.field2949 = 512;
        this.field2963 = 50;
        this.field2950 = 0;
        this.field2953 = new float[4];
        this.field2976 = new float[4];
        this.field2979 = 1.0F;
        this.field2951 = 0;
        this.field2971 = -1;
        this.field2930 = 1.0F;
        this.field2941 = 512;
        this.field2985 = -1;
        this.field2981 = 0;
        this.field2927 = 8448;
        this.field2984 = -1;
        this.field2904 = new class471[class469.field6815];
        this.field2973 = 3584.0F;
        this.field2987 = 1.0F;
        this.field2969 = 0;
        this.field2944 = new float[4];
        this.field2942 = -1;
        this.field2977 = new float[16];
        this.field2990 = 0;
        this.field2991 = 1.0F;
        this.field2988 = false;
        this.field2994 = new class353(8192);
        this.field3000 = new int[1];
        this.field2998 = new int[1];
        this.field3002 = new int[1];
        this.field2999 = new byte[16384];
        try {
            this.field2765 = this.field2710 = arg0;
            this.field2837 = arg2;
            if (!class116.method1024(field3003[158], 1)) {
                throw new RuntimeException("");
            } else if (!class116.method1024(field3003[159], 1)) {
                throw new RuntimeException("");
            } else {
                try {
                    this.field2654 = new OpenGL();
                    this.field2821 = this.field2759 = this.field2654.init(arg0, 8, 8, 8, 24, 0, this.field2837);
                    if (~this.field2759 == -1L) {
                        throw new RuntimeException("");
                    } else {
                        this.method1702((byte) 91);
                        int var4 = this.method1747(-66);
                        if (var4 != 0) {
                            throw new RuntimeException("");
                        } else {
                            this.field2889 = this.field2922 ? 33639 : 5121;
                            if (~this.field2982.indexOf(field3003[161]) != 0) {
                                int var5 = 0;
                                boolean var6 = false;
                                boolean var7 = false;
                                String[] var8 = class350.method2878(this.field2982.replace('/', ' '), ' ', (byte) 109);
                                for (int var9 = 0; var9 < var8.length; ++var9) {
                                    String var10 = var8[var9];
                                    try {
                                        if (~var10.length() < -1) {
                                            if (var10.charAt(0) == 'x' && var10.length() >= 3 && client.method2681(true, var10.substring(1, 3))) {
                                                var10 = var10.substring(1);
                                                var7 = true;
                                            }
                                            if (var10.equals(field3003[160])) {
                                                var6 = true;
                                            } else {
                                                if (var10.startsWith(field3003[160])) {
                                                    var10 = var10.substring(2);
                                                    var6 = true;
                                                }
                                                if (var10.length() >= 4 && client.method2681(true, var10.substring(0, 4))) {
                                                    var5 = class244.method2078(-7431, var10.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var15) {
                                    }
                                }
                                if (!var7 && !var6) {
                                    if (var5 >= 7000 && ~var5 >= -9251) {
                                        this.field2908 = false;
                                    }
                                    if (~var5 <= -7001 && var5 <= 7999) {
                                        this.field2948 = false;
                                    }
                                }
                                if (!var6 || ~var5 > -4001) {
                                    this.field2968 = false;
                                }
                                this.field2964 &= this.field2654.method4777(field3003[163]);
                                this.field2931 = this.field2948;
                                this.field2914 = true;
                            }
                            if (this.field2996.indexOf(field3003[116]) != -1) {
                                this.field2983 = false;
                            }
                            this.field2959 = !this.field2996.equals(field3003[162]);
                            if (this.field2948) {
                                try {
                                    int[] var11 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var11, 0);
                                } catch (Throwable var14) {
                                    throw new RuntimeException("");
                                }
                            }
                            class624.method4635(false, -17200, true);
                            this.field2850 = true;
                            this.field2843 = new class37(this, super.field679);
                            this.method1676(32465);
                            this.field2851 = new class587(this);
                            this.field2834 = new class734(this);
                            if (this.field2834.method5354(-1368)) {
                                this.field2840 = new class638(this);
                                if (!this.field2840.method4681(16876)) {
                                    this.field2840.method2711((byte) -79);
                                    this.field2840 = null;
                                }
                            }
                            this.field2824 = new class457(this);
                            this.method1705((byte) 95);
                            this.method1690((byte) -54);
                            this.method575();
                        }
                    }
                } catch (Throwable var16) {
                    var16.printStackTrace();
                    this.method470();
                    throw new RuntimeException("");
                }
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field3003[157] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "(I)V")
    private final void method1676(int arg0) {
        try {
            this.field2898 = new class517[this.field2935];
            ++field2812;
            this.field2954 = new class689(this, 3553, 6408, 1, 1);
            new class689(this, 3553, 6408, 1, 1);
            new class689(this, 3553, 6408, 1, 1);
            this.field2917 = new class519(this);
            this.field2926 = new class519(this);
            this.field2907 = new class519(this);
            this.field2960 = new class519(this);
            this.field2891 = new class519(this);
            this.field2980 = new class519(this);
            this.field2940 = new class519(this);
            this.field2957 = new class519(this);
            this.field2918 = new class519(this);
            this.field2902 = new class519(this);
            if (this.field2983) {
                this.field2933 = new class156(this);
                new class156(this);
            }
            if (arg0 != 32465) {
                this.field2944 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[202] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "na", descriptor = "(IIII)[I")
    public final int[] method474(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2639;
            int[] var5 = new int[arg2 * arg3];
            for (int var6 = 0; ~var6 > ~arg3; ++var6) {
                OpenGL.glReadPixelsi(arg0, this.field2687 - var6 + -arg1, arg2, 1, 32993, this.field2889, var5, arg2 * var6);
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3003[228] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(BI)Z")
    public static final boolean method1677(byte arg0, int arg1) {
        try {
            int var2 = -118 / ((-16 - arg0) / 61);
            ++field2760;
            return ~arg1 == -4 || ~arg1 == -5 || arg1 == 5 || ~arg1 == -7;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[226] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIBI)V")
    public final void method1678(int arg0, int arg1, byte arg2, int arg3) {
        try {
            int var5 = 103 % ((arg2 - 20) / 52);
            OpenGL.glDrawArrays(arg3, arg0, arg1);
            ++field2653;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[41] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "()Z")
    public final boolean method502() {
        try {
            ++field2703;
            return this.field2824.method3488(7, 3);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[46] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "(II)I")
    public final int method1679(int arg0, int arg1) {
        try {
            ++field2656;
            if (~arg1 == -2) {
                return 7681;
            } else if (~arg1 != -1) {
                if (~arg1 == -3) {
                    return 34165;
                } else if (~arg1 == -4) {
                    return 260;
                } else if (~arg1 == -5) {
                    return 34023;
                } else {
                    if (arg0 != -4711) {
                        this.field2995 = -63;
                    }
                    throw new IllegalArgumentException();
                }
            } else {
                return 8448;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V")
    public final void method1680(boolean arg0, int arg1) {
        try {
            if (this.field2881 == !arg0) {
                this.field2881 = arg0;
                this.method1718((byte) 71);
                this.field2879 &= -32;
            }
            if (arg1 != -32) {
                this.field2900 = null;
            }
            ++field2678;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[26] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[Luf;)V")
    public final void method573(int arg0, class471[] arg1) {
        try {
            ++field2700;
            for (int var3 = 0; ~var3 > ~arg0; ++var3) {
                this.field2904[var3] = arg1[var3];
            }
            this.field2901 = arg0;
            if (this.field2919 != 1) {
                this.method1748((byte) 63);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[206] + arg0 + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "(I)V")
    public final void method535(int arg0) {
        try {
            ++field2661;
            this.method1722(-47);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIII)V")
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            OpenGL.glLineWidth((float) arg5);
            ++field2810;
            this.method532(arg0, arg1, arg2, arg3, arg4, arg6);
            OpenGL.glLineWidth(1.0F);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3003[194] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Llq;[Liga;Z)Lda;")
    public final class67 method563(class578 arg0, class481[] arg1, boolean arg2) {
        try {
            ++field2755;
            return new class791(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[223] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method557(Canvas arg0) {
        try {
            ++field2783;
            if (this.field2710 == arg0) {
                throw new RuntimeException();
            } else if (this.field2686.containsKey(arg0)) {
                Long var2 = (Long) this.field2686.get(arg0);
                this.field2654.releaseSurface(arg0, var2);
                this.field2686.remove(arg0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[54] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "(IIIIIII)I")
    public final int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field2655;
            float var8 = (float) arg2 * this.field2882.field11095 + (float) arg0 * this.field2882.field11105 + (float) arg1 * this.field2882.field11125 + this.field2882.field11128;
            float var9 = (float) arg5 * this.field2882.field11095 + (float) arg3 * this.field2882.field11105 + (float) arg4 * this.field2882.field11125 + this.field2882.field11128;
            int var10 = 0;
            if ((float) this.field2963 > var8 && var9 < (float) this.field2963) {
                var10 |= 16;
            } else if ((float) this.field2923 < var8 && (float) this.field2923 < var9) {
                var10 |= 32;
            }
            int var11 = (int) (((float) arg2 * this.field2882.field11114 + (float) arg0 * this.field2882.field11090 + (float) arg1 * this.field2882.field11098 + this.field2882.field11106) * (float) this.field2941 / (float) arg6);
            int var12 = (int) (((float) arg5 * this.field2882.field11114 + (float) arg3 * this.field2882.field11090 + (float) arg4 * this.field2882.field11098 + this.field2882.field11106) * (float) this.field2941 / (float) arg6);
            if (this.field2992 > (float) var11 && this.field2992 > (float) var12) {
                var10 |= 1;
            } else if ((float) var11 > this.field2916 && this.field2916 < (float) var12) {
                var10 |= 2;
            }
            int var13 = (int) (((float) arg2 * this.field2882.field11092 + (float) arg0 * this.field2882.field11097 + (float) arg1 * this.field2882.field11110 + this.field2882.field11118) * (float) this.field2949 / (float) arg6);
            int var14 = (int) (((float) arg5 * this.field2882.field11092 + (float) arg3 * this.field2882.field11097 + (float) arg4 * this.field2882.field11110 + this.field2882.field11118) * (float) this.field2949 / (float) arg6);
            if (this.field2920 > (float) var13 && (float) var14 < this.field2920) {
                var10 |= 4;
            } else if ((float) var13 > this.field2970 && (float) var14 > this.field2970) {
                var10 |= 8;
            }
            return var10;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field3003[106] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIIIII)V")
    public final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2737;
            this.method1712(-92);
            this.method1743(-98, arg5);
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
            throw class759.method5498(var12, field3003[37] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZZ)V")
    public final void method1681(boolean arg0, boolean arg1) {
        try {
            ++field2776;
            if (!this.field2875 == arg0) {
                if (arg0) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
                this.field2875 = arg0;
                this.field2879 &= -32;
            }
            if (!arg1) {
                this.field2686 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[201] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "(I)Lza;")
    public final class434 method475(int arg0) {
        try {
            ++field2719;
            class130 var2 = new class130(arg0);
            this.field2854.method3868(-56, var2);
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[146] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
    public final void method481(int arg0) {
        try {
            ++field2664;
            if (arg0 >= 128 && ~arg0 >= -1025) {
                this.field2842 = arg0;
                this.field2843.method243((byte) -102);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[213] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "DA", descriptor = "(IIII)V")
    public final void method479(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2949 = arg3;
            ++field2796;
            this.field2950 = arg1;
            this.field2951 = arg0;
            this.field2941 = arg2;
            this.method1699(123);
            this.method1726(28854);
            if (this.field2919 != 3) {
                if (~this.field2919 == -3) {
                    this.method1719((byte) -128);
                    return;
                }
            } else {
                this.method1687((byte) 57);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[205] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "pa", descriptor = "()V")
    public final void method523() {
        try {
            ++field2792;
            this.field2896 = false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[175] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method504(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class382 {
        try {
            ++field2836;
            this.method513(arg2, arg3);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[229] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        try {
            ++field2767;
            class370 var10 = (class370) arg6;
            class61 var11 = var10.field5644;
            this.method1691((byte) -46);
            this.method1733(var10.field5644, 17237);
            this.method1743(-107, arg5);
            this.method1684((byte) -61, 8448, 7681);
            this.method1739(34167, 0, (byte) 19, 768);
            float var12 = var11.field646 / (float) var11.field645;
            float var13 = var11.field644 / (float) var11.field640;
            float var14 = (float) arg2 - (float) arg0;
            float var15 = (float) (-arg1) + (float) arg3;
            float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var17 = var14 * var16;
            float var18 = var15 * var16;
            OpenGL.glBegin(1);
            OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
            OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
            OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
            OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
            OpenGL.glEnd();
            this.method1739(5890, 0, (byte) 19, 768);
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field3003[218] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3003[9] : field3003[10]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "()Z")
    public final boolean method472() {
        try {
            ++field2802;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[62] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BIZI[B)Lml;")
    public final class407 method1682(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        try {
            if (arg0 != -38) {
                return null;
            } else {
                ++field2679;
                return (class407) (!this.field2948 || arg2 && !this.field2931 ? new class489(this, arg3, arg4, arg1) : new class691(this, arg3, arg4, arg1, arg2));
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[52] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "aa", descriptor = "(IIIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2701;
            float var7 = (float) arg0 + 0.35F;
            float var8 = (float) arg1 + 0.35F;
            float var9 = (float) arg2 + var7;
            this.method1712(-74);
            float var10 = (float) arg3 + var8;
            this.method1743(-107, arg5);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            if (this.field2906) {
                OpenGL.glDisable(32925);
            }
            OpenGL.glBegin(7);
            OpenGL.glVertex2f(var7, var8);
            OpenGL.glVertex2f(var7, var10);
            OpenGL.glVertex2f(var9, var10);
            OpenGL.glVertex2f(var9, var8);
            OpenGL.glEnd();
            if (this.field2906) {
                OpenGL.glEnable(32925);
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field3003[30] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIII)V")
    public final void method1683(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg1 != 32888) {
                this.field2944 = null;
            }
            ++field2787;
            OpenGL.glTexEnvi(8960, arg3 + 34184, arg2);
            OpenGL.glTexEnvi(8960, arg3 + 34200, arg0);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[225] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIZ)Lfs;")
    public final class581 method534(int arg0, int arg1, boolean arg2) {
        try {
            ++field2715;
            return new class113(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[20] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "([IIIIIZ)Lfs;")
    public final class581 method560(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field2698;
            return new class113(this, arg3, arg4, arg0, arg1, arg2);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3003[196] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "()V")
    public final void method473() {
        try {
            ++field2753;
            OpenGL.glFinish();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[104] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BII)V")
    public final void method1684(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 == -61) {
                if (this.field2912 != 0) {
                    OpenGL.glTexEnvi(8960, 34161, arg2);
                    OpenGL.glTexEnvi(8960, 34162, arg1);
                } else {
                    boolean var4 = false;
                    if (~this.field2895 != ~arg2) {
                        OpenGL.glTexEnvi(8960, 34161, arg2);
                        this.field2895 = arg2;
                        var4 = true;
                    }
                    if (this.field2927 != arg1) {
                        OpenGL.glTexEnvi(8960, 34162, arg1);
                        this.field2927 = arg1;
                        var4 = true;
                    }
                    if (var4) {
                        this.field2879 &= -30;
                    }
                }
                ++field2746;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[98] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "xa", descriptor = "(F)V")
    public final void method526(float arg0) {
        try {
            if (this.field2965 != arg0) {
                this.field2965 = arg0;
                this.method1717(1);
            }
            ++field2773;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[190] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "(I)V")
    public final void method1685(int arg0) {
        try {
            if (arg0 >= -59) {
                this.field2980 = null;
            }
            if (this.field2919 != 0) {
                this.field2919 = 0;
                this.field2879 &= -32;
            }
            ++field2822;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[100] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lza;)V")
    public final void method515(class434 arg0) {
        try {
            this.field2848 = ((class130) arg0).field1526;
            ++field2688;
            if (this.field2900 == null) {
                class353 var2 = new class353(80);
                if (!this.field2922) {
                    var2.method2892(-1335387932, -1.0F);
                    var2.method2892(-1335387932, -1.0F);
                    var2.method2892(-1335387932, 0.0F);
                    var2.method2892(-1335387932, 0.0F);
                    var2.method2892(-1335387932, 1.0F);
                    var2.method2892(-1335387932, 1.0F);
                    var2.method2892(-1335387932, -1.0F);
                    var2.method2892(-1335387932, 0.0F);
                    var2.method2892(-1335387932, 1.0F);
                    var2.method2892(-1335387932, 1.0F);
                    var2.method2892(-1335387932, 1.0F);
                    var2.method2892(-1335387932, 1.0F);
                    var2.method2892(-1335387932, 0.0F);
                    var2.method2892(-1335387932, 1.0F);
                    var2.method2892(-1335387932, 0.0F);
                    var2.method2892(-1335387932, -1.0F);
                    var2.method2892(-1335387932, 1.0F);
                    var2.method2892(-1335387932, 0.0F);
                    var2.method2892(-1335387932, 0.0F);
                    var2.method2892(-1335387932, 0.0F);
                } else {
                    var2.method2890(-1.0F, (byte) -102);
                    var2.method2890(-1.0F, (byte) -102);
                    var2.method2890(0.0F, (byte) -113);
                    var2.method2890(0.0F, (byte) 61);
                    var2.method2890(1.0F, (byte) -123);
                    var2.method2890(1.0F, (byte) -117);
                    var2.method2890(-1.0F, (byte) -120);
                    var2.method2890(0.0F, (byte) -106);
                    var2.method2890(1.0F, (byte) -10);
                    var2.method2890(1.0F, (byte) -15);
                    var2.method2890(1.0F, (byte) 71);
                    var2.method2890(1.0F, (byte) -106);
                    var2.method2890(0.0F, (byte) 12);
                    var2.method2890(1.0F, (byte) -116);
                    var2.method2890(0.0F, (byte) 123);
                    var2.method2890(-1.0F, (byte) 90);
                    var2.method2890(1.0F, (byte) -118);
                    var2.method2890(0.0F, (byte) 98);
                    var2.method2890(0.0F, (byte) -116);
                    var2.method2890(0.0F, (byte) -94);
                }
                this.field2900 = this.method1682((byte) -38, var2.field2201, false, 20, var2.field2209);
                this.field2925 = new class602(this.field2900, 5126, 3, 0);
                this.field2886 = new class602(this.field2900, 5126, 2, 12);
                this.field2830.method3005((byte) 87, this);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[83] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "(B)V")
    private final void method1686(byte arg0) {
        try {
            this.field2977[14] = this.field2972;
            this.field2977[10] = this.field2893;
            ++field2818;
            this.field2934 = (float) this.field2923;
            if (arg0 != 75) {
                this.field2946 = false;
            }
            this.field2973 = (this.field2977[14] + (float) (-this.field2923)) / this.field2977[10];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[212] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
    public final synchronized void method498(int arg0) {
        try {
            ++field2841;
            int var14 = arg0 & Integer.MAX_VALUE;
            int var2 = 0;
            while (!this.field2869.method3873(-119)) {
                class609 var3 = (class609) this.field2869.method3875(-96);
                class382.field5789[var2++] = (int) var3.field3177;
                this.field2868 -= var3.field8902;
                if (var2 == 1000) {
                    OpenGL.glDeleteBuffersARB(var2, class382.field5789, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteBuffersARB(var2, class382.field5789, 0);
                var2 = 0;
            }
            while (!this.field2870.method3873(61)) {
                class609 var4 = (class609) this.field2870.method3875(79);
                class382.field5789[var2++] = (int) var4.field3177;
                this.field2866 -= var4.field8902;
                if (~var2 == -1001) {
                    OpenGL.glDeleteTextures(var2, class382.field5789, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteTextures(var2, class382.field5789, 0);
                var2 = 0;
            }
            while (!this.field2871.method3873(-123)) {
                class609 var5 = (class609) this.field2871.method3875(-53);
                class382.field5789[var2++] = var5.field8902;
                if (var2 == 1000) {
                    OpenGL.glDeleteFramebuffersEXT(var2, class382.field5789, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteFramebuffersEXT(var2, class382.field5789, 0);
                var2 = 0;
            }
            while (!this.field2872.method3873(96)) {
                class609 var6 = (class609) this.field2872.method3875(121);
                class382.field5789[var2++] = (int) var6.field3177;
                this.field2865 -= var6.field8902;
                if (var2 == 1000) {
                    OpenGL.glDeleteRenderbuffersEXT(var2, class382.field5789, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class382.field5789, 0);
                boolean var7 = false;
            }
            while (!this.field2867.method3873(27)) {
                class609 var8 = (class609) this.field2867.method3875(111);
                OpenGL.glDeleteLists((int) var8.field3177, var8.field8902);
            }
            while (!this.field2873.method3873(17)) {
                class206 var9 = this.field2873.method3875(-113);
                OpenGL.glDeleteProgramARB((int) var9.field3177);
            }
            while (!this.field2874.method3873(110)) {
                class206 var10 = this.field2874.method3875(94);
                OpenGL.glDeleteObjectARB(var10.field3177);
            }
            while (!this.field2867.method3873(19)) {
                class609 var11 = (class609) this.field2867.method3875(120);
                OpenGL.glDeleteLists((int) var11.field3177, var11.field8902);
            }
            this.field2843.method244(5);
            if (~this.method494() < -100663297 && ~class430.method3299(119) < ~(this.field2883 - -60000L)) {
                System.gc();
                this.field2883 = class430.method3299(92);
            }
            this.field2853 = var14;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field3003[184] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "(B)V")
    private final void method1687(byte arg0) {
        try {
            ++field2649;
            float var2 = (float) (-this.field2951) * this.field2991 / (float) this.field2941;
            float var3 = (float) (-this.field2950) * this.field2991 / (float) this.field2949;
            if (arg0 != 57) {
                this.field2944 = null;
            }
            float var4 = (float) (-this.field2951 + this.field2742) * this.field2991 / (float) this.field2941;
            float var5 = (float) (-this.field2950 + this.field2687) * this.field2991 / (float) this.field2949;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field2963, (double) this.field2923);
            }
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[192] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "(Z)V")
    private final void method1688(boolean arg0) {
        try {
            class486.field7009[0] = this.field2955 * this.field2930;
            class486.field7009[3] = 1.0F;
            class486.field7009[2] = this.field2987 * this.field2955;
            class486.field7009[1] = this.field2955 * this.field2936;
            ++field2683;
            OpenGL.glLightfv(16384, 4609, class486.field7009, 0);
            class486.field7009[2] = -this.field2921 * this.field2987;
            class486.field7009[1] = -this.field2921 * this.field2936;
            if (arg0) {
                this.method582(-124, -20, -104, 24, -0.21827300657236287D);
            }
            class486.field7009[3] = 1.0F;
            class486.field7009[0] = -this.field2921 * this.field2930;
            OpenGL.glLightfv(16385, 4609, class486.field7009, 0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[179] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(II)V")
    public final void method490(int arg0, int arg1) {
        try {
            ++field2692;
            if (this.field2963 != arg0 || ~this.field2923 != ~arg1) {
                this.field2923 = arg1;
                this.field2963 = arg0;
                this.method1699(-71);
                this.method1707(125);
                if (this.field2919 == 3) {
                    this.method1687((byte) 57);
                    return;
                }
                if (~this.field2919 != -3) {
                    return;
                }
                this.method1719((byte) -123);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[215] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "la", descriptor = "()V")
    public final void method553() {
        try {
            this.field2924 = this.field2742;
            ++field2754;
            this.field2894 = this.field2687;
            this.field2967 = 0;
            this.field2981 = 0;
            OpenGL.glDisable(3089);
            this.method1726(28854);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[35] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "()Z")
    public final boolean method469() {
        try {
            ++field2764;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[103] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)Lnq;")
    public final class485 method478(int arg0, int arg1) {
        try {
            ++field2693;
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[56] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(ILob;)V")
    public final void method1689(int arg0, class768 arg1) {
        try {
            ++field2729;
            if (arg0 != 34166) {
                this.field2949 = -86;
            }
            OpenGL.glPushMatrix();
            OpenGL.glMultMatrixf(arg1.method5543(9), 0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[233] + arg0 + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "(B)V")
    private final void method1690(byte arg0) {
        try {
            if (this.field2765 == null) {
                this.field2662 = this.field2734 = 0;
            } else {
                Dimension var2 = this.field2765.getSize();
                this.field2662 = var2.width;
                this.field2734 = var2.height;
            }
            if (arg0 != -54) {
                this.field2875 = true;
            }
            ++field2768;
            if (this.field2860 == null) {
                this.field2742 = this.field2662;
                this.field2687 = this.field2734;
                this.method1721((byte) 92);
            }
            this.method1685(-89);
            this.method553();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[185] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljw;)V")
    public final void method590(class580 arg0) {
        try {
            ++field2741;
            this.field2830.method2998((byte) -128, this, -1, arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[231] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "(B)V")
    public final void method1691(byte arg0) {
        try {
            if (~this.field2879 != -3) {
                this.method1737(-1265);
                this.method1698(-75, false);
                this.method1706(-123, false);
                this.method1681(false, true);
                this.method1680(false, -32);
                this.method1729((byte) -101, -2);
                this.field2879 = 2;
            }
            int var2 = 66 % ((arg0 - 50) / 39);
            ++field2732;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[28] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "([I)V")
    public final void method539(int[] arg0) {
        try {
            arg0[0] = this.field2742;
            ++field2784;
            arg0[1] = this.field2687;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[199] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(III)V")
    public final synchronized void method1692(int arg0, int arg1, int arg2) {
        try {
            ++field2712;
            class609 var4 = new class609(arg0);
            if (arg2 == -24185) {
                var4.field3177 = (long) arg1;
                this.field2872.method3868(arg2 ^ -24082, var4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[209] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "A", descriptor = "()V")
    public final void method501() {
        try {
            ++field2725;
            if (!this.field2983) {
                if (!this.field2939) {
                    throw new RuntimeException("");
                }
                this.field2856.method987(0, 0, this.field2742, this.field2687, 0, 0);
                this.field2654.setSurface(this.field2821);
            } else {
                if (this.field2860 != this.field2858) {
                    throw new RuntimeException();
                }
                this.field2858.method1300((byte) 41, 0);
                this.field2858.method1300((byte) 41, 8);
                this.method1746(this.field2858, (byte) 127);
            }
            this.field2742 = this.field2662;
            this.field2856 = null;
            this.field2687 = this.field2734;
            this.method1685(-61);
            this.method1721((byte) 45);
            this.method553();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[172] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "(II)V")
    public final void method1693(int arg0, int arg1) {
        try {
            class486.field7009[2] = (float) class291.method2359(arg0, 255) / 255.0F;
            class486.field7009[3] = (float) (arg0 >>> 24) / 255.0F;
            class486.field7009[1] = (float) class291.method2359(65280, arg0) / 65280.0F;
            class486.field7009[0] = (float) class291.method2359(arg0, 16711680) / 1.671168E7F;
            ++field2762;
            OpenGL.glTexEnvfv(8960, arg1, class486.field7009, 0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[222] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lraa;IIII)V")
    public final void method1694(class633 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg3 != 6056) {
                this.field2934 = -0.7042111F;
            }
            ++field2668;
            int var6 = arg0.method458(false);
            int var9 = arg4 * this.method1714(7, var6);
            this.method1752(arg0, 115);
            OpenGL.glDrawElements(arg1, arg2, var6, (long) var9 + arg0.method457(-2471));
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3003[66] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lol;)V")
    public final void method555(class299 arg0) {
        try {
            ++field2744;
            this.field2892 = (class758) arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[25] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            ++field2726;
            float var10;
            float var11;
            if (this.field2975 != null && ~arg2 >= ~this.field2975.field9982 && arg3 <= this.field2975.field9988) {
                this.field2975.method5049(arg6, 6406, false, 0, arg3, -77, 0, 0, arg2, 0);
                var10 = (float) arg3 * this.field2975.field644 / (float) this.field2975.field9988;
                var11 = (float) arg2 * this.field2975.field646 / (float) this.field2975.field9982;
            } else {
                this.field2975 = class329.method2784(6406, this, arg3, arg2, (byte) 53, arg6, false, 6406);
                this.field2975.method5046(false, (byte) -117, false);
                var10 = this.field2975.field644;
                var11 = this.field2975.field646;
            }
            this.method1691((byte) 114);
            this.method1733(this.field2975, 17237);
            this.method1743(-103, arg8);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            this.method1693(arg5, 8705);
            this.method1684((byte) -61, 34165, 34165);
            this.method1739(34166, 0, (byte) 19, 768);
            this.method1739(5890, 2, (byte) 19, 770);
            this.method1683(770, 32888, 34166, 0);
            this.method1683(770, 32888, 5890, 2);
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
            this.method1739(5890, 0, (byte) 19, 768);
            this.method1739(34166, 2, (byte) 19, 770);
            this.method1683(770, 32888, 5890, 0);
            this.method1683(770, 32888, 34166, 2);
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field3003[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3003[9] : field3003[10]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method516(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        try {
            ++field2681;
            boolean var7 = ~this.field2985 != ~arg0;
            if (var7 || this.field2955 != arg1 || this.field2921 != arg2) {
                this.field2955 = arg1;
                this.field2921 = arg2;
                this.field2985 = arg0;
                if (var7) {
                    this.field2930 = (float) (this.field2985 & 16711680) / 1.671168E7F;
                    this.field2936 = (float) (this.field2985 & 65280) / 65280.0F;
                    this.field2987 = (float) (255 & this.field2985) / 255.0F;
                    this.method1717(1);
                }
                this.method1688(false);
            }
            if (this.field2953[0] != arg3 || this.field2953[1] != arg4 || this.field2953[2] != arg5) {
                this.field2953[1] = arg4;
                this.field2953[0] = arg3;
                this.field2953[2] = arg5;
                this.field2944[2] = -arg5;
                this.field2944[0] = -arg3;
                this.field2944[1] = -arg4;
                float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
                this.field2888[2] = arg5 * var8;
                this.field2888[0] = arg3 * var8;
                this.field2888[1] = arg4 * var8;
                this.field2976[0] = -this.field2888[0];
                this.field2976[2] = -this.field2888[2];
                this.field2976[1] = -this.field2888[1];
                this.method1738(false);
                this.field2995 = (int) (arg5 * 256.0F / arg4);
                this.field2913 = (int) (arg3 * 256.0F / arg4);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3003[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "(Z)V")
    public final void method488(boolean arg0) {
        try {
            ++field2659;
            this.field2938 = arg0;
            this.method1718((byte) 71);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[188] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "(III[I)V")
    public final void method524(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field2690;
            float var5 = (float) arg2 * this.field2882.field11095 + (float) arg0 * this.field2882.field11105 + (float) arg1 * this.field2882.field11125 + this.field2882.field11128;
            if (var5 == 0.0F) {
                arg3[0] = arg3[1] = arg3[2] = -1;
            } else {
                int var6 = (int) (((float) arg2 * this.field2882.field11114 + (float) arg0 * this.field2882.field11090 + (float) arg1 * this.field2882.field11098 + this.field2882.field11106) * (float) this.field2941 / var5);
                arg3[0] = (int) ((float) var6 + -this.field2992);
                int var7 = (int) (((float) arg2 * this.field2882.field11092 + (float) arg0 * this.field2882.field11097 + (float) arg1 * this.field2882.field11110 + this.field2882.field11118) * (float) this.field2949 / var5);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field2920);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3003[142] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "(II)V")
    public final synchronized void method1695(int arg0, int arg1) {
        try {
            ++field2736;
            class609 var3 = new class609(arg1);
            if (arg0 != 4) {
                this.method1700(true, -65, (byte) 101);
            }
            this.field2871.method3868(127, var3);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[38] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(IIIIII)Lol;")
    public final class299 method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2635;
            return !this.field2962 ? null : new class761(this, arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3003[197] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILjava/lang/String;)Z")
    public static final boolean method1696(int arg0, int arg1, String arg2) {
        try {
            ++field2801;
            if (class580.field8601.field388) {
                class54.field592 = new class21();
                class54.field592.field243 = arg1;
                class54.field592.field250 = arg2;
                if (class64.field667 != class31.field364) {
                    class54.field592.field252 = class54.field592.field243 + 50000;
                    class54.field592.field242 = class54.field592.field243 + 40000;
                }
                for (int var3 = 0; ~var3 > ~class192.field2592.length; ++var3) {
                    if (~class192.field2592[var3].field8860 == ~arg1) {
                        class473.field6867 = class192.field2592[var3].field2529;
                    }
                }
                return true;
            } else {
                String var4 = "";
                if (arg0 != 10186) {
                    field2667 = 85;
                }
                if (class64.field667 != class31.field364) {
                    var4 = ":" + (arg1 + 7000);
                }
                String var5 = "";
                if (class335.field5229 != null) {
                    var5 = field3003[75] + class335.field5229;
                }
                String var6 = field3003[72] + arg2 + var4 + field3003[73] + class167.field2300 + field3003[77] + class676.field9805 + var5 + field3003[71] + (class296.field4464 ? "1" : "0") + field3003[76] + (!class294.field4335 ? "0" : "1") + field3003[74];
                try {
                    class43.field504.getAppletContext().showDocument(new URL(var6), field3003[79]);
                    return true;
                } catch (Exception var8) {
                    return false;
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3003[78] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(Z)V")
    public final void method1697(boolean arg0) {
        try {
            ++field2813;
            if (~this.field2879 != -17) {
                this.method1757(0);
                this.method1698(-67, true);
                this.method1681(true, true);
                this.method1680(true, -32);
                this.method1743(-89, 1);
                this.field2879 = 16;
            }
            if (arg0) {
                this.field2926 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[57] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
    public final void method1698(int arg0, boolean arg1) {
        try {
            int var3 = 13 % ((arg0 - 19) / 55);
            ++field2634;
            if (this.field2966 == !arg1) {
                this.field2966 = arg1;
                this.method1750(-12415);
                this.field2879 &= -32;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[55] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "(I)V")
    private final void method1699(int arg0) {
        try {
            ++field2823;
            int var2 = 47 % ((73 - arg0) / 42);
            float[] var3 = this.field2977;
            float var4 = (float) (-this.field2951 * this.field2963) / (float) this.field2941;
            float var5 = (float) ((-this.field2951 + this.field2742) * this.field2963) / (float) this.field2941;
            float var6 = (float) (this.field2963 * this.field2950) / (float) this.field2949;
            float var7 = (float) ((-this.field2687 + this.field2950) * this.field2963) / (float) this.field2949;
            if (var4 != var5 && var6 != var7) {
                float var8 = (float) this.field2963 * 2.0F;
                var3[4] = 0.0F;
                var3[13] = 0.0F;
                var3[9] = (var6 + var7) / (-var7 + var6);
                var3[0] = var8 / (-var4 + var5);
                var3[11] = -1.0F;
                var3[8] = (var4 + var5) / (var5 - var4);
                var3[1] = 0.0F;
                var3[10] = this.field2893 = (float) (-(this.field2963 + this.field2923)) / (float) (-this.field2963 + this.field2923);
                var3[15] = 0.0F;
                var3[14] = this.field2972 = -((float) this.field2923 * var8) / (float) (-this.field2963 + this.field2923);
                var3[5] = var8 / (-var7 + var6);
                var3[6] = 0.0F;
                var3[3] = 0.0F;
                var3[12] = 0.0F;
                var3[2] = 0.0F;
                var3[7] = 0.0F;
            } else {
                var3[4] = 0.0F;
                var3[10] = 1.0F;
                var3[1] = 0.0F;
                var3[8] = 0.0F;
                var3[11] = 0.0F;
                var3[13] = 0.0F;
                var3[3] = 0.0F;
                var3[15] = 1.0F;
                var3[7] = 0.0F;
                var3[0] = 1.0F;
                var3[2] = 0.0F;
                var3[5] = 1.0F;
                var3[9] = 0.0F;
                var3[12] = 0.0F;
                var3[6] = 0.0F;
                var3[14] = 0.0F;
            }
            this.method1686((byte) 75);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3003[80] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZIB)V")
    public final void method1700(boolean arg0, int arg1, byte arg2) {
        try {
            int var4 = 61 % ((-7 - arg2) / 48);
            ++field2733;
            this.method1701(2, true, arg0, arg1);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[31] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "KA", descriptor = "(IIII)V")
    public final void method489(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (~arg0 > -1) {
                arg0 = 0;
            }
            if (arg3 > this.field2687) {
                arg3 = this.field2687;
            }
            if (~arg2 < ~this.field2742) {
                arg2 = this.field2742;
            }
            ++field2788;
            if (arg1 < 0) {
                arg1 = 0;
            }
            this.field2924 = arg2;
            this.field2981 = arg1;
            this.field2967 = arg0;
            this.field2894 = arg3;
            OpenGL.glEnable(3089);
            this.method1726(28854);
            this.method1741((byte) 123);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[42] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZZI)V")
    public final void method1701(int arg0, boolean arg1, boolean arg2, int arg3) {
        try {
            ++field2794;
            if (arg0 != 2) {
                this.method584(-18, -67, -69);
            }
            if (~this.field2897 != ~arg3 || this.field2988 != this.field2896) {
                class689 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = this.field2896 ? 3 : 0;
                if (arg3 < 0) {
                    this.method1740(24879);
                } else {
                    var5 = this.field2843.method245(false, arg3);
                    class439 var10 = super.field679.method1366((byte) -42, arg3);
                    if (var10.field6475 == 0 && var10.field6466 == 0) {
                        this.method1740(24879);
                    } else {
                        int var11 = var10.field6481 ? 64 : 128;
                        int var12 = var11 * 50;
                        this.method1711((float) (this.field2853 % var12 * var10.field6466) / (float) var12, (byte) 56, (float) (this.field2853 % var12 * var10.field6475) / (float) var12, 0.0F);
                    }
                    var6 = var10.field6464;
                    if (!this.field2896) {
                        var7 = var10.field6461;
                        var9 = var10.field6467;
                        var8 = var10.field6462;
                    }
                }
                this.field2824.method3490(arg1, (byte) -39, var7, arg2, var9, var8);
                if (!this.field2824.method3486(var5, var6, 46)) {
                    this.method1733(var5, 17237);
                    this.method1753(0, var6);
                }
                this.field2897 = arg3;
                this.field2988 = this.field2896;
            }
            this.field2879 &= -8;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field3003[220] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "(B)V")
    private final void method1702(byte arg0) {
        try {
            ++field2697;
            if (arg0 <= 37) {
                this.method538(-14, 87, 120, -21);
            }
            int var2 = 0;
            while (!this.field2654.method4776()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class151.method1269(false, 1000L);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "(I)Lod;")
    public final class532 method1703(int arg0) {
        try {
            if (arg0 <= 61) {
                this.method573(45, (class471[]) null);
            }
            ++field2827;
            return this.field2892 == null ? null : this.field2892.method1814(13);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[110] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "L", descriptor = "(III)V")
    public final void method584(int arg0, int arg1, int arg2) {
        try {
            if (~this.field2971 != ~arg0 || this.field2905 != arg1 || ~this.field2903 != ~arg2) {
                this.field2971 = arg0;
                this.field2903 = arg2;
                this.field2905 = arg1;
                this.method1707(-54);
                this.method1750(-12415);
            }
            ++field2699;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[164] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(B)V")
    public final void method1704(byte arg0) {
        try {
            ++field2758;
            if (arg0 >= -73) {
                this.field2965 = 1.188977F;
            }
            if (this.field2879 != 8) {
                this.method1730(-9661);
                this.method1698(118, true);
                this.method1681(true, true);
                this.method1680(true, -32);
                this.method1743(-93, 1);
                this.field2879 = 8;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[53] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(B)V")
    private final void method1705(byte arg0) {
        try {
            ++field2684;
            this.method1729((byte) -101, -2);
            for (int var2 = this.field2935 + -1; var2 >= 0; --var2) {
                this.method1716(arg0 + 33889, var2);
                this.method1733((class517) null, 17237);
                OpenGL.glTexEnvi(8960, 8704, 34160);
            }
            this.method1684((byte) -61, 8448, 8448);
            this.method1739(34168, 2, (byte) 19, 770);
            this.method1740(24879);
            this.field2877 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field2876 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field2878 = true;
            if (arg0 != 95) {
                this.field2734 = -77;
            }
            OpenGL.glColorMask(true, true, true, true);
            this.field2880 = true;
            this.method1698(-67, true);
            this.method1706(-117, true);
            this.method1681(true, true);
            this.method1680(true, -32);
            this.method1685(-107);
            this.field2654.setSwapInterval(0);
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
            this.field2985 = this.field2971 = -1;
            this.method553();
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[211] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IZ)V")
    public final void method1706(int arg0, boolean arg1) {
        try {
            if (!this.field2943 == arg1) {
                this.field2943 = arg1;
                this.method1728(-15591);
                this.field2879 &= -8;
            }
            ++field2793;
            int var3 = 19 / ((-40 - arg0) / 61);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[36] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            ++field2791;
            if (~arg0 != ~arg2 || arg1 != arg3) {
                class370 var13 = (class370) arg6;
                class61 var14 = var13.field5644;
                this.method1691((byte) 92);
                this.method1733(var13.field5644, 17237);
                this.method1743(-81, arg5);
                this.method1684((byte) -61, 8448, 7681);
                this.method1739(34167, 0, (byte) 19, 768);
                float var15 = var14.field646 / (float) var14.field645;
                float var16 = var14.field644 / (float) var14.field640;
                float var17 = (float) (-arg0) + (float) arg2;
                float var18 = (float) (-arg1) + (float) arg3;
                float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
                float var20 = var17 * var19;
                int var34 = arg11 % (arg9 + arg10);
                float var21 = var18 * var19;
                OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
                float var22 = (float) arg9 * var20;
                float var23 = (float) arg9 * var21;
                float var24 = 0.0F;
                float var25 = 0.0F;
                float var26 = var22;
                float var27 = var23;
                if (~arg9 > ~var34) {
                    var25 = (float) (-var34 + arg9 + arg10) * var21;
                    var24 = (float) (arg9 + arg10 + -var34) * var20;
                } else {
                    var26 = (float) (-var34 + arg9) * var20;
                    var27 = (float) (-var34 + arg9) * var21;
                }
                float var28 = (float) arg0 + 0.35F + var24;
                float var29 = (float) arg1 + 0.35F + var25;
                float var30 = (float) arg10 * var20;
                float var31 = (float) arg10 * var21;
                while (true) {
                    if (arg2 <= arg0) {
                        if (var28 < (float) arg2 + 0.35F) {
                            break;
                        }
                        if (var26 + var28 < (float) arg2) {
                            var26 = (float) arg2 + -var28;
                        }
                    } else {
                        if ((float) arg2 + 0.35F < var28) {
                            break;
                        }
                        if ((float) arg2 < var26 + var28) {
                            var26 = (float) arg2 + -var28;
                        }
                    }
                    if (arg1 >= arg3) {
                        if ((float) arg3 + 0.35F > var29) {
                            break;
                        }
                        if ((float) arg3 > var27 + var29) {
                            var27 = (float) arg3 + -var29;
                        }
                    } else {
                        if ((float) arg3 + 0.35F < var29) {
                            break;
                        }
                        if (var27 + var29 > (float) arg3) {
                            var27 = (float) arg3 - var29;
                        }
                    }
                    OpenGL.glBegin(1);
                    OpenGL.glTexCoord2f((var28 - (float) arg7) * var15, (var29 - (float) arg8) * var16);
                    OpenGL.glVertex2f(var28, var29);
                    OpenGL.glTexCoord2f((var26 + var28 + (float) (-arg7)) * var15, (var27 + var29 - (float) arg8) * var16);
                    OpenGL.glVertex2f(var26 + var28, var27 + var29);
                    OpenGL.glEnd();
                    var29 += var27 + var31;
                    var28 += var26 + var30;
                    var27 = var23;
                    var26 = var22;
                }
                this.method1739(5890, 0, (byte) 19, 768);
            }
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field3003[165] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3003[9] : field3003[10]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "(I)V")
    private final void method1707(int arg0) {
        try {
            this.field2928 = (float) (-this.field2903 + this.field2923) + -this.field2890;
            ++field2750;
            this.field2993 = -((float) this.field2905 * this.field2979) + this.field2928;
            if (this.field2993 < (float) this.field2963) {
                this.field2993 = (float) this.field2963;
            }
            int var2 = 4 / ((28 - arg0) / 42);
            OpenGL.glFogf(2915, this.field2993);
            OpenGL.glFogf(2916, this.field2928);
            class486.field7009[2] = (float) class291.method2359(this.field2971, 255) / 255.0F;
            class486.field7009[1] = (float) class291.method2359(65280, this.field2971) / 65280.0F;
            class486.field7009[0] = (float) class291.method2359(this.field2971, 16711680) / 1.671168E7F;
            OpenGL.glFogfv(2918, class486.field7009, 0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[235] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "EA", descriptor = "(IIII)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2720;
            if (!this.field2896) {
                throw new RuntimeException("");
            } else {
                this.field2984 = arg2;
                this.field2942 = arg1;
                this.field2990 = arg3;
                this.field2978 = arg0;
                if (this.field2988) {
                    this.field2824.field6659.method3726((byte) -44);
                    this.field2824.field6659.method3725(1);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[189] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "(I)V")
    public final void method1708(int arg0) {
        try {
            if (this.field2879 != 4) {
                this.method1737(-1265);
                this.method1698(-62, false);
                this.method1706(-114, false);
                this.method1681(false, true);
                this.method1680(false, -32);
                this.method1729((byte) -101, -2);
                this.method1743(-110, 1);
                this.field2879 = 4;
            }
            ++field2711;
            if (arg0 < 60) {
                this.method486(-102, 24);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[33] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "I", descriptor = "()I")
    public final int method546() {
        try {
            ++field2657;
            int var1 = this.field2997;
            this.field2997 = 0;
            return var1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[61] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "(II)I")
    public final int method1709(int arg0, int arg1) {
        try {
            ++field2747;
            if (~arg0 != -6407 && ~arg0 != -6410) {
                if (~arg0 != -6411 && arg0 != 34846 && arg0 != 34844) {
                    if (~arg0 == -6408) {
                        return 3;
                    } else if (~arg0 != -6409 && ~arg0 != -34848) {
                        if (~arg0 == -34844) {
                            return 6;
                        } else if (~arg0 == -34843) {
                            return 8;
                        } else if (~arg0 == -6403) {
                            return 3;
                        } else if (arg0 == 6401) {
                            return 1;
                        } else if (arg1 != -6403) {
                            return -121;
                        } else {
                            throw new IllegalArgumentException("");
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
            throw class759.method5498(var4, field3003[143] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lnk;I)V")
    public final void method1710(class746 arg0, int arg1) {
        try {
            ++field2713;
            if (this.field2863 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field2863 >= 0) {
                    this.field2861[this.field2863].method1317((byte) 50);
                }
                this.field2857 = this.field2861[++this.field2863] = arg0;
                this.field2857.method1302(74);
                if (arg1 != -10836) {
                    this.field2949 = -55;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[97] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "K", descriptor = "([I)V")
    public final void method543(int[] arg0) {
        try {
            arg0[0] = this.field2967;
            ++field2761;
            arg0[2] = this.field2924;
            arg0[3] = this.field2894;
            arg0[1] = this.field2981;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[107] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FBFF)V")
    private final void method1711(float arg0, byte arg1, float arg2, float arg3) {
        try {
            int var5 = -101 % ((arg1 - -75) / 49);
            ++field2782;
            OpenGL.glMatrixMode(5890);
            if (this.field2947) {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glTranslatef(arg2, arg0, arg3);
            OpenGL.glMatrixMode(5888);
            this.field2947 = true;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "D", descriptor = "(I)V")
    private final void method1712(int arg0) {
        try {
            if (arg0 > -45) {
                this.field2955 = 0.004030448F;
            }
            ++field2772;
            if (~this.field2879 != -2) {
                this.method1737(-1265);
                this.method1698(93, false);
                this.method1706(-102, false);
                this.method1681(false, true);
                this.method1680(false, -32);
                this.method1733((class517) null, 17237);
                this.method1729((byte) -101, -2);
                this.method1753(0, 1);
                this.field2879 = 1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "M", descriptor = "()I")
    public final int method468() {
        try {
            ++field2696;
            int var1 = this.field3001;
            this.field3001 = 0;
            return var1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[48] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "U", descriptor = "(IIIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method1712(-85);
            ++field2704;
            this.method1743(-78, arg4);
            float var6 = (float) arg0 + 0.35F;
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var7 = (float) arg1 + 0.35F;
            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var6, var7);
            OpenGL.glVertex2f((float) arg2 + var6, var7);
            OpenGL.glEnd();
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3003[171] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lol;Lol;FLol;)Lol;")
    public final class299 method485(class299 arg0, class299 arg1, float arg2, class299 arg3) {
        try {
            ++field2809;
            if (arg0 != null && arg1 != null && this.field2962 && this.field2983) {
                class204 var5 = null;
                class758 var6 = (class758) arg0;
                class758 var7 = (class758) arg1;
                class532 var8 = var6.method1814(-114);
                class532 var9 = var7.method1814(62);
                if (var8 != null && var9 != null) {
                    int var10 = ~var9.field7805 > ~var8.field7805 ? var8.field7805 : var9.field7805;
                    if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class204) {
                        class204 var11 = (class204) arg3;
                        if (var10 == var11.method1815((byte) -62)) {
                            var5 = var11;
                        }
                    }
                    if (var5 == null) {
                        var5 = new class204(this, var10);
                    }
                    if (var5.method1811(var8, (byte) 112, arg2, var9)) {
                        return var5;
                    }
                }
            }
            return !(arg2 < 0.5F) ? arg1 : arg0;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field3003[87] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ',' + arg2 + ',' + (arg3 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "A", descriptor = "(ILaa;II)V")
    public final void method567(int arg0, class512 arg1, int arg2, int arg3) {
        try {
            ++field2835;
            class370 var5 = (class370) arg1;
            class61 var6 = var5.field5644;
            this.method1691((byte) 121);
            this.method1733(var5.field5644, 17237);
            this.method1743(-79, 1);
            this.method1684((byte) -61, 8448, 7681);
            this.method1739(34167, 0, (byte) 19, 768);
            float var7 = var6.field646 / (float) var6.field645;
            float var8 = var6.field644 / (float) var6.field640;
            OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2967) * var7, (float) (-arg3 + this.field2981) * var8);
            OpenGL.glVertex2i(this.field2967, this.field2981);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2967) * var7, (float) (-arg3 + this.field2894) * var8);
            OpenGL.glVertex2i(this.field2967, this.field2894);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2924) * var7, (float) (-arg3 + this.field2894) * var8);
            OpenGL.glVertex2i(this.field2924, this.field2894);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2924) * var7, (float) (-arg3 + this.field2981) * var8);
            OpenGL.glVertex2i(this.field2924, this.field2981);
            OpenGL.glEnd();
            this.method1739(5890, 0, (byte) 19, 768);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3003[63] + arg0 + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "Y", descriptor = "()[I")
    public final int[] method548() {
        try {
            ++field2811;
            return new int[] { this.field2951, this.field2950, this.field2941, this.field2949 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[187] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "(I)V")
    private final void method1713(int arg0) {
        try {
            ++field2779;
            OpenGL.glLoadIdentity();
            OpenGL.glMultMatrixf(this.field2884.method5543(-79), 0);
            if (this.field2988) {
                this.field2824.field6659.method3726((byte) -44);
            }
            int var2 = 120 / ((arg0 - -64) / 37);
            this.method1738(false);
            this.method1748((byte) 39);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[94] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "(II)I")
    public final int method1714(int arg0, int arg1) {
        try {
            ++field2743;
            if (arg1 != 5121 && arg1 != 5120) {
                if (~arg1 != -5124 && arg1 != 5122) {
                    if (arg0 != 7) {
                        return -58;
                    } else if (~arg1 != -5126 && ~arg1 != -5125 && arg1 != 5126) {
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
            throw class759.method5498(var4, field3003[111] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljaclib/memory/Buffer;IZII)Lml;")
    public final class407 method1715(Buffer arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            if (arg3 != 9) {
                return null;
            } else {
                ++field2825;
                return (class407) (!this.field2948 || arg2 && !this.field2931 ? new class489(this, arg4, arg0) : new class691(this, arg4, arg0, arg1, arg2));
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[180] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "(II)V")
    public final void method1716(int arg0, int arg1) {
        try {
            if (arg0 != 33984) {
                this.field2944 = null;
            }
            if (this.field2912 != arg1) {
                OpenGL.glActiveTexture(arg1 + 33984);
                this.field2912 = arg1;
            }
            ++field2670;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[29] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "()I")
    public final int method583() {
        try {
            ++field2739;
            return this.field2963;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[224] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            this.method1712(-107);
            ++field2756;
            this.method1743(-90, arg12);
            OpenGL.glBegin(4);
            OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
            OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
            OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
            OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
            OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
            OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
            OpenGL.glEnd();
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field3003[95] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "()Z")
    public final boolean method561() {
        try {
            ++field2797;
            return this.field2840 != null && (~this.field2837 >= -2 || this.field2887);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[18] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "(I)V")
    private final void method1717(int arg0) {
        try {
            class486.field7009[0] = this.field2965 * this.field2930;
            ++field2748;
            class486.field7009[2] = this.field2987 * this.field2965;
            class486.field7009[3] = 1.0F;
            class486.field7009[arg0] = this.field2965 * this.field2936;
            OpenGL.glLightModelfv(2899, class486.field7009, 0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[167] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "(B)V")
    private final void method1718(byte arg0) {
        try {
            if (arg0 < 6) {
                this.method1683(70, -5, 120, 56);
            }
            OpenGL.glDepthMask(this.field2881 && this.field2938);
            ++field2673;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[153] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIII)V")
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2695;
            float var7 = (float) arg0 + 0.35F;
            float var8 = (float) arg1 + 0.35F;
            float var9 = (float) arg2 + var7 + -1.0F;
            float var10 = (float) arg3 + var8 + -1.0F;
            this.method1712(-46);
            this.method1743(-71, arg5);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            if (this.field2906) {
                OpenGL.glDisable(32925);
            }
            OpenGL.glBegin(2);
            OpenGL.glVertex2f(var7, var8);
            OpenGL.glVertex2f(var7, var10);
            OpenGL.glVertex2f(var9, var10);
            OpenGL.glVertex2f(var9, var8);
            OpenGL.glEnd();
            if (this.field2906) {
                OpenGL.glEnable(32925);
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field3003[59] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "(B)V")
    private final void method1719(byte arg0) {
        try {
            OpenGL.glMatrixMode(5889);
            ++field2721;
            OpenGL.glLoadMatrixf(this.field2977, 0);
            OpenGL.glMatrixMode(5888);
            if (arg0 >= -118) {
                this.method538(-86, -47, -31, -55);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[178] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Liga;Z)Lfs;")
    public final class581 method487(class481 arg0, boolean arg1) {
        try {
            ++field2820;
            int[] var3 = new int[arg0.field6977 * arg0.field6970];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field6973 == null) {
                for (int var6 = 0; ~var6 > ~arg0.field6977; ++var6) {
                    for (int var7 = 0; ~arg0.field6970 < ~var7; ++var7) {
                        int var8 = arg0.field6969[arg0.field6975[var4++] & 255];
                        var3[var5++] = var8 != 0 ? class544.method4107(-16777216, var8) : 0;
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field6977; ++var9) {
                    for (int var10 = 0; ~arg0.field6970 < ~var10; ++var10) {
                        var3[var5++] = class544.method4107(arg0.field6969[class291.method2359(arg0.field6975[var4], 255)], arg0.field6973[var4] << 24);
                        ++var4;
                    }
                }
            }
            class581 var11 = this.method520(0, arg0.field6970, var3, (byte) 41, arg0.field6970, arg0.field6977);
            var11.method990(arg0.field6971, arg0.field6976, arg0.field6974, arg0.field6972);
            return var11;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field3003[149] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZZII)I")
    public static final int method1720(boolean arg0, boolean arg1, int arg2, int arg3) {
        try {
            if (!arg1) {
                method1677((byte) 47, -18);
            }
            ++field2682;
            class495 var4 = class668.method4916(arg3, arg0, 3);
            if (var4 == null) {
                return 0;
            } else {
                return arg2 >= 0 && ~var4.field7108.length < ~arg2 ? var4.field7108[arg2] : 0;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[67] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lnq;Lrk;)Lgea;")
    public final class82 method507(class485 arg0, class35 arg1) {
        try {
            ++field2749;
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[47] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "ya", descriptor = "()V")
    public final void method586() {
        try {
            this.method1680(true, -32);
            ++field2677;
            OpenGL.glClear(256);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[3] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V")
    public final void method536(int arg0) {
        try {
            ++field2795;
            if (~arg0 != -2) {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[174] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "()V")
    public final void method484() {
        try {
            this.field2834.method5360(-13829);
            ++field2799;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[82] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "P", descriptor = "(IIIII)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2774;
            this.method1712(-96);
            this.method1743(-101, arg4);
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var6, var7);
            OpenGL.glVertex2f(var6, (float) arg2 + var7);
            OpenGL.glEnd();
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3003[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V")
    private final void method1721(byte arg0) {
        try {
            ++field2804;
            if (arg0 < 34) {
                this.method1689(82, (class768) null);
            }
            OpenGL.glViewport(this.field2969, this.field2915, this.field2742, this.field2687);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[195] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method551(Canvas arg0, int arg1, int arg2) {
        try {
            ++field2819;
            long var4 = 0L;
            if (arg0 != null && this.field2710 != arg0) {
                if (this.field2686.containsKey(arg0)) {
                    Long var6 = (Long) this.field2686.get(arg0);
                    var4 = var6;
                }
            } else {
                var4 = this.field2759;
            }
            if (var4 == 0L) {
                throw new RuntimeException();
            } else {
                this.field2654.surfaceResized(var4);
                if (this.field2765 == arg0) {
                    this.method1690((byte) -54);
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3003[221] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "()Lqq;")
    public final class501 method511() {
        try {
            ++field2769;
            return this.field2846;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[45] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)V")
    private final void method1722(int arg0) {
        try {
            ++field2771;
            if (arg0 < -37) {
                this.field2654.method4778();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[68] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "()V")
    public final void method575() {
        try {
            ++field2786;
            if (this.field2959 && ~this.field2742 < -1 && ~this.field2687 < -1) {
                int var1 = this.field2967;
                int var2 = this.field2924;
                int var3 = this.field2981;
                int var4 = this.field2894;
                this.method553();
                OpenGL.glReadBuffer(1028);
                OpenGL.glDrawBuffer(1029);
                this.method1685(-92);
                this.method1698(-100, false);
                this.method1706(-110, false);
                this.method1681(false, true);
                this.method1680(false, -32);
                this.method1733((class517) null, 17237);
                this.method1729((byte) -101, -2);
                this.method1753(0, 1);
                this.method1743(-103, 0);
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                OpenGL.glRasterPos2i(0, 0);
                OpenGL.glCopyPixels(0, 0, this.field2742, this.field2687, 6144);
                OpenGL.glFlush();
                OpenGL.glReadBuffer(1029);
                OpenGL.glDrawBuffer(1029);
                this.method489(var1, var3, var2, var4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[89] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FFBFF)V")
    public final void method1723(float arg0, float arg1, byte arg2, float arg3, float arg4) {
        try {
            class486.field7009[2] = arg0;
            ++field2674;
            class486.field7009[0] = arg3;
            class486.field7009[1] = arg4;
            class486.field7009[3] = arg1;
            OpenGL.glTexEnvfv(8960, 8705, class486.field7009, 0);
            if (arg2 != 53) {
                this.field2899 = false;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[230] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Luo;Luo;ILuo;Luo;)V")
    public final void method1724(class602 arg0, class602 arg1, int arg2, class602 arg3, class602 arg4) {
        try {
            ++field2778;
            if (arg1 == null) {
                OpenGL.glDisableClientState(32884);
            } else {
                this.method1734(0, arg1.field8831);
                OpenGL.glVertexPointer(arg1.field8829, arg1.field8830, this.field2958.method3185((byte) -128), this.field2958.method3187((byte) 124) + (long) arg1.field8827);
                OpenGL.glEnableClientState(32884);
            }
            if (arg0 == null) {
                OpenGL.glDisableClientState(32885);
            } else {
                this.method1734(arg2 + -2916, arg0.field8831);
                OpenGL.glNormalPointer(arg0.field8830, this.field2958.method3185((byte) -128), this.field2958.method3187((byte) -89) - -((long) arg0.field8827));
                OpenGL.glEnableClientState(32885);
            }
            if (arg3 != null) {
                this.method1734(0, arg3.field8831);
                OpenGL.glColorPointer(arg3.field8829, arg3.field8830, this.field2958.method3185((byte) -128), this.field2958.method3187((byte) 127) + (long) arg3.field8827);
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            if (arg4 != null) {
                this.method1734(0, arg4.field8831);
                OpenGL.glTexCoordPointer(arg4.field8829, arg4.field8830, this.field2958.method3185((byte) -127), this.field2958.method3187((byte) -56) - -((long) arg4.field8827));
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
            if (arg2 != 2916) {
                this.method1692(-110, -77, -24);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[182] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ',' + arg2 + ',' + (arg3 != null ? field3003[9] : field3003[10]) + ',' + (arg4 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "(II)V")
    public final synchronized void method1725(int arg0, int arg1) {
        try {
            int var3 = 72 / ((arg0 - 72) / 44);
            ++field2637;
            class206 var4 = new class206();
            var4.field3177 = (long) arg1;
            this.field2873.method3868(-52, var4);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[44] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "za", descriptor = "(IIIII)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2814;
            if (arg2 < 0) {
                arg2 = -arg2;
            }
            if (this.field2967 <= arg0 - -arg2 && this.field2924 >= -arg2 + arg0 && ~this.field2981 >= ~(arg1 + arg2) && arg1 - arg2 <= this.field2894) {
                this.method1712(-100);
                this.method1743(-88, arg4);
                OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
                float var6 = (float) arg0 + 0.35F;
                float var7 = (float) arg1 + 0.35F;
                int var8 = arg2 << 1;
                if (this.field2910 > (float) var8) {
                    OpenGL.glBegin(7);
                    OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                    OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                    OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                    OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                    OpenGL.glEnd();
                } else if ((float) var8 <= this.field2945) {
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
                    int var10 = class554.method4172(var9, 24500);
                    OpenGL.glVertex2f((float) arg2 + var6, var7);
                    for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                        OpenGL.glVertex2f(class751.field10917[var11] * (float) arg2 + var6, class751.field10927[var11] * (float) arg2 + var7);
                    }
                    OpenGL.glVertex2f((float) arg2 + var6, var7);
                    OpenGL.glEnd();
                }
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field3003[207] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "A", descriptor = "(I)V")
    private final void method1726(int arg0) {
        try {
            this.field2916 = (float) (-this.field2951 + this.field2924);
            this.field2920 = (float) (-this.field2950 + this.field2981);
            this.field2992 = (float) (-this.field2951 + this.field2967);
            this.field2970 = (float) (-this.field2950 + this.field2894);
            ++field2751;
            if (arg0 != 28854) {
                this.method563((class578) null, (class481[]) null, false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[34] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "()I")
    public final int method494() {
        try {
            ++field2770;
            return this.field2868 + this.field2866 - -this.field2865;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[43] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "()Z")
    public final boolean method588() {
        try {
            ++field2805;
            return false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[191] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IB[BIZ)Lraa;")
    public final class633 method1727(int arg0, byte arg1, byte[] arg2, int arg3, boolean arg4) {
        try {
            if (arg1 >= -65) {
                return null;
            } else {
                ++field2781;
                return (class633) (!this.field2948 || arg4 && !this.field2931 ? new class628(this, arg3, arg2, arg0) : new class64(this, arg3, arg2, arg0, arg4));
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[150] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3003[9] : field3003[10]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "(I)V")
    public final void method581(int arg0) {
        try {
            ++field2636;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "(I)V")
    private final void method1728(int arg0) {
        try {
            ++field2735;
            if (arg0 == -15591) {
                if (this.field2943 && !this.field2952) {
                    OpenGL.glEnable(2896);
                } else {
                    OpenGL.glDisable(2896);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[115] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BI)V")
    public final void method1729(byte arg0, int arg1) {
        try {
            if (arg0 != -101) {
                this.field2915 = 64;
            }
            this.method1700(true, arg1, (byte) 77);
            ++field2723;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[109] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "ra", descriptor = "(IIII)V")
    public final void method538(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2978 = arg0;
            this.field2942 = arg1;
            ++field2832;
            this.field2896 = true;
            this.field2984 = arg2;
            this.field2990 = arg3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "(I)V")
    private final void method1730(int arg0) {
        try {
            if (arg0 != -9661) {
                this.method592((class82) null);
            }
            ++field2845;
            if (~this.field2919 != -3) {
                this.field2919 = 2;
                this.method1719((byte) -123);
                this.method1713(-27);
                this.field2879 &= -8;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[60] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "GA", descriptor = "(I)V")
    public final void method483(int arg0) {
        try {
            this.method1743(-104, 0);
            ++field2691;
            OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
            OpenGL.glClear(16384);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[70] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "(I)V")
    public final void method1731(int arg0) {
        try {
            ++field2694;
            OpenGL.glPopMatrix();
            if (arg0 != -25384) {
                this.method1695(-74, 107);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[108] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IBI)V")
    public final void method1732(int arg0, byte arg1, int arg2) {
        try {
            ++field2705;
            this.field2969 = arg2;
            this.field2915 = arg0;
            this.method1721((byte) 71);
            this.method1741((byte) 76);
            if (arg1 >= -37) {
                this.method525(32, -46, -44, -31, -4);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[151] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lmw;I)V")
    public final void method1733(class517 arg0, int arg1) {
        try {
            if (arg1 == 17237) {
                ++field2803;
                class517 var3 = this.field2898[this.field2912];
                if (arg0 != var3) {
                    if (arg0 != null) {
                        if (var3 == null) {
                            OpenGL.glEnable(arg0.field7473);
                        } else if (~arg0.field7473 != ~var3.field7473) {
                            OpenGL.glDisable(var3.field7473);
                            OpenGL.glEnable(arg0.field7473);
                        }
                        OpenGL.glBindTexture(arg0.field7473, arg0.method3921((byte) 93));
                    } else {
                        OpenGL.glDisable(var3.field7473);
                    }
                    this.field2898[this.field2912] = arg0;
                }
                this.field2879 &= -2;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[198] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2834.method5352(arg1, arg0, arg2, (byte) 112, arg3);
            ++field2745;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[234] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILml;)V")
    public final void method1734(int arg0, class407 arg1) {
        try {
            if (arg0 == 0) {
                if (this.field2958 != arg1) {
                    if (this.field2948) {
                        OpenGL.glBindBufferARB(34962, arg1.method3184(-24909));
                    }
                    this.field2958 = arg1;
                }
                ++field2829;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[121] + arg0 + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "JA", descriptor = "(IIIIII)I")
    public final int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2806;
            int var7 = 0;
            float var8 = (float) arg2 * this.field2882.field11095 + (float) arg0 * this.field2882.field11105 + (float) arg1 * this.field2882.field11125 + this.field2882.field11128;
            if (var8 < 1.0F) {
                var8 = 1.0F;
            }
            float var9 = (float) arg5 * this.field2882.field11095 + (float) arg3 * this.field2882.field11105 + (float) arg4 * this.field2882.field11125 + this.field2882.field11128;
            if (var9 < 1.0F) {
                var9 = 1.0F;
            }
            if ((float) this.field2963 > var8 && (float) this.field2963 > var9) {
                var7 |= 16;
            } else if ((float) this.field2923 < var8 && var9 > (float) this.field2923) {
                var7 |= 32;
            }
            int var10 = (int) (((float) arg2 * this.field2882.field11114 + (float) arg0 * this.field2882.field11090 + (float) arg1 * this.field2882.field11098 + this.field2882.field11106) * (float) this.field2941 / var8);
            int var11 = (int) (((float) arg5 * this.field2882.field11114 + (float) arg3 * this.field2882.field11090 + (float) arg4 * this.field2882.field11098 + this.field2882.field11106) * (float) this.field2941 / var9);
            if (this.field2992 > (float) var10 && this.field2992 > (float) var11) {
                var7 |= 1;
            } else if ((float) var10 > this.field2916 && this.field2916 < (float) var11) {
                var7 |= 2;
            }
            int var12 = (int) (((float) arg2 * this.field2882.field11092 + (float) arg0 * this.field2882.field11097 + (float) arg1 * this.field2882.field11110 + this.field2882.field11118) * (float) this.field2949 / var8);
            int var13 = (int) (((float) arg5 * this.field2882.field11092 + (float) arg3 * this.field2882.field11097 + (float) arg4 * this.field2882.field11110 + this.field2882.field11118) * (float) this.field2949 / var9);
            if ((float) var12 < this.field2920 && this.field2920 > (float) var13) {
                var7 |= 4;
            } else if (this.field2970 < (float) var12 && (float) var13 > this.field2970) {
                var7 |= 8;
            }
            return var7;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field3003[96] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)V")
    public final void method519(boolean arg0) {
        try {
            ++field2738;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[155] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(Z)V")
    public static void method1735(boolean arg0) {
        try {
            if (!arg0) {
                field2685 = null;
            }
            field2685 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[69] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "()I")
    public final int method578() {
        try {
            ++field2808;
            return 4;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[168] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljw;I)V")
    public final void method500(class580 arg0, int arg1) {
        try {
            ++field2658;
            this.field2830.method2998((byte) -74, this, arg1, arg0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[64] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "()Lqq;")
    public final class501 method577() {
        try {
            ++field2757;
            return this.field2882;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[102] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "()Z")
    public final boolean method562() {
        try {
            ++field2669;
            return false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[200] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lju;IIII)Lka;")
    public final class497 method552(class137 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2838;
            return new class519(this, arg0, arg1, arg3, arg4, arg2);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[169] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lqq;)V")
    public final void method495(class501 arg0) {
        try {
            this.field2882.method2377(arg0);
            ++field2665;
            this.field2884.method2377(this.field2882);
            this.field2884.method5539(20656);
            this.field2885.method5537(this.field2884, 70);
            if (~this.field2919 != -2) {
                this.method1713(-114);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[16] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "XA", descriptor = "()I")
    public final int method558() {
        try {
            ++field2663;
            return this.field2923;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[17] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method589(Canvas arg0, int arg1, int arg2) {
        try {
            ++field2707;
            if (this.field2710 == arg0) {
                throw new RuntimeException();
            } else if (!this.field2686.containsKey(arg0)) {
                if (!arg0.isShowing()) {
                    throw new RuntimeException();
                } else {
                    try {
                        Class var4 = Class.forName(field3003[50]);
                        Method var5 = var4.getMethod(field3003[49], Boolean.TYPE);
                        var5.invoke(arg0, Boolean.TRUE);
                    } catch (Exception var9) {
                    }
                    long var6 = this.field2654.prepareSurface(arg0);
                    if (~var6 == 0L) {
                        throw new RuntimeException();
                    } else {
                        this.field2686.put(arg0, new Long(var6));
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3003[51] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "(II)V")
    public final void method549(int arg0, int arg1) {
        try {
            ++field2671;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[154] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(BLnk;)V")
    public final void method1736(byte arg0, class746 arg1) {
        try {
            ++field2646;
            if (this.field2863 >= 0 && this.field2861[this.field2863] == arg1) {
                if (arg0 != 67) {
                    this.method1746((class746) null, (byte) 88);
                }
                this.field2861[this.field2863--] = null;
                arg1.method1317((byte) -44);
                if (this.field2863 >= 0) {
                    this.field2857 = this.field2861[this.field2863];
                    this.field2857.method1302(arg0 ^ 5);
                } else {
                    this.field2857 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[15] + arg0 + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method508(Canvas arg0) {
        try {
            ++field2709;
            this.field2765 = null;
            this.field2821 = 0L;
            if (arg0 != null && this.field2710 != arg0) {
                if (this.field2686.containsKey(arg0)) {
                    Long var2 = (Long) this.field2686.get(arg0);
                    this.field2821 = var2;
                    this.field2765 = arg0;
                }
            } else {
                this.field2821 = this.field2759;
                this.field2765 = this.field2710;
            }
            if (this.field2765 != null && this.field2821 != 0L) {
                this.field2654.setSurface(this.field2821);
                this.method1690((byte) -54);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[176] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(II)V")
    public final void method513(int arg0, int arg1) throws class382 {
        try {
            ++field2716;
            try {
                this.field2654.swapBuffers();
            } catch (Exception var4) {
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[170] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "()Z")
    public final boolean method576() {
        try {
            ++field2675;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[181] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)V")
    public final void method510(int arg0) {
        try {
            ++field2640;
            this.method1702((byte) 87);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[99] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FFF)V")
    public final void method497(float arg0, float arg1, float arg2) {
        try {
            class792.field11526 = arg1;
            ++field2651;
            class104.field1185 = arg2;
            class727.field10544 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[227] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field2645;
            if (arg0 != arg2 || ~arg1 != ~arg3) {
                this.method1712(-115);
                this.method1743(-73, arg5);
                float var10 = (float) arg2 - (float) arg0;
                float var11 = (float) arg3 - (float) arg1;
                float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
                float var13 = var10 * var12;
                int var27 = arg8 % (arg6 + arg7);
                OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
                float var14 = var11 * var12;
                float var15 = (float) arg6 * var13;
                float var16 = (float) arg6 * var14;
                float var17 = 0.0F;
                float var18 = 0.0F;
                float var19 = var15;
                float var20 = var16;
                if (var27 <= arg6) {
                    var20 = (float) (-var27 + arg6) * var14;
                    var19 = (float) (-var27 + arg6) * var13;
                } else {
                    var18 = (float) (-var27 + arg7 + arg6) * var14;
                    var17 = (float) (arg6 - -arg7 - var27) * var13;
                }
                float var21 = (float) arg0 + 0.35F + var17;
                float var22 = (float) arg1 + 0.35F + var18;
                float var23 = (float) arg7 * var13;
                float var24 = (float) arg7 * var14;
                while (true) {
                    if (~arg2 < ~arg0) {
                        if (var21 > (float) arg2 + 0.35F) {
                            break;
                        }
                        if ((float) arg2 < var19 + var21) {
                            var19 = (float) arg2 - var21;
                        }
                    } else {
                        if ((float) arg2 + 0.35F > var21) {
                            break;
                        }
                        if ((float) arg2 > var19 + var21) {
                            var19 = (float) arg2 + -var21;
                        }
                    }
                    if (~arg1 > ~arg3) {
                        if (var22 > (float) arg3 + 0.35F) {
                            break;
                        }
                        if (var20 + var22 > (float) arg3) {
                            var20 = (float) arg3 + -var22;
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
                    var22 += var20 + var24;
                    OpenGL.glEnd();
                    var21 += var19 + var23;
                    var19 = var15;
                    var20 = var16;
                }
            }
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field3003[214] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "(I)V")
    private final void method1737(int arg0) {
        try {
            if (this.field2919 != 1) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (~this.field2742 < -1 && this.field2687 > 0) {
                    OpenGL.glOrtho(0.0D, (double) this.field2742, (double) this.field2687, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field2919 = 1;
                this.field2879 &= -25;
            }
            if (arg0 != -1265) {
                this.method1679(77, -85);
            }
            ++field2644;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[88] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lgea;)V")
    public final void method592(class82 arg0) {
        try {
            ++field2815;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[90] + (arg0 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(Z)V")
    public final void method1738(boolean arg0) {
        try {
            OpenGL.glLightfv(16384, 4611, this.field2888, 0);
            ++field2666;
            OpenGL.glLightfv(16385, 4611, this.field2976, 0);
            if (arg0) {
                this.field2965 = -1.6934851F;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[217] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIBI)V")
    public final void method1739(int arg0, int arg1, byte arg2, int arg3) {
        try {
            if (arg2 != 19) {
                this.method558();
            }
            ++field2785;
            OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
            OpenGL.glTexEnvi(8960, 34192 - -arg1, arg3);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[208] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "(I)V")
    private final void method1740(int arg0) {
        try {
            ++field2722;
            if (this.field2947) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field2947 = false;
            }
            if (arg0 != 24879) {
                this.method1741((byte) 10);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[147] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "(B)V")
    private final void method1741(byte arg0) {
        try {
            ++field2777;
            if (this.field2967 <= this.field2924 && this.field2894 >= this.field2981) {
                OpenGL.glScissor(this.field2969 + this.field2967, this.field2915 + this.field2687 + -this.field2894, -this.field2967 + this.field2924, -this.field2981 + this.field2894);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
            if (arg0 <= 72) {
                this.field2869 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[186] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "()V")
    public final void method591() {
        try {
            if (this.field2840 != null && this.field2840.method2712(0)) {
                this.field2834.method5356(1, this.field2840);
                this.field2843.method243((byte) -114);
            }
            ++field2708;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[13] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(JB)V")
    public final synchronized void method1742(long arg0, byte arg1) {
        try {
            if (arg1 <= 66) {
                this.method1737(-103);
            }
            ++field2706;
            class206 var4 = new class206();
            var4.field3177 = arg0;
            this.field2874.method3868(-126, var4);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "()Z")
    public final boolean method503() {
        try {
            ++field2790;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[152] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "()Lqq;")
    public final class501 method517() {
        try {
            ++field2839;
            return new class768();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[114] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "()Lmi;")
    public final class521 method493() {
        try {
            ++field2724;
            int var1 = -1;
            if (~this.field2996.indexOf(field3003[120]) != 0) {
                var1 = 4318;
            } else if (this.field2996.indexOf(field3003[116]) == -1) {
                if (this.field2996.indexOf(field3003[117]) != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
            return new class521(var1, field3003[119], this.field2986, this.field2982, 0L);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[118] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "da", descriptor = "(III[I)V")
    public final void method471(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field2798;
            float var5 = (float) arg2 * this.field2882.field11095 + (float) arg0 * this.field2882.field11105 + (float) arg1 * this.field2882.field11125 + this.field2882.field11128;
            if (!(var5 < (float) this.field2963) && !(var5 > (float) this.field2923)) {
                int var6 = (int) (((float) arg2 * this.field2882.field11114 + (float) arg0 * this.field2882.field11090 + (float) arg1 * this.field2882.field11098 + this.field2882.field11106) * (float) this.field2941 / var5);
                int var7 = (int) (((float) arg2 * this.field2882.field11092 + (float) arg0 * this.field2882.field11097 + (float) arg1 * this.field2882.field11110 + this.field2882.field11118) * (float) this.field2949 / var5);
                if ((float) var6 >= this.field2992 && this.field2916 >= (float) var6 && (float) var7 >= this.field2920 && (float) var7 <= this.field2970) {
                    arg3[0] = (int) ((float) var6 - this.field2992);
                    arg3[1] = (int) ((float) var7 + -this.field2920);
                    arg3[2] = (int) var5;
                } else {
                    arg3[0] = arg3[1] = arg3[2] = -1;
                }
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3003[166] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "(II)V")
    public final void method1743(int arg0, int arg1) {
        try {
            if (arg0 < -69) {
                if (~this.field2877 != ~arg1) {
                    byte var3;
                    boolean var4;
                    boolean var5;
                    if (~arg1 != -2) {
                        if (~arg1 != -3) {
                            if (~arg1 == -129) {
                                var3 = 3;
                                var4 = true;
                                var5 = true;
                            } else {
                                var3 = 0;
                                var4 = false;
                                var5 = true;
                            }
                        } else {
                            var4 = false;
                            var5 = true;
                            var3 = 2;
                        }
                    } else {
                        var3 = 1;
                        var4 = true;
                        var5 = true;
                    }
                    if (var5 == !this.field2880) {
                        OpenGL.glColorMask(var5, var5, var5, true);
                        this.field2880 = var5;
                    }
                    if (!this.field2878 != !var4) {
                        if (var4) {
                            OpenGL.glEnable(3008);
                        } else {
                            OpenGL.glDisable(3008);
                        }
                        this.field2878 = var4;
                    }
                    if (~this.field2876 != ~var3) {
                        if (~var3 != -2) {
                            if (var3 != 2) {
                                if (var3 == 3) {
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
                        this.field2876 = var3;
                    }
                    this.field2879 &= -29;
                    this.field2877 = arg1;
                }
                ++field2672;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[210] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "X", descriptor = "(I)V")
    public final void method506(int arg0) {
        try {
            ++field2730;
            this.field2852 = 0;
            while (arg0 > 1) {
                ++this.field2852;
                arg0 >>= 1;
            }
            this.field2849 = 1 << this.field2852;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[177] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Lnk;I)V")
    public final void method1744(class746 arg0, int arg1) {
        try {
            ++field2831;
            if (~this.field2864 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field2864 >= 0) {
                    this.field2855[this.field2864].method1316(-25101);
                }
                this.field2860 = this.field2855[++this.field2864] = arg0;
                this.field2860.method1311(arg1 ^ 1876258654);
                if (arg1 != -1876245328) {
                    this.field2883 = -95L;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[145] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILob;)V")
    public final void method1745(int arg0, class768 arg1) {
        try {
            OpenGL.glLoadMatrixf(arg1.method5543(79), 0);
            if (arg0 == 20820) {
                ++field2717;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[8] + arg0 + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lnk;B)V")
    public final void method1746(class746 arg0, byte arg1) {
        try {
            if (arg1 < 77) {
                this.field2892 = null;
            }
            ++field2650;
            if (this.field2911) {
                this.method1736((byte) 67, arg0);
                this.method1758((byte) 42, arg0);
            } else if (this.field2859 >= 0 && this.field2862[this.field2859] == arg0) {
                this.field2862[this.field2859--] = null;
                arg0.method1297((byte) -60);
                if (~this.field2859 <= -1) {
                    this.field2857 = this.field2860 = this.field2862[this.field2859];
                    this.field2857.method1310(-25398);
                } else {
                    this.field2857 = this.field2860 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[85] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "()Z")
    public final boolean method559() {
        try {
            ++field2728;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[219] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "()Z")
    public final boolean method547() {
        try {
            ++field2780;
            if (this.field2840 != null) {
                if (!this.field2840.method2712(0)) {
                    if (!this.field2834.method5351(30, this.field2840)) {
                        return false;
                    }
                    this.field2843.method243((byte) 19);
                }
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[7] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "HA", descriptor = "(IIII[I)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        try {
            ++field2714;
            float var6 = (float) arg2 * this.field2882.field11095 + (float) arg0 * this.field2882.field11105 + (float) arg1 * this.field2882.field11125 + this.field2882.field11128;
            if (!(var6 < (float) this.field2963) && !((float) this.field2923 < var6)) {
                int var7 = (int) (((float) arg2 * this.field2882.field11114 + (float) arg0 * this.field2882.field11090 + (float) arg1 * this.field2882.field11098 + this.field2882.field11106) * (float) this.field2941 / (float) arg3);
                int var8 = (int) (((float) arg2 * this.field2882.field11092 + (float) arg0 * this.field2882.field11097 + (float) arg1 * this.field2882.field11110 + this.field2882.field11118) * (float) this.field2949 / (float) arg3);
                if (this.field2992 <= (float) var7 && this.field2916 >= (float) var7 && this.field2920 <= (float) var8 && (float) var8 <= this.field2970) {
                    arg4[2] = (int) var6;
                    arg4[1] = (int) ((float) var8 - this.field2920);
                    arg4[0] = (int) ((float) var7 - this.field2992);
                } else {
                    arg4[0] = arg4[1] = arg4[2] = -1;
                }
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3003[148] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "(I)I")
    private final int method1747(int arg0) {
        try {
            ++field2718;
            int var2 = 0;
            this.field2996 = OpenGL.glGetString(7936).toLowerCase();
            this.field2982 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field2996.indexOf(field3003[138]) != -1) {
                var2 |= 1;
            }
            if (~this.field2996.indexOf(field3003[126]) != 0 || this.field2996.indexOf(field3003[129]) != -1) {
                var2 |= 1;
            }
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class350.method2878(var3.replace('.', ' '), ' ', (byte) 85);
            if (~var4.length > -3) {
                var2 |= 4;
            } else {
                try {
                    int var5 = class244.method2078(-7431, var4[0]);
                    int var6 = class244.method2078(-7431, var4[1]);
                    this.field2986 = var5 * 10 + var6;
                } catch (NumberFormatException var9) {
                    var2 |= 4;
                }
            }
            if (~this.field2986 > -13) {
                var2 |= 2;
            }
            if (!this.field2654.method4777(field3003[127])) {
                var2 |= 8;
            }
            if (!this.field2654.method4777(field3003[139])) {
                var2 |= 32;
            }
            int[] var7 = new int[1];
            OpenGL.glGetIntegerv(34018, var7, 0);
            this.field2935 = var7[0];
            OpenGL.glGetIntegerv(34929, var7, 0);
            this.field2909 = var7[0];
            OpenGL.glGetIntegerv(34930, var7, 0);
            this.field2989 = var7[0];
            if (this.field2935 < 2 || ~this.field2909 > -3 || ~this.field2989 > -3) {
                var2 |= 16;
            }
            this.field2922 = Stream.method5102();
            this.field2939 = this.field2654.arePbuffersAvailable();
            this.field2948 = this.field2654.method4777(field3003[141]);
            this.field2906 = this.field2654.method4777(field3003[125]);
            this.field2946 = this.field2654.method4777(field3003[140]);
            if (arg0 > -18) {
                return 47;
            } else {
                this.field2654.method4777(field3003[134]);
                this.field2929 = this.field2654.method4777(field3003[131]);
                this.field2937 = this.field2654.method4777(field3003[133]);
                this.field2908 = this.field2654.method4777(field3003[124]);
                this.field2964 = this.field2654.method4777(field3003[122]);
                this.field2962 = this.field2654.method4777(field3003[130]);
                this.field2968 = this.field2654.method4777(field3003[137]);
                this.field2956 = false;
                this.field2983 = this.field2654.method4777(field3003[128]);
                this.field2911 = this.field2654.method4777(field3003[123]);
                this.field2932 = this.field2654.method4777(field3003[136]);
                this.field2887 = this.field2932 & this.field2911;
                this.field2899 = class72.field785.startsWith(field3003[135]);
                OpenGL.glGetFloatv(2834, class486.field7009, 0);
                this.field2910 = class486.field7009[0];
                this.field2945 = class486.field7009[1];
                return var2 != 0 ? var2 : 0;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3003[132] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "()V")
    public final void method574() {
        try {
            ++field2775;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[58] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)V")
    private final void method1748(byte arg0) {
        try {
            ++field2702;
            if (arg0 < 28) {
                this.field2977 = null;
            }
            int var2;
            for (var2 = 0; var2 < this.field2901; ++var2) {
                class471 var3 = this.field2904[var2];
                int var4 = var2 + 16386;
                class640.field9300[0] = (float) var3.method3577(-32630);
                class640.field9300[1] = (float) var3.method3581(-100);
                class640.field9300[2] = (float) var3.method3580((byte) 37);
                class640.field9300[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class640.field9300, 0);
                int var5 = var3.method3578(36);
                float var6 = var3.method3576((byte) -104) / 255.0F;
                class640.field9300[1] = (float) class291.method2359(var5 >> 8, 255) * var6;
                class640.field9300[2] = var6 * (float) class291.method2359(255, var5);
                class640.field9300[0] = var6 * (float) class291.method2359(var5 >> 16, 255);
                OpenGL.glLightfv(var4, 4609, class640.field9300, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3579((byte) 127) * var3.method3579((byte) 124)));
                OpenGL.glEnable(var4);
            }
            while (~this.field2961 < ~var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field2961 = this.field2901;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3003[112] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BZ)V")
    public final void method1749(byte arg0, boolean arg1) {
        try {
            if (arg0 != 33) {
                this.method478(21, 2);
            }
            ++field2766;
            if (!arg1 == this.field2952) {
                this.field2952 = arg1;
                this.method1728(-15591);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[203] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIZ)Lfs;")
    public final class581 method568(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            ++field2648;
            return new class113(this, arg0, arg1, arg2, arg3);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3003[92] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "(I)V")
    private final void method1750(int arg0) {
        try {
            if (this.field2966 && ~this.field2905 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
            if (arg0 != -12415) {
                this.method1712(111);
            }
            ++field2652;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[232] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(III)V")
    public final synchronized void method1751(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != 2) {
                this.method516(-90, -0.067610875F, -2.2088196F, 0.6320417F, 0.9868352F, -1.0157063F);
            }
            ++field2816;
            class609 var4 = new class609(arg1);
            var4.field3177 = (long) arg2;
            this.field2870.method3868(-96, var4);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[23] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lraa;I)V")
    public final void method1752(class633 arg0, int arg1) {
        try {
            if (this.field2974 != arg0) {
                if (this.field2948) {
                    OpenGL.glBindBufferARB(34963, arg0.method451(31188));
                }
                this.field2974 = arg0;
            }
            ++field2800;
            int var3 = -123 / ((arg1 - 24) / 57);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[173] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(II)I")
    public final int method499(int arg0, int arg1) {
        try {
            ++field2763;
            return arg1 | arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[24] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIF)Luf;")
    public final class471 method521(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            ++field2833;
            return new class208(arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3003[144] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "(II)V")
    public final void method1753(int arg0, int arg1) {
        try {
            if (~arg1 == -2) {
                this.method1684((byte) -61, 7681, 7681);
            } else if (arg1 != 0) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.method1684((byte) -61, 34023, 34023);
                        }
                    } else {
                        this.method1684((byte) -61, 8448, 260);
                    }
                } else {
                    this.method1684((byte) -61, 7681, 34165);
                }
            } else {
                this.method1684((byte) -61, 8448, 8448);
            }
            if (arg0 != 0) {
                this.method519(true);
            }
            ++field2817;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BF)V")
    public final void method1754(byte arg0, float arg1) {
        try {
            int var3 = -60 / ((arg0 - 43) / 60);
            ++field2844;
            if (this.field2991 != arg1) {
                this.field2991 = arg1;
                if (this.field2919 == 3) {
                    this.method1687((byte) 57);
                    return;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3003[216] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(Lnk;I)V")
    public final void method1755(class746 arg0, int arg1) {
        try {
            if (arg1 != 0) {
                this.method1702((byte) 69);
            }
            ++field2638;
            if (this.field2911) {
                this.method1710(arg0, -10836);
                this.method1744(arg0, -1876245328);
            } else if (~this.field2859 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field2859 >= 0) {
                    this.field2862[this.field2859].method1297((byte) -69);
                }
                this.field2857 = this.field2860 = this.field2862[++this.field2859] = arg0;
                this.field2857.method1310(-25398);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[65] + (arg0 != null ? field3003[9] : field3003[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "B", descriptor = "(I)V")
    public final void method1756(int arg0) {
        try {
            OpenGL.glPushMatrix();
            ++field2676;
            if (arg0 != 20537) {
                this.method1737(-40);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[39] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "()Z")
    public final boolean method566() {
        try {
            ++field2642;
            return this.field2840 != null && this.field2840.method2712(0);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[93] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "()Z")
    public final boolean method514() {
        try {
            ++field2828;
            return this.field2906 && (!this.method566() || this.field2887);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[101] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)Lrk;")
    public final class35 method486(int arg0, int arg1) {
        try {
            ++field2689;
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[156] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "()V")
    public final void method470() {
        try {
            for (class206 var1 = this.field2854.method3863((byte) 64); var1 != null; var1 = this.field2854.method3862(-353)) {
                ((class130) var1).method1131(16);
            }
            ++field2660;
            if (this.field2834 != null) {
                this.field2834.method5353(0);
            }
            if (this.field2654 != null) {
                this.method1722(-106);
                Enumeration var2 = this.field2686.keys();
                while (var2.hasMoreElements()) {
                    Canvas var3 = (Canvas) var2.nextElement();
                    Long var4 = (Long) this.field2686.get(var3);
                    this.field2654.releaseSurface(var3, var4);
                }
                this.field2654.release();
                this.field2654 = null;
            }
            if (this.field2850) {
                class223.method1937(true, -9743, false);
                this.field2850 = false;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[27] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class294 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        try {
            ++field2643;
            return new class170(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3003[84] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3003[9] : field3003[10]) + ',' + (arg3 != null ? field3003[9] : field3003[10]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "(I)V")
    private final void method1757(int arg0) {
        try {
            if (arg0 == 0) {
                ++field2731;
                if (~this.field2919 != -4) {
                    this.field2919 = 3;
                    this.method1687((byte) 57);
                    this.method1713(arg0 + 26);
                    this.field2879 &= -8;
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[204] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class512 method496(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            ++field2647;
            return class3.method22(0, arg1, arg2, arg0, this, arg3);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[22] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3003[9] : field3003[10]) + ',' + (arg3 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BLnk;)V")
    public final void method1758(byte arg0, class746 arg1) {
        try {
            ++field2727;
            if (this.field2864 >= 0 && this.field2855[this.field2864] == arg1) {
                this.field2855[this.field2864--] = null;
                if (arg0 != 42) {
                    this.method469();
                }
                arg1.method1316(-25101);
                if (~this.field2864 <= -1) {
                    this.field2860 = this.field2855[this.field2864];
                    this.field2860.method1311(arg0 + -21564);
                } else {
                    this.field2860 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[113] + arg0 + ',' + (arg1 != null ? field3003[9] : field3003[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "(II)I")
    public final int method509(int arg0, int arg1) {
        try {
            ++field2789;
            return arg1 ^ arg1 & arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3003[32] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(III)V")
    public final synchronized void method1759(int arg0, int arg1, int arg2) {
        try {
            ++field2680;
            if (arg1 == 5888) {
                class609 var4 = new class609(arg2);
                var4.field3177 = (long) arg0;
                this.field2869.method3868(arg1 ^ 6011, var4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[183] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIIID)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3, double arg4) {
        try {
            ++field2641;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3003[81] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "T", descriptor = "(IIII)V")
    public final void method522(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (~arg3 > ~this.field2894) {
                this.field2894 = arg3;
            }
            ++field2740;
            if (arg2 < this.field2924) {
                this.field2924 = arg2;
            }
            if (~arg1 < ~this.field2981) {
                this.field2981 = arg1;
            }
            if (~arg0 < ~this.field2967) {
                this.field2967 = arg0;
            }
            OpenGL.glEnable(3089);
            this.method1726(28854);
            this.method1741((byte) 121);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3003[193] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "()Z")
    public final boolean method542() {
        try {
            ++field2807;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3003[105] + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
        try {
            ++field2752;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3003[91] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1760(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1761(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
