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

@OriginalClass("client!mj")
public abstract class class114 extends class475 {

    @OriginalMember(owner = "client!mj", name = "Lc", descriptor = "Low;")
    private class665 field1775 = new class665();

    @OriginalMember(owner = "client!mj", name = "Yd", descriptor = "Z")
    public boolean field1840 = true;

    @OriginalMember(owner = "client!mj", name = "Vd", descriptor = "Lpg;")
    public class742 field1837 = new class742();

    @OriginalMember(owner = "client!mj", name = "be", descriptor = "Lpg;")
    public class742 field1843 = new class742();

    @OriginalMember(owner = "client!mj", name = "ce", descriptor = "Lpg;")
    public class742 field1844 = new class742();

    @OriginalMember(owner = "client!mj", name = "de", descriptor = "Lpg;")
    public class742 field1845 = new class742();

    @OriginalMember(owner = "client!mj", name = "ee", descriptor = "Lpg;")
    private class742 field1846 = new class742();

    @OriginalMember(owner = "client!mj", name = "fe", descriptor = "Lpg;")
    private class742 field1847 = new class742();

    @OriginalMember(owner = "client!mj", name = "le", descriptor = "Z")
    private boolean field1853 = false;

    @OriginalMember(owner = "client!mj", name = "qe", descriptor = "I")
    public int field1858 = 0;

