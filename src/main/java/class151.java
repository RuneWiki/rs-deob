import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class151 extends class66 {

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Lga;")
    private class420 field1950 = new class420();

    @OriginalMember(owner = "client!wk", name = "Od", descriptor = "Z")
    public boolean field2110 = true;

    @OriginalMember(owner = "client!wk", name = "Nd", descriptor = "Lpr;")
    public class468 field2109 = new class468();

    @OriginalMember(owner = "client!wk", name = "be", descriptor = "Lpr;")
    public class468 field2123 = new class468();

    @OriginalMember(owner = "client!wk", name = "ce", descriptor = "Lpr;")
    public class468 field2124 = new class468();

    @OriginalMember(owner = "client!wk", name = "de", descriptor = "Lpr;")
    public class468 field2125 = new class468();

    @OriginalMember(owner = "client!wk", name = "ee", descriptor = "Lpr;")
    private class468 field2126 = new class468();

    @OriginalMember(owner = "client!wk", name = "fe", descriptor = "Lpr;")
    private class468 field2127 = new class468();

    @OriginalMember(owner = "client!wk", name = "pe", descriptor = "I")
    public int field2137 = 128;

    @OriginalMember(owner = "client!wk", name = "oe", descriptor = "[F")
    private float[] field2136 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wk", name = "re", descriptor = "I")
    private int field2139 = 1;

    @OriginalMember(owner = "client!wk", name = "Fe", descriptor = "Lrm;")
    public class428 field2153 = class604.field8497;

    @OriginalMember(owner = "client!wk", name = "ve", descriptor = "I")
    public int field2143 = 0;

    @OriginalMember(owner = "client!wk", name = "Ce", descriptor = "I")
    private int field2150 = -1;

    @OriginalMember(owner = "client!wk", name = "Se", descriptor = "I")
    public int field2166 = 0;

    @OriginalMember(owner = "client!wk", name = "Be", descriptor = "I")
    public int field2149 = 3584;

    @OriginalMember(owner = "client!wk", name = "ie", descriptor = "Z")
    public boolean field2130 = true;

    @OriginalMember(owner = "client!wk", name = "Ae", descriptor = "Z")
    public boolean field2148 = true;

    @OriginalMember(owner = "client!wk", name = "Ie", descriptor = "I")
    public int field2156 = 512;

    @OriginalMember(owner = "client!wk", name = "Ye", descriptor = "[F")
    public float[] field2172 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wk", name = "gf", descriptor = "I")
    public int field2180 = -1;

    @OriginalMember(owner = "client!wk", name = "jf", descriptor = "Z")
    private boolean field2182 = false;

    @OriginalMember(owner = "client!wk", name = "Re", descriptor = "Z")
    public boolean field2165 = true;

    @OriginalMember(owner = "client!wk", name = "ze", descriptor = "I")
    private int field2147 = 0;

    @OriginalMember(owner = "client!wk", name = "We", descriptor = "Z")
    public boolean field2170 = false;

    @OriginalMember(owner = "client!wk", name = "Ke", descriptor = "[F")
    private float[] field2158 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wk", name = "pf", descriptor = "F")
    public float field2188 = -1.0F;

    @OriginalMember(owner = "client!wk", name = "sf", descriptor = "F")
    public float field2191 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "hf", descriptor = "F")
    private float field2181 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "Le", descriptor = "Z")
    public boolean field2159 = false;

    @OriginalMember(owner = "client!wk", name = "Oe", descriptor = "I")
    public int field2162 = 3;

    @OriginalMember(owner = "client!wk", name = "bf", descriptor = "F")
    public float field2175 = 3584.0F;

    @OriginalMember(owner = "client!wk", name = "we", descriptor = "F")
    public float field2144 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "ue", descriptor = "[F")
    private float[] field2142 = new float[16];

    @OriginalMember(owner = "client!wk", name = "Ve", descriptor = "Z")
    private boolean field2169 = false;

    @OriginalMember(owner = "client!wk", name = "ef", descriptor = "I")
    private int field2178 = 0;

    @OriginalMember(owner = "client!wk", name = "tf", descriptor = "I")
    public int field2192 = 512;

    @OriginalMember(owner = "client!wk", name = "Ue", descriptor = "I")
    private int field2168 = -1;

    @OriginalMember(owner = "client!wk", name = "af", descriptor = "I")
    private int field2174 = 0;

    @OriginalMember(owner = "client!wk", name = "df", descriptor = "I")
    private int field2177 = -1;

    @OriginalMember(owner = "client!wk", name = "Ef", descriptor = "Z")
    private boolean field2203 = false;

    @OriginalMember(owner = "client!wk", name = "uf", descriptor = "F")
    public float field2193 = 3584.0F;

    @OriginalMember(owner = "client!wk", name = "Gf", descriptor = "I")
    public int field2205 = 0;

    @OriginalMember(owner = "client!wk", name = "Pf", descriptor = "[F")
    private float[] field2214 = new float[16];

    @OriginalMember(owner = "client!wk", name = "Cf", descriptor = "I")
    public int field2201 = -1;

    @OriginalMember(owner = "client!wk", name = "Df", descriptor = "Z")
    private boolean field2202 = false;

    @OriginalMember(owner = "client!wk", name = "Xe", descriptor = "I")
    public int field2171 = 0;

    @OriginalMember(owner = "client!wk", name = "xf", descriptor = "Z")
    public boolean field2196 = false;

    @OriginalMember(owner = "client!wk", name = "ye", descriptor = "I")
    public int field2146 = 0;

    @OriginalMember(owner = "client!wk", name = "xe", descriptor = "I")
    private int field2145 = 0;

    @OriginalMember(owner = "client!wk", name = "Sf", descriptor = "F")
    public float field2217 = -1.0F;

    @OriginalMember(owner = "client!wk", name = "Mf", descriptor = "I")
    public int field2211 = 0;

    @OriginalMember(owner = "client!wk", name = "Vf", descriptor = "I")
    public int field2220 = 50;

    @OriginalMember(owner = "client!wk", name = "Af", descriptor = "I")
    public int field2199 = 0;

    @OriginalMember(owner = "client!wk", name = "Rf", descriptor = "[F")
    private float[] field2216 = new float[16];

    @OriginalMember(owner = "client!wk", name = "ke", descriptor = "Z")
    private boolean field2132 = false;

    @OriginalMember(owner = "client!wk", name = "Ne", descriptor = "Z")
    public boolean field2161 = false;

    @OriginalMember(owner = "client!wk", name = "Jf", descriptor = "[F")
    public float[] field2208 = this.field2158;

    @OriginalMember(owner = "client!wk", name = "Uf", descriptor = "I")
    public int field2219 = 0;

    @OriginalMember(owner = "client!wk", name = "le", descriptor = "Z")
    public boolean field2133 = true;

    @OriginalMember(owner = "client!wk", name = "mf", descriptor = "I")
    public int field2185 = 8;

    @OriginalMember(owner = "client!wk", name = "qf", descriptor = "[F")
    public float[] field2189 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!wk", name = "Wf", descriptor = "F")
    public float field2221 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "Nf", descriptor = "F")
    public float field2212 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "Of", descriptor = "Lbe;")
    public class41 field2213 = class213.field3080;

    @OriginalMember(owner = "client!wk", name = "wf", descriptor = "I")
    public int field2195 = 0;

    @OriginalMember(owner = "client!wk", name = "of", descriptor = "I")
    private int field2187 = 16777215;

    @OriginalMember(owner = "client!wk", name = "Xf", descriptor = "[F")
    private float[] field2222 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wk", name = "Zf", descriptor = "Z")
    public boolean field2224 = true;

    @OriginalMember(owner = "client!wk", name = "qe", descriptor = "Z")
    private boolean field2138 = false;

    @OriginalMember(owner = "client!wk", name = "Je", descriptor = "I")
    public int field2157 = 0;

    @OriginalMember(owner = "client!wk", name = "Ff", descriptor = "[Lbea;")
    private class232[] field2204 = new class232[10];

    @OriginalMember(owner = "client!wk", name = "dg", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2228 = new Stream();

    @OriginalMember(owner = "client!wk", name = "rg", descriptor = "Lpr;")
    private class468 field2242 = new class468();

    @OriginalMember(owner = "client!wk", name = "nb", descriptor = "Ljava/lang/Object;")
    public Object field1979;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field1940;

    @OriginalMember(owner = "client!wk", name = "uc", descriptor = "Lcb;")
    public class544 field2038;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1961;

    @OriginalMember(owner = "client!wk", name = "Xb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2015;

    @OriginalMember(owner = "client!wk", name = "If", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!wk", name = "Id", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public int field1956;

    @OriginalMember(owner = "client!wk", name = "Wb", descriptor = "I")
    private int field2014;

    @OriginalMember(owner = "client!wk", name = "Db", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!wk", name = "me", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!wk", name = "cg", descriptor = "Llr;")
    private class783 field2227;

    @OriginalMember(owner = "client!wk", name = "tc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field2037;

    @OriginalMember(owner = "client!wk", name = "te", descriptor = "F")
    private float field2141;

    @OriginalMember(owner = "client!wk", name = "He", descriptor = "F")
    public float field2155;

    @OriginalMember(owner = "client!wk", name = "cf", descriptor = "F")
    public float field2176;

    @OriginalMember(owner = "client!wk", name = "kf", descriptor = "F")
    public float field2183;

    @OriginalMember(owner = "client!wk", name = "nf", descriptor = "F")
    public float field2186;

    @OriginalMember(owner = "client!wk", name = "vf", descriptor = "F")
    public float field2194;

    @OriginalMember(owner = "client!wk", name = "zf", descriptor = "F")
    public float field2198;

    @OriginalMember(owner = "client!wk", name = "Hf", descriptor = "F")
    private float field2206;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!wk", name = "Z", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!wk", name = "ab", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!wk", name = "bb", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!wk", name = "cb", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!wk", name = "db", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!wk", name = "eb", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!wk", name = "fb", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wk", name = "gb", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!wk", name = "hb", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!wk", name = "ib", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!wk", name = "jb", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!wk", name = "kb", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!wk", name = "lb", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!wk", name = "mb", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!wk", name = "ob", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!wk", name = "pb", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!wk", name = "qb", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!wk", name = "rb", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!wk", name = "sb", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!wk", name = "tb", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!wk", name = "ub", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!wk", name = "vb", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!wk", name = "wb", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!wk", name = "xb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!wk", name = "yb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!wk", name = "zb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!wk", name = "Ab", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!wk", name = "Bb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!wk", name = "Cb", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!wk", name = "Eb", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!wk", name = "Fb", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!wk", name = "Gb", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!wk", name = "Hb", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!wk", name = "Ib", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!wk", name = "Jb", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!wk", name = "Kb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!wk", name = "Lb", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!wk", name = "Mb", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!wk", name = "Nb", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!wk", name = "Ob", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!wk", name = "Pb", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!wk", name = "Qb", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!wk", name = "Rb", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!wk", name = "Sb", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!wk", name = "Tb", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!wk", name = "Ub", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!wk", name = "Vb", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!wk", name = "Yb", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!wk", name = "Zb", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!wk", name = "ac", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!wk", name = "bc", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!wk", name = "cc", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!wk", name = "dc", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!wk", name = "ec", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!wk", name = "fc", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!wk", name = "hc", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!wk", name = "ic", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!wk", name = "jc", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!wk", name = "kc", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!wk", name = "lc", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!wk", name = "mc", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!wk", name = "nc", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!wk", name = "oc", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!wk", name = "pc", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!wk", name = "qc", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!wk", name = "rc", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!wk", name = "sc", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!wk", name = "vc", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!wk", name = "xc", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!wk", name = "yc", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!wk", name = "zc", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!wk", name = "Ac", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!wk", name = "Bc", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!wk", name = "Cc", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!wk", name = "Dc", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!wk", name = "Ec", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!wk", name = "Fc", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!wk", name = "Gc", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!wk", name = "Hc", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!wk", name = "Ic", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!wk", name = "Jc", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!wk", name = "Kc", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!wk", name = "Mc", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!wk", name = "Nc", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!wk", name = "Oc", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!wk", name = "Pc", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!wk", name = "Qc", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!wk", name = "Rc", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!wk", name = "Sc", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!wk", name = "Tc", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!wk", name = "Uc", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!wk", name = "Vc", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!wk", name = "Wc", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!wk", name = "Xc", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!wk", name = "Yc", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!wk", name = "Zc", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!wk", name = "ad", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!wk", name = "bd", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!wk", name = "cd", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!wk", name = "dd", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!wk", name = "ed", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!wk", name = "fd", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!wk", name = "gd", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!wk", name = "hd", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!wk", name = "id", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!wk", name = "jd", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!wk", name = "kd", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!wk", name = "ld", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!wk", name = "md", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!wk", name = "nd", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!wk", name = "od", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!wk", name = "pd", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!wk", name = "qd", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!wk", name = "rd", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!wk", name = "sd", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!wk", name = "td", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!wk", name = "ud", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!wk", name = "vd", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!wk", name = "wd", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!wk", name = "xd", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!wk", name = "yd", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!wk", name = "zd", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!wk", name = "Ad", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!wk", name = "Bd", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!wk", name = "Cd", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!wk", name = "Dd", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!wk", name = "Ed", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!wk", name = "Fd", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!wk", name = "Gd", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!wk", name = "Hd", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!wk", name = "Kd", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!wk", name = "Ld", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!wk", name = "Md", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!wk", name = "Pd", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!wk", name = "Qd", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!wk", name = "Rd", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!wk", name = "Sd", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!wk", name = "Td", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!wk", name = "Ud", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!wk", name = "Vd", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!wk", name = "Wd", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!wk", name = "Xd", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!wk", name = "Yd", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!wk", name = "Zd", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!wk", name = "ae", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!wk", name = "ne", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!wk", name = "se", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!wk", name = "De", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!wk", name = "Ee", descriptor = "I")
    private int field2152;

    @OriginalMember(owner = "client!wk", name = "Me", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!wk", name = "rf", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!wk", name = "yf", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!wk", name = "Kf", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!wk", name = "Yf", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!wk", name = "ag", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!wk", name = "Bg", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!wk", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!wk", name = "ff", descriptor = "Lbea;")
    private class232 field2179;

    @OriginalMember(owner = "client!wk", name = "Te", descriptor = "Lku;")
    private class394 field2167;

    @OriginalMember(owner = "client!wk", name = "xg", descriptor = "Lmq;")
    private class532 field2248;

    @OriginalMember(owner = "client!wk", name = "Ze", descriptor = "Lii;")
    private class577 field2173;

    @OriginalMember(owner = "client!wk", name = "eg", descriptor = "Lbw;")
    public class715 field2229;

    @OriginalMember(owner = "client!wk", name = "fg", descriptor = "Lbw;")
    public class715 field2230;

    @OriginalMember(owner = "client!wk", name = "gg", descriptor = "Lbw;")
    private class715 field2231;

    @OriginalMember(owner = "client!wk", name = "mg", descriptor = "Lbw;")
    private class715 field2237;

    @OriginalMember(owner = "client!wk", name = "ug", descriptor = "Lbw;")
    public class715 field2245;

    @OriginalMember(owner = "client!wk", name = "vg", descriptor = "Lbw;")
    private class715 field2246;

    @OriginalMember(owner = "client!wk", name = "yg", descriptor = "Lbw;")
    public class715 field2249;

    @OriginalMember(owner = "client!wk", name = "jg", descriptor = "Lfka;")
    private class741 field2234;

    @OriginalMember(owner = "client!wk", name = "pg", descriptor = "Lfka;")
    private class741 field2240;

    @OriginalMember(owner = "client!wk", name = "tg", descriptor = "Lfka;")
    private class741 field2244;

    @OriginalMember(owner = "client!wk", name = "Bf", descriptor = "Ldr;")
    public class749 field2200;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "Llo;")
    public class785 field1949;

    @OriginalMember(owner = "client!wk", name = "hg", descriptor = "Lff;")
    public class9 field2232;

    @OriginalMember(owner = "client!wk", name = "ig", descriptor = "Lff;")
    public class9 field2233;

    @OriginalMember(owner = "client!wk", name = "kg", descriptor = "Lff;")
    public class9 field2235;

    @OriginalMember(owner = "client!wk", name = "lg", descriptor = "Lff;")
    public class9 field2236;

    @OriginalMember(owner = "client!wk", name = "ng", descriptor = "Lff;")
    public class9 field2238;

    @OriginalMember(owner = "client!wk", name = "og", descriptor = "Lff;")
    public class9 field2239;

    @OriginalMember(owner = "client!wk", name = "qg", descriptor = "Lff;")
    public class9 field2241;

    @OriginalMember(owner = "client!wk", name = "sg", descriptor = "Lff;")
    public class9 field2243;

    @OriginalMember(owner = "client!wk", name = "wg", descriptor = "Lff;")
    public class9 field2247;

    @OriginalMember(owner = "client!wk", name = "zg", descriptor = "Lff;")
    public class9 field2250;

    @OriginalMember(owner = "client!wk", name = "wc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2040;

    @OriginalMember(owner = "client!wk", name = "Jd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field2105;

    @OriginalMember(owner = "client!wk", name = "gc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field2024;

    @OriginalMember(owner = "client!wk", name = "he", descriptor = "Z")
    public boolean field2129;

    @OriginalMember(owner = "client!wk", name = "je", descriptor = "Z")
    public boolean field2131;

    @OriginalMember(owner = "client!wk", name = "Ge", descriptor = "Z")
    public boolean field2154;

    @OriginalMember(owner = "client!wk", name = "lf", descriptor = "Z")
    public boolean field2184;

    @OriginalMember(owner = "client!wk", name = "Lf", descriptor = "Z")
    public boolean field2210;

    @OriginalMember(owner = "client!wk", name = "Ag", descriptor = "Z")
    public boolean field2251;

    @OriginalMember(owner = "client!wk", name = "Lc", descriptor = "[Lqda;")
    public static class112[] field2055;

    @OriginalMember(owner = "client!wk", name = "ge", descriptor = "[Lada;")
    public class171[] field2128;

    @OriginalMember(owner = "client!wk", name = "bg", descriptor = "[Lada;")
    public class171[] field2226;

    @OriginalMember(owner = "client!wk", name = "Pe", descriptor = "[Lpd;")
    public class267[] field2163;

    @OriginalMember(owner = "client!wk", name = "Qe", descriptor = "[Lpr;")
    public class468[] field2164;

    @OriginalMember(owner = "client!wk", name = "Qf", descriptor = "[Ljw;")
    public class578[] field2215;

    @OriginalMember(owner = "client!wk", name = "Tf", descriptor = "[Ldr;")
    private class749[] field2218;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(Z)V")
    public final void method1037(boolean arg0) {
        ++field1974;
        Enumeration var2 = this.field2024.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1132(17360, this.field2024.get(var3), var3);
        }
        this.field2234.method47((byte) -20);
        this.field2244.method47((byte) -113);
        this.field2240.method47((byte) -56);
        this.field2233.method78(-18457);
        this.field2243.method78(-18457);
        this.field2241.method78(-18457);
        this.field2238.method78(-18457);
        this.field2239.method78(-18457);
        this.field2173.method3353(arg0);
        this.field2248.method47((byte) -24);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)Lpr;")
    public final class468 method1038(byte arg0) {
        ++field1994;
        if (arg0 > -20) {
            this.method1088((byte) -53, 120);
        }
        return this.field2126;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public abstract void method1039(int arg0);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2033;
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
        if (this.method1111((float) arg1, 0.0F, (float) arg2 + var9, (float) arg0, 3, (float) arg3 + var8, 0.0F)) {
            this.method1107((byte) 111);
            this.method1059(true, arg4);
            this.method1056(32, class490.field6966, 0);
            this.method1157(1, 0, class490.field6966);
            this.method1087((byte) -90, arg5);
            this.method1079(0);
            this.method1089((byte) 95, false);
            this.method1161(-11367);
            this.method1089((byte) 95, true);
            this.method1157(1, 0, class412.field5814);
            this.method1056(32, class412.field5814, 0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BIZIZI)V")
    private final void method1040(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        ++field1965;
        boolean var7 = arg2 & this.method426();
        if (!var7 && (arg1 == 4 || arg1 == 8 || ~arg1 == -10)) {
            arg1 = 2;
            arg3 = arg1 == 4 ? 1 & arg5 : 1;
            arg5 = 0;
        }
        int var8 = 48 % ((arg0 - 7) / 37);
        if (~arg1 != -1 && arg4) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (~this.field2174 != ~arg1) {
            if (~this.field2174 != -1) {
                this.field2204[this.field2174 & Integer.MAX_VALUE].method573((byte) 111);
            }
            if (arg1 != 0) {
                this.field2179 = this.field2204[arg1 & Integer.MAX_VALUE];
                this.field2179.method568(arg4, (byte) -126);
                this.field2179.method572(arg4, 35);
                this.field2179.method569(107, arg3, arg5);
            } else {
                this.field2179 = null;
            }
            this.field2145 = arg3;
            this.field2147 = arg5;
            this.field2174 = arg1;
        } else if (~this.field2174 != -1) {
            this.field2204[this.field2174 & Integer.MAX_VALUE].method572(arg4, 116);
            if (this.field2147 != arg5 || this.field2145 != arg3) {
                this.field2204[this.field2174 & Integer.MAX_VALUE].method569(122, arg3, arg5);
                this.field2145 = arg3;
                this.field2147 = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
        ++field1952;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZI[IIII)Lkt;")
    public abstract class166 method1041(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "(I)V")
    private final void method1042(int arg0) {
        if (arg0 != 0) {
            this.field2150 = -39;
        }
        this.field2202 = false;
        ++field2107;
        this.method1094((byte) -23);
        if (class544.field7649 == this.field2153) {
            this.method1143(arg0 + 1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)Lpr;")
    public final class468 method1043(boolean arg0) {
        ++field1981;
        if (arg0) {
            this.method1135((byte) -49);
        }
        return this.field2164[this.field2219];
    }

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "(I)V")
    private final void method1044(int arg0) {
        ++field1999;
        int var2 = 25 / ((-42 - arg0) / 34);
        this.field2132 = false;
        this.method1076(13);
        if (class310.field4615 == this.field2153) {
            this.method1143(1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZB)Lmq;")
    public abstract class532 method1045(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "(I)Lbv;")
    public final class320 method1046(int arg0) {
        int var2 = -4 % ((-36 - arg0) / 48);
        ++field2088;
        return this.field2167 != null ? this.field2167.method2402(8) : null;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)Lpr;")
    public final class468 method1047(byte arg0) {
        ++field2011;
        int var2 = -48 % ((64 - arg0) / 58);
        return this.field2125;
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(Z)V")
    public final void method1048(boolean arg0) {
        if (!arg0) {
            this.field2137 = 122;
        }
        if (this.field2163[this.field2219] != class471.field6718) {
            this.field2163[this.field2219] = class471.field6718;
            this.field2164[this.field2219].method1956();
            this.method1102(-17);
        }
        ++field1955;
    }

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "(I)V")
    public abstract void method1049(int arg0);

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "(I)V")
    private final void method1050(int arg0) {
        if (class400.field5681 != this.field2153) {
            class428 var2 = this.field2153;
            this.field2153 = class400.field5681;
            if (var2.method2547(arg0 ^ 25742)) {
                this.method1167(262144);
            }
            this.method1097(false);
            this.field2208 = this.field2214;
            this.method1143(1);
            this.field2135 &= -25;
        }
        if (arg0 != 25742) {
            this.field2139 = -21;
        }
        ++field1972;
    }

    @OriginalMember(owner = "client!wk", name = "za", descriptor = "(IIIII)V")
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2034;
        this.method1107((byte) 111);
        this.method1059(true, arg3);
        this.method1056(32, class490.field6966, 0);
        this.method1157(1, 0, class490.field6966);
        this.method1087((byte) -121, arg4);
        this.field2109.method2769(1.0F, (float) arg2, (float) arg2, -127);
        this.field2109.method1952(arg0, arg1, 0);
        this.method1122((byte) 110);
        this.method1089((byte) 95, false);
        this.method1091((byte) 127, 0, this.field2240);
        this.method1099(79, this.field2246);
        this.method1147(1, class375.field5405, 256, 0);
        this.method1089((byte) 95, true);
        this.method1157(1, 0, class412.field5814);
        this.method1056(32, class412.field5814, 0);
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(Z)V")
    public abstract void method1051(boolean arg0);

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "(I)V")
    public abstract void method1052(int arg0);

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "(IIIIIII)I")
    public final int method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1988;
        int var8 = 0;
        float var9 = (float) arg2 * this.field2123.field6654 + (float) arg0 * this.field2123.field6645 + (float) arg1 * this.field2123.field6652 + this.field2123.field6651;
        float var10 = (float) arg5 * this.field2123.field6654 + (float) arg3 * this.field2123.field6645 + (float) arg4 * this.field2123.field6652 + this.field2123.field6651;
        if (var9 < (float) this.field2220 && var10 < (float) this.field2220) {
            var8 |= 16;
        } else if ((float) this.field2149 < var9 && (float) this.field2149 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field2123.field6646 + (float) arg0 * this.field2123.field6643 + (float) arg1 * this.field2123.field6667 + this.field2123.field6674) * (float) this.field2192 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field2123.field6646 + (float) arg3 * this.field2123.field6643 + (float) arg4 * this.field2123.field6667 + this.field2123.field6674) * (float) this.field2192 / (float) arg6);
        if ((float) var11 < this.field2198 && this.field2198 > (float) var12) {
            var8 |= 1;
        } else if ((float) var11 > this.field2194 && (float) var12 > this.field2194) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field2123.field6666 + (float) arg0 * this.field2123.field6656 + (float) arg1 * this.field2123.field6644 + this.field2123.field6650) * (float) this.field2156 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field2123.field6666 + (float) arg3 * this.field2123.field6656 + (float) arg4 * this.field2123.field6644 + this.field2123.field6650) * (float) this.field2156 / (float) arg6);
        if (this.field2176 > (float) var13 && (float) var14 < this.field2176) {
            var8 |= 4;
        } else if (this.field2183 < (float) var13 && (float) var14 > this.field2183) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "(I)V")
    public final void method1053(int arg0) {
        this.field2226 = new class171[this.field2197];
        this.field2164 = new class468[this.field2197];
        ++field2061;
        this.field2218 = new class749[this.field2197];
        this.field2128 = new class171[this.field2197];
        this.field2163 = new class267[this.field2197];
        for (int var2 = 0; ~this.field2197 < ~var2; ++var2) {
            this.field2226[var2] = class174.field2460;
            this.field2128[var2] = class174.field2460;
            this.field2163[var2] = class471.field6718;
            this.field2164[var2] = new class468();
        }
        this.field2215 = new class578[this.field2160 + -2];
        this.field2200 = this.method1126(class12.field247, 126, class770.field10614, 1, 1);
        this.method439(new class90(262144));
        this.field2229 = this.method1086(5678, new class491[] { new class491(new class652[] { class652.field9189, class652.field9194 }) });
        this.field2230 = this.method1086(arg0 ^ 5678, new class491[] { new class491(new class652[] { class652.field9189, class652.field9192 }) });
        this.field2245 = this.method1086(5678, new class491[] { new class491(class652.field9189), new class491(class652.field9192), new class491(class652.field9194), new class491(class652.field9191) });
        this.field2249 = this.method1086(arg0 + 5678, new class491[] { new class491(class652.field9189), new class491(class652.field9192), new class491(class652.field9194) });
        this.field2250 = new class9(this, 0, 0, false, false);
        this.field2233 = new class9(this, 0, 0, true, true);
        this.field2235 = new class9(this, 0, 0, false, false);
        this.field2243 = new class9(this, 0, arg0, true, true);
        this.field2236 = new class9(this, 0, 0, false, false);
        this.field2241 = new class9(this, 0, 0, true, true);
        this.field2232 = new class9(this, 0, 0, false, false);
        this.field2238 = new class9(this, 0, 0, true, true);
        this.field2247 = new class9(this, 0, 0, false, false);
        this.field2239 = new class9(this, 0, 0, true, true);
        this.field2173 = new class577(this);
        this.field2248 = this.method1045(true, (byte) 109);
        this.method1074(15706);
        this.field1949 = new class785(this);
        this.field2204[1] = this.method1055(-106, 1);
        this.field2204[2] = this.method1055(-87, 2);
        this.field2204[4] = this.method1055(-82, 4);
        this.field2204[5] = this.method1055(class470.method2786(arg0, -8), 5);
        this.field2204[6] = this.method1055(-29, 6);
        this.field2204[7] = this.method1055(-127, 7);
        this.field2204[3] = this.method1055(arg0 + -16, 3);
        this.field2204[8] = this.method1055(class470.method2786(arg0, -4), 8);
        this.field2204[9] = this.method1055(-114, 9);
        if (!this.field2204[2].method571(-30998)) {
            this.field2204[2] = this.method1055(class470.method2786(arg0, -56), 0);
        }
        if (!this.field2204[4].method571(-30998)) {
            this.field2204[4] = this.field2204[2];
        }
        if (!this.field2204[8].method571(-30998)) {
            this.field2204[8] = this.field2204[4];
        }
        if (!this.field2204[9].method571(-30998)) {
            this.field2204[9] = this.field2204[8];
        }
        this.method1112(26);
        this.method463();
        this.method444();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
    public final void method1054(boolean arg0, int arg1) {
        if (this.field2196 != arg0) {
            this.field2196 = arg0;
            this.method1124(false);
            this.field2135 &= -8;
        }
        if (arg1 != -8) {
            this.method1124(true);
        }
        ++field2001;
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(II)Lbea;")
    public class232 method1055(int arg0, int arg1) {
        if (arg0 > -1) {
            return null;
        } else {
            ++field1987;
            if (arg1 != 6) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        return arg1 == 7 ? new class391(this) : new class623(this);
                    } else {
                        return new class123(this, this.field1949);
                    }
                } else {
                    return new class792(this);
                }
            } else {
                return new class514(this);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "(III[I)V")
    public final void method407(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2045;
        float var5 = this.field2123.method2762((float) arg0, (float) arg2, -91, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field2211;
            var7 = this.field2205;
        } else {
            var6 = (int) ((float) this.field2192 * this.field2123.method2772((float) arg1, (float) arg0, -5911, (float) arg2) / var5);
            var7 = (int) ((float) this.field2156 * this.field2123.method2766((byte) -93, (float) arg0, (float) arg2, (float) arg1) / var5);
        }
        arg3[0] = (int) ((float) var6 + -this.field2198);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 - this.field2176);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILeca;I)V")
    public final void method1056(int arg0, class789 arg1, int arg2) {
        this.method1057(arg2, false, arg1, false, (byte) 112);
        ++field2008;
        if (arg0 != 32) {
            this.field2158 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLeca;ZB)V")
    public abstract void method1057(int arg0, boolean arg1, class789 arg2, boolean arg3, byte arg4);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z[IIBI)Lkt;")
    public final class166 method1058(boolean arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -24) {
            return null;
        } else {
            ++field1943;
            return this.method1041(arg2, arg0, -6647, arg1, 0, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(IIIIII)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2063;
        float var7 = this.method1085(8550);
        this.method1107((byte) 111);
        this.method1059(true, arg4);
        this.method1056(32, class490.field6966, 0);
        this.method1157(1, 0, class490.field6966);
        this.method1087((byte) -43, arg5);
        this.field2109.method2769(1.0F, (float) (arg3 + -1), (float) (arg2 - 1), 110);
        this.field2109.method2760(0.0F, (float) arg0 - var7, 3, (float) arg1 + -var7);
        this.method1122((byte) -109);
        this.method1089((byte) 95, false);
        this.method1108(class701.field9895, 4, 4);
        this.method1089((byte) 95, true);
        this.method1157(1, 0, class412.field5814);
        this.method1056(32, class412.field5814, 0);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)I")
    public final int method421(int arg0, int arg1) {
        ++field2000;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[I[I)Laa;")
    public final class510 method430(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field2116;
        return class173.method1304(this, arg0, -80, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(ZI)V")
    public final void method1059(boolean arg0, int arg1) {
        if (arg0) {
            ++field2018;
            if (this.field2190 != arg1) {
                this.field2190 = arg1;
                this.method1052(-75);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)I")
    public final int method1060(byte arg0) {
        if (arg0 != -14) {
            return -68;
        } else {
            ++field1964;
            return this.field2177;
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(B)V")
    public abstract void method1061(byte arg0);

    @OriginalMember(owner = "client!wk", name = "la", descriptor = "()V")
    public final void method463() {
        this.field2166 = 0;
        this.field2199 = 0;
        this.field2171 = this.field1995;
        ++field2002;
        this.field2143 = this.field1956;
        if (this.field2251) {
            this.field2251 = false;
            this.method1103((byte) 6);
        }
        this.method1096((byte) -65);
    }

    @OriginalMember(owner = "client!wk", name = "JA", descriptor = "(IIIIII)I")
    public final int method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2007;
        int var7 = 0;
        float var8 = (float) arg2 * this.field2123.field6654 + (float) arg0 * this.field2123.field6645 + (float) arg1 * this.field2123.field6652 + this.field2123.field6651;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field2123.field6654 + (float) arg3 * this.field2123.field6645 + (float) arg4 * this.field2123.field6652 + this.field2123.field6651;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field2220 > var8 && var9 < (float) this.field2220) {
            var7 |= 16;
        } else if (var8 > (float) this.field2149 && var9 > (float) this.field2149) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field2123.field6646 + (float) arg0 * this.field2123.field6643 + (float) arg1 * this.field2123.field6667 + this.field2123.field6674) * (float) this.field2192 / var8);
        int var11 = (int) (((float) arg5 * this.field2123.field6646 + (float) arg3 * this.field2123.field6643 + (float) arg4 * this.field2123.field6667 + this.field2123.field6674) * (float) this.field2192 / var9);
        if ((float) var10 < this.field2198 && (float) var11 < this.field2198) {
            var7 |= 1;
        } else if (this.field2194 < (float) var10 && (float) var11 > this.field2194) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field2123.field6666 + (float) arg0 * this.field2123.field6656 + (float) arg1 * this.field2123.field6644 + this.field2123.field6650) * (float) this.field2156 / var8);
        int var13 = (int) (((float) arg5 * this.field2123.field6666 + (float) arg3 * this.field2123.field6656 + (float) arg4 * this.field2123.field6644 + this.field2123.field6650) * (float) this.field2156 / var9);
        if ((float) var12 < this.field2176 && (float) var13 < this.field2176) {
            var7 |= 4;
        } else if ((float) var12 > this.field2183 && (float) var13 > this.field2183) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "(I)V")
    public abstract void method1062(int arg0);

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(B)V")
    private final void method1063(byte arg0) {
        ++field2103;
        if (class310.field4615 != this.field2153) {
            class428 var2 = this.field2153;
            this.field2153 = class310.field4615;
            if (!var2.method2547(0)) {
                this.method1167(262144);
            }
            this.method1076(13);
            this.field2208 = this.field2142;
            this.method1143(1);
            this.field2135 &= -8;
        }
        if (arg0 >= -99) {
            this.method1129((class770) null, (class345) null, 14);
        }
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(B)I")
    public final int method1064(byte arg0) {
        if (arg0 < 9) {
            this.method1115((byte) -103);
        }
        ++field2013;
        return this.field2219;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILpg;)V")
    public abstract void method1065(int arg0, class762 arg1);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([[IZII)Lbv;")
    public abstract class320 method1066(int[][] arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Leh;)V")
    public final void method445(class378 arg0) {
        this.field2123 = (class468) arg0;
        ++field2042;
        this.field2125.method1950(this.field2123);
        this.field2125.method2765((byte) -30);
        this.field2126.method2776(-7, this.field2125);
        this.field2124.method2776(-100, this.field2123);
        if (this.field2153.method2547(0)) {
            this.method1167(262144);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2030;
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
        this.method1107((byte) 111);
        this.method1059(true, arg4);
        this.method1056(32, class490.field6966, 0);
        this.method1157(1, 0, class490.field6966);
        this.method1087((byte) -113, arg5);
        this.method1079(0);
        int var14 = arg8 % (arg6 + arg7);
        this.method1089((byte) 95, false);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~var14 >= ~arg6) {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        } else {
            var18 = (float) (arg6 - (-arg7 + var14)) * var11;
            var17 = (float) (-var14 + arg6 + arg7) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg2 > arg0) {
                if ((float) arg2 < var21) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if ((float) arg2 > var21) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg1 < arg3) {
                if ((float) arg3 < var22) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 - var22;
                }
            } else {
                if (var22 < (float) arg3) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method1111(var22, 0.0F, var19 + var21, var21, 3, var20 + var22, 0.0F)) {
                return;
            }
            var21 += var19 + var23;
            this.method1161(-11367);
            var22 += var20 + var24;
            var20 = var16;
            var19 = var15;
        }
        this.method1089((byte) 95, true);
        this.method1157(1, 0, class412.field5814);
        this.method1056(32, class412.field5814, 0);
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(B)V")
    public static void method1067(byte arg0) {
        int var1 = 100 / ((57 - arg0) / 63);
        field2055 = null;
    }

    @OriginalMember(owner = "client!wk", name = "KA", descriptor = "(IIII)V")
    public final void method455(int arg0, int arg1, int arg2, int arg3) {
        ++field2043;
        if (~arg0 >= -1 && arg2 >= this.field1956 - 1 && arg1 <= 0 && arg3 >= this.field1995 + -1) {
            this.method463();
        } else {
            this.field2166 = arg1 >= 0 ? arg1 : 0;
            this.field2143 = ~arg2 < ~this.field1956 ? 0 : arg2;
            this.field2199 = ~arg0 > -1 ? 0 : arg0;
            this.field2171 = arg3 <= this.field1956 ? arg3 : 0;
            if (!this.field2251) {
                this.field2251 = true;
                this.method1103((byte) 6);
            }
            this.method1156(-559);
            this.method1096((byte) -55);
        }
    }

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "(B)V")
    private final void method1068(byte arg0) {
        int var2 = 58 % ((20 - arg0) / 46);
        ++field2026;
        this.field2240 = this.method1139(6, false);
        this.field2240.method3457(3096, 12, 3882);
        for (int var3 = 0; var3 < 4; ++var3) {
            Buffer var4 = this.field2240.method3454(13952, true);
            if (var4 != null) {
                Stream var5 = this.method1127(92, var4);
                var5.method3955(0.0F);
                var5.method3955(0.0F);
                var5.method3955(0.0F);
                for (int var6 = 0; ~var6 >= -257; ++var6) {
                    double var7 = (double) (var6 * 2) * 3.141592653589793D / 256.0D;
                    float var9 = (float) Math.cos(var7);
                    float var10 = (float) Math.sin(var7);
                    if (Stream.method3956()) {
                        var5.method3955(var10);
                        var5.method3955(var9);
                        var5.method3955(0.0F);
                    } else {
                        var5.method3949(var10);
                        var5.method3949(var9);
                        var5.method3949(0.0F);
                    }
                }
                var5.method3959();
                if (this.field2240.method3456((byte) 71)) {
                    break;
                }
            }
        }
        this.field2246 = this.method1086(5678, new class491[] { new class491(class652.field9189) });
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)V")
    public abstract void method1069(int arg0, byte arg1);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILofa;Lkn;)Z")
    public abstract boolean method1070(int arg0, class345 arg1, class770 arg2);

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "(I)V")
    public abstract void method1071(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZ)V")
    public final void method1072(byte arg0, boolean arg1) {
        this.method1059(true, arg0 << 8 | arg0 << 16 | arg0 << 24 | arg0);
        ++field2028;
        if (arg1) {
            this.field2137 = 11;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lpd;I)V")
    public final void method1073(class267 arg0, int arg1) {
        this.field2163[this.field2219] = arg0;
        ++field2111;
        if (arg1 != 25216) {
            this.method1072((byte) 56, true);
        }
        this.method1102(10);
    }

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "(I)V")
    public final void method1074(int arg0) {
        ++field1992;
        if (arg0 != 15706) {
            this.method1145(-70);
        }
        Hashtable var2 = new Hashtable();
        if (this.field2024 != null && !this.field2024.isEmpty()) {
            Enumeration var3 = this.field2024.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1169(var4, (byte) -45));
            }
        }
        this.field2024 = var2;
        this.method1164(-50);
        this.method1138(1);
        this.method1068((byte) 89);
        this.field2173.method3349((byte) -46, this);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILofa;ZII[FI)Lkt;")
    public abstract class166 method1075(int arg0, int arg1, class345 arg2, boolean arg3, int arg4, int arg5, float[] arg6, int arg7);

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "()Z")
    public final boolean method509() {
        ++field2098;
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "(I)V")
    private final void method1076(int arg0) {
        if (!this.field2132) {
            float[] var2 = this.field2142;
            float var3 = (float) this.field2220;
            float var4 = (float) this.field2149;
            float var5 = (float) (-this.field2205) * this.field2181 / (float) this.field2156;
            float var6 = (float) (-this.field2211) * this.field2181 / (float) this.field2192;
            float var7 = (float) (-this.field2211 + this.field1956) * this.field2181 / (float) this.field2192;
            float var8 = (float) (this.field1995 - this.field2205) * this.field2181 / (float) this.field2156;
            if (var6 != var7 && var5 != var8) {
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[14] = var3 / (var3 - var4);
                var2[0] = 2.0F / (-var6 + var7);
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F / (-var4 + var3);
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[8] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[5] = 2.0F / (-var5 + var8);
            } else {
                var2[12] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[13] = 0.0F;
            }
            this.method1082((byte) -104);
            this.field2132 = true;
        }
        if (arg0 == 13) {
            ++field2041;
        }
    }

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        ++field2023;
        client var1 = class364.field5270;
        synchronized (class364.field5270) {
            if (class677.field9637 == null) {
                if (arg0 == 128) {
                    Container var2;
                    if (class463.field6617 == null) {
                        if (class535.field7544 != null) {
                            var2 = class535.field7544;
                        } else {
                            var2 = class119.field1498;
                        }
                    } else {
                        var2 = class463.field6617;
                    }
                    class133.field1735 = var2.getSize().width;
                    class711.field10013 = var2.getSize().height;
                    if (class463.field6617 == var2) {
                        Insets var3 = class463.field6617.getInsets();
                        class711.field10013 -= var3.top + var3.bottom;
                        class133.field1735 -= var3.right + var3.left;
                    }
                    if (~class100.method704(arg0 + -128) != -2) {
                        class345.method2194((byte) 64);
                    } else {
                        class273.field3812 = 0;
                        class638.field8980 = class785.field10790;
                        class457.field6547 = (-class785.field10790 + class133.field1735) / 2;
                        class512.field7325 = class264.field3734;
                    }
                    if (class256.field3599 != class177.field2704) {
                        boolean var10000;
                        if (~class638.field8980 > -1025 && class512.field7325 < 768) {
                            var10000 = true;
                        } else {
                            var10000 = false;
                        }
                    }
                    class359.field5219.setSize(class638.field8980, class512.field7325);
                    if (class638.field8979 != null) {
                        if (!class607.field8578) {
                            class638.field8979.method505(class359.field5219, class638.field8980, class512.field7325);
                        } else {
                            class723.method4071(class359.field5219, 6412);
                        }
                    }
                    if (class463.field6617 == var2) {
                        Insets var4 = class463.field6617.getInsets();
                        class359.field5219.setLocation(class457.field6547 + var4.left, class273.field3812 + var4.top);
                    } else {
                        class359.field5219.setLocation(class457.field6547, class273.field3812);
                    }
                    if (~class251.field3546 != 0) {
                        class126.method924(true, (byte) 102);
                    }
                    class127.method926(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZZZI)V")
    public final void method1078(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        ++field1978;
        if (~this.field2168 != ~arg3 || !this.field2154 == this.field2138) {
            class166 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field2154 ? 0 : 3;
            if (arg3 < 0) {
                this.method1048(true);
            } else {
                var5 = this.field2227.method4292(arg3, (byte) -70);
                class181 var10 = super.field883.method1263(arg3, (byte) 123);
                if (~var10.field2740 == -1 && ~var10.field2736 == -1) {
                    this.method1048(true);
                } else {
                    int var11 = !var10.field2742 ? 128 : 64;
                    int var12 = var11 * 50;
                    class468 var13 = this.method1043(false);
                    var13.method2773((byte) 61, 0.0F, (float) (this.field2209 % var12 * var10.field2736) / (float) var12, (float) (this.field2209 % var12 * var10.field2740) / (float) var12);
                    this.method1073(class505.field7237, 25216);
                }
                var6 = var10.field2746;
                if (!this.field2154) {
                    var7 = var10.field2737;
                    var8 = var10.field2749;
                    var9 = var10.field2745;
                }
            }
            this.method1040((byte) -74, var9, arg0, var8, arg1, var7);
            if (this.field2179 != null) {
                this.field2179.method570(2305, var5, var6);
            } else {
                this.method1104(true, var5);
                this.method1088((byte) -31, var6);
            }
            this.field2168 = arg3;
            this.field2138 = this.field2154;
        }
        if (!arg2) {
            this.method1167(-47);
        }
        this.field2135 &= -8;
    }

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "(I)V")
    public final void method1079(int arg0) {
        ++field2066;
        this.field2109.method1956();
        this.field2110 = true;
        this.method1150(true);
        if (arg0 != 0) {
            this.field2136 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "()Leh;")
    public final class378 method493() {
        ++field2100;
        return this.field2123;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(ZI)V")
    public final void method1080(boolean arg0, int arg1) {
        ++field1975;
        if (arg1 != -3662) {
            this.field2147 = 62;
        }
        if (!arg0 == this.field2224) {
            this.field2224 = arg0;
            this.method1134(123);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZ)Lqda;")
    public final class112 method502(int arg0, int arg1, boolean arg2) {
        ++field1983;
        return new class332(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "(I)V")
    public abstract void method1081(int arg0);

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "(B)V")
    private final void method1082(byte arg0) {
        if (arg0 != -104) {
            this.field2205 = -51;
        }
        this.field2193 = (float) this.field2149;
        ++field2087;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILofa;[BIIZI)Lkt;")
    public abstract class166 method1083(int arg0, int arg1, class345 arg2, byte[] arg3, int arg4, int arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "(B)V")
    public final void method1084(byte arg0) {
        if (this.field2135 != 4) {
            this.method1050(25742);
            this.method1146(false, 4);
            this.method1054(false, -8);
            this.method1128(true, false);
            this.method1171((byte) -125, false);
            this.method1078(false, false, true, -2);
            this.method1087((byte) -33, 1);
            this.method1088((byte) -31, 0);
            this.field2135 = 4;
        }
        if (arg0 <= 35) {
            this.method1048(true);
        }
        ++field1937;
    }

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "(I)F")
    public abstract float method1085(int arg0);

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "(IIIII)V")
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2017;
        this.method438(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lqe;)Lbw;")
    public abstract class715 method1086(int arg0, class491[] arg1);

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "()Z")
    public final boolean method465() {
        ++field1932;
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)V")
    public final void method1087(byte arg0, int arg1) {
        ++field2089;
        if (arg0 > -30) {
            this.field2128 = null;
        }
        if (this.field2139 != arg1) {
            boolean var3;
            boolean var4;
            class41 var5;
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    var3 = true;
                    var4 = false;
                    var5 = class64.field863;
                } else if (~arg1 != -129) {
                    var4 = false;
                    var3 = false;
                    var5 = class403.field5704;
                } else {
                    var5 = class550.field7775;
                    var3 = true;
                    var4 = true;
                }
            } else {
                var3 = true;
                var4 = true;
                var5 = class213.field3080;
            }
            if (!var4 != !this.field2133) {
                this.field2133 = var4;
                this.method1141(13);
            }
            if (this.field2148 == !var3) {
                this.field2148 = var3;
                this.method1145(-31817);
            }
            if (this.field2213 != var5) {
                this.field2213 = var5;
                this.method1170((byte) 89);
            }
            this.field2135 &= -29;
            this.field2139 = arg1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Ljw;)V")
    public final void method429(int arg0, class578[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field2215[var3] = arg1[var3];
        }
        ++field2059;
        this.field2223 = arg0;
        if (this.field2153.method2547(0)) {
            this.method1154(true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(BI)V")
    public final void method1088(byte arg0, int arg1) {
        ++field1947;
        if (arg0 != -31) {
            this.method1121(-58);
        }
        if (~arg1 == -2) {
            this.method1136((byte) -107, class438.field6278, class438.field6278);
        } else if (~arg1 != -1) {
            if (~arg1 != -3) {
                if (~arg1 != -4) {
                    if (arg1 == 4) {
                        this.method1136((byte) -125, class730.field10204, class730.field10204);
                        return;
                    }
                } else {
                    this.method1136((byte) -108, class576.field8141, class174.field2460);
                }
            } else {
                this.method1136((byte) -96, class468.field6696, class438.field6278);
            }
        } else {
            this.method1136((byte) -125, class174.field2460, class174.field2460);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(BZ)V")
    public abstract void method1089(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "(I)V")
    public abstract void method1090(int arg0);

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "()I")
    public final int method460() {
        ++field2119;
        return this.field2220;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([I)V")
    public final void method470(int[] arg0) {
        arg0[0] = this.field1956;
        arg0[1] = this.field1995;
        ++field1967;
    }

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "(ILaa;II)V")
    public final void method494(int arg0, class510 arg1, int arg2, int arg3) {
        ++field1953;
        class739 var5 = (class739) arg1;
        class166 var6 = var5.field10304;
        this.method1166(-9244);
        this.method1104(true, var6);
        this.method1087((byte) -88, 1);
        this.method1136((byte) -92, class438.field6278, class438.field6278);
        this.method1056(32, class490.field6966, 0);
        this.method1059(true, arg0);
        this.field2109.method2769(0.0F, (float) this.field1995, (float) this.field1956, 111);
        this.method1122((byte) 101);
        this.field2164[0].method2769(1.0F, var6.method36(-104, (float) this.field1995), var6.method39(2170, (float) this.field1956), 90);
        this.field2164[0].method2760(0.0F, var6.method39(2170, (float) (-arg2)), 3, var6.method36(-97, (float) (-arg3)));
        this.field2163[0] = class505.field7237;
        this.method1102(-110);
        this.method1118((byte) 115);
        this.method1048(true);
        this.method1056(32, class412.field5814, 0);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BILfka;)V")
    public abstract void method1091(byte arg0, int arg1, class741 arg2);

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "()I")
    public final int method466() {
        ++field2003;
        return this.field2115 + this.field2108 + this.field2117;
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "(I)V")
    public abstract void method1092(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
    public final void method1093(int arg0, boolean arg1) {
        if (arg0 == 768) {
            if (this.field2161 == !arg1) {
                this.field2161 = arg1;
                this.method1124(false);
            }
            ++field1941;
        }
    }

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "()[I")
    public final int[] method469() {
        ++field2060;
        return new int[] { this.field2211, this.field2205, this.field2192, this.field2156 };
    }

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "(B)V")
    private final void method1094(byte arg0) {
        ++field2004;
        if (!this.field2202) {
            float[] var2 = this.field2216;
            float var3 = (float) (-this.field2211 * this.field2220) / (float) this.field2192;
            float var4 = (float) ((this.field1956 - this.field2211) * this.field2220) / (float) this.field2192;
            float var5 = (float) (this.field2220 * this.field2205) / (float) this.field2156;
            float var6 = (float) ((-this.field1995 + this.field2205) * this.field2220) / (float) this.field2156;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field2220 * 2.0F;
                var2[14] = this.field2141 = (float) (this.field2220 * this.field2149) / (float) (-this.field2149 + this.field2220);
                var2[11] = -1.0F;
                var2[15] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[13] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[10] = this.field2206 = (float) this.field2149 / (float) (this.field2220 - this.field2149);
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
            } else {
                var2[0] = 1.0F;
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[10] = 1.0F;
            }
            this.method1152((byte) 123);
            this.field2202 = true;
        }
        if (arg0 != -23) {
            field2074 = 96;
        }
    }

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "()Leh;")
    public final class378 method462() {
        ++field1931;
        return new class468();
    }

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "(I)V")
    public abstract void method1095(int arg0);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
    public final void method395() {
        ++field1942;
        if (this.field2227 != null) {
            this.field2227.method4288((byte) -102);
        }
    }

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "(B)V")
    private final void method1096(byte arg0) {
        this.field2194 = (float) (-this.field2211 + this.field2143);
        this.field2183 = (float) (this.field2171 - this.field2205);
        ++field2121;
        this.field2176 = (float) (-this.field2205 + this.field2166);
        int var2 = -77 % (arg0 / 54);
        this.field2198 = (float) (-this.field2211 + this.field2199);
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(Z)V")
    private final void method1097(boolean arg0) {
        if (arg0) {
            this.method438(9, 6, 15, -81, 89, -75);
        }
        ++field1997;
        if (!this.field2169) {
            float[] var2 = this.field2214;
            if (this.field1956 != 0 && this.field1995 != 0) {
                var2[0] = 2.0F / (float) this.field1956;
                var2[8] = 0.0F;
                var2[14] = 0.5F;
                var2[10] = 0.5F;
                var2[13] = 1.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = -2.0F / (float) this.field1995;
                var2[12] = -1.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
            } else {
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 1.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = 1.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
            }
            this.field2169 = true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "EA", descriptor = "(IIII)V")
    public final void method411(int arg0, int arg1, int arg2, int arg3) {
        ++field2062;
        if (!this.field2154) {
            throw new RuntimeException("");
        } else {
            this.field2177 = arg1;
            this.field2152 = arg0;
            this.field2178 = arg3;
            this.field2150 = arg2;
            if (this.field2138) {
                this.field2204[3].method1606(8261);
                this.field2204[3].method1268(81);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZLeca;)V")
    public abstract void method1098(int arg0, int arg1, boolean arg2, class789 arg3);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILbw;)V")
    public abstract void method1099(int arg0, class715 arg1);

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "(B)V")
    public abstract void method1100(byte arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lkf;[Lre;Z)Lda;")
    public final class67 method403(class263 arg0, class625[] arg1, boolean arg2) {
        ++field2009;
        return new class773(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "()Z")
    public final boolean method424() {
        ++field2114;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        ++field2056;
    }

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "(B)[F")
    public final float[] method1101(byte arg0) {
        int var2 = 90 % ((-79 - arg0) / 37);
        ++field2120;
        return this.field2158;
    }

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "(I)V")
    private final void method1102(int arg0) {
        ++field2036;
        int var2 = 117 / ((73 - arg0) / 52);
        this.method1155((byte) 14);
        if (this.field2179 != null) {
            this.field2179.method908((byte) 105);
        }
    }

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "(B)V")
    public abstract void method1103(byte arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLdr;)V")
    public final void method1104(boolean arg0, class749 arg1) {
        ++field2067;
        if (this.field2218[this.field2219] != arg1) {
            this.field2218[this.field2219] = arg1;
            if (arg1 != null) {
                arg1.method2686(32104);
            } else {
                this.method1071(12);
            }
            this.field2135 &= -2;
        }
        if (!arg0) {
            this.field2127 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z[BIILofa;Z)Lkt;")
    public final class166 method1105(boolean arg0, byte[] arg1, int arg2, int arg3, class345 arg4, boolean arg5) {
        ++field2044;
        return !arg0 ? null : this.method1083(arg3, 0, arg4, arg1, 107, 0, arg5, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field2058;
        boolean var5 = false;
        if (arg0 > this.field2199) {
            var5 = true;
            this.field2199 = arg0;
        }
        if (~this.field2143 < ~arg2) {
            var5 = true;
            this.field2143 = arg2;
        }
        if (~arg1 < ~this.field2166) {
            var5 = true;
            this.field2166 = arg1;
        }
        if (~this.field2171 < ~arg3) {
            var5 = true;
            this.field2171 = arg3;
        }
        if (var5) {
            if (!this.field2251) {
                this.field2251 = true;
                this.method1103((byte) 6);
            }
            this.method1156(-559);
            this.method1096((byte) -100);
        }
    }

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "(B)I")
    public final int method1106(byte arg0) {
        ++field1935;
        if (arg0 < 95) {
            this.method1124(true);
        }
        return this.field2178;
    }

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "(B)V")
    private final void method1107(byte arg0) {
        if (this.field2135 != 1) {
            this.method1050(25742);
            this.method1146(false, 4);
            this.method1054(false, -8);
            this.method1128(true, false);
            this.method1171((byte) -115, false);
            this.method1078(false, false, true, -2);
            this.method1088((byte) -31, 1);
            this.method1104(true, this.field2200);
            this.field2135 = 1;
        }
        ++field2113;
        if (arg0 != 111) {
            this.method1117(-90);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lsi;II)V")
    private final void method1108(class583 arg0, int arg1, int arg2) {
        ++field2122;
        if (arg1 != 4) {
            this.method1105(true, (byte[]) null, 65, 82, (class345) null, false);
        }
        this.method1091((byte) 75, 0, this.field2234);
        this.method1099(63, this.field2231);
        this.method1147(1, arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIIZ)Lqda;")
    public final class112 method504(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2012;
        class332 var6 = new class332(this, arg2, arg3, arg4);
        var6.method782(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!wk", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method499(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field1946;
        boolean var7 = this.field2187 != arg0;
        if (var7 || this.field2217 != arg1 || this.field2188 != arg2) {
            this.field2188 = arg2;
            this.field2187 = arg0;
            this.field2217 = arg1;
            if (var7) {
                this.field2144 = (float) (65280 & this.field2187) / 65280.0F;
                this.field2221 = (float) (this.field2187 & 255) / 255.0F;
                this.field2212 = (float) (16711680 & this.field2187) / 1.671168E7F;
                this.method1049(-12782);
            }
            this.field2037.setSunColour(this.field2212, this.field2144, this.field2221, arg1, arg2);
            this.method1062(-14605);
        }
        if (this.field2136[0] != arg3 || this.field2136[1] != arg4 || this.field2136[2] != arg5) {
            this.field2136[0] = arg3;
            this.field2136[1] = arg4;
            this.field2136[2] = arg5;
            this.field2222[2] = -arg5;
            this.field2222[0] = -arg3;
            this.field2222[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field2172[2] = arg5 * var8;
            this.field2172[1] = arg4 * var8;
            this.field2172[0] = arg3 * var8;
            this.field2189[2] = -this.field2172[2];
            this.field2189[0] = -this.field2172[0];
            this.field2189[1] = -this.field2172[1];
            this.field2037.setSunDirection(this.field2172[0], this.field2172[1], this.field2172[2]);
            this.method1092(88);
            this.field2140 = (int) (arg3 * 256.0F / arg4);
            this.field2151 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1090(1);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method405(Canvas arg0) {
        ++field1933;
        if (this.field1961 == arg0) {
            throw new RuntimeException();
        } else if (this.field2024.containsKey(arg0)) {
            this.method1132(17360, this.field2024.get(arg0), arg0);
            this.field2024.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZI)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1109(int arg0, boolean arg1, int arg2) {
        if (arg0 != 1) {
            this.field2175 = 2.1195343F;
        }
        ++field2048;
        return this.field2040.method3946(arg2, arg1);
    }

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "(I)V")
    private final void method1110(int arg0) {
        this.method1049(-12782);
        ++field2081;
        this.method1062(arg0 ^ -15074);
        if (arg0 != 1005) {
            this.field2137 = -14;
        }
        this.method1124(false);
        this.method1154(true);
        this.method1092(123);
        this.method1090(1);
        this.method1134(-107);
        this.method1061((byte) -78);
        this.method1081(-114);
        this.method1148(false);
        this.method1051(false);
        this.method1145(-31817);
        this.method1170((byte) 89);
        this.method1141(13);
        for (int var2 = this.field2197 + -1; var2 >= 0; --var2) {
            this.method1140((byte) -116, var2);
            this.method1095(29);
            this.method1039(1);
            this.method1048(true);
        }
        this.method1052(-76);
        this.method1151((byte) 28);
        this.method1100((byte) 100);
        this.method1144((byte) -96);
        this.method1117(0);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(FFFFIFF)Z")
    private final boolean method1111(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, float arg6) {
        ++field2052;
        Buffer var8 = this.field2244.method3454(13952, true);
        if (var8 == null) {
            return false;
        } else if (arg4 != 3) {
            return true;
        } else {
            Stream var9 = this.method1127(120, var8);
            if (Stream.method3956()) {
                var9.method3955(arg3);
                var9.method3955(arg0);
                var9.method3955(arg1);
                var9.method3955(arg2);
                var9.method3955(arg5);
                var9.method3955(arg6);
            } else {
                var9.method3949(arg3);
                var9.method3949(arg0);
                var9.method3949(arg1);
                var9.method3949(arg2);
                var9.method3949(arg5);
                var9.method3949(arg6);
            }
            var9.method3959();
            return this.field2244.method3456((byte) 71);
        }
    }

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "(I)V")
    public void method1112(int arg0) {
        this.method1110(1005);
        if (arg0 < 13) {
            this.field2164 = null;
        }
        ++field1945;
    }

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "(IIIII)V")
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method438(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
        ++field2075;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIF)Ljw;")
    public final class578 method492(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field2064;
        return new class444(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "(I)V")
    public final void method1113(int arg0) {
        ++field1958;
        if (arg0 == 16) {
            if (~this.field2135 != -17) {
                this.method1063((byte) -118);
                this.method1146(true, 4);
                this.method1128(true, true);
                this.method1171((byte) -99, true);
                this.method1087((byte) -37, 1);
                this.field2135 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "aa", descriptor = "(IIIIII)V")
    public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1107((byte) 111);
        ++field2035;
        this.method1059(true, arg4);
        this.method1056(32, class490.field6966, 0);
        this.method1157(1, 0, class490.field6966);
        this.method1087((byte) -42, arg5);
        this.field2109.method2769(1.0F, (float) arg3, (float) arg2, -17);
        this.field2109.method1952(arg0, arg1, 0);
        this.method1122((byte) 125);
        this.method1089((byte) 95, false);
        this.method1118((byte) 109);
        this.method1089((byte) 95, true);
        this.method1157(1, 0, class412.field5814);
        this.method1056(32, class412.field5814, 0);
    }

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "(B)V")
    private final void method1114(byte arg0) {
        ++field2092;
        if (this.field2015 == null) {
            this.field2104 = this.field2014 = 1;
        } else {
            Dimension var2 = this.field2015.getSize();
            this.field2104 = var2.width;
            this.field2014 = var2.height;
        }
        int var3 = 20 / ((arg0 - -61) / 39);
        this.field1956 = this.field2104;
        this.field1995 = this.field2014;
        this.method1137((byte) -40);
        this.method1042(0);
        this.method1044(-106);
        this.method1151((byte) 28);
        this.method1096((byte) -77);
        this.method1121(-1);
        this.method463();
    }

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "()Z")
    public final boolean method475() {
        ++field2006;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "(B)Lpr;")
    public final class468 method1115(byte arg0) {
        ++field2031;
        return arg0 != -99 ? null : this.field2109;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lpr;I)V")
    public final void method1116(class468 arg0, int arg1) {
        this.field2109.method1950(arg0);
        ++field1986;
        this.field2110 = false;
        this.method1150(true);
        if (arg1 != 2) {
            this.method504(31, 11, 15, -54, true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method498(Canvas arg0, int arg1, int arg2) {
        ++field1970;
        if (this.field1961 == arg0) {
            throw new RuntimeException();
        } else if (!this.field2024.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method1169(arg0, (byte) -45);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field2024.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lcb;II)V")
    public class151(Canvas arg0, Object arg1, class159 arg2, class544 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field1940 = this.field1979 = arg1;
            this.field2038 = arg3;
            this.field2015 = this.field1961 = arg0;
            this.field2207 = arg4;
            Dimension var7 = arg0.getSize();
            this.field1956 = this.field2104 = var7.width;
            this.field1995 = this.field2014 = var7.height;
            this.field2134 = arg5;
            class211.method1486(false, true, (byte) -1);
            if (super.field883 != null) {
                this.field2227 = new class783(this, super.field883);
                this.field2037 = new NativeInterface(super.field883.method1264(14699), this.field2134);
                for (int var8 = 0; ~var8 > ~super.field883.method1264(14699); ++var8) {
                    class181 var9 = super.field883.method1263(var8, (byte) 124);
                    if (var9 != null) {
                        this.field2037.initTextureMetrics(var8, var9.field2748, var9.field2739);
                    }
                }
            } else {
                this.field2037 = new NativeInterface(0, this.field2134);
                this.field2227 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method450(1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lza;)V")
    public final void method439(class432 arg0) {
        ++field2079;
        this.field2040 = ((class90) arg0).field1166;
        this.field2105 = this.field2040.method3946(32768, false);
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(II)I")
    public final int method451(int arg0, int arg1) {
        ++field2010;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class292 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2071;
        return new class157(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
    public final void method458(int arg0) {
        ++field2093;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            if (this.field2227 != null) {
                this.field2227.method4288((byte) -102);
            }
            this.field2137 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "(I)V")
    public abstract void method1117(int arg0);

    @OriginalMember(owner = "client!wk", name = "xa", descriptor = "(F)V")
    public final void method506(float arg0) {
        if (this.field2191 != arg0) {
            this.field2191 = arg0;
            this.field2037.setAmbient(arg0);
            this.method1049(-12782);
            this.method1090(1);
        }
        ++field1944;
    }

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        if (this.field2180 != arg0 || this.field2201 != arg1 || ~this.field2157 != ~arg2) {
            this.field2201 = arg1;
            this.field2180 = arg0;
            this.field2157 = arg2;
            this.method1119((byte) -116);
            this.method1148(false);
        }
        ++field2097;
    }

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "(B)V")
    public final void method1118(byte arg0) {
        this.method1108(class375.field5405, 4, 2);
        if (arg0 >= 101) {
            ++field1938;
        }
    }

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "()V")
    public void method447() {
        if (!this.field2182) {
            for (class540 var1 = this.field1950.method2508((byte) -114); var1 != null; var1 = this.field1950.method2505((byte) -55)) {
                ((class90) var1).method639((byte) 42);
            }
            Enumeration var2 = this.field2024.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1132(17360, this.field2024.get(var3), var3);
            }
            class209.method1485(false, (byte) 30, true);
            this.field2037.release();
            this.field2182 = true;
        }
        ++field2025;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([IIIIIZ)Lqda;")
    public final class112 method481(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1968;
        return new class332(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)V")
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2101;
        float var8 = (float) (-arg0) + (float) arg2;
        float var9 = (float) arg3 - (float) arg1;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method1107((byte) 111);
        this.method1059(true, arg4);
        this.method1056(32, class490.field6966, 0);
        this.method1157(1, 0, class490.field6966);
        this.method1087((byte) -126, arg6);
        this.field2109.method2769(1.0F, (float) arg5, var11, -64);
        this.field2109.method1952(0, -arg5 / 2, 0);
        this.field2109.method1942((int) ((double) var10 * 2607.5945876176133D) & 16383);
        this.field2109.method1952(arg0, arg1, 0);
        this.method1122((byte) -119);
        this.method1089((byte) 95, false);
        this.method1118((byte) 125);
        this.method1089((byte) 95, true);
        this.method1157(1, 0, class412.field5814);
        this.method1056(32, class412.field5814, 0);
    }

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "(B)V")
    private final void method1119(byte arg0) {
        if (arg0 != -116) {
            this.method490(3, -39, 12, 13, -44, 4, -26, 14, -67, 34, -98, -18, -98);
        }
        if (this.field2179 != null) {
            this.field2179.method1268(arg0 + 192);
        }
        ++field2073;
        this.method1051(false);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IF)V")
    public final void method1120(int arg0, float arg1) {
        ++field1991;
        if (arg0 != 16) {
            this.field2104 = 35;
        }
        if (this.field2181 != arg1) {
            this.field2181 = arg1;
            this.method1044(arg0 + 70);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lag;)V")
    public final void method484(class710 arg0) {
        this.field2167 = (class394) arg0;
        ++field1959;
    }

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "(I)V")
    public final void method1121(int arg0) {
        ++field1976;
        if (arg0 == -1) {
            if (class604.field8497 != this.field2153) {
                class428 var2 = this.field2153;
                this.field2153 = class604.field8497;
                if (var2.method2547(~arg0)) {
                    this.method1167(262144);
                }
                this.field2135 &= -32;
                this.field2208 = this.field2158;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "(B)V")
    public final void method1122(byte arg0) {
        this.field2110 = false;
        int var2 = -127 % ((51 - arg0) / 49);
        ++field1969;
        this.method1150(true);
    }

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "(I)V")
    public final void method1123(int arg0) {
        this.method1121(-1);
        ++field2070;
        if (arg0 != 7) {
            this.method1071(-82);
        }
        this.method1143(arg0 ^ 6);
    }

    @OriginalMember(owner = "client!wk", name = "ra", descriptor = "(IIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        this.field2152 = arg0;
        this.field2178 = arg3;
        this.field2154 = true;
        this.field2150 = arg2;
        ++field2077;
        this.field2177 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "()Z")
    public final boolean method436() {
        ++field2099;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lhea;I)V")
    public final void method464(class443 arg0, int arg1) {
        this.field2173.method3346(this, arg0, 94, arg1);
        ++field2076;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public final void method441(int arg0) {
        ++field2082;
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(Z)V")
    public abstract void method1124(boolean arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BILofa;III)Lpo;")
    public abstract class582 method1125(byte[] arg0, int arg1, class345 arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "()I")
    public final int method432() {
        ++field1948;
        return this.field2252;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lofa;ILkn;II)Lkt;")
    public abstract class166 method1126(class345 arg0, int arg1, class770 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method1127(int arg0, Buffer arg1) {
        this.field2228.method3960(arg1);
        ++field1985;
        int var3 = -21 / ((46 - arg0) / 41);
        return this.field2228;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZZ)V")
    public final void method1128(boolean arg0, boolean arg1) {
        if (!arg1 == this.field2170) {
            this.field2170 = arg1;
            this.method1061((byte) -63);
            this.field2135 &= -32;
        }
        ++field2078;
        if (!arg0) {
            this.field1995 = 74;
        }
    }

    @OriginalMember(owner = "client!wk", name = "XA", descriptor = "()I")
    public final int method425() {
        ++field2086;
        return this.field2149;
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(II)V")
    public final void method446(int arg0, int arg1) {
        if (this.field2220 != arg0 || ~this.field2149 != ~arg1) {
            this.field2149 = arg1;
            this.field2220 = arg0;
            this.method1042(0);
            this.method1044(-93);
            this.method1119((byte) -116);
        }
        ++field1939;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lkn;Lofa;I)Z")
    public abstract boolean method1129(class770 arg0, class345 arg1, int arg2);

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "([I)V")
    public final void method428(int[] arg0) {
        arg0[2] = this.field2143;
        arg0[1] = this.field2166;
        arg0[3] = this.field2171;
        ++field2084;
        arg0[0] = this.field2199;
    }

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "(I)I")
    public final int method1130(int arg0) {
        ++field2020;
        if (arg0 != 0) {
            this.field2142 = null;
        }
        return this.field2152;
    }

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "(B)V")
    public final void method1131(byte arg0) {
        if (~this.field2135 != -9) {
            this.method1149(arg0 ^ -9950);
            this.method1146(true, 4);
            this.method1128(true, true);
            this.method1171((byte) -117, true);
            this.method1087((byte) -84, 1);
            this.field2135 = 8;
        }
        ++field2054;
        if (arg0 != 38) {
            this.field2247 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field1971;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1132(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lsi;ILmq;IIII)V")
    public abstract void method1133(class583 arg0, int arg1, class532 arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "(I)V")
    public abstract void method1134(int arg0);

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "(B)I")
    public final int method1135(byte arg0) {
        if (arg0 != -100) {
            this.method471();
        }
        ++field2090;
        return this.field2150;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLada;Lada;)V")
    public final void method1136(byte arg0, class171 arg1, class171 arg2) {
        ++field2112;
        boolean var4 = false;
        if (this.field2128[this.field2219] != arg1) {
            this.field2128[this.field2219] = arg1;
            this.method1095(97);
            var4 = true;
        }
        if (this.field2226[this.field2219] != arg2) {
            this.field2226[this.field2219] = arg2;
            var4 = true;
            this.method1039(1);
        }
        if (var4) {
            this.field2135 &= -30;
        }
        if (arg0 >= -89) {
            this.field2192 = 13;
        }
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "(B)V")
    private final void method1137(byte arg0) {
        ++field2016;
        if (arg0 == -40) {
            this.field2169 = false;
            if (class400.field5681 == this.field2153) {
                this.method1097(false);
                this.method1143(1);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lhea;)V")
    public final void method437(class443 arg0) {
        ++field2021;
        this.field2173.method3346(this, arg0, -60, -1);
    }

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "(I)V")
    private final void method1138(int arg0) {
        ++field2046;
        this.field2244 = this.method1139(6, true);
        this.field2244.method3457(24, 12, arg0 ^ 3883);
        this.field2237 = this.method1086(5678, new class491[] { new class491(class652.field9189) });
        if (arg0 != 1) {
            this.field2161 = true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IZ)Lfka;")
    public abstract class741 method1139(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(BI)V")
    public final void method1140(byte arg0, int arg1) {
        ++field1963;
        if (~this.field2219 != ~arg1) {
            this.field2219 = arg1;
            this.method1158((byte) 101);
        }
        if (arg0 >= -11) {
            this.method1104(true, (class749) null);
        }
    }

    @OriginalMember(owner = "client!wk", name = "DA", descriptor = "(IIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3) {
        this.field2211 = arg0;
        ++field2032;
        this.field2205 = arg1;
        this.field2192 = arg2;
        this.field2156 = arg3;
        this.method1044(-79);
        this.method1042(0);
        this.method1121(-1);
        this.method1096((byte) -125);
    }

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "(I)V")
    public abstract void method1141(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
    public abstract void method1142(Canvas arg0, Object arg1, byte arg2);

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "(I)V")
    private final void method1143(int arg0) {
        this.method1100((byte) 103);
        if (arg0 != 1) {
            this.method1052(-85);
        }
        ++field2096;
        if (this.field2179 != null) {
            this.field2179.method1267((byte) 79);
        }
    }

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "(B)V")
    public abstract void method1144(byte arg0);

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "(I)V")
    public abstract void method1145(int arg0);

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(ZI)V")
    public final void method1146(boolean arg0, int arg1) {
        if (this.field2129 != arg0) {
            this.field2129 = arg0;
            this.method1148(false);
            this.field2135 &= -32;
        }
        if (arg1 != 4) {
            this.method432();
        }
        ++field1962;
    }

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "(I)Lza;")
    public final class432 method508(int arg0) {
        ++field1982;
        class90 var2 = new class90(arg0);
        this.field1950.method2510(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILsi;II)V")
    public abstract void method1147(int arg0, class583 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "(I)V")
    public final void method459(int arg0) {
        this.field2162 = 0;
        ++field2095;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field2162;
        }
        this.field2185 = 1 << this.field2162;
    }

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "(Z)V")
    public abstract void method1148(boolean arg0);

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "(I)V")
    private final void method1149(int arg0) {
        ++field1973;
        if (arg0 != -9980) {
            this.method1105(true, (byte[]) null, 7, 64, (class345) null, false);
        }
        if (class544.field7649 != this.field2153) {
            class428 var2 = this.field2153;
            this.field2153 = class544.field7649;
            if (!var2.method2547(arg0 ^ -9980)) {
                this.method1167(262144);
            }
            this.method1094((byte) -23);
            this.field2208 = this.field2216;
            this.method1143(1);
            this.field2135 &= -8;
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "()Z")
    public final boolean method422() {
        ++field2029;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "(Z)V")
    private final void method1150(boolean arg0) {
        ++field2047;
        if (class400.field5681 == this.field2153) {
            float var2 = this.method1085(8550);
            this.field2109.method2760(0.0F, var2, 3, var2);
        }
        if (arg0) {
            this.field2203 = false;
            this.method1144((byte) -96);
            if (this.field2179 != null) {
                this.field2179.method1265(-18866);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "pa", descriptor = "()V")
    public final void method418() {
        ++field1936;
        this.field2154 = false;
    }

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "(B)V")
    public abstract void method1151(byte arg0);

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "(B)V")
    private final void method1152(byte arg0) {
        this.field2216[14] = this.field2141;
        this.field2216[10] = this.field2206;
        ++field1990;
        if (arg0 != 123) {
            this.method1138(-100);
        }
        this.field2175 = (this.field2216[14] - (float) this.field2149) / this.field2216[10];
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method505(Canvas arg0, int arg1, int arg2) {
        ++field2102;
        Object var4 = null;
        if (arg0 != null && this.field1961 != arg0) {
            if (this.field2024.containsKey(arg0)) {
                var4 = this.field2024.get(arg0);
            }
        } else {
            var4 = this.field1940;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method1142(arg0, var4, (byte) 69);
            if (this.field2015 == arg0) {
                this.method1114((byte) 61);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public final void method393(boolean arg0) {
        ++field1934;
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(II)Lmq;")
    public final class532 method1153(int arg0, int arg1) {
        ++field2083;
        if (~(arg0 * arg1) < ~this.field2248.method51((byte) -105)) {
            this.field2248.method50(false, arg0);
        }
        return this.field2248;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)Lag;")
    public final class710 method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2118;
        return new class790(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "(Z)V")
    public void method1154(boolean arg0) {
        if (!arg0) {
            this.field2195 = -14;
        }
        ++field1957;
        this.field2225 = this.field2223;
        this.field2223 = 0;
    }

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "()Z")
    public final boolean method426() {
        ++field2069;
        return this.field2204[3].method571(-30998);
    }

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "()Z")
    public final boolean method434() {
        ++field2091;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "(B)V")
    public abstract void method1155(byte arg0);

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "(I)V")
    public abstract void method1156(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILeca;)V")
    public final void method1157(int arg0, int arg1, class789 arg2) {
        ++field2022;
        this.method1098(arg0 ^ 3714, arg1, false, arg2);
        if (arg0 != 1) {
            this.method1164(-103);
        }
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "()Z")
    public final boolean method423() {
        ++field1996;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "(B)V")
    public abstract void method1158(byte arg0);

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "(Z)V")
    public final void method408(boolean arg0) {
        this.field2130 = arg0;
        ++field1977;
        this.method1081(-118);
    }

    @OriginalMember(owner = "client!wk", name = "da", descriptor = "(III[I)V")
    public final void method500(int arg0, int arg1, int arg2, int[] arg3) {
        ++field2050;
        float var5 = this.field2123.method2762((float) arg0, (float) arg2, -93, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field2205;
            var7 = this.field2211;
        } else {
            var7 = (int) ((float) this.field2192 * this.field2123.method2772((float) arg1, (float) arg0, -5911, (float) arg2) / var5);
            var6 = (int) ((float) this.field2156 * this.field2123.method2766((byte) -93, (float) arg0, (float) arg2, (float) arg1) / var5);
        }
        arg3[0] = (int) ((float) var7 + -this.field2198);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field2176);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([FIILofa;IZ)Lkt;")
    public final class166 method1159(float[] arg0, int arg1, int arg2, class345 arg3, int arg4, boolean arg5) {
        ++field2085;
        if (arg4 >= -77) {
            this.method460();
        }
        return this.method1075(0, 0, arg3, arg5, arg2, arg1, arg0, -101);
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
    public void method473(int arg0) {
        ++field1960;
        if (this.field2227 != null) {
            this.field2227.method4291((byte) 126);
        }
        this.field2209 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z[F)[F")
    public final float[] method1160(boolean arg0, float[] arg1) {
        arg1[12] = this.field2208[3];
        arg1[4] = this.field2208[1];
        if (arg0) {
            this.field2251 = false;
        }
        arg1[0] = this.field2208[0];
        ++field2005;
        arg1[8] = this.field2208[2];
        arg1[13] = this.field2208[7];
        arg1[2] = this.field2208[8];
        arg1[5] = this.field2208[5];
        arg1[9] = this.field2208[6];
        arg1[1] = this.field2208[4];
        arg1[7] = this.field2208[13];
        arg1[10] = this.field2208[10];
        arg1[6] = this.field2208[9];
        arg1[14] = this.field2208[11];
        arg1[3] = this.field2208[12];
        arg1[11] = this.field2208[14];
        arg1[15] = this.field2208[15];
        return arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field2072;
    }

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "(I)V")
    private final void method1161(int arg0) {
        this.method1091((byte) 73, 0, this.field2244);
        ++field2065;
        if (arg0 != -11367) {
            this.field2150 = -115;
        }
        this.method1099(87, this.field2237);
        this.method1147(1, class31.field419, 1, 0);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(IZ)V")
    public final void method1162(int arg0, boolean arg1) {
        if (arg0 != 29595) {
            this.method1073((class267) null, -65);
        }
        if (this.field2165 != arg1) {
            this.field2165 = arg1;
            this.method1148(false);
        }
        ++field2027;
    }

    @OriginalMember(owner = "client!wk", name = "HA", descriptor = "(IIII[I)V")
    public final void method513(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field1954;
        float var6 = this.field2123.method2762((float) arg0, (float) arg2, -104, (float) arg1);
        if (!((float) this.field2220 > var6) && !(var6 > (float) this.field2149)) {
            int var7 = (int) ((float) this.field2192 * this.field2123.method2772((float) arg1, (float) arg0, -5911, (float) arg2) / (float) arg3);
            int var8 = (int) ((float) this.field2156 * this.field2123.method2766((byte) -93, (float) arg0, (float) arg2, (float) arg1) / (float) arg3);
            arg4[1] = (int) ((float) var8 - this.field2176);
            arg4[2] = (int) var6;
            arg4[0] = (int) ((float) var7 - this.field2198);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method1163(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "(I)V")
    private final void method1164(int arg0) {
        ++field2106;
        this.field2234 = this.method1139(6, false);
        if (arg0 <= -11) {
            this.field2234.method3457(140, 28, 3882);
            for (int var2 = 0; var2 < 4; ++var2) {
                Buffer var3 = this.field2234.method3454(13952, true);
                if (var3 != null) {
                    Stream var4 = this.method1127(-88, var3);
                    if (Stream.method3956()) {
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(1.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(1.0F);
                        var4.method3955(0.0F);
                        var4.method3955(1.0F);
                        var4.method3955(1.0F);
                        var4.method3955(1.0F);
                        var4.method3955(0.0F);
                        var4.method3955(1.0F);
                        var4.method3955(1.0F);
                        var4.method3955(1.0F);
                        var4.method3955(1.0F);
                        var4.method3955(1.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(1.0F);
                        var4.method3955(0.0F);
                        var4.method3955(1.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                        var4.method3955(0.0F);
                    } else {
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
                    }
                    var4.method3959();
                    if (this.field2234.method3456((byte) 71)) {
                        break;
                    }
                }
            }
            this.field2231 = this.method1086(5678, new class491[] { new class491(new class652[] { class652.field9189, class652.field9194, class652.field9194 }) });
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method398(int arg0) {
        ++field2049;
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "()Z")
    public final boolean method497() {
        ++field2094;
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lre;Z)Lqda;")
    public final class112 method482(class625 arg0, boolean arg1) {
        ++field2080;
        class112 var9;
        if (~arg0.field8827 != -1 && arg0.field8822 != 0) {
            int[] var3 = new int[arg0.field8827 * arg0.field8822];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field8820 != null) {
                for (int var6 = 0; var6 < arg0.field8822; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field8827; ++var7) {
                        var3[var5++] = class281.method1904(arg0.field8823[class111.method773(arg0.field8828[var4], 255)], arg0.field8820[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; var8 < arg0.field8822; ++var8) {
                    for (int var10 = 0; ~arg0.field8827 < ~var10; ++var10) {
                        int var11 = arg0.field8823[arg0.field8828[var4++] & 255];
                        var3[var5++] = ~var11 == -1 ? 0 : class281.method1904(var11, -16777216);
                    }
                }
            }
            var9 = this.method476(0, arg0.field8822, arg0.field8827, true, arg0.field8827, var3);
        } else {
            var9 = this.method476(0, 1, 1, true, 1, new int[1]);
        }
        var9.method790(arg0.field8826, arg0.field8825, arg0.field8824, arg0.field8821);
        return var9;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lhm;IIII)Lka;")
    public final class495 method420(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2019;
        return new class9(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "()Z")
    public final boolean method461() {
        ++field2068;
        return this.field2131;
    }

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "(Z)Lpr;")
    public final class468 method1165(boolean arg0) {
        ++field2039;
        if (arg0) {
            this.method1124(true);
        }
        return this.field2164[this.field2219];
    }

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "(I)V")
    public final void method1166(int arg0) {
        if (this.field2135 != 2) {
            this.method1050(25742);
            this.method1146(false, arg0 + 9248);
            this.method1054(false, -8);
            this.method1128(true, false);
            this.method1171((byte) -108, false);
            this.method1078(false, false, true, -2);
            this.field2135 = 2;
        }
        ++field1966;
        if (arg0 != -9244) {
            this.method437((class443) null);
        }
    }

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1980;
    }

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "(I)V")
    private final void method1167(int arg0) {
        if (arg0 != 262144) {
            this.field2188 = -1.1014084F;
        }
        this.field2203 = false;
        ++field2051;
        if (this.field2179 != null) {
            this.field2179.method1266(-9611);
        }
        this.method1117(0);
    }

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "()I")
    public final int method471() {
        ++field1998;
        return this.field2160 + -2;
    }

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "(I)Lpr;")
    public final class468 method1168(int arg0) {
        ++field2057;
        if (arg0 < 107) {
            this.field2185 = -110;
        }
        if (!this.field2203) {
            this.field2127.method2775(this.field2125, this.field2109);
            this.field2203 = true;
        }
        return this.field2127;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method510(Canvas arg0) {
        this.field2015 = null;
        this.field1940 = null;
        ++field2053;
        if (arg0 != null && this.field1961 != arg0) {
            if (this.field2024.containsKey(arg0)) {
                this.field1940 = this.field2024.get(arg0);
                this.field2015 = arg0;
            }
        } else {
            this.field2015 = this.field1961;
            this.field1940 = this.field1979;
        }
        if (this.field2015 != null && this.field1940 != null) {
            this.method1163(this.field1940, -1, this.field2015);
            this.method1114((byte) -113);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public abstract Object method1169(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "()Leh;")
    public final class378 method433() {
        ++field1989;
        return this.field2242;
    }

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "(B)V")
    public abstract void method1170(byte arg0);

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V")
    public final void method489(int arg0) {
        ++field1951;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(BZ)V")
    public final void method1171(byte arg0, boolean arg1) {
        ++field1993;
        if (!arg1 == this.field2159) {
            this.field2159 = arg1;
            this.method1081(-121);
            this.field2135 &= -32;
        }
        if (arg0 > -97) {
            this.field2220 = 117;
        }
    }
}
