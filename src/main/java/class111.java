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

@OriginalClass("client!ej")
public abstract class class111 extends class651 {

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Lgj;")
    private class593 field1641 = new class593();

    @OriginalMember(owner = "client!ej", name = "Zd", descriptor = "Z")
    public boolean field1811 = true;

    @OriginalMember(owner = "client!ej", name = "Yd", descriptor = "Lhaa;")
    public class74 field1810 = new class74();

    @OriginalMember(owner = "client!ej", name = "be", descriptor = "Lhaa;")
    public class74 field1813 = new class74();

    @OriginalMember(owner = "client!ej", name = "ce", descriptor = "Lhaa;")
    public class74 field1814 = new class74();

    @OriginalMember(owner = "client!ej", name = "de", descriptor = "Lhaa;")
    public class74 field1815 = new class74();

    @OriginalMember(owner = "client!ej", name = "ee", descriptor = "Lhaa;")
    private class74 field1816 = new class74();

    @OriginalMember(owner = "client!ej", name = "fe", descriptor = "Lhaa;")
    private class74 field1817 = new class74();

    @OriginalMember(owner = "client!ej", name = "qe", descriptor = "I")
    private int field1828 = 1;

    @OriginalMember(owner = "client!ej", name = "oe", descriptor = "Z")
    public boolean field1826 = false;

    @OriginalMember(owner = "client!ej", name = "ue", descriptor = "[Llu;")
    private class669[] field1832 = new class669[10];

    @OriginalMember(owner = "client!ej", name = "ge", descriptor = "Z")
    public boolean field1818 = false;

    @OriginalMember(owner = "client!ej", name = "he", descriptor = "I")
    public int field1819 = 8;

