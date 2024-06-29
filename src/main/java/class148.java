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

@OriginalClass("client!wh")
public class class148 extends class60 {

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field1969 = new Hashtable();

    @OriginalMember(owner = "client!wh", name = "we", descriptor = "I")
    public int field2161 = 128;

    @OriginalMember(owner = "client!wh", name = "pe", descriptor = "Liaa;")
    private class496 field2154 = new class496();

    @OriginalMember(owner = "client!wh", name = "xe", descriptor = "Lou;")
    private class607 field2162 = new class607();

    @OriginalMember(owner = "client!wh", name = "ze", descriptor = "Lou;")
    public class607 field2164 = new class607();

    @OriginalMember(owner = "client!wh", name = "De", descriptor = "I")
    public int field2168 = 8;

    @OriginalMember(owner = "client!wh", name = "Ge", descriptor = "I")
    public int field2171 = 3;

    @OriginalMember(owner = "client!wh", name = "Fe", descriptor = "Z")
    private boolean field2170 = false;

    @OriginalMember(owner = "client!wh", name = "Ae", descriptor = "Lada;")
    private class164 field2165 = new class164();

    @OriginalMember(owner = "client!wh", name = "Ie", descriptor = "[Lqk;")
    private class16[] field2173 = new class16[4];

    @OriginalMember(owner = "client!wh", name = "Je", descriptor = "[Lqk;")
    private class16[] field2174 = new class16[4];

    @OriginalMember(owner = "client!wh", name = "He", descriptor = "I")
    private int field2172 = -1;

    @OriginalMember(owner = "client!wh", name = "Pe", descriptor = "I")
    private int field2180 = -1;

    @OriginalMember(owner = "client!wh", name = "Oe", descriptor = "I")
    private int field2179 = -1;

    @OriginalMember(owner = "client!wh", name = "Me", descriptor = "[Lqk;")
    private class16[] field2177 = new class16[4];

    @OriginalMember(owner = "client!wh", name = "Te", descriptor = "Lada;")
    private class164 field2184;

    @OriginalMember(owner = "client!wh", name = "Ve", descriptor = "Lada;")
    private class164 field2186;

    @OriginalMember(owner = "client!wh", name = "We", descriptor = "Lada;")
    private class164 field2187;

    @OriginalMember(owner = "client!wh", name = "Xe", descriptor = "Lada;")
    private class164 field2188;

    @OriginalMember(owner = "client!wh", name = "Ye", descriptor = "Lada;")
    private class164 field2189;

    @OriginalMember(owner = "client!wh", name = "Ze", descriptor = "Lada;")
    private class164 field2190;

    @OriginalMember(owner = "client!wh", name = "af", descriptor = "Lada;")
    private class164 field2191;

    @OriginalMember(owner = "client!wh", name = "kf", descriptor = "Lou;")
    public class607 field2200;

    @OriginalMember(owner = "client!wh", name = "lf", descriptor = "Lou;")
    public class607 field2201;

    @OriginalMember(owner = "client!wh", name = "mf", descriptor = "Lou;")
    public class607 field2202;

