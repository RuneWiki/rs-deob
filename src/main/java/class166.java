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

@OriginalClass("client!rs")
public class class166 extends class544 {

    @OriginalMember(owner = "client!rs", name = "Gb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2595 = new Hashtable();

    @OriginalMember(owner = "client!rs", name = "Ge", descriptor = "I")
    public int field2751 = 128;

    @OriginalMember(owner = "client!rs", name = "Ce", descriptor = "Lje;")
    private class362 field2747 = new class362();

    @OriginalMember(owner = "client!rs", name = "He", descriptor = "Lo;")
    private class174 field2752 = new class174();

    @OriginalMember(owner = "client!rs", name = "Ie", descriptor = "Lo;")
    public class174 field2753 = new class174();

    @OriginalMember(owner = "client!rs", name = "Ke", descriptor = "Z")
    private boolean field2755 = false;

    @OriginalMember(owner = "client!rs", name = "Ne", descriptor = "I")
    public int field2758 = 8;

    @OriginalMember(owner = "client!rs", name = "Le", descriptor = "I")
    public int field2756 = 3;

    @OriginalMember(owner = "client!rs", name = "Pe", descriptor = "Ltg;")
    private class605 field2760 = new class605();

    @OriginalMember(owner = "client!rs", name = "We", descriptor = "I")
    private int field2767 = -1;

    @OriginalMember(owner = "client!rs", name = "Re", descriptor = "I")
    private int field2762 = -1;

    @OriginalMember(owner = "client!rs", name = "Ye", descriptor = "[Lqr;")
    private class622[] field2769 = new class622[4];

    @OriginalMember(owner = "client!rs", name = "Xe", descriptor = "[Lqr;")
    private class622[] field2768 = new class622[4];

    @OriginalMember(owner = "client!rs", name = "Ue", descriptor = "I")
    private int field2765 = -1;

    @OriginalMember(owner = "client!rs", name = "Ze", descriptor = "[Lqr;")
    private class622[] field2770 = new class622[4];

    @OriginalMember(owner = "client!rs", name = "bf", descriptor = "Ltg;")
    private class605 field2772;

    @OriginalMember(owner = "client!rs", name = "ef", descriptor = "Ltg;")
    private class605 field2775;

    @OriginalMember(owner = "client!rs", name = "ff", descriptor = "Ltg;")
    private class605 field2776;

    @OriginalMember(owner = "client!rs", name = "gf", descriptor = "Ltg;")
    private class605 field2777;

    @OriginalMember(owner = "client!rs", name = "hf", descriptor = "Ltg;")
    private class605 field2778;

    @OriginalMember(owner = "client!rs", name = "jf", descriptor = "Ltg;")
    private class605 field2779;

    @OriginalMember(owner = "client!rs", name = "kf", descriptor = "Ltg;")
    private class605 field2780;

    @OriginalMember(owner = "client!rs", name = "qf", descriptor = "Lo;")
    public class174 field2786;

    @OriginalMember(owner = "client!rs", name = "uf", descriptor = "Lo;")
    public class174 field2790;

    @OriginalMember(owner = "client!rs", name = "vf", descriptor = "Lo;")
    public class174 field2791;

    @OriginalMember(owner = "client!rs", name = "Bf", descriptor = "[F")
    private float[] field2797;

    @OriginalMember(owner = "client!rs", name = "Mf", descriptor = "[Lvt;")
    private class759[] field2808;

    @OriginalMember(owner = "client!rs", name = "ag", descriptor = "I")
    private int field2822;

    @OriginalMember(owner = "client!rs", name = "mg", descriptor = "F")
    private float field2834;

    @OriginalMember(owner = "client!rs", name = "Xf", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!rs", name = "tg", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!rs", name = "wg", descriptor = "F")
    private float field2844;

    @OriginalMember(owner = "client!rs", name = "Pf", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!rs", name = "Fg", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!rs", name = "Zf", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!rs", name = "ig", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!rs", name = "Gg", descriptor = "I")
    private int field2854;

    @OriginalMember(owner = "client!rs", name = "yf", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!rs", name = "Mg", descriptor = "Z")
    private boolean field2860;

    @OriginalMember(owner = "client!rs", name = "Kg", descriptor = "[F")
    private float[] field2858;

    @OriginalMember(owner = "client!rs", name = "ah", descriptor = "[F")
    private float[] field2874;

    @OriginalMember(owner = "client!rs", name = "zg", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!rs", name = "Yg", descriptor = "I")
    private int field2872;

    @OriginalMember(owner = "client!rs", name = "Cg", descriptor = "I")
    private int field2850;

    @OriginalMember(owner = "client!rs", name = "Hf", descriptor = "F")
    public float field2803;

    @OriginalMember(owner = "client!rs", name = "Rf", descriptor = "F")
    public float field2813;

    @OriginalMember(owner = "client!rs", name = "eg", descriptor = "Z")
    private boolean field2826;

    @OriginalMember(owner = "client!rs", name = "Lg", descriptor = "F")
    private float field2859;

    @OriginalMember(owner = "client!rs", name = "Hg", descriptor = "F")
    public float field2855;

    @OriginalMember(owner = "client!rs", name = "ug", descriptor = "I")
    private int field2842;

    @OriginalMember(owner = "client!rs", name = "ng", descriptor = "F")
    public float field2835;

    @OriginalMember(owner = "client!rs", name = "Ug", descriptor = "[F")
    public float[] field2868;

    @OriginalMember(owner = "client!rs", name = "kg", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!rs", name = "lh", descriptor = "F")
    private float field2885;

    @OriginalMember(owner = "client!rs", name = "Jg", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!rs", name = "oh", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!rs", name = "fh", descriptor = "I")
    private int field2879;

    @OriginalMember(owner = "client!rs", name = "Xg", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!rs", name = "Eg", descriptor = "F")
    private float field2852;

    @OriginalMember(owner = "client!rs", name = "jh", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!rs", name = "th", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!rs", name = "Zg", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!rs", name = "Sf", descriptor = "F")
    public float field2814;

    @OriginalMember(owner = "client!rs", name = "wf", descriptor = "F")
    public float field2792;

    @OriginalMember(owner = "client!rs", name = "Og", descriptor = "F")
    public float field2862;

    @OriginalMember(owner = "client!rs", name = "Bh", descriptor = "[F")
    private float[] field2901;

    @OriginalMember(owner = "client!rs", name = "Wg", descriptor = "Log;")
    public class547 field2870;

    @OriginalMember(owner = "client!rs", name = "Hh", descriptor = "[B")
    public byte[] field2907;

    @OriginalMember(owner = "client!rs", name = "Dh", descriptor = "[I")
    public int[] field2903;

    @OriginalMember(owner = "client!rs", name = "Ih", descriptor = "[I")
    public int[] field2908;

    @OriginalMember(owner = "client!rs", name = "Eh", descriptor = "[I")
    public int[] field2904;

    @OriginalMember(owner = "client!rs", name = "Be", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!rs", name = "ye", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2743;

    @OriginalMember(owner = "client!rs", name = "rc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2632;

    @OriginalMember(owner = "client!rs", name = "xe", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2742;

    @OriginalMember(owner = "client!rs", name = "Jb", descriptor = "J")
    private long field2598;

    @OriginalMember(owner = "client!rs", name = "id", descriptor = "J")
    private long field2675;

    @OriginalMember(owner = "client!rs", name = "Af", descriptor = "Z")
    public boolean field2796;

    @OriginalMember(owner = "client!rs", name = "eh", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!rs", name = "vh", descriptor = "Ljava/lang/String;")
    private String field2895;

    @OriginalMember(owner = "client!rs", name = "Dg", descriptor = "Z")
    private boolean field2851;

    @OriginalMember(owner = "client!rs", name = "Ff", descriptor = "Z")
    public boolean field2801;

    @OriginalMember(owner = "client!rs", name = "Yf", descriptor = "Z")
    public boolean field2820;

    @OriginalMember(owner = "client!rs", name = "cg", descriptor = "Z")
    public boolean field2824;

    @OriginalMember(owner = "client!rs", name = "zh", descriptor = "Z")
    public boolean field2899;

    @OriginalMember(owner = "client!rs", name = "Ch", descriptor = "Z")
    private boolean field2902;

    @OriginalMember(owner = "client!rs", name = "yh", descriptor = "Ljava/lang/String;")
    private String field2898;

    @OriginalMember(owner = "client!rs", name = "Jf", descriptor = "Z")
    public boolean field2805;

    @OriginalMember(owner = "client!rs", name = "Sg", descriptor = "Z")
    private boolean field2866;

    @OriginalMember(owner = "client!rs", name = "De", descriptor = "Lto;")
    private class714 field2748;

    @OriginalMember(owner = "client!rs", name = "Oe", descriptor = "Lsca;")
    public class431 field2759;

    @OriginalMember(owner = "client!rs", name = "Ae", descriptor = "Ldi;")
    private class5 field2745;

    @OriginalMember(owner = "client!rs", name = "Ee", descriptor = "Lse;")
    private class159 field2749;

    @OriginalMember(owner = "client!rs", name = "ze", descriptor = "Ldr;")
    private class23 field2744;

    @OriginalMember(owner = "client!rs", name = "ab", descriptor = "[I")
    public static int[] field2563 = new int[8];

    @OriginalMember(owner = "client!rs", name = "zf", descriptor = "F")
    public float field2795;

    @OriginalMember(owner = "client!rs", name = "Tf", descriptor = "F")
    private float field2815;

    @OriginalMember(owner = "client!rs", name = "Uf", descriptor = "F")
    private float field2816;

    @OriginalMember(owner = "client!rs", name = "gg", descriptor = "F")
    public float field2828;

    @OriginalMember(owner = "client!rs", name = "jg", descriptor = "F")
    private float field2831;

    @OriginalMember(owner = "client!rs", name = "qg", descriptor = "F")
    public float field2838;

    @OriginalMember(owner = "client!rs", name = "nh", descriptor = "F")
    public float field2887;

    @OriginalMember(owner = "client!rs", name = "uh", descriptor = "F")
    public float field2894;

    @OriginalMember(owner = "client!rs", name = "xh", descriptor = "F")
    public float field2897;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!rs", name = "R", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!rs", name = "S", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!rs", name = "T", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!rs", name = "U", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!rs", name = "V", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!rs", name = "W", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!rs", name = "X", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!rs", name = "Y", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!rs", name = "Z", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!rs", name = "bb", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!rs", name = "cb", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!rs", name = "db", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!rs", name = "eb", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!rs", name = "fb", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!rs", name = "gb", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!rs", name = "hb", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!rs", name = "ib", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!rs", name = "jb", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!rs", name = "kb", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!rs", name = "lb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!rs", name = "mb", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!rs", name = "nb", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!rs", name = "ob", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!rs", name = "pb", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!rs", name = "qb", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!rs", name = "rb", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!rs", name = "sb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!rs", name = "tb", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!rs", name = "ub", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!rs", name = "vb", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!rs", name = "wb", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!rs", name = "xb", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!rs", name = "yb", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!rs", name = "zb", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!rs", name = "Ab", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!rs", name = "Bb", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!rs", name = "Cb", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!rs", name = "Db", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!rs", name = "Eb", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!rs", name = "Fb", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!rs", name = "Hb", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!rs", name = "Ib", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!rs", name = "Kb", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!rs", name = "Lb", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!rs", name = "Mb", descriptor = "I")
    private int field2601;

    @OriginalMember(owner = "client!rs", name = "Nb", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!rs", name = "Ob", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!rs", name = "Pb", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!rs", name = "Qb", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!rs", name = "Rb", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!rs", name = "Sb", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!rs", name = "Tb", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!rs", name = "Ub", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!rs", name = "Vb", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!rs", name = "Wb", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!rs", name = "Xb", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!rs", name = "Yb", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!rs", name = "Zb", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!rs", name = "ac", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!rs", name = "bc", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!rs", name = "cc", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!rs", name = "dc", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!rs", name = "ec", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!rs", name = "fc", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!rs", name = "gc", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!rs", name = "hc", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!rs", name = "ic", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!rs", name = "kc", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!rs", name = "lc", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!rs", name = "mc", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!rs", name = "nc", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!rs", name = "oc", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!rs", name = "pc", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!rs", name = "qc", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!rs", name = "sc", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!rs", name = "tc", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!rs", name = "uc", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!rs", name = "vc", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!rs", name = "wc", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!rs", name = "xc", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!rs", name = "yc", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!rs", name = "zc", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!rs", name = "Ac", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!rs", name = "Bc", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!rs", name = "Cc", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!rs", name = "Dc", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!rs", name = "Ec", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!rs", name = "Fc", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!rs", name = "Gc", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!rs", name = "Hc", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!rs", name = "Ic", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!rs", name = "Jc", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!rs", name = "Kc", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!rs", name = "Lc", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!rs", name = "Mc", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!rs", name = "Nc", descriptor = "I")
    private int field2654;

    @OriginalMember(owner = "client!rs", name = "Oc", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!rs", name = "Pc", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!rs", name = "Qc", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!rs", name = "Rc", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!rs", name = "Sc", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!rs", name = "Tc", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!rs", name = "Uc", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!rs", name = "Vc", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!rs", name = "Wc", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!rs", name = "Xc", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!rs", name = "Yc", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!rs", name = "Zc", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!rs", name = "ad", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!rs", name = "bd", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!rs", name = "cd", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rs", name = "dd", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!rs", name = "ed", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!rs", name = "fd", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!rs", name = "gd", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!rs", name = "hd", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!rs", name = "jd", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!rs", name = "kd", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!rs", name = "ld", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!rs", name = "md", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!rs", name = "nd", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!rs", name = "od", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!rs", name = "pd", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rs", name = "qd", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!rs", name = "rd", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!rs", name = "sd", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!rs", name = "td", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!rs", name = "ud", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!rs", name = "vd", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!rs", name = "wd", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!rs", name = "xd", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!rs", name = "yd", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!rs", name = "zd", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!rs", name = "Ad", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!rs", name = "Bd", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!rs", name = "Cd", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!rs", name = "Dd", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!rs", name = "Ed", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!rs", name = "Fd", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!rs", name = "Gd", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!rs", name = "Hd", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!rs", name = "Id", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!rs", name = "Jd", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!rs", name = "Kd", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!rs", name = "Ld", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!rs", name = "Md", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!rs", name = "Nd", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!rs", name = "Od", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!rs", name = "Pd", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!rs", name = "Qd", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!rs", name = "Rd", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!rs", name = "Sd", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!rs", name = "Td", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!rs", name = "Ud", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!rs", name = "Vd", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!rs", name = "Wd", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!rs", name = "Xd", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!rs", name = "Yd", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!rs", name = "Zd", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!rs", name = "ae", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!rs", name = "be", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!rs", name = "ce", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!rs", name = "de", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!rs", name = "ee", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!rs", name = "fe", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!rs", name = "ge", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!rs", name = "he", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!rs", name = "ie", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!rs", name = "je", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!rs", name = "ke", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!rs", name = "le", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!rs", name = "me", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!rs", name = "ne", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!rs", name = "oe", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!rs", name = "pe", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!rs", name = "qe", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!rs", name = "re", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!rs", name = "se", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!rs", name = "te", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!rs", name = "ue", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!rs", name = "ve", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!rs", name = "we", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!rs", name = "Fe", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!rs", name = "Me", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!rs", name = "af", descriptor = "I")
    private int field2771;

    @OriginalMember(owner = "client!rs", name = "cf", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!rs", name = "df", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!rs", name = "nf", descriptor = "I")
    private int field2783;

    @OriginalMember(owner = "client!rs", name = "of", descriptor = "I")
    private int field2784;

    @OriginalMember(owner = "client!rs", name = "sf", descriptor = "I")
    private int field2788;

    @OriginalMember(owner = "client!rs", name = "xf", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!rs", name = "Nf", descriptor = "I")
    private int field2809;

    @OriginalMember(owner = "client!rs", name = "hg", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!rs", name = "sg", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!rs", name = "Ig", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!rs", name = "Tg", descriptor = "I")
    private int field2867;

    @OriginalMember(owner = "client!rs", name = "Vg", descriptor = "I")
    private int field2869;

    @OriginalMember(owner = "client!rs", name = "dh", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!rs", name = "hh", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!rs", name = "kh", descriptor = "I")
    private int field2884;

    @OriginalMember(owner = "client!rs", name = "mh", descriptor = "I")
    private int field2886;

    @OriginalMember(owner = "client!rs", name = "Ah", descriptor = "I")
    private int field2900;

    @OriginalMember(owner = "client!rs", name = "Fh", descriptor = "I")
    private int field2905;

    @OriginalMember(owner = "client!rs", name = "Gh", descriptor = "I")
    private int field2906;

    @OriginalMember(owner = "client!rs", name = "pf", descriptor = "J")
    private long field2785;

    @OriginalMember(owner = "client!rs", name = "Cf", descriptor = "Lvo;")
    public class129 field2798;

    @OriginalMember(owner = "client!rs", name = "Qf", descriptor = "Lvo;")
    public class129 field2812;

    @OriginalMember(owner = "client!rs", name = "og", descriptor = "Lvo;")
    public class129 field2836;

    @OriginalMember(owner = "client!rs", name = "vg", descriptor = "Lvo;")
    public class129 field2843;

    @OriginalMember(owner = "client!rs", name = "xg", descriptor = "Lvo;")
    public class129 field2845;

    @OriginalMember(owner = "client!rs", name = "Bg", descriptor = "Lvo;")
    public class129 field2849;

    @OriginalMember(owner = "client!rs", name = "Rg", descriptor = "Lvo;")
    public class129 field2865;

    @OriginalMember(owner = "client!rs", name = "gh", descriptor = "Lvo;")
    public class129 field2880;

    @OriginalMember(owner = "client!rs", name = "ph", descriptor = "Lvo;")
    public class129 field2889;

    @OriginalMember(owner = "client!rs", name = "rh", descriptor = "Lvo;")
    public class129 field2891;

    @OriginalMember(owner = "client!rs", name = "rg", descriptor = "Lpk;")
    private class135 field2839;

    @OriginalMember(owner = "client!rs", name = "lg", descriptor = "Ljs;")
    private class170 field2833;

    @OriginalMember(owner = "client!rs", name = "pg", descriptor = "Ljs;")
    private class170 field2837;

    @OriginalMember(owner = "client!rs", name = "Se", descriptor = "Ldda;")
    private class392 field2763;

    @OriginalMember(owner = "client!rs", name = "fg", descriptor = "Lak;")
    public class497 field2827;

    @OriginalMember(owner = "client!rs", name = "Pg", descriptor = "Lak;")
    public class497 field2863;

    @OriginalMember(owner = "client!rs", name = "Qe", descriptor = "Lqr;")
    private class622 field2761;

    @OriginalMember(owner = "client!rs", name = "Te", descriptor = "Lqr;")
    private class622 field2764;

    @OriginalMember(owner = "client!rs", name = "bg", descriptor = "Lwo;")
    public class692 field2823;

    @OriginalMember(owner = "client!rs", name = "jc", descriptor = "Ljaa;")
    public static class747 field2624;

    @OriginalMember(owner = "client!rs", name = "Qg", descriptor = "Lsda;")
    private class749 field2864;

    @OriginalMember(owner = "client!rs", name = "yg", descriptor = "Lsb;")
    private class89 field2846;

    @OriginalMember(owner = "client!rs", name = "Ve", descriptor = "Lju;")
    private class98 field2766;

    @OriginalMember(owner = "client!rs", name = "Df", descriptor = "Lju;")
    public class98 field2799;

    @OriginalMember(owner = "client!rs", name = "Je", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2754;

    @OriginalMember(owner = "client!rs", name = "lf", descriptor = "Z")
    private boolean field2781;

    @OriginalMember(owner = "client!rs", name = "mf", descriptor = "Z")
    private boolean field2782;

    @OriginalMember(owner = "client!rs", name = "rf", descriptor = "Z")
    private boolean field2787;

    @OriginalMember(owner = "client!rs", name = "tf", descriptor = "Z")
    private boolean field2789;

    @OriginalMember(owner = "client!rs", name = "Ef", descriptor = "Z")
    private boolean field2800;

    @OriginalMember(owner = "client!rs", name = "Gf", descriptor = "Z")
    private boolean field2802;

    @OriginalMember(owner = "client!rs", name = "Kf", descriptor = "Z")
    private boolean field2806;

    @OriginalMember(owner = "client!rs", name = "Lf", descriptor = "Z")
    private boolean field2807;

    @OriginalMember(owner = "client!rs", name = "Of", descriptor = "Z")
    public boolean field2810;

    @OriginalMember(owner = "client!rs", name = "Vf", descriptor = "Z")
    private boolean field2817;

    @OriginalMember(owner = "client!rs", name = "Wf", descriptor = "Z")
    public boolean field2818;

    @OriginalMember(owner = "client!rs", name = "dg", descriptor = "Z")
    public boolean field2825;

    @OriginalMember(owner = "client!rs", name = "Ag", descriptor = "Z")
    public boolean field2848;

    @OriginalMember(owner = "client!rs", name = "Ng", descriptor = "Z")
    public boolean field2861;

    @OriginalMember(owner = "client!rs", name = "bh", descriptor = "Z")
    public boolean field2875;

    @OriginalMember(owner = "client!rs", name = "ch", descriptor = "Z")
    public boolean field2876;

    @OriginalMember(owner = "client!rs", name = "ih", descriptor = "Z")
    public boolean field2882;

    @OriginalMember(owner = "client!rs", name = "qh", descriptor = "Z")
    private boolean field2890;

    @OriginalMember(owner = "client!rs", name = "sh", descriptor = "Z")
    public boolean field2892;

    @OriginalMember(owner = "client!rs", name = "wh", descriptor = "Z")
    private boolean field2896;

    @OriginalMember(owner = "client!rs", name = "If", descriptor = "[Lnba;")
    private class487[] field2804;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
    private final void method1235(byte arg0) {
        class583.field8240[3] = 1.0F;
        ++field2698;
        class583.field8240[2] = this.field2835 * this.field2792;
        class583.field8240[0] = this.field2814 * this.field2792;
        if (arg0 != 26) {
            this.field2828 = 1.6983318F;
        }
        class583.field8240[1] = this.field2803 * this.field2792;
        OpenGL.glLightfv(16384, 4609, class583.field8240, 0);
        class583.field8240[3] = 1.0F;
        class583.field8240[2] = -this.field2855 * this.field2835;
        class583.field8240[1] = -this.field2855 * this.field2803;
        class583.field8240[0] = -this.field2855 * this.field2814;
        OpenGL.glLightfv(16385, 4609, class583.field8240, 0);
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(II)I")
    public final int method1236(int arg0, int arg1) {
        ++field2549;
        if (~arg1 != -2) {
            if (~arg1 != -1) {
                if (~arg1 == -3) {
                    return 34165;
                } else if (arg1 != 3) {
                    if (arg1 == 4) {
                        return 34023;
                    } else {
                        if (arg0 != 8) {
                            this.field2826 = false;
                        }
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

    @OriginalMember(owner = "client!rs", name = "X", descriptor = "(I)V")
    public final void method395(int arg0) {
        this.field2756 = 0;
        ++field2562;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field2756;
        }
        this.field2758 = 1 << this.field2756;
    }

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "()Z")
    public final boolean method1237() {
        ++field2672;
        return this.field2749 != null && this.field2749.method1356((byte) -76);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lb;IIII)Lka;")
    public final class282 method301(class352 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2594;
        return new class129(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "()Ltc;")
    public final class73 method343() {
        ++field2707;
        return this.field2752;
    }

    @OriginalMember(owner = "client!rs", name = "EA", descriptor = "(IIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        ++field2671;
        if (!this.field2876) {
            throw new RuntimeException("");
        } else {
            this.field2877 = arg0;
            this.field2853 = arg2;
            this.field2871 = arg1;
            this.field2841 = arg3;
            if (this.field2860) {
                this.field2744.field225.method3449(-60);
                this.field2744.field225.method3448(114);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)V")
    public final void method1238(int arg0, boolean arg1) {
        if (arg0 <= 9) {
            this.method280((int[]) null);
        }
        if (!arg1 == this.field2806) {
            this.field2806 = arg1;
            this.method1253((byte) 74);
            this.field2788 &= -32;
        }
        ++field2641;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(IIII)V")
    public final void method1239(int arg0, int arg1, int arg2, int arg3) {
        ++field2652;
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
        OpenGL.glTexEnvi(8960, 34192 - -arg0, arg3);
        if (arg2 != 768) {
            this.method1256(-86, 85, 10);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method390(Canvas arg0) {
        ++field2663;
        if (this.field2743 == arg0) {
            throw new RuntimeException();
        } else if (this.field2595.containsKey(arg0)) {
            Long var2 = (Long) this.field2595.get(arg0);
            this.field2742.releaseSurface(arg0, var2);
            this.field2595.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "(II)V")
    public static final void method1240(int arg0, int arg1) {
        ++field2700;
        class187.field3121 = arg0;
        class120.field1849 = -1;
        class505.field7362 = arg1;
        class481.method2912((byte) 83);
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)V")
    public static final void method1241(byte arg0) {
        ++class253.field4012;
        ++field2718;
        class540 var1 = class257.method1732(true, class539.field7698, class655.field9332);
        var1.field7707.method1939(class110.field1714, arg0 ^ 1134947728);
        if (arg0 != 24) {
            field2624 = null;
        }
        class756.method4211(var1, 111);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([IIIIIZ)Lit;")
    public final class34 method231(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2584;
        return new class392(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIZ)Lit;")
    public final class34 method270(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2695;
        return new class392(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lmp;I)V")
    public final void method380(class315 arg0, int arg1) {
        ++field2609;
        this.field2747.method2304(this, arg1, 1744197452, arg0);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I[Lvt;)V")
    public final void method339(int arg0, class759[] arg1) {
        ++field2552;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field2808[var3] = arg1[var3];
        }
        this.field2886 = arg0;
        if (this.field2867 != 1) {
            this.method1248(false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;")
    public final class72 method1242(class72 arg0, class72 arg1, float arg2, class72 arg3) {
        ++field2710;
        if (arg0 != null && arg1 != null && this.field2848 && this.field2805) {
            class672 var5 = null;
            class135 var6 = (class135) arg0;
            class135 var7 = (class135) arg1;
            class708 var8 = var6.method1084((byte) 28);
            class708 var9 = var7.method1084((byte) 28);
            if (var8 != null && var9 != null) {
                int var10 = var9.field9978 < var8.field9978 ? var8.field9978 : var9.field9978;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class672) {
                    class672 var11 = (class672) arg3;
                    if (var10 == var11.method3754((byte) 79)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class672(this, var10);
                }
                if (var5.method3756((byte) 126, arg2, var8, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
    public final void method1243(int arg0) {
        if (arg0 != 34842) {
            this.field2897 = 1.0518615F;
        }
        OpenGL.glPushMatrix();
        ++field2560;
    }

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "(I)V")
    private final void method1244(int arg0) {
        this.method1327(-63, -2);
        ++field2615;
        for (int var2 = this.field2793 - 1; var2 >= 0; --var2) {
            this.method1298(var2, (byte) -124);
            this.method1306((class487) null, 97);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1256(8448, -4, 8448);
        this.method1239(2, 34168, 768, 770);
        this.method1289(-1895);
        this.field2783 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field2784 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field2781 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field2787 = true;
        this.method1238(92, true);
        this.method1284(true, 5890);
        this.method1318((byte) -122, true);
        this.method1263((byte) 104, true);
        this.method1311(85);
        this.field2742.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        int var3 = -66 % ((arg0 - -38) / 58);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var5 = 0; ~var5 > -9; ++var5) {
            int var6 = var5 + 16384;
            OpenGL.glLightfv(var6, 4608, var4, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field2879 = this.field2883 = -1;
        this.method374();
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(Z)V")
    public final void method1245(boolean arg0) {
        OpenGL.glPopMatrix();
        if (!arg0) {
            ++field2739;
        }
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(Z)V")
    private final void method1246(boolean arg0) {
        ++field2623;
        float[] var2 = this.field2858;
        float var3 = (float) (-this.field2811 * this.field2819) / (float) this.field2873;
        float var4 = (float) ((-this.field2811 + this.field2726) * this.field2819) / (float) this.field2873;
        if (!arg0) {
            float var5 = (float) (this.field2830 * this.field2819) / (float) this.field2832;
            float var6 = (float) ((-this.field2697 + this.field2830) * this.field2819) / (float) this.field2832;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field2819 * 2.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[15] = 0.0F;
                var2[10] = this.field2815 = (float) (-(this.field2888 - -this.field2819)) / (float) (-this.field2819 + this.field2888);
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[14] = this.field2831 = -((float) this.field2888 * var7) / (float) (-this.field2819 + this.field2888);
                var2[12] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[6] = 0.0F;
                var2[11] = -1.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
            } else {
                var2[4] = 0.0F;
                var2[14] = 0.0F;
                var2[5] = 1.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[6] = 0.0F;
            }
            this.method1333((byte) 109);
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V")
    public final void method322(int arg0) {
        ++field2627;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(JZ)V")
    public final synchronized void method1247(long arg0, boolean arg1) {
        ++field2646;
        class65 var4 = new class65();
        var4.field1039 = arg0;
        if (!arg1) {
            this.field2889 = null;
        }
        this.field2780.method3472(124, var4);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lmp;)V")
    public final void method420(class315 arg0) {
        ++field2656;
        this.field2747.method2304(this, -1, 1744197452, arg0);
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(Z)V")
    private final void method1248(boolean arg0) {
        if (arg0) {
            this.field2868 = null;
        }
        ++field2684;
        int var2;
        for (var2 = 0; ~var2 > ~this.field2886; ++var2) {
            class759 var3 = this.field2808[var2];
            class353.field5273[0] = (float) var3.method4228(-126);
            int var4 = 16386 - -var2;
            class353.field5273[1] = (float) var3.method4221((byte) -7);
            class353.field5273[2] = (float) var3.method4223((byte) -70);
            class353.field5273[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class353.field5273, 0);
            int var5 = var3.method4227(arg0);
            float var6 = var3.method4226(5) / 255.0F;
            class353.field5273[2] = (float) class636.method3603(255, var5) * var6;
            class353.field5273[1] = var6 * (float) class636.method3603(var5 >> 8, 255);
            class353.field5273[0] = (float) class636.method3603(255, var5 >> 16) * var6;
            OpenGL.glLightfv(var4, 4609, class353.field5273, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method4224((byte) 127) * var3.method4224((byte) 127)));
            OpenGL.glEnable(var4);
        }
        while (this.field2809 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field2809 = this.field2886;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lsda;B)V")
    public final void method1249(class749 arg0, byte arg1) {
        if (this.field2864 != arg0) {
            if (this.field2851) {
                OpenGL.glBindBufferARB(34963, arg0.method1410(27076));
            }
            this.field2864 = arg0;
        }
        if (arg1 == 43) {
            ++field2571;
        }
    }

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "(I)Ljava/lang/String;")
    public static final String method1250(int arg0) {
        ++field2638;
        if (!class32.field304 && class237.field3813 != null) {
            if ((class237.field3813.field3483 == null || ~class237.field3813.field3483.length() == -1) && class237.field3813.field3482 != null && class237.field3813.field3482.length() > 0) {
                return class237.field3813.field3482;
            } else {
                if (arg0 <= 15) {
                    method1241((byte) 126);
                }
                return class237.field3813.field3483;
            }
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLqr;)V")
    public final void method1251(byte arg0, class622 arg1) {
        ++field2612;
        if (this.field2767 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field2767 >= 0) {
                this.field2768[this.field2767].method797(63);
            }
            this.field2764 = this.field2768[++this.field2767] = arg1;
            int var3 = 21 / ((51 - arg0) / 52);
            this.field2764.method811(30988);
        }
    }

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "()Z")
    public final boolean method218() {
        ++field2694;
        return this.field2896 && (!this.method1237() || this.field2802);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIBI)V")
    public final void method1252(int arg0, int arg1, byte arg2, int arg3) {
        ++field2582;
        if (arg2 < -67) {
            OpenGL.glDrawArrays(arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method308(Canvas arg0, int arg1, int arg2) {
        ++field2619;
        if (this.field2743 == arg0) {
            throw new RuntimeException();
        } else if (!this.field2595.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field2742.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field2595.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)V")
    private final void method1253(byte arg0) {
        ++field2614;
        if (this.field2806 && this.field2893 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 74) {
            this.field2859 = -1.839384F;
        }
    }

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "(II)I")
    public final int method1254(int arg0, int arg1) {
        ++field2676;
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg1 != 5123 && arg1 != 5122) {
                if (arg0 != -1) {
                    this.field2880 = null;
                }
                if (~arg1 != -5126 && ~arg1 != -5125 && ~arg1 != -5127) {
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

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(Z)V")
    public final void method246(boolean arg0) {
        ++field2727;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZI[BI)Ljs;")
    public final class170 method1255(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        ++field2729;
        if (!this.field2851 || arg1 && !this.field2902) {
            return arg0 != 516 ? null : new class161(this, arg4, arg3, arg2);
        } else {
            return new class103(this, arg4, arg3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)V")
    public final void method1256(int arg0, int arg1, int arg2) {
        if (arg1 == -4) {
            if (~this.field2884 == -1) {
                boolean var4 = false;
                if (~this.field2872 != ~arg2) {
                    OpenGL.glTexEnvi(8960, 34161, arg2);
                    var4 = true;
                    this.field2872 = arg2;
                }
                if (~this.field2854 != ~arg0) {
                    OpenGL.glTexEnvi(8960, 34162, arg0);
                    var4 = true;
                    this.field2854 = arg0;
                }
                if (var4) {
                    this.field2788 &= -30;
                }
            } else {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                OpenGL.glTexEnvi(8960, 34162, arg0);
            }
            ++field2539;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLo;)V")
    public final void method1257(byte arg0, class174 arg1) {
        OpenGL.glLoadMatrixf(arg1.method1368(arg0 + 16295), 0);
        if (arg0 != 88) {
            this.method320();
        }
        ++field2660;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "()V")
    public final void method1258() {
        ++field2703;
        if (this.field2749 != null && this.field2749.method1356((byte) -84)) {
            this.field2745.method26(this.field2749, 96);
            this.field2748.method3950(false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "(II)V")
    public final void method1259(int arg0, int arg1) {
        if (arg1 != -18335) {
            this.field2855 = -0.9383438F;
        }
        class583.field8240[3] = (float) (arg0 >>> 24) / 255.0F;
        class583.field8240[0] = (float) class636.method3603(arg0, 16711680) / 1.671168E7F;
        class583.field8240[2] = (float) class636.method3603(255, arg0) / 255.0F;
        class583.field8240[1] = (float) class636.method3603(arg0, 65280) / 65280.0F;
        ++field2666;
        OpenGL.glTexEnvfv(8960, 8705, class583.field8240, 0);
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(B)V")
    private final void method1260(byte arg0) {
        int var2 = -24 % ((61 - arg0) / 57);
        ++field2620;
        int var3 = 0;
        while (!this.field2742.method3276()) {
            if (~(var3++) < -6) {
                throw new RuntimeException("");
            }
            class484.method2932(true, 1000L);
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(II)V")
    public final void method1261(int arg0, int arg1) throws class556 {
        ++field2592;
        try {
            this.field2742.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!rs", name = "na", descriptor = "(IIII)[I")
    public final int[] method1262(int arg0, int arg1, int arg2, int arg3) {
        ++field2559;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field2697 - (arg1 - -var6), arg2, 1, 32993, this.field2878, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BZ)V")
    public final void method1263(byte arg0, boolean arg1) {
        if (this.field2782 == !arg1) {
            this.field2782 = arg1;
            this.method1283(false);
            this.field2788 &= -32;
        }
        if (arg0 != 104) {
            this.method1306((class487) null, -59);
        }
        ++field2542;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II[I[I)Laa;")
    public final class570 method282(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field2719;
        return class93.method776((byte) 69, arg1, arg2, this, arg0, arg3);
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(IIII)V")
    public final void method1264(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 2) {
            ++field2591;
            OpenGL.glTexEnvi(8960, arg2 + 34184, arg0);
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg3);
        }
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "()V")
    public final void method1265() {
        ++field2673;
        if (this.field2866 && ~this.field2726 < -1 && ~this.field2697 < -1) {
            int var1 = this.field2850;
            int var2 = this.field2857;
            int var3 = this.field2847;
            int var4 = this.field2822;
            this.method374();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1311(-88);
            this.method1238(47, false);
            this.method1284(false, 5890);
            this.method1318((byte) -122, false);
            this.method1263((byte) 104, false);
            this.method1306((class487) null, 48);
            this.method1327(-50, -2);
            this.method1334(0, 1);
            this.method1320(0, false);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field2726, this.field2697, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method240(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "()Z")
    public final boolean method239() {
        ++field2550;
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method1279(false);
        ++field2665;
        this.method1320(arg12, false);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "(I)V")
    private final void method1266(int arg0) {
        this.field2742.method3277();
        ++field2678;
        if (arg0 != -31839) {
            this.method419(-85, -29, (int[][]) null, (int[][]) null, -117, -24, -6);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(IZ)V")
    public final void method1267(int arg0, boolean arg1) {
        if (!this.field2800 != !arg1) {
            this.field2800 = arg1;
            this.method1303(1);
        }
        ++field2618;
        if (arg0 >= -95) {
            this.method1298(-97, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(FFF)V")
    public final void method1268(float arg0, float arg1, float arg2) {
        ++field2662;
        class432.field6334 = arg1;
        class545.field7800 = arg0;
        class689.field9787 = arg2;
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)V")
    public final void method229(int arg0) {
        this.method1260((byte) 122);
        ++field2704;
    }

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "(I)V")
    private final void method1269(int arg0) {
        if (this.field2867 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field2726 < -1 && this.field2697 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field2726, (double) this.field2697, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field2867 = 1;
            this.field2788 &= -25;
        }
        ++field2597;
        if (arg0 != -25) {
            this.field2742 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(FFFI)V")
    private final void method1270(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 < 46) {
            this.field2834 = -0.21713884F;
        }
        OpenGL.glMatrixMode(5890);
        ++field2611;
        if (this.field2890) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg0, arg2);
        OpenGL.glMatrixMode(5888);
        this.field2890 = true;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    public final synchronized void method261(int arg0) {
        ++field2741;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field2775.method3473(false)) {
            class332 var12 = (class332) this.field2775.method3466(0);
            class634.field8902[var3++] = (int) var12.field1039;
            this.field2774 -= var12.field4880;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class634.field8902, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class634.field8902, 0);
            var3 = 0;
        }
        while (!this.field2776.method3473(false)) {
            class332 var11 = (class332) this.field2776.method3466(0);
            class634.field8902[var3++] = (int) var11.field1039;
            this.field2773 -= var11.field4880;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class634.field8902, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class634.field8902, 0);
            var3 = 0;
        }
        while (!this.field2777.method3473(false)) {
            class332 var10 = (class332) this.field2777.method3466(0);
            class634.field8902[var3++] = var10.field4880;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class634.field8902, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class634.field8902, 0);
            var3 = 0;
        }
        while (!this.field2778.method3473(false)) {
            class332 var9 = (class332) this.field2778.method3466(0);
            class634.field8902[var3++] = (int) var9.field1039;
            this.field2771 -= var9.field4880;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class634.field8902, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class634.field8902, 0);
            boolean var4 = false;
        }
        while (!this.field2772.method3473(false)) {
            class332 var8 = (class332) this.field2772.method3466(0);
            OpenGL.glDeleteLists((int) var8.field1039, var8.field4880);
        }
        while (!this.field2779.method3473(false)) {
            class65 var7 = this.field2779.method3466(0);
            OpenGL.glDeleteProgramARB((int) var7.field1039);
        }
        while (!this.field2780.method3473(false)) {
            class65 var6 = this.field2780.method3466(0);
            OpenGL.glDeleteObjectARB(var6.field1039);
        }
        while (!this.field2772.method3473(false)) {
            class332 var5 = (class332) this.field2772.method3466(0);
            OpenGL.glDeleteLists((int) var5.field1039, var5.field4880);
        }
        this.field2748.method3952(3553);
        if (~this.method332() < -100663297 && class18.method109(-11121) > this.field2785 + 60000L) {
            System.gc();
            this.field2785 = class18.method109(-11121);
        }
        this.field2757 = var2;
    }

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "()Ltc;")
    public final class73 method414() {
        ++field2650;
        return new class174();
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(I)V")
    public final void method216(int arg0) {
        ++field2635;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field2751 = arg0;
            this.field2748.method3950(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "(I)V")
    public static void method1271(int arg0) {
        if (arg0 >= 120) {
            field2624 = null;
            field2563 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(II)V")
    public final void method223(int arg0, int arg1) {
        if (~this.field2819 != ~arg0 || this.field2888 != arg1) {
            this.field2888 = arg1;
            this.field2819 = arg0;
            this.method1246(false);
            this.method1339(8);
            if (~this.field2867 != -4) {
                if (~this.field2867 == -3) {
                    this.method1297(105);
                }
            } else {
                this.method1304(90);
            }
        }
        ++field2607;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1272(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class556 {
        this.method1261(arg2, arg3);
        ++field2668;
    }

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "()I")
    public final int method1273() {
        ++field2653;
        int var1 = this.field2905;
        this.field2905 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([I)V")
    public final void method280(int[] arg0) {
        arg0[0] = this.field2726;
        arg0[1] = this.field2697;
        ++field2621;
    }

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "()V")
    public final void method1274() {
        ++field2737;
        if (this.field2805) {
            if (this.field2766 != this.field2761) {
                throw new RuntimeException();
            }
            this.field2766.method813((byte) -96, 0);
            this.field2766.method813((byte) 98, 8);
            this.method1293(0, this.field2766);
        } else {
            if (!this.field2817) {
                throw new RuntimeException("");
            }
            this.field2763.method47(0, 0, this.field2726, this.field2697, 0, 0);
            this.field2742.setSurface(this.field2675);
        }
        this.field2726 = this.field2654;
        this.field2697 = this.field2601;
        this.field2763 = null;
        this.method1311(-101);
        this.method1341((byte) 60);
        this.method374();
    }

    @OriginalMember(owner = "client!rs", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method259(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field2651;
        boolean var7 = ~this.field2879 != ~arg0;
        if (var7 || this.field2792 != arg1 || this.field2855 != arg2) {
            this.field2855 = arg2;
            this.field2879 = arg0;
            this.field2792 = arg1;
            if (var7) {
                this.field2835 = (float) (255 & this.field2879) / 255.0F;
                this.field2803 = (float) (65280 & this.field2879) / 65280.0F;
                this.field2814 = (float) (16711680 & this.field2879) / 1.671168E7F;
                this.method1310(7135);
            }
            this.method1235((byte) 26);
        }
        if (this.field2901[0] != arg3 || this.field2901[1] != arg4 || this.field2901[2] != arg5) {
            this.field2901[1] = arg4;
            this.field2901[0] = arg3;
            this.field2901[2] = arg5;
            this.field2797[2] = -arg5;
            this.field2797[0] = -arg3;
            this.field2797[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field2868[0] = arg3 * var8;
            this.field2868[1] = arg4 * var8;
            this.field2868[2] = arg5 * var8;
            this.field2874[2] = -this.field2868[2];
            this.field2874[0] = -this.field2868[0];
            this.field2874[1] = -this.field2868[1];
            this.method1325(16385);
            this.field2881 = (int) (arg3 * 256.0F / arg4);
            this.field2829 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method361(Canvas arg0, int arg1, int arg2) {
        ++field2711;
        long var4 = 0L;
        if (arg0 != null && this.field2743 != arg0) {
            if (this.field2595.containsKey(arg0)) {
                Long var6 = (Long) this.field2595.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field2598;
        }
        if (~var4 == -1L) {
            throw new RuntimeException();
        } else {
            this.field2742.surfaceResized(var4);
            if (this.field2632 == arg0) {
                this.method1275(0);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZ)Lit;")
    public final class34 method406(int arg0, int arg1, boolean arg2) {
        ++field2661;
        return new class392(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIF)Lvt;")
    public final class759 method409(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field2625;
        return new class217(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "(I)V")
    private final void method1275(int arg0) {
        if (arg0 == 0) {
            if (this.field2632 != null) {
                Dimension var2 = this.field2632.getSize();
                this.field2654 = var2.width;
                this.field2601 = var2.height;
            } else {
                this.field2654 = this.field2601 = 0;
            }
            ++field2573;
            if (this.field2761 == null) {
                this.field2697 = this.field2601;
                this.field2726 = this.field2654;
                this.method1341((byte) 60);
            }
            this.method1311(-94);
            this.method374();
        }
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(II)Lwm;")
    public final class28 method1276(int arg0, int arg1) {
        ++field2551;
        return null;
    }

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "()Z")
    public final boolean method220() {
        ++field2686;
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public final void method423(int arg0) {
        this.method1266(-31839);
        ++field2561;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class166(Canvas arg0, class267 arg1, int arg2) {
        super(arg1);
        new class677();
        new class616(16);
        this.field2772 = new class605();
        this.field2775 = new class605();
        this.field2776 = new class605();
        this.field2777 = new class605();
        this.field2778 = new class605();
        this.field2779 = new class605();
        this.field2780 = new class605();
        this.field2786 = new class174();
        this.field2790 = new class174();
        this.field2791 = new class174();
        this.field2797 = new float[4];
        this.field2808 = new class759[class492.field7128];
        this.field2822 = 0;
        this.field2834 = 0.0F;
        this.field2819 = 50;
        this.field2841 = 0;
        this.field2844 = -1.0F;
        this.field2811 = 0;
        this.field2853 = -1;
        this.field2821 = 0;
        this.field2830 = 0;
        this.field2854 = 8448;
        this.field2794 = 0;
        this.field2860 = false;
        this.field2858 = new float[16];
        this.field2874 = new float[4];
        this.field2847 = 0;
        this.field2872 = 8448;
        this.field2850 = 0;
        this.field2803 = 1.0F;
        this.field2813 = 3584.0F;
        this.field2826 = true;
        this.field2859 = -1.0F;
        this.field2855 = -1.0F;
        this.field2842 = 0;
        this.field2835 = 1.0F;
        this.field2868 = new float[4];
        this.field2832 = 512;
        this.field2885 = 1.0F;
        this.field2857 = 0;
        this.field2888 = 3584;
        this.field2879 = -1;
        this.field2871 = -1;
        this.field2852 = 1.0F;
        this.field2883 = -1;
        this.field2893 = -1;
        this.field2873 = 512;
        this.field2814 = 1.0F;
        this.field2792 = -1.0F;
        this.field2862 = 3584.0F;
        this.field2901 = new float[4];
        this.field2870 = new class547(8192);
        this.field2907 = new byte[16384];
        this.field2903 = new int[1];
        this.field2908 = new int[1];
        this.field2904 = new int[1];
        this.field2746 = arg2;
        this.field2632 = this.field2743 = arg0;
        if (!class541.method3169("jaclib", -44)) {
            throw new RuntimeException("");
        } else if (!class541.method3169("jaggl", -89)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field2742 = new OpenGL();
                this.field2675 = this.field2598 = this.field2742.init(arg0, 8, 8, 8, 24, 0, this.field2746);
                if (~this.field2598 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1260((byte) -127);
                    int var4 = this.method1295((byte) 23);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field2878 = this.field2796 ? 33639 : 5121;
                        if (this.field2895.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class750.method4181((byte) 126, this.field2895.replace('/', ' '), ' ');
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && method1277(var10.substring(1, 3), 0)) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (var10.length() >= 4 && method1277(var10.substring(0, 4), 0)) {
                                                var5 = class714.method3949((byte) -105, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field2851 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field2801 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field2820 = false;
                            }
                            this.field2824 &= this.field2742.method3275("GL_ARB_half_float_pixel");
                            this.field2899 = true;
                            this.field2902 = this.field2851;
                        }
                        if (~this.field2898.indexOf("intel") != 0) {
                            this.field2805 = false;
                        }
                        this.field2866 = !this.field2898.equals("s3 graphics");
                        if (this.field2851) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class614.method3506(true, (byte) 80, false);
                        this.field2755 = true;
                        this.field2748 = new class714(this, super.field7764);
                        this.method1307(1);
                        this.field2759 = new class431(this);
                        this.field2745 = new class5(this);
                        if (this.field2745.method27(-124)) {
                            this.field2749 = new class159(this);
                            if (!this.field2749.method1183(true)) {
                                this.field2749.method1182((byte) -57);
                                this.field2749 = null;
                            }
                        }
                        this.field2744 = new class23(this);
                        this.method1244(-100);
                        this.method1275(0);
                        this.method1265();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method248();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1277(String arg0, int arg1) {
        ++field2575;
        return arg1 != 0 ? true : class204.method1505(10, -17905, arg0, true);
    }

    @OriginalMember(owner = "client!rs", name = "XA", descriptor = "()I")
    public final int method377() {
        ++field2658;
        return this.field2888;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(IIIID)V")
    public final void method1278(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field2644;
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(Z)V")
    private final void method1279(boolean arg0) {
        ++field2732;
        if (arg0) {
            this.method350(109, 106, 125, 29);
        }
        if (~this.field2788 != -2) {
            this.method1269(-25);
            this.method1238(51, false);
            this.method1284(false, 5890);
            this.method1318((byte) -128, false);
            this.method1263((byte) 104, false);
            this.method1306((class487) null, 108);
            this.method1327(-54, -2);
            this.method1334(0, 1);
            this.field2788 = 1;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lpia;[Lgu;Z)Lda;")
    public final class400 method424(class54 arg0, class726[] arg1, boolean arg2) {
        ++field2679;
        return new class716(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "()Z")
    public final boolean method392() {
        ++field2626;
        return this.field2749 != null && (~this.field2746 >= -2 || this.field2802);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field2738;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            class229 var13 = (class229) arg6;
            class89 var14 = var13.field3704;
            this.method1299((byte) -89);
            this.method1306(var13.field3704, 37);
            this.method1320(arg5, false);
            this.method1256(8448, -4, 7681);
            this.method1239(0, 34167, 768, 768);
            float var15 = var14.field1360 / (float) var14.field1356;
            float var16 = var14.field1359 / (float) var14.field1357;
            float var17 = (float) (-arg0) + (float) arg2;
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
            if (~var22 >= ~arg9) {
                var28 = (float) (-var22 + arg9) * var21;
                var27 = (float) (-var22 + arg9) * var20;
            } else {
                var25 = (float) (arg9 - var22 + arg10) * var20;
                var26 = (float) (-var22 + arg9 + arg10) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (arg0 < arg2) {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 + (float) (-arg7)) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var30 += var28 + var32;
                var29 += var27 + var31;
                var27 = var23;
                var28 = var24;
            }
            this.method1239(0, 5890, 768, 768);
        }
    }

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field2596;
        float var10;
        float var11;
        if (this.field2846 != null && arg2 <= this.field2846.field9818 && ~arg3 >= ~this.field2846.field9807) {
            this.field2846.method3858((byte) 30, 0, arg2, 0, 0, arg3, 6406, false, arg6, 0);
            var10 = (float) arg3 * this.field2846.field1359 / (float) this.field2846.field9807;
            var11 = (float) arg2 * this.field2846.field1360 / (float) this.field2846.field9818;
        } else {
            this.field2846 = class582.method3357(arg3, 6406, 6406, this, 0, arg6, arg2, false);
            this.field2846.method3862(false, false, -29630);
            var11 = this.field2846.field1360;
            var10 = this.field2846.field1359;
        }
        this.method1299((byte) -89);
        this.method1306(this.field2846, 66);
        this.method1320(arg8, false);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1259(arg5, -18335);
        this.method1256(34165, -4, 34165);
        this.method1239(0, 34166, 768, 768);
        this.method1239(2, 5890, 768, 770);
        this.method1264(34166, 2, 0, 770);
        this.method1264(5890, 2, 2, 770);
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
        this.method1239(0, 5890, 768, 768);
        this.method1239(2, 34166, 768, 770);
        this.method1264(5890, 2, 0, 770);
        this.method1264(34166, 2, 2, 770);
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)Lza;")
    public final class254 method260(int arg0) {
        ++field2540;
        class719 var2 = new class719(arg0);
        this.field2760.method3472(104, var2);
        return var2;
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(B)V")
    private final void method1280(byte arg0) {
        this.field2828 = (float) (-this.field2830 + this.field2822);
        this.field2887 = (float) (-this.field2811 + this.field2850);
        if (arg0 > -106) {
            this.method409(120, -116, -48, 42, 124, 0.3546623F);
        }
        ++field2713;
        this.field2838 = (float) (-this.field2811 + this.field2857);
        this.field2897 = (float) (-this.field2830 + this.field2847);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)V")
    public final void method1281(int arg0, int arg1, int arg2, int arg3) {
        ++field2545;
        this.field2745.method28(arg3, -7983, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBI)V")
    public final synchronized void method1282(int arg0, byte arg1, int arg2) {
        ++field2617;
        class332 var4 = new class332(arg0);
        var4.field1039 = (long) arg2;
        if (arg1 != -122) {
            this.field2747 = null;
        }
        this.field2778.method3472(89, var4);
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(Z)V")
    private final void method1283(boolean arg0) {
        if (arg0) {
            this.field2859 = 0.37984625F;
        }
        OpenGL.glDepthMask(this.field2782 && this.field2826);
        ++field2643;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)V")
    public final void method1284(boolean arg0, int arg1) {
        if (arg0 == !this.field2807) {
            this.field2807 = arg0;
            this.method1303(1);
            this.field2788 &= -8;
        }
        ++field2590;
        if (arg1 != 5890) {
            this.method352(-86, 74, 30, 85, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "()V")
    public final void method1285() {
        ++field2593;
        this.field2745.method24(87);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(BLqr;)V")
    public final void method1286(byte arg0, class622 arg1) {
        ++field2605;
        if (~this.field2762 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field2762 <= -1) {
                this.field2770[this.field2762].method808(false);
            }
            this.field2761 = this.field2770[++this.field2762] = arg1;
            this.field2761.method801(9249);
            if (arg0 != -91) {
                this.field2769 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lza;)V")
    public final void method285(class254 arg0) {
        this.field2754 = ((class719) arg0).field10077;
        ++field2683;
        if (this.field2837 == null) {
            class547 var2 = new class547(80);
            if (this.field2796) {
                var2.method3200(-1.0F, 238551736);
                var2.method3200(-1.0F, 238551736);
                var2.method3200(0.0F, 238551736);
                var2.method3200(0.0F, 238551736);
                var2.method3200(1.0F, 238551736);
                var2.method3200(1.0F, 238551736);
                var2.method3200(-1.0F, 238551736);
                var2.method3200(0.0F, 238551736);
                var2.method3200(1.0F, 238551736);
                var2.method3200(1.0F, 238551736);
                var2.method3200(1.0F, 238551736);
                var2.method3200(1.0F, 238551736);
                var2.method3200(0.0F, 238551736);
                var2.method3200(1.0F, 238551736);
                var2.method3200(0.0F, 238551736);
                var2.method3200(-1.0F, 238551736);
                var2.method3200(1.0F, 238551736);
                var2.method3200(0.0F, 238551736);
                var2.method3200(0.0F, 238551736);
                var2.method3200(0.0F, 238551736);
            } else {
                var2.method3201(-1581865480, -1.0F);
                var2.method3201(-1581865480, -1.0F);
                var2.method3201(-1581865480, 0.0F);
                var2.method3201(-1581865480, 0.0F);
                var2.method3201(-1581865480, 1.0F);
                var2.method3201(-1581865480, 1.0F);
                var2.method3201(-1581865480, -1.0F);
                var2.method3201(-1581865480, 0.0F);
                var2.method3201(-1581865480, 1.0F);
                var2.method3201(-1581865480, 1.0F);
                var2.method3201(-1581865480, 1.0F);
                var2.method3201(-1581865480, 1.0F);
                var2.method3201(-1581865480, 0.0F);
                var2.method3201(-1581865480, 1.0F);
                var2.method3201(-1581865480, 0.0F);
                var2.method3201(-1581865480, -1.0F);
                var2.method3201(-1581865480, 1.0F);
                var2.method3201(-1581865480, 0.0F);
                var2.method3201(-1581865480, 0.0F);
                var2.method3201(-1581865480, 0.0F);
            }
            this.field2837 = this.method1255(516, false, var2.field4534, var2.field4543, 20);
            this.field2827 = new class497(this.field2837, 5126, 3, 0);
            this.field2863 = new class497(this.field2837, 5126, 2, 12);
            this.field2747.method2299(-53, this);
        }
    }

    @OriginalMember(owner = "client!rs", name = "ya", descriptor = "()V")
    public final void method1287() {
        this.method1263((byte) 104, true);
        ++field2669;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)Lhu;")
    public final class224 method1288(int arg0, int arg1) {
        ++field2567;
        return null;
    }

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "(I)V")
    private final void method1289(int arg0) {
        if (this.field2890) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field2890 = false;
        }
        if (arg0 != -1895) {
            field2563 = null;
        }
        ++field2589;
    }

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "(II)V")
    public final void method1290(int arg0, int arg1) {
        ++field2657;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(III)V")
    public final synchronized void method1291(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method1297(-48);
        }
        ++field2606;
        class332 var4 = new class332(arg2);
        var4.field1039 = (long) arg0;
        this.field2775.method3472(arg1 ^ 126, var4);
    }

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "()Z")
    public final boolean method1292() {
        ++field2568;
        if (this.field2749 != null) {
            if (!this.field2749.method1356((byte) -54)) {
                if (!this.field2745.method25(1, this.field2749)) {
                    return false;
                }
                this.field2748.method3950(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rs", name = "xa", descriptor = "(F)V")
    public final void method328(float arg0) {
        ++field2564;
        if (this.field2795 != arg0) {
            this.field2795 = arg0;
            this.method1310(7135);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILqr;)V")
    public final void method1293(int arg0, class622 arg1) {
        if (arg0 == 0) {
            ++field2616;
            if (this.field2825) {
                this.method1326(arg0 ^ 126, arg1);
                this.method1335(arg0 + 6914, arg1);
            } else if (this.field2765 >= 0 && this.field2769[this.field2765] == arg1) {
                this.field2769[this.field2765--] = null;
                arg1.method799(-3364);
                if (~this.field2765 > -1) {
                    this.field2764 = this.field2761 = null;
                } else {
                    this.field2764 = this.field2761 = this.field2769[this.field2765];
                    this.field2764.method800((byte) 33);
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lo;I)V")
    public final void method1294(class174 arg0, int arg1) {
        ++field2569;
        OpenGL.glPushMatrix();
        if (arg1 == 16670) {
            OpenGL.glMultMatrixf(arg0.method1368(16383), 0);
        }
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(B)I")
    private final int method1295(byte arg0) {
        ++field2541;
        int var2 = 0;
        this.field2898 = OpenGL.glGetString(7936).toLowerCase();
        this.field2895 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field2898.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field2898.indexOf("brian paul") != 0 || ~this.field2898.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class750.method4181((byte) 123, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class714.method3949((byte) -57, var4[0]);
                int var6 = class714.method3949((byte) -93, var4[1]);
                this.field2840 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field2840 > -13) {
            var2 |= 2;
        }
        if (!this.field2742.method3275("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field2742.method3275("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field2793 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field2869 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field2856 = var7[0];
        if (this.field2793 < 2 || ~this.field2869 > -3 || ~this.field2856 > -3) {
            var2 |= 16;
        }
        this.field2796 = Stream.method2572();
        int var8 = -88 / ((arg0 - -38) / 53);
        this.field2817 = this.field2742.arePbuffersAvailable();
        this.field2851 = this.field2742.method3275("GL_ARB_vertex_buffer_object");
        this.field2896 = this.field2742.method3275("GL_ARB_multisample");
        this.field2892 = this.field2742.method3275("GL_ARB_vertex_program");
        this.field2742.method3275("GL_ARB_fragment_program");
        this.field2875 = this.field2742.method3275("GL_ARB_vertex_shader");
        this.field2861 = this.field2742.method3275("GL_ARB_fragment_shader");
        this.field2801 = this.field2742.method3275("GL_EXT_texture3D");
        this.field2824 = this.field2742.method3275("GL_ARB_texture_rectangle");
        this.field2848 = this.field2742.method3275("GL_ARB_texture_cube_map");
        this.field2820 = this.field2742.method3275("GL_ARB_texture_float");
        this.field2818 = false;
        this.field2805 = this.field2742.method3275("GL_EXT_framebuffer_object");
        this.field2825 = this.field2742.method3275("GL_EXT_framebuffer_blit");
        this.field2810 = this.field2742.method3275("GL_EXT_framebuffer_multisample");
        this.field2802 = this.field2810 & this.field2825;
        this.field2882 = class616.field8695.startsWith("mac");
        OpenGL.glGetFloatv(2834, class583.field8240, 0);
        this.field2859 = class583.field8240[0];
        this.field2844 = class583.field8240[1];
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "(I)V")
    private final void method1296(int arg0) {
        if (~this.field2850 >= ~this.field2857 && this.field2847 <= this.field2822) {
            OpenGL.glScissor(this.field2850 + this.field2821, -this.field2822 + this.field2842 + this.field2697, -this.field2850 + this.field2857, -this.field2847 + this.field2822);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 > 89) {
            ++field2693;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIII)V")
    public final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2715;
        OpenGL.glLineWidth((float) arg5);
        this.method315(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "(I)V")
    private final void method1297(int arg0) {
        ++field2548;
        if (arg0 <= 84) {
            this.method1308();
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field2858, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "(III[I)V")
    public final void method337(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2633;
        float var5 = (float) arg2 * this.field2786.field2965 + (float) arg0 * this.field2786.field2988 + (float) arg1 * this.field2786.field2991 + this.field2786.field2978;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field2786.field2964 + (float) arg0 * this.field2786.field2969 + (float) arg1 * this.field2786.field2985 + this.field2786.field2982) * (float) this.field2873 / var5);
            arg3[0] = (int) ((float) var6 - this.field2887);
            int var7 = (int) (((float) arg2 * this.field2786.field2995 + (float) arg0 * this.field2786.field2994 + (float) arg1 * this.field2786.field2976 + this.field2786.field2992) * (float) this.field2832 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field2897);
        }
    }

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "()Z")
    public final boolean method254() {
        ++field2543;
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)V")
    public final void method1298(int arg0, byte arg1) {
        if (this.field2884 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field2884 = arg0;
        }
        if (arg1 != -124) {
            this.field2755 = false;
        }
        ++field2570;
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(B)V")
    public final void method1299(byte arg0) {
        if (this.field2788 != 2) {
            this.method1269(arg0 ^ 64);
            this.method1238(47, false);
            this.method1284(false, arg0 ^ -5979);
            this.method1318((byte) -125, false);
            this.method1263((byte) 104, false);
            this.method1327(115, -2);
            this.field2788 = 2;
        }
        if (arg0 != -89) {
            this.field2757 = 32;
        }
        ++field2603;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method317(Canvas arg0) {
        ++field2740;
        this.field2632 = null;
        this.field2675 = 0L;
        if (arg0 != null && this.field2743 != arg0) {
            if (this.field2595.containsKey(arg0)) {
                Long var2 = (Long) this.field2595.get(arg0);
                this.field2675 = var2;
                this.field2632 = arg0;
            }
        } else {
            this.field2675 = this.field2598;
            this.field2632 = this.field2743;
        }
        if (this.field2632 != null && this.field2675 != 0L) {
            this.field2742.setSurface(this.field2675);
            this.method1275(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rs", name = "DA", descriptor = "(IIII)V")
    public final void method288(int arg0, int arg1, int arg2, int arg3) {
        this.field2811 = arg0;
        this.field2830 = arg1;
        this.field2832 = arg3;
        ++field2648;
        this.field2873 = arg2;
        this.method1246(false);
        this.method1280((byte) -125);
        if (~this.field2867 == -4) {
            this.method1304(85);
        } else if (this.field2867 == 2) {
            this.method1297(96);
        }
    }

    @OriginalMember(owner = "client!rs", name = "da", descriptor = "(III[I)V")
    public final void method249(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2628;
        float var5 = (float) arg2 * this.field2786.field2965 + (float) arg0 * this.field2786.field2988 + (float) arg1 * this.field2786.field2991 + this.field2786.field2978;
        if (!(var5 < (float) this.field2819) && !((float) this.field2888 < var5)) {
            int var6 = (int) (((float) arg2 * this.field2786.field2964 + (float) arg0 * this.field2786.field2969 + (float) arg1 * this.field2786.field2985 + this.field2786.field2982) * (float) this.field2873 / var5);
            int var7 = (int) (((float) arg2 * this.field2786.field2995 + (float) arg0 * this.field2786.field2994 + (float) arg1 * this.field2786.field2976 + this.field2786.field2992) * (float) this.field2832 / var5);
            if (this.field2887 <= (float) var6 && this.field2838 >= (float) var6 && (float) var7 >= this.field2897 && this.field2828 >= (float) var7) {
                arg3[0] = (int) ((float) var6 - this.field2887);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field2897);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZLjs;)V")
    public final void method1300(boolean arg0, class170 arg1) {
        if (!arg0) {
            this.field2815 = -0.9717202F;
        }
        if (this.field2833 != arg1) {
            if (this.field2851) {
                OpenGL.glBindBufferARB(34962, arg1.method848(arg0));
            }
            this.field2833 = arg1;
        }
        ++field2720;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)V")
    public final void method1301(boolean arg0) {
        ++field2682;
    }

    @OriginalMember(owner = "client!rs", name = "pa", descriptor = "()V")
    public final void method305() {
        ++field2578;
        this.field2876 = false;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([BBZII)Lsda;")
    public final class749 method1302(byte[] arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        ++field2731;
        if (!this.field2851 || arg2 && !this.field2902) {
            if (arg1 != -14) {
                this.field2810 = false;
            }
            return new class510(this, arg3, arg0, arg4);
        } else {
            return new class183(this, arg3, arg0, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "(I)V")
    private final void method1303(int arg0) {
        ++field2681;
        if (arg0 != 1) {
            this.method1308();
        }
        if (this.field2807 && !this.field2800) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!rs", name = "KA", descriptor = "(IIII)V")
    public final void method240(int arg0, int arg1, int arg2, int arg3) {
        ++field2733;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg2 < ~this.field2726) {
            arg2 = this.field2726;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg3 < ~this.field2697) {
            arg3 = this.field2697;
        }
        this.field2822 = arg3;
        this.field2857 = arg2;
        this.field2847 = arg1;
        this.field2850 = arg0;
        OpenGL.glEnable(3089);
        this.method1280((byte) -123);
        this.method1296(104);
    }

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "(I)V")
    private final void method1304(int arg0) {
        ++field2677;
        float var2 = (float) (-this.field2811) * this.field2885 / (float) this.field2873;
        float var3 = (float) (-this.field2830) * this.field2885 / (float) this.field2832;
        if (arg0 < 81) {
            this.field2763 = null;
        }
        float var4 = (float) (-this.field2811 + this.field2726) * this.field2885 / (float) this.field2873;
        float var5 = (float) (-this.field2830 + this.field2697) * this.field2885 / (float) this.field2832;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field2819, (double) this.field2888);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "()V")
    public final void method427() {
        ++field2714;
    }

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "(Z)V")
    public final void method326(boolean arg0) {
        this.field2826 = arg0;
        ++field2637;
        this.method1283(false);
    }

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "(IIIII)V")
    public final void method292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2674;
        this.method1279(false);
        this.method1320(arg4, false);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(III)V")
    public final synchronized void method1305(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field2786 = null;
        }
        ++field2735;
        class332 var4 = new class332(arg0);
        var4.field1039 = (long) arg2;
        this.field2776.method3472(115, var4);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lnba;I)V")
    public final void method1306(class487 arg0, int arg1) {
        if (arg1 >= 31) {
            ++field2717;
            class487 var3 = this.field2804[this.field2884];
            if (arg0 != var3) {
                if (arg0 == null) {
                    OpenGL.glDisable(var3.field7045);
                } else {
                    if (var3 != null) {
                        if (arg0.field7045 != var3.field7045) {
                            OpenGL.glDisable(var3.field7045);
                            OpenGL.glEnable(arg0.field7045);
                        }
                    } else {
                        OpenGL.glEnable(arg0.field7045);
                    }
                    OpenGL.glBindTexture(arg0.field7045, arg0.method2956((byte) 127));
                }
                this.field2804[this.field2884] = arg0;
            }
            this.field2788 &= -2;
        }
    }

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "(I)V")
    private final void method1307(int arg0) {
        this.field2804 = new class487[this.field2793];
        ++field2696;
        this.field2823 = new class692(this, 3553, 6408, 1, 1);
        new class692(this, 3553, 6408, 1, 1);
        new class692(this, 3553, 6408, 1, arg0);
        this.field2836 = new class129(this);
        this.field2843 = new class129(this);
        this.field2798 = new class129(this);
        this.field2812 = new class129(this);
        this.field2891 = new class129(this);
        this.field2845 = new class129(this);
        this.field2889 = new class129(this);
        this.field2865 = new class129(this);
        this.field2880 = new class129(this);
        this.field2849 = new class129(this);
        if (this.field2805) {
            this.field2799 = new class98(this);
            new class98(this);
        }
    }

    @OriginalMember(owner = "client!rs", name = "Y", descriptor = "()[I")
    public final int[] method217() {
        ++field2670;
        return new int[] { this.field2811, this.field2830, this.field2873, this.field2832 };
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "()Z")
    public final boolean method268() {
        ++field2642;
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "ra", descriptor = "(IIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
        this.field2841 = arg3;
        this.field2871 = arg1;
        this.field2853 = arg2;
        this.field2876 = true;
        this.field2877 = arg0;
        ++field2586;
    }

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "()Lqm;")
    public final class429 method1308() {
        ++field2555;
        int var1 = -1;
        if (this.field2898.indexOf("nvidia") == -1) {
            if (this.field2898.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (this.field2898.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class429(var1, "OpenGL", this.field2840, this.field2895, 0L);
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "()Z")
    public final boolean method379() {
        ++field2659;
        return false;
    }

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "(I)V")
    public final void method1309(int arg0) {
        ++field2655;
        if (arg0 != 25508) {
            this.field2861 = false;
        }
        if (this.field2788 != 16) {
            this.method1342(arg0 + -25506);
            this.method1238(14, true);
            this.method1318((byte) -120, true);
            this.method1263((byte) 104, true);
            this.method1320(1, false);
            this.field2788 = 16;
        }
    }

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "(I)V")
    private final void method1310(int arg0) {
        class583.field8240[2] = this.field2835 * this.field2795;
        class583.field8240[0] = this.field2814 * this.field2795;
        ++field2604;
        if (arg0 != 7135) {
            this.field2768 = null;
        }
        class583.field8240[1] = this.field2803 * this.field2795;
        class583.field8240[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class583.field8240, 0);
    }

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "(I)V")
    public final void method1311(int arg0) {
        int var2 = -1 / ((-5 - arg0) / 59);
        ++field2634;
        if (~this.field2867 != -1) {
            this.field2867 = 0;
            this.field2788 &= -32;
        }
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(IIIIII)Lvm;")
    public final class72 method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2688;
        return !this.field2848 ? null : new class577(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBZ)V")
    public final void method1312(int arg0, byte arg1, boolean arg2) {
        int var4 = 14 / ((51 - arg1) / 58);
        ++field2599;
        this.method1337(-120, true, arg2, arg0);
    }

    @OriginalMember(owner = "client!rs", name = "za", descriptor = "(IIIII)V")
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2736;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (this.field2850 <= arg0 + arg2 && arg0 - arg2 <= this.field2857 && this.field2847 <= arg1 + arg2 && this.field2822 >= arg1 - arg2) {
            this.method1279(false);
            this.method1320(arg4, false);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field2859) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field2844 >= (float) var8) {
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
                    if (var9 > 512) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class602.method3455(var9, false);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class340.field4991[var11] * (float) arg2 + var6, class340.field4980[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "(II)I")
    public final int method1313(int arg0, int arg1) {
        ++field2687;
        if (arg0 <= 124) {
            this.method351(124, -8);
        }
        if (arg1 != 6406 && ~arg1 != -6410) {
            if (~arg1 != -6411 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (arg1 != 6408 && ~arg1 != -34848) {
                    if (arg1 != 34843) {
                        if (arg1 == 34842) {
                            return 8;
                        } else if (~arg1 == -6403) {
                            return 3;
                        } else if (arg1 == 6401) {
                            return 1;
                        } else {
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

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "(II)V")
    public final synchronized void method1314(int arg0, int arg1) {
        if (arg1 != 4994) {
            this.field2857 = 50;
        }
        ++field2608;
        class65 var3 = new class65();
        var3.field1039 = (long) arg0;
        this.field2779.method3472(105, var3);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZIILsda;)V")
    public final void method1315(int arg0, boolean arg1, int arg2, int arg3, class749 arg4) {
        ++field2699;
        int var6 = arg4.method1408(-92);
        int var7 = arg0 * this.method1254(-1, var6);
        this.method1249(arg4, (byte) 43);
        OpenGL.glDrawElements(arg2, arg3, var6, (long) var7 + arg4.method1405(arg1));
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BF)V")
    public final void method1316(byte arg0, float arg1) {
        if (this.field2885 != arg1) {
            this.field2885 = arg1;
            if (~this.field2867 == -4) {
                this.method1304(84);
            }
        }
        ++field2556;
        if (arg0 >= -126) {
            this.method298(78, 2, 126, 67);
        }
    }

    @OriginalMember(owner = "client!rs", name = "JA", descriptor = "(IIIIII)I")
    public final int method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2709;
        int var7 = 0;
        float var8 = (float) arg2 * this.field2786.field2965 + (float) arg0 * this.field2786.field2988 + (float) arg1 * this.field2786.field2991 + this.field2786.field2978;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field2786.field2965 + (float) arg3 * this.field2786.field2988 + (float) arg4 * this.field2786.field2991 + this.field2786.field2978;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field2819 > var8 && var9 < (float) this.field2819) {
            var7 |= 16;
        } else if ((float) this.field2888 < var8 && (float) this.field2888 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field2786.field2964 + (float) arg0 * this.field2786.field2969 + (float) arg1 * this.field2786.field2985 + this.field2786.field2982) * (float) this.field2873 / var8);
        int var11 = (int) (((float) arg5 * this.field2786.field2964 + (float) arg3 * this.field2786.field2969 + (float) arg4 * this.field2786.field2985 + this.field2786.field2982) * (float) this.field2873 / var9);
        if ((float) var10 < this.field2887 && (float) var11 < this.field2887) {
            var7 |= 1;
        } else if ((float) var10 > this.field2838 && this.field2838 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field2786.field2995 + (float) arg0 * this.field2786.field2994 + (float) arg1 * this.field2786.field2976 + this.field2786.field2992) * (float) this.field2832 / var8);
        int var13 = (int) (((float) arg5 * this.field2786.field2995 + (float) arg3 * this.field2786.field2994 + (float) arg4 * this.field2786.field2976 + this.field2786.field2992) * (float) this.field2832 / var9);
        if ((float) var12 < this.field2897 && (float) var13 < this.field2897) {
            var7 |= 4;
        } else if ((float) var12 > this.field2828 && this.field2828 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIB)V")
    public final void method1317(int arg0, int arg1, byte arg2) {
        ++field2558;
        this.field2842 = arg1;
        this.field2821 = arg0;
        if (arg2 == 39) {
            this.method1341((byte) 60);
            this.method1296(98);
        }
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)V")
    public final void method295(int arg0) {
        ++field2716;
    }

    @OriginalMember(owner = "client!rs", name = "la", descriptor = "()V")
    public final void method374() {
        ++field2724;
        this.field2847 = 0;
        this.field2850 = 0;
        this.field2857 = this.field2726;
        this.field2822 = this.field2697;
        OpenGL.glDisable(3089);
        this.method1280((byte) -113);
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(II)I")
    public final int method351(int arg0, int arg1) {
        ++field2554;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(BZ)V")
    public final void method1318(byte arg0, boolean arg1) {
        ++field2722;
        if (!arg1 == this.field2789) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field2789 = arg1;
            this.field2788 &= -32;
        }
        if (arg0 >= -119) {
            this.field2801 = false;
        }
    }

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "()I")
    public final int method294() {
        ++field2546;
        return this.field2819;
    }

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "()Z")
    public final boolean method320() {
        ++field2579;
        return false;
    }

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "(I)V")
    private final void method1319(int arg0) {
        int var2 = 59 / ((-45 - arg0) / 56);
        ++field2730;
        if (~this.field2867 != -3) {
            this.field2867 = 2;
            this.method1297(111);
            this.method1321(0);
            this.field2788 &= -8;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "()V")
    public final void method248() {
        for (class65 var1 = this.field2760.method3463((byte) -50); var1 != null; var1 = this.field2760.method3469((byte) 107)) {
            ((class719) var1).method3965((byte) -112);
        }
        ++field2602;
        if (this.field2745 != null) {
            this.field2745.method20(1);
        }
        if (this.field2742 != null) {
            this.method1266(-31839);
            Enumeration var2 = this.field2595.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field2595.get(var3);
                this.field2742.releaseSurface(var3, var4);
            }
            this.field2742.release();
            this.field2742 = null;
        }
        if (this.field2755) {
            class342.method2203(true, false, 5438);
            this.field2755 = false;
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(IZ)V")
    public final void method1320(int arg0, boolean arg1) {
        if (arg1) {
            this.method1235((byte) 66);
        }
        if (~this.field2783 != ~arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    var3 = 2;
                    var4 = true;
                    var5 = false;
                } else if (arg0 != 128) {
                    var3 = 0;
                    var5 = false;
                    var4 = true;
                } else {
                    var5 = true;
                    var3 = 3;
                    var4 = true;
                }
            } else {
                var5 = true;
                var3 = 1;
                var4 = true;
            }
            if (this.field2787 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field2787 = var4;
            }
            if (var5 == !this.field2781) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field2781 = var5;
            }
            if (~this.field2784 != ~var3) {
                if (var3 != 1) {
                    if (var3 != 2) {
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
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field2784 = var3;
            }
            this.field2783 = arg0;
            this.field2788 &= -29;
        }
        ++field2581;
    }

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "(I)V")
    private final void method1321(int arg0) {
        OpenGL.glLoadIdentity();
        ++field2705;
        OpenGL.glMultMatrixf(this.field2790.method1368(arg0 ^ 16383), arg0);
        if (this.field2860) {
            this.field2744.field225.method3449(arg0 + -65);
        }
        this.method1325(16385);
        this.method1248(false);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8) {
        ++field2712;
        class229 var10 = (class229) arg6;
        class89 var11 = var10.field3704;
        this.method1299((byte) -89);
        this.method1306(var10.field3704, 102);
        this.method1320(arg5, false);
        this.method1256(8448, -4, 7681);
        this.method1239(0, 34167, 768, 768);
        float var12 = var11.field1360 / (float) var11.field1356;
        float var13 = var11.field1359 / (float) var11.field1357;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method1239(0, 5890, 768, 768);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lqr;B)V")
    public final void method1322(class622 arg0, byte arg1) {
        ++field2610;
        if (arg1 == -86) {
            if (this.field2825) {
                this.method1251((byte) 123, arg0);
                this.method1286((byte) -91, arg0);
            } else if (~this.field2765 <= -4) {
                throw new RuntimeException();
            } else {
                if (~this.field2765 <= -1) {
                    this.field2769[this.field2765].method799(-3364);
                }
                this.field2764 = this.field2761 = this.field2769[++this.field2765] = arg0;
                this.field2764.method800((byte) 33);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "aa", descriptor = "(IIIIII)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2640;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1279(false);
        this.method1320(arg5, false);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2896) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field2896) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IFF)V")
    public final void method1323(int arg0, float arg1, float arg2) {
        this.field2852 = arg1;
        if (arg0 != -8) {
            this.method315(116, -52, -93, -115, 11, 122);
        }
        this.field2834 = arg2;
        ++field2566;
        this.method1339(arg0 ^ -16);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2706;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            this.method1279(false);
            this.method1320(arg5, false);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            int var13 = arg8 % (arg7 - -arg6);
            float var14 = var10 * var12;
            float var15 = var11 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var15;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~arg6 <= ~var13) {
                var21 = (float) (-var13 + arg6) * var15;
                var20 = (float) (arg6 - var13) * var14;
            } else {
                var18 = (float) (arg6 + arg7 + -var13) * var14;
                var19 = (float) (arg6 + arg7 + -var13) * var15;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var15;
            while (true) {
                if (arg2 > arg0) {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if ((float) arg3 + 0.35F > var23) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var23 += var21 + var25;
                OpenGL.glEnd();
                var22 += var20 + var24;
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(IIIIII)V")
    public final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2647;
        this.method1279(false);
        this.method1320(arg5, false);
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

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "(IIIIIII)I")
    public final int method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2574;
        float var8 = (float) arg2 * this.field2786.field2965 + (float) arg0 * this.field2786.field2988 + (float) arg1 * this.field2786.field2991 + this.field2786.field2978;
        float var9 = (float) arg5 * this.field2786.field2965 + (float) arg3 * this.field2786.field2988 + (float) arg4 * this.field2786.field2991 + this.field2786.field2978;
        int var10 = 0;
        if ((float) this.field2819 > var8 && var9 < (float) this.field2819) {
            var10 |= 16;
        } else if ((float) this.field2888 < var8 && var9 > (float) this.field2888) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field2786.field2964 + (float) arg0 * this.field2786.field2969 + (float) arg1 * this.field2786.field2985 + this.field2786.field2982) * (float) this.field2873 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field2786.field2964 + (float) arg3 * this.field2786.field2969 + (float) arg4 * this.field2786.field2985 + this.field2786.field2982) * (float) this.field2873 / (float) arg6);
        if (this.field2887 > (float) var11 && (float) var12 < this.field2887) {
            var10 |= 1;
        } else if (this.field2838 < (float) var11 && this.field2838 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field2786.field2995 + (float) arg0 * this.field2786.field2994 + (float) arg1 * this.field2786.field2976 + this.field2786.field2992) * (float) this.field2832 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field2786.field2995 + (float) arg3 * this.field2786.field2994 + (float) arg4 * this.field2786.field2976 + this.field2786.field2992) * (float) this.field2832 / (float) arg6);
        if (this.field2897 > (float) var13 && (float) var14 < this.field2897) {
            var10 |= 4;
        } else if ((float) var13 > this.field2828 && (float) var14 > this.field2828) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "(B)V")
    public final void method1324(byte arg0) {
        ++field2734;
        if (arg0 != 12) {
            this.method1252(95, 118, (byte) -89, -77);
        }
        if (this.field2788 != 4) {
            this.method1269(arg0 ^ -21);
            this.method1238(47, false);
            this.method1284(false, 5890);
            this.method1318((byte) -126, false);
            this.method1263((byte) 104, false);
            this.method1327(-125, -2);
            this.method1320(1, false);
            this.field2788 = 4;
        }
    }

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "()I")
    public final int method300() {
        ++field2664;
        int var1 = this.field2906;
        this.field2906 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class339 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2636;
        return new class680(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "()Z")
    public final boolean method400() {
        ++field2557;
        return this.field2744.method125(true, 3);
    }

    @OriginalMember(owner = "client!rs", name = "HA", descriptor = "(IIII[I)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field2576;
        float var6 = (float) arg2 * this.field2786.field2965 + (float) arg0 * this.field2786.field2988 + (float) arg1 * this.field2786.field2991 + this.field2786.field2978;
        if (!((float) this.field2819 > var6) && !(var6 > (float) this.field2888)) {
            int var7 = (int) (((float) arg2 * this.field2786.field2964 + (float) arg0 * this.field2786.field2969 + (float) arg1 * this.field2786.field2985 + this.field2786.field2982) * (float) this.field2873 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field2786.field2995 + (float) arg0 * this.field2786.field2994 + (float) arg1 * this.field2786.field2976 + this.field2786.field2992) * (float) this.field2832 / (float) arg3);
            if ((float) var7 >= this.field2887 && (float) var7 <= this.field2838 && this.field2897 <= (float) var8 && (float) var8 <= this.field2828) {
                arg4[0] = (int) ((float) var7 - this.field2887);
                arg4[1] = (int) ((float) var8 - this.field2897);
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "(I)V")
    public final void method1325(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field2868, 0);
        ++field2723;
        OpenGL.glLightfv(arg0, 4611, this.field2874, 0);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ltc;)V")
    public final void method244(class73 arg0) {
        ++field2690;
        this.field2786.method673(arg0);
        this.field2790.method673(this.field2786);
        this.field2790.method1371(true);
        this.field2791.method1372(true, this.field2790);
        if (~this.field2867 != -2) {
            this.method1321(0);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(ILqr;)V")
    public final void method1326(int arg0, class622 arg1) {
        ++field2553;
        if (this.field2767 >= 0 && this.field2768[this.field2767] == arg1) {
            this.field2768[this.field2767--] = null;
            arg1.method797(83);
            if (this.field2767 < 0) {
                this.field2764 = null;
            } else {
                this.field2764 = this.field2768[this.field2767];
                this.field2764.method811(30988);
            }
            if (arg0 < 40) {
                this.method395(-79);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "(II)V")
    public final void method1327(int arg0, int arg1) {
        ++field2631;
        int var3 = 65 % ((arg0 - 16) / 51);
        this.method1312(arg1, (byte) 121, true);
    }

    @OriginalMember(owner = "client!rs", name = "GA", descriptor = "(I)V")
    public final void method1328(int arg0) {
        ++field2645;
        this.method1320(0, false);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lak;Lak;Lak;Lak;I)V")
    public final void method1329(class497 arg0, class497 arg1, class497 arg2, class497 arg3, int arg4) {
        ++field2547;
        if (arg3 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1300(true, arg3.field7210);
            OpenGL.glVertexPointer(arg3.field7208, arg3.field7204, this.field2833.method849(8479), this.field2833.method850((byte) 98) - -((long) arg3.field7207));
            OpenGL.glEnableClientState(32884);
        }
        int var6 = 116 / ((-26 - arg4) / 36);
        if (arg0 != null) {
            this.method1300(true, arg0.field7210);
            OpenGL.glNormalPointer(arg0.field7204, this.field2833.method849(8479), this.field2833.method850((byte) 98) - -((long) arg0.field7207));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method1300(true, arg1.field7210);
            OpenGL.glColorPointer(arg1.field7208, arg1.field7204, this.field2833.method849(8479), this.field2833.method850((byte) 98) - -((long) arg1.field7207));
            OpenGL.glEnableClientState(32886);
        }
        if (arg2 != null) {
            this.method1300(true, arg2.field7210);
            OpenGL.glTexCoordPointer(arg2.field7208, arg2.field7204, this.field2833.method849(8479), this.field2833.method850((byte) 98) - -((long) arg2.field7207));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!rs", name = "T", descriptor = "(IIII)V")
    public final void method298(int arg0, int arg1, int arg2, int arg3) {
        ++field2588;
        if (~this.field2822 < ~arg3) {
            this.field2822 = arg3;
        }
        if (arg1 > this.field2847) {
            this.field2847 = arg1;
        }
        if (~arg2 > ~this.field2857) {
            this.field2857 = arg2;
        }
        if (this.field2850 < arg0) {
            this.field2850 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method1280((byte) -128);
        this.method1296(127);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(FFFFI)V")
    public final void method1330(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class583.field8240[2] = arg0;
        class583.field8240[1] = arg2;
        class583.field8240[3] = arg3;
        if (arg4 != -29089) {
            this.method1323(-38, 1.1834975F, -1.4225632F);
        }
        ++field2600;
        class583.field8240[0] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class583.field8240, 0);
    }

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "(ILaa;II)V")
    public final void method287(int arg0, class570 arg1, int arg2, int arg3) {
        ++field2725;
        class229 var5 = (class229) arg1;
        class89 var6 = var5.field3704;
        this.method1299((byte) -89);
        this.method1306(var5.field3704, 88);
        this.method1320(1, false);
        this.method1256(8448, -4, 7681);
        this.method1239(0, 34167, 768, 768);
        float var7 = var6.field1360 / (float) var6.field1356;
        float var8 = var6.field1359 / (float) var6.field1357;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2850) * var7, (float) (this.field2847 - arg3) * var8);
        OpenGL.glVertex2i(this.field2850, this.field2847);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2850) * var7, (float) (-arg3 + this.field2822) * var8);
        OpenGL.glVertex2i(this.field2850, this.field2822);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2857) * var7, (float) (this.field2822 - arg3) * var8);
        OpenGL.glVertex2i(this.field2857, this.field2822);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2857) * var7, (float) (-arg3 + this.field2847) * var8);
        OpenGL.glVertex2i(this.field2857, this.field2847);
        OpenGL.glEnd();
        this.method1239(0, 5890, 768, 768);
    }

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "()I")
    public final int method332() {
        ++field2629;
        return this.field2774 + this.field2773 + this.field2771;
    }

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "(B)V")
    public final void method1331(byte arg0) {
        if (arg0 < -54) {
            ++field2750;
            if (~this.field2788 != -9) {
                this.method1319(21);
                this.method1238(41, true);
                this.method1318((byte) -128, true);
                this.method1263((byte) 104, true);
                this.method1320(1, false);
                this.field2788 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lgu;Z)Lit;")
    public final class34 method310(class726 arg0, boolean arg1) {
        ++field2680;
        int[] var3 = new int[arg0.field10186 * arg0.field10184];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field10185 == null) {
            for (int var6 = 0; var6 < arg0.field10186; ++var6) {
                for (int var7 = 0; arg0.field10184 > var7; ++var7) {
                    int var8 = arg0.field10183[255 & arg0.field10181[var4++]];
                    var3[var5++] = var8 == 0 ? 0 : class112.method903(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field10186 < ~var9; ++var9) {
                for (int var11 = 0; ~var11 > ~arg0.field10184; ++var11) {
                    var3[var5++] = class112.method903(arg0.field10183[class636.method3603(255, arg0.field10181[var4])], arg0.field10185[var4] << 24);
                    ++var4;
                }
            }
        }
        class34 var10 = this.method3185(0, var3, false, arg0.field10186, arg0.field10184, arg0.field10184);
        var10.method185(arg0.field10179, arg0.field10182, arg0.field10187, arg0.field10180);
        return var10;
    }

    @OriginalMember(owner = "client!rs", name = "U", descriptor = "(IIIII)V")
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2583;
        this.method1279(false);
        this.method1320(arg4, false);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "()Ltc;")
    public final class73 method236() {
        ++field2691;
        return this.field2786;
    }

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "(I)Lio;")
    public final class708 method1332(int arg0) {
        ++field2544;
        if (arg0 != 14414) {
            this.field2835 = -2.1937573F;
        }
        return this.field2839 == null ? null : this.field2839.method1084((byte) 28);
    }

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "(B)V")
    private final void method1333(byte arg0) {
        this.field2858[14] = this.field2831;
        ++field2721;
        this.field2858[10] = this.field2815;
        int var2 = -67 % ((arg0 - -14) / 52);
        this.field2862 = (float) this.field2888;
        this.field2813 = (this.field2858[14] - (float) this.field2888) / this.field2858[10];
    }

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "(II)V")
    public final void method1334(int arg0, int arg1) {
        ++field2728;
        if (arg0 == 0) {
            if (~arg1 != -2) {
                if (arg1 == 0) {
                    this.method1256(8448, arg0 + -4, 8448);
                } else if (~arg1 == -3) {
                    this.method1256(7681, -4, 34165);
                } else {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.method1256(34023, -4, 34023);
                            return;
                        }
                    } else {
                        this.method1256(8448, -4, 260);
                    }
                }
            } else {
                this.method1256(7681, arg0 ^ -4, 7681);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "(III)V")
    public final void method253(int arg0, int arg1, int arg2) {
        ++field2585;
        if (this.field2883 != arg0 || ~this.field2893 != ~arg1 || this.field2794 != arg2) {
            this.field2794 = arg2;
            this.field2893 = arg1;
            this.field2883 = arg0;
            this.method1339(8);
            this.method1253((byte) 74);
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(ILqr;)V")
    public final void method1335(int arg0, class622 arg1) {
        ++field2577;
        if (this.field2762 >= 0 && this.field2770[this.field2762] == arg1) {
            this.field2770[this.field2762--] = null;
            if (arg0 == 6914) {
                arg1.method808(false);
                if (~this.field2762 > -1) {
                    this.field2761 = null;
                } else {
                    this.field2761 = this.field2770[this.field2762];
                    this.field2761.method801(arg0 + 2335);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "()Z")
    public final boolean method381() {
        ++field2692;
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "([I)V")
    public final void method331(int[] arg0) {
        arg0[2] = this.field2857;
        arg0[1] = this.field2847;
        ++field2708;
        arg0[3] = this.field2822;
        arg0[0] = this.field2850;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILjaclib/memory/Buffer;Z)Ljs;")
    public final class170 method1336(int arg0, int arg1, int arg2, Buffer arg3, boolean arg4) {
        ++field2685;
        int var6 = -21 % ((61 - arg2) / 34);
        return (class170) (!this.field2851 || arg4 && !this.field2902 ? new class161(this, arg0, arg3) : new class103(this, arg0, arg3, arg1, arg4));
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZZI)V")
    public final void method1337(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field2900 != arg3 || this.field2876 != this.field2860) {
            class692 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field2876 ? 3 : 0;
            if (~arg3 > -1) {
                this.method1289(-1895);
            } else {
                var5 = this.field2748.method3948((byte) 25, arg3);
                class569 var10 = super.field7764.method1774(63, arg3);
                if (~var10.field8058 == -1 && ~var10.field8066 == -1) {
                    this.method1289(-1895);
                } else {
                    int var11 = var10.field8067 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method1270((float) (this.field2757 % var12 * var10.field8066) / (float) var12, (float) (this.field2757 % var12 * var10.field8058) / (float) var12, 0.0F, 119);
                }
                if (!this.field2876) {
                    var7 = var10.field8065;
                    var8 = var10.field8080;
                    var9 = var10.field8079;
                }
                var6 = var10.field8074;
            }
            this.field2744.method126(var7, var8, arg1, arg2, var9, (byte) 67);
            if (!this.field2744.method127(var5, var6, false)) {
                this.method1306(var5, 103);
                this.method1334(0, var6);
            }
            this.field2860 = this.field2876;
            this.field2900 = arg3;
        }
        ++field2630;
        this.field2788 &= -8;
        if (arg0 > -106) {
            this.method1263((byte) -6, true);
        }
    }

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "()V")
    public final void method1338() {
        OpenGL.glFinish();
        ++field2613;
    }

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "(I)V")
    private final void method1339(int arg0) {
        this.field2816 = (float) (this.field2888 - this.field2794) + -this.field2834;
        ++field2565;
        this.field2894 = this.field2816 - (float) this.field2893 * this.field2852;
        if ((float) this.field2819 > this.field2894) {
            this.field2894 = (float) this.field2819;
        }
        if (arg0 != 8) {
            this.method1334(56, -112);
        }
        OpenGL.glFogf(2915, this.field2894);
        OpenGL.glFogf(2916, this.field2816);
        class583.field8240[1] = (float) class636.method3603(65280, this.field2883) / 65280.0F;
        class583.field8240[2] = (float) class636.method3603(this.field2883, 255) / 255.0F;
        class583.field8240[0] = (float) class636.method3603(16711680, this.field2883) / 1.671168E7F;
        OpenGL.glFogfv(2918, class583.field8240, 0);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lpea;)V")
    public final void method1340(class456 arg0) {
        ++field2639;
    }

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "(B)V")
    private final void method1341(byte arg0) {
        if (arg0 != 60) {
            this.method1242((class72) null, (class72) null, 0.3011524F, (class72) null);
        }
        ++field2689;
        OpenGL.glViewport(this.field2821, this.field2842, this.field2726, this.field2697);
    }

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "(I)V")
    private final void method1342(int arg0) {
        if (~this.field2867 != -4) {
            this.field2867 = 3;
            this.method1304(123);
            this.method1321(0);
            this.field2788 &= -8;
        }
        if (arg0 != 2) {
            this.field2791 = null;
        }
        ++field2587;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        ++field2622;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lvm;)V")
    public final void method238(class72 arg0) {
        ++field2702;
        this.field2839 = (class135) arg0;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(IB)V")
    public final synchronized void method1343(int arg0, byte arg1) {
        ++field2701;
        if (arg1 > -49) {
            this.method295(18);
        }
        class332 var3 = new class332(arg0);
        this.field2777.method3472(86, var3);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lhu;Lwm;)Lpea;")
    public final class456 method1344(class224 arg0, class28 arg1) {
        ++field2572;
        return null;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(IIIIII)V")
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2667;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method1279(false);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method1320(arg5, false);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2896) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field2896) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "()I")
    public final int method356() {
        ++field2649;
        return 4;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "()Z")
    public final boolean method370() {
        ++field2580;
        return true;
    }
}