    @OriginalMember(owner = "client!ej", name = "ve", descriptor = "F")
    public float field1833 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "pe", descriptor = "I")
    public int field1827 = -1;

    @OriginalMember(owner = "client!ej", name = "Oe", descriptor = "Z")
    public boolean field1852 = false;

    @OriginalMember(owner = "client!ej", name = "af", descriptor = "[F")
    private float[] field1864 = new float[16];

    @OriginalMember(owner = "client!ej", name = "He", descriptor = "I")
    private int field1845 = 0;

    @OriginalMember(owner = "client!ej", name = "ef", descriptor = "Lgt;")
    public class425 field1868 = class655.field8876;

    @OriginalMember(owner = "client!ej", name = "Me", descriptor = "I")
    public int field1850 = 0;

    @OriginalMember(owner = "client!ej", name = "bf", descriptor = "F")
    public float field1865 = -1.0F;

    @OriginalMember(owner = "client!ej", name = "ff", descriptor = "[F")
    private float[] field1869 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ej", name = "ne", descriptor = "I")
    public int field1825 = 0;

    @OriginalMember(owner = "client!ej", name = "Ke", descriptor = "Z")
    public boolean field1848 = true;

    @OriginalMember(owner = "client!ej", name = "je", descriptor = "Z")
    public boolean field1821 = false;

    @OriginalMember(owner = "client!ej", name = "Af", descriptor = "Z")
    private boolean field1889 = false;

    @OriginalMember(owner = "client!ej", name = "Ie", descriptor = "I")
    public int field1846 = 128;

    @OriginalMember(owner = "client!ej", name = "ke", descriptor = "I")
    private int field1822 = -1;

    @OriginalMember(owner = "client!ej", name = "rf", descriptor = "I")
    public int field1880 = 0;

    @OriginalMember(owner = "client!ej", name = "Ue", descriptor = "F")
    private float field1858 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "kf", descriptor = "[F")
    private float[] field1873 = new float[16];

    @OriginalMember(owner = "client!ej", name = "gf", descriptor = "F")
    public float field1870 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "ie", descriptor = "I")
    public int field1820 = 50;

    @OriginalMember(owner = "client!ej", name = "Df", descriptor = "I")
    public int field1892 = 3;

    @OriginalMember(owner = "client!ej", name = "mf", descriptor = "[F")
    public float[] field1875 = this.field1869;

    @OriginalMember(owner = "client!ej", name = "Ye", descriptor = "I")
    public int field1862 = 0;

    @OriginalMember(owner = "client!ej", name = "Ve", descriptor = "I")
    public int field1859 = 0;

    @OriginalMember(owner = "client!ej", name = "Lf", descriptor = "I")
    public int field1900 = 3584;

    @OriginalMember(owner = "client!ej", name = "wf", descriptor = "[F")
    private float[] field1885 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ej", name = "Xe", descriptor = "F")
    public float field1861 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "Bf", descriptor = "[F")
    public float[] field1890 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!ej", name = "se", descriptor = "I")
    public int field1830 = -1;

    @OriginalMember(owner = "client!ej", name = "me", descriptor = "I")
    public int field1824 = 0;

    @OriginalMember(owner = "client!ej", name = "Nf", descriptor = "Z")
    public boolean field1902 = true;

    @OriginalMember(owner = "client!ej", name = "we", descriptor = "F")
    private float field1834 = 3000.0F;

    @OriginalMember(owner = "client!ej", name = "jf", descriptor = "[F")
    private float[] field1872 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ej", name = "Qf", descriptor = "I")
    public int field1905 = 0;

    @OriginalMember(owner = "client!ej", name = "We", descriptor = "F")
    public float field1860 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "Ff", descriptor = "F")
    public float field1894 = 3584.0F;

    @OriginalMember(owner = "client!ej", name = "Pf", descriptor = "Z")
    private boolean field1904 = false;

    @OriginalMember(owner = "client!ej", name = "Of", descriptor = "I")
    public int field1903 = -1;

    @OriginalMember(owner = "client!ej", name = "te", descriptor = "I")
    private int field1831 = 0;

    @OriginalMember(owner = "client!ej", name = "zf", descriptor = "Z")
    private boolean field1888 = false;

    @OriginalMember(owner = "client!ej", name = "Mf", descriptor = "[F")
    public float[] field1901 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ej", name = "yf", descriptor = "I")
    private int field1887 = 0;

    @OriginalMember(owner = "client!ej", name = "Be", descriptor = "Z")
    public boolean field1839 = true;

    @OriginalMember(owner = "client!ej", name = "Ef", descriptor = "I")
    public int field1893 = 512;

    @OriginalMember(owner = "client!ej", name = "Xf", descriptor = "I")
    private int field1912 = -1;

    @OriginalMember(owner = "client!ej", name = "If", descriptor = "I")
    public int field1897 = 0;

    @OriginalMember(owner = "client!ej", name = "cf", descriptor = "I")
    private int field1866 = 0;

    @OriginalMember(owner = "client!ej", name = "Te", descriptor = "Z")
    private boolean field1857 = false;

    @OriginalMember(owner = "client!ej", name = "sf", descriptor = "I")
    public int field1881 = 0;

    @OriginalMember(owner = "client!ej", name = "xf", descriptor = "Z")
    private boolean field1886 = false;

    @OriginalMember(owner = "client!ej", name = "Vf", descriptor = "I")
    public int field1910 = 0;

    @OriginalMember(owner = "client!ej", name = "ze", descriptor = "Z")
    public boolean field1837 = true;

    @OriginalMember(owner = "client!ej", name = "bg", descriptor = "F")
    public float field1916 = 3584.0F;

    @OriginalMember(owner = "client!ej", name = "Sf", descriptor = "I")
    public int field1907 = 512;

    @OriginalMember(owner = "client!ej", name = "cg", descriptor = "F")
    public float field1917 = -1.0F;

    @OriginalMember(owner = "client!ej", name = "nf", descriptor = "Lkf;")
    public class235 field1876 = class664.field9422;

    @OriginalMember(owner = "client!ej", name = "Rf", descriptor = "I")
    private int field1906 = 16777215;

    @OriginalMember(owner = "client!ej", name = "df", descriptor = "Z")
    public boolean field1867 = true;

    @OriginalMember(owner = "client!ej", name = "Uf", descriptor = "[F")
    private float[] field1909 = new float[16];

    @OriginalMember(owner = "client!ej", name = "Hf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1896 = new Stream();

    @OriginalMember(owner = "client!ej", name = "kg", descriptor = "Lhaa;")
    private class74 field1925 = new class74();

    @OriginalMember(owner = "client!ej", name = "Db", descriptor = "Lbi;")
    public class449 field1685;

    @OriginalMember(owner = "client!ej", name = "tf", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!ej", name = "Id", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1794;

    @OriginalMember(owner = "client!ej", name = "Ub", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1702;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "Ljava/lang/Object;")
    public Object field1652;

    @OriginalMember(owner = "client!ej", name = "pd", descriptor = "Ljava/lang/Object;")
    private Object field1775;

    @OriginalMember(owner = "client!ej", name = "td", descriptor = "I")
    private int field1779;

    @OriginalMember(owner = "client!ej", name = "nb", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!ej", name = "xe", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!ej", name = "id", descriptor = "I")
    private int field1768;

    @OriginalMember(owner = "client!ej", name = "Ac", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!ej", name = "hf", descriptor = "Luda;")
    private class421 field1871;

    @OriginalMember(owner = "client!ej", name = "Cb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field1684;

    @OriginalMember(owner = "client!ej", name = "re", descriptor = "F")
    public float field1829;

    @OriginalMember(owner = "client!ej", name = "Qe", descriptor = "F")
    public float field1854;

    @OriginalMember(owner = "client!ej", name = "pf", descriptor = "F")
    public float field1878;

    @OriginalMember(owner = "client!ej", name = "vf", descriptor = "F")
    private float field1884;

    @OriginalMember(owner = "client!ej", name = "Gf", descriptor = "F")
    public float field1895;

    @OriginalMember(owner = "client!ej", name = "Jf", descriptor = "F")
    public float field1898;

    @OriginalMember(owner = "client!ej", name = "Wf", descriptor = "F")
    private float field1911;

    @OriginalMember(owner = "client!ej", name = "Zf", descriptor = "F")
    public float field1914;

    @OriginalMember(owner = "client!ej", name = "dg", descriptor = "F")
    private float field1918;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ej", name = "fb", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ej", name = "gb", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ej", name = "hb", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ej", name = "ib", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ej", name = "jb", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ej", name = "kb", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ej", name = "lb", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ej", name = "mb", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ej", name = "ob", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ej", name = "pb", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ej", name = "qb", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ej", name = "rb", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ej", name = "sb", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ej", name = "tb", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ej", name = "ub", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ej", name = "vb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ej", name = "wb", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ej", name = "xb", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ej", name = "zb", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!ej", name = "Ab", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ej", name = "Bb", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ej", name = "Fb", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ej", name = "Gb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ej", name = "Hb", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ej", name = "Ib", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ej", name = "Jb", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ej", name = "Kb", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ej", name = "Lb", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!ej", name = "Mb", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ej", name = "Nb", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!ej", name = "Ob", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ej", name = "Pb", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ej", name = "Qb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ej", name = "Rb", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ej", name = "Sb", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ej", name = "Tb", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ej", name = "Vb", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ej", name = "Wb", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ej", name = "Xb", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ej", name = "Yb", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ej", name = "Zb", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ej", name = "ac", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ej", name = "cc", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ej", name = "dc", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ej", name = "ec", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ej", name = "fc", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ej", name = "gc", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ej", name = "hc", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ej", name = "ic", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ej", name = "jc", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ej", name = "kc", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ej", name = "lc", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ej", name = "mc", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ej", name = "nc", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ej", name = "oc", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ej", name = "pc", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ej", name = "qc", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ej", name = "rc", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ej", name = "sc", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ej", name = "tc", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ej", name = "uc", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ej", name = "vc", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ej", name = "wc", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ej", name = "xc", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ej", name = "yc", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ej", name = "zc", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ej", name = "Bc", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ej", name = "Cc", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ej", name = "Dc", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ej", name = "Ec", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ej", name = "Fc", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ej", name = "Gc", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ej", name = "Hc", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ej", name = "Ic", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!ej", name = "Jc", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ej", name = "Kc", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ej", name = "Lc", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ej", name = "Mc", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ej", name = "Nc", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ej", name = "Oc", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ej", name = "Pc", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ej", name = "Qc", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ej", name = "Rc", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ej", name = "Sc", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ej", name = "Tc", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ej", name = "Uc", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ej", name = "Vc", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ej", name = "Wc", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ej", name = "Xc", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ej", name = "Yc", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ej", name = "Zc", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ej", name = "ad", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ej", name = "bd", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ej", name = "cd", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ej", name = "dd", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ej", name = "ed", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ej", name = "fd", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ej", name = "gd", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ej", name = "hd", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ej", name = "jd", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ej", name = "kd", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ej", name = "ld", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ej", name = "md", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ej", name = "nd", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ej", name = "od", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ej", name = "qd", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ej", name = "rd", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ej", name = "sd", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ej", name = "ud", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ej", name = "vd", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ej", name = "wd", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ej", name = "xd", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ej", name = "zd", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ej", name = "Ad", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ej", name = "Bd", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ej", name = "Cd", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ej", name = "Dd", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ej", name = "Ed", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ej", name = "Fd", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ej", name = "Gd", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ej", name = "Hd", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ej", name = "Jd", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ej", name = "Kd", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ej", name = "Ld", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ej", name = "Md", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ej", name = "Nd", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ej", name = "Od", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ej", name = "Pd", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ej", name = "Qd", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ej", name = "Sd", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ej", name = "Td", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ej", name = "Ud", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ej", name = "Vd", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!ej", name = "Wd", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ej", name = "Xd", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!ej", name = "ae", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!ej", name = "Ae", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!ej", name = "Ge", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!ej", name = "Le", descriptor = "I")
    private int field1849;

    @OriginalMember(owner = "client!ej", name = "Pe", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!ej", name = "Re", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!ej", name = "Se", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!ej", name = "lf", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!ej", name = "Cf", descriptor = "I")
    public int field1891;

    @OriginalMember(owner = "client!ej", name = "Kf", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!ej", name = "eg", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!ej", name = "Ag", descriptor = "I")
    private int field1941;

    @OriginalMember(owner = "client!ej", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!ej", name = "yd", descriptor = "Lop;")
    public static class177 field1784;

    @OriginalMember(owner = "client!ej", name = "yb", descriptor = "Lmca;")
    public class29 field1680;

    @OriginalMember(owner = "client!ej", name = "Ce", descriptor = "Lnq;")
    public class430 field1840;

    @OriginalMember(owner = "client!ej", name = "xg", descriptor = "Leu;")
    private class448 field1938;

    @OriginalMember(owner = "client!ej", name = "yg", descriptor = "Leu;")
    private class448 field1939;

    @OriginalMember(owner = "client!ej", name = "Ee", descriptor = "Lva;")
    private class464 field1842;

    @OriginalMember(owner = "client!ej", name = "fg", descriptor = "Lcn;")
    public class482 field1920;

    @OriginalMember(owner = "client!ej", name = "ig", descriptor = "Lcn;")
    public class482 field1923;

    @OriginalMember(owner = "client!ej", name = "jg", descriptor = "Lcn;")
    public class482 field1924;

    @OriginalMember(owner = "client!ej", name = "mg", descriptor = "Lcn;")
    public class482 field1927;

    @OriginalMember(owner = "client!ej", name = "ng", descriptor = "Lcn;")
    public class482 field1928;

    @OriginalMember(owner = "client!ej", name = "og", descriptor = "Lcn;")
    public class482 field1929;

    @OriginalMember(owner = "client!ej", name = "rg", descriptor = "Lcn;")
    public class482 field1932;

    @OriginalMember(owner = "client!ej", name = "sg", descriptor = "Lcn;")
    public class482 field1933;

    @OriginalMember(owner = "client!ej", name = "tg", descriptor = "Lcn;")
    public class482 field1934;

    @OriginalMember(owner = "client!ej", name = "wg", descriptor = "Lcn;")
    public class482 field1937;

    @OriginalMember(owner = "client!ej", name = "ug", descriptor = "Lft;")
    private class4 field1935;

    @OriginalMember(owner = "client!ej", name = "gg", descriptor = "Lts;")
    public class501 field1921;

    @OriginalMember(owner = "client!ej", name = "hg", descriptor = "Lts;")
    private class501 field1922;

    @OriginalMember(owner = "client!ej", name = "lg", descriptor = "Lts;")
    public class501 field1926;

    @OriginalMember(owner = "client!ej", name = "pg", descriptor = "Lts;")
    private class501 field1930;

    @OriginalMember(owner = "client!ej", name = "qg", descriptor = "Lts;")
    public class501 field1931;

    @OriginalMember(owner = "client!ej", name = "vg", descriptor = "Lts;")
    public class501 field1936;

    @OriginalMember(owner = "client!ej", name = "De", descriptor = "Lac;")
    private class506 field1841;

    @OriginalMember(owner = "client!ej", name = "qf", descriptor = "Llu;")
    private class669 field1879;

    @OriginalMember(owner = "client!ej", name = "Rd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1803;

    @OriginalMember(owner = "client!ej", name = "Eb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field1686;

    @OriginalMember(owner = "client!ej", name = "bc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field1709;

    @OriginalMember(owner = "client!ej", name = "le", descriptor = "Z")
    public boolean field1823;

    @OriginalMember(owner = "client!ej", name = "ye", descriptor = "Z")
    public boolean field1836;

    @OriginalMember(owner = "client!ej", name = "Ze", descriptor = "Z")
    public boolean field1863;

    @OriginalMember(owner = "client!ej", name = "uf", descriptor = "Z")
    public boolean field1883;

    @OriginalMember(owner = "client!ej", name = "Yf", descriptor = "Z")
    public boolean field1913;

    @OriginalMember(owner = "client!ej", name = "zg", descriptor = "Z")
    public boolean field1940;

    @OriginalMember(owner = "client!ej", name = "Je", descriptor = "[Lnq;")
    private class430[] field1847;

    @OriginalMember(owner = "client!ej", name = "Fe", descriptor = "[Leb;")
    public class584[] field1843;

    @OriginalMember(owner = "client!ej", name = "ag", descriptor = "[Lpv;")
    public class65[] field1915;

    @OriginalMember(owner = "client!ej", name = "Ne", descriptor = "[Lnea;")
    public class670[] field1851;

    @OriginalMember(owner = "client!ej", name = "Tf", descriptor = "[Lnea;")
    public class670[] field1908;

    @OriginalMember(owner = "client!ej", name = "of", descriptor = "[Lhaa;")
    public class74[] field1877;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V", line = 3)
    private final void method823(int arg0) {
        if (this.field1849 != 1) {
            this.method854((byte) 116);
            this.method825(-5284, false);
            this.method903(false, false);
            this.method875(false, (byte) -117);
            this.method826(false, 83);
            this.method846(false, -2, false, (byte) 54);
            this.method858(1, 25681);
            this.method897(this.field1840, true);
            this.field1849 = 1;
        }
        ++field1797;
        int var2 = -90 / ((52 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I", line = 30)
    public final int method376(int arg0, int arg1) {
        ++field1725;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ej", name = "sa", descriptor = "(II)V", line = 38)
    public final void method450(int arg0, int arg1) {
        if (~this.field1820 != ~arg0 || ~this.field1900 != ~arg1) {
            this.field1820 = arg0;
            this.field1900 = arg1;
            this.method855((byte) -66);
            this.method891(0);
            this.method863(7);
        }
        ++field1687;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lkga;[Lpga;Z)Lta;", line = 55)
    public final class200 method389(class511 arg0, class500[] arg1, boolean arg2) {
        ++field1722;
        return new class151(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ej", name = "JA", descriptor = "(I)V", line = 64)
    public final void method377(int arg0) {
        ++field1701;
        this.field1892 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field1892;
        }
        this.field1819 = 1 << this.field1892;
    }

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "(I)V", line = 79)
    public void method83(int arg0) {
        this.field1856 = this.field1874;
        ++field1651;
        this.field1874 = 0;
        if (arg0 != -32352) {
            this.method108(true, 109);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 91)
    public final void method824(byte arg0) {
        ++field1713;
        int var2 = 40 / ((70 - arg0) / 46);
        this.method868(Integer.MAX_VALUE);
        this.method881(true);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V", line = 102)
    public final void method825(int arg0, boolean arg1) {
        if (!arg1 != !this.field1823) {
            this.field1823 = arg1;
            this.method78(8);
            this.field1849 &= -32;
        }
        if (arg0 == -5284) {
            ++field1719;
        }
    }

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "()Z", line = 124)
    public final boolean method416() {
        ++field1674;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(ZI)V", line = 132)
    public final void method826(boolean arg0, int arg1) {
        if (arg1 > 63) {
            if (arg0 == !this.field1818) {
                this.field1818 = arg0;
                this.method58(true);
                this.field1849 &= -32;
            }
            ++field1756;
        }
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(IIIII)V", line = 151)
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1689;
    }

    @OriginalMember(owner = "client!ej", name = "ka", descriptor = "(FF)V", line = 159)
    public final void method385(float arg0, float arg1) {
        if (this.field1834 != arg0 || this.field1911 != arg1) {
            this.field1911 = arg1;
            this.field1834 = arg0;
            this.method899(-32);
            this.method873(-23969);
            this.method891(0);
            this.method855((byte) -123);
        }
        ++field1643;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lq;)V", line = 178)
    public final void method405(class397 arg0) {
        ++field1762;
        this.field1813 = (class74) arg0;
        this.field1815.method560(this.field1813);
        this.field1815.method562((byte) -87);
        this.field1816.method564(this.field1815, true);
        this.field1814.method564(this.field1813, true);
        if (this.field1868.method2430(0)) {
            this.method837(false);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I", line = 195)
    public final int method460(int arg0, int arg1) {
        ++field1717;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(Z)V", line = 204)
    private final void method827(boolean arg0) {
        ++field1766;
        if (arg0) {
            this.field1918 = -0.98342305F;
        }
        if (this.field1702 != null) {
            Dimension var2 = this.field1702.getSize();
            this.field1768 = var2.height;
            this.field1779 = var2.width;
        } else {
            this.field1779 = this.field1768 = 1;
        }
        this.field1734 = this.field1768;
        this.field1669 = this.field1779;
        this.method861(3906);
        this.method855((byte) -70);
        this.method891(0);
        this.method43((byte) -125);
        this.method840(0);
        this.method868(Integer.MAX_VALUE);
        this.method435();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILgf;I)V", line = 242)
    public final void method828(int arg0, class256 arg1, int arg2) {
        this.method57(arg1, false, (byte) -115, arg2);
        ++field1628;
        if (arg0 < 16) {
            this.field1838 = -104;
        }
    }

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)V", line = 257)
    public final void method457(int arg0) {
        ++field1774;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field1846 = arg0;
            this.field1871.method2424((byte) -116);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "()I", line = 270)
    public final int method464() {
        ++field1644;
        return this.field1820;
    }

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "()Z", line = 278)
    public final boolean method388() {
        ++field1720;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 286)
    public final void method375(Canvas arg0) {
        ++field1634;
        if (this.field1794 == arg0) {
            throw new RuntimeException();
        } else if (!this.field1709.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method101(124, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field1709.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "(I)V", line = 323)
    private final void method829(int arg0) {
        this.field1939 = this.method108(true, arg0 ^ 15926);
        ++field1668;
        this.field1939.method2520(arg0 + -5392, 12, arg0);
        this.field1930 = this.method45(arg0 ^ 25, new class282[] { new class282(class512.field6843) });
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)Lhaa;", line = 336)
    public final class74 method830(byte arg0) {
        if (arg0 < 59) {
            return null;
        } else {
            ++field1723;
            return this.field1877[this.field1880];
        }
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(B)V", line = 351)
    private final void method831(byte arg0) {
        this.field1938 = this.method108(false, 15918);
        ++field1780;
        this.field1938.method2520(-5368, 28, 140);
        if (arg0 == -101) {
            for (int var2 = 0; var2 < 4; ++var2) {
                Buffer var3 = this.field1938.method27((byte) -64, true);
                if (var3 != null) {
                    Stream var4 = this.method896(var3, (byte) -88);
                    if (Stream.method3473()) {
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(1.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(1.0F);
                        var4.method3480(0.0F);
                        var4.method3480(1.0F);
                        var4.method3480(1.0F);
                        var4.method3480(1.0F);
                        var4.method3480(0.0F);
                        var4.method3480(1.0F);
                        var4.method3480(1.0F);
                        var4.method3480(1.0F);
                        var4.method3480(1.0F);
                        var4.method3480(1.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(1.0F);
                        var4.method3480(0.0F);
                        var4.method3480(1.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                        var4.method3480(0.0F);
                    } else {
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(1.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(1.0F);
                        var4.method3477(0.0F);
                        var4.method3477(1.0F);
                        var4.method3477(1.0F);
                        var4.method3477(1.0F);
                        var4.method3477(0.0F);
                        var4.method3477(1.0F);
                        var4.method3477(1.0F);
                        var4.method3477(1.0F);
                        var4.method3477(1.0F);
                        var4.method3477(1.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(1.0F);
                        var4.method3477(0.0F);
                        var4.method3477(1.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                        var4.method3477(0.0F);
                    }
                    var4.method3479();
                    if (this.field1938.method28(arg0 ^ -11291)) {
                        break;
                    }
                }
            }
            this.field1922 = this.method45(1, new class282[] { new class282(new class512[] { class512.field6843, class512.field6848, class512.field6848 }) });
        }
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(B)I", line = 466)
    public final int method832(byte arg0) {
        int var2 = 76 / ((arg0 - 10) / 38);
        ++field1637;
        return this.field1919;
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)Li;", line = 476)
    public final class37 method406(int arg0) {
        ++field1673;
        class102 var2 = new class102(arg0);
        this.field1641.method3265(var2, (byte) -104);
        return var2;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V", line = 490)
    public static final void method833(int arg0, int arg1, int arg2) {
        ++field1711;
        if (class488.field6599 != class392.field5166) {
            if (class157.method1098(1, false, 0, 1, arg1, (byte) 105, arg0, 0, -3)) {
                return;
            }
            class157.method1098(1, false, 0, 1, arg1, (byte) 105, arg0, 0, -2);
        } else {
            if (class157.method1098(1, false, 0, 1, arg1, (byte) 105, arg0, 0, -2)) {
                return;
            }
            class157.method1098(1, false, 0, 1, arg1, (byte) 105, arg0, 0, -3);
        }
        if (arg2 != 8493) {
            method850(66, -48, 34, (byte) 36, 27);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Le;Lbi;II)V", line = 521)
    public class111(Canvas arg0, Object arg1, class498 arg2, class449 arg3, int arg4, int arg5) {
        super(arg2);
        this.field1685 = arg3;
        this.field1882 = arg4;
        this.field1702 = this.field1794 = arg0;
        this.field1775 = this.field1652 = arg1;
        Dimension var7 = arg0.getSize();
        this.field1669 = this.field1779 = var7.width;
        this.field1835 = arg5;
        this.field1734 = this.field1768 = var7.height;
        class312.method1865(false, true, (byte) -128);
        this.field1871 = new class421(this, super.field8808);
        this.field1684 = new NativeInterface(super.field8808.method2763(547), this.field1835);
        for (int var8 = 0; super.field8808.method2763(547) > var8; ++var8) {
            class364 var9 = super.field8808.method2760(var8, 21351);
            if (var9 != null) {
                this.field1684.initTextureMetrics(var8, var9.field4929, var9.field4926);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "()F", line = 558)
    public final float method834() {
        ++field1679;
        return this.field1911;
    }

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "(I)V", line = 568)
    private final void method835(int arg0) {
        ++field1675;
        if (arg0 != 426665520) {
            this.field1925 = null;
        }
        this.method41(arg0 ^ 426665521);
        if (this.field1879 != null) {
            this.field1879.method1978(12);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 588)
    public final void method447(Canvas arg0) {
        ++field1782;
        Object var2 = null;
        if (arg0 != null && this.field1794 != arg0) {
            if (this.field1709.containsKey(arg0)) {
                var2 = this.field1709.get(arg0);
            }
        } else {
            var2 = this.field1775;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method67(var2, arg0, 113);
            if (this.field1702 == arg0) {
                this.method827(false);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "(I)V", line = 619)
    public final void method836(int arg0) {
        ++field1667;
        Enumeration var2 = this.field1709.keys();
        while (var2.hasMoreElements()) {
            Canvas var4 = (Canvas) var2.nextElement();
            this.method50(false, this.field1709.get(var4), var4);
        }
        int var3 = -34 / ((arg0 - 75) / 51);
        this.field1938.method24((byte) -93);
        this.field1939.method24((byte) -93);
        this.field1924.method2686(true);
        this.field1929.method2686(true);
        this.field1928.method2686(true);
        this.field1927.method2686(true);
        this.field1934.method2686(true);
        this.field1841.method2809(0);
        this.field1935.method24((byte) -93);
    }

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "(ILfa;II)V", line = 652)
    public final void method397(int arg0, class217 arg1, int arg2, int arg3) {
        ++field1697;
        class376 var5 = (class376) arg1;
        class324 var6 = var5.field5067;
        this.method852((byte) -88);
        this.method897(var6, true);
        this.method902(true, 1);
        this.method909(class586.field7773, 0, class586.field7773);
        this.method859((byte) 29, class149.field2382, 0);
        this.method865(arg0, -57);
        this.field1810.method585(0.0F, (float) this.field1734, (float) this.field1669, (byte) 96);
        this.method848(-362227984);
        this.field1877[0].method585(1.0F, var6.method940((float) this.field1734, false), var6.method948(22051, (float) this.field1669), (byte) 43);
        this.field1877[0].method568(0.0F, var6.method948(22051, (float) (-arg2)), 108, var6.method940((float) (-arg3), false));
        this.field1843[0] = class19.field313;
        this.method835(426665520);
        this.method864(false);
        this.method842(-127);
        this.method859((byte) 29, class350.field4792, 0);
    }

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "()Z", line = 678)
    public final boolean method428() {
        ++field1688;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "()V", line = 686)
    public final void method414() {
        ++field1647;
        this.field1883 = false;
        this.method883(0, 0, false, 0, false, (byte) 113);
        this.method863(7);
        this.method78(8);
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(Z)V", line = 697)
    private final void method837(boolean arg0) {
        this.field1888 = arg0;
        ++field1733;
        if (this.field1879 != null) {
            this.field1879.method2049(-292);
        }
        this.method74((byte) 126);
    }

    @OriginalMember(owner = "client!ej", name = "IA", descriptor = "()I", line = 710)
    public final int method411() {
        ++field1785;
        return this.field1900;
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(B)Lul;", line = 719)
    public final class537 method838(byte arg0) {
        ++field1649;
        if (arg0 != 31) {
            this.field1885 = null;
        }
        return this.field1842 != null ? this.field1842.method2627((byte) -100) : null;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)Lft;", line = 732)
    public final class4 method839(int arg0, int arg1) {
        if (arg1 <= 49) {
            this.method456();
        }
        ++field1642;
        if (~(arg0 * 2) < ~this.field1935.method1656(-15151)) {
            this.field1935.method26(-24955, arg0);
        }
        return this.field1935;
    }

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "(I)V", line = 746)
    private final void method840(int arg0) {
        if (arg0 != 0) {
            this.method391(111, 113, -13, 33, 4, -5);
        }
        this.field1878 = (float) (this.field1905 - this.field1825);
        ++field1632;
        this.field1898 = (float) (this.field1824 - this.field1825);
        this.field1914 = (float) (-this.field1850 + this.field1859);
        this.field1829 = (float) (-this.field1850 + this.field1862);
    }

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "()V", line = 766)
    public void method56() {
        ++field1636;
        if (!this.field1886) {
            for (class504 var1 = this.field1641.method3257(-19); var1 != null; var1 = this.field1641.method3263((byte) -76)) {
                ((class102) var1).method776((byte) 121);
            }
            Enumeration var2 = this.field1709.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method50(false, this.field1709.get(var3), var3);
            }
            class340.method2063(0, false, true);
            this.field1684.release();
            this.field1886 = true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "(I)V", line = 802)
    private final void method841(int arg0) {
        ++field1741;
        this.method47(true);
        this.method94(-128);
        this.method77(13989);
        this.method83(-32352);
        this.method102((byte) -59);
        this.method31(0);
        this.method85(2);
        this.method36(arg0 + -27239);
        this.method58(true);
        this.method78(arg0 + -27239);
        this.method88((byte) 72);
        this.method66((byte) 90);
        this.method99(0);
        this.method90((byte) -81);
        for (int var2 = this.field1855 + -1; ~var2 <= -1; --var2) {
            this.method845(var2, 100);
            this.method68(106);
            this.method42(-9990);
            this.method842(102);
        }
        this.method82(true);
        this.method43((byte) -124);
        this.method95(-122);
        this.method64(arg0 ^ 14910);
        if (arg0 != 27247) {
            this.method899(11);
        }
        this.method74((byte) 126);
    }

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "(I)V", line = 845)
    public final void method842(int arg0) {
        int var2 = -68 % ((-44 - arg0) / 51);
        ++field1726;
        if (this.field1843[this.field1880] != class661.field9384) {
            this.field1843[this.field1880] = class661.field9384;
            this.field1877[this.field1880].method580();
            this.method835(426665520);
        }
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(B)V", line = 862)
    public final void method843(byte arg0) {
        ++field1653;
        if (this.field1849 != 16) {
            this.method860(5);
            this.method825(-5284, true);
            this.method875(true, (byte) 80);
            this.method826(true, 122);
            this.method902(true, 1);
            this.field1849 = 16;
        }
        if (arg0 <= 120) {
            this.field1911 = 0.6755857F;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZ)Lxa;", line = 886)
    public final class468 method398(int arg0, int arg1, boolean arg2) {
        ++field1767;
        return new class345(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ej", name = "ha", descriptor = "(F)V", line = 897)
    public final void method442(float arg0) {
        if (this.field1833 != arg0) {
            this.field1833 = arg0;
            this.field1684.setAmbient(arg0);
            this.method47(true);
            this.method31(0);
        }
        ++field1656;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(FFFFFFI)Z", line = 914)
    private final boolean method844(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        ++field1639;
        if (arg6 != 1) {
            this.field1938 = null;
        }
        Buffer var8 = this.field1939.method27((byte) -64, true);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method896(var8, (byte) -86);
            if (Stream.method3473()) {
                var9.method3480(arg2);
                var9.method3480(arg1);
                var9.method3480(arg3);
                var9.method3480(arg0);
                var9.method3480(arg5);
                var9.method3480(arg4);
            } else {
                var9.method3477(arg2);
                var9.method3477(arg1);
                var9.method3477(arg3);
                var9.method3477(arg0);
                var9.method3477(arg5);
                var9.method3477(arg4);
            }
            var9.method3479();
            return this.field1939.method28(11390);
        }
    }

    @OriginalMember(owner = "client!ej", name = "YA", descriptor = "(IFFFFF)V", line = 957)
    public final void method371(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field1735;
        boolean var7 = ~this.field1906 != ~arg0;
        if (var7 || this.field1917 != arg1 || this.field1865 != arg2) {
            this.field1917 = arg1;
            this.field1906 = arg0;
            this.field1865 = arg2;
            if (var7) {
                this.field1870 = (float) (this.field1906 & 16711680) / 1.671168E7F;
                this.field1861 = (float) (255 & this.field1906) / 255.0F;
                this.field1860 = (float) (65280 & this.field1906) / 65280.0F;
                this.method47(true);
            }
            this.field1684.setSunColour(this.field1870, this.field1860, this.field1861, arg1, arg2);
            this.method94(-90);
        }
        if (this.field1872[0] != arg3 || this.field1872[1] != arg4 || this.field1872[2] != arg5) {
            this.field1872[2] = arg5;
            this.field1872[0] = arg3;
            this.field1872[1] = arg4;
            this.field1885[0] = -arg3;
            this.field1885[2] = -arg5;
            this.field1885[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field1901[2] = arg5 * var8;
            this.field1901[0] = arg3 * var8;
            this.field1901[1] = arg4 * var8;
            this.field1890[1] = -this.field1901[1];
            this.field1890[0] = -this.field1901[0];
            this.field1890[2] = -this.field1901[2];
            this.field1684.setSunDirection(this.field1901[0], this.field1901[1], this.field1901[2]);
            this.method102((byte) -109);
            this.field1899 = (int) (arg5 * 256.0F / arg4);
            this.field1844 = (int) (arg3 * 256.0F / arg4);
        }
        this.method31(0);
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(II)V", line = 1012)
    public final void method845(int arg0, int arg1) {
        if (this.field1880 != arg0) {
            this.field1880 = arg0;
            this.method91(-24613);
        }
        ++field1742;
        int var3 = 25 / ((arg1 - 22) / 46);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Llu;", line = 1028)
    public class669 method39(byte arg0, int arg1) {
        ++field1783;
        if (arg0 < 2) {
            this.field1837 = false;
        }
        if (arg1 != 6) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    return ~arg1 == -8 ? new class125(this) : new class1(this);
                } else {
                    return new class334(this, this.field1680);
                }
            } else {
                return new class304(this);
            }
        } else {
            return new class244(this);
        }
    }

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "()Z", line = 1081)
    public final boolean method458() {
        ++field1773;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIZB)V", line = 1092)
    public final void method846(boolean arg0, int arg1, boolean arg2, byte arg3) {
        if (arg3 == 54) {
            if (~this.field1822 != ~arg1) {
                if (~arg1 > -1) {
                    this.method842(-128);
                    this.method897((class430) null, true);
                    this.method858(0, arg3 ^ 25703);
                    if (!this.field1883) {
                        this.method883(0, 0, arg0, 0, arg2, (byte) 113);
                    }
                } else {
                    class324 var5 = this.field1871.method2421(arg1, 121);
                    class364 var6 = super.field8808.method2760(arg1, 21351);
                    if (~var6.field4919 == -1 && var6.field4932 == 0) {
                        this.method842(arg3 + -160);
                    } else {
                        int var7 = !var6.field4933 ? 128 : 64;
                        int var8 = var7 * 50;
                        class74 var9 = this.method879(arg3 + -54);
                        var9.method575(0.0F, (byte) 107, (float) (this.field1838 % var8 * var6.field4932) / (float) var8, (float) (this.field1838 % var8 * var6.field4919) / (float) var8);
                        this.method866(5758, class19.field313);
                    }
                    if (!this.field1883) {
                        this.method883(var6.field4918, var6.field4937, arg0, var6.field4928, arg2, (byte) 113);
                    }
                    if (this.field1879 != null) {
                        this.field1879.method7(var6.field4935, -21254, var5);
                    } else {
                        this.method897(var5, true);
                        this.method858(var6.field4935, 25681);
                    }
                }
                this.field1822 = arg1;
            }
            ++field1704;
            this.field1849 &= -8;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIZ)Ljaclib/memory/heap/NativeHeapBuffer;", line = 1152)
    public final NativeHeapBuffer method847(boolean arg0, int arg1, boolean arg2) {
        if (!arg0) {
            return null;
        } else {
            ++field1693;
            return this.field1803.method3467(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "(I)V", line = 1166)
    public final void method848(int arg0) {
        ++field1695;
        this.field1811 = false;
        if (arg0 == -362227984) {
            this.method874(-127);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()Z", line = 1184)
    public final boolean method390() {
        ++field1805;
        return this.field1832[3].method1(9567);
    }

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "()Z", line = 1194)
    public final boolean method396() {
        ++field1624;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "(I)V", line = 1204)
    public static void method849(int arg0) {
        if (arg0 != 7) {
            field1784 = null;
        }
        field1784 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBI)V", line = 1227)
    public static final void method850(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1699;
        int var5 = 0;
        int var6 = arg0;
        if (arg3 <= -47) {
            int var7 = -arg0;
            int var8 = -1;
            class475.method2668(arg1, arg0 + arg2, 7, class236.field3325[arg4], -arg0 + arg2);
            while (~var6 < ~var5) {
                var8 += 2;
                var7 += var8;
                ++var5;
                if (var7 >= 0) {
                    --var6;
                    var7 -= var6 << 1;
                    int[] var9 = class236.field3325[arg4 + var6];
                    int[] var10 = class236.field3325[arg4 - var6];
                    int var11 = arg2 + var5;
                    int var12 = -var5 + arg2;
                    class475.method2668(arg1, var11, 7, var9, var12);
                    class475.method2668(arg1, var11, 7, var10, var12);
                }
                int var13 = arg2 + var6;
                int var14 = -var6 + arg2;
                int[] var15 = class236.field3325[arg4 + var5];
                int[] var16 = class236.field3325[-var5 + arg4];
                class475.method2668(arg1, var13, 7, var15, var14);
                class475.method2668(arg1, var13, 7, var16, var14);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "(III)V", line = 1280)
    public final void method422(int arg0, int arg1, int arg2) {
        ++field1694;
        if (~this.field1830 != ~arg0 || this.field1827 != arg1 || this.field1897 != arg2) {
            this.field1830 = arg0;
            this.field1827 = arg1;
            this.field1897 = arg2;
            if (this.field1883) {
                return;
            }
            this.method863(7);
            this.method78(8);
        }
    }

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "(B)[F", line = 1305)
    public final float[] method851(byte arg0) {
        ++field1745;
        int var2 = -68 % (-arg0 / 46);
        return this.field1869;
    }

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "()Lq;", line = 1316)
    public final class397 method455() {
        ++field1676;
        return this.field1925;
    }

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "(B)V", line = 1324)
    public final void method852(byte arg0) {
        if (this.field1849 != 2) {
            this.method854((byte) 109);
            this.method825(-5284, false);
            this.method903(false, false);
            this.method875(false, (byte) 101);
            this.method826(false, arg0 + 195);
            this.method846(false, -2, false, (byte) 54);
            this.field1849 = 2;
        }
        if (arg0 != -88) {
            this.method421(-108, -36, -62, -15);
        }
        ++field1645;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(ZI)V", line = 1346)
    public final void method853(boolean arg0, int arg1) {
        int var3 = -32 % ((arg1 - -43) / 55);
        ++field1758;
        if (this.field1852 == !arg0) {
            this.field1852 = arg0;
            this.method77(13989);
        }
    }

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "(B)V", line = 1362)
    private final void method854(byte arg0) {
        if (class410.field5542 != this.field1868) {
            class425 var2 = this.field1868;
            this.field1868 = class410.field5542;
            if (var2.method2430(0)) {
                this.method837(false);
            }
            this.method869(-128);
            this.field1875 = this.field1909;
            this.method881(true);
            this.field1849 &= -25;
        }
        if (arg0 <= 104) {
            this.method464();
        }
        ++field1698;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V", line = 1389)
    public final void method382(boolean arg0) {
        ++field1626;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1396)
    public final void method420(Canvas arg0) {
        ++field1683;
        if (this.field1794 == arg0) {
            throw new RuntimeException();
        } else if (this.field1709.containsKey(arg0)) {
            this.method50(false, this.field1709.get(arg0), arg0);
            this.field1709.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ldn;)V", line = 1415)
    public final void method432(class483 arg0) {
        ++field1749;
        this.field1842 = (class464) arg0;
    }

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "(B)V", line = 1424)
    private final void method855(byte arg0) {
        ++field1721;
        this.field1904 = false;
        int var2 = 43 / ((arg0 - -20) / 37);
        this.method892(0);
        if (class623.field8246 == this.field1868) {
            this.method881(true);
        }
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)V", line = 1439)
    public final void method409(int arg0) {
        ++field1662;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIF)Lpv;", line = 1450)
    public final class65 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field1646;
        return new class322(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V", line = 1464)
    public void method52(int arg0) {
        this.field1871.method2423(23);
        ++field1648;
        this.field1838 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!ej", name = "na", descriptor = "(III[I)V", line = 1474)
    public final void method438(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1635;
        float var5 = this.field1813.method559((float) arg2, (byte) 93, (float) arg0, (float) arg1);
        if (!((float) this.field1820 > var5) && !(var5 > (float) this.field1900)) {
            int var6 = (int) ((float) this.field1907 * this.field1813.method584((float) arg2, (float) arg0, (float) arg1, 9) / var5);
            int var7 = (int) ((float) this.field1893 * this.field1813.method588((float) arg1, (float) arg2, (float) arg0, 15) / var5);
            if ((float) var6 >= this.field1914 && (float) var6 <= this.field1829 && this.field1898 <= (float) var7 && (float) var7 <= this.field1878) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field1914);
                arg3[1] = (int) ((float) var7 + -this.field1898);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BB)V", line = 1505)
    public final void method856(byte arg0, byte arg1) {
        ++field1650;
        this.method865(arg1 << 16 | arg1 << 24 | arg1 << 8 | arg1, -11);
        if (arg0 <= 39) {
            this.method875(false, (byte) 19);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([Lba;Lc;Lq;[Lot;I)V", line = 1518)
    public final void method429(class358[] arg0, class174 arg1, class397 arg2, class552[] arg3, int arg4) {
        this.method418(arg0, arg2, arg3, arg4);
        ++field1730;
        this.method465(arg1);
    }

    @OriginalMember(owner = "client!ej", name = "aa", descriptor = "()I", line = 1527)
    public final int method412() {
        ++field1728;
        return this.field1941;
    }

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "(I)Lhaa;", line = 1535)
    public final class74 method857(int arg0) {
        ++field1659;
        return arg0 != 1558 ? null : this.field1810;
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(II)V", line = 1547)
    public final void method858(int arg0, int arg1) {
        if (~arg0 == -2) {
            this.method909(class586.field7773, -123, class586.field7773);
        } else if (arg0 == 0) {
            this.method909(class521.field6963, -117, class521.field6963);
        } else if (arg0 == 2) {
            this.method909(class445.field6091, -118, class586.field7773);
        } else if (arg0 != 3) {
            if (~arg0 == -5) {
                this.method909(class706.field9920, -120, class706.field9920);
            }
        } else {
            this.method909(class32.field520, -122, class521.field6963);
        }
        ++field1796;
        if (arg1 != 25681) {
            this.method75((float[]) null, -6, true, -55, 15, -81, (class193) null, (byte) 70);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lpga;Z)Lxa;", line = 1577)
    public final class468 method440(class500 arg0, boolean arg1) {
        ++field1672;
        class468 var9;
        if (~arg0.field6698 != -1 && ~arg0.field6700 != -1) {
            int[] var3 = new int[arg0.field6700 * arg0.field6698];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field6696 != null) {
                for (int var6 = 0; arg0.field6700 > var6; ++var6) {
                    for (int var7 = 0; arg0.field6698 > var7; ++var7) {
                        var3[var5++] = class220.method1393(arg0.field6702[class571.method3139(arg0.field6697[var4], 255)], arg0.field6696[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; arg0.field6700 > var8; ++var8) {
                    for (int var10 = 0; arg0.field6698 > var10; ++var10) {
                        int var11 = arg0.field6702[arg0.field6697[var4++] & 255];
                        var3[var5++] = var11 != 0 ? class220.method1393(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method374(var3, 0, arg0.field6698, arg0.field6698, arg0.field6700);
        } else {
            var9 = this.method374(new int[1], 0, 1, 1, 1);
        }
        var9.method1029(arg0.field6695, arg0.field6699, arg0.field6694, arg0.field6701);
        return var9;
    }

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "()I", line = 1645)
    public final int method403() {
        ++field1625;
        return this.field1809 - (-this.field1812 + -this.field1807);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLgf;I)V", line = 1653)
    public final void method859(byte arg0, class256 arg1, int arg2) {
        this.method60(arg0 + -28, arg2, false, false, arg1);
        ++field1769;
        if (arg0 != 29) {
            this.method859((byte) 89, (class256) null, -79);
        }
    }

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "(I)V", line = 1665)
    private final void method860(int arg0) {
        ++field1708;
        if (arg0 == 5) {
            if (class260.field3573 != this.field1868) {
                class425 var2 = this.field1868;
                this.field1868 = class260.field3573;
                if (!var2.method2430(arg0 + -5)) {
                    this.method837(false);
                }
                this.method906((byte) -33);
                this.field1875 = this.field1873;
                this.method881(true);
                this.field1849 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "(I)V", line = 1691)
    private final void method861(int arg0) {
        ++field1746;
        this.field1857 = false;
        if (arg0 == 3906) {
            if (class410.field5542 == this.field1868) {
                this.method869(-128);
                this.method881(true);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V", line = 1709)
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1798;
    }

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "(I)V", line = 1720)
    public static final void method862(int arg0) {
        class508.field6774.method2916((byte) 81);
        ++field1739;
        int var1 = -45 / ((-8 - arg0) / 61);
        class462.field6256.method3398(false);
        class80.field1259.method3398(false);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Li;)V", line = 1732)
    public final void method439(class37 arg0) {
        ++field1715;
        this.field1803 = ((class102) arg0).field1520;
        this.field1686 = this.field1803.method3467(32768, false);
    }

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "(I)V", line = 1745)
    private final void method863(int arg0) {
        if (arg0 == 7) {
            ++field1706;
            if (this.field1879 != null) {
                this.field1879.method1974(true);
            }
            this.method88((byte) 80);
        }
    }

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "()Z", line = 1760)
    public final boolean method431() {
        ++field1718;
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "(Z)V", line = 1768)
    public final void method864(boolean arg0) {
        if (arg0) {
            this.field1904 = true;
        }
        ++field1800;
        this.method893(2, class95.field1448, 76);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()Z", line = 1781)
    public final boolean method456() {
        ++field1751;
        return this.field1913;
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(II)V", line = 1789)
    public final void method865(int arg0, int arg1) {
        if (arg1 > -10) {
            this.field1886 = true;
        }
        ++field1703;
        if (this.field1853 != arg0) {
            this.field1853 = arg0;
            this.method82(true);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILeb;)V", line = 1805)
    public final void method866(int arg0, class584 arg1) {
        this.field1843[this.field1880] = arg1;
        if (arg0 != 5758) {
            this.method380();
        }
        ++field1661;
        this.method835(426665520);
    }

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "(I)I", line = 1817)
    public final int method867(int arg0) {
        ++field1657;
        if (arg0 > -27) {
            this.method442(-0.4352954F);
        }
        return this.field1912;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[I[I)Lfa;", line = 1828)
    public final class217 method413(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field1627;
        return class131.method991(this, -104, arg2, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "(I)V", line = 1836)
    public final void method868(int arg0) {
        ++field1671;
        if (arg0 != Integer.MAX_VALUE) {
            this.method459(14, 78, 32, -65);
        }
        if (class655.field8876 != this.field1868) {
            class425 var2 = this.field1868;
            this.field1868 = class655.field8876;
            if (var2.method2430(0)) {
                this.method837(false);
            }
            this.field1849 &= -32;
            this.field1875 = this.field1869;
        }
    }

    @OriginalMember(owner = "client!ej", name = "LA", descriptor = "(IIII)V", line = 1860)
    public final void method445(int arg0, int arg1, int arg2, int arg3) {
        ++field1677;
        if (!this.field1883) {
            throw new RuntimeException("");
        } else {
            if (~this.field1919 != ~arg0) {
                this.field1919 = arg0;
                if (this.field1879 != null) {
                    this.field1879.method1972((byte) 27);
                }
            }
            this.field1866 = arg3;
            this.field1912 = arg2;
            this.field1903 = arg1;
            this.method863(7);
        }
    }

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "(I)V", line = 1887)
    private final void method869(int arg0) {
        ++field1747;
        if (!this.field1857) {
            float[] var2 = this.field1909;
            this.field1857 = true;
            if (~this.field1669 != -1 && this.field1734 != 0) {
                var2[8] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.5F;
                var2[0] = 2.0F / (float) this.field1669;
                var2[13] = 1.0F;
                var2[5] = -2.0F / (float) this.field1734;
                var2[15] = 1.0F;
                var2[10] = 0.5F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = -1.0F;
                var2[1] = 0.0F;
            } else {
                var2[4] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = 0.0F;
                var2[5] = 1.0F;
                var2[8] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
            }
        }
        if (arg0 > -127) {
            this.method433((int[]) null);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 1944)
    public final class139 method402(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1736;
        return new class22(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ej", name = "ma", descriptor = "(IIIIII[BII)V", line = 1952)
    public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1787;
    }

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "()Z", line = 1959)
    public final boolean method452() {
        ++field1793;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "(B)Lhaa;", line = 1968)
    public final class74 method870(byte arg0) {
        ++field1682;
        if (arg0 != -32) {
            this.method424();
        }
        return this.field1815;
    }

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "(I)Lhaa;", line = 1979)
    public final class74 method871(int arg0) {
        if (arg0 != -6469) {
            this.method874(-55);
        }
        if (!this.field1888) {
            this.field1817.method578(this.field1815, this.field1810);
            this.field1888 = true;
        }
        ++field1738;
        return this.field1817;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()V", line = 1998)
    public final void method444() {
        ++field1757;
        this.field1871.method2424((byte) 100);
    }

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "(I)V", line = 2010)
    public void method54(int arg0) {
        int var2 = 120 / ((arg0 - -52) / 56);
        ++field1707;
        this.method841(27247);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIII)V", line = 2025)
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1663;
        float var7 = this.method65(0);
        this.method823(101);
        this.method865(arg4, -121);
        this.method859((byte) 29, class149.field2382, 0);
        this.method828(36, class149.field2382, 0);
        this.method902(true, arg5);
        this.field1810.method585(1.0F, (float) (arg3 + -1), (float) (arg2 + -1), (byte) 51);
        this.field1810.method568(0.0F, (float) arg0 - var7, 36, (float) arg1 - var7);
        this.method848(-362227984);
        this.method71(0, false);
        this.method893(4, class389.field5146, 97);
        this.method71(0, true);
        this.method828(120, class350.field4792, 0);
        this.method859((byte) 29, class350.field4792, 0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BZ)V", line = 2051)
    public final void method872(byte arg0, boolean arg1) {
        if (arg0 <= 59) {
            this.method466();
        }
        ++field1712;
        if (!this.field1839 != !arg1) {
            this.field1839 = arg1;
            this.method85(2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([IIIII)Lxa;", line = 2068)
    public final class468 method374(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1765;
        return new class345(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "(I)V", line = 2076)
    private final void method873(int arg0) {
        if (this.field1911 != 0.0F) {
            float var2 = this.field1834 / (this.field1911 + this.field1834);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field1884 * (1.0F - var2) / this.field1911;
            this.field1864[10] = this.field1918 + var4;
            this.field1864[14] = this.field1884 * var3;
        } else {
            this.field1864[14] = this.field1884;
            this.field1864[10] = this.field1918;
        }
        if (arg0 == -23969) {
            ++field1678;
            this.field1916 = (this.field1864[14] - (float) this.field1900) / this.field1864[10];
        }
    }

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "(IIII)V", line = 2109)
    public final void method459(int arg0, int arg1, int arg2, int arg3) {
        ++field1743;
        boolean var5 = false;
        if (~this.field1859 > ~arg0) {
            this.field1859 = arg0;
            var5 = true;
        }
        if (~this.field1862 < ~arg2) {
            this.field1862 = arg2;
            var5 = true;
        }
        if (~arg1 < ~this.field1824) {
            this.field1824 = arg1;
            var5 = true;
        }
        if (~this.field1905 < ~arg3) {
            var5 = true;
            this.field1905 = arg3;
        }
        if (var5) {
            if (!this.field1940) {
                this.field1940 = true;
                this.method40((byte) 24);
            }
            this.method35(true);
            this.method840(0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "(I)V", line = 2156)
    private final void method874(int arg0) {
        if (arg0 >= -88) {
            this.field1669 = -37;
        }
        ++field1696;
        if (class410.field5542 == this.field1868) {
            float var2 = this.method65(0);
            this.field1810.method568(0.0F, var2, 95, var2);
        }
        this.field1888 = false;
        this.method64(20561);
        if (this.field1879 != null) {
            this.field1879.method2050(-108);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZB)V", line = 2181)
    public final void method875(boolean arg0, byte arg1) {
        if (arg0 == !this.field1826) {
            this.field1826 = arg0;
            this.method36(8);
            this.field1849 &= -32;
        }
        ++field1778;
        int var3 = 67 / ((arg1 - -45) / 63);
    }

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "(B)Z", line = 2200)
    public static final boolean method876(byte arg0) {
        if (arg0 != 39) {
            return false;
        } else {
            ++field1727;
            return class398.field5290 > 0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(ZB)V", line = 2212)
    public final void method877(boolean arg0, byte arg1) {
        if (this.field1867 != arg0) {
            this.field1867 = arg0;
            this.method78(8);
        }
        ++field1750;
        if (arg1 >= -67) {
            this.method827(true);
        }
    }

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "()Z", line = 2232)
    public final boolean method430() {
        ++field1692;
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZII[IB)Lak;", line = 2240)
    public final class324 method878(boolean arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        ++field1716;
        if (arg4 != -22) {
            this.method840(-26);
        }
        return this.method37((byte) -95, arg1, arg0, 0, arg3, 0, arg2);
    }

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "(IIIIII)V", line = 2256)
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method823(-112);
        ++field1781;
        this.method865(arg4, -120);
        this.method859((byte) 29, class149.field2382, 0);
        this.method828(31, class149.field2382, 0);
        this.method902(true, arg5);
        this.field1810.method585(1.0F, (float) arg3, (float) arg2, (byte) 58);
        this.field1810.method571(arg0, arg1, 0);
        this.method848(-362227984);
        this.method71(0, false);
        this.method864(false);
        this.method71(0, true);
        this.method828(121, class350.field4792, 0);
        this.method859((byte) 29, class350.field4792, 0);
    }

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "(I)Lhaa;", line = 2276)
    public final class74 method879(int arg0) {
        ++field1777;
        if (arg0 != 0) {
            this.field1870 = 0.6882372F;
        }
        return this.field1877[this.field1880];
    }

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "(B)I", line = 2288)
    public final int method880(byte arg0) {
        ++field1755;
        if (arg0 < 59) {
            this.method864(true);
        }
        return this.field1866;
    }

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "(Z)V", line = 2300)
    private final void method881(boolean arg0) {
        ++field1700;
        this.method95(-122);
        if (this.field1879 != null) {
            this.field1879.method2052((byte) -49);
        }
        if (!arg0) {
            this.field1842 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([Lba;Lq;[Lot;I)V", line = 2314)
    public final void method418(class358[] arg0, class397 arg1, class552[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1947(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field1801;
    }

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "(I)V", line = 2334)
    private final void method882(int arg0) {
        if (class623.field8246 != this.field1868) {
            class425 var2 = this.field1868;
            this.field1868 = class623.field8246;
            if (!var2.method2430(0)) {
                this.method837(false);
            }
            this.method892(0);
            this.field1875 = this.field1864;
            this.method881(true);
            this.field1849 &= -8;
        }
        if (arg0 != -4074) {
            this.method879(-111);
        }
        ++field1799;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZIZB)V", line = 2359)
    private final void method883(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, byte arg5) {
        ++field1665;
        boolean var7 = arg2 & this.method390();
        if (!var7 && (~arg1 == -5 || arg1 == 8 || ~arg1 == -10)) {
            arg1 = 2;
            arg0 = ~arg1 == -5 ? 1 & arg3 : 1;
            arg3 = 0;
        }
        if (arg5 != 113) {
            this.field1891 = -57;
        }
        if (~arg1 != -1 && arg4) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (~this.field1887 == ~arg1) {
            if (this.field1887 != 0) {
                this.field1832[this.field1887 & Integer.MAX_VALUE].method4(arg4, arg5 + 9399);
                if (this.field1845 != arg3 || ~this.field1831 != ~arg0) {
                    this.field1832[Integer.MAX_VALUE & this.field1887].method2((byte) 98, arg0, arg3);
                    this.field1831 = arg0;
                    this.field1845 = arg3;
                }
                return;
            }
        } else {
            if (this.field1887 != 0) {
                this.field1832[Integer.MAX_VALUE & this.field1887].method6(-21106);
            }
            if (~arg1 == -1) {
                this.field1879 = null;
            } else {
                this.field1879 = this.field1832[arg1 & Integer.MAX_VALUE];
                this.field1879.method5(arg4, false);
                this.field1879.method4(arg4, arg5 + 9399);
                this.field1879.method2((byte) 106, arg0, arg3);
            }
            this.field1831 = arg0;
            this.field1887 = arg1;
            this.field1845 = arg3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "FA", descriptor = "(IIIIII)Z", line = 2414)
    public final boolean method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1705;
        float var7 = this.field1813.method559((float) arg2, (byte) 93, (float) arg0, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field1813.method559((float) arg5, (byte) 93, (float) arg3, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field1820 > var7) || !((float) this.field1820 > var8)) && (!(var7 > (float) this.field1900) || !((float) this.field1900 < var8))) {
            int var9 = (int) ((float) this.field1907 * this.field1813.method584((float) arg2, (float) arg0, (float) arg1, 9) / var7);
            int var10 = (int) ((float) this.field1907 * this.field1813.method584((float) arg5, (float) arg3, (float) arg4, 9) / var8);
            if (this.field1914 > (float) var9 && this.field1914 > (float) var10 || this.field1829 < (float) var9 && this.field1829 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field1893 * this.field1813.method588((float) arg1, (float) arg2, (float) arg0, 15) / var7);
                int var12 = (int) ((float) this.field1893 * this.field1813.method588((float) arg4, (float) arg5, (float) arg3, 15) / var8);
                return (!((float) var11 < this.field1898) || !(this.field1898 > (float) var12)) && (!(this.field1878 < (float) var11) || !((float) var12 > this.field1878));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(IIIII)V", line = 2450)
    public final void method379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method384(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
        ++field1770;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIILfa;II)V", line = 2459)
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6, int arg7, int arg8) {
        ++field1658;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BZI[BLhi;I)Lak;", line = 2466)
    public final class324 method884(byte arg0, boolean arg1, int arg2, byte[] arg3, class193 arg4, int arg5) {
        ++field1804;
        if (arg0 != 96) {
            this.field1827 = -39;
        }
        return this.method61(arg2, 0, arg5, -129, 0, arg4, arg3, arg1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IF)V", line = 2487)
    public final void method885(int arg0, float arg1) {
        ++field1806;
        if (arg0 >= 112) {
            if (this.field1858 != arg1) {
                this.field1858 = arg1;
                this.method891(0);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "ca", descriptor = "(IIII)V", line = 2505)
    public final void method421(int arg0, int arg1, int arg2, int arg3) {
        ++field1760;
        if (arg0 <= 0 && this.field1669 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.field1734 + -1) {
            this.method435();
        } else {
            this.field1859 = ~arg0 > -1 ? 0 : arg0;
            this.field1862 = this.field1669 < arg2 ? 0 : arg2;
            this.field1824 = arg1 >= 0 ? arg1 : 0;
            this.field1905 = ~arg3 < ~this.field1669 ? 0 : arg3;
            if (!this.field1940) {
                this.field1940 = true;
                this.method40((byte) 24);
            }
            this.method35(true);
            this.method840(0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2534)
    public final void method370(Canvas arg0) {
        this.field1702 = null;
        ++field1771;
        this.field1775 = null;
        if (arg0 != null && this.field1794 != arg0) {
            if (this.field1709.containsKey(arg0)) {
                this.field1775 = this.field1709.get(arg0);
                this.field1702 = arg0;
            }
        } else {
            this.field1775 = this.field1652;
            this.field1702 = this.field1794;
        }
        if (this.field1702 != null && this.field1775 != null) {
            this.method81(this.field1775, this.field1702, -50);
            this.method827(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZII)V", line = 2564)
    public static final void method886(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (~class571.field7587 != -1) {
            class25.field427 = class571.field7587;
            class405.method2326(0, -67);
        } else {
            class148.method1065(64, false);
        }
        ++field1681;
        if (arg3 != 13) {
            method876((byte) -98);
        }
        class436.field5960 = arg0;
        class338.field4680 = arg4;
        class692.field9739 = arg2;
        class567.method3117(arg1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lhi;ZI[FII)Lak;", line = 2588)
    public final class324 method887(class193 arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5) {
        if (arg4 != 30230) {
            return null;
        } else {
            ++field1795;
            return this.method75(arg3, 0, arg1, 0, arg5, arg2, arg0, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lba;Lc;Lq;Lot;I)V", line = 2599)
    public final void method392(class358 arg0, class174 arg1, class397 arg2, class552 arg3, int arg4) {
        ++field1691;
        arg0.method1947(arg2, arg3, arg4);
        this.method465(arg1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([FB)[F", line = 2609)
    public final float[] method888(float[] arg0, byte arg1) {
        arg0[0] = this.field1875[0];
        arg0[8] = this.field1875[2];
        arg0[12] = this.field1875[3];
        if (arg1 >= -89) {
            return null;
        } else {
            arg0[4] = this.field1875[1];
            ++field1622;
            arg0[9] = this.field1875[6];
            arg0[5] = this.field1875[5];
            arg0[2] = this.field1875[8];
            arg0[1] = this.field1875[4];
            arg0[13] = this.field1875[7];
            arg0[10] = this.field1875[10];
            arg0[3] = this.field1875[12];
            arg0[14] = this.field1875[11];
            arg0[6] = this.field1875[9];
            arg0[7] = this.field1875[13];
            arg0[11] = this.field1875[14];
            arg0[15] = this.field1875[15];
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "()Lq;", line = 2637)
    public final class397 method466() {
        ++field1776;
        return new class74();
    }

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "(I)I", line = 2645)
    public final int method889(int arg0) {
        if (arg0 < 56) {
            this.method825(-104, true);
        }
        ++field1664;
        return this.field1880;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lhaa;B)V", line = 2657)
    public final void method890(class74 arg0, byte arg1) {
        ++field1761;
        this.field1810.method560(arg0);
        if (arg1 >= -70) {
            this.method423(-78, -17, 5, 6, 0, 66);
        }
        this.field1811 = false;
        this.method874(-90);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(IIIIII)V", line = 2670)
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1710;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        if (this.method844((float) arg2 + var11, (float) arg1, (float) arg0, 0.0F, 0.0F, (float) arg3 + var10, 1)) {
            this.method823(125);
            this.method865(arg4, -113);
            this.method859((byte) 29, class149.field2382, 0);
            this.method828(85, class149.field2382, 0);
            this.method902(true, arg5);
            this.method895(0);
            this.method71(0, false);
            this.method901((byte) 97);
            this.method71(0, true);
            this.method828(58, class350.field4792, 0);
            this.method859((byte) 29, class350.field4792, 0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "(I)V", line = 2700)
    private final void method891(int arg0) {
        this.field1889 = false;
        ++field1640;
        if (arg0 == 0) {
            if (class260.field3573 == this.field1868) {
                this.method906((byte) -33);
                this.method881(true);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(Z)V", line = 2719)
    public final void method407(boolean arg0) {
        this.field1848 = arg0;
        ++field1737;
        this.method58(true);
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V", line = 2735)
    public final void method425(int arg0) {
        ++field1655;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 2743)
    public final void method378(int arg0) {
        ++field1714;
    }

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "(I)V", line = 2750)
    private final void method892(int arg0) {
        if (!this.field1904) {
            float[] var2 = this.field1864;
            float var3 = (float) (-this.field1850 * this.field1820) / (float) this.field1907;
            float var4 = (float) ((this.field1669 - this.field1850) * this.field1820) / (float) this.field1907;
            float var5 = (float) (this.field1825 * this.field1820) / (float) this.field1893;
            float var6 = (float) ((this.field1825 - this.field1734) * this.field1820) / (float) this.field1893;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field1820 * 2.0F;
                var2[3] = 0.0F;
                var2[14] = this.field1884 = (float) (this.field1900 * this.field1820) / (float) (this.field1820 - this.field1900);
                var2[0] = var7 / (-var3 + var4);
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[2] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[13] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = -1.0F;
                var2[4] = 0.0F;
                var2[10] = this.field1918 = (float) this.field1900 / (float) (-this.field1900 + this.field1820);
                var2[9] = (var5 + var6) / (var5 - var6);
            } else {
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = 1.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method873(-23969);
            this.field1904 = true;
        }
        ++field1792;
        if (arg0 != 0) {
            this.field1934 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIII)V", line = 2818)
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1791;
    }

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "([I)V", line = 2833)
    public final void method433(int[] arg0) {
        arg0[3] = this.field1905;
        ++field1808;
        arg0[1] = this.field1824;
        arg0[0] = this.field1859;
        arg0[2] = this.field1862;
    }

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "()Z", line = 2844)
    public final boolean method424() {
        ++field1740;
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "()Z", line = 2855)
    public final boolean method404() {
        ++field1754;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILob;I)V", line = 2864)
    private final void method893(int arg0, class691 arg1, int arg2) {
        ++field1724;
        this.method48((byte) -32, this.field1938, 0);
        if (arg2 < 52) {
            this.method40((byte) 56);
        }
        this.method62(false, this.field1922);
        this.method89((byte) -90, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lpf;IIII)Lba;", line = 2877)
    public final class358 method443(class545 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1764;
        return new class482(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "()F", line = 2885)
    public final float method894() {
        ++field1729;
        return this.field1834;
    }

    @OriginalMember(owner = "client!ej", name = "AA", descriptor = "(IIII)V", line = 2894)
    public final void method387(int arg0, int arg1, int arg2, int arg3) {
        this.field1903 = arg1;
        this.field1866 = arg3;
        this.field1919 = arg0;
        ++field1752;
        this.field1912 = arg2;
        this.field1883 = true;
        this.method883(0, 3, false, 0, false, (byte) 113);
        if (this.field1879 != null) {
            this.field1879.method1972((byte) -119);
        }
        this.method863(7);
        this.method78(8);
    }

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "(I)V", line = 2921)
    public final void method895(int arg0) {
        ++field1759;
        this.field1810.method580();
        this.field1811 = true;
        if (arg0 != 0) {
            this.method415(-55, 111, 83, -66, -81, 108);
        }
        this.method874(-127);
    }

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "(IIII)V", line = 2935)
    public final void method373(int arg0, int arg1, int arg2, int arg3) {
        this.field1850 = arg0;
        this.field1907 = arg2;
        ++field1802;
        this.field1825 = arg1;
        this.field1893 = arg3;
        this.method891(0);
        this.method855((byte) 75);
        this.method868(Integer.MAX_VALUE);
        this.method840(0);
    }

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "()Z", line = 2956)
    public final boolean method380() {
        ++field1753;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lc;)V", line = 2967)
    public final void method465(class174 arg0) {
        this.field1841.method2806(arg0, this, 0);
        ++field1630;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;", line = 2976)
    public final Stream method896(Buffer arg0, byte arg1) {
        this.field1896.method3483(arg0);
        if (arg1 >= -66) {
            this.field1907 = -99;
        }
        ++field1732;
        return this.field1896;
    }

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "()V", line = 2989)
    public final void method435() {
        this.field1862 = this.field1669;
        this.field1905 = this.field1734;
        ++field1790;
        this.field1824 = 0;
        this.field1859 = 0;
        if (this.field1940) {
            this.field1940 = false;
            this.method40((byte) 24);
        }
        this.method840(0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lnq;Z)V", line = 3007)
    public final void method897(class430 arg0, boolean arg1) {
        if (this.field1847[this.field1880] != arg0) {
            this.field1847[this.field1880] = arg0;
            if (arg0 != null) {
                arg0.method168((byte) 122);
            } else {
                this.method44((byte) 127);
            }
            this.field1849 &= -2;
        }
        ++field1748;
        if (!arg1) {
            this.method872((byte) -115, true);
        }
    }

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "(I)V", line = 3028)
    public final void method898(int arg0) {
        if (this.field1849 != 8) {
            this.method882(-4074);
            this.method825(arg0 ^ -5283, true);
            this.method875(true, (byte) 106);
            this.method826(true, 103);
            this.method902(true, 1);
            this.field1849 = 8;
        }
        ++field1654;
        if (arg0 != 1) {
            this.field1821 = false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIZ)Lxa;", line = 3049)
    public final class468 method426(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1631;
        class345 var6 = new class345(this, arg2, arg3, arg4);
        var6.method273(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "(I)V", line = 3060)
    private final void method899(int arg0) {
        ++field1623;
        this.field1894 = (float) this.field1900 + -this.field1911;
        if (arg0 != -32) {
            this.field1826 = false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "(B)Lhaa;", line = 3073)
    public final class74 method900(byte arg0) {
        if (arg0 >= -69) {
            this.method464();
        }
        ++field1789;
        return this.field1816;
    }

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "(B)V", line = 3084)
    private final void method901(byte arg0) {
        ++field1666;
        this.method48((byte) -32, this.field1939, 0);
        this.method62(false, this.field1930);
        int var2 = -61 % ((13 - arg0) / 45);
        this.method89((byte) -85, 1, 0, class214.field3067);
    }

    @OriginalMember(owner = "client!ej", name = "ya", descriptor = "(IIIII)V", line = 3096)
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method384(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
        ++field1629;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(ZI)V", line = 3104)
    public final void method902(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1892 = 109;
        }
        ++field1638;
        if (~this.field1828 != ~arg1) {
            class235 var3;
            boolean var4;
            boolean var5;
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    var3 = class533.field7082;
                    var4 = false;
                    var5 = true;
                } else if (arg1 == 128) {
                    var3 = class407.field5486;
                    var4 = true;
                    var5 = true;
                } else {
                    var4 = false;
                    var3 = class118.field2012;
                    var5 = false;
                }
            } else {
                var5 = true;
                var3 = class664.field9422;
                var4 = true;
            }
            if (!var4 != !this.field1902) {
                this.field1902 = var4;
                this.method90((byte) -81);
            }
            if (!this.field1837 == var5) {
                this.field1837 = var5;
                this.method66((byte) 99);
            }
            if (this.field1876 != var3) {
                this.field1876 = var3;
                this.method99(0);
            }
            this.field1849 &= -29;
            this.field1828 = arg1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZZ)V", line = 3174)
    public final void method903(boolean arg0, boolean arg1) {
        if (!arg1 != !this.field1821) {
            this.field1821 = arg1;
            this.method77(13989);
            this.field1849 &= -8;
        }
        ++field1660;
        if (arg0) {
            this.field1931 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "(I)V", line = 3191)
    public final void method904(int arg0) {
        if (arg0 >= -95) {
            this.field1924 = null;
        }
        ++field1744;
        Hashtable var2 = new Hashtable();
        if (this.field1709 != null && !this.field1709.isEmpty()) {
            Enumeration var3 = this.field1709.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method101(106, var4));
            }
        }
        this.field1709 = var2;
        this.method831((byte) -101);
        this.method829(24);
        this.field1841.method2812(-81, this);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[Lpv;)V", line = 3224)
    public final void method400(int arg0, class65[] arg1) {
        ++field1788;
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field1915[var3] = arg1[var3];
        }
        this.field1874 = arg0;
        if (this.field1868.method2430(0)) {
            this.method83(-32352);
        }
    }

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "(I)V", line = 3245)
    public final void method905(int arg0) {
        this.field1851 = new class670[this.field1855];
        ++field1731;
        this.field1877 = new class74[this.field1855];
        this.field1908 = new class670[this.field1855];
        this.field1843 = new class584[this.field1855];
        this.field1847 = new class430[this.field1855];
        for (int var2 = 0; ~this.field1855 < ~var2; ++var2) {
            this.field1908[var2] = class521.field6963;
            this.field1851[var2] = class521.field6963;
            this.field1843[var2] = class661.field9384;
            this.field1877[var2] = new class74();
        }
        this.field1915 = new class65[this.field1891 + -2];
        this.field1840 = this.method46(class294.field4160, 1, 0, class5.field100, 1);
        this.method439(new class102(262144));
        this.field1926 = this.method45(1, new class282[] { new class282(new class512[] { class512.field6843, class512.field6848 }) });
        this.field1931 = this.method45(1, new class282[] { new class282(new class512[] { class512.field6843, class512.field6846 }) });
        this.field1921 = this.method45(1, new class282[] { new class282(class512.field6843), new class282(class512.field6846), new class282(class512.field6848), new class282(class512.field6845) });
        this.field1936 = this.method45(1, new class282[] { new class282(class512.field6843), new class282(class512.field6846), new class282(class512.field6848) });
        this.field1932 = new class482(this, 0, 0, false, false);
        this.field1924 = new class482(this, 0, 0, true, true);
        this.field1920 = new class482(this, 0, 0, false, false);
        this.field1929 = new class482(this, 0, 0, true, true);
        this.field1923 = new class482(this, 0, 0, false, false);
        this.field1928 = new class482(this, 0, 0, true, true);
        this.field1937 = new class482(this, 0, 0, false, false);
        this.field1927 = new class482(this, 0, 0, true, true);
        this.field1933 = new class482(this, 0, 0, false, false);
        this.field1934 = new class482(this, 0, 0, true, true);
        this.field1841 = new class506(this);
        this.field1935 = this.method105(true, 10);
        int var3 = -92 % ((arg0 - -23) / 55);
        this.method904(-102);
        this.field1680 = new class29(this);
        this.field1832[1] = this.method39((byte) 51, 1);
        this.field1832[2] = this.method39((byte) 42, 2);
        this.field1832[4] = this.method39((byte) 14, 4);
        this.field1832[5] = this.method39((byte) 105, 5);
        this.field1832[6] = this.method39((byte) 113, 6);
        this.field1832[7] = this.method39((byte) 69, 7);
        this.field1832[3] = this.method39((byte) 57, 3);
        this.field1832[8] = this.method39((byte) 23, 8);
        this.field1832[9] = this.method39((byte) 111, 9);
        if (!this.field1832[2].method1(9567)) {
            this.field1832[2] = this.method39((byte) 46, 0);
        }
        if (!this.field1832[4].method1(9567)) {
            this.field1832[4] = this.field1832[2];
        }
        if (!this.field1832[8].method1(9567)) {
            this.field1832[8] = this.field1832[4];
        }
        if (!this.field1832[9].method1(9567)) {
            this.field1832[9] = this.field1832[8];
        }
        this.method54(67);
        this.method435();
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIIII)Ldn;", line = 3323)
    public final class483 method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1786;
        return new class613(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "(B)V", line = 3333)
    private final void method906(byte arg0) {
        if (arg0 != -33) {
            this.field1816 = null;
        }
        ++field1670;
        if (!this.field1889) {
            float[] var2 = this.field1873;
            float var3 = (float) this.field1820 - this.field1911;
            float var4 = (float) this.field1900 + -this.field1911;
            float var5 = (float) (-this.field1825) * this.field1858 / (float) this.field1893;
            float var6 = (float) (-this.field1850) * this.field1858 / (float) this.field1907;
            float var7 = (float) (-this.field1850 + this.field1669) * this.field1858 / (float) this.field1907;
            float var8 = (float) (this.field1734 - this.field1825) * this.field1858 / (float) this.field1893;
            if (var6 != var7 && var5 != var8) {
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[15] = 1.0F;
                var2[14] = var3 / (var3 - var4);
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = 1.0F / (-var4 + var3);
                var2[5] = 2.0F / (var8 - var5);
                var2[0] = 2.0F / (-var6 + var7);
                var2[13] = (var5 + var8) / (-var5 + var8);
            } else {
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[0] = 1.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
            }
            this.method899(-32);
            this.field1889 = true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(II)V", line = 3407)
    public static final void method907(int arg0, int arg1) {
        class504 var2 = class170.field2615.method2915(109);
        if (arg1 != 0) {
            method862(-54);
        }
        while (var2 != null) {
            if ((var2.field6724 >> 48 & 65535L) == (long) arg0) {
                var2.method2797(49);
            }
            var2 = class170.field2615.method2912((byte) 114);
        }
        ++field1633;
    }

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "(I)V", line = 3433)
    public final void method908(int arg0) {
        ++field1772;
        if (arg0 != 0) {
            this.field1850 = -36;
        }
        if (~this.field1849 != -5) {
            this.method854((byte) 114);
            this.method825(arg0 + -5284, false);
            this.method903(false, false);
            this.method875(false, (byte) 99);
            this.method826(false, arg0 ^ 69);
            this.method846(false, -2, false, (byte) 54);
            this.method902(true, 1);
            this.method858(0, arg0 ^ 25681);
            this.field1849 = 4;
        }
    }

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "()I", line = 3461)
    public final int method454() {
        ++field1690;
        return this.field1891 + -2;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lnea;ILnea;)V", line = 3475)
    public final void method909(class670 arg0, int arg1, class670 arg2) {
        int var4 = -64 % ((arg1 - -79) / 36);
        ++field1763;
        boolean var5 = false;
        if (this.field1851[this.field1880] != arg0) {
            this.field1851[this.field1880] = arg0;
            this.method68(69);
            var5 = true;
        }
        if (this.field1908[this.field1880] != arg2) {
            this.field1908[this.field1880] = arg2;
            this.method42(-9990);
            var5 = true;
        }
        if (var5) {
            this.field1849 &= -30;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)Lft;")
    public abstract class4 method105(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)V")
    public abstract void method88(byte arg0);

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "(I)V")
    public abstract void method68(int arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method101(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "(I)V")
    public abstract void method99(int arg0);

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "(I)V")
    public abstract void method41(int arg0);

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "(I)V")
    public abstract void method85(int arg0);

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "(I)V")
    public abstract void method64(int arg0);

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(II)V")
    public abstract void method84(int arg0, int arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIZI[III)Lak;")
    public abstract class324 method37(byte arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLts;)V")
    public abstract void method62(boolean arg0, class501 arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([FIZIIILhi;B)Lak;")
    public abstract class324 method75(float[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class193 arg6, byte arg7);

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "(I)V")
    public abstract void method42(int arg0);

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "(B)V")
    public abstract void method40(byte arg0);

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "(I)V")
    public abstract void method77(int arg0);

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "(B)V")
    public abstract void method74(byte arg0);

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "(I)V")
    public abstract void method36(int arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[Lca;)Lts;")
    public abstract class501 method45(int arg0, class282[] arg1);

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "(B)V")
    public abstract void method44(byte arg0);

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "(I)V")
    public abstract void method95(int arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method81(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method67(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(Z)V")
    public abstract void method82(boolean arg0);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(Z)V")
    public abstract void method35(boolean arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILob;Lft;III)V")
    public abstract void method53(int arg0, int arg1, class691 arg2, class4 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "(I)V")
    public abstract void method31(int arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI[[II)Lul;")
    public abstract class537 method103(boolean arg0, int arg1, int[][] arg2, int arg3);

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(Z)V")
    public abstract void method58(boolean arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B[BIILhi;I)Ljs;")
    public abstract class306 method92(byte arg0, byte[] arg1, int arg2, int arg3, class193 arg4, int arg5);

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(ZI)Leu;")
    public abstract class448 method108(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method50(boolean arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lhi;Lne;I)Z")
    public abstract boolean method34(class193 arg0, class294 arg1, int arg2);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLeu;I)V")
    public abstract void method48(byte arg0, class448 arg1, int arg2);

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "(Z)V")
    public abstract void method47(boolean arg0);

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "(B)V")
    public abstract void method43(byte arg0);

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "(I)F")
    public abstract float method65(int arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZZLgf;)V")
    public abstract void method60(int arg0, int arg1, boolean arg2, boolean arg3, class256 arg4);

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "(B)V")
    public abstract void method102(byte arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIILob;)V")
    public abstract void method89(byte arg0, int arg1, int arg2, class691 arg3);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lhi;ZLne;)Z")
    public abstract boolean method69(class193 arg0, boolean arg1, class294 arg2);

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "(I)V")
    public abstract void method91(int arg0);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IZ)V")
    public abstract void method71(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "(B)V")
    public abstract void method66(byte arg0);

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "(B)V")
    public abstract void method90(byte arg0);

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "(I)V")
    public abstract void method78(int arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lgf;ZBI)V")
    public abstract void method57(class256 arg0, boolean arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lmf;Z)V")
    public abstract void method63(class388 arg0, boolean arg1);

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "(I)V")
    public abstract void method94(int arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIILhi;[BZ)Lak;")
    public abstract class324 method61(int arg0, int arg1, int arg2, int arg3, int arg4, class193 arg5, byte[] arg6, boolean arg7);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lne;IILhi;I)Lak;")
    public abstract class324 method46(class294 arg0, int arg1, int arg2, class193 arg3, int arg4);
}