    @OriginalMember(owner = "client!wh", name = "wf", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!wh", name = "zf", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!wh", name = "Cf", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!wh", name = "Bf", descriptor = "F")
    public float field2217;

    @OriginalMember(owner = "client!wh", name = "ng", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!wh", name = "Yf", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!wh", name = "Uf", descriptor = "I")
    private int field2236;

    @OriginalMember(owner = "client!wh", name = "sg", descriptor = "F")
    private float field2260;

    @OriginalMember(owner = "client!wh", name = "fg", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!wh", name = "pg", descriptor = "Z")
    private boolean field2257;

    @OriginalMember(owner = "client!wh", name = "Qf", descriptor = "I")
    public int field2232;

    @OriginalMember(owner = "client!wh", name = "jg", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!wh", name = "tg", descriptor = "I")
    private int field2261;

    @OriginalMember(owner = "client!wh", name = "Ag", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!wh", name = "Kf", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!wh", name = "Gg", descriptor = "[F")
    private float[] field2274;

    @OriginalMember(owner = "client!wh", name = "Lg", descriptor = "F")
    public float field2279;

    @OriginalMember(owner = "client!wh", name = "qf", descriptor = "[F")
    private float[] field2206;

    @OriginalMember(owner = "client!wh", name = "Wg", descriptor = "F")
    private float field2290;

    @OriginalMember(owner = "client!wh", name = "Bg", descriptor = "[F")
    public float[] field2269;

    @OriginalMember(owner = "client!wh", name = "Wf", descriptor = "I")
    private int field2238;

    @OriginalMember(owner = "client!wh", name = "Mf", descriptor = "I")
    private int field2228;

    @OriginalMember(owner = "client!wh", name = "dh", descriptor = "F")
    public float field2297;

    @OriginalMember(owner = "client!wh", name = "Xg", descriptor = "F")
    private float field2291;

    @OriginalMember(owner = "client!wh", name = "Yg", descriptor = "I")
    private int field2292;

    @OriginalMember(owner = "client!wh", name = "Af", descriptor = "F")
    private float field2216;

    @OriginalMember(owner = "client!wh", name = "Gf", descriptor = "F")
    public float field2222;

    @OriginalMember(owner = "client!wh", name = "mh", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!wh", name = "Ng", descriptor = "I")
    private int field2281;

    @OriginalMember(owner = "client!wh", name = "ch", descriptor = "I")
    private int field2296;

    @OriginalMember(owner = "client!wh", name = "Jg", descriptor = "F")
    public float field2277;

    @OriginalMember(owner = "client!wh", name = "vg", descriptor = "[Lraa;")
    private class609[] field2263;

    @OriginalMember(owner = "client!wh", name = "Hg", descriptor = "[F")
    private float[] field2275;

    @OriginalMember(owner = "client!wh", name = "Rf", descriptor = "Z")
    private boolean field2233;

    @OriginalMember(owner = "client!wh", name = "lg", descriptor = "F")
    public float field2253;

    @OriginalMember(owner = "client!wh", name = "qh", descriptor = "F")
    private float field2310;

    @OriginalMember(owner = "client!wh", name = "Mg", descriptor = "I")
    public int field2280;

    @OriginalMember(owner = "client!wh", name = "Rg", descriptor = "F")
    public float field2285;

    @OriginalMember(owner = "client!wh", name = "sh", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!wh", name = "Ig", descriptor = "I")
    private int field2276;

    @OriginalMember(owner = "client!wh", name = "rh", descriptor = "[F")
    private float[] field2311;

    @OriginalMember(owner = "client!wh", name = "th", descriptor = "Lsea;")
    public class699 field2313;

    @OriginalMember(owner = "client!wh", name = "uh", descriptor = "[I")
    public int[] field2314;

    @OriginalMember(owner = "client!wh", name = "yh", descriptor = "[B")
    public byte[] field2318;

    @OriginalMember(owner = "client!wh", name = "wh", descriptor = "[I")
    public int[] field2316;

    @OriginalMember(owner = "client!wh", name = "zh", descriptor = "[I")
    public int[] field2319;

    @OriginalMember(owner = "client!wh", name = "te", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!wh", name = "Xd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2136;

    @OriginalMember(owner = "client!wh", name = "wb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2005;

    @OriginalMember(owner = "client!wh", name = "pd", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2102;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "J")
    private long field1984;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "J")
    private long field1955;

    @OriginalMember(owner = "client!wh", name = "vf", descriptor = "Z")
    public boolean field2211;

    @OriginalMember(owner = "client!wh", name = "xg", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!wh", name = "Sf", descriptor = "Ljava/lang/String;")
    private String field2234;

    @OriginalMember(owner = "client!wh", name = "ph", descriptor = "Z")
    private boolean field2309;

    @OriginalMember(owner = "client!wh", name = "lh", descriptor = "Z")
    public boolean field2305;

    @OriginalMember(owner = "client!wh", name = "nh", descriptor = "Z")
    public boolean field2307;

    @OriginalMember(owner = "client!wh", name = "wg", descriptor = "Z")
    public boolean field2264;

    @OriginalMember(owner = "client!wh", name = "cg", descriptor = "Z")
    public boolean field2244;

    @OriginalMember(owner = "client!wh", name = "fh", descriptor = "Z")
    private boolean field2299;

    @OriginalMember(owner = "client!wh", name = "nf", descriptor = "Ljava/lang/String;")
    private String field2203;

    @OriginalMember(owner = "client!wh", name = "pf", descriptor = "Z")
    public boolean field2205;

    @OriginalMember(owner = "client!wh", name = "Pf", descriptor = "Z")
    private boolean field2231;

    @OriginalMember(owner = "client!wh", name = "le", descriptor = "Lbr;")
    private class395 field2150;

    @OriginalMember(owner = "client!wh", name = "Ee", descriptor = "Ldja;")
    public class309 field2169;

    @OriginalMember(owner = "client!wh", name = "re", descriptor = "Lhk;")
    private class103 field2156;

    @OriginalMember(owner = "client!wh", name = "oe", descriptor = "Lida;")
    private class237 field2153;

    @OriginalMember(owner = "client!wh", name = "ne", descriptor = "Ltd;")
    private class455 field2152;

    @OriginalMember(owner = "client!wh", name = "tf", descriptor = "F")
    private float field2209;

    @OriginalMember(owner = "client!wh", name = "Hf", descriptor = "F")
    private float field2223;

    @OriginalMember(owner = "client!wh", name = "Vf", descriptor = "F")
    public float field2237;

    @OriginalMember(owner = "client!wh", name = "ig", descriptor = "F")
    public float field2250;

    @OriginalMember(owner = "client!wh", name = "og", descriptor = "F")
    private float field2256;

    @OriginalMember(owner = "client!wh", name = "rg", descriptor = "F")
    public float field2259;

    @OriginalMember(owner = "client!wh", name = "Og", descriptor = "F")
    public float field2282;

    @OriginalMember(owner = "client!wh", name = "Qg", descriptor = "F")
    public float field2284;

    @OriginalMember(owner = "client!wh", name = "oh", descriptor = "F")
    public float field2308;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!wh", name = "eb", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!wh", name = "fb", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!wh", name = "gb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!wh", name = "hb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!wh", name = "kb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!wh", name = "lb", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!wh", name = "mb", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!wh", name = "nb", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!wh", name = "ob", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!wh", name = "pb", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!wh", name = "qb", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!wh", name = "rb", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!wh", name = "sb", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!wh", name = "tb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!wh", name = "ub", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!wh", name = "vb", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!wh", name = "xb", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!wh", name = "yb", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!wh", name = "zb", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!wh", name = "Ab", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!wh", name = "Bb", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!wh", name = "Cb", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!wh", name = "Db", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!wh", name = "Eb", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!wh", name = "Fb", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!wh", name = "Gb", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!wh", name = "Hb", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!wh", name = "Ib", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!wh", name = "Jb", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!wh", name = "Kb", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!wh", name = "Lb", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!wh", name = "Mb", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!wh", name = "Nb", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!wh", name = "Ob", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!wh", name = "Pb", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!wh", name = "Qb", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!wh", name = "Rb", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!wh", name = "Sb", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!wh", name = "Tb", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!wh", name = "Ub", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!wh", name = "Vb", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!wh", name = "Wb", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!wh", name = "Xb", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!wh", name = "Yb", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!wh", name = "Zb", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!wh", name = "ac", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!wh", name = "bc", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!wh", name = "cc", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!wh", name = "dc", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!wh", name = "ec", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!wh", name = "fc", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!wh", name = "gc", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!wh", name = "hc", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!wh", name = "ic", descriptor = "I")
    private int field2043;

    @OriginalMember(owner = "client!wh", name = "jc", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!wh", name = "kc", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!wh", name = "lc", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!wh", name = "mc", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!wh", name = "nc", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!wh", name = "oc", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!wh", name = "pc", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!wh", name = "qc", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!wh", name = "rc", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!wh", name = "sc", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!wh", name = "tc", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!wh", name = "uc", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!wh", name = "vc", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!wh", name = "wc", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!wh", name = "xc", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!wh", name = "yc", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!wh", name = "zc", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!wh", name = "Ac", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!wh", name = "Bc", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!wh", name = "Cc", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!wh", name = "Dc", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!wh", name = "Ec", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!wh", name = "Fc", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!wh", name = "Gc", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!wh", name = "Hc", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!wh", name = "Ic", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!wh", name = "Jc", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!wh", name = "Kc", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!wh", name = "Lc", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!wh", name = "Mc", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!wh", name = "Nc", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!wh", name = "Oc", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!wh", name = "Pc", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!wh", name = "Qc", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!wh", name = "Rc", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!wh", name = "Sc", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!wh", name = "Tc", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!wh", name = "Uc", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!wh", name = "Vc", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!wh", name = "Wc", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!wh", name = "Xc", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!wh", name = "Yc", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!wh", name = "Zc", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!wh", name = "ad", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!wh", name = "bd", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!wh", name = "cd", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!wh", name = "dd", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!wh", name = "ed", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!wh", name = "fd", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!wh", name = "gd", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!wh", name = "hd", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!wh", name = "id", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!wh", name = "jd", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!wh", name = "kd", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!wh", name = "ld", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!wh", name = "md", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!wh", name = "nd", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!wh", name = "od", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!wh", name = "qd", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!wh", name = "rd", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!wh", name = "sd", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!wh", name = "td", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!wh", name = "ud", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!wh", name = "vd", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!wh", name = "wd", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!wh", name = "xd", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!wh", name = "yd", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!wh", name = "zd", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!wh", name = "Ad", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!wh", name = "Bd", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!wh", name = "Cd", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!wh", name = "Dd", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!wh", name = "Ed", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!wh", name = "Fd", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!wh", name = "Gd", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!wh", name = "Hd", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!wh", name = "Id", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!wh", name = "Jd", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!wh", name = "Kd", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!wh", name = "Ld", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!wh", name = "Md", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!wh", name = "Nd", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!wh", name = "Od", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!wh", name = "Pd", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!wh", name = "Qd", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!wh", name = "Rd", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!wh", name = "Sd", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!wh", name = "Td", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!wh", name = "Ud", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!wh", name = "Vd", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!wh", name = "Wd", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!wh", name = "Yd", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!wh", name = "Zd", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!wh", name = "ae", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!wh", name = "be", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!wh", name = "ce", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!wh", name = "de", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!wh", name = "ee", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!wh", name = "fe", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!wh", name = "ge", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!wh", name = "he", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!wh", name = "ie", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!wh", name = "je", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!wh", name = "ke", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!wh", name = "me", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!wh", name = "qe", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!wh", name = "se", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!wh", name = "ue", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!wh", name = "ve", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!wh", name = "ye", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!wh", name = "Ce", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!wh", name = "Re", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!wh", name = "Se", descriptor = "I")
    private int field2183;

    @OriginalMember(owner = "client!wh", name = "Ue", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!wh", name = "bf", descriptor = "I")
    private int field2192;

    @OriginalMember(owner = "client!wh", name = "cf", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!wh", name = "ff", descriptor = "I")
    private int field2196;

    @OriginalMember(owner = "client!wh", name = "uf", descriptor = "I")
    private int field2210;

    @OriginalMember(owner = "client!wh", name = "yf", descriptor = "I")
    private int field2214;

    @OriginalMember(owner = "client!wh", name = "If", descriptor = "I")
    private int field2224;

    @OriginalMember(owner = "client!wh", name = "Lf", descriptor = "I")
    private int field2227;

    @OriginalMember(owner = "client!wh", name = "Nf", descriptor = "I")
    private int field2229;

    @OriginalMember(owner = "client!wh", name = "Of", descriptor = "I")
    public int field2230;

    @OriginalMember(owner = "client!wh", name = "Xf", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!wh", name = "bg", descriptor = "I")
    private int field2243;

    @OriginalMember(owner = "client!wh", name = "kg", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!wh", name = "Sg", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!wh", name = "Ug", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!wh", name = "ah", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!wh", name = "vh", descriptor = "I")
    private int field2315;

    @OriginalMember(owner = "client!wh", name = "xh", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!wh", name = "df", descriptor = "J")
    private long field2194;

    @OriginalMember(owner = "client!wh", name = "Ef", descriptor = "Las;")
    public class153 field2220;

    @OriginalMember(owner = "client!wh", name = "Ff", descriptor = "Las;")
    public class153 field2221;

    @OriginalMember(owner = "client!wh", name = "Jf", descriptor = "Las;")
    public class153 field2225;

    @OriginalMember(owner = "client!wh", name = "Zf", descriptor = "Las;")
    public class153 field2241;

    @OriginalMember(owner = "client!wh", name = "ag", descriptor = "Las;")
    public class153 field2242;

    @OriginalMember(owner = "client!wh", name = "eg", descriptor = "Las;")
    public class153 field2246;

    @OriginalMember(owner = "client!wh", name = "Pg", descriptor = "Las;")
    public class153 field2283;

    @OriginalMember(owner = "client!wh", name = "Zg", descriptor = "Las;")
    public class153 field2293;

    @OriginalMember(owner = "client!wh", name = "ih", descriptor = "Las;")
    public class153 field2302;

    @OriginalMember(owner = "client!wh", name = "jh", descriptor = "Las;")
    public class153 field2303;

    @OriginalMember(owner = "client!wh", name = "Le", descriptor = "Lqk;")
    private class16 field2176;

    @OriginalMember(owner = "client!wh", name = "Qe", descriptor = "Lqk;")
    private class16 field2181;

    @OriginalMember(owner = "client!wh", name = "dg", descriptor = "Lcl;")
    public class268 field2245;

    @OriginalMember(owner = "client!wh", name = "Eg", descriptor = "Lcl;")
    public class268 field2272;

    @OriginalMember(owner = "client!wh", name = "Ne", descriptor = "Liha;")
    private class30 field2178;

    @OriginalMember(owner = "client!wh", name = "rf", descriptor = "Liha;")
    public class30 field2207;

    @OriginalMember(owner = "client!wh", name = "ug", descriptor = "Lnm;")
    private class474 field2262;

    @OriginalMember(owner = "client!wh", name = "Ke", descriptor = "Lko;")
    private class506 field2175;

    @OriginalMember(owner = "client!wh", name = "of", descriptor = "Liba;")
    private class531 field2204;

    @OriginalMember(owner = "client!wh", name = "Kg", descriptor = "Lgh;")
    private class550 field2278;

    @OriginalMember(owner = "client!wh", name = "gg", descriptor = "Lwia;")
    private class761 field2248;

    @OriginalMember(owner = "client!wh", name = "Vg", descriptor = "Lwia;")
    private class761 field2289;

    @OriginalMember(owner = "client!wh", name = "Df", descriptor = "Law;")
    public class76 field2219;

    @OriginalMember(owner = "client!wh", name = "Be", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2166;

    @OriginalMember(owner = "client!wh", name = "ef", descriptor = "Z")
    private boolean field2195;

    @OriginalMember(owner = "client!wh", name = "gf", descriptor = "Z")
    private boolean field2197;

    @OriginalMember(owner = "client!wh", name = "hf", descriptor = "Z")
    private boolean field2198;

    @OriginalMember(owner = "client!wh", name = "jf", descriptor = "Z")
    private boolean field2199;

    @OriginalMember(owner = "client!wh", name = "sf", descriptor = "Z")
    private boolean field2208;

    @OriginalMember(owner = "client!wh", name = "xf", descriptor = "Z")
    public boolean field2213;

    @OriginalMember(owner = "client!wh", name = "Tf", descriptor = "Z")
    public boolean field2235;

    @OriginalMember(owner = "client!wh", name = "hg", descriptor = "Z")
    public boolean field2249;

    @OriginalMember(owner = "client!wh", name = "mg", descriptor = "Z")
    public boolean field2254;

    @OriginalMember(owner = "client!wh", name = "qg", descriptor = "Z")
    public boolean field2258;

    @OriginalMember(owner = "client!wh", name = "yg", descriptor = "Z")
    private boolean field2266;

    @OriginalMember(owner = "client!wh", name = "Cg", descriptor = "Z")
    private boolean field2270;

    @OriginalMember(owner = "client!wh", name = "Dg", descriptor = "Z")
    private boolean field2271;

    @OriginalMember(owner = "client!wh", name = "Fg", descriptor = "Z")
    public boolean field2273;

    @OriginalMember(owner = "client!wh", name = "Tg", descriptor = "Z")
    private boolean field2287;

    @OriginalMember(owner = "client!wh", name = "bh", descriptor = "Z")
    private boolean field2295;

    @OriginalMember(owner = "client!wh", name = "eh", descriptor = "Z")
    private boolean field2298;

    @OriginalMember(owner = "client!wh", name = "gh", descriptor = "Z")
    public boolean field2300;

    @OriginalMember(owner = "client!wh", name = "hh", descriptor = "Z")
    public boolean field2301;

    @OriginalMember(owner = "client!wh", name = "kh", descriptor = "Z")
    public boolean field2304;

    @OriginalMember(owner = "client!wh", name = "zg", descriptor = "[Lme;")
    private class195[] field2267;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "()V")
    public final void method533() {
        ++field1967;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public final void method1020(int arg0) {
        ++field2139;
        int var2 = -51 % ((-29 - arg0) / 48);
        OpenGL.glLightfv(16384, 4611, this.field2269, 0);
        OpenGL.glLightfv(16385, 4611, this.field2275, 0);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lfg;Z)Lpga;")
    public final class536 method422(class129 arg0, boolean arg1) {
        ++field2134;
        int[] var3 = new int[arg0.field1739 * arg0.field1734];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1736 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field1739; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field1734; ++var7) {
                    int var8 = arg0.field1732[255 & arg0.field1738[var4++]];
                    var3[var5++] = var8 == 0 ? 0 : class625.method3600(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; var9 < arg0.field1739; ++var9) {
                for (int var11 = 0; ~var11 > ~arg0.field1734; ++var11) {
                    var3[var5++] = class625.method3600(arg0.field1736[var4] << 24, arg0.field1732[class493.method2943(arg0.field1738[var4], 255)]);
                    ++var4;
                }
            }
        }
        class536 var10 = this.method531(arg0.field1739, arg0.field1734, var3, arg0.field1734, 0, (byte) -101);
        var10.method1505(arg0.field1735, arg0.field1737, arg0.field1731, arg0.field1733);
        return var10;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
    public final void method1021(int arg0, boolean arg1) {
        ++field2155;
        if (arg0 == 1) {
            if (!this.field2199 != !arg1) {
                if (!arg1) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field2193 &= -32;
                this.field2199 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "(I)V")
    private final void method1022(int arg0) {
        ++field2133;
        int var2 = -64 % ((64 - arg0) / 50);
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field2201.method3520((byte) -120), 0);
        if (this.field2257) {
            this.field2152.field6712.method604(-124);
        }
        this.method1020(34);
        this.method1033((byte) -120);
    }

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "(I)V")
    private final void method1023(int arg0) {
        if (~this.field2229 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field1991 > 0 && ~this.field2007 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field1991, (double) this.field2007, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field2193 &= -25;
            this.field2229 = 1;
        }
        ++field2034;
        if (arg0 <= 120) {
            this.field2272 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
    public final void method1024(int arg0, byte arg1) {
        ++field2064;
        if (arg1 != -11) {
            this.method435(1, (class488) null, -103, -53);
        }
        if (~this.field2227 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field2227 = arg0;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lgh;I)V")
    public final void method1025(class550 arg0, int arg1) {
        ++field2001;
        if (this.field2278 != arg0) {
            if (this.field2309) {
                OpenGL.glBindBufferARB(34963, arg0.method3211(104));
            }
            this.field2278 = arg0;
        }
        if (arg1 < 113) {
            this.field2278 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lpk;)V")
    public final void method452(class198 arg0) {
        ++field2071;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method510(Canvas arg0) {
        ++field2151;
        if (this.field2136 == arg0) {
            throw new RuntimeException();
        } else if (this.field1969.containsKey(arg0)) {
            Long var2 = (Long) this.field1969.get(arg0);
            this.field2102.releaseSurface(arg0, var2);
            this.field1969.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "(IIIIIII)I")
    public final int method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2113;
        float var8 = (float) arg2 * this.field2200.field8581 + (float) arg0 * this.field2200.field8583 + (float) arg1 * this.field2200.field8567 + this.field2200.field8563;
        float var9 = (float) arg5 * this.field2200.field8581 + (float) arg3 * this.field2200.field8583 + (float) arg4 * this.field2200.field8567 + this.field2200.field8563;
        int var10 = 0;
        if ((float) this.field2306 > var8 && (float) this.field2306 > var9) {
            var10 |= 16;
        } else if ((float) this.field2228 < var8 && (float) this.field2228 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field2200.field8591 + (float) arg0 * this.field2200.field8562 + (float) arg1 * this.field2200.field8572 + this.field2200.field8575) * (float) this.field2247 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field2200.field8591 + (float) arg3 * this.field2200.field8562 + (float) arg4 * this.field2200.field8572 + this.field2200.field8575) * (float) this.field2247 / (float) arg6);
        if (this.field2282 > (float) var11 && this.field2282 > (float) var12) {
            var10 |= 1;
        } else if ((float) var11 > this.field2284 && this.field2284 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field2200.field8558 + (float) arg0 * this.field2200.field8578 + (float) arg1 * this.field2200.field8564 + this.field2200.field8590) * (float) this.field2251 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field2200.field8558 + (float) arg3 * this.field2200.field8578 + (float) arg4 * this.field2200.field8564 + this.field2200.field8590) * (float) this.field2251 / (float) arg6);
        if ((float) var13 < this.field2308 && (float) var14 < this.field2308) {
            var10 |= 4;
        } else if ((float) var13 > this.field2250 && this.field2250 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZ)Lpga;")
    public final class536 method493(int arg0, int arg1, boolean arg2) {
        ++field2048;
        return new class506(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZZ)V")
    public final void method1026(boolean arg0, boolean arg1) {
        if (!arg0 == this.field2295) {
            this.field2295 = arg0;
            this.method1092((byte) 115);
            this.field2193 &= -32;
        }
        ++field1958;
        if (!arg1) {
            this.field2255 = -46;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(ZZ)V")
    public final void method1027(boolean arg0, boolean arg1) {
        ++field2087;
        if (this.field2195 != arg0) {
            this.field2195 = arg0;
            this.method1100(true);
            this.field2193 &= -32;
        }
        if (!arg1) {
            this.method460(34, -1.3561468F, 0.32052094F, -0.42782164F, 0.051377643F, -0.5924743F);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILng;)V")
    public static final void method1028(int arg0, int arg1, int arg2, class343 arg3) {
        class186 var4 = class467.method2834(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field2844 = arg3;
            int var5 = class582.field8287 == class46.field568 ? 1 : 0;
            if (arg3.method320((byte) 84)) {
                if (arg3.method329((byte) -109)) {
                    arg3.field8431 = class614.field8664[var5];
                    class614.field8664[var5] = arg3;
                    return;
                }
                arg3.field8431 = class577.field8153[var5];
                class577.field8153[var5] = arg3;
                class226.field3323 = true;
                return;
            }
            arg3.field8431 = class374.field5677[var5];
            class374.field5677[var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "(I)V")
    private final void method1029(int arg0) {
        this.field2284 = (float) (this.field2236 - this.field2280);
        ++field2094;
        this.field2282 = (float) (-this.field2280 + this.field2281);
        this.field2308 = (float) (-this.field2232 + this.field2215);
        if (arg0 != -24730) {
            this.field2301 = true;
        }
        this.field2250 = (float) (this.field2218 - this.field2232);
    }

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "()Z")
    public final boolean method496() {
        ++field1980;
        return false;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
    public final void method1030(boolean arg0, int arg1) {
        if (this.field2270 != arg0) {
            this.field2270 = arg0;
            this.method1095(24);
        }
        ++field1970;
        if (arg1 != -12341) {
            this.field2233 = false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lqk;I)V")
    public final void method1031(class16 arg0, int arg1) {
        ++field2109;
        if (~this.field2180 <= -1 && this.field2174[this.field2180] == arg0) {
            this.field2174[this.field2180--] = null;
            arg0.method98(4197);
            if (~this.field2180 <= -1) {
                this.field2176 = this.field2174[this.field2180];
                this.field2176.method102((byte) -121);
            } else {
                this.field2176 = null;
            }
            if (arg1 != 962) {
                this.method430(122, -4);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "JA", descriptor = "(IIIIII)I")
    public final int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2140;
        int var7 = 0;
        float var8 = (float) arg2 * this.field2200.field8581 + (float) arg0 * this.field2200.field8583 + (float) arg1 * this.field2200.field8567 + this.field2200.field8563;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field2200.field8581 + (float) arg3 * this.field2200.field8583 + (float) arg4 * this.field2200.field8567 + this.field2200.field8563;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field2306 > var8 && (float) this.field2306 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field2228 && (float) this.field2228 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field2200.field8591 + (float) arg0 * this.field2200.field8562 + (float) arg1 * this.field2200.field8572 + this.field2200.field8575) * (float) this.field2247 / var8);
        int var11 = (int) (((float) arg5 * this.field2200.field8591 + (float) arg3 * this.field2200.field8562 + (float) arg4 * this.field2200.field8572 + this.field2200.field8575) * (float) this.field2247 / var9);
        if ((float) var10 < this.field2282 && (float) var11 < this.field2282) {
            var7 |= 1;
        } else if (this.field2284 < (float) var10 && this.field2284 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field2200.field8558 + (float) arg0 * this.field2200.field8578 + (float) arg1 * this.field2200.field8564 + this.field2200.field8590) * (float) this.field2251 / var8);
        int var13 = (int) (((float) arg5 * this.field2200.field8558 + (float) arg3 * this.field2200.field8578 + (float) arg4 * this.field2200.field8564 + this.field2200.field8590) * (float) this.field2251 / var9);
        if ((float) var12 < this.field2308 && (float) var13 < this.field2308) {
            var7 |= 4;
        } else if ((float) var12 > this.field2250 && (float) var13 > this.field2250) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8) {
        ++field1982;
        class178 var10 = (class178) arg6;
        class531 var11 = var10.field2754;
        this.method1067(-2);
        this.method1088(var10.field2754, -27749);
        this.method1039(false, arg5);
        this.method1043((byte) 95, 8448, 7681);
        this.method1052(34167, 34176, 0, 768);
        float var12 = var11.field7564 / (float) var11.field7561;
        float var13 = var11.field7568 / (float) var11.field7569;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method1052(5890, 34176, 0, 768);
    }

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "()Z")
    public final boolean method540() {
        ++field2068;
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1954;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            class178 var13 = (class178) arg6;
            class531 var14 = var13.field2754;
            this.method1067(-2);
            this.method1088(var13.field2754, -27749);
            this.method1039(false, arg5);
            this.method1043((byte) -76, 8448, 7681);
            this.method1052(34167, 34176, 0, 768);
            float var15 = var14.field7564 / (float) var14.field7561;
            float var16 = var14.field7568 / (float) var14.field7569;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg9 + arg10);
            float var21 = var17 * var19;
            float var22 = var18 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var23 = (float) arg9 * var21;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (var20 > arg9) {
                var26 = (float) (arg9 - (-arg10 - -var20)) * var22;
                var25 = (float) (arg9 + arg10 + -var20) * var21;
            } else {
                var28 = (float) (-var20 + arg9) * var22;
                var27 = (float) (arg9 - var20) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var21;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (arg2 > arg0) {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if (var29 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var29 += var27 + var31;
                var30 += var28 + var32;
                var28 = var24;
                var27 = var23;
            }
            this.method1052(5890, 34176, 0, 768);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()Lkaa;")
    public final class48 method432() {
        ++field2018;
        int var1 = -1;
        if (this.field2203.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (~this.field2203.indexOf("intel") != 0) {
            var1 = 32902;
        } else if (this.field2203.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class48(var1, "OpenGL", this.field2288, this.field2234, 0L);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIZZ)V")
    public final void method1032(byte arg0, int arg1, boolean arg2, boolean arg3) {
        ++field2130;
        if (this.field2210 != arg1 || this.field2257 != this.field2235) {
            class76 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field2235 ? 3 : 0;
            if (arg1 < 0) {
                this.method1062((byte) -83);
            } else {
                var5 = this.field2150.method2525(arg1, true);
                class293 var10 = super.field849.method1124((byte) -125, arg1);
                if (var10.field4188 == 0 && ~var10.field4171 == -1) {
                    this.method1062((byte) -65);
                } else {
                    int var11 = var10.field4174 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method1035(5890, (float) (this.field2167 % var12 * var10.field4171) / (float) var12, (float) (this.field2167 % var12 * var10.field4188) / (float) var12, 0.0F);
                }
                if (!this.field2235) {
                    var7 = var10.field4176;
                    var9 = var10.field4185;
                    var8 = var10.field4172;
                }
                var6 = var10.field4182;
            }
            this.field2152.method2787(var7, arg3, arg2, (byte) -122, var8, var9);
            if (!this.field2152.method2785(var5, 0, var6)) {
                this.method1088(var5, -27749);
                this.method1066(var6, 260);
            }
            this.field2210 = arg1;
            this.field2257 = this.field2235;
        }
        if (arg0 > 0) {
            this.method433();
        }
        this.field2193 &= -8;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
    public final void method462(int arg0, int arg1) throws class566 {
        ++field2016;
        try {
            this.field2102.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "()I")
    public final int method457() {
        ++field2040;
        return this.field2306;
    }

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "()Z")
    public final boolean method456() {
        ++field2036;
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    private final void method1033(byte arg0) {
        if (arg0 > -45) {
            this.method467(true);
        }
        ++field2143;
        int var2;
        for (var2 = 0; ~this.field2224 < ~var2; ++var2) {
            class609 var3 = this.field2263[var2];
            class87.field1244[0] = (float) var3.method3533(false);
            int var4 = var2 + 16386;
            class87.field1244[1] = (float) var3.method3536(24108);
            class87.field1244[2] = (float) var3.method3531(20597);
            class87.field1244[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class87.field1244, 0);
            int var5 = var3.method3534(52);
            float var6 = var3.method3535((byte) -41) / 255.0F;
            class87.field1244[0] = (float) (class493.method2943(16716591, var5) >> 16) * var6;
            class87.field1244[2] = var6 * (float) class493.method2943(var5, 255);
            class87.field1244[1] = (float) class493.method2943(255, var5 >> 8) * var6;
            OpenGL.glLightfv(var4, 4609, class87.field1244, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3537(6490) * var3.method3537(6490)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field2243) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field2243 = this.field2224;
    }

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "()Z")
    public final boolean method459() {
        ++field2106;
        return false;
    }

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "(III[I)V")
    public final void method421(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2096;
        float var5 = (float) arg2 * this.field2200.field8581 + (float) arg0 * this.field2200.field8583 + (float) arg1 * this.field2200.field8567 + this.field2200.field8563;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field2200.field8591 + (float) arg0 * this.field2200.field8562 + (float) arg1 * this.field2200.field8572 + this.field2200.field8575) * (float) this.field2247 / var5);
            arg3[0] = (int) ((float) var6 + -this.field2282);
            int var7 = (int) (((float) arg2 * this.field2200.field8558 + (float) arg0 * this.field2200.field8578 + (float) arg1 * this.field2200.field8564 + this.field2200.field8590) * (float) this.field2251 / var5);
            arg3[1] = (int) ((float) var7 + -this.field2308);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method446(Canvas arg0) {
        this.field2005 = null;
        ++field2042;
        this.field1955 = 0L;
        if (arg0 != null && this.field2136 != arg0) {
            if (this.field1969.containsKey(arg0)) {
                Long var2 = (Long) this.field1969.get(arg0);
                this.field1955 = var2;
                this.field2005 = arg0;
            }
        } else {
            this.field1955 = this.field1984;
            this.field2005 = this.field2136;
        }
        if (this.field2005 != null && ~this.field1955 != -1L) {
            this.field2102.setSurface(this.field1955);
            this.method1041(4047);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "()Lql;")
    public final class738 method442() {
        ++field1976;
        return this.field2162;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "()Z")
    public final boolean method441() {
        ++field2137;
        return this.field2153 != null && this.field2153.method1416(0);
    }

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "(I)V")
    private final void method1034(int arg0) {
        this.field2267 = new class195[this.field2239];
        ++field2104;
        this.field2219 = new class76(this, 3553, 6408, 1, 1);
        if (arg0 == 6609) {
            new class76(this, 3553, 6408, 1, 1);
            new class76(this, 3553, 6408, 1, 1);
            this.field2241 = new class153(this);
            this.field2283 = new class153(this);
            this.field2293 = new class153(this);
            this.field2221 = new class153(this);
            this.field2225 = new class153(this);
            this.field2303 = new class153(this);
            this.field2242 = new class153(this);
            this.field2302 = new class153(this);
            this.field2220 = new class153(this);
            this.field2246 = new class153(this);
            if (this.field2205) {
                this.field2207 = new class30(this);
                new class30(this);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IFFF)V")
    private final void method1035(int arg0, float arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(arg0);
        ++field2013;
        if (this.field2271) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg1, arg3);
        OpenGL.glMatrixMode(5888);
        this.field2271 = true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lza;)V")
    public final void method445(class415 arg0) {
        this.field2166 = ((class42) arg0).field461;
        ++field2120;
        if (this.field2289 == null) {
            class699 var2 = new class699(80);
            if (this.field2211) {
                var2.method3968(724, -1.0F);
                var2.method3968(724, -1.0F);
                var2.method3968(724, 0.0F);
                var2.method3968(724, 0.0F);
                var2.method3968(724, 1.0F);
                var2.method3968(724, 1.0F);
                var2.method3968(724, -1.0F);
                var2.method3968(724, 0.0F);
                var2.method3968(724, 1.0F);
                var2.method3968(724, 1.0F);
                var2.method3968(724, 1.0F);
                var2.method3968(724, 1.0F);
                var2.method3968(724, 0.0F);
                var2.method3968(724, 1.0F);
                var2.method3968(724, 0.0F);
                var2.method3968(724, -1.0F);
                var2.method3968(724, 1.0F);
                var2.method3968(724, 0.0F);
                var2.method3968(724, 0.0F);
                var2.method3968(724, 0.0F);
            } else {
                var2.method3967((byte) 38, -1.0F);
                var2.method3967((byte) 38, -1.0F);
                var2.method3967((byte) 38, 0.0F);
                var2.method3967((byte) 38, 0.0F);
                var2.method3967((byte) 38, 1.0F);
                var2.method3967((byte) 38, 1.0F);
                var2.method3967((byte) 38, -1.0F);
                var2.method3967((byte) 38, 0.0F);
                var2.method3967((byte) 38, 1.0F);
                var2.method3967((byte) 38, 1.0F);
                var2.method3967((byte) 38, 1.0F);
                var2.method3967((byte) 38, 1.0F);
                var2.method3967((byte) 38, 0.0F);
                var2.method3967((byte) 38, 1.0F);
                var2.method3967((byte) 38, 0.0F);
                var2.method3967((byte) 38, -1.0F);
                var2.method3967((byte) 38, 1.0F);
                var2.method3967((byte) 38, 0.0F);
                var2.method3967((byte) 38, 0.0F);
                var2.method3967((byte) 38, 0.0F);
            }
            this.field2289 = this.method1046(false, 770, var2.field9068, var2.field9084, 20);
            this.field2245 = new class268(this.field2289, 5126, 3, 0);
            this.field2272 = new class268(this.field2289, 5126, 2, 12);
            this.field2154.method2948(this, -6924);
        }
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(II)V")
    public final synchronized void method1036(int arg0, int arg1) {
        ++field1979;
        class184 var3 = new class184();
        if (arg1 != 1) {
            this.field2286 = 28;
        }
        var3.field2810 = (long) arg0;
        this.field2190.method1203(var3, (byte) -101);
    }

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "(I)V")
    private final void method1037(int arg0) {
        ++field1985;
        if (arg0 == 5) {
            int var2 = 0;
            while (!this.field2102.method3624()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class277.method1759(1000L, -119);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
    public final synchronized void method1038(int arg0, int arg1, int arg2) {
        ++field1963;
        class317 var4 = new class317(arg0);
        var4.field2810 = (long) arg1;
        this.field2189.method1203(var4, (byte) -110);
        if (arg2 != -24271) {
            this.field2275 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lom;)V")
    public final void method440(class374 arg0) {
        this.field2262 = (class474) arg0;
        ++field2044;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(ZI)V")
    public final void method1039(boolean arg0, int arg1) {
        if (this.field2192 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg1 != -3) {
                if (~arg1 == -129) {
                    var3 = true;
                    var4 = true;
                    var5 = 3;
                } else {
                    var3 = true;
                    var4 = false;
                    var5 = 0;
                }
            } else {
                var4 = false;
                var3 = true;
                var5 = 2;
            }
            if (!this.field2198 != !var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field2198 = var3;
            }
            if (!var4 != !this.field2197) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field2197 = var4;
            }
            if (~this.field2196 != ~var5) {
                if (var5 != 1) {
                    if (var5 != 2) {
                        if (~var5 == -4) {
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
                this.field2196 = var5;
            }
            this.field2193 &= -29;
            this.field2192 = arg1;
        }
        if (!arg0) {
            ++field2160;
        }
    }

    @OriginalMember(owner = "client!wh", name = "na", descriptor = "(IIII)[I")
    public final int[] method428(int arg0, int arg1, int arg2, int arg3) {
        ++field2078;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field2007 + -var6, arg2, 1, 32993, this.field2265, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wh", name = "GA", descriptor = "(I)V")
    public final void method502(int arg0) {
        this.method1039(false, 0);
        ++field2015;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IF)V")
    public final void method1040(int arg0, float arg1) {
        ++field2006;
        if (this.field2290 != arg1) {
            this.field2290 = arg1;
            if (this.field2229 == 3) {
                this.method1055(arg0 ^ -81);
            }
        }
        if (arg0 != 3) {
            this.field2152 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method539(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        ++field2041;
        this.method462(arg2, arg3);
    }

    @OriginalMember(owner = "client!wh", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method460(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field2123;
        boolean var7 = this.field2276 != arg0;
        if (var7 || this.field2297 != arg1 || this.field2285 != arg2) {
            this.field2285 = arg2;
            this.field2276 = arg0;
            this.field2297 = arg1;
            if (var7) {
                this.field2279 = (float) (this.field2276 & 65280) / 65280.0F;
                this.field2277 = (float) (this.field2276 & 16711680) / 1.671168E7F;
                this.field2253 = (float) (this.field2276 & 255) / 255.0F;
                this.method1103(255);
            }
            this.method1045(3);
        }
        if (this.field2311[0] != arg3 || this.field2311[1] != arg4 || this.field2311[2] != arg5) {
            this.field2311[1] = arg4;
            this.field2311[2] = arg5;
            this.field2311[0] = arg3;
            this.field2206[0] = -arg3;
            this.field2206[2] = -arg5;
            this.field2206[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field2269[0] = arg3 * var8;
            this.field2269[2] = arg5 * var8;
            this.field2269[1] = arg4 * var8;
            this.field2275[1] = -this.field2269[1];
            this.field2275[0] = -this.field2269[0];
            this.field2275[2] = -this.field2269[2];
            this.method1020(43);
            this.field2252 = (int) (arg5 * 256.0F / arg4);
            this.field2230 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(II)I")
    public final int method491(int arg0, int arg1) {
        ++field1961;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "(I)V")
    private final void method1041(int arg0) {
        ++field1978;
        if (arg0 != 4047) {
            this.field2215 = -111;
        }
        if (this.field2005 != null) {
            Dimension var2 = this.field2005.getSize();
            this.field2108 = var2.width;
            this.field2043 = var2.height;
        } else {
            this.field2108 = this.field2043 = 0;
        }
        if (this.field2176 == null) {
            this.field2007 = this.field2043;
            this.field1991 = this.field2108;
            this.method1063((byte) -81);
        }
        this.method1070(arg0 ^ -30866);
        this.method469();
    }

    @OriginalMember(owner = "client!wh", name = "ra", descriptor = "(IIII)V")
    public final void method529(int arg0, int arg1, int arg2, int arg3) {
        this.field2235 = true;
        this.field2226 = arg1;
        this.field2240 = arg3;
        this.field2294 = arg0;
        this.field2268 = arg2;
        ++field1988;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V")
    public final void method467(boolean arg0) {
        ++field2025;
    }

    @OriginalMember(owner = "client!wh", name = "EA", descriptor = "(IIII)V")
    public final void method439(int arg0, int arg1, int arg2, int arg3) {
        ++field2065;
        if (!this.field2235) {
            throw new RuntimeException("");
        } else {
            this.field2294 = arg0;
            this.field2268 = arg2;
            this.field2226 = arg1;
            this.field2240 = arg3;
            if (this.field2257) {
                this.field2152.field6712.method604(-124);
                this.field2152.field6712.method612(false);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Ldk;")
    public final class512 method454(int arg0, int arg1) {
        ++field2070;
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public final void method468(int arg0) {
        ++field2145;
    }

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "()Z")
    public final boolean method537() {
        ++field2021;
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public final void method471(int arg0) {
        this.method1037(5);
        ++field2119;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lof;)V")
    public final void method523(class624 arg0) {
        ++field2132;
        this.field2154.method2952(arg0, -1, 0, this);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILqk;)V")
    public final void method1042(int arg0, class16 arg1) {
        ++field2027;
        if (~this.field2179 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field2179 >= 0) {
                this.field2177[this.field2179].method100(-25412);
            }
            if (arg0 != -6109) {
                this.method1039(false, -42);
            }
            this.field2181 = this.field2177[++this.field2179] = arg1;
            this.field2181.method99((byte) -126);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)V")
    public final void method1043(byte arg0, int arg1, int arg2) {
        if (~this.field2227 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (~this.field2238 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                this.field2238 = arg2;
                var4 = true;
            }
            if (~this.field2296 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field2296 = arg1;
            }
            if (var4) {
                this.field2193 &= -30;
            }
        }
        ++field2060;
        int var5 = 50 / ((25 - arg0) / 35);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(BII)V")
    public final synchronized void method1044(byte arg0, int arg1, int arg2) {
        ++field1981;
        class317 var4 = new class317(arg2);
        var4.field2810 = (long) arg1;
        this.field2187.method1203(var4, (byte) 113);
        if (arg0 < 117) {
            this.field2288 = -89;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lhia;[Lfg;Z)Lda;")
    public final class61 method474(class66 arg0, class129[] arg1, boolean arg2) {
        ++field2141;
        return new class3(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "(I)V")
    private final void method1045(int arg0) {
        class247.field3601[0] = this.field2297 * this.field2277;
        class247.field3601[2] = this.field2297 * this.field2253;
        class247.field3601[3] = 1.0F;
        ++field2026;
        class247.field3601[1] = this.field2297 * this.field2279;
        OpenGL.glLightfv(16384, 4609, class247.field3601, 0);
        class247.field3601[1] = -this.field2285 * this.field2279;
        class247.field3601[arg0] = 1.0F;
        class247.field3601[2] = -this.field2285 * this.field2253;
        class247.field3601[0] = -this.field2285 * this.field2277;
        OpenGL.glLightfv(16385, 4609, class247.field3601, 0);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class148(Canvas arg0, class151 arg1, int arg2) {
        super(arg1);
        new class603();
        new class372(16);
        this.field2184 = new class164();
        this.field2186 = new class164();
        this.field2187 = new class164();
        this.field2188 = new class164();
        this.field2189 = new class164();
        this.field2190 = new class164();
        this.field2191 = new class164();
        this.field2200 = new class607();
        this.field2201 = new class607();
        this.field2202 = new class607();
        this.field2212 = -1;
        this.field2215 = 0;
        this.field2218 = 0;
        this.field2217 = 3584.0F;
        this.field2255 = -1;
        this.field2240 = 0;
        this.field2236 = 0;
        this.field2260 = -1.0F;
        this.field2247 = 512;
        this.field2257 = false;
        this.field2232 = 0;
        this.field2251 = 512;
        this.field2261 = 0;
        this.field2268 = -1;
        this.field2226 = -1;
        this.field2274 = new float[16];
        this.field2279 = 1.0F;
        this.field2206 = new float[4];
        this.field2290 = 1.0F;
        this.field2269 = new float[4];
        this.field2238 = 8448;
        this.field2228 = 3584;
        this.field2297 = -1.0F;
        this.field2291 = 1.0F;
        this.field2292 = 0;
        this.field2216 = -1.0F;
        this.field2222 = 3584.0F;
        this.field2306 = 50;
        this.field2281 = 0;
        this.field2296 = 8448;
        this.field2277 = 1.0F;
        this.field2263 = new class609[class61.field881];
        this.field2275 = new float[4];
        this.field2233 = true;
        this.field2253 = 1.0F;
        this.field2310 = 0.0F;
        this.field2280 = 0;
        this.field2285 = -1.0F;
        this.field2312 = 0;
        this.field2276 = -1;
        this.field2311 = new float[4];
        this.field2313 = new class699(8192);
        this.field2314 = new int[1];
        this.field2318 = new byte[16384];
        this.field2316 = new int[1];
        this.field2319 = new int[1];
        this.field2158 = arg2;
        this.field2005 = this.field2136 = arg0;
        if (!class383.method2462((byte) 58, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class383.method2462((byte) 77, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field2102 = new OpenGL();
                this.field1955 = this.field1984 = this.field2102.init(arg0, 8, 8, 8, 24, 0, this.field2158);
                if (~this.field1984 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1037(5);
                    int var4 = this.method1102(125);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field2265 = !this.field2211 ? 5121 : 33639;
                        if (~this.field2234.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class258.method1684(3270, this.field2234.replace('/', ' '), ' ');
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class95.method746(var10.substring(1, 3), 10)) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (~var10.length() <= -5 && class95.method746(var10.substring(0, 4), 10)) {
                                                var5 = class763.method4236((byte) 37, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field2309 = false;
                                }
                                if (var5 >= 7000 && var5 <= 9250) {
                                    this.field2305 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field2307 = false;
                            }
                            this.field2264 &= this.field2102.method3623("GL_ARB_half_float_pixel");
                            this.field2244 = true;
                            this.field2299 = this.field2309;
                        }
                        if (this.field2203.indexOf("intel") != -1) {
                            this.field2205 = false;
                        }
                        this.field2231 = !this.field2203.equals("s3 graphics");
                        if (this.field2309) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class184.method1301(false, true, -22433);
                        this.field2170 = true;
                        this.field2150 = new class395(this, super.field849);
                        this.method1034(6609);
                        this.field2169 = new class309(this);
                        this.field2156 = new class103(this);
                        if (this.field2156.method788(false)) {
                            this.field2153 = new class237(this);
                            if (!this.field2153.method1573(16422)) {
                                this.field2153.method1408((byte) 118);
                                this.field2153 = null;
                            }
                        }
                        this.field2152 = new class455(this);
                        this.method1061(9516);
                        this.method1041(4047);
                        this.method472();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method498();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI[BII)Lwia;")
    public final class761 method1046(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        ++field2039;
        if (!this.field2309 || arg0 && !this.field2299) {
            if (arg1 != 770) {
                this.field2172 = 86;
            }
            return new class146(this, arg4, arg2, arg3);
        } else {
            return new class134(this, arg4, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(Z)V")
    private final void method1047(boolean arg0) {
        ++field1962;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field2274, 0);
        if (arg0) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2126;
        this.method1068(113);
        this.method1039(false, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[Lraa;)V")
    public final void method501(int arg0, class609[] arg1) {
        ++field2004;
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field2263[var3] = arg1[var3];
        }
        this.field2224 = arg0;
        if (~this.field2229 != -2) {
            this.method1033((byte) -77);
        }
    }

    @OriginalMember(owner = "client!wh", name = "DA", descriptor = "(IIII)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3) {
        this.field2251 = arg3;
        this.field2247 = arg2;
        this.field2280 = arg0;
        this.field2232 = arg1;
        ++field1998;
        this.method1065((byte) -67);
        this.method1029(-24730);
        if (~this.field2229 != -4) {
            if (~this.field2229 == -3) {
                this.method1047(true);
                return;
            }
        } else {
            this.method1055(-61);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lcl;ILcl;Lcl;Lcl;)V")
    public final void method1048(class268 arg0, int arg1, class268 arg2, class268 arg3, class268 arg4) {
        if (arg1 != 16384) {
            this.method1020(101);
        }
        if (arg0 != null) {
            this.method1076((byte) -76, arg0.field3839);
            OpenGL.glVertexPointer(arg0.field3841, arg0.field3838, this.field2248.method942((byte) -128), this.field2248.method941(19512) - -((long) arg0.field3842));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field2061;
        if (arg4 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method1076((byte) -75, arg4.field3839);
            OpenGL.glNormalPointer(arg4.field3838, this.field2248.method942((byte) -120), this.field2248.method941(19512) + (long) arg4.field3842);
            OpenGL.glEnableClientState(32885);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method1076((byte) -68, arg2.field3839);
            OpenGL.glColorPointer(arg2.field3841, arg2.field3838, this.field2248.method942((byte) -124), this.field2248.method941(arg1 + 3128) + (long) arg2.field3842);
            OpenGL.glEnableClientState(32886);
        }
        if (arg3 != null) {
            this.method1076((byte) -77, arg3.field3839);
            OpenGL.glTexCoordPointer(arg3.field3841, arg3.field3838, this.field2248.method942((byte) -125), this.field2248.method941(19512) - -((long) arg3.field3842));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(Z)V")
    public final void method1049(boolean arg0) {
        if (this.field2193 != 8) {
            this.method1104((byte) 123);
            this.method1026(true, true);
            this.method1021(1, true);
            this.method1027(true, true);
            this.method1039(arg0, 1);
            this.field2193 = 8;
        }
        ++field1966;
        if (arg0) {
            this.field2229 = 75;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZZLjaclib/memory/Buffer;I)Lwia;")
    public final class761 method1050(int arg0, boolean arg1, boolean arg2, Buffer arg3, int arg4) {
        ++field1968;
        if (arg2) {
            return null;
        } else {
            return (class761) (!this.field2309 || arg1 && !this.field2299 ? new class146(this, arg4, arg3) : new class134(this, arg4, arg3, arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lql;)V")
    public final void method534(class738 arg0) {
        ++field2028;
        this.field2200.method772(arg0);
        this.field2201.method772(this.field2200);
        this.field2201.method3524(3);
        this.field2202.method3521(8, this.field2201);
        if (~this.field2229 != -2) {
            this.method1022(11);
        }
    }

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "()Z")
    public final boolean method483() {
        ++field1993;
        return this.field2152.method2784(3, -3953);
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(IIIIII)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2038;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1068(30);
        this.method1039(false, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2266) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field2266) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(Z)V")
    private final void method1051(boolean arg0) {
        ++field2055;
        this.field2274[10] = this.field2209;
        this.field2274[14] = this.field2256;
        this.field2217 = (this.field2274[14] - (float) this.field2228) / this.field2274[10];
        if (!arg0) {
            this.field2176 = null;
        }
        this.field2222 = (float) this.field2228;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIII)V")
    public final void method1052(int arg0, int arg1, int arg2, int arg3) {
        ++field2053;
        OpenGL.glTexEnvi(8960, arg1 - -arg2, arg0);
        OpenGL.glTexEnvi(8960, 34192 - -arg2, arg3);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    private final void method1053(byte arg0) {
        if (arg0 > 112) {
            if (this.field2236 >= this.field2281 && ~this.field2215 >= ~this.field2218) {
                OpenGL.glScissor(this.field2281 + this.field2261, -this.field2218 + this.field2292 + this.field2007, this.field2236 - this.field2281, -this.field2215 + this.field2218);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
            ++field2086;
        }
    }

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "(II)V")
    public final void method1054(int arg0, int arg1) {
        class247.field3601[0] = (float) class493.method2943(arg1, 16711680) / 1.671168E7F;
        ++field2003;
        class247.field3601[arg0] = (float) (arg1 >>> 24) / 255.0F;
        class247.field3601[1] = (float) class493.method2943(65280, arg1) / 65280.0F;
        class247.field3601[2] = (float) class493.method2943(arg1, 255) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class247.field3601, 0);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIIID)V")
    public final void method424(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field2092;
    }

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "(I)V")
    private final void method1055(int arg0) {
        ++field2148;
        float var2 = (float) (-this.field2280) * this.field2290 / (float) this.field2247;
        float var3 = (float) (-this.field2232) * this.field2290 / (float) this.field2251;
        float var4 = (float) (-this.field2280 + this.field1991) * this.field2290 / (float) this.field2247;
        if (arg0 < -11) {
            float var5 = (float) (-this.field2232 + this.field2007) * this.field2290 / (float) this.field2251;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field2306, (double) this.field2228);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method455(Canvas arg0, int arg1, int arg2) {
        ++field2037;
        if (this.field2136 == arg0) {
            throw new RuntimeException();
        } else if (!this.field1969.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field2102.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field1969.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "(I)V")
    private final void method1056(int arg0) {
        this.field2223 = (float) (-this.field2312 + this.field2228) + -this.field2310;
        ++field2157;
        this.field2237 = this.field2223 - (float) this.field2212 * this.field2291;
        if ((float) this.field2306 > this.field2237) {
            this.field2237 = (float) this.field2306;
        }
        OpenGL.glFogf(2915, this.field2237);
        OpenGL.glFogf(2916, this.field2223);
        class247.field3601[2] = (float) class493.method2943(this.field2255, 255) / 255.0F;
        class247.field3601[0] = (float) class493.method2943(16711680, this.field2255) / 1.671168E7F;
        if (arg0 != 11922) {
            this.method1057(40, (byte) 41);
        }
        class247.field3601[1] = (float) class493.method2943(65280, this.field2255) / 65280.0F;
        OpenGL.glFogfv(2918, class247.field3601, 0);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)I")
    public final int method1057(int arg0, byte arg1) {
        ++field2076;
        if (arg0 != 5121 && arg0 != 5120) {
            if (arg1 != 115) {
                this.field2275 = null;
            }
            if (~arg0 != -5124 && ~arg0 != -5123) {
                if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "(II)V")
    public final void method1058(int arg0, int arg1) {
        ++field2159;
        int var3 = -50 / ((-48 - arg1) / 43);
        this.method1090(true, -25501, arg0);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lqk;I)V")
    public final void method1059(class16 arg0, int arg1) {
        ++field2083;
        if (arg1 == 515) {
            if (!this.field2301) {
                if (~this.field2172 <= -1 && this.field2173[this.field2172] == arg0) {
                    this.field2173[this.field2172--] = null;
                    arg0.method97(-32609);
                    if (this.field2172 >= 0) {
                        this.field2181 = this.field2176 = this.field2173[this.field2172];
                        this.field2181.method101((byte) 108);
                    } else {
                        this.field2181 = this.field2176 = null;
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.method1080(true, arg0);
                this.method1031(arg0, 962);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "(I)V")
    public final void method1060(int arg0) {
        if (this.field2193 != 4) {
            this.method1023(125);
            this.method1026(false, true);
            this.method1089(false, 123);
            this.method1021(1, false);
            this.method1027(false, true);
            this.method1058(-2, -120);
            this.method1039(false, 1);
            this.field2193 = 4;
        }
        if (arg0 >= -42) {
            this.field2205 = true;
        }
        ++field2052;
    }

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "(I)V")
    private final void method1061(int arg0) {
        ++field1999;
        this.method1058(-2, 2);
        if (arg0 != 9516) {
            this.field2292 = 10;
        }
        for (int var2 = this.field2239 + -1; var2 >= 0; --var2) {
            this.method1024(var2, (byte) -11);
            this.method1088((class195) null, -27749);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1043((byte) 77, 8448, 8448);
        this.method1052(34168, 34176, 2, 770);
        this.method1062((byte) -68);
        this.field2192 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field2196 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field2197 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field2198 = true;
        this.method1026(true, true);
        this.method1089(true, 108);
        this.method1021(1, true);
        this.method1027(true, true);
        this.method1070(-30559);
        this.field2102.setSwapInterval(0);
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
        this.field2276 = this.field2255 = -1;
        this.method469();
    }

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "()I")
    public final int method461() {
        ++field1971;
        int var1 = this.field2317;
        this.field2317 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "(Z)V")
    public final void method463(boolean arg0) {
        this.field2233 = arg0;
        ++field1994;
        this.method1100(true);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lof;I)V")
    public final void method505(class624 arg0, int arg1) {
        ++field2084;
        this.field2154.method2952(arg0, arg1, 0, this);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
    private final void method1062(byte arg0) {
        if (arg0 >= -27) {
            this.method536();
        }
        if (this.field2271) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field2271 = false;
        }
        ++field2033;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V")
    private final void method1063(byte arg0) {
        ++field1975;
        OpenGL.glViewport(this.field2261, this.field2292, this.field1991, this.field2007);
        if (arg0 != -81) {
            this.method419(27, 74, -111, 17);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIII)V")
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1068(54);
        ++field2147;
        this.method1039(false, arg5);
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

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "()V")
    public final void method535() {
        OpenGL.glFinish();
        ++field2095;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZILgh;II)V")
    public final void method1064(boolean arg0, int arg1, class550 arg2, int arg3, int arg4) {
        ++field2046;
        int var6 = arg2.method3210(!arg0);
        int var7 = arg3 * this.method1057(var6, (byte) 115);
        this.method1025(arg2, 121);
        OpenGL.glDrawElements(arg1, arg4, var6, arg2.method3213(-20288) + (long) var7);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()I")
    public final int method433() {
        ++field2088;
        return 4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ldh;IIII)Lka;")
    public final class473 method418(class322 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2081;
        return new class153(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(B)V")
    private final void method1065(byte arg0) {
        ++field2054;
        if (arg0 <= -57) {
            float[] var2 = this.field2274;
            float var3 = (float) (-this.field2280 * this.field2306) / (float) this.field2247;
            float var4 = (float) ((-this.field2280 + this.field1991) * this.field2306) / (float) this.field2247;
            float var5 = (float) (this.field2306 * this.field2232) / (float) this.field2251;
            float var6 = (float) ((this.field2232 - this.field2007) * this.field2306) / (float) this.field2251;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field2306 * 2.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[10] = this.field2209 = (float) (-(this.field2228 - -this.field2306)) / (float) (-this.field2306 + this.field2228);
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[0] = var7 / (-var3 + var4);
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[7] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[14] = this.field2256 = -((float) this.field2228 * var7) / (float) (this.field2228 - this.field2306);
                var2[11] = -1.0F;
            } else {
                var2[1] = 0.0F;
                var2[10] = 1.0F;
                var2[9] = 0.0F;
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
            }
            this.method1051(true);
        }
    }

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "(II)V")
    public final void method1066(int arg0, int arg1) {
        if (arg1 == 260) {
            ++field2089;
            if (~arg0 == -2) {
                this.method1043((byte) -87, 7681, 7681);
            } else if (~arg0 == -1) {
                this.method1043((byte) 105, 8448, 8448);
            } else {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.method1043((byte) -95, 8448, 260);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.method1043((byte) -33, 34023, 34023);
                        return;
                    }
                } else {
                    this.method1043((byte) -93, 7681, 34165);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "()Z")
    public final boolean method475() {
        ++field1973;
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "za", descriptor = "(IIIII)V")
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2125;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (this.field2281 <= arg0 + arg2 && ~(-arg2 + arg0) >= ~this.field2236 && ~(arg1 + arg2) <= ~this.field2215 && ~(-arg2 + arg1) >= ~this.field2218) {
            this.method1068(116);
            this.method1039(false, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field2260 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field2216 >= (float) var8) {
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
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class505.method2996(var9, 96);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class241.field3510[var11] * (float) arg2 + var6, class241.field3509[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "()Z")
    public final boolean method453() {
        ++field2000;
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
    public final void method486(int arg0) {
        ++field1987;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "()V")
    public final void method498() {
        for (class184 var1 = this.field2165.method1195(0); var1 != null; var1 = this.field2165.method1201(2)) {
            ((class42) var1).method297((byte) -114);
        }
        ++field2142;
        if (this.field2156 != null) {
            this.field2156.method782((byte) 53);
        }
        if (this.field2102 != null) {
            this.method1094(1);
            Enumeration var2 = this.field1969.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field1969.get(var3);
                this.field2102.releaseSurface(var3, var4);
            }
            this.field2102.release();
            this.field2102 = null;
        }
        if (this.field2170) {
            class441.method2739(false, true, 16383);
            this.field2170 = false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        ++field2022;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field2161 = arg0;
            this.field2150.method2523(24588);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "(II)V")
    public final void method430(int arg0, int arg1) {
        ++field2074;
    }

    @OriginalMember(owner = "client!wh", name = "HA", descriptor = "(IIII[I)V")
    public final void method425(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field2032;
        float var6 = (float) arg2 * this.field2200.field8581 + (float) arg0 * this.field2200.field8583 + (float) arg1 * this.field2200.field8567 + this.field2200.field8563;
        if (!((float) this.field2306 > var6) && !(var6 > (float) this.field2228)) {
            int var7 = (int) (((float) arg2 * this.field2200.field8591 + (float) arg0 * this.field2200.field8562 + (float) arg1 * this.field2200.field8572 + this.field2200.field8575) * (float) this.field2247 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field2200.field8558 + (float) arg0 * this.field2200.field8578 + (float) arg1 * this.field2200.field8564 + this.field2200.field8590) * (float) this.field2251 / (float) arg3);
            if (this.field2282 <= (float) var7 && (float) var7 <= this.field2284 && this.field2308 <= (float) var8 && this.field2250 >= (float) var8) {
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 + -this.field2282);
                arg4[1] = (int) ((float) var8 - this.field2308);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([IIIIIZ)Lpga;")
    public final class536 method429(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1986;
        return new class506(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class280 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2049;
        return new class634(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(II)I")
    public final int method490(int arg0, int arg1) {
        ++field2097;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "(I)V")
    public final void method1067(int arg0) {
        if (this.field2193 != 2) {
            this.method1023(122);
            this.method1026(false, true);
            this.method1089(false, 110);
            this.method1021(1, false);
            this.method1027(false, true);
            this.method1058(-2, 12);
            this.field2193 = 2;
        }
        if (arg0 != -2) {
            this.field2164 = null;
        }
        ++field2085;
    }

    @OriginalMember(owner = "client!wh", name = "xa", descriptor = "(F)V")
    public final void method484(float arg0) {
        if (this.field2259 != arg0) {
            this.field2259 = arg0;
            this.method1103(255);
        }
        ++field2045;
    }

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "(I)V")
    private final void method1068(int arg0) {
        if (this.field2193 != 1) {
            this.method1023(123);
            this.method1026(false, true);
            this.method1089(false, 123);
            this.method1021(1, false);
            this.method1027(false, true);
            this.method1088((class195) null, -27749);
            this.method1058(-2, -101);
            this.method1066(1, 260);
            this.field2193 = 1;
        }
        ++field1960;
        if (arg0 < 11) {
            this.field2236 = 64;
        }
    }

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "()Z")
    public final boolean method512() {
        ++field2082;
        return this.field2153 != null && (~this.field2158 >= -2 || this.field2208);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(FFF)V")
    public final void method489(float arg0, float arg1, float arg2) {
        class489.field6992 = arg1;
        class114.field1579 = arg2;
        ++field2100;
        class214.field3193 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "(IIIII)V")
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2114;
        this.method1068(32);
        this.method1039(false, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!wh", name = "da", descriptor = "(III[I)V")
    public final void method488(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2163;
        float var5 = (float) arg2 * this.field2200.field8581 + (float) arg0 * this.field2200.field8583 + (float) arg1 * this.field2200.field8567 + this.field2200.field8563;
        if (!((float) this.field2306 > var5) && !((float) this.field2228 < var5)) {
            int var6 = (int) (((float) arg2 * this.field2200.field8591 + (float) arg0 * this.field2200.field8562 + (float) arg1 * this.field2200.field8572 + this.field2200.field8575) * (float) this.field2247 / var5);
            int var7 = (int) (((float) arg2 * this.field2200.field8558 + (float) arg0 * this.field2200.field8578 + (float) arg1 * this.field2200.field8564 + this.field2200.field8590) * (float) this.field2251 / var5);
            if (this.field2282 <= (float) var6 && this.field2284 >= (float) var6 && (float) var7 >= this.field2308 && this.field2250 >= (float) var7) {
                arg3[1] = (int) ((float) var7 + -this.field2308);
                arg3[0] = (int) ((float) var6 + -this.field2282);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([I)V")
    public final void method479(int[] arg0) {
        arg0[0] = this.field1991;
        arg0[1] = this.field2007;
        ++field2138;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lqk;B)V")
    public final void method1069(class16 arg0, byte arg1) {
        ++field2098;
        if (this.field2180 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field2180 <= -1) {
                this.field2174[this.field2180].method98(4197);
            }
            this.field2176 = this.field2174[++this.field2180] = arg0;
            if (arg1 == -118) {
                this.field2176.method102((byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "(III)V")
    public final void method526(int arg0, int arg1, int arg2) {
        if (this.field2255 != arg0 || this.field2212 != arg1 || ~this.field2312 != ~arg2) {
            this.field2212 = arg1;
            this.field2312 = arg2;
            this.field2255 = arg0;
            this.method1056(11922);
            this.method1092((byte) 127);
        }
        ++field2047;
    }

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "(I)V")
    public final void method1070(int arg0) {
        if (arg0 != -30559) {
            this.method1046(false, -46, (byte[]) null, 50, 56);
        }
        if (~this.field2229 != -1) {
            this.field2229 = 0;
            this.field2193 &= -32;
        }
        ++field1953;
    }

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1977;
        float var10;
        float var11;
        if (this.field2204 != null && ~arg2 >= ~this.field2204.field1055 && arg3 <= this.field2204.field1050) {
            this.field2204.method635(0, arg2, arg6, 0, arg3, 0, 6406, false, 0, 0);
            var10 = (float) arg3 * this.field2204.field7568 / (float) this.field2204.field1050;
            var11 = (float) arg2 * this.field2204.field7564 / (float) this.field2204.field1055;
        } else {
            this.field2204 = class479.method2883(arg3, arg2, 6406, this, arg6, 497309962, false, 6406);
            this.field2204.method636(false, 10497, false);
            var11 = this.field2204.field7564;
            var10 = this.field2204.field7568;
        }
        this.method1067(-2);
        this.method1088(this.field2204, -27749);
        this.method1039(false, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1054(3, arg5);
        this.method1043((byte) -63, 34165, 34165);
        this.method1052(34166, 34176, 0, 768);
        this.method1052(5890, 34176, 2, 770);
        this.method1086(34166, 0, 770, 38);
        this.method1086(5890, 2, 770, 121);
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
        this.method1052(5890, 34176, 0, 768);
        this.method1052(34166, 34176, 2, 770);
        this.method1086(5890, 0, 770, 123);
        this.method1086(34166, 2, 770, 70);
    }

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)Lza;")
    public final class415 method520(int arg0) {
        ++field2051;
        class42 var2 = new class42(arg0);
        this.field2165.method1203(var2, (byte) -84);
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "()V")
    public final void method538() {
        ++field2010;
        if (this.field2205) {
            if (this.field2178 != this.field2176) {
                throw new RuntimeException();
            }
            this.field2178.method157(0, -210);
            this.field2178.method157(8, -210);
            this.method1059(this.field2178, 515);
        } else {
            if (!this.field2287) {
                throw new RuntimeException("");
            }
            this.field2175.method135(0, 0, this.field1991, this.field2007, 0, 0);
            this.field2102.setSurface(this.field1955);
        }
        this.field1991 = this.field2108;
        this.field2007 = this.field2043;
        this.field2175 = null;
        this.method1070(-30559);
        this.method1063((byte) -81);
        this.method469();
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)Lbi;")
    public final class482 method473(int arg0, int arg1) {
        ++field2091;
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "(I)Lnc;")
    public final class24 method1071(int arg0) {
        if (arg0 != -3) {
            this.method490(-123, -102);
        }
        ++field2103;
        return this.field2262 != null ? this.field2262.method2860((byte) 84) : null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field2115;
        this.method436(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "(I)V")
    public final void method1072(int arg0) {
        if (arg0 != 2) {
            this.field2214 = 34;
        }
        OpenGL.glPushMatrix();
        ++field2017;
    }

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "(II)V")
    public final synchronized void method1073(int arg0, int arg1) {
        ++field2072;
        if (arg1 != 1) {
            this.method1094(-36);
        }
        class317 var3 = new class317(arg0);
        this.field2188.method1203(var3, (byte) 124);
    }

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "(I)V")
    private final void method1074(int arg0) {
        ++field2117;
        if (arg0 < 117) {
            this.field2190 = null;
        }
        if (~this.field2229 != -4) {
            this.field2229 = 3;
            this.method1055(-21);
            this.method1022(-110);
            this.field2193 &= -8;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIZ)Lpga;")
    public final class536 method470(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2093;
        return new class506(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "()Lql;")
    public final class738 method504() {
        ++field2063;
        return this.field2200;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(IIII)V")
    public final void method1075(int arg0, int arg1, int arg2, int arg3) {
        ++field2079;
        if (arg3 >= 117) {
            OpenGL.glDrawArrays(arg1, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLwia;)V")
    public final void method1076(byte arg0, class761 arg1) {
        if (arg0 < -50) {
            ++field2069;
            if (this.field2248 != arg1) {
                if (this.field2309) {
                    OpenGL.glBindBufferARB(34962, arg1.method951(43));
                }
                this.field2248 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "pa", descriptor = "()V")
    public final void method466() {
        this.field2235 = false;
        ++field1972;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JB)V")
    public final synchronized void method1077(long arg0, byte arg1) {
        if (arg1 > -88) {
            this.method533();
        }
        ++field2075;
        class184 var4 = new class184();
        var4.field2810 = arg0;
        this.field2191.method1203(var4, (byte) 86);
    }

    @OriginalMember(owner = "client!wh", name = "aa", descriptor = "(IIIIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2056;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1068(95);
        this.method1039(false, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2266) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field2266) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILou;)V")
    public final void method1078(int arg0, class607 arg1) {
        if (arg0 != 10) {
            this.field2309 = true;
        }
        OpenGL.glPushMatrix();
        ++field2118;
        OpenGL.glMultMatrixf(arg1.method3520((byte) -120), 0);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z[BIII)Lgh;")
    public final class550 method1079(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        ++field1956;
        if (arg4 > -31) {
            this.method479((int[]) null);
        }
        return (class550) (!this.field2309 || arg0 && !this.field2299 ? new class644(this, arg3, arg1, arg2) : new class690(this, arg3, arg1, arg2, arg0));
    }

    @OriginalMember(owner = "client!wh", name = "ya", descriptor = "()V")
    public final void method444() {
        this.method1027(true, true);
        ++field1957;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "()Z")
    public final boolean method478() {
        ++field2144;
        if (this.field2153 != null) {
            if (!this.field2153.method1416(0)) {
                if (!this.field2156.method780(this.field2153, -118)) {
                    return false;
                }
                this.field2150.method2523(24588);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLqk;)V")
    public final void method1080(boolean arg0, class16 arg1) {
        if (!arg0) {
            this.method1074(-118);
        }
        ++field2029;
        if (this.field2179 >= 0 && this.field2177[this.field2179] == arg1) {
            this.field2177[this.field2179--] = null;
            arg1.method100(-25412);
            if (~this.field2179 <= -1) {
                this.field2181 = this.field2177[this.field2179];
                this.field2181.method99((byte) -123);
            } else {
                this.field2181 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(B)V")
    public final void method1081(byte arg0) {
        OpenGL.glPopMatrix();
        if (arg0 != 15) {
            this.field2301 = true;
        }
        ++field2131;
    }

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "()[I")
    public final int[] method434() {
        ++field2009;
        return new int[] { this.field2280, this.field2232, this.field2247, this.field2251 };
    }

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "()Z")
    public final boolean method518() {
        ++field1974;
        return this.field2266 && (!this.method441() || this.field2208);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BFF)V")
    public final void method1082(byte arg0, float arg1, float arg2) {
        this.field2310 = arg2;
        this.field2291 = arg1;
        int var4 = 76 % ((arg0 - -44) / 49);
        ++field1992;
        this.method1056(11922);
    }

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "()I")
    public final int method464() {
        ++field2035;
        return this.field2182 - -this.field2183 + this.field2185;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(II)V")
    public final void method528(int arg0, int arg1) {
        ++field1983;
        if (this.field2306 != arg0 || this.field2228 != arg1) {
            this.field2306 = arg0;
            this.field2228 = arg1;
            this.method1065((byte) -106);
            this.method1056(11922);
            if (~this.field2229 != -4) {
                if (~this.field2229 == -3) {
                    this.method1047(true);
                    return;
                }
            } else {
                this.method1055(-97);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "(I)V")
    public final void method1083(int arg0) {
        if (this.field2193 != 16) {
            this.method1074(121);
            this.method1026(true, true);
            this.method1021(1, true);
            this.method1027(true, true);
            this.method1039(false, 1);
            this.field2193 = 16;
        }
        ++field2050;
        if (arg0 != 11939) {
            this.method498();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lha;I)V")
    public static final void method1084(class60 arg0, int arg1) {
        ++field1964;
        class122.field1661 = new class451[class716.field10074.length];
        for (int var2 = arg1; class716.field10074.length > var2; ++var2) {
            int var3 = class716.field10074[var2];
            class66 var4 = class647.method3764(var3, class256.field3683, arg1);
            class61 var5 = arg0.method474(var4, class129.method918(class323.field4609, var3), true);
            class122.field1661[var2] = new class451(var5, var4);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IFFFF)V")
    public final void method1085(int arg0, float arg1, float arg2, float arg3, float arg4) {
        class247.field3601[3] = arg4;
        ++field2149;
        class247.field3601[1] = arg2;
        if (arg0 == -2) {
            class247.field3601[0] = arg1;
            class247.field3601[2] = arg3;
            OpenGL.glTexEnvfv(8960, 8705, class247.field3601, 0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(IIII)V")
    public final void method1086(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
        ++field2101;
        if (arg3 < 20) {
            this.method1083(113);
        }
        OpenGL.glTexEnvi(8960, 34200 - -arg1, arg2);
    }

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "()Lql;")
    public final class738 method515() {
        ++field1995;
        return new class607();
    }

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "(I)V")
    public static final void method1087(int arg0) {
        ++field2135;
        if (class282.field3986) {
            class46 var1 = class700.method3972(class76.field1062, class745.field10436, true);
            if (var1 != null && var1.field661 != null) {
                class177 var2 = new class177();
                var2.field2743 = var1;
                var2.field2737 = var1.field661;
                class709.method4025(var2);
            }
            class389.field5865 = -1;
            class226.field3314 = -1;
            class282.field3986 = false;
            if (arg0 != -34848) {
                method1087(-100);
            }
            if (var1 != null) {
                class673.method3850(var1, (byte) 78);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[I[I)Laa;")
    public final class488 method521(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field2031;
        return class57.method404(arg1, 58, arg0, this, arg3, arg2);
    }

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "(ILaa;II)V")
    public final void method435(int arg0, class488 arg1, int arg2, int arg3) {
        ++field2002;
        class178 var5 = (class178) arg1;
        class531 var6 = var5.field2754;
        this.method1067(-2);
        this.method1088(var5.field2754, -27749);
        this.method1039(false, 1);
        this.method1043((byte) 67, 8448, 7681);
        this.method1052(34167, 34176, 0, 768);
        float var7 = var6.field7564 / (float) var6.field7561;
        float var8 = var6.field7568 / (float) var6.field7569;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field2281 - arg2) * var7, (float) (this.field2215 - arg3) * var8);
        OpenGL.glVertex2i(this.field2281, this.field2215);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2281) * var7, (float) (-arg3 + this.field2218) * var8);
        OpenGL.glVertex2i(this.field2281, this.field2218);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2236) * var7, (float) (-arg3 + this.field2218) * var8);
        OpenGL.glVertex2i(this.field2236, this.field2218);
        OpenGL.glTexCoord2f((float) (this.field2236 - arg2) * var7, (float) (this.field2215 - arg3) * var8);
        OpenGL.glVertex2i(this.field2236, this.field2215);
        OpenGL.glEnd();
        this.method1052(5890, 34176, 0, 768);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method417(Canvas arg0, int arg1, int arg2) {
        ++field2116;
        long var4 = 0L;
        if (arg0 != null && this.field2136 != arg0) {
            if (this.field1969.containsKey(arg0)) {
                Long var6 = (Long) this.field1969.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field1984;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field2102.surfaceResized(var4);
            if (this.field2005 == arg0) {
                this.method1041(4047);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "(IIIII)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2146;
        this.method1068(34);
        this.method1039(false, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!wh", name = "KA", descriptor = "(IIII)V")
    public final void method476(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1991 < arg2) {
            arg2 = this.field1991;
        }
        if (~arg3 < ~this.field2007) {
            arg3 = this.field2007;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        ++field2023;
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field2236 = arg2;
        this.field2218 = arg3;
        this.field2281 = arg0;
        this.field2215 = arg1;
        OpenGL.glEnable(3089);
        this.method1029(-24730);
        this.method1053((byte) 113);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lme;I)V")
    public final void method1088(class195 arg0, int arg1) {
        if (arg1 != -27749) {
            this.method515();
        }
        ++field2127;
        class195 var3 = this.field2267[this.field2227];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 != null) {
                    if (~arg0.field2957 != ~var3.field2957) {
                        OpenGL.glDisable(var3.field2957);
                        OpenGL.glEnable(arg0.field2957);
                    }
                } else {
                    OpenGL.glEnable(arg0.field2957);
                }
                OpenGL.glBindTexture(arg0.field2957, arg0.method1361((byte) 51));
            } else {
                OpenGL.glDisable(var3.field2957);
            }
            this.field2267[this.field2227] = arg0;
        }
        this.field2193 &= -2;
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
    public final synchronized void method487(int arg0) {
        ++field2057;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field2186.method1197(0)) {
            class317 var12 = (class317) this.field2186.method1198((byte) 102);
            class644.field9033[var2++] = (int) var12.field2810;
            this.field2185 -= var12.field4518;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class644.field9033, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class644.field9033, 0);
            var2 = 0;
        }
        while (!this.field2187.method1197(0)) {
            class317 var11 = (class317) this.field2187.method1198((byte) 62);
            class644.field9033[var2++] = (int) var11.field2810;
            this.field2182 -= var11.field4518;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class644.field9033, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class644.field9033, 0);
            var2 = 0;
        }
        while (!this.field2188.method1197(0)) {
            class317 var10 = (class317) this.field2188.method1198((byte) 106);
            class644.field9033[var2++] = var10.field4518;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class644.field9033, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class644.field9033, 0);
            var2 = 0;
        }
        while (!this.field2189.method1197(0)) {
            class317 var9 = (class317) this.field2189.method1198((byte) 80);
            class644.field9033[var2++] = (int) var9.field2810;
            this.field2183 -= var9.field4518;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class644.field9033, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class644.field9033, 0);
            boolean var4 = false;
        }
        while (!this.field2184.method1197(0)) {
            class317 var8 = (class317) this.field2184.method1198((byte) 64);
            OpenGL.glDeleteLists((int) var8.field2810, var8.field4518);
        }
        while (!this.field2190.method1197(0)) {
            class184 var7 = this.field2190.method1198((byte) 92);
            OpenGL.glDeleteProgramARB((int) var7.field2810);
        }
        while (!this.field2191.method1197(0)) {
            class184 var6 = this.field2191.method1198((byte) 127);
            OpenGL.glDeleteObjectARB(var6.field2810);
        }
        while (!this.field2184.method1197(0)) {
            class317 var5 = (class317) this.field2184.method1198((byte) 47);
            OpenGL.glDeleteLists((int) var5.field2810, var5.field4518);
        }
        this.field2150.method2526(18648);
        if (this.method464() > 100663296 && this.field2194 - -60000L < class524.method3075(18)) {
            System.gc();
            this.field2194 = class524.method3075(18);
        }
        this.field2167 = var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lom;Lom;FLom;)Lom;")
    public final class374 method499(class374 arg0, class374 arg1, float arg2, class374 arg3) {
        ++field2111;
        if (arg0 != null && arg1 != null && this.field2213 && this.field2205) {
            class706 var5 = null;
            class474 var6 = (class474) arg0;
            class474 var7 = (class474) arg1;
            class24 var8 = var6.method2860((byte) 84);
            class24 var9 = var7.method2860((byte) 84);
            if (var8 != null && var9 != null) {
                int var10 = var9.field245 < var8.field245 ? var8.field245 : var9.field245;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class706) {
                    class706 var11 = (class706) arg3;
                    if (var10 == var11.method4017(1)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class706(this, var10);
                }
                if (var5.method4013(arg2, var8, var9, 1)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1989;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            this.method1068(112);
            this.method1039(false, arg5);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var10 * var12;
            float var14 = var11 * var12;
            int var15 = arg8 % (arg6 + arg7);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var16 = (float) arg6 * var13;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~arg6 <= ~var15) {
                var20 = (float) (-var15 + arg6) * var13;
                var21 = (float) (-var15 + arg6) * var14;
            } else {
                var18 = (float) (arg6 - (-arg7 - -var15)) * var13;
                var19 = (float) (arg6 + arg7 - var15) * var14;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var13;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (arg2 > arg0) {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if ((float) arg2 < var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                } else {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if ((float) arg3 + 0.35F > var23) {
                        break;
                    }
                    if (var21 + var23 < (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                OpenGL.glEnd();
                var23 += var21 + var25;
                var22 += var20 + var24;
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(ZI)V")
    public final void method1089(boolean arg0, int arg1) {
        if (!arg0 != !this.field2298) {
            this.field2298 = arg0;
            this.method1095(24);
            this.field2193 &= -8;
        }
        if (arg1 < 106) {
            this.method433();
        }
        ++field2110;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII)V")
    public final void method1090(boolean arg0, int arg1, int arg2) {
        this.method1032((byte) -118, arg2, true, arg0);
        ++field2122;
        if (arg1 != -25501) {
            this.method484(1.0733961F);
        }
    }

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "()V")
    public final void method536() {
        ++field2129;
        this.field2156.method787(1);
    }

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "(II)I")
    public final int method1091(int arg0, int arg1) {
        ++field2105;
        if (arg0 == arg1) {
            return 7681;
        } else if (arg0 == 0) {
            return 8448;
        } else if (~arg0 != -3) {
            if (~arg0 != -4) {
                if (arg0 == 4) {
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
    }

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "(B)V")
    private final void method1092(byte arg0) {
        ++field2066;
        if (this.field2295 && this.field2212 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 < 17) {
            this.field2251 = -112;
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    public final void method480(int arg0) {
        ++field2011;
        this.method1094(1);
    }

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "()V")
    public final void method472() {
        ++field2030;
        if (this.field2231 && this.field1991 > 0 && ~this.field2007 < -1) {
            int var1 = this.field2281;
            int var2 = this.field2236;
            int var3 = this.field2215;
            int var4 = this.field2218;
            this.method469();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1070(-30559);
            this.method1026(false, true);
            this.method1089(false, 123);
            this.method1021(1, false);
            this.method1027(false, true);
            this.method1088((class195) null, -27749);
            this.method1058(-2, -92);
            this.method1066(1, 260);
            this.method1039(false, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field1991, this.field2007, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method476(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "()I")
    public final int method508() {
        ++field1996;
        int var1 = this.field2315;
        this.field2315 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!wh", name = "la", descriptor = "()V")
    public final void method469() {
        ++field2059;
        this.field2281 = 0;
        this.field2215 = 0;
        this.field2236 = this.field1991;
        this.field2218 = this.field2007;
        OpenGL.glDisable(3089);
        this.method1029(-24730);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V")
    public final void method1093(int arg0, int arg1, int arg2) {
        this.field2261 = arg1;
        this.field2292 = arg2;
        ++field2019;
        this.method1063((byte) -81);
        if (arg0 != 16686) {
            this.field2237 = -0.93607235F;
        }
        this.method1053((byte) 118);
    }

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "()Z")
    public final boolean method532() {
        ++field2008;
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "XA", descriptor = "()I")
    public final int method514() {
        ++field2024;
        return this.field2228;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(IIIIII)Lom;")
    public final class374 method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2107;
        return this.field2213 ? new class570(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "(I)V")
    private final void method1094(int arg0) {
        if (arg0 != 1) {
            this.method515();
        }
        this.field2102.method3622();
        ++field1965;
    }

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "(I)V")
    private final void method1095(int arg0) {
        if (this.field2298 && !this.field2270) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field2128;
        if (arg0 != 24) {
            this.field2245 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "(B)V")
    public static final void method1096(byte arg0) {
        ++field2058;
        class502.field7152.method534(class111.field1551);
        if (arg0 == -29) {
            class502.field7152.method500(class347.field5020, class582.field8295, class110.field1547, class115.field1592);
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(III)V")
    public final synchronized void method1097(int arg0, int arg1, int arg2) {
        ++field2020;
        class317 var4 = new class317(arg2);
        if (arg1 <= 66) {
            this.method1041(60);
        }
        var4.field2810 = (long) arg0;
        this.field2186.method1203(var4, (byte) 79);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Lqk;I)V")
    public final void method1098(class16 arg0, int arg1) {
        ++field2080;
        if (arg1 != 495185768) {
            this.method533();
        }
        if (!this.field2301) {
            if (this.field2172 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field2172 <= -1) {
                    this.field2173[this.field2172].method97(-32609);
                }
                this.field2181 = this.field2176 = this.field2173[++this.field2172] = arg0;
                this.field2181.method101((byte) 107);
            }
        } else {
            this.method1042(-6109, arg0);
            this.method1069(arg0, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "([I)V")
    public final void method530(int[] arg0) {
        arg0[1] = this.field2215;
        arg0[3] = this.field2218;
        ++field2099;
        arg0[0] = this.field2281;
        arg0[2] = this.field2236;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public final void method426(boolean arg0) {
        ++field1959;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lou;I)V")
    public final void method1099(class607 arg0, int arg1) {
        if (arg1 != -25906) {
            this.field2315 = -80;
        }
        OpenGL.glLoadMatrixf(arg0.method3520((byte) -120), 0);
        ++field2090;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)V")
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
        this.field2156.method781(arg1, arg0, arg2, arg3, (byte) 92);
        ++field2073;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
    public final void method427() {
        if (this.field2153 != null && this.field2153.method1416(0)) {
            this.field2156.method784(this.field2153, 84);
            this.field2150.method2523(24588);
        }
        ++field1990;
    }

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "(I)V")
    public final void method438(int arg0) {
        this.field2171 = 0;
        ++field2112;
        while (~arg0 < -2) {
            ++this.field2171;
            arg0 >>= 1;
        }
        this.field2168 = 1 << this.field2171;
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(Z)V")
    private final void method1100(boolean arg0) {
        ++field2012;
        OpenGL.glDepthMask(this.field2195 && this.field2233);
        if (!arg0) {
            this.field2252 = -115;
        }
    }

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "(II)I")
    public final int method1101(int arg0, int arg1) {
        ++field2121;
        if (arg0 < 98) {
            this.field2282 = -1.0706351F;
        }
        if (arg1 != 6406 && arg1 != 6409) {
            if (~arg1 != -6411 && arg1 != 34846 && ~arg1 != -34845) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 != 6408 && ~arg1 != -34848) {
                    if (arg1 == 34843) {
                        return 6;
                    } else if (arg1 == 34842) {
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
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lbi;Ldk;)Lpk;")
    public final class198 method517(class482 arg0, class512 arg1) {
        ++field2124;
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "(IIII)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < this.field2218) {
            this.field2218 = arg3;
        }
        if (arg2 < this.field2236) {
            this.field2236 = arg2;
        }
        ++field2077;
        if (this.field2215 < arg1) {
            this.field2215 = arg1;
        }
        if (~arg0 < ~this.field2281) {
            this.field2281 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method1029(-24730);
        this.method1053((byte) 117);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIF)Lraa;")
    public final class609 method443(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field2062;
        return new class729(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "(I)I")
    private final int method1102(int arg0) {
        ++field2014;
        this.field2203 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field2234 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field2203.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field2203.indexOf("brian paul") != 0 || this.field2203.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class258.method1684(3270, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class763.method4236((byte) 37, var4[0]);
                int var6 = class763.method4236((byte) 37, var4[1]);
                this.field2288 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field2288 > -13) {
            var2 |= 2;
        }
        if (!this.field2102.method3623("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field2102.method3623("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int var7 = 112 / ((arg0 - 18) / 63);
        int[] var8 = new int[1];
        OpenGL.glGetIntegerv(34018, var8, 0);
        this.field2239 = var8[0];
        OpenGL.glGetIntegerv(34929, var8, 0);
        this.field2214 = var8[0];
        OpenGL.glGetIntegerv(34930, var8, 0);
        this.field2286 = var8[0];
        if (~this.field2239 > -3 || this.field2214 < 2 || ~this.field2286 > -3) {
            var2 |= 16;
        }
        this.field2211 = Stream.method3869();
        this.field2287 = this.field2102.arePbuffersAvailable();
        this.field2309 = this.field2102.method3623("GL_ARB_vertex_buffer_object");
        this.field2266 = this.field2102.method3623("GL_ARB_multisample");
        this.field2300 = this.field2102.method3623("GL_ARB_vertex_program");
        this.field2102.method3623("GL_ARB_fragment_program");
        this.field2249 = this.field2102.method3623("GL_ARB_vertex_shader");
        this.field2273 = this.field2102.method3623("GL_ARB_fragment_shader");
        this.field2305 = this.field2102.method3623("GL_EXT_texture3D");
        this.field2264 = this.field2102.method3623("GL_ARB_texture_rectangle");
        this.field2213 = this.field2102.method3623("GL_ARB_texture_cube_map");
        this.field2307 = this.field2102.method3623("GL_ARB_texture_float");
        this.field2258 = false;
        this.field2205 = this.field2102.method3623("GL_EXT_framebuffer_object");
        this.field2301 = this.field2102.method3623("GL_EXT_framebuffer_blit");
        this.field2254 = this.field2102.method3623("GL_EXT_framebuffer_multisample");
        this.field2208 = this.field2301 & this.field2254;
        this.field2304 = class329.field4678.startsWith("mac");
        OpenGL.glGetFloatv(2834, class247.field3601, 0);
        this.field2260 = class247.field3601[0];
        this.field2216 = class247.field3601[1];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "(I)V")
    private final void method1103(int arg0) {
        class247.field3601[1] = this.field2279 * this.field2259;
        class247.field3601[3] = 1.0F;
        if (arg0 != 255) {
            this.method1104((byte) -27);
        }
        ++field1997;
        class247.field3601[0] = this.field2277 * this.field2259;
        class247.field3601[2] = this.field2259 * this.field2253;
        OpenGL.glLightModelfv(2899, class247.field3601, 0);
    }

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "(B)V")
    private final void method1104(byte arg0) {
        if (this.field2229 != 2) {
            this.field2229 = 2;
            this.method1047(true);
            this.method1022(-40);
            this.field2193 &= -8;
        }
        if (arg0 >= 118) {
            ++field2067;
        }
    }
}
