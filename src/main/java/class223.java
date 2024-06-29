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

@OriginalClass("client!kea")
public abstract class class223 extends class650 {

    @OriginalMember(owner = "client!kea", name = "tc", descriptor = "Lws;")
    private class333 field2692 = new class333();

    @OriginalMember(owner = "client!kea", name = "Sd", descriptor = "Z")
    public boolean field2769 = true;

    @OriginalMember(owner = "client!kea", name = "Ud", descriptor = "Lof;")
    public class581 field2771 = new class581();

    @OriginalMember(owner = "client!kea", name = "Zd", descriptor = "Lof;")
    public class581 field2776 = new class581();

    @OriginalMember(owner = "client!kea", name = "ae", descriptor = "Lof;")
    public class581 field2777 = new class581();

    @OriginalMember(owner = "client!kea", name = "be", descriptor = "Lof;")
    public class581 field2778 = new class581();

    @OriginalMember(owner = "client!kea", name = "ce", descriptor = "Lof;")
    private class581 field2779 = new class581();

    @OriginalMember(owner = "client!kea", name = "de", descriptor = "Lof;")
    private class581 field2780 = new class581();

    @OriginalMember(owner = "client!kea", name = "se", descriptor = "Z")
    public boolean field2795 = true;

    @OriginalMember(owner = "client!kea", name = "pe", descriptor = "I")
    private int field2792 = 1;

    @OriginalMember(owner = "client!kea", name = "te", descriptor = "F")
    public float field2796 = 1.0F;

    @OriginalMember(owner = "client!kea", name = "De", descriptor = "I")
    public int field2806 = 50;

    @OriginalMember(owner = "client!kea", name = "le", descriptor = "[Lho;")
    private class139[] field2788 = new class139[10];

    @OriginalMember(owner = "client!kea", name = "Me", descriptor = "F")
    public float field2815 = 1.0F;

