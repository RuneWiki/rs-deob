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

@OriginalClass("client!vf")
public class class159 extends class63 {

    @OriginalMember(owner = "client!vf", name = "ze", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2240 = new Hashtable();

    @OriginalMember(owner = "client!vf", name = "fc", descriptor = "I")
    public int field2366 = 128;

    @OriginalMember(owner = "client!vf", name = "ee", descriptor = "Lhf;")
    private class418 field2386 = new class418();

    @OriginalMember(owner = "client!vf", name = "Fg", descriptor = "Lfh;")
    private class680 field2387 = new class680();

    @OriginalMember(owner = "client!vf", name = "ye", descriptor = "Lfh;")
    public class680 field2388 = new class680();

    @OriginalMember(owner = "client!vf", name = "gg", descriptor = "I")
    public int field2390 = 3;

    @OriginalMember(owner = "client!vf", name = "Oe", descriptor = "I")
    public int field2389 = 8;

    @OriginalMember(owner = "client!vf", name = "ue", descriptor = "Z")
    private boolean field2395 = false;

    @OriginalMember(owner = "client!vf", name = "zd", descriptor = "Lat;")
    private class398 field2391 = new class398();

    @OriginalMember(owner = "client!vf", name = "Ze", descriptor = "[Ldr;")
    private class753[] field2396 = new class753[4];

    @OriginalMember(owner = "client!vf", name = "ad", descriptor = "[Ldr;")
    private class753[] field2397 = new class753[4];

    @OriginalMember(owner = "client!vf", name = "pf", descriptor = "[Ldr;")
    private class753[] field2400 = new class753[4];

    @OriginalMember(owner = "client!vf", name = "Vf", descriptor = "I")
    private int field2403 = -1;

    @OriginalMember(owner = "client!vf", name = "wg", descriptor = "I")
    private int field2399 = -1;

    @OriginalMember(owner = "client!vf", name = "ge", descriptor = "I")
    private int field2398 = -1;

    @OriginalMember(owner = "client!vf", name = "Ld", descriptor = "Lat;")
    private class398 field2409;

    @OriginalMember(owner = "client!vf", name = "qg", descriptor = "Lat;")
    private class398 field2410;

    @OriginalMember(owner = "client!vf", name = "Vg", descriptor = "Lat;")
    private class398 field2411;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "Lat;")
    private class398 field2412;

    @OriginalMember(owner = "client!vf", name = "Cf", descriptor = "Lat;")
    private class398 field2413;

    @OriginalMember(owner = "client!vf", name = "qc", descriptor = "Lat;")
    private class398 field2414;

    @OriginalMember(owner = "client!vf", name = "Og", descriptor = "Lat;")
    private class398 field2415;

    @OriginalMember(owner = "client!vf", name = "ie", descriptor = "Lfh;")
    public class680 field2423;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Lfh;")
    public class680 field2425;

    @OriginalMember(owner = "client!vf", name = "Pf", descriptor = "Lfh;")
    public class680 field2426;

    @OriginalMember(owner = "client!vf", name = "Dd", descriptor = "[F")
    public float[] field2431;

    @OriginalMember(owner = "client!vf", name = "Tb", descriptor = "I")
    private int field2440;

    @OriginalMember(owner = "client!vf", name = "Bb", descriptor = "F")
    private float field2452;

    @OriginalMember(owner = "client!vf", name = "Ee", descriptor = "I")
    private int field2456;

    @OriginalMember(owner = "client!vf", name = "ke", descriptor = "F")
    public float field2448;

    @OriginalMember(owner = "client!vf", name = "Ff", descriptor = "F")
    private float field2457;

    @OriginalMember(owner = "client!vf", name = "tg", descriptor = "[F")
    private float[] field2447;

    @OriginalMember(owner = "client!vf", name = "lc", descriptor = "F")
    public float field2476;

