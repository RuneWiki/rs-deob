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

@OriginalClass("client!pq")
public class class194 extends class473 {

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2408 = new Hashtable();

    @OriginalMember(owner = "client!pq", name = "ye", descriptor = "I")
    public int field2602 = 128;

    @OriginalMember(owner = "client!pq", name = "Ae", descriptor = "Lot;")
    private class746 field2604 = new class746();

    @OriginalMember(owner = "client!pq", name = "De", descriptor = "Llha;")
    private class35 field2607 = new class35();

    @OriginalMember(owner = "client!pq", name = "Ee", descriptor = "Llha;")
    public class35 field2608 = new class35();

    @OriginalMember(owner = "client!pq", name = "Ge", descriptor = "I")
    public int field2610 = 3;

    @OriginalMember(owner = "client!pq", name = "He", descriptor = "I")
    public int field2611 = 8;

    @OriginalMember(owner = "client!pq", name = "Le", descriptor = "Z")
    private boolean field2615 = false;

    @OriginalMember(owner = "client!pq", name = "Fe", descriptor = "Lv;")
    private class165 field2609 = new class165();

    @OriginalMember(owner = "client!pq", name = "Oe", descriptor = "[Lqaa;")
    private class343[] field2618 = new class343[4];

    @OriginalMember(owner = "client!pq", name = "Me", descriptor = "I")
    private int field2616 = -1;

    @OriginalMember(owner = "client!pq", name = "Se", descriptor = "[Lqaa;")
    private class343[] field2622 = new class343[4];

    @OriginalMember(owner = "client!pq", name = "Te", descriptor = "[Lqaa;")
    private class343[] field2623 = new class343[4];

    @OriginalMember(owner = "client!pq", name = "Re", descriptor = "I")
    private int field2621 = -1;

    @OriginalMember(owner = "client!pq", name = "Ve", descriptor = "I")
    private int field2625 = -1;

    @OriginalMember(owner = "client!pq", name = "Ye", descriptor = "Lv;")
    private class165 field2628;

    @OriginalMember(owner = "client!pq", name = "af", descriptor = "Lv;")
    private class165 field2630;

    @OriginalMember(owner = "client!pq", name = "bf", descriptor = "Lv;")
    private class165 field2631;

    @OriginalMember(owner = "client!pq", name = "cf", descriptor = "Lv;")
    private class165 field2632;

    @OriginalMember(owner = "client!pq", name = "df", descriptor = "Lv;")
    private class165 field2633;

    @OriginalMember(owner = "client!pq", name = "ef", descriptor = "Lv;")
    private class165 field2634;

    @OriginalMember(owner = "client!pq", name = "ff", descriptor = "Lv;")
    private class165 field2635;

    @OriginalMember(owner = "client!pq", name = "gf", descriptor = "Llha;")
    public class35 field2636;

    @OriginalMember(owner = "client!pq", name = "qf", descriptor = "Llha;")
    public class35 field2645;

    @OriginalMember(owner = "client!pq", name = "rf", descriptor = "Llha;")
    public class35 field2646;

    @OriginalMember(owner = "client!pq", name = "uf", descriptor = "F")
    private float field2649;

    @OriginalMember(owner = "client!pq", name = "Ef", descriptor = "F")
    private float field2659;

