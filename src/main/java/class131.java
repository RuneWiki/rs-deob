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

@OriginalClass("client!eea")
public class class131 extends class58 {

    @OriginalMember(owner = "client!eea", name = "Db", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field1635 = new Hashtable();

    @OriginalMember(owner = "client!eea", name = "te", descriptor = "I")
    public int field1781 = 128;

    @OriginalMember(owner = "client!eea", name = "ne", descriptor = "Ldd;")
    private class703 field1775 = new class703();

    @OriginalMember(owner = "client!eea", name = "we", descriptor = "Lfw;")
    private class55 field1784 = new class55();

    @OriginalMember(owner = "client!eea", name = "xe", descriptor = "Lfw;")
    public class55 field1785 = new class55();

    @OriginalMember(owner = "client!eea", name = "ye", descriptor = "I")
    public int field1786 = 3;

    @OriginalMember(owner = "client!eea", name = "ze", descriptor = "Z")
    private boolean field1787 = false;

    @OriginalMember(owner = "client!eea", name = "Ee", descriptor = "I")
    public int field1792 = 8;

    @OriginalMember(owner = "client!eea", name = "De", descriptor = "Lbg;")
    private class464 field1791 = new class464();

    @OriginalMember(owner = "client!eea", name = "He", descriptor = "[Lvv;")
    private class324[] field1795 = new class324[4];

    @OriginalMember(owner = "client!eea", name = "Ie", descriptor = "I")
    private int field1796 = -1;

    @OriginalMember(owner = "client!eea", name = "Ne", descriptor = "I")
    private int field1801 = -1;

    @OriginalMember(owner = "client!eea", name = "Fe", descriptor = "[Lvv;")
    private class324[] field1793 = new class324[4];

    @OriginalMember(owner = "client!eea", name = "Ke", descriptor = "I")
    private int field1798 = -1;

    @OriginalMember(owner = "client!eea", name = "Ge", descriptor = "[Lvv;")
    private class324[] field1794 = new class324[4];

    @OriginalMember(owner = "client!eea", name = "Qe", descriptor = "Lbg;")
    private class464 field1804;

    @OriginalMember(owner = "client!eea", name = "Te", descriptor = "Lbg;")
    private class464 field1807;

    @OriginalMember(owner = "client!eea", name = "Ue", descriptor = "Lbg;")
    private class464 field1808;

    @OriginalMember(owner = "client!eea", name = "Ve", descriptor = "Lbg;")
    private class464 field1809;

    @OriginalMember(owner = "client!eea", name = "We", descriptor = "Lbg;")
    private class464 field1810;

    @OriginalMember(owner = "client!eea", name = "Xe", descriptor = "Lbg;")
    private class464 field1811;

    @OriginalMember(owner = "client!eea", name = "Ye", descriptor = "Lbg;")
    private class464 field1812;

    @OriginalMember(owner = "client!eea", name = "cf", descriptor = "Lfw;")
    public class55 field1816;

    @OriginalMember(owner = "client!eea", name = "jf", descriptor = "Lfw;")
    public class55 field1822;

    @OriginalMember(owner = "client!eea", name = "kf", descriptor = "Lfw;")
    public class55 field1823;

    @OriginalMember(owner = "client!eea", name = "wf", descriptor = "[F")
    private float[] field1835;

    @OriginalMember(owner = "client!eea", name = "qf", descriptor = "[F")
    private float[] field1829;

    @OriginalMember(owner = "client!eea", name = "Mf", descriptor = "F")
    public float field1851;

    @OriginalMember(owner = "client!eea", name = "sf", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!eea", name = "dg", descriptor = "[F")
    private float[] field1868;

    @OriginalMember(owner = "client!eea", name = "fg", descriptor = "I")
    private int field1870;

    @OriginalMember(owner = "client!eea", name = "Nf", descriptor = "F")
    private float field1852;

    @OriginalMember(owner = "client!eea", name = "Bf", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!eea", name = "Bg", descriptor = "F")
    public float field1892;

    @OriginalMember(owner = "client!eea", name = "Gf", descriptor = "[F")
    public float[] field1845;

    @OriginalMember(owner = "client!eea", name = "yg", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!eea", name = "rf", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!eea", name = "wg", descriptor = "[F")
    private float[] field1887;

    @OriginalMember(owner = "client!eea", name = "Gg", descriptor = "I")
    private int field1897;

    @OriginalMember(owner = "client!eea", name = "yf", descriptor = "Z")
    private boolean field1837;

    @OriginalMember(owner = "client!eea", name = "lg", descriptor = "I")
    private int field1876;

    @OriginalMember(owner = "client!eea", name = "Jg", descriptor = "F")
    public float field1900;

    @OriginalMember(owner = "client!eea", name = "mf", descriptor = "F")
    private float field1825;

    @OriginalMember(owner = "client!eea", name = "uf", descriptor = "F")
    public float field1833;

    @OriginalMember(owner = "client!eea", name = "mg", descriptor = "I")
    private int field1877;

    @OriginalMember(owner = "client!eea", name = "tg", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!eea", name = "Ng", descriptor = "I")
    private int field1904;

    @OriginalMember(owner = "client!eea", name = "hg", descriptor = "Z")
    private boolean field1872;

    @OriginalMember(owner = "client!eea", name = "Wg", descriptor = "F")
    private float field1913;

    @OriginalMember(owner = "client!eea", name = "Og", descriptor = "[Lwi;")
    private class465[] field1905;

    @OriginalMember(owner = "client!eea", name = "Cg", descriptor = "F")
    private float field1893;

    @OriginalMember(owner = "client!eea", name = "Qg", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!eea", name = "ch", descriptor = "F")
    public float field1919;

    @OriginalMember(owner = "client!eea", name = "bh", descriptor = "F")
    private float field1918;

    @OriginalMember(owner = "client!eea", name = "Eg", descriptor = "F")
    public float field1895;

    @OriginalMember(owner = "client!eea", name = "fh", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!eea", name = "Ff", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!eea", name = "Kg", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!eea", name = "Pf", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!eea", name = "dh", descriptor = "F")
    public float field1920;

    @OriginalMember(owner = "client!eea", name = "sg", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!eea", name = "Dg", descriptor = "I")
    private int field1894;

    @OriginalMember(owner = "client!eea", name = "pg", descriptor = "I")
    private int field1880;

    @OriginalMember(owner = "client!eea", name = "Tg", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!eea", name = "lh", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "client!eea", name = "qh", descriptor = "I")
    private int field1933;

    @OriginalMember(owner = "client!eea", name = "gh", descriptor = "Lrn;")
    public class267 field1923;

    @OriginalMember(owner = "client!eea", name = "rh", descriptor = "[I")
    public int[] field1934;

    @OriginalMember(owner = "client!eea", name = "uh", descriptor = "[I")
    public int[] field1937;

    @OriginalMember(owner = "client!eea", name = "vh", descriptor = "[B")
    public byte[] field1938;

    @OriginalMember(owner = "client!eea", name = "wh", descriptor = "[I")
    public int[] field1939;

    @OriginalMember(owner = "client!eea", name = "Bb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1633;

    @OriginalMember(owner = "client!eea", name = "Wd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1758;

    @OriginalMember(owner = "client!eea", name = "ue", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!eea", name = "dc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field1661;

    @OriginalMember(owner = "client!eea", name = "Ec", descriptor = "J")
    private long field1688;

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "J")
    private long field1574;

    @OriginalMember(owner = "client!eea", name = "ag", descriptor = "Z")
    public boolean field1865;

    @OriginalMember(owner = "client!eea", name = "Kf", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!eea", name = "ih", descriptor = "Ljava/lang/String;")
    private String field1925;

    @OriginalMember(owner = "client!eea", name = "ah", descriptor = "Z")
    public boolean field1917;

    @OriginalMember(owner = "client!eea", name = "Df", descriptor = "Z")
    public boolean field1842;

    @OriginalMember(owner = "client!eea", name = "rg", descriptor = "Z")
    private boolean field1882;

    @OriginalMember(owner = "client!eea", name = "Pg", descriptor = "Z")
    public boolean field1906;

    @OriginalMember(owner = "client!eea", name = "Of", descriptor = "Z")
    public boolean field1853;

    @OriginalMember(owner = "client!eea", name = "Yf", descriptor = "Z")
    private boolean field1863;

    @OriginalMember(owner = "client!eea", name = "Cf", descriptor = "Ljava/lang/String;")
    private String field1841;

    @OriginalMember(owner = "client!eea", name = "Tf", descriptor = "Z")
    public boolean field1858;

    @OriginalMember(owner = "client!eea", name = "nf", descriptor = "Z")
    private boolean field1826;

    @OriginalMember(owner = "client!eea", name = "qe", descriptor = "Lad;")
    private class424 field1778;

    @OriginalMember(owner = "client!eea", name = "Be", descriptor = "Lug;")
    public class561 field1789;

    @OriginalMember(owner = "client!eea", name = "re", descriptor = "Lsw;")
    private class753 field1779;

    @OriginalMember(owner = "client!eea", name = "pe", descriptor = "Loda;")
    private class116 field1777;

    @OriginalMember(owner = "client!eea", name = "se", descriptor = "Lrm;")
    private class409 field1780;

    @OriginalMember(owner = "client!eea", name = "yb", descriptor = "Las;")
    public static class151 field1630 = new class151(0, 2, 2, 1);

    @OriginalMember(owner = "client!eea", name = "xd", descriptor = "Lgda;")
    public static class53 field1733 = new class53(44, 3);

    @OriginalMember(owner = "client!eea", name = "ge", descriptor = "[F")
    public static float[] field1768 = new float[4];

    @OriginalMember(owner = "client!eea", name = "ve", descriptor = "Lgda;")
    public static class53 field1783 = new class53(84, 7);

    @OriginalMember(owner = "client!eea", name = "pf", descriptor = "F")
    private float field1828;

    @OriginalMember(owner = "client!eea", name = "tf", descriptor = "F")
    public float field1832;

    @OriginalMember(owner = "client!eea", name = "Ef", descriptor = "F")
    public float field1843;

    @OriginalMember(owner = "client!eea", name = "Hf", descriptor = "F")
    private float field1846;

    @OriginalMember(owner = "client!eea", name = "Jf", descriptor = "F")
    public float field1848;

    @OriginalMember(owner = "client!eea", name = "bg", descriptor = "F")
    public float field1866;

    @OriginalMember(owner = "client!eea", name = "ug", descriptor = "F")
    private float field1885;

    @OriginalMember(owner = "client!eea", name = "Ag", descriptor = "F")
    public float field1891;

    @OriginalMember(owner = "client!eea", name = "mh", descriptor = "F")
    public float field1929;

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!eea", name = "B", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!eea", name = "D", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!eea", name = "E", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!eea", name = "H", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!eea", name = "J", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!eea", name = "K", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!eea", name = "L", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!eea", name = "M", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!eea", name = "N", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!eea", name = "O", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!eea", name = "P", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!eea", name = "Q", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!eea", name = "R", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!eea", name = "S", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!eea", name = "T", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!eea", name = "U", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!eea", name = "V", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!eea", name = "W", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!eea", name = "X", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!eea", name = "Y", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!eea", name = "Z", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!eea", name = "ab", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!eea", name = "bb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!eea", name = "cb", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!eea", name = "db", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!eea", name = "eb", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!eea", name = "fb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!eea", name = "gb", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!eea", name = "hb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!eea", name = "ib", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!eea", name = "jb", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!eea", name = "kb", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!eea", name = "lb", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!eea", name = "mb", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!eea", name = "nb", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!eea", name = "ob", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!eea", name = "pb", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!eea", name = "qb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!eea", name = "rb", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!eea", name = "sb", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!eea", name = "tb", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!eea", name = "ub", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!eea", name = "vb", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!eea", name = "wb", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!eea", name = "xb", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!eea", name = "zb", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!eea", name = "Ab", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!eea", name = "Cb", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!eea", name = "Eb", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!eea", name = "Fb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!eea", name = "Gb", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!eea", name = "Hb", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!eea", name = "Ib", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!eea", name = "Jb", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!eea", name = "Kb", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!eea", name = "Lb", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!eea", name = "Mb", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "client!eea", name = "Nb", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!eea", name = "Ob", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!eea", name = "Pb", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!eea", name = "Qb", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!eea", name = "Rb", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!eea", name = "Sb", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!eea", name = "Tb", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!eea", name = "Ub", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!eea", name = "Vb", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!eea", name = "Wb", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!eea", name = "Xb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!eea", name = "Yb", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!eea", name = "Zb", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!eea", name = "ac", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "client!eea", name = "bc", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!eea", name = "cc", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!eea", name = "ec", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!eea", name = "fc", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!eea", name = "gc", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!eea", name = "hc", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!eea", name = "ic", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!eea", name = "jc", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!eea", name = "kc", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!eea", name = "lc", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!eea", name = "mc", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!eea", name = "nc", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!eea", name = "oc", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!eea", name = "pc", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!eea", name = "qc", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!eea", name = "rc", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!eea", name = "sc", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!eea", name = "tc", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!eea", name = "uc", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!eea", name = "vc", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!eea", name = "wc", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!eea", name = "xc", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!eea", name = "yc", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!eea", name = "zc", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!eea", name = "Ac", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!eea", name = "Bc", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!eea", name = "Cc", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!eea", name = "Dc", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!eea", name = "Fc", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!eea", name = "Gc", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!eea", name = "Hc", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!eea", name = "Ic", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!eea", name = "Jc", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!eea", name = "Kc", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!eea", name = "Lc", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!eea", name = "Mc", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!eea", name = "Nc", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!eea", name = "Oc", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!eea", name = "Pc", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!eea", name = "Qc", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!eea", name = "Rc", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!eea", name = "Sc", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!eea", name = "Tc", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!eea", name = "Uc", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!eea", name = "Vc", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!eea", name = "Wc", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!eea", name = "Xc", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!eea", name = "Yc", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!eea", name = "Zc", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!eea", name = "ad", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!eea", name = "bd", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!eea", name = "cd", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!eea", name = "dd", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!eea", name = "ed", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!eea", name = "fd", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!eea", name = "gd", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!eea", name = "hd", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!eea", name = "id", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!eea", name = "jd", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!eea", name = "kd", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!eea", name = "ld", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!eea", name = "md", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!eea", name = "nd", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!eea", name = "od", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!eea", name = "pd", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!eea", name = "qd", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!eea", name = "rd", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!eea", name = "sd", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!eea", name = "td", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!eea", name = "ud", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!eea", name = "vd", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!eea", name = "wd", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!eea", name = "yd", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!eea", name = "zd", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!eea", name = "Ad", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!eea", name = "Bd", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!eea", name = "Cd", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!eea", name = "Dd", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!eea", name = "Ed", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!eea", name = "Fd", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!eea", name = "Gd", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!eea", name = "Hd", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!eea", name = "Id", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!eea", name = "Jd", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!eea", name = "Kd", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!eea", name = "Ld", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!eea", name = "Md", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!eea", name = "Nd", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!eea", name = "Od", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!eea", name = "Pd", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!eea", name = "Qd", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!eea", name = "Rd", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!eea", name = "Sd", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!eea", name = "Td", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!eea", name = "Ud", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!eea", name = "Vd", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!eea", name = "Xd", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!eea", name = "Yd", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!eea", name = "Zd", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!eea", name = "ae", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!eea", name = "be", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!eea", name = "ce", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!eea", name = "de", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!eea", name = "ee", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!eea", name = "fe", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!eea", name = "he", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!eea", name = "ie", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!eea", name = "je", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!eea", name = "ke", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!eea", name = "le", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!eea", name = "me", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!eea", name = "oe", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!eea", name = "Ce", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!eea", name = "Pe", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!eea", name = "Re", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!eea", name = "Se", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!eea", name = "Ze", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!eea", name = "ff", descriptor = "I")
    private int field1819;

    @OriginalMember(owner = "client!eea", name = "gf", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "client!eea", name = "Af", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!eea", name = "Rf", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!eea", name = "Sf", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!eea", name = "Wf", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!eea", name = "Zf", descriptor = "I")
    private int field1864;

    @OriginalMember(owner = "client!eea", name = "og", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!eea", name = "qg", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!eea", name = "Mg", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!eea", name = "Vg", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!eea", name = "jh", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!eea", name = "oh", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!eea", name = "ph", descriptor = "I")
    private int field1932;

    @OriginalMember(owner = "client!eea", name = "sh", descriptor = "I")
    private int field1935;

    @OriginalMember(owner = "client!eea", name = "th", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!eea", name = "hf", descriptor = "J")
    private long field1821;

    @OriginalMember(owner = "client!eea", name = "Yg", descriptor = "Lqea;")
    private class126 field1915;

    @OriginalMember(owner = "client!eea", name = "Zg", descriptor = "Lqea;")
    private class126 field1916;

    @OriginalMember(owner = "client!eea", name = "of", descriptor = "Lvp;")
    public class186 field1827;

    @OriginalMember(owner = "client!eea", name = "Qf", descriptor = "Lvp;")
    public class186 field1855;

    @OriginalMember(owner = "client!eea", name = "Le", descriptor = "Lgia;")
    private class269 field1799;

    @OriginalMember(owner = "client!eea", name = "Ug", descriptor = "Lgia;")
    public class269 field1911;

    @OriginalMember(owner = "client!eea", name = "vf", descriptor = "Len;")
    private class318 field1834;

    @OriginalMember(owner = "client!eea", name = "Je", descriptor = "Lvv;")
    private class324 field1797;

    @OriginalMember(owner = "client!eea", name = "Oe", descriptor = "Lvv;")
    private class324 field1802;

    @OriginalMember(owner = "client!eea", name = "lf", descriptor = "Lll;")
    private class364 field1824;

    @OriginalMember(owner = "client!eea", name = "Me", descriptor = "Lje;")
    private class401 field1800;

    @OriginalMember(owner = "client!eea", name = "xf", descriptor = "Lli;")
    public class428 field1836;

    @OriginalMember(owner = "client!eea", name = "Lf", descriptor = "Lli;")
    public class428 field1850;

    @OriginalMember(owner = "client!eea", name = "Uf", descriptor = "Lli;")
    public class428 field1859;

    @OriginalMember(owner = "client!eea", name = "Vf", descriptor = "Lli;")
    public class428 field1860;

    @OriginalMember(owner = "client!eea", name = "gg", descriptor = "Lli;")
    public class428 field1871;

    @OriginalMember(owner = "client!eea", name = "ig", descriptor = "Lli;")
    public class428 field1873;

    @OriginalMember(owner = "client!eea", name = "Fg", descriptor = "Lli;")
    public class428 field1896;

    @OriginalMember(owner = "client!eea", name = "Ig", descriptor = "Lli;")
    public class428 field1899;

    @OriginalMember(owner = "client!eea", name = "Lg", descriptor = "Lli;")
    public class428 field1902;

    @OriginalMember(owner = "client!eea", name = "kh", descriptor = "Lli;")
    public class428 field1927;

    @OriginalMember(owner = "client!eea", name = "zf", descriptor = "Lmfa;")
    public class615 field1838;

    @OriginalMember(owner = "client!eea", name = "Rg", descriptor = "Lsn;")
    private class630 field1908;

    @OriginalMember(owner = "client!eea", name = "Ae", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1788;

    @OriginalMember(owner = "client!eea", name = "af", descriptor = "Z")
    private boolean field1814;

    @OriginalMember(owner = "client!eea", name = "bf", descriptor = "Z")
    private boolean field1815;

    @OriginalMember(owner = "client!eea", name = "df", descriptor = "Z")
    private boolean field1817;

    @OriginalMember(owner = "client!eea", name = "ef", descriptor = "Z")
    private boolean field1818;

    @OriginalMember(owner = "client!eea", name = "Xf", descriptor = "Z")
    private boolean field1862;

    @OriginalMember(owner = "client!eea", name = "cg", descriptor = "Z")
    private boolean field1867;

    @OriginalMember(owner = "client!eea", name = "eg", descriptor = "Z")
    public boolean field1869;

    @OriginalMember(owner = "client!eea", name = "jg", descriptor = "Z")
    public boolean field1874;

    @OriginalMember(owner = "client!eea", name = "kg", descriptor = "Z")
    public boolean field1875;

    @OriginalMember(owner = "client!eea", name = "ng", descriptor = "Z")
    private boolean field1878;

    @OriginalMember(owner = "client!eea", name = "vg", descriptor = "Z")
    public boolean field1886;

    @OriginalMember(owner = "client!eea", name = "xg", descriptor = "Z")
    private boolean field1888;

    @OriginalMember(owner = "client!eea", name = "zg", descriptor = "Z")
    private boolean field1890;

    @OriginalMember(owner = "client!eea", name = "Hg", descriptor = "Z")
    private boolean field1898;

    @OriginalMember(owner = "client!eea", name = "Sg", descriptor = "Z")
    public boolean field1909;

    @OriginalMember(owner = "client!eea", name = "Xg", descriptor = "Z")
    public boolean field1914;

    @OriginalMember(owner = "client!eea", name = "eh", descriptor = "Z")
    public boolean field1921;

    @OriginalMember(owner = "client!eea", name = "hh", descriptor = "Z")
    private boolean field1924;

    @OriginalMember(owner = "client!eea", name = "nh", descriptor = "Z")
    public boolean field1930;

    @OriginalMember(owner = "client!eea", name = "If", descriptor = "[Lta;")
    private class210[] field1847;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V", line = 3)
    public final void method875(int arg0) {
        if (this.field1820 != arg0) {
            this.method923((byte) 71);
            this.method885(false, (byte) 85);
            this.method898(false, arg0 ^ -25996);
            this.method879(false, arg0 ^ 70);
            this.method881((byte) 87, false);
            this.method922(-64, -2);
            this.field1820 = 2;
        }
        ++field1759;
    }

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "()I", line = 23)
    public final int method387() {
        ++field1769;
        return this.field1907;
    }

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "()I", line = 31)
    public final int method382() {
        ++field1626;
        int var1 = this.field1935;
        this.field1935 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I[BIIZ)Lsn;", line = 43)
    public final class630 method876(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        ++field1641;
        if (arg0 != -16889) {
            this.method930(-113L, 65);
        }
        return (class630) (!this.field1882 || arg4 && !this.field1863 ? new class99(this, arg3, arg1, arg2) : new class225(this, arg3, arg1, arg2, arg4));
    }

    @OriginalMember(owner = "client!eea", name = "pa", descriptor = "()V", line = 60)
    public final void method414() {
        ++field1726;
        this.field1930 = false;
    }

    @OriginalMember(owner = "client!eea", name = "na", descriptor = "(IIII)[I", line = 71)
    public final int[] method409(int arg0, int arg1, int arg2, int arg3) {
        ++field1638;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field1658 - var6, arg2, 1, 32993, this.field1849, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BLvv;)V", line = 96)
    public final void method877(byte arg0, class324 arg1) {
        ++field1704;
        if (arg0 <= -25) {
            if (this.field1874) {
                this.method911(-30670, arg1);
                this.method951(arg1, 1);
            } else if (~this.field1796 <= -4) {
                throw new RuntimeException();
            } else {
                if (~this.field1796 <= -1) {
                    this.field1794[this.field1796].method1757(true);
                }
                this.field1797 = this.field1802 = this.field1794[++this.field1796] = arg1;
                this.field1797.method1753(-23783);
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "()V", line = 124)
    public final void method389() {
        for (class189 var1 = this.field1791.method2765(-12261); var1 != null; var1 = this.field1791.method2759(-15361)) {
            ((class340) var1).method2198(126);
        }
        ++field1639;
        if (this.field1779 != null) {
            this.field1779.method4191(1);
        }
        if (this.field1661 != null) {
            this.method940(true);
            Enumeration var2 = this.field1635.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field1635.get(var3);
                this.field1661.releaseSurface(var3, var4);
            }
            this.field1661.release();
            this.field1661 = null;
        }
        if (this.field1787) {
            class19.method116(true, false, (byte) 66);
            this.field1787 = false;
        }
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "()Z", line = 170)
    public final boolean method396() {
        ++field1725;
        return this.field1780.method2530(3, -1312);
    }

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "(I)V", line = 178)
    public final void method878(int arg0) {
        ++field1649;
        OpenGL.glPopMatrix();
        if (arg0 >= -122) {
            this.method447(-47, (class486) null, -40, -92);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZI)V", line = 189)
    public final void method879(boolean arg0, int arg1) {
        ++field1651;
        if (!this.field1815 != !arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field1820 &= -32;
            this.field1815 = arg0;
        }
        int var3 = 71 % ((17 - arg1) / 32);
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(II)I", line = 211)
    public final int method479(int arg0, int arg1) {
        ++field1636;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lgd;)V", line = 219)
    public final void method478(class339 arg0) {
        ++field1597;
    }

    @OriginalMember(owner = "client!eea", name = "EA", descriptor = "(IIII)V", line = 226)
    public final void method444(int arg0, int arg1, int arg2, int arg3) {
        ++field1743;
        if (!this.field1930) {
            throw new RuntimeException("");
        } else {
            this.field1922 = arg1;
            this.field1903 = arg0;
            this.field1928 = arg3;
            this.field1883 = arg2;
            if (this.field1872) {
                this.field1780.field5790.method3598((byte) -66);
                this.field1780.field5790.method3594(34336);
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "(II)I", line = 253)
    public final int method880(int arg0, int arg1) {
        ++field1605;
        if (arg0 != -22330) {
            this.method466(96, 70);
        }
        if (~arg1 != -6407 && arg1 != 6409) {
            if (arg1 != 6410 && ~arg1 != -34847 && arg1 != 34844) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (arg1 != 6408 && ~arg1 != -34848) {
                    if (~arg1 != -34844) {
                        if (~arg1 != -34843) {
                            if (~arg1 == -6403) {
                                return 3;
                            } else if (~arg1 == -6402) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BZ)V", line = 295)
    public final void method881(byte arg0, boolean arg1) {
        if (arg0 == 87) {
            if (this.field1817 == !arg1) {
                this.field1817 = arg1;
                this.method889((byte) 74);
                this.field1820 &= -32;
            }
            ++field1617;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V", line = 315)
    private final void method882(byte arg0) {
        if (this.field1924) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field1924 = false;
        }
        if (arg0 > -96) {
            this.field1874 = true;
        }
        ++field1711;
    }

    @OriginalMember(owner = "client!eea", name = "ya", descriptor = "()V", line = 334)
    public final void method440() {
        ++field1681;
        this.method881((byte) 87, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIII)V", line = 346)
    public final void method883(byte arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg3);
        if (arg0 != 34) {
            this.method459((class143) null, (class204[]) null, false);
        }
        ++field1662;
        OpenGL.glTexEnvi(8960, 34192 - -arg1, arg2);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZ)V", line = 358)
    public final void method884(int arg0, boolean arg1) {
        if (arg1) {
            if (this.field1931 != arg0) {
                OpenGL.glActiveTexture(33984 - -arg0);
                this.field1931 = arg0;
            }
            ++field1599;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIF)Lwi;", line = 374)
    public final class465 method475(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field1589;
        return new class433(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZB)V", line = 383)
    public final void method885(boolean arg0, byte arg1) {
        if (arg1 <= 81) {
            this.field1795 = null;
        }
        ++field1591;
        if (!this.field1862 == arg0) {
            this.field1862 = arg0;
            this.method909(20817);
            this.field1820 &= -32;
        }
    }

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "(II)I", line = 401)
    public final int method886(int arg0, int arg1) {
        ++field1606;
        if (arg1 != 5121 && ~arg1 != -5121) {
            if (arg0 != 4318) {
                this.field1900 = 0.29992986F;
            }
            if (arg1 != 5123 && arg1 != 5122) {
                if (~arg1 != -5126 && ~arg1 != -5125 && ~arg1 != -5127) {
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

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(B)V", line = 423)
    private final void method887(byte arg0) {
        ++field1735;
        float var2 = (float) (-this.field1884) * this.field1913 / (float) this.field1910;
        float var3 = (float) (-this.field1901) * this.field1913 / (float) this.field1844;
        float var4 = (float) (this.field1765 - this.field1884) * this.field1913 / (float) this.field1910;
        float var5 = (float) (-this.field1901 + this.field1658) * this.field1913 / (float) this.field1844;
        if (arg0 > -98) {
            this.method926((class210) null, 107);
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field1907, (double) this.field1877);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Lza;", line = 452)
    public final class413 method371(int arg0) {
        ++field1594;
        class340 var2 = new class340(arg0);
        this.field1791.method2770((byte) -13, var2);
        return var2;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIII)V", line = 466)
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1683;
        this.method938(false);
        this.method914(1, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
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

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "()Z", line = 500)
    public final boolean method413() {
        ++field1583;
        if (this.field1777 != null) {
            if (!this.field1777.method3391(-3)) {
                if (!this.field1779.method4188(this.field1777, 0)) {
                    return false;
                }
                this.field1778.method2592(true);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIILaa;II)V", line = 526)
    public final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8) {
        ++field1585;
        class397 var10 = (class397) arg6;
        class364 var11 = var10.field5597;
        this.method875(2);
        this.method926(var10.field5597, 107);
        this.method914(1, arg5);
        this.method946(false, 7681, 8448);
        this.method883((byte) 34, 0, 768, 34167);
        float var12 = var11.field5154 / (float) var11.field5158;
        float var13 = var11.field5152 / (float) var11.field5153;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method883((byte) 34, 0, 768, 5890);
    }

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "(I)V", line = 566)
    public final void method888(int arg0) {
        ++field1650;
        if (this.field1820 != arg0) {
            this.method923((byte) 97);
            this.method885(false, (byte) 110);
            this.method898(false, arg0 ^ -25998);
            this.method879(false, -95);
            this.method881((byte) 87, false);
            this.method922(122, -2);
            this.method914(1, 1);
            this.field1820 = 4;
        }
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(B)V", line = 587)
    private final void method889(byte arg0) {
        OpenGL.glDepthMask(this.field1817 && this.field1837);
        if (arg0 < 34) {
            this.method954((class55) null, -128);
        }
        ++field1774;
    }

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "()Z", line = 601)
    public final boolean method476() {
        ++field1709;
        return false;
    }

    @OriginalMember(owner = "client!eea", name = "T", descriptor = "(IIII)V", line = 611)
    public final void method394(int arg0, int arg1, int arg2, int arg3) {
        if (~arg3 > ~this.field1830) {
            this.field1830 = arg3;
        }
        if (this.field1870 > arg2) {
            this.field1870 = arg2;
        }
        if (arg1 > this.field1889) {
            this.field1889 = arg1;
        }
        ++field1668;
        if (this.field1894 < arg0) {
            this.field1894 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method931((byte) 102);
        this.method950(0);
    }

    @OriginalMember(owner = "client!eea", name = "Q", descriptor = "(IIIIII[BII)V", line = 636)
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1622;
        float var10;
        float var11;
        if (this.field1824 != null && ~this.field1824.field8604 <= ~arg2 && arg3 <= this.field1824.field8610) {
            this.field1824.method3446(arg2, false, 0, false, 6406, arg6, 0, arg3, 0, 0);
            var10 = (float) arg3 * this.field1824.field5152 / (float) this.field1824.field8610;
            var11 = (float) arg2 * this.field1824.field5154 / (float) this.field1824.field8604;
        } else {
            this.field1824 = class294.method1914(true, arg3, false, arg2, arg6, this, 6406, 6406);
            this.field1824.method3445(false, false, 81);
            var10 = this.field1824.field5152;
            var11 = this.field1824.field5154;
        }
        this.method875(2);
        this.method926(this.field1824, 86);
        this.method914(1, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method933(arg5, (byte) 28);
        this.method946(false, 34165, 34165);
        this.method883((byte) 34, 0, 768, 34166);
        this.method883((byte) 34, 2, 770, 5890);
        this.method948(34166, 0, 770, (byte) 50);
        this.method948(5890, 2, 770, (byte) 120);
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
        this.method883((byte) 34, 0, 768, 5890);
        this.method883((byte) 34, 2, 770, 34166);
        this.method948(5890, 0, 770, (byte) 97);
        this.method948(34166, 2, 770, (byte) -82);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lmf;)V", line = 698)
    public final void method405(class418 arg0) {
        this.field1834 = (class318) arg0;
        ++field1737;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(FIF)V", line = 706)
    public final void method890(float arg0, int arg1, float arg2) {
        if (arg1 != -11757) {
            this.field1780 = null;
        }
        this.field1893 = arg0;
        ++field1619;
        this.field1825 = arg2;
        this.method906((byte) -111);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)V", line = 722)
    public final void method891(int arg0, byte arg1) {
        if (arg0 != 1) {
            if (arg0 != 0) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.method946(false, 260, 8448);
                    } else if (~arg0 == -5) {
                        this.method946(false, 34023, 34023);
                    }
                } else {
                    this.method946(false, 34165, 7681);
                }
            } else {
                this.method946(false, 8448, 8448);
            }
        } else {
            this.method946(false, 7681, 7681);
        }
        ++field1742;
        if (arg1 != 17) {
            this.field1930 = false;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 757)
    public final void method477(Canvas arg0) {
        ++field1729;
        if (this.field1633 == arg0) {
            throw new RuntimeException();
        } else if (this.field1635.containsKey(arg0)) {
            Long var2 = (Long) this.field1635.get(arg0);
            this.field1661.releaseSurface(arg0, var2);
            this.field1635.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "(I)V", line = 778)
    private final void method892(int arg0) {
        ++field1695;
        if (arg0 == -9381) {
            OpenGL.glViewport(this.field1876, this.field1880, this.field1765, this.field1658);
        }
    }

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "()Z", line = 789)
    public final boolean method441() {
        ++field1600;
        return false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BLfw;)V", line = 802)
    public final void method893(byte arg0, class55 arg1) {
        ++field1584;
        OpenGL.glPushMatrix();
        if (arg0 < 27) {
            this.field1635 = null;
        }
        OpenGL.glMultMatrixf(arg1.method354(18), 0);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILsn;)V", line = 814)
    public final void method894(int arg0, class630 arg1) {
        if (this.field1908 != arg1) {
            if (this.field1882) {
                OpenGL.glBindBufferARB(34963, arg1.method721(-23198));
            }
            this.field1908 = arg1;
        }
        ++field1576;
        if (arg0 != 34963) {
            this.field1828 = 0.78850526F;
        }
    }

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "(I)V", line = 834)
    private final void method895(int arg0) {
        int var2 = -35 / ((9 - arg0) / 34);
        ++field1604;
        int var3 = 0;
        while (!this.field1661.method3502()) {
            if (~(var3++) < -6) {
                throw new RuntimeException("");
            }
            class756.method4205(1000L, 0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "L", descriptor = "(III)V", line = 856)
    public final void method418(int arg0, int arg1, int arg2) {
        ++field1625;
        if (~this.field1854 != ~arg0 || this.field1840 != arg1 || ~this.field1831 != ~arg2) {
            this.field1840 = arg1;
            this.field1854 = arg0;
            this.field1831 = arg2;
            this.method906((byte) -117);
            this.method909(20817);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 875)
    public final void method375(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class76 {
        this.method435(arg2, arg3);
        ++field1657;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IBI)V", line = 886)
    public final synchronized void method896(int arg0, byte arg1, int arg2) {
        ++field1724;
        class756 var4 = new class756(arg0);
        var4.field2546 = (long) arg2;
        int var5 = -118 % ((68 - arg1) / 56);
        this.field1810.method2770((byte) -13, var4);
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(B)V", line = 899)
    private final void method897(byte arg0) {
        ++field1736;
        if (arg0 != -27) {
            this.field1810 = null;
        }
        if (~this.field1857 != -3) {
            this.field1857 = 2;
            this.method907((byte) -100);
            this.method927((byte) 112);
            this.field1820 &= -8;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIZ)Loia;", line = 918)
    public final class88 method386(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1746;
        return new class401(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(ZI)V", line = 926)
    public final void method898(boolean arg0, int arg1) {
        if (arg0 == !this.field1890) {
            this.field1890 = arg0;
            this.method900(arg1 + 4788);
            this.field1820 &= -8;
        }
        if (arg1 != -25994) {
            this.method383(13, 96, 29, 21, 119, 60, (class486) null, 113, -28);
        }
        ++field1716;
    }

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "()Z", line = 944)
    public final boolean method438() {
        ++field1579;
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(IIII)V", line = 952)
    public final void method899(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 17) {
            this.method914(-126, 29);
        }
        ++field1764;
        OpenGL.glDrawArrays(arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "(I)V", line = 965)
    private final void method900(int arg0) {
        if (this.field1890 && !this.field1878) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 == -21206) {
            ++field1678;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(FFFI)V", line = 980)
    private final void method901(float arg0, float arg1, float arg2, int arg3) {
        ++field1712;
        OpenGL.glMatrixMode(5890);
        if (this.field1924) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg2, arg0);
        OpenGL.glMatrixMode(5888);
        this.field1924 = true;
        if (arg3 != 20357) {
            this.method436();
        }
    }

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "(I)V", line = 1000)
    private final void method902(int arg0) {
        ++field1702;
        float[] var2 = this.field1887;
        float var3 = (float) (-this.field1884 * this.field1907) / (float) this.field1910;
        float var4 = (float) ((-this.field1884 + this.field1765) * this.field1907) / (float) this.field1910;
        float var5 = (float) (this.field1907 * this.field1901) / (float) this.field1844;
        float var6 = (float) ((-this.field1658 + this.field1901) * this.field1907) / (float) this.field1844;
        if (arg0 <= 119) {
            this.method420((int[]) null);
        }
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field1907 * 2.0F;
            var2[2] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[6] = 0.0F;
            var2[4] = 0.0F;
            var2[13] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[14] = this.field1885 = -((float) this.field1877 * var7) / (float) (-this.field1907 + this.field1877);
            var2[3] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[1] = 0.0F;
            var2[7] = 0.0F;
            var2[11] = -1.0F;
            var2[10] = this.field1828 = (float) (-(this.field1907 + this.field1877)) / (float) (-this.field1907 + this.field1877);
            var2[12] = 0.0F;
            var2[15] = 0.0F;
        } else {
            var2[9] = 0.0F;
            var2[2] = 0.0F;
            var2[14] = 0.0F;
            var2[6] = 0.0F;
            var2[0] = 1.0F;
            var2[8] = 0.0F;
            var2[4] = 0.0F;
            var2[15] = 1.0F;
            var2[13] = 0.0F;
            var2[1] = 0.0F;
            var2[11] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[10] = 1.0F;
            var2[5] = 1.0F;
        }
        this.method943((byte) -19);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([BIIZB)Lqea;", line = 1063)
    public final class126 method903(byte[] arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        ++field1669;
        if (arg4 != 46) {
            return null;
        } else {
            return (class126) (!this.field1882 || arg3 && !this.field1863 ? new class475(this, arg2, arg0, arg1) : new class193(this, arg2, arg0, arg1, arg3));
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILvv;)V", line = 1082)
    public final void method904(int arg0, class324 arg1) {
        ++field1640;
        if (arg0 <= this.field1798 && this.field1793[this.field1798] == arg1) {
            this.field1793[this.field1798--] = null;
            arg1.method1754((byte) 30);
            if (this.field1798 >= 0) {
                this.field1802 = this.field1793[this.field1798];
                this.field1802.method1756(-6521);
            } else {
                this.field1802 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(FFF)V", line = 1103)
    public final void method428(float arg0, float arg1, float arg2) {
        class406.field5756 = arg2;
        class590.field8323 = arg0;
        class322.field4455 = arg1;
        ++field1674;
    }

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "(I)V", line = 1124)
    private final void method905(int arg0) {
        class704.field9806[2] = this.field1866 * this.field1851;
        ++field1714;
        if (arg0 != 7) {
            this.method416(-71);
        }
        class704.field9806[3] = 1.0F;
        class704.field9806[1] = this.field1895 * this.field1866;
        class704.field9806[0] = this.field1919 * this.field1866;
        OpenGL.glLightModelfv(2899, class704.field9806, 0);
    }

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "(II)V", line = 1142)
    public final void method492(int arg0, int arg1) {
        ++field1740;
    }

    @OriginalMember(owner = "client!eea", name = "P", descriptor = "(IIIII)V", line = 1150)
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1727;
        this.method938(false);
        this.method914(1, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!eea", name = "la", descriptor = "()V", line = 1170)
    public final void method424() {
        this.field1894 = 0;
        ++field1581;
        this.field1870 = this.field1765;
        this.field1889 = 0;
        this.field1830 = this.field1658;
        OpenGL.glDisable(3089);
        this.method931((byte) 103);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldm;)V", line = 1186)
    public final void method381(class50 arg0) {
        ++field1596;
        this.field1775.method3956(arg0, (byte) 116, -1, this);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lza;)V", line = 1197)
    public final void method460(class413 arg0) {
        ++field1664;
        this.field1788 = ((class340) arg0).field4701;
        if (this.field1915 == null) {
            class267 var2 = new class267(80);
            if (this.field1865) {
                var2.method1742(-1.0F, -32197);
                var2.method1742(-1.0F, -32197);
                var2.method1742(0.0F, -32197);
                var2.method1742(0.0F, -32197);
                var2.method1742(1.0F, -32197);
                var2.method1742(1.0F, -32197);
                var2.method1742(-1.0F, -32197);
                var2.method1742(0.0F, -32197);
                var2.method1742(1.0F, -32197);
                var2.method1742(1.0F, -32197);
                var2.method1742(1.0F, -32197);
                var2.method1742(1.0F, -32197);
                var2.method1742(0.0F, -32197);
                var2.method1742(1.0F, -32197);
                var2.method1742(0.0F, -32197);
                var2.method1742(-1.0F, -32197);
                var2.method1742(1.0F, -32197);
                var2.method1742(0.0F, -32197);
                var2.method1742(0.0F, -32197);
                var2.method1742(0.0F, -32197);
            } else {
                var2.method1741(-1526311408, -1.0F);
                var2.method1741(-1526311408, -1.0F);
                var2.method1741(-1526311408, 0.0F);
                var2.method1741(-1526311408, 0.0F);
                var2.method1741(-1526311408, 1.0F);
                var2.method1741(-1526311408, 1.0F);
                var2.method1741(-1526311408, -1.0F);
                var2.method1741(-1526311408, 0.0F);
                var2.method1741(-1526311408, 1.0F);
                var2.method1741(-1526311408, 1.0F);
                var2.method1741(-1526311408, 1.0F);
                var2.method1741(-1526311408, 1.0F);
                var2.method1741(-1526311408, 0.0F);
                var2.method1741(-1526311408, 1.0F);
                var2.method1741(-1526311408, 0.0F);
                var2.method1741(-1526311408, -1.0F);
                var2.method1741(-1526311408, 1.0F);
                var2.method1741(-1526311408, 0.0F);
                var2.method1741(-1526311408, 0.0F);
                var2.method1741(-1526311408, 0.0F);
            }
            this.field1915 = this.method903(var2.field9154, var2.field9146, 20, false, (byte) 46);
            this.field1855 = new class186(this.field1915, 5126, 3, 0);
            this.field1827 = new class186(this.field1915, 5126, 2, 12);
            this.field1775.method3954(-109, this);
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 1262)
    public final void method403(Canvas arg0, int arg1, int arg2) {
        ++field1696;
        if (this.field1633 == arg0) {
            throw new RuntimeException();
        } else if (!this.field1635.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field1661.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field1635.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldga;Z)Loia;", line = 1300)
    public final class88 method484(class204 arg0, boolean arg1) {
        ++field1686;
        int[] var3 = new int[arg0.field2664 * arg0.field2657];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2660 != null) {
            for (int var6 = 0; var6 < arg0.field2664; ++var6) {
                for (int var7 = 0; ~arg0.field2657 < ~var7; ++var7) {
                    var3[var5++] = class325.method2116(arg0.field2660[var4] << 24, arg0.field2656[class286.method1877(255, arg0.field2661[var4])]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field2664 > var8; ++var8) {
                for (int var10 = 0; ~arg0.field2657 < ~var10; ++var10) {
                    int var11 = arg0.field2656[arg0.field2661[var4++] & 255];
                    var3[var5++] = var11 == 0 ? 0 : class325.method2116(var11, -16777216);
                }
            }
        }
        class88 var9 = this.method426(arg0.field2657, arg0.field2664, var3, -1, arg0.field2657, 0);
        var9.method655(arg0.field2662, arg0.field2659, arg0.field2658, arg0.field2663);
        return var9;
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "(I)V", line = 1364)
    public final void method416(int arg0) {
        ++field1697;
        this.method940(true);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 1372)
    public final void method385(Canvas arg0, int arg1, int arg2) {
        ++field1592;
        long var4 = 0L;
        if (arg0 != null && this.field1633 != arg0) {
            if (this.field1635.containsKey(arg0)) {
                Long var6 = (Long) this.field1635.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field1688;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field1661.surfaceResized(var4);
            if (this.field1758 == arg0) {
                this.method917((byte) -22);
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(IIIIII)V", line = 1410)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1601;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method938(false);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method914(1, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1867) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field1867) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "()I", line = 1444)
    public final int method404() {
        ++field1655;
        return 4;
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "(B)V", line = 1453)
    private final void method906(byte arg0) {
        ++field1598;
        this.field1846 = (float) (-this.field1831 + this.field1877) - this.field1893;
        this.field1929 = -((float) this.field1840 * this.field1825) + this.field1846;
        if (this.field1929 < (float) this.field1907) {
            this.field1929 = (float) this.field1907;
        }
        if (arg0 < -108) {
            OpenGL.glFogf(2915, this.field1929);
            OpenGL.glFogf(2916, this.field1846);
            class704.field9806[1] = (float) class286.method1877(this.field1854, 65280) / 65280.0F;
            class704.field9806[0] = (float) class286.method1877(16711680, this.field1854) / 1.671168E7F;
            class704.field9806[2] = (float) class286.method1877(255, this.field1854) / 255.0F;
            OpenGL.glFogfv(2918, class704.field9806, 0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "(B)V", line = 1474)
    private final void method907(byte arg0) {
        ++field1645;
        int var2 = 125 % ((arg0 - 20) / 53);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field1887, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIII)V", line = 1487)
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field1715;
        this.method378(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "(I)I", line = 1499)
    private final int method908(int arg0) {
        ++field1673;
        this.field1841 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field1925 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field1841.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field1841.indexOf("brian paul") != 0 || this.field1841.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        int var3 = 32 % ((58 - arg0) / 54);
        String var4 = OpenGL.glGetString(7938);
        String[] var5 = class719.method4040(11027, ' ', var4.replace('.', ' '));
        if (~var5.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var6 = class325.method2121(var5[0], -23213);
                int var7 = class325.method2121(var5[1], -23213);
                this.field1839 = var6 * 10 + var7;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        }
        if (this.field1839 < 12) {
            var2 |= 2;
        }
        if (!this.field1661.method3500("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field1661.method3500("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var8 = new int[1];
        OpenGL.glGetIntegerv(34018, var8, 0);
        this.field1861 = var8[0];
        OpenGL.glGetIntegerv(34929, var8, 0);
        this.field1881 = var8[0];
        OpenGL.glGetIntegerv(34930, var8, 0);
        this.field1864 = var8[0];
        if (~this.field1861 > -3 || this.field1881 < 2 || ~this.field1864 > -3) {
            var2 |= 16;
        }
        this.field1865 = Stream.method3662();
        this.field1888 = this.field1661.arePbuffersAvailable();
        this.field1882 = this.field1661.method3500("GL_ARB_vertex_buffer_object");
        this.field1867 = this.field1661.method3500("GL_ARB_multisample");
        this.field1921 = this.field1661.method3500("GL_ARB_vertex_program");
        this.field1661.method3500("GL_ARB_fragment_program");
        this.field1875 = this.field1661.method3500("GL_ARB_vertex_shader");
        this.field1914 = this.field1661.method3500("GL_ARB_fragment_shader");
        this.field1842 = this.field1661.method3500("GL_EXT_texture3D");
        this.field1906 = this.field1661.method3500("GL_ARB_texture_rectangle");
        this.field1886 = this.field1661.method3500("GL_ARB_texture_cube_map");
        this.field1917 = this.field1661.method3500("GL_ARB_texture_float");
        this.field1869 = false;
        this.field1858 = this.field1661.method3500("GL_EXT_framebuffer_object");
        this.field1874 = this.field1661.method3500("GL_EXT_framebuffer_blit");
        this.field1909 = this.field1661.method3500("GL_EXT_framebuffer_multisample");
        this.field1898 = this.field1874 & this.field1909;
        OpenGL.glGetFloatv(2834, class704.field9806, 0);
        this.field1918 = class704.field9806[1];
        this.field1852 = class704.field9806[0];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 1583)
    public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1720;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            class397 var13 = (class397) arg6;
            class364 var14 = var13.field5597;
            this.method875(2);
            this.method926(var13.field5597, 107);
            this.method914(1, arg5);
            this.method946(false, 7681, 8448);
            this.method883((byte) 34, 0, 768, 34167);
            float var15 = var14.field5154 / (float) var14.field5158;
            float var16 = var14.field5152 / (float) var14.field5153;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            float var20 = var18 * var19;
            int var21 = arg11 % (arg10 - -arg9);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var22 = var17 * var19;
            float var23 = (float) arg9 * var22;
            float var24 = (float) arg9 * var20;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~var21 < ~arg9) {
                var25 = (float) (-var21 + arg10 + arg9) * var22;
                var26 = (float) (arg9 - var21 + arg10) * var20;
            } else {
                var27 = (float) (-var21 + arg9) * var22;
                var28 = (float) (-var21 + arg9) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var22;
            float var32 = (float) arg10 * var20;
            while (true) {
                if (arg0 >= arg2) {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var29) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var30 += var28 + var32;
                var29 += var27 + var31;
                OpenGL.glEnd();
                var28 = var24;
                var27 = var23;
            }
            this.method883((byte) 34, 0, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "(I)V", line = 1705)
    private final void method909(int arg0) {
        if (this.field1862 && this.field1840 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 20817) {
            this.field1813 = 91;
        }
        ++field1667;
    }

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "()Lcf;", line = 1720)
    public final class603 method451() {
        ++field1624;
        int var1 = -1;
        if (~this.field1841.indexOf("nvidia") == 0) {
            if (~this.field1841.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (~this.field1841.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class603(var1, "OpenGL", this.field1839, this.field1925, 0L);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lqm;[Ldga;Z)Lda;", line = 1741)
    public final class59 method459(class143 arg0, class204[] arg1, boolean arg2) {
        ++field1718;
        return new class624(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "(I)V", line = 1751)
    public final void method910(int arg0) {
        if (~this.field1820 != arg0) {
            this.method934((byte) 12);
            this.method885(true, (byte) 95);
            this.method879(true, arg0 ^ 52);
            this.method881((byte) 87, true);
            this.method914(arg0 ^ -18, 1);
            this.field1820 = 16;
        }
        ++field1776;
    }

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "()Lnga;", line = 1769)
    public final class513 method436() {
        ++field1763;
        return this.field1816;
    }

    @OriginalMember(owner = "client!eea", name = "za", descriptor = "(IIIII)V", line = 1777)
    public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field1754;
        if (arg0 + arg2 >= this.field1894 && this.field1870 >= -arg2 + arg0 && ~(arg1 - -arg2) <= ~this.field1889 && ~(arg1 - arg2) >= ~this.field1830) {
            this.method938(false);
            this.method914(1, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field1852) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field1918 >= (float) var8) {
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
                if (var9 <= 64) {
                    var9 = 64;
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class42.method282(-1350259935, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class444.field6314[var11] * (float) arg2 + var6, class444.field6317[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(ILvv;)V", line = 1852)
    public final void method911(int arg0, class324 arg1) {
        ++field1741;
        if (this.field1801 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field1801 <= -1) {
                this.field1795[this.field1801].method1751(30226);
            }
            this.field1797 = this.field1795[++this.field1801] = arg1;
            this.field1797.method1752(true);
            if (arg0 != -30670) {
                this.field1862 = false;
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 1872)
    public final class278 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1732;
        return new class437(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "(I)V", line = 1880)
    public final void method912(int arg0) {
        if (this.field1857 != 0) {
            this.field1820 &= -32;
            this.field1857 = 0;
        }
        if (arg0 == 6) {
            ++field1629;
        }
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(IIIIII)Lmf;", line = 1901)
    public final class418 method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1637;
        return this.field1886 ? new class563(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "(IIIIIII)I", line = 1909)
    public final int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1647;
        float var8 = (float) arg2 * this.field1816.field638 + (float) arg0 * this.field1816.field661 + (float) arg1 * this.field1816.field656 + this.field1816.field632;
        float var9 = (float) arg5 * this.field1816.field638 + (float) arg3 * this.field1816.field661 + (float) arg4 * this.field1816.field656 + this.field1816.field632;
        int var10 = 0;
        if ((float) this.field1907 > var8 && (float) this.field1907 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field1877 && var9 > (float) this.field1877) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field1816.field643 + (float) arg0 * this.field1816.field628 + (float) arg1 * this.field1816.field664 + this.field1816.field665) * (float) this.field1910 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field1816.field643 + (float) arg3 * this.field1816.field628 + (float) arg4 * this.field1816.field664 + this.field1816.field665) * (float) this.field1910 / (float) arg6);
        if (this.field1891 > (float) var11 && this.field1891 > (float) var12) {
            var10 |= 1;
        } else if ((float) var11 > this.field1843 && (float) var12 > this.field1843) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field1816.field647 + (float) arg0 * this.field1816.field626 + (float) arg1 * this.field1816.field649 + this.field1816.field655) * (float) this.field1844 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field1816.field647 + (float) arg3 * this.field1816.field626 + (float) arg4 * this.field1816.field649 + this.field1816.field655) * (float) this.field1844 / (float) arg6);
        if ((float) var13 < this.field1832 && this.field1832 > (float) var14) {
            var10 |= 4;
        } else if ((float) var13 > this.field1848 && (float) var14 > this.field1848) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lie;IIII)Lka;", line = 1952)
    public final class471 method397(class6 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1590;
        return new class428(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lvv;B)V", line = 1962)
    public final void method913(class324 arg0, byte arg1) {
        ++field1730;
        if (arg1 <= -126) {
            if (this.field1874) {
                this.method918(arg0, (byte) 100);
                this.method904(0, arg0);
            } else if (~this.field1796 <= -1 && this.field1794[this.field1796] == arg0) {
                this.field1794[this.field1796--] = null;
                arg0.method1757(true);
                if (~this.field1796 <= -1) {
                    this.field1797 = this.field1802 = this.field1794[this.field1796];
                    this.field1797.method1753(-23783);
                } else {
                    this.field1797 = this.field1802 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "(II)V", line = 1997)
    public final void method914(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method929(122);
        }
        ++field1648;
        if (this.field1819 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 == 128) {
                        var3 = true;
                        var4 = true;
                        var5 = 3;
                    } else {
                        var3 = true;
                        var4 = false;
                        var5 = 0;
                    }
                } else {
                    var5 = 2;
                    var4 = false;
                    var3 = true;
                }
            } else {
                var4 = true;
                var3 = true;
                var5 = 1;
            }
            if (this.field1814 != var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field1814 = var3;
            }
            if (var4 == !this.field1818) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field1818 = var4;
            }
            if (this.field1813 != var5) {
                if (var5 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var5 == -3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (~var5 == -4) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else {
                    OpenGL.glDisable(3042);
                }
                this.field1813 = var5;
            }
            this.field1819 = arg1;
            this.field1820 &= -29;
        }
    }

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "()V", line = 2091)
    public final void method472() {
        ++field1760;
        this.field1779.method4193(false);
    }

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "(I)V", line = 2106)
    public final void method470(int arg0) {
        ++field1766;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V", line = 2114)
    public final synchronized void method915(int arg0, int arg1, int arg2) {
        int var4 = -123 % ((-34 - arg0) / 58);
        ++field1623;
        class756 var5 = new class756(arg2);
        var5.field2546 = (long) arg1;
        this.field1807.method2770((byte) -13, var5);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([IIIIIZ)Loia;", line = 2127)
    public final class88 method421(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1689;
        return new class401(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(BZ)V", line = 2137)
    public final void method916(byte arg0, boolean arg1) {
        if (arg0 <= -22) {
            ++field1628;
            if (this.field1878 != arg1) {
                this.field1878 = arg1;
                this.method900(-21206);
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "(B)V", line = 2157)
    private final void method917(byte arg0) {
        ++field1634;
        if (arg0 == -22) {
            if (this.field1758 == null) {
                this.field1644 = this.field1615 = 0;
            } else {
                Dimension var2 = this.field1758.getSize();
                this.field1615 = var2.height;
                this.field1644 = var2.width;
            }
            if (this.field1802 == null) {
                this.field1658 = this.field1615;
                this.field1765 = this.field1644;
                this.method892(arg0 ^ 9393);
            }
            this.method912(6);
            this.method424();
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIZ)Loia;", line = 2188)
    public final class88 method380(int arg0, int arg1, boolean arg2) {
        ++field1612;
        return new class401(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "()V", line = 2197)
    public final void method412() {
        ++field1632;
        if (!this.field1858) {
            if (!this.field1888) {
                throw new RuntimeException("");
            }
            this.field1800.method659(0, 0, this.field1765, this.field1658, 0, 0);
            this.field1661.setSurface(this.field1574);
        } else {
            if (this.field1802 != this.field1799) {
                throw new RuntimeException();
            }
            this.field1799.method1761(1, 0);
            this.field1799.method1761(1, 8);
            this.method913(this.field1799, (byte) -128);
        }
        this.field1765 = this.field1644;
        this.field1800 = null;
        this.field1658 = this.field1615;
        this.method912(6);
        this.method892(-9381);
        this.method424();
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(Lvv;B)V", line = 2230)
    public final void method918(class324 arg0, byte arg1) {
        ++field1717;
        if (this.field1801 >= 0 && this.field1795[this.field1801] == arg0) {
            this.field1795[this.field1801--] = null;
            arg0.method1751(30226);
            int var3 = 17 / ((-77 - arg1) / 35);
            if (~this.field1801 > -1) {
                this.field1797 = null;
            } else {
                this.field1797 = this.field1795[this.field1801];
                this.field1797.method1752(true);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIILsn;)V", line = 2254)
    public final void method919(int arg0, int arg1, int arg2, int arg3, class630 arg4) {
        ++field1684;
        int var6 = arg4.method720(true);
        int var7 = arg1 * this.method886(4318, var6);
        this.method894(34963, arg4);
        int var8 = 12 % ((33 - arg0) / 48);
        OpenGL.glDrawElements(arg2, arg3, var6, (long) var7 + arg4.method722((byte) -27));
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(I)V", line = 2270)
    public final void method402(int arg0) {
        ++field1603;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjaclib/memory/Buffer;IZI)Lqea;", line = 2281)
    public final class126 method920(int arg0, Buffer arg1, int arg2, boolean arg3, int arg4) {
        ++field1595;
        if (!this.field1882 || arg3 && !this.field1863) {
            return arg2 != 5890 ? null : new class475(this, arg0, arg1);
        } else {
            return new class193(this, arg0, arg1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "(II)V", line = 2300)
    public final void method455(int arg0, int arg1) {
        if (this.field1907 != arg0 || ~this.field1877 != ~arg1) {
            this.field1877 = arg1;
            this.field1907 = arg0;
            this.method902(121);
            this.method906((byte) -120);
            if (~this.field1857 != -4) {
                if (this.field1857 == 2) {
                    this.method907((byte) -56);
                }
            } else {
                this.method887((byte) -122);
            }
        }
        ++field1753;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lqea;Z)V", line = 2326)
    public final void method921(class126 arg0, boolean arg1) {
        if (arg1) {
            this.field1905 = null;
        }
        if (this.field1916 != arg0) {
            if (this.field1882) {
                OpenGL.glBindBufferARB(34962, arg0.method852(112));
            }
            this.field1916 = arg0;
        }
        ++field1767;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(Z)V", line = 2351)
    public final void method449(boolean arg0) {
        ++field1693;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(IIIID)V", line = 2360)
    public final void method493(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field1728;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)Ldw;", line = 2367)
    public final class717 method415(int arg0, int arg1) {
        ++field1738;
        return null;
    }

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "(II)V", line = 2375)
    public final void method922(int arg0, int arg1) {
        this.method925(true, (byte) -100, arg1);
        ++field1660;
        int var3 = 127 / ((21 - arg0) / 53);
    }

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "(B)V", line = 2390)
    private final void method923(byte arg0) {
        if (~this.field1857 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field1765 > 0 && ~this.field1658 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field1765, (double) this.field1658, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field1820 &= -25;
            this.field1857 = 1;
        }
        ++field1685;
        if (arg0 < 36) {
            this.method952(0.07154078F, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!eea", name = "M", descriptor = "()I", line = 2418)
    public final int method407() {
        ++field1772;
        int var1 = this.field1936;
        this.field1936 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IFFFF)V", line = 2432)
    public final void method924(int arg0, float arg1, float arg2, float arg3, float arg4) {
        ++field1710;
        class704.field9806[1] = arg1;
        class704.field9806[0] = arg2;
        class704.field9806[2] = arg4;
        class704.field9806[3] = arg3;
        if (arg0 < 38) {
            this.field1790 = -90;
        }
        OpenGL.glTexEnvfv(8960, 8705, class704.field9806, 0);
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(II)I", line = 2449)
    public final int method466(int arg0, int arg1) {
        ++field1610;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZBI)V", line = 2460)
    public final void method925(boolean arg0, byte arg1, int arg2) {
        ++field1699;
        int var4 = 89 / ((arg1 - -16) / 61);
        this.method941(arg2, true, arg0, (byte) -122);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lta;I)V", line = 2476)
    public final void method926(class210 arg0, int arg1) {
        if (arg1 <= 34) {
            this.field1881 = -26;
        }
        ++field1676;
        class210 var3 = this.field1847[this.field1931];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 != null) {
                    if (~arg0.field2781 != ~var3.field2781) {
                        OpenGL.glDisable(var3.field2781);
                        OpenGL.glEnable(arg0.field2781);
                    }
                } else {
                    OpenGL.glEnable(arg0.field2781);
                }
                OpenGL.glBindTexture(arg0.field2781, arg0.method1291(-32626));
            } else {
                OpenGL.glDisable(var3.field2781);
            }
            this.field1847[this.field1931] = arg0;
        }
        this.field1820 &= -2;
    }

    @OriginalMember(owner = "client!eea", name = "ZA", descriptor = "(IFFFFF)V", line = 2515)
    public final void method390(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field1713;
        boolean var7 = ~this.field1933 != ~arg0;
        if (var7 || this.field1892 != arg1 || this.field1920 != arg2) {
            this.field1920 = arg2;
            this.field1933 = arg0;
            this.field1892 = arg1;
            if (var7) {
                this.field1895 = (float) (65280 & this.field1933) / 65280.0F;
                this.field1851 = (float) (this.field1933 & 255) / 255.0F;
                this.field1919 = (float) (this.field1933 & 16711680) / 1.671168E7F;
                this.method905(7);
            }
            this.method945(96);
        }
        if (this.field1835[0] != arg3 || this.field1835[1] != arg4 || this.field1835[2] != arg5) {
            this.field1835[0] = arg3;
            this.field1835[1] = arg4;
            this.field1835[2] = arg5;
            this.field1868[2] = -arg5;
            this.field1868[1] = -arg4;
            this.field1868[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field1845[0] = arg3 * var8;
            this.field1845[1] = arg4 * var8;
            this.field1845[2] = arg5 * var8;
            this.field1829[1] = -this.field1845[1];
            this.field1829[2] = -this.field1845[2];
            this.field1829[0] = -this.field1845[0];
            this.method947(false);
            this.field1856 = (int) (arg5 * 256.0F / arg4);
            this.field1879 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(II)Lgba;", line = 2566)
    public final class666 method473(int arg0, int arg1) {
        ++field1666;
        return null;
    }

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "(B)V", line = 2575)
    private final void method927(byte arg0) {
        if (arg0 < 54) {
            this.field1790 = -125;
        }
        ++field1575;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field1822.method354(49), 0);
        if (this.field1872) {
            this.field1780.field5790.method3598((byte) -66);
        }
        this.method947(false);
        this.method942(-118);
    }

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "(B)V", line = 2592)
    public final void method928(byte arg0) {
        OpenGL.glPushMatrix();
        ++field1607;
        if (arg0 > -108) {
            this.field1857 = 15;
        }
    }

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "(I)Lku;", line = 2603)
    public final class375 method929(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field1755;
            return this.field1834 != null ? this.field1834.method2063((byte) -79) : null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "X", descriptor = "(I)V", line = 2614)
    public final void method457(int arg0) {
        ++field1652;
        this.field1786 = 0;
        while (arg0 > 1) {
            ++this.field1786;
            arg0 >>= 1;
        }
        this.field1792 = 1 << this.field1786;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2631)
    public final void method450(Canvas arg0) {
        ++field1620;
        this.field1758 = null;
        this.field1574 = 0L;
        if (arg0 != null && this.field1633 != arg0) {
            if (this.field1635.containsKey(arg0)) {
                Long var2 = (Long) this.field1635.get(arg0);
                this.field1574 = var2;
                this.field1758 = arg0;
            }
        } else {
            this.field1574 = this.field1688;
            this.field1758 = this.field1633;
        }
        if (this.field1758 != null && this.field1574 != 0L) {
            this.field1661.setSurface(this.field1574);
            this.method917((byte) -22);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "(Z)V", line = 2662)
    public final void method490(boolean arg0) {
        this.field1837 = arg0;
        ++field1694;
        this.method889((byte) 83);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(JI)V", line = 2674)
    public final synchronized void method930(long arg0, int arg1) {
        ++field1745;
        if (arg1 == -1) {
            class189 var4 = new class189();
            var4.field2546 = arg0;
            this.field1812.method2770((byte) -13, var4);
        }
    }

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "(ILaa;II)V", line = 2688)
    public final void method447(int arg0, class486 arg1, int arg2, int arg3) {
        ++field1671;
        class397 var5 = (class397) arg1;
        class364 var6 = var5.field5597;
        this.method875(2);
        this.method926(var5.field5597, 111);
        this.method914(1, 1);
        this.method946(false, 7681, 8448);
        this.method883((byte) 34, 0, 768, 34167);
        float var7 = var6.field5154 / (float) var6.field5158;
        float var8 = var6.field5152 / (float) var6.field5153;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1894) * var7, (float) (this.field1889 - arg3) * var8);
        OpenGL.glVertex2i(this.field1894, this.field1889);
        OpenGL.glTexCoord2f((float) (this.field1894 - arg2) * var7, (float) (this.field1830 - arg3) * var8);
        OpenGL.glVertex2i(this.field1894, this.field1830);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1870) * var7, (float) (this.field1830 - arg3) * var8);
        OpenGL.glVertex2i(this.field1870, this.field1830);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1870) * var7, (float) (-arg3 + this.field1889) * var8);
        OpenGL.glVertex2i(this.field1870, this.field1889);
        OpenGL.glEnd();
        this.method883((byte) 34, 0, 768, 5890);
    }

    @OriginalMember(owner = "client!eea", name = "da", descriptor = "(III[I)V", line = 2724)
    public final void method423(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1705;
        float var5 = (float) arg2 * this.field1816.field638 + (float) arg0 * this.field1816.field661 + (float) arg1 * this.field1816.field656 + this.field1816.field632;
        if (!((float) this.field1907 > var5) && !(var5 > (float) this.field1877)) {
            int var6 = (int) (((float) arg2 * this.field1816.field643 + (float) arg0 * this.field1816.field628 + (float) arg1 * this.field1816.field664 + this.field1816.field665) * (float) this.field1910 / var5);
            int var7 = (int) (((float) arg2 * this.field1816.field647 + (float) arg0 * this.field1816.field626 + (float) arg1 * this.field1816.field649 + this.field1816.field655) * (float) this.field1844 / var5);
            if (this.field1891 <= (float) var6 && (float) var6 <= this.field1843 && this.field1832 <= (float) var7 && this.field1848 >= (float) var7) {
                arg3[1] = (int) ((float) var7 + -this.field1832);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field1891);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "(B)V", line = 2754)
    private final void method931(byte arg0) {
        this.field1843 = (float) (this.field1870 - this.field1884);
        ++field1698;
        this.field1891 = (float) (-this.field1884 + this.field1894);
        if (arg0 >= 100) {
            this.field1848 = (float) (-this.field1901 + this.field1830);
            this.field1832 = (float) (-this.field1901 + this.field1889);
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(III)V", line = 2768)
    public final synchronized void method932(int arg0, int arg1, int arg2) {
        if (arg1 != -188) {
            this.field1872 = false;
        }
        ++field1573;
        class756 var4 = new class756(arg0);
        var4.field2546 = (long) arg2;
        this.field1808.method2770((byte) -13, var4);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldw;Lgba;)Lgd;", line = 2785)
    public final class339 method467(class717 arg0, class666 arg1) {
        ++field1611;
        return null;
    }

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "()Lnga;", line = 2793)
    public final class513 method439() {
        ++field1739;
        return this.field1784;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(IB)V", line = 2801)
    public final void method933(int arg0, byte arg1) {
        class704.field9806[1] = (float) class286.method1877(65280, arg0) / 65280.0F;
        ++field1747;
        class704.field9806[0] = (float) class286.method1877(arg0, 16711680) / 1.671168E7F;
        if (arg1 != 28) {
            this.field1824 = null;
        }
        class704.field9806[3] = (float) (arg0 >>> 24) / 255.0F;
        class704.field9806[2] = (float) class286.method1877(arg0, 255) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class704.field9806, 0);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldm;I)V", line = 2816)
    public final void method379(class50 arg0, int arg1) {
        ++field1675;
        this.field1775.method3956(arg0, (byte) 120, arg1, this);
    }

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "(B)V", line = 2826)
    private final void method934(byte arg0) {
        if (~this.field1857 != -4) {
            this.field1857 = 3;
            this.method887((byte) -100);
            this.method927((byte) 76);
            this.field1820 &= -8;
        }
        if (arg0 != 12) {
            this.method482(-101, -107, -123, -103, -62, -68, -117, 81, 16, -42, -95, -53, 98);
        }
        ++field1643;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lvp;Lvp;Lvp;BLvp;)V", line = 2848)
    public final void method935(class186 arg0, class186 arg1, class186 arg2, byte arg3, class186 arg4) {
        if (arg1 != null) {
            this.method921(arg1.field2509, false);
            OpenGL.glVertexPointer(arg1.field2508, arg1.field2507, this.field1916.method850(30), this.field1916.method853((byte) 42) - -((long) arg1.field2505));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field1749;
        if (arg3 <= 88) {
            this.field1852 = -0.87083054F;
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method921(arg0.field2509, false);
            OpenGL.glNormalPointer(arg0.field2507, this.field1916.method850(-125), this.field1916.method853((byte) 42) + (long) arg0.field2505);
            OpenGL.glEnableClientState(32885);
        }
        if (arg2 != null) {
            this.method921(arg2.field2509, false);
            OpenGL.glColorPointer(arg2.field2508, arg2.field2507, this.field1916.method850(17), this.field1916.method853((byte) 42) + (long) arg2.field2505);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg4 != null) {
            this.method921(arg4.field2509, false);
            OpenGL.glTexCoordPointer(arg4.field2508, arg4.field2507, this.field1916.method850(10), this.field1916.method853((byte) 42) + (long) arg4.field2505);
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "(II)I", line = 2895)
    public final int method936(int arg0, int arg1) {
        ++field1580;
        if (arg1 != 7681) {
            return -66;
        } else if (arg0 == 1) {
            return 7681;
        } else if (~arg0 == -1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else if (arg0 == 3) {
            return 260;
        } else if (arg0 == 4) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 2925)
    public class131(Canvas arg0, class149 arg1, int arg2) {
        super(arg1);
        new class711();
        new class188(16);
        this.field1804 = new class464();
        this.field1807 = new class464();
        this.field1808 = new class464();
        this.field1809 = new class464();
        this.field1810 = new class464();
        this.field1811 = new class464();
        this.field1812 = new class464();
        this.field1816 = new class55();
        this.field1822 = new class55();
        this.field1823 = new class55();
        this.field1835 = new float[4];
        this.field1829 = new float[4];
        this.field1851 = 1.0F;
        this.field1831 = 0;
        this.field1868 = new float[4];
        this.field1870 = 0;
        this.field1852 = -1.0F;
        this.field1840 = -1;
        this.field1892 = -1.0F;
        this.field1845 = new float[4];
        this.field1889 = 0;
        this.field1830 = 0;
        this.field1887 = new float[16];
        this.field1897 = 8448;
        this.field1837 = true;
        this.field1876 = 0;
        this.field1900 = 3584.0F;
        this.field1825 = 1.0F;
        this.field1833 = 3584.0F;
        this.field1877 = 3584;
        this.field1884 = 0;
        this.field1904 = 8448;
        this.field1872 = false;
        this.field1913 = 1.0F;
        this.field1905 = new class465[class103.field1232];
        this.field1893 = 0.0F;
        this.field1907 = 50;
        this.field1919 = 1.0F;
        this.field1918 = -1.0F;
        this.field1895 = 1.0F;
        this.field1922 = -1;
        this.field1844 = 512;
        this.field1901 = 0;
        this.field1854 = -1;
        this.field1920 = -1.0F;
        this.field1883 = -1;
        this.field1894 = 0;
        this.field1880 = 0;
        this.field1910 = 512;
        this.field1928 = 0;
        this.field1933 = -1;
        this.field1923 = new class267(8192);
        this.field1934 = new int[1];
        this.field1937 = new int[1];
        this.field1938 = new byte[16384];
        this.field1939 = new int[1];
        this.field1758 = this.field1633 = arg0;
        this.field1782 = arg2;
        if (!class608.method3425("jaclib", true)) {
            throw new RuntimeException("");
        } else if (!class608.method3425("jaggl", true)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field1661 = new OpenGL();
                this.field1574 = this.field1688 = this.field1661.init(arg0, 8, 8, 8, 24, 0, this.field1782);
                if (this.field1688 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method895(54);
                    int var4 = this.method908(115);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field1849 = this.field1865 ? 33639 : 5121;
                        if (this.field1925.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class719.method4040(11027, ' ', this.field1925.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class213.method1310(var10.substring(1, 3), -17633)) {
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
                                            if (var10.length() >= 4 && class213.method1310(var10.substring(0, 4), -17633)) {
                                                var5 = class325.method2121(var10.substring(0, 4), -23213);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field1917 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field1842 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field1882 = false;
                                }
                            }
                            this.field1906 &= this.field1661.method3500("GL_ARB_half_float_pixel");
                            this.field1853 = true;
                            this.field1863 = this.field1882;
                        }
                        if (this.field1841.indexOf("intel") != -1) {
                            this.field1858 = false;
                        }
                        this.field1826 = !this.field1841.equals("s3 graphics");
                        if (this.field1882) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class621.method3486(-97, false, true);
                        this.field1787 = true;
                        this.field1778 = new class424(this, super.field715);
                        this.method955(-1417);
                        this.field1789 = new class561(this);
                        this.field1779 = new class753(this);
                        if (this.field1779.method4189(49)) {
                            this.field1777 = new class116(this);
                            if (!this.field1777.method809((byte) -86)) {
                                this.field1777.method815(-16008);
                                this.field1777 = null;
                            }
                        }
                        this.field1780 = new class409(this);
                        this.method953(true);
                        this.method917((byte) -22);
                        this.method432();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method389();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "(II)V", line = 3070)
    public final synchronized void method937(int arg0, int arg1) {
        ++field1609;
        if (arg1 != 905) {
            this.method488(122, -55, 116, -89, -90, -18, (byte[]) null, 96, -75);
        }
        class189 var3 = new class189();
        var3.field2546 = (long) arg0;
        this.field1811.method2770((byte) -13, var3);
    }

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "()V", line = 3084)
    public final void method481() {
        OpenGL.glFinish();
        ++field1665;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(Z)V", line = 3093)
    private final void method938(boolean arg0) {
        ++field1621;
        if (this.field1820 != 1) {
            this.method923((byte) 42);
            this.method885(false, (byte) 97);
            this.method898(false, -25994);
            this.method879(false, 120);
            this.method881((byte) 87, false);
            this.method926((class210) null, 46);
            this.method922(90, -2);
            this.method891(1, (byte) 17);
            this.field1820 = 1;
        }
        if (arg0) {
            this.field1911 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "(I)V", line = 3118)
    public final void method939(int arg0) {
        if (this.field1820 != 8) {
            this.method897((byte) -27);
            this.method885(true, (byte) 114);
            this.method879(true, arg0 ^ 113);
            this.method881((byte) 87, true);
            this.method914(1, 1);
            this.field1820 = 8;
        }
        if (arg0 == 32) {
            ++field1582;
        }
    }

    @OriginalMember(owner = "client!eea", name = "ra", descriptor = "(IIII)V", line = 3138)
    public final void method422(int arg0, int arg1, int arg2, int arg3) {
        this.field1930 = true;
        ++field1627;
        this.field1922 = arg1;
        this.field1928 = arg3;
        this.field1903 = arg0;
        this.field1883 = arg2;
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(Z)V", line = 3152)
    private final void method940(boolean arg0) {
        ++field1680;
        this.field1661.method3501();
        if (!arg0) {
            this.field1900 = 0.1811559F;
        }
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "()V", line = 3168)
    public final void method377() {
        ++field1653;
        if (this.field1777 != null && this.field1777.method3391(-3)) {
            this.field1779.method4190(31218, this.field1777);
            this.field1778.method2592(true);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V", line = 3184)
    public final void method373(boolean arg0) {
        ++field1723;
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "()Z", line = 3192)
    public final boolean method392() {
        ++field1631;
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)V", line = 3208)
    public final void method435(int arg0, int arg1) throws class76 {
        try {
            this.field1661.swapBuffers();
        } catch (Exception var3) {
        }
        ++field1690;
    }

    @OriginalMember(owner = "client!eea", name = "HA", descriptor = "(IIII[I)V", line = 3226)
    public final void method480(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field1670;
        float var6 = (float) arg2 * this.field1816.field638 + (float) arg0 * this.field1816.field661 + (float) arg1 * this.field1816.field656 + this.field1816.field632;
        if (!(var6 < (float) this.field1907) && !((float) this.field1877 < var6)) {
            int var7 = (int) (((float) arg2 * this.field1816.field643 + (float) arg0 * this.field1816.field628 + (float) arg1 * this.field1816.field664 + this.field1816.field665) * (float) this.field1910 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field1816.field647 + (float) arg0 * this.field1816.field626 + (float) arg1 * this.field1816.field649 + this.field1816.field655) * (float) this.field1844 / (float) arg3);
            if (this.field1891 <= (float) var7 && (float) var7 <= this.field1843 && this.field1832 <= (float) var8 && this.field1848 >= (float) var8) {
                arg4[0] = (int) ((float) var7 + -this.field1891);
                arg4[1] = (int) ((float) var8 - this.field1832);
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZZB)V", line = 3261)
    public final void method941(int arg0, boolean arg1, boolean arg2, byte arg3) {
        ++field1692;
        if (~this.field1932 != ~arg0 || !this.field1930 != !this.field1872) {
            class615 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field1930 ? 3 : 0;
            if (arg0 < 0) {
                this.method882((byte) -128);
            } else {
                var5 = this.field1778.method2593(arg0, -124);
                class502 var10 = super.field715.method532((byte) 127, arg0);
                if (~var10.field7207 == -1 && var10.field7193 == 0) {
                    this.method882((byte) -106);
                } else {
                    int var11 = !var10.field7208 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method901(0.0F, (float) (this.field1790 % var12 * var10.field7207) / (float) var12, (float) (this.field1790 % var12 * var10.field7193) / (float) var12, 20357);
                }
                var6 = var10.field7189;
                if (!this.field1930) {
                    var9 = var10.field7204;
                    var8 = var10.field7199;
                    var7 = var10.field7195;
                }
            }
            this.field1780.method2531(var7, 1, arg1, arg2, var8, var9);
            if (!this.field1780.method2529(var6, var5, Integer.MAX_VALUE)) {
                this.method926(var5, 71);
                this.method891(var6, (byte) 17);
            }
            this.field1932 = arg0;
            this.field1872 = this.field1930;
        }
        this.field1820 &= -8;
        if (arg3 >= -83) {
            this.method488(47, 122, -67, -106, -90, 50, (byte[]) null, 76, -83);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIIIII)V", line = 3328)
    public final void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1642;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            this.method938(false);
            this.method914(1, arg5);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var13 = var11 * var12;
            int var14 = arg8 % (arg7 - -arg6);
            float var15 = var10 * var12;
            float var16 = (float) arg6 * var15;
            float var17 = (float) arg6 * var13;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (arg6 >= var14) {
                var21 = (float) (-var14 + arg6) * var13;
                var20 = (float) (arg6 - var14) * var15;
            } else {
                var19 = (float) (arg6 - (-arg7 - -var14)) * var13;
                var18 = (float) (arg6 + arg7 + -var14) * var15;
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
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (arg1 >= arg3) {
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
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var23 += var21 + var25;
                var22 += var20 + var24;
                OpenGL.glEnd();
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIII)V", line = 3439)
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
        this.field1779.method4195(arg1, arg2, arg3, arg0, -121);
        ++field1679;
    }

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "()Lnga;", line = 3449)
    public final class513 method427() {
        ++field1586;
        return new class55();
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II[I[I)Laa;", line = 3457)
    public final class486 method489(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field1614;
        return class36.method200(arg0, arg3, arg2, -1, arg1, this);
    }

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "()Z", line = 3465)
    public final boolean method471() {
        ++field1687;
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "(I)V", line = 3473)
    private final void method942(int arg0) {
        ++field1731;
        int var2;
        for (var2 = 0; ~this.field1926 < ~var2; ++var2) {
            class465 var3 = this.field1905[var2];
            class101.field1200[0] = (float) var3.method2772(false);
            int var4 = var2 + 16386;
            class101.field1200[1] = (float) var3.method2774(111);
            class101.field1200[2] = (float) var3.method2773(true);
            class101.field1200[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class101.field1200, 0);
            int var5 = var3.method2778((byte) 94);
            float var6 = var3.method2780(-18277) / 255.0F;
            class101.field1200[0] = var6 * (float) (class286.method1877(var5, 16755531) >> 16);
            class101.field1200[2] = (float) class286.method1877(255, var5) * var6;
            class101.field1200[1] = (float) class286.method1877(var5 >> 8, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class101.field1200, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2777(-1) * var3.method2777(-1)));
            OpenGL.glEnable(var4);
        }
        while (this.field1912 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field1912 = this.field1926;
        if (arg0 >= -19) {
            this.method476();
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "()Z", line = 3518)
    public final boolean method374() {
        ++field1708;
        return this.field1777 != null && (this.field1782 <= 1 || this.field1898);
    }

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "()Z", line = 3526)
    public final boolean method491() {
        ++field1672;
        return this.field1777 != null && this.field1777.method3391(-3);
    }

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "(B)V", line = 3543)
    private final void method943(byte arg0) {
        this.field1887[10] = this.field1828;
        this.field1887[14] = this.field1885;
        ++field1744;
        this.field1833 = (this.field1887[14] - (float) this.field1877) / this.field1887[10];
        if (arg0 != -19) {
            this.field1938 = null;
        }
        this.field1900 = (float) this.field1877;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 3561)
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method938(false);
        ++field1646;
        this.method914(1, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "()V", line = 3580)
    public final void method376() {
        ++field1757;
    }

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "(II)V", line = 3587)
    public final synchronized void method944(int arg0, int arg1) {
        ++field1608;
        class756 var3 = new class756(arg1);
        this.field1809.method2770((byte) -13, var3);
        if (arg0 != 0) {
            this.method382();
        }
    }

    @OriginalMember(owner = "client!eea", name = "aa", descriptor = "(IIIIII)V", line = 3601)
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1616;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method938(false);
        float var10 = (float) arg3 + var8;
        this.method914(1, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1867) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field1867) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!eea", name = "xa", descriptor = "(F)V", line = 3633)
    public final void method406(float arg0) {
        ++field1756;
        if (this.field1866 != arg0) {
            this.field1866 = arg0;
            this.method905(7);
        }
    }

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "(I)V", line = 3651)
    private final void method945(int arg0) {
        ++field1706;
        class704.field9806[3] = 1.0F;
        class704.field9806[1] = this.field1895 * this.field1892;
        class704.field9806[2] = this.field1892 * this.field1851;
        class704.field9806[0] = this.field1919 * this.field1892;
        OpenGL.glLightfv(16384, 4609, class704.field9806, 0);
        class704.field9806[1] = -this.field1920 * this.field1895;
        class704.field9806[0] = -this.field1920 * this.field1919;
        class704.field9806[3] = 1.0F;
        if (arg0 >= 65) {
            class704.field9806[2] = -this.field1920 * this.field1851;
            OpenGL.glLightfv(16385, 4609, class704.field9806, 0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZII)V", line = 3671)
    public final void method946(boolean arg0, int arg1, int arg2) {
        if (~this.field1931 == -1) {
            boolean var4 = false;
            if (this.field1897 != arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var4 = true;
                this.field1897 = arg1;
            }
            if (this.field1904 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field1904 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field1820 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
        if (arg0) {
            this.field1854 = -101;
        }
        ++field1613;
    }

    @OriginalMember(owner = "client!eea", name = "E", descriptor = "()I", line = 3712)
    public final int method465() {
        ++field1722;
        return this.field1805 - -this.field1803 + this.field1806;
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(Z)V", line = 3720)
    public final void method947(boolean arg0) {
        OpenGL.glLightfv(16384, 4611, this.field1845, 0);
        ++field1588;
        if (arg0) {
            this.method905(-10);
        }
        OpenGL.glLightfv(16385, 4611, this.field1829, 0);
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(I)V", line = 3734)
    public final void method408(int arg0) {
        ++field1577;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field1781 = arg0;
            this.field1778.method2592(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eea", name = "KA", descriptor = "(IIII)V", line = 3758)
    public final void method469(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > this.field1658) {
            arg3 = this.field1658;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field1765) {
            arg2 = this.field1765;
        }
        ++field1773;
        if (arg1 < 0) {
            arg1 = 0;
        }
        this.field1870 = arg2;
        this.field1830 = arg3;
        this.field1894 = arg0;
        this.field1889 = arg1;
        OpenGL.glEnable(3089);
        this.method931((byte) 118);
        this.method950(0);
    }

    @OriginalMember(owner = "client!eea", name = "JA", descriptor = "(IIIIII)I", line = 3788)
    public final int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1721;
        int var7 = 0;
        float var8 = (float) arg2 * this.field1816.field638 + (float) arg0 * this.field1816.field661 + (float) arg1 * this.field1816.field656 + this.field1816.field632;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field1816.field638 + (float) arg3 * this.field1816.field661 + (float) arg4 * this.field1816.field656 + this.field1816.field632;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field1907 > var8 && (float) this.field1907 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field1877 && (float) this.field1877 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field1816.field643 + (float) arg0 * this.field1816.field628 + (float) arg1 * this.field1816.field664 + this.field1816.field665) * (float) this.field1910 / var8);
        int var11 = (int) (((float) arg5 * this.field1816.field643 + (float) arg3 * this.field1816.field628 + (float) arg4 * this.field1816.field664 + this.field1816.field665) * (float) this.field1910 / var9);
        if (this.field1891 > (float) var10 && (float) var11 < this.field1891) {
            var7 |= 1;
        } else if ((float) var10 > this.field1843 && (float) var11 > this.field1843) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field1816.field647 + (float) arg0 * this.field1816.field626 + (float) arg1 * this.field1816.field649 + this.field1816.field655) * (float) this.field1844 / var8);
        int var13 = (int) (((float) arg5 * this.field1816.field647 + (float) arg3 * this.field1816.field626 + (float) arg4 * this.field1816.field649 + this.field1816.field655) * (float) this.field1844 / var9);
        if ((float) var12 < this.field1832 && this.field1832 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field1848 && (float) var13 > this.field1848) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([I)V", line = 3842)
    public final void method420(int[] arg0) {
        arg0[1] = this.field1658;
        arg0[0] = this.field1765;
        ++field1587;
    }

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "()Z", line = 3853)
    public final boolean method487() {
        ++field1700;
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "()Z", line = 3863)
    public final boolean method468() {
        ++field1654;
        return this.field1867 && (!this.method491() || this.field1898);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIB)V", line = 3872)
    public final void method948(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glTexEnvi(8960, 34184 - -arg1, arg0);
        ++field1677;
        int var5 = -55 / ((-13 - arg3) / 61);
        OpenGL.glTexEnvi(8960, 34200 - -arg1, arg2);
    }

    @OriginalMember(owner = "client!eea", name = "GA", descriptor = "(I)V", line = 3884)
    public final void method429(int arg0) {
        ++field1748;
        this.method914(1, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "(I)V", line = 3896)
    public static void method949(int arg0) {
        field1733 = null;
        field1630 = null;
        if (arg0 <= -67) {
            field1768 = null;
            field1783 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "(I)V", line = 3912)
    private final void method950(int arg0) {
        if (this.field1894 <= this.field1870 && this.field1889 <= this.field1830) {
            OpenGL.glScissor(this.field1876 - -this.field1894, this.field1880 + this.field1658 + -this.field1830, this.field1870 - this.field1894, -this.field1889 + this.field1830);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field1701;
        if (arg0 != 0) {
            this.method483((class513) null);
        }
    }

    @OriginalMember(owner = "client!eea", name = "H", descriptor = "(III[I)V", line = 3927)
    public final void method446(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1618;
        float var5 = (float) arg2 * this.field1816.field638 + (float) arg0 * this.field1816.field661 + (float) arg1 * this.field1816.field656 + this.field1816.field632;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field1816.field643 + (float) arg0 * this.field1816.field628 + (float) arg1 * this.field1816.field664 + this.field1816.field665) * (float) this.field1910 / var5);
            arg3[0] = (int) ((float) var6 - this.field1891);
            int var7 = (int) (((float) arg2 * this.field1816.field647 + (float) arg0 * this.field1816.field626 + (float) arg1 * this.field1816.field649 + this.field1816.field655) * (float) this.field1844 / var5);
            arg3[1] = (int) ((float) var7 - this.field1832);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lvv;I)V", line = 3949)
    public final void method951(class324 arg0, int arg1) {
        ++field1578;
        if (~this.field1798 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field1798 <= -1) {
                this.field1793[this.field1798].method1754((byte) 30);
            }
            if (arg1 != 1) {
                this.method934((byte) -92);
            }
            this.field1802 = this.field1793[++this.field1798] = arg0;
            this.field1802.method1756(-6521);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(FB)V", line = 3968)
    public final void method952(float arg0, byte arg1) {
        if (this.field1913 != arg0) {
            this.field1913 = arg0;
            if (this.field1857 == 3) {
                this.method887((byte) -126);
            }
        }
        ++field1750;
        if (arg1 > -36) {
            this.field1661 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "DA", descriptor = "(IIII)V", line = 3989)
    public final void method391(int arg0, int arg1, int arg2, int arg3) {
        this.field1844 = arg3;
        this.field1901 = arg1;
        ++field1707;
        this.field1910 = arg2;
        this.field1884 = arg0;
        this.method902(126);
        this.method931((byte) 105);
        if (~this.field1857 != -4) {
            if (~this.field1857 == -3) {
                this.method907((byte) 77);
                return;
            }
        } else {
            this.method887((byte) -125);
        }
    }

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "()V", line = 4011)
    public final void method432() {
        ++field1602;
        if (this.field1826 && ~this.field1765 < -1 && this.field1658 > 0) {
            int var1 = this.field1894;
            int var2 = this.field1870;
            int var3 = this.field1889;
            int var4 = this.field1830;
            this.method424();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method912(6);
            this.method885(false, (byte) 124);
            this.method898(false, -25994);
            this.method879(false, 101);
            this.method881((byte) 87, false);
            this.method926((class210) null, 70);
            this.method922(115, -2);
            this.method891(1, (byte) 17);
            this.method914(1, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field1765, this.field1658, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method469(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "()Z", line = 4055)
    public final boolean method462() {
        ++field1682;
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I[Lwi;)V", line = 4069)
    public final void method372(int arg0, class465[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field1905[var3] = arg1[var3];
        }
        ++field1656;
        this.field1926 = arg0;
        if (~this.field1857 != -2) {
            this.method942(-104);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lmf;Lmf;FLmf;)Lmf;", line = 4089)
    public final class418 method453(class418 arg0, class418 arg1, float arg2, class418 arg3) {
        ++field1719;
        if (arg0 != null && arg1 != null && this.field1886 && this.field1858) {
            class390 var5 = null;
            class318 var6 = (class318) arg0;
            class318 var7 = (class318) arg1;
            class375 var8 = var6.method2063((byte) -79);
            class375 var9 = var7.method2063((byte) -79);
            if (var8 != null && var9 != null) {
                int var10 = var9.field5254 < var8.field5254 ? var8.field5254 : var9.field5254;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class390) {
                    class390 var11 = (class390) arg3;
                    if (~var11.method2456(112) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class390(this, var10);
                }
                if (var5.method2457(arg2, var8, 0, var9)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "(Z)V", line = 4138)
    private final void method953(boolean arg0) {
        this.method922(-54, -2);
        ++field1771;
        for (int var2 = this.field1861 - 1; var2 >= 0; --var2) {
            this.method884(var2, true);
            this.method926((class210) null, 119);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method946(false, 8448, 8448);
        this.method883((byte) 34, 2, 770, 34168);
        this.method882((byte) -124);
        this.field1819 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field1813 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field1818 = true;
        OpenGL.glColorMask(true, true, true, arg0);
        this.field1814 = true;
        this.method885(true, (byte) 124);
        this.method898(true, -25994);
        this.method879(true, 113);
        this.method881((byte) 87, true);
        this.method912(6);
        this.field1661.setSwapInterval(0);
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
        this.field1933 = this.field1854 = -1;
        this.method424();
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lfw;I)V", line = 4207)
    public final void method954(class55 arg0, int arg1) {
        ++field1751;
        if (arg1 <= 42) {
            this.method382();
        }
        OpenGL.glLoadMatrixf(arg0.method354(77), 0);
    }

    @OriginalMember(owner = "client!eea", name = "B", descriptor = "(I)V", line = 4218)
    private final void method955(int arg0) {
        ++field1663;
        this.field1847 = new class210[this.field1861];
        this.field1838 = new class615(this, 3553, 6408, 1, 1);
        if (arg0 != -1417) {
            this.method415(39, 19);
        }
        new class615(this, 3553, 6408, 1, 1);
        new class615(this, 3553, 6408, 1, 1);
        this.field1902 = new class428(this);
        this.field1871 = new class428(this);
        this.field1927 = new class428(this);
        this.field1859 = new class428(this);
        this.field1873 = new class428(this);
        this.field1850 = new class428(this);
        this.field1899 = new class428(this);
        this.field1896 = new class428(this);
        this.field1860 = new class428(this);
        this.field1836 = new class428(this);
        if (this.field1858) {
            this.field1911 = new class269(this);
            new class269(this);
        }
    }

    @OriginalMember(owner = "client!eea", name = "XA", descriptor = "()I", line = 4258)
    public final int method434() {
        ++field1703;
        return this.field1877;
    }

    @OriginalMember(owner = "client!eea", name = "K", descriptor = "([I)V", line = 4270)
    public final void method398(int[] arg0) {
        arg0[0] = this.field1894;
        arg0[3] = this.field1830;
        arg0[1] = this.field1889;
        ++field1691;
        arg0[2] = this.field1870;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(III)V", line = 4285)
    public final void method956(int arg0, int arg1, int arg2) {
        ++field1734;
        this.field1876 = arg0;
        this.field1880 = arg1;
        if (arg2 != 8448) {
            this.method475(-64, -23, -91, 112, -42, 1.5328135F);
        }
        this.method892(-9381);
        this.method950(0);
    }

    @OriginalMember(owner = "client!eea", name = "U", descriptor = "(IIIII)V", line = 4300)
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1659;
        this.method938(false);
        this.method914(1, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lnga;)V", line = 4320)
    public final void method483(class513 arg0) {
        this.field1816.method344(arg0);
        ++field1572;
        this.field1822.method344(this.field1816);
        this.field1822.method361(11);
        this.field1823.method345(this.field1822, (byte) -54);
        if (~this.field1857 != -2) {
            this.method927((byte) 121);
        }
    }

    @OriginalMember(owner = "client!eea", name = "Y", descriptor = "()[I", line = 4338)
    public final int[] method395() {
        ++field1752;
        return new int[] { this.field1884, this.field1901, this.field1910, this.field1844 };
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "(I)V", line = 4353)
    public final void method443(int arg0) {
        ++field1762;
        this.method895(-112);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V", line = 4362)
    public final synchronized void method399(int arg0) {
        ++field1761;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field1807.method2757((byte) 27)) {
            class756 var12 = (class756) this.field1807.method2762((byte) -16);
            class110.field1351[var2++] = (int) var12.field2546;
            this.field1805 -= var12.field10518;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class110.field1351, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class110.field1351, 0);
            var2 = 0;
        }
        while (!this.field1808.method2757((byte) 27)) {
            class756 var11 = (class756) this.field1808.method2762((byte) -16);
            class110.field1351[var2++] = (int) var11.field2546;
            this.field1803 -= var11.field10518;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class110.field1351, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class110.field1351, 0);
            var2 = 0;
        }
        while (!this.field1809.method2757((byte) 27)) {
            class756 var10 = (class756) this.field1809.method2762((byte) -16);
            class110.field1351[var2++] = var10.field10518;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class110.field1351, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class110.field1351, 0);
            var2 = 0;
        }
        while (!this.field1810.method2757((byte) 27)) {
            class756 var9 = (class756) this.field1810.method2762((byte) -16);
            class110.field1351[var2++] = (int) var9.field2546;
            this.field1806 -= var9.field10518;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class110.field1351, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class110.field1351, 0);
            boolean var4 = false;
        }
        while (!this.field1804.method2757((byte) 27)) {
            class756 var8 = (class756) this.field1804.method2762((byte) -16);
            OpenGL.glDeleteLists((int) var8.field2546, var8.field10518);
        }
        while (!this.field1811.method2757((byte) 27)) {
            class189 var7 = this.field1811.method2762((byte) -16);
            OpenGL.glDeleteProgramARB((int) var7.field2546);
        }
        while (!this.field1812.method2757((byte) 27)) {
            class189 var6 = this.field1812.method2762((byte) -16);
            OpenGL.glDeleteObjectARB(var6.field2546);
        }
        while (!this.field1804.method2757((byte) 27)) {
            class756 var5 = (class756) this.field1804.method2762((byte) -16);
            OpenGL.glDeleteLists((int) var5.field2546, var5.field10518);
        }
        this.field1778.method2591(5);
        if (this.method465() > 100663296 && ~class479.method2864((byte) -104) < ~(this.field1821 + 60000L)) {
            System.gc();
            this.field1821 = class479.method2864((byte) -62);
        }
        this.field1790 = var3;
    }

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "()Z", line = 4532)
    public final boolean method463() {
        ++field1593;
        return true;
    }
}
