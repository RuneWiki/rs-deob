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

@OriginalClass("client!kw")
public abstract class class174 extends class167 {

    @OriginalMember(owner = "client!kw", name = "wd", descriptor = "Lrk;")
    private class419 field2507 = new class419();

    @OriginalMember(owner = "client!kw", name = "Rd", descriptor = "Z")
    public boolean field2528 = true;

    @OriginalMember(owner = "client!kw", name = "Ud", descriptor = "Loe;")
    public class124 field2531 = new class124();

    @OriginalMember(owner = "client!kw", name = "Wd", descriptor = "Loe;")
    public class124 field2533 = new class124();

    @OriginalMember(owner = "client!kw", name = "Xd", descriptor = "Loe;")
    public class124 field2534 = new class124();

    @OriginalMember(owner = "client!kw", name = "Yd", descriptor = "Loe;")
    public class124 field2535 = new class124();

    @OriginalMember(owner = "client!kw", name = "Zd", descriptor = "Loe;")
    private class124 field2536 = new class124();

    @OriginalMember(owner = "client!kw", name = "ae", descriptor = "Loe;")
    private class124 field2537 = new class124();

    @OriginalMember(owner = "client!kw", name = "ke", descriptor = "I")
    public int field2547 = 0;

    @OriginalMember(owner = "client!kw", name = "oe", descriptor = "I")
    private int field2551 = -1;

    @OriginalMember(owner = "client!kw", name = "ne", descriptor = "F")
    public float field2550 = 1.0F;

    @OriginalMember(owner = "client!kw", name = "Be", descriptor = "Z")
    private boolean field2564 = false;

    @OriginalMember(owner = "client!kw", name = "Ee", descriptor = "Z")
    public boolean field2567 = false;

    @OriginalMember(owner = "client!kw", name = "qe", descriptor = "[F")
    private float[] field2553 = new float[16];

    @OriginalMember(owner = "client!kw", name = "he", descriptor = "F")
    public float field2544 = 3584.0F;

    @OriginalMember(owner = "client!kw", name = "Re", descriptor = "I")
    public int field2580 = 3;

    @OriginalMember(owner = "client!kw", name = "be", descriptor = "[F")
    public float[] field2538 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!kw", name = "Ze", descriptor = "Z")
    public boolean field2588 = true;

    @OriginalMember(owner = "client!kw", name = "He", descriptor = "Z")
    public boolean field2570 = false;

    @OriginalMember(owner = "client!kw", name = "ue", descriptor = "I")
    public int field2557 = 0;

    @OriginalMember(owner = "client!kw", name = "je", descriptor = "I")
    public int field2546 = -1;

    @OriginalMember(owner = "client!kw", name = "Ke", descriptor = "I")
    public int field2573 = 512;

    @OriginalMember(owner = "client!kw", name = "ie", descriptor = "Z")
    public boolean field2545 = true;

    @OriginalMember(owner = "client!kw", name = "se", descriptor = "F")
    public float field2555 = 1.0F;

    @OriginalMember(owner = "client!kw", name = "xe", descriptor = "I")
    private int field2560 = 0;

    @OriginalMember(owner = "client!kw", name = "ye", descriptor = "Lpm;")
    public class129 field2561 = class307.field4470;

    @OriginalMember(owner = "client!kw", name = "bf", descriptor = "I")
    private int field2590 = 0;

    @OriginalMember(owner = "client!kw", name = "Fe", descriptor = "F")
    public float field2568 = -1.0F;

    @OriginalMember(owner = "client!kw", name = "pf", descriptor = "[F")
    public float[] field2603 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kw", name = "gf", descriptor = "Lmba;")
    public class203 field2595 = class240.field3508;

    @OriginalMember(owner = "client!kw", name = "kf", descriptor = "I")
    public int field2598 = 0;

    @OriginalMember(owner = "client!kw", name = "Le", descriptor = "I")
    public int field2574 = 50;

    @OriginalMember(owner = "client!kw", name = "Se", descriptor = "F")
    public float field2581 = 1.0F;

    @OriginalMember(owner = "client!kw", name = "ff", descriptor = "Z")
    public boolean field2594 = false;

    @OriginalMember(owner = "client!kw", name = "of", descriptor = "[F")
    private float[] field2602 = new float[16];

    @OriginalMember(owner = "client!kw", name = "Oe", descriptor = "Z")
    public boolean field2577 = false;

    @OriginalMember(owner = "client!kw", name = "Ye", descriptor = "I")
    public int field2587 = 0;

    @OriginalMember(owner = "client!kw", name = "Je", descriptor = "I")
    public int field2572 = 0;

    @OriginalMember(owner = "client!kw", name = "Gf", descriptor = "Z")
    private boolean field2620 = false;

    @OriginalMember(owner = "client!kw", name = "fe", descriptor = "[Leba;")
    private class509[] field2542 = new class509[10];

    @OriginalMember(owner = "client!kw", name = "ge", descriptor = "I")
    private int field2543 = 1;

    @OriginalMember(owner = "client!kw", name = "ce", descriptor = "F")
    private float field2539 = 3000.0F;

    @OriginalMember(owner = "client!kw", name = "Cf", descriptor = "F")
    public float field2616 = -1.0F;

    @OriginalMember(owner = "client!kw", name = "af", descriptor = "Z")
    private boolean field2589 = false;

    @OriginalMember(owner = "client!kw", name = "Jf", descriptor = "I")
    public int field2623 = 0;

    @OriginalMember(owner = "client!kw", name = "nf", descriptor = "I")
    public int field2601 = 3584;

    @OriginalMember(owner = "client!kw", name = "Pe", descriptor = "Z")
    private boolean field2578 = false;

    @OriginalMember(owner = "client!kw", name = "Ie", descriptor = "Z")
    public boolean field2571 = true;

    @OriginalMember(owner = "client!kw", name = "df", descriptor = "I")
    public int field2592 = 0;

    @OriginalMember(owner = "client!kw", name = "ze", descriptor = "[F")
    private float[] field2562 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kw", name = "Hf", descriptor = "I")
    private int field2621 = -1;

    @OriginalMember(owner = "client!kw", name = "sf", descriptor = "I")
    public int field2606 = 0;

    @OriginalMember(owner = "client!kw", name = "Of", descriptor = "I")
    public int field2628 = 128;

    @OriginalMember(owner = "client!kw", name = "vf", descriptor = "I")
    public int field2609 = -1;

    @OriginalMember(owner = "client!kw", name = "Nf", descriptor = "I")
    public int field2627 = 0;

    @OriginalMember(owner = "client!kw", name = "Tf", descriptor = "I")
    public int field2633 = 8;

    @OriginalMember(owner = "client!kw", name = "Sf", descriptor = "I")
    private int field2632 = 0;

    @OriginalMember(owner = "client!kw", name = "Pf", descriptor = "F")
    public float field2629 = 3584.0F;

    @OriginalMember(owner = "client!kw", name = "tf", descriptor = "F")
    private float field2607 = 1.0F;

    @OriginalMember(owner = "client!kw", name = "Mf", descriptor = "I")
    public int field2626 = 0;

    @OriginalMember(owner = "client!kw", name = "yf", descriptor = "[F")
    private float[] field2612 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kw", name = "hf", descriptor = "I")
    private int field2596 = 16777215;

    @OriginalMember(owner = "client!kw", name = "Ce", descriptor = "F")
    public float field2565 = 1.0F;

    @OriginalMember(owner = "client!kw", name = "wf", descriptor = "I")
    public int field2610 = -1;

    @OriginalMember(owner = "client!kw", name = "Xe", descriptor = "Z")
    private boolean field2586 = false;

    @OriginalMember(owner = "client!kw", name = "If", descriptor = "[F")
    private float[] field2622 = new float[16];