    @OriginalMember(owner = "client!kea", name = "Ne", descriptor = "[F")
    public float[] field2816 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kea", name = "Be", descriptor = "[F")
    private float[] field2804 = new float[16];

    @OriginalMember(owner = "client!kea", name = "Se", descriptor = "F")
    public float field2821 = 3584.0F;

    @OriginalMember(owner = "client!kea", name = "Ue", descriptor = "Ldga;")
    public class195 field2823 = class168.field1974;

    @OriginalMember(owner = "client!kea", name = "Pe", descriptor = "[F")
    private float[] field2818 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kea", name = "me", descriptor = "Z")
    public boolean field2789 = true;

    @OriginalMember(owner = "client!kea", name = "Fe", descriptor = "I")
    public int field2808 = -1;

    @OriginalMember(owner = "client!kea", name = "Ie", descriptor = "I")
    private int field2811 = -1;

    @OriginalMember(owner = "client!kea", name = "ne", descriptor = "F")
    public float field2790 = 1.0F;

    @OriginalMember(owner = "client!kea", name = "Ve", descriptor = "F")
    public float field2824 = -1.0F;

    @OriginalMember(owner = "client!kea", name = "lf", descriptor = "[F")
    private float[] field2839 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kea", name = "ke", descriptor = "F")
    private float field2787 = 3000.0F;

    @OriginalMember(owner = "client!kea", name = "Oe", descriptor = "Z")
    private boolean field2817 = false;

    @OriginalMember(owner = "client!kea", name = "nf", descriptor = "I")
    public int field2841 = 0;

    @OriginalMember(owner = "client!kea", name = "of", descriptor = "I")
    public int field2842 = 128;

    @OriginalMember(owner = "client!kea", name = "cf", descriptor = "Z")
    public boolean field2831 = true;

    @OriginalMember(owner = "client!kea", name = "Ae", descriptor = "[F")
    private float[] field2803 = new float[16];

    @OriginalMember(owner = "client!kea", name = "Ke", descriptor = "Z")
    private boolean field2813 = false;

    @OriginalMember(owner = "client!kea", name = "qf", descriptor = "Z")
    private boolean field2844 = false;

    @OriginalMember(owner = "client!kea", name = "We", descriptor = "I")
    private int field2825 = 0;

    @OriginalMember(owner = "client!kea", name = "jf", descriptor = "I")
    public int field2837 = -1;

    @OriginalMember(owner = "client!kea", name = "yf", descriptor = "Luv;")
    public class338 field2852 = class188.field2227;

    @OriginalMember(owner = "client!kea", name = "ue", descriptor = "I")
    private int field2797 = 16777215;

    @OriginalMember(owner = "client!kea", name = "wf", descriptor = "[F")
    public float[] field2850 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!kea", name = "Qe", descriptor = "Z")
    private boolean field2819 = false;

    @OriginalMember(owner = "client!kea", name = "rf", descriptor = "Z")
    public boolean field2845 = false;

    @OriginalMember(owner = "client!kea", name = "ee", descriptor = "I")
    private int field2781 = -1;

    @OriginalMember(owner = "client!kea", name = "pf", descriptor = "I")
    public int field2843 = 0;

    @OriginalMember(owner = "client!kea", name = "Xe", descriptor = "Z")
    public boolean field2826 = false;

    @OriginalMember(owner = "client!kea", name = "Ge", descriptor = "Z")
    private boolean field2809 = false;

    @OriginalMember(owner = "client!kea", name = "Bf", descriptor = "I")
    public int field2855 = -1;

    @OriginalMember(owner = "client!kea", name = "uf", descriptor = "I")
    public int field2848 = 0;

    @OriginalMember(owner = "client!kea", name = "Df", descriptor = "F")
    public float field2857 = 1.0F;

    @OriginalMember(owner = "client!kea", name = "xe", descriptor = "Z")
    public boolean field2800 = true;

    @OriginalMember(owner = "client!kea", name = "Gf", descriptor = "I")
    public int field2860 = 8;

    @OriginalMember(owner = "client!kea", name = "re", descriptor = "[F")
    private float[] field2794 = new float[16];

    @OriginalMember(owner = "client!kea", name = "af", descriptor = "I")
    public int field2829 = 0;

    @OriginalMember(owner = "client!kea", name = "Nf", descriptor = "I")
    public int field2867 = 512;

    @OriginalMember(owner = "client!kea", name = "Pf", descriptor = "I")
    public int field2869 = 0;

    @OriginalMember(owner = "client!kea", name = "If", descriptor = "I")
    private int field2862 = 0;

    @OriginalMember(owner = "client!kea", name = "ve", descriptor = "Z")
    public boolean field2798 = false;

    @OriginalMember(owner = "client!kea", name = "Wf", descriptor = "I")
    public int field2876 = 0;

    @OriginalMember(owner = "client!kea", name = "Mf", descriptor = "F")
    private float field2866 = 1.0F;

    @OriginalMember(owner = "client!kea", name = "Ef", descriptor = "I")
    public int field2858 = 512;

    @OriginalMember(owner = "client!kea", name = "Tf", descriptor = "[F")
    private float[] field2873 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kea", name = "ef", descriptor = "I")
    public int field2833 = 3;

    @OriginalMember(owner = "client!kea", name = "Of", descriptor = "I")
    public int field2868 = 0;

    @OriginalMember(owner = "client!kea", name = "Zf", descriptor = "I")
    public int field2879 = 0;

    @OriginalMember(owner = "client!kea", name = "hf", descriptor = "F")
    public float field2836 = 3584.0F;

    @OriginalMember(owner = "client!kea", name = "Rf", descriptor = "I")
    private int field2871 = 0;

    @OriginalMember(owner = "client!kea", name = "Ff", descriptor = "[F")
    public float[] field2859 = this.field2873;

    @OriginalMember(owner = "client!kea", name = "mf", descriptor = "I")
    public int field2840 = 0;

    @OriginalMember(owner = "client!kea", name = "Vf", descriptor = "Z")
    public boolean field2875 = true;

    @OriginalMember(owner = "client!kea", name = "df", descriptor = "Z")
    public boolean field2832 = false;

    @OriginalMember(owner = "client!kea", name = "ie", descriptor = "F")
    public float field2785 = -1.0F;

    @OriginalMember(owner = "client!kea", name = "bg", descriptor = "I")
    public int field2881 = 0;

    @OriginalMember(owner = "client!kea", name = "cg", descriptor = "I")
    public int field2882 = 3584;

    @OriginalMember(owner = "client!kea", name = "Lf", descriptor = "I")
    private int field2865 = 0;

    @OriginalMember(owner = "client!kea", name = "gf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2835 = new Stream();

    @OriginalMember(owner = "client!kea", name = "qg", descriptor = "Lof;")
    private class581 field2896 = new class581();

    @OriginalMember(owner = "client!kea", name = "Cb", descriptor = "Ljava/lang/Object;")
    public Object field2649;

    @OriginalMember(owner = "client!kea", name = "wd", descriptor = "Ljava/lang/Object;")
    private Object field2747;

    @OriginalMember(owner = "client!kea", name = "Hc", descriptor = "Lpfa;")
    public class275 field2706;

    @OriginalMember(owner = "client!kea", name = "Nd", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2764;

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2589;

    @OriginalMember(owner = "client!kea", name = "zf", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!kea", name = "Hd", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!kea", name = "Ad", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!kea", name = "Cf", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!kea", name = "fb", descriptor = "I")
    private int field2626;

    @OriginalMember(owner = "client!kea", name = "H", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!kea", name = "Ye", descriptor = "Lrp;")
    private class405 field2827;

    @OriginalMember(owner = "client!kea", name = "lb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field2632;

    @OriginalMember(owner = "client!kea", name = "vb", descriptor = "[Ltn;")
    public static class81[] field2642 = new class81[14];

    @OriginalMember(owner = "client!kea", name = "ab", descriptor = "[F")
    public static float[] field2621 = new float[4];

    @OriginalMember(owner = "client!kea", name = "Oc", descriptor = "Lsk;")
    public static class582 field2713 = null;

    @OriginalMember(owner = "client!kea", name = "Cc", descriptor = "Ldr;")
    public static class675 field2701 = new class675(63, 1);

    @OriginalMember(owner = "client!kea", name = "je", descriptor = "F")
    public float field2786;

    @OriginalMember(owner = "client!kea", name = "oe", descriptor = "F")
    public float field2791;

    @OriginalMember(owner = "client!kea", name = "ye", descriptor = "F")
    private float field2801;

    @OriginalMember(owner = "client!kea", name = "Ee", descriptor = "F")
    public float field2807;

    @OriginalMember(owner = "client!kea", name = "Le", descriptor = "F")
    private float field2814;

    @OriginalMember(owner = "client!kea", name = "ff", descriptor = "F")
    public float field2834;

    @OriginalMember(owner = "client!kea", name = "sf", descriptor = "F")
    private float field2846;

    @OriginalMember(owner = "client!kea", name = "Qf", descriptor = "F")
    public float field2870;

    @OriginalMember(owner = "client!kea", name = "Yf", descriptor = "F")
    public float field2878;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!kea", name = "w", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!kea", name = "x", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!kea", name = "y", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!kea", name = "B", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!kea", name = "C", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!kea", name = "D", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!kea", name = "F", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!kea", name = "G", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!kea", name = "I", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!kea", name = "J", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!kea", name = "K", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!kea", name = "L", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!kea", name = "M", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!kea", name = "N", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!kea", name = "O", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!kea", name = "P", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!kea", name = "Q", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!kea", name = "R", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!kea", name = "S", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!kea", name = "T", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!kea", name = "U", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!kea", name = "V", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!kea", name = "W", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!kea", name = "X", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!kea", name = "Y", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!kea", name = "Z", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!kea", name = "bb", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!kea", name = "cb", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!kea", name = "db", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!kea", name = "eb", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!kea", name = "gb", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!kea", name = "hb", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!kea", name = "ib", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!kea", name = "jb", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!kea", name = "kb", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!kea", name = "mb", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!kea", name = "nb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!kea", name = "ob", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!kea", name = "pb", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!kea", name = "qb", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!kea", name = "sb", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!kea", name = "tb", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!kea", name = "ub", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!kea", name = "wb", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!kea", name = "xb", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!kea", name = "yb", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!kea", name = "zb", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!kea", name = "Ab", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!kea", name = "Bb", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!kea", name = "Db", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!kea", name = "Eb", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!kea", name = "Gb", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!kea", name = "Hb", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!kea", name = "Ib", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!kea", name = "Jb", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!kea", name = "Kb", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!kea", name = "Lb", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!kea", name = "Mb", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!kea", name = "Nb", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!kea", name = "Ob", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!kea", name = "Pb", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!kea", name = "Qb", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!kea", name = "Rb", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!kea", name = "Sb", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!kea", name = "Tb", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!kea", name = "Ub", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!kea", name = "Vb", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!kea", name = "Wb", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!kea", name = "Yb", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!kea", name = "Zb", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!kea", name = "ac", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!kea", name = "bc", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!kea", name = "cc", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!kea", name = "dc", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!kea", name = "ec", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!kea", name = "fc", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!kea", name = "gc", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!kea", name = "hc", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!kea", name = "ic", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!kea", name = "jc", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!kea", name = "kc", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!kea", name = "lc", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!kea", name = "mc", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!kea", name = "nc", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!kea", name = "oc", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!kea", name = "pc", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!kea", name = "qc", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!kea", name = "rc", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!kea", name = "sc", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!kea", name = "uc", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!kea", name = "vc", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!kea", name = "wc", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!kea", name = "xc", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!kea", name = "yc", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!kea", name = "zc", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!kea", name = "Ac", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!kea", name = "Bc", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!kea", name = "Dc", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!kea", name = "Ec", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!kea", name = "Fc", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!kea", name = "Gc", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!kea", name = "Ic", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!kea", name = "Jc", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!kea", name = "Kc", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!kea", name = "Lc", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!kea", name = "Mc", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!kea", name = "Nc", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!kea", name = "Pc", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!kea", name = "Qc", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!kea", name = "Rc", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!kea", name = "Sc", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!kea", name = "Tc", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!kea", name = "Uc", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!kea", name = "Vc", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!kea", name = "Wc", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!kea", name = "Xc", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!kea", name = "Yc", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!kea", name = "Zc", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!kea", name = "ad", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!kea", name = "bd", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!kea", name = "cd", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!kea", name = "dd", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!kea", name = "ed", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!kea", name = "fd", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!kea", name = "gd", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!kea", name = "hd", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!kea", name = "id", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!kea", name = "jd", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!kea", name = "kd", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!kea", name = "ld", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!kea", name = "md", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!kea", name = "nd", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!kea", name = "pd", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!kea", name = "qd", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!kea", name = "rd", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!kea", name = "sd", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!kea", name = "td", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!kea", name = "ud", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!kea", name = "vd", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!kea", name = "xd", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!kea", name = "yd", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!kea", name = "zd", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!kea", name = "Bd", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!kea", name = "Cd", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!kea", name = "Dd", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!kea", name = "Ed", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!kea", name = "Fd", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!kea", name = "Gd", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!kea", name = "Id", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!kea", name = "Jd", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!kea", name = "Ld", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!kea", name = "Md", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!kea", name = "Od", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!kea", name = "Pd", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!kea", name = "Qd", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!kea", name = "Rd", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!kea", name = "Td", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!kea", name = "Vd", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!kea", name = "Wd", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!kea", name = "Xd", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!kea", name = "Yd", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!kea", name = "he", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!kea", name = "we", descriptor = "I")
    private int field2799;

    @OriginalMember(owner = "client!kea", name = "Te", descriptor = "I")
    public int field2822;

    @OriginalMember(owner = "client!kea", name = "Ze", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!kea", name = "vf", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!kea", name = "Af", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!kea", name = "Jf", descriptor = "I")
    private int field2863;

    @OriginalMember(owner = "client!kea", name = "Kf", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!kea", name = "Uf", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!kea", name = "ag", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!kea", name = "yg", descriptor = "I")
    private int field2904;

    @OriginalMember(owner = "client!kea", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!kea", name = "Sf", descriptor = "Lho;")
    private class139 field2872;

    @OriginalMember(owner = "client!kea", name = "hg", descriptor = "Lvl;")
    private class13 field2887;

    @OriginalMember(owner = "client!kea", name = "Kd", descriptor = "Ltca;")
    public class161 field2761;

    @OriginalMember(owner = "client!kea", name = "fe", descriptor = "Lsda;")
    private class242 field2782;

    @OriginalMember(owner = "client!kea", name = "fg", descriptor = "Lbf;")
    private class502 field2885;

    @OriginalMember(owner = "client!kea", name = "jg", descriptor = "Lbf;")
    public class502 field2889;

    @OriginalMember(owner = "client!kea", name = "mg", descriptor = "Lbf;")
    private class502 field2892;

    @OriginalMember(owner = "client!kea", name = "sg", descriptor = "Lbf;")
    public class502 field2898;

    @OriginalMember(owner = "client!kea", name = "ug", descriptor = "Lbf;")
    public class502 field2900;

    @OriginalMember(owner = "client!kea", name = "vg", descriptor = "Lbf;")
    public class502 field2901;

    @OriginalMember(owner = "client!kea", name = "dg", descriptor = "Lii;")
    private class519 field2883;

    @OriginalMember(owner = "client!kea", name = "pg", descriptor = "Lii;")
    private class519 field2895;

    @OriginalMember(owner = "client!kea", name = "tf", descriptor = "Lgl;")
    public class562 field2847;

    @OriginalMember(owner = "client!kea", name = "eg", descriptor = "Log;")
    public class606 field2884;

    @OriginalMember(owner = "client!kea", name = "gg", descriptor = "Log;")
    public class606 field2886;

    @OriginalMember(owner = "client!kea", name = "ig", descriptor = "Log;")
    public class606 field2888;

    @OriginalMember(owner = "client!kea", name = "kg", descriptor = "Log;")
    public class606 field2890;

    @OriginalMember(owner = "client!kea", name = "lg", descriptor = "Log;")
    public class606 field2891;

    @OriginalMember(owner = "client!kea", name = "ng", descriptor = "Log;")
    public class606 field2893;

    @OriginalMember(owner = "client!kea", name = "og", descriptor = "Log;")
    public class606 field2894;

    @OriginalMember(owner = "client!kea", name = "rg", descriptor = "Log;")
    public class606 field2897;

    @OriginalMember(owner = "client!kea", name = "tg", descriptor = "Log;")
    public class606 field2899;

    @OriginalMember(owner = "client!kea", name = "wg", descriptor = "Log;")
    public class606 field2902;

    @OriginalMember(owner = "client!kea", name = "bf", descriptor = "Lqu;")
    private class87 field2830;

    @OriginalMember(owner = "client!kea", name = "Fb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2652;

    @OriginalMember(owner = "client!kea", name = "Xb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field2670;

    @OriginalMember(owner = "client!kea", name = "rb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2638;

    @OriginalMember(owner = "client!kea", name = "ge", descriptor = "Z")
    public boolean field2783;

    @OriginalMember(owner = "client!kea", name = "ze", descriptor = "Z")
    public boolean field2802;

    @OriginalMember(owner = "client!kea", name = "Ce", descriptor = "Z")
    public boolean field2805;

    @OriginalMember(owner = "client!kea", name = "He", descriptor = "Z")
    public boolean field2810;

    @OriginalMember(owner = "client!kea", name = "Hf", descriptor = "Z")
    public boolean field2861;

    @OriginalMember(owner = "client!kea", name = "xg", descriptor = "Z")
    public boolean field2903;

    @OriginalMember(owner = "client!kea", name = "od", descriptor = "[B")
    public static byte[] field2739;

    @OriginalMember(owner = "client!kea", name = "Xf", descriptor = "[Lbj;")
    public class227[] field2877;

    @OriginalMember(owner = "client!kea", name = "qe", descriptor = "[Lns;")
    public class375[] field2793;

    @OriginalMember(owner = "client!kea", name = "xf", descriptor = "[Lns;")
    public class375[] field2851;

    @OriginalMember(owner = "client!kea", name = "Re", descriptor = "[Lgl;")
    private class562[] field2820;

    @OriginalMember(owner = "client!kea", name = "kf", descriptor = "[Lof;")
    public class581[] field2838;

    @OriginalMember(owner = "client!kea", name = "Je", descriptor = "[Lra;")
    public class98[] field2812;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZB)V")
    public final void method1272(boolean arg0, byte arg1) {
        if (arg1 > -9) {
            this.method321((byte) -103);
        }
        if (!this.field2832 != !arg0) {
            this.field2832 = arg0;
            this.method334(false);
            this.field2799 &= -32;
        }
        ++field2745;
    }

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "()F")
    public final float method1273() {
        ++field2699;
        return this.field2787;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[BBILnh;)Lht;")
    public abstract class544 method349(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, class699 arg5);

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(II)V")
    public abstract void method376(int arg0, int arg1);

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V")
    public abstract void method359(int arg0);

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "(I)V")
    public abstract void method343(int arg0);

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method417(Canvas arg0) {
        ++field2653;
        if (this.field2764 == arg0) {
            throw new RuntimeException();
        } else if (!this.field2638.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method326(0, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field2638.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "()V")
    public final void method409() {
        this.field2861 = false;
        ++field2696;
        this.method1318((byte) -53, false, 0, false, 0, 0);
        this.method1323((byte) -13);
        this.method323(-4);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6, int arg7, int arg8) {
        ++field2729;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLhs;I)V")
    public final void method1274(byte arg0, class304 arg1, int arg2) {
        this.method390(false, arg1, false, arg2, 262144);
        ++field2716;
        int var4 = -41 % ((1 - arg0) / 36);
    }

    @OriginalMember(owner = "client!kea", name = "G", descriptor = "()F")
    public final float method1275() {
        ++field2648;
        return this.field2801;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)I")
    public final int method469(int arg0, int arg1) {
        ++field2715;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "(I)F")
    public abstract float method367(int arg0);

    @OriginalMember(owner = "client!kea", name = "IA", descriptor = "()I")
    public final int method461() {
        ++field2695;
        return this.field2882;
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(B)V")
    public abstract void method383(byte arg0);

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "(I)V")
    private final void method1276(int arg0) {
        ++field2714;
        if (arg0 != 2) {
            this.field2819 = true;
        }
        this.field2821 = (float) this.field2882 - this.field2801;
    }

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "(I)V")
    public void method368(int arg0) {
        if (arg0 != -1) {
            this.method372(-14);
        }
        this.method1330(arg0);
        ++field2680;
    }

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "(I)I")
    public final int method1277(int arg0) {
        ++field2636;
        if (arg0 != 3) {
            this.method491((class359[]) null, (class396) null, (class524[]) null, -104);
        }
        return this.field2863;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)V")
    public final void method1278(int arg0, byte arg1) {
        ++field2634;
        this.method1341((byte) 90, arg1 << 16 | arg1 << 24 | arg1 << 8 | arg1);
        if (arg0 != 14354) {
            this.field2791 = -1.7639612F;
        }
    }

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "()Z")
    public final boolean method432() {
        ++field2693;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "(IIII)V")
    public final void method450(int arg0, int arg1, int arg2, int arg3) {
        this.field2858 = arg2;
        this.field2867 = arg3;
        ++field2694;
        this.field2848 = arg1;
        this.field2881 = arg0;
        this.method1297(108);
        this.method1305((byte) 42);
        this.method1292((byte) -4);
        this.method1301((byte) 89);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IF)V")
    public final void method1279(int arg0, float arg1) {
        if (this.field2866 != arg1) {
            this.field2866 = arg1;
            this.method1297(121);
        }
        if (arg0 >= 0) {
            this.field2888 = null;
        }
        ++field2737;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method355(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(Z)V")
    public final void method1280(boolean arg0) {
        ++field2610;
        Enumeration var2 = this.field2638.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method346(var3, 127, this.field2638.get(var3));
        }
        if (arg0) {
            this.field2883.method60(5634);
            this.field2895.method60(5634);
            this.field2894.method3372((byte) 1);
            this.field2888.method3372((byte) 1);
            this.field2893.method3372((byte) 1);
            this.field2884.method3372((byte) 1);
            this.field2886.method3372((byte) 1);
            this.field2830.method660(-59);
            this.field2887.method60(5634);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjr;Lnh;)Z")
    public abstract boolean method357(int arg0, class100 arg1, class699 arg2);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZZ)V")
    public final void method1281(boolean arg0, boolean arg1) {
        ++field2596;
        if (this.field2795 == !arg0) {
            this.field2795 = arg0;
            this.method347(-21751);
        }
        if (arg1) {
            this.method1320((float[]) null, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "(I)V")
    public abstract void method364(int arg0);

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "(I)V")
    public final void method413(int arg0) {
        ++field2595;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "(I)V")
    public void method320(int arg0) {
        this.field2849 = this.field2864;
        ++field2676;
        if (arg0 != 30423) {
            this.method349(83, 127, (byte[]) null, (byte) -61, 20, (class699) null);
        }
        this.field2864 = 0;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IFFFFFF)Z")
    private final boolean method1282(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field2633;
        Buffer var8 = this.field2895.method62(true, true);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method1289(85, var8);
            if (!Stream.method3525()) {
                var9.method3527(arg4);
                var9.method3527(arg1);
                var9.method3527(arg3);
                var9.method3527(arg5);
                var9.method3527(arg6);
                var9.method3527(arg2);
            } else {
                var9.method3517(arg4);
                var9.method3517(arg1);
                var9.method3517(arg3);
                var9.method3517(arg5);
                var9.method3517(arg6);
                var9.method3517(arg2);
            }
            var9.method3530();
            int var10 = -113 % ((-75 - arg0) / 51);
            return this.field2895.method61((byte) 96);
        }
    }

    @OriginalMember(owner = "client!kea", name = "F", descriptor = "()V")
    public final void method410() {
        this.field2843 = 0;
        this.field2869 = this.field2602;
        ++field2724;
        this.field2879 = this.field2751;
        this.field2876 = 0;
        if (this.field2903) {
            this.field2903 = false;
            this.method381(0);
        }
        this.method1301((byte) 89);
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(B)V")
    public final void method1283(byte arg0) {
        ++field2612;
        if (~this.field2799 != -5) {
            this.method1317(Integer.MAX_VALUE);
            this.method1302(false, false);
            this.method1294(false, -29852);
            this.method1343(-32, false);
            this.method1272(false, (byte) -90);
            this.method1312(false, 0, -2, false);
            this.method1321(-101, 1);
            this.method1328((byte) 1, 0);
            this.field2799 = 4;
        }
        if (arg0 > -10) {
            this.field2806 = 10;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BZ)V")
    public final void method1284(byte arg0, boolean arg1) {
        if (!this.field2798 == arg1) {
            this.field2798 = arg1;
            this.method356(1);
        }
        ++field2679;
        if (arg0 > -101) {
            this.method1291(-97);
        }
    }

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "(I)V")
    public abstract void method381(int arg0);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[[IZ)Lqca;")
    public abstract class105 method352(int arg0, int arg1, int[][] arg2, boolean arg3);

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "(I)V")
    private final void method1285(int arg0) {
        ++field2718;
        if (this.field2799 != 1) {
            this.method1317(Integer.MAX_VALUE);
            this.method1302(false, false);
            this.method1294(false, -29852);
            this.method1343(-32, false);
            this.method1272(false, (byte) -52);
            this.method1312(false, 0, -2, false);
            this.method1328((byte) -126, 1);
            this.method1349(this.field2847, false);
            this.field2799 = 1;
        }
        if (arg0 != 13380) {
            this.field2788 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[BBZLnh;I)Lem;")
    public final class212 method1286(int arg0, byte[] arg1, byte arg2, boolean arg3, class699 arg4, int arg5) {
        ++field2709;
        int var7 = -67 / ((25 - arg2) / 43);
        return this.method314(-25, arg3, 0, arg0, arg5, arg4, arg1, 0);
    }

    @OriginalMember(owner = "client!kea", name = "YA", descriptor = "(IFFFFF)V")
    public final void method445(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field2615;
        boolean var7 = ~this.field2797 != ~arg0;
        if (var7 || this.field2785 != arg1 || this.field2824 != arg2) {
            this.field2797 = arg0;
            this.field2824 = arg2;
            this.field2785 = arg1;
            if (var7) {
                this.field2857 = (float) (this.field2797 & 16711680) / 1.671168E7F;
                this.field2790 = (float) (this.field2797 & 255) / 255.0F;
                this.field2796 = (float) (this.field2797 & 65280) / 65280.0F;
                this.method364(13529);
            }
            this.field2632.setSunColour(this.field2857, this.field2796, this.field2790, arg1, arg2);
            this.method362((byte) -98);
        }
        if (this.field2818[0] != arg3 || this.field2818[1] != arg4 || this.field2818[2] != arg5) {
            this.field2818[2] = arg5;
            this.field2818[0] = arg3;
            this.field2818[1] = arg4;
            this.field2839[0] = -arg3;
            this.field2839[1] = -arg4;
            this.field2839[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field2816[0] = arg3 * var8;
            this.field2816[2] = arg5 * var8;
            this.field2816[1] = arg4 * var8;
            this.field2850[2] = -this.field2816[2];
            this.field2850[0] = -this.field2816[0];
            this.field2850[1] = -this.field2816[1];
            this.field2632.setSunDirection(this.field2816[0], this.field2816[1], this.field2816[2]);
            this.method333((byte) -93);
            this.field2784 = (int) (arg5 * 256.0F / arg4);
            this.field2828 = (int) (arg3 * 256.0F / arg4);
        }
        this.method358(0);
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(Li;)V")
    public final void method489(class37 arg0) {
        this.field2652 = ((class178) arg0).field2076;
        ++field2705;
        this.field2670 = this.field2652.method3516(32768, false);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIII)V")
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2730;
        float var7 = this.method367(10);
        this.method1285(13380);
        this.method1341((byte) 84, arg4);
        this.method1274((byte) -120, class666.field9048, 0);
        this.method1304(class666.field9048, 0, (byte) -78);
        this.method1321(-101, arg5);
        this.field2771.method3226(false, (float) (arg2 - 1), (float) (arg3 + -1), 1.0F);
        this.field2771.method3222((float) arg0 + -var7, 2, 0.0F, (float) arg1 - var7);
        this.method1348(83);
        this.method366(false, (byte) -128);
        this.method1310(0, class126.field1540, 4);
        this.method366(true, (byte) -120);
        this.method1304(class290.field3662, 0, (byte) 4);
        this.method1274((byte) -65, class290.field3662, 0);
    }

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "(IIIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2647;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lns;BLns;)V")
    public final void method1287(class375 arg0, byte arg1, class375 arg2) {
        ++field2711;
        boolean var4 = false;
        if (this.field2851[this.field2841] != arg2) {
            this.field2851[this.field2841] = arg2;
            this.method373(0);
            var4 = true;
        }
        if (arg1 == 57) {
            if (this.field2793[this.field2841] != arg0) {
                this.field2793[this.field2841] = arg0;
                this.method348((byte) -128);
                var4 = true;
            }
            if (var4) {
                this.field2799 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1288(boolean arg0, int arg1, int arg2) {
        ++field2741;
        int var4 = -84 / ((arg2 - 61) / 36);
        return this.field2652.method3516(arg1, arg0);
    }

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "(I)V")
    public abstract void method378(int arg0);

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "(I)V")
    public abstract void method377(int arg0);

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "([I)V")
    public final void method478(int[] arg0) {
        arg0[2] = this.field2869;
        arg0[0] = this.field2876;
        ++field2675;
        arg0[1] = this.field2843;
        arg0[3] = this.field2879;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method1289(int arg0, Buffer arg1) {
        ++field2666;
        int var3 = 71 / ((arg0 - 15) / 50);
        this.field2835.method3524(arg1);
        return this.field2835;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Liba;Z)Lxa;")
    public final class468 method402(class495 arg0, boolean arg1) {
        ++field2698;
        class468 var9;
        if (arg0.field6193 != 0 && ~arg0.field6195 != -1) {
            int[] var3 = new int[arg0.field6195 * arg0.field6193];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field6189 != null) {
                for (int var6 = 0; ~arg0.field6195 < ~var6; ++var6) {
                    for (int var7 = 0; var7 < arg0.field6193; ++var7) {
                        var3[var5++] = class364.method2113(arg0.field6187[class109.method762(arg0.field6191[var4], 255)], arg0.field6189[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; var8 < arg0.field6195; ++var8) {
                    for (int var10 = 0; ~var10 > ~arg0.field6193; ++var10) {
                        int var11 = arg0.field6187[255 & arg0.field6191[var4++]];
                        var3[var5++] = var11 == 0 ? 0 : class364.method2113(-16777216, var11);
                    }
                }
            }
            var9 = this.method428(var3, 0, arg0.field6193, arg0.field6193, arg0.field6195);
        } else {
            var9 = this.method428(new int[1], 0, 1, 1, 1);
        }
        var9.method1559(arg0.field6190, arg0.field6192, arg0.field6188, arg0.field6194);
        return var9;
    }

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "(I)Lof;")
    public final class581 method1290(int arg0) {
        if (arg0 <= 84) {
            this.method347(57);
        }
        ++field2659;
        return this.field2779;
    }

    @OriginalMember(owner = "client!kea", name = "C", descriptor = "(IIIIII)V")
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1285(13380);
        ++field2748;
        this.method1341((byte) -127, arg4);
        this.method1274((byte) -50, class666.field9048, 0);
        this.method1304(class666.field9048, 0, (byte) -15);
        this.method1321(-78, arg5);
        this.field2771.method3226(false, (float) arg2, (float) arg3, 1.0F);
        this.field2771.method588(arg0, arg1, 0);
        this.method1348(61);
        this.method366(false, (byte) -128);
        this.method1335(true);
        this.method366(true, (byte) -123);
        this.method1304(class290.field3662, 0, (byte) 111);
        this.method1274((byte) -43, class290.field3662, 0);
    }

    @OriginalMember(owner = "client!kea", name = "LA", descriptor = "(IIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        ++field2587;
        if (!this.field2861) {
            throw new RuntimeException("");
        } else {
            if (~this.field2863 != ~arg0) {
                this.field2863 = arg0;
                if (this.field2872 != null) {
                    this.field2872.method883((byte) 115);
                }
            }
            this.field2811 = arg2;
            this.field2871 = arg3;
            this.field2855 = arg1;
            this.method1323((byte) -13);
        }
    }

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "(I)V")
    public final void method1291(int arg0) {
        ++field2611;
        Hashtable var2 = new Hashtable();
        if (this.field2638 != null && !this.field2638.isEmpty()) {
            Enumeration var3 = this.field2638.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method326(0, var4));
            }
        }
        this.field2638 = var2;
        this.method1340(arg0 + -80);
        this.method1299(false);
        if (arg0 == 0) {
            this.field2830.method658(-32108, this);
        }
    }

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(B)V")
    public final void method1292(byte arg0) {
        ++field2746;
        if (arg0 == -4) {
            if (class188.field2227 != this.field2852) {
                class338 var2 = this.field2852;
                this.field2852 = class188.field2227;
                if (var2.method1943(58)) {
                    this.method1322(124);
                }
                this.field2799 &= -32;
                this.field2859 = this.field2873;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "(B)V")
    public abstract void method348(byte arg0);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILbf;)V")
    public abstract void method344(int arg0, class502 arg1);

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(II)Lvl;")
    public final class13 method1293(int arg0, int arg1) {
        if (this.field2887.method503(-3267) < arg1 * 2) {
            this.field2887.method59(-29529, arg1);
        }
        if (arg0 != 20932) {
            this.method1330(66);
        }
        ++field2723;
        return this.field2887;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lnba;Z)V")
    public abstract void method319(class278 arg0, boolean arg1);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI)V")
    public final void method1294(boolean arg0, int arg1) {
        if (arg1 == -29852) {
            if (!arg0 != !this.field2845) {
                this.field2845 = arg0;
                this.method356(1);
                this.field2799 &= -8;
            }
            ++field2722;
        }
    }

    @OriginalMember(owner = "client!kea", name = "L", descriptor = "(ILfa;II)V")
    public final void method426(int arg0, class219 arg1, int arg2, int arg3) {
        ++field2654;
        class422 var5 = (class422) arg1;
        class212 var6 = var5.field5357;
        this.method1296(-9151);
        this.method1349(var6, false);
        this.method1321(-126, 1);
        this.method1287(class291.field3672, (byte) 57, class291.field3672);
        this.method1274((byte) -77, class666.field9048, 0);
        this.method1341((byte) -127, arg0);
        this.field2771.method3226(false, (float) this.field2602, (float) this.field2751, 0.0F);
        this.method1348(97);
        this.field2838[0].method3226(false, var6.method42((byte) 127, (float) this.field2602), var6.method39((float) this.field2751, -120), 1.0F);
        this.field2838[0].method3222(var6.method42((byte) 126, (float) (-arg2)), 2, 0.0F, var6.method39((float) (-arg3), -94));
        this.field2812[0] = class228.field2942;
        this.method1303((byte) -97);
        this.method1335(true);
        this.method1324(0);
        this.method1274((byte) -42, class290.field3662, 0);
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(Z)V")
    public abstract void method334(boolean arg0);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([Lba;Lq;[Lpo;I)V")
    public final void method491(class359[] arg0, class396 arg1, class524[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method2049(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field2637;
    }

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "(I)V")
    public abstract void method389(int arg0);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lba;Lig;Lq;Lpo;I)V")
    public final void method427(class359 arg0, class228 arg1, class396 arg2, class524 arg3, int arg4) {
        ++field2605;
        arg0.method2049(arg2, arg3, arg4);
        this.method485(arg1);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BI[IIZ)Lem;")
    public final class212 method1295(byte arg0, int arg1, int[] arg2, int arg3, boolean arg4) {
        ++field2598;
        return arg0 > -28 ? null : this.method339(arg3, 11, arg1, arg2, arg4, 0, 0);
    }

    @OriginalMember(owner = "client!kea", name = "w", descriptor = "(I)V")
    public final void method1296(int arg0) {
        if (arg0 == -9151) {
            ++field2687;
            if (~this.field2799 != -3) {
                this.method1317(arg0 + -2147474498);
                this.method1302(false, false);
                this.method1294(false, arg0 + -20701);
                this.method1343(-32, false);
                this.method1272(false, (byte) -49);
                this.method1312(false, 0, -2, false);
                this.field2799 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "x", descriptor = "(I)V")
    private final void method1297(int arg0) {
        if (arg0 <= 106) {
            this.method412(-115, 59, (int[][]) null, (int[][]) null, -57, -3, 49);
        }
        ++field2620;
        this.field2844 = false;
        if (class79.field1029 == this.field2852) {
            this.method1337(9);
            this.method1334((byte) -66);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lq;)V")
    public final void method490(class396 arg0) {
        this.field2776 = (class581) arg0;
        ++field2623;
        this.field2778.method583(this.field2776);
        this.field2778.method3225(3);
        this.field2779.method3229(false, this.field2778);
        this.field2777.method3229(false, this.field2776);
        if (this.field2852.method1943(58)) {
            this.method1322(126);
        }
    }

    @OriginalMember(owner = "client!kea", name = "y", descriptor = "(I)V")
    public abstract void method358(int arg0);

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(II)V")
    public final void method1298(int arg0, int arg1) {
        ++field2740;
        if (arg0 == 28397) {
            if (~this.field2841 != ~arg1) {
                this.field2841 = arg1;
                this.method383((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "(B)V")
    public abstract void method395(byte arg0);

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(IIIII)V")
    public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2712;
        this.method497(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!kea", name = "JA", descriptor = "(I)V")
    public final void method442(int arg0) {
        this.field2833 = 0;
        ++field2750;
        while (~arg0 < -2) {
            ++this.field2833;
            arg0 >>= 1;
        }
        this.field2860 = 1 << this.field2833;
    }

    @OriginalMember(owner = "client!kea", name = "C", descriptor = "()Z")
    public final boolean method424() {
        ++field2727;
        return false;
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Le;Lpfa;II)V")
    public class223(Canvas arg0, Object arg1, class498 arg2, class275 arg3, int arg4, int arg5) {
        super(arg2);
        this.field2747 = this.field2649 = arg1;
        this.field2706 = arg3;
        this.field2589 = this.field2764 = arg0;
        this.field2853 = arg4;
        Dimension var7 = arg0.getSize();
        this.field2751 = this.field2758 = var7.height;
        this.field2856 = arg5;
        this.field2602 = this.field2626 = var7.width;
        class536.method2886(true, (byte) -70, false);
        this.field2827 = new class405(this, super.field8781);
        this.field2632 = new NativeInterface(super.field8781.method2719((byte) 125), this.field2856);
        for (int var8 = 0; ~super.field8781.method2719((byte) 119) < ~var8; ++var8) {
            class152 var9 = super.field8781.method2718(var8, (byte) 72);
            if (var9 != null) {
                this.field2632.initTextureMetrics(var8, var9.field1820, var9.field1816);
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(Z)V")
    private final void method1299(boolean arg0) {
        ++field2657;
        this.field2895 = this.method341(118, true);
        if (!arg0) {
            this.field2895.method2814(12, (byte) -99, 24);
            this.field2885 = this.method350(new class192[] { new class192(class133.field1606) }, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILnh;ILjr;I)Lem;")
    public abstract class212 method313(int arg0, class699 arg1, int arg2, class100 arg3, int arg4);

    @OriginalMember(owner = "client!kea", name = "Q", descriptor = "(IIII)V")
    public final void method451(int arg0, int arg1, int arg2, int arg3) {
        ++field2767;
        boolean var5 = false;
        if (~this.field2876 > ~arg0) {
            this.field2876 = arg0;
            var5 = true;
        }
        if (~this.field2869 < ~arg2) {
            var5 = true;
            this.field2869 = arg2;
        }
        if (~this.field2843 > ~arg1) {
            var5 = true;
            this.field2843 = arg1;
        }
        if (~arg3 > ~this.field2879) {
            var5 = true;
            this.field2879 = arg3;
        }
        if (var5) {
            if (!this.field2903) {
                this.field2903 = true;
                this.method381(0);
            }
            this.method372(8);
            this.method1301((byte) 89);
        }
    }

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "(I)V")
    public abstract void method370(int arg0);

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "()I")
    public final int method430() {
        ++field2734;
        return this.field2880 + -2;
    }

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "(Z)V")
    public final void method1300(boolean arg0) {
        this.field2812 = new class98[this.field2854];
        this.field2793 = new class375[this.field2854];
        this.field2851 = new class375[this.field2854];
        ++field2752;
        this.field2838 = new class581[this.field2854];
        this.field2820 = new class562[this.field2854];
        for (int var2 = 0; this.field2854 > var2; ++var2) {
            this.field2793[var2] = class607.field8276;
            this.field2851[var2] = class607.field8276;
            this.field2812[var2] = class124.field1521;
            this.field2838[var2] = new class581();
        }
        this.field2877 = new class227[this.field2880 + -2];
        this.field2847 = this.method313(1, class556.field6946, 9, class100.field1288, 1);
        this.method489(new class178(262144));
        this.field2900 = this.method350(new class192[] { new class192(new class133[] { class133.field1606, class133.field1619 }) }, (byte) -120);
        this.field2889 = this.method350(new class192[] { new class192(new class133[] { class133.field1606, class133.field1617 }) }, (byte) -115);
        this.field2901 = this.method350(new class192[] { new class192(class133.field1606), new class192(class133.field1617), new class192(class133.field1619), new class192(class133.field1611) }, (byte) -115);
        this.field2898 = this.method350(new class192[] { new class192(class133.field1606), new class192(class133.field1617), new class192(class133.field1619) }, (byte) -124);
        this.field2891 = new class606(this, 0, 0, false, false);
        this.field2894 = new class606(this, 0, 0, true, true);
        this.field2899 = new class606(this, 0, 0, false, false);
        this.field2888 = new class606(this, 0, 0, true, arg0);
        this.field2897 = new class606(this, 0, 0, false, false);
        this.field2893 = new class606(this, 0, 0, true, true);
        this.field2890 = new class606(this, 0, 0, false, false);
        this.field2884 = new class606(this, 0, 0, true, true);
        this.field2902 = new class606(this, 0, 0, false, false);
        this.field2886 = new class606(this, 0, 0, true, true);
        this.field2830 = new class87(this);
        this.field2887 = this.method340((byte) 101, true);
        this.method1291(0);
        this.field2761 = new class161(this);
        this.field2788[1] = this.method386(1, -122);
        this.field2788[2] = this.method386(2, -125);
        this.field2788[4] = this.method386(4, -126);
        this.field2788[5] = this.method386(5, -126);
        this.field2788[6] = this.method386(6, -127);
        this.field2788[7] = this.method386(7, -127);
        this.field2788[3] = this.method386(3, -123);
        this.field2788[8] = this.method386(8, -125);
        this.field2788[9] = this.method386(9, -122);
        if (!this.field2788[2].method152(113)) {
            this.field2788[2] = this.method386(0, -127);
        }
        if (!this.field2788[4].method152(-12)) {
            this.field2788[4] = this.field2788[2];
        }
        if (!this.field2788[8].method152(-37)) {
            this.field2788[8] = this.field2788[4];
        }
        if (!this.field2788[9].method152(116)) {
            this.field2788[9] = this.field2788[8];
        }
        this.method368(-1);
        this.method410();
    }

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "(B)V")
    private final void method1301(byte arg0) {
        this.field2870 = (float) (-this.field2848 + this.field2843);
        this.field2807 = (float) (-this.field2881 + this.field2869);
        this.field2791 = (float) (-this.field2881 + this.field2876);
        ++field2614;
        if (arg0 != 89) {
            this.method1303((byte) 80);
        }
        this.field2786 = (float) (-this.field2848 + this.field2879);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lub;[Liba;Z)Lta;")
    public final class201 method414(class20 arg0, class495[] arg1, boolean arg2) {
        ++field2691;
        return new class101(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "(I)V")
    public abstract void method371(int arg0);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(III[IZII)Lem;")
    public abstract class212 method339(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method411(Canvas arg0) {
        this.field2589 = null;
        ++field2656;
        this.field2747 = null;
        if (arg0 != null && this.field2764 != arg0) {
            if (this.field2638.containsKey(arg0)) {
                this.field2747 = this.field2638.get(arg0);
                this.field2589 = arg0;
            }
        } else {
            this.field2589 = this.field2764;
            this.field2747 = this.field2649;
        }
        if (this.field2589 != null && this.field2747 != null) {
            this.method355(7, this.field2747, this.field2589);
            this.method1313(102);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "(Z)V")
    public abstract void method329(boolean arg0);

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "()V")
    public void method392() {
        ++field2753;
        if (!this.field2813) {
            for (class263 var1 = this.field2692.method1909(true); var1 != null; var1 = this.field2692.method1916((byte) 101)) {
                ((class178) var1).method1056((byte) 24);
            }
            Enumeration var2 = this.field2638.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method346(var3, 127, this.field2638.get(var3));
            }
            class465.method2536(true, false, 0);
            this.field2632.release();
            this.field2813 = true;
        }
    }

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "(B)V")
    public abstract void method353(byte arg0);

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(Z)V")
    public final void method455(boolean arg0) {
        this.field2875 = arg0;
        ++field2682;
        this.method334(false);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILhs;Z)V")
    public abstract void method382(int arg0, int arg1, class304 arg2, boolean arg3);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "()Z")
    public final boolean method471() {
        ++field2662;
        return false;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(ZZ)V")
    public final void method1302(boolean arg0, boolean arg1) {
        if (arg0 == !this.field2783) {
            this.field2783 = arg0;
            this.method323(115);
            this.field2799 &= -32;
        }
        ++field2684;
        if (arg1) {
            this.field2882 = -33;
        }
    }

    @OriginalMember(owner = "client!kea", name = "ca", descriptor = "(IIII)V")
    public final void method403(int arg0, int arg1, int arg2, int arg3) {
        ++field2594;
        if (arg0 <= 0 && this.field2602 + -1 <= arg2 && ~arg1 >= -1 && arg3 >= this.field2751 + -1) {
            this.method410();
        } else {
            this.field2879 = this.field2602 >= arg3 ? arg3 : 0;
            this.field2876 = ~arg0 <= -1 ? arg0 : 0;
            this.field2869 = ~arg2 < ~this.field2602 ? 0 : arg2;
            this.field2843 = arg1 < 0 ? 0 : arg1;
            if (!this.field2903) {
                this.field2903 = true;
                this.method381(0);
            }
            this.method372(8);
            this.method1301((byte) 89);
        }
    }

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "(B)V")
    private final void method1303(byte arg0) {
        this.method329(false);
        int var2 = -124 / ((45 - arg0) / 38);
        ++field2733;
        if (this.field2872 != null) {
            this.field2872.method884(108);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lhs;IB)V")
    public final void method1304(class304 arg0, int arg1, byte arg2) {
        ++field2601;
        this.method382(46, arg1, arg0, false);
        int var4 = 68 % ((66 - arg2) / 45);
    }

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "(B)V")
    private final void method1305(byte arg0) {
        if (arg0 != 42) {
            this.field2864 = -24;
        }
        ++field2770;
        this.field2819 = false;
        this.method1352((byte) 85);
        if (class10.field96 == this.field2852) {
            this.method1334((byte) -121);
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V")
    public final void method476(int arg0) {
        ++field2685;
    }

    @OriginalMember(owner = "client!kea", name = "B", descriptor = "(I)V")
    private final void method1306(int arg0) {
        ++field2667;
        this.method363(-76, 0, this.field2895);
        this.method344(28303, this.field2885);
        this.method328(1, class14.field135, 1, arg0);
    }

    @OriginalMember(owner = "client!kea", name = "C", descriptor = "(I)V")
    public abstract void method356(int arg0);

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "(I)I")
    public final int method1307(int arg0) {
        if (arg0 != 8) {
            this.field2859 = null;
        }
        ++field2765;
        return this.field2841;
    }

    @OriginalMember(owner = "client!kea", name = "F", descriptor = "(I)I")
    public final int method1308(int arg0) {
        ++field2710;
        int var2 = 94 / ((58 - arg0) / 42);
        return this.field2871;
    }

    @OriginalMember(owner = "client!kea", name = "G", descriptor = "(I)V")
    public abstract void method323(int arg0);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIZLnh;I[FII)Lem;")
    public abstract class212 method384(int arg0, int arg1, boolean arg2, class699 arg3, int arg4, float[] arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "()I")
    public final int method429() {
        ++field2641;
        return this.field2768 - (-this.field2774 - this.field2773);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method326(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "(B)V")
    private final void method1309(byte arg0) {
        int var2 = 114 % ((26 - arg0) / 46);
        ++field2683;
        this.field2817 = false;
        if (class526.field6650 == this.field2852) {
            this.method1342(true);
            this.method1334((byte) 71);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILsv;I)V")
    private final void method1310(int arg0, class617 arg1, int arg2) {
        this.method363(-110, arg0, this.field2883);
        ++field2640;
        this.method344(28303, this.field2892);
        this.method328(1, arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!kea", name = "H", descriptor = "(I)V")
    public abstract void method373(int arg0);

    @OriginalMember(owner = "client!kea", name = "I", descriptor = "(I)V")
    public final void method1311(int arg0) {
        int var2 = -58 % ((36 - arg0) / 44);
        this.field2771.method584();
        ++field2617;
        this.field2769 = true;
        this.method1353(0);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZIIZ)V")
    public final void method1312(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 == 0) {
            if (~this.field2781 != ~arg2) {
                if (arg2 < 0) {
                    this.method1324(arg1);
                    this.method1349((class562) null, false);
                    this.method1328((byte) -128, 0);
                    if (!this.field2861) {
                        this.method1318((byte) -18, arg0, 0, arg3, 0, 0);
                    }
                } else {
                    class212 var5 = this.field2827.method2279(true, arg2);
                    class152 var6 = super.field8781.method2718(arg2, (byte) 72);
                    if (var6.field1806 == 0 && ~var6.field1821 == -1) {
                        this.method1324(0);
                    } else {
                        int var7 = var6.field1826 ? 64 : 128;
                        int var8 = var7 * 50;
                        class581 var9 = this.method1336(0);
                        var9.method3223((float) (this.field2822 % var8 * var6.field1806) / (float) var8, 0.0F, (byte) -128, (float) (this.field2822 % var8 * var6.field1821) / (float) var8);
                        this.method1339(true, class228.field2942);
                    }
                    if (!this.field2861) {
                        this.method1318((byte) -11, arg0, var6.field1822, arg3, var6.field1815, var6.field1809);
                    }
                    if (this.field2872 != null) {
                        this.field2872.method150((byte) 114, var6.field1805, var5);
                    } else {
                        this.method1349(var5, false);
                        this.method1328((byte) 114, var6.field1805);
                    }
                }
                this.field2781 = arg2;
            }
            ++field2725;
            this.field2799 &= -8;
        }
    }

    @OriginalMember(owner = "client!kea", name = "sa", descriptor = "(II)V")
    public final void method438(int arg0, int arg1) {
        if (this.field2806 != arg0 || this.field2882 != arg1) {
            this.field2882 = arg1;
            this.field2806 = arg0;
            this.method1305((byte) 42);
            this.method1297(122);
            this.method1323((byte) -13);
        }
        ++field2590;
    }

    @OriginalMember(owner = "client!kea", name = "J", descriptor = "(I)V")
    private final void method1313(int arg0) {
        ++field2759;
        if (this.field2589 == null) {
            this.field2626 = this.field2758 = 1;
        } else {
            Dimension var2 = this.field2589.getSize();
            this.field2758 = var2.height;
            this.field2626 = var2.width;
        }
        if (arg0 > 47) {
            this.field2602 = this.field2626;
            this.field2751 = this.field2758;
            this.method1309((byte) 83);
            this.method1305((byte) 42);
            this.method1297(119);
            this.method321((byte) 67);
            this.method1301((byte) 89);
            this.method1292((byte) -4);
            this.method410();
        }
    }

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "()Z")
    public final boolean method419() {
        ++field2721;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(ZB)V")
    public abstract void method366(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([FIBZLnh;I)Lem;")
    public final class212 method1314(float[] arg0, int arg1, byte arg2, boolean arg3, class699 arg4, int arg5) {
        if (arg2 < 5) {
            this.field2807 = 1.9545062F;
        }
        ++field2772;
        return this.method384(0, 0, arg3, arg4, arg1, arg0, -128, arg5);
    }

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "(B)V")
    private final void method1315(byte arg0) {
        ++field2613;
        if (this.field2801 == 0.0F) {
            this.field2804[14] = this.field2814;
            this.field2804[10] = this.field2846;
        } else {
            float var2 = this.field2787 / (this.field2801 + this.field2787);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field2814 * (-var2 + 1.0F) / this.field2801;
            this.field2804[14] = this.field2814 * var3;
            this.field2804[10] = this.field2846 + var4;
        }
        this.field2836 = (this.field2804[14] - (float) this.field2882) / this.field2804[10];
        if (arg0 != -29) {
            this.field2844 = true;
        }
    }

    @OriginalMember(owner = "client!kea", name = "AA", descriptor = "(IIII)V")
    public final void method484(int arg0, int arg1, int arg2, int arg3) {
        this.field2855 = arg1;
        this.field2811 = arg2;
        ++field2658;
        this.field2861 = true;
        this.field2871 = arg3;
        this.field2863 = arg0;
        this.method1318((byte) -98, false, 0, false, 0, 3);
        if (this.field2872 != null) {
            this.field2872.method883((byte) -116);
        }
        this.method1323((byte) -13);
        this.method323(114);
    }

    @OriginalMember(owner = "client!kea", name = "K", descriptor = "(I)V")
    public final void method1316(int arg0) {
        int var2 = -94 % ((arg0 - -52) / 58);
        ++field2639;
        if (this.field2799 != 16) {
            this.method1345(-8);
            this.method1302(true, false);
            this.method1343(-32, true);
            this.method1272(true, (byte) -71);
            this.method1321(-113, 1);
            this.field2799 = 16;
        }
    }

    @OriginalMember(owner = "client!kea", name = "L", descriptor = "(I)V")
    private final void method1317(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            this.method1340(21);
        }
        if (class526.field6650 != this.field2852) {
            class338 var2 = this.field2852;
            this.field2852 = class526.field6650;
            if (var2.method1943(58)) {
                this.method1322(arg0 + -2147483532);
            }
            this.method1342(true);
            this.field2859 = this.field2803;
            this.method1334((byte) 64);
            this.field2799 &= -25;
        }
        ++field2619;
    }

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(I)Li;")
    public final class37 method468(int arg0) {
        ++field2599;
        class178 var2 = new class178(arg0);
        this.field2692.method1904(var2, -63);
        return var2;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BZIZII)V")
    private final void method1318(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = 122 % ((38 - arg0) / 37);
        boolean var8 = arg3 & this.method481();
        ++field2708;
        if (!var8 && (arg5 == 4 || arg5 == 8 || ~arg5 == -10)) {
            arg5 = 2;
            arg2 = arg5 == 4 ? 1 & arg4 : 1;
            arg4 = 0;
        }
        if (~arg5 != -1 && arg1) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (~this.field2825 == ~arg5) {
            if (~this.field2825 != -1) {
                this.field2788[Integer.MAX_VALUE & this.field2825].method151(43, arg1);
                if (~this.field2862 != ~arg4 || ~this.field2865 != ~arg2) {
                    this.field2788[Integer.MAX_VALUE & this.field2825].method148(-2, arg2, arg4);
                    this.field2862 = arg4;
                    this.field2865 = arg2;
                }
                return;
            }
        } else {
            if (~this.field2825 != -1) {
                this.field2788[Integer.MAX_VALUE & this.field2825].method149(-30);
            }
            if (arg5 == 0) {
                this.field2872 = null;
            } else {
                this.field2872 = this.field2788[arg5 & Integer.MAX_VALUE];
                this.field2872.method153(arg1, 43);
                this.field2872.method151(43, arg1);
                this.field2872.method148(-2, arg2, arg4);
            }
            this.field2862 = arg4;
            this.field2865 = arg2;
            this.field2825 = arg5;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILnh;Ljr;)Z")
    public abstract boolean method360(int arg0, class699 arg1, class100 arg2);

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "()Z")
    public final boolean method404() {
        ++field2689;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lip;)V")
    public final void method458(class662 arg0) {
        ++field2625;
        this.field2782 = (class242) arg0;
    }

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "(B)V")
    public abstract void method321(byte arg0);

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "()Z")
    public final boolean method481() {
        ++field2686;
        return this.field2788[3].method152(110);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILsv;II)V")
    public abstract void method328(int arg0, class617 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "(B)Lof;")
    public final class581 method1319(byte arg0) {
        if (arg0 != -121) {
            return null;
        } else {
            ++field2608;
            return this.field2778;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([FB)[F")
    public final float[] method1320(float[] arg0, byte arg1) {
        arg0[12] = this.field2859[3];
        ++field2762;
        arg0[8] = this.field2859[2];
        arg0[4] = this.field2859[1];
        arg0[0] = this.field2859[0];
        if (arg1 < 8) {
            return null;
        } else {
            arg0[13] = this.field2859[7];
            arg0[1] = this.field2859[4];
            arg0[9] = this.field2859[6];
            arg0[5] = this.field2859[5];
            arg0[2] = this.field2859[8];
            arg0[3] = this.field2859[12];
            arg0[6] = this.field2859[9];
            arg0[10] = this.field2859[10];
            arg0[7] = this.field2859[13];
            arg0[14] = this.field2859[11];
            arg0[11] = this.field2859[14];
            arg0[15] = this.field2859[15];
            return arg0;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILii;)V")
    public abstract void method363(int arg0, int arg1, class519 arg2);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method346(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2756;
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method439(Canvas arg0) {
        ++field2592;
        if (this.field2764 == arg0) {
            throw new RuntimeException();
        } else if (this.field2638.containsKey(arg0)) {
            this.method346(arg0, 125, this.field2638.get(arg0));
            this.field2638.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIIF)Lbj;")
    public final class227 method436(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field2604;
        return new class19(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[Lbj;)V")
    public final void method473(int arg0, class227[] arg1) {
        ++field2669;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field2877[var3] = arg1[var3];
        }
        this.field2864 = arg0;
        if (this.field2852.method1943(58)) {
            this.method320(30423);
        }
    }

    @OriginalMember(owner = "client!kea", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field2627;
    }

    @OriginalMember(owner = "client!kea", name = "x", descriptor = "()Lq;")
    public final class396 method431() {
        ++field2702;
        return new class581();
    }

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "()Z")
    public final boolean method434() {
        ++field2700;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLhs;ZII)V")
    public abstract void method390(boolean arg0, class304 arg1, boolean arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class140 method412(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2591;
        return new class568(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method387(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(II)V")
    public final void method1321(int arg0, int arg1) {
        if (~this.field2792 != ~arg1) {
            boolean var3;
            class195 var4;
            boolean var5;
            if (arg1 == 1) {
                var3 = true;
                var4 = class168.field1974;
                var5 = true;
            } else if (arg1 == 2) {
                var5 = false;
                var3 = true;
                var4 = class705.field9864;
            } else if (arg1 == 128) {
                var4 = class324.field4037;
                var3 = true;
                var5 = true;
            } else {
                var4 = class87.field1134;
                var5 = false;
                var3 = false;
            }
            if (var5 == !this.field2789) {
                this.field2789 = var5;
                this.method353((byte) -102);
            }
            if (this.field2800 == !var3) {
                this.field2800 = var3;
                this.method378(1);
            }
            if (this.field2823 != var4) {
                this.field2823 = var4;
                this.method377(120);
            }
            this.field2799 &= -29;
            this.field2792 = arg1;
        }
        ++field2726;
        if (arg0 >= -72) {
            this.field2847 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "()Z")
    public final boolean method477() {
        ++field2628;
        return false;
    }

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "()V")
    public final void method401() {
        ++field2600;
        this.field2827.method2276((byte) 122);
    }

    @OriginalMember(owner = "client!kea", name = "M", descriptor = "(I)V")
    private final void method1322(int arg0) {
        this.field2809 = false;
        if (arg0 < 114) {
            this.field2879 = -76;
        }
        ++field2597;
        if (this.field2872 != null) {
            this.field2872.method885(-2);
        }
        this.method370(-1);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
    public final void method444(int arg0) {
        ++field2744;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field2842 = arg0;
            this.field2827.method2276((byte) 54);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([IIIII)Lxa;")
    public final class468 method428(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2681;
        return new class296(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([Loc;B)Lbf;")
    public abstract class502 method350(class192[] arg0, byte arg1);

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "(B)V")
    private final void method1323(byte arg0) {
        if (this.field2872 != null) {
            this.field2872.method881(true);
        }
        ++field2720;
        this.method359(12);
        if (arg0 != -13) {
            field2701 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "N", descriptor = "(I)V")
    public final void method1324(int arg0) {
        ++field2678;
        if (this.field2812[this.field2841] != class124.field1521) {
            this.field2812[this.field2841] = class124.field1521;
            this.field2838[this.field2841].method584();
            this.method1303((byte) -90);
        }
        if (arg0 != 0) {
            this.method1346((byte) 5);
        }
    }

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "()Lq;")
    public final class396 method470() {
        ++field2697;
        return this.field2896;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2672;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(II)I")
    public final int method493(int arg0, int arg1) {
        ++field2660;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "(B)V")
    public static void method1325(byte arg0) {
        field2621 = null;
        field2713 = null;
        int var1 = 28 % ((11 - arg0) / 61);
        field2739 = null;
        field2701 = null;
        field2642 = null;
    }

    @OriginalMember(owner = "client!kea", name = "U", descriptor = "()I")
    public final int method423() {
        ++field2738;
        return this.field2806;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(IIIIII)Lip;")
    public final class662 method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2775;
        return new class587(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(I)V")
    public void method354(int arg0) {
        this.field2827.method2277(5);
        ++field2690;
        this.field2822 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZ)Lii;")
    public abstract class519 method341(int arg0, boolean arg1);

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(BZ)Lvl;")
    public abstract class13 method340(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "(B)V")
    public abstract void method333(byte arg0);

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "(II)Lho;")
    public class139 method386(int arg0, int arg1) {
        ++field2743;
        if (arg1 > -121) {
            this.field2872 = null;
        }
        if (arg0 != 6) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    return ~arg0 == -8 ? new class170(this) : new class648(this);
                } else {
                    return new class222(this, this.field2761);
                }
            } else {
                return new class126(this);
            }
        } else {
            return new class709(this);
        }
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "()Z")
    public final boolean method488() {
        ++field2609;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "(B)[F")
    public final float[] method1326(byte arg0) {
        ++field2760;
        if (arg0 >= -122) {
            this.method439((Canvas) null);
        }
        return this.field2873;
    }

    @OriginalMember(owner = "client!kea", name = "O", descriptor = "(I)V")
    public abstract void method372(int arg0);

    @OriginalMember(owner = "client!kea", name = "aa", descriptor = "()I")
    public final int method460() {
        ++field2616;
        return this.field2904;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(IZ)V")
    public final void method1327(int arg0, boolean arg1) {
        if (this.field2831 != arg1) {
            this.field2831 = arg1;
            this.method323(-12);
        }
        ++field2757;
        int var3 = 59 / ((arg0 - -59) / 34);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BI)V")
    public final void method1328(byte arg0, int arg1) {
        ++field2755;
        if (arg1 == 1) {
            this.method1287(class291.field3672, (byte) 57, class291.field3672);
        } else if (~arg1 == -1) {
            this.method1287(class607.field8276, (byte) 57, class607.field8276);
        } else if (arg1 == 2) {
            this.method1287(class291.field3672, (byte) 57, class597.field8016);
        } else if (arg1 != 3) {
            if (arg1 == 4) {
                this.method1287(class113.field1421, (byte) 57, class113.field1421);
            }
        } else {
            this.method1287(class607.field8276, (byte) 57, class375.field4829);
        }
        int var3 = -11 / ((-73 - arg0) / 53);
    }

    @OriginalMember(owner = "client!kea", name = "P", descriptor = "(I)Lof;")
    public final class581 method1329(int arg0) {
        ++field2606;
        return arg0 != 1 ? null : this.field2771;
    }

    @OriginalMember(owner = "client!kea", name = "Q", descriptor = "(I)V")
    private final void method1330(int arg0) {
        this.method364(13529);
        ++field2664;
        this.method362((byte) 103);
        this.method356(1);
        this.method320(30423);
        this.method333((byte) 125);
        this.method358(0);
        this.method347(-21751);
        this.method385(1);
        this.method334(false);
        this.method323(-8);
        this.method359(12);
        this.method378(1);
        this.method377(98);
        this.method353((byte) -111);
        for (int var2 = this.field2854 + -1; ~var2 <= -1; --var2) {
            this.method1298(28397, var2);
            this.method373(0);
            this.method348((byte) -60);
            this.method1324(~arg0);
        }
        this.method389(2);
        this.method321((byte) 67);
        this.method343(0);
        this.method371(arg0);
        this.method370(arg0);
    }

    @OriginalMember(owner = "client!kea", name = "R", descriptor = "(I)V")
    public abstract void method385(int arg0);

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "(B)Lqca;")
    public final class105 method1331(byte arg0) {
        int var2 = 22 / ((66 - arg0) / 36);
        ++field2635;
        return this.field2782 != null ? this.field2782.method1454(8191) : null;
    }

    @OriginalMember(owner = "client!kea", name = "X", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        ++field2663;
        if (~this.field2808 != ~arg0 || ~this.field2837 != ~arg1 || ~this.field2829 != ~arg2) {
            this.field2808 = arg0;
            this.field2837 = arg1;
            this.field2829 = arg2;
            if (this.field2861) {
                return;
            }
            this.method1323((byte) -13);
            this.method323(126);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lwda;Z)Z")
    public static final boolean method1332(class597 arg0, boolean arg1) {
        boolean var2 = class299.field3801 == class286.field3633;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method226(-124);
        if (arg0.field8017 >= 0 && arg0.field8014 >= 0 && arg0.field8005 < class546.field6871 && arg0.field8008 < class36.field538) {
            short var6 = 0;
            for (int var7 = arg0.field8017; var7 <= arg0.field8005; ++var7) {
                for (int var10 = arg0.field8014; var10 <= arg0.field8008; ++var10) {
                    class565 var11 = class417.method2319(arg0.field8010, var7, var10);
                    if (var11 != null) {
                        int var12 = 0;
                        if (var7 > arg0.field8017) {
                            ++var12;
                        }
                        if (var7 < arg0.field8005) {
                            var12 += 4;
                        }
                        if (var10 > arg0.field8014) {
                            var12 += 8;
                        }
                        if (var10 < arg0.field8008) {
                            var12 += 2;
                        }
                        class436 var13 = class210.method1235(var12, 52, arg0);
                        class436 var14 = var11.field7074;
                        if (var14 == null) {
                            var11.field7074 = var13;
                        } else {
                            while (var14.field5485 != null) {
                                var14 = var14.field5485;
                            }
                            var14.field5485 = var13;
                        }
                        var11.field7086 = (byte) (var11.field7086 | var12);
                        if (var2 && (class612.field8321[var7][var10] & -16777216) != 0) {
                            var3 = class612.field8321[var7][var10];
                            var4 = class493.field6143[var7][var10];
                            var5 = class29.field349[var7][var10];
                        }
                        if (var11.field7085 != null && var11.field7085.field5597 > var6) {
                            var6 = var11.field7085.field5597;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field8017; var8 <= arg0.field8005; ++var8) {
                    for (int var9 = arg0.field8014; var9 <= arg0.field8008; ++var9) {
                        if ((class612.field8321[var8][var9] & -16777216) == 0) {
                            class612.field8321[var8][var9] = var3;
                            class493.field6143[var8][var9] = var4;
                            class29.field349[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class469.field5797[class459.field5722++] = arg0;
            }
            if (arg1) {
                arg0.field8013 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "ka", descriptor = "(FF)V")
    public final void method406(float arg0, float arg1) {
        ++field2644;
        if (this.field2787 != arg0 || this.field2801 != arg1) {
            this.field2801 = arg1;
            this.field2787 = arg0;
            this.method1276(2);
            this.method1315((byte) -29);
            this.method1297(112);
            this.method1305((byte) 42);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILof;)V")
    public final void method1333(int arg0, class581 arg1) {
        ++field2630;
        this.field2771.method583(arg1);
        if (arg0 > 101) {
            this.field2769 = false;
            this.method1353(0);
        }
    }

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "()Z")
    public final boolean method465() {
        ++field2593;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "(B)V")
    private final void method1334(byte arg0) {
        int var2 = -47 / ((arg0 - 3) / 49);
        ++field2671;
        this.method343(0);
        if (this.field2872 != null) {
            this.field2872.method882((byte) -91);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method405(Canvas arg0) {
        ++field2645;
        Object var2 = null;
        if (arg0 != null && this.field2764 != arg0) {
            if (this.field2638.containsKey(arg0)) {
                var2 = this.field2638.get(arg0);
            }
        } else {
            var2 = this.field2747;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method387((byte) 73, arg0, var2);
            if (this.field2589 == arg0) {
                this.method1313(111);
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(IIIIII)V")
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2588;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        if (this.method1282(-126, (float) arg1, 0.0F, 0.0F, (float) arg0, (float) arg2 + var11, (float) arg3 + var10)) {
            this.method1285(13380);
            this.method1341((byte) 95, arg4);
            this.method1274((byte) 85, class666.field9048, 0);
            this.method1304(class666.field9048, 0, (byte) -29);
            this.method1321(-84, arg5);
            this.method1311(-56);
            this.method366(false, (byte) -128);
            this.method1306(0);
            this.method366(true, (byte) -120);
            this.method1304(class290.field3662, 0, (byte) 4);
            this.method1274((byte) -105, class290.field3662, 0);
        }
    }

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "(Z)V")
    public final void method1335(boolean arg0) {
        if (!arg0) {
            this.field2768 = 96;
        }
        this.method1310(0, class572.field7310, 2);
        ++field2704;
    }

    @OriginalMember(owner = "client!kea", name = "S", descriptor = "(I)Lof;")
    public final class581 method1336(int arg0) {
        ++field2673;
        if (arg0 != 0) {
            this.method376(72, -1);
        }
        return this.field2838[this.field2841];
    }

    @OriginalMember(owner = "client!kea", name = "T", descriptor = "(I)V")
    private final void method1337(int arg0) {
        ++field2703;
        if (!this.field2844) {
            float[] var2 = this.field2794;
            float var3 = (float) this.field2806 + -this.field2801;
            float var4 = (float) this.field2882 - this.field2801;
            float var5 = (float) (-this.field2848) * this.field2866 / (float) this.field2867;
            float var6 = (float) (-this.field2881) * this.field2866 / (float) this.field2858;
            float var7 = (float) (this.field2602 - this.field2881) * this.field2866 / (float) this.field2858;
            float var8 = (float) (this.field2751 - this.field2848) * this.field2866 / (float) this.field2867;
            if (var6 != var7 && var5 != var8) {
                var2[0] = 2.0F / (-var6 + var7);
                var2[10] = 1.0F / (-var4 + var3);
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[14] = var3 / (-var4 + var3);
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[3] = 0.0F;
            } else {
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method1276(2);
            this.field2844 = true;
        }
        if (arg0 != 9) {
            this.field2844 = false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class468 method433(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2719;
        class296 var6 = new class296(this, arg2, arg3, arg4);
        var6.method1546(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!kea", name = "w", descriptor = "(B)Lof;")
    public final class581 method1338(byte arg0) {
        if (arg0 < 9) {
            this.method435(-40, -110, -9, -65, 10, 28);
        }
        ++field2655;
        if (!this.field2809) {
            this.field2780.method3231(this.field2778, this.field2771);
            this.field2809 = true;
        }
        return this.field2780;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lig;)V")
    public final void method485(class228 arg0) {
        this.field2830.method663(-22942, this, arg0);
        ++field2677;
    }

    @OriginalMember(owner = "client!kea", name = "y", descriptor = "()Z")
    public final boolean method466() {
        ++field2661;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLra;)V")
    public final void method1339(boolean arg0, class98 arg1) {
        ++field2731;
        this.field2812[this.field2841] = arg1;
        this.method1303((byte) -6);
        if (!arg0) {
            this.field2869 = 43;
        }
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
    public final void method494(int arg0) {
        ++field2622;
    }

    @OriginalMember(owner = "client!kea", name = "U", descriptor = "(I)V")
    private final void method1340(int arg0) {
        ++field2646;
        this.field2883 = this.method341(104, false);
        this.field2883.method2814(28, (byte) -99, 140);
        if (arg0 > -65) {
            this.method357(4, (class100) null, (class699) null);
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field2883.method62(true, true);
            if (var3 != null) {
                Stream var4 = this.method1289(121, var3);
                if (Stream.method3525()) {
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(1.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(1.0F);
                    var4.method3517(0.0F);
                    var4.method3517(1.0F);
                    var4.method3517(1.0F);
                    var4.method3517(1.0F);
                    var4.method3517(0.0F);
                    var4.method3517(1.0F);
                    var4.method3517(1.0F);
                    var4.method3517(1.0F);
                    var4.method3517(1.0F);
                    var4.method3517(1.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(1.0F);
                    var4.method3517(0.0F);
                    var4.method3517(1.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                    var4.method3517(0.0F);
                } else {
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(1.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(1.0F);
                    var4.method3527(0.0F);
                    var4.method3527(1.0F);
                    var4.method3527(1.0F);
                    var4.method3527(1.0F);
                    var4.method3527(0.0F);
                    var4.method3527(1.0F);
                    var4.method3527(1.0F);
                    var4.method3527(1.0F);
                    var4.method3527(1.0F);
                    var4.method3527(1.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(1.0F);
                    var4.method3527(0.0F);
                    var4.method3527(1.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                    var4.method3527(0.0F);
                }
                var4.method3530();
                if (this.field2883.method61((byte) 96)) {
                    break;
                }
            }
        }
        this.field2892 = this.method350(new class192[] { new class192(new class133[] { class133.field1606, class133.field1619, class133.field1619 }) }, (byte) -128);
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(BI)V")
    public final void method1341(byte arg0, int arg1) {
        ++field2618;
        if (this.field2874 != arg1) {
            this.field2874 = arg1;
            this.method389(2);
        }
        int var3 = 68 / ((-63 - arg0) / 59);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([Lba;Lig;Lq;[Lpo;I)V")
    public final void method480(class359[] arg0, class228 arg1, class396 arg2, class524[] arg3, int arg4) {
        this.method491(arg0, arg2, arg3, arg4);
        ++field2631;
        this.method485(arg1);
    }

    @OriginalMember(owner = "client!kea", name = "na", descriptor = "(III[I)V")
    public final void method420(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2754;
        float var5 = this.field2776.method3227(-116, (float) arg0, (float) arg2, (float) arg1);
        if (!(var5 < (float) this.field2806) && !((float) this.field2882 < var5)) {
            int var6 = (int) ((float) this.field2858 * this.field2776.method3221((float) arg0, (float) arg1, (byte) -92, (float) arg2) / var5);
            int var7 = (int) ((float) this.field2867 * this.field2776.method3211(true, (float) arg0, (float) arg1, (float) arg2) / var5);
            if ((float) var6 >= this.field2791 && this.field2807 >= (float) var6 && (float) var7 >= this.field2870 && this.field2786 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field2870);
                arg3[0] = (int) ((float) var6 - this.field2791);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kea", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2643;
        float var7 = this.field2776.method3227(55, (float) arg0, (float) arg2, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field2776.method3227(-108, (float) arg3, (float) arg5, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field2806 > var7) || !(var8 < (float) this.field2806)) && (!((float) this.field2882 < var7) || !((float) this.field2882 < var8))) {
            int var9 = (int) ((float) this.field2858 * this.field2776.method3221((float) arg0, (float) arg1, (byte) -92, (float) arg2) / var7);
            int var10 = (int) ((float) this.field2858 * this.field2776.method3221((float) arg3, (float) arg4, (byte) -92, (float) arg5) / var8);
            if ((float) var9 < this.field2791 && (float) var10 < this.field2791 || this.field2807 < (float) var9 && this.field2807 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field2867 * this.field2776.method3211(true, (float) arg0, (float) arg1, (float) arg2) / var7);
                int var12 = (int) ((float) this.field2867 * this.field2776.method3211(true, (float) arg3, (float) arg4, (float) arg5) / var8);
                return (!((float) var11 < this.field2870) || !(this.field2870 > (float) var12)) && (!((float) var11 > this.field2786) || !((float) var12 > this.field2786));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class219 method400(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field2607;
        return class251.method1511(arg2, 0, arg0, arg3, this, arg1);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBIIILsv;Lvl;)V")
    public abstract void method375(int arg0, byte arg1, int arg2, int arg3, int arg4, class617 arg5, class13 arg6);

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "(Z)V")
    private final void method1342(boolean arg0) {
        if (arg0) {
            if (!this.field2817) {
                float[] var2 = this.field2803;
                if (this.field2602 != 0 && ~this.field2751 != -1) {
                    var2[0] = 2.0F / (float) this.field2602;
                    var2[13] = 1.0F;
                    var2[9] = 0.0F;
                    var2[1] = 0.0F;
                    var2[7] = 0.0F;
                    var2[15] = 1.0F;
                    var2[2] = 0.0F;
                    var2[3] = 0.0F;
                    var2[5] = -2.0F / (float) this.field2751;
                    var2[11] = 0.0F;
                    var2[6] = 0.0F;
                    var2[12] = -1.0F;
                    var2[10] = 0.5F;
                    var2[4] = 0.0F;
                    var2[8] = 0.0F;
                    var2[14] = 0.5F;
                } else {
                    var2[9] = 0.0F;
                    var2[7] = 0.0F;
                    var2[5] = 1.0F;
                    var2[14] = 0.0F;
                    var2[11] = 0.0F;
                    var2[0] = 1.0F;
                    var2[8] = 0.0F;
                    var2[2] = 0.0F;
                    var2[1] = 0.0F;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[12] = 0.0F;
                    var2[6] = 0.0F;
                    var2[15] = 1.0F;
                    var2[10] = 1.0F;
                    var2[13] = 0.0F;
                }
                this.field2817 = true;
            }
            ++field2717;
        }
    }

    @OriginalMember(owner = "client!kea", name = "ha", descriptor = "(F)V")
    public final void method449(float arg0) {
        if (this.field2815 != arg0) {
            this.field2815 = arg0;
            this.field2632.setAmbient(arg0);
            this.method364(13529);
            this.method358(0);
        }
        ++field2735;
    }

    @OriginalMember(owner = "client!kea", name = "D", descriptor = "()Z")
    public final boolean method492() {
        ++field2728;
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "()Z")
    public final boolean method422() {
        ++field2736;
        return this.field2810;
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(IZ)V")
    public final void method1343(int arg0, boolean arg1) {
        if (arg0 != -32) {
            this.field2903 = true;
        }
        ++field2688;
        if (this.field2826 != arg1) {
            this.field2826 = arg1;
            this.method385(arg0 + 33);
            this.field2799 &= -32;
        }
    }

    @OriginalMember(owner = "client!kea", name = "V", descriptor = "(I)V")
    private final void method1344(int arg0) {
        if (class10.field96 != this.field2852) {
            class338 var2 = this.field2852;
            this.field2852 = class10.field96;
            if (!var2.method1943(58)) {
                this.method1322(121);
            }
            this.method1352((byte) 85);
            this.field2859 = this.field2804;
            this.method1334((byte) 116);
            this.field2799 &= -8;
        }
        if (arg0 >= -119) {
            this.field2774 = 124;
        }
        ++field2674;
    }

    @OriginalMember(owner = "client!kea", name = "W", descriptor = "(I)V")
    private final void method1345(int arg0) {
        if (class79.field1029 != this.field2852) {
            class338 var2 = this.field2852;
            this.field2852 = class79.field1029;
            if (!var2.method1943(arg0 ^ -62)) {
                this.method1322(123);
            }
            this.method1337(9);
            this.field2859 = this.field2794;
            this.method1334((byte) 106);
            this.field2799 &= -8;
        }
        if (arg0 != -8) {
            this.method431();
        }
        ++field2707;
    }

    @OriginalMember(owner = "client!kea", name = "x", descriptor = "(B)Lof;")
    public final class581 method1346(byte arg0) {
        if (arg0 >= -4) {
            this.method1292((byte) -74);
        }
        ++field2665;
        return this.field2838[this.field2841];
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)V")
    public final void method482(boolean arg0) {
        ++field2651;
    }

    @OriginalMember(owner = "client!kea", name = "ya", descriptor = "(IIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2629;
        this.method497(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lnj;IIII)Lba;")
    public final class359 method408(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2603;
        return new class606(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kea", name = "y", descriptor = "(B)V")
    public final void method1347(byte arg0) {
        if (~this.field2799 != -9) {
            this.method1344(-123);
            this.method1302(true, false);
            this.method1343(-32, true);
            this.method1272(true, (byte) -24);
            this.method1321(-105, 1);
            this.field2799 = 8;
        }
        if (arg0 != -8) {
            this.method1295((byte) -38, 3, (int[]) null, -115, true);
        }
        ++field2763;
    }

    @OriginalMember(owner = "client!kea", name = "X", descriptor = "(I)V")
    public final void method1348(int arg0) {
        ++field2749;
        this.field2769 = false;
        this.method1353(0);
        if (arg0 <= 57) {
            this.method392();
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lgl;Z)V")
    public final void method1349(class562 arg0, boolean arg1) {
        if (!arg1) {
            ++field2732;
            if (this.field2820[this.field2841] != arg0) {
                this.field2820[this.field2841] = arg0;
                if (arg0 != null) {
                    arg0.method41(-9341);
                } else {
                    this.method395((byte) -125);
                }
                this.field2799 &= -2;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "(B)I")
    public final int method1350(byte arg0) {
        ++field2624;
        if (arg0 != -60) {
            this.field2886 = null;
        }
        return this.field2811;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZIIILnh;[BI)Lem;")
    public abstract class212 method314(int arg0, boolean arg1, int arg2, int arg3, int arg4, class699 arg5, byte[] arg6, int arg7);

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "(B)V")
    public abstract void method362(byte arg0);

    @OriginalMember(owner = "client!kea", name = "Y", descriptor = "(I)V")
    public final void method1351(int arg0) {
        if (arg0 == 5) {
            ++field2668;
            this.method1292((byte) -4);
            this.method1334((byte) -127);
        }
    }

    @OriginalMember(owner = "client!kea", name = "B", descriptor = "(B)V")
    private final void method1352(byte arg0) {
        ++field2586;
        if (!this.field2819) {
            float[] var2 = this.field2804;
            float var3 = (float) (-this.field2881 * this.field2806) / (float) this.field2858;
            float var4 = (float) ((-this.field2881 + this.field2602) * this.field2806) / (float) this.field2858;
            float var5 = (float) (this.field2848 * this.field2806) / (float) this.field2867;
            float var6 = (float) ((this.field2848 - this.field2751) * this.field2806) / (float) this.field2867;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field2806 * 2.0F;
                var2[15] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[11] = -1.0F;
                var2[3] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[7] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[14] = this.field2814 = (float) (this.field2882 * this.field2806) / (float) (-this.field2882 + this.field2806);
                var2[4] = 0.0F;
                var2[10] = this.field2846 = (float) this.field2882 / (float) (this.field2806 - this.field2882);
                var2[6] = 0.0F;
            } else {
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[10] = 1.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
            }
            this.method1315((byte) -29);
            this.field2819 = true;
        }
        if (arg0 != 85) {
            this.field2901 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIZ)Lxa;")
    public final class468 method441(int arg0, int arg1, boolean arg2) {
        ++field2650;
        return new class296(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kea", name = "Z", descriptor = "(I)V")
    private final void method1353(int arg0) {
        if (class526.field6650 == this.field2852) {
            float var2 = this.method367(10);
            this.field2771.method3222(var2, 2, 0.0F, var2);
        }
        ++field2742;
        this.field2809 = false;
        this.method371(120);
        if (arg0 != 0) {
            this.method1291(113);
        }
        if (this.field2872 != null) {
            this.field2872.method879(false);
        }
    }
}
