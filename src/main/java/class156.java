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

@OriginalClass("client!pj")
public abstract class class156 extends class65 {

    @OriginalMember(owner = "client!pj", name = "Ad", descriptor = "Lok;")
    private class266 field2358 = new class266();

    @OriginalMember(owner = "client!pj", name = "ae", descriptor = "Z")
    public boolean field2384 = true;

    @OriginalMember(owner = "client!pj", name = "de", descriptor = "Lbc;")
    public class385 field2387 = new class385();

    @OriginalMember(owner = "client!pj", name = "ge", descriptor = "Lbc;")
    public class385 field2390 = new class385();

    @OriginalMember(owner = "client!pj", name = "he", descriptor = "Lbc;")
    public class385 field2391 = new class385();

    @OriginalMember(owner = "client!pj", name = "ie", descriptor = "Lbc;")
    public class385 field2392 = new class385();

    @OriginalMember(owner = "client!pj", name = "je", descriptor = "Lbc;")
    private class385 field2393 = new class385();

    @OriginalMember(owner = "client!pj", name = "ke", descriptor = "Lbc;")
    private class385 field2394 = new class385();

    @OriginalMember(owner = "client!pj", name = "Qe", descriptor = "Z")
    public boolean field2426 = true;

    @OriginalMember(owner = "client!pj", name = "De", descriptor = "[Lnm;")
    private class497[] field2413 = new class497[10];

    @OriginalMember(owner = "client!pj", name = "bf", descriptor = "I")
    public int field2437 = 0;

    @OriginalMember(owner = "client!pj", name = "We", descriptor = "Z")
    private boolean field2432 = false;

    @OriginalMember(owner = "client!pj", name = "ff", descriptor = "I")
    public int field2441 = -1;

    @OriginalMember(owner = "client!pj", name = "Xe", descriptor = "[F")
    private float[] field2433 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pj", name = "we", descriptor = "Lfga;")
    public class267 field2406 = class313.field4454;