    @OriginalMember(owner = "client!mj", name = "ze", descriptor = "F")
    public float field1867 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "Oe", descriptor = "F")
    public float field1882 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "Re", descriptor = "Z")
    private boolean field1885 = false;

    @OriginalMember(owner = "client!mj", name = "Ue", descriptor = "I")
    private int field1888 = -1;

    @OriginalMember(owner = "client!mj", name = "Pe", descriptor = "F")
    public float field1883 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "ke", descriptor = "Z")
    public boolean field1852 = false;

    @OriginalMember(owner = "client!mj", name = "je", descriptor = "Z")
    public boolean field1851 = true;

    @OriginalMember(owner = "client!mj", name = "Ie", descriptor = "I")
    public int field1876 = 0;

    @OriginalMember(owner = "client!mj", name = "Ee", descriptor = "I")
    public int field1872 = 8;

    @OriginalMember(owner = "client!mj", name = "ge", descriptor = "I")
    public int field1848 = 512;

    @OriginalMember(owner = "client!mj", name = "De", descriptor = "Z")
    private boolean field1871 = false;

    @OriginalMember(owner = "client!mj", name = "Fe", descriptor = "I")
    public int field1873 = 128;

    @OriginalMember(owner = "client!mj", name = "Ae", descriptor = "[F")
    private float[] field1868 = new float[16];

    @OriginalMember(owner = "client!mj", name = "hf", descriptor = "Z")
    private boolean field1901 = false;

    @OriginalMember(owner = "client!mj", name = "re", descriptor = "[F")
    private float[] field1859 = new float[16];

    @OriginalMember(owner = "client!mj", name = "ne", descriptor = "F")
    private float field1855 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "Se", descriptor = "[F")
    public float[] field1886 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!mj", name = "Ye", descriptor = "I")
    public int field1892 = 3;

    @OriginalMember(owner = "client!mj", name = "qf", descriptor = "Z")
    public boolean field1909 = false;

    @OriginalMember(owner = "client!mj", name = "mf", descriptor = "Z")
    public boolean field1905 = true;

    @OriginalMember(owner = "client!mj", name = "xf", descriptor = "I")
    private int field1916 = 0;

    @OriginalMember(owner = "client!mj", name = "Je", descriptor = "F")
    public float field1877 = -1.0F;

    @OriginalMember(owner = "client!mj", name = "vf", descriptor = "I")
    public int field1914 = 0;

    @OriginalMember(owner = "client!mj", name = "ff", descriptor = "Z")
    public boolean field1899 = true;

    @OriginalMember(owner = "client!mj", name = "sf", descriptor = "I")
    public int field1911 = 50;

    @OriginalMember(owner = "client!mj", name = "lf", descriptor = "I")
    public int field1904 = 0;

    @OriginalMember(owner = "client!mj", name = "pf", descriptor = "Z")
    public boolean field1908 = true;

    @OriginalMember(owner = "client!mj", name = "Ze", descriptor = "I")
    private int field1893 = 1;

    @OriginalMember(owner = "client!mj", name = "kf", descriptor = "[F")
    private float[] field1903 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!mj", name = "xe", descriptor = "Llo;")
    public class451 field1865 = class295.field4293;

    @OriginalMember(owner = "client!mj", name = "Te", descriptor = "I")
    public int field1887 = 0;

    @OriginalMember(owner = "client!mj", name = "ef", descriptor = "I")
    private int field1898 = 0;

    @OriginalMember(owner = "client!mj", name = "me", descriptor = "[F")
    private float[] field1854 = new float[16];

    @OriginalMember(owner = "client!mj", name = "bf", descriptor = "Z")
    public boolean field1895 = false;

    @OriginalMember(owner = "client!mj", name = "yf", descriptor = "Z")
    private boolean field1917 = false;

    @OriginalMember(owner = "client!mj", name = "ue", descriptor = "I")
    private int field1862 = -1;

    @OriginalMember(owner = "client!mj", name = "zf", descriptor = "Lmaa;")
    public class461 field1918 = class50.field716;

    @OriginalMember(owner = "client!mj", name = "of", descriptor = "F")
    public float field1907 = -1.0F;

    @OriginalMember(owner = "client!mj", name = "Of", descriptor = "I")
    public int field1933 = 0;

    @OriginalMember(owner = "client!mj", name = "Cf", descriptor = "I")
    private int field1921 = -1;

    @OriginalMember(owner = "client!mj", name = "Me", descriptor = "Z")
    public boolean field1880 = true;

    @OriginalMember(owner = "client!mj", name = "Hf", descriptor = "Z")
    private boolean field1926 = false;

    @OriginalMember(owner = "client!mj", name = "rf", descriptor = "I")
    public int field1910 = 0;

    @OriginalMember(owner = "client!mj", name = "He", descriptor = "[F")
    private float[] field1875 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!mj", name = "tf", descriptor = "F")
    public float field1912 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "Qe", descriptor = "I")
    private int field1884 = 16777215;

    @OriginalMember(owner = "client!mj", name = "jf", descriptor = "Z")
    public boolean field1902 = false;

    @OriginalMember(owner = "client!mj", name = "Df", descriptor = "[F")
    public float[] field1922 = this.field1875;

    @OriginalMember(owner = "client!mj", name = "nf", descriptor = "[F")
    private float[] field1906 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!mj", name = "Vf", descriptor = "[F")
    public float[] field1940 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!mj", name = "Xf", descriptor = "I")
    public int field1942 = -1;

    @OriginalMember(owner = "client!mj", name = "Lf", descriptor = "[Lsba;")
    private class429[] field1930 = new class429[10];

    @OriginalMember(owner = "client!mj", name = "Rf", descriptor = "I")
    public int field1936 = -1;

    @OriginalMember(owner = "client!mj", name = "Wf", descriptor = "F")
    public float field1941 = 3584.0F;

    @OriginalMember(owner = "client!mj", name = "wf", descriptor = "I")
    public int field1915 = 512;

    @OriginalMember(owner = "client!mj", name = "Pf", descriptor = "I")
    public int field1934 = 3584;

    @OriginalMember(owner = "client!mj", name = "cg", descriptor = "I")
    private int field1947 = 0;

    @OriginalMember(owner = "client!mj", name = "Gf", descriptor = "I")
    public int field1925 = 0;

    @OriginalMember(owner = "client!mj", name = "we", descriptor = "I")
    private int field1864 = 0;

    @OriginalMember(owner = "client!mj", name = "Sf", descriptor = "F")
    public float field1937 = 3584.0F;

    @OriginalMember(owner = "client!mj", name = "Kf", descriptor = "I")
    public int field1929 = 0;

    @OriginalMember(owner = "client!mj", name = "Zf", descriptor = "I")
    public int field1944 = 0;

    @OriginalMember(owner = "client!mj", name = "If", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1927 = new Stream();

    @OriginalMember(owner = "client!mj", name = "jg", descriptor = "Lpg;")
    private class742 field1954 = new class742();

    @OriginalMember(owner = "client!mj", name = "Ob", descriptor = "Lgga;")
    public class513 field1726;

    @OriginalMember(owner = "client!mj", name = "Ne", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!mj", name = "cd", descriptor = "Ljava/lang/Object;")
    public Object field1792;

    @OriginalMember(owner = "client!mj", name = "Kb", descriptor = "Ljava/lang/Object;")
    private Object field1722;

    @OriginalMember(owner = "client!mj", name = "Bc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1765;

    @OriginalMember(owner = "client!mj", name = "Yb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1736;

    @OriginalMember(owner = "client!mj", name = "Od", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!mj", name = "Sd", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!mj", name = "Bf", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!mj", name = "Mc", descriptor = "I")
    private int field1776;

    @OriginalMember(owner = "client!mj", name = "Id", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!mj", name = "Qf", descriptor = "Lmv;")
    private class329 field1935;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field1687;

    @OriginalMember(owner = "client!mj", name = "md", descriptor = "Lsi;")
    public static class769 field1802 = new class769(512);

    @OriginalMember(owner = "client!mj", name = "he", descriptor = "F")
    public float field1849;

    @OriginalMember(owner = "client!mj", name = "ie", descriptor = "F")
    private float field1850;

    @OriginalMember(owner = "client!mj", name = "se", descriptor = "F")
    public float field1860;

    @OriginalMember(owner = "client!mj", name = "ve", descriptor = "F")
    private float field1863;

    @OriginalMember(owner = "client!mj", name = "ye", descriptor = "F")
    public float field1866;

    @OriginalMember(owner = "client!mj", name = "We", descriptor = "F")
    public float field1890;

    @OriginalMember(owner = "client!mj", name = "cf", descriptor = "F")
    public float field1896;

    @OriginalMember(owner = "client!mj", name = "Af", descriptor = "F")
    public float field1919;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!mj", name = "kb", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!mj", name = "lb", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!mj", name = "mb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!mj", name = "nb", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!mj", name = "pb", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!mj", name = "qb", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!mj", name = "rb", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!mj", name = "sb", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!mj", name = "tb", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!mj", name = "ub", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!mj", name = "vb", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!mj", name = "wb", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!mj", name = "xb", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!mj", name = "yb", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!mj", name = "zb", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!mj", name = "Ab", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!mj", name = "Bb", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!mj", name = "Cb", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!mj", name = "Db", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!mj", name = "Eb", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!mj", name = "Fb", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!mj", name = "Gb", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!mj", name = "Hb", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!mj", name = "Ib", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!mj", name = "Jb", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!mj", name = "Lb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!mj", name = "Mb", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!mj", name = "Nb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!mj", name = "Pb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!mj", name = "Qb", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!mj", name = "Rb", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!mj", name = "Sb", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!mj", name = "Tb", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!mj", name = "Ub", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!mj", name = "Vb", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!mj", name = "Wb", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!mj", name = "Xb", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!mj", name = "Zb", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!mj", name = "ac", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!mj", name = "bc", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!mj", name = "cc", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!mj", name = "dc", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!mj", name = "ec", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!mj", name = "fc", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!mj", name = "gc", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!mj", name = "hc", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!mj", name = "ic", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!mj", name = "jc", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!mj", name = "kc", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!mj", name = "lc", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!mj", name = "mc", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!mj", name = "nc", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!mj", name = "oc", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!mj", name = "pc", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!mj", name = "qc", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!mj", name = "rc", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!mj", name = "sc", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!mj", name = "tc", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!mj", name = "uc", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!mj", name = "vc", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!mj", name = "wc", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!mj", name = "xc", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!mj", name = "yc", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!mj", name = "zc", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!mj", name = "Ac", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!mj", name = "Cc", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!mj", name = "Dc", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!mj", name = "Ec", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!mj", name = "Fc", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!mj", name = "Gc", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!mj", name = "Hc", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!mj", name = "Ic", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!mj", name = "Jc", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!mj", name = "Kc", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!mj", name = "Nc", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!mj", name = "Oc", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!mj", name = "Pc", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!mj", name = "Qc", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!mj", name = "Rc", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!mj", name = "Uc", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!mj", name = "Vc", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!mj", name = "Wc", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!mj", name = "Xc", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!mj", name = "Yc", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!mj", name = "Zc", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!mj", name = "ad", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!mj", name = "bd", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!mj", name = "dd", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!mj", name = "ed", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!mj", name = "fd", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!mj", name = "gd", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!mj", name = "hd", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!mj", name = "id", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!mj", name = "jd", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!mj", name = "kd", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!mj", name = "ld", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!mj", name = "nd", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!mj", name = "od", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!mj", name = "pd", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!mj", name = "qd", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!mj", name = "rd", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!mj", name = "td", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!mj", name = "ud", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!mj", name = "vd", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!mj", name = "wd", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!mj", name = "xd", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!mj", name = "yd", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!mj", name = "zd", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!mj", name = "Ad", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!mj", name = "Bd", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!mj", name = "Cd", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!mj", name = "Dd", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!mj", name = "Ed", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!mj", name = "Fd", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!mj", name = "Gd", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!mj", name = "Hd", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!mj", name = "Jd", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!mj", name = "Kd", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!mj", name = "Ld", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!mj", name = "Md", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!mj", name = "Nd", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!mj", name = "Pd", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!mj", name = "Rd", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!mj", name = "Td", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!mj", name = "Ud", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!mj", name = "Wd", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!mj", name = "Xd", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!mj", name = "Zd", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!mj", name = "ae", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!mj", name = "oe", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!mj", name = "te", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!mj", name = "Be", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!mj", name = "Ge", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!mj", name = "Le", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!mj", name = "Ve", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!mj", name = "Ff", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!mj", name = "Jf", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "client!mj", name = "Yf", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!mj", name = "ag", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!mj", name = "Bg", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!mj", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!mj", name = "hg", descriptor = "Lija;")
    public class161 field1952;

    @OriginalMember(owner = "client!mj", name = "og", descriptor = "Lija;")
    private class161 field1959;

    @OriginalMember(owner = "client!mj", name = "pg", descriptor = "Lija;")
    public class161 field1960;

    @OriginalMember(owner = "client!mj", name = "sg", descriptor = "Lija;")
    public class161 field1963;

    @OriginalMember(owner = "client!mj", name = "ug", descriptor = "Lija;")
    private class161 field1965;

    @OriginalMember(owner = "client!mj", name = "xg", descriptor = "Lija;")
    public class161 field1968;

    @OriginalMember(owner = "client!mj", name = "zg", descriptor = "Lija;")
    private class161 field1970;

    @OriginalMember(owner = "client!mj", name = "Sc", descriptor = "Lnc;")
    public class227 field1782;

    @OriginalMember(owner = "client!mj", name = "fg", descriptor = "Lte;")
    public class276 field1950;

    @OriginalMember(owner = "client!mj", name = "gg", descriptor = "Lte;")
    public class276 field1951;

    @OriginalMember(owner = "client!mj", name = "kg", descriptor = "Lte;")
    public class276 field1955;

    @OriginalMember(owner = "client!mj", name = "lg", descriptor = "Lte;")
    public class276 field1956;

    @OriginalMember(owner = "client!mj", name = "mg", descriptor = "Lte;")
    public class276 field1957;

    @OriginalMember(owner = "client!mj", name = "ng", descriptor = "Lte;")
    public class276 field1958;

    @OriginalMember(owner = "client!mj", name = "qg", descriptor = "Lte;")
    public class276 field1961;

    @OriginalMember(owner = "client!mj", name = "rg", descriptor = "Lte;")
    public class276 field1962;

    @OriginalMember(owner = "client!mj", name = "tg", descriptor = "Lte;")
    public class276 field1964;

    @OriginalMember(owner = "client!mj", name = "wg", descriptor = "Lte;")
    public class276 field1967;

    @OriginalMember(owner = "client!mj", name = "gf", descriptor = "Len;")
    public class408 field1900;

    @OriginalMember(owner = "client!mj", name = "Nf", descriptor = "Lkca;")
    private class412 field1932;

    @OriginalMember(owner = "client!mj", name = "dg", descriptor = "Lsba;")
    private class429 field1948;

    @OriginalMember(owner = "client!mj", name = "yg", descriptor = "Lvv;")
    private class463 field1969;

    @OriginalMember(owner = "client!mj", name = "eg", descriptor = "Lwba;")
    private class601 field1949;

    @OriginalMember(owner = "client!mj", name = "ig", descriptor = "Lwba;")
    private class601 field1953;

    @OriginalMember(owner = "client!mj", name = "vg", descriptor = "Lwba;")
    private class601 field1966;

    @OriginalMember(owner = "client!mj", name = "pe", descriptor = "Lsja;")
    private class70 field1857;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1670;

    @OriginalMember(owner = "client!mj", name = "sd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field1808;

    @OriginalMember(owner = "client!mj", name = "Tc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field1783;

    @OriginalMember(owner = "client!mj", name = "Xe", descriptor = "Z")
    public boolean field1891;

    @OriginalMember(owner = "client!mj", name = "af", descriptor = "Z")
    public boolean field1894;

    @OriginalMember(owner = "client!mj", name = "Ef", descriptor = "Z")
    public boolean field1923;

    @OriginalMember(owner = "client!mj", name = "Mf", descriptor = "Z")
    public boolean field1931;

    @OriginalMember(owner = "client!mj", name = "Uf", descriptor = "Z")
    public boolean field1939;

    @OriginalMember(owner = "client!mj", name = "Ag", descriptor = "Z")
    public boolean field1971;

    @OriginalMember(owner = "client!mj", name = "Qd", descriptor = "[I")
    public static int[] field1832;

    @OriginalMember(owner = "client!mj", name = "Ce", descriptor = "[Lmfa;")
    public class217[] field1870;

    @OriginalMember(owner = "client!mj", name = "df", descriptor = "[Len;")
    private class408[] field1897;

    @OriginalMember(owner = "client!mj", name = "bg", descriptor = "[Lsaa;")
    public class657[] field1946;

    @OriginalMember(owner = "client!mj", name = "Tf", descriptor = "[Lpg;")
    public class742[] field1938;

    @OriginalMember(owner = "client!mj", name = "Ke", descriptor = "[Lvt;")
    public class768[] field1878;

    @OriginalMember(owner = "client!mj", name = "uf", descriptor = "[Lvt;")
    public class768[] field1913;

    @OriginalMember(owner = "client!mj", name = "ob", descriptor = "[[Z")
    public static boolean[][] field1700;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public final void method456(int arg0) {
        ++field1833;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)Lpg;")
    public final class742 method941(int arg0) {
        ++field1739;
        if (arg0 != -32256) {
            this.field1923 = false;
        }
        return this.field1837;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Lvv;")
    public final class463 method942(int arg0, byte arg1) {
        if (~this.field1969.method35((byte) 127) > ~(arg0 * 2)) {
            this.field1969.method602(17154, arg0);
        }
        if (arg1 < 80) {
            return null;
        } else {
            ++field1815;
            return this.field1969;
        }
    }

    @OriginalMember(owner = "client!mj", name = "HA", descriptor = "(IIII[I)V")
    public final void method483(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field1665;
        float var6 = this.field1843.method4088(-122, (float) arg2, (float) arg0, (float) arg1);
        if (!(var6 < (float) this.field1911) && !((float) this.field1934 < var6)) {
            int var7 = (int) ((float) this.field1848 * this.field1843.method4085(60, (float) arg1, (float) arg2, (float) arg0) / (float) arg3);
            int var8 = (int) ((float) this.field1915 * this.field1843.method4093(105, (float) arg0, (float) arg2, (float) arg1) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[0] = (int) ((float) var7 - this.field1849);
            arg4[1] = (int) ((float) var8 + -this.field1890);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "()[I")
    public final int[] method459() {
        ++field1821;
        return new int[] { this.field1858, this.field1904, this.field1848, this.field1915 };
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(II)Lsba;")
    public class429 method61(int arg0, int arg1) {
        ++field1732;
        if (arg0 != 8983) {
            return null;
        } else if (~arg1 != -7) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    return arg1 == 7 ? new class6(this) : new class737(this);
                } else {
                    return new class514(this, this.field1782);
                }
            } else {
                return new class706(this);
            }
        } else {
            return new class215(this);
        }
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(I)Lpg;")
    public final class742 method943(int arg0) {
        ++field1738;
        if (arg0 != -23324) {
            this.method54(-89);
        }
        return this.field1938[this.field1876];
    }

    @OriginalMember(owner = "client!mj", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method517(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field1817;
        boolean var7 = this.field1884 != arg0;
        if (var7 || this.field1877 != arg1 || this.field1907 != arg2) {
            this.field1884 = arg0;
            this.field1877 = arg1;
            this.field1907 = arg2;
            if (var7) {
                this.field1882 = (float) (this.field1884 & 255) / 255.0F;
                this.field1883 = (float) (this.field1884 & 65280) / 65280.0F;
                this.field1912 = (float) (16711680 & this.field1884) / 1.671168E7F;
                this.method65((byte) -84);
            }
            this.field1687.setSunColour(this.field1912, this.field1883, this.field1882, arg1, arg2);
            this.method104(0);
        }
        if (this.field1903[0] != arg3 || this.field1903[1] != arg4 || this.field1903[2] != arg5) {
            this.field1903[2] = arg5;
            this.field1903[0] = arg3;
            this.field1903[1] = arg4;
            this.field1906[1] = -arg4;
            this.field1906[2] = -arg5;
            this.field1906[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field1940[0] = arg3 * var8;
            this.field1940[2] = arg5 * var8;
            this.field1940[1] = arg4 * var8;
            this.field1886[2] = -this.field1940[2];
            this.field1886[1] = -this.field1940[1];
            this.field1886[0] = -this.field1940[0];
            this.field1687.setSunDirection(this.field1940[0], this.field1940[1], this.field1940[2]);
            this.method105(-14620);
            this.field1856 = (int) (arg3 * 256.0F / arg4);
            this.field1879 = (int) (arg5 * 256.0F / arg4);
        }
        this.method106((byte) 92);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[IZ)Llba;")
    public final class225 method944(int arg0, int arg1, int arg2, int[] arg3, boolean arg4) {
        ++field1786;
        if (arg2 != 21028) {
            this.field1949 = null;
        }
        return this.method125(arg3, 0, arg0, arg1, 0, 9, arg4);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILnea;I[BI)Loq;")
    public abstract class232 method112(int arg0, int arg1, class600 arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)Lpg;")
    public final class742 method945(int arg0) {
        if (arg0 != 1) {
            this.method994((byte) -12, true);
        }
        ++field1773;
        return this.field1845;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)V")
    public final void method946(int arg0, boolean arg1) {
        if (arg0 == -1) {
            if (this.field1852 != arg1) {
                this.field1852 = arg1;
                this.method70((byte) 85);
                this.field1869 &= -8;
            }
            ++field1695;
        }
    }

    @OriginalMember(owner = "client!mj", name = "la", descriptor = "()V")
    public final void method512() {
        this.field1944 = 0;
        this.field1925 = 0;
        this.field1887 = this.field1834;
        this.field1929 = this.field1824;
        ++field1826;
        if (this.field1971) {
            this.field1971 = false;
            this.method113(0);
        }
        this.method1006(98);
    }

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "()Z")
    public final boolean method475() {
        ++field1787;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZ)V")
    public final void method947(byte arg0, boolean arg1) {
        ++field1806;
        if (arg0 < -53) {
            if (this.field1902 == !arg1) {
                this.field1902 = arg1;
                this.method143(false);
                this.field1869 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)Lza;")
    public final class731 method496(int arg0) {
        ++field1676;
        class605 var2 = new class605(arg0);
        this.field1775.method3728((byte) 111, var2);
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public abstract void method106(byte arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V")
    public final void method948(byte arg0, int arg1) {
        this.method1001(arg0 << 8 | arg0 << 24 | arg0 << 16 | arg0, (byte) -2);
        ++field1725;
        if (arg1 != -290369688) {
            this.method978(-49);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)V")
    public final void method949(int arg0, byte arg1) {
        ++field1810;
        if (~arg0 == -2) {
            this.method974(class552.field7657, class552.field7657, (byte) -59);
        } else if (~arg0 == -1) {
            this.method974(class317.field4523, class317.field4523, (byte) -59);
        } else if (arg0 == 2) {
            this.method974(class407.field5606, class552.field7657, (byte) -59);
        } else if (~arg0 != -4) {
            if (~arg0 == -5) {
                this.method974(class785.field10755, class785.field10755, (byte) -59);
            }
        } else {
            this.method974(class228.field3319, class317.field4523, (byte) -59);
        }
        if (arg1 != 57) {
            this.method975((byte) -76, (class742) null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public abstract void method111(byte arg0);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V")
    public final void method950(int arg0) {
        ++field1657;
        if (class50.field716 != this.field1918) {
            class461 var2 = this.field1918;
            this.field1918 = class50.field716;
            if (var2.method2695(27457)) {
                this.method995((byte) -39);
            }
            this.field1869 &= -32;
            this.field1922 = this.field1875;
        }
        if (arg0 < 24) {
            this.field1850 = -0.40801F;
        }
    }

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "(I)V")
    public abstract void method105(int arg0);

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "()Z")
    public final boolean method443() {
        ++field1684;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(Z)V")
    public abstract void method77(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(JI)V")
    public static final void method951(long arg0, int arg1) {
        ++field1768;
        int var3 = class719.field10041.field10347 - -class308.field4392;
        int var4 = class355.field5024 + class719.field10041.field10350;
        if (-var3 + class335.field4760 < -2000 || class335.field4760 - var3 > 2000 || class478.field6577 - var4 < -2000 || -var4 + class478.field6577 > 2000) {
            class478.field6577 = var4;
            class335.field4760 = var3;
        }
        if (~class335.field4760 != ~var3) {
            int var5 = -class335.field4760 + var3;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (~var6 == -1) {
                    var6 = 1;
                } else if (~var6 < ~var5) {
                    var6 = var5;
                }
            } else if (~var6 == -1) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class335.field4760 += var6;
        }
        class98.field1423 += (float) arg0 * class133.field2232 / 6.0F;
        if (class478.field6577 != var4) {
            int var7 = -class478.field6577 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (~var8 == -1) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 != 0) {
                if (~var8 > ~var7) {
                    var8 = var7;
                }
            } else {
                var8 = -1;
            }
            class478.field6577 += var8;
        }
        if (arg1 == 4604) {
            class208.field3031 += (float) arg0 * class322.field4582 / 6.0F;
            class494.method2894(arg1 ^ -4608);
        }
    }

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "(I)V")
    private final void method952(int arg0) {
        this.field1953 = this.method135(false, 0);
        ++field1781;
        this.field1953.method41(140, (byte) 13, 28);
        int var2 = -79 / ((22 - arg0) / 43);
        for (int var3 = 0; ~var3 > -5; ++var3) {
            Buffer var4 = this.field1953.method39(true, 77);
            if (var4 != null) {
                Stream var5 = this.method1007(1, var4);
                if (Stream.method2263()) {
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(1.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(1.0F);
                    var5.method2251(0.0F);
                    var5.method2251(1.0F);
                    var5.method2251(1.0F);
                    var5.method2251(1.0F);
                    var5.method2251(0.0F);
                    var5.method2251(1.0F);
                    var5.method2251(1.0F);
                    var5.method2251(1.0F);
                    var5.method2251(1.0F);
                    var5.method2251(1.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(1.0F);
                    var5.method2251(0.0F);
                    var5.method2251(1.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                    var5.method2251(0.0F);
                } else {
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(1.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(1.0F);
                    var5.method2258(0.0F);
                    var5.method2258(1.0F);
                    var5.method2258(1.0F);
                    var5.method2258(1.0F);
                    var5.method2258(0.0F);
                    var5.method2258(1.0F);
                    var5.method2258(1.0F);
                    var5.method2258(1.0F);
                    var5.method2258(1.0F);
                    var5.method2258(1.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(1.0F);
                    var5.method2258(0.0F);
                    var5.method2258(1.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                    var5.method2258(0.0F);
                }
                var5.method2255();
                if (this.field1953.method36(6740)) {
                    break;
                }
            }
        }
        this.field1970 = this.method126(10, new class249[] { new class249(new class664[] { class664.field9349, class664.field9353, class664.field9353 }) });
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class419 method508(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1654;
        return new class99(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method428(Canvas arg0) {
        ++field1688;
        this.field1736 = null;
        this.field1722 = null;
        if (arg0 != null && this.field1765 != arg0) {
            if (this.field1783.containsKey(arg0)) {
                this.field1722 = this.field1783.get(arg0);
                this.field1736 = arg0;
            }
        } else {
            this.field1736 = this.field1765;
            this.field1722 = this.field1792;
        }
        if (this.field1736 != null && this.field1722 != null) {
            this.method132(19362, this.field1722, this.field1736);
            this.method970(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZ[BIILnea;I)Llba;")
    public abstract class225 method136(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, int arg5, class600 arg6, int arg7);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public final void method499(int arg0) {
        ++field1770;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "()Ldm;")
    public final class765 method463() {
        ++field1764;
        return new class742();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLnea;Ldr;I)Llba;")
    public abstract class225 method63(int arg0, byte arg1, class600 arg2, class629 arg3, int arg4);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "(I)V")
    public abstract void method101(int arg0);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(IIIIII)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1733;
        float var7 = this.method54(-457);
        this.method958(14);
        this.method1001(arg4, (byte) -92);
        this.method1014(0, 97, class504.field6917);
        this.method973(0, class504.field6917, (byte) 90);
        this.method1022(123, arg5);
        this.field1837.method4086((float) (arg2 - 1), 0, 1.0F, (float) (arg3 + -1));
        this.field1837.method4084((float) arg1 - var7, 0.0F, -55, (float) arg0 + -var7);
        this.method1008(-128);
        this.method62(-60, false);
        this.method996(class315.field4465, 4, (byte) 124);
        this.method62(-57, true);
        this.method973(0, class264.field3730, (byte) 99);
        this.method1014(0, 121, class264.field3730);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLnea;Ldr;)Z")
    public abstract boolean method69(byte arg0, class600 arg1, class629 arg2);

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "(III)V")
    public final void method511(int arg0, int arg1, int arg2) {
        ++field1774;
        if (~this.field1936 != ~arg0 || this.field1942 != arg1 || ~this.field1914 != ~arg2) {
            this.field1936 = arg0;
            this.field1914 = arg2;
            this.field1942 = arg1;
            this.method997(0);
            this.method103(0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "(I)V")
    public final void method953(int arg0) {
        ++field1820;
        Enumeration var2 = this.field1783.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method72(this.field1783.get(var3), var3, false);
        }
        this.field1953.method32(16479);
        this.field1966.method32(16479);
        this.field1949.method32(16479);
        this.field1957.method1761((byte) -120);
        this.field1950.method1761((byte) -120);
        this.field1955.method1761((byte) -120);
        this.field1958.method1761((byte) -120);
        this.field1967.method1761((byte) -120);
        this.field1932.method2426((byte) 95);
        if (arg0 <= 59) {
            this.field1886 = null;
        }
        this.field1969.method32(16479);
    }

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "(I)V")
    public final void method954(int arg0) {
        if (arg0 != 0) {
            this.field1944 = 65;
        }
        ++field1835;
        if (this.field1869 != 16) {
            this.method992(-127);
            this.method994((byte) -38, true);
            this.method947((byte) -64, true);
            this.method960(true, 0);
            this.method1022(-93, 1);
            this.field1869 = 16;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILrl;II)V")
    public abstract void method124(int arg0, class713 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mj", name = "ra", descriptor = "(IIII)V")
    public final void method476(int arg0, int arg1, int arg2, int arg3) {
        ++field1683;
        this.field1874 = arg0;
        this.field1947 = arg3;
        this.field1939 = true;
        this.field1862 = arg2;
        this.field1921 = arg1;
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "()I")
    public final int method472() {
        ++field1699;
        return this.field1943 + -2;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(Z)V")
    public abstract void method123(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "(I)V")
    public final void method955(int arg0) {
        if (arg0 != -2) {
            this.field1882 = 1.9370401F;
        }
        if (~this.field1869 != -3) {
            this.method1009((byte) -66);
            this.method994((byte) -38, false);
            this.method946(-1, false);
            this.method947((byte) -123, false);
            this.method960(false, arg0 + 2);
            this.method963(-2, false, (byte) -124, false);
            this.field1869 = 2;
        }
        ++field1747;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)Lwba;")
    public abstract class601 method135(boolean arg0, int arg1);

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "(I)V")
    public abstract void method90(int arg0);

    @OriginalMember(owner = "client!mj", name = "pa", descriptor = "()V")
    public final void method515() {
        ++field1822;
        this.field1939 = false;
    }

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "()I")
    public final int method474() {
        ++field1724;
        return this.field1838 - -this.field1842 + this.field1839;
    }

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "(I)V")
    private final void method956(int arg0) {
        ++field1689;
        if (!this.field1871) {
            float[] var2 = this.field1859;
            float var3 = (float) (-this.field1858 * this.field1911) / (float) this.field1848;
            float var4 = (float) ((-this.field1858 + this.field1834) * this.field1911) / (float) this.field1848;
            float var5 = (float) (this.field1911 * this.field1904) / (float) this.field1915;
            float var6 = (float) ((-this.field1824 + this.field1904) * this.field1911) / (float) this.field1915;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field1911 * 2.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[10] = this.field1850 = (float) this.field1934 / (float) (this.field1911 - this.field1934);
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[6] = 0.0F;
                var2[15] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[14] = this.field1863 = (float) (this.field1934 * this.field1911) / (float) (-this.field1934 + this.field1911);
                var2[11] = -1.0F;
                var2[12] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[4] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
            } else {
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[14] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
            }
            this.method987((byte) 57);
            this.field1871 = true;
        }
        if (arg0 != 20298) {
            this.method998(-104);
        }
    }

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "(I)V")
    private final void method957(int arg0) {
        ++field1729;
        if (arg0 != 0) {
            this.method461(-112);
        }
        this.field1941 = (float) this.field1934;
    }

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "(I)V")
    public abstract void method93(int arg0);

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "(I)V")
    private final void method958(int arg0) {
        ++field1693;
        if (~this.field1869 != -2) {
            this.method1009((byte) -117);
            this.method994((byte) -38, false);
            this.method946(-1, false);
            this.method947((byte) -67, false);
            this.method960(false, 0);
            this.method963(-2, false, (byte) -124, false);
            this.method949(1, (byte) 57);
            this.method988(1, this.field1900);
            this.field1869 = 1;
        }
        if (arg0 != 14) {
            this.method107((byte) 19);
        }
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(II)V")
    public final void method959(int arg0, int arg1) {
        int var3 = 20 % ((arg1 - 53) / 46);
        if (this.field1876 != arg0) {
            this.field1876 = arg0;
            this.method55((byte) -116);
        }
        ++field1679;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public abstract void method65(byte arg0);

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "(IIIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1667;
        this.method453(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZI)V")
    public final void method960(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method954(-40);
        }
        ++field1707;
        if (!arg0 != !this.field1909) {
            this.field1909 = arg0;
            this.method90(113);
            this.field1869 &= -32;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lgga;II)V")
    public class114(Canvas arg0, Object arg1, class103 arg2, class513 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field1726 = arg3;
            this.field1881 = arg4;
            this.field1722 = this.field1792 = arg1;
            this.field1736 = this.field1765 = arg0;
            Dimension var7 = arg0.getSize();
            this.field1834 = this.field1830 = var7.width;
            this.field1920 = arg5;
            this.field1824 = this.field1776 = var7.height;
            class588.method3450(false, (byte) -6, true);
            if (super.field6447 != null) {
                this.field1935 = new class329(this, super.field6447);
                this.field1687 = new NativeInterface(super.field6447.method849(12276), this.field1920);
                for (int var8 = 0; ~var8 > ~super.field6447.method849(12276); ++var8) {
                    class719 var9 = super.field6447.method847(var8, -108);
                    if (var9 != null) {
                        this.field1687.initTextureMetrics(var8, var9.field10046, var9.field10043);
                    }
                }
            } else {
                this.field1687 = new NativeInterface(0, this.field1920);
                this.field1935 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method2779((byte) -118);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "()Z")
    public final boolean method421() {
        ++field1746;
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)V")
    public final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1779;
        float var8 = (float) arg2 - (float) arg0;
        float var9 = (float) (-arg1) + (float) arg3;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method958(14);
        this.method1001(arg4, (byte) 104);
        this.method1014(0, 98, class504.field6917);
        this.method973(0, class504.field6917, (byte) 95);
        this.method1022(-37, arg6);
        this.field1837.method4086(var11, 0, 1.0F, (float) arg5);
        this.field1837.method1558(0, -arg5 / 2, 0);
        this.field1837.method1551(16383 & (int) ((double) var10 * 2607.5945876176133D));
        this.field1837.method1558(arg0, arg1, 0);
        this.method1008(-112);
        this.method62(116, false);
        this.method991(0);
        this.method62(127, true);
        this.method973(0, class264.field3730, (byte) 125);
        this.method1014(0, 82, class264.field3730);
    }

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "(I)V")
    public abstract void method104(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lvr;)V")
    public final void method458(class458 arg0) {
        ++field1753;
        this.field1857 = (class70) arg0;
    }

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "(I)V")
    public final void method961(int arg0) {
        int var2 = 82 / ((-30 - arg0) / 60);
        ++field1737;
        Hashtable var3 = new Hashtable();
        if (this.field1783 != null && !this.field1783.isEmpty()) {
            Enumeration var4 = this.field1783.keys();
            while (var4.hasMoreElements()) {
                Canvas var5 = (Canvas) var4.nextElement();
                var3.put(var5, this.method131(var5, (byte) -1));
            }
        }
        this.field1783 = var3;
        this.method952(-86);
        this.method981((byte) -99);
        this.method968(4);
        this.field1932.method2425(this, (byte) -117);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(IB)V")
    public abstract void method102(int arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public final void method430(int arg0) {
        ++field1669;
    }

    @OriginalMember(owner = "client!mj", name = "xa", descriptor = "(F)V")
    public final void method516(float arg0) {
        if (this.field1867 != arg0) {
            this.field1867 = arg0;
            this.field1687.setAmbient(arg0);
            this.method65((byte) -97);
            this.method106((byte) 91);
        }
        ++field1748;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "()Z")
    public final boolean method479() {
        ++field1713;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field1814;
    }

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1696;
    }

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "(I)V")
    public final void method509(int arg0) {
        this.field1892 = 0;
        ++field1809;
        while (~arg0 < -2) {
            ++this.field1892;
            arg0 >>= 1;
        }
        this.field1872 = 1 << this.field1892;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V")
    private final void method962(byte arg0) {
        ++field1812;
        this.method65((byte) -124);
        this.method104(0);
        this.method70((byte) 85);
        this.method107((byte) -128);
        this.method105(-14620);
        this.method106((byte) 80);
        this.method93(arg0 + 129);
        this.method143(false);
        this.method90(103);
        this.method103(0);
        this.method101(-107);
        this.method111((byte) -27);
        this.method116(-124);
        this.method96(-25707);
        for (int var2 = this.field1861 + -1; var2 >= 0; --var2) {
            this.method959(var2, -71);
            this.method85(arg0 + 120);
            this.method130(16);
            this.method1013(true);
        }
        this.method144(0);
        this.method64(109);
        this.method80((byte) -101);
        if (arg0 == -120) {
            this.method78(0);
            this.method123(true);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lgka;)V")
    public final void method455(class667 arg0) {
        this.field1932.method2423(-1, this, -17047, arg0);
        ++field1723;
    }

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "(I)V")
    public abstract void method113(int arg0);

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "()Z")
    public final boolean method477() {
        ++field1818;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "EA", descriptor = "(IIII)V")
    public final void method440(int arg0, int arg1, int arg2, int arg3) {
        ++field1659;
        if (!this.field1939) {
            throw new RuntimeException("");
        } else {
            this.field1947 = arg3;
            this.field1874 = arg0;
            this.field1921 = arg1;
            this.field1862 = arg2;
            if (this.field1926) {
                this.field1930[3].method1096(37);
                this.field1930[3].method1101(1);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V")
    public abstract void method129(byte arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Lpfa;)Lija;")
    public abstract class161 method126(int arg0, class249[] arg1);

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "(I)V")
    public void method59(int arg0) {
        ++field1663;
        if (arg0 == 2) {
            this.method962((byte) -120);
        }
    }

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "(IIII)V")
    public final void method518(int arg0, int arg1, int arg2, int arg3) {
        ++field1734;
        boolean var5 = false;
        if (~arg0 < ~this.field1925) {
            var5 = true;
            this.field1925 = arg0;
        }
        if (arg2 < this.field1887) {
            this.field1887 = arg2;
            var5 = true;
        }
        if (~this.field1944 > ~arg1) {
            var5 = true;
            this.field1944 = arg1;
        }
        if (~arg3 > ~this.field1929) {
            var5 = true;
            this.field1929 = arg3;
        }
        if (var5) {
            if (!this.field1971) {
                this.field1971 = true;
                this.method113(0);
            }
            this.method77(false);
            this.method1006(57);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIIIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1664;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method1015(0.0F, (float) arg3 + var8, (float) arg1, 63, 0.0F, (float) arg0, (float) arg2 + var9)) {
            this.method958(14);
            this.method1001(arg4, (byte) -27);
            this.method1014(0, 52, class504.field6917);
            this.method973(0, class504.field6917, (byte) 61);
            this.method1022(-106, arg5);
            this.method977((byte) -68);
            this.method62(106, false);
            this.method1012(123);
            this.method62(-120, true);
            this.method973(0, class264.field3730, (byte) 123);
            this.method1014(0, 80, class264.field3730);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZBZ)V")
    public final void method963(int arg0, boolean arg1, byte arg2, boolean arg3) {
        if (arg2 == -124) {
            if (this.field1888 != arg0 || this.field1939 == !this.field1926) {
                class225 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = !this.field1939 ? 0 : 3;
                if (~arg0 > -1) {
                    this.method1013(true);
                } else {
                    var5 = this.field1935.method1997(arg0, arg2 + 57);
                    class719 var10 = super.field6447.method847(arg0, -96);
                    if (var10.field10028 == 0 && ~var10.field10038 == -1) {
                        this.method1013(true);
                    } else {
                        int var11 = !var10.field10044 ? 128 : 64;
                        int var12 = var11 * 50;
                        class742 var13 = this.method943(-23324);
                        var13.method4095((float) (this.field1928 % var12 * var10.field10028) / (float) var12, -27, 0.0F, (float) (this.field1928 % var12 * var10.field10038) / (float) var12);
                        this.method983(arg2 ^ 51, class608.field8647);
                    }
                    var6 = var10.field10039;
                    if (!this.field1939) {
                        var8 = var10.field10040;
                        var9 = var10.field10031;
                        var7 = var10.field10036;
                    }
                }
                this.method993(var7, (byte) 0, arg3, arg1, var8, var9);
                if (this.field1948 != null) {
                    this.field1948.method45(var5, false, var6);
                } else {
                    this.method988(1, var5);
                    this.method949(var6, (byte) 57);
                }
                this.field1926 = this.field1939;
                this.field1888 = arg0;
            }
            ++field1793;
            this.field1869 &= -8;
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(Z)I")
    public final int method964(boolean arg0) {
        if (!arg0) {
            this.field1846 = null;
        }
        ++field1794;
        return this.field1876;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public abstract Object method131(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIF)Lmfa;")
    public final class217 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field1714;
        return new class178(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lnea;Ldr;I)Z")
    public abstract boolean method92(class600 arg0, class629 arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "(IIIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method453(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field1816;
    }

    @OriginalMember(owner = "client!mj", name = "JA", descriptor = "(IIIIII)I")
    public final int method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1720;
        int var7 = 0;
        float var8 = (float) arg2 * this.field1843.field10307 + (float) arg0 * this.field1843.field10305 + (float) arg1 * this.field1843.field10267 + this.field1843.field10278;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field1843.field10307 + (float) arg3 * this.field1843.field10305 + (float) arg4 * this.field1843.field10267 + this.field1843.field10278;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field1911 && var9 < (float) this.field1911) {
            var7 |= 16;
        } else if ((float) this.field1934 < var8 && (float) this.field1934 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field1843.field10287 + (float) arg0 * this.field1843.field10270 + (float) arg1 * this.field1843.field10303 + this.field1843.field10313) * (float) this.field1848 / var8);
        int var11 = (int) (((float) arg5 * this.field1843.field10287 + (float) arg3 * this.field1843.field10270 + (float) arg4 * this.field1843.field10303 + this.field1843.field10313) * (float) this.field1848 / var9);
        if ((float) var10 < this.field1849 && this.field1849 > (float) var11) {
            var7 |= 1;
        } else if (this.field1896 < (float) var10 && (float) var11 > this.field1896) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field1843.field10298 + (float) arg0 * this.field1843.field10273 + (float) arg1 * this.field1843.field10264 + this.field1843.field10282) * (float) this.field1915 / var8);
        int var13 = (int) (((float) arg5 * this.field1843.field10298 + (float) arg3 * this.field1843.field10273 + (float) arg4 * this.field1843.field10264 + this.field1843.field10282) * (float) this.field1915 / var9);
        if ((float) var12 < this.field1890 && this.field1890 > (float) var13) {
            var7 |= 4;
        } else if (this.field1860 < (float) var12 && (float) var13 > this.field1860) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILnea;[FIZIB)Llba;")
    public abstract class225 method118(int arg0, int arg1, class600 arg2, float[] arg3, int arg4, boolean arg5, int arg6, byte arg7);

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)V")
    private final void method965(byte arg0) {
        this.field1917 = false;
        ++field1796;
        this.method1019((byte) -67);
        if (arg0 == -38) {
            if (class635.field8952 == this.field1918) {
                this.method1021(2);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(FB)V")
    public final void method966(float arg0, byte arg1) {
        if (this.field1855 != arg0) {
            this.field1855 = arg0;
            this.method965((byte) -38);
        }
        ++field1652;
        if (arg1 < 101) {
            this.field1933 = -74;
        }
    }

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "()Z")
    public final boolean method424() {
        ++field1766;
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "aa", descriptor = "(IIIIII)V")
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method958(14);
        ++field1752;
        this.method1001(arg4, (byte) -41);
        this.method1014(0, 97, class504.field6917);
        this.method973(0, class504.field6917, (byte) 90);
        this.method1022(126, arg5);
        this.field1837.method4086((float) arg2, 0, 1.0F, (float) arg3);
        this.field1837.method1558(arg0, arg1, 0);
        this.method1008(-105);
        this.method62(-36, false);
        this.method991(0);
        this.method62(-64, true);
        this.method973(0, class264.field3730, (byte) 62);
        this.method1014(0, 72, class264.field3730);
    }

    @OriginalMember(owner = "client!mj", name = "da", descriptor = "(III[I)V")
    public final void method485(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1743;
        float var5 = this.field1843.method4088(-100, (float) arg2, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field1858;
            var7 = this.field1904;
        } else {
            var6 = (int) ((float) this.field1848 * this.field1843.method4085(124, (float) arg1, (float) arg2, (float) arg0) / var5);
            var7 = (int) ((float) this.field1915 * this.field1843.method4093(88, (float) arg0, (float) arg2, (float) arg1) / var5);
        }
        arg3[1] = (int) ((float) var7 - this.field1890);
        arg3[0] = (int) ((float) var6 - this.field1849);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z[[IIZ)Lwf;")
    public abstract class540 method81(boolean arg0, int[][] arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "(I)Lpg;")
    public final class742 method967(int arg0) {
        if (arg0 != -30860) {
            this.field1931 = false;
        }
        ++field1813;
        return this.field1846;
    }

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "(I)V")
    private final void method968(int arg0) {
        if (arg0 == 4) {
            ++field1742;
            this.field1949 = this.method135(false, arg0 + -4);
            this.field1949.method41(3096, (byte) 94, 12);
            for (int var2 = 0; var2 < 4; ++var2) {
                Buffer var3 = this.field1949.method39(true, arg0 ^ 105);
                if (var3 != null) {
                    Stream var4 = this.method1007(1, var3);
                    var4.method2251(0.0F);
                    var4.method2251(0.0F);
                    var4.method2251(0.0F);
                    for (int var5 = 0; var5 <= 256; ++var5) {
                        double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                        float var8 = (float) Math.cos(var6);
                        float var9 = (float) Math.sin(var6);
                        if (Stream.method2263()) {
                            var4.method2251(var9);
                            var4.method2251(var8);
                            var4.method2251(0.0F);
                        } else {
                            var4.method2258(var9);
                            var4.method2258(var8);
                            var4.method2258(0.0F);
                        }
                    }
                    var4.method2255();
                    if (this.field1949.method36(6740)) {
                        break;
                    }
                }
            }
            this.field1959 = this.method126(10, new class249[] { new class249(class664.field9349) });
        }
    }

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "()Z")
    public final boolean method454() {
        ++field1690;
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8) {
        ++field1761;
    }

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "(I)V")
    public abstract void method130(int arg0);

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(Z)V")
    private final void method969(boolean arg0) {
        ++field1811;
        if (class72.field1135 == this.field1918) {
            float var2 = this.method54(-457);
            this.field1837.method4084(var2, 0.0F, -77, var2);
        }
        this.field1885 = arg0;
        this.method78(0);
        if (this.field1948 != null) {
            this.field1948.method1099(37);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lida;IIII)Lka;")
    public final class233 method514(class678 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1800;
        return new class276(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(Z)V")
    private final void method970(boolean arg0) {
        if (arg0) {
            this.field1924 = -98;
        }
        ++field1655;
        if (this.field1736 == null) {
            this.field1830 = this.field1776 = 1;
        } else {
            Dimension var2 = this.field1736.getSize();
            this.field1830 = var2.width;
            this.field1776 = var2.height;
        }
        this.field1834 = this.field1830;
        this.field1824 = this.field1776;
        this.method971(-14006);
        this.method984(-117);
        this.method965((byte) -38);
        this.method64(38);
        this.method1006(50);
        this.method950(80);
        this.method512();
    }

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "(I)V")
    private final void method971(int arg0) {
        ++field1745;
        this.field1901 = false;
        if (class72.field1135 == this.field1918) {
            this.method1002(false);
            this.method1021(arg0 ^ -14008);
        }
        if (arg0 != -14006) {
            this.method116(-98);
        }
    }

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "(I)[F")
    public final float[] method972(int arg0) {
        if (arg0 != 0) {
            this.field1888 = -50;
        }
        ++field1788;
        return this.field1875;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public abstract void method72(Object arg0, Canvas arg1, boolean arg2);

    @OriginalMember(owner = "client!mj", name = "XA", descriptor = "()I")
    public final int method445() {
        ++field1798;
        return this.field1934;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    public final void method461(int arg0) {
        ++field1780;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lup;B)V")
    public abstract void method98(class547 arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "(IIIIIII)I")
    public final int method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1795;
        int var8 = 0;
        float var9 = (float) arg2 * this.field1843.field10307 + (float) arg0 * this.field1843.field10305 + (float) arg1 * this.field1843.field10267 + this.field1843.field10278;
        float var10 = (float) arg5 * this.field1843.field10307 + (float) arg3 * this.field1843.field10305 + (float) arg4 * this.field1843.field10267 + this.field1843.field10278;
        if ((float) this.field1911 > var9 && (float) this.field1911 > var10) {
            var8 |= 16;
        } else if (var9 > (float) this.field1934 && var10 > (float) this.field1934) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field1843.field10287 + (float) arg0 * this.field1843.field10270 + (float) arg1 * this.field1843.field10303 + this.field1843.field10313) * (float) this.field1848 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field1843.field10287 + (float) arg3 * this.field1843.field10270 + (float) arg4 * this.field1843.field10303 + this.field1843.field10313) * (float) this.field1848 / (float) arg6);
        if ((float) var11 < this.field1849 && this.field1849 > (float) var12) {
            var8 |= 1;
        } else if ((float) var11 > this.field1896 && this.field1896 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field1843.field10298 + (float) arg0 * this.field1843.field10273 + (float) arg1 * this.field1843.field10264 + this.field1843.field10282) * (float) this.field1915 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field1843.field10298 + (float) arg3 * this.field1843.field10273 + (float) arg4 * this.field1843.field10264 + this.field1843.field10282) * (float) this.field1915 / (float) arg6);
        if (this.field1890 > (float) var13 && (float) var14 < this.field1890) {
            var8 |= 4;
        } else if (this.field1860 < (float) var13 && (float) var14 > this.field1860) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILgca;B)V")
    public final void method973(int arg0, class705 arg1, byte arg2) {
        if (arg2 <= 55) {
            this.method462();
        }
        this.method133(arg0, false, arg1, (byte) 119);
        ++field1719;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lvt;Lvt;B)V")
    public final void method974(class768 arg0, class768 arg1, byte arg2) {
        ++field1680;
        boolean var4 = false;
        if (this.field1878[this.field1876] != arg0) {
            this.field1878[this.field1876] = arg0;
            var4 = true;
            this.method85(0);
        }
        if (arg2 == -59) {
            if (this.field1913[this.field1876] != arg1) {
                this.field1913[this.field1876] = arg1;
                this.method130(16);
                var4 = true;
            }
            if (var4) {
                this.field1869 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(B)V")
    public abstract void method70(byte arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([I)V")
    public final void method467(int[] arg0) {
        arg0[1] = this.field1824;
        arg0[0] = this.field1834;
        ++field1784;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLpg;)V")
    public final void method975(byte arg0, class742 arg1) {
        this.field1837.method1552(arg1);
        ++field1674;
        this.field1840 = false;
        this.method969(false);
        if (arg0 > -111) {
            this.method487((class418) null, false);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(BZ)V")
    public final void method976(byte arg0, boolean arg1) {
        if (this.field1908 == !arg1) {
            this.field1908 = arg1;
            this.method103(0);
        }
        ++field1653;
        if (arg0 >= -98) {
            this.field1808 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "()Ldm;")
    public final class765 method457() {
        ++field1797;
        return this.field1954;
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(B)V")
    public final void method977(byte arg0) {
        ++field1711;
        this.field1837.method1569();
        if (arg0 != -68) {
            this.method999(true, 101, 71);
        }
        this.field1840 = true;
        this.method969(false);
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V")
    public final void method470(int arg0) {
        ++field1691;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field1935 != null) {
                this.field1935.method1996(false);
            }
            this.field1873 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "(I)V")
    public abstract void method85(int arg0);

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "(I)V")
    public final void method978(int arg0) {
        if (arg0 != -22232) {
            this.method423(31, -12, true);
        }
        ++field1789;
        this.method950(44);
        this.method1021(2);
    }

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "(I)V")
    private final void method979(int arg0) {
        if (arg0 == 30399) {
            ++field1668;
            this.method129((byte) -54);
            if (this.field1948 != null) {
                this.field1948.method1097(-65);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(B)V")
    public final void method980(byte arg0) {
        this.field1878 = new class768[this.field1861];
        this.field1946 = new class657[this.field1861];
        this.field1897 = new class408[this.field1861];
        this.field1938 = new class742[this.field1861];
        this.field1913 = new class768[this.field1861];
        ++field1671;
        for (int var2 = 0; var2 < this.field1861; ++var2) {
            this.field1913[var2] = class317.field4523;
            this.field1878[var2] = class317.field4523;
            this.field1946[var2] = class527.field7355;
            this.field1938[var2] = new class742();
        }
        this.field1870 = new class217[this.field1943 - 2];
        this.field1900 = this.method63(1, (byte) -128, class133.field2225, class629.field8918, 1);
        this.method425(new class605(262144));
        this.field1963 = this.method126(arg0 ^ 119, new class249[] { new class249(new class664[] { class664.field9349, class664.field9353 }) });
        this.field1960 = this.method126(10, new class249[] { new class249(new class664[] { class664.field9349, class664.field9351 }) });
        this.field1968 = this.method126(10, new class249[] { new class249(class664.field9349), new class249(class664.field9351), new class249(class664.field9353), new class249(class664.field9350) });
        this.field1952 = this.method126(10, new class249[] { new class249(class664.field9349), new class249(class664.field9351), new class249(class664.field9353) });
        this.field1956 = new class276(this, 0, 0, false, false);
        this.field1957 = new class276(this, 0, 0, true, true);
        this.field1962 = new class276(this, 0, 0, false, false);
        this.field1950 = new class276(this, 0, 0, true, true);
        this.field1964 = new class276(this, 0, 0, false, false);
        this.field1955 = new class276(this, 0, 0, true, true);
        this.field1961 = new class276(this, 0, 0, false, false);
        this.field1958 = new class276(this, 0, 0, true, true);
        if (arg0 != 125) {
            this.field1726 = null;
        }
        this.field1951 = new class276(this, 0, 0, false, false);
        this.field1967 = new class276(this, 0, 0, true, true);
        this.field1932 = new class412(this);
        this.field1969 = this.method84(arg0 ^ -11, true);
        this.method961(arg0 ^ 86);
        this.field1782 = new class227(this);
        this.field1930[1] = this.method61(8983, 1);
        this.field1930[2] = this.method61(arg0 + 8858, 2);
        this.field1930[4] = this.method61(8983, 4);
        this.field1930[5] = this.method61(8983, 5);
        this.field1930[6] = this.method61(8983, 6);
        this.field1930[7] = this.method61(8983, 7);
        this.field1930[3] = this.method61(8983, 3);
        this.field1930[8] = this.method61(8983, 8);
        this.field1930[9] = this.method61(8983, 9);
        if (!this.field1930[2].method48((byte) -128)) {
            this.field1930[2] = this.method61(8983, 0);
        }
        if (!this.field1930[4].method48((byte) -128)) {
            this.field1930[4] = this.field1930[2];
        }
        if (!this.field1930[8].method48((byte) -128)) {
            this.field1930[8] = this.field1930[4];
        }
        if (!this.field1930[9].method48((byte) -128)) {
            this.field1930[9] = this.field1930[8];
        }
        this.method59(2);
        this.method512();
        this.method138();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZ)Lmq;")
    public final class85 method423(int arg0, int arg1, boolean arg2) {
        ++field1694;
        return new class315(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(Z)V")
    public final void method466(boolean arg0) {
        ++field1744;
    }

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "(Z)V")
    public final void method513(boolean arg0) {
        ++field1730;
        this.field1880 = arg0;
        this.method90(117);
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public void method74(int arg0) {
        ++field1718;
        if (this.field1935 != null) {
            this.field1935.method1999(-107);
        }
        this.field1928 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(B)V")
    private final void method981(byte arg0) {
        ++field1771;
        int var2 = 94 % ((-52 - arg0) / 41);
        this.field1966 = this.method135(true, 0);
        this.field1966.method41(24, (byte) -113, 12);
        this.field1965 = this.method126(10, new class249[] { new class249(class664.field9349) });
    }

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "(I)I")
    public final int method982(int arg0) {
        int var2 = -122 % ((arg0 - 6) / 36);
        ++field1731;
        return this.field1874;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method432(Canvas arg0, int arg1, int arg2) {
        ++field1807;
        Object var4 = null;
        if (arg0 != null && this.field1765 != arg0) {
            if (this.field1783.containsKey(arg0)) {
                var4 = this.field1783.get(arg0);
            }
        } else {
            var4 = this.field1722;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method134(0, var4, arg0);
            if (this.field1736 == arg0) {
                this.method970(false);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILsaa;)V")
    public final void method983(int arg0, class657 arg1) {
        this.field1946[this.field1876] = arg1;
        ++field1763;
        this.method979(30399);
        int var3 = 110 / ((arg0 - -4) / 47);
    }

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "(I)V")
    private final void method984(int arg0) {
        if (arg0 > -60) {
            this.method1022(101, -124);
        }
        ++field1805;
        this.field1871 = false;
        this.method956(20298);
        if (class110.field1553 == this.field1918) {
            this.method1021(2);
        }
    }

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "()Z")
    public final boolean method446() {
        ++field1692;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "(I)V")
    public final void method985(int arg0) {
        if (this.field1869 != arg0) {
            this.method1009((byte) -61);
            this.method994((byte) -38, false);
            this.method946(-1, false);
            this.method947((byte) -86, false);
            this.method960(false, 0);
            this.method963(-2, false, (byte) -124, false);
            this.method1022(127, 1);
            this.method949(0, (byte) 57);
            this.field1869 = 4;
        }
        ++field1704;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lde;Z)Lmq;")
    public final class85 method487(class418 arg0, boolean arg1) {
        ++field1712;
        class85 var9;
        if (arg0.field5796 != 0 && arg0.field5792 != 0) {
            int[] var3 = new int[arg0.field5796 * arg0.field5792];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field5798 != null) {
                for (int var6 = 0; var6 < arg0.field5792; ++var6) {
                    for (int var7 = 0; var7 < arg0.field5796; ++var7) {
                        var3[var5++] = class694.method3895(arg0.field5795[class194.method1380(255, arg0.field5793[var4])], arg0.field5798[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~arg0.field5792 < ~var8; ++var8) {
                    for (int var10 = 0; ~arg0.field5796 < ~var10; ++var10) {
                        int var11 = arg0.field5795[arg0.field5793[var4++] & 255];
                        var3[var5++] = var11 != 0 ? class694.method3895(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method2773(1, arg0.field5796, var3, 0, arg0.field5792, arg0.field5796);
        } else {
            var9 = this.method2773(1, 1, new int[1], 0, 1, 1);
        }
        var9.method2(arg0.field5794, arg0.field5799, arg0.field5797, arg0.field5800);
        return var9;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IZ)V")
    public final void method986(int arg0, boolean arg1) {
        ++field1772;
        if (this.field1895 != arg1) {
            this.field1895 = arg1;
            this.method70((byte) 85);
        }
        if (arg0 < 108) {
            this.field1951 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(II)V")
    public final void method484(int arg0, int arg1) {
        if (this.field1911 != arg0 || ~this.field1934 != ~arg1) {
            this.field1934 = arg1;
            this.field1911 = arg0;
            this.method984(-80);
            this.method965((byte) -38);
            this.method997(0);
        }
        ++field1681;
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(B)V")
    private final void method987(byte arg0) {
        this.field1859[10] = this.field1850;
        this.field1859[14] = this.field1863;
        ++field1825;
        int var2 = 88 % ((arg0 - -62) / 49);
        this.field1937 = (this.field1859[14] - (float) this.field1934) / this.field1859[10];
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(IZ)V")
    public abstract void method62(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZLgca;B)V")
    public abstract void method133(int arg0, boolean arg1, class705 arg2, byte arg3);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILen;)V")
    public final void method988(int arg0, class408 arg1) {
        ++field1754;
        if (this.field1897[this.field1876] != arg1) {
            this.field1897[this.field1876] = arg1;
            if (arg1 != null) {
                arg1.method1159(16033);
            } else {
                this.method68(true);
            }
            this.field1869 &= -2;
        }
        if (arg0 != 1) {
            this.method1018(19);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
    public final void method490() {
        ++field1762;
        if (this.field1935 != null) {
            this.field1935.method1996(false);
        }
    }

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "(I)V")
    public abstract void method144(int arg0);

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "(I)V")
    public final void method989(int arg0) {
        if (arg0 > -98) {
            this.method135(false, -59);
        }
        ++field1759;
        if (~this.field1869 != -9) {
            this.method1004(-8);
            this.method994((byte) -38, true);
            this.method947((byte) -65, true);
            this.method960(true, 0);
            this.method1022(-107, 1);
            this.field1869 = 8;
        }
    }

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "(I)V")
    public abstract void method116(int arg0);

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "(I)F")
    public abstract float method54(int arg0);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)I")
    public final int method497(int arg0, int arg1) {
        ++field1756;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "(I)V")
    public abstract void method64(int arg0);

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "([I)V")
    public final void method422(int[] arg0) {
        arg0[2] = this.field1887;
        arg0[1] = this.field1944;
        arg0[3] = this.field1929;
        ++field1708;
        arg0[0] = this.field1925;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1790;
    }

    @OriginalMember(owner = "client!mj", name = "KA", descriptor = "(IIII)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3) {
        ++field1703;
        if (~arg0 >= -1 && ~arg2 <= ~(this.field1834 + -1) && ~arg1 >= -1 && ~(this.field1824 + -1) >= ~arg3) {
            this.method512();
        } else {
            this.field1887 = arg2 > this.field1834 ? 0 : arg2;
            this.field1944 = arg1 < 0 ? 0 : arg1;
            this.field1925 = arg0 < 0 ? 0 : arg0;
            this.field1929 = ~this.field1834 > ~arg3 ? 0 : arg3;
            if (!this.field1971) {
                this.field1971 = true;
                this.method113(0);
            }
            this.method77(false);
            this.method1006(-114);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method132(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)I")
    public final int method426(int arg0, int arg1) {
        ++field1757;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "()V")
    public void method142() {
        if (!this.field1853) {
            for (class766 var1 = this.field1775.method3731((byte) -123); var1 != null; var1 = this.field1775.method3729((byte) -127)) {
                ((class605) var1).method3510((byte) 74);
            }
            Enumeration var2 = this.field1783.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method72(this.field1783.get(var3), var3, false);
            }
            class511.method2982(0, true, false);
            this.field1687.release();
            this.field1853 = true;
        }
        ++field1767;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([IIIIIIZ)Llba;")
    public abstract class225 method125(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lnea;ZI[BIB)Llba;")
    public final class225 method990(class600 arg0, boolean arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        int var7 = -62 % ((9 - arg5) / 35);
        ++field1682;
        return this.method136(arg2, -55, arg1, arg3, 0, arg4, arg0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "(I)V")
    public final void method991(int arg0) {
        this.method996(class595.field8512, 2, (byte) 87);
        ++field1785;
        if (arg0 != 0) {
            this.method1020(-43);
        }
    }

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "(I)V")
    private final void method992(int arg0) {
        if (class635.field8952 != this.field1918) {
            class461 var2 = this.field1918;
            this.field1918 = class635.field8952;
            if (!var2.method2695(27457)) {
                this.method995((byte) -39);
            }
            this.method1019((byte) -67);
            this.field1922 = this.field1868;
            this.method1021(2);
            this.field1869 &= -8;
        }
        ++field1755;
        int var3 = 36 % ((-62 - arg0) / 50);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBZZII)V")
    private final void method993(int arg0, byte arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        boolean var7 = arg2 & this.method435();
        ++field1662;
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            arg5 = 2;
            arg4 = arg5 != 4 ? 1 : arg0 & 1;
            arg0 = 0;
        }
        if (~arg5 != -1 && arg3) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field1916 != arg5) {
            if (this.field1916 != 0) {
                this.field1930[this.field1916 & Integer.MAX_VALUE].method47((byte) 126);
            }
            if (arg5 != 0) {
                this.field1948 = this.field1930[arg5 & Integer.MAX_VALUE];
                this.field1948.method44(arg3, false);
                this.field1948.method43(arg1, arg3);
                this.field1948.method46(arg1 ^ 37, arg4, arg0);
            } else {
                this.field1948 = null;
            }
            this.field1916 = arg5;
            this.field1898 = arg0;
            this.field1864 = arg4;
        } else if (~this.field1916 != -1) {
            this.field1930[Integer.MAX_VALUE & this.field1916].method43(0, arg3);
            if (~this.field1898 != ~arg0 || this.field1864 != arg4) {
                this.field1930[this.field1916 & Integer.MAX_VALUE].method46(arg1 + 37, arg4, arg0);
                this.field1898 = arg0;
                this.field1864 = arg4;
            }
        }
        if (arg1 != 0) {
            this.field1929 = 46;
        }
    }

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "(ILaa;II)V")
    public final void method464(int arg0, class88 arg1, int arg2, int arg3) {
        ++field1716;
        class381 var5 = (class381) arg1;
        class225 var6 = var5.field5335;
        this.method955(-2);
        this.method988(1, var6);
        this.method1022(127, 1);
        this.method974(class552.field7657, class552.field7657, (byte) -59);
        this.method1014(0, 124, class504.field6917);
        this.method1001(arg0, (byte) 116);
        this.field1837.method4086((float) this.field1834, 0, 0.0F, (float) this.field1824);
        this.method1008(-105);
        this.field1938[0].method4086(var6.method328(431, (float) this.field1834), 0, 1.0F, var6.method330((float) this.field1824, 125));
        this.field1938[0].method4084(var6.method330((float) (-arg3), -117), 0.0F, -34, var6.method328(431, (float) (-arg2)));
        this.field1946[0] = class608.field8647;
        this.method979(30399);
        this.method991(0);
        this.method1013(true);
        this.method1014(0, 89, class264.field3730);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lgka;I)V")
    public final void method429(class667 arg0, int arg1) {
        this.field1932.method2423(arg1, this, -17047, arg0);
        ++field1791;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(BZ)V")
    public final void method994(byte arg0, boolean arg1) {
        ++field1672;
        if (arg0 != -38) {
            this.method511(-36, -110, -119);
        }
        if (!arg1 == this.field1931) {
            this.field1931 = arg1;
            this.method103(0);
            this.field1869 &= -32;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZZLgca;I)V")
    public abstract void method139(int arg0, boolean arg1, boolean arg2, class705 arg3, int arg4);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "(B)V")
    private final void method995(byte arg0) {
        this.field1885 = false;
        ++field1660;
        if (this.field1948 != null) {
            this.field1948.method1098(0);
        }
        this.method123(true);
        if (arg0 != -39) {
            this.field1915 = 65;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lrl;IB)V")
    private final void method996(class713 arg0, int arg1, byte arg2) {
        if (arg2 > 68) {
            this.method71((byte) -43, 0, this.field1953);
            ++field1685;
            this.method89(this.field1970, 126);
            this.method124(0, arg0, arg1, 25886);
        }
    }

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "(I)V")
    private final void method997(int arg0) {
        if (this.field1948 != null) {
            this.field1948.method1101(1);
        }
        ++field1658;
        if (arg0 == 0) {
            this.method101(arg0 ^ -103);
        }
    }

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "(B)V")
    public void method107(byte arg0) {
        this.field1889 = this.field1924;
        ++field1675;
        if (arg0 >= -127) {
            this.field1967 = null;
        }
        this.field1924 = 0;
    }

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "(I)I")
    public final int method998(int arg0) {
        if (arg0 != 5) {
            this.method427(-29, -101, -34, -12, -46, -0.56932944F);
        }
        ++field1721;
        return this.field1862;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method999(boolean arg0, int arg1, int arg2) {
        ++field1709;
        int var4 = 52 % ((-6 - arg2) / 60);
        return this.field1670.method2247(arg1, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(Z)V")
    public abstract void method143(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "(B)V")
    public abstract void method80(byte arg0);

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(Z)V")
    public abstract void method68(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(ZI)V")
    public final void method1000(boolean arg0, int arg1) {
        if (this.field1899 != arg0) {
            this.field1899 = arg0;
            this.method93(9);
        }
        if (arg1 > -90) {
            this.field1839 = -34;
        }
        ++field1829;
    }

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "()Z")
    public final boolean method500() {
        ++field1678;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(IB)V")
    public final void method1001(int arg0, byte arg1) {
        ++field1819;
        if (this.field1945 != arg0) {
            this.field1945 = arg0;
            this.method144(0);
        }
        int var3 = -70 / ((47 - arg1) / 49);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method134(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(Z)V")
    private final void method1002(boolean arg0) {
        if (arg0) {
            this.field1887 = 66;
        }
        ++field1666;
        if (!this.field1901) {
            float[] var2 = this.field1854;
            if (~this.field1834 != -1 && ~this.field1824 != -1) {
                var2[1] = 0.0F;
                var2[5] = -2.0F / (float) this.field1824;
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[14] = 0.5F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (float) this.field1834;
                var2[15] = 1.0F;
                var2[10] = 0.5F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = -1.0F;
                var2[13] = 1.0F;
            } else {
                var2[8] = 0.0F;
                var2[10] = 1.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 1.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
            }
            this.field1901 = true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "(I)Lpg;")
    public final class742 method1003(int arg0) {
        ++field1698;
        if (arg0 > -71) {
            field1832 = null;
        }
        return this.field1938[this.field1876];
    }

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "(III[I)V")
    public final void method482(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1697;
        float var5 = this.field1843.method4088(-80, (float) arg2, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field1858;
            var7 = this.field1904;
        } else {
            var6 = (int) ((float) this.field1848 * this.field1843.method4085(99, (float) arg1, (float) arg2, (float) arg0) / var5);
            var7 = (int) ((float) this.field1915 * this.field1843.method4093(89, (float) arg0, (float) arg2, (float) arg1) / var5);
        }
        arg3[1] = (int) ((float) var7 - this.field1890);
        arg3[0] = (int) ((float) var6 + -this.field1849);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "(I)V")
    private final void method1004(int arg0) {
        if (class110.field1553 != this.field1918) {
            class461 var2 = this.field1918;
            this.field1918 = class110.field1553;
            if (!var2.method2695(27457)) {
                this.method995((byte) -39);
            }
            this.method956(20298);
            this.field1922 = this.field1859;
            this.method1021(2);
            this.field1869 &= -8;
        }
        ++field1727;
        if (arg0 != -8) {
            this.method441(-73, -36, -113, 60, -118, 74, -128, 43, 114, -106, -112, 54, 25);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[I[I)Laa;")
    public final class88 method431(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field1728;
        return class501.method2924(arg1, arg3, -16777216, arg2, arg0, this);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method437(Canvas arg0, int arg1, int arg2) {
        ++field1836;
        if (this.field1765 == arg0) {
            throw new RuntimeException();
        } else if (!this.field1783.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method131(arg0, (byte) -1);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field1783.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldm;)V")
    public final void method498(class765 arg0) {
        this.field1843 = (class742) arg0;
        ++field1799;
        this.field1845.method1552(this.field1843);
        this.field1845.method4092(94);
        this.field1846.method4091(this.field1845, (byte) -27);
        this.field1844.method4091(this.field1843, (byte) -115);
        if (this.field1918.method2695(27457)) {
            this.method995((byte) -39);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1758;
        float var10 = (float) (-arg0) + (float) arg2;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method958(14);
        this.method1001(arg4, (byte) 125);
        this.method1014(0, 127, class504.field6917);
        this.method973(0, class504.field6917, (byte) 110);
        this.method1022(1, arg5);
        this.method977((byte) -68);
        this.method62(-111, false);
        int var14 = arg8 % (arg7 - -arg6);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (arg6 < var14) {
            var18 = (float) (arg6 - var14 + arg7) * var11;
            var17 = (float) (-var14 + arg7 + arg6) * var12;
        } else {
            var19 = (float) (-var14 + arg6) * var12;
            var20 = (float) (-var14 + arg6) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg0 > ~arg2) {
                if ((float) arg2 < var21) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if (var21 < (float) arg2) {
                    break;
                }
                if (var19 + var21 < (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (~arg3 < ~arg1) {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if ((float) arg3 > var22) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method1015(0.0F, var20 + var22, var22, 60, 0.0F, var21, var19 + var21)) {
                return;
            }
            this.method1012(116);
            var21 += var19 + var23;
            var22 += var20 + var24;
            var20 = var16;
            var19 = var15;
        }
        this.method62(-100, true);
        this.method973(0, class264.field3730, (byte) 112);
        this.method1014(0, 90, class264.field3730);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lija;I)V")
    public abstract void method89(class161 arg0, int arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z[FLnea;III)Llba;")
    public final class225 method1005(boolean arg0, float[] arg1, class600 arg2, int arg3, int arg4, int arg5) {
        int var7 = 66 / ((-15 - arg4) / 35);
        ++field1778;
        return this.method118(0, arg3, arg2, arg1, arg5, arg0, 0, (byte) 64);
    }

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "(I)V")
    private final void method1006(int arg0) {
        this.field1896 = (float) (-this.field1858 + this.field1887);
        int var2 = -26 % ((-13 - arg0) / 34);
        this.field1860 = (float) (-this.field1904 + this.field1929);
        this.field1890 = (float) (this.field1944 - this.field1904);
        this.field1849 = (float) (this.field1925 - this.field1858);
        ++field1702;
    }

    @OriginalMember(owner = "client!mj", name = "za", descriptor = "(IIIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method958(14);
        ++field1831;
        this.method1001(arg3, (byte) -95);
        this.method1014(0, 124, class504.field6917);
        this.method973(0, class504.field6917, (byte) 110);
        this.method1022(-10, arg4);
        this.field1837.method4086((float) arg2, 0, 1.0F, (float) arg2);
        this.field1837.method1558(arg0, arg1, 0);
        this.method1008(-128);
        this.method62(111, false);
        this.method71((byte) -43, 0, this.field1949);
        this.method89(this.field1959, 125);
        this.method124(0, class595.field8512, 256, 25886);
        this.method62(-91, true);
        this.method973(0, class264.field3730, (byte) 122);
        this.method1014(0, 102, class264.field3730);
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(IZ)Lvv;")
    public abstract class463 method84(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method1007(int arg0, Buffer arg1) {
        if (arg0 != 1) {
            this.field1904 = 50;
        }
        ++field1710;
        this.field1927.method2256(arg1);
        return this.field1927;
    }

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "(I)V")
    public abstract void method78(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Lmfa;)V")
    public final void method504(int arg0, class217[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field1870[var3] = arg1[var3];
        }
        ++field1717;
        this.field1924 = arg0;
        if (this.field1918.method2695(27457)) {
            this.method107((byte) -128);
        }
    }

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "(I)V")
    public final void method1008(int arg0) {
        this.field1840 = false;
        ++field1673;
        if (arg0 > -104) {
            this.field1938 = null;
        }
        this.method969(false);
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "()I")
    public final int method462() {
        ++field1751;
        return this.field1911;
    }

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "(I)V")
    public abstract void method103(int arg0);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "(B)V")
    private final void method1009(byte arg0) {
        if (class72.field1135 != this.field1918) {
            class461 var2 = this.field1918;
            this.field1918 = class72.field1135;
            if (var2.method2695(27457)) {
                this.method995((byte) -39);
            }
            this.method1002(false);
            this.field1922 = this.field1854;
            this.method1021(2);
            this.field1869 &= -25;
        }
        if (arg0 >= -55) {
            this.field1936 = -31;
        }
        ++field1651;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILvv;Lrl;III)V")
    public abstract void method140(int arg0, int arg1, class463 arg2, class713 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZ)Lmq;")
    public final class85 method503(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1686;
        class315 var6 = new class315(this, arg2, arg3, arg4);
        var6.method276(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "(B)V")
    public abstract void method55(byte arg0);

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "(B)I")
    public final int method1010(byte arg0) {
        ++field1740;
        return arg0 != -111 ? 47 : this.field1921;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[F)[F")
    public final float[] method1011(int arg0, float[] arg1) {
        arg1[4] = this.field1922[1];
        arg1[0] = this.field1922[0];
        ++field1841;
        arg1[12] = this.field1922[3];
        arg1[8] = this.field1922[2];
        arg1[2] = this.field1922[8];
        arg1[13] = this.field1922[7];
        arg1[5] = this.field1922[5];
        arg1[1] = this.field1922[4];
        arg1[9] = this.field1922[6];
        arg1[3] = this.field1922[12];
        arg1[10] = this.field1922[10];
        arg1[6] = this.field1922[9];
        arg1[14] = this.field1922[11];
        if (arg0 != -22482) {
            this.field1869 = 97;
        }
        arg1[7] = this.field1922[13];
        arg1[11] = this.field1922[14];
        arg1[15] = this.field1922[15];
        return arg1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method492(Canvas arg0) {
        ++field1823;
        if (this.field1765 == arg0) {
            throw new RuntimeException();
        } else if (this.field1783.containsKey(arg0)) {
            this.method72(this.field1783.get(arg0), arg0, false);
            this.field1783.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "(I)V")
    private final void method1012(int arg0) {
        ++field1741;
        this.method71((byte) -43, 0, this.field1966);
        if (arg0 < 80) {
            this.field1890 = -1.4663763F;
        }
        this.method89(this.field1965, 127);
        this.method124(0, class591.field8480, 1, 25886);
    }

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "()Ldm;")
    public final class765 method489() {
        ++field1760;
        return this.field1843;
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(Z)V")
    public final void method1013(boolean arg0) {
        if (!arg0) {
            this.field1954 = null;
        }
        ++field1715;
        if (this.field1946[this.field1876] != class527.field7355) {
            this.field1946[this.field1876] = class527.field7355;
            this.field1938[this.field1876].method1569();
            this.method979(30399);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lrt;[Lde;Z)Lda;")
    public final class443 method491(class470 arg0, class418[] arg1, boolean arg2) {
        ++field1656;
        return new class19(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "DA", descriptor = "(IIII)V")
    public final void method449(int arg0, int arg1, int arg2, int arg3) {
        this.field1904 = arg1;
        this.field1858 = arg0;
        this.field1848 = arg2;
        ++field1735;
        this.field1915 = arg3;
        this.method965((byte) -38);
        this.method984(-126);
        this.method950(121);
        this.method1006(84);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILwba;)V")
    public abstract void method71(byte arg0, int arg1, class601 arg2);

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(IIIIII)Lvr;")
    public final class458 method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1677;
        return new class317(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILgca;)V")
    public final void method1014(int arg0, int arg1, class705 arg2) {
        if (arg1 < 42) {
            this.field1840 = true;
        }
        ++field1706;
        this.method139(arg0, false, false, arg2, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(FFFIFFF)Z")
    private final boolean method1015(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
        ++field1828;
        Buffer var8 = this.field1966.method39(true, 43);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method1007(1, var8);
            if (arg3 <= 15) {
                this.field1867 = 0.9614648F;
            }
            if (Stream.method2263()) {
                var9.method2251(arg5);
                var9.method2251(arg2);
                var9.method2251(arg0);
                var9.method2251(arg6);
                var9.method2251(arg1);
                var9.method2251(arg4);
            } else {
                var9.method2258(arg5);
                var9.method2258(arg2);
                var9.method2258(arg0);
                var9.method2258(arg6);
                var9.method2258(arg1);
                var9.method2258(arg4);
            }
            var9.method2255();
            return this.field1966.method36(6740);
        }
    }

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "(Z)I")
    public final int method1016(boolean arg0) {
        if (!arg0) {
            this.field1965 = null;
        }
        ++field1803;
        return this.field1947;
    }

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "(I)V")
    public static void method1017(int arg0) {
        field1700 = null;
        field1832 = null;
        if (arg0 != -21599) {
            method1017(-128);
        }
        field1802 = null;
    }

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "(I)Lpg;")
    public final class742 method1018(int arg0) {
        if (arg0 <= 48) {
            this.field1900 = null;
        }
        ++field1701;
        if (!this.field1885) {
            this.field1847.method4087(this.field1845, this.field1837);
            this.field1885 = true;
        }
        return this.field1847;
    }

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "(B)V")
    private final void method1019(byte arg0) {
        if (!this.field1917) {
            float[] var2 = this.field1868;
            float var3 = (float) this.field1911;
            float var4 = (float) this.field1934;
            float var5 = (float) (-this.field1904) * this.field1855 / (float) this.field1915;
            float var6 = (float) (-this.field1858) * this.field1855 / (float) this.field1848;
            float var7 = (float) (this.field1834 - this.field1858) * this.field1855 / (float) this.field1848;
            float var8 = (float) (-this.field1904 + this.field1824) * this.field1855 / (float) this.field1915;
            if (var6 != var7 && var5 != var8) {
                var2[9] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = var3 / (var3 - var4);
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
            } else {
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[13] = 0.0F;
                var2[0] = 1.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
            }
            this.method957(arg0 + 67);
            this.field1917 = true;
        }
        ++field1769;
        if (arg0 != -67) {
            this.field1867 = -1.3288599F;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lza;)V")
    public final void method425(class731 arg0) {
        this.field1670 = ((class605) arg0).field8587;
        ++field1749;
        this.field1808 = this.field1670.method2247(32768, false);
    }

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "(I)Lwf;")
    public final class540 method1020(int arg0) {
        if (arg0 != 512) {
            return null;
        } else {
            ++field1801;
            return this.field1857 == null ? null : this.field1857.method676(arg0 + -1662);
        }
    }

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "(I)V")
    public abstract void method96(int arg0);

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "(I)V")
    private final void method1021(int arg0) {
        this.method80((byte) -101);
        ++field1827;
        if (this.field1948 != null) {
            this.field1948.method1095(100);
        }
        if (arg0 != 2) {
            this.field1942 = 43;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([IIIIIZ)Lmq;")
    public final class85 method460(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1705;
        return new class315(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "()Z")
    public final boolean method433() {
        ++field1777;
        return this.field1923;
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "()Z")
    public final boolean method435() {
        ++field1804;
        return this.field1930[3].method48((byte) -128);
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(II)V")
    public final void method1022(int arg0, int arg1) {
        if (this.field1893 != arg1) {
            boolean var3;
            class451 var4;
            boolean var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = class295.field4293;
                var5 = true;
            } else if (~arg1 != -3) {
                if (~arg1 != -129) {
                    var5 = false;
                    var3 = false;
                    var4 = class345.field4893;
                } else {
                    var5 = true;
                    var4 = class741.field10255;
                    var3 = true;
                }
            } else {
                var4 = class599.field8548;
                var3 = true;
                var5 = false;
            }
            if (this.field1851 != var5) {
                this.field1851 = var5;
                this.method96(-25707);
            }
            if (this.field1905 == !var3) {
                this.field1905 = var3;
                this.method111((byte) -120);
            }
            if (this.field1865 != var4) {
                this.field1865 = var4;
                this.method116(-57);
            }
            this.field1893 = arg1;
            this.field1869 &= -29;
        }
        ++field1750;
        int var6 = 1 / ((arg0 - 64) / 59);
    }

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "()I")
    public final int method473() {
        ++field1661;
        return this.field1972;
    }
}