    @OriginalMember(owner = "client!kw", name = "Uf", descriptor = "[F")
    private float[] field2634 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kw", name = "Af", descriptor = "[F")
    public float[] field2614 = this.field2634;

    @OriginalMember(owner = "client!kw", name = "Wf", descriptor = "I")
    public int field2636 = 512;

    @OriginalMember(owner = "client!kw", name = "qf", descriptor = "I")
    private int field2604 = 0;

    @OriginalMember(owner = "client!kw", name = "Qf", descriptor = "Z")
    public boolean field2630 = true;

    @OriginalMember(owner = "client!kw", name = "Xf", descriptor = "Z")
    public boolean field2637 = true;

    @OriginalMember(owner = "client!kw", name = "Me", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2575 = new Stream();

    @OriginalMember(owner = "client!kw", name = "ag", descriptor = "Loe;")
    private class124 field2640 = new class124();

    @OriginalMember(owner = "client!kw", name = "ee", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!kw", name = "Xb", descriptor = "Ldda;")
    public class597 field2430;

    @OriginalMember(owner = "client!kw", name = "cd", descriptor = "Ljava/lang/Object;")
    public Object field2487;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "Ljava/lang/Object;")
    private Object field2351;

    @OriginalMember(owner = "client!kw", name = "id", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2493;

    @OriginalMember(owner = "client!kw", name = "W", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2377;

    @OriginalMember(owner = "client!kw", name = "Zf", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!kw", name = "R", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!kw", name = "ob", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!kw", name = "te", descriptor = "Ldu;")
    private class534 field2556;

    @OriginalMember(owner = "client!kw", name = "od", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field2499;

    @OriginalMember(owner = "client!kw", name = "P", descriptor = "I")
    public static int field2370 = -1;

    @OriginalMember(owner = "client!kw", name = "Db", descriptor = "I")
    public static int field2410 = 0;

    @OriginalMember(owner = "client!kw", name = "Pd", descriptor = "I")
    public static int field2526 = 0;

    @OriginalMember(owner = "client!kw", name = "Y", descriptor = "F")
    public static float field2379;

    @OriginalMember(owner = "client!kw", name = "de", descriptor = "F")
    private float field2540;

    @OriginalMember(owner = "client!kw", name = "ve", descriptor = "F")
    private float field2558;

    @OriginalMember(owner = "client!kw", name = "Ne", descriptor = "F")
    public float field2576;

    @OriginalMember(owner = "client!kw", name = "Ue", descriptor = "F")
    public float field2583;

    @OriginalMember(owner = "client!kw", name = "ef", descriptor = "F")
    public float field2593;

    @OriginalMember(owner = "client!kw", name = "uf", descriptor = "F")
    public float field2608;

    @OriginalMember(owner = "client!kw", name = "zf", descriptor = "F")
    public float field2613;

    @OriginalMember(owner = "client!kw", name = "Rf", descriptor = "F")
    public float field2631;

    @OriginalMember(owner = "client!kw", name = "Vf", descriptor = "F")
    private float field2635;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!kw", name = "J", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!kw", name = "L", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!kw", name = "M", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!kw", name = "N", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!kw", name = "O", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!kw", name = "Q", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!kw", name = "S", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!kw", name = "T", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!kw", name = "U", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!kw", name = "V", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!kw", name = "X", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!kw", name = "Z", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!kw", name = "ab", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!kw", name = "bb", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!kw", name = "cb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!kw", name = "db", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!kw", name = "eb", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!kw", name = "fb", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!kw", name = "gb", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!kw", name = "hb", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!kw", name = "ib", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!kw", name = "jb", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!kw", name = "lb", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!kw", name = "mb", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!kw", name = "nb", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!kw", name = "pb", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!kw", name = "qb", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!kw", name = "rb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!kw", name = "sb", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!kw", name = "tb", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!kw", name = "ub", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!kw", name = "vb", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!kw", name = "wb", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!kw", name = "xb", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!kw", name = "yb", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!kw", name = "zb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!kw", name = "Ab", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!kw", name = "Bb", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!kw", name = "Cb", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!kw", name = "Eb", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!kw", name = "Fb", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!kw", name = "Hb", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!kw", name = "Ib", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!kw", name = "Jb", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!kw", name = "Kb", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!kw", name = "Lb", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!kw", name = "Mb", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!kw", name = "Nb", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!kw", name = "Ob", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!kw", name = "Pb", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!kw", name = "Qb", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!kw", name = "Rb", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!kw", name = "Sb", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!kw", name = "Tb", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!kw", name = "Ub", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!kw", name = "Vb", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!kw", name = "Wb", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!kw", name = "Yb", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!kw", name = "Zb", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!kw", name = "ac", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!kw", name = "bc", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!kw", name = "cc", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!kw", name = "dc", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!kw", name = "ec", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!kw", name = "fc", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!kw", name = "gc", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!kw", name = "hc", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!kw", name = "ic", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!kw", name = "jc", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!kw", name = "kc", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!kw", name = "lc", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!kw", name = "mc", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!kw", name = "nc", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!kw", name = "oc", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!kw", name = "pc", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!kw", name = "qc", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!kw", name = "rc", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!kw", name = "sc", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!kw", name = "tc", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!kw", name = "uc", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!kw", name = "vc", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!kw", name = "wc", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!kw", name = "xc", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!kw", name = "yc", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!kw", name = "zc", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!kw", name = "Ac", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!kw", name = "Bc", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!kw", name = "Cc", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!kw", name = "Dc", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!kw", name = "Ec", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!kw", name = "Fc", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!kw", name = "Gc", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!kw", name = "Hc", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!kw", name = "Ic", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!kw", name = "Jc", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!kw", name = "Kc", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!kw", name = "Lc", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!kw", name = "Mc", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!kw", name = "Nc", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!kw", name = "Oc", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!kw", name = "Pc", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!kw", name = "Qc", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!kw", name = "Rc", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!kw", name = "Sc", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!kw", name = "Tc", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!kw", name = "Uc", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!kw", name = "Vc", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!kw", name = "Wc", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!kw", name = "Xc", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!kw", name = "Yc", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!kw", name = "Zc", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!kw", name = "ad", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!kw", name = "bd", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!kw", name = "dd", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!kw", name = "ed", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!kw", name = "fd", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!kw", name = "gd", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!kw", name = "hd", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!kw", name = "jd", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!kw", name = "kd", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!kw", name = "ld", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!kw", name = "md", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!kw", name = "nd", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!kw", name = "pd", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!kw", name = "qd", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!kw", name = "rd", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!kw", name = "sd", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!kw", name = "td", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!kw", name = "ud", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!kw", name = "vd", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!kw", name = "xd", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!kw", name = "yd", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!kw", name = "zd", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!kw", name = "Ad", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!kw", name = "Bd", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!kw", name = "Cd", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!kw", name = "Dd", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!kw", name = "Ed", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!kw", name = "Fd", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!kw", name = "Gd", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!kw", name = "Hd", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!kw", name = "Id", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!kw", name = "Jd", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!kw", name = "Kd", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!kw", name = "Ld", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!kw", name = "Md", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!kw", name = "Nd", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!kw", name = "Od", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!kw", name = "Qd", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!kw", name = "Sd", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!kw", name = "Td", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!kw", name = "Vd", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!kw", name = "me", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!kw", name = "re", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!kw", name = "we", descriptor = "I")
    private int field2559;

    @OriginalMember(owner = "client!kw", name = "Ge", descriptor = "I")
    private int field2569;

    @OriginalMember(owner = "client!kw", name = "Ve", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!kw", name = "We", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!kw", name = "jf", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!kw", name = "lf", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!kw", name = "xf", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!kw", name = "Kf", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!kw", name = "vg", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "client!kw", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!kw", name = "Ef", descriptor = "Lia;")
    private class182 field2618;

    @OriginalMember(owner = "client!kw", name = "bg", descriptor = "Lqi;")
    public class470 field2641;

    @OriginalMember(owner = "client!kw", name = "fg", descriptor = "Lqi;")
    public class470 field2645;

    @OriginalMember(owner = "client!kw", name = "gg", descriptor = "Lqi;")
    public class470 field2646;

    @OriginalMember(owner = "client!kw", name = "ig", descriptor = "Lqi;")
    public class470 field2648;

    @OriginalMember(owner = "client!kw", name = "jg", descriptor = "Lqi;")
    public class470 field2649;

    @OriginalMember(owner = "client!kw", name = "kg", descriptor = "Lqi;")
    public class470 field2650;

    @OriginalMember(owner = "client!kw", name = "lg", descriptor = "Lqi;")
    public class470 field2651;

    @OriginalMember(owner = "client!kw", name = "og", descriptor = "Lqi;")
    public class470 field2654;

    @OriginalMember(owner = "client!kw", name = "pg", descriptor = "Lqi;")
    public class470 field2655;

    @OriginalMember(owner = "client!kw", name = "rg", descriptor = "Lqi;")
    public class470 field2657;

    @OriginalMember(owner = "client!kw", name = "Bf", descriptor = "Leba;")
    private class509 field2615;

    @OriginalMember(owner = "client!kw", name = "dg", descriptor = "Lg;")
    private class512 field2643;

    @OriginalMember(owner = "client!kw", name = "Yf", descriptor = "Let;")
    private class564 field2638;

    @OriginalMember(owner = "client!kw", name = "cg", descriptor = "Lvs;")
    public class567 field2642;

    @OriginalMember(owner = "client!kw", name = "hg", descriptor = "Lvs;")
    private class567 field2647;

    @OriginalMember(owner = "client!kw", name = "ng", descriptor = "Lvs;")
    public class567 field2653;

    @OriginalMember(owner = "client!kw", name = "qg", descriptor = "Lvs;")
    public class567 field2656;

    @OriginalMember(owner = "client!kw", name = "sg", descriptor = "Lvs;")
    private class567 field2658;

    @OriginalMember(owner = "client!kw", name = "tg", descriptor = "Lvs;")
    public class567 field2659;

    @OriginalMember(owner = "client!kw", name = "Gb", descriptor = "Lui;")
    public class588 field2413;

    @OriginalMember(owner = "client!kw", name = "De", descriptor = "Lmn;")
    public class60 field2566;

    @OriginalMember(owner = "client!kw", name = "eg", descriptor = "Ltq;")
    private class90 field2644;

    @OriginalMember(owner = "client!kw", name = "mg", descriptor = "Ltq;")
    private class90 field2652;

    @OriginalMember(owner = "client!kw", name = "kb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2391;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field2353;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2359;

    @OriginalMember(owner = "client!kw", name = "le", descriptor = "Z")
    public boolean field2548;

    @OriginalMember(owner = "client!kw", name = "Ae", descriptor = "Z")
    public boolean field2563;

    @OriginalMember(owner = "client!kw", name = "Qe", descriptor = "Z")
    public boolean field2579;

    @OriginalMember(owner = "client!kw", name = "Te", descriptor = "Z")
    public boolean field2582;

    @OriginalMember(owner = "client!kw", name = "rf", descriptor = "Z")
    public boolean field2605;

    @OriginalMember(owner = "client!kw", name = "ug", descriptor = "Z")
    public boolean field2660;

    @OriginalMember(owner = "client!kw", name = "Ff", descriptor = "[Loe;")
    public class124[] field2619;

    @OriginalMember(owner = "client!kw", name = "pe", descriptor = "[Lkp;")
    public class464[] field2552;

    @OriginalMember(owner = "client!kw", name = "Lf", descriptor = "[Lkp;")
    public class464[] field2625;

    @OriginalMember(owner = "client!kw", name = "Df", descriptor = "[Lat;")
    public class535[] field2617;

    @OriginalMember(owner = "client!kw", name = "mf", descriptor = "[Lmn;")
    private class60[] field2600;

    @OriginalMember(owner = "client!kw", name = "cf", descriptor = "[Lpn;")
    public class68[] field2591;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(II)Leba;")
    public class509 method314(int arg0, int arg1) {
        ++field2488;
        int var3 = -29 / ((arg0 - -16) / 45);
        if (arg1 != 6) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    return arg1 == 7 ? new class648(this) : new class263(this);
                } else {
                    return new class441(this, this.field2413);
                }
            } else {
                return new class285(this);
            }
        } else {
            return new class370(this);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILhba;I)V")
    public final void method1097(int arg0, class404 arg1, int arg2) {
        if (arg0 == -14186) {
            ++field2419;
            this.method291(-26, arg2, false, arg1);
        }
    }

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "()Z")
    public final boolean method955() {
        ++field2480;
        return false;
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "()Lm;")
    public final class105 method1038() {
        ++field2519;
        return this.field2640;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "()Z")
    public final boolean method1030() {
        ++field2409;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
    public abstract void method336(byte arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILud;II)V")
    public abstract void method300(int arg0, class119 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIII)V")
    public final void method1016(int arg0, int arg1, int arg2, int arg3) {
        ++field2454;
        this.field2636 = arg3;
        this.field2573 = arg2;
        this.field2626 = arg1;
        this.field2623 = arg0;
        this.method1167(93);
        this.method1177(59);
        this.method1106(67);
        this.method1127((byte) 91);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ)V")
    public final void method1098(int arg0, boolean arg1) {
        ++field2449;
        if (this.field2543 != arg0) {
            class129 var3;
            boolean var4;
            boolean var5;
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -129) {
                        var3 = class487.field7382;
                        var4 = false;
                        var5 = false;
                    } else {
                        var5 = true;
                        var4 = true;
                        var3 = class257.field3762;
                    }
                } else {
                    var3 = class19.field175;
                    var4 = false;
                    var5 = true;
                }
            } else {
                var3 = class307.field4470;
                var4 = true;
                var5 = true;
            }
            if (var4 == !this.field2630) {
                this.field2630 = var4;
                this.method323(2);
            }
            if (this.field2571 != var5) {
                this.field2571 = var5;
                this.method331(1);
            }
            if (this.field2561 != var3) {
                this.field2561 = var3;
                this.method310(0);
            }
            this.field2543 = arg0;
            this.field2569 &= -29;
        }
        if (arg1) {
            this.method980(-21, -74, -74, -76, 95, 68);
        }
    }

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "(I)V")
    public final void method1099(int arg0) {
        ++field2489;
        if (arg0 != 0) {
            this.field2596 = 62;
        }
        this.field2528 = false;
        this.method1135(10088);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([Luq;B)Lvs;")
    public abstract class567 method312(class314[] arg0, byte arg1);

    @OriginalMember(owner = "client!kw", name = "JA", descriptor = "(IIII)V")
    public final void method979(int arg0, int arg1, int arg2, int arg3) {
        ++field2476;
        if (!this.field2563) {
            throw new RuntimeException("");
        } else {
            if (~this.field2559 != ~arg0) {
                this.field2559 = arg0;
                if (this.field2615 != null) {
                    this.field2615.method36(false);
                }
            }
            this.field2604 = arg3;
            this.field2621 = arg2;
            this.field2610 = arg1;
            this.method1103(512);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "()Z")
    public final boolean method988() {
        ++field2496;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(I)V")
    public final void method981(int arg0) {
        ++field2494;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lpn;I)V")
    public final void method1100(class68 arg0, int arg1) {
        ++field2375;
        this.field2591[this.field2547] = arg0;
        if (arg1 == -1) {
            this.method1141((byte) 106);
        }
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "(I)V")
    private final void method1101(int arg0) {
        ++field2508;
        if (this.field2558 != 0.0F) {
            float var2 = this.field2539 / (this.field2558 + this.field2539);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field2635 * (1.0F - var2) / this.field2558;
            this.field2553[10] = this.field2540 + var4;
            this.field2553[14] = this.field2635 * var3;
        } else {
            this.field2553[14] = this.field2635;
            this.field2553[10] = this.field2540;
        }
        this.field2629 = (this.field2553[arg0] + (float) (-this.field2601)) / this.field2553[10];
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1000(Canvas arg0) {
        ++field2387;
        if (this.field2493 == arg0) {
            throw new RuntimeException();
        } else if (this.field2359.containsKey(arg0)) {
            this.method297(this.field2359.get(arg0), 0, arg0);
            this.field2359.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lkp;Lkp;I)V")
    public final void method1102(class464 arg0, class464 arg1, int arg2) {
        ++field2516;
        boolean var4 = false;
        int var5 = -78 % ((66 - arg2) / 60);
        if (this.field2625[this.field2547] != arg0) {
            this.field2625[this.field2547] = arg0;
            this.method308(46);
            var4 = true;
        }
        if (this.field2552[this.field2547] != arg1) {
            this.field2552[this.field2547] = arg1;
            this.method336((byte) -123);
            var4 = true;
        }
        if (var4) {
            this.field2569 &= -30;
        }
    }

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "(I)V")
    private final void method1103(int arg0) {
        if (this.field2615 != null) {
            this.field2615.method41(-107);
        }
        if (arg0 == 512) {
            ++field2432;
            this.method358((byte) 127);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILtq;I)V")
    public abstract void method296(int arg0, class90 arg1, int arg2);

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)V")
    public abstract void method324(byte arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIZLhba;)V")
    public abstract void method291(int arg0, int arg1, boolean arg2, class404 arg3);

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "(I)V")
    public abstract void method310(int arg0);

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(B)V")
    public abstract void method282(byte arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII)V")
    public final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2418;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZZ)Ltq;")
    public abstract class90 method304(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "(I)V")
    public abstract void method359(int arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BZ)V")
    public final void method1104(byte arg0, boolean arg1) {
        ++field2482;
        if (arg0 > 48) {
            if (arg1 == !this.field2582) {
                this.field2582 = arg1;
                this.method334(false);
                this.field2569 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2465;
        float var7 = this.field2533.method749((float) arg1, (float) arg0, (float) arg2, 5);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field2533.method749((float) arg4, (float) arg3, (float) arg5, 5);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field2574) || !((float) this.field2574 > var8)) && (!((float) this.field2601 < var7) || !(var8 > (float) this.field2601))) {
            int var9 = (int) ((float) this.field2573 * this.field2533.method763((float) arg1, (float) arg2, 2, (float) arg0) / var7);
            int var10 = (int) ((float) this.field2573 * this.field2533.method763((float) arg4, (float) arg5, 2, (float) arg3) / var8);
            if ((float) var9 < this.field2613 && this.field2613 > (float) var10 || (float) var9 > this.field2576 && (float) var10 > this.field2576) {
                return false;
            } else {
                int var11 = (int) ((float) this.field2636 * this.field2533.method753((float) arg1, (float) arg0, (float) arg2, (byte) -94) / var7);
                int var12 = (int) ((float) this.field2636 * this.field2533.method753((float) arg4, (float) arg3, (float) arg5, (byte) -118) / var8);
                return (!((float) var11 < this.field2608) || !(this.field2608 > (float) var12)) && (!((float) var11 > this.field2583) || !((float) var12 > this.field2583));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2466;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLlc;Ljt;)Z")
    public abstract boolean method338(boolean arg0, class629 arg1, class489 arg2);

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IZ)V")
    public abstract void method348(int arg0, boolean arg1);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lu;)V")
    public final void method971(class425 arg0) {
        this.field2391 = ((class232) arg0).field3429;
        ++field2364;
        this.field2353 = this.field2391.method3320(32768, false);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIZLjt;I[BZ)Lhc;")
    public abstract class391 method320(int arg0, int arg1, int arg2, boolean arg3, class489 arg4, int arg5, byte[] arg6, boolean arg7);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lr;Loaa;Lm;Lgr;I)V")
    public final void method1005(class520 arg0, class510 arg1, class105 arg2, class525 arg3, int arg4) {
        ++field2354;
        arg0.method1965(arg2, arg3, arg4);
        this.method989(arg1);
    }

    @OriginalMember(owner = "client!kw", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field2373;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([IZIII)Lhc;")
    public final class391 method1105(int[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 6978) {
            return null;
        } else {
            ++field2497;
            return this.method285(0, arg0, arg4, arg2, arg1, (byte) 89, 0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "(I)V")
    public final void method1106(int arg0) {
        if (class240.field3508 != this.field2595) {
            class203 var2 = this.field2595;
            this.field2595 = class240.field3508;
            if (var2.method1313(2)) {
                this.method1136((byte) -69);
            }
            this.field2614 = this.field2634;
            this.field2569 &= -32;
        }
        int var3 = 14 % ((16 - arg0) / 43);
        ++field2504;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljt;II[FIZ)Lhc;")
    public final class391 method1107(class489 arg0, int arg1, int arg2, float[] arg3, int arg4, boolean arg5) {
        ++field2360;
        if (arg4 > -50) {
            this.field2649 = null;
        }
        return this.method294(127, 0, 0, arg5, arg2, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(FFFFIFF)Z")
    private final boolean method1108(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, float arg6) {
        ++field2390;
        Buffer var8 = this.field2652.method410(true, (byte) -56);
        if (var8 == null) {
            return false;
        } else {
            if (arg4 != -21264) {
                this.field2645 = null;
            }
            Stream var9 = this.method1163(var8, arg4 ^ 17001);
            if (Stream.method3328()) {
                var9.method3326(arg5);
                var9.method3326(arg1);
                var9.method3326(arg6);
                var9.method3326(arg2);
                var9.method3326(arg3);
                var9.method3326(arg0);
            } else {
                var9.method3333(arg5);
                var9.method3333(arg1);
                var9.method3333(arg6);
                var9.method3333(arg2);
                var9.method3333(arg3);
                var9.method3333(arg0);
            }
            var9.method3332();
            return this.field2652.method411(124);
        }
    }

    @OriginalMember(owner = "client!kw", name = "L", descriptor = "(I)V")
    public final void method972(int arg0) {
        this.field2580 = 0;
        ++field2458;
        while (~arg0 < -2) {
            ++this.field2580;
            arg0 >>= 1;
        }
        this.field2633 = 1 << this.field2580;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(IIIIII)V")
    public final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2475;
        float var7 = this.method335((byte) 75);
        this.method1118(1);
        this.method1168(arg4, (byte) 87);
        this.method1160(0, (byte) -113, class455.field6635);
        this.method1097(-14186, class455.field6635, 0);
        this.method1098(arg5, false);
        this.field2531.method758((byte) 100, (float) (arg2 + -1), 1.0F, (float) (arg3 + -1));
        this.field2531.method759((float) arg1 - var7, (float) arg0 - var7, -31285, 0.0F);
        this.method1135(10088);
        this.method344((byte) -5, false);
        this.method1128(class288.field4247, true, 4);
        this.method344((byte) -5, true);
        this.method1097(-14186, class248.field3625, 0);
        this.method1160(0, (byte) -113, class248.field3625);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class116 method1040(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2471;
        class350 var6 = new class350(this, arg2, arg3, arg4);
        var6.method231(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method295(boolean arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "()Z")
    public final boolean method973() {
        ++field2447;
        return this.field2542[3].method40(118);
    }

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "(I)V")
    public final void method1109(int arg0) {
        if (this.field2591[this.field2547] != class465.field6730) {
            this.field2591[this.field2547] = class465.field6730;
            this.field2619[this.field2547].method620();
            this.method1141((byte) 107);
        }
        ++field2411;
        if (arg0 != 5) {
            this.field2565 = -0.7367288F;
        }
    }

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "(I)V")
    public abstract void method346(int arg0);

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "(III)V")
    public final void method974(int arg0, int arg1, int arg2) {
        if (this.field2609 != arg0 || this.field2546 != arg1 || this.field2627 != arg2) {
            this.field2627 = arg2;
            this.field2546 = arg1;
            this.field2609 = arg0;
            if (!this.field2563) {
                this.method1103(512);
                this.method334(false);
            }
        }
        ++field2385;
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(B)[F")
    public final float[] method1110(byte arg0) {
        ++field2344;
        return arg0 != -93 ? null : this.field2634;
    }

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "(I)V")
    private final void method1111(int arg0) {
        if (arg0 == 192) {
            this.field2544 = (float) this.field2601 + -this.field2558;
            ++field2523;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method968(Canvas arg0) {
        ++field2501;
        if (this.field2493 == arg0) {
            throw new RuntimeException();
        } else if (!this.field2359.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method283(1, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field2359.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "()Z")
    public final boolean method1031() {
        ++field2462;
        return this.field2548;
    }

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "()Z")
    public final boolean method1002() {
        ++field2343;
        return false;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZB)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1112(int arg0, boolean arg1, byte arg2) {
        ++field2412;
        if (arg2 < 84) {
            this.field2548 = true;
        }
        return this.field2391.method3320(arg0, arg1);
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ln;Ldda;II)V")
    public class174(Canvas arg0, Object arg1, class472 arg2, class597 arg3, int arg4, int arg5) {
        super(arg2);
        this.field2541 = arg4;
        this.field2430 = arg3;
        this.field2351 = this.field2487 = arg1;
        this.field2377 = this.field2493 = arg0;
        Dimension var7 = arg0.getSize();
        this.field2639 = arg5;
        this.field2372 = this.field2361 = var7.height;
        this.field2395 = this.field2362 = var7.width;
        class587.method3427(false, false, true);
        this.field2556 = new class534(this, super.field2262);
        this.field2499 = new NativeInterface(super.field2262.method1767((byte) -128), this.field2639);
        for (int var8 = 0; ~var8 > ~super.field2262.method1767((byte) 90); ++var8) {
            class83 var9 = super.field2262.method1762(var8, (byte) 45);
            if (var9 != null) {
                this.field2499.initTextureMetrics(var8, var9.field962, var9.field960);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "(I)Loe;")
    public final class124 method1113(int arg0) {
        if (arg0 <= 63) {
            this.field2564 = true;
        }
        ++field2423;
        return this.field2619[this.field2547];
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "()I")
    public final int method1018() {
        ++field2376;
        return this.field2574;
    }

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "(I)V")
    public abstract void method284(int arg0);

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(B)V")
    private final void method1114(byte arg0) {
        int var2 = -110 % ((39 - arg0) / 33);
        if (!this.field2564) {
            float[] var3 = this.field2602;
            float var4 = (float) this.field2574 + -this.field2558;
            float var5 = (float) this.field2601 + -this.field2558;
            float var6 = (float) (-this.field2626) * this.field2607 / (float) this.field2636;
            float var7 = (float) (-this.field2623) * this.field2607 / (float) this.field2573;
            float var8 = (float) (this.field2395 - this.field2623) * this.field2607 / (float) this.field2573;
            float var9 = (float) (-this.field2626 + this.field2372) * this.field2607 / (float) this.field2636;
            if (var7 != var8 && var6 != var9) {
                var3[5] = 2.0F / (var9 - var6);
                var3[10] = 1.0F / (var4 - var5);
                var3[7] = 0.0F;
                var3[13] = (var6 + var9) / (-var9 + var6);
                var3[4] = 0.0F;
                var3[0] = 2.0F / (-var7 + var8);
                var3[15] = 1.0F;
                var3[8] = 0.0F;
                var3[3] = 0.0F;
                var3[6] = 0.0F;
                var3[9] = 0.0F;
                var3[1] = 0.0F;
                var3[14] = var4 / (var4 - var5);
                var3[2] = 0.0F;
                var3[11] = 0.0F;
                var3[12] = (var7 + var8) / (-var8 + var7);
            } else {
                var3[1] = 0.0F;
                var3[6] = 0.0F;
                var3[2] = 0.0F;
                var3[14] = 0.0F;
                var3[13] = 0.0F;
                var3[4] = 0.0F;
                var3[5] = 1.0F;
                var3[12] = 0.0F;
                var3[9] = 0.0F;
                var3[7] = 0.0F;
                var3[10] = 1.0F;
                var3[11] = 0.0F;
                var3[15] = 1.0F;
                var3[8] = 0.0F;
                var3[3] = 0.0F;
                var3[0] = 1.0F;
            }
            this.method1111(192);
            this.field2564 = true;
        }
        ++field2453;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lhba;IZIZ)V")
    public abstract void method319(class404 arg0, int arg1, boolean arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "(I)V")
    public abstract void method308(int arg0);

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "(I)V")
    public abstract void method357(int arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILlc;Ljt;II)Lhc;")
    public abstract class391 method317(int arg0, class629 arg1, class489 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "(I)V")
    private final void method1115(int arg0) {
        if (!this.field2586) {
            float[] var2 = this.field2622;
            if (~this.field2395 != -1 && this.field2372 != 0) {
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 1.0F;
                var2[12] = -1.0F;
                var2[0] = 2.0F / (float) this.field2395;
                var2[10] = 0.5F;
                var2[5] = -2.0F / (float) this.field2372;
                var2[6] = 0.0F;
                var2[14] = 0.5F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
            } else {
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[14] = 0.0F;
                var2[10] = 1.0F;
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[5] = 1.0F;
            }
            this.field2586 = true;
        }
        if (arg0 != 3) {
            this.field2585 = 64;
        }
        ++field2392;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(BZ)V")
    public abstract void method344(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(B)I")
    public final int method1116(byte arg0) {
        if (arg0 >= -121) {
            this.method1136((byte) 127);
        }
        ++field2461;
        return this.field2604;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BB)V")
    public final void method1117(byte arg0, byte arg1) {
        if (arg0 >= -113) {
            method1166(true);
        }
        ++field2404;
        this.method1168(arg1 << 8 | arg1 << 16 | arg1 << 24 | arg1, (byte) -122);
    }

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "(I)V")
    private final void method1118(int arg0) {
        if (this.field2569 != arg0) {
            this.method1151((byte) -107);
            this.method1104((byte) 75, false);
            this.method1124(false, (byte) 123);
            this.method1157(false, -4515);
            this.method1146((byte) -87, false);
            this.method1171(false, 0, -2, false);
            this.method1142(192, 1);
            this.method1152(this.field2566, true);
            this.field2569 = 1;
        }
        ++field2422;
    }

    @OriginalMember(owner = "client!kw", name = "UA", descriptor = "(IIIII)V")
    public final void method1015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2389;
        this.method983(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!kw", name = "la", descriptor = "(FF)V")
    public final void method1009(float arg0, float arg1) {
        ++field2407;
        if (this.field2539 != arg0 || this.field2558 != arg1) {
            this.field2558 = arg1;
            this.field2539 = arg0;
            this.method1111(192);
            this.method1101(14);
            this.method1167(50);
            this.method1177(59);
        }
    }

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "(B)V")
    private final void method1119(byte arg0) {
        ++field2479;
        if (arg0 >= 19) {
            this.method339(false);
            if (this.field2615 != null) {
                this.field2615.method384(-1);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1023(Canvas arg0) {
        ++field2415;
        Object var2 = null;
        if (arg0 != null && this.field2493 != arg0) {
            if (this.field2359.containsKey(arg0)) {
                var2 = this.field2359.get(arg0);
            }
        } else {
            var2 = this.field2351;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method309(true, var2, arg0);
            if (this.field2377 == arg0) {
                this.method1154((byte) -91);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(II)Lg;")
    public final class512 method1120(int arg0, int arg1) {
        if (~(arg0 * 2) < ~this.field2643.method404(-4469)) {
            this.field2643.method464(true, arg0);
        }
        if (arg1 != 27) {
            return null;
        } else {
            ++field2383;
            return this.field2643;
        }
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "(B)F")
    public abstract float method335(byte arg0);

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "(I)V")
    public final void method1121(int arg0) {
        if (~this.field2569 != -5) {
            this.method1151((byte) -102);
            this.method1104((byte) 82, false);
            this.method1124(false, (byte) 112);
            this.method1157(false, -4515);
            this.method1146((byte) -87, false);
            this.method1171(false, arg0 + -16131, -2, false);
            this.method1098(1, false);
            this.method1142(192, 0);
            this.field2569 = 4;
        }
        if (arg0 == 16131) {
            ++field2427;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)I")
    public final int method1026(int arg0, int arg1) {
        ++field2510;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method283(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(I)V")
    public final void method1044(int arg0) {
        ++field2348;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "(B)Loe;")
    public final class124 method1122(byte arg0) {
        if (arg0 != 65) {
            this.method1154((byte) 92);
        }
        ++field2435;
        return this.field2619[this.field2547];
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(Z)V")
    public final void method1123(boolean arg0) {
        if (!arg0) {
            this.field2541 = -84;
        }
        ++field2398;
        Hashtable var2 = new Hashtable();
        if (this.field2359 != null && !this.field2359.isEmpty()) {
            Enumeration var3 = this.field2359.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method283(1, var4));
            }
        }
        this.field2359 = var2;
        this.method1148((byte) -127);
        this.method1133((byte) -78);
        this.field2638.method3299(arg0, this);
    }

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "(I)V")
    public abstract void method353(int arg0);

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "(I)V")
    public abstract void method349(int arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjt;[BIIB)Lpl;")
    public abstract class560 method355(int arg0, class489 arg1, byte[] arg2, int arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "(I)V")
    public abstract void method352(int arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZB)V")
    public final void method1124(boolean arg0, byte arg1) {
        ++field2345;
        if (!this.field2577 != !arg0) {
            this.field2577 = arg0;
            this.method324((byte) -52);
            this.field2569 &= -8;
        }
        if (arg1 <= 93) {
            this.method1122((byte) -128);
        }
    }

    @OriginalMember(owner = "client!kw", name = "xa", descriptor = "()V")
    public final void method1034() {
        this.field2563 = false;
        ++field2402;
        this.method1169(0, false, 0, 0, false, (byte) 63);
        this.method1103(512);
        this.method334(false);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lqr;Z)Lha;")
    public final class116 method961(class610 arg0, boolean arg1) {
        ++field2355;
        class116 var9;
        if (arg0.field8975 != 0 && arg0.field8972 != 0) {
            int[] var3 = new int[arg0.field8975 * arg0.field8972];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field8970 != null) {
                for (int var6 = 0; ~var6 > ~arg0.field8972; ++var6) {
                    for (int var7 = 0; ~arg0.field8975 < ~var7; ++var7) {
                        var3[var5++] = class313.method1926(arg0.field8974[class637.method3693(255, arg0.field8976[var4])], arg0.field8970[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; arg0.field8972 > var8; ++var8) {
                    for (int var10 = 0; ~var10 > ~arg0.field8975; ++var10) {
                        int var11 = arg0.field8974[arg0.field8976[var4++] & 255];
                        var3[var5++] = var11 != 0 ? class313.method1926(-16777216, var11) : 0;
                    }
                }
            }
            var9 = this.method982(var3, 0, arg0.field8975, arg0.field8975, arg0.field8972);
        } else {
            var9 = this.method982(new int[1], 0, 1, 1, 1);
        }
        var9.method720(arg0.field8971, arg0.field8973, arg0.field8968, arg0.field8969);
        return var9;
    }

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "(I)V")
    public final void method1125(int arg0) {
        ++field2424;
        if (this.field2569 != 2) {
            this.method1151((byte) -116);
            this.method1104((byte) 124, false);
            this.method1124(false, (byte) 112);
            this.method1157(false, -4515);
            this.method1146((byte) -87, false);
            this.method1171(false, 0, -2, false);
            this.field2569 = 2;
        }
        if (arg0 != 2048) {
            this.method1157(true, 11);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lbt;IIII)Lr;")
    public final class520 method954(class114 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2414;
        return new class470(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Z")
    public static final boolean method1126(int arg0, int arg1, int arg2) {
        ++field2352;
        return arg1 != 544 ? true : ~(24 & arg2) != -1 | ~(arg2 & 544) == -545;
    }

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "(B)V")
    private final void method1127(byte arg0) {
        this.field2613 = (float) (this.field2587 - this.field2623);
        this.field2608 = (float) (-this.field2626 + this.field2572);
        ++field2394;
        this.field2583 = (float) (-this.field2626 + this.field2592);
        int var2 = -117 % ((1 - arg0) / 46);
        this.field2576 = (float) (this.field2606 - this.field2623);
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(Z)V")
    public abstract void method342(boolean arg0);

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)Lu;")
    public final class425 method1013(int arg0) {
        ++field2358;
        class232 var2 = new class232(arg0);
        this.field2507.method2492(var2, (byte) -86);
        return var2;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIII)Llh;")
    public final class125 method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2468;
        return new class148(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method309(boolean arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lud;ZI)V")
    private final void method1128(class119 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field2546 = -91;
        }
        this.method326(43, this.field2647);
        ++field2478;
        this.method296(0, this.field2644, 79);
        this.method300(0, arg0, arg2, -126);
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(Z)V")
    public final void method1129(boolean arg0) {
        ++field2486;
        if (arg0) {
            if (~this.field2569 != -9) {
                this.method1161(false);
                this.method1104((byte) 96, true);
                this.method1157(true, -4515);
                this.method1146((byte) -87, true);
                this.method1098(1, false);
                this.field2569 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ[[II)Ldf;")
    public abstract class547 method305(int arg0, boolean arg1, int[][] arg2, int arg3);

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)V")
    public static final void method1130(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field5987 != null) {
                var3.field5987 = null;
            }
            if (var3.field5978 != null) {
                var3.field5978 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "P", descriptor = "()F")
    public final float method957() {
        ++field2369;
        return this.field2539;
    }

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "(I)V")
    public abstract void method281(int arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lr;Loaa;Lm;[Lgr;I)V")
    public final void method958(class520[] arg0, class510 arg1, class105 arg2, class525[] arg3, int arg4) {
        this.method967(arg0, arg2, arg3, arg4);
        ++field2452;
        this.method989(arg1);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(Z)V")
    public final void method953(boolean arg0) {
        ++field2448;
    }

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "()I")
    public final int method994() {
        ++field2378;
        return this.field2549 + -2;
    }

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "(I)I")
    public final int method1131(int arg0) {
        ++field2406;
        if (arg0 >= -81) {
            this.field2567 = false;
        }
        return this.field2559;
    }

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "(ILpa;II)V")
    public final void method956(int arg0, class594 arg1, int arg2, int arg3) {
        ++field2416;
        class183 var5 = (class183) arg1;
        class391 var6 = var5.field2791;
        this.method1125(2048);
        this.method1152(var6, true);
        this.method1098(1, false);
        this.method1102(class43.field527, class43.field527, 126);
        this.method1160(0, (byte) -113, class455.field6635);
        this.method1168(arg0, (byte) -126);
        this.field2531.method758((byte) 100, (float) this.field2395, 0.0F, (float) this.field2372);
        this.method1135(10088);
        this.field2619[0].method758((byte) 100, var6.method565(-32442, (float) this.field2395), 1.0F, var6.method569(-2297, (float) this.field2372));
        this.field2619[0].method759(var6.method569(-2297, (float) (-arg3)), var6.method565(-32442, (float) (-arg2)), -31285, 0.0F);
        this.field2591[0] = class235.field3452;
        this.method1141((byte) 87);
        this.method1143(3160);
        this.method1109(5);
        this.method1160(0, (byte) -113, class248.field3625);
    }

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "(I)Loe;")
    public final class124 method1132(int arg0) {
        ++field2456;
        if (arg0 != 1) {
            this.field2549 = -81;
        }
        return this.field2535;
    }

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "()Z")
    public final boolean method976() {
        ++field2397;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "(B)V")
    private final void method1133(byte arg0) {
        ++field2438;
        this.field2652 = this.method304(true, false);
        int var2 = 77 / ((39 - arg0) / 58);
        this.field2652.method412(24, 12, (byte) -61);
        this.field2658 = this.method312(new class314[] { new class314(class176.field2671) }, (byte) 72);
    }

    @OriginalMember(owner = "client!kw", name = "N", descriptor = "(IIII)V")
    public final void method1022(int arg0, int arg1, int arg2, int arg3) {
        this.field2606 = this.field2395 < arg2 ? 0 : arg2;
        this.field2587 = arg0 >= 0 ? arg0 : 0;
        this.field2592 = ~arg3 >= ~this.field2395 ? arg3 : 0;
        ++field2405;
        this.field2572 = arg1 < 0 ? 0 : arg1;
        if (~this.field2587 >= -1 && this.field2395 <= this.field2606 && this.field2572 <= 0 && ~this.field2592 <= ~this.field2372) {
            this.method985();
        } else {
            if (!this.field2660) {
                this.field2660 = true;
                this.method290((byte) -49);
            }
            this.method352(101);
            this.method1127((byte) 81);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I[F)[F")
    public final float[] method1134(int arg0, float[] arg1) {
        arg1[0] = this.field2614[0];
        arg1[8] = this.field2614[2];
        arg1[4] = this.field2614[1];
        arg1[12] = this.field2614[3];
        ++field2481;
        arg1[13] = this.field2614[7];
        arg1[5] = this.field2614[5];
        arg1[9] = this.field2614[6];
        arg1[2] = this.field2614[8];
        arg1[1] = this.field2614[4];
        if (arg0 > -59) {
            this.method976();
        }
        arg1[14] = this.field2614[11];
        arg1[10] = this.field2614[10];
        arg1[6] = this.field2614[9];
        arg1[3] = this.field2614[12];
        arg1[7] = this.field2614[13];
        arg1[11] = this.field2614[14];
        arg1[15] = this.field2614[15];
        return arg1;
    }

    @OriginalMember(owner = "client!kw", name = "IA", descriptor = "(III[I)V")
    public final void method1037(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2441;
        float var5 = this.field2533.method749((float) arg1, (float) arg0, (float) arg2, 5);
        if (!((float) this.field2574 > var5) && !(var5 > (float) this.field2601)) {
            int var6 = (int) ((float) this.field2573 * this.field2533.method763((float) arg1, (float) arg2, 2, (float) arg0) / var5);
            int var7 = (int) ((float) this.field2636 * this.field2533.method753((float) arg1, (float) arg0, (float) arg2, (byte) -128) / var5);
            if ((float) var6 >= this.field2613 && (float) var6 <= this.field2576 && this.field2608 <= (float) var7 && (float) var7 <= this.field2583) {
                arg3[0] = (int) ((float) var6 + -this.field2613);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field2608);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method297(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "(I)V")
    public abstract void method316(int arg0);

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "(I)V")
    private final void method1135(int arg0) {
        if (class133.field1764 == this.field2595) {
            float var2 = this.method335((byte) 75);
            this.field2531.method759(var2, var2, -31285, 0.0F);
        }
        ++field2463;
        this.field2620 = false;
        this.method346(118);
        if (arg0 == 10088) {
            if (this.field2615 != null) {
                this.field2615.method382(arg0 + -10013);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lr;Lm;[Lgr;I)V")
    public final void method967(class520[] arg0, class105 arg1, class525[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1965(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field2520;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
    public final void method970(int arg0) {
        ++field2399;
    }

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "(B)V")
    private final void method1136(byte arg0) {
        this.field2620 = false;
        if (arg0 != -69) {
            this.field2535 = null;
        }
        ++field2365;
        if (this.field2615 != null) {
            this.field2615.method385((byte) 77);
        }
        this.method357(arg0 + 69);
    }

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "(I)Loe;")
    public final class124 method1137(int arg0) {
        ++field2386;
        if (arg0 != 0) {
            this.field2351 = null;
        }
        return this.field2531;
    }

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "(B)V")
    public final void method1138(byte arg0) {
        ++field2512;
        this.field2531.method620();
        this.field2528 = true;
        if (arg0 >= -22) {
            this.method1141((byte) -42);
        }
        this.method1135(10088);
    }

    @OriginalMember(owner = "client!kw", name = "U", descriptor = "()I")
    public final int method1029() {
        ++field2350;
        return this.field2532 + this.field2529 + this.field2530;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method964(Canvas arg0) {
        this.field2351 = null;
        this.field2377 = null;
        ++field2346;
        if (arg0 != null && this.field2493 != arg0) {
            if (this.field2359.containsKey(arg0)) {
                this.field2351 = this.field2359.get(arg0);
                this.field2377 = arg0;
            }
        } else {
            this.field2351 = this.field2487;
            this.field2377 = this.field2493;
        }
        if (this.field2377 != null && this.field2351 != null) {
            this.method295(false, this.field2351, this.field2377);
            this.method1154((byte) -91);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI)V")
    public final void method1139(boolean arg0, int arg1) {
        if (this.field2567 == !arg0) {
            this.field2567 = arg0;
            this.method324((byte) -52);
        }
        if (arg1 == 4) {
            ++field2495;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class594 method1028(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field2440;
        return class379.method2302(arg1, arg0, (byte) -114, arg3, arg2, this);
    }

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "(B)Loe;")
    public final class124 method1140(byte arg0) {
        ++field2527;
        if (!this.field2620) {
            this.field2537.method754(this.field2535, this.field2531);
            this.field2620 = true;
        }
        int var2 = 102 / ((arg0 - 52) / 43);
        return this.field2537;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "([I)V")
    public final void method1025(int[] arg0) {
        arg0[0] = this.field2587;
        ++field2431;
        arg0[3] = this.field2592;
        arg0[1] = this.field2572;
        arg0[2] = this.field2606;
    }

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "(B)V")
    private final void method1141(byte arg0) {
        ++field2511;
        if (arg0 < 60) {
            method1130(102, 80, -104);
        }
        this.method359(-32);
        if (this.field2615 != null) {
            this.field2615.method381((byte) -48);
        }
    }

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "(B)V")
    public abstract void method290(byte arg0);

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(II)V")
    public final void method1142(int arg0, int arg1) {
        ++field2347;
        if (arg0 != 192) {
            this.field2353 = null;
        }
        if (arg1 != 1) {
            if (arg1 == 0) {
                this.method1102(class609.field8962, class609.field8962, -45);
            } else if (arg1 == 2) {
                this.method1102(class106.field1327, class43.field527, 126);
            } else {
                if (arg1 != 3) {
                    if (~arg1 == -5) {
                        this.method1102(class414.field5915, class414.field5915, 127);
                        return;
                    }
                } else {
                    this.method1102(class308.field4477, class609.field8962, 126);
                }
            }
        } else {
            this.method1102(class43.field527, class43.field527, -75);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lm;)V")
    public final void method999(class105 arg0) {
        ++field2429;
        this.field2533 = (class124) arg0;
        this.field2535.method618(this.field2533);
        this.field2535.method760(true);
        this.field2536.method756(this.field2535, 0);
        this.field2534.method756(this.field2533, 0);
        if (this.field2595.method1313(2)) {
            this.method1136((byte) -69);
        }
    }

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "(B)V")
    public abstract void method343(byte arg0);

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "(IIIII)V")
    public final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2436;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class543 method965(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2506;
        return new class516(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "(I)V")
    public final void method1143(int arg0) {
        ++field2434;
        if (arg0 == 3160) {
            this.method1128(class25.field227, true, 2);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Llh;)V")
    public final void method962(class125 arg0) {
        ++field2356;
        this.field2618 = (class182) arg0;
    }

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "(I)V")
    public void method356(int arg0) {
        ++field2460;
        this.method1155(true);
        if (arg0 != -4358) {
            this.method976();
        }
    }

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "(B)V")
    private final void method1144(byte arg0) {
        ++field2517;
        if (arg0 >= -93) {
            this.field2559 = 68;
        }
        if (!this.field2578) {
            float[] var2 = this.field2553;
            float var3 = (float) (-this.field2623 * this.field2574) / (float) this.field2573;
            float var4 = (float) ((this.field2395 - this.field2623) * this.field2574) / (float) this.field2573;
            float var5 = (float) (this.field2626 * this.field2574) / (float) this.field2636;
            float var6 = (float) ((-this.field2372 + this.field2626) * this.field2574) / (float) this.field2636;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field2574 * 2.0F;
                var2[6] = 0.0F;
                var2[11] = -1.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[10] = this.field2540 = (float) this.field2601 / (float) (-this.field2601 + this.field2574);
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[12] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[14] = this.field2635 = (float) (this.field2601 * this.field2574) / (float) (-this.field2601 + this.field2574);
            } else {
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[0] = 1.0F;
                var2[14] = 0.0F;
            }
            this.method1101(14);
            this.field2578 = true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8) {
        ++field2500;
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "()Z")
    public final boolean method1012() {
        ++field2484;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(BZ)V")
    public final void method1145(byte arg0, boolean arg1) {
        ++field2457;
        if (arg0 <= -127) {
            if (this.field2545 == !arg1) {
                this.field2545 = arg1;
                this.method334(false);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIF)Lat;")
    public final class535 method995(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field2503;
        return new class437(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kw", name = "J", descriptor = "(I)V")
    public void method340(int arg0) {
        ++field2437;
        this.field2584 = this.field2611;
        this.field2611 = arg0;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(BZ)V")
    public final void method1146(byte arg0, boolean arg1) {
        if (!this.field2594 == arg1) {
            this.field2594 = arg1;
            this.method284(-5);
            this.field2569 &= -32;
        }
        ++field2469;
        if (arg0 != -87) {
            this.field2571 = false;
        }
    }

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "(I)V")
    public abstract void method331(int arg0);

    @OriginalMember(owner = "client!kw", name = "M", descriptor = "(I)V")
    private final void method1147(int arg0) {
        this.field2586 = false;
        ++field2349;
        if (arg0 < 80) {
            this.field2573 = -81;
        }
        if (class133.field1764 == this.field2595) {
            this.method1115(3);
            this.method1119((byte) 87);
        }
    }

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "(B)V")
    private final void method1148(byte arg0) {
        this.field2644 = this.method304(false, false);
        ++field2513;
        this.field2644.method412(140, 28, (byte) -61);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field2644.method410(true, (byte) -56);
            if (var3 != null) {
                Stream var4 = this.method1163(var3, -4455);
                if (!Stream.method3328()) {
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(1.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(1.0F);
                    var4.method3333(0.0F);
                    var4.method3333(1.0F);
                    var4.method3333(1.0F);
                    var4.method3333(1.0F);
                    var4.method3333(0.0F);
                    var4.method3333(1.0F);
                    var4.method3333(1.0F);
                    var4.method3333(1.0F);
                    var4.method3333(1.0F);
                    var4.method3333(1.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(1.0F);
                    var4.method3333(0.0F);
                    var4.method3333(1.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                    var4.method3333(0.0F);
                } else {
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(1.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(1.0F);
                    var4.method3326(0.0F);
                    var4.method3326(1.0F);
                    var4.method3326(1.0F);
                    var4.method3326(1.0F);
                    var4.method3326(0.0F);
                    var4.method3326(1.0F);
                    var4.method3326(1.0F);
                    var4.method3326(1.0F);
                    var4.method3326(1.0F);
                    var4.method3326(1.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(1.0F);
                    var4.method3326(0.0F);
                    var4.method3326(1.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                    var4.method3326(0.0F);
                }
                var4.method3332();
                if (this.field2644.method411(118)) {
                    break;
                }
            }
        }
        if (arg0 > -123) {
            this.method319((class404) null, -84, false, 3, true);
        }
        this.field2647 = this.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679, class176.field2679 }) }, (byte) 72);
    }

    @OriginalMember(owner = "client!kw", name = "N", descriptor = "(I)I")
    public final int method1149(int arg0) {
        if (arg0 < 47) {
            this.field2604 = -108;
        }
        ++field2470;
        return this.field2547;
    }

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "()V")
    public final void method985() {
        if (this.field2660) {
            this.field2660 = false;
            this.method290((byte) -49);
        }
        ++field2363;
        this.field2587 = 0;
        this.field2592 = this.field2372;
        this.field2572 = 0;
        this.field2606 = this.field2395;
        this.method1127((byte) -107);
    }

    @OriginalMember(owner = "client!kw", name = "O", descriptor = "(I)V")
    public final void method1150(int arg0) {
        ++field2524;
        this.field2552 = new class464[this.field2585];
        this.field2625 = new class464[this.field2585];
        this.field2591 = new class68[this.field2585];
        this.field2619 = new class124[this.field2585];
        this.field2600 = new class60[this.field2585];
        for (int var2 = 0; ~this.field2585 < ~var2; ++var2) {
            this.field2552[var2] = class609.field8962;
            this.field2625[var2] = class609.field8962;
            this.field2591[var2] = class465.field6730;
            this.field2619[var2] = new class124();
        }
        this.field2617 = new class535[this.field2549 + -2];
        this.field2566 = this.method317(1, class629.field9208, class411.field5856, arg0 ^ -19843, 1);
        this.method971(new class232(262144));
        this.field2642 = this.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679 }) }, (byte) 72);
        if (arg0 != 19933) {
            this.method1178((byte) 28);
        }
        this.field2653 = this.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2677 }) }, (byte) 72);
        this.field2659 = this.method312(new class314[] { new class314(class176.field2671), new class314(class176.field2677), new class314(class176.field2679), new class314(class176.field2676) }, (byte) 72);
        this.field2656 = this.method312(new class314[] { new class314(class176.field2671), new class314(class176.field2677), new class314(class176.field2679) }, (byte) 72);
        this.field2655 = new class470(this, 0, 0, false, false);
        this.field2650 = new class470(this, 0, 0, true, true);
        this.field2651 = new class470(this, 0, 0, false, false);
        this.field2649 = new class470(this, 0, 0, true, true);
        this.field2657 = new class470(this, 0, 0, false, false);
        this.field2646 = new class470(this, 0, 0, true, true);
        this.field2641 = new class470(this, 0, 0, false, false);
        this.field2654 = new class470(this, 0, 0, true, true);
        this.field2648 = new class470(this, 0, 0, false, false);
        this.field2645 = new class470(this, 0, 0, true, true);
        this.field2638 = new class564(this);
        this.field2643 = this.method302(true, -117);
        this.method1123(true);
        this.field2413 = new class588(this);
        this.field2542[1] = this.method314(-108, 1);
        this.field2542[2] = this.method314(115, 2);
        this.field2542[4] = this.method314(-100, 4);
        this.field2542[5] = this.method314(37, 5);
        this.field2542[6] = this.method314(86, 6);
        this.field2542[7] = this.method314(41, 7);
        this.field2542[3] = this.method314(-62, 3);
        this.field2542[8] = this.method314(-61, 8);
        this.field2542[9] = this.method314(-88, 9);
        if (!this.field2542[2].method40(115)) {
            this.field2542[2] = this.method314(-63, 0);
        }
        if (!this.field2542[4].method40(arg0 ^ 19884)) {
            this.field2542[4] = this.field2542[2];
        }
        if (!this.field2542[8].method40(arg0 + -19848)) {
            this.field2542[8] = this.field2542[4];
        }
        if (!this.field2542[9].method40(126)) {
            this.field2542[9] = this.field2542[8];
        }
        this.method356(-4358);
        this.method985();
    }

    @OriginalMember(owner = "client!kw", name = "P", descriptor = "(I)V")
    public abstract void method325(int arg0);

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "(B)V")
    private final void method1151(byte arg0) {
        int var2 = 52 / ((arg0 - -44) / 55);
        if (class133.field1764 != this.field2595) {
            class203 var3 = this.field2595;
            this.field2595 = class133.field1764;
            if (var3.method1313(2)) {
                this.method1136((byte) -69);
            }
            this.method1115(3);
            this.field2614 = this.field2622;
            this.method1119((byte) 49);
            this.field2569 &= -25;
        }
        ++field2420;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lmn;Z)V")
    public final void method1152(class60 arg0, boolean arg1) {
        ++field2491;
        if (arg1) {
            if (this.field2600[this.field2547] != arg0) {
                this.field2600[this.field2547] = arg0;
                if (arg0 == null) {
                    this.method281(73);
                } else {
                    arg0.method380(10);
                }
                this.field2569 &= -2;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I[IIIZBI)Lhc;")
    public abstract class391 method285(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ldd;[Lqr;Z)Lra;")
    public final class262 method998(class166 arg0, class610[] arg1, boolean arg2) {
        ++field2433;
        return new class572(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "()Z")
    public final boolean method977() {
        ++field2522;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "Q", descriptor = "(I)V")
    public final void method1153(int arg0) {
        this.method1106(-44);
        ++field2357;
        if (arg0 > -54) {
            this.method285(57, (int[]) null, 78, -81, true, (byte) 84, 126);
        }
        this.method1119((byte) 90);
    }

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "(B)V")
    private final void method1154(byte arg0) {
        ++field2521;
        if (this.field2377 != null) {
            Dimension var2 = this.field2377.getSize();
            this.field2361 = var2.height;
            this.field2362 = var2.width;
        } else {
            this.field2362 = this.field2361 = 1;
        }
        this.field2395 = this.field2362;
        this.field2372 = this.field2361;
        if (arg0 != -91) {
            this.method1150(-43);
        }
        this.method1147(115);
        this.method1177(59);
        this.method1167(arg0 ^ -39);
        this.method343((byte) 126);
        this.method1127((byte) -79);
        this.method1106(-56);
        this.method985();
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(Z)V")
    private final void method1155(boolean arg0) {
        ++field2417;
        this.method330((byte) -125);
        this.method342(arg0);
        this.method324((byte) -52);
        this.method340(0);
        this.method316(4);
        this.method353(-44);
        this.method282((byte) -46);
        if (arg0) {
            this.method299(0);
            this.method284(-5);
            this.method334(false);
            this.method358((byte) 127);
            this.method331(1);
            this.method310(0);
            this.method323(2);
            for (int var2 = this.field2585 + -1; var2 >= 0; --var2) {
                this.method1159(var2, !arg0);
                this.method308(46);
                this.method336((byte) -111);
                this.method1109(5);
            }
            this.method325(0);
            this.method343((byte) 125);
            this.method339(false);
            this.method346(-117);
            this.method357(0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I[Lat;)V")
    public final void method1045(int arg0, class535[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field2617[var3] = arg1[var3];
        }
        ++field2408;
        this.field2611 = arg0;
        if (this.field2595.method1313(2)) {
            this.method340(0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "(B)I")
    public final int method1156(byte arg0) {
        if (arg0 <= 112) {
            return -67;
        } else {
            ++field2492;
            return this.field2621;
        }
    }

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "(Z)V")
    public abstract void method339(boolean arg0);

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(IIIII)V")
    public final void method966(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2393;
        this.method983(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Llc;BLjt;)Z")
    public abstract boolean method279(class629 arg0, byte arg1, class489 arg2);

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(ZI)V")
    public final void method1157(boolean arg0, int arg1) {
        if (!this.field2570 == arg0) {
            this.field2570 = arg0;
            this.method299(arg1 + 4515);
            this.field2569 &= -32;
        }
        ++field2485;
        if (arg1 != -4515) {
            this.field2601 = -118;
        }
    }

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "()Z")
    public final boolean method986() {
        ++field2464;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "(Z)V")
    public abstract void method334(boolean arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lwo;I)V")
    public abstract void method277(class408 arg0, int arg1);

    @OriginalMember(owner = "client!kw", name = "ba", descriptor = "()I")
    public final int method1024() {
        ++field2518;
        return this.field2661;
    }

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "(B)V")
    private final void method1158(byte arg0) {
        if (class125.field1647 != this.field2595) {
            class203 var2 = this.field2595;
            this.field2595 = class125.field1647;
            if (!var2.method1313(2)) {
                this.method1136((byte) -69);
            }
            this.method1114((byte) -113);
            this.field2614 = this.field2602;
            this.method1119((byte) 36);
            this.field2569 &= -8;
        }
        ++field2384;
        if (arg0 != 102) {
            this.method967((class520[]) null, (class105) null, (class525[]) null, -122);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Loaa;)V")
    public final void method989(class510 arg0) {
        ++field2380;
        this.field2638.method3296((byte) -66, arg0, this);
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "()V")
    public final void method1017() {
        this.field2556.method3140(2);
        ++field2477;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(IZ)V")
    public final void method1159(int arg0, boolean arg1) {
        if (~this.field2547 != ~arg0) {
            this.field2547 = arg0;
            this.method349(109);
        }
        ++field2443;
        if (arg1) {
            this.field2537 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(IIIIII)V")
    public final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2450;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        if (this.method1108(0.0F, (float) arg1, (float) arg2 + var10, (float) arg3 + var11, -21264, (float) arg0, 0.0F)) {
            this.method1118(1);
            this.method1168(arg4, (byte) -125);
            this.method1160(0, (byte) -113, class455.field6635);
            this.method1097(-14186, class455.field6635, 0);
            this.method1098(arg5, false);
            this.method1138((byte) -42);
            this.method344((byte) -5, false);
            this.method1176((byte) -107);
            this.method344((byte) -5, true);
            this.method1097(-14186, class248.field3625, 0);
            this.method1160(0, (byte) -113, class248.field3625);
        }
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "()Z")
    public final boolean method984() {
        ++field2371;
        return false;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IBLhba;)V")
    public final void method1160(int arg0, byte arg1, class404 arg2) {
        if (arg1 != -113) {
            this.method326(117, (class567) null);
        }
        this.method319(arg2, 0, false, arg0, false);
        ++field2381;
    }

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "(Z)V")
    private final void method1161(boolean arg0) {
        ++field2382;
        if (class149.field1922 != this.field2595) {
            class203 var2 = this.field2595;
            this.field2595 = class149.field1922;
            if (!var2.method1313(2)) {
                this.method1136((byte) -69);
            }
            this.method1144((byte) -116);
            this.field2614 = this.field2553;
            this.method1119((byte) 47);
            this.field2569 &= -8;
        }
        if (arg0) {
            this.field2540 = -0.27443412F;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(ZB)V")
    public final void method1162(boolean arg0, byte arg1) {
        if (this.field2637 != arg0) {
            this.field2637 = arg0;
            this.method282((byte) -116);
        }
        ++field2368;
        if (arg1 != 109) {
            this.field2395 = 28;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;")
    public final Stream method1163(Buffer arg0, int arg1) {
        this.field2575.method3325(arg0);
        ++field2455;
        return arg1 != -4455 ? null : this.field2575;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(FI)V")
    public final void method1164(float arg0, int arg1) {
        if (this.field2607 != arg0) {
            this.field2607 = arg0;
            this.method1167(82);
        }
        ++field2367;
        if (arg1 <= 110) {
            this.field2620 = false;
        }
    }

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "(B)V")
    public abstract void method358(byte arg0);

    @OriginalMember(owner = "client!kw", name = "M", descriptor = "(F)V")
    public final void method987(float arg0) {
        ++field2502;
        if (this.field2555 != arg0) {
            this.field2555 = arg0;
            this.field2499.setAmbient(arg0);
            this.method330((byte) -126);
            this.method353(-59);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z[BIIILjt;)Lhc;")
    public final class391 method1165(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4, class489 arg5) {
        ++field2426;
        if (arg4 >= -5) {
            this.field2553 = null;
        }
        return this.method320(0, arg3, arg2, false, arg5, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([IIIII)Lha;")
    public final class116 method982(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2498;
        return new class350(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "(IIII)V")
    public final void method1019(int arg0, int arg1, int arg2, int arg3) {
        ++field2525;
        this.field2621 = arg2;
        this.field2604 = arg3;
        this.field2610 = arg1;
        this.field2559 = arg0;
        this.field2563 = true;
        this.method1169(3, false, 0, 0, false, (byte) 86);
        if (this.field2615 != null) {
            this.field2615.method36(false);
        }
        this.method1103(512);
        this.method334(false);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIZI[FILjt;)Lhc;")
    public abstract class391 method294(int arg0, int arg1, int arg2, boolean arg3, int arg4, float[] arg5, int arg6, class489 arg7);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILvs;)V")
    public abstract void method326(int arg0, class567 arg1);

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "(Z)V")
    public static final void method1166(boolean arg0) {
        if (arg0) {
            method1166(true);
        }
        if (class353.field5127.toLowerCase().indexOf("microsoft") != -1) {
            class62.field728[189] = 26;
            class62.field728[221] = 43;
            class62.field728[222] = 59;
            class62.field728[192] = 58;
            class62.field728[186] = 57;
            class62.field728[187] = 27;
            class62.field728[219] = 42;
            class62.field728[188] = 71;
            class62.field728[220] = 74;
            class62.field728[191] = 73;
            class62.field728[223] = 28;
            class62.field728[190] = 72;
        } else {
            class62.field728[92] = 74;
            class62.field728[45] = 26;
            class62.field728[59] = 57;
            class62.field728[91] = 42;
            class62.field728[46] = 72;
            class62.field728[44] = 71;
            class62.field728[93] = 43;
            class62.field728[61] = 27;
            if (class353.field5147 != null) {
                class62.field728[192] = 28;
                class62.field728[520] = 59;
                class62.field728[222] = 58;
            } else {
                class62.field728[222] = 59;
                class62.field728[192] = 58;
            }
            class62.field728[47] = 73;
        }
        ++field2472;
    }

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "(IFFFFF)V")
    public final void method1008(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field2366;
        boolean var7 = this.field2596 != arg0;
        if (var7 || this.field2616 != arg1 || this.field2568 != arg2) {
            this.field2616 = arg1;
            this.field2596 = arg0;
            this.field2568 = arg2;
            if (var7) {
                this.field2550 = (float) (this.field2596 & 16711680) / 1.671168E7F;
                this.field2565 = (float) (this.field2596 & 65280) / 65280.0F;
                this.field2581 = (float) (this.field2596 & 255) / 255.0F;
                this.method330((byte) -124);
            }
            this.field2499.setSunColour(this.field2550, this.field2565, this.field2581, arg1, arg2);
            this.method342(true);
        }
        if (this.field2562[0] != arg3 || this.field2562[1] != arg4 || this.field2562[2] != arg5) {
            this.field2562[0] = arg3;
            this.field2562[1] = arg4;
            this.field2562[2] = arg5;
            this.field2612[1] = -arg4;
            this.field2612[0] = -arg3;
            this.field2612[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field2603[1] = arg4 * var8;
            this.field2603[2] = arg5 * var8;
            this.field2603[0] = arg3 * var8;
            this.field2538[0] = -this.field2603[0];
            this.field2538[1] = -this.field2603[1];
            this.field2538[2] = -this.field2603[2];
            this.field2499.setSunDirection(this.field2603[0], this.field2603[1], this.field2603[2]);
            this.method316(4);
            this.field2597 = (int) (arg5 * 256.0F / arg4);
            this.field2624 = (int) (arg3 * 256.0F / arg4);
        }
        this.method353(-120);
    }

    @OriginalMember(owner = "client!kw", name = "R", descriptor = "(I)V")
    private final void method1167(int arg0) {
        ++field2428;
        this.field2586 = false;
        int var2 = -15 % ((-3 - arg0) / 33);
        if (class125.field1647 == this.field2595) {
            this.method1114((byte) -11);
            this.method1119((byte) 71);
        }
    }

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "(IIII)V")
    public final void method993(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 < ~this.field2572) {
            this.field2572 = arg1;
        }
        ++field2396;
        if (~arg0 < ~this.field2587) {
            this.field2587 = arg0;
        }
        if (~this.field2592 < ~arg3) {
            this.field2592 = arg3;
        }
        if (arg2 < this.field2606) {
            this.field2606 = arg2;
        }
        if (~this.field2587 >= -1 && ~this.field2606 <= ~this.field2395 && this.field2572 <= 0 && ~this.field2372 >= ~this.field2592) {
            this.method985();
        } else {
            if (!this.field2660) {
                this.field2660 = true;
                this.method290((byte) -49);
            }
            this.method352(127);
            this.method1127((byte) 50);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
    public final void method1043(int arg0) {
        ++field2401;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field2628 = arg0;
            this.field2556.method3140(2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IB)V")
    public final void method1168(int arg0, byte arg1) {
        if (~this.field2554 != ~arg0) {
            this.field2554 = arg0;
            this.method325(0);
        }
        ++field2474;
        int var3 = -94 / ((-41 - arg1) / 55);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(ZI)Lg;")
    public abstract class512 method302(boolean arg0, int arg1);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZIIZB)V")
    private final void method1169(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        boolean var7 = arg1 & this.method973();
        ++field2444;
        if (!var7 && (arg0 == 4 || ~arg0 == -9 || ~arg0 == -10)) {
            arg0 = 2;
            arg2 = arg0 == 4 ? 1 & arg3 : 1;
            arg3 = 0;
        }
        if (~arg0 != -1 && arg4) {
            arg0 |= Integer.MIN_VALUE;
        }
        int var8 = -103 % ((-15 - arg5) / 57);
        if (this.field2632 != arg0) {
            if (this.field2632 != 0) {
                this.field2542[this.field2632 & Integer.MAX_VALUE].method38((byte) 59);
            }
            if (arg0 == 0) {
                this.field2615 = null;
            } else {
                this.field2615 = this.field2542[arg0 & Integer.MAX_VALUE];
                this.field2615.method35(arg4, (byte) -41);
                this.field2615.method39(0, arg4);
                this.field2615.method43(arg2, (byte) -60, arg3);
            }
            this.field2560 = arg3;
            this.field2632 = arg0;
            this.field2590 = arg2;
        } else if (~this.field2632 != -1) {
            this.field2542[Integer.MAX_VALUE & this.field2632].method39(0, arg4);
            if (~this.field2560 != ~arg3 || this.field2590 != arg2) {
                this.field2542[Integer.MAX_VALUE & this.field2632].method43(arg2, (byte) -60, arg3);
                this.field2560 = arg3;
                this.field2590 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "S", descriptor = "(I)V")
    public final void method1170(int arg0) {
        if (arg0 != 16238) {
            method1172(-105, 111, -30);
        }
        ++field2446;
        if (this.field2569 != 16) {
            this.method1158((byte) 102);
            this.method1104((byte) 86, true);
            this.method1157(true, -4515);
            this.method1146((byte) -87, true);
            this.method1098(1, false);
            this.field2569 = 16;
        }
    }

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "()V")
    public void method298() {
        ++field2483;
        if (!this.field2589) {
            for (class496 var1 = this.field2507.method2496((byte) 126); var1 != null; var1 = this.field2507.method2494(54)) {
                ((class232) var1).method1515((byte) -99);
            }
            Enumeration var2 = this.field2359.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method297(this.field2359.get(var3), 0, var3);
            }
            class621.method3596(0, false, true);
            this.field2499.release();
            this.field2589 = true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "T", descriptor = "(I)V")
    public abstract void method323(int arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)I")
    public final int method978(int arg0, int arg1) {
        ++field2505;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "()Z")
    public final boolean method1006() {
        ++field2421;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZIIZ)V")
    public final void method1171(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (this.field2551 != arg2) {
            if (~arg2 > -1) {
                this.method1109(arg1 + 5);
                this.method1152((class60) null, true);
                this.method1142(192, 0);
                if (!this.field2563) {
                    this.method1169(0, arg3, 0, 0, arg0, (byte) -113);
                }
            } else {
                class391 var5 = this.field2556.method3141(arg2, 8);
                class83 var6 = super.field2262.method1762(arg2, (byte) 45);
                if (~var6.field980 == -1 && ~var6.field965 == -1) {
                    this.method1109(arg1 ^ 5);
                } else {
                    int var7 = var6.field964 ? 64 : 128;
                    int var8 = var7 * 50;
                    class124 var9 = this.method1122((byte) 65);
                    var9.method766((float) (this.field2599 % var8 * var6.field965) / (float) var8, (float) (this.field2599 % var8 * var6.field980) / (float) var8, 0.0F, (byte) 117);
                    this.method1100(class235.field3452, -1);
                }
                if (!this.field2563) {
                    this.method1169(var6.field968, arg3, var6.field978, var6.field973, arg0, (byte) 106);
                }
                if (this.field2615 == null) {
                    this.method1152(var5, true);
                    this.method1142(192, var6.field970);
                } else {
                    this.field2615.method42(true, var6.field970, var5);
                }
            }
            this.field2551 = arg2;
        }
        ++field2425;
        this.field2569 &= -8;
        if (arg1 != 0) {
            this.method1118(-121);
        }
    }

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "()Lm;")
    public final class105 method1020() {
        ++field2515;
        return new class124();
    }

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "()Z")
    public final boolean method1007() {
        ++field2473;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(III)Z")
    public static final boolean method1172(int arg0, int arg1, int arg2) {
        ++field2467;
        if (arg0 > -120) {
            return true;
        } else {
            return (2048 & arg2) != 0 && ~(arg1 & 55) != -1;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public void method351(int arg0) {
        ++field2400;
        this.field2556.method3136(5);
        this.field2599 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!kw", name = "U", descriptor = "(I)Ldf;")
    public final class547 method1173(int arg0) {
        ++field2388;
        if (arg0 != 31903) {
            this.field2654 = null;
        }
        return this.field2618 == null ? null : this.field2618.method876(true);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILoe;)V")
    public final void method1174(int arg0, class124 arg1) {
        if (arg0 >= -43) {
            this.field2600 = null;
        }
        ++field2439;
        this.field2531.method618(arg1);
        this.field2528 = false;
        this.method1135(10088);
    }

    @OriginalMember(owner = "client!kw", name = "V", descriptor = "(I)Loe;")
    public final class124 method1175(int arg0) {
        if (arg0 < 60) {
            this.method336((byte) 69);
        }
        ++field2509;
        return this.field2536;
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "(B)V")
    private final void method1176(byte arg0) {
        if (arg0 != -107) {
            this.method993(-33, -51, -7, 126);
        }
        ++field2445;
        this.method326(arg0 ^ -66, this.field2658);
        this.method296(0, this.field2652, 72);
        this.method300(0, class566.field8386, 1, -126);
    }

    @OriginalMember(owner = "client!kw", name = "W", descriptor = "(I)V")
    private final void method1177(int arg0) {
        this.field2578 = false;
        ++field2451;
        if (arg0 != 59) {
            this.method1174(-124, (class124) null);
        }
        this.method1144((byte) -104);
        if (class149.field1922 == this.field2595) {
            this.method1119((byte) 102);
        }
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(Z)V")
    public final void method992(boolean arg0) {
        this.field2588 = arg0;
        ++field2374;
        this.method284(-5);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLg;ILud;III)V")
    public abstract void method292(boolean arg0, class512 arg1, int arg2, class119 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "(B)V")
    public abstract void method330(byte arg0);

    @OriginalMember(owner = "client!kw", name = "ra", descriptor = "()F")
    public final float method1041() {
        ++field2514;
        return this.field2558;
    }

    @OriginalMember(owner = "client!kw", name = "CA", descriptor = "()I")
    public final int method960() {
        ++field2403;
        return this.field2601;
    }

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "(B)V")
    public final void method1178(byte arg0) {
        int var2 = 3 / ((arg0 - 34) / 54);
        ++field2459;
        Enumeration var3 = this.field2359.keys();
        while (var3.hasMoreElements()) {
            Canvas var4 = (Canvas) var3.nextElement();
            this.method297(this.field2359.get(var4), 0, var4);
        }
        this.field2644.method409(false);
        this.field2652.method409(false);
        this.field2650.method2873(1732161858);
        this.field2649.method2873(1732161858);
        this.field2646.method2873(1732161858);
        this.field2654.method2873(1732161858);
        this.field2645.method2873(1732161858);
        this.field2638.method3295(true);
        this.field2643.method409(false);
    }

    @OriginalMember(owner = "client!kw", name = "X", descriptor = "(I)V")
    public abstract void method299(int arg0);

    @OriginalMember(owner = "client!kw", name = "ta", descriptor = "(II)V")
    public final void method1021(int arg0, int arg1) {
        ++field2490;
        if (~this.field2574 != ~arg0 || ~this.field2601 != ~arg1) {
            this.field2601 = arg1;
            this.field2574 = arg0;
            this.method1177(59);
            this.method1167(91);
            this.method1103(512);
        }
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(IIIIII)V")
    public final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2442;
        this.method1118(1);
        this.method1168(arg4, (byte) -115);
        this.method1160(0, (byte) -113, class455.field6635);
        this.method1097(-14186, class455.field6635, 0);
        this.method1098(arg5, false);
        this.field2531.method758((byte) 100, (float) arg2, 1.0F, (float) arg3);
        this.field2531.method619(arg0, arg1, 0);
        this.method1135(10088);
        this.method344((byte) -5, false);
        this.method1143(3160);
        this.method344((byte) -5, true);
        this.method1097(-14186, class248.field3625, 0);
        this.method1160(0, (byte) -113, class248.field3625);
    }
}
