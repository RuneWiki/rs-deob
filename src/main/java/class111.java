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

@OriginalClass("client!hk")
public class class111 extends class66 {

    @OriginalMember(owner = "client!hk", name = "kb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field1758 = new Hashtable();

    @OriginalMember(owner = "client!hk", name = "ye", descriptor = "I")
    public int field1928 = 128;

    @OriginalMember(owner = "client!hk", name = "xe", descriptor = "Lpa;")
    private class391 field1927 = new class391();

    @OriginalMember(owner = "client!hk", name = "Be", descriptor = "Lar;")
    private class711 field1931 = new class711();

    @OriginalMember(owner = "client!hk", name = "Ce", descriptor = "Lar;")
    public class711 field1932 = new class711();

    @OriginalMember(owner = "client!hk", name = "Ee", descriptor = "I")
    public int field1934 = 8;

    @OriginalMember(owner = "client!hk", name = "Ge", descriptor = "I")
    public int field1936 = 3;

    @OriginalMember(owner = "client!hk", name = "De", descriptor = "Z")
    private boolean field1933 = false;

    @OriginalMember(owner = "client!hk", name = "Je", descriptor = "Ljia;")
    private class645 field1939 = new class645();

    @OriginalMember(owner = "client!hk", name = "Ke", descriptor = "I")
    private int field1940 = -1;

    @OriginalMember(owner = "client!hk", name = "Oe", descriptor = "[Ljr;")
    private class122[] field1944 = new class122[4];

    @OriginalMember(owner = "client!hk", name = "Qe", descriptor = "I")
    private int field1946 = -1;

    @OriginalMember(owner = "client!hk", name = "Re", descriptor = "I")
    private int field1947 = -1;

    @OriginalMember(owner = "client!hk", name = "Te", descriptor = "[Ljr;")
    private class122[] field1949 = new class122[4];

    @OriginalMember(owner = "client!hk", name = "Me", descriptor = "[Ljr;")
    private class122[] field1942 = new class122[4];

    @OriginalMember(owner = "client!hk", name = "Xe", descriptor = "Ljia;")
    private class645 field1953;

    @OriginalMember(owner = "client!hk", name = "Ye", descriptor = "Ljia;")
    private class645 field1954;

    @OriginalMember(owner = "client!hk", name = "Ze", descriptor = "Ljia;")
    private class645 field1955;

    @OriginalMember(owner = "client!hk", name = "af", descriptor = "Ljia;")
    private class645 field1956;

    @OriginalMember(owner = "client!hk", name = "bf", descriptor = "Ljia;")
    private class645 field1957;

    @OriginalMember(owner = "client!hk", name = "cf", descriptor = "Ljia;")
    private class645 field1958;

    @OriginalMember(owner = "client!hk", name = "df", descriptor = "Ljia;")
    private class645 field1959;

    @OriginalMember(owner = "client!hk", name = "hf", descriptor = "Lar;")
    public class711 field1963;

    @OriginalMember(owner = "client!hk", name = "of", descriptor = "Lar;")
    public class711 field1969;

    @OriginalMember(owner = "client!hk", name = "pf", descriptor = "Lar;")
    public class711 field1970;

    @OriginalMember(owner = "client!hk", name = "Jf", descriptor = "F")
    public float field1990;

    @OriginalMember(owner = "client!hk", name = "Df", descriptor = "F")
    public float field1984;

    @OriginalMember(owner = "client!hk", name = "Nf", descriptor = "[F")
    private float[] field1994;

    @OriginalMember(owner = "client!hk", name = "Yf", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!hk", name = "mg", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!hk", name = "wf", descriptor = "F")
    public float field1977;

    @OriginalMember(owner = "client!hk", name = "ag", descriptor = "[F")
    private float[] field2007;

    @OriginalMember(owner = "client!hk", name = "Af", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!hk", name = "Uf", descriptor = "Z")
    private boolean field2001;

    @OriginalMember(owner = "client!hk", name = "Qf", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!hk", name = "Of", descriptor = "I")
    private int field1995;

    @OriginalMember(owner = "client!hk", name = "wg", descriptor = "F")
    private float field2029;

    @OriginalMember(owner = "client!hk", name = "zg", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!hk", name = "qg", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!hk", name = "bg", descriptor = "F")
    public float field2008;

    @OriginalMember(owner = "client!hk", name = "yg", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!hk", name = "xg", descriptor = "F")
    private float field2030;

    @OriginalMember(owner = "client!hk", name = "Ng", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!hk", name = "Ug", descriptor = "[Lbq;")
    private class307[] field2053;

    @OriginalMember(owner = "client!hk", name = "fg", descriptor = "[F")
    private float[] field2012;

    @OriginalMember(owner = "client!hk", name = "ig", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!hk", name = "Qg", descriptor = "I")
    private int field2049;

    @OriginalMember(owner = "client!hk", name = "hg", descriptor = "F")
    public float field2014;

    @OriginalMember(owner = "client!hk", name = "vg", descriptor = "Z")
    private boolean field2028;

    @OriginalMember(owner = "client!hk", name = "pg", descriptor = "[F")
    public float[] field2022;

    @OriginalMember(owner = "client!hk", name = "Pg", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!hk", name = "Vf", descriptor = "I")
    private int field2002;

    @OriginalMember(owner = "client!hk", name = "rg", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!hk", name = "kh", descriptor = "[F")
    private float[] field2069;

    @OriginalMember(owner = "client!hk", name = "Vg", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!hk", name = "sg", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!hk", name = "Xf", descriptor = "F")
    private float field2004;

    @OriginalMember(owner = "client!hk", name = "Tg", descriptor = "F")
    public float field2052;

    @OriginalMember(owner = "client!hk", name = "vf", descriptor = "F")
    public float field1976;

    @OriginalMember(owner = "client!hk", name = "lh", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!hk", name = "oh", descriptor = "F")
    private float field2073;

    @OriginalMember(owner = "client!hk", name = "nh", descriptor = "I")
    private int field2072;

    @OriginalMember(owner = "client!hk", name = "Sg", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!hk", name = "Fg", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!hk", name = "tg", descriptor = "F")
    private float field2026;

    @OriginalMember(owner = "client!hk", name = "th", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!hk", name = "Jg", descriptor = "Liw;")
    public class335 field2042;

    @OriginalMember(owner = "client!hk", name = "xh", descriptor = "[B")
    public byte[] field2082;

    @OriginalMember(owner = "client!hk", name = "zh", descriptor = "[I")
    public int[] field2084;

    @OriginalMember(owner = "client!hk", name = "Bh", descriptor = "[I")
    public int[] field2086;

    @OriginalMember(owner = "client!hk", name = "Ch", descriptor = "[I")
    public int[] field2087;

    @OriginalMember(owner = "client!hk", name = "vc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1821;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1744;

    @OriginalMember(owner = "client!hk", name = "ue", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field1726;

    @OriginalMember(owner = "client!hk", name = "Kc", descriptor = "J")
    private long field1836;

    @OriginalMember(owner = "client!hk", name = "cd", descriptor = "J")
    private long field1854;

    @OriginalMember(owner = "client!hk", name = "Tf", descriptor = "Z")
    public boolean field2000;

    @OriginalMember(owner = "client!hk", name = "Zg", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!hk", name = "Ef", descriptor = "Ljava/lang/String;")
    private String field1985;

    @OriginalMember(owner = "client!hk", name = "Rf", descriptor = "Z")
    public boolean field1998;

    @OriginalMember(owner = "client!hk", name = "Ff", descriptor = "Z")
    private boolean field1986;

    @OriginalMember(owner = "client!hk", name = "Dg", descriptor = "Z")
    public boolean field2036;

    @OriginalMember(owner = "client!hk", name = "If", descriptor = "Z")
    public boolean field1989;

    @OriginalMember(owner = "client!hk", name = "Sf", descriptor = "Z")
    public boolean field1999;

    @OriginalMember(owner = "client!hk", name = "gh", descriptor = "Z")
    private boolean field2065;

    @OriginalMember(owner = "client!hk", name = "ug", descriptor = "Ljava/lang/String;")
    private String field2027;

    @OriginalMember(owner = "client!hk", name = "Ig", descriptor = "Z")
    public boolean field2041;

    @OriginalMember(owner = "client!hk", name = "gg", descriptor = "Z")
    private boolean field2013;

    @OriginalMember(owner = "client!hk", name = "ze", descriptor = "Lgaa;")
    private class315 field1929;

    @OriginalMember(owner = "client!hk", name = "He", descriptor = "Lwj;")
    public class417 field1937;

    @OriginalMember(owner = "client!hk", name = "Ae", descriptor = "Lnr;")
    private class65 field1930;

    @OriginalMember(owner = "client!hk", name = "ve", descriptor = "Lkia;")
    private class648 field1925;

    @OriginalMember(owner = "client!hk", name = "we", descriptor = "Lhb;")
    private class757 field1926;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "[I")
    public static int[] field1735 = new int[6];

    @OriginalMember(owner = "client!hk", name = "Wc", descriptor = "Lui;")
    public static class243 field1848 = new class243();

    @OriginalMember(owner = "client!hk", name = "te", descriptor = "F")
    public static float field1923;

    @OriginalMember(owner = "client!hk", name = "qf", descriptor = "F")
    public float field1971;

    @OriginalMember(owner = "client!hk", name = "zf", descriptor = "F")
    public float field1980;

    @OriginalMember(owner = "client!hk", name = "ng", descriptor = "F")
    public float field2020;

    @OriginalMember(owner = "client!hk", name = "Bg", descriptor = "F")
    public float field2034;

    @OriginalMember(owner = "client!hk", name = "Rg", descriptor = "F")
    private float field2050;

    @OriginalMember(owner = "client!hk", name = "ih", descriptor = "F")
    public float field2067;

    @OriginalMember(owner = "client!hk", name = "mh", descriptor = "F")
    public float field2071;

    @OriginalMember(owner = "client!hk", name = "rh", descriptor = "F")
    private float field2076;

    @OriginalMember(owner = "client!hk", name = "sh", descriptor = "F")
    private float field2077;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!hk", name = "eb", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!hk", name = "fb", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!hk", name = "gb", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!hk", name = "hb", descriptor = "I")
    private int field1755;

    @OriginalMember(owner = "client!hk", name = "ib", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!hk", name = "jb", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!hk", name = "lb", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!hk", name = "mb", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!hk", name = "nb", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!hk", name = "ob", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!hk", name = "pb", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!hk", name = "qb", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!hk", name = "rb", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!hk", name = "sb", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!hk", name = "tb", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!hk", name = "ub", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!hk", name = "vb", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!hk", name = "wb", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!hk", name = "xb", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!hk", name = "yb", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!hk", name = "zb", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!hk", name = "Ab", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!hk", name = "Bb", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!hk", name = "Cb", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!hk", name = "Db", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!hk", name = "Eb", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!hk", name = "Fb", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!hk", name = "Gb", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!hk", name = "Hb", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!hk", name = "Ib", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!hk", name = "Jb", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!hk", name = "Kb", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!hk", name = "Lb", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!hk", name = "Mb", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!hk", name = "Nb", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!hk", name = "Ob", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!hk", name = "Pb", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!hk", name = "Qb", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!hk", name = "Rb", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!hk", name = "Sb", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!hk", name = "Tb", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!hk", name = "Ub", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!hk", name = "Vb", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!hk", name = "Wb", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!hk", name = "Xb", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!hk", name = "Yb", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!hk", name = "Zb", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!hk", name = "ac", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!hk", name = "bc", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!hk", name = "cc", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!hk", name = "dc", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!hk", name = "ec", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!hk", name = "fc", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!hk", name = "gc", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!hk", name = "hc", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!hk", name = "ic", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!hk", name = "jc", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!hk", name = "kc", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!hk", name = "lc", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!hk", name = "mc", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!hk", name = "nc", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!hk", name = "oc", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!hk", name = "pc", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!hk", name = "qc", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!hk", name = "rc", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!hk", name = "sc", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!hk", name = "tc", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!hk", name = "uc", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!hk", name = "wc", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!hk", name = "xc", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!hk", name = "yc", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!hk", name = "zc", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!hk", name = "Ac", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!hk", name = "Bc", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!hk", name = "Cc", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!hk", name = "Dc", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!hk", name = "Ec", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!hk", name = "Fc", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!hk", name = "Gc", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!hk", name = "Hc", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!hk", name = "Ic", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!hk", name = "Jc", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!hk", name = "Lc", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!hk", name = "Mc", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!hk", name = "Nc", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!hk", name = "Oc", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!hk", name = "Pc", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!hk", name = "Qc", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!hk", name = "Rc", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!hk", name = "Sc", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!hk", name = "Tc", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!hk", name = "Uc", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!hk", name = "Vc", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!hk", name = "Xc", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!hk", name = "Yc", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!hk", name = "Zc", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!hk", name = "ad", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!hk", name = "bd", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!hk", name = "dd", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!hk", name = "ed", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!hk", name = "fd", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!hk", name = "gd", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!hk", name = "hd", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!hk", name = "id", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!hk", name = "jd", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!hk", name = "kd", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!hk", name = "ld", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!hk", name = "md", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!hk", name = "nd", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!hk", name = "od", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!hk", name = "pd", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!hk", name = "qd", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!hk", name = "rd", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!hk", name = "sd", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!hk", name = "td", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!hk", name = "ud", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hk", name = "vd", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!hk", name = "wd", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!hk", name = "xd", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!hk", name = "yd", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!hk", name = "zd", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!hk", name = "Ad", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!hk", name = "Bd", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!hk", name = "Cd", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!hk", name = "Dd", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!hk", name = "Ed", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!hk", name = "Fd", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!hk", name = "Gd", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!hk", name = "Hd", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!hk", name = "Id", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!hk", name = "Jd", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!hk", name = "Kd", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!hk", name = "Ld", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!hk", name = "Md", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!hk", name = "Nd", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!hk", name = "Od", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!hk", name = "Pd", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!hk", name = "Qd", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!hk", name = "Rd", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!hk", name = "Sd", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!hk", name = "Td", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!hk", name = "Ud", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!hk", name = "Vd", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!hk", name = "Wd", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!hk", name = "Xd", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!hk", name = "Yd", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!hk", name = "Zd", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!hk", name = "ae", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!hk", name = "be", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!hk", name = "ce", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!hk", name = "de", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!hk", name = "ee", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!hk", name = "fe", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!hk", name = "ge", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!hk", name = "ie", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!hk", name = "je", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!hk", name = "ke", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!hk", name = "le", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!hk", name = "me", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!hk", name = "ne", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!hk", name = "oe", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!hk", name = "pe", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!hk", name = "qe", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!hk", name = "re", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!hk", name = "se", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!hk", name = "Ie", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!hk", name = "Ue", descriptor = "I")
    private int field1950;

    @OriginalMember(owner = "client!hk", name = "Ve", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!hk", name = "We", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!hk", name = "ef", descriptor = "I")
    private int field1960;

    @OriginalMember(owner = "client!hk", name = "kf", descriptor = "I")
    private int field1965;

    @OriginalMember(owner = "client!hk", name = "nf", descriptor = "I")
    private int field1968;

    @OriginalMember(owner = "client!hk", name = "rf", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!hk", name = "tf", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!hk", name = "Gf", descriptor = "I")
    private int field1987;

    @OriginalMember(owner = "client!hk", name = "Lf", descriptor = "I")
    private int field1992;

    @OriginalMember(owner = "client!hk", name = "Wf", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!hk", name = "cg", descriptor = "I")
    private int field2009;

    @OriginalMember(owner = "client!hk", name = "og", descriptor = "I")
    private int field2021;

    @OriginalMember(owner = "client!hk", name = "Cg", descriptor = "I")
    private int field2035;

    @OriginalMember(owner = "client!hk", name = "Og", descriptor = "I")
    private int field2047;

    @OriginalMember(owner = "client!hk", name = "Wg", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!hk", name = "ah", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!hk", name = "wh", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!hk", name = "yh", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!hk", name = "Ah", descriptor = "I")
    private int field2085;

    @OriginalMember(owner = "client!hk", name = "jf", descriptor = "J")
    private long field1964;

    @OriginalMember(owner = "client!hk", name = "Le", descriptor = "Ljr;")
    private class122 field1941;

    @OriginalMember(owner = "client!hk", name = "Ne", descriptor = "Ljr;")
    private class122 field1943;

    @OriginalMember(owner = "client!hk", name = "Mf", descriptor = "Ltca;")
    private class185 field1993;

    @OriginalMember(owner = "client!hk", name = "Zf", descriptor = "Lwfa;")
    private class212 field2006;

    @OriginalMember(owner = "client!hk", name = "bh", descriptor = "Lwfa;")
    private class212 field2060;

    @OriginalMember(owner = "client!hk", name = "sf", descriptor = "Lkf;")
    public class268 field1973;

    @OriginalMember(owner = "client!hk", name = "eh", descriptor = "Lnc;")
    private class26 field2063;

    @OriginalMember(owner = "client!hk", name = "Pf", descriptor = "Lnba;")
    public class316 field1996;

    @OriginalMember(owner = "client!hk", name = "jg", descriptor = "Lnba;")
    public class316 field2016;

    @OriginalMember(owner = "client!hk", name = "Se", descriptor = "Lhs;")
    private class346 field1948;

    @OriginalMember(owner = "client!hk", name = "uf", descriptor = "Lb;")
    public class354 field1975;

    @OriginalMember(owner = "client!hk", name = "Cf", descriptor = "Lb;")
    public class354 field1983;

    @OriginalMember(owner = "client!hk", name = "eg", descriptor = "Lb;")
    public class354 field2011;

    @OriginalMember(owner = "client!hk", name = "lg", descriptor = "Lb;")
    public class354 field2018;

    @OriginalMember(owner = "client!hk", name = "Eg", descriptor = "Lb;")
    public class354 field2037;

    @OriginalMember(owner = "client!hk", name = "Hg", descriptor = "Lb;")
    public class354 field2040;

    @OriginalMember(owner = "client!hk", name = "Xg", descriptor = "Lb;")
    public class354 field2056;

    @OriginalMember(owner = "client!hk", name = "Yg", descriptor = "Lb;")
    public class354 field2057;

    @OriginalMember(owner = "client!hk", name = "fh", descriptor = "Lb;")
    public class354 field2064;

    @OriginalMember(owner = "client!hk", name = "vh", descriptor = "Lb;")
    public class354 field2080;

    @OriginalMember(owner = "client!hk", name = "jh", descriptor = "Lvq;")
    private class488 field2068;

    @OriginalMember(owner = "client!hk", name = "he", descriptor = "Leka;")
    public static class492 field1911;

    @OriginalMember(owner = "client!hk", name = "Pe", descriptor = "Let;")
    private class621 field1945;

    @OriginalMember(owner = "client!hk", name = "xf", descriptor = "Let;")
    public class621 field1978;

    @OriginalMember(owner = "client!hk", name = "Fe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1935;

    @OriginalMember(owner = "client!hk", name = "ff", descriptor = "Z")
    private boolean field1961;

    @OriginalMember(owner = "client!hk", name = "gf", descriptor = "Z")
    private boolean field1962;

    @OriginalMember(owner = "client!hk", name = "lf", descriptor = "Z")
    private boolean field1966;

    @OriginalMember(owner = "client!hk", name = "mf", descriptor = "Z")
    private boolean field1967;

    @OriginalMember(owner = "client!hk", name = "yf", descriptor = "Z")
    public boolean field1979;

    @OriginalMember(owner = "client!hk", name = "Bf", descriptor = "Z")
    private boolean field1982;

    @OriginalMember(owner = "client!hk", name = "Hf", descriptor = "Z")
    private boolean field1988;

    @OriginalMember(owner = "client!hk", name = "Kf", descriptor = "Z")
    public boolean field1991;

    @OriginalMember(owner = "client!hk", name = "dg", descriptor = "Z")
    private boolean field2010;

    @OriginalMember(owner = "client!hk", name = "kg", descriptor = "Z")
    private boolean field2017;

    @OriginalMember(owner = "client!hk", name = "Ag", descriptor = "Z")
    private boolean field2033;

    @OriginalMember(owner = "client!hk", name = "Gg", descriptor = "Z")
    private boolean field2039;

    @OriginalMember(owner = "client!hk", name = "Kg", descriptor = "Z")
    public boolean field2043;

    @OriginalMember(owner = "client!hk", name = "Lg", descriptor = "Z")
    private boolean field2044;

    @OriginalMember(owner = "client!hk", name = "Mg", descriptor = "Z")
    public boolean field2045;

    @OriginalMember(owner = "client!hk", name = "ch", descriptor = "Z")
    public boolean field2061;

    @OriginalMember(owner = "client!hk", name = "dh", descriptor = "Z")
    public boolean field2062;

    @OriginalMember(owner = "client!hk", name = "hh", descriptor = "Z")
    public boolean field2066;

    @OriginalMember(owner = "client!hk", name = "ph", descriptor = "Z")
    public boolean field2074;

    @OriginalMember(owner = "client!hk", name = "qh", descriptor = "Z")
    public boolean field2075;

    @OriginalMember(owner = "client!hk", name = "uh", descriptor = "[Lqk;")
    private class18[] field2079;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
    public final void method930(byte arg0, boolean arg1) {
        ++field1731;
        if (!arg1 != !this.field2010) {
            this.field2010 = arg1;
            this.method933(2896);
        }
        if (arg0 >= -106) {
            this.field1970 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "()Z")
    public final boolean method588() {
        ++field1745;
        return this.field1926.method4188((byte) -126, 3);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
    public final synchronized void method931(boolean arg0, int arg1) {
        ++field1810;
        class154 var3 = new class154();
        if (arg0) {
            this.method574((Canvas) null, 53, -126);
        }
        var3.field2528 = (long) arg1;
        this.field1958.method3594((byte) 122, var3);
    }

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "(II)V")
    public final void method547(int arg0, int arg1) {
        ++field1740;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIF)Lbq;")
    public final class307 method531(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field1761;
        return new class191(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "()Z")
    public final boolean method584() {
        ++field1868;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZII[B)Lnc;")
    public final class26 method932(byte arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        ++field1859;
        if (arg0 != 25) {
            this.method541();
        }
        return (class26) (!this.field1986 || arg1 && !this.field2065 ? new class679(this, arg2, arg4, arg3) : new class27(this, arg2, arg4, arg3, arg1));
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    private final void method933(int arg0) {
        if (this.field1982 && !this.field2010) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 == 2896) {
            ++field1732;
        }
    }

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "()Z")
    public final boolean method585() {
        ++field1778;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLjr;)V")
    public final void method934(boolean arg0, class122 arg1) {
        if (arg0) {
            this.field1951 = 72;
        }
        ++field1814;
        if (this.field2061) {
            this.method968(arg1, 3);
            this.method949((byte) -108, arg1);
        } else if (this.field1940 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field1940 <= -1) {
                this.field1944[this.field1940].method1063(-10507);
            }
            this.field1941 = this.field1943 = this.field1944[++this.field1940] = arg1;
            this.field1941.method1067(30055);
        }
    }

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "()I")
    public final int method497() {
        ++field1867;
        return this.field1952 + this.field1951 + this.field1950;
    }

    @OriginalMember(owner = "client!hk", name = "XA", descriptor = "()I")
    public final int method563() {
        ++field1762;
        return this.field1995;
    }

    @OriginalMember(owner = "client!hk", name = "HA", descriptor = "(IIII[I)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field1845;
        float var6 = (float) arg2 * this.field1963.field9783 + (float) arg0 * this.field1963.field9770 + (float) arg1 * this.field1963.field9762 + this.field1963.field9765;
        if (!((float) this.field2023 > var6) && !((float) this.field1995 < var6)) {
            int var7 = (int) (((float) arg2 * this.field1963.field9785 + (float) arg0 * this.field1963.field9795 + (float) arg1 * this.field1963.field9794 + this.field1963.field9771) * (float) this.field2046 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field1963.field9767 + (float) arg0 * this.field1963.field9780 + (float) arg1 * this.field1963.field9764 + this.field1963.field9768) * (float) this.field1981 / (float) arg3);
            if ((float) var7 >= this.field2071 && (float) var7 <= this.field2067 && this.field1980 <= (float) var8 && this.field2020 >= (float) var8) {
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 + -this.field2071);
                arg4[1] = (int) ((float) var8 - this.field1980);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "(I)V")
    private final void method935(int arg0) {
        if (~this.field1987 != arg0) {
            this.field1987 = 2;
            this.method987(true);
            this.method986((byte) -89);
            this.field1965 &= -8;
        }
        ++field1759;
    }

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "()V")
    public final void method543() {
        for (class154 var1 = this.field1939.method3589((byte) -127); var1 != null; var1 = this.field1939.method3591(0)) {
            ((class256) var1).method1677(false);
        }
        ++field1812;
        if (this.field1930 != null) {
            this.field1930.method470(0);
        }
        if (this.field1726 != null) {
            this.method994(7);
            Enumeration var2 = this.field1758.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field1758.get(var3);
                this.field1726.releaseSurface(var3, var4);
            }
            this.field1726.release();
            this.field1726 = null;
        }
        if (this.field1933) {
            class660.method3712((byte) -54, false, true);
            this.field1933 = false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(ZI)V")
    public final void method936(boolean arg0, int arg1) {
        if (!arg0 == this.field1961) {
            this.field1961 = arg0;
            this.method957((byte) -42);
            this.field1965 &= -32;
        }
        ++field1837;
        if (arg1 >= -127) {
            this.method505((class5) null, -22, 60, 0, 51);
        }
    }

    @OriginalMember(owner = "client!hk", name = "pa", descriptor = "()V")
    public final void method553() {
        ++field1896;
        this.field2075 = false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    private final void method937(byte arg0) {
        this.field2050 = (float) (-this.field2032 + this.field1995) + -this.field2029;
        ++field1742;
        if (arg0 != -122) {
            this.method506();
        }
        this.field2034 = this.field2050 - (float) this.field2015 * this.field2030;
        if (this.field2034 < (float) this.field2023) {
            this.field2034 = (float) this.field2023;
        }
        OpenGL.glFogf(2915, this.field2034);
        OpenGL.glFogf(2916, this.field2050);
        class759.field10457[0] = (float) class204.method1456(this.field2070, 16711680) / 1.671168E7F;
        class759.field10457[2] = (float) class204.method1456(255, this.field2070) / 255.0F;
        class759.field10457[1] = (float) class204.method1456(65280, this.field2070) / 65280.0F;
        OpenGL.glFogfv(2918, class759.field10457, 0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Len;Len;FLen;)Len;")
    public final class339 method535(class339 arg0, class339 arg1, float arg2, class339 arg3) {
        ++field1799;
        if (arg0 != null && arg1 != null && this.field2045 && this.field2041) {
            class720 var5 = null;
            class185 var6 = (class185) arg0;
            class185 var7 = (class185) arg1;
            class34 var8 = var6.method1378((byte) 82);
            class34 var9 = var7.method1378((byte) -118);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field570 < ~var9.field570 ? var8.field570 : var9.field570;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class720) {
                    class720 var11 = (class720) arg3;
                    if (var11.method3993((byte) -123) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class720(this, var10);
                }
                if (var5.method3994(var9, var8, 71, arg2)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lnc;B)V")
    public final void method938(class26 arg0, byte arg1) {
        ++field1887;
        if (this.field2063 != arg0) {
            if (this.field1986) {
                OpenGL.glBindBufferARB(34963, arg0.method174(-2163));
            }
            this.field2063 = arg0;
        }
        int var3 = 18 / ((arg1 - -5) / 33);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)Loq;")
    public final class380 method540(int arg0, int arg1) {
        ++field1898;
        return null;
    }

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "()Z")
    public final boolean method595() {
        ++field1796;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "()I")
    public final int method538() {
        ++field1756;
        int var1 = this.field2085;
        this.field2085 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method516(Canvas arg0) {
        ++field1875;
        if (this.field1821 == arg0) {
            throw new RuntimeException();
        } else if (this.field1758.containsKey(arg0)) {
            Long var2 = (Long) this.field1758.get(arg0);
            this.field1726.releaseSurface(arg0, var2);
            this.field1758.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "()V")
    public final void method548() {
        ++field1905;
        if (this.field2013 && this.field1813 > 0 && ~this.field1921 < -1) {
            int var1 = this.field2002;
            int var2 = this.field2024;
            int var3 = this.field2051;
            int var4 = this.field2049;
            this.method575();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method984(-20823);
            this.method1000(-4180, false);
            this.method956(false, 112);
            this.method950(false, (byte) 75);
            this.method936(false, -128);
            this.method939((class18) null, 8448);
            this.method1006(1, -2);
            this.method999(true, 1);
            this.method973(1, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field1813, this.field1921, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method512(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "()Z")
    public final boolean method534() {
        ++field1728;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lqk;I)V")
    public final void method939(class18 arg0, int arg1) {
        ++field1754;
        class18 var3 = this.field2079[this.field2021];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field430);
                } else if (~arg0.field430 != ~var3.field430) {
                    OpenGL.glDisable(var3.field430);
                    OpenGL.glEnable(arg0.field430);
                }
                OpenGL.glBindTexture(arg0.field430, arg0.method121(arg1 + -8573));
            } else {
                OpenGL.glDisable(var3.field430);
            }
            this.field2079[this.field2021] = arg0;
        }
        this.field1965 &= -2;
        if (arg1 != 8448) {
            this.field1945 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "(IIIIIII)I")
    public final int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1910;
        float var8 = (float) arg2 * this.field1963.field9783 + (float) arg0 * this.field1963.field9770 + (float) arg1 * this.field1963.field9762 + this.field1963.field9765;
        float var9 = (float) arg5 * this.field1963.field9783 + (float) arg3 * this.field1963.field9770 + (float) arg4 * this.field1963.field9762 + this.field1963.field9765;
        int var10 = 0;
        if ((float) this.field2023 > var8 && (float) this.field2023 > var9) {
            var10 |= 16;
        } else if ((float) this.field1995 < var8 && (float) this.field1995 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field1963.field9785 + (float) arg0 * this.field1963.field9795 + (float) arg1 * this.field1963.field9794 + this.field1963.field9771) * (float) this.field2046 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field1963.field9785 + (float) arg3 * this.field1963.field9795 + (float) arg4 * this.field1963.field9794 + this.field1963.field9771) * (float) this.field2046 / (float) arg6);
        if ((float) var11 < this.field2071 && (float) var12 < this.field2071) {
            var10 |= 1;
        } else if ((float) var11 > this.field2067 && (float) var12 > this.field2067) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field1963.field9767 + (float) arg0 * this.field1963.field9780 + (float) arg1 * this.field1963.field9764 + this.field1963.field9768) * (float) this.field1981 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field1963.field9767 + (float) arg3 * this.field1963.field9780 + (float) arg4 * this.field1963.field9764 + this.field1963.field9768) * (float) this.field1981 / (float) arg6);
        if (this.field1980 > (float) var13 && (float) var14 < this.field1980) {
            var10 |= 4;
        } else if (this.field2020 < (float) var13 && (float) var14 > this.field2020) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        ++field1746;
        class699 var10 = (class699) arg6;
        class488 var11 = var10.field9649;
        this.method952((byte) -125);
        this.method939(var10.field9649, 8448);
        this.method973(1, arg5);
        this.method990(7681, 8448, -29641);
        this.method988(34167, 6, 0, 768);
        float var12 = var11.field6581 / (float) var11.field6588;
        float var13 = var11.field6586 / (float) var11.field6584;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method988(5890, 6, 0, 768);
    }

    @OriginalMember(owner = "client!hk", name = "aa", descriptor = "(IIIIII)V")
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1806;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method959(-2);
        this.method973(1, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2044) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field2044) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "()Z")
    public final boolean method570() {
        ++field1915;
        if (this.field1925 != null) {
            if (!this.field1925.method2667(-107)) {
                if (!this.field1930.method469((byte) -119, this.field1925)) {
                    return false;
                }
                this.field1929.method1991(64);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "(Z)V")
    public final void method557(boolean arg0) {
        this.field2001 = arg0;
        ++field1767;
        this.method957((byte) -42);
    }

    @OriginalMember(owner = "client!hk", name = "EA", descriptor = "(IIII)V")
    public final void method569(int arg0, int arg1, int arg2, int arg3) {
        ++field1916;
        if (!this.field2075) {
            throw new RuntimeException("");
        } else {
            this.field2019 = arg2;
            this.field2078 = arg3;
            this.field2054 = arg1;
            this.field2081 = arg0;
            if (this.field2028) {
                this.field1926.field10435.method3338(89);
                this.field1926.field10435.method3339(true);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public final void method940(int arg0, int arg1, int arg2) {
        this.field2005 = arg2;
        this.field2072 = arg1;
        if (arg0 != 65280) {
            this.method493();
        }
        ++field1795;
        this.method995(false);
        this.method976((byte) -11);
    }

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "()Laja;")
    public final class100 method586() {
        ++field1903;
        int var1 = -1;
        if (this.field2027.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field2027.indexOf("intel") == -1) {
            if (this.field2027.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class100(var1, "OpenGL", this.field2003, this.field1985, 0L);
    }

    @OriginalMember(owner = "client!hk", name = "GA", descriptor = "(I)V")
    public final void method536(int arg0) {
        this.method973(1, 0);
        ++field1820;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "()Z")
    public final boolean method577() {
        ++field1870;
        return this.field1925 != null && this.field1925.method2667(-113);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILwfa;)V")
    public final void method941(int arg0, class212 arg1) {
        if (this.field2006 != arg1) {
            if (this.field1986) {
                OpenGL.glBindBufferARB(34962, arg1.method1494((byte) -92));
            }
            this.field2006 = arg1;
        }
        ++field1807;
        if (arg0 != -28678) {
            this.method989((byte) 81, (class122) null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "(III[I)V")
    public final void method490(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1776;
        float var5 = (float) arg2 * this.field1963.field9783 + (float) arg0 * this.field1963.field9770 + (float) arg1 * this.field1963.field9762 + this.field1963.field9765;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field1963.field9785 + (float) arg0 * this.field1963.field9795 + (float) arg1 * this.field1963.field9794 + this.field1963.field9771) * (float) this.field2046 / var5);
            int var7 = (int) (((float) arg2 * this.field1963.field9767 + (float) arg0 * this.field1963.field9780 + (float) arg1 * this.field1963.field9764 + this.field1963.field9768) * (float) this.field1981 / var5);
            arg3[0] = (int) ((float) var6 - this.field2071);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field1980);
        }
    }

    @OriginalMember(owner = "client!hk", name = "za", descriptor = "(IIIII)V")
    public final void method567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field1793;
        if (arg0 + arg2 >= this.field2002 && ~this.field2024 <= ~(-arg2 + arg0) && arg1 - -arg2 >= this.field2051 && -arg2 + arg1 <= this.field2049) {
            this.method959(-2);
            this.method973(1, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field2026) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field2004) {
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
                int var10 = class484.method2765(var9, 65);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class677.field9434[var11] * (float) arg2 + var6, class677.field9433[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "()Lsk;")
    public final class650 method539() {
        ++field1733;
        return this.field1963;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public final void method487(int arg0) {
        ++field1787;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFF)V")
    public final void method501(float arg0, float arg1, float arg2) {
        ++field1865;
        class463.field6305 = arg2;
        class521.field7071 = arg0;
        class722.field9920 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)V")
    public final void method942(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg0, arg2, arg1);
        if (arg3 >= 125) {
            ++field1839;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FBF)V")
    public final void method943(float arg0, byte arg1, float arg2) {
        this.field2029 = arg0;
        this.field2030 = arg2;
        ++field1780;
        int var4 = -36 / ((arg1 - -10) / 48);
        this.method937((byte) -122);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lkc;[Lgs;Z)Lda;")
    public final class67 method476(class145 arg0, class49[] arg1, boolean arg2) {
        ++field1830;
        return new class32(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "(IIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
        if (~arg2 > ~this.field2024) {
            this.field2024 = arg2;
        }
        ++field1738;
        if (arg1 > this.field2051) {
            this.field2051 = arg1;
        }
        if (~arg0 < ~this.field2002) {
            this.field2002 = arg0;
        }
        if (~this.field2049 < ~arg3) {
            this.field2049 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method1003((byte) -80);
        this.method976((byte) -11);
    }

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "(I)V")
    private final void method944(int arg0) {
        ++field1721;
        this.method1006(1, -2);
        for (int var2 = this.field2059 + -1; var2 >= 0; --var2) {
            this.method1002(var2, -5172);
            this.method939((class18) null, 8448);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method990(8448, 8448, arg0 + -38345);
        this.method988(34168, arg0 + -8698, 2, 770);
        this.method955(arg0 + -8630);
        this.field1968 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field1960 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        if (arg0 != 8704) {
            this.field2070 = 18;
        }
        this.field1966 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field1967 = true;
        this.method1000(-4180, true);
        this.method956(true, arg0 ^ 8785);
        this.method950(true, (byte) 75);
        this.method936(true, -128);
        this.method984(-20823);
        this.field1726.setSwapInterval(0);
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
        this.field2031 = this.field2070 = -1;
        this.method575();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(CI)Z")
    public static final boolean method945(char arg0, int arg1) {
        if (arg1 != -21584) {
            field1848 = null;
        }
        ++field1792;
        return ~arg0 <= -66 && ~arg0 >= -91 || ~arg0 <= -98 && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIIZ)Lnf;")
    public final class604 method523(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1753;
        return new class346(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lel;)V")
    public final void method527(class574 arg0) {
        ++field1737;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public final void method946(byte arg0) {
        if (this.field1965 != 4) {
            this.method997(false);
            this.method1000(-4180, false);
            this.method956(false, 100);
            this.method950(false, (byte) 75);
            this.method936(false, -128);
            this.method1006(1, -2);
            this.method973(1, 1);
            this.field1965 = 4;
        }
        if (arg0 <= 99) {
            this.field2086 = null;
        }
        ++field1842;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIID)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field1777;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(IIIIII)Len;")
    public final class339 method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1877;
        return this.field2045 ? new class724(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
    public final void method514(int arg0, int arg1, int arg2, int arg3) {
        ++field1719;
        this.field1930.method464(arg2, (byte) 81, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()I")
    public final int method493() {
        ++field1852;
        return 4;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lgh;Loq;)Lel;")
    public final class574 method546(class575 arg0, class380 arg1) {
        ++field1773;
        return null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public final synchronized void method481(int arg0) {
        ++field1798;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field1954.method3586(0)) {
            class345 var12 = (class345) this.field1954.method3584(23287);
            class619.field8617[var3++] = (int) var12.field2528;
            this.field1951 -= var12.field4640;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class619.field8617, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class619.field8617, 0);
            var3 = 0;
        }
        while (!this.field1955.method3586(0)) {
            class345 var11 = (class345) this.field1955.method3584(23287);
            class619.field8617[var3++] = (int) var11.field2528;
            this.field1952 -= var11.field4640;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class619.field8617, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class619.field8617, 0);
            var3 = 0;
        }
        while (!this.field1956.method3586(0)) {
            class345 var10 = (class345) this.field1956.method3584(23287);
            class619.field8617[var3++] = var10.field4640;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class619.field8617, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class619.field8617, 0);
            var3 = 0;
        }
        while (!this.field1957.method3586(0)) {
            class345 var9 = (class345) this.field1957.method3584(23287);
            class619.field8617[var3++] = (int) var9.field2528;
            this.field1950 -= var9.field4640;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class619.field8617, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class619.field8617, 0);
            boolean var4 = false;
        }
        while (!this.field1953.method3586(0)) {
            class345 var8 = (class345) this.field1953.method3584(23287);
            OpenGL.glDeleteLists((int) var8.field2528, var8.field4640);
        }
        while (!this.field1958.method3586(0)) {
            class154 var7 = this.field1958.method3584(23287);
            OpenGL.glDeleteProgramARB((int) var7.field2528);
        }
        while (!this.field1959.method3586(0)) {
            class154 var6 = this.field1959.method3584(23287);
            OpenGL.glDeleteObjectARB(var6.field2528);
        }
        while (!this.field1953.method3586(0)) {
            class345 var5 = (class345) this.field1953.method3584(23287);
            OpenGL.glDeleteLists((int) var5.field2528, var5.field4640);
        }
        this.field1929.method1990(-1);
        if (this.method497() > 100663296 && this.field1964 + 60000L < class197.method1423(1)) {
            System.gc();
            this.field1964 = class197.method1423(1);
        }
        this.field1938 = var2;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public static void method947(byte arg0) {
        int var1 = 51 % ((19 - arg0) / 44);
        field1911 = null;
        field1848 = null;
        field1735 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lnba;ILnba;Lnba;Lnba;)V")
    public final void method948(class316 arg0, int arg1, class316 arg2, class316 arg3, class316 arg4) {
        ++field1750;
        if (arg0 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method941(arg1 ^ -20742, arg0.field4319);
            OpenGL.glVertexPointer(arg0.field4316, arg0.field4320, this.field2006.method1491((byte) 80), this.field2006.method1492((byte) 124) - -((long) arg0.field4318));
            OpenGL.glEnableClientState(32884);
        }
        if (arg1 == 8448) {
            if (arg2 != null) {
                this.method941(-28678, arg2.field4319);
                OpenGL.glNormalPointer(arg2.field4320, this.field2006.method1491((byte) 43), this.field2006.method1492((byte) 124) - -((long) arg2.field4318));
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg4 != null) {
                this.method941(arg1 ^ -20742, arg4.field4319);
                OpenGL.glColorPointer(arg4.field4316, arg4.field4320, this.field2006.method1491((byte) 102), this.field2006.method1492((byte) 124) + (long) arg4.field4318);
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            if (arg3 != null) {
                this.method941(-28678, arg3.field4319);
                OpenGL.glTexCoordPointer(arg3.field4316, arg3.field4320, this.field2006.method1491((byte) -75), this.field2006.method1492((byte) 124) + (long) arg3.field4318);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lgs;Z)Lnf;")
    public final class604 method498(class49 arg0, boolean arg1) {
        ++field1730;
        int[] var3 = new int[arg0.field745 * arg0.field741];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field737 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field741; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field745; ++var7) {
                    int var8 = arg0.field739[arg0.field743[var4++] & 255];
                    var3[var5++] = var8 == 0 ? 0 : class530.method3011(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; arg0.field741 > var9; ++var9) {
                for (int var11 = 0; ~arg0.field745 < ~var11; ++var11) {
                    var3[var5++] = class530.method3011(arg0.field739[class204.method1456(arg0.field743[var4], 255)], arg0.field737[var4] << 24);
                    ++var4;
                }
            }
        }
        class604 var10 = this.method495(0, arg0.field745, var3, arg0.field741, arg0.field745, true);
        var10.method213(arg0.field744, arg0.field738, arg0.field740, arg0.field742);
        return var10;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjr;)V")
    public final void method949(byte arg0, class122 arg1) {
        ++field1857;
        if (arg0 > -50) {
            this.method943(-0.62914896F, (byte) 47, 0.83194786F);
        }
        if (~this.field1946 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field1946 <= -1) {
                this.field1942[this.field1946].method1064(-11251);
            }
            this.field1943 = this.field1942[++this.field1946] = arg1;
            this.field1943.method1066(-30731);
        }
    }

    @OriginalMember(owner = "client!hk", name = "KA", descriptor = "(IIII)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        ++field1725;
        if (~arg2 < ~this.field1813) {
            arg2 = this.field1813;
        }
        if (~arg3 < ~this.field1921) {
            arg3 = this.field1921;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        this.field2024 = arg2;
        this.field2002 = arg0;
        this.field2051 = arg1;
        this.field2049 = arg3;
        OpenGL.glEnable(3089);
        this.method1003((byte) -80);
        this.method976((byte) -11);
    }

    @OriginalMember(owner = "client!hk", name = "ya", descriptor = "()V")
    public final void method494() {
        this.method936(true, -128);
        ++field1843;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZB)V")
    public final void method950(boolean arg0, byte arg1) {
        if (!this.field1962 != !arg0) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field1965 &= -32;
            this.field1962 = arg0;
        }
        if (arg1 != 75) {
            this.method572();
        }
        ++field1886;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILnc;II)V")
    public final void method951(int arg0, int arg1, class26 arg2, int arg3, int arg4) {
        ++field1855;
        int var6 = arg2.method176(arg0 ^ 504);
        int var7 = arg1 * this.method993(var6, 103);
        this.method938(arg2, (byte) -75);
        OpenGL.glDrawElements(arg4, arg3, var6, arg2.method173(-31) + (long) var7);
        if (arg0 != 393) {
            this.method490(85, -118, -46, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "()I")
    public final int method552() {
        ++field1822;
        return this.field2023;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
    public final void method952(byte arg0) {
        if (~this.field1965 != -3) {
            this.method997(false);
            this.method1000(-4180, false);
            this.method956(false, 80);
            this.method950(false, (byte) 75);
            this.method936(false, -128);
            this.method1006(1, -2);
            this.field1965 = 2;
        }
        int var2 = 116 / ((arg0 - -2) / 58);
        ++field1794;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLar;)V")
    public final void method953(byte arg0, class711 arg1) {
        if (arg0 > -80) {
            this.method960(80, true, false);
        }
        ++field1919;
        OpenGL.glLoadMatrixf(arg1.method3962(-92), 0);
    }

    @OriginalMember(owner = "client!hk", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method590(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field1717;
        boolean var7 = ~this.field2031 != ~arg0;
        if (var7 || this.field2008 != arg1 || this.field2052 != arg2) {
            this.field2008 = arg1;
            this.field2052 = arg2;
            this.field2031 = arg0;
            if (var7) {
                this.field2014 = (float) (this.field2031 & 16711680) / 1.671168E7F;
                this.field1990 = (float) (this.field2031 & 255) / 255.0F;
                this.field1977 = (float) (65280 & this.field2031) / 65280.0F;
                this.method982(-100);
            }
            this.method1007(-1);
        }
        if (this.field1994[0] != arg3 || this.field1994[1] != arg4 || this.field1994[2] != arg5) {
            this.field1994[0] = arg3;
            this.field1994[2] = arg5;
            this.field1994[1] = arg4;
            this.field2012[1] = -arg4;
            this.field2012[2] = -arg5;
            this.field2012[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field2022[1] = arg4 * var8;
            this.field2022[0] = arg3 * var8;
            this.field2022[2] = arg5 * var8;
            this.field2007[1] = -this.field2022[1];
            this.field2007[2] = -this.field2022[2];
            this.field2007[0] = -this.field2022[0];
            this.method1008(-3);
            this.field2055 = (int) (arg5 * 256.0F / arg4);
            this.field1974 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjr;)V")
    public final void method954(int arg0, class122 arg1) {
        ++field1808;
        if (!this.field2061) {
            if (~this.field1940 > -1 || this.field1944[this.field1940] != arg1) {
                throw new RuntimeException();
            }
            this.field1944[this.field1940--] = null;
            arg1.method1063(-10507);
            if (this.field1940 >= 0) {
                this.field1941 = this.field1943 = this.field1944[this.field1940];
                this.field1941.method1067(arg0 ^ 30054);
            } else {
                this.field1941 = this.field1943 = null;
            }
        } else {
            this.method989((byte) -96, arg1);
            this.method964(arg1, -1);
        }
        if (arg0 != 1) {
            this.field2060 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "(I)V")
    private final void method955(int arg0) {
        if (this.field1988) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field1988 = false;
        }
        ++field1791;
        if (arg0 < 60) {
            this.method518(89, -33, -115, 91, 111, -31);
        }
    }

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "()V")
    public final void method558() {
        ++field1770;
        this.field1930.method466((byte) -54);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(ZI)V")
    public final void method956(boolean arg0, int arg1) {
        ++field1907;
        if (!this.field1982 != !arg0) {
            this.field1982 = arg0;
            this.method933(2896);
            this.field1965 &= -8;
        }
        if (arg1 <= 78) {
            this.method487(16);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()Z")
    public final boolean method485() {
        ++field1831;
        return this.field1925 != null && (this.field1924 <= 1 || this.field2017);
    }

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "(IIIII)V")
    public final void method591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method959(-2);
        ++field1829;
        this.method973(1, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V")
    private final void method957(byte arg0) {
        OpenGL.glDepthMask(this.field1961 && this.field2001);
        ++field1889;
        if (arg0 != -42) {
            this.method993(105, -76);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()Z")
    public final boolean method479() {
        ++field1797;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
    public final void method561(int arg0, int arg1) throws class789 {
        ++field1805;
        try {
            this.field1726.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "(I)V")
    private final void method958(int arg0) {
        ++field1917;
        if (arg0 != 1000) {
            this.field1758 = null;
        }
        int var2 = 0;
        while (!this.field1726.method3665()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class643.method3577(1000L, 0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public final void method573(int arg0) {
        ++field1786;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "(I)V")
    private final void method959(int arg0) {
        ++field1811;
        if (~this.field1965 != arg0) {
            this.method997(false);
            this.method1000(-4180, false);
            this.method956(false, 111);
            this.method950(false, (byte) 75);
            this.method936(false, -128);
            this.method939((class18) null, 8448);
            this.method1006(1, -2);
            this.method999(true, 1);
            this.field1965 = 1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZZ)V")
    public final void method960(int arg0, boolean arg1, boolean arg2) {
        this.method965(arg1, (byte) 88, arg0, arg2);
        ++field1779;
    }

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "(I)V")
    private final void method961(int arg0) {
        ++field1900;
        if (arg0 != 16386) {
            this.method580((int[]) null);
        }
        int var2;
        for (var2 = 0; this.field1992 > var2; ++var2) {
            class307 var3 = this.field2053[var2];
            class517.field7035[0] = (float) var3.method1962(0);
            int var4 = var2 + 16386;
            class517.field7035[1] = (float) var3.method1961(-128);
            class517.field7035[2] = (float) var3.method1958(true);
            class517.field7035[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class517.field7035, 0);
            int var5 = var3.method1965(0);
            float var6 = var3.method1966((byte) -58) / 255.0F;
            class517.field7035[2] = (float) class204.method1456(var5, 255) * var6;
            class517.field7035[0] = var6 * (float) class204.method1456(var5 >> 16, 255);
            class517.field7035[1] = (float) (class204.method1456(65464, var5) >> 8) * var6;
            OpenGL.glLightfv(var4, 4609, class517.field7035, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1963((byte) -24) * var3.method1963((byte) 119)));
            OpenGL.glEnable(var4);
        }
        while (var2 < this.field2047) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field2047 = this.field1992;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([I)V")
    public final void method583(int[] arg0) {
        ++field1802;
        arg0[1] = this.field1921;
        arg0[0] = this.field1813;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lza;)V")
    public final void method475(class437 arg0) {
        ++field1748;
        this.field1935 = ((class256) arg0).field3599;
        if (this.field2060 == null) {
            class335 var2 = new class335(80);
            if (!this.field2000) {
                var2.method2101(1836032144, -1.0F);
                var2.method2101(1836032144, -1.0F);
                var2.method2101(1836032144, 0.0F);
                var2.method2101(1836032144, 0.0F);
                var2.method2101(1836032144, 1.0F);
                var2.method2101(1836032144, 1.0F);
                var2.method2101(1836032144, -1.0F);
                var2.method2101(1836032144, 0.0F);
                var2.method2101(1836032144, 1.0F);
                var2.method2101(1836032144, 1.0F);
                var2.method2101(1836032144, 1.0F);
                var2.method2101(1836032144, 1.0F);
                var2.method2101(1836032144, 0.0F);
                var2.method2101(1836032144, 1.0F);
                var2.method2101(1836032144, 0.0F);
                var2.method2101(1836032144, -1.0F);
                var2.method2101(1836032144, 1.0F);
                var2.method2101(1836032144, 0.0F);
                var2.method2101(1836032144, 0.0F);
                var2.method2101(1836032144, 0.0F);
            } else {
                var2.method2098(-1.0F, true);
                var2.method2098(-1.0F, true);
                var2.method2098(0.0F, true);
                var2.method2098(0.0F, true);
                var2.method2098(1.0F, true);
                var2.method2098(1.0F, true);
                var2.method2098(-1.0F, true);
                var2.method2098(0.0F, true);
                var2.method2098(1.0F, true);
                var2.method2098(1.0F, true);
                var2.method2098(1.0F, true);
                var2.method2098(1.0F, true);
                var2.method2098(0.0F, true);
                var2.method2098(1.0F, true);
                var2.method2098(0.0F, true);
                var2.method2098(-1.0F, true);
                var2.method2098(1.0F, true);
                var2.method2098(0.0F, true);
                var2.method2098(0.0F, true);
                var2.method2098(0.0F, true);
            }
            this.field2060 = this.method962(20, false, var2.field1413, var2.field1442, 2834);
            this.field1996 = new class316(this.field2060, 5126, 3, 0);
            this.field2016 = new class316(this.field2060, 5126, 2, 12);
            this.field1927.method2372(this, 8616);
        }
    }

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "([I)V")
    public final void method580(int[] arg0) {
        arg0[2] = this.field2024;
        ++field1757;
        arg0[0] = this.field2002;
        arg0[1] = this.field2051;
        arg0[3] = this.field2049;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1912;
        OpenGL.glLineWidth((float) arg5);
        this.method508(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "()V")
    public final void method506() {
        ++field1765;
        if (this.field2041) {
            if (this.field1945 != this.field1943) {
                throw new RuntimeException();
            }
            this.field1945.method3500((byte) 123, 0);
            this.field1945.method3500((byte) 124, 8);
            this.method954(1, this.field1945);
        } else {
            if (!this.field2039) {
                throw new RuntimeException("");
            }
            this.field1948.method642(0, 0, this.field1813, this.field1921, 0, 0);
            this.field1726.setSurface(this.field1854);
        }
        this.field1921 = this.field1914;
        this.field1813 = this.field1755;
        this.field1948 = null;
        this.method984(-20823);
        this.method995(false);
        this.method575();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ[BII)Lwfa;")
    public final class212 method962(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        ++field1734;
        if (arg4 != 2834) {
            this.method1012((byte) -55);
        }
        return (class212) (!this.field1986 || arg1 && !this.field2065 ? new class743(this, arg0, arg2, arg3) : new class579(this, arg0, arg2, arg3, arg1));
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(II)V")
    public final void method963(int arg0, int arg1) {
        class759.field10457[1] = (float) class204.method1456(arg1, 65280) / 65280.0F;
        class759.field10457[3] = (float) (arg1 >>> 24) / 255.0F;
        class759.field10457[2] = (float) class204.method1456(255, arg1) / 255.0F;
        class759.field10457[0] = (float) class204.method1456(arg1, 16711680) / 1.671168E7F;
        ++field1874;
        if (arg0 != 255) {
            this.field2017 = false;
        }
        OpenGL.glTexEnvfv(8960, 8705, class759.field10457, 0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljr;I)V")
    public final void method964(class122 arg0, int arg1) {
        ++field1769;
        if (arg1 >= ~this.field1946 && this.field1942[this.field1946] == arg0) {
            this.field1942[this.field1946--] = null;
            arg0.method1064(arg1 ^ 11250);
            if (this.field1946 < 0) {
                this.field1943 = null;
            } else {
                this.field1943 = this.field1942[this.field1946];
                this.field1943.method1066(-30731);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZBIZ)V")
    public final void method965(boolean arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 >= 65) {
            ++field1882;
            if (this.field2009 != arg2 || this.field2075 == !this.field2028) {
                class268 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = this.field2075 ? 3 : 0;
                if (arg2 < 0) {
                    this.method955(70);
                } else {
                    var5 = this.field1929.method1993((byte) 78, arg2);
                    class311 var10 = super.field970.method1270(arg2, true);
                    if (var10.field4251 == 0 && ~var10.field4243 == -1) {
                        this.method955(85);
                    } else {
                        int var11 = var10.field4248 ? 64 : 128;
                        int var12 = var11 * 50;
                        this.method967(5888, 0.0F, (float) (this.field1938 % var12 * var10.field4243) / (float) var12, (float) (this.field1938 % var12 * var10.field4251) / (float) var12);
                    }
                    if (!this.field2075) {
                        var9 = var10.field4250;
                        var8 = var10.field4246;
                        var7 = var10.field4249;
                    }
                    var6 = var10.field4240;
                }
                this.field1926.method4193(var8, var9, -1, arg0, arg3, var7);
                if (!this.field1926.method4187((byte) 111, var5, var6)) {
                    this.method939(var5, 8448);
                    this.method999(true, var6);
                }
                this.field2009 = arg2;
                this.field2028 = this.field2075;
            }
            this.field1965 &= -8;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
    public final synchronized void method966(byte arg0, int arg1) {
        ++field1883;
        class345 var3 = new class345(arg1);
        if (arg0 < -39) {
            this.field1956.method3594((byte) -58, var3);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
    public final int method482(int arg0, int arg1) {
        ++field1840;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IFFF)V")
    private final void method967(int arg0, float arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field1815;
        if (this.field1988) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg2, arg1);
        OpenGL.glMatrixMode(arg0);
        this.field1988 = true;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Ljr;I)V")
    public final void method968(class122 arg0, int arg1) {
        ++field1834;
        if (this.field1947 >= arg1) {
            throw new RuntimeException();
        } else {
            if (this.field1947 >= 0) {
                this.field1949[this.field1947].method1065((byte) -98);
            }
            this.field1941 = this.field1949[++this.field1947] = arg0;
            this.field1941.method1068(-70);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method559(Canvas arg0) {
        this.field1854 = 0L;
        ++field1878;
        this.field1744 = null;
        if (arg0 != null && this.field1821 != arg0) {
            if (this.field1758.containsKey(arg0)) {
                Long var2 = (Long) this.field1758.get(arg0);
                this.field1854 = var2;
                this.field1744 = arg0;
            }
        } else {
            this.field1854 = this.field1836;
            this.field1744 = this.field1821;
        }
        if (this.field1744 != null && ~this.field1854 != -1L) {
            this.field1726.setSurface(this.field1854);
            this.method1012((byte) -37);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)Lza;")
    public final class437 method579(int arg0) {
        ++field1751;
        class256 var2 = new class256(arg0);
        this.field1939.method3594((byte) -77, var2);
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "(IIIII)V")
    public final void method551(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1863;
        this.method959(-2);
        this.method973(1, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(II)I")
    public final int method969(int arg0, int arg1) {
        ++field1861;
        if (~arg0 != -6407 && ~arg0 != -6410) {
            if (~arg0 != -6411 && arg0 != 34846 && ~arg0 != -34845) {
                if (arg0 != 6407) {
                    if (~arg0 != -6409 && arg0 != 34847) {
                        if (~arg0 == -34844) {
                            return 6;
                        } else if (arg0 != 34842) {
                            if (arg0 != 6402) {
                                if (~arg0 == -6402) {
                                    return 1;
                                } else {
                                    if (arg1 < 8) {
                                        this.field1985 = null;
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

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BFFFF)V")
    public final void method970(byte arg0, float arg1, float arg2, float arg3, float arg4) {
        class759.field10457[3] = arg4;
        class759.field10457[1] = arg1;
        ++field1809;
        class759.field10457[0] = arg2;
        class759.field10457[2] = arg3;
        OpenGL.glTexEnvfv(8960, 8705, class759.field10457, 0);
        if (arg0 <= 41) {
            this.method515(113, -121, -38, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "xa", descriptor = "(F)V")
    public final void method480(float arg0) {
        if (this.field1971 != arg0) {
            this.field1971 = arg0;
            this.method982(-121);
        }
        ++field1876;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLgn;Lfca;)Luga;")
    public static final class222 method971(byte arg0, class730 arg1, class93 arg2) {
        ++field1768;
        class222 var3 = new class222(arg1);
        if (arg0 > -8) {
            method972((byte) -98, (class93) null);
        }
        int var4 = arg2.method793((byte) 14);
        boolean var5 = ~(1 & var4) != -1;
        boolean var6 = (2 & var4) != 0;
        boolean var7 = ~(var4 & 4) != -1;
        boolean var8 = ~(var4 & 8) != -1;
        if (var5) {
            var3.field3243[0] = arg2.method763(-31);
            var3.field3242[0] = arg2.method763(-121);
            if (arg1.field10067 != -1 || arg1.field10010 != -1) {
                var3.field3243[1] = arg2.method763(113);
                var3.field3242[1] = arg2.method763(75);
            }
            if (~arg1.field10071 != 0 || ~arg1.field10064 != 0) {
                var3.field3243[2] = arg2.method763(75);
                var3.field3242[2] = arg2.method763(83);
            }
        }
        if (var6) {
            var3.field3240[0] = arg2.method763(-117);
            var3.field3244[0] = arg2.method763(80);
            if (arg1.field10016 != -1 || ~arg1.field10018 != 0) {
                var3.field3240[1] = arg2.method763(74);
                var3.field3244[1] = arg2.method763(-40);
            }
        }
        if (var7) {
            int var9 = arg2.method763(75);
            int[] var10 = new int[] { class204.method1456(15, var9), class204.method1456(15, var9 >> 4), class204.method1456(4028, var9) >> 8, class204.method1456(65171, var9) >> 12 };
            for (int var11 = 0; ~var11 > -5; ++var11) {
                if (~var10[var11] != -16) {
                    var3.field3241[var10[var11]] = (short) arg2.method763(-117);
                }
            }
        }
        if (var8) {
            int var12 = arg2.method793((byte) 113);
            int[] var13 = new int[] { class204.method1456(15, var12), class204.method1456(15, var12 >> 4) };
            for (int var14 = 0; ~var14 > -3; ++var14) {
                if (var13[var14] != 15) {
                    var3.field3245[var13[var14]] = (short) arg2.method763(107);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lmf;)V")
    public final void method478(class442 arg0) {
        ++field1841;
        this.field1927.method2368(-1, arg0, this, -30608);
    }

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "()[I")
    public final int[] method496() {
        ++field1781;
        return new int[] { this.field2038, this.field2025, this.field2046, this.field1981 };
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLfca;)Ldl;")
    public static final class70 method972(byte arg0, class93 arg1) {
        ++field1891;
        class528 var2 = class405.method2421((byte) 112)[arg1.method793((byte) 31)];
        class494 var3 = class74.method638(-43)[arg1.method793((byte) 51)];
        int var4 = arg1.method774(-4);
        int var5 = arg1.method774(-4);
        int var6 = arg1.method763(120);
        int var7 = arg1.method763(-119);
        int var8 = arg1.method774(-4);
        int var9 = arg1.method773(3);
        int var10 = arg1.method773(3);
        int var11 = 31 / ((arg0 - 36) / 58);
        return new class70(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "()Lsk;")
    public final class650 method565() {
        ++field1749;
        return new class711();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([IIIIIZ)Lnf;")
    public final class604 method587(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1838;
        return new class346(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(IIIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1833;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method959(-2);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method973(1, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2044) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field2044) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "(II)V")
    public final void method973(int arg0, int arg1) {
        if (this.field1968 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    var3 = false;
                    var4 = true;
                    var5 = 2;
                } else if (arg1 == 128) {
                    var5 = 3;
                    var3 = true;
                    var4 = true;
                } else {
                    var5 = 0;
                    var3 = false;
                    var4 = true;
                }
            } else {
                var3 = true;
                var4 = true;
                var5 = 1;
            }
            if (this.field1967 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field1967 = var4;
            }
            if (!var3 != !this.field1966) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field1966 = var3;
            }
            if (this.field1960 != var5) {
                if (var5 != 1) {
                    if (~var5 == -3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var5 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field1960 = var5;
            }
            this.field1965 &= -29;
            this.field1968 = arg1;
        }
        if (arg0 != 1) {
            this.method538();
        }
        ++field1892;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()V")
    public final void method489() {
        OpenGL.glFinish();
        ++field1899;
    }

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "(I)V")
    private final void method974(int arg0) {
        ++field1890;
        float[] var2 = this.field2069;
        float var3 = (float) (-this.field2038 * this.field2023) / (float) this.field2046;
        float var4 = (float) ((-this.field2038 + this.field1813) * this.field2023) / (float) this.field2046;
        float var5 = (float) (this.field2025 * this.field2023) / (float) this.field1981;
        float var6 = (float) ((-this.field1921 + this.field2025) * this.field2023) / (float) this.field1981;
        if (arg0 != -19785) {
            this.field1947 = 8;
        }
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field2023 * 2.0F;
            var2[14] = this.field2077 = -((float) this.field1995 * var7) / (float) (-this.field2023 + this.field1995);
            var2[3] = 0.0F;
            var2[6] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[5] = var7 / (var5 - var6);
            var2[1] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[10] = this.field2076 = (float) (-(this.field2023 + this.field1995)) / (float) (this.field1995 - this.field2023);
            var2[13] = 0.0F;
            var2[11] = -1.0F;
            var2[7] = 0.0F;
            var2[2] = 0.0F;
            var2[15] = 0.0F;
            var2[4] = 0.0F;
            var2[12] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
        } else {
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[9] = 0.0F;
            var2[5] = 1.0F;
            var2[8] = 0.0F;
            var2[1] = 0.0F;
            var2[7] = 0.0F;
            var2[14] = 0.0F;
            var2[2] = 0.0F;
            var2[13] = 0.0F;
            var2[10] = 1.0F;
            var2[11] = 0.0F;
            var2[15] = 1.0F;
            var2[6] = 0.0F;
            var2[0] = 1.0F;
            var2[4] = 0.0F;
        }
        this.method979((byte) -118);
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(II)I")
    public final int method593(int arg0, int arg1) {
        ++field1847;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!hk", name = "ra", descriptor = "(IIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3) {
        this.field2075 = true;
        this.field2019 = arg2;
        this.field2054 = arg1;
        this.field2081 = arg0;
        this.field2078 = arg3;
        ++field1909;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method959(-2);
        ++field1869;
        this.method973(1, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "(I)V")
    public final void method975(int arg0) {
        OpenGL.glPushMatrix();
        if (arg0 == 1) {
            ++field1764;
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(B)V")
    private final void method976(byte arg0) {
        if (arg0 != -11) {
            this.method579(16);
        }
        ++field1894;
        if (this.field2002 <= this.field2024 && this.field2049 >= this.field2051) {
            OpenGL.glScissor(this.field2072 + this.field2002, this.field2005 + this.field1921 - this.field2049, this.field2024 - this.field2002, this.field2049 - this.field2051);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "(I)V")
    public final void method502(int arg0) {
        this.field1936 = 0;
        ++field1913;
        while (~arg0 < -2) {
            ++this.field1936;
            arg0 >>= 1;
        }
        this.field1934 = 1 << this.field1936;
    }

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "(I)V")
    private final void method977(int arg0) {
        this.field2079 = new class18[this.field2059];
        ++field1789;
        this.field1973 = new class268(this, 3553, 6408, 1, 1);
        new class268(this, 3553, 6408, 1, 1);
        if (arg0 < 37) {
            this.method592();
        }
        new class268(this, 3553, 6408, 1, 1);
        this.field2057 = new class354(this);
        this.field1983 = new class354(this);
        this.field2011 = new class354(this);
        this.field2040 = new class354(this);
        this.field2064 = new class354(this);
        this.field2018 = new class354(this);
        this.field2037 = new class354(this);
        this.field1975 = new class354(this);
        this.field2080 = new class354(this);
        this.field2056 = new class354(this);
        if (this.field2041) {
            this.field1978 = new class621(this);
            new class621(this);
        }
    }

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "(I)V")
    private final void method978(int arg0) {
        ++field1727;
        float var2 = (float) (-this.field2038) * this.field2073 / (float) this.field2046;
        float var3 = (float) (-this.field2025) * this.field2073 / (float) this.field1981;
        float var4 = (float) (this.field1813 - this.field2038) * this.field2073 / (float) this.field2046;
        if (arg0 > -37) {
            this.method932((byte) 35, false, -4, -27, (byte[]) null);
        }
        float var5 = (float) (-this.field2025 + this.field1921) * this.field2073 / (float) this.field1981;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field2023, (double) this.field1995);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public final void method473(int arg0) {
        ++field1893;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field1928 = arg0;
            this.field1929.method1991(64);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ldc;IIII)Lka;")
    public final class499 method505(class5 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1720;
        return new class354(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(B)V")
    private final void method979(byte arg0) {
        ++field1871;
        this.field2069[10] = this.field2076;
        this.field2069[14] = this.field2077;
        int var2 = 26 / ((-45 - arg0) / 63);
        this.field1984 = (this.field2069[14] + (float) (-this.field1995)) / this.field2069[10];
        this.field1976 = (float) this.field1995;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIIII)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1856;
        this.method959(-2);
        this.method973(1, arg5);
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
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZ)Lnf;")
    public final class604 method549(int arg0, int arg1, boolean arg2) {
        ++field1880;
        return new class346(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "(ILaa;II)V")
    public final void method511(int arg0, class514 arg1, int arg2, int arg3) {
        ++field1741;
        class699 var5 = (class699) arg1;
        class488 var6 = var5.field9649;
        this.method952((byte) 59);
        this.method939(var5.field9649, 8448);
        this.method973(1, 1);
        this.method990(7681, 8448, -29641);
        this.method988(34167, 6, 0, 768);
        float var7 = var6.field6581 / (float) var6.field6588;
        float var8 = var6.field6586 / (float) var6.field6584;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2002) * var7, (float) (-arg3 + this.field2051) * var8);
        OpenGL.glVertex2i(this.field2002, this.field2051);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2002) * var7, (float) (this.field2049 - arg3) * var8);
        OpenGL.glVertex2i(this.field2002, this.field2049);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2024) * var7, (float) (-arg3 + this.field2049) * var8);
        OpenGL.glVertex2i(this.field2024, this.field2049);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field2024) * var7, (float) (-arg3 + this.field2051) * var8);
        OpenGL.glVertex2i(this.field2024, this.field2051);
        OpenGL.glEnd();
        this.method988(5890, 6, 0, 768);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZI)V")
    public final void method980(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field2063 = null;
        }
        OpenGL.glTexEnvi(8960, 34184 - -arg0, arg1);
        ++field1763;
        OpenGL.glTexEnvi(8960, arg0 + 34200, arg3);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
    public final synchronized void method981(int arg0, int arg1, int arg2) {
        ++field1881;
        class345 var4 = new class345(arg1);
        var4.field2528 = (long) arg0;
        if (arg2 <= -70) {
            this.field1955.method3594((byte) -109, var4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1801;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            this.method959(-2);
            this.method973(1, arg5);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var11 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var14 = var10 * var12;
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var13;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~arg6 > ~var15) {
                var18 = (float) (-var15 + arg6 + arg7) * var14;
                var19 = (float) (arg6 + arg7 + -var15) * var13;
            } else {
                var21 = (float) (-var15 + arg6) * var13;
                var20 = (float) (-var15 + arg6) * var14;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var13;
            while (true) {
                if (~arg2 < ~arg0) {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (~arg3 >= ~arg1) {
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
                var22 += var20 + var24;
                OpenGL.glEnd();
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method574(Canvas arg0, int arg1, int arg2) {
        ++field1816;
        if (this.field1821 == arg0) {
            throw new RuntimeException();
        } else if (!this.field1758.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field1726.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field1758.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "(I)V")
    private final void method982(int arg0) {
        ++field1884;
        class759.field10457[1] = this.field1977 * this.field1971;
        class759.field10457[2] = this.field1990 * this.field1971;
        int var2 = -55 % ((-6 - arg0) / 50);
        class759.field10457[3] = 1.0F;
        class759.field10457[0] = this.field2014 * this.field1971;
        OpenGL.glLightModelfv(2899, class759.field10457, 0);
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(B)V")
    private final void method983(byte arg0) {
        if (~this.field1987 != -4) {
            this.field1987 = 3;
            this.method978(-122);
            this.method986((byte) -124);
            this.field1965 &= -8;
        }
        ++field1722;
        if (arg0 > -54) {
            this.field1972 = -114;
        }
    }

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "(I)V")
    public final void method984(int arg0) {
        if (arg0 != -20823) {
            this.field1963 = null;
        }
        if (~this.field1987 != -1) {
            this.field1987 = 0;
            this.field1965 &= -32;
        }
        ++field1800;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
    public final void method545(int arg0) {
        ++field1743;
        this.method958(1000);
    }

    @OriginalMember(owner = "client!hk", name = "da", descriptor = "(III[I)V")
    public final void method515(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1772;
        float var5 = (float) arg2 * this.field1963.field9783 + (float) arg0 * this.field1963.field9770 + (float) arg1 * this.field1963.field9762 + this.field1963.field9765;
        if (!(var5 < (float) this.field2023) && !((float) this.field1995 < var5)) {
            int var6 = (int) (((float) arg2 * this.field1963.field9785 + (float) arg0 * this.field1963.field9795 + (float) arg1 * this.field1963.field9794 + this.field1963.field9771) * (float) this.field2046 / var5);
            int var7 = (int) (((float) arg2 * this.field1963.field9767 + (float) arg0 * this.field1963.field9780 + (float) arg1 * this.field1963.field9764 + this.field1963.field9768) * (float) this.field1981 / var5);
            if ((float) var6 >= this.field2071 && this.field2067 >= (float) var6 && (float) var7 >= this.field1980 && (float) var7 <= this.field2020) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field2071);
                arg3[1] = (int) ((float) var7 - this.field1980);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "(I)V")
    public final void method985(int arg0) {
        ++field1819;
        if (~this.field1965 != arg0) {
            this.method983((byte) -77);
            this.method1000(-4180, true);
            this.method950(true, (byte) 75);
            this.method936(true, -128);
            this.method973(arg0 + 18, 1);
            this.field1965 = 16;
        }
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(B)V")
    private final void method986(byte arg0) {
        ++field1716;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field1969.method3962(-82), 0);
        int var2 = 19 / ((-33 - arg0) / 51);
        if (this.field2028) {
            this.field1926.field10435.method3338(96);
        }
        this.method1008(-3);
        this.method961(16386);
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(Z)V")
    private final void method987(boolean arg0) {
        ++field1897;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field2069, 0);
        OpenGL.glMatrixMode(5888);
        if (!arg0) {
            this.field2040 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIII)V")
    public final void method988(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
        ++field1739;
        OpenGL.glTexEnvi(8960, 34192 - -arg2, arg3);
        if (arg1 != 6) {
            this.field1977 = 0.1446457F;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(BLjr;)V")
    public final void method989(byte arg0, class122 arg1) {
        ++field1902;
        if (this.field1947 >= 0 && this.field1949[this.field1947] == arg1) {
            this.field1949[this.field1947--] = null;
            if (arg0 > -20) {
                this.method999(true, 10);
            }
            arg1.method1065((byte) -98);
            if (~this.field1947 <= -1) {
                this.field1941 = this.field1949[this.field1947];
                this.field1941.method1068(-97);
            } else {
                this.field1941 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[Lbq;)V")
    public final void method542(int arg0, class307[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field2053[var3] = arg1[var3];
        }
        ++field1922;
        this.field1992 = arg0;
        if (this.field1987 != 1) {
            this.method961(16386);
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "()Z")
    public final boolean method524() {
        ++field1766;
        return this.field2044 && (!this.method577() || this.field2017);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)V")
    public final void method990(int arg0, int arg1, int arg2) {
        if (arg2 != -29641) {
            this.field2013 = false;
        }
        ++field1879;
        if (this.field2021 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (~this.field1997 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                this.field1997 = arg0;
                var4 = true;
            }
            if (this.field2048 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                this.field2048 = arg1;
                var4 = true;
            }
            if (var4) {
                this.field1965 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIZ)V")
    public final synchronized void method991(int arg0, int arg1, boolean arg2) {
        ++field1790;
        if (arg2) {
            this.method975(68);
        }
        class345 var4 = new class345(arg0);
        var4.field2528 = (long) arg1;
        this.field1957.method3594((byte) -122, var4);
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(III)V")
    public final synchronized void method992(int arg0, int arg1, int arg2) {
        if (arg0 != 3) {
            this.field1968 = -109;
        }
        ++field1904;
        class345 var4 = new class345(arg1);
        var4.field2528 = (long) arg2;
        this.field1954.method3594((byte) 121, var4);
    }

    @OriginalMember(owner = "client!hk", name = "na", descriptor = "(IIII)[I")
    public final int[] method484(int arg0, int arg1, int arg2, int arg3) {
        ++field1901;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field1921 - arg1 + -var6, arg2, 1, 32993, this.field2058, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "(II)I")
    public final int method993(int arg0, int arg1) {
        ++field1862;
        if (arg1 < 96) {
            this.method589(-82, 29, (int[][]) null, (int[][]) null, -99, 86, 117);
        }
        if (~arg0 != -5122 && arg0 != 5120) {
            if (arg0 != 5123 && arg0 != 5122) {
                if (arg0 != 5125 && arg0 != 5124 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "()V")
    public final void method581() {
        ++field1844;
        if (this.field1925 != null && this.field1925.method2667(-114)) {
            this.field1930.method463(true, this.field1925);
            this.field1929.method1991(64);
        }
    }

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "()I")
    public final int method572() {
        ++field1775;
        int var1 = this.field2083;
        this.field2083 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(II)Lgh;")
    public final class575 method562(int arg0, int arg1) {
        ++field1747;
        return null;
    }

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        ++field1832;
        if (this.field2070 != arg0 || this.field2015 != arg1 || ~this.field2032 != ~arg2) {
            this.field2015 = arg1;
            this.field2032 = arg2;
            this.field2070 = arg0;
            this.method937((byte) -122);
            this.method1001(-60);
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(II)V")
    public final void method509(int arg0, int arg1) {
        if (this.field2023 != arg0 || ~this.field1995 != ~arg1) {
            this.field2023 = arg0;
            this.field1995 = arg1;
            this.method974(-19785);
            this.method937((byte) -122);
            if (this.field1987 != 3) {
                if (~this.field1987 == -3) {
                    this.method987(true);
                }
            } else {
                this.method978(-110);
            }
        }
        ++field1803;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public final void method500(int arg0) {
        ++field1873;
        this.method994(7);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method560(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class789 {
        this.method561(arg2, arg3);
        ++field1827;
    }

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "(I)V")
    private final void method994(int arg0) {
        ++field1858;
        this.field1726.method3666();
        if (arg0 != 7) {
            this.method507(true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(Z)V")
    private final void method995(boolean arg0) {
        OpenGL.glViewport(this.field2072, this.field2005, this.field1813, this.field1921);
        if (arg0) {
            this.field2047 = -16;
        }
        ++field1860;
    }

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "(II)I")
    public final int method996(int arg0, int arg1) {
        ++field1888;
        if (arg1 == 1) {
            return 7681;
        } else if (arg1 == 0) {
            return 8448;
        } else if (arg1 == 2) {
            return 34165;
        } else if (arg1 == 3) {
            return 260;
        } else if (arg1 == 4) {
            return 34023;
        } else {
            if (arg0 != 2) {
                this.field1930 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(Z)V")
    private final void method997(boolean arg0) {
        ++field1825;
        if (this.field1987 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field1813 > 0 && this.field1921 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field1813, (double) this.field1921, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field1965 &= -25;
            this.field1987 = 1;
        }
        if (arg0) {
            this.method484(115, -32, -120, 102);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(JB)V")
    public final synchronized void method998(long arg0, byte arg1) {
        ++field1885;
        class154 var4 = new class154();
        var4.field2528 = arg0;
        this.field1959.method3594((byte) 98, var4);
        if (arg1 <= 49) {
            this.method550(49, 98, 38, -22);
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(ZI)V")
    public final void method999(boolean arg0, int arg1) {
        if (~arg1 != -2) {
            if (arg1 != 0) {
                if (~arg1 == -3) {
                    this.method990(34165, 7681, -29641);
                } else if (~arg1 != -4) {
                    if (~arg1 == -5) {
                        this.method990(34023, 34023, -29641);
                    }
                } else {
                    this.method990(260, 8448, -29641);
                }
            } else {
                this.method990(8448, 8448, -29641);
            }
        } else {
            this.method990(7681, 7681, -29641);
        }
        ++field1760;
        if (!arg0) {
            this.method559((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "()Z")
    public final boolean method578() {
        ++field1835;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1785;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            class699 var13 = (class699) arg6;
            class488 var14 = var13.field9649;
            this.method952((byte) 68);
            this.method939(var13.field9649, 8448);
            this.method973(1, arg5);
            this.method990(7681, 8448, -29641);
            this.method988(34167, 6, 0, 768);
            float var15 = var14.field6581 / (float) var14.field6588;
            float var16 = var14.field6586 / (float) var14.field6584;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg9 + arg10);
            float var21 = var18 * var19;
            float var22 = var17 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var23 = (float) arg9 * var22;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 > ~var20) {
                var25 = (float) (-var20 + arg10 + arg9) * var22;
                var26 = (float) (arg9 - -arg10 - var20) * var21;
            } else {
                var28 = (float) (-var20 + arg9) * var21;
                var27 = (float) (-var20 + arg9) * var22;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var22;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (arg0 < arg2) {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if (var29 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 + (float) (-arg7)) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var30 += var28 + var32;
                OpenGL.glEnd();
                var29 += var27 + var31;
                var28 = var24;
                var27 = var23;
            }
            this.method988(5890, 6, 0, 768);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
    public final void method1000(int arg0, boolean arg1) {
        if (this.field2033 == !arg1) {
            this.field2033 = arg1;
            this.method1001(125);
            this.field1965 &= -32;
        }
        if (arg0 != -4180) {
            this.method586();
        }
        ++field1826;
    }

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1782;
        float var10;
        float var11;
        if (this.field2068 != null && arg2 <= this.field2068.field3757 && ~arg3 >= ~this.field2068.field3759) {
            this.field2068.method1741(arg3, 0, 0, 0, arg2, arg6, 0, -74, false, 6406);
            var10 = (float) arg2 * this.field2068.field6581 / (float) this.field2068.field3757;
            var11 = (float) arg3 * this.field2068.field6586 / (float) this.field2068.field3759;
        } else {
            this.field2068 = class384.method2329(6406, arg2, false, arg3, this, 6406, (byte) 113, arg6);
            this.field2068.method1742(101, false, false);
            var10 = this.field2068.field6581;
            var11 = this.field2068.field6586;
        }
        this.method952((byte) -82);
        this.method939(this.field2068, 8448);
        this.method973(1, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method963(255, arg5);
        this.method990(34165, 34165, -29641);
        this.method988(34166, 6, 0, 768);
        this.method988(5890, 6, 2, 770);
        this.method980(0, 34166, true, 770);
        this.method980(2, 5890, true, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method988(5890, 6, 0, 768);
        this.method988(34166, 6, 2, 770);
        this.method980(0, 5890, true, 770);
        this.method980(2, 34166, true, 770);
    }

    @OriginalMember(owner = "client!hk", name = "la", descriptor = "()V")
    public final void method575() {
        this.field2049 = this.field1921;
        ++field1804;
        this.field2002 = 0;
        this.field2024 = this.field1813;
        this.field2051 = 0;
        OpenGL.glDisable(3089);
        this.method1003((byte) -80);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class111(Canvas arg0, class162 arg1, int arg2) {
        super(arg1);
        new class305();
        new class46(16);
        this.field1953 = new class645();
        this.field1954 = new class645();
        this.field1955 = new class645();
        this.field1956 = new class645();
        this.field1957 = new class645();
        this.field1958 = new class645();
        this.field1959 = new class645();
        this.field1963 = new class711();
        this.field1969 = new class711();
        this.field1970 = new class711();
        this.field1990 = 1.0F;
        this.field1984 = 3584.0F;
        this.field1994 = new float[4];
        this.field2005 = 0;
        this.field2019 = -1;
        this.field1977 = 1.0F;
        this.field2007 = new float[4];
        this.field1981 = 512;
        this.field2001 = true;
        this.field1997 = 8448;
        this.field1995 = 3584;
        this.field2029 = 0.0F;
        this.field2032 = 0;
        this.field2023 = 50;
        this.field2008 = -1.0F;
        this.field2031 = -1;
        this.field2030 = 1.0F;
        this.field2046 = 512;
        this.field2053 = new class307[class792.field10848];
        this.field2012 = new float[4];
        this.field2015 = -1;
        this.field2049 = 0;
        this.field2014 = 1.0F;
        this.field2028 = false;
        this.field2022 = new float[4];
        this.field2048 = 8448;
        this.field2002 = 0;
        this.field2024 = 0;
        this.field2069 = new float[16];
        this.field2054 = -1;
        this.field2025 = 0;
        this.field2004 = -1.0F;
        this.field2052 = -1.0F;
        this.field1976 = 3584.0F;
        this.field2070 = -1;
        this.field2073 = 1.0F;
        this.field2072 = 0;
        this.field2051 = 0;
        this.field2038 = 0;
        this.field2026 = -1.0F;
        this.field2078 = 0;
        this.field2042 = new class335(8192);
        this.field2082 = new byte[16384];
        this.field2084 = new int[1];
        this.field2086 = new int[1];
        this.field2087 = new int[1];
        this.field1744 = this.field1821 = arg0;
        this.field1924 = arg2;
        if (!class35.method208((byte) 45, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class35.method208((byte) -120, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field1726 = new OpenGL();
                this.field1854 = this.field1836 = this.field1726.init(arg0, 8, 8, 8, 24, 0, this.field1924);
                if (~this.field1836 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method958(1000);
                    int var4 = this.method1013((byte) -87);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field2058 = this.field2000 ? 33639 : 5121;
                        if (~this.field1985.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class478.method2738(this.field1985.replace('/', ' '), ' ', 14388);
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class454.method2625(10, var10.substring(1, 3))) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (~var10.length() <= -5 && class454.method2625(10, var10.substring(0, 4))) {
                                                var5 = class287.method1832(-123, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 9250) {
                                    this.field1998 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field1986 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field2036 = false;
                            }
                            this.field1989 &= this.field1726.method3667("GL_ARB_half_float_pixel");
                            this.field1999 = true;
                            this.field2065 = this.field1986;
                        }
                        if (~this.field2027.indexOf("intel") != 0) {
                            this.field2041 = false;
                        }
                        this.field2013 = !this.field2027.equals("s3 graphics");
                        if (this.field1986) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class184.method1371(-2526, true, false);
                        this.field1933 = true;
                        this.field1929 = new class315(this, super.field970);
                        this.method977(113);
                        this.field1937 = new class417(this);
                        this.field1930 = new class65(this);
                        if (this.field1930.method468(29566)) {
                            this.field1925 = new class648(this);
                            if (!this.field1925.method3635((byte) 110)) {
                                this.field1925.method2658(-257);
                                this.field1925 = null;
                            }
                        }
                        this.field1926 = new class757(this);
                        this.method944(8704);
                        this.method1012((byte) -37);
                        this.method548();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method543();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "()Z")
    public final boolean method592() {
        ++field1864;
        return false;
    }

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "(I)V")
    private final void method1001(int arg0) {
        if (this.field2033 && this.field2015 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        int var2 = 24 % ((76 - arg0) / 49);
        ++field1872;
    }

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "(II)V")
    public final void method1002(int arg0, int arg1) {
        if (this.field2021 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field2021 = arg0;
        }
        ++field1774;
        if (arg1 != -5172) {
            this.method968((class122) null, -85);
        }
    }

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "(B)V")
    private final void method1003(byte arg0) {
        ++field1895;
        if (arg0 == -80) {
            this.field1980 = (float) (-this.field2025 + this.field2051);
            this.field2067 = (float) (-this.field2038 + this.field2024);
            this.field2020 = (float) (-this.field2025 + this.field2049);
            this.field2071 = (float) (this.field2002 - this.field2038);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V")
    public final void method507(boolean arg0) {
        ++field1850;
    }

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "(I)Lbja;")
    public final class34 method1004(int arg0) {
        if (arg0 != 3553) {
            this.method540(85, 81);
        }
        ++field1823;
        return this.field1993 != null ? this.field1993.method1378((byte) 38) : null;
    }

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "(I)V")
    public final void method1005(int arg0) {
        ++field1752;
        if (arg0 == -485363544) {
            OpenGL.glPopMatrix();
        }
    }

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "(II)V")
    public final void method1006(int arg0, int arg1) {
        if (arg0 == 1) {
            this.method960(arg1, true, true);
            ++field1851;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class296 method589(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1718;
        return new class297(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lsk;)V")
    public final void method503(class650 arg0) {
        this.field1963.method1874(arg0);
        ++field1849;
        this.field1969.method1874(this.field1963);
        this.field1969.method3963(6);
        this.field1970.method3961(1, this.field1969);
        if (this.field1987 != 1) {
            this.method986((byte) 34);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lmf;I)V")
    public final void method474(class442 arg0, int arg1) {
        this.field1927.method2368(arg1, arg0, this, -30608);
        ++field1846;
    }

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "(I)V")
    private final void method1007(int arg0) {
        ++field1918;
        class759.field10457[0] = this.field2014 * this.field2008;
        class759.field10457[1] = this.field2008 * this.field1977;
        class759.field10457[2] = this.field2008 * this.field1990;
        class759.field10457[3] = 1.0F;
        if (arg0 == -1) {
            OpenGL.glLightfv(16384, 4609, class759.field10457, 0);
            class759.field10457[3] = 1.0F;
            class759.field10457[0] = -this.field2052 * this.field2014;
            class759.field10457[2] = -this.field2052 * this.field1990;
            class759.field10457[1] = -this.field2052 * this.field1977;
            OpenGL.glLightfv(16385, 4609, class759.field10457, 0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "(I)V")
    public final void method1008(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field2022, 0);
        if (arg0 != -3) {
            this.field2038 = 73;
        }
        ++field1784;
        OpenGL.glLightfv(16385, 4611, this.field2007, 0);
    }

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "()Z")
    public final boolean method566() {
        ++field1817;
        return false;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(Z)V")
    public final void method1009(boolean arg0) {
        ++field1783;
        if (this.field1965 != 8) {
            this.method935(-3);
            this.method1000(-4180, true);
            this.method950(true, (byte) 75);
            this.method936(true, -128);
            this.method973(1, 1);
            this.field1965 = 8;
        }
        if (arg0) {
            this.method997(false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILar;)V")
    public final void method1010(int arg0, class711 arg1) {
        OpenGL.glPushMatrix();
        ++field1818;
        OpenGL.glMultMatrixf(arg1.method3962(-126), arg0);
    }

    @OriginalMember(owner = "client!hk", name = "JA", descriptor = "(IIIIII)I")
    public final int method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1736;
        int var7 = 0;
        float var8 = (float) arg2 * this.field1963.field9783 + (float) arg0 * this.field1963.field9770 + (float) arg1 * this.field1963.field9762 + this.field1963.field9765;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field1963.field9783 + (float) arg3 * this.field1963.field9770 + (float) arg4 * this.field1963.field9762 + this.field1963.field9765;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field2023 > var8 && (float) this.field2023 > var9) {
            var7 |= 16;
        } else if ((float) this.field1995 < var8 && (float) this.field1995 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field1963.field9785 + (float) arg0 * this.field1963.field9795 + (float) arg1 * this.field1963.field9794 + this.field1963.field9771) * (float) this.field2046 / var8);
        int var11 = (int) (((float) arg5 * this.field1963.field9785 + (float) arg3 * this.field1963.field9795 + (float) arg4 * this.field1963.field9794 + this.field1963.field9771) * (float) this.field2046 / var9);
        if (this.field2071 > (float) var10 && (float) var11 < this.field2071) {
            var7 |= 1;
        } else if (this.field2067 < (float) var10 && this.field2067 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field1963.field9767 + (float) arg0 * this.field1963.field9780 + (float) arg1 * this.field1963.field9764 + this.field1963.field9768) * (float) this.field1981 / var8);
        int var13 = (int) (((float) arg5 * this.field1963.field9767 + (float) arg3 * this.field1963.field9780 + (float) arg4 * this.field1963.field9764 + this.field1963.field9768) * (float) this.field1981 / var9);
        if (this.field1980 > (float) var12 && (float) var13 < this.field1980) {
            var7 |= 4;
        } else if (this.field2020 < (float) var12 && this.field2020 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Len;)V")
    public final void method596(class339 arg0) {
        this.field1993 = (class185) arg0;
        ++field1906;
    }

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "()V")
    public final void method541() {
        ++field1729;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
        ++field1723;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjaclib/memory/Buffer;IZI)Lwfa;")
    public final class212 method1011(int arg0, Buffer arg1, int arg2, boolean arg3, int arg4) {
        ++field1824;
        if (arg2 != -15854) {
            return null;
        } else {
            return (class212) (!this.field1986 || arg3 && !this.field2065 ? new class743(this, arg4, arg1) : new class579(this, arg4, arg1, arg0, arg3));
        }
    }

    @OriginalMember(owner = "client!hk", name = "DA", descriptor = "(IIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3) {
        this.field2046 = arg2;
        this.field2038 = arg0;
        this.field1981 = arg3;
        this.field2025 = arg1;
        ++field1724;
        this.method974(-19785);
        this.method1003((byte) -80);
        if (this.field1987 != 3) {
            if (this.field1987 == 2) {
                this.method987(true);
                return;
            }
        } else {
            this.method978(-120);
        }
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "()Lsk;")
    public final class650 method533() {
        ++field1788;
        return this.field1931;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method477(Canvas arg0, int arg1, int arg2) {
        ++field1771;
        long var4 = 0L;
        if (arg0 != null && this.field1821 != arg0) {
            if (this.field1758.containsKey(arg0)) {
                Long var6 = (Long) this.field1758.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field1836;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field1726.surfaceResized(var4);
            if (this.field1744 == arg0) {
                this.method1012((byte) -37);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "(B)V")
    private final void method1012(byte arg0) {
        if (arg0 != -37) {
            this.method520(-22, -28, -125, 51);
        }
        if (this.field1744 == null) {
            this.field1755 = this.field1914 = 0;
        } else {
            Dimension var2 = this.field1744.getSize();
            this.field1755 = var2.width;
            this.field1914 = var2.height;
        }
        ++field1828;
        if (this.field1943 == null) {
            this.field1921 = this.field1914;
            this.field1813 = this.field1755;
            this.method995(false);
        }
        this.method984(-20823);
        this.method575();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[I[I)Laa;")
    public final class514 method517(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field1853;
        return class455.method2628((byte) 114, arg1, arg2, arg3, arg0, this);
    }

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "(B)I")
    private final int method1013(byte arg0) {
        ++field1866;
        this.field2027 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field1985 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field2027.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field2027.indexOf("brian paul") != -1 || ~this.field2027.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        if (arg0 != -87) {
            return 98;
        } else {
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class478.method2738(var3.replace('.', ' '), ' ', 14388);
            if (~var4.length <= -3) {
                try {
                    int var5 = class287.method1832(-102, var4[0]);
                    int var6 = class287.method1832(-128, var4[1]);
                    this.field2003 = var5 * 10 + var6;
                } catch (NumberFormatException var8) {
                    var2 |= 4;
                }
            } else {
                var2 |= 4;
            }
            if (~this.field2003 > -13) {
                var2 |= 2;
            }
            if (!this.field1726.method3667("GL_ARB_multitexture")) {
                var2 |= 8;
            }
            if (!this.field1726.method3667("GL_ARB_texture_env_combine")) {
                var2 |= 32;
            }
            int[] var7 = new int[1];
            OpenGL.glGetIntegerv(34018, var7, 0);
            this.field2059 = var7[0];
            OpenGL.glGetIntegerv(34929, var7, 0);
            this.field1972 = var7[0];
            OpenGL.glGetIntegerv(34930, var7, 0);
            this.field2035 = var7[0];
            if (~this.field2059 > -3 || this.field1972 < 2 || ~this.field2035 > -3) {
                var2 |= 16;
            }
            this.field2000 = Stream.method3910();
            this.field2039 = this.field1726.arePbuffersAvailable();
            this.field1986 = this.field1726.method3667("GL_ARB_vertex_buffer_object");
            this.field2044 = this.field1726.method3667("GL_ARB_multisample");
            this.field2062 = this.field1726.method3667("GL_ARB_vertex_program");
            this.field1726.method3667("GL_ARB_fragment_program");
            this.field2043 = this.field1726.method3667("GL_ARB_vertex_shader");
            this.field2074 = this.field1726.method3667("GL_ARB_fragment_shader");
            this.field1998 = this.field1726.method3667("GL_EXT_texture3D");
            this.field1989 = this.field1726.method3667("GL_ARB_texture_rectangle");
            this.field2045 = this.field1726.method3667("GL_ARB_texture_cube_map");
            this.field2036 = this.field1726.method3667("GL_ARB_texture_float");
            this.field1979 = false;
            this.field2041 = this.field1726.method3667("GL_EXT_framebuffer_object");
            this.field2061 = this.field1726.method3667("GL_EXT_framebuffer_blit");
            this.field1991 = this.field1726.method3667("GL_EXT_framebuffer_multisample");
            this.field2017 = this.field2061 & this.field1991;
            this.field2066 = class384.field5205.startsWith("mac");
            OpenGL.glGetFloatv(2834, class759.field10457, 0);
            this.field2026 = class759.field10457[0];
            this.field2004 = class759.field10457[1];
            return ~var2 == -1 ? 0 : var2;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IF)V")
    public final void method1014(int arg0, float arg1) {
        int var3 = -83 % ((60 - arg0) / 62);
        ++field1908;
        if (this.field2073 != arg1) {
            this.field2073 = arg1;
            if (~this.field1987 == -4) {
                this.method978(-49);
                return;
            }
        }
    }
}