    @OriginalMember(owner = "client!pq", name = "wf", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!pq", name = "cg", descriptor = "F")
    public float field2683;

    @OriginalMember(owner = "client!pq", name = "Vf", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!pq", name = "Af", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!pq", name = "qg", descriptor = "[Lsca;")
    private class251[] field2697;

    @OriginalMember(owner = "client!pq", name = "Gf", descriptor = "F")
    private float field2661;

    @OriginalMember(owner = "client!pq", name = "vf", descriptor = "[F")
    private float[] field2650;

    @OriginalMember(owner = "client!pq", name = "ig", descriptor = "F")
    public float field2689;

    @OriginalMember(owner = "client!pq", name = "Nf", descriptor = "Z")
    private boolean field2668;

    @OriginalMember(owner = "client!pq", name = "Lg", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "client!pq", name = "mg", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!pq", name = "Bg", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!pq", name = "Og", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!pq", name = "Cg", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!pq", name = "zg", descriptor = "[F")
    private float[] field2706;

    @OriginalMember(owner = "client!pq", name = "Ig", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!pq", name = "Pg", descriptor = "[F")
    private float[] field2722;

    @OriginalMember(owner = "client!pq", name = "Yg", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!pq", name = "mh", descriptor = "[F")
    public float[] field2745;

    @OriginalMember(owner = "client!pq", name = "Qg", descriptor = "F")
    public float field2723;

    @OriginalMember(owner = "client!pq", name = "eg", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!pq", name = "Wg", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!pq", name = "yg", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!pq", name = "lh", descriptor = "F")
    public float field2744;

    @OriginalMember(owner = "client!pq", name = "Ng", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!pq", name = "lg", descriptor = "I")
    private int field2692;

    @OriginalMember(owner = "client!pq", name = "Kg", descriptor = "I")
    private int field2717;

    @OriginalMember(owner = "client!pq", name = "pg", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!pq", name = "fh", descriptor = "F")
    public float field2738;

    @OriginalMember(owner = "client!pq", name = "rh", descriptor = "F")
    public float field2750;

    @OriginalMember(owner = "client!pq", name = "th", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!pq", name = "hh", descriptor = "F")
    private float field2740;

    @OriginalMember(owner = "client!pq", name = "Bf", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!pq", name = "ug", descriptor = "[F")
    private float[] field2701;

    @OriginalMember(owner = "client!pq", name = "gg", descriptor = "F")
    private float field2687;

    @OriginalMember(owner = "client!pq", name = "ag", descriptor = "Z")
    private boolean field2681;

    @OriginalMember(owner = "client!pq", name = "ng", descriptor = "I")
    private int field2694;

    @OriginalMember(owner = "client!pq", name = "bh", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!pq", name = "sh", descriptor = "F")
    public float field2751;

    @OriginalMember(owner = "client!pq", name = "fg", descriptor = "Lun;")
    public class296 field2686;

    @OriginalMember(owner = "client!pq", name = "Ah", descriptor = "[I")
    public int[] field2759;

    @OriginalMember(owner = "client!pq", name = "zh", descriptor = "[I")
    public int[] field2758;

    @OriginalMember(owner = "client!pq", name = "Dh", descriptor = "[I")
    public int[] field2762;

    @OriginalMember(owner = "client!pq", name = "Eh", descriptor = "[B")
    public byte[] field2763;

    @OriginalMember(owner = "client!pq", name = "Be", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!pq", name = "Cb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2450;

    @OriginalMember(owner = "client!pq", name = "cd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2528;

    @OriginalMember(owner = "client!pq", name = "fc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2479;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "J")
    private long field2409;

    @OriginalMember(owner = "client!pq", name = "nc", descriptor = "J")
    private long field2487;

    @OriginalMember(owner = "client!pq", name = "ph", descriptor = "Z")
    public boolean field2748;

    @OriginalMember(owner = "client!pq", name = "Vg", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!pq", name = "qh", descriptor = "Ljava/lang/String;")
    private String field2749;

    @OriginalMember(owner = "client!pq", name = "Cf", descriptor = "Z")
    public boolean field2657;

    @OriginalMember(owner = "client!pq", name = "bg", descriptor = "Z")
    private boolean field2682;

    @OriginalMember(owner = "client!pq", name = "rg", descriptor = "Z")
    public boolean field2698;

    @OriginalMember(owner = "client!pq", name = "dh", descriptor = "Z")
    public boolean field2736;

    @OriginalMember(owner = "client!pq", name = "Pf", descriptor = "Z")
    public boolean field2670;

    @OriginalMember(owner = "client!pq", name = "sg", descriptor = "Z")
    private boolean field2699;

    @OriginalMember(owner = "client!pq", name = "Uf", descriptor = "Ljava/lang/String;")
    private String field2675;

    @OriginalMember(owner = "client!pq", name = "og", descriptor = "Z")
    public boolean field2695;

    @OriginalMember(owner = "client!pq", name = "Ff", descriptor = "Z")
    private boolean field2660;

    @OriginalMember(owner = "client!pq", name = "ze", descriptor = "Lie;")
    private class633 field2603;

    @OriginalMember(owner = "client!pq", name = "Je", descriptor = "Lffa;")
    public class627 field2613;

    @OriginalMember(owner = "client!pq", name = "Ce", descriptor = "Lmda;")
    private class655 field2606;

    @OriginalMember(owner = "client!pq", name = "we", descriptor = "Lcga;")
    private class425 field2600;

    @OriginalMember(owner = "client!pq", name = "xe", descriptor = "Luga;")
    private class613 field2601;

    @OriginalMember(owner = "client!pq", name = "rc", descriptor = "Z")
    public static boolean field2491 = false;

    @OriginalMember(owner = "client!pq", name = "V", descriptor = "Lke;")
    public static class276 field2417 = new class276(128);

    @OriginalMember(owner = "client!pq", name = "pe", descriptor = "Lv;")
    public static class165 field2593 = new class165();

    @OriginalMember(owner = "client!pq", name = "se", descriptor = "[I")
    public static int[] field2596 = new int[50];

    @OriginalMember(owner = "client!pq", name = "sf", descriptor = "F")
    public float field2647;

    @OriginalMember(owner = "client!pq", name = "Jf", descriptor = "F")
    public float field2664;

    @OriginalMember(owner = "client!pq", name = "Zf", descriptor = "F")
    private float field2680;

    @OriginalMember(owner = "client!pq", name = "vg", descriptor = "F")
    public float field2702;

    @OriginalMember(owner = "client!pq", name = "xg", descriptor = "F")
    private float field2704;

    @OriginalMember(owner = "client!pq", name = "Gg", descriptor = "F")
    public float field2713;

    @OriginalMember(owner = "client!pq", name = "Jg", descriptor = "F")
    public float field2716;

    @OriginalMember(owner = "client!pq", name = "Tg", descriptor = "F")
    public float field2726;

    @OriginalMember(owner = "client!pq", name = "vh", descriptor = "F")
    private float field2754;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!pq", name = "R", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!pq", name = "S", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!pq", name = "T", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!pq", name = "U", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!pq", name = "W", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!pq", name = "X", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!pq", name = "Y", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!pq", name = "Z", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!pq", name = "ab", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!pq", name = "bb", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!pq", name = "cb", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!pq", name = "db", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pq", name = "eb", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pq", name = "fb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!pq", name = "gb", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!pq", name = "hb", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pq", name = "ib", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!pq", name = "jb", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!pq", name = "kb", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!pq", name = "lb", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!pq", name = "mb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!pq", name = "nb", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!pq", name = "ob", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!pq", name = "pb", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!pq", name = "qb", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!pq", name = "rb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!pq", name = "sb", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!pq", name = "tb", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!pq", name = "ub", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!pq", name = "vb", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!pq", name = "wb", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!pq", name = "xb", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!pq", name = "yb", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pq", name = "zb", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!pq", name = "Ab", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!pq", name = "Bb", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!pq", name = "Db", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!pq", name = "Eb", descriptor = "I")
    private int field2452;

    @OriginalMember(owner = "client!pq", name = "Fb", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!pq", name = "Gb", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!pq", name = "Hb", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!pq", name = "Ib", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!pq", name = "Jb", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!pq", name = "Kb", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!pq", name = "Lb", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!pq", name = "Mb", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!pq", name = "Nb", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!pq", name = "Ob", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!pq", name = "Pb", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!pq", name = "Qb", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!pq", name = "Rb", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!pq", name = "Sb", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!pq", name = "Tb", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!pq", name = "Ub", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!pq", name = "Vb", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!pq", name = "Wb", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!pq", name = "Xb", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!pq", name = "Yb", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!pq", name = "Zb", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!pq", name = "ac", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!pq", name = "bc", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!pq", name = "cc", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!pq", name = "dc", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!pq", name = "ec", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!pq", name = "gc", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!pq", name = "hc", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!pq", name = "ic", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!pq", name = "jc", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!pq", name = "kc", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!pq", name = "lc", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!pq", name = "mc", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!pq", name = "oc", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!pq", name = "pc", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!pq", name = "qc", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!pq", name = "sc", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!pq", name = "tc", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!pq", name = "uc", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!pq", name = "vc", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!pq", name = "wc", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!pq", name = "xc", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!pq", name = "yc", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!pq", name = "zc", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!pq", name = "Ac", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!pq", name = "Bc", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!pq", name = "Cc", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!pq", name = "Dc", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!pq", name = "Ec", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!pq", name = "Fc", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!pq", name = "Gc", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!pq", name = "Hc", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!pq", name = "Ic", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!pq", name = "Jc", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!pq", name = "Kc", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!pq", name = "Lc", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!pq", name = "Mc", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!pq", name = "Oc", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!pq", name = "Pc", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!pq", name = "Qc", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!pq", name = "Rc", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!pq", name = "Sc", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!pq", name = "Tc", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!pq", name = "Uc", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!pq", name = "Vc", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!pq", name = "Wc", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!pq", name = "Xc", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!pq", name = "Yc", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!pq", name = "Zc", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!pq", name = "ad", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!pq", name = "bd", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!pq", name = "dd", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!pq", name = "ed", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!pq", name = "fd", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!pq", name = "gd", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!pq", name = "hd", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!pq", name = "id", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!pq", name = "jd", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!pq", name = "kd", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!pq", name = "ld", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!pq", name = "md", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!pq", name = "nd", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!pq", name = "od", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!pq", name = "pd", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!pq", name = "qd", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!pq", name = "rd", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!pq", name = "sd", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!pq", name = "td", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!pq", name = "ud", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!pq", name = "vd", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!pq", name = "wd", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!pq", name = "xd", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!pq", name = "yd", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!pq", name = "zd", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!pq", name = "Ad", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pq", name = "Bd", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!pq", name = "Cd", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!pq", name = "Dd", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!pq", name = "Ed", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!pq", name = "Fd", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!pq", name = "Gd", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!pq", name = "Hd", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!pq", name = "Id", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!pq", name = "Jd", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!pq", name = "Kd", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!pq", name = "Ld", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!pq", name = "Md", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!pq", name = "Nd", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!pq", name = "Od", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!pq", name = "Pd", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!pq", name = "Qd", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!pq", name = "Rd", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!pq", name = "Sd", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!pq", name = "Td", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pq", name = "Ud", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!pq", name = "Vd", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!pq", name = "Wd", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!pq", name = "Xd", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!pq", name = "Yd", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!pq", name = "Zd", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!pq", name = "ae", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!pq", name = "be", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!pq", name = "ce", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!pq", name = "de", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!pq", name = "ee", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!pq", name = "fe", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!pq", name = "ge", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!pq", name = "he", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!pq", name = "ie", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!pq", name = "je", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!pq", name = "ke", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!pq", name = "le", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!pq", name = "me", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!pq", name = "ne", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pq", name = "oe", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pq", name = "qe", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!pq", name = "re", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!pq", name = "te", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!pq", name = "ue", descriptor = "I")
    private int field2598;

    @OriginalMember(owner = "client!pq", name = "Ke", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!pq", name = "We", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!pq", name = "Xe", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!pq", name = "Ze", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!pq", name = "kf", descriptor = "I")
    private int field2639;

    @OriginalMember(owner = "client!pq", name = "mf", descriptor = "I")
    private int field2641;

    @OriginalMember(owner = "client!pq", name = "nf", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!pq", name = "Df", descriptor = "I")
    private int field2658;

    @OriginalMember(owner = "client!pq", name = "Lf", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!pq", name = "Mf", descriptor = "I")
    private int field2667;

    @OriginalMember(owner = "client!pq", name = "Of", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!pq", name = "Qf", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!pq", name = "Rf", descriptor = "I")
    private int field2672;

    @OriginalMember(owner = "client!pq", name = "Sf", descriptor = "I")
    private int field2673;

    @OriginalMember(owner = "client!pq", name = "Xf", descriptor = "I")
    private int field2678;

    @OriginalMember(owner = "client!pq", name = "Yf", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!pq", name = "Sg", descriptor = "I")
    private int field2725;

    @OriginalMember(owner = "client!pq", name = "nh", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!pq", name = "xh", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!pq", name = "Bh", descriptor = "I")
    private int field2760;

    @OriginalMember(owner = "client!pq", name = "Ch", descriptor = "I")
    private int field2761;

    @OriginalMember(owner = "client!pq", name = "hf", descriptor = "J")
    private long field2637;

    @OriginalMember(owner = "client!pq", name = "xf", descriptor = "Lls;")
    public class166 field2652;

    @OriginalMember(owner = "client!pq", name = "yf", descriptor = "Lls;")
    public class166 field2653;

    @OriginalMember(owner = "client!pq", name = "Xg", descriptor = "Lwfa;")
    private class173 field2730;

    @OriginalMember(owner = "client!pq", name = "tf", descriptor = "Lvn;")
    private class211 field2648;

    @OriginalMember(owner = "client!pq", name = "Kf", descriptor = "Lvn;")
    private class211 field2665;

    @OriginalMember(owner = "client!pq", name = "hg", descriptor = "Liq;")
    private class227 field2688;

    @OriginalMember(owner = "client!pq", name = "Nc", descriptor = "Lok;")
    public static class255 field2513;

    @OriginalMember(owner = "client!pq", name = "zf", descriptor = "Lpr;")
    public class332 field2654;

    @OriginalMember(owner = "client!pq", name = "Hf", descriptor = "Lpr;")
    public class332 field2662;

    @OriginalMember(owner = "client!pq", name = "Tf", descriptor = "Lpr;")
    public class332 field2674;

    @OriginalMember(owner = "client!pq", name = "dg", descriptor = "Lpr;")
    public class332 field2684;

    @OriginalMember(owner = "client!pq", name = "jg", descriptor = "Lpr;")
    public class332 field2690;

    @OriginalMember(owner = "client!pq", name = "tg", descriptor = "Lpr;")
    public class332 field2700;

    @OriginalMember(owner = "client!pq", name = "Hg", descriptor = "Lpr;")
    public class332 field2714;

    @OriginalMember(owner = "client!pq", name = "Rg", descriptor = "Lpr;")
    public class332 field2724;

    @OriginalMember(owner = "client!pq", name = "jh", descriptor = "Lpr;")
    public class332 field2742;

    @OriginalMember(owner = "client!pq", name = "wh", descriptor = "Lpr;")
    public class332 field2755;

    @OriginalMember(owner = "client!pq", name = "Pe", descriptor = "Lqaa;")
    private class343 field2619;

    @OriginalMember(owner = "client!pq", name = "Ue", descriptor = "Lqaa;")
    private class343 field2624;

    @OriginalMember(owner = "client!pq", name = "ah", descriptor = "Lrq;")
    public class470 field2733;

    @OriginalMember(owner = "client!pq", name = "Ne", descriptor = "Lrp;")
    private class680 field2617;

    @OriginalMember(owner = "client!pq", name = "Qe", descriptor = "Lhha;")
    private class772 field2620;

    @OriginalMember(owner = "client!pq", name = "wg", descriptor = "Lhha;")
    public class772 field2703;

    @OriginalMember(owner = "client!pq", name = "kh", descriptor = "Ljda;")
    private class90 field2743;

    @OriginalMember(owner = "client!pq", name = "Ie", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2612;

    @OriginalMember(owner = "client!pq", name = "ve", descriptor = "Z")
    public static boolean field2599;

    @OriginalMember(owner = "client!pq", name = "jf", descriptor = "Z")
    private boolean field2638;

    @OriginalMember(owner = "client!pq", name = "lf", descriptor = "Z")
    private boolean field2640;

    @OriginalMember(owner = "client!pq", name = "of", descriptor = "Z")
    private boolean field2643;

    @OriginalMember(owner = "client!pq", name = "pf", descriptor = "Z")
    private boolean field2644;

    @OriginalMember(owner = "client!pq", name = "If", descriptor = "Z")
    public boolean field2663;

    @OriginalMember(owner = "client!pq", name = "Wf", descriptor = "Z")
    private boolean field2677;

    @OriginalMember(owner = "client!pq", name = "kg", descriptor = "Z")
    private boolean field2691;

    @OriginalMember(owner = "client!pq", name = "Dg", descriptor = "Z")
    private boolean field2710;

    @OriginalMember(owner = "client!pq", name = "Eg", descriptor = "Z")
    private boolean field2711;

    @OriginalMember(owner = "client!pq", name = "Fg", descriptor = "Z")
    public boolean field2712;

    @OriginalMember(owner = "client!pq", name = "Mg", descriptor = "Z")
    private boolean field2719;

    @OriginalMember(owner = "client!pq", name = "Ug", descriptor = "Z")
    public boolean field2727;

    @OriginalMember(owner = "client!pq", name = "Zg", descriptor = "Z")
    private boolean field2732;

    @OriginalMember(owner = "client!pq", name = "ch", descriptor = "Z")
    public boolean field2735;

    @OriginalMember(owner = "client!pq", name = "eh", descriptor = "Z")
    public boolean field2737;

    @OriginalMember(owner = "client!pq", name = "gh", descriptor = "Z")
    private boolean field2739;

    @OriginalMember(owner = "client!pq", name = "ih", descriptor = "Z")
    public boolean field2741;

    @OriginalMember(owner = "client!pq", name = "oh", descriptor = "Z")
    public boolean field2747;

    @OriginalMember(owner = "client!pq", name = "uh", descriptor = "Z")
    public boolean field2753;

    @OriginalMember(owner = "client!pq", name = "yh", descriptor = "Z")
    public boolean field2757;

    @OriginalMember(owner = "client!pq", name = "Ag", descriptor = "[Lwha;")
    private class539[] field2707;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V", line = 3)
    private final void method1192(int arg0) {
        OpenGL.glLoadIdentity();
        ++field2480;
        OpenGL.glMultMatrixf(this.field2645.method281(-27708), arg0);
        if (this.field2668) {
            this.field2601.field8628.method2193(arg0);
        }
        this.method1273(arg0 + 5888);
        this.method1215(arg0 + -67);
    }

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "(II)V", line = 20)
    public final void method1193(int arg0, int arg1) {
        class742.field10222[2] = (float) class407.method2490(255, arg0) / 255.0F;
        ++field2492;
        class742.field10222[0] = (float) class407.method2490(arg0, arg1) / 1.671168E7F;
        class742.field10222[1] = (float) class407.method2490(arg0, 65280) / 65280.0F;
        class742.field10222[3] = (float) (arg0 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class742.field10222, 0);
    }

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "(I)V", line = 42)
    private final void method1194(int arg0) {
        ++field2504;
        float var2 = (float) (-this.field2693) * this.field2740 / (float) this.field2696;
        float var3 = (float) (-this.field2656) * this.field2740 / (float) this.field2676;
        float var4 = (float) (-this.field2693 + this.field2454) * this.field2740 / (float) this.field2696;
        float var5 = (float) (-this.field2656 + this.field2423) * this.field2740 / (float) this.field2676;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field2731, (double) this.field2694);
        }
        OpenGL.glMatrixMode(arg0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIII)V", line = 64)
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2503;
        OpenGL.glLineWidth((float) arg5);
        this.method139(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(Z)V", line = 77)
    public static final void method1195(boolean arg0) {
        ++field2512;
        ++class455.field6340;
        if (arg0) {
            field2593 = null;
        }
        class116 var1 = class248.method1672(class84.field1023, class351.field5099, -20647);
        var1.field1575.method2986(class218.field2994, 100);
        class443.method2655(0, var1);
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "()Z", line = 92)
    public final boolean method175() {
        ++field2555;
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FI)V", line = 102)
    public final void method1196(float arg0, int arg1) {
        if (arg1 == 3) {
            if (this.field2740 != arg0) {
                this.field2740 = arg0;
                if (this.field2673 == 3) {
                    this.method1194(5888);
                }
            }
            ++field2560;
        }
    }

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "(I)V", line = 122)
    private final void method1197(int arg0) {
        ++field2432;
        class742.field10222[2] = this.field2726 * this.field2683;
        int var2 = 121 % ((-64 - arg0) / 33);
        class742.field10222[1] = this.field2750 * this.field2726;
        class742.field10222[0] = this.field2738 * this.field2726;
        class742.field10222[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class742.field10222, 0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIF)Lsca;", line = 137)
    public final class251 method138(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field2403;
        return new class14(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "()I", line = 145)
    public final int method181() {
        ++field2459;
        return this.field2629 + this.field2626 + this.field2627;
    }

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "()Z", line = 154)
    public final boolean method147() {
        ++field2404;
        return this.field2600 != null && this.field2600.method2247(1);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[I[I)Laa;", line = 165)
    public final class87 method248(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field2535;
        return class689.method3914(arg1, arg0, (byte) -1, this, arg2, arg3);
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(Z)V", line = 173)
    private final void method1198(boolean arg0) {
        this.field2680 = (float) (-this.field2655 + this.field2694) - this.field2659;
        ++field2463;
        if (arg0) {
            this.field2716 = this.field2680 - (float) this.field2651 * this.field2687;
            if ((float) this.field2731 > this.field2716) {
                this.field2716 = (float) this.field2731;
            }
            OpenGL.glFogf(2915, this.field2716);
            OpenGL.glFogf(2916, this.field2680);
            class742.field10222[2] = (float) class407.method2490(255, this.field2685) / 255.0F;
            class742.field10222[1] = (float) class407.method2490(this.field2685, 65280) / 65280.0F;
            class742.field10222[0] = (float) class407.method2490(16711680, this.field2685) / 1.671168E7F;
            OpenGL.glFogfv(2918, class742.field10222, 0);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V", line = 196)
    public static void method1199(byte arg0) {
        field2513 = null;
        field2596 = null;
        field2593 = null;
        field2417 = null;
        if (arg0 >= -78) {
            method1199((byte) 3);
        }
    }

    @OriginalMember(owner = "client!pq", name = "X", descriptor = "(I)V", line = 209)
    public final void method166(int arg0) {
        ++field2578;
        this.field2610 = 0;
        while (arg0 > 1) {
            ++this.field2610;
            arg0 >>= 1;
        }
        this.field2611 = 1 << this.field2610;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII)V", line = 226)
    public final void method197(int arg0, int arg1, int arg2, int arg3) {
        ++field2580;
        this.field2606.method3759(arg0, arg3, arg1, (byte) 76, arg2);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFF)V", line = 236)
    public final void method186(float arg0, float arg1, float arg2) {
        ++field2583;
        class231.field3483 = arg2;
        class164.field2098 = arg0;
        class675.field9457 = arg1;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "()Z", line = 250)
    public final boolean method222() {
        ++field2422;
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "()Z", line = 259)
    public final boolean method201() {
        ++field2497;
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V", line = 267)
    private final void method1200(byte arg0) {
        if (arg0 == 61) {
            if (this.field2732 && ~this.field2651 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
            ++field2393;
        }
    }

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "(I)V", line = 284)
    private final void method1201(int arg0) {
        if (this.field2739) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field2739 = false;
        }
        ++field2516;
        if (arg0 != 13441) {
            this.method189(-19, -30, 7, -43, -63, -108, -51, 50, 20);
        }
    }

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "()I", line = 302)
    public final int method143() {
        ++field2472;
        return 4;
    }

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "()Z", line = 312)
    public final boolean method161() {
        ++field2545;
        return this.field2691 && (!this.method147() || this.field2710);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZ)V", line = 322)
    public final void method1202(int arg0, boolean arg1) {
        int var3 = 63 / ((1 - arg0) / 60);
        ++field2496;
        if (this.field2711 != arg1) {
            this.field2711 = arg1;
            this.method1275((byte) -116);
            this.field2639 &= -8;
        }
    }

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "(II)V", line = 344)
    public final void method146(int arg0, int arg1) {
        ++field2526;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IJ)V", line = 351)
    public final synchronized void method1203(int arg0, long arg1) {
        ++field2418;
        class69 var4 = new class69();
        var4.field762 = arg1;
        this.field2635.method1039(var4, 0);
        if (arg0 != 23920) {
            this.field2685 = -25;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)I", line = 366)
    public final int method1204(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2699 = true;
        }
        ++field2586;
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (~arg1 != -5124 && ~arg1 != -5123) {
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

    @OriginalMember(owner = "client!pq", name = "U", descriptor = "(IIIII)V", line = 387)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2482;
        this.method1218(0);
        this.method1241(arg4, (byte) 126);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "()Z", line = 407)
    public final boolean method135() {
        ++field2584;
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIIID)V", line = 415)
    public final void method235(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field2556;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "()V", line = 423)
    public final void method167() {
        ++field2449;
        if (this.field2600 != null && this.field2600.method2247(1)) {
            this.field2606.method3754(this.field2600, 8103);
            this.field2603.method3629(-8929);
        }
    }

    @OriginalMember(owner = "client!pq", name = "da", descriptor = "(III[I)V", line = 438)
    public final void method142(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2564;
        float var5 = (float) arg2 * this.field2636.field355 + (float) arg0 * this.field2636.field334 + (float) arg1 * this.field2636.field365 + this.field2636.field366;
        if (!((float) this.field2731 > var5) && !(var5 > (float) this.field2694)) {
            int var6 = (int) (((float) arg2 * this.field2636.field372 + (float) arg0 * this.field2636.field337 + (float) arg1 * this.field2636.field370 + this.field2636.field351) * (float) this.field2696 / var5);
            int var7 = (int) (((float) arg2 * this.field2636.field356 + (float) arg0 * this.field2636.field347 + (float) arg1 * this.field2636.field373 + this.field2636.field357) * (float) this.field2676 / var5);
            if ((float) var6 >= this.field2647 && (float) var6 <= this.field2713 && this.field2664 <= (float) var7 && (float) var7 <= this.field2702) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field2647);
                arg3[1] = (int) ((float) var7 + -this.field2664);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "()I", line = 469)
    public final int method241() {
        ++field2448;
        return this.field2731;
    }

    @OriginalMember(owner = "client!pq", name = "HA", descriptor = "(IIII[I)V", line = 481)
    public final void method251(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field2589;
        float var6 = (float) arg2 * this.field2636.field355 + (float) arg0 * this.field2636.field334 + (float) arg1 * this.field2636.field365 + this.field2636.field366;
        if (!((float) this.field2731 > var6) && !((float) this.field2694 < var6)) {
            int var7 = (int) (((float) arg2 * this.field2636.field372 + (float) arg0 * this.field2636.field337 + (float) arg1 * this.field2636.field370 + this.field2636.field351) * (float) this.field2696 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field2636.field356 + (float) arg0 * this.field2636.field347 + (float) arg1 * this.field2636.field373 + this.field2636.field357) * (float) this.field2676 / (float) arg3);
            if (this.field2647 <= (float) var7 && this.field2713 >= (float) var7 && this.field2664 <= (float) var8 && (float) var8 <= this.field2702) {
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 + -this.field2647);
                arg4[1] = (int) ((float) var8 - this.field2664);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pq", name = "la", descriptor = "()V", line = 513)
    public final void method208() {
        ++field2500;
        this.field2718 = this.field2454;
        this.field2729 = 0;
        this.field2734 = this.field2423;
        this.field2708 = 0;
        OpenGL.glDisable(3089);
        this.method1228(-34848);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BII[BZ)Ljda;", line = 528)
    public final class90 method1205(byte arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        if (arg0 != 11) {
            return null;
        } else {
            ++field2421;
            return (class90) (!this.field2682 || arg4 && !this.field2699 ? new class416(this, arg1, arg3, arg2) : new class232(this, arg1, arg3, arg2, arg4));
        }
    }

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "(I)V", line = 545)
    public final void method180(int arg0) {
        ++field2460;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFBFF)V", line = 553)
    public final void method1206(float arg0, float arg1, byte arg2, float arg3, float arg4) {
        class742.field10222[0] = arg0;
        ++field2573;
        if (arg2 != 122) {
            this.field2673 = 32;
        }
        class742.field10222[1] = arg3;
        class742.field10222[3] = arg4;
        class742.field10222[2] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class742.field10222, 0);
    }

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "(I)V", line = 568)
    private final void method1207(int arg0) {
        ++field2540;
        OpenGL.glDepthMask(this.field2644 && this.field2681);
        if (arg0 != 1) {
            this.method1218(-15);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILvn;)V", line = 580)
    public final void method1208(int arg0, class211 arg1) {
        if (arg0 != 0) {
            this.field2714 = null;
        }
        if (this.field2648 != arg1) {
            if (this.field2682) {
                OpenGL.glBindBufferARB(34962, arg1.method866(-9));
            }
            this.field2648 = arg1;
        }
        ++field2514;
    }

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "(I)V", line = 600)
    public final void method1209(int arg0) {
        if (this.field2639 != 16) {
            this.method1242((byte) -33);
            this.method1234(true, -127);
            this.method1224(2929, true);
            this.method1247(true, (byte) 66);
            this.method1241(1, (byte) 123);
            this.field2639 = 16;
        }
        int var2 = 85 / ((arg0 - 26) / 53);
        ++field2561;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILlha;)V", line = 620)
    public final void method1210(int arg0, class35 arg1) {
        OpenGL.glPushMatrix();
        ++field2441;
        OpenGL.glMultMatrixf(arg1.method281(-27708), arg0);
    }

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "()Z", line = 634)
    public final boolean method156() {
        ++field2484;
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BILjda;II)V", line = 643)
    public final void method1211(byte arg0, int arg1, class90 arg2, int arg3, int arg4) {
        ++field2477;
        int var6 = arg2.method665(true);
        int var7 = arg4 * this.method1204(true, var6);
        this.method1272(arg2, (byte) 110);
        int var8 = -128 / ((arg0 - -68) / 51);
        OpenGL.glDrawElements(arg3, arg1, var6, (long) var7 + arg2.method662(28748));
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)V", line = 661)
    public final void method1212(byte arg0) {
        if (~this.field2639 != -5) {
            this.method1231(5126);
            this.method1234(false, -116);
            this.method1202(-67, false);
            this.method1224(2929, false);
            this.method1247(false, (byte) 35);
            this.method1232(-2, 1);
            this.method1241(1, (byte) 123);
            this.field2639 = 4;
        }
        if (arg0 <= 103) {
            this.method1240(-127, 5, -73, 40);
        }
        ++field2473;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIII)Lok;", line = 684)
    public final class255 method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2577;
        return this.field2727 ? new class693(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BII)V", line = 692)
    public final synchronized void method1213(byte arg0, int arg1, int arg2) {
        ++field2529;
        class324 var4 = new class324(arg1);
        var4.field762 = (long) arg2;
        if (arg0 <= 14) {
            this.method209((class255) null, (class255) null, 0.17901725F, (class255) null);
        }
        this.field2633.method1039(var4, 0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lhw;[Lfm;Z)Lda;", line = 706)
    public final class442 method179(class300 arg0, class279[] arg1, boolean arg2) {
        ++field2486;
        return new class193(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILqaa;)V", line = 715)
    public final void method1214(int arg0, class343 arg1) {
        ++field2566;
        if (arg0 != -13286) {
            this.field2707 = null;
        }
        if (this.field2621 >= 0 && this.field2623[this.field2621] == arg1) {
            this.field2623[this.field2621--] = null;
            arg1.method2174(arg0 + 8182);
            if (~this.field2621 <= -1) {
                this.field2624 = this.field2623[this.field2621];
                this.field2624.method2177((byte) -122);
            } else {
                this.field2624 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "(I)V", line = 739)
    private final void method1215(int arg0) {
        if (arg0 < -12) {
            ++field2490;
            int var2;
            for (var2 = 0; ~var2 > ~this.field2678; ++var2) {
                class251 var3 = this.field2697[var2];
                class139.field1780[0] = (float) var3.method1683(10918);
                int var4 = 16386 - -var2;
                class139.field1780[1] = (float) var3.method1687(1110);
                class139.field1780[2] = (float) var3.method1686(false);
                class139.field1780[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class139.field1780, 0);
                int var5 = var3.method1684(-1);
                float var6 = var3.method1688(37) / 255.0F;
                class139.field1780[1] = var6 * (float) class407.method2490(255, var5 >> 8);
                class139.field1780[0] = var6 * (float) class407.method2490(var5 >> 16, 255);
                class139.field1780[2] = (float) class407.method2490(var5, 255) * var6;
                OpenGL.glLightfv(var4, 4609, class139.field1780, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1685(119) * var3.method1685(78)));
                OpenGL.glEnable(var4);
            }
            while (this.field2756 > var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field2756 = this.field2678;
        }
    }

    @OriginalMember(owner = "client!pq", name = "Y", descriptor = "()[I", line = 784)
    public final int[] method238() {
        ++field2538;
        return new int[] { this.field2693, this.field2656, this.field2696, this.field2676 };
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLqaa;)V", line = 792)
    public final void method1216(byte arg0, class343 arg1) {
        ++field2571;
        if (~this.field2625 <= -4) {
            throw new RuntimeException();
        } else {
            if (arg0 != 77) {
                this.method1272((class90) null, (byte) -17);
            }
            if (~this.field2625 <= -1) {
                this.field2618[this.field2625].method2173(false);
            }
            this.field2619 = this.field2618[++this.field2625] = arg1;
            this.field2619.method2176((byte) -71);
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V", line = 811)
    private final void method1217(byte arg0) {
        ++field2465;
        this.field2479.method117();
        if (arg0 >= -116) {
            this.method1223(70, -128, 68, -116);
        }
    }

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "()V", line = 823)
    public final void method210() {
        OpenGL.glFinish();
        ++field2410;
    }

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "(I)V", line = 831)
    private final void method1218(int arg0) {
        if (this.field2639 != 1) {
            this.method1231(arg0 + 5126);
            this.method1234(false, 52);
            this.method1202(83, false);
            this.method1224(2929, false);
            this.method1247(false, (byte) 29);
            this.method1219((byte) 91, (class539) null);
            this.method1232(-2, 1);
            this.method1263(1, 109);
            this.field2639 = 1;
        }
        ++field2515;
        if (arg0 != 0) {
            this.field2626 = 55;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIILaa;II)V", line = 855)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
        ++field2524;
        class339 var10 = (class339) arg6;
        class227 var11 = var10.field4913;
        this.method1227(0);
        this.method1219((byte) 96, var10.field4913);
        this.method1241(arg5, (byte) 127);
        this.method1230(8448, 7681, false);
        this.method1223(0, 65, 768, 34167);
        float var12 = var11.field3440 / (float) var11.field3437;
        float var13 = var11.field3441 / (float) var11.field3442;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method1223(0, 85, 768, 5890);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIIIII)V", line = 893)
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2563;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            this.method1218(0);
            this.method1241(arg5, (byte) 126);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var11 * var12;
            int var14 = arg8 % (arg6 + arg7);
            float var15 = var10 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var16 = (float) arg6 * var15;
            float var17 = (float) arg6 * var13;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (var14 > arg6) {
                var19 = (float) (-var14 + arg7 + arg6) * var13;
                var18 = (float) (-var14 + arg7 + arg6) * var15;
            } else {
                var20 = (float) (-var14 + arg6) * var15;
                var21 = (float) (-var14 + arg6) * var13;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var15;
            float var25 = (float) arg7 * var13;
            while (true) {
                if (arg2 <= arg0) {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
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

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLwha;)V", line = 1004)
    public final void method1219(byte arg0, class539 arg1) {
        ++field2525;
        class539 var3 = this.field2707[this.field2679];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field7453);
                } else if (~arg1.field7453 != ~var3.field7453) {
                    OpenGL.glDisable(var3.field7453);
                    OpenGL.glEnable(arg1.field7453);
                }
                OpenGL.glBindTexture(arg1.field7453, arg1.method3205(-94));
            } else {
                OpenGL.glDisable(var3.field7453);
            }
            this.field2707[this.field2679] = arg1;
        }
        this.field2639 &= -2;
        if (arg0 < 66) {
            this.method177();
        }
    }

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "(IIIII)V", line = 1041)
    public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1218(0);
        ++field2548;
        this.method1241(arg4, (byte) 123);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIII)V", line = 1063)
    public final void method1220(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg0);
        ++field2430;
        OpenGL.glTexEnvi(8960, arg2 + arg3, arg1);
    }

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "(II)V", line = 1072)
    public final synchronized void method1221(int arg0, int arg1) {
        if (arg0 != 17353) {
            this.field2728 = -106;
        }
        ++field2458;
        class69 var3 = new class69();
        var3.field762 = (long) arg1;
        this.field2634.method1039(var3, 0);
    }

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "(II)V", line = 1086)
    public final synchronized void method1222(int arg0, int arg1) {
        ++field2415;
        int var3 = -74 % ((arg0 - 5) / 44);
        class324 var4 = new class324(arg1);
        this.field2632.method1039(var4, 0);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(IIII)V", line = 1099)
    public final void method1223(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg3);
        ++field2392;
        if (arg1 <= 23) {
            this.field2724 = null;
        }
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "()Z", line = 1111)
    public final boolean method199() {
        ++field2557;
        if (this.field2600 != null) {
            if (!this.field2600.method2247(1)) {
                if (!this.field2606.method3757(this.field2600, 104)) {
                    return false;
                }
                this.field2603.method3629(-8929);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V", line = 1137)
    public final void method237(int arg0) {
        this.method1217((byte) -119);
        ++field2400;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IZ)V", line = 1146)
    public final void method1224(int arg0, boolean arg1) {
        ++field2569;
        if (arg0 == 2929) {
            if (!this.field2638 != !arg1) {
                if (!arg1) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field2639 &= -32;
                this.field2638 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIIIII)V", line = 1168)
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1218(0);
        ++field2506;
        this.method1241(arg5, (byte) 125);
        float var7 = (float) arg2 - (float) arg0;
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

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "(B)V", line = 1210)
    public final void method1225(byte arg0) {
        ++field2534;
        if (~this.field2673 != -1) {
            this.field2639 &= -32;
            this.field2673 = 0;
        }
        if (arg0 < 80) {
            this.field2625 = 113;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lcn;Lrca;)Lmia;", line = 1227)
    public final class684 method247(class621 arg0, class36 arg1) {
        ++field2542;
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "(B)V", line = 1239)
    private final void method1226(byte arg0) {
        ++field2539;
        OpenGL.glViewport(this.field2715, this.field2717, this.field2454, this.field2423);
        if (arg0 <= 82) {
            this.method242(-61, 41, -38, 21);
        }
    }

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "(I)V", line = 1254)
    public final void method1227(int arg0) {
        ++field2440;
        if (arg0 != 0) {
            this.method1196(-0.35661033F, -9);
        }
        if (~this.field2639 != -3) {
            this.method1231(5126);
            this.method1234(false, -112);
            this.method1202(arg0 ^ -71, false);
            this.method1224(2929, false);
            this.method1247(false, (byte) 92);
            this.method1232(-2, arg0 + 1);
            this.field2639 = 2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "(I)V", line = 1276)
    private final void method1228(int arg0) {
        this.field2647 = (float) (-this.field2693 + this.field2729);
        this.field2702 = (float) (-this.field2656 + this.field2734);
        if (arg0 == -34848) {
            this.field2664 = (float) (-this.field2656 + this.field2708);
            ++field2558;
            this.field2713 = (float) (this.field2718 - this.field2693);
        }
    }

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "(I)V", line = 1292)
    private final void method1229(int arg0) {
        class742.field10222[1] = this.field2750 * this.field2689;
        ++field2453;
        class742.field10222[0] = this.field2738 * this.field2689;
        class742.field10222[2] = this.field2689 * this.field2683;
        class742.field10222[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class742.field10222, 0);
        class742.field10222[1] = -this.field2744 * this.field2750;
        class742.field10222[2] = -this.field2744 * this.field2683;
        class742.field10222[arg0] = -this.field2744 * this.field2738;
        class742.field10222[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class742.field10222, 0);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIZ)V", line = 1311)
    public final void method1230(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method178(-34);
        }
        if (~this.field2679 == -1) {
            boolean var4 = false;
            if (~this.field2705 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var4 = true;
                this.field2705 = arg1;
            }
            if (~this.field2692 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field2692 = arg0;
            }
            if (var4) {
                this.field2639 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        }
        ++field2414;
    }

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "(I)V", line = 1354)
    private final void method1231(int arg0) {
        ++field2568;
        if (this.field2673 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field2454 > 0 && ~this.field2423 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field2454, (double) this.field2423, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field2673 = 1;
            this.field2639 &= -25;
        }
        if (arg0 != 5126) {
            this.method1266(-13, 44, -52, true, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "(II)V", line = 1378)
    public final void method1232(int arg0, int arg1) {
        this.method1260(true, arg1 + 42, arg0);
        ++field2541;
        if (arg1 != 1) {
            this.field2657 = true;
        }
    }

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "(III[I)V", line = 1390)
    public final void method196(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2475;
        float var5 = (float) arg2 * this.field2636.field355 + (float) arg0 * this.field2636.field334 + (float) arg1 * this.field2636.field365 + this.field2636.field366;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field2636.field372 + (float) arg0 * this.field2636.field337 + (float) arg1 * this.field2636.field370 + this.field2636.field351) * (float) this.field2696 / var5);
            arg3[0] = (int) ((float) var6 - this.field2647);
            int var7 = (int) (((float) arg2 * this.field2636.field356 + (float) arg0 * this.field2636.field347 + (float) arg1 * this.field2636.field373 + this.field2636.field357) * (float) this.field2676 / var5);
            arg3[1] = (int) ((float) var7 + -this.field2664);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "(I)V", line = 1415)
    private final void method1233(int arg0) {
        ++field2520;
        this.field2706[14] = this.field2704;
        if (arg0 != 0) {
            this.method226();
        }
        this.field2706[10] = this.field2754;
        this.field2751 = (float) this.field2694;
        this.field2723 = (this.field2706[14] - (float) this.field2694) / this.field2706[10];
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(Z)V", line = 1433)
    public final void method239(boolean arg0) {
        ++field2406;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(ZI)V", line = 1443)
    public final void method1234(boolean arg0, int arg1) {
        if (!this.field2732 != !arg0) {
            this.field2732 = arg0;
            this.method1200((byte) 61);
            this.field2639 &= -32;
        }
        ++field2549;
        int var3 = 102 % ((arg1 - -51) / 58);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "()Z", line = 1464)
    public final boolean method162() {
        ++field2507;
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "()Z", line = 1474)
    public final boolean method223() {
        ++field2502;
        return this.field2600 != null && (this.field2605 <= 1 || this.field2710);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLjaclib/memory/Buffer;ZII)Lvn;", line = 1482)
    public final class211 method1235(byte arg0, Buffer arg1, boolean arg2, int arg3, int arg4) {
        ++field2488;
        if (arg0 != -31) {
            this.field2641 = -79;
        }
        return (class211) (!this.field2682 || arg2 && !this.field2699 ? new class123(this, arg3, arg1) : new class352(this, arg3, arg1, arg4, arg2));
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(IZ)V", line = 1500)
    public final void method1236(int arg0, boolean arg1) {
        ++field2439;
        if (this.field2677 == !arg1) {
            this.field2677 = arg1;
            this.method1275((byte) -49);
        }
        if (arg0 != 2) {
            this.method1237(true);
        }
    }

    @OriginalMember(owner = "client!pq", name = "EA", descriptor = "(IIII)V", line = 1518)
    public final void method217(int arg0, int arg1, int arg2, int arg3) {
        ++field2576;
        if (!this.field2757) {
            throw new RuntimeException("");
        } else {
            this.field2752 = arg1;
            this.field2671 = arg0;
            this.field2709 = arg3;
            this.field2720 = arg2;
            if (this.field2668) {
                this.field2601.field8628.method2193(0);
                this.field2601.field8628.method2194(-10727);
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "(Z)V", line = 1544)
    public final void method1237(boolean arg0) {
        ++field2591;
        if (this.field2639 != 8) {
            this.method1258((byte) 56);
            this.method1234(true, 52);
            this.method1224(2929, true);
            this.method1247(true, (byte) 115);
            this.method1241(1, (byte) 123);
            this.field2639 = 8;
        }
        if (!arg0) {
            this.field2638 = false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "(I)V", line = 1567)
    public final void method195(int arg0) {
        ++field2399;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFI)V", line = 1578)
    public final void method1238(float arg0, float arg1, int arg2) {
        this.field2659 = arg1;
        ++field2398;
        this.field2687 = arg0;
        if (arg2 != 0) {
            this.method1203(27, 74L);
        }
        this.method1198(true);
    }

    @OriginalMember(owner = "client!pq", name = "na", descriptor = "(IIII)[I", line = 1592)
    public final int[] method243(int arg0, int arg1, int arg2, int arg3) {
        ++field2434;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field2423 - arg1 - var6, arg2, 1, 32993, this.field2728, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 1614)
    public class194(Canvas arg0, class101 arg1, int arg2) {
        super(arg1);
        new class179();
        new class638(16);
        this.field2628 = new class165();
        this.field2630 = new class165();
        this.field2631 = new class165();
        this.field2632 = new class165();
        this.field2633 = new class165();
        this.field2634 = new class165();
        this.field2635 = new class165();
        this.field2636 = new class35();
        this.field2645 = new class35();
        this.field2646 = new class35();
        this.field2649 = -1.0F;
        this.field2659 = 0.0F;
        this.field2651 = -1;
        this.field2683 = 1.0F;
        this.field2676 = 512;
        this.field2655 = 0;
        this.field2697 = new class251[class464.field6474];
        this.field2661 = -1.0F;
        this.field2650 = new float[4];
        this.field2689 = -1.0F;
        this.field2668 = false;
        this.field2718 = 0;
        this.field2693 = 0;
        this.field2708 = 0;
        this.field2721 = -1;
        this.field2709 = 0;
        this.field2706 = new float[16];
        this.field2715 = 0;
        this.field2722 = new float[4];
        this.field2731 = 50;
        this.field2745 = new float[4];
        this.field2723 = 3584.0F;
        this.field2685 = -1;
        this.field2729 = 0;
        this.field2705 = 8448;
        this.field2744 = -1.0F;
        this.field2720 = -1;
        this.field2692 = 8448;
        this.field2717 = 0;
        this.field2696 = 512;
        this.field2738 = 1.0F;
        this.field2750 = 1.0F;
        this.field2752 = -1;
        this.field2740 = 1.0F;
        this.field2656 = 0;
        this.field2701 = new float[4];
        this.field2687 = 1.0F;
        this.field2681 = true;
        this.field2694 = 3584;
        this.field2734 = 0;
        this.field2751 = 3584.0F;
        this.field2686 = new class296(8192);
        this.field2759 = new int[1];
        this.field2758 = new int[1];
        this.field2762 = new int[1];
        this.field2763 = new byte[16384];
        this.field2605 = arg2;
        this.field2528 = this.field2450 = arg0;
        if (!class161.method1027(46, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class161.method1027(104, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field2479 = new OpenGL();
                this.field2487 = this.field2409 = this.field2479.init(arg0, 8, 8, 8, 24, 0, this.field2605);
                if (~this.field2409 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1249((byte) -60);
                    int var4 = this.method1255(false);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field2728 = !this.field2748 ? 5121 : 33639;
                        if (~this.field2749.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class24.method105(this.field2749.replace('/', ' '), 19478, ' ');
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class623.method3585(0, var10.substring(1, 3))) {
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
                                            if (var10.length() >= 4 && class623.method3585(0, var10.substring(0, 4))) {
                                                var5 = class157.method1014(var10.substring(0, 4), -14534);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field2657 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field2682 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field2698 = false;
                                }
                            }
                            this.field2736 &= this.field2479.method118("GL_ARB_half_float_pixel");
                            this.field2670 = true;
                            this.field2699 = this.field2682;
                        }
                        if (~this.field2675.indexOf("intel") != 0) {
                            this.field2695 = false;
                        }
                        this.field2660 = !this.field2675.equals("s3 graphics");
                        if (this.field2682) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class691.method3920(true, false, -94557789);
                        this.field2615 = true;
                        this.field2603 = new class633(this, super.field6556);
                        this.method1265(8705);
                        this.field2613 = new class627(this);
                        this.field2606 = new class655(this);
                        if (this.field2606.method3758(-11506)) {
                            this.field2600 = new class425(this);
                            if (!this.field2600.method2563(-15)) {
                                this.field2600.method2241((byte) -106);
                                this.field2600 = null;
                            }
                        }
                        this.field2601 = new class613(this);
                        this.method1261(-124);
                        this.method1245((byte) -75);
                        this.method250();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method205();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(IIZ)V", line = 1763)
    public final void method1239(int arg0, int arg1, boolean arg2) {
        this.field2717 = arg0;
        if (!arg2) {
            this.field2705 = 77;
        }
        ++field2594;
        this.field2715 = arg1;
        this.method1226((byte) 95);
        this.method1268(0);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(IIII)V", line = 1778)
    public final void method1240(int arg0, int arg1, int arg2, int arg3) {
        ++field2469;
        OpenGL.glDrawArrays(arg0, arg1, arg3);
        if (arg2 != 0) {
            this.field2705 = -124;
        }
    }

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "()Z", line = 1791)
    public final boolean method206() {
        ++field2396;
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "XA", descriptor = "()I", line = 1799)
    public final int method177() {
        ++field2537;
        return this.field2694;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)Lrca;", line = 1807)
    public final class36 method246(int arg0, int arg1) {
        ++field2521;
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "(Z)V", line = 1815)
    public final void method211(boolean arg0) {
        ++field2582;
        this.field2681 = arg0;
        this.method1207(1);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IB)V", line = 1826)
    public final void method1241(int arg0, byte arg1) {
        ++field2574;
        if (arg1 >= 122) {
            if (~this.field2641 != ~arg0) {
                boolean var3;
                byte var4;
                boolean var5;
                if (~arg0 == -2) {
                    var3 = true;
                    var4 = 1;
                    var5 = true;
                } else if (~arg0 != -3) {
                    if (arg0 != 128) {
                        var5 = true;
                        var4 = 0;
                        var3 = false;
                    } else {
                        var4 = 3;
                        var3 = true;
                        var5 = true;
                    }
                } else {
                    var5 = true;
                    var3 = false;
                    var4 = 2;
                }
                if (this.field2643 != var5) {
                    OpenGL.glColorMask(var5, var5, var5, true);
                    this.field2643 = var5;
                }
                if (this.field2640 != var3) {
                    if (!var3) {
                        OpenGL.glDisable(3008);
                    } else {
                        OpenGL.glEnable(3008);
                    }
                    this.field2640 = var3;
                }
                if (this.field2642 != var4) {
                    if (var4 == 1) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(770, 771);
                    } else if (var4 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var4 == -4) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                    this.field2642 = var4;
                }
                this.field2641 = arg0;
                this.field2639 &= -29;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "(B)V", line = 1918)
    private final void method1242(byte arg0) {
        if (arg0 != -33) {
            this.field2750 = -1.1363162F;
        }
        if (this.field2673 != 3) {
            this.field2673 = 3;
            this.method1194(5888);
            this.method1192(0);
            this.field2639 &= -8;
        }
        ++field2489;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 1938)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method1218(0);
        ++field2501;
        this.method1241(arg12, (byte) 123);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "(I)V", line = 1966)
    private final void method1243(int arg0) {
        ++field2407;
        float[] var2 = this.field2706;
        float var3 = (float) (-this.field2693 * this.field2731) / (float) this.field2696;
        float var4 = (float) ((-this.field2693 + this.field2454) * this.field2731) / (float) this.field2696;
        int var5 = 54 / ((arg0 - -8) / 53);
        float var6 = (float) (this.field2731 * this.field2656) / (float) this.field2676;
        float var7 = (float) ((this.field2656 - this.field2423) * this.field2731) / (float) this.field2676;
        if (var3 != var4 && var6 != var7) {
            float var8 = (float) this.field2731 * 2.0F;
            var2[6] = 0.0F;
            var2[0] = var8 / (-var3 + var4);
            var2[13] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[15] = 0.0F;
            var2[5] = var8 / (var6 - var7);
            var2[10] = this.field2754 = (float) (-(this.field2731 + this.field2694)) / (float) (this.field2694 - this.field2731);
            var2[11] = -1.0F;
            var2[2] = 0.0F;
            var2[14] = this.field2704 = -((float) this.field2694 * var8) / (float) (-this.field2731 + this.field2694);
            var2[7] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[9] = (var6 + var7) / (-var7 + var6);
            var2[1] = 0.0F;
            var2[12] = 0.0F;
        } else {
            var2[12] = 0.0F;
            var2[1] = 0.0F;
            var2[13] = 0.0F;
            var2[15] = 1.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
            var2[7] = 0.0F;
            var2[2] = 0.0F;
            var2[4] = 0.0F;
            var2[14] = 0.0F;
            var2[10] = 1.0F;
            var2[6] = 0.0F;
            var2[11] = 0.0F;
            var2[0] = 1.0F;
            var2[9] = 0.0F;
            var2[8] = 0.0F;
        }
        this.method1233(0);
    }

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "(I)Ljka;", line = 2027)
    public final class734 method1244(int arg0) {
        if (arg0 > -124) {
            return null;
        } else {
            ++field2531;
            return this.field2730 == null ? null : this.field2730.method1105(-1);
        }
    }

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "(B)V", line = 2041)
    private final void method1245(byte arg0) {
        if (this.field2528 == null) {
            this.field2598 = this.field2452 = 0;
        } else {
            Dimension var2 = this.field2528.getSize();
            this.field2598 = var2.width;
            this.field2452 = var2.height;
        }
        ++field2436;
        int var3 = 7 % ((-19 - arg0) / 54);
        if (this.field2624 == null) {
            this.field2454 = this.field2598;
            this.field2423 = this.field2452;
            this.method1226((byte) 85);
        }
        this.method1225((byte) 107);
        this.method208();
    }

    @OriginalMember(owner = "client!pq", name = "pa", descriptor = "()V", line = 2071)
    public final void method244() {
        ++field2532;
        this.field2757 = false;
    }

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "(I)V", line = 2083)
    public final void method1246(int arg0) {
        if (arg0 >= 33) {
            OpenGL.glPopMatrix();
            ++field2597;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZB)V", line = 2094)
    public final void method1247(boolean arg0, byte arg1) {
        ++field2523;
        if (this.field2644 != arg0) {
            this.field2644 = arg0;
            this.method1207(1);
            this.field2639 &= -32;
        }
        if (arg1 < 2) {
            this.method214();
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lok;Lok;FLok;)Lok;", line = 2113)
    public final class255 method209(class255 arg0, class255 arg1, float arg2, class255 arg3) {
        ++field2550;
        if (arg0 != null && arg1 != null && this.field2727 && this.field2695) {
            class676 var5 = null;
            class173 var6 = (class173) arg0;
            class173 var7 = (class173) arg1;
            class734 var8 = var6.method1105(-1);
            class734 var9 = var7.method1105(-1);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field10118 >= ~var9.field10118 ? var9.field10118 : var8.field10118;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class676) {
                    class676 var11 = (class676) arg3;
                    if (~var11.method3852(-23915) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class676(this, var10);
                }
                if (var5.method3850(var8, -15437, var9, arg2)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lls;Lls;Lls;BLls;)V", line = 2159)
    public final void method1248(class166 arg0, class166 arg1, class166 arg2, byte arg3, class166 arg4) {
        ++field2435;
        if (arg0 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1208(0, arg0.field2125);
            OpenGL.glVertexPointer(arg0.field2119, arg0.field2121, this.field2648.method867(true), this.field2648.method869(false) - -((long) arg0.field2122));
            OpenGL.glEnableClientState(32884);
        }
        if (arg4 != null) {
            this.method1208(0, arg4.field2125);
            OpenGL.glNormalPointer(arg4.field2121, this.field2648.method867(true), this.field2648.method869(false) - -((long) arg4.field2122));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        int var6 = 95 % ((58 - arg3) / 40);
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method1208(0, arg2.field2125);
            OpenGL.glColorPointer(arg2.field2119, arg2.field2121, this.field2648.method867(true), this.field2648.method869(false) + (long) arg2.field2122);
            OpenGL.glEnableClientState(32886);
        }
        if (arg1 != null) {
            this.method1208(0, arg1.field2125);
            OpenGL.glTexCoordPointer(arg1.field2119, arg1.field2121, this.field2648.method867(true), this.field2648.method869(false) - -((long) arg1.field2122));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "(B)V", line = 2204)
    private final void method1249(byte arg0) {
        ++field2413;
        int var2 = 0;
        if (arg0 >= -50) {
            this.field2727 = true;
        }
        while (!this.field2479.method119()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class730.method4066((byte) -45, 1000L);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)I", line = 2227)
    public final int method1250(byte arg0, int arg1) {
        ++field2428;
        if (arg0 >= -122) {
            return -9;
        } else if (arg1 != 1) {
            if (arg1 != 0) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
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
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lfm;Z)Lho;", line = 2257)
    public final class318 method192(class279 arg0, boolean arg1) {
        ++field2570;
        int[] var3 = new int[arg0.field4014 * arg0.field4008];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4009 != null) {
            for (int var6 = 0; arg0.field4008 > var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field4014; ++var7) {
                    var3[var5++] = class613.method3544(arg0.field4012[class407.method2490(arg0.field4010[var4], 255)], arg0.field4009[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; var8 < arg0.field4008; ++var8) {
                for (int var10 = 0; var10 < arg0.field4014; ++var10) {
                    int var11 = arg0.field4012[255 & arg0.field4010[var4++]];
                    var3[var5++] = var11 != 0 ? class613.method3544(var11, -16777216) : 0;
                }
            }
        }
        class318 var9 = this.method2815(var3, (byte) -39, arg0.field4014, arg0.field4008, arg0.field4014, 0);
        var9.method741(arg0.field4016, arg0.field4011, arg0.field4013, arg0.field4015);
        return var9;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([IIIIIZ)Lho;", line = 2319)
    public final class318 method182(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2494;
        return new class680(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILqaa;)V", line = 2327)
    public final void method1251(int arg0, class343 arg1) {
        ++field2508;
        if (~this.field2621 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field2621 <= arg0) {
                this.field2623[this.field2621].method2174(-5104);
            }
            this.field2624 = this.field2623[++this.field2621] = arg1;
            this.field2624.method2177((byte) -107);
        }
    }

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "(I)V", line = 2344)
    public final void method170(int arg0) {
        ++field2536;
        this.method1249((byte) -124);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIZZ)V", line = 2355)
    public final void method1252(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg1 == -27776) {
            if (this.field2672 != arg0 || !this.field2668 != !this.field2757) {
                class470 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = !this.field2757 ? 0 : 3;
                if (~arg0 > -1) {
                    this.method1201(13441);
                } else {
                    var5 = this.field2603.method3627(arg0, false);
                    class744 var10 = super.field6556.method581(arg1 ^ 14492, arg0);
                    if (var10.field10259 == 0 && var10.field10268 == 0) {
                        this.method1201(13441);
                    } else {
                        int var11 = var10.field10265 ? 64 : 128;
                        int var12 = var11 * 50;
                        this.method1254((float) (this.field2614 % var12 * var10.field10268) / (float) var12, -116, 0.0F, (float) (this.field2614 % var12 * var10.field10259) / (float) var12);
                    }
                    var6 = var10.field10256;
                    if (!this.field2757) {
                        var8 = var10.field10267;
                        var9 = var10.field10273;
                        var7 = var10.field10257;
                    }
                }
                this.field2601.method3545(var7, arg2, var9, arg3, arg1 ^ 27775, var8);
                if (!this.field2601.method3547(var6, (byte) 92, var5)) {
                    this.method1219((byte) 70, var5);
                    this.method1263(var6, arg1 + 27875);
                }
                this.field2672 = arg0;
                this.field2668 = this.field2757;
            }
            ++field2443;
            this.field2639 &= -8;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V", line = 2421)
    public final void method203(boolean arg0) {
        ++field2447;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLlha;)V", line = 2430)
    public final void method1253(byte arg0, class35 arg1) {
        if (arg0 != 3) {
            this.field2684 = null;
        }
        OpenGL.glLoadMatrixf(arg1.method281(-27708), 0);
        ++field2433;
    }

    @OriginalMember(owner = "client!pq", name = "za", descriptor = "(IIIII)V", line = 2442)
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2438;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (~(arg0 - -arg2) <= ~this.field2729 && ~this.field2718 <= ~(-arg2 + arg0) && ~(arg1 + arg2) <= ~this.field2708 && ~this.field2734 <= ~(-arg2 + arg1)) {
            this.method1218(0);
            this.method1241(arg4, (byte) 127);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field2661 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field2649 >= (float) var8) {
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
                int var10 = class47.method385(var9, -110);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class281.field4029[var11] * (float) arg2 + var6, class281.field4032[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FIFF)V", line = 2515)
    private final void method1254(float arg0, int arg1, float arg2, float arg3) {
        ++field2429;
        OpenGL.glMatrixMode(5890);
        if (this.field2739) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg0, arg2);
        OpenGL.glMatrixMode(5888);
        this.field2739 = true;
        int var5 = 75 / ((arg1 - 2) / 43);
    }

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "(III)V", line = 2531)
    public final void method255(int arg0, int arg1, int arg2) {
        ++field2405;
        if (~this.field2685 != ~arg0 || this.field2651 != arg1 || this.field2655 != arg2) {
            this.field2651 = arg1;
            this.field2685 = arg0;
            this.field2655 = arg2;
            this.method1198(true);
            this.method1200((byte) 61);
        }
    }

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "(Z)I", line = 2549)
    private final int method1255(boolean arg0) {
        ++field2402;
        int var2 = 0;
        this.field2675 = OpenGL.glGetString(7936).toLowerCase();
        this.field2749 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field2675.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field2675.indexOf("brian paul") != -1 || ~this.field2675.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class24.method105(var3.replace('.', ' '), 19478, ' ');
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class157.method1014(var4[0], -14534);
                int var6 = class157.method1014(var4[1], -14534);
                this.field2725 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field2725 < 12) {
            var2 |= 2;
        }
        if (!this.field2479.method118("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field2479.method118("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field2666 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field2667 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field2658 = var7[0];
        if (~this.field2666 > -3 || ~this.field2667 > -3 || this.field2658 < 2) {
            var2 |= 16;
        }
        this.field2748 = Stream.method2346();
        this.field2719 = this.field2479.arePbuffersAvailable();
        this.field2682 = this.field2479.method118("GL_ARB_vertex_buffer_object");
        this.field2691 = this.field2479.method118("GL_ARB_multisample");
        this.field2737 = this.field2479.method118("GL_ARB_vertex_program");
        this.field2479.method118("GL_ARB_fragment_program");
        this.field2663 = this.field2479.method118("GL_ARB_vertex_shader");
        this.field2747 = this.field2479.method118("GL_ARB_fragment_shader");
        this.field2698 = this.field2479.method118("GL_EXT_texture3D");
        this.field2736 = this.field2479.method118("GL_ARB_texture_rectangle");
        this.field2727 = this.field2479.method118("GL_ARB_texture_cube_map");
        this.field2657 = this.field2479.method118("GL_ARB_texture_float");
        this.field2735 = arg0;
        this.field2695 = this.field2479.method118("GL_EXT_framebuffer_object");
        this.field2753 = this.field2479.method118("GL_EXT_framebuffer_blit");
        this.field2741 = this.field2479.method118("GL_EXT_framebuffer_multisample");
        this.field2710 = this.field2753 & this.field2741;
        this.field2712 = class528.field7246.startsWith("mac");
        OpenGL.glGetFloatv(2834, class742.field10222, 0);
        this.field2649 = class742.field10222[1];
        this.field2661 = class742.field10222[0];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)V", line = 2633)
    public final synchronized void method1256(int arg0, byte arg1, int arg2) {
        ++field2575;
        if (arg1 != -92) {
            this.method1212((byte) -40);
        }
        class324 var4 = new class324(arg2);
        var4.field762 = (long) arg0;
        this.field2631.method1039(var4, 0);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(BI)I", line = 2649)
    public final int method1257(byte arg0, int arg1) {
        ++field2595;
        if (~arg1 != -6407 && arg1 != 6409) {
            if (arg1 != 6410 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 != 6408 && ~arg1 != -34848) {
                    if (arg1 != 34843) {
                        if (arg1 != 34842) {
                            if (~arg1 != -6403) {
                                if (arg1 == 6401) {
                                    return 1;
                                } else {
                                    if (arg0 >= -56) {
                                        this.field2664 = -0.798495F;
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

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V", line = 2693)
    public final synchronized void method232(int arg0) {
        ++field2498;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field2630.method1044(21972)) {
            class324 var12 = (class324) this.field2630.method1034(20791);
            class100.field1161[var2++] = (int) var12.field762;
            this.field2627 -= var12.field4575;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class100.field1161, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class100.field1161, 0);
            var2 = 0;
        }
        while (!this.field2631.method1044(21972)) {
            class324 var11 = (class324) this.field2631.method1034(20791);
            class100.field1161[var2++] = (int) var11.field762;
            this.field2626 -= var11.field4575;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class100.field1161, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class100.field1161, 0);
            var2 = 0;
        }
        while (!this.field2632.method1044(21972)) {
            class324 var10 = (class324) this.field2632.method1034(20791);
            class100.field1161[var2++] = var10.field4575;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class100.field1161, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class100.field1161, 0);
            var2 = 0;
        }
        while (!this.field2633.method1044(21972)) {
            class324 var9 = (class324) this.field2633.method1034(20791);
            class100.field1161[var2++] = (int) var9.field762;
            this.field2629 -= var9.field4575;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class100.field1161, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class100.field1161, 0);
            boolean var4 = false;
        }
        while (!this.field2628.method1044(21972)) {
            class324 var8 = (class324) this.field2628.method1034(20791);
            OpenGL.glDeleteLists((int) var8.field762, var8.field4575);
        }
        while (!this.field2634.method1044(21972)) {
            class69 var7 = this.field2634.method1034(20791);
            OpenGL.glDeleteProgramARB((int) var7.field762);
        }
        while (!this.field2635.method1044(21972)) {
            class69 var6 = this.field2635.method1034(20791);
            OpenGL.glDeleteObjectARB(var6.field762);
        }
        while (!this.field2628.method1044(21972)) {
            class324 var5 = (class324) this.field2628.method1034(20791);
            OpenGL.glDeleteLists((int) var5.field762, var5.field4575);
        }
        this.field2603.method3630(5);
        if (~this.method181() < -100663297 && ~(this.field2637 + 60000L) > ~class683.method3903((byte) 4)) {
            System.gc();
            this.field2637 = class683.method3903((byte) 4);
        }
        this.field2614 = var3;
    }

    @OriginalMember(owner = "client!pq", name = "KA", descriptor = "(IIII)V", line = 2860)
    public final void method225(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        ++field2559;
        if (arg3 > this.field2423) {
            arg3 = this.field2423;
        }
        if (arg2 > this.field2454) {
            arg2 = this.field2454;
        }
        this.field2729 = arg0;
        this.field2708 = arg1;
        this.field2718 = arg2;
        this.field2734 = arg3;
        OpenGL.glEnable(3089);
        this.method1228(-34848);
        this.method1268(0);
    }

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "(B)V", line = 2889)
    private final void method1258(byte arg0) {
        ++field2554;
        if (arg0 != 56) {
            this.field2750 = 0.45433617F;
        }
        if (this.field2673 != 2) {
            this.field2673 = 2;
            this.method1271(-111);
            this.method1192(0);
            this.field2639 &= -8;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2908)
    public final class418 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2455;
        return new class222(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(IIIIII)V", line = 2916)
    public final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2572;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1218(0);
        this.method1241(arg5, (byte) 125);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2691) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field2691) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([I)V", line = 2948)
    public final void method218(int[] arg0) {
        arg0[0] = this.field2454;
        ++field2425;
        arg0[1] = this.field2423;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2957)
    public final void method168(Canvas arg0) {
        ++field2424;
        if (this.field2450 == arg0) {
            throw new RuntimeException();
        } else if (this.field2408.containsKey(arg0)) {
            Long var2 = (Long) this.field2408.get(arg0);
            this.field2479.releaseSurface(arg0, var2);
            this.field2408.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lza;)V", line = 2977)
    public final void method165(class731 arg0) {
        this.field2612 = ((class462) arg0).field6459;
        ++field2394;
        if (this.field2665 == null) {
            class296 var2 = new class296(80);
            if (!this.field2748) {
                var2.method1942(-1.0F, -68);
                var2.method1942(-1.0F, -43);
                var2.method1942(0.0F, -19);
                var2.method1942(0.0F, -38);
                var2.method1942(1.0F, -27);
                var2.method1942(1.0F, -72);
                var2.method1942(-1.0F, -45);
                var2.method1942(0.0F, -16);
                var2.method1942(1.0F, -108);
                var2.method1942(1.0F, -99);
                var2.method1942(1.0F, -90);
                var2.method1942(1.0F, -29);
                var2.method1942(0.0F, -20);
                var2.method1942(1.0F, -56);
                var2.method1942(0.0F, -101);
                var2.method1942(-1.0F, -83);
                var2.method1942(1.0F, -86);
                var2.method1942(0.0F, -30);
                var2.method1942(0.0F, -86);
                var2.method1942(0.0F, -35);
            } else {
                var2.method1943(-21171, -1.0F);
                var2.method1943(-21171, -1.0F);
                var2.method1943(-21171, 0.0F);
                var2.method1943(-21171, 0.0F);
                var2.method1943(-21171, 1.0F);
                var2.method1943(-21171, 1.0F);
                var2.method1943(-21171, -1.0F);
                var2.method1943(-21171, 0.0F);
                var2.method1943(-21171, 1.0F);
                var2.method1943(-21171, 1.0F);
                var2.method1943(-21171, 1.0F);
                var2.method1943(-21171, 1.0F);
                var2.method1943(-21171, 0.0F);
                var2.method1943(-21171, 1.0F);
                var2.method1943(-21171, 0.0F);
                var2.method1943(-21171, -1.0F);
                var2.method1943(-21171, 1.0F);
                var2.method1943(-21171, 0.0F);
                var2.method1943(-21171, 0.0F);
                var2.method1943(-21171, 0.0F);
            }
            this.field2665 = this.method1266(-3311, 20, var2.field6962, false, var2.field6979);
            this.field2652 = new class166(this.field2665, 5126, 3, 0);
            this.field2653 = new class166(this.field2665, 5126, 2, 12);
            this.field2604.method4133(true, this);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(BLqaa;)V", line = 3048)
    public final void method1259(byte arg0, class343 arg1) {
        if (arg0 != 63) {
            this.method225(-22, 32, 29, 1);
        }
        ++field2587;
        if (this.field2753) {
            this.method1267(arg1, false);
            this.method1214(arg0 + -13349, arg1);
        } else if (this.field2616 >= 0 && this.field2622[this.field2616] == arg1) {
            this.field2622[this.field2616--] = null;
            arg1.method2172(85);
            if (this.field2616 < 0) {
                this.field2619 = this.field2624 = null;
            } else {
                this.field2619 = this.field2624 = this.field2622[this.field2616];
                this.field2619.method2175(false);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "JA", descriptor = "(IIIIII)I", line = 3083)
    public final int method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2511;
        int var7 = 0;
        float var8 = (float) arg2 * this.field2636.field355 + (float) arg0 * this.field2636.field334 + (float) arg1 * this.field2636.field365 + this.field2636.field366;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field2636.field355 + (float) arg3 * this.field2636.field334 + (float) arg4 * this.field2636.field365 + this.field2636.field366;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field2731 > var8 && (float) this.field2731 > var9) {
            var7 |= 16;
        } else if ((float) this.field2694 < var8 && var9 > (float) this.field2694) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field2636.field372 + (float) arg0 * this.field2636.field337 + (float) arg1 * this.field2636.field370 + this.field2636.field351) * (float) this.field2696 / var8);
        int var11 = (int) (((float) arg5 * this.field2636.field372 + (float) arg3 * this.field2636.field337 + (float) arg4 * this.field2636.field370 + this.field2636.field351) * (float) this.field2696 / var9);
        if (this.field2647 > (float) var10 && this.field2647 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field2713 && (float) var11 > this.field2713) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field2636.field356 + (float) arg0 * this.field2636.field347 + (float) arg1 * this.field2636.field373 + this.field2636.field357) * (float) this.field2676 / var8);
        int var13 = (int) (((float) arg5 * this.field2636.field356 + (float) arg3 * this.field2636.field347 + (float) arg4 * this.field2636.field373 + this.field2636.field357) * (float) this.field2676 / var9);
        if ((float) var12 < this.field2664 && this.field2664 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field2702 && this.field2702 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZII)V", line = 3133)
    public final void method1260(boolean arg0, int arg1, int arg2) {
        int var4 = 46 / ((-4 - arg1) / 33);
        ++field2462;
        this.method1252(arg2, -27776, true, arg0);
    }

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "(I)V", line = 3150)
    private final void method1261(int arg0) {
        this.method1232(-2, 1);
        ++field2551;
        for (int var2 = this.field2666 + -1; ~var2 <= -1; --var2) {
            this.method1262(var2, 0);
            this.method1219((byte) 89, (class539) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1230(8448, 8448, false);
        this.method1223(2, 31, 770, 34168);
        this.method1201(13441);
        this.field2641 = 1;
        OpenGL.glEnable(3042);
        if (arg0 < -93) {
            OpenGL.glBlendFunc(770, 771);
            this.field2642 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field2640 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field2643 = true;
            this.method1234(true, 82);
            this.method1202(67, true);
            this.method1224(2929, true);
            this.method1247(true, (byte) 54);
            this.method1225((byte) 121);
            this.field2479.setSwapInterval(0);
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
            this.field2721 = this.field2685 = -1;
            this.method208();
        }
    }

    @OriginalMember(owner = "client!pq", name = "aa", descriptor = "(IIIIII)V", line = 3225)
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2397;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1218(0);
        this.method1241(arg5, (byte) 124);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2691) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field2691) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "(IIIIIII)I", line = 3261)
    public final int method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2466;
        float var8 = (float) arg2 * this.field2636.field355 + (float) arg0 * this.field2636.field334 + (float) arg1 * this.field2636.field365 + this.field2636.field366;
        float var9 = (float) arg5 * this.field2636.field355 + (float) arg3 * this.field2636.field334 + (float) arg4 * this.field2636.field365 + this.field2636.field366;
        int var10 = 0;
        if (var8 < (float) this.field2731 && (float) this.field2731 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field2694 && (float) this.field2694 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field2636.field372 + (float) arg0 * this.field2636.field337 + (float) arg1 * this.field2636.field370 + this.field2636.field351) * (float) this.field2696 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field2636.field372 + (float) arg3 * this.field2636.field337 + (float) arg4 * this.field2636.field370 + this.field2636.field351) * (float) this.field2696 / (float) arg6);
        if ((float) var11 < this.field2647 && this.field2647 > (float) var12) {
            var10 |= 1;
        } else if ((float) var11 > this.field2713 && (float) var12 > this.field2713) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field2636.field356 + (float) arg0 * this.field2636.field347 + (float) arg1 * this.field2636.field373 + this.field2636.field357) * (float) this.field2676 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field2636.field356 + (float) arg3 * this.field2636.field347 + (float) arg4 * this.field2636.field373 + this.field2636.field357) * (float) this.field2676 / (float) arg6);
        if ((float) var13 < this.field2664 && this.field2664 > (float) var14) {
            var10 |= 4;
        } else if ((float) var13 > this.field2702 && this.field2702 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "()V", line = 3306)
    public final void method145() {
        ++field2527;
        this.field2606.method3753(22433);
    }

    @OriginalMember(owner = "client!pq", name = "DA", descriptor = "(IIII)V", line = 3317)
    public final void method242(int arg0, int arg1, int arg2, int arg3) {
        this.field2696 = arg2;
        ++field2552;
        this.field2676 = arg3;
        this.field2693 = arg0;
        this.field2656 = arg1;
        this.method1243(-107);
        this.method1228(-34848);
        if (~this.field2673 == -4) {
            this.method1194(5888);
        } else if (this.field2673 == 2) {
            this.method1271(-31);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 3344)
    public final void method221(Canvas arg0, int arg1, int arg2) {
        ++field2431;
        if (this.field2450 == arg0) {
            throw new RuntimeException();
        } else if (!this.field2408.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field2479.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field2408.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "(I)V", line = 3379)
    public final void method185(int arg0) {
        ++field2483;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field2602 = arg0;
            this.field2603.method3629(-8929);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "xa", descriptor = "(F)V", line = 3392)
    public final void method202(float arg0) {
        ++field2505;
        if (this.field2726 != arg0) {
            this.field2726 = arg0;
            this.method1197(88);
        }
    }

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "()Loo;", line = 3407)
    public final class12 method159() {
        ++field2592;
        return new class35();
    }

    @OriginalMember(owner = "client!pq", name = "T", descriptor = "(IIII)V", line = 3416)
    public final void method252(int arg0, int arg1, int arg2, int arg3) {
        ++field2518;
        if (this.field2718 > arg2) {
            this.field2718 = arg2;
        }
        if (~arg0 < ~this.field2729) {
            this.field2729 = arg0;
        }
        if (~this.field2734 < ~arg3) {
            this.field2734 = arg3;
        }
        if (arg1 > this.field2708) {
            this.field2708 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method1228(-34848);
        this.method1268(0);
    }

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "([I)V", line = 3441)
    public final void method160(int[] arg0) {
        arg0[2] = this.field2718;
        arg0[1] = this.field2708;
        arg0[0] = this.field2729;
        ++field2588;
        arg0[3] = this.field2734;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lok;)V", line = 3454)
    public final void method173(class255 arg0) {
        this.field2730 = (class173) arg0;
        ++field2445;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "()Lrb;", line = 3462)
    public final class260 method172() {
        ++field2412;
        int var1 = -1;
        if (~this.field2675.indexOf("nvidia") == 0) {
            if (~this.field2675.indexOf("intel") == 0) {
                if (~this.field2675.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class260(var1, "OpenGL", this.field2725, this.field2749, 0L);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lza;", line = 3483)
    public final class731 method178(int arg0) {
        ++field2585;
        class462 var2 = new class462(arg0);
        this.field2609.method1039(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!pq", name = "ZA", descriptor = "(IFFFFF)V", line = 3495)
    public final void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field2476;
        boolean var7 = this.field2721 != arg0;
        if (var7 || this.field2689 != arg1 || this.field2744 != arg2) {
            this.field2721 = arg0;
            this.field2744 = arg2;
            this.field2689 = arg1;
            if (var7) {
                this.field2750 = (float) (65280 & this.field2721) / 65280.0F;
                this.field2738 = (float) (16711680 & this.field2721) / 1.671168E7F;
                this.field2683 = (float) (this.field2721 & 255) / 255.0F;
                this.method1197(-107);
            }
            this.method1229(0);
        }
        if (this.field2722[0] != arg3 || this.field2722[1] != arg4 || this.field2722[2] != arg5) {
            this.field2722[0] = arg3;
            this.field2722[1] = arg4;
            this.field2722[2] = arg5;
            this.field2650[1] = -arg4;
            this.field2650[2] = -arg5;
            this.field2650[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field2745[1] = arg4 * var8;
            this.field2745[0] = arg3 * var8;
            this.field2745[2] = arg5 * var8;
            this.field2701[0] = -this.field2745[0];
            this.field2701[1] = -this.field2745[1];
            this.field2701[2] = -this.field2745[2];
            this.method1273(5888);
            this.field2669 = (int) (arg3 * 256.0F / arg4);
            this.field2746 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "(II)V", line = 3548)
    public final void method1262(int arg0, int arg1) {
        ++field2437;
        if (~this.field2679 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field2679 = arg0;
        }
        if (arg1 != 0) {
            this.method1248((class166) null, (class166) null, (class166) null, (byte) -49, (class166) null);
        }
    }

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "()I", line = 3566)
    public final int method136() {
        ++field2419;
        int var1 = this.field2761;
        this.field2761 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "(II)V", line = 3579)
    public final void method1263(int arg0, int arg1) {
        ++field2522;
        if (arg1 < 86) {
            this.method218((int[]) null);
        }
        if (~arg0 != -2) {
            if (~arg0 != -1) {
                if (~arg0 == -3) {
                    this.method1230(7681, 34165, false);
                } else {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.method1230(34023, 34023, false);
                            return;
                        }
                    } else {
                        this.method1230(8448, 260, false);
                    }
                }
            } else {
                this.method1230(8448, 8448, false);
            }
        } else {
            this.method1230(7681, 7681, false);
        }
    }

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "()Loo;", line = 3609)
    public final class12 method187() {
        ++field2467;
        return this.field2636;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lhda;I)V", line = 3617)
    public final void method134(class714 arg0, int arg1) {
        ++field2451;
        this.field2604.method4130(this, -1, arg0, arg1);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lmia;)V", line = 3625)
    public final void method229(class684 arg0) {
        ++field2517;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lhda;)V", line = 3632)
    public final void method253(class714 arg0) {
        ++field2567;
        this.field2604.method4130(this, -1, arg0, -1);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 3641)
    public final void method254(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class357 {
        ++field2426;
        this.method157(arg2, arg3);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V", line = 3649)
    public final synchronized void method1264(int arg0, int arg1, int arg2) {
        ++field2499;
        class324 var4 = new class324(arg2);
        var4.field762 = (long) arg0;
        this.field2630.method1039(var4, 0);
        if (arg1 != -2617) {
            this.field2670 = true;
        }
    }

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "(I)V", line = 3664)
    private final void method1265(int arg0) {
        this.field2707 = new class539[this.field2666];
        ++field2530;
        this.field2733 = new class470(this, 3553, 6408, 1, 1);
        new class470(this, 3553, 6408, 1, 1);
        new class470(this, 3553, 6408, 1, 1);
        this.field2662 = new class332(this);
        this.field2684 = new class332(this);
        if (arg0 != 8705) {
            field2596 = null;
        }
        this.field2755 = new class332(this);
        this.field2724 = new class332(this);
        this.field2654 = new class332(this);
        this.field2674 = new class332(this);
        this.field2714 = new class332(this);
        this.field2742 = new class332(this);
        this.field2700 = new class332(this);
        this.field2690 = new class332(this);
        if (this.field2695) {
            this.field2703 = new class772(this);
            new class772(this);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIZ[B)Lvn;", line = 3700)
    public final class211 method1266(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        if (arg0 != -3311) {
            return null;
        } else {
            ++field2510;
            return (class211) (!this.field2682 || arg3 && !this.field2699 ? new class123(this, arg1, arg4, arg2) : new class352(this, arg1, arg4, arg2, arg3));
        }
    }

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "()Loo;", line = 3723)
    public final class12 method153() {
        ++field2457;
        return this.field2607;
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(II)V", line = 3736)
    public final void method157(int arg0, int arg1) throws class357 {
        ++field2427;
        try {
            this.field2479.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "()V", line = 3753)
    public final void method227() {
        ++field2461;
        if (!this.field2695) {
            if (!this.field2719) {
                throw new RuntimeException("");
            }
            this.field2617.method988(0, 0, this.field2454, this.field2423, 0, 0);
            this.field2479.setSurface(this.field2487);
        } else {
            if (this.field2620 != this.field2624) {
                throw new RuntimeException();
            }
            this.field2620.method4268((byte) -121, 0);
            this.field2620.method4268((byte) 44, 8);
            this.method1259((byte) 63, this.field2620);
        }
        this.field2423 = this.field2452;
        this.field2454 = this.field2598;
        this.field2617 = null;
        this.method1225((byte) 107);
        this.method1226((byte) 127);
        this.method208();
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(II)I", line = 3787)
    public final int method188(int arg0, int arg1) {
        ++field2401;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "()V", line = 3797)
    public final void method250() {
        ++field2411;
        if (this.field2660 && this.field2454 > 0 && this.field2423 > 0) {
            int var1 = this.field2729;
            int var2 = this.field2718;
            int var3 = this.field2708;
            int var4 = this.field2734;
            this.method208();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1225((byte) 83);
            this.method1234(false, -126);
            this.method1202(118, false);
            this.method1224(2929, false);
            this.method1247(false, (byte) 37);
            this.method1219((byte) 111, (class539) null);
            this.method1232(-2, 1);
            this.method1263(1, 103);
            this.method1241(0, (byte) 127);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field2454, this.field2423, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method225(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lqaa;Z)V", line = 3841)
    public final void method1267(class343 arg0, boolean arg1) {
        ++field2565;
        if (~this.field2625 <= -1 && this.field2618[this.field2625] == arg0) {
            if (!arg1) {
                this.field2618[this.field2625--] = null;
                arg0.method2173(arg1);
                if (this.field2625 < 0) {
                    this.field2619 = null;
                } else {
                    this.field2619 = this.field2618[this.field2625];
                    this.field2619.method2176((byte) -94);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIZ)Lho;", line = 3867)
    public final class318 method228(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2533;
        return new class680(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "(I)V", line = 3876)
    private final void method1268(int arg0) {
        ++field2474;
        if (~this.field2729 >= ~this.field2718 && ~this.field2734 <= ~this.field2708) {
            OpenGL.glScissor(this.field2729 + this.field2715, this.field2717 + this.field2423 - this.field2734, -this.field2729 + this.field2718, -this.field2708 + this.field2734);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 0) {
            this.method1234(true, 104);
        }
    }

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "(I)V", line = 3895)
    public final void method1269(int arg0) {
        ++field2546;
        if (arg0 > -110) {
            this.method175();
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "()V", line = 3910)
    public final void method184() {
        ++field2493;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[Lsca;)V", line = 3918)
    public final void method163(int arg0, class251[] arg1) {
        ++field2562;
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field2697[var3] = arg1[var3];
        }
        this.field2678 = arg0;
        if (~this.field2673 != -2) {
            this.method1215(-46);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3944)
    public final void method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field2395;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            class339 var13 = (class339) arg6;
            class227 var14 = var13.field4913;
            this.method1227(0);
            this.method1219((byte) 117, var13.field4913);
            this.method1241(arg5, (byte) 127);
            this.method1230(8448, 7681, false);
            this.method1223(0, 29, 768, 34167);
            float var15 = var14.field3440 / (float) var14.field3437;
            float var16 = var14.field3441 / (float) var14.field3442;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            float var20 = var17 * var19;
            float var21 = var18 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var22 = arg11 % (arg9 + arg10);
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (arg9 >= var22) {
                var28 = (float) (-var22 + arg9) * var21;
                var27 = (float) (-var22 + arg9) * var20;
            } else {
                var25 = (float) (arg9 + arg10 - var22) * var20;
                var26 = (float) (arg9 - var22 + arg10) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (arg2 > arg0) {
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
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg3 >= ~arg1) {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 + -var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var29 += var27 + var31;
                OpenGL.glEnd();
                var30 += var28 + var32;
                var28 = var24;
                var27 = var23;
            }
            this.method1223(0, 126, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Loo;)V", line = 4071)
    public final void method194(class12 arg0) {
        this.field2636.method49(arg0);
        ++field2590;
        this.field2645.method49(this.field2636);
        this.field2645.method283(16383);
        this.field2646.method290(this.field2645, true);
        if (~this.field2673 != -2) {
            this.method1192(0);
        }
    }

    @OriginalMember(owner = "client!pq", name = "ra", descriptor = "(IIII)V", line = 4093)
    public final void method245(int arg0, int arg1, int arg2, int arg3) {
        this.field2757 = true;
        this.field2671 = arg0;
        this.field2752 = arg1;
        this.field2720 = arg2;
        this.field2709 = arg3;
        ++field2485;
    }

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "(ILaa;II)V", line = 4107)
    public final void method176(int arg0, class87 arg1, int arg2, int arg3) {
        ++field2553;
        class339 var5 = (class339) arg1;
        class227 var6 = var5.field4913;
        this.method1227(0);
        this.method1219((byte) 89, var5.field4913);
        this.method1241(1, (byte) 124);
        this.method1230(8448, 7681, false);
        this.method1223(0, 110, 768, 34167);
        float var7 = var6.field3440 / (float) var6.field3437;
        float var8 = var6.field3441 / (float) var6.field3442;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2729) * var7, (float) (this.field2708 - arg3) * var8);
        OpenGL.glVertex2i(this.field2729, this.field2708);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2729) * var7, (float) (-arg3 + this.field2734) * var8);
        OpenGL.glVertex2i(this.field2729, this.field2734);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2718) * var7, (float) (-arg3 + this.field2734) * var8);
        OpenGL.glVertex2i(this.field2718, this.field2734);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2718) * var7, (float) (-arg3 + this.field2708) * var8);
        OpenGL.glVertex2i(this.field2718, this.field2708);
        OpenGL.glEnd();
        this.method1223(0, 45, 768, 5890);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lao;IIII)Lka;", line = 4140)
    public final class231 method231(class534 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2446;
        return new class332(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FIIFIFIILnh;FII[BF)V", line = 4151)
    public static final void method1270(float arg0, int arg1, int arg2, float arg3, int arg4, float arg5, int arg6, int arg7, class551 arg8, float arg9, int arg10, int arg11, byte[] arg12, float arg13) {
        ++field2547;
        int var14 = arg6 * arg10;
        float[] var15 = new float[var14];
        if (arg2 == 65280) {
            for (int var16 = 0; arg11 > var16; ++var16) {
                int var19 = arg1;
                arg8.method2911(arg3 / (float) arg6, 0, var15, arg10, arg4, (byte) -9, arg0 / (float) arg10, arg5 / (float) arg4, arg6, arg7, arg9 * 127.0F);
                arg5 *= 2.0F;
                for (int var20 = 0; ~var20 > ~var14; ++var20) {
                    arg12[var19] = (byte) ((int) ((float) arg12[var19] + var15[var20]));
                    ++var19;
                }
                arg9 *= arg13;
                arg0 *= 2.0F;
                arg3 *= 2.0F;
            }
            int var17 = arg1;
            for (int var18 = 0; ~var18 > ~var14; ++var18) {
                arg12[var17] = (byte) (arg12[var17] + 127);
                ++var17;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "GA", descriptor = "(I)V", line = 4203)
    public final void method230(int arg0) {
        ++field2579;
        this.method1241(0, (byte) 126);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "(I)V", line = 4215)
    private final void method1271(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field2456;
        if (arg0 <= -26) {
            OpenGL.glLoadMatrixf(this.field2706, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "()I", line = 4228)
    public final int method214() {
        ++field2444;
        int var1 = this.field2760;
        this.field2760 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljda;B)V", line = 4240)
    public final void method1272(class90 arg0, byte arg1) {
        if (arg1 != 110) {
            this.method200();
        }
        ++field2468;
        if (this.field2743 != arg0) {
            if (this.field2682) {
                OpenGL.glBindBufferARB(34963, arg0.method664(-31593));
            }
            this.field2743 = arg0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "()V", line = 4258)
    public final void method205() {
        ++field2416;
        for (class69 var1 = this.field2609.method1041(1048832); var1 != null; var1 = this.field2609.method1033(-1)) {
            ((class462) var1).method2781(118);
        }
        if (this.field2606 != null) {
            this.field2606.method3760((byte) -84);
        }
        if (this.field2479 != null) {
            this.method1217((byte) -125);
            Enumeration var2 = this.field2408.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field2408.get(var3);
                this.field2479.releaseSurface(var3, var4);
            }
            this.field2479.release();
            this.field2479 = null;
        }
        if (this.field2615) {
            class153.method1003(false, -2, true);
            this.field2615 = false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "()Z", line = 4307)
    public final boolean method200() {
        ++field2481;
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "ya", descriptor = "()V", line = 4315)
    public final void method226() {
        ++field2471;
        this.method1247(true, (byte) 104);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Lcn;", line = 4327)
    public final class621 method236(int arg0, int arg1) {
        ++field2464;
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "(I)V", line = 4335)
    public final void method1273(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field2745, 0);
        ++field2519;
        if (arg0 != 5888) {
            this.field2747 = false;
        }
        OpenGL.glLightfv(16385, 4611, this.field2701, 0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIZ)Lho;", line = 4354)
    public final class318 method183(int arg0, int arg1, boolean arg2) {
        ++field2442;
        return new class680(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "()Z", line = 4365)
    public final boolean method193() {
        ++field2543;
        return this.field2601.method3546(4, 3);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(ILqaa;)V", line = 4373)
    public final void method1274(int arg0, class343 arg1) {
        ++field2420;
        if (this.field2753) {
            this.method1216((byte) 77, arg1);
            this.method1251(-1, arg1);
        } else {
            if (~this.field2616 <= -4) {
                throw new RuntimeException();
            }
            if (~this.field2616 <= -1) {
                this.field2622[this.field2616].method2172(98);
            }
            this.field2619 = this.field2624 = this.field2622[++this.field2616] = arg1;
            this.field2619.method2175(false);
        }
        if (arg0 != 2) {
            this.field2719 = false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "(II)V", line = 4402)
    public final void method140(int arg0, int arg1) {
        ++field2495;
        if (this.field2731 != arg0 || ~this.field2694 != ~arg1) {
            this.field2731 = arg0;
            this.field2694 = arg1;
            this.method1243(77);
            this.method1198(true);
            if (this.field2673 != 3) {
                if (this.field2673 == 2) {
                    this.method1271(-58);
                    return;
                }
            } else {
                this.method1194(5888);
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "(B)V", line = 4433)
    private final void method1275(byte arg0) {
        int var2 = 6 % ((arg0 - 19) / 60);
        if (this.field2711 && !this.field2677) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field2478;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)I", line = 4449)
    public final int method198(int arg0, int arg1) {
        ++field2509;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 4457)
    public final void method190(Canvas arg0, int arg1, int arg2) {
        ++field2581;
        long var4 = 0L;
        if (arg0 != null && this.field2450 != arg0) {
            if (this.field2408.containsKey(arg0)) {
                Long var6 = (Long) this.field2408.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field2409;
        }
        if (~var4 == -1L) {
            throw new RuntimeException();
        } else {
            this.field2479.surfaceResized(var4);
            if (this.field2528 == arg0) {
                this.method1245((byte) 41);
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 4486)
    public final void method155(Canvas arg0) {
        ++field2470;
        this.field2487 = 0L;
        this.field2528 = null;
        if (arg0 != null && this.field2450 != arg0) {
            if (this.field2408.containsKey(arg0)) {
                Long var2 = (Long) this.field2408.get(arg0);
                this.field2487 = var2;
                this.field2528 = arg0;
            }
        } else {
            this.field2528 = this.field2450;
            this.field2487 = this.field2409;
        }
        if (this.field2528 != null && this.field2487 != 0L) {
            this.field2479.setSurface(this.field2487);
            this.method1245((byte) 51);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "(IIIIII[BII)V", line = 4522)
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field2544;
        float var10;
        float var11;
        if (this.field2688 != null && arg2 <= this.field2688.field6517 && arg3 <= this.field2688.field6516) {
            this.field2688.method2807(false, arg3, arg6, 0, 0, 74, arg2, 0, 0, 6406);
            var10 = (float) arg3 * this.field2688.field3441 / (float) this.field2688.field6516;
            var11 = (float) arg2 * this.field2688.field3440 / (float) this.field2688.field6517;
        } else {
            this.field2688 = class179.method1136(6406, 6406, arg2, false, arg6, this, arg3, -25900);
            this.field2688.method2804(false, 10243, false);
            var10 = this.field2688.field3441;
            var11 = this.field2688.field3440;
        }
        this.method1227(0);
        this.method1219((byte) 121, this.field2688);
        this.method1241(arg8, (byte) 124);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1193(arg5, 16711680);
        this.method1230(34165, 34165, false);
        this.method1223(0, 37, 768, 34166);
        this.method1223(2, 47, 770, 5890);
        this.method1220(34166, 770, 34200, 0);
        this.method1220(5890, 770, 34200, 2);
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
        this.method1223(0, 25, 768, 5890);
        this.method1223(2, 36, 770, 34166);
        this.method1220(5890, 770, 34200, 0);
        this.method1220(34166, 770, 34200, 2);
    }
}