    @OriginalMember(owner = "client!pj", name = "Ge", descriptor = "[F")
    public float[] field2416 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pj", name = "pe", descriptor = "F")
    public float field2399 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "Ze", descriptor = "I")
    public int field2435 = 0;

    @OriginalMember(owner = "client!pj", name = "xe", descriptor = "[F")
    private float[] field2407 = new float[16];

    @OriginalMember(owner = "client!pj", name = "Ce", descriptor = "I")
    public int field2412 = 8;

    @OriginalMember(owner = "client!pj", name = "se", descriptor = "I")
    public int field2402 = 0;

    @OriginalMember(owner = "client!pj", name = "jf", descriptor = "Z")
    public boolean field2444 = false;

    @OriginalMember(owner = "client!pj", name = "lf", descriptor = "I")
    public int field2446 = 0;

    @OriginalMember(owner = "client!pj", name = "Ve", descriptor = "I")
    private int field2431 = 16777215;

    @OriginalMember(owner = "client!pj", name = "of", descriptor = "I")
    public int field2449 = 0;

    @OriginalMember(owner = "client!pj", name = "ve", descriptor = "Z")
    public boolean field2405 = false;

    @OriginalMember(owner = "client!pj", name = "Be", descriptor = "Z")
    public boolean field2411 = true;

    @OriginalMember(owner = "client!pj", name = "Ae", descriptor = "F")
    public float field2410 = -1.0F;

    @OriginalMember(owner = "client!pj", name = "Se", descriptor = "I")
    public int field2428 = 0;

    @OriginalMember(owner = "client!pj", name = "qf", descriptor = "I")
    public int field2451 = -1;

    @OriginalMember(owner = "client!pj", name = "Oe", descriptor = "I")
    private int field2424 = 1;

    @OriginalMember(owner = "client!pj", name = "Je", descriptor = "[F")
    public float[] field2419 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!pj", name = "tf", descriptor = "I")
    private int field2454 = -1;

    @OriginalMember(owner = "client!pj", name = "pf", descriptor = "[F")
    private float[] field2450 = new float[16];

    @OriginalMember(owner = "client!pj", name = "Af", descriptor = "Z")
    public boolean field2461 = false;

    @OriginalMember(owner = "client!pj", name = "He", descriptor = "I")
    private int field2417 = 0;

    @OriginalMember(owner = "client!pj", name = "yf", descriptor = "F")
    public float field2459 = 3584.0F;

    @OriginalMember(owner = "client!pj", name = "Jf", descriptor = "[F")
    private float[] field2470 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pj", name = "Nf", descriptor = "[F")
    private float[] field2474 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pj", name = "If", descriptor = "I")
    public int field2469 = 0;

    @OriginalMember(owner = "client!pj", name = "Gf", descriptor = "Lhfa;")
    public class329 field2467 = class619.field8655;

    @OriginalMember(owner = "client!pj", name = "Ee", descriptor = "I")
    private int field2414 = -1;

    @OriginalMember(owner = "client!pj", name = "Ke", descriptor = "I")
    public int field2420 = 0;

    @OriginalMember(owner = "client!pj", name = "Bf", descriptor = "[F")
    private float[] field2462 = new float[16];

    @OriginalMember(owner = "client!pj", name = "xf", descriptor = "F")
    public float field2458 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "Lf", descriptor = "I")
    public int field2472 = 0;

    @OriginalMember(owner = "client!pj", name = "Mf", descriptor = "I")
    public int field2473 = 512;

    @OriginalMember(owner = "client!pj", name = "Tf", descriptor = "I")
    public int field2480 = 3584;

    @OriginalMember(owner = "client!pj", name = "Sf", descriptor = "I")
    public int field2479 = 50;

    @OriginalMember(owner = "client!pj", name = "Cf", descriptor = "Z")
    private boolean field2463 = false;

    @OriginalMember(owner = "client!pj", name = "ag", descriptor = "Z")
    private boolean field2487 = false;

    @OriginalMember(owner = "client!pj", name = "Me", descriptor = "I")
    private int field2422 = 0;

    @OriginalMember(owner = "client!pj", name = "Rf", descriptor = "I")
    public int field2478 = 128;

    @OriginalMember(owner = "client!pj", name = "Qf", descriptor = "Z")
    private boolean field2477 = false;

    @OriginalMember(owner = "client!pj", name = "Yf", descriptor = "I")
    private int field2485 = 0;

    @OriginalMember(owner = "client!pj", name = "Of", descriptor = "Z")
    public boolean field2475 = false;

    @OriginalMember(owner = "client!pj", name = "gf", descriptor = "Z")
    public boolean field2442 = true;

    @OriginalMember(owner = "client!pj", name = "ye", descriptor = "Z")
    public boolean field2408 = true;

    @OriginalMember(owner = "client!pj", name = "cg", descriptor = "F")
    public float field2489 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "Pe", descriptor = "F")
    private float field2425 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "wf", descriptor = "F")
    public float field2457 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "Ff", descriptor = "I")
    public int field2466 = 3;

    @OriginalMember(owner = "client!pj", name = "Vf", descriptor = "I")
    public int field2482 = 0;

    @OriginalMember(owner = "client!pj", name = "dg", descriptor = "Z")
    private boolean field2490 = false;

    @OriginalMember(owner = "client!pj", name = "Wf", descriptor = "F")
    public float field2483 = 3584.0F;

    @OriginalMember(owner = "client!pj", name = "Zf", descriptor = "I")
    public int field2486 = 512;

    @OriginalMember(owner = "client!pj", name = "bg", descriptor = "I")
    private int field2488 = 0;

    @OriginalMember(owner = "client!pj", name = "Fe", descriptor = "I")
    private int field2415 = -1;

    @OriginalMember(owner = "client!pj", name = "fg", descriptor = "Z")
    private boolean field2492 = false;

    @OriginalMember(owner = "client!pj", name = "Ne", descriptor = "[F")
    public float[] field2423 = this.field2433;

    @OriginalMember(owner = "client!pj", name = "hg", descriptor = "Z")
    public boolean field2494 = true;

    @OriginalMember(owner = "client!pj", name = "ig", descriptor = "F")
    public float field2495 = -1.0F;

    @OriginalMember(owner = "client!pj", name = "nf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2448 = new Stream();

    @OriginalMember(owner = "client!pj", name = "Ag", descriptor = "Lbc;")
    private class385 field2513 = new class385();

    @OriginalMember(owner = "client!pj", name = "yc", descriptor = "Lwia;")
    public class791 field2304;

    @OriginalMember(owner = "client!pj", name = "Qc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2322;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2228;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Ljava/lang/Object;")
    public Object field2199;

    @OriginalMember(owner = "client!pj", name = "Kb", descriptor = "Ljava/lang/Object;")
    private Object field2264;

    @OriginalMember(owner = "client!pj", name = "oe", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!pj", name = "hf", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!pj", name = "pc", descriptor = "I")
    private int field2295;

    @OriginalMember(owner = "client!pj", name = "Hd", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!pj", name = "yb", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!pj", name = "Lb", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!pj", name = "Kf", descriptor = "Lir;")
    private class28 field2471;

    @OriginalMember(owner = "client!pj", name = "vb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field2249;

    @OriginalMember(owner = "client!pj", name = "od", descriptor = "I")
    public static int field2346 = -1;

    @OriginalMember(owner = "client!pj", name = "zc", descriptor = "Lfba;")
    public static class27 field2305 = new class27(37, 3);

    @OriginalMember(owner = "client!pj", name = "qe", descriptor = "F")
    private float field2400;

    @OriginalMember(owner = "client!pj", name = "ue", descriptor = "F")
    public float field2404;

    @OriginalMember(owner = "client!pj", name = "Le", descriptor = "F")
    public float field2421;

    @OriginalMember(owner = "client!pj", name = "Re", descriptor = "F")
    public float field2427;

    @OriginalMember(owner = "client!pj", name = "kf", descriptor = "F")
    private float field2445;

    @OriginalMember(owner = "client!pj", name = "rf", descriptor = "F")
    public float field2452;

    @OriginalMember(owner = "client!pj", name = "sf", descriptor = "F")
    public float field2453;

    @OriginalMember(owner = "client!pj", name = "zf", descriptor = "F")
    public float field2460;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!pj", name = "lb", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!pj", name = "mb", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!pj", name = "nb", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!pj", name = "ob", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!pj", name = "pb", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!pj", name = "qb", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!pj", name = "rb", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!pj", name = "sb", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!pj", name = "tb", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!pj", name = "ub", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!pj", name = "wb", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!pj", name = "xb", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!pj", name = "zb", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!pj", name = "Ab", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!pj", name = "Bb", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!pj", name = "Cb", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!pj", name = "Db", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!pj", name = "Eb", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!pj", name = "Fb", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!pj", name = "Gb", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!pj", name = "Hb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!pj", name = "Jb", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!pj", name = "Mb", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!pj", name = "Nb", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!pj", name = "Ob", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!pj", name = "Pb", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!pj", name = "Qb", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!pj", name = "Rb", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!pj", name = "Sb", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!pj", name = "Tb", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!pj", name = "Ub", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!pj", name = "Vb", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!pj", name = "Wb", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!pj", name = "Xb", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!pj", name = "Yb", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!pj", name = "Zb", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!pj", name = "ac", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!pj", name = "bc", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!pj", name = "cc", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!pj", name = "dc", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!pj", name = "ec", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pj", name = "fc", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!pj", name = "gc", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!pj", name = "hc", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!pj", name = "ic", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!pj", name = "jc", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!pj", name = "lc", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!pj", name = "mc", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!pj", name = "nc", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!pj", name = "oc", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!pj", name = "qc", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!pj", name = "rc", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!pj", name = "sc", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!pj", name = "tc", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!pj", name = "uc", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!pj", name = "vc", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!pj", name = "wc", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!pj", name = "xc", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!pj", name = "Ac", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!pj", name = "Bc", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!pj", name = "Cc", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!pj", name = "Dc", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!pj", name = "Ec", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!pj", name = "Fc", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!pj", name = "Gc", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!pj", name = "Hc", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!pj", name = "Ic", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!pj", name = "Jc", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!pj", name = "Kc", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!pj", name = "Lc", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!pj", name = "Mc", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!pj", name = "Nc", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!pj", name = "Oc", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!pj", name = "Pc", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!pj", name = "Rc", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!pj", name = "Sc", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!pj", name = "Tc", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!pj", name = "Uc", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!pj", name = "Vc", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!pj", name = "Wc", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!pj", name = "Xc", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!pj", name = "Yc", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!pj", name = "Zc", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!pj", name = "ad", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!pj", name = "bd", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!pj", name = "dd", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!pj", name = "ed", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!pj", name = "fd", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!pj", name = "gd", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!pj", name = "hd", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!pj", name = "id", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!pj", name = "jd", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!pj", name = "kd", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!pj", name = "ld", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!pj", name = "md", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!pj", name = "nd", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!pj", name = "pd", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!pj", name = "qd", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!pj", name = "rd", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!pj", name = "sd", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!pj", name = "td", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!pj", name = "ud", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!pj", name = "vd", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!pj", name = "xd", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!pj", name = "yd", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!pj", name = "zd", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!pj", name = "Bd", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!pj", name = "Cd", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!pj", name = "Dd", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!pj", name = "Ed", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!pj", name = "Fd", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!pj", name = "Gd", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!pj", name = "Id", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!pj", name = "Jd", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!pj", name = "Kd", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!pj", name = "Ld", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!pj", name = "Md", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!pj", name = "Nd", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!pj", name = "Od", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!pj", name = "Pd", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!pj", name = "Qd", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!pj", name = "Rd", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!pj", name = "Sd", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!pj", name = "Td", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!pj", name = "Ud", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!pj", name = "Vd", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!pj", name = "Wd", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!pj", name = "Xd", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!pj", name = "Yd", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!pj", name = "Zd", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!pj", name = "be", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!pj", name = "ce", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!pj", name = "ee", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!pj", name = "fe", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!pj", name = "Te", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!pj", name = "Ue", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!pj", name = "Ye", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!pj", name = "af", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!pj", name = "cf", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!pj", name = "uf", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!pj", name = "Df", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!pj", name = "Hf", descriptor = "I")
    private int field2468;

    @OriginalMember(owner = "client!pj", name = "Xf", descriptor = "I")
    public int field2484;

    @OriginalMember(owner = "client!pj", name = "gg", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!pj", name = "Fg", descriptor = "I")
    private int field2518;

    @OriginalMember(owner = "client!pj", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!pj", name = "cd", descriptor = "Lui;")
    public class240 field2334;

    @OriginalMember(owner = "client!pj", name = "Ie", descriptor = "Lnm;")
    private class497 field2418;

    @OriginalMember(owner = "client!pj", name = "ne", descriptor = "Liea;")
    private class503 field2397;

    @OriginalMember(owner = "client!pj", name = "kg", descriptor = "Leaa;")
    public class525 field2497;

    @OriginalMember(owner = "client!pj", name = "lg", descriptor = "Leaa;")
    public class525 field2498;

    @OriginalMember(owner = "client!pj", name = "pg", descriptor = "Leaa;")
    public class525 field2502;

    @OriginalMember(owner = "client!pj", name = "qg", descriptor = "Leaa;")
    public class525 field2503;

    @OriginalMember(owner = "client!pj", name = "sg", descriptor = "Leaa;")
    public class525 field2505;

    @OriginalMember(owner = "client!pj", name = "tg", descriptor = "Leaa;")
    public class525 field2506;

    @OriginalMember(owner = "client!pj", name = "vg", descriptor = "Leaa;")
    public class525 field2508;

    @OriginalMember(owner = "client!pj", name = "zg", descriptor = "Leaa;")
    public class525 field2512;

    @OriginalMember(owner = "client!pj", name = "Dg", descriptor = "Leaa;")
    public class525 field2516;

    @OriginalMember(owner = "client!pj", name = "Eg", descriptor = "Leaa;")
    public class525 field2517;

    @OriginalMember(owner = "client!pj", name = "ng", descriptor = "Ldk;")
    private class535 field2500;

    @OriginalMember(owner = "client!pj", name = "og", descriptor = "Lhl;")
    private class553 field2501;

    @OriginalMember(owner = "client!pj", name = "ug", descriptor = "Lhl;")
    private class553 field2507;

    @OriginalMember(owner = "client!pj", name = "Cg", descriptor = "Lhl;")
    private class553 field2515;

    @OriginalMember(owner = "client!pj", name = "le", descriptor = "Lhj;")
    private class594 field2395;

    @OriginalMember(owner = "client!pj", name = "jg", descriptor = "Lkq;")
    public class618 field2496;

    @OriginalMember(owner = "client!pj", name = "mg", descriptor = "Lkq;")
    private class618 field2499;

    @OriginalMember(owner = "client!pj", name = "rg", descriptor = "Lkq;")
    public class618 field2504;

    @OriginalMember(owner = "client!pj", name = "wg", descriptor = "Lkq;")
    private class618 field2509;

    @OriginalMember(owner = "client!pj", name = "xg", descriptor = "Lkq;")
    public class618 field2510;

    @OriginalMember(owner = "client!pj", name = "yg", descriptor = "Lkq;")
    private class618 field2511;

    @OriginalMember(owner = "client!pj", name = "Bg", descriptor = "Lkq;")
    public class618 field2514;

    @OriginalMember(owner = "client!pj", name = "Ef", descriptor = "Lkja;")
    public class684 field2465;

    @OriginalMember(owner = "client!pj", name = "wd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2354;

    @OriginalMember(owner = "client!pj", name = "Ib", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field2262;

    @OriginalMember(owner = "client!pj", name = "kc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2290;

    @OriginalMember(owner = "client!pj", name = "ze", descriptor = "Z")
    public boolean field2409;

    @OriginalMember(owner = "client!pj", name = "ef", descriptor = "Z")
    public boolean field2440;

    @OriginalMember(owner = "client!pj", name = "mf", descriptor = "Z")
    public boolean field2447;

    @OriginalMember(owner = "client!pj", name = "Pf", descriptor = "Z")
    public boolean field2476;

    @OriginalMember(owner = "client!pj", name = "Uf", descriptor = "Z")
    public boolean field2481;

    @OriginalMember(owner = "client!pj", name = "Gg", descriptor = "Z")
    public boolean field2519;

    @OriginalMember(owner = "client!pj", name = "df", descriptor = "[Lqm;")
    public class154[] field2439;

    @OriginalMember(owner = "client!pj", name = "re", descriptor = "[Lbc;")
    public class385[] field2401;

    @OriginalMember(owner = "client!pj", name = "me", descriptor = "[Lef;")
    public class512[] field2396;

    @OriginalMember(owner = "client!pj", name = "te", descriptor = "[Lef;")
    public class512[] field2403;

    @OriginalMember(owner = "client!pj", name = "vf", descriptor = "[Lde;")
    public class556[] field2456;

    @OriginalMember(owner = "client!pj", name = "eg", descriptor = "[Lkja;")
    private class684[] field2491;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V", line = 3)
    public final void method1066(byte arg0) {
        if (~this.field2429 != -9) {
            this.method1090(-8);
            this.method1100(true, true);
            this.method1176(14, true);
            this.method1133(16, true);
            this.method1101(false, 1);
            this.field2429 = 8;
        }
        ++field2286;
        if (arg0 < 100) {
            this.method538();
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V", line = 23)
    public final void method471(int arg0) {
        ++field2276;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V", line = 30)
    private final void method1067(boolean arg0) {
        this.method1086(11);
        ++field2308;
        if (arg0) {
            if (this.field2418 != null) {
                this.field2418.method1301(false);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "ra", descriptor = "(IIII)V", line = 45)
    public final void method442(int arg0, int arg1, int arg2, int arg3) {
        this.field2485 = arg3;
        this.field2409 = true;
        this.field2454 = arg1;
        this.field2415 = arg2;
        this.field2468 = arg0;
        ++field2338;
    }

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "()Z", line = 66)
    public final boolean method516() {
        ++field2243;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(II)I", line = 74)
    public final int method542(int arg0, int arg1) {
        ++field2231;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "(I)V", line = 82)
    private final void method1070(int arg0) {
        if (arg0 != 13634) {
            this.field2484 = 26;
        }
        ++field2208;
        this.field2459 = (float) this.field2480;
    }

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "()Z", line = 95)
    public final boolean method492() {
        ++field2306;
        return this.field2447;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILbc;)V", line = 105)
    public final void method1071(int arg0, class385 arg1) {
        ++field2285;
        this.field2387.method1884(arg1);
        this.field2384 = false;
        this.method1164((byte) 115);
        if (arg0 < 44) {
            this.method1101(false, -105);
        }
    }

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "()Lqja;", line = 123)
    public final class326 method514() {
        ++field2236;
        return this.field2513;
    }

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "(I)V", line = 134)
    private final void method1072(int arg0) {
        ++field2272;
        this.method1178(0, (byte) 126, this.field2501);
        this.method1111((byte) 49, this.field2499);
        this.method1183(true, 0, class376.field5193, arg0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIZI)V", line = 144)
    public final void method1073(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (this.field2414 != arg1 || !this.field2409 != !this.field2487) {
            class498 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field2409 ? 0 : 3;
            if (~arg1 > -1) {
                this.method1182((byte) 81);
            } else {
                var5 = this.field2471.method249(64, arg1);
                class467 var10 = super.field774.method1208((byte) 47, arg1);
                if (~var10.field6577 == -1 && var10.field6569 == 0) {
                    this.method1182((byte) 117);
                } else {
                    int var11 = !var10.field6574 ? 128 : 64;
                    int var12 = var11 * 50;
                    class385 var13 = this.method1161(256);
                    var13.method2401((float) (this.field2434 % var12 * var10.field6577) / (float) var12, 0.0F, (float) (this.field2434 % var12 * var10.field6569) / (float) var12, 0);
                    this.method1152(113, class448.field6129);
                }
                if (!this.field2409) {
                    var8 = var10.field6561;
                    var7 = var10.field6562;
                    var9 = var10.field6567;
                }
                var6 = var10.field6557;
            }
            this.method1145(var9, arg0, Integer.MAX_VALUE, arg2, var8, var7);
            if (this.field2418 == null) {
                this.method1118(0, var5);
                this.method1189(67, var6);
            } else {
                this.field2418.method925((byte) 85, var6, var5);
            }
            this.field2414 = arg1;
            this.field2487 = this.field2409;
        }
        ++field2251;
        this.field2429 &= -8;
        if (arg3 != -1) {
            this.method1074((byte) 66, true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 215)
    public final void method475(Canvas arg0, int arg1, int arg2) {
        ++field2379;
        Object var4 = null;
        if (arg0 != null && this.field2322 != arg0) {
            if (this.field2290.containsKey(arg0)) {
                var4 = this.field2290.get(arg0);
            }
        } else {
            var4 = this.field2264;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method1075(var4, arg0, 7);
            if (this.field2228 == arg0) {
                this.method1132((byte) 83);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "(ILaa;II)V", line = 242)
    public final void method490(int arg0, class511 arg1, int arg2, int arg3) {
        ++field2260;
        class259 var5 = (class259) arg1;
        class498 var6 = var5.field3823;
        this.method1089(-1);
        this.method1118(0, var6);
        this.method1101(false, 1);
        this.method1080(class776.field10666, class776.field10666, -30);
        this.method1180(0, (byte) 91, class683.field9465);
        this.method1159((byte) 103, arg0);
        this.field2387.method2398((float) this.field2365, (float) this.field2265, 0.0F, 0);
        this.method1147(true);
        this.field2401[0].method2398(var6.method2024((float) this.field2365, -23091), var6.method2022((float) this.field2265, 16678), 1.0F, 0);
        this.field2401[0].method2405(-84, var6.method2024((float) (-arg2), -23091), 0.0F, var6.method2022((float) (-arg3), 16678));
        this.field2456[0] = class448.field6129;
        this.method1067(true);
        this.method1079((byte) -25);
        this.method1182((byte) -57);
        this.method1180(0, (byte) 91, class605.field8453);
    }

    @OriginalMember(owner = "client!pj", name = "xa", descriptor = "(F)V", line = 273)
    public final void method515(float arg0) {
        ++field2250;
        if (this.field2399 != arg0) {
            this.field2399 = arg0;
            this.field2249.setAmbient(arg0);
            this.method1174((byte) 44);
            this.method1126((byte) 53);
        }
    }

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "(I)V", line = 290)
    private final void method1076(int arg0) {
        ++field2222;
        if (arg0 != -25) {
            this.method1153((byte) -117, (byte) -48);
        }
        if (class613.field8615 != this.field2467) {
            class329 var2 = this.field2467;
            this.field2467 = class613.field8615;
            if (var2.method2092((byte) 64)) {
                this.method1128(-111);
            }
            this.method1105(-34);
            this.field2423 = this.field2462;
            this.method1085(2);
            this.field2429 &= -25;
        }
    }

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "(I)V", line = 317)
    public final void method1077(int arg0) {
        if (arg0 == 0) {
            ++field2302;
            if (~this.field2429 != -17) {
                this.method1107(-2);
                this.method1100(true, true);
                this.method1176(arg0 ^ 14, true);
                this.method1133(16, true);
                this.method1101(false, 1);
                this.field2429 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(IIIIII)V", line = 343)
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2339;
        float var7 = this.method1124(0);
        this.method1092((byte) -9);
        this.method1159((byte) 92, arg4);
        this.method1180(0, (byte) 91, class683.field9465);
        this.method1082(0, class683.field9465, (byte) -112);
        this.method1101(false, arg5);
        this.field2387.method2398((float) (arg2 + -1), (float) (arg3 - 1), 1.0F, 0);
        this.field2387.method2405(-58, (float) arg0 + -var7, 0.0F, (float) arg1 + -var7);
        this.method1147(true);
        this.method1119(false, false);
        this.method1108((byte) -52, 4, class451.field6306);
        this.method1119(false, true);
        this.method1082(0, class605.field8453, (byte) -112);
        this.method1180(0, (byte) 91, class605.field8453);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V", line = 365)
    public final void method1079(byte arg0) {
        if (arg0 != -25) {
            this.field2420 = 24;
        }
        this.method1108((byte) -52, 2, class744.field10310);
        ++field2347;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ldba;IIII)Lka;", line = 376)
    public final class496 method480(class100 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2333;
        return new class525(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "()Z", line = 384)
    public final boolean method462() {
        ++field2310;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lef;Lef;I)V", line = 395)
    public final void method1080(class512 arg0, class512 arg1, int arg2) {
        ++field2296;
        if (arg2 != -30) {
            this.method1101(true, 98);
        }
        boolean var4 = false;
        if (this.field2396[this.field2482] != arg0) {
            this.field2396[this.field2482] = arg0;
            this.method1123(true);
            var4 = true;
        }
        if (this.field2403[this.field2482] != arg1) {
            this.field2403[this.field2482] = arg1;
            this.method1125(-109);
            var4 = true;
        }
        if (var4) {
            this.field2429 &= -30;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILip;B)V", line = 433)
    public final void method1082(int arg0, class735 arg1, byte arg2) {
        ++field2270;
        this.method1098(arg1, false, arg2 + 124, arg0);
        if (arg2 != -112) {
            this.method1101(false, 33);
        }
    }

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "([I)V", line = 444)
    public final void method449(int[] arg0) {
        arg0[2] = this.field2449;
        arg0[1] = this.field2446;
        arg0[3] = this.field2402;
        arg0[0] = this.field2437;
        ++field2353;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILaa;II)V", line = 457)
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8) {
        ++field2303;
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(B)V", line = 465)
    public final void method1084(byte arg0) {
        int var2 = 42 % ((arg0 - 9) / 55);
        ++field2216;
        if (class619.field8655 != this.field2467) {
            class329 var3 = this.field2467;
            this.field2467 = class619.field8655;
            if (var3.method2092((byte) -105)) {
                this.method1128(-112);
            }
            this.field2429 &= -32;
            this.field2423 = this.field2433;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Lza;", line = 490)
    public final class434 method444(int arg0) {
        ++field2299;
        class598 var2 = new class598(arg0);
        this.field2358.method1727(var2, (byte) 117);
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "()Lqja;", line = 504)
    public final class326 method505() {
        ++field2275;
        return new class385();
    }

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "(I)V", line = 515)
    private final void method1085(int arg0) {
        if (arg0 == 2) {
            ++field2258;
            this.method1143((byte) 102);
            if (this.field2418 != null) {
                this.field2418.method1300((byte) 79);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lkd;)V", line = 531)
    public final void method504(class296 arg0) {
        this.field2397.method3042(arg0, -1, (byte) -127, this);
        ++field2337;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V", line = 542)
    public final void method497(int arg0) {
        ++field2376;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "()V", line = 553)
    public void method484() {
        ++field2374;
        if (!this.field2477) {
            for (class577 var1 = this.field2358.method1731((byte) -106); var1 != null; var1 = this.field2358.method1724(0)) {
                ((class598) var1).method3487(false);
            }
            Enumeration var2 = this.field2290.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1196((byte) 111, this.field2290.get(var3), var3);
            }
            class467.method2791(true, false, (byte) -92);
            this.field2249.release();
            this.field2477 = true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "(I)V", line = 588)
    public final void method1088(int arg0) {
        this.field2387.method1873();
        ++field2316;
        this.field2384 = true;
        this.method1164((byte) 115);
        if (arg0 != 12358) {
            this.field2476 = true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "()Z", line = 601)
    public final boolean method441() {
        ++field2220;
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "(I)V", line = 610)
    public final void method1089(int arg0) {
        if (arg0 != -1) {
            this.field2502 = null;
        }
        if (this.field2429 != 2) {
            this.method1076(arg0 + -24);
            this.method1100(false, true);
            this.method1188(false, 1);
            this.method1176(arg0 + 15, false);
            this.method1133(16, false);
            this.method1073(false, -2, false, -1);
            this.field2429 = 2;
        }
        ++field2282;
    }

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "(I)V", line = 633)
    private final void method1090(int arg0) {
        ++field2245;
        if (arg0 == -8) {
            if (class309.field4419 != this.field2467) {
                class329 var2 = this.field2467;
                this.field2467 = class309.field4419;
                if (!var2.method2092((byte) 118)) {
                    this.method1128(-111);
                }
                this.method1168(0);
                this.field2423 = this.field2450;
                this.method1085(2);
                this.field2429 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(B)V", line = 659)
    private final void method1092(byte arg0) {
        ++field2210;
        if (this.field2429 != 1) {
            this.method1076(arg0 ^ 16);
            this.method1100(false, true);
            this.method1188(false, 1);
            this.method1176(arg0 ^ -7, false);
            this.method1133(arg0 + 25, false);
            this.method1073(false, -2, false, -1);
            this.method1189(77, 1);
            this.method1118(0, this.field2465);
            this.field2429 = 1;
        }
        if (arg0 != -9) {
            this.method1100(false, true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "()I", line = 683)
    public final int method535() {
        ++field2341;
        return this.field2438 + -2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZI[II)Loga;", line = 691)
    public final class498 method1093(byte arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 != 112) {
            return null;
        } else {
            ++field2364;
            return this.method1186(0, arg3, 0, arg4, arg2, (byte) -125, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZB)V", line = 703)
    public final void method1094(boolean arg0, byte arg1) {
        if (this.field2426 != arg0) {
            this.field2426 = arg0;
            this.method1165(0);
        }
        if (arg1 <= 117) {
            this.method1115(17);
        }
        ++field2284;
    }

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "(I)I", line = 722)
    public final int method1096(int arg0) {
        ++field2355;
        if (arg0 < 125) {
            this.method1132((byte) 59);
        }
        return this.field2468;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lus;Z)Ljd;", line = 734)
    public final class241 method551(class1 arg0, boolean arg1) {
        ++field2368;
        class241 var9;
        if (~arg0.field4 != -1 && ~arg0.field7 != -1) {
            int[] var3 = new int[arg0.field7 * arg0.field4];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field2 != null) {
                for (int var6 = 0; var6 < arg0.field7; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field4; ++var7) {
                        var3[var5++] = class746.method4158(arg0.field6[class702.method3977(255, arg0.field3[var4])], arg0.field2[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; arg0.field7 > var8; ++var8) {
                    for (int var10 = 0; ~var10 > ~arg0.field4; ++var10) {
                        int var11 = arg0.field6[255 & arg0.field3[var4++]];
                        var3[var5++] = var11 == 0 ? 0 : class746.method4158(-16777216, var11);
                    }
                }
            }
            var9 = this.method458((byte) -85, arg0.field7, arg0.field4, var3, arg0.field4, 0);
        } else {
            var9 = this.method458((byte) 113, 1, 1, new int[1], 1, 0);
        }
        var9.method1506(arg0.field1, arg0.field5, arg0.field8, arg0.field9);
        return var9;
    }

    @OriginalMember(owner = "client!pj", name = "DA", descriptor = "(IIII)V", line = 803)
    public final void method503(int arg0, int arg1, int arg2, int arg3) {
        this.field2420 = arg0;
        this.field2428 = arg1;
        this.field2486 = arg2;
        ++field2330;
        this.field2473 = arg3;
        this.method1172(-5);
        this.method1191((byte) -75);
        this.method1084((byte) 124);
        this.method1155(0);
    }

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "(I)V", line = 820)
    public final void method1097(int arg0) {
        ++field2352;
        int var2 = -5 % ((-20 - arg0) / 58);
        Enumeration var3 = this.field2290.keys();
        while (var3.hasMoreElements()) {
            Canvas var4 = (Canvas) var3.nextElement();
            this.method1196((byte) 105, this.field2290.get(var4), var4);
        }
        this.field2507.method602((byte) 41);
        this.field2501.method602((byte) 41);
        this.field2515.method602((byte) 41);
        this.field2505.method3156(92);
        this.field2508.method3156(11);
        this.field2502.method3156(-127);
        this.field2506.method3156(-80);
        this.field2517.method3156(-77);
        this.field2397.method3039(-28642);
        this.field2500.method602((byte) 41);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()Z", line = 853)
    public final boolean method432() {
        ++field2213;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V", line = 861)
    public final void method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2362;
        float var8 = (float) arg2 - (float) arg0;
        float var9 = (float) arg3 - (float) arg1;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method1092((byte) -9);
        this.method1159((byte) 95, arg4);
        this.method1180(0, (byte) 91, class683.field9465);
        this.method1082(0, class683.field9465, (byte) -112);
        this.method1101(false, arg6);
        this.field2387.method2398(var11, (float) arg5, 1.0F, 0);
        this.field2387.method1878(0, -arg5 / 2, 0);
        this.field2387.method1895((int) ((double) var10 * 2607.5945876176133D) & 16383);
        this.field2387.method1878(arg0, arg1, 0);
        this.method1147(true);
        this.method1119(false, false);
        this.method1079((byte) -25);
        this.method1119(false, true);
        this.method1082(0, class605.field8453, (byte) -112);
        this.method1180(0, (byte) 91, class605.field8453);
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V", line = 898)
    public final void method519(int arg0) {
        ++field2271;
    }

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "(I)I", line = 907)
    public final int method1099(int arg0) {
        ++field2370;
        int var2 = -92 % ((25 - arg0) / 61);
        return this.field2454;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZ)V", line = 917)
    public final void method1100(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field2491 = null;
        }
        ++field2253;
        if (arg0 == !this.field2476) {
            this.field2476 = arg0;
            this.method1083((byte) -115);
            this.field2429 &= -32;
        }
    }

    @OriginalMember(owner = "client!pj", name = "pa", descriptor = "()V", line = 935)
    public final void method489() {
        this.field2409 = false;
        ++field2383;
    }

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "()[I", line = 946)
    public final int[] method510() {
        ++field2256;
        return new int[] { this.field2420, this.field2428, this.field2486, this.field2473 };
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(IIIIII)Lqaa;", line = 955)
    public final class29 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2239;
        return new class400(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V", line = 965)
    public final void method1101(boolean arg0, int arg1) {
        ++field2323;
        if (~this.field2424 != ~arg1) {
            boolean var3;
            boolean var4;
            class267 var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = class313.field4454;
            } else if (~arg1 == -3) {
                var5 = class727.field10049;
                var4 = false;
                var3 = true;
            } else if (arg1 != 128) {
                var4 = false;
                var3 = false;
                var5 = class140.field2084;
            } else {
                var3 = true;
                var4 = true;
                var5 = class309.field4422;
            }
            if (var4 == !this.field2442) {
                this.field2442 = var4;
                this.method1135((byte) -89);
            }
            if (!this.field2411 != !var3) {
                this.field2411 = var3;
                this.method1185(arg0);
            }
            if (this.field2406 != var5) {
                this.field2406 = var5;
                this.method1149(-29610);
            }
            this.field2429 &= -29;
            this.field2424 = arg1;
        }
        if (arg0) {
            this.method514();
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIII)V", line = 1035)
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2240;
        float var10 = (float) (-arg0) + (float) arg2;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method1092((byte) -9);
        this.method1159((byte) 126, arg4);
        this.method1180(0, (byte) 91, class683.field9465);
        this.method1082(0, class683.field9465, (byte) -112);
        this.method1101(false, arg5);
        this.method1088(12358);
        int var14 = arg8 % (arg6 + arg7);
        this.method1119(false, false);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~arg6 <= ~var14) {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        } else {
            var17 = (float) (arg6 + arg7 + -var14) * var12;
            var18 = (float) (-var14 + arg6 + arg7) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg2 < ~arg0) {
                if ((float) arg2 < var21) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 < (float) arg2) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 + -var21;
                }
            }
            if (arg1 < arg3) {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if (var22 < (float) arg3) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method1167(var22, 0.0F, var20 + var22, var21, var19 + var21, (byte) 31, 0.0F)) {
                return;
            }
            var22 += var20 + var24;
            var21 += var19 + var23;
            this.method1072(1);
            var19 = var15;
            var20 = var16;
        }
        this.method1119(false, true);
        this.method1082(0, class605.field8453, (byte) -112);
        this.method1180(0, (byte) 91, class605.field8453);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([I)V", line = 1155)
    public final void method549(int[] arg0) {
        arg0[1] = this.field2265;
        arg0[0] = this.field2365;
        ++field2314;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(Z)V", line = 1166)
    private final void method1102(boolean arg0) {
        if (!arg0) {
            this.field2457 = -0.18154901F;
        }
        ++field2312;
        if (this.field2418 != null) {
            this.field2418.method1299(!arg0);
        }
        this.method1069((byte) -63);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(FB)V", line = 1189)
    public final void method1104(float arg0, byte arg1) {
        if (this.field2425 != arg0) {
            this.field2425 = arg0;
            this.method1172(-5);
        }
        ++field2200;
        if (arg1 != 30) {
            this.field2432 = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "(I)V", line = 1210)
    private final void method1105(int arg0) {
        if (!this.field2492) {
            float[] var2 = this.field2462;
            if (~this.field2365 != -1 && this.field2265 != 0) {
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = -2.0F / (float) this.field2265;
                var2[7] = 0.0F;
                var2[13] = 1.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = -1.0F;
                var2[14] = 0.5F;
                var2[6] = 0.0F;
                var2[10] = 0.5F;
                var2[0] = 2.0F / (float) this.field2365;
                var2[1] = 0.0F;
            } else {
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[14] = 0.0F;
            }
            this.field2492 = true;
        }
        ++field2380;
        if (arg0 >= -13) {
            this.field2387 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "da", descriptor = "(III[I)V", line = 1268)
    public final void method485(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2209;
        float var5 = this.field2390.method2402((float) arg0, 0, (float) arg2, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field2420;
            var7 = this.field2428;
        } else {
            var6 = (int) ((float) this.field2486 * this.field2390.method2400(1, (float) arg0, (float) arg1, (float) arg2) / var5);
            var7 = (int) ((float) this.field2473 * this.field2390.method2396((byte) -67, (float) arg0, (float) arg1, (float) arg2) / var5);
        }
        arg3[0] = (int) ((float) var6 + -this.field2427);
        arg3[1] = (int) ((float) var7 - this.field2452);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(B)I", line = 1293)
    public final int method1106(byte arg0) {
        if (arg0 != -56) {
            return 121;
        } else {
            ++field2217;
            return this.field2485;
        }
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "(I)V", line = 1306)
    private final void method1107(int arg0) {
        if (arg0 == -2) {
            ++field2223;
            if (class359.field5040 != this.field2467) {
                class329 var2 = this.field2467;
                this.field2467 = class359.field5040;
                if (!var2.method2092((byte) 79)) {
                    this.method1128(-121);
                }
                this.method1163(1);
                this.field2423 = this.field2407;
                this.method1085(2);
                this.field2429 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILcfa;)V", line = 1331)
    private final void method1108(byte arg0, int arg1, class179 arg2) {
        ++field2331;
        this.method1178(0, (byte) 75, this.field2507);
        this.method1111((byte) 9, this.field2509);
        this.method1183(true, 0, arg2, arg1);
        if (arg0 != -52) {
            this.method535();
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[Lqm;)V", line = 1344)
    public final void method461(int arg0, class154[] arg1) {
        ++field2234;
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field2439[var3] = arg1[var3];
        }
        this.field2464 = arg0;
        if (this.field2467.method2092((byte) -78)) {
            this.method1129(6);
        }
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V", line = 1363)
    public final void method524(int arg0) {
        ++field2233;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIF)Lqm;", line = 1372)
    public final class154 method439(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field2267;
        return new class534(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pj", name = "KA", descriptor = "(IIII)V", line = 1381)
    public final void method434(int arg0, int arg1, int arg2, int arg3) {
        ++field2345;
        if (arg0 <= 0 && ~arg2 <= ~(this.field2365 + -1) && arg1 <= 0 && this.field2265 - 1 <= arg3) {
            this.method511();
        } else {
            this.field2449 = ~arg2 >= ~this.field2365 ? arg2 : 0;
            this.field2437 = ~arg0 <= -1 ? arg0 : 0;
            this.field2446 = arg1 >= 0 ? arg1 : 0;
            this.field2402 = this.field2365 >= arg3 ? arg3 : 0;
            if (!this.field2519) {
                this.field2519 = true;
                this.method1156((byte) -107);
            }
            this.method1150(13);
            this.method1155(0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "za", descriptor = "(IIIII)V", line = 1408)
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2241;
        this.method1092((byte) -9);
        this.method1159((byte) 101, arg3);
        this.method1180(0, (byte) 91, class683.field9465);
        this.method1082(0, class683.field9465, (byte) -112);
        this.method1101(false, arg4);
        this.field2387.method2398((float) arg2, (float) arg2, 1.0F, 0);
        this.field2387.method1878(arg0, arg1, 0);
        this.method1147(true);
        this.method1119(false, false);
        this.method1178(0, (byte) 125, this.field2515);
        this.method1111((byte) 11, this.field2511);
        this.method1183(true, 0, class744.field10310, 256);
        this.method1119(false, true);
        this.method1082(0, class605.field8453, (byte) -112);
        this.method1180(0, (byte) 91, class605.field8453);
    }

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "()Z", line = 1433)
    public final boolean method534() {
        ++field2278;
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([FB)[F", line = 1442)
    public final float[] method1112(float[] arg0, byte arg1) {
        arg0[0] = this.field2423[0];
        arg0[4] = this.field2423[1];
        if (arg1 != -50) {
            this.field2425 = 1.5237957F;
        }
        arg0[12] = this.field2423[3];
        ++field2344;
        arg0[8] = this.field2423[2];
        arg0[5] = this.field2423[5];
        arg0[1] = this.field2423[4];
        arg0[2] = this.field2423[8];
        arg0[9] = this.field2423[6];
        arg0[13] = this.field2423[7];
        arg0[10] = this.field2423[10];
        arg0[14] = this.field2423[11];
        arg0[7] = this.field2423[13];
        arg0[6] = this.field2423[9];
        arg0[3] = this.field2423[12];
        arg0[11] = this.field2423[14];
        arg0[15] = this.field2423[15];
        return arg0;
    }

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "(I)Lbc;", line = 1471)
    public final class385 method1113(int arg0) {
        ++field2226;
        if (arg0 != 1) {
            this.field2441 = -119;
        }
        return this.field2393;
    }

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "(I)V", line = 1483)
    public final void method1115(int arg0) {
        ++field2363;
        if (arg0 == 4) {
            if (~this.field2429 != -5) {
                this.method1076(-25);
                this.method1100(false, true);
                this.method1188(false, 1);
                this.method1176(arg0 ^ 10, false);
                this.method1133(16, false);
                this.method1073(false, -2, false, -1);
                this.method1101(false, 1);
                this.method1189(arg0 + 22, 0);
                this.field2429 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Ldk;", line = 1507)
    public final class535 method1116(byte arg0, int arg1) {
        ++field2254;
        if (~(arg1 * 2) < ~this.field2500.method600(104)) {
            this.field2500.method604(arg1, 114);
        }
        if (arg0 != -109) {
            this.method1193((class288) null, (byte[]) null, 83, true, 62, 69);
        }
        return this.field2500;
    }

    @OriginalMember(owner = "client!pj", name = "aa", descriptor = "(IIIIII)V", line = 1523)
    public final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2369;
        this.method1092((byte) -9);
        this.method1159((byte) -114, arg4);
        this.method1180(0, (byte) 91, class683.field9465);
        this.method1082(0, class683.field9465, (byte) -112);
        this.method1101(false, arg5);
        this.field2387.method2398((float) arg2, (float) arg3, 1.0F, 0);
        this.field2387.method1878(arg0, arg1, 0);
        this.method1147(true);
        this.method1119(false, false);
        this.method1079((byte) -25);
        this.method1119(false, true);
        this.method1082(0, class605.field8453, (byte) -112);
        this.method1180(0, (byte) 91, class605.field8453);
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "(B)Lbc;", line = 1545)
    public final class385 method1117(byte arg0) {
        if (arg0 <= 98) {
            this.field2492 = false;
        }
        ++field2244;
        return this.field2387;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILkja;)V", line = 1556)
    public final void method1118(int arg0, class684 arg1) {
        if (this.field2491[this.field2482] != arg1) {
            this.field2491[this.field2482] = arg1;
            if (arg1 == null) {
                this.method1078(55);
            } else {
                arg1.method2561(-128);
            }
            this.field2429 &= -2;
        }
        ++field2205;
        if (arg0 != 0) {
            field2305 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "(I)V", line = 1581)
    public final void method523(int arg0) {
        ++field2298;
        this.field2466 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field2466;
        }
        this.field2412 = 1 << this.field2466;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1597)
    public final void method493(Canvas arg0) {
        ++field2359;
        if (this.field2322 == arg0) {
            throw new RuntimeException();
        } else if (this.field2290.containsKey(arg0)) {
            this.method1196((byte) 121, this.field2290.get(arg0), arg0);
            this.field2290.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "(III[I)V", line = 1615)
    public final void method474(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2328;
        float var5 = this.field2390.method2402((float) arg0, 0, (float) arg2, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field2428;
            var7 = this.field2420;
        } else {
            var7 = (int) ((float) this.field2486 * this.field2390.method2400(1, (float) arg0, (float) arg1, (float) arg2) / var5);
            var6 = (int) ((float) this.field2473 * this.field2390.method2396((byte) -67, (float) arg0, (float) arg1, (float) arg2) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field2427);
        arg3[1] = (int) ((float) var6 + -this.field2452);
    }

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "(I)V", line = 1640)
    public static void method1120(int arg0) {
        field2305 = null;
        if (arg0 != 8) {
            method1120(40);
        }
    }

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "(IIIII)V", line = 1656)
    public final void method529(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method487(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field2297;
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(I)V", line = 1664)
    public final void method525(int arg0) {
        ++field2326;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field2471 != null) {
                this.field2471.method248(-118);
            }
            this.field2478 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pj", name = "XA", descriptor = "()I", line = 1681)
    public final int method513() {
        ++field2325;
        return this.field2480;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqaa;)V", line = 1690)
    public final void method464(class29 arg0) {
        this.field2395 = (class594) arg0;
        ++field2221;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lie;[Lus;Z)Lda;", line = 1708)
    public final class66 method437(class6 arg0, class1[] arg1, boolean arg2) {
        ++field2309;
        return new class99(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "(I)Lbc;", line = 1716)
    public final class385 method1127(int arg0) {
        if (!this.field2490) {
            this.field2394.method2390(this.field2392, this.field2387);
            this.field2490 = true;
        }
        ++field2336;
        int var2 = -99 / ((-50 - arg0) / 60);
        return this.field2394;
    }

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "(I)V", line = 1732)
    private final void method1128(int arg0) {
        this.field2490 = false;
        ++field2381;
        if (arg0 <= -109) {
            if (this.field2418 != null) {
                this.field2418.method1298((byte) 82);
            }
            this.method1138((byte) -7);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 1748)
    public final void method473(boolean arg0) {
        ++field2348;
    }

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "(I)V", line = 1755)
    public void method1129(int arg0) {
        this.field2455 = this.field2464;
        ++field2224;
        this.field2464 = 0;
        if (arg0 != 6) {
            this.field2249 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ)Ljd;", line = 1767)
    public final class241 method517(int arg0, int arg1, boolean arg2) {
        ++field2378;
        return new class580(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(Z)V", line = 1775)
    public void method1130(boolean arg0) {
        ++field2281;
        this.method1148((byte) 125);
        if (!arg0) {
            this.method504((class296) null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "(I)I", line = 1788)
    public final int method1131(int arg0) {
        ++field2283;
        if (arg0 > -38) {
            this.method512(-30, 86);
        }
        return this.field2482;
    }

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "(B)V", line = 1799)
    private final void method1132(byte arg0) {
        if (this.field2228 == null) {
            this.field2295 = this.field2252 = 1;
        } else {
            Dimension var2 = this.field2228.getSize();
            this.field2295 = var2.width;
            this.field2252 = var2.height;
        }
        ++field2375;
        if (arg0 < 44) {
            this.field2504 = null;
        }
        this.field2365 = this.field2295;
        this.field2265 = this.field2252;
        this.method1181((byte) 90);
        this.method1191((byte) -119);
        this.method1172(-5);
        this.method1121(127);
        this.method1155(0);
        this.method1084((byte) -73);
        this.method511();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V", line = 1835)
    public final void method1133(int arg0, boolean arg1) {
        ++field2248;
        if (!arg1 != !this.field2461) {
            this.field2461 = arg1;
            this.method1175((byte) -104);
            this.field2429 &= -32;
        }
        if (arg0 != 16) {
            this.method1119(false, false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([IIIIIZ)Ljd;", line = 1853)
    public final class241 method536(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2350;
        return new class580(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "(I)[F", line = 1863)
    public final float[] method1136(int arg0) {
        ++field2321;
        return arg0 != 6280 ? null : this.field2433;
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(Z)V", line = 1876)
    private final void method1137(boolean arg0) {
        ++field2277;
        if (arg0) {
            this.field2450[14] = this.field2400;
            this.field2450[10] = this.field2445;
            this.field2483 = (this.field2450[14] - (float) this.field2480) / this.field2450[10];
        }
    }

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "(B)V", line = 1894)
    private final void method1140(byte arg0) {
        ++field2219;
        this.field2515 = this.method1074((byte) 46, false);
        this.field2515.method679(3096, 12, true);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field2515.method676((byte) 118, true);
            if (var3 != null) {
                Stream var4 = this.method1190(0, var3);
                var4.method3952(0.0F);
                var4.method3952(0.0F);
                var4.method3952(0.0F);
                for (int var5 = 0; var5 <= 256; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (!Stream.method3953()) {
                        var4.method3949(var9);
                        var4.method3949(var8);
                        var4.method3949(0.0F);
                    } else {
                        var4.method3952(var9);
                        var4.method3952(var8);
                        var4.method3952(0.0F);
                    }
                }
                var4.method3945();
                if (this.field2515.method678(14234)) {
                    break;
                }
            }
        }
        if (arg0 > 18) {
            this.field2511 = this.method1151(12, new class152[] { new class152(class631.field8865) });
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BZZLvea;)Loga;", line = 1962)
    public final class498 method1141(int arg0, int arg1, byte[] arg2, boolean arg3, boolean arg4, class288 arg5) {
        ++field2261;
        if (arg4) {
            this.method485(-22, 15, 37, (int[]) null);
        }
        return this.method1114(0, 0, arg0, (byte) -63, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!pj", name = "JA", descriptor = "(IIIIII)I", line = 1973)
    public final int method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2212;
        int var7 = 0;
        float var8 = (float) arg2 * this.field2390.field5308 + (float) arg0 * this.field2390.field5307 + (float) arg1 * this.field2390.field5332 + this.field2390.field5325;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field2390.field5308 + (float) arg3 * this.field2390.field5307 + (float) arg4 * this.field2390.field5332 + this.field2390.field5325;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field2479 > var8 && var9 < (float) this.field2479) {
            var7 |= 16;
        } else if ((float) this.field2480 < var8 && var9 > (float) this.field2480) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field2390.field5303 + (float) arg0 * this.field2390.field5344 + (float) arg1 * this.field2390.field5327 + this.field2390.field5319) * (float) this.field2486 / var8);
        int var11 = (int) (((float) arg5 * this.field2390.field5303 + (float) arg3 * this.field2390.field5344 + (float) arg4 * this.field2390.field5327 + this.field2390.field5319) * (float) this.field2486 / var9);
        if (this.field2427 > (float) var10 && this.field2427 > (float) var11) {
            var7 |= 1;
        } else if (this.field2421 < (float) var10 && (float) var11 > this.field2421) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field2390.field5329 + (float) arg0 * this.field2390.field5313 + (float) arg1 * this.field2390.field5321 + this.field2390.field5300) * (float) this.field2473 / var8);
        int var13 = (int) (((float) arg5 * this.field2390.field5329 + (float) arg3 * this.field2390.field5313 + (float) arg4 * this.field2390.field5321 + this.field2390.field5300) * (float) this.field2473 / var9);
        if (this.field2452 > (float) var12 && (float) var13 < this.field2452) {
            var7 |= 4;
        } else if ((float) var12 > this.field2404 && (float) var13 > this.field2404) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)Lnm;", line = 2025)
    public class497 method1142(int arg0, byte arg1) {
        ++field2255;
        if (arg1 != 26) {
            this.field2469 = 7;
        }
        if (arg0 != 6) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    return arg0 == 7 ? new class368(this) : new class549(this);
                } else {
                    return new class766(this, this.field2334);
                }
            } else {
                return new class765(this);
            }
        } else {
            return new class139(this);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lkd;I)V", line = 2079)
    public final void method541(class296 arg0, int arg1) {
        this.field2397.method3042(arg0, arg1, (byte) -109, this);
        ++field2373;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 2087)
    public void method454(int arg0) {
        ++field2237;
        if (this.field2471 != null) {
            this.field2471.method247((byte) -34);
        }
        this.field2434 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "(IIII)V", line = 2100)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field2340;
        boolean var5 = false;
        if (~this.field2437 > ~arg0) {
            var5 = true;
            this.field2437 = arg0;
        }
        if (~arg2 > ~this.field2449) {
            this.field2449 = arg2;
            var5 = true;
        }
        if (arg1 > this.field2446) {
            this.field2446 = arg1;
            var5 = true;
        }
        if (~arg3 > ~this.field2402) {
            var5 = true;
            this.field2402 = arg3;
        }
        if (var5) {
            if (!this.field2519) {
                this.field2519 = true;
                this.method1156((byte) -51);
            }
            this.method1150(13);
            this.method1155(0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IIIIII)V", line = 2150)
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2332;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method1167((float) arg1, 0.0F, (float) arg3 + var8, (float) arg0, (float) arg2 + var9, (byte) 31, 0.0F)) {
            this.method1092((byte) -9);
            this.method1159((byte) 117, arg4);
            this.method1180(0, (byte) 91, class683.field9465);
            this.method1082(0, class683.field9465, (byte) -112);
            this.method1101(false, arg5);
            this.method1088(12358);
            this.method1119(false, false);
            this.method1072(1);
            this.method1119(false, true);
            this.method1082(0, class605.field8453, (byte) -112);
            this.method1180(0, (byte) 91, class605.field8453);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIZII)V", line = 2197)
    private final void method1145(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 == Integer.MAX_VALUE) {
            ++field2382;
            boolean var7 = arg3 & this.method455();
            if (!var7 && (arg0 == 4 || ~arg0 == -9 || ~arg0 == -10)) {
                arg0 = 2;
                arg4 = ~arg0 != -5 ? 1 : arg5 & 1;
                arg5 = 0;
            }
            if (arg0 != 0 && arg1) {
                arg0 |= Integer.MIN_VALUE;
            }
            if (~this.field2422 == ~arg0) {
                if (this.field2422 != 0) {
                    this.field2413[Integer.MAX_VALUE & this.field2422].method928(arg1, (byte) 97);
                    if (this.field2417 != arg5 || ~this.field2488 != ~arg4) {
                        this.field2413[this.field2422 & Integer.MAX_VALUE].method923(arg5, (byte) 27, arg4);
                        this.field2417 = arg5;
                        this.field2488 = arg4;
                    }
                    return;
                }
            } else {
                if (~this.field2422 != -1) {
                    this.field2413[this.field2422 & Integer.MAX_VALUE].method926(-339);
                }
                if (~arg0 != -1) {
                    this.field2418 = this.field2413[arg0 & Integer.MAX_VALUE];
                    this.field2418.method929(-87, arg1);
                    this.field2418.method928(arg1, (byte) 87);
                    this.field2418.method923(arg5, (byte) 61, arg4);
                } else {
                    this.field2418 = null;
                }
                this.field2422 = arg0;
                this.field2488 = arg4;
                this.field2417 = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(Z)I", line = 2252)
    public final int method1146(boolean arg0) {
        ++field2247;
        return !arg0 ? -15 : this.field2415;
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "(Z)V", line = 2266)
    public final void method1147(boolean arg0) {
        ++field2214;
        if (!arg0) {
            this.field2406 = null;
        }
        this.field2384 = false;
        this.method1164((byte) 109);
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "()Z", line = 2278)
    public final boolean method452() {
        ++field2287;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "()I", line = 2287)
    public final int method457() {
        ++field2238;
        return this.field2479;
    }

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "(B)V", line = 2295)
    private final void method1148(byte arg0) {
        ++field2201;
        this.method1174((byte) 44);
        this.method1144(-110);
        this.method1173((byte) 105);
        this.method1129(6);
        this.method1087(31205);
        this.method1126((byte) 53);
        this.method1165(0);
        this.method1095((byte) 123);
        this.method1175((byte) -104);
        this.method1083((byte) -80);
        this.method1069((byte) -63);
        this.method1185(false);
        this.method1149(arg0 + -29735);
        this.method1135((byte) -101);
        if (arg0 == 125) {
            for (int var2 = this.field2436 + -1; var2 >= 0; --var2) {
                this.method1192(arg0 ^ -22022, var2);
                this.method1123(true);
                this.method1125(-100);
                this.method1182((byte) -53);
            }
            this.method1068(0);
            this.method1121(43);
            this.method1143((byte) 102);
            this.method1195(0);
            this.method1138((byte) -115);
        }
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "()Z", line = 2338)
    public final boolean method455() {
        ++field2367;
        return this.field2413[3].method921(89);
    }

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "()Z", line = 2351)
    public final boolean method483() {
        ++field2342;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILde;)V", line = 2360)
    public final void method1152(int arg0, class556 arg1) {
        this.field2456[this.field2482] = arg1;
        ++field2357;
        if (arg0 <= 111) {
            this.method1071(-54, (class385) null);
        }
        this.method1067(true);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BB)V", line = 2372)
    public final void method1153(byte arg0, byte arg1) {
        this.method1159((byte) -104, arg0 << 24 | arg0 << 16 | arg0 << 8 | arg0);
        ++field2319;
        if (arg1 != 79) {
            this.field2469 = -29;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;", line = 2384)
    public final NativeHeapBuffer method1154(boolean arg0, int arg1, int arg2) {
        int var4 = -65 / ((54 - arg2) / 61);
        ++field2311;
        return this.field2354.method3939(arg1, arg0);
    }

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "(I)V", line = 2398)
    private final void method1155(int arg0) {
        this.field2452 = (float) (-this.field2428 + this.field2446);
        this.field2427 = (float) (-this.field2420 + this.field2437);
        this.field2404 = (float) (-this.field2428 + this.field2402);
        ++field2318;
        if (arg0 == 0) {
            this.field2421 = (float) (-this.field2420 + this.field2449);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqja;)V", line = 2413)
    public final void method550(class326 arg0) {
        ++field2207;
        this.field2390 = (class385) arg0;
        this.field2392.method1884(this.field2390);
        this.field2392.method2399(1);
        this.field2393.method2394(0, this.field2392);
        this.field2391.method2394(0, this.field2390);
        if (this.field2467.method2092((byte) -85)) {
            this.method1128(-127);
        }
    }

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "(I)Lks;", line = 2429)
    public final class461 method1157(int arg0) {
        ++field2343;
        if (arg0 != 0) {
            return null;
        } else {
            return this.field2395 == null ? null : this.field2395.method2465(-1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(BI)V", line = 2442)
    public final void method1159(byte arg0, int arg1) {
        if (this.field2493 != arg1) {
            this.field2493 = arg1;
            this.method1068(0);
        }
        ++field2273;
        int var3 = 40 / ((34 - arg0) / 55);
    }

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "(Z)V", line = 2458)
    public final void method1160(boolean arg0) {
        if (arg0) {
            this.method1177((byte) -12);
        }
        ++field2204;
        Hashtable var2 = new Hashtable();
        if (this.field2290 != null && !this.field2290.isEmpty()) {
            Enumeration var3 = this.field2290.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1169((byte) -77, var4));
            }
        }
        this.field2290 = var2;
        this.method1197(-23326);
        this.method1194(-30852);
        this.method1140((byte) 123);
        this.field2397.method3040(-112, this);
    }

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "(I)Lbc;", line = 2491)
    public final class385 method1161(int arg0) {
        ++field2317;
        if (arg0 != 256) {
            this.method435(106, -38, 57, -110, (int[]) null);
        }
        return this.field2401[this.field2482];
    }

    @OriginalMember(owner = "client!pj", name = "HA", descriptor = "(IIII[I)V", line = 2504)
    public final void method435(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field2313;
        float var6 = this.field2390.method2402((float) arg0, 0, (float) arg2, (float) arg1);
        if (!((float) this.field2479 > var6) && !((float) this.field2480 < var6)) {
            int var7 = (int) ((float) this.field2486 * this.field2390.method2400(1, (float) arg0, (float) arg1, (float) arg2) / (float) arg3);
            int var8 = (int) ((float) this.field2473 * this.field2390.method2396((byte) -67, (float) arg0, (float) arg1, (float) arg2) / (float) arg3);
            arg4[0] = (int) ((float) var7 - this.field2427);
            arg4[1] = (int) ((float) var8 - this.field2452);
            arg4[2] = (int) var6;
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "(I)V", line = 2527)
    private final void method1163(int arg0) {
        if (arg0 != 1) {
            this.field2443 = -12;
        }
        ++field2215;
        if (!this.field2463) {
            float[] var2 = this.field2407;
            float var3 = (float) this.field2479;
            float var4 = (float) this.field2480;
            float var5 = (float) (-this.field2428) * this.field2425 / (float) this.field2473;
            float var6 = (float) (-this.field2420) * this.field2425 / (float) this.field2486;
            float var7 = (float) (this.field2365 - this.field2420) * this.field2425 / (float) this.field2486;
            float var8 = (float) (this.field2265 - this.field2428) * this.field2425 / (float) this.field2473;
            if (var6 != var7 && var5 != var8) {
                var2[2] = 0.0F;
                var2[0] = 2.0F / (-var6 + var7);
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[10] = 1.0F / (var3 - var4);
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[9] = 0.0F;
                var2[14] = var3 / (-var4 + var3);
                var2[11] = 0.0F;
                var2[4] = 0.0F;
            } else {
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[0] = 1.0F;
            }
            this.method1070(13634);
            this.field2463 = true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "(B)V", line = 2597)
    private final void method1164(byte arg0) {
        if (class613.field8615 == this.field2467) {
            float var2 = this.method1124(0);
            this.field2387.method2405(-49, var2, 0.0F, var2);
        }
        if (arg0 > 85) {
            ++field2366;
            this.field2490 = false;
            this.method1195(0);
            if (this.field2418 != null) {
                this.field2418.method1297(true);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2619)
    public final void method537(Canvas arg0) {
        this.field2228 = null;
        this.field2264 = null;
        ++field2300;
        if (arg0 != null && this.field2322 != arg0) {
            if (this.field2290.containsKey(arg0)) {
                this.field2264 = this.field2290.get(arg0);
                this.field2228 = arg0;
            }
        } else {
            this.field2264 = this.field2199;
            this.field2228 = this.field2322;
        }
        if (this.field2228 != null && this.field2264 != null) {
            this.method1109(this.field2264, this.field2228, true);
            this.method1132((byte) 107);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(II)V", line = 2652)
    public final void method530(int arg0, int arg1) {
        if (~this.field2479 != ~arg0 || ~this.field2480 != ~arg1) {
            this.field2479 = arg0;
            this.field2480 = arg1;
            this.method1191((byte) -110);
            this.method1172(-5);
            this.method1102(true);
        }
        ++field2356;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILvea;[FZ)Loga;", line = 2669)
    public final class498 method1166(int arg0, int arg1, int arg2, class288 arg3, float[] arg4, boolean arg5) {
        if (arg2 != 14) {
            return null;
        } else {
            ++field2280;
            return this.method1162(arg0, 0, arg3, true, 0, arg4, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(FFFFFBF)Z", line = 2681)
    private final boolean method1167(float arg0, float arg1, float arg2, float arg3, float arg4, byte arg5, float arg6) {
        ++field2327;
        Buffer var8 = this.field2501.method676((byte) -88, true);
        if (var8 == null) {
            return false;
        } else if (arg5 != 31) {
            return false;
        } else {
            Stream var9 = this.method1190(0, var8);
            if (Stream.method3953()) {
                var9.method3952(arg3);
                var9.method3952(arg0);
                var9.method3952(arg6);
                var9.method3952(arg4);
                var9.method3952(arg2);
                var9.method3952(arg1);
            } else {
                var9.method3949(arg3);
                var9.method3949(arg0);
                var9.method3949(arg6);
                var9.method3949(arg4);
                var9.method3949(arg2);
                var9.method3949(arg1);
            }
            var9.method3945();
            return this.field2501.method678(14234);
        }
    }

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "()Z", line = 2720)
    public final boolean method477() {
        ++field2246;
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "(I)V", line = 2735)
    private final void method1168(int arg0) {
        if (arg0 == 0) {
            if (!this.field2432) {
                float[] var2 = this.field2450;
                float var3 = (float) (-this.field2420 * this.field2479) / (float) this.field2486;
                float var4 = (float) ((this.field2365 - this.field2420) * this.field2479) / (float) this.field2486;
                float var5 = (float) (this.field2479 * this.field2428) / (float) this.field2473;
                float var6 = (float) ((-this.field2265 + this.field2428) * this.field2479) / (float) this.field2473;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field2479 * 2.0F;
                    var2[10] = this.field2445 = (float) this.field2480 / (float) (-this.field2480 + this.field2479);
                    var2[8] = (var3 + var4) / (var4 - var3);
                    var2[15] = 0.0F;
                    var2[6] = 0.0F;
                    var2[12] = 0.0F;
                    var2[0] = var7 / (var4 - var3);
                    var2[11] = -1.0F;
                    var2[1] = 0.0F;
                    var2[5] = var7 / (var5 - var6);
                    var2[13] = 0.0F;
                    var2[9] = (var5 + var6) / (var5 - var6);
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[2] = 0.0F;
                    var2[7] = 0.0F;
                    var2[14] = this.field2400 = (float) (this.field2480 * this.field2479) / (float) (-this.field2480 + this.field2479);
                } else {
                    var2[3] = 0.0F;
                    var2[8] = 0.0F;
                    var2[12] = 0.0F;
                    var2[6] = 0.0F;
                    var2[5] = 1.0F;
                    var2[15] = 1.0F;
                    var2[4] = 0.0F;
                    var2[13] = 0.0F;
                    var2[7] = 0.0F;
                    var2[2] = 0.0F;
                    var2[9] = 0.0F;
                    var2[10] = 1.0F;
                    var2[14] = 0.0F;
                    var2[0] = 1.0F;
                    var2[1] = 0.0F;
                    var2[11] = 0.0F;
                }
                this.method1137(true);
                this.field2432 = true;
            }
            ++field2230;
        }
    }

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "()I", line = 2805)
    public final int method538() {
        ++field2315;
        return this.field2518;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IZ)V", line = 2815)
    public final void method1170(int arg0, boolean arg1) {
        ++field2294;
        if (!arg1 == this.field2475) {
            this.field2475 = arg1;
            this.method1173((byte) 101);
        }
        if (arg0 > -111) {
            this.field2249 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(BZ)V", line = 2832)
    public final void method1171(byte arg0, boolean arg1) {
        if (arg0 > -65) {
            this.method520(-9, -78, 97, 40, 117, -47);
        }
        ++field2388;
        if (this.field2408 == !arg1) {
            this.field2408 = arg1;
            this.method1083((byte) -89);
        }
    }

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "(I)V", line = 2849)
    private final void method1172(int arg0) {
        this.field2463 = false;
        ++field2301;
        if (arg0 == -5) {
            this.method1163(1);
            if (class359.field5040 == this.field2467) {
                this.method1085(2);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "(Z)V", line = 2866)
    public final void method544(boolean arg0) {
        this.field2494 = arg0;
        ++field2307;
        this.method1175((byte) -104);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(IZ)V", line = 2877)
    public final void method1176(int arg0, boolean arg1) {
        ++field2257;
        if (arg0 != 14) {
            this.method1121(26);
        }
        if (!arg1 != !this.field2444) {
            this.field2444 = arg1;
            this.method1095((byte) 124);
            this.field2429 &= -32;
        }
    }

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "(B)V", line = 2894)
    public final void method1177(byte arg0) {
        this.field2401 = new class385[this.field2436];
        this.field2456 = new class556[this.field2436];
        this.field2491 = new class684[this.field2436];
        this.field2396 = new class512[this.field2436];
        ++field2227;
        this.field2403 = new class512[this.field2436];
        if (arg0 > 9) {
            for (int var2 = 0; this.field2436 > var2; ++var2) {
                this.field2403[var2] = class463.field6532;
                this.field2396[var2] = class463.field6532;
                this.field2456[var2] = class763.field10519;
                this.field2401[var2] = new class385();
            }
            this.field2439 = new class154[this.field2438 + -2];
            this.field2465 = this.method1103(class691.field9659, class34.field457, 1, 1, -2);
            this.method501(new class598(262144));
            this.field2514 = this.method1151(12, new class152[] { new class152(new class631[] { class631.field8865, class631.field8870 }) });
            this.field2504 = this.method1151(12, new class152[] { new class152(new class631[] { class631.field8865, class631.field8868 }) });
            this.field2510 = this.method1151(12, new class152[] { new class152(class631.field8865), new class152(class631.field8868), new class152(class631.field8870), new class152(class631.field8867) });
            this.field2496 = this.method1151(12, new class152[] { new class152(class631.field8865), new class152(class631.field8868), new class152(class631.field8870) });
            this.field2498 = new class525(this, 0, 0, false, false);
            this.field2505 = new class525(this, 0, 0, true, true);
            this.field2497 = new class525(this, 0, 0, false, false);
            this.field2508 = new class525(this, 0, 0, true, true);
            this.field2516 = new class525(this, 0, 0, false, false);
            this.field2502 = new class525(this, 0, 0, true, true);
            this.field2503 = new class525(this, 0, 0, false, false);
            this.field2506 = new class525(this, 0, 0, true, true);
            this.field2512 = new class525(this, 0, 0, false, false);
            this.field2517 = new class525(this, 0, 0, true, true);
            this.field2397 = new class503(this);
            this.field2500 = this.method1184(2, true);
            this.method1160(false);
            this.field2334 = new class240(this);
            this.field2413[1] = this.method1142(1, (byte) 26);
            this.field2413[2] = this.method1142(2, (byte) 26);
            this.field2413[4] = this.method1142(4, (byte) 26);
            this.field2413[5] = this.method1142(5, (byte) 26);
            this.field2413[6] = this.method1142(6, (byte) 26);
            this.field2413[7] = this.method1142(7, (byte) 26);
            this.field2413[3] = this.method1142(3, (byte) 26);
            this.field2413[8] = this.method1142(8, (byte) 26);
            this.field2413[9] = this.method1142(9, (byte) 26);
            if (!this.field2413[2].method921(-72)) {
                this.field2413[2] = this.method1142(0, (byte) 26);
            }
            if (!this.field2413[4].method921(-126)) {
                this.field2413[4] = this.field2413[2];
            }
            if (!this.field2413[8].method921(-112)) {
                this.field2413[8] = this.field2413[4];
            }
            if (!this.field2413[9].method921(-88)) {
                this.field2413[9] = this.field2413[8];
            }
            this.method1130(true);
            this.method511();
            this.method548();
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(II)I", line = 2978)
    public final int method512(int arg0, int arg1) {
        ++field2218;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "(I)V", line = 2987)
    public final void method1179(int arg0) {
        ++field2349;
        if (arg0 <= 117) {
            this.method1108((byte) -118, 15, (class179) null);
        }
        this.method1084((byte) -88);
        this.method1085(2);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLip;)V", line = 2999)
    public final void method1180(int arg0, byte arg1, class735 arg2) {
        ++field2229;
        if (arg1 != 91) {
            this.field2494 = true;
        }
        this.method1158(false, false, (byte) -118, arg2, arg0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 3011)
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2266;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I[I)Laa;", line = 3018)
    public final class511 method552(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field2293;
        return class521.method3138(0, arg2, arg3, this, arg1, arg0);
    }

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "(B)V", line = 3026)
    private final void method1181(byte arg0) {
        if (arg0 != 90) {
            this.field2418 = null;
        }
        ++field2371;
        this.field2492 = false;
        if (class613.field8615 == this.field2467) {
            this.method1105(-21);
            this.method1085(2);
        }
    }

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "(B)V", line = 3045)
    public final void method1182(byte arg0) {
        int var2 = -20 % ((arg0 - 23) / 50);
        if (this.field2456[this.field2482] != class763.field10519) {
            this.field2456[this.field2482] = class763.field10519;
            this.field2401[this.field2482].method1873();
            this.method1067(true);
        }
        ++field2225;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "()Lqja;", line = 3065)
    public final class326 method440() {
        ++field2279;
        return this.field2390;
    }

    @OriginalMember(owner = "client!pj", name = "EA", descriptor = "(IIII)V", line = 3073)
    public final void method526(int arg0, int arg1, int arg2, int arg3) {
        ++field2211;
        if (!this.field2409) {
            throw new RuntimeException("");
        } else {
            this.field2454 = arg1;
            this.field2468 = arg0;
            this.field2485 = arg3;
            this.field2415 = arg2;
            if (this.field2487) {
                this.field2413[3].method3022(false);
                this.field2413[3].method1299(false);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "(IIIII)V", line = 3110)
    public final void method478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method487(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field2274;
    }

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "()V", line = 3118)
    public final void method486() {
        ++field2259;
        if (this.field2471 != null) {
            this.field2471.method248(-109);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lwia;II)V", line = 3130)
    public class156(Canvas arg0, Object arg1, class160 arg2, class791 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field2304 = arg3;
            this.field2228 = this.field2322 = arg0;
            this.field2264 = this.field2199 = arg1;
            this.field2398 = arg4;
            Dimension var7 = arg0.getSize();
            this.field2443 = arg5;
            this.field2365 = this.field2295 = var7.width;
            this.field2265 = this.field2252 = var7.height;
            class486.method2895(true, false, (byte) 121);
            if (super.field774 != null) {
                this.field2471 = new class28(this, super.field774);
                this.field2249 = new NativeInterface(super.field774.method1209(-9413), this.field2443);
                for (int var8 = 0; ~var8 > ~super.field774.method1209(-9413); ++var8) {
                    class467 var9 = super.field774.method1208((byte) 47, var8);
                    if (var9 != null) {
                        this.field2249.initTextureMetrics(var8, var9.field6582, var9.field6579);
                    }
                }
            } else {
                this.field2249 = new NativeInterface(0, this.field2443);
                this.field2471 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method533(102);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "(Z)Lbc;", line = 3180)
    public final class385 method1187(boolean arg0) {
        if (!arg0) {
            this.method1104(0.82536924F, (byte) -17);
        }
        ++field2202;
        return this.field2392;
    }

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "(IIIIII[BII)V", line = 3191)
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field2361;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIZ)Ljd;", line = 3198)
    public final class241 method479(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2203;
        class580 var6 = new class580(this, arg2, arg3, arg4);
        var6.method360(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZI)V", line = 3209)
    public final void method1188(boolean arg0, int arg1) {
        ++field2320;
        if (arg1 == 1) {
            if (!this.field2405 != !arg0) {
                this.field2405 = arg0;
                this.method1173((byte) 96);
                this.field2429 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "(III)V", line = 3227)
    public final void method502(int arg0, int arg1, int arg2) {
        if (this.field2441 != arg0 || ~this.field2451 != ~arg1 || ~this.field2472 != ~arg2) {
            this.field2441 = arg0;
            this.field2451 = arg1;
            this.field2472 = arg2;
            this.method1102(true);
            this.method1083((byte) -94);
        }
        ++field2269;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lza;)V", line = 3244)
    public final void method501(class434 arg0) {
        this.field2354 = ((class598) arg0).field8406;
        ++field2206;
        this.field2262 = this.field2354.method3939(32768, false);
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(II)V", line = 3255)
    public final void method1189(int arg0, int arg1) {
        if (arg1 != 1) {
            if (~arg1 == -1) {
                this.method1080(class463.field6532, class463.field6532, -30);
            } else if (~arg1 != -3) {
                if (~arg1 == -4) {
                    this.method1080(class624.field8745, class463.field6532, -30);
                } else if (arg1 == 4) {
                    this.method1080(class758.field10455, class758.field10455, -30);
                }
            } else {
                this.method1080(class116.field1782, class776.field10666, -30);
            }
        } else {
            this.method1080(class776.field10666, class776.field10666, -30);
        }
        ++field2232;
        if (arg0 <= 21) {
            this.method527(-78, 32, 113, -8, -106, 101, -104, 88, 36);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;", line = 3289)
    public final Stream method1190(int arg0, Buffer arg1) {
        if (arg0 != 0) {
            this.method1066((byte) -46);
        }
        ++field2235;
        this.field2448.method3942(arg1);
        return this.field2448;
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "(B)V", line = 3301)
    private final void method1191(byte arg0) {
        ++field2324;
        this.field2432 = false;
        this.method1168(0);
        if (class309.field4419 == this.field2467) {
            this.method1085(2);
        }
        if (arg0 > -24) {
            this.field2472 = 118;
        }
    }

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "(IIIIIII)I", line = 3318)
    public final int method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2242;
        int var8 = 0;
        float var9 = (float) arg2 * this.field2390.field5308 + (float) arg0 * this.field2390.field5307 + (float) arg1 * this.field2390.field5332 + this.field2390.field5325;
        float var10 = (float) arg5 * this.field2390.field5308 + (float) arg3 * this.field2390.field5307 + (float) arg4 * this.field2390.field5332 + this.field2390.field5325;
        if ((float) this.field2479 > var9 && (float) this.field2479 > var10) {
            var8 |= 16;
        } else if ((float) this.field2480 < var9 && var10 > (float) this.field2480) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field2390.field5303 + (float) arg0 * this.field2390.field5344 + (float) arg1 * this.field2390.field5327 + this.field2390.field5319) * (float) this.field2486 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field2390.field5303 + (float) arg3 * this.field2390.field5344 + (float) arg4 * this.field2390.field5327 + this.field2390.field5319) * (float) this.field2486 / (float) arg6);
        if ((float) var11 < this.field2427 && (float) var12 < this.field2427) {
            var8 |= 1;
        } else if ((float) var11 > this.field2421 && (float) var12 > this.field2421) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field2390.field5329 + (float) arg0 * this.field2390.field5313 + (float) arg1 * this.field2390.field5321 + this.field2390.field5300) * (float) this.field2473 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field2390.field5329 + (float) arg3 * this.field2390.field5313 + (float) arg4 * this.field2390.field5321 + this.field2390.field5300) * (float) this.field2473 / (float) arg6);
        if ((float) var13 < this.field2452 && this.field2452 > (float) var14) {
            var8 |= 4;
        } else if ((float) var13 > this.field2404 && (float) var14 > this.field2404) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(II)V", line = 3363)
    public final void method1192(int arg0, int arg1) {
        ++field2292;
        if (this.field2482 != arg1) {
            this.field2482 = arg1;
            this.method1139(true);
        }
        if (arg0 != -22137) {
            this.field2466 = 101;
        }
    }

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "(I)V", line = 3380)
    private final void method1194(int arg0) {
        ++field2360;
        this.field2501 = this.method1074((byte) 46, true);
        if (arg0 != -30852) {
            this.method1126((byte) 127);
        }
        this.field2501.method679(24, 12, true);
        this.field2499 = this.method1151(12, new class152[] { new class152(class631.field8865) });
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 3401)
    public final void method507(Canvas arg0, int arg1, int arg2) {
        ++field2329;
        if (this.field2322 == arg0) {
            throw new RuntimeException();
        } else if (!this.field2290.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method1169((byte) -77, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field2290.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "()I", line = 3438)
    public final int method433() {
        ++field2263;
        return this.field2385 - -this.field2389 + this.field2386;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 3446)
    public final class294 method488(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2377;
        return new class439(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3454)
    public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field2291;
    }

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "()Z", line = 3467)
    public final boolean method494() {
        ++field2335;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "(I)V", line = 3479)
    private final void method1197(int arg0) {
        this.field2507 = this.method1074((byte) 46, false);
        ++field2268;
        this.field2507.method679(140, 28, true);
        if (arg0 != -23326) {
            this.field2429 = -112;
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field2507.method676((byte) 98, true);
            if (var3 != null) {
                Stream var4 = this.method1190(0, var3);
                if (!Stream.method3953()) {
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(1.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(1.0F);
                    var4.method3949(0.0F);
                    var4.method3949(1.0F);
                    var4.method3949(1.0F);
                    var4.method3949(1.0F);
                    var4.method3949(0.0F);
                    var4.method3949(1.0F);
                    var4.method3949(1.0F);
                    var4.method3949(1.0F);
                    var4.method3949(1.0F);
                    var4.method3949(1.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(1.0F);
                    var4.method3949(0.0F);
                    var4.method3949(1.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                    var4.method3949(0.0F);
                } else {
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(1.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(1.0F);
                    var4.method3952(0.0F);
                    var4.method3952(1.0F);
                    var4.method3952(1.0F);
                    var4.method3952(1.0F);
                    var4.method3952(0.0F);
                    var4.method3952(1.0F);
                    var4.method3952(1.0F);
                    var4.method3952(1.0F);
                    var4.method3952(1.0F);
                    var4.method3952(1.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(1.0F);
                    var4.method3952(0.0F);
                    var4.method3952(1.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                    var4.method3952(0.0F);
                }
                var4.method3945();
                if (this.field2507.method678(14234)) {
                    break;
                }
            }
        }
        this.field2509 = this.method1151(arg0 ^ -23314, new class152[] { new class152(new class631[] { class631.field8865, class631.field8870, class631.field8870 }) });
    }

    @OriginalMember(owner = "client!pj", name = "ZA", descriptor = "(IFFFFF)V", line = 3595)
    public final void method469(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field2289;
        boolean var7 = ~this.field2431 != ~arg0;
        if (var7 || this.field2410 != arg1 || this.field2495 != arg2) {
            this.field2431 = arg0;
            this.field2410 = arg1;
            this.field2495 = arg2;
            if (var7) {
                this.field2458 = (float) (255 & this.field2431) / 255.0F;
                this.field2489 = (float) (16711680 & this.field2431) / 1.671168E7F;
                this.field2457 = (float) (this.field2431 & 65280) / 65280.0F;
                this.method1174((byte) 44);
            }
            this.field2249.setSunColour(this.field2489, this.field2457, this.field2458, arg1, arg2);
            this.method1144(-35);
        }
        if (this.field2470[0] != arg3 || this.field2470[1] != arg4 || this.field2470[2] != arg5) {
            this.field2470[1] = arg4;
            this.field2470[2] = arg5;
            this.field2470[0] = arg3;
            this.field2474[0] = -arg3;
            this.field2474[2] = -arg5;
            this.field2474[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field2416[2] = arg5 * var8;
            this.field2416[0] = arg3 * var8;
            this.field2416[1] = arg4 * var8;
            this.field2419[2] = -this.field2416[2];
            this.field2419[1] = -this.field2416[1];
            this.field2419[0] = -this.field2416[0];
            this.field2249.setSunDirection(this.field2416[0], this.field2416[1], this.field2416[2]);
            this.method1087(31205);
            this.field2430 = (int) (arg5 * 256.0F / arg4);
            this.field2484 = (int) (arg3 * 256.0F / arg4);
        }
        this.method1126((byte) 53);
    }

    @OriginalMember(owner = "client!pj", name = "la", descriptor = "()V", line = 3647)
    public final void method511() {
        this.field2446 = 0;
        this.field2449 = this.field2365;
        this.field2402 = this.field2265;
        ++field2288;
        this.field2437 = 0;
        if (this.field2519) {
            this.field2519 = false;
            this.method1156((byte) -114);
        }
        this.method1155(0);
    }

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "(Z)Lbc;", line = 3678)
    public final class385 method1199(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field2351;
            return this.field2401[this.field2482];
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public abstract void method1068(int arg0);

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
    public abstract void method1069(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZ)Lhl;")
    public abstract class553 method1074(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method1075(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "(I)V")
    public abstract void method1078(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILad;)V")
    public abstract void method1081(int arg0, class446 arg1);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
    public abstract void method1083(byte arg0);

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "(I)V")
    public abstract void method1086(int arg0);

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "(I)V")
    public abstract void method1087(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILdk;IIILcfa;B)V")
    public abstract void method1091(int arg0, class535 arg1, int arg2, int arg3, int arg4, class179 arg5, byte arg6);

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(B)V")
    public abstract void method1095(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lip;ZII)V")
    public abstract void method1098(class735 arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lvea;Lbja;III)Loga;")
    public abstract class498 method1103(class288 arg0, class34 arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public abstract void method1109(Object arg0, Canvas arg1, boolean arg2);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
    public abstract void method1110(int arg0, byte arg1);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLkq;)V")
    public abstract void method1111(byte arg0, class618 arg1);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIBI[BZLvea;)Loga;")
    public abstract class498 method1114(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5, boolean arg6, class288 arg7);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZZ)V")
    public abstract void method1119(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "(I)V")
    public abstract void method1121(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lbja;Lvea;I)Z")
    public abstract boolean method1122(class34 arg0, class288 arg1, int arg2);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(Z)V")
    public abstract void method1123(boolean arg0);

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "(I)F")
    public abstract float method1124(int arg0);

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "(I)V")
    public abstract void method1125(int arg0);

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "(B)V")
    public abstract void method1126(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII[[I)Lks;")
    public abstract class461 method1134(boolean arg0, int arg1, int arg2, int[][] arg3);

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "(B)V")
    public abstract void method1135(byte arg0);

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "(B)V")
    public abstract void method1138(byte arg0);

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(Z)V")
    public abstract void method1139(boolean arg0);

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "(B)V")
    public abstract void method1143(byte arg0);

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "(I)V")
    public abstract void method1144(int arg0);

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "(I)V")
    public abstract void method1149(int arg0);

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "(I)V")
    public abstract void method1150(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[Lwk;)Lkq;")
    public abstract class618 method1151(int arg0, class152[] arg1);

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "(B)V")
    public abstract void method1156(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZBLip;I)V")
    public abstract void method1158(boolean arg0, boolean arg1, byte arg2, class735 arg3, int arg4);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILvea;ZI[FZI)Loga;")
    public abstract class498 method1162(int arg0, int arg1, class288 arg2, boolean arg3, int arg4, float[] arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "(I)V")
    public abstract void method1165(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method1169(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "(B)V")
    public abstract void method1173(byte arg0);

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "(B)V")
    public abstract void method1174(byte arg0);

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "(B)V")
    public abstract void method1175(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLhl;)V")
    public abstract void method1178(int arg0, byte arg1, class553 arg2);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZILcfa;I)V")
    public abstract void method1183(boolean arg0, int arg1, class179 arg2, int arg3);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(IZ)Ldk;")
    public abstract class535 method1184(int arg0, boolean arg1);

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "(Z)V")
    public abstract void method1185(boolean arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[IIIIBZ)Loga;")
    public abstract class498 method1186(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lvea;[BIZII)Lgga;")
    public abstract class307 method1193(class288 arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "(I)V")
    public abstract void method1195(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1196(byte arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILvea;Lbja;)Z")
    public abstract boolean method1198(int arg0, class288 arg1, class34 arg2);
}