    @OriginalMember(owner = "client!vf", name = "uh", descriptor = "F")
    public float field2480;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "F")
    public float field2468;

    @OriginalMember(owner = "client!vf", name = "Hg", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!vf", name = "Xf", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!vf", name = "rg", descriptor = "F")
    private float field2446;

    @OriginalMember(owner = "client!vf", name = "Sb", descriptor = "I")
    private int field2475;

    @OriginalMember(owner = "client!vf", name = "gd", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!vf", name = "Qg", descriptor = "I")
    private int field2464;

    @OriginalMember(owner = "client!vf", name = "Le", descriptor = "Z")
    private boolean field2436;

    @OriginalMember(owner = "client!vf", name = "Kd", descriptor = "I")
    private int field2505;

    @OriginalMember(owner = "client!vf", name = "mg", descriptor = "F")
    public float field2485;

    @OriginalMember(owner = "client!vf", name = "ah", descriptor = "F")
    public float field2449;

    @OriginalMember(owner = "client!vf", name = "Ig", descriptor = "I")
    private int field2443;

    @OriginalMember(owner = "client!vf", name = "Yd", descriptor = "[F")
    private float[] field2432;

    @OriginalMember(owner = "client!vf", name = "kd", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "client!vf", name = "hh", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!vf", name = "Nf", descriptor = "I")
    private int field2479;

    @OriginalMember(owner = "client!vf", name = "we", descriptor = "I")
    private int field2487;

    @OriginalMember(owner = "client!vf", name = "lb", descriptor = "I")
    public int field2507;

    @OriginalMember(owner = "client!vf", name = "Lf", descriptor = "F")
    private float field2492;

    @OriginalMember(owner = "client!vf", name = "Yc", descriptor = "I")
    public int field2428;

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "I")
    private int field2520;

    @OriginalMember(owner = "client!vf", name = "Db", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "[F")
    private float[] field2524;

    @OriginalMember(owner = "client!vf", name = "Zb", descriptor = "[Lih;")
    private class731[] field2519;

    @OriginalMember(owner = "client!vf", name = "Pb", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!vf", name = "Tg", descriptor = "Z")
    private boolean field2528;

    @OriginalMember(owner = "client!vf", name = "oh", descriptor = "F")
    public float field2474;

    @OriginalMember(owner = "client!vf", name = "Ye", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!vf", name = "nc", descriptor = "F")
    private float field2495;

    @OriginalMember(owner = "client!vf", name = "fd", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!vf", name = "bf", descriptor = "I")
    private int field2508;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "[F")
    private float[] field2535;

    @OriginalMember(owner = "client!vf", name = "Jc", descriptor = "Lmka;")
    public class647 field2453;

    @OriginalMember(owner = "client!vf", name = "Rd", descriptor = "[I")
    public int[] field2541;

    @OriginalMember(owner = "client!vf", name = "eh", descriptor = "[I")
    public int[] field2538;

    @OriginalMember(owner = "client!vf", name = "xh", descriptor = "[B")
    public byte[] field2540;

    @OriginalMember(owner = "client!vf", name = "Xc", descriptor = "[I")
    public int[] field2543;

    @OriginalMember(owner = "client!vf", name = "Jf", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!vf", name = "md", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2296;

    @OriginalMember(owner = "client!vf", name = "Rf", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2172;

    @OriginalMember(owner = "client!vf", name = "Od", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2297;

    @OriginalMember(owner = "client!vf", name = "bc", descriptor = "J")
    private long field2211;

    @OriginalMember(owner = "client!vf", name = "Bd", descriptor = "J")
    private long field2359;

    @OriginalMember(owner = "client!vf", name = "Ve", descriptor = "Z")
    public boolean field2500;

    @OriginalMember(owner = "client!vf", name = "nb", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!vf", name = "yf", descriptor = "Ljava/lang/String;")
    private String field2527;

    @OriginalMember(owner = "client!vf", name = "je", descriptor = "Z")
    public boolean field2533;

    @OriginalMember(owner = "client!vf", name = "Ab", descriptor = "Z")
    private boolean field2460;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Z")
    public boolean field2471;

    @OriginalMember(owner = "client!vf", name = "Sg", descriptor = "Z")
    public boolean field2481;

    @OriginalMember(owner = "client!vf", name = "lg", descriptor = "Z")
    private boolean field2438;

    @OriginalMember(owner = "client!vf", name = "cf", descriptor = "Z")
    public boolean field2496;

    @OriginalMember(owner = "client!vf", name = "vc", descriptor = "Ljava/lang/String;")
    private String field2433;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "Z")
    public boolean field2532;

    @OriginalMember(owner = "client!vf", name = "Sd", descriptor = "Z")
    private boolean field2489;

    @OriginalMember(owner = "client!vf", name = "Ke", descriptor = "Ldd;")
    private class735 field2365;

    @OriginalMember(owner = "client!vf", name = "Rg", descriptor = "Loka;")
    public class382 field2393;

    @OriginalMember(owner = "client!vf", name = "nf", descriptor = "Lkp;")
    private class516 field2372;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "Lgo;")
    private class656 field2377;

    @OriginalMember(owner = "client!vf", name = "ag", descriptor = "Lab;")
    private class700 field2381;

    @OriginalMember(owner = "client!vf", name = "Bh", descriptor = "[Ljava/lang/String;")
    private static final String[] field2544 = new String[] { method1506(method1505("3\tg5]m")), method1506(method1505("3\tg&_m")), method1506(method1505("3\tg\u0013ym")), method1506(method1505("+\u001a%\u001b")), method1506(method1505(">AgYe")), method1506(method1505("3\tg1Zm")), method1506(method1505("3\tg3^m")), method1506(method1505("3\tg2_m")), method1506(method1505("3\tg9Zm")), method1506(method1505("3\tg$_m")), method1506(method1505("3\tg;]m")), method1506(method1505("3\tg4^m")), method1506(method1505("3\tg5Ym")), method1506(method1505("3\tg8Ym")), method1506(method1505("3\tg:Zm")), method1506(method1505("3\tg%]m")), method1506(method1505("3\tg0\\m")), method1506(method1505("3\tg:_m")), method1506(method1505("3\tg4Pm")), method1506(method1505("3\tg>[m")), method1506(method1505("3\tg:\\m")), method1506(method1505("3\tg6^m")), method1506(method1505("3\tg10")), method1506(method1505("3\tg>\\m")), method1506(method1505("3\tg']m")), method1506(method1505("3\tg#]m")), method1506(method1505("3\tg>]m")), method1506(method1505("3\tg=Ym")), method1506(method1505("3\tg\rym")), method1506(method1505("3\tg>^m")), method1506(method1505("3\tg?Ym")), method1506(method1505("3\tg8Zm")), method1506(method1505("3\tg#Ym")), method1506(method1505("3\tg1Ym")), method1506(method1505("3\tg:Ym")), method1506(method1505("3\tg#_m")), method1506(method1505("3\tg\u000eym")), method1506(method1505("3\tg\u00110")), method1506(method1505("3\tg\u00150")), method1506(method1505("3\tg#Zm")), method1506(method1505("3\tg \\m")), method1506(method1505("3\tg>Ym")), method1506(method1505("3\tg2\\m")), method1506(method1505("3\tg#\\m")), method1506(method1505("3\tg'[m")), method1506(method1505("3\tg%_m")), method1506(method1505("3\tg&Zm")), method1506(method1505("3\tg?\\m")), method1506(method1505("3\tg5Pm")), method1506(method1505("3\tg0]m")), method1506(method1505("3\tg%Zm")), method1506(method1505("3\tg\"Zm")), method1506(method1505("3\tg\u001bym")), method1506(method1505("3\tg;0")), method1506(method1505("3\tg ]m")), method1506(method1505("3\tg/Ym")), method1506(method1505("3\tg1^m")), method1506(method1505("3\tg$Zm")), method1506(method1505("3\tg<0")), method1506(method1505("3\tg=^m")), method1506(method1505("3\tg'\\m")), method1506(method1505("3\tg8[m")), method1506(method1505("3\tg<\\m")), method1506(method1505("3\tg:[m")), method1506(method1505("3\tg0_m")), method1506(method1505("3\tg2^m")), method1506(method1505("3\tg\"Ym")), method1506(method1505("3\tg'_m")), method1506(method1505("3\tg9_m")), method1506(method1505("3\tg$Ym")), method1506(method1505("3\tg30")), method1506(method1505("3\tg$]m")), method1506(method1505("3\tg _m")), method1506(method1505("3\tg=]m")), method1506(method1505("3\tg$\\m")), method1506(method1505("3\tg00")), method1506(method1505("3\tg-Ym")), method1506(method1505("3\tg'0")), method1506(method1505("3\tg1_m")), method1506(method1505("3\tg<Ym")), method1506(method1505("$\u001b ")), method1506(method1505(",\u0001=\u0012t")), method1506(method1505("3\tg&\\m")), method1506(method1505("+\u0019 \u0013q$")), method1506(method1505("\n\u001f,\u0019_\t")), method1506(method1505("6\n=>\u007f+\u0000;\u0012J \u001f(\u001ev1")), method1506(method1505("3\tg'Ym")), method1506(method1505("/\u000e?\u00166$\u0018=Y[$\u0001?\u0016k")), method1506(method1505("3\tg8]m")), method1506(method1505("3\tg6]m")), method1506(method1505("3\tg6Pm")), method1506(method1505("3\tg;Zm")), method1506(method1505("3\tg6[m")), method1506(method1505("3\tg%^m")), method1506(method1505("3\tg4_m")), method1506(method1505("3\tg60")), method1506(method1505("3\tg90")), method1506(method1505("3\tg3\\m")), method1506(method1505("3\tg/0")), method1506(method1505("3\tg'Zm")), method1506(method1505("3\tg%[m")), method1506(method1505("3\tg?[m")), method1506(method1505("3\tg8\\m")), method1506(method1505("3\tg\"]m")), method1506(method1505("3\tg9\\m")), method1506(method1505("3\tg4\\m")), method1506(method1505("3\tg5\\m")), method1506(method1505("3\tg!\\m")), method1506(method1505("3\tg\u0019ym")), method1506(method1505("3\tg9^m")), method1506(method1505("3\tg.0")), method1506(method1505("3\tg&^m")), method1506(method1505("3\tg?^m")), method1506(method1505("3\tg3_m")), method1506(method1505("3\tg4Ym")), method1506(method1505("3\tg#^m")), method1506(method1505("3\tg%\\m")), method1506(method1505("3\tg0^m")), method1506(method1505("3\tg:]m")), method1506(method1505("3\tg0Ym")), method1506(method1505("3\tg#0")), method1506(method1505("3\tg:^m")), method1506(method1505("3\tg9[m")), method1506(method1505("3\tg!0")), method1506(method1505("3\tg;Ym")), method1506(method1505("3\tg80")), method1506(method1505("3\tg9Ym")), method1506(method1505("3\tg6\\m")), method1506(method1505("3\tg Ym")), method1506(method1505("7\u000e-\u0012w+")), method1506(method1505("/\u000e.\u0010t")), method1506(method1505("\u0002#\u00166J\u00070!\u0016t#0/\u001bw$\u001b\u0016\u0007q=\n%")), method1506(method1505("-\u000b")), method1506(method1505("6\\i\u0010j$\u001f!\u001e{6")), method1506(method1505("/\u000e*\u001bq'")), method1506(method1505("3\tgKq+\u0006=I0")), method1506(method1505("3\tg2[m")), method1506(method1505("3\tg\"\\m")), method1506(method1505("3\tg5[m")), method1506(method1505("3\tg<^m")), method1506(method1505("3\tg50")), method1506(method1505("3\tg8^m")), method1506(method1505("3\tg5_m")), method1506(method1505("3\tg1]m")), method1506(method1505("3\tg\u0016ym")), method1506(method1505("3\tg2Zm")), method1506(method1505("3\tg>_m")), method1506(method1505("3\tg\u000fym")), method1506(method1505("3\tg&[m")), method1506(method1505("3\tg'^m")), method1506(method1505("3\tg;\\m")), method1506(method1505("3\tg#[m")), method1506(method1505("3\tg\u00050")), method1506(method1505("3\tg>Zm")), method1506(method1505("3\tg\u001e0")), method1506(method1505("3\tg<[m")), method1506(method1505("3\tg4]m")), method1506(method1505("3\tg2Pm")), method1506(method1505("3\tg6_m")), method1506(method1505("3\tg>0")), method1506(method1505("3\tg1Pm")), method1506(method1505("3\tg ^m")), method1506(method1505("3\tg3Ym")), method1506(method1505("3\tg<Zm")), method1506(method1505("3\tg?]m")), method1506(method1505("3\tg$0")), method1506(method1505("3\tg!_m")), method1506(method1505("3\tg8_m")), method1506(method1505("3\tg&Ym")), method1506(method1505("3\tg!]m")), method1506(method1505("3\tg1[m")), method1506(method1505("3\tg%0")), method1506(method1505("3\tg\u0005ym")), method1506(method1505("3\tg\"^m")), method1506(method1505("3\tg\"0")), method1506(method1505("3\tg5^m")), method1506(method1505("\u0002#\u00166J\u00070=\u0012`1\u001a;\u0012G7\n*\u0003y+\b%\u0012")), method1506(method1505("\u0002#\u00162@\u00110=\u0012`1\u001a;\u0012+\u0001")), method1506(method1505("\u0002#\u00166J\u00070$\u0002t1\u0006:\u0016u5\u0003,")), method1506(method1505("\u0002#\u00166J\u00070?\u0012j1\n1(k-\u000e-\u0012j")), method1506(method1505("\u0002#\u00166J\u00070?\u0012j1\n1(h7\u0000.\u0005y(")), method1506(method1505("\u0002#\u00166J\u00070=\u0012`1\u001a;\u0012G&\u001a+\u0012G(\u000e9")), method1506(method1505("\u0002#\u00162@\u00110/\u0005y(\n+\u0002~#\n;(u0\u0003=\u001ek$\u00029\u001b}")), method1506(method1505("(\u000e*")), method1506(method1505("\u0002#\u00166J\u00070/\u0005y\"\u0002,\u0019l\u001a\u001f;\u0018\u007f7\u000e$")), method1506(method1505("\u0002#\u00166J\u00070=\u0012`1\u001a;\u0012G \u0001?({*\u0002+\u001ev ")), method1506(method1505("\u0002#\u00166J\u00070/\u0005y\"\u0002,\u0019l\u001a\u001c!\u0016| \u001d")), method1506(method1505("\u0002#\u00162@\u00110/\u0005y(\n+\u0002~#\n;(z)\u0006=")), method1506(method1505("\u0002#\u00166J\u00070=\u0012`1\u001a;\u0012G#\u0003&\u0016l")), method1506(method1505("(\u0006*\u0005w6\u0000/\u0003")), method1506(method1505("\u0002#\u00166J\u00070?\u0012j1\n1(z0\t/\u0012j\u001a\u0000+\u001d}&\u001b")), method1506(method1505("(\n:\u0016")), method1506(method1505("'\u001d \u0016ve\u001f(\u0002t")), method1506(method1505("\u0002#\u00166J\u00070$\u0002t1\u0006=\u0012`1\u001a;\u0012")), method1506(method1505("\u0002#\u00162@\u00110/\u0005y(\n+\u0002~#\n;(w'\u0005,\u0014l")), method1506(method1505("3\tg$^m")), method1506(method1505("3\tg\"_m")), method1506(method1505("3\tg!^m")), method1506(method1505("3\tg;_m")), method1506(method1505("3\tg [m")), method1506(method1505("3\tg;^m")), method1506(method1505("3\tg3]m")), method1506(method1505("3\tg\u0007ym")), method1506(method1505("3\tg5Zm")), method1506(method1505("3\tg20")), method1506(method1505("3\tg&0")), method1506(method1505("3\tg?0")), method1506(method1505("3\tg2]m")), method1506(method1505("3\tg?_m")), method1506(method1505("3\tg&]m")), method1506(method1505("3\tg9]m")), method1506(method1505("3\tg%Ym")), method1506(method1505("3\tg 0")), method1506(method1505("3\tg=_m")), method1506(method1505("3\tg3Pm")), method1506(method1505("3\tg:0")), method1506(method1505("3\tg!Ym")), method1506(method1505("3\tg6Ym")), method1506(method1505("3\tg<]m")), method1506(method1505("3\tg0[m")), method1506(method1505("3\tg\"[m")), method1506(method1505("3\tg2Ym")), method1506(method1505("3\tg4Zm")), method1506(method1505("3\tg40")), method1506(method1505("3\tg1\\m")), method1506(method1505("3\tg=\\m")), method1506(method1505("3\tg<_m")) };

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Liha;")
    public static class29 field2287 = new class29(32);

    @OriginalMember(owner = "client!vf", name = "sb", descriptor = "I")
    public static int field2342 = -50;

    @OriginalMember(owner = "client!vf", name = "Lb", descriptor = "I")
    public static int field2334 = 0;

    @OriginalMember(owner = "client!vf", name = "Je", descriptor = "I")
    public static int field2378 = -1;

    @OriginalMember(owner = "client!vf", name = "gf", descriptor = "Lhl;")
    public static class556 field2356 = new class556(49, 3);

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "F")
    public float field2442;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "F")
    public float field2461;

    @OriginalMember(owner = "client!vf", name = "sg", descriptor = "F")
    public float field2477;

    @OriginalMember(owner = "client!vf", name = "Ef", descriptor = "F")
    public float field2484;

    @OriginalMember(owner = "client!vf", name = "Of", descriptor = "F")
    private float field2497;

    @OriginalMember(owner = "client!vf", name = "ch", descriptor = "F")
    public float field2501;

    @OriginalMember(owner = "client!vf", name = "rd", descriptor = "F")
    private float field2506;

    @OriginalMember(owner = "client!vf", name = "Gf", descriptor = "F")
    private float field2517;

    @OriginalMember(owner = "client!vf", name = "ph", descriptor = "F")
    public float field2530;

    @OriginalMember(owner = "client!vf", name = "Nd", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!vf", name = "ud", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!vf", name = "gh", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!vf", name = "Vc", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!vf", name = "wh", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!vf", name = "Ac", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!vf", name = "sd", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!vf", name = "fg", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!vf", name = "wc", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!vf", name = "pd", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!vf", name = "Bf", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!vf", name = "jg", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!vf", name = "Dg", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!vf", name = "Gc", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!vf", name = "sf", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!vf", name = "xb", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!vf", name = "dd", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!vf", name = "Te", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!vf", name = "Ce", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!vf", name = "rh", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!vf", name = "ic", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!vf", name = "Pc", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!vf", name = "Wd", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!vf", name = "Rb", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!vf", name = "bh", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!vf", name = "Wg", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!vf", name = "Yf", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!vf", name = "cg", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!vf", name = "Zf", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!vf", name = "qh", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!vf", name = "zf", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!vf", name = "lf", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!vf", name = "af", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!vf", name = "qd", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!vf", name = "Pe", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!vf", name = "Bc", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!vf", name = "Ge", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!vf", name = "Sc", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!vf", name = "pg", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!vf", name = "Xe", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!vf", name = "Zd", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!vf", name = "tf", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!vf", name = "De", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!vf", name = "yd", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!vf", name = "qf", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!vf", name = "mc", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!vf", name = "xg", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!vf", name = "th", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!vf", name = "gc", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!vf", name = "Qf", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!vf", name = "bd", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!vf", name = "Vb", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!vf", name = "le", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!vf", name = "Mb", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!vf", name = "wb", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!vf", name = "hd", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!vf", name = "We", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!vf", name = "Ug", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!vf", name = "cc", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!vf", name = "Qd", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!vf", name = "Kb", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!vf", name = "hf", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!vf", name = "Uf", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!vf", name = "de", descriptor = "I")
    private int field2248;

    @OriginalMember(owner = "client!vf", name = "Af", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!vf", name = "Kg", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!vf", name = "Jd", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!vf", name = "Tf", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!vf", name = "re", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!vf", name = "ig", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!vf", name = "ne", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!vf", name = "ae", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!vf", name = "jc", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!vf", name = "pe", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!vf", name = "mh", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!vf", name = "ih", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!vf", name = "dg", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!vf", name = "rf", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!vf", name = "qe", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!vf", name = "ed", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!vf", name = "Td", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!vf", name = "jd", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!vf", name = "hg", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!vf", name = "me", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!vf", name = "Yb", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!vf", name = "kg", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!vf", name = "id", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!vf", name = "Rc", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!vf", name = "Nc", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!vf", name = "of", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!vf", name = "Ie", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!vf", name = "Hc", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!vf", name = "wf", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!vf", name = "Kc", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!vf", name = "hc", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!vf", name = "Pg", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!vf", name = "ub", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!vf", name = "Gb", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!vf", name = "tb", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!vf", name = "vb", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!vf", name = "Be", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!vf", name = "Eb", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!vf", name = "Ag", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!vf", name = "Wc", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!vf", name = "zg", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!vf", name = "Eg", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!vf", name = "xf", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!vf", name = "jh", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!vf", name = "ob", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!vf", name = "cd", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!vf", name = "Oc", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!vf", name = "Tc", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!vf", name = "Yg", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!vf", name = "xe", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!vf", name = "ef", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!vf", name = "Ic", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!vf", name = "oe", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!vf", name = "Nb", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!vf", name = "xd", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!vf", name = "ac", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!vf", name = "pb", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!vf", name = "Se", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!vf", name = "Cb", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!vf", name = "dc", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!vf", name = "Vd", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!vf", name = "uc", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!vf", name = "kc", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!vf", name = "Ue", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!vf", name = "bg", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!vf", name = "mb", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!vf", name = "ld", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!vf", name = "Cg", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!vf", name = "ng", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!vf", name = "zb", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!vf", name = "td", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!vf", name = "Id", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!vf", name = "Wf", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!vf", name = "Qb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!vf", name = "nh", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!vf", name = "Qc", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!vf", name = "Jb", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!vf", name = "yh", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!vf", name = "Gg", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!vf", name = "Ud", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!vf", name = "kf", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!vf", name = "Zg", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!vf", name = "Cc", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!vf", name = "Zc", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!vf", name = "Kf", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!vf", name = "zc", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!vf", name = "He", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!vf", name = "Ad", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!vf", name = "od", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!vf", name = "Fd", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!vf", name = "ec", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!vf", name = "kh", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!vf", name = "yb", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!vf", name = "he", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!vf", name = "Sf", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!vf", name = "Qe", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!vf", name = "Xg", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!vf", name = "Xb", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!vf", name = "Ob", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!vf", name = "yg", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!vf", name = "Bg", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!vf", name = "te", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!vf", name = "lh", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!vf", name = "Cd", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!vf", name = "wd", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!vf", name = "pc", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!vf", name = "vh", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!vf", name = "Fb", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!vf", name = "Md", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!vf", name = "Ub", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!vf", name = "sc", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!vf", name = "Hf", descriptor = "I")
    private int field2407;

    @OriginalMember(owner = "client!vf", name = "Ae", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!vf", name = "vg", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!vf", name = "Ah", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!vf", name = "Ne", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    private int field2482;

    @OriginalMember(owner = "client!vf", name = "Uc", descriptor = "I")
    private int field2483;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    private int field2486;

    @OriginalMember(owner = "client!vf", name = "Gd", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!vf", name = "ug", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "client!vf", name = "Mf", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!vf", name = "Wb", descriptor = "I")
    private int field2504;

    @OriginalMember(owner = "client!vf", name = "vd", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    private int field2516;

    @OriginalMember(owner = "client!vf", name = "Pd", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!vf", name = "uf", descriptor = "I")
    private int field2534;

    @OriginalMember(owner = "client!vf", name = "Ec", descriptor = "I")
    private int field2539;

    @OriginalMember(owner = "client!vf", name = "fe", descriptor = "I")
    private int field2542;

    @OriginalMember(owner = "client!vf", name = "Dc", descriptor = "J")
    private long field2419;

    @OriginalMember(owner = "client!vf", name = "rb", descriptor = "Lub;")
    private class20 field2430;

    @OriginalMember(owner = "client!vf", name = "eg", descriptor = "Lro;")
    private class2 field2402;

    @OriginalMember(owner = "client!vf", name = "Xd", descriptor = "Lbv;")
    private class322 field2427;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "Lbp;")
    public class407 field2429;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "Lbp;")
    public class407 field2445;

    @OriginalMember(owner = "client!vf", name = "qb", descriptor = "Lbp;")
    public class407 field2478;

    @OriginalMember(owner = "client!vf", name = "be", descriptor = "Lbp;")
    public class407 field2488;

    @OriginalMember(owner = "client!vf", name = "Fc", descriptor = "Lbp;")
    public class407 field2498;

    @OriginalMember(owner = "client!vf", name = "Mg", descriptor = "Lbp;")
    public class407 field2509;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "Lbp;")
    public class407 field2510;

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lbp;")
    public class407 field2523;

    @OriginalMember(owner = "client!vf", name = "ff", descriptor = "Lbp;")
    public class407 field2529;

    @OriginalMember(owner = "client!vf", name = "tc", descriptor = "Lbp;")
    public class407 field2536;

    @OriginalMember(owner = "client!vf", name = "Jg", descriptor = "Lvba;")
    private class42 field2454;

    @OriginalMember(owner = "client!vf", name = "dh", descriptor = "Lika;")
    private class450 field2437;

    @OriginalMember(owner = "client!vf", name = "mf", descriptor = "Lika;")
    private class450 field2491;

    @OriginalMember(owner = "client!vf", name = "xc", descriptor = "Llea;")
    private class639 field2405;

    @OriginalMember(owner = "client!vf", name = "ve", descriptor = "Llea;")
    public class639 field2525;

    @OriginalMember(owner = "client!vf", name = "oc", descriptor = "Lkia;")
    public class649 field2462;

    @OriginalMember(owner = "client!vf", name = "sh", descriptor = "Ldr;")
    private class753 field2401;

    @OriginalMember(owner = "client!vf", name = "vf", descriptor = "Ldr;")
    private class753 field2404;

    @OriginalMember(owner = "client!vf", name = "se", descriptor = "Lkn;")
    public class774 field2472;

    @OriginalMember(owner = "client!vf", name = "yc", descriptor = "Lkn;")
    public class774 field2537;

    @OriginalMember(owner = "client!vf", name = "Ib", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2392;

    @OriginalMember(owner = "client!vf", name = "fh", descriptor = "Z")
    private boolean field2417;

    @OriginalMember(owner = "client!vf", name = "Mc", descriptor = "Z")
    private boolean field2418;

    @OriginalMember(owner = "client!vf", name = "Ng", descriptor = "Z")
    private boolean field2421;

    @OriginalMember(owner = "client!vf", name = "Hd", descriptor = "Z")
    private boolean field2424;

    @OriginalMember(owner = "client!vf", name = "Fe", descriptor = "Z")
    public boolean field2434;

    @OriginalMember(owner = "client!vf", name = "jf", descriptor = "Z")
    private boolean field2435;

    @OriginalMember(owner = "client!vf", name = "rc", descriptor = "Z")
    private boolean field2444;

    @OriginalMember(owner = "client!vf", name = "Re", descriptor = "Z")
    public boolean field2450;

    @OriginalMember(owner = "client!vf", name = "og", descriptor = "Z")
    public boolean field2458;

    @OriginalMember(owner = "client!vf", name = "Lc", descriptor = "Z")
    public boolean field2459;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "Z")
    public boolean field2463;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "Z")
    private boolean field2466;

    @OriginalMember(owner = "client!vf", name = "zh", descriptor = "Z")
    public boolean field2467;

    @OriginalMember(owner = "client!vf", name = "ce", descriptor = "Z")
    public boolean field2469;

    @OriginalMember(owner = "client!vf", name = "nd", descriptor = "Z")
    private boolean field2470;

    @OriginalMember(owner = "client!vf", name = "Df", descriptor = "Z")
    private boolean field2493;

    @OriginalMember(owner = "client!vf", name = "Ed", descriptor = "Z")
    public boolean field2513;

    @OriginalMember(owner = "client!vf", name = "Hb", descriptor = "Z")
    private boolean field2514;

    @OriginalMember(owner = "client!vf", name = "If", descriptor = "Z")
    public boolean field2518;

    @OriginalMember(owner = "client!vf", name = "df", descriptor = "Z")
    private boolean field2522;

    @OriginalMember(owner = "client!vf", name = "Lg", descriptor = "[Lhk;")
    public static class107[] field2327;

    @OriginalMember(owner = "client!vf", name = "Me", descriptor = "[Lgb;")
    private class224[] field2494;

    @OriginalMember(owner = "client!vf", name = "aa", descriptor = "(IIIIII)V")
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2293;
            float var7 = (float) arg0 + 0.35F;
            float var8 = (float) arg1 + 0.35F;
            float var9 = (float) arg2 + var7;
            float var10 = (float) arg3 + var8;
            this.method1438((byte) -85);
            this.method1482(13370, arg5);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            if (this.field2435) {
                OpenGL.glDisable(32925);
            }
            OpenGL.glBegin(7);
            OpenGL.glVertex2f(var7, var8);
            OpenGL.glVertex2f(var7, var10);
            OpenGL.glVertex2f(var9, var10);
            OpenGL.glVertex2f(var9, var8);
            OpenGL.glEnd();
            if (this.field2435) {
                OpenGL.glEnable(32925);
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field2544[144] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Ltq;")
    public final class657 method223(int arg0, int arg1) {
        try {
            ++field2357;
            return null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public final void method234(int arg0) {
        try {
            this.method1449(4);
            ++field2234;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[116] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "(I)V")
    public static final void method1421(int arg0) {
        try {
            class574.field8297 = 0;
            ++field2312;
            class537.field7888 = arg0;
            for (int var1 = 0; ~var1 > ~class258.field3904; ++var1) {
                int var2 = class152.field2133 * var1;
                for (int var3 = 0; var3 < class152.field2133; ++var3) {
                    int var4 = var2 - -var3;
                    class574.field8295[var4].method3585(class667.field9483 * var3, class742.field10924 * var1, class667.field9483, class742.field10924, 0, 0, true, true);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[149] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "(B)V")
    public final void method1422(byte arg0) {
        try {
            ++field2244;
            if (arg0 >= 11) {
                OpenGL.glPushMatrix();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[40] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "()Z")
    public final boolean method160() {
        try {
            ++field2376;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[126] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfh;I)V")
    public final void method1423(class680 arg0, int arg1) {
        try {
            ++field2331;
            OpenGL.glLoadMatrixf(arg0.method4955(318767104), arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[24] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ldr;B)V")
    public final void method1424(class753 arg0, byte arg1) {
        try {
            if (arg1 == -29) {
                ++field2383;
                if (!this.field2458) {
                    if (this.field2403 >= 3) {
                        throw new RuntimeException();
                    } else {
                        if (this.field2403 >= 0) {
                            this.field2397[this.field2403].method4634((byte) -40);
                        }
                        this.field2404 = this.field2401 = this.field2397[++this.field2403] = arg0;
                        this.field2404.method4632(arg1 ^ 23905);
                    }
                } else {
                    this.method1485(arg0, (byte) 113);
                    this.method1443((byte) 118, arg0);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[156] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Llia;)V")
    public final void method253(class505 arg0) {
        try {
            ++field2266;
            this.field2454 = (class42) arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[62] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "()Lsj;")
    public final class486 method251() {
        try {
            ++field2302;
            return this.field2387;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[124] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "()Z")
    public final boolean method167() {
        try {
            ++field2321;
            return this.field2377 != null && this.field2377.method3752(2);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[211] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "na", descriptor = "(IIII)[I")
    public final int[] method207(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2212;
            int[] var5 = new int[arg2 * arg3];
            for (int var6 = 0; ~var6 > ~arg3; ++var6) {
                OpenGL.glReadPixelsi(arg0, this.field2299 - arg1 + -var6, arg2, 1, 32993, this.field2490, var5, arg2 * var6);
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[108] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)V")
    public final void method1425(byte arg0, int arg1) {
        try {
            if (~arg1 != -2) {
                if (arg1 == 0) {
                    this.method1492(8448, 8448, (byte) 17);
                } else if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.method1492(34023, 34023, (byte) 17);
                        }
                    } else {
                        this.method1492(8448, 260, (byte) 17);
                    }
                } else {
                    this.method1492(7681, 34165, (byte) 17);
                }
            } else {
                this.method1492(7681, 7681, (byte) 17);
            }
            if (arg0 == 35) {
                ++field2217;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[164] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(IIIIII)Llia;")
    public final class505 method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2274;
            return !this.field2450 ? null : new class440(this, arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[104] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
    private final void method1426(byte arg0) {
        try {
            ++field2355;
            float var2 = (float) (-this.field2521) * this.field2446 / (float) this.field2526;
            float var3 = (float) (-this.field2473) * this.field2446 / (float) this.field2455;
            if (arg0 <= -7) {
                float var4 = (float) (-this.field2521 + this.field2275) * this.field2446 / (float) this.field2526;
                float var5 = (float) (-this.field2473 + this.field2299) * this.field2446 / (float) this.field2455;
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (var2 != var4 && var3 != var5) {
                    OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field2512, (double) this.field2479);
                }
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[161] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(IIII)V")
    public final void method1427(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 != 2) {
                this.method218(121, (class731[]) null);
            }
            ++field2325;
            OpenGL.glTexEnvi(8960, arg3 + 34184, arg1);
            OpenGL.glTexEnvi(8960, 34200 - -arg3, arg2);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[64] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "()Z")
    public final boolean method219() {
        try {
            ++field2188;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[216] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field2268;
            if (arg0 != arg2 || ~arg1 != ~arg3) {
                this.method1438((byte) -116);
                this.method1482(13370, arg5);
                float var10 = (float) arg2 - (float) arg0;
                float var11 = (float) arg3 - (float) arg1;
                float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
                OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
                float var13 = var10 * var12;
                int var27 = arg8 % (arg6 + arg7);
                float var14 = var11 * var12;
                float var15 = (float) arg6 * var13;
                float var16 = (float) arg6 * var14;
                float var17 = 0.0F;
                float var18 = 0.0F;
                float var19 = var15;
                float var20 = var16;
                if (~var27 >= ~arg6) {
                    var20 = (float) (-var27 + arg6) * var14;
                    var19 = (float) (-var27 + arg6) * var13;
                } else {
                    var17 = (float) (arg6 - var27 + arg7) * var13;
                    var18 = (float) (-var27 + arg7 + arg6) * var14;
                }
                float var21 = (float) arg0 + 0.35F + var17;
                float var22 = (float) arg1 + 0.35F + var18;
                float var23 = (float) arg7 * var13;
                float var24 = (float) arg7 * var14;
                while (true) {
                    if (arg0 >= arg2) {
                        if ((float) arg2 + 0.35F > var21) {
                            break;
                        }
                        if ((float) arg2 > var19 + var21) {
                            var19 = (float) arg2 + -var21;
                        }
                    } else {
                        if (var21 > (float) arg2 + 0.35F) {
                            break;
                        }
                        if (var19 + var21 > (float) arg2) {
                            var19 = (float) arg2 + -var21;
                        }
                    }
                    if (arg1 >= arg3) {
                        if ((float) arg3 + 0.35F > var22) {
                            break;
                        }
                        if ((float) arg3 > var20 + var22) {
                            var20 = (float) arg3 - var22;
                        }
                    } else {
                        if ((float) arg3 + 0.35F < var22) {
                            break;
                        }
                        if ((float) arg3 < var20 + var22) {
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
            throw class590.method4333(var26, field2544[102] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IZ)V")
    public final void method1428(int arg0, boolean arg1) {
        try {
            if (this.field2470 != arg1) {
                this.field2470 = arg1;
                this.method1430(false);
            }
            if (arg0 == -18408) {
                ++field2253;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "()V")
    public final void method233() {
        try {
            ++field2254;
            OpenGL.glFinish();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[31] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "(I)V")
    private final void method1429(int arg0) {
        try {
            if (this.field2172 == null) {
                this.field2307 = this.field2248 = 0;
            } else {
                Dimension var2 = this.field2172.getSize();
                this.field2307 = var2.width;
                this.field2248 = var2.height;
            }
            ++field2353;
            if (this.field2401 == null) {
                this.field2275 = this.field2307;
                this.field2299 = this.field2248;
                this.method1445(1);
            }
            this.method1434(104);
            this.method227();
            if (arg0 > -55) {
                this.field2450 = true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[56] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "()V")
    public final void method216() {
        try {
            ++field2176;
            if (this.field2489 && ~this.field2275 < -1 && ~this.field2299 < -1) {
                int var1 = this.field2475;
                int var2 = this.field2456;
                int var3 = this.field2487;
                int var4 = this.field2464;
                this.method227();
                OpenGL.glReadBuffer(1028);
                OpenGL.glDrawBuffer(1029);
                this.method1434(123);
                this.method1446(false, -32);
                this.method1474(false, (byte) 108);
                this.method1463(false, 1);
                this.method1489(-19225, false);
                this.method1497((class224) null, true);
                this.method1447(-2, 20014);
                this.method1425((byte) 35, 1);
                this.method1482(13370, 0);
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                OpenGL.glRasterPos2i(0, 0);
                OpenGL.glCopyPixels(0, 0, this.field2275, this.field2299, 6144);
                OpenGL.glFlush();
                OpenGL.glReadBuffer(1029);
                OpenGL.glDrawBuffer(1029);
                this.method221(var1, var3, var2, var4);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[222] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(Z)V")
    private final void method1430(boolean arg0) {
        try {
            ++field2177;
            if (this.field2466 && !this.field2470) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            if (arg0) {
                this.field2449 = -0.45962042F;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[118] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "()Z")
    public final boolean method148() {
        try {
            ++field2347;
            return this.field2381.method5075(3, (byte) 93);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[20] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "(I)V")
    public final void method1431(int arg0) {
        try {
            if (arg0 != 0) {
                this.field2465 = 88;
            }
            ++field2260;
            if (~this.field2416 != -3) {
                this.method1470((byte) -54);
                this.method1446(false, -32);
                this.method1474(false, (byte) 90);
                this.method1463(false, 1);
                this.method1489(-19225, false);
                this.method1447(-2, 20014);
                this.field2416 = 2;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[93] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lel;")
    public final class575 method209(int arg0, int arg1) {
        try {
            ++field2340;
            return null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[41] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)V")
    public final void method1432(byte arg0, int arg1) {
        try {
            if (~this.field2482 != ~arg1) {
                OpenGL.glActiveTexture(arg1 + 33984);
                this.field2482 = arg1;
            }
            ++field2289;
            if (arg0 != 3) {
                this.method219();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "()Z")
    public final boolean method238() {
        try {
            ++field2309;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[16] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)V")
    public final void method246(boolean arg0) {
        try {
            ++field2237;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[75] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "(I)V")
    private final void method1433(int arg0) {
        try {
            if (~this.field2502 != -3) {
                this.field2502 = 2;
                this.method1494((byte) -110);
                this.method1483(4382);
                this.field2416 &= -8;
            }
            ++field2206;
            int var2 = -95 % ((arg0 - 76) / 43);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[90] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[I[I)Laa;")
    public final class514 method258(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            ++field2324;
            return class351.method2919(arg0, arg2, arg3, this, (byte) 21, arg1);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[23] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2544[4] : field2544[3]) + ',' + (arg3 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            ++field2231;
            if (~arg0 != ~arg2 || arg1 != arg3) {
                class553 var13 = (class553) arg6;
                class20 var14 = var13.field8103;
                this.method1431(0);
                this.method1497(var13.field8103, true);
                this.method1482(13370, arg5);
                this.method1492(8448, 7681, (byte) 17);
                this.method1456((byte) -101, 768, 34167, 0);
                float var15 = var14.field201 / (float) var14.field205;
                float var16 = var14.field202 / (float) var14.field197;
                float var17 = (float) (-arg0) + (float) arg2;
                float var18 = (float) (-arg1) + (float) arg3;
                float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
                int var34 = arg11 % (arg9 + arg10);
                OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
                float var20 = var18 * var19;
                float var21 = var17 * var19;
                float var22 = (float) arg9 * var21;
                float var23 = (float) arg9 * var20;
                float var24 = 0.0F;
                float var25 = 0.0F;
                float var26 = var22;
                float var27 = var23;
                if (~var34 >= ~arg9) {
                    var26 = (float) (arg9 - var34) * var21;
                    var27 = (float) (-var34 + arg9) * var20;
                } else {
                    var25 = (float) (-var34 + arg9 + arg10) * var20;
                    var24 = (float) (arg9 + arg10 + -var34) * var21;
                }
                float var28 = (float) arg0 + 0.35F + var24;
                float var29 = (float) arg1 + 0.35F + var25;
                float var30 = (float) arg10 * var21;
                float var31 = (float) arg10 * var20;
                while (true) {
                    if (~arg2 < ~arg0) {
                        if ((float) arg2 + 0.35F < var28) {
                            break;
                        }
                        if ((float) arg2 < var26 + var28) {
                            var26 = (float) arg2 + -var28;
                        }
                    } else {
                        if (var28 < (float) arg2 + 0.35F) {
                            break;
                        }
                        if ((float) arg2 > var26 + var28) {
                            var26 = (float) arg2 + -var28;
                        }
                    }
                    if (~arg3 < ~arg1) {
                        if (var29 > (float) arg3 + 0.35F) {
                            break;
                        }
                        if ((float) arg3 < var27 + var29) {
                            var27 = (float) arg3 - var29;
                        }
                    } else {
                        if ((float) arg3 + 0.35F > var29) {
                            break;
                        }
                        if (var27 + var29 < (float) arg3) {
                            var27 = (float) arg3 + -var29;
                        }
                    }
                    OpenGL.glBegin(1);
                    OpenGL.glTexCoord2f(((float) (-arg7) + var28) * var15, ((float) (-arg8) + var29) * var16);
                    OpenGL.glVertex2f(var28, var29);
                    OpenGL.glTexCoord2f((var26 + var28 - (float) arg7) * var15, (var27 + var29 + (float) (-arg8)) * var16);
                    OpenGL.glVertex2f(var26 + var28, var27 + var29);
                    var29 += var27 + var31;
                    OpenGL.glEnd();
                    var28 += var26 + var30;
                    var27 = var23;
                    var26 = var22;
                }
                this.method1456((byte) -101, 768, 5890, 0);
            }
        } catch (RuntimeException var33) {
            throw class590.method4333(var33, field2544[199] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2544[4] : field2544[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "()I")
    public final int method155() {
        try {
            ++field2282;
            return this.field2512;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[154] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method231(Canvas arg0, int arg1, int arg2) {
        try {
            ++field2218;
            if (this.field2296 == arg0) {
                throw new RuntimeException();
            } else if (!this.field2240.containsKey(arg0)) {
                if (!arg0.isShowing()) {
                    throw new RuntimeException();
                } else {
                    try {
                        Class var4 = Class.forName(field2544[87]);
                        Method var5 = var4.getMethod(field2544[85], Boolean.TYPE);
                        var5.invoke(arg0, Boolean.TRUE);
                    } catch (Exception var9) {
                    }
                    long var6 = this.field2297.prepareSurface(arg0);
                    if (~var6 == 0L) {
                        throw new RuntimeException();
                    } else {
                        this.field2240.put(arg0, new Long(var6));
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2544[86] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "()V")
    public final void method202() {
        try {
            for (class568 var1 = this.field2391.method3228(11); var1 != null; var1 = this.field2391.method3216(true)) {
                ((class772) var1).method5570((byte) -92);
            }
            ++field2280;
            if (this.field2372 != null) {
                this.field2372.method3867(23);
            }
            if (this.field2297 != null) {
                this.method1484(82);
                Enumeration var2 = this.field2240.keys();
                while (var2.hasMoreElements()) {
                    Canvas var3 = (Canvas) var2.nextElement();
                    Long var4 = (Long) this.field2240.get(var3);
                    this.field2297.releaseSurface(var3, var4);
                }
                this.field2297.release();
                this.field2297 = null;
            }
            if (this.field2395) {
                class300.method2587((byte) 99, false, true);
                this.field2395 = false;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[224] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lsn;I)V")
    public final void method172(class659 arg0, int arg1) {
        try {
            this.field2386.method3335(arg1, this, false, arg0);
            ++field2185;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[69] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public final void method1434(int arg0) {
        try {
            int var2 = 1 % ((-41 - arg0) / 33);
            ++field2208;
            if (this.field2502 != 0) {
                this.field2416 &= -32;
                this.field2502 = 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[197] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(IIIIII)V")
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.method1438((byte) 105);
            ++field2272;
            this.method1482(13370, arg5);
            float var7 = (float) arg2 - (float) arg0;
            float var8 = (float) (-arg1) + (float) arg3;
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
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field2544[105] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IFFF)V")
    private final void method1435(int arg0, float arg1, float arg2, float arg3) {
        try {
            OpenGL.glMatrixMode(arg0);
            ++field2346;
            if (this.field2444) {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glTranslatef(arg3, arg2, arg1);
            OpenGL.glMatrixMode(5888);
            this.field2444 = true;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[88] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFI)V")
    public final void method1436(float arg0, float arg1, int arg2) {
        try {
            ++field2187;
            this.field2492 = arg0;
            this.field2457 = arg1;
            this.method1439(-32359);
            if (arg2 != 29936) {
                this.field2508 = 89;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[157] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "(I)V")
    public final void method1437(int arg0) {
        try {
            if (arg0 != -1) {
                this.method245();
            }
            OpenGL.glPopMatrix();
            ++field2180;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[210] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "(B)V")
    private final void method1438(byte arg0) {
        try {
            if (~this.field2416 != -2) {
                this.method1470((byte) -3);
                this.method1446(false, -32);
                this.method1474(false, (byte) 118);
                this.method1463(false, 1);
                this.method1489(-19225, false);
                this.method1497((class224) null, true);
                this.method1447(-2, 20014);
                this.method1425((byte) 35, 1);
                this.field2416 = 1;
            }
            int var2 = -128 / ((-40 - arg0) / 39);
            ++field2301;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "ya", descriptor = "()V")
    public final void method196() {
        try {
            ++field2374;
            this.method1489(-19225, true);
            OpenGL.glClear(256);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[36] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[Lih;)V")
    public final void method218(int arg0, class731[] arg1) {
        try {
            for (int var3 = 0; var3 < arg0; ++var3) {
                this.field2519[var3] = arg1[var3];
            }
            ++field2338;
            this.field2483 = arg0;
            if (this.field2502 != 1) {
                this.method1467(16386);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[63] + arg0 + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "(I)V")
    private final void method1439(int arg0) {
        try {
            ++field2233;
            this.field2497 = (float) (this.field2479 - this.field2428) + -this.field2492;
            this.field2530 = -((float) this.field2515 * this.field2457) + this.field2497;
            if ((float) this.field2512 > this.field2530) {
                this.field2530 = (float) this.field2512;
            }
            OpenGL.glFogf(2915, this.field2530);
            OpenGL.glFogf(2916, this.field2497);
            class395.field6270[2] = (float) class292.method2485(255, this.field2507) / 255.0F;
            class395.field6270[0] = (float) class292.method2485(16711680, this.field2507) / 1.671168E7F;
            if (arg0 != -32359) {
                this.method248((class769) null);
            }
            class395.field6270[1] = (float) class292.method2485(this.field2507, 65280) / 65280.0F;
            OpenGL.glFogfv(2918, class395.field6270, 0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[207] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFF)V")
    public final void method159(float arg0, float arg1, float arg2) {
        try {
            class97.field1419 = arg0;
            ++field2245;
            class31.field363 = arg1;
            class729.field10679 = arg2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[46] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "(II)I")
    public final int method1440(int arg0, int arg1) {
        try {
            ++field2200;
            if (arg0 != 5121 && arg0 != 5120) {
                if (arg1 >= -17) {
                    return 98;
                } else if (~arg0 != -5124 && arg0 != 5122) {
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
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        try {
            ++field2319;
            class553 var10 = (class553) arg6;
            class20 var11 = var10.field8103;
            this.method1431(0);
            this.method1497(var10.field8103, true);
            this.method1482(13370, arg5);
            this.method1492(8448, 7681, (byte) 17);
            this.method1456((byte) -101, 768, 34167, 0);
            float var12 = var11.field201 / (float) var11.field205;
            float var13 = var11.field202 / (float) var11.field197;
            float var14 = (float) (-arg0) + (float) arg2;
            float var15 = (float) (-arg1) + (float) arg3;
            float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var17 = var15 * var16;
            float var18 = var14 * var16;
            OpenGL.glBegin(1);
            OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
            OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
            OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
            OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
            OpenGL.glEnd();
            this.method1456((byte) -101, 768, 5890, 0);
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field2544[212] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2544[4] : field2544[3]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(Z)V")
    public final void method1441(boolean arg0) {
        try {
            ++field2252;
            if (~this.field2416 != -5) {
                this.method1470((byte) -87);
                this.method1446(false, -32);
                this.method1474(false, (byte) 90);
                this.method1463(false, 1);
                this.method1489(-19225, false);
                this.method1447(-2, 20014);
                this.method1482(13370, 1);
                this.field2416 = 4;
            }
            if (!arg0) {
                this.method257();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[71] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(II)V")
    public final synchronized void method1442(int arg0, int arg1) {
        try {
            ++field2232;
            class568 var3 = new class568();
            var3.field8252 = (long) arg0;
            this.field2414.method3220(var3, arg1 ^ arg1);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLdr;)V")
    public final void method1443(byte arg0, class753 arg1) {
        try {
            ++field2259;
            if (~this.field2398 <= -4) {
                throw new RuntimeException();
            } else {
                if (~this.field2398 <= -1) {
                    this.field2400[this.field2398].method4630((byte) 52);
                }
                this.field2401 = this.field2400[++this.field2398] = arg1;
                int var3 = -42 / ((arg0 - 19) / 55);
                this.field2401.method4620(29153);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[196] + arg0 + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "da", descriptor = "(III[I)V")
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field2333;
            float var5 = (float) arg2 * this.field2423.field9685 + (float) arg0 * this.field2423.field9678 + (float) arg1 * this.field2423.field9705 + this.field2423.field9689;
            if (!((float) this.field2512 > var5) && !(var5 > (float) this.field2479)) {
                int var6 = (int) (((float) arg2 * this.field2423.field9683 + (float) arg0 * this.field2423.field9700 + (float) arg1 * this.field2423.field9691 + this.field2423.field9681) * (float) this.field2526 / var5);
                int var7 = (int) (((float) arg2 * this.field2423.field9698 + (float) arg0 * this.field2423.field9675 + (float) arg1 * this.field2423.field9703 + this.field2423.field9680) * (float) this.field2455 / var5);
                if ((float) var6 >= this.field2484 && this.field2442 >= (float) var6 && this.field2501 <= (float) var7 && this.field2477 >= (float) var7) {
                    arg3[2] = (int) var5;
                    arg3[1] = (int) ((float) var7 - this.field2501);
                    arg3[0] = (int) ((float) var6 + -this.field2484);
                } else {
                    arg3[0] = arg3[1] = arg3[2] = -1;
                }
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2544[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "()I")
    public final int method177() {
        try {
            ++field2241;
            return 4;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[165] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lsj;)V")
    public final void method254(class486 arg0) {
        try {
            this.field2423.method2461(arg0);
            ++field2295;
            this.field2425.method2461(this.field2423);
            this.field2425.method4958(71);
            this.field2426.method4951(-1, this.field2425);
            if (this.field2502 != 1) {
                this.method1483(4382);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[51] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "()Z")
    public final boolean method241() {
        try {
            ++field2247;
            return this.field2377 != null && (~this.field2363 >= -2 || this.field2493);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[219] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(B)V")
    private final void method1444(byte arg0) {
        try {
            this.method1447(-2, 20014);
            ++field2256;
            for (int var2 = this.field2499 - 1; ~var2 <= -1; --var2) {
                this.method1432((byte) 3, var2);
                this.method1497((class224) null, true);
                OpenGL.glTexEnvi(8960, 8704, 34160);
            }
            this.method1492(8448, 8448, (byte) 17);
            this.method1456((byte) -101, 770, 34168, 2);
            this.method1476((byte) 56);
            this.field2420 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field2422 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field2418 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field2424 = true;
            this.method1446(true, -32);
            this.method1474(true, (byte) 91);
            this.method1463(true, 1);
            this.method1489(-19225, true);
            this.method1434(-82);
            this.field2297.setSwapInterval(0);
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
            int var6 = 47 % ((arg0 - -84) / 41);
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field2440 = this.field2507 = -1;
            this.method227();
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[65] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "(I)V")
    private final void method1445(int arg0) {
        try {
            OpenGL.glViewport(this.field2520, this.field2443, this.field2275, this.field2299);
            if (arg0 != 1) {
                this.method166(-0.35056308F);
            }
            ++field2335;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[59] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(ZI)V")
    public final void method1446(boolean arg0, int arg1) {
        try {
            if (arg1 != -32) {
                this.method1498((byte) 19);
            }
            ++field2226;
            if (this.field2514 == !arg0) {
                this.field2514 = arg0;
                this.method1453((byte) -125);
                this.field2416 &= -32;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[226] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "(II)V")
    public final void method1447(int arg0, int arg1) {
        try {
            this.method1504(arg0, true, (byte) -12);
            if (arg1 != 20014) {
                this.field2446 = 0.3490522F;
            }
            ++field2323;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[109] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([I)V")
    public final void method220(int[] arg0) {
        try {
            arg0[0] = this.field2275;
            ++field2294;
            arg0[1] = this.field2299;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[60] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILjaclib/memory/Buffer;Z)Lika;")
    public final class450 method1448(int arg0, int arg1, int arg2, Buffer arg3, boolean arg4) {
        try {
            if (arg0 < 58) {
                return null;
            } else {
                ++field2314;
                return (class450) (!this.field2460 || arg4 && !this.field2438 ? new class366(this, arg2, arg3) : new class383(this, arg2, arg3, arg1, arg4));
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[117] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2544[4] : field2544[3]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Llia;Llia;FLlia;)Llia;")
    public final class505 method249(class505 arg0, class505 arg1, float arg2, class505 arg3) {
        try {
            ++field2373;
            if (arg0 != null && arg1 != null && this.field2450 && this.field2532) {
                class225 var5 = null;
                class42 var6 = (class42) arg0;
                class42 var7 = (class42) arg1;
                class12 var8 = var6.method439(-73);
                class12 var9 = var7.method439(-63);
                if (var8 != null && var9 != null) {
                    int var10 = ~var9.field141 <= ~var8.field141 ? var9.field141 : var8.field141;
                    if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class225) {
                        class225 var11 = (class225) arg3;
                        if (var10 == var11.method1981(0)) {
                            var5 = var11;
                        }
                    }
                    if (var5 == null) {
                        var5 = new class225(this, var10);
                    }
                    if (var5.method1982(true, var9, var8, arg2)) {
                        return var5;
                    }
                }
            }
            return !(arg2 < 0.5F) ? arg1 : arg0;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field2544[163] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ',' + arg2 + ',' + (arg3 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "(I)V")
    private final void method1449(int arg0) {
        try {
            ++field2197;
            int var2 = 0;
            int var3 = -88 / ((arg0 - -52) / 49);
            while (!this.field2297.method4762()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class524.method3918(-4, 1000L);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[143] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "(II)V")
    public final void method161(int arg0, int arg1) {
        try {
            ++field2380;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[22] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIF)Lih;")
    public final class731 method195(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            ++field2202;
            return new class133(arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[101] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIII)V")
    public final void method1450(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 != 34200) {
                this.field2434 = false;
            }
            ++field2225;
            OpenGL.glDrawArrays(arg1, arg0, arg3);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[141] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "za", descriptor = "(IIIII)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2269;
            if (arg2 < 0) {
                arg2 = -arg2;
            }
            if (~(arg0 + arg2) <= ~this.field2475 && ~this.field2456 <= ~(-arg2 + arg0) && ~(arg1 + arg2) <= ~this.field2487 && this.field2464 >= -arg2 + arg1) {
                this.method1438((byte) -79);
                this.method1482(13370, arg4);
                OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
                float var6 = (float) arg0 + 0.35F;
                float var7 = (float) arg1 + 0.35F;
                int var8 = arg2 << 1;
                if ((float) var8 < this.field2495) {
                    OpenGL.glBegin(7);
                    OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                    OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                    OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                    OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                    OpenGL.glEnd();
                } else if (this.field2452 >= (float) var8) {
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
                    if (var9 > 64) {
                        if (var9 > 512) {
                            var9 = 512;
                        }
                    } else {
                        var9 = 64;
                    }
                    int var10 = class663.method4812(false, var9);
                    OpenGL.glVertex2f((float) arg2 + var6, var7);
                    for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                        OpenGL.glVertex2f(class434.field6812[var11] * (float) arg2 + var6, class434.field6811[var11] * (float) arg2 + var7);
                    }
                    OpenGL.glVertex2f((float) arg2 + var6, var7);
                    OpenGL.glEnd();
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field2544[28] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(II)V")
    public final synchronized void method1451(int arg0, int arg1) {
        try {
            ++field2310;
            class272 var3 = new class272(arg0);
            this.field2412.method3220(var3, arg1);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[54] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(Z)V")
    private final void method1452(boolean arg0) {
        try {
            if (!arg0) {
                this.method1473((class450) null, (byte) -1);
            }
            ++field2224;
            if (~this.field2475 >= ~this.field2456 && this.field2464 >= this.field2487) {
                OpenGL.glScissor(this.field2520 + this.field2475, this.field2443 - (-this.field2299 + this.field2464), -this.field2475 + this.field2456, this.field2464 - this.field2487);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[29] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "()Z")
    public final boolean method269() {
        try {
            ++field2288;
            return false;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[125] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(B)V")
    private final void method1453(byte arg0) {
        try {
            ++field2235;
            if (this.field2514 && this.field2515 >= 0) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
            if (arg0 > -115) {
                this.field2421 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[142] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "(I)V")
    private final void method1454(int arg0) {
        try {
            ++field2203;
            this.field2535[14] = this.field2517;
            this.field2535[10] = this.field2506;
            if (arg0 == 8448) {
                this.field2468 = (this.field2535[14] - (float) this.field2479) / this.field2535[10];
                this.field2474 = (float) this.field2479;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[213] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFIFF)V")
    public final void method1455(float arg0, float arg1, int arg2, float arg3, float arg4) {
        try {
            class395.field6270[0] = arg4;
            ++field2317;
            class395.field6270[2] = arg0;
            class395.field6270[3] = arg3;
            class395.field6270[1] = arg1;
            OpenGL.glTexEnvfv(8960, 8705, class395.field6270, arg2);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[208] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIII)V")
    public final void method1456(byte arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2243;
            OpenGL.glTexEnvi(8960, 34176 - -arg3, arg2);
            if (arg0 != -101) {
                this.field2457 = -1.4282031F;
            }
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg1);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[146] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FZ)V")
    public final void method1457(float arg0, boolean arg1) {
        try {
            if (this.field2446 != arg0) {
                this.field2446 = arg0;
                if (~this.field2502 == -4) {
                    this.method1426((byte) -116);
                }
            }
            ++field2250;
            if (arg1) {
                this.method1453((byte) -9);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[45] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "(II)V")
    public final void method1458(int arg0, int arg1) {
        try {
            class395.field6270[3] = (float) (arg1 >>> 24) / 255.0F;
            ++field2227;
            class395.field6270[0] = (float) class292.method2485(16711680, arg1) / 1.671168E7F;
            class395.field6270[2] = (float) class292.method2485(255, arg1) / 255.0F;
            class395.field6270[1] = (float) class292.method2485(65280, arg1) / 65280.0F;
            if (arg0 == 7) {
                OpenGL.glTexEnvfv(8960, 8705, class395.field6270, 0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[169] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLdr;)V")
    public final void method1459(boolean arg0, class753 arg1) {
        try {
            ++field2191;
            if (this.field2398 >= 0 && this.field2400[this.field2398] == arg1) {
                this.field2400[this.field2398--] = null;
                arg1.method4630((byte) 90);
                if (~this.field2398 > -1) {
                    this.field2401 = null;
                } else {
                    this.field2401 = this.field2400[this.field2398];
                    this.field2401.method4620(29153);
                }
                if (arg0) {
                    this.method1436(-0.61588234F, -1.3720366F, -60);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[26] + arg0 + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "(I)V")
    private final void method1460(int arg0) {
        try {
            ++field2308;
            float[] var2 = this.field2535;
            int var3 = -23 % ((arg0 - -31) / 32);
            float var4 = (float) (-this.field2521 * this.field2512) / (float) this.field2526;
            float var5 = (float) ((-this.field2521 + this.field2275) * this.field2512) / (float) this.field2526;
            float var6 = (float) (this.field2512 * this.field2473) / (float) this.field2455;
            float var7 = (float) ((-this.field2299 + this.field2473) * this.field2512) / (float) this.field2455;
            if (var4 != var5 && var6 != var7) {
                float var8 = (float) this.field2512 * 2.0F;
                var2[10] = this.field2506 = (float) (-(this.field2479 - -this.field2512)) / (float) (-this.field2512 + this.field2479);
                var2[15] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = var8 / (var6 - var7);
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[8] = (var4 + var5) / (var5 - var4);
                var2[3] = 0.0F;
                var2[11] = -1.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = var8 / (-var4 + var5);
                var2[9] = (var6 + var7) / (var6 - var7);
                var2[14] = this.field2517 = -((float) this.field2479 * var8) / (float) (this.field2479 - this.field2512);
                var2[7] = 0.0F;
            } else {
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[10] = 1.0F;
                var2[13] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[5] = 1.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
            }
            this.method1454(8448);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2544[111] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIID)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, double arg4) {
        try {
            ++field2255;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[38] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLbv;III)V")
    public final void method1461(byte arg0, class322 arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2351;
            if (arg0 != -15) {
                this.method1481((class774) null, (class774) null, (byte) 2, (class774) null, (class774) null);
            }
            int var6 = arg1.method619(-14976);
            int var9 = arg2 * this.method1440(var6, -27);
            this.method1490(false, arg1);
            OpenGL.glDrawElements(arg4, arg3, var6, (long) var9 + arg1.method620(1963));
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[128] + arg0 + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()Z")
    public final boolean method203() {
        try {
            ++field2249;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[42] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V")
    public final void method270(int arg0) {
        try {
            ++field2201;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[127] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)Lhk;")
    public final class107 method179(int arg0, int arg1, boolean arg2) {
        try {
            ++field2276;
            return new class2(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[203] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "()Z")
    public final boolean method245() {
        try {
            ++field2354;
            return false;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[47] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "(I)V")
    private final void method1462(int arg0) {
        try {
            if (this.field2502 != 3) {
                this.field2502 = 3;
                this.method1426((byte) -59);
                this.method1483(4382);
                this.field2416 &= -8;
            }
            if (arg0 == 13247) {
                ++field2193;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[73] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lel;Ltq;)Lsia;")
    public final class769 method217(class575 arg0, class657 arg1) {
        try {
            ++field2358;
            return null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[74] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "(IIIII)V")
    public final void method250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method1438((byte) -92);
            ++field2329;
            this.method1482(13370, arg4);
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var6, var7);
            OpenGL.glVertex2f((float) arg2 + var6, var7);
            OpenGL.glEnd();
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2544[174] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
    public final void method1463(boolean arg0, int arg1) {
        try {
            ++field2349;
            if (arg1 != 1) {
                this.method1461((byte) -97, (class322) null, 62, -15, 30);
            }
            if (arg0 == !this.field2421) {
                if (arg0) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
                this.field2421 = arg0;
                this.field2416 &= -32;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[21] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lsia;)V")
    public final void method248(class769 arg0) {
        try {
            ++field2204;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[122] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class293 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        try {
            ++field2179;
            return new class67(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2544[106] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2544[4] : field2544[3]) + ',' + (arg3 != null ? field2544[4] : field2544[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "(I)I")
    private final int method1464(int arg0) {
        try {
            ++field2230;
            this.field2433 = OpenGL.glGetString(7936).toLowerCase();
            int var2 = 0;
            this.field2527 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field2433.indexOf(field2544[189]) != 0) {
                var2 |= 1;
            }
            if (this.field2433.indexOf(field2544[192]) != -1 || ~this.field2433.indexOf(field2544[191]) != 0) {
                var2 |= 1;
            }
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class444.method3476(' ', 11206, var3.replace('.', ' '));
            if (~var4.length > -3) {
                var2 |= 4;
            } else {
                try {
                    int var5 = class441.method3457(true, var4[0]);
                    int var6 = class441.method3457(true, var4[1]);
                    this.field2516 = var5 * 10 + var6;
                } catch (NumberFormatException var9) {
                    var2 |= 4;
                }
            }
            if (~this.field2516 > -13) {
                var2 |= 2;
            }
            if (arg0 != -14115) {
                this.method232((Canvas) null, -38, -38);
            }
            if (!this.field2297.method4761(field2544[193])) {
                var2 |= 8;
            }
            if (!this.field2297.method4761(field2544[185])) {
                var2 |= 32;
            }
            int[] var7 = new int[1];
            OpenGL.glGetIntegerv(34018, var7, 0);
            this.field2499 = var7[0];
            OpenGL.glGetIntegerv(34929, var7, 0);
            this.field2504 = var7[0];
            OpenGL.glGetIntegerv(34930, var7, 0);
            this.field2486 = var7[0];
            if (this.field2499 < 2 || ~this.field2504 > -3 || this.field2486 < 2) {
                var2 |= 16;
            }
            this.field2500 = Stream.method5108();
            this.field2522 = this.field2297.arePbuffersAvailable();
            this.field2460 = this.field2297.method4761(field2544[190]);
            this.field2435 = this.field2297.method4761(field2544[178]);
            this.field2463 = this.field2297.method4761(field2544[180]);
            this.field2297.method4761(field2544[184]);
            this.field2467 = this.field2297.method4761(field2544[179]);
            this.field2518 = this.field2297.method4761(field2544[186]);
            this.field2533 = this.field2297.method4761(field2544[177]);
            this.field2481 = this.field2297.method4761(field2544[176]);
            this.field2450 = this.field2297.method4761(field2544[181]);
            this.field2471 = this.field2297.method4761(field2544[188]);
            this.field2513 = false;
            this.field2532 = this.field2297.method4761(field2544[194]);
            this.field2458 = this.field2297.method4761(field2544[187]);
            this.field2459 = this.field2297.method4761(field2544[182]);
            this.field2493 = this.field2458 & this.field2459;
            this.field2434 = class726.field10649.startsWith(field2544[183]);
            OpenGL.glGetFloatv(2834, class395.field6270, 0);
            this.field2495 = class395.field6270[0];
            this.field2452 = class395.field6270[1];
            return ~var2 == -1 ? 0 : var2;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2544[175] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)Lza;")
    public final class437 method228(int arg0) {
        try {
            ++field2229;
            class772 var2 = new class772(arg0);
            this.field2391.method3220(var2, 0);
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[225] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lkaa;[Luh;Z)Lda;")
    public final class64 method184(class49 arg0, class174[] arg1, boolean arg2) {
        try {
            ++field2263;
            return new class84(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[123] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZZII[B)Lbv;")
    public final class322 method1465(boolean arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        try {
            ++field2258;
            if (this.field2460 && (!arg0 || this.field2438)) {
                return new class60(this, arg2, arg4, arg3, arg0);
            } else {
                if (!arg1) {
                    this.method187();
                }
                return new class422(this, arg2, arg4, arg3);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[166] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lza;)V")
    public final void method157(class437 arg0) {
        try {
            ++field2238;
            this.field2392 = ((class772) arg0).field11314;
            if (this.field2491 == null) {
                class647 var2 = new class647(80);
                if (!this.field2500) {
                    var2.method4710(-1597413832, -1.0F);
                    var2.method4710(-1597413832, -1.0F);
                    var2.method4710(-1597413832, 0.0F);
                    var2.method4710(-1597413832, 0.0F);
                    var2.method4710(-1597413832, 1.0F);
                    var2.method4710(-1597413832, 1.0F);
                    var2.method4710(-1597413832, -1.0F);
                    var2.method4710(-1597413832, 0.0F);
                    var2.method4710(-1597413832, 1.0F);
                    var2.method4710(-1597413832, 1.0F);
                    var2.method4710(-1597413832, 1.0F);
                    var2.method4710(-1597413832, 1.0F);
                    var2.method4710(-1597413832, 0.0F);
                    var2.method4710(-1597413832, 1.0F);
                    var2.method4710(-1597413832, 0.0F);
                    var2.method4710(-1597413832, -1.0F);
                    var2.method4710(-1597413832, 1.0F);
                    var2.method4710(-1597413832, 0.0F);
                    var2.method4710(-1597413832, 0.0F);
                    var2.method4710(-1597413832, 0.0F);
                } else {
                    var2.method4708(-1.0F, true);
                    var2.method4708(-1.0F, true);
                    var2.method4708(0.0F, true);
                    var2.method4708(0.0F, true);
                    var2.method4708(1.0F, true);
                    var2.method4708(1.0F, true);
                    var2.method4708(-1.0F, true);
                    var2.method4708(0.0F, true);
                    var2.method4708(1.0F, true);
                    var2.method4708(1.0F, true);
                    var2.method4708(1.0F, true);
                    var2.method4708(1.0F, true);
                    var2.method4708(0.0F, true);
                    var2.method4708(1.0F, true);
                    var2.method4708(0.0F, true);
                    var2.method4708(-1.0F, true);
                    var2.method4708(1.0F, true);
                    var2.method4708(0.0F, true);
                    var2.method4708(0.0F, true);
                    var2.method4708(0.0F, true);
                }
                this.field2491 = this.method1488((byte) 31, var2.field2799, var2.field2805, 20, false);
                this.field2472 = new class774(this.field2491, 5126, 3, 0);
                this.field2537 = new class774(this.field2491, 5126, 2, 12);
                this.field2386.method3337(this, -119);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[43] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "pa", descriptor = "()V")
    public final void method181() {
        try {
            ++field2182;
            this.field2469 = false;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[202] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Luh;Z)Lhk;")
    public final class107 method213(class174 arg0, boolean arg1) {
        try {
            ++field2352;
            int[] var3 = new int[arg0.field2782 * arg0.field2781];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field2779 != null) {
                for (int var6 = 0; ~var6 > ~arg0.field2782; ++var6) {
                    for (int var7 = 0; arg0.field2781 > var7; ++var7) {
                        var3[var5++] = class553.method4099(arg0.field2775[class292.method2485(255, arg0.field2776[var4])], arg0.field2779[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~arg0.field2782 < ~var8; ++var8) {
                    for (int var9 = 0; ~arg0.field2781 < ~var9; ++var9) {
                        int var10 = arg0.field2775[arg0.field2776[var4++] & 255];
                        var3[var5++] = var10 == 0 ? 0 : class553.method4099(var10, -16777216);
                    }
                }
            }
            class107 var11 = this.method665(arg0.field2781, arg0.field2781, 111, 0, var3, arg0.field2782);
            var11.method24(arg0.field2774, arg0.field2778, arg0.field2777, arg0.field2780);
            return var11;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field2544[12] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)V")
    public final synchronized void method1466(int arg0, int arg1, int arg2) {
        try {
            ++field2330;
            class272 var4 = new class272(arg1);
            if (arg0 != 6407) {
                this.field2381 = null;
            }
            var4.field8252 = (long) arg2;
            this.field2411.method3220(var4, 0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "(I)V")
    private final void method1467(int arg0) {
        try {
            ++field2257;
            if (arg0 != 16386) {
                this.field2390 = 39;
            }
            int var2;
            for (var2 = 0; ~var2 > ~this.field2483; ++var2) {
                class731 var3 = this.field2519[var2];
                class388.field6200[0] = (float) var3.method5300(32);
                int var4 = var2 + 16386;
                class388.field6200[1] = (float) var3.method5297(false);
                class388.field6200[2] = (float) var3.method5298(-4);
                class388.field6200[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class388.field6200, 0);
                int var5 = var3.method5294(true);
                float var6 = var3.method5299(31541) / 255.0F;
                class388.field6200[2] = var6 * (float) class292.method2485(255, var5);
                class388.field6200[1] = var6 * (float) class292.method2485(255, var5 >> 8);
                class388.field6200[0] = (float) (class292.method2485(16730060, var5) >> 16) * var6;
                OpenGL.glLightfv(var4, 4609, class388.field6200, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method5295(32) * var3.method5295(32)));
                OpenGL.glEnable(var4);
            }
            while (~this.field2534 < ~var2) {
                OpenGL.glDisable(16386 - -var2);
                ++var2;
            }
            this.field2534 = this.field2483;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[89] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lkc;IIII)Lka;")
    public final class499 method192(class141 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2214;
            return new class407(this, arg0, arg1, arg3, arg4, arg2);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[153] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "(IIII)V")
    public final void method162(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (this.field2487 < arg1) {
                this.field2487 = arg1;
            }
            if (~this.field2456 < ~arg2) {
                this.field2456 = arg2;
            }
            ++field2336;
            if (~arg0 < ~this.field2475) {
                this.field2475 = arg0;
            }
            if (this.field2464 > arg3) {
                this.field2464 = arg3;
            }
            OpenGL.glEnable(3089);
            this.method1478(28015);
            this.method1452(true);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[120] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "(ILaa;II)V")
    public final void method170(int arg0, class514 arg1, int arg2, int arg3) {
        try {
            ++field2343;
            class553 var5 = (class553) arg1;
            class20 var6 = var5.field8103;
            this.method1431(0);
            this.method1497(var5.field8103, true);
            this.method1482(13370, 1);
            this.method1492(8448, 7681, (byte) 17);
            this.method1456((byte) -101, 768, 34167, 0);
            float var7 = var6.field201 / (float) var6.field205;
            float var8 = var6.field202 / (float) var6.field197;
            OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2475) * var7, (float) (this.field2487 - arg3) * var8);
            OpenGL.glVertex2i(this.field2475, this.field2487);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2475) * var7, (float) (-arg3 + this.field2464) * var8);
            OpenGL.glVertex2i(this.field2475, this.field2464);
            OpenGL.glTexCoord2f((float) (-arg2 + this.field2456) * var7, (float) (-arg3 + this.field2464) * var8);
            OpenGL.glVertex2i(this.field2456, this.field2464);
            OpenGL.glTexCoord2f((float) (this.field2456 - arg2) * var7, (float) (-arg3 + this.field2487) * var8);
            OpenGL.glVertex2i(this.field2456, this.field2487);
            OpenGL.glEnd();
            this.method1456((byte) -101, 768, 5890, 0);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2544[95] + arg0 + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "()I")
    public final int method154() {
        try {
            ++field2384;
            int var1 = this.field2542;
            this.field2542 = 0;
            return var1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[159] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "(B)Ldka;")
    public final class12 method1468(byte arg0) {
        try {
            ++field2283;
            if (arg0 < 8) {
                this.field2498 = null;
            }
            return this.field2454 != null ? this.field2454.method439(78) : null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[78] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            ++field2303;
            float var10;
            float var11;
            if (this.field2430 != null && ~this.field2430.field9309 <= ~arg2 && ~arg3 >= ~this.field2430.field9310) {
                this.field2430.method4731(arg2, 6406, arg6, false, 0, 0, 0, -26658, 0, arg3);
                var10 = (float) arg2 * this.field2430.field201 / (float) this.field2430.field9309;
                var11 = (float) arg3 * this.field2430.field202 / (float) this.field2430.field9310;
            } else {
                this.field2430 = class271.method2337(arg3, arg2, this, 6406, arg6, true, 6406, false);
                this.field2430.method4732(false, 125, false);
                var11 = this.field2430.field202;
                var10 = this.field2430.field201;
            }
            this.method1431(0);
            this.method1497(this.field2430, true);
            this.method1482(13370, arg8);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            this.method1458(7, arg5);
            this.method1492(34165, 34165, (byte) 17);
            this.method1456((byte) -101, 768, 34166, 0);
            this.method1456((byte) -101, 770, 5890, 2);
            this.method1427(2, 34166, 770, 0);
            this.method1427(2, 5890, 770, 2);
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
            this.method1456((byte) -101, 768, 5890, 0);
            this.method1456((byte) -101, 770, 34166, 2);
            this.method1427(2, 5890, 770, 0);
            this.method1427(2, 34166, 770, 2);
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field2544[205] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2544[4] : field2544[3]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "(I)V")
    public static void method1469(int arg0) {
        try {
            field2327 = null;
            field2287 = null;
            if (arg0 < 47) {
                field2327 = null;
            }
            field2356 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[33] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "(IIIII)V")
    public final void method262(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2350;
            this.method1438((byte) -110);
            this.method1482(13370, arg4);
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var6, var7);
            OpenGL.glVertex2f(var6, (float) arg2 + var7);
            OpenGL.glEnd();
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2544[77] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "()[I")
    public final int[] method212() {
        try {
            ++field2385;
            return new int[] { this.field2521, this.field2473, this.field2526, this.field2455 };
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[110] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(II)V")
    public final void method247(int arg0, int arg1) {
        try {
            ++field2360;
            if (~this.field2512 != ~arg0 || this.field2479 != arg1) {
                this.field2512 = arg0;
                this.field2479 = arg1;
                this.method1460(69);
                this.method1439(-32359);
                if (this.field2502 == 3) {
                    this.method1426((byte) -116);
                    return;
                }
                if (this.field2502 != 2) {
                    return;
                }
                this.method1494((byte) -110);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[37] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
    private final void method1470(byte arg0) {
        try {
            if (arg0 >= -2) {
                this.field2414 = null;
            }
            if (this.field2502 != 1) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (~this.field2275 < -1 && this.field2299 > 0) {
                    OpenGL.glOrtho(0.0D, (double) this.field2275, (double) this.field2299, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field2416 &= -25;
                this.field2502 = 1;
            }
            ++field2192;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[173] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "GA", descriptor = "(I)V")
    public final void method182(int arg0) {
        try {
            ++field2181;
            this.method1482(13370, 0);
            OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
            OpenGL.glClear(16384);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[119] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
    public static final void method1471(int arg0, int arg1, int arg2) {
        try {
            ++field2210;
            class551 var3 = class380.method3113(arg1 + -2133, (long) arg0, 16);
            var3.method4086(arg1 ^ 1972);
            var3.field8076 = arg2;
            if (arg1 != 2017) {
                method1471(62, 35, -107);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[160] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
    public final void method1472(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 > 29) {
                ++field2178;
                this.field2443 = arg2;
                this.field2520 = arg0;
                this.method1445(1);
                this.method1452(true);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[195] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lika;B)V")
    public final void method1473(class450 arg0, byte arg1) {
        try {
            if (this.field2437 != arg0) {
                if (this.field2460) {
                    OpenGL.glBindBufferARB(34962, arg0.method3027((byte) 47));
                }
                this.field2437 = arg0;
            }
            ++field2209;
            if (arg1 != -103) {
                this.field2461 = -0.8525216F;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[49] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "()Lsj;")
    public final class486 method257() {
        try {
            ++field2316;
            return new class680();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[44] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIIII)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2306;
            float var7 = (float) arg0 + 0.35F;
            float var8 = (float) arg1 + 0.35F;
            float var9 = (float) arg2 + var7 + -1.0F;
            this.method1438((byte) 100);
            float var10 = (float) arg3 + var8 + -1.0F;
            this.method1482(13370, arg5);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            if (this.field2435) {
                OpenGL.glDisable(32925);
            }
            OpenGL.glBegin(2);
            OpenGL.glVertex2f(var7, var8);
            OpenGL.glVertex2f(var7, var10);
            OpenGL.glVertex2f(var9, var10);
            OpenGL.glVertex2f(var9, var8);
            OpenGL.glEnd();
            if (this.field2435) {
                OpenGL.glEnable(32925);
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field2544[170] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "xa", descriptor = "(F)V")
    public final void method166(float arg0) {
        try {
            ++field2277;
            if (this.field2461 != arg0) {
                this.field2461 = arg0;
                this.method1498((byte) 63);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[147] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "()V")
    public final void method215() {
        try {
            ++field2251;
            if (this.field2377 != null && this.field2377.method3752(2)) {
                this.field2372.method3871(this.field2377, true);
                this.field2365.method5339((byte) 27);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[32] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIZ)Lhk;")
    public final class107 method211(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            ++field2239;
            return new class2(this, arg0, arg1, arg2, arg3);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
    public final int method169(int arg0, int arg1) {
        try {
            ++field2265;
            return arg1 | arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[136] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(II)V")
    public final void method171(int arg0, int arg1) throws class146 {
        try {
            ++field2361;
            try {
                this.field2297.swapBuffers();
            } catch (Exception var4) {
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[168] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZB)V")
    public final void method1474(boolean arg0, byte arg1) {
        try {
            if (arg1 > 81) {
                if (!arg0 != !this.field2466) {
                    this.field2466 = arg0;
                    this.method1430(false);
                    this.field2416 &= -8;
                }
                ++field2328;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[121] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(B)V")
    public final void method1475(byte arg0) {
        try {
            OpenGL.glLightfv(16384, 4611, this.field2431, 0);
            if (arg0 != 56) {
                this.field2442 = 1.0206299F;
            }
            ++field2236;
            OpenGL.glLightfv(16385, 4611, this.field2524, 0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[139] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    private final void method1476(byte arg0) {
        try {
            if (this.field2444) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field2444 = false;
            }
            ++field2219;
            if (arg0 <= 16) {
                this.field2425 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[167] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "()Z")
    public final boolean method263() {
        try {
            ++field2300;
            if (this.field2377 != null) {
                if (!this.field2377.method3752(2)) {
                    if (!this.field2372.method3873(this.field2377, 126)) {
                        return false;
                    }
                    this.field2365.method5339((byte) 27);
                }
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[97] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(Z)V")
    private final void method1477(boolean arg0) {
        try {
            OpenGL.glDepthMask(this.field2417 && this.field2436);
            ++field2348;
            if (arg0) {
                this.method197(117, 70, -105, -33, -104, 108, 119, 84, -27);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[34] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "(I)V")
    private final void method1478(int arg0) {
        try {
            this.field2501 = (float) (-this.field2473 + this.field2487);
            this.field2484 = (float) (-this.field2521 + this.field2475);
            ++field2273;
            this.field2477 = (float) (-this.field2473 + this.field2464);
            this.field2442 = (float) (-this.field2521 + this.field2456);
            if (arg0 != 28015) {
                this.field2505 = -27;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method189(Canvas arg0) {
        try {
            ++field2332;
            if (this.field2296 == arg0) {
                throw new RuntimeException();
            } else if (this.field2240.containsKey(arg0)) {
                Long var2 = (Long) this.field2240.get(arg0);
                this.field2297.releaseSurface(arg0, var2);
                this.field2240.remove(arg0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[100] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ldr;I)V")
    public final void method1479(class753 arg0, int arg1) {
        try {
            ++field2228;
            if (this.field2399 >= 0 && this.field2396[this.field2399] == arg0) {
                if (arg1 != 1) {
                    this.method1440(-4, -50);
                }
                this.field2396[this.field2399--] = null;
                arg0.method4629(9948);
                if (~this.field2399 <= -1) {
                    this.field2404 = this.field2396[this.field2399];
                    this.field2404.method4625((byte) 107);
                } else {
                    this.field2404 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[217] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class159(Canvas arg0, class158 arg1, int arg2) {
        super(arg1);
        new class708();
        new class69(16);
        this.field2409 = new class398();
        this.field2410 = new class398();
        this.field2411 = new class398();
        this.field2412 = new class398();
        this.field2413 = new class398();
        this.field2414 = new class398();
        this.field2415 = new class398();
        this.field2423 = new class680();
        this.field2425 = new class680();
        this.field2426 = new class680();
        this.field2431 = new float[4];
        this.field2440 = -1;
        this.field2452 = -1.0F;
        this.field2456 = 0;
        this.field2448 = 1.0F;
        this.field2457 = 1.0F;
        this.field2447 = new float[4];
        this.field2476 = 1.0F;
        this.field2480 = 1.0F;
        this.field2468 = 3584.0F;
        this.field2439 = -1;
        this.field2455 = 512;
        this.field2446 = 1.0F;
        this.field2475 = 0;
        this.field2441 = -1;
        this.field2464 = 0;
        this.field2436 = true;
        this.field2505 = 8448;
        this.field2485 = -1.0F;
        this.field2449 = -1.0F;
        this.field2443 = 0;
        this.field2432 = new float[4];
        this.field2451 = 0;
        this.field2512 = 50;
        this.field2479 = 3584;
        this.field2487 = 0;
        this.field2507 = -1;
        this.field2492 = 0.0F;
        this.field2428 = 0;
        this.field2520 = 0;
        this.field2521 = 0;
        this.field2524 = new float[4];
        this.field2519 = new class731[class193.field3026];
        this.field2473 = 0;
        this.field2528 = false;
        this.field2474 = 3584.0F;
        this.field2515 = -1;
        this.field2495 = -1.0F;
        this.field2526 = 512;
        this.field2508 = 8448;
        this.field2535 = new float[16];
        this.field2453 = new class647(8192);
        this.field2541 = new int[1];
        this.field2538 = new int[1];
        this.field2540 = new byte[16384];
        this.field2543 = new int[1];
        try {
            this.field2363 = arg2;
            this.field2172 = this.field2296 = arg0;
            if (!class259.method2177((byte) -72, field2544[134])) {
                throw new RuntimeException("");
            } else if (!class259.method2177((byte) -72, field2544[130])) {
                throw new RuntimeException("");
            } else {
                try {
                    this.field2297 = new OpenGL();
                    this.field2359 = this.field2211 = this.field2297.init(arg0, 8, 8, 8, 24, 0, this.field2363);
                    if (this.field2211 == 0L) {
                        throw new RuntimeException("");
                    } else {
                        this.method1449(-121);
                        int var4 = this.method1464(-14115);
                        if (~var4 != -1) {
                            throw new RuntimeException("");
                        } else {
                            this.field2490 = !this.field2500 ? 5121 : 33639;
                            if (this.field2527.indexOf(field2544[129]) != -1) {
                                int var5 = 0;
                                boolean var6 = false;
                                boolean var7 = false;
                                String[] var8 = class444.method3476(' ', 11206, this.field2527.replace('/', ' '));
                                for (int var9 = 0; var8.length > var9; ++var9) {
                                    String var10 = var8[var9];
                                    try {
                                        if (var10.length() > 0) {
                                            if (~var10.charAt(0) == -121 && ~var10.length() <= -4 && class30.method316(10, var10.substring(1, 3))) {
                                                var7 = true;
                                                var10 = var10.substring(1);
                                            }
                                            if (var10.equals(field2544[132])) {
                                                var6 = true;
                                            } else {
                                                if (var10.startsWith(field2544[132])) {
                                                    var6 = true;
                                                    var10 = var10.substring(2);
                                                }
                                                if (var10.length() >= 4 && class30.method316(10, var10.substring(0, 4))) {
                                                    var5 = class441.method3457(true, var10.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var15) {
                                    }
                                }
                                if (!var7 && !var6) {
                                    if (var5 >= 7000 && var5 <= 9250) {
                                        this.field2533 = false;
                                    }
                                    if (~var5 <= -7001 && var5 <= 7999) {
                                        this.field2460 = false;
                                    }
                                }
                                if (!var6 || var5 < 4000) {
                                    this.field2471 = false;
                                }
                                this.field2481 &= this.field2297.method4761(field2544[131]);
                                this.field2438 = this.field2460;
                                this.field2496 = true;
                            }
                            if (~this.field2433.indexOf(field2544[81]) != 0) {
                                this.field2532 = false;
                            }
                            this.field2489 = !this.field2433.equals(field2544[133]);
                            if (this.field2460) {
                                try {
                                    int[] var11 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var11, 0);
                                } catch (Throwable var14) {
                                    throw new RuntimeException("");
                                }
                            }
                            class517.method3877(true, false, 1);
                            this.field2395 = true;
                            this.field2365 = new class735(this, super.field864);
                            this.method1500(3553);
                            this.field2393 = new class382(this);
                            this.field2372 = new class516(this);
                            if (this.field2372.method3870(-12396)) {
                                this.field2377 = new class656(this);
                                if (!this.field2377.method4785(0)) {
                                    this.field2377.method3745(true);
                                    this.field2377 = null;
                                }
                            }
                            this.field2381 = new class700(this);
                            this.method1444((byte) -128);
                            this.method1429(-98);
                            this.method216();
                        }
                    }
                } catch (Throwable var16) {
                    var16.printStackTrace();
                    this.method202();
                    throw new RuntimeException("");
                }
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field2544[135] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(BI)I")
    public final int method1480(byte arg0, int arg1) {
        try {
            ++field2286;
            if (arg0 >= -38) {
                this.method1464(-126);
            }
            if (arg1 != 6406 && ~arg1 != -6410) {
                if (~arg1 != -6411 && ~arg1 != -34847 && ~arg1 != -34845) {
                    if (~arg1 == -6408) {
                        return 3;
                    } else if (arg1 != 6408 && ~arg1 != -34848) {
                        if (~arg1 == -34844) {
                            return 6;
                        } else if (~arg1 == -34843) {
                            return 8;
                        } else if (arg1 != 6402) {
                            if (arg1 == 6401) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 3;
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
            throw class590.method4333(var4, field2544[112] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lkn;Lkn;BLkn;Lkn;)V")
    public final void method1481(class774 arg0, class774 arg1, byte arg2, class774 arg3, class774 arg4) {
        try {
            if (arg3 != null) {
                this.method1473(arg3.field11320, (byte) -103);
                OpenGL.glVertexPointer(arg3.field11319, arg3.field11323, this.field2437.method3024((byte) 46), this.field2437.method3025(115) - -((long) arg3.field11324));
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            ++field2311;
            if (arg4 != null) {
                this.method1473(arg4.field11320, (byte) -103);
                OpenGL.glNormalPointer(arg4.field11323, this.field2437.method3024((byte) 46), this.field2437.method3025(38) + (long) arg4.field11324);
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg0 != null) {
                this.method1473(arg0.field11320, (byte) -103);
                OpenGL.glColorPointer(arg0.field11319, arg0.field11323, this.field2437.method3024((byte) 46), this.field2437.method3025(122) + (long) arg0.field11324);
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            if (arg1 != null) {
                this.method1473(arg1.field11320, (byte) -103);
                OpenGL.glTexCoordPointer(arg1.field11319, arg1.field11323, this.field2437.method3024((byte) 46), this.field2437.method3025(117) + (long) arg1.field11324);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
            if (arg2 > -42) {
                this.field2489 = true;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[103] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ',' + arg2 + ',' + (arg3 != null ? field2544[4] : field2544[3]) + ',' + (arg4 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(II)V")
    public final void method1482(int arg0, int arg1) {
        try {
            if (arg0 == 13370) {
                ++field2290;
                if (this.field2420 != arg1) {
                    boolean var3;
                    boolean var4;
                    byte var5;
                    if (~arg1 == -2) {
                        var3 = true;
                        var4 = true;
                        var5 = 1;
                    } else if (arg1 != 2) {
                        if (arg1 != 128) {
                            var5 = 0;
                            var4 = false;
                            var3 = true;
                        } else {
                            var3 = true;
                            var4 = true;
                            var5 = 3;
                        }
                    } else {
                        var3 = true;
                        var5 = 2;
                        var4 = false;
                    }
                    if (this.field2424 != var3) {
                        OpenGL.glColorMask(var3, var3, var3, true);
                        this.field2424 = var3;
                    }
                    if (this.field2418 == !var4) {
                        if (var4) {
                            OpenGL.glEnable(3008);
                        } else {
                            OpenGL.glDisable(3008);
                        }
                        this.field2418 = var4;
                    }
                    if (~this.field2422 != ~var5) {
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
                        this.field2422 = var5;
                    }
                    this.field2416 &= -29;
                    this.field2420 = arg1;
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[201] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(Z)V")
    public final void method178(boolean arg0) {
        try {
            ++field2285;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[70] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "(I)V")
    public final void method149(int arg0) {
        try {
            this.field2390 = 0;
            ++field2216;
            while (arg0 > 1) {
                arg0 >>= 1;
                ++this.field2390;
            }
            this.field2389 = 1 << this.field2390;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[98] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "(I)V")
    private final void method1483(int arg0) {
        try {
            OpenGL.glLoadIdentity();
            ++field2278;
            OpenGL.glMultMatrixf(this.field2425.method4955(318767104), 0);
            if (this.field2528) {
                this.field2381.field10063.method4123((byte) -106);
            }
            if (arg0 != 4382) {
                this.method168(97, 89, -29, -31, 52, 126, (byte[]) null, 80, 91);
            }
            this.method1475((byte) 56);
            this.method1467(16386);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "(I)V")
    private final void method1484(int arg0) {
        try {
            this.field2297.method4763();
            ++field2305;
            if (arg0 <= 61) {
                this.method217((class575) null, (class657) null);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[114] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "()Lwaa;")
    public final class734 method240() {
        try {
            ++field2339;
            int var1 = -1;
            if (this.field2433.indexOf(field2544[83]) != -1) {
                var1 = 4318;
            } else if (~this.field2433.indexOf(field2544[81]) == 0) {
                if (this.field2433.indexOf(field2544[80]) != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
            return new class734(var1, field2544[84], this.field2516, this.field2527, 0L);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[82] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()Lsj;")
    public final class486 method271() {
        try {
            ++field2221;
            return this.field2423;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[140] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Ldr;B)V")
    public final void method1485(class753 arg0, byte arg1) {
        try {
            ++field2362;
            if (~this.field2399 <= -4) {
                throw new RuntimeException();
            } else {
                if (arg1 != 113) {
                    this.method257();
                }
                if (~this.field2399 <= -1) {
                    this.field2396[this.field2399].method4629(9948);
                }
                this.field2404 = this.field2396[++this.field2399] = arg0;
                this.field2404.method4625((byte) 114);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[214] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public final void method150(int arg0) {
        try {
            ++field2195;
            if (~arg0 <= -129 && ~arg0 >= -1025) {
                this.field2366 = arg0;
                this.field2365.method5339((byte) 27);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[151] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)I")
    public final int method1486(int arg0, byte arg1) {
        try {
            ++field2344;
            if (arg0 != 1) {
                if (arg0 != 0) {
                    if (~arg0 == -3) {
                        return 34165;
                    } else if (~arg0 != -4) {
                        if (arg0 == 4) {
                            return 34023;
                        } else {
                            if (arg1 > -92) {
                                this.method1501((class680) null, (byte) -125);
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
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[200] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "la", descriptor = "()V")
    public final void method227() {
        try {
            this.field2456 = this.field2275;
            this.field2464 = this.field2299;
            this.field2475 = 0;
            this.field2487 = 0;
            ++field2341;
            OpenGL.glDisable(3089);
            this.method1478(28015);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[52] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2184;
            this.field2372.method3866((byte) 118, arg2, arg0, arg3, arg1);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[66] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()Z")
    public final boolean method152() {
        try {
            ++field2322;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[14] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method232(Canvas arg0, int arg1, int arg2) {
        try {
            ++field2242;
            long var4 = 0L;
            if (arg0 != null && this.field2296 != arg0) {
                if (this.field2240.containsKey(arg0)) {
                    Long var6 = (Long) this.field2240.get(arg0);
                    var4 = var6;
                }
            } else {
                var4 = this.field2211;
            }
            if (~var4 == -1L) {
                throw new RuntimeException();
            } else {
                this.field2297.surfaceResized(var4);
                if (this.field2172 == arg0) {
                    this.method1429(-64);
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[92] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "(I)V")
    public final void method1487(int arg0) {
        try {
            if (~this.field2416 != arg0) {
                this.method1462(arg0 + 13264);
                this.method1446(true, arg0 + -15);
                this.method1463(true, 1);
                this.method1489(arg0 ^ 19208, true);
                this.method1482(13370, 1);
                this.field2416 = 16;
            }
            ++field2261;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[72] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI[BIZ)Lika;")
    public final class450 method1488(byte arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        try {
            ++field2291;
            if (arg0 != 31) {
                return null;
            } else {
                return (class450) (!this.field2460 || arg4 && !this.field2438 ? new class366(this, arg3, arg2, arg1) : new class383(this, arg3, arg2, arg1, arg4));
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[209] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2544[4] : field2544[3]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "HA", descriptor = "(IIII[I)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        try {
            ++field2281;
            float var6 = (float) arg2 * this.field2423.field9685 + (float) arg0 * this.field2423.field9678 + (float) arg1 * this.field2423.field9705 + this.field2423.field9689;
            if (!((float) this.field2512 > var6) && !(var6 > (float) this.field2479)) {
                int var7 = (int) (((float) arg2 * this.field2423.field9683 + (float) arg0 * this.field2423.field9700 + (float) arg1 * this.field2423.field9691 + this.field2423.field9681) * (float) this.field2526 / (float) arg3);
                int var8 = (int) (((float) arg2 * this.field2423.field9698 + (float) arg0 * this.field2423.field9675 + (float) arg1 * this.field2423.field9703 + this.field2423.field9680) * (float) this.field2455 / (float) arg3);
                if ((float) var7 >= this.field2484 && this.field2442 >= (float) var7 && this.field2501 <= (float) var8 && this.field2477 >= (float) var8) {
                    arg4[1] = (int) ((float) var8 + -this.field2501);
                    arg4[0] = (int) ((float) var7 - this.field2484);
                    arg4[2] = (int) var6;
                } else {
                    arg4[0] = arg4[1] = arg4[2] = -1;
                }
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2544[30] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
    public final void method1489(int arg0, boolean arg1) {
        try {
            if (arg0 != -19225) {
                this.field2434 = true;
            }
            if (!this.field2417 != !arg1) {
                this.field2417 = arg1;
                this.method1477(false);
                this.field2416 &= -32;
            }
            ++field2205;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[113] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLbv;)V")
    public final void method1490(boolean arg0, class322 arg1) {
        try {
            if (this.field2427 != arg1) {
                if (this.field2460) {
                    OpenGL.glBindBufferARB(34963, arg1.method621(-123));
                }
                this.field2427 = arg1;
            }
            ++field2173;
            if (arg0) {
                this.field2416 = -1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[67] + arg0 + ',' + (arg1 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "XA", descriptor = "()I")
    public final int method193() {
        try {
            ++field2262;
            return this.field2479;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[55] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBZZ)V")
    public final void method1491(int arg0, byte arg1, boolean arg2, boolean arg3) {
        try {
            if (this.field2531 != arg0 || !this.field2528 != !this.field2469) {
                class649 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = !this.field2469 ? 0 : 3;
                if (~arg0 > -1) {
                    this.method1476((byte) 79);
                } else {
                    var5 = this.field2365.method5344(arg0, (byte) 77);
                    class304 var10 = super.field864.method1419(arg0, -113);
                    if (~var10.field4899 == -1 && ~var10.field4902 == -1) {
                        this.method1476((byte) 35);
                    } else {
                        int var11 = !var10.field4911 ? 128 : 64;
                        int var12 = var11 * 50;
                        this.method1435(5890, 0.0F, (float) (this.field2394 % var12 * var10.field4902) / (float) var12, (float) (this.field2394 % var12 * var10.field4899) / (float) var12);
                    }
                    if (!this.field2469) {
                        var7 = var10.field4901;
                        var8 = var10.field4907;
                        var9 = var10.field4913;
                    }
                    var6 = var10.field4896;
                }
                this.field2381.method5080(var9, var7, arg3, -26, var8, arg2);
                if (!this.field2381.method5078(var6, var5, 98)) {
                    this.method1497(var5, true);
                    this.method1425((byte) 35, var6);
                }
                this.field2528 = this.field2469;
                this.field2531 = arg0;
            }
            ++field2313;
            this.field2416 &= -8;
            if (arg1 > -110) {
                this.method263();
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field2544[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "(IIIIIII)I")
    public final int method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field2215;
            float var8 = (float) arg2 * this.field2423.field9685 + (float) arg0 * this.field2423.field9678 + (float) arg1 * this.field2423.field9705 + this.field2423.field9689;
            float var9 = (float) arg5 * this.field2423.field9685 + (float) arg3 * this.field2423.field9678 + (float) arg4 * this.field2423.field9705 + this.field2423.field9689;
            int var10 = 0;
            if (var8 < (float) this.field2512 && var9 < (float) this.field2512) {
                var10 |= 16;
            } else if ((float) this.field2479 < var8 && (float) this.field2479 < var9) {
                var10 |= 32;
            }
            int var11 = (int) (((float) arg2 * this.field2423.field9683 + (float) arg0 * this.field2423.field9700 + (float) arg1 * this.field2423.field9691 + this.field2423.field9681) * (float) this.field2526 / (float) arg6);
            int var12 = (int) (((float) arg5 * this.field2423.field9683 + (float) arg3 * this.field2423.field9700 + (float) arg4 * this.field2423.field9691 + this.field2423.field9681) * (float) this.field2526 / (float) arg6);
            if ((float) var11 < this.field2484 && (float) var12 < this.field2484) {
                var10 |= 1;
            } else if ((float) var11 > this.field2442 && this.field2442 < (float) var12) {
                var10 |= 2;
            }
            int var13 = (int) (((float) arg2 * this.field2423.field9698 + (float) arg0 * this.field2423.field9675 + (float) arg1 * this.field2423.field9703 + this.field2423.field9680) * (float) this.field2455 / (float) arg6);
            int var14 = (int) (((float) arg5 * this.field2423.field9698 + (float) arg3 * this.field2423.field9675 + (float) arg4 * this.field2423.field9703 + this.field2423.field9680) * (float) this.field2455 / (float) arg6);
            if (this.field2501 > (float) var13 && (float) var14 < this.field2501) {
                var10 |= 4;
            } else if (this.field2477 < (float) var13 && (float) var14 > this.field2477) {
                var10 |= 8;
            }
            return var10;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field2544[152] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V")
    public final void method1492(int arg0, int arg1, byte arg2) {
        try {
            if (this.field2482 == 0) {
                boolean var4 = false;
                if (this.field2505 != arg1) {
                    OpenGL.glTexEnvi(8960, 34161, arg1);
                    var4 = true;
                    this.field2505 = arg1;
                }
                if (~this.field2508 != ~arg0) {
                    OpenGL.glTexEnvi(8960, 34162, arg0);
                    this.field2508 = arg0;
                    var4 = true;
                }
                if (var4) {
                    this.field2416 &= -30;
                }
            } else {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                OpenGL.glTexEnvi(8960, 34162, arg0);
            }
            if (arg2 == 17) {
                ++field2304;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[96] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    public final synchronized void method260(int arg0) {
        try {
            ++field2326;
            int var2 = 0;
            int var14 = arg0 & Integer.MAX_VALUE;
            while (!this.field2410.method3217((byte) 116)) {
                class272 var3 = (class272) this.field2410.method3219(-15);
                class533.field7821[var2++] = (int) var3.field8252;
                this.field2408 -= var3.field4377;
                if (var2 == 1000) {
                    OpenGL.glDeleteBuffersARB(var2, class533.field7821, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteBuffersARB(var2, class533.field7821, 0);
                var2 = 0;
            }
            while (!this.field2411.method3217((byte) -118)) {
                class272 var4 = (class272) this.field2411.method3219(-105);
                class533.field7821[var2++] = (int) var4.field8252;
                this.field2406 -= var4.field4377;
                if (~var2 == -1001) {
                    OpenGL.glDeleteTextures(var2, class533.field7821, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteTextures(var2, class533.field7821, 0);
                var2 = 0;
            }
            while (!this.field2412.method3217((byte) 98)) {
                class272 var5 = (class272) this.field2412.method3219(-29);
                class533.field7821[var2++] = var5.field4377;
                if (var2 == 1000) {
                    OpenGL.glDeleteFramebuffersEXT(var2, class533.field7821, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteFramebuffersEXT(var2, class533.field7821, 0);
                var2 = 0;
            }
            while (!this.field2413.method3217((byte) 127)) {
                class272 var6 = (class272) this.field2413.method3219(-128);
                class533.field7821[var2++] = (int) var6.field8252;
                this.field2407 -= var6.field4377;
                if (var2 == 1000) {
                    OpenGL.glDeleteRenderbuffersEXT(var2, class533.field7821, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class533.field7821, 0);
                boolean var7 = false;
            }
            while (!this.field2409.method3217((byte) -93)) {
                class272 var8 = (class272) this.field2409.method3219(-29);
                OpenGL.glDeleteLists((int) var8.field8252, var8.field4377);
            }
            while (!this.field2414.method3217((byte) 64)) {
                class568 var9 = this.field2414.method3219(-53);
                OpenGL.glDeleteProgramARB((int) var9.field8252);
            }
            while (!this.field2415.method3217((byte) -100)) {
                class568 var10 = this.field2415.method3219(-124);
                OpenGL.glDeleteObjectARB(var10.field8252);
            }
            while (!this.field2409.method3217((byte) 97)) {
                class272 var11 = (class272) this.field2409.method3219(-79);
                OpenGL.glDeleteLists((int) var11.field8252, var11.field4377);
            }
            this.field2365.method5337((byte) 105);
            if (this.method187() > 100663296 && class712.method5167(-2334) > this.field2419 - -60000L) {
                System.gc();
                this.field2419 = class712.method5167(-2334);
            }
            this.field2394 = var14;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field2544[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "()V")
    public final void method222() {
        try {
            ++field2174;
            if (this.field2532) {
                if (this.field2401 != this.field2405) {
                    throw new RuntimeException();
                }
                this.field2405.method4627(0, -20878);
                this.field2405.method4627(8, -20878);
                this.method1502(this.field2405, -124);
            } else {
                if (!this.field2522) {
                    throw new RuntimeException("");
                }
                this.field2402.method8(0, 0, this.field2275, this.field2299, 0, 0);
                this.field2297.setSurface(this.field2359);
            }
            this.field2275 = this.field2307;
            this.field2299 = this.field2248;
            this.field2402 = null;
            this.method1434(-96);
            this.method1445(1);
            this.method227();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[155] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "([I)V")
    public final void method201(int[] arg0) {
        try {
            arg0[1] = this.field2487;
            ++field2368;
            arg0[2] = this.field2456;
            arg0[0] = this.field2475;
            arg0[3] = this.field2464;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[58] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "ra", descriptor = "(IIII)V")
    public final void method259(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2465 = arg0;
            this.field2451 = arg3;
            this.field2441 = arg1;
            ++field2246;
            this.field2439 = arg2;
            this.field2469 = true;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[172] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "(Z)V")
    public final void method265(boolean arg0) {
        try {
            this.field2436 = arg0;
            ++field2369;
            this.method1477(false);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[223] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
    public final synchronized void method1493(int arg0, int arg1, int arg2) {
        try {
            ++field2183;
            class272 var4 = new class272(arg2);
            var4.field8252 = (long) arg0;
            if (arg1 >= -80) {
                this.field2394 = -64;
            }
            this.field2410.method3220(var4, 0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[35] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method243(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        try {
            ++field2207;
            boolean var7 = this.field2440 != arg0;
            if (var7 || this.field2449 != arg1 || this.field2485 != arg2) {
                this.field2485 = arg2;
                this.field2449 = arg1;
                this.field2440 = arg0;
                if (var7) {
                    this.field2448 = (float) (255 & this.field2440) / 255.0F;
                    this.field2476 = (float) (65280 & this.field2440) / 65280.0F;
                    this.field2480 = (float) (this.field2440 & 16711680) / 1.671168E7F;
                    this.method1498((byte) 63);
                }
                this.method1496(5888);
            }
            if (this.field2432[0] != arg3 || this.field2432[1] != arg4 || this.field2432[2] != arg5) {
                this.field2432[2] = arg5;
                this.field2432[1] = arg4;
                this.field2432[0] = arg3;
                this.field2447[0] = -arg3;
                this.field2447[1] = -arg4;
                this.field2447[2] = -arg5;
                float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
                this.field2431[0] = arg3 * var8;
                this.field2431[2] = arg5 * var8;
                this.field2431[1] = arg4 * var8;
                this.field2524[2] = -this.field2431[2];
                this.field2524[0] = -this.field2431[0];
                this.field2524[1] = -this.field2431[1];
                this.method1475((byte) 56);
                this.field2511 = (int) (arg5 * 256.0F / arg4);
                this.field2503 = (int) (arg3 * 256.0F / arg4);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2544[76] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(B)V")
    private final void method1494(byte arg0) {
        try {
            OpenGL.glMatrixMode(5889);
            if (arg0 != -110) {
                this.method1429(76);
            }
            ++field2271;
            OpenGL.glLoadMatrixf(this.field2535, 0);
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[68] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
    public final void method268(int arg0) {
        try {
            this.method1484(68);
            ++field2222;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[148] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(JZ)V")
    public final synchronized void method1495(long arg0, boolean arg1) {
        try {
            if (arg1) {
                ++field2284;
                class568 var4 = new class568();
                var4.field8252 = arg0;
                this.field2415.method3220(var4, 0);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[25] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIIIIZ)Lhk;")
    public final class107 method266(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field2337;
            return new class2(this, arg3, arg4, arg0, arg1, arg2);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2544[171] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method256(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class146 {
        try {
            this.method171(arg2, arg3);
            ++field2292;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[91] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "()I")
    public final int method198() {
        try {
            ++field2318;
            int var1 = this.field2539;
            this.field2539 = 0;
            return var1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[215] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "EA", descriptor = "(IIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2298;
            if (!this.field2469) {
                throw new RuntimeException("");
            } else {
                this.field2465 = arg0;
                this.field2439 = arg2;
                this.field2451 = arg3;
                this.field2441 = arg1;
                if (this.field2528) {
                    this.field2381.field10063.method4123((byte) -124);
                    this.field2381.field10063.method4125(6378);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[221] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()V")
    public final void method194() {
        try {
            ++field2213;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[145] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method210(Canvas arg0) {
        try {
            this.field2359 = 0L;
            ++field2223;
            this.field2172 = null;
            if (arg0 != null && this.field2296 != arg0) {
                if (this.field2240.containsKey(arg0)) {
                    Long var2 = (Long) this.field2240.get(arg0);
                    this.field2359 = var2;
                    this.field2172 = arg0;
                }
            } else {
                this.field2359 = this.field2211;
                this.field2172 = this.field2296;
            }
            if (this.field2172 != null && this.field2359 != 0L) {
                this.field2297.setSurface(this.field2359);
                this.method1429(-68);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[137] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(II)I")
    public final int method151(int arg0, int arg1) {
        try {
            ++field2375;
            return arg1 & arg0 ^ arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[57] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "(I)V")
    private final void method1496(int arg0) {
        try {
            class395.field6270[1] = this.field2476 * this.field2449;
            ++field2379;
            class395.field6270[3] = 1.0F;
            class395.field6270[0] = this.field2480 * this.field2449;
            class395.field6270[2] = this.field2449 * this.field2448;
            OpenGL.glLightfv(16384, 4609, class395.field6270, 0);
            class395.field6270[2] = -this.field2485 * this.field2448;
            if (arg0 == 5888) {
                class395.field6270[3] = 1.0F;
                class395.field6270[1] = -this.field2485 * this.field2476;
                class395.field6270[0] = -this.field2485 * this.field2480;
                OpenGL.glLightfv(16385, 4609, class395.field6270, 0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[158] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lgb;Z)V")
    public final void method1497(class224 arg0, boolean arg1) {
        try {
            ++field2382;
            class224 var3 = this.field2494[this.field2482];
            if (arg0 != var3) {
                if (arg0 != null) {
                    if (var3 != null) {
                        if (~arg0.field3507 != ~var3.field3507) {
                            OpenGL.glDisable(var3.field3507);
                            OpenGL.glEnable(arg0.field3507);
                        }
                    } else {
                        OpenGL.glEnable(arg0.field3507);
                    }
                    OpenGL.glBindTexture(arg0.field3507, arg0.method1973(9728));
                } else {
                    OpenGL.glDisable(var3.field3507);
                }
                this.field2494[this.field2482] = arg0;
            }
            this.field2416 &= -2;
            if (!arg1) {
                this.field2425 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[115] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "()Z")
    public final boolean method176() {
        try {
            ++field2367;
            return this.field2435 && (!this.method167() || this.field2493);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[150] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "JA", descriptor = "(IIIIII)I")
    public final int method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2190;
            int var7 = 0;
            float var8 = (float) arg2 * this.field2423.field9685 + (float) arg0 * this.field2423.field9678 + (float) arg1 * this.field2423.field9705 + this.field2423.field9689;
            if (var8 < 1.0F) {
                var8 = 1.0F;
            }
            float var9 = (float) arg5 * this.field2423.field9685 + (float) arg3 * this.field2423.field9678 + (float) arg4 * this.field2423.field9705 + this.field2423.field9689;
            if (var9 < 1.0F) {
                var9 = 1.0F;
            }
            if ((float) this.field2512 > var8 && (float) this.field2512 > var9) {
                var7 |= 16;
            } else if ((float) this.field2479 < var8 && (float) this.field2479 < var9) {
                var7 |= 32;
            }
            int var10 = (int) (((float) arg2 * this.field2423.field9683 + (float) arg0 * this.field2423.field9700 + (float) arg1 * this.field2423.field9691 + this.field2423.field9681) * (float) this.field2526 / var8);
            int var11 = (int) (((float) arg5 * this.field2423.field9683 + (float) arg3 * this.field2423.field9700 + (float) arg4 * this.field2423.field9691 + this.field2423.field9681) * (float) this.field2526 / var9);
            if ((float) var10 < this.field2484 && this.field2484 > (float) var11) {
                var7 |= 1;
            } else if (this.field2442 < (float) var10 && this.field2442 < (float) var11) {
                var7 |= 2;
            }
            int var12 = (int) (((float) arg2 * this.field2423.field9698 + (float) arg0 * this.field2423.field9675 + (float) arg1 * this.field2423.field9703 + this.field2423.field9680) * (float) this.field2455 / var8);
            int var13 = (int) (((float) arg5 * this.field2423.field9698 + (float) arg3 * this.field2423.field9675 + (float) arg4 * this.field2423.field9703 + this.field2423.field9680) * (float) this.field2455 / var9);
            if (this.field2501 > (float) var12 && this.field2501 > (float) var13) {
                var7 |= 4;
            } else if (this.field2477 < (float) var12 && this.field2477 < (float) var13) {
                var7 |= 8;
            }
            return var7;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field2544[27] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
    private final void method1498(byte arg0) {
        try {
            ++field2320;
            class395.field6270[2] = this.field2461 * this.field2448;
            class395.field6270[3] = 1.0F;
            class395.field6270[1] = this.field2476 * this.field2461;
            class395.field6270[0] = this.field2480 * this.field2461;
            if (arg0 == 63) {
                OpenGL.glLightModelfv(2899, class395.field6270, 0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[107] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V")
    public final void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field2196;
            OpenGL.glLineWidth((float) arg5);
            this.method267(arg0, arg1, arg2, arg3, arg4, arg6);
            OpenGL.glLineWidth(1.0F);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2544[138] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "KA", descriptor = "(IIII)V")
    public final void method221(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (~arg1 > -1) {
                arg1 = 0;
            }
            ++field2175;
            if (~arg2 < ~this.field2275) {
                arg2 = this.field2275;
            }
            if (~this.field2299 > ~arg3) {
                arg3 = this.field2299;
            }
            if (~arg0 > -1) {
                arg0 = 0;
            }
            this.field2464 = arg3;
            this.field2456 = arg2;
            this.field2475 = arg0;
            this.field2487 = arg1;
            OpenGL.glEnable(3089);
            this.method1478(28015);
            this.method1452(true);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[79] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "(I)V")
    public final void method1499(int arg0) {
        try {
            if (~this.field2416 != -9) {
                this.method1433(120);
                this.method1446(true, -32);
                this.method1463(true, 1);
                this.method1489(-19225, true);
                this.method1482(13370, 1);
                this.field2416 = 8;
            }
            ++field2270;
            int var2 = 98 % ((arg0 - 66) / 49);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "(I)V")
    private final void method1500(int arg0) {
        try {
            this.field2494 = new class224[this.field2499];
            ++field2264;
            this.field2462 = new class649(this, 3553, 6408, 1, 1);
            new class649(this, arg0, 6408, 1, 1);
            new class649(this, 3553, 6408, 1, 1);
            this.field2510 = new class407(this);
            this.field2529 = new class407(this);
            this.field2488 = new class407(this);
            this.field2536 = new class407(this);
            this.field2523 = new class407(this);
            this.field2509 = new class407(this);
            this.field2445 = new class407(this);
            this.field2478 = new class407(this);
            this.field2429 = new class407(this);
            this.field2498 = new class407(this);
            if (this.field2532) {
                this.field2525 = new class639(this);
                new class639(this);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[218] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "(III[I)V")
    public final void method229(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field2370;
            float var5 = (float) arg2 * this.field2423.field9685 + (float) arg0 * this.field2423.field9678 + (float) arg1 * this.field2423.field9705 + this.field2423.field9689;
            if (var5 == 0.0F) {
                arg3[0] = arg3[1] = arg3[2] = -1;
            } else {
                int var6 = (int) (((float) arg2 * this.field2423.field9683 + (float) arg0 * this.field2423.field9700 + (float) arg1 * this.field2423.field9691 + this.field2423.field9681) * (float) this.field2526 / var5);
                int var7 = (int) (((float) arg2 * this.field2423.field9698 + (float) arg0 * this.field2423.field9675 + (float) arg1 * this.field2423.field9703 + this.field2423.field9680) * (float) this.field2455 / var5);
                arg3[0] = (int) ((float) var6 - this.field2484);
                arg3[1] = (int) ((float) var7 + -this.field2501);
                arg3[2] = (int) var5;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2544[206] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public final void method147(int arg0) {
        try {
            ++field2315;
            if (arg0 != 1) {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[99] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            ++field2279;
            this.method1438((byte) 82);
            this.method1482(13370, arg12);
            OpenGL.glBegin(4);
            OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
            OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
            OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
            OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
            OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
            OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
            OpenGL.glEnd();
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field2544[220] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "(III)V")
    public final void method237(int arg0, int arg1, int arg2) {
        try {
            ++field2371;
            if (this.field2507 != arg0 || ~this.field2515 != ~arg1 || this.field2428 != arg2) {
                this.field2515 = arg1;
                this.field2428 = arg2;
                this.field2507 = arg0;
                this.method1439(-32359);
                this.method1453((byte) -122);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[53] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "()Z")
    public final boolean method158() {
        try {
            ++field2189;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[61] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfh;B)V")
    public final void method1501(class680 arg0, byte arg1) {
        try {
            OpenGL.glPushMatrix();
            ++field2220;
            if (arg1 == 4) {
                OpenGL.glMultMatrixf(arg0.method4955(arg1 + 318767100), 0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[198] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Ldr;I)V")
    public final void method1502(class753 arg0, int arg1) {
        try {
            ++field2198;
            if (arg1 >= -112) {
                this.field2503 = -68;
            }
            if (this.field2458) {
                this.method1479(arg0, 1);
                this.method1459(false, arg0);
            } else if (~this.field2403 <= -1 && this.field2397[this.field2403] == arg0) {
                this.field2397[this.field2403--] = null;
                arg0.method4634((byte) -40);
                if (this.field2403 < 0) {
                    this.field2404 = this.field2401 = null;
                } else {
                    this.field2404 = this.field2401 = this.field2397[this.field2403];
                    this.field2404.method4632(-23934);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2544[48] + (arg0 != null ? field2544[4] : field2544[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(III)V")
    public final synchronized void method1503(int arg0, int arg1, int arg2) {
        try {
            ++field2194;
            class272 var4 = new class272(arg2);
            var4.field8252 = (long) arg0;
            int var5 = 84 / ((-65 - arg1) / 40);
            this.field2413.method3220(var4, 0);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2544[94] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "DA", descriptor = "(IIII)V")
    public final void method156(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2455 = arg3;
            this.field2521 = arg0;
            this.field2473 = arg1;
            this.field2526 = arg2;
            ++field2345;
            this.method1460(78);
            this.method1478(28015);
            if (this.field2502 != 3) {
                if (~this.field2502 == -3) {
                    this.method1494((byte) -110);
                    return;
                }
            } else {
                this.method1426((byte) -14);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2544[162] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "()V")
    public final void method225() {
        try {
            this.field2372.method3865(1);
            ++field2267;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[50] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZB)V")
    public final void method1504(int arg0, boolean arg1, byte arg2) {
        try {
            if (arg2 != -12) {
                this.field2402 = null;
            }
            ++field2199;
            this.method1491(arg0, (byte) -121, true, arg1);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2544[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "()I")
    public final int method187() {
        try {
            ++field2364;
            return this.field2408 - (-this.field2407 + -this.field2406);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2544[204] + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lsn;)V")
    public final void method191(class659 arg0) {
        try {
            this.field2386.method3335(-1, this, false, arg0);
            ++field2186;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2544[5] + (arg0 != null ? field2544[4] : field2544[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1505(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1506(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
