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

@OriginalClass("client!rv")
public abstract class class111 extends class59 {

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "Lro;")
    private class2 field1529 = new class2();

    @OriginalMember(owner = "client!rv", name = "Wd", descriptor = "Z")
    public boolean field1710 = true;

    @OriginalMember(owner = "client!rv", name = "Zd", descriptor = "Ljaa;")
    public class615 field1713 = new class615();

    @OriginalMember(owner = "client!rv", name = "fe", descriptor = "Ljaa;")
    public class615 field1719 = new class615();

    @OriginalMember(owner = "client!rv", name = "ge", descriptor = "Ljaa;")
    public class615 field1720 = new class615();

    @OriginalMember(owner = "client!rv", name = "he", descriptor = "Ljaa;")
    public class615 field1721 = new class615();

    @OriginalMember(owner = "client!rv", name = "ie", descriptor = "Ljaa;")
    private class615 field1722 = new class615();

    @OriginalMember(owner = "client!rv", name = "je", descriptor = "Ljaa;")
    private class615 field1723 = new class615();

    @OriginalMember(owner = "client!rv", name = "ke", descriptor = "I")
    private int field1724 = 0;

    @OriginalMember(owner = "client!rv", name = "pe", descriptor = "Z")
    private boolean field1729 = false;

    @OriginalMember(owner = "client!rv", name = "qe", descriptor = "I")
    public int field1730 = -1;

    @OriginalMember(owner = "client!rv", name = "we", descriptor = "I")
    public int field1736 = 3584;

    @OriginalMember(owner = "client!rv", name = "Fe", descriptor = "I")
    public int field1745 = 50;

    @OriginalMember(owner = "client!rv", name = "ze", descriptor = "I")
    public int field1739 = 0;

    @OriginalMember(owner = "client!rv", name = "me", descriptor = "I")
    public int field1726 = 0;

    @OriginalMember(owner = "client!rv", name = "ef", descriptor = "Z")
    public boolean field1770 = true;

    @OriginalMember(owner = "client!rv", name = "ve", descriptor = "[F")
    private float[] field1735 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rv", name = "Ue", descriptor = "Z")
    public boolean field1760 = true;

    @OriginalMember(owner = "client!rv", name = "df", descriptor = "F")
    public float field1769 = 3584.0F;

    @OriginalMember(owner = "client!rv", name = "ne", descriptor = "[F")
    private float[] field1727 = new float[16];

    @OriginalMember(owner = "client!rv", name = "ue", descriptor = "Z")
    private boolean field1734 = false;

    @OriginalMember(owner = "client!rv", name = "te", descriptor = "Z")
    private boolean field1733 = false;

    @OriginalMember(owner = "client!rv", name = "Me", descriptor = "I")
    private int field1752 = 1;

    @OriginalMember(owner = "client!rv", name = "Qe", descriptor = "I")
    private int field1756 = -1;

    @OriginalMember(owner = "client!rv", name = "Ce", descriptor = "F")
    public float field1742 = 1.0F;

    @OriginalMember(owner = "client!rv", name = "Se", descriptor = "Z")
    public boolean field1758 = true;

    @OriginalMember(owner = "client!rv", name = "vf", descriptor = "I")
    public int field1786 = -1;

    @OriginalMember(owner = "client!rv", name = "ff", descriptor = "I")
    private int field1771 = 0;

    @OriginalMember(owner = "client!rv", name = "Ke", descriptor = "Z")
    private boolean field1750 = false;

    @OriginalMember(owner = "client!rv", name = "Oe", descriptor = "[F")
    public float[] field1754 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rv", name = "le", descriptor = "I")
    public int field1725 = 128;

    @OriginalMember(owner = "client!rv", name = "zf", descriptor = "[F")
    private float[] field1790 = new float[16];

    @OriginalMember(owner = "client!rv", name = "Re", descriptor = "F")
    public float field1757 = 1.0F;

    @OriginalMember(owner = "client!rv", name = "kf", descriptor = "[Lul;")
    private class573[] field1775 = new class573[10];

    @OriginalMember(owner = "client!rv", name = "pf", descriptor = "I")
    public int field1780 = 0;

    @OriginalMember(owner = "client!rv", name = "gf", descriptor = "I")
    private int field1772 = 0;

    @OriginalMember(owner = "client!rv", name = "Hf", descriptor = "Z")
    public boolean field1798 = true;

    @OriginalMember(owner = "client!rv", name = "Cf", descriptor = "Z")
    private boolean field1793 = false;

    @OriginalMember(owner = "client!rv", name = "Ef", descriptor = "I")
    public int field1795 = 0;

    @OriginalMember(owner = "client!rv", name = "Df", descriptor = "Z")
    public boolean field1794 = false;

    @OriginalMember(owner = "client!rv", name = "of", descriptor = "I")
    public int field1779 = 0;

    @OriginalMember(owner = "client!rv", name = "bf", descriptor = "[F")
    public float[] field1767 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!rv", name = "sf", descriptor = "Z")
    public boolean field1783 = false;

    @OriginalMember(owner = "client!rv", name = "af", descriptor = "Lbca;")
    public class662 field1766 = class367.field5142;

    @OriginalMember(owner = "client!rv", name = "Gf", descriptor = "I")
    public int field1797 = 0;

    @OriginalMember(owner = "client!rv", name = "Pe", descriptor = "[F")
    private float[] field1755 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rv", name = "Bf", descriptor = "I")
    private int field1792 = 0;

    @OriginalMember(owner = "client!rv", name = "oe", descriptor = "I")
    public int field1728 = 3;

    @OriginalMember(owner = "client!rv", name = "Pf", descriptor = "Lcda;")
    public class173 field1806 = class562.field7371;

    @OriginalMember(owner = "client!rv", name = "ye", descriptor = "I")
    public int field1738 = 0;

    @OriginalMember(owner = "client!rv", name = "yf", descriptor = "I")
    public int field1789 = 0;

    @OriginalMember(owner = "client!rv", name = "qf", descriptor = "Z")
    public boolean field1781 = true;

    @OriginalMember(owner = "client!rv", name = "re", descriptor = "F")
    public float field1731 = 3584.0F;

    @OriginalMember(owner = "client!rv", name = "Ze", descriptor = "I")
    public int field1765 = 8;

    @OriginalMember(owner = "client!rv", name = "cf", descriptor = "I")
    public int field1768 = 512;

    @OriginalMember(owner = "client!rv", name = "Wf", descriptor = "I")
    private int field1813 = 16777215;

    @OriginalMember(owner = "client!rv", name = "Mf", descriptor = "Z")
    private boolean field1803 = false;

    @OriginalMember(owner = "client!rv", name = "Vf", descriptor = "[F")
    private float[] field1812 = new float[16];

    @OriginalMember(owner = "client!rv", name = "Af", descriptor = "Z")
    public boolean field1791 = false;

    @OriginalMember(owner = "client!rv", name = "Yf", descriptor = "I")
    public int field1815 = 512;

    @OriginalMember(owner = "client!rv", name = "Zf", descriptor = "F")
    public float field1816 = -1.0F;

    @OriginalMember(owner = "client!rv", name = "mf", descriptor = "F")
    private float field1777 = 1.0F;

    @OriginalMember(owner = "client!rv", name = "Lf", descriptor = "[F")
    private float[] field1802 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rv", name = "Tf", descriptor = "I")
    private int field1810 = -1;

    @OriginalMember(owner = "client!rv", name = "Kf", descriptor = "[F")
    public float[] field1801 = this.field1802;

    @OriginalMember(owner = "client!rv", name = "hf", descriptor = "I")
    private int field1773 = -1;

    @OriginalMember(owner = "client!rv", name = "jf", descriptor = "F")
    public float field1774 = 1.0F;

    @OriginalMember(owner = "client!rv", name = "eg", descriptor = "F")
    public float field1821 = -1.0F;

    @OriginalMember(owner = "client!rv", name = "fg", descriptor = "I")
    public int field1822 = 0;

    @OriginalMember(owner = "client!rv", name = "hg", descriptor = "Z")
    public boolean field1824 = false;

    @OriginalMember(owner = "client!rv", name = "bg", descriptor = "I")
    public int field1818 = 0;

    @OriginalMember(owner = "client!rv", name = "Ff", descriptor = "F")
    public float field1796 = 1.0F;

    @OriginalMember(owner = "client!rv", name = "ag", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1817 = new Stream();

    @OriginalMember(owner = "client!rv", name = "og", descriptor = "Ljaa;")
    private class615 field1831 = new class615();

    @OriginalMember(owner = "client!rv", name = "tb", descriptor = "Ljava/lang/Object;")
    public Object field1577;

    @OriginalMember(owner = "client!rv", name = "xb", descriptor = "Ljava/lang/Object;")
    private Object field1581;

    @OriginalMember(owner = "client!rv", name = "sd", descriptor = "Lwu;")
    public class376 field1680;

    @OriginalMember(owner = "client!rv", name = "ib", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1566;

    @OriginalMember(owner = "client!rv", name = "lb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1569;

    @OriginalMember(owner = "client!rv", name = "nf", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!rv", name = "tc", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client!rv", name = "bb", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!rv", name = "Vc", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!rv", name = "gg", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!rv", name = "mb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field1570;

    @OriginalMember(owner = "client!rv", name = "cg", descriptor = "Lsb;")
    private class294 field1819;

    @OriginalMember(owner = "client!rv", name = "wc", descriptor = "Z")
    public static boolean field1632 = false;

    @OriginalMember(owner = "client!rv", name = "Pd", descriptor = "I")
    public static int field1703 = -50;

    @OriginalMember(owner = "client!rv", name = "hc", descriptor = "Lhda;")
    public static class752 field1617 = new class752(89, 3);

    @OriginalMember(owner = "client!rv", name = "se", descriptor = "F")
    public float field1732;

    @OriginalMember(owner = "client!rv", name = "Ae", descriptor = "F")
    public float field1740;

    @OriginalMember(owner = "client!rv", name = "De", descriptor = "F")
    public float field1743;

    @OriginalMember(owner = "client!rv", name = "He", descriptor = "F")
    private float field1747;

    @OriginalMember(owner = "client!rv", name = "We", descriptor = "F")
    public float field1762;

    @OriginalMember(owner = "client!rv", name = "Xe", descriptor = "F")
    public float field1763;

    @OriginalMember(owner = "client!rv", name = "uf", descriptor = "F")
    public float field1785;

    @OriginalMember(owner = "client!rv", name = "Xf", descriptor = "F")
    private float field1814;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!rv", name = "N", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!rv", name = "O", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!rv", name = "P", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!rv", name = "Q", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!rv", name = "R", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!rv", name = "S", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!rv", name = "T", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!rv", name = "U", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!rv", name = "V", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!rv", name = "W", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!rv", name = "X", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!rv", name = "Y", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!rv", name = "Z", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!rv", name = "ab", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!rv", name = "cb", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!rv", name = "db", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!rv", name = "eb", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!rv", name = "fb", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!rv", name = "gb", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!rv", name = "hb", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!rv", name = "jb", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!rv", name = "kb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!rv", name = "nb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!rv", name = "pb", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!rv", name = "qb", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!rv", name = "rb", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!rv", name = "sb", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!rv", name = "ub", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!rv", name = "vb", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!rv", name = "wb", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!rv", name = "yb", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!rv", name = "zb", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!rv", name = "Ab", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!rv", name = "Bb", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!rv", name = "Cb", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!rv", name = "Db", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!rv", name = "Eb", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!rv", name = "Fb", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!rv", name = "Gb", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!rv", name = "Hb", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!rv", name = "Ib", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!rv", name = "Jb", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!rv", name = "Kb", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!rv", name = "Lb", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!rv", name = "Mb", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!rv", name = "Nb", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!rv", name = "Ob", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!rv", name = "Pb", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!rv", name = "Qb", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!rv", name = "Rb", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!rv", name = "Sb", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!rv", name = "Tb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!rv", name = "Ub", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!rv", name = "Vb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!rv", name = "Wb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!rv", name = "Xb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!rv", name = "Yb", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!rv", name = "Zb", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!rv", name = "ac", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!rv", name = "bc", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!rv", name = "cc", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!rv", name = "dc", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!rv", name = "ec", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!rv", name = "fc", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!rv", name = "gc", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!rv", name = "ic", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!rv", name = "jc", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!rv", name = "kc", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!rv", name = "lc", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!rv", name = "mc", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!rv", name = "nc", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!rv", name = "oc", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!rv", name = "pc", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!rv", name = "qc", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!rv", name = "rc", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!rv", name = "sc", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!rv", name = "uc", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!rv", name = "xc", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!rv", name = "zc", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!rv", name = "Ac", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!rv", name = "Bc", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!rv", name = "Cc", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!rv", name = "Dc", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!rv", name = "Ec", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!rv", name = "Fc", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!rv", name = "Gc", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!rv", name = "Hc", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!rv", name = "Ic", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!rv", name = "Jc", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!rv", name = "Kc", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!rv", name = "Lc", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!rv", name = "Mc", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!rv", name = "Nc", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!rv", name = "Oc", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!rv", name = "Pc", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!rv", name = "Qc", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!rv", name = "Rc", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!rv", name = "Sc", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!rv", name = "Tc", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!rv", name = "Uc", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!rv", name = "Wc", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!rv", name = "Xc", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!rv", name = "Yc", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!rv", name = "Zc", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!rv", name = "ad", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!rv", name = "bd", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!rv", name = "cd", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!rv", name = "dd", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!rv", name = "ed", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!rv", name = "fd", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!rv", name = "gd", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!rv", name = "hd", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!rv", name = "id", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!rv", name = "jd", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!rv", name = "kd", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!rv", name = "ld", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!rv", name = "md", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!rv", name = "nd", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!rv", name = "od", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!rv", name = "pd", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!rv", name = "qd", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!rv", name = "rd", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!rv", name = "td", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!rv", name = "ud", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!rv", name = "vd", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!rv", name = "wd", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!rv", name = "xd", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!rv", name = "yd", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!rv", name = "zd", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!rv", name = "Ad", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!rv", name = "Bd", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!rv", name = "Cd", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!rv", name = "Dd", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!rv", name = "Ed", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!rv", name = "Fd", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!rv", name = "Gd", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!rv", name = "Hd", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!rv", name = "Id", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!rv", name = "Jd", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!rv", name = "Kd", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!rv", name = "Md", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!rv", name = "Nd", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!rv", name = "Od", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!rv", name = "Qd", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!rv", name = "Rd", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!rv", name = "Sd", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!rv", name = "Td", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!rv", name = "Ud", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!rv", name = "Vd", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!rv", name = "Xd", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!rv", name = "Yd", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!rv", name = "ae", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!rv", name = "be", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!rv", name = "ce", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!rv", name = "de", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!rv", name = "ee", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!rv", name = "Ge", descriptor = "I")
    private int field1746;

    @OriginalMember(owner = "client!rv", name = "Ie", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!rv", name = "Te", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!rv", name = "Ve", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!rv", name = "Ye", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!rv", name = "lf", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!rv", name = "rf", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!rv", name = "If", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!rv", name = "Jf", descriptor = "I")
    private int field1800;

    @OriginalMember(owner = "client!rv", name = "Rf", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!rv", name = "Eg", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!rv", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!rv", name = "rg", descriptor = "Lld;")
    private class171 field1834;

    @OriginalMember(owner = "client!rv", name = "sg", descriptor = "Lld;")
    public class171 field1835;

    @OriginalMember(owner = "client!rv", name = "ug", descriptor = "Lld;")
    public class171 field1837;

    @OriginalMember(owner = "client!rv", name = "wg", descriptor = "Lld;")
    public class171 field1839;

    @OriginalMember(owner = "client!rv", name = "xg", descriptor = "Lld;")
    public class171 field1840;

    @OriginalMember(owner = "client!rv", name = "yg", descriptor = "Lld;")
    private class171 field1841;

    @OriginalMember(owner = "client!rv", name = "zg", descriptor = "Lld;")
    private class171 field1842;

    @OriginalMember(owner = "client!rv", name = "Bg", descriptor = "Lrh;")
    private class268 field1844;

    @OriginalMember(owner = "client!rv", name = "tf", descriptor = "Ldj;")
    private class347 field1784;

    @OriginalMember(owner = "client!rv", name = "wf", descriptor = "Lrr;")
    private class366 field1787;

    @OriginalMember(owner = "client!rv", name = "Ee", descriptor = "Lul;")
    private class573 field1744;

    @OriginalMember(owner = "client!rv", name = "jg", descriptor = "Llj;")
    public class608 field1826;

    @OriginalMember(owner = "client!rv", name = "kg", descriptor = "Llj;")
    public class608 field1827;

    @OriginalMember(owner = "client!rv", name = "mg", descriptor = "Llj;")
    public class608 field1829;

    @OriginalMember(owner = "client!rv", name = "ng", descriptor = "Llj;")
    public class608 field1830;

    @OriginalMember(owner = "client!rv", name = "pg", descriptor = "Llj;")
    public class608 field1832;

    @OriginalMember(owner = "client!rv", name = "qg", descriptor = "Llj;")
    public class608 field1833;

    @OriginalMember(owner = "client!rv", name = "tg", descriptor = "Llj;")
    public class608 field1836;

    @OriginalMember(owner = "client!rv", name = "vg", descriptor = "Llj;")
    public class608 field1838;

    @OriginalMember(owner = "client!rv", name = "Cg", descriptor = "Llj;")
    public class608 field1845;

    @OriginalMember(owner = "client!rv", name = "Dg", descriptor = "Llj;")
    public class608 field1846;

    @OriginalMember(owner = "client!rv", name = "ig", descriptor = "Lam;")
    private class633 field1825;

    @OriginalMember(owner = "client!rv", name = "lg", descriptor = "Lam;")
    private class633 field1828;

    @OriginalMember(owner = "client!rv", name = "Ag", descriptor = "Lam;")
    private class633 field1843;

    @OriginalMember(owner = "client!rv", name = "Ld", descriptor = "Lwda;")
    public class639 field1699;

    @OriginalMember(owner = "client!rv", name = "Sf", descriptor = "Lwc;")
    public class67 field1809;

    @OriginalMember(owner = "client!rv", name = "vc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1631;

    @OriginalMember(owner = "client!rv", name = "yc", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field1634;

    @OriginalMember(owner = "client!rv", name = "ob", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field1572;

    @OriginalMember(owner = "client!rv", name = "Je", descriptor = "Z")
    public boolean field1749;

    @OriginalMember(owner = "client!rv", name = "Ne", descriptor = "Z")
    public boolean field1753;

    @OriginalMember(owner = "client!rv", name = "Of", descriptor = "Z")
    public boolean field1805;

    @OriginalMember(owner = "client!rv", name = "Qf", descriptor = "Z")
    public boolean field1807;

    @OriginalMember(owner = "client!rv", name = "Uf", descriptor = "Z")
    public boolean field1811;

    @OriginalMember(owner = "client!rv", name = "Fg", descriptor = "Z")
    public boolean field1848;

    @OriginalMember(owner = "client!rv", name = "xf", descriptor = "[Lcga;")
    public class485[] field1788;

    @OriginalMember(owner = "client!rv", name = "Le", descriptor = "[Laea;")
    public class50[] field1751;

    @OriginalMember(owner = "client!rv", name = "dg", descriptor = "[Laea;")
    public class50[] field1820;

    @OriginalMember(owner = "client!rv", name = "Be", descriptor = "[Ljaa;")
    public class615[] field1741;

    @OriginalMember(owner = "client!rv", name = "Nf", descriptor = "[Lwc;")
    private class67[] field1804;

    @OriginalMember(owner = "client!rv", name = "xe", descriptor = "[Ltn;")
    public class87[] field1737;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZ)V")
    public final void method814(int arg0, boolean arg1) {
        ++field1560;
        if (arg0 != 0) {
            this.field1528 = 44;
        }
        if (this.field1794 != arg1) {
            this.field1794 = arg1;
            this.method865((byte) 119);
        }
    }

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "()Z")
    public final boolean method468() {
        ++field1586;
        return true;
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(Z)V")
    public abstract void method815(boolean arg0);

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
    private final void method816(int arg0) {
        if (arg0 == 8652) {
            this.field1732 = (float) (-this.field1738 + this.field1789);
            ++field1561;
            this.field1740 = (float) (this.field1726 - this.field1738);
            this.field1785 = (float) (this.field1780 - this.field1818);
            this.field1763 = (float) (-this.field1818 + this.field1739);
        }
    }

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "()Z")
    public final boolean method485() {
        ++field1544;
        return false;
    }

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "()V")
    public void method458() {
        if (!this.field1803) {
            for (class656 var1 = this.field1529.method21(2); var1 != null; var1 = this.field1529.method9(-128)) {
                ((class112) var1).method949(-61);
            }
            Enumeration var2 = this.field1572.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method895(var3, (byte) 125, this.field1572.get(var3));
            }
            class60.method530(false, true, (byte) 119);
            this.field1570.release();
            this.field1803 = true;
        }
        ++field1664;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZI)V")
    public final void method817(boolean arg0, int arg1) {
        if (arg0 == !this.field1824) {
            this.field1824 = arg0;
            this.method865((byte) 120);
            this.field1746 &= -8;
        }
        ++field1675;
        if (arg1 != -8043) {
            this.field1754 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(IZ)Lrh;")
    public abstract class268 method818(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "(I)V")
    public final void method819(int arg0) {
        if (this.field1788[this.field1779] != class577.field7568) {
            this.field1788[this.field1779] = class577.field7568;
            this.field1741[this.field1779].method1725();
            this.method847(1);
        }
        if (arg0 <= -67) {
            ++field1563;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method820(byte arg0, Buffer arg1) {
        if (arg0 != -20) {
            this.method823((class67) null, 39);
        }
        this.field1817.method3743(arg1);
        ++field1681;
        return this.field1817;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z[F)[F")
    public final float[] method821(boolean arg0, float[] arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field1539;
            arg1[4] = this.field1801[1];
            arg1[12] = this.field1801[3];
            arg1[8] = this.field1801[2];
            arg1[0] = this.field1801[0];
            arg1[1] = this.field1801[4];
            arg1[13] = this.field1801[7];
            arg1[5] = this.field1801[5];
            arg1[2] = this.field1801[8];
            arg1[9] = this.field1801[6];
            arg1[10] = this.field1801[10];
            arg1[7] = this.field1801[13];
            arg1[3] = this.field1801[12];
            arg1[6] = this.field1801[9];
            arg1[14] = this.field1801[11];
            arg1[15] = this.field1801[15];
            arg1[11] = this.field1801[14];
            return arg1;
        }
    }

    @OriginalMember(owner = "client!rv", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method423(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field1587;
        boolean var7 = ~this.field1813 != ~arg0;
        if (var7 || this.field1816 != arg1 || this.field1821 != arg2) {
            this.field1813 = arg0;
            this.field1821 = arg2;
            this.field1816 = arg1;
            if (var7) {
                this.field1774 = (float) (255 & this.field1813) / 255.0F;
                this.field1796 = (float) (65280 & this.field1813) / 65280.0F;
                this.field1757 = (float) (16711680 & this.field1813) / 1.671168E7F;
                this.method854(true);
            }
            this.field1570.setSunColour(this.field1757, this.field1796, this.field1774, arg1, arg2);
            this.method891((byte) -98);
        }
        if (this.field1755[0] != arg3 || this.field1755[1] != arg4 || this.field1755[2] != arg5) {
            this.field1755[2] = arg5;
            this.field1755[1] = arg4;
            this.field1755[0] = arg3;
            this.field1735[2] = -arg5;
            this.field1735[1] = -arg4;
            this.field1735[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field1754[0] = arg3 * var8;
            this.field1754[1] = arg4 * var8;
            this.field1754[2] = arg5 * var8;
            this.field1767[1] = -this.field1754[1];
            this.field1767[0] = -this.field1754[0];
            this.field1767[2] = -this.field1754[2];
            this.field1570.setSunDirection(this.field1754[0], this.field1754[1], this.field1754[2]);
            this.method859((byte) -124);
            this.field1782 = (int) (arg3 * 256.0F / arg4);
            this.field1748 = (int) (arg5 * 256.0F / arg4);
        }
        this.method939((byte) -56);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class282 method452(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1640;
        return new class564(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method822(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lwc;I)V")
    public final void method823(class67 arg0, int arg1) {
        if (this.field1804[this.field1779] != arg0) {
            this.field1804[this.field1779] = arg0;
            if (arg0 == null) {
                this.method926(114);
            } else {
                arg0.method339(32073);
            }
            this.field1746 &= -2;
        }
        if (arg1 == -8423) {
            ++field1537;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZIILqt;)V")
    public abstract void method824(boolean arg0, int arg1, int arg2, class637 arg3);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lur;IIII)Lka;")
    public final class475 method401(class538 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1585;
        return new class608(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIZ)Lhu;")
    public final class133 method409(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1541;
        class599 var6 = new class599(this, arg2, arg3, arg4);
        var6.method1051(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILam;)V")
    public abstract void method825(int arg0, int arg1, class633 arg2);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([FIZLqda;II)Ltr;")
    public final class297 method826(float[] arg0, int arg1, boolean arg2, class105 arg3, int arg4, int arg5) {
        if (arg4 > -101) {
            this.method496(true);
        }
        ++field1666;
        return this.method838(arg5, 0, arg2, arg3, 0, arg1, (byte) 72, arg0);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILns;Lqda;)Z")
    public abstract boolean method827(int arg0, class408 arg1, class105 arg2);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Law;III)V")
    public abstract void method828(class76 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZB)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method829(int arg0, boolean arg1, byte arg2) {
        ++field1605;
        return arg2 != -35 ? null : this.field1631.method3729(arg0, arg1);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ltea;)V")
    public final void method440(class241 arg0) {
        ++field1648;
        this.field1787 = (class366) arg0;
    }

    @OriginalMember(owner = "client!rv", name = "la", descriptor = "()V")
    public final void method435() {
        this.field1739 = this.field1559;
        ++field1593;
        this.field1726 = this.field1528;
        this.field1789 = 0;
        this.field1780 = 0;
        if (this.field1848) {
            this.field1848 = false;
            this.method920(-113);
        }
        this.method816(8652);
    }

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "(I)V")
    private final void method830(int arg0) {
        this.field1734 = false;
        ++field1612;
        if (this.field1744 != null) {
            this.field1744.method1141((byte) 124);
        }
        this.method909((byte) 107);
        if (arg0 != 8) {
            this.field1770 = true;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
    public abstract void method831(byte arg0);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BZ[[II)Lnp;")
    public abstract class493 method832(byte arg0, boolean arg1, int[][] arg2, int arg3);

    @OriginalMember(owner = "client!rv", name = "xa", descriptor = "(F)V")
    public final void method486(float arg0) {
        if (this.field1742 != arg0) {
            this.field1742 = arg0;
            this.field1570.setAmbient(arg0);
            this.method854(true);
            this.method939((byte) -120);
        }
        ++field1592;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1687;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method472(Canvas arg0) {
        ++field1531;
        this.field1569 = null;
        this.field1581 = null;
        if (arg0 != null && this.field1566 != arg0) {
            if (this.field1572.containsKey(arg0)) {
                this.field1581 = this.field1572.get(arg0);
                this.field1569 = arg0;
            }
        } else {
            this.field1569 = this.field1566;
            this.field1581 = this.field1577;
        }
        if (this.field1569 != null && this.field1581 != null) {
            this.method822(this.field1569, -1, this.field1581);
            this.method874(31388);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
    public final void method437(int arg0) {
        ++field1662;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "(I)V")
    public void method833(int arg0) {
        ++field1600;
        this.field1799 = this.field1761;
        this.field1761 = arg0;
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)V")
    public abstract void method834(byte arg0);

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "(II)V")
    public final void method491(int arg0, int arg1) {
        ++field1650;
        if (~this.field1745 != ~arg0 || ~this.field1736 != ~arg1) {
            this.field1745 = arg0;
            this.field1736 = arg1;
            this.method936((byte) -74);
            this.method875(true);
            this.method940(0);
        }
    }

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "(II)Lul;")
    public class573 method835(int arg0, int arg1) {
        ++field1649;
        if (arg1 != 6) {
            this.field1786 = -77;
        }
        if (arg0 != 6) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    return arg0 == 7 ? new class75(this) : new class232(this);
                } else {
                    return new class339(this, this.field1699);
                }
            } else {
                return new class265(this);
            }
        } else {
            return new class471(this);
        }
    }

    @OriginalMember(owner = "client!rv", name = "T", descriptor = "(IIII)V")
    public final void method433(int arg0, int arg1, int arg2, int arg3) {
        ++field1607;
        boolean var5 = false;
        if (~arg0 < ~this.field1780) {
            this.field1780 = arg0;
            var5 = true;
        }
        if (arg2 < this.field1739) {
            this.field1739 = arg2;
            var5 = true;
        }
        if (this.field1789 < arg1) {
            this.field1789 = arg1;
            var5 = true;
        }
        if (~this.field1726 < ~arg3) {
            this.field1726 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field1848) {
                this.field1848 = true;
                this.method920(99);
            }
            this.method942(true);
            this.method816(8652);
        }
    }

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "(II)V")
    public final void method836(int arg0, int arg1) {
        ++field1620;
        if (this.field1752 != arg1) {
            boolean var3;
            boolean var4;
            class662 var5;
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    var3 = false;
                    var4 = true;
                    var5 = class35.field514;
                } else if (~arg1 != -129) {
                    var5 = class43.field569;
                    var3 = false;
                    var4 = false;
                } else {
                    var4 = true;
                    var3 = true;
                    var5 = class451.field6173;
                }
            } else {
                var3 = true;
                var5 = class367.field5142;
                var4 = true;
            }
            if (!var3 == this.field1798) {
                this.field1798 = var3;
                this.method924(arg0 ^ 245);
            }
            if (this.field1770 == !var4) {
                this.field1770 = var4;
                this.method841(true);
            }
            if (this.field1766 != var5) {
                this.field1766 = var5;
                this.method932(false);
            }
            this.field1752 = arg1;
            this.field1746 &= -29;
        }
        if (arg0 != -129) {
            this.method942(true);
        }
    }

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "()Z")
    public final boolean method436() {
        ++field1704;
        return false;
    }

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "(I)V")
    public abstract void method837(int arg0);

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method507(Canvas arg0) {
        ++field1562;
        if (this.field1566 == arg0) {
            throw new RuntimeException();
        } else if (this.field1572.containsKey(arg0)) {
            this.method895(arg0, (byte) 90, this.field1572.get(arg0));
            this.field1572.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "()I")
    public final int method488() {
        ++field1658;
        return this.field1712 - -this.field1711 + this.field1715;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)I")
    public final int method405(int arg0, int arg1) {
        ++field1718;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!rv", name = "U", descriptor = "(IIIII)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1582;
        this.method412(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field1571;
        this.field1760 = arg0;
        this.method869(-96);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lza;)V")
    public final void method457(class418 arg0) {
        ++field1698;
        this.field1631 = ((class112) arg0).field1851;
        this.field1634 = this.field1631.method3729(32768, false);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZLqda;IIB[F)Ltr;")
    public abstract class297 method838(int arg0, int arg1, boolean arg2, class105 arg3, int arg4, int arg5, byte arg6, float[] arg7);

    @OriginalMember(owner = "client!rv", name = "za", descriptor = "(IIIII)V")
    public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method885(20719);
        ++field1549;
        this.method870(arg3, false);
        this.method840(0, 51, class362.field5101);
        this.method845(class362.field5101, (byte) 83, 0);
        this.method836(-129, arg4);
        this.field1713.method3366((float) arg2, (float) arg2, 1.0F, (byte) -49);
        this.field1713.method1730(arg0, arg1, 0);
        this.method842(58);
        this.method894(false, -127);
        this.method825(0, 8, this.field1825);
        this.method898(this.field1834, (byte) -15);
        this.method828(class76.field922, 256, 0, 0);
        this.method894(true, -119);
        this.method845(class454.field6199, (byte) 125, 0);
        this.method840(0, -117, class454.field6199);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljaa;I)V")
    public final void method839(class615 arg0, int arg1) {
        this.field1713.method1712(arg0);
        ++field1663;
        if (arg1 < 126) {
            this.field1819 = null;
        }
        this.field1710 = false;
        this.method883(38);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILqt;)V")
    public final void method840(int arg0, int arg1, class637 arg2) {
        ++field1709;
        int var4 = -102 / ((-13 - arg1) / 32);
        this.method911(-8980, arg0, arg2, false, false);
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(Z)V")
    public abstract void method841(boolean arg0);

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)V")
    public final void method496(boolean arg0) {
        ++field1565;
    }

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "(I)V")
    public final void method842(int arg0) {
        if (arg0 <= 38) {
            this.method842(64);
        }
        ++field1610;
        this.field1710 = false;
        this.method883(-114);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([I)V")
    public final void method510(int[] arg0) {
        ++field1667;
        arg0[0] = this.field1559;
        arg0[1] = this.field1528;
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "(Z)V")
    private final void method843(boolean arg0) {
        ++field1598;
        if (!arg0) {
            this.method408(-66);
        }
        if (!this.field1750) {
            float[] var2 = this.field1812;
            this.field1750 = true;
            if (~this.field1559 != -1 && this.field1528 != 0) {
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[14] = 0.5F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[13] = 1.0F;
                var2[8] = 0.0F;
                var2[12] = -1.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 2.0F / (float) this.field1559;
                var2[3] = 0.0F;
                var2[5] = -2.0F / (float) this.field1528;
                var2[10] = 0.5F;
            } else {
                var2[0] = 1.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[5] = 1.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "()Z")
    public final boolean method442() {
        ++field1604;
        return true;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BZ)V")
    public final void method844(byte arg0, boolean arg1) {
        if (arg0 != 36) {
            this.field1760 = false;
        }
        if (!this.field1791 != !arg1) {
            this.field1791 = arg1;
            this.method869(-120);
            this.field1746 &= -32;
        }
        ++field1590;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lqt;BI)V")
    public final void method845(class637 arg0, byte arg1, int arg2) {
        if (arg1 > 81) {
            ++field1533;
            this.method824(false, arg2, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "(I)Ljaa;")
    public final class615 method846(int arg0) {
        ++field1623;
        return arg0 != -24720 ? null : this.field1713;
    }

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "(I)V")
    private final void method847(int arg0) {
        ++field1526;
        if (arg0 != 1) {
            this.field1722 = null;
        }
        this.method876(-128);
        if (this.field1744 != null) {
            this.field1744.method1139(4095);
        }
    }

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "()I")
    public final int method466() {
        ++field1714;
        return this.field1764 - 2;
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(B)V")
    public abstract void method848(byte arg0);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIII)V")
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1668;
        float var8 = (float) (-arg0) + (float) arg2;
        float var9 = (float) arg3 - (float) arg1;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method885(20719);
        this.method870(arg4, false);
        this.method840(0, 116, class362.field5101);
        this.method845(class362.field5101, (byte) 114, 0);
        this.method836(-129, arg6);
        this.field1713.method3366((float) arg5, var11, 1.0F, (byte) -49);
        this.field1713.method1730(0, -arg5 / 2, 0);
        this.field1713.method1716(16383 & (int) ((double) var10 * 2607.5945876176133D));
        this.field1713.method1730(arg0, arg1, 0);
        this.method842(121);
        this.method894(false, -120);
        this.method880(-27);
        this.method894(true, -117);
        this.method845(class454.field6199, (byte) 88, 0);
        this.method840(0, -84, class454.field6199);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLaea;Laea;)V")
    public final void method849(byte arg0, class50 arg1, class50 arg2) {
        ++field1692;
        boolean var4 = false;
        if (this.field1751[this.field1779] != arg2) {
            this.field1751[this.field1779] = arg2;
            this.method931(false);
            var4 = true;
        }
        if (arg0 <= 39) {
            this.field1755 = null;
        }
        if (this.field1820[this.field1779] != arg1) {
            this.field1820[this.field1779] = arg1;
            this.method945((byte) 125);
            var4 = true;
        }
        if (var4) {
            this.field1746 &= -30;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[IIZIII)Ltr;")
    public abstract class297 method850(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "(B)V")
    private final void method851(byte arg0) {
        this.field1731 = (float) this.field1736;
        if (arg0 == 12) {
            ++field1707;
        }
    }

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "(I)Ljaa;")
    public final class615 method852(int arg0) {
        ++field1627;
        if (arg0 <= 16) {
            this.field1843 = null;
        }
        return this.field1722;
    }

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "(I)F")
    public abstract float method853(int arg0);

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "()I")
    public final int method448() {
        ++field1538;
        return this.field1847;
    }

    @OriginalMember(owner = "client!rv", name = "da", descriptor = "(III[I)V")
    public final void method471(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1615;
        float var5 = this.field1719.method3352((byte) -114, (float) arg0, (float) arg1, (float) arg2);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field1738;
            var7 = this.field1818;
        } else {
            var7 = (int) ((float) this.field1768 * this.field1719.method3363((float) arg2, (float) arg1, (float) arg0, 15) / var5);
            var6 = (int) ((float) this.field1815 * this.field1719.method3346((float) arg0, false, (float) arg1, (float) arg2) / var5);
        }
        arg3[1] = (int) ((float) var6 + -this.field1732);
        arg3[0] = (int) ((float) var7 - this.field1785);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "(Z)V")
    public abstract void method854(boolean arg0);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIII)V")
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1702;
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
        if (this.method902((float) arg1, (float) arg0, (float) arg3 + var8, -1, (float) arg2 + var9, 0.0F, 0.0F)) {
            this.method885(20719);
            this.method870(arg4, false);
            this.method840(0, 71, class362.field5101);
            this.method845(class362.field5101, (byte) 111, 0);
            this.method836(-129, arg5);
            this.method897(22551);
            this.method894(false, -123);
            this.method881((byte) 100);
            this.method894(true, -127);
            this.method845(class454.field6199, (byte) 95, 0);
            this.method840(0, 112, class454.field6199);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljn;Z)Lhu;")
    public final class133 method415(class720 arg0, boolean arg1) {
        ++field1573;
        class133 var9;
        if (~arg0.field10028 != -1 && ~arg0.field10029 != -1) {
            int[] var3 = new int[arg0.field10029 * arg0.field10028];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field10030 != null) {
                for (int var6 = 0; ~arg0.field10029 < ~var6; ++var6) {
                    for (int var7 = 0; ~arg0.field10028 < ~var7; ++var7) {
                        var3[var5++] = class446.method2556(arg0.field10030[var4] << 24, arg0.field10027[class48.method346(255, arg0.field10023[var4])]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; var8 < arg0.field10029; ++var8) {
                    for (int var10 = 0; var10 < arg0.field10028; ++var10) {
                        int var11 = arg0.field10027[arg0.field10023[var4++] & 255];
                        var3[var5++] = ~var11 != -1 ? class446.method2556(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method450(arg0.field10029, (byte) 99, arg0.field10028, var3, 0, arg0.field10028);
        } else {
            var9 = this.method450(1, (byte) 99, 1, new int[1], 0, 1);
        }
        var9.method1032(arg0.field10024, arg0.field10031, arg0.field10026, arg0.field10025);
        return var9;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)Lrh;")
    public final class268 method855(byte arg0, int arg1) {
        if (~(arg1 * 2) < ~this.field1844.method590(-1)) {
            this.field1844.method585(arg1, (byte) 102);
        }
        int var3 = -73 % ((arg0 - -36) / 62);
        ++field1682;
        return this.field1844;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZ)Lhu;")
    public final class133 method418(int arg0, int arg1, boolean arg2) {
        ++field1550;
        return new class599(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "()Z")
    public final boolean method443() {
        ++field1674;
        return true;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZZ)V")
    public final void method856(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (this.field1773 != arg0 || this.field1753 != this.field1733) {
            class297 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field1753 ? 0 : 3;
            if (~arg0 > -1) {
                this.method819(-69);
            } else {
                var5 = this.field1819.method1823(arg0, (byte) -125);
                class758 var10 = super.field717.method91(arg0, (byte) 126);
                if (var10.field10555 == 0 && ~var10.field10554 == -1) {
                    this.method819(-124);
                } else {
                    int var11 = var10.field10548 ? 64 : 128;
                    int var12 = var11 * 50;
                    class615 var13 = this.method916(0);
                    var13.method3347((byte) 85, 0.0F, (float) (this.field1759 % var12 * var10.field10555) / (float) var12, (float) (this.field1759 % var12 * var10.field10554) / (float) var12);
                    this.method878(3, class91.field1105);
                }
                var6 = var10.field10545;
                if (!this.field1753) {
                    var8 = var10.field10557;
                    var9 = var10.field10536;
                    var7 = var10.field10558;
                }
            }
            this.method879(var7, var9, -10, var8, arg3, arg2);
            if (this.field1744 == null) {
                this.method823(var5, -8423);
                this.method887((byte) 118, var6);
            } else {
                this.field1744.method607(var5, var6, (byte) 116);
            }
            this.field1733 = this.field1753;
            this.field1773 = arg0;
        }
        if (arg1 < 1) {
            this.field1657 = -5;
        }
        ++field1630;
        this.field1746 &= -8;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Luj;I)V")
    public final void method407(class388 arg0, int arg1) {
        this.field1784.method2072(this, arg0, arg1, 0);
        ++field1602;
    }

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "(I)I")
    public final int method857(int arg0) {
        if (arg0 != 128) {
            this.field1721 = null;
        }
        ++field1608;
        return this.field1779;
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)V")
    public final void method441(int arg0) {
        ++field1621;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILaw;I)V")
    private final void method858(int arg0, class76 arg1, int arg2) {
        this.method825(0, 8, this.field1843);
        ++field1588;
        this.method898(this.field1842, (byte) -15);
        this.method828(arg1, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "()Z")
    public final boolean method449() {
        ++field1659;
        return this.field1775[3].method605(4095);
    }

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)V")
    public final void method497(int arg0) {
        ++field1705;
    }

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "(B)V")
    public abstract void method859(byte arg0);

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "(I)V")
    private final void method860(int arg0) {
        if (arg0 != 2963) {
            this.field1773 = 111;
        }
        ++field1693;
        if (class58.field703 != this.field1806) {
            class173 var2 = this.field1806;
            this.field1806 = class58.field703;
            if (var2.method1217((byte) 0)) {
                this.method830(8);
            }
            this.method843(true);
            this.field1801 = this.field1812;
            this.method928((byte) -93);
            this.field1746 &= -25;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILqda;IILns;)Ltr;")
    public abstract class297 method861(int arg0, class105 arg1, int arg2, int arg3, class408 arg4);

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "(I)V")
    private final void method862(int arg0) {
        ++field1635;
        this.field1828 = this.method904(105, true);
        this.field1828.method2603(arg0, -30987, 24);
        this.field1841 = this.method899((byte) 79, new class502[] { new class502(class143.field2281) });
    }

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "(I)V")
    public abstract void method863(int arg0);

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "(Z)V")
    private final void method864(boolean arg0) {
        this.field1727[14] = this.field1814;
        ++field1542;
        this.field1727[10] = this.field1747;
        this.field1769 = (this.field1727[14] - (float) this.field1736) / this.field1727[10];
        if (!arg0) {
            this.method934(-13, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "(B)V")
    public abstract void method865(byte arg0);

    @OriginalMember(owner = "client!rv", name = "KA", descriptor = "(IIII)V")
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
        ++field1611;
        if (arg0 <= 0 && ~(this.field1559 - 1) >= ~arg2 && arg1 <= 0 && arg3 >= this.field1528 + -1) {
            this.method435();
        } else {
            this.field1789 = ~arg1 > -1 ? 0 : arg1;
            this.field1780 = arg0 < 0 ? 0 : arg0;
            this.field1726 = arg3 > this.field1559 ? 0 : arg3;
            this.field1739 = ~this.field1559 <= ~arg2 ? arg2 : 0;
            if (!this.field1848) {
                this.field1848 = true;
                this.method920(-116);
            }
            this.method942(true);
            this.method816(8652);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([BIILqda;IZ)Ltr;")
    public final class297 method866(byte[] arg0, int arg1, int arg2, class105 arg3, int arg4, boolean arg5) {
        ++field1638;
        if (arg1 != 0) {
            this.method437(17);
        }
        return this.method890(0, arg5, arg2, 0, arg0, arg3, arg4, -98);
    }

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "()I")
    public final int method424() {
        ++field1594;
        return this.field1745;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1622;
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
        this.method885(20719);
        this.method870(arg4, false);
        this.method840(0, 111, class362.field5101);
        this.method845(class362.field5101, (byte) 120, 0);
        this.method836(-129, arg5);
        this.method897(22551);
        int var14 = arg8 % (arg6 + arg7);
        this.method894(false, -124);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~arg6 > ~var14) {
            var18 = (float) (-var14 + arg7 + arg6) * var11;
            var17 = (float) (arg6 - -arg7 + -var14) * var12;
        } else {
            var20 = (float) (arg6 - var14) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg0 <= ~arg2) {
                if (var21 < (float) arg2) {
                    break;
                }
                if (var19 + var21 < (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 > (float) arg2) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg3 > arg1) {
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
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method902(var22, var21, var20 + var22, -1, var19 + var21, 0.0F, 0.0F)) {
                return;
            }
            var21 += var19 + var23;
            this.method881((byte) 53);
            var22 += var20 + var24;
            var20 = var16;
            var19 = var15;
        }
        this.method894(true, -124);
        this.method845(class454.field6199, (byte) 121, 0);
        this.method840(0, -52, class454.field6199);
    }

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "(Z)Ljaa;")
    public final class615 method867(boolean arg0) {
        ++field1596;
        if (!arg0) {
            this.method490(57, -64, 94, 79);
        }
        return this.field1721;
    }

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "(I)Lnp;")
    public final class493 method868(int arg0) {
        ++field1644;
        if (arg0 != 0) {
            this.method893(43, (class380) null);
        }
        return this.field1787 == null ? null : this.field1787.method2165((byte) -122);
    }

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "(III[I)V")
    public final void method494(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1553;
        float var5 = this.field1719.method3352((byte) -74, (float) arg0, (float) arg1, (float) arg2);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field1738;
            var7 = this.field1818;
        } else {
            var7 = (int) ((float) this.field1768 * this.field1719.method3363((float) arg2, (float) arg1, (float) arg0, 15) / var5);
            var6 = (int) ((float) this.field1815 * this.field1719.method3346((float) arg0, false, (float) arg1, (float) arg2) / var5);
        }
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field1732);
        arg3[0] = (int) ((float) var7 - this.field1785);
    }

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "(I)V")
    public abstract void method869(int arg0);

    @OriginalMember(owner = "client!rv", name = "pa", descriptor = "()V")
    public final void method478() {
        this.field1753 = false;
        ++field1619;
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(IIIIII)V")
    public final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1584;
        float var7 = this.method853(-101);
        this.method885(20719);
        this.method870(arg4, false);
        this.method840(0, 94, class362.field5101);
        this.method845(class362.field5101, (byte) 118, 0);
        this.method836(-129, arg5);
        this.field1713.method3366((float) (arg3 + -1), (float) (arg2 - 1), 1.0F, (byte) -49);
        this.field1713.method3353((float) arg0 + -var7, 0.0F, (float) arg1 + -var7, 13);
        this.method842(49);
        this.method894(false, -119);
        this.method858(0, class511.field6786, 4);
        this.method894(true, -126);
        this.method845(class454.field6199, (byte) 102, 0);
        this.method840(0, 92, class454.field6199);
    }

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "()V")
    public final void method503() {
        if (this.field1819 != null) {
            this.field1819.method1825(1000);
        }
        ++field1645;
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(IZ)V")
    public final void method870(int arg0, boolean arg1) {
        if (~this.field1776 != ~arg0) {
            this.field1776 = arg0;
            this.method848((byte) -105);
        }
        ++field1689;
        if (arg1) {
            this.method842(-34);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(FI)V")
    public final void method871(float arg0, int arg1) {
        if (this.field1777 != arg0) {
            this.field1777 = arg0;
            this.method875(true);
        }
        int var3 = 24 / ((-13 - arg1) / 44);
        ++field1609;
    }

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "(I)I")
    public final int method872(int arg0) {
        if (arg0 != -31039) {
            this.method468();
        }
        ++field1589;
        return this.field1792;
    }

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "(B)Ljaa;")
    public final class615 method873(byte arg0) {
        ++field1599;
        return arg0 != 114 ? null : this.field1741[this.field1779];
    }

    @OriginalMember(owner = "client!rv", name = "JA", descriptor = "(IIIIII)I")
    public final int method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1717;
        int var7 = 0;
        float var8 = (float) arg2 * this.field1719.field8225 + (float) arg0 * this.field1719.field8199 + (float) arg1 * this.field1719.field8215 + this.field1719.field8177;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field1719.field8225 + (float) arg3 * this.field1719.field8199 + (float) arg4 * this.field1719.field8215 + this.field1719.field8177;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field1745 && (float) this.field1745 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field1736 && var9 > (float) this.field1736) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field1719.field8197 + (float) arg0 * this.field1719.field8182 + (float) arg1 * this.field1719.field8221 + this.field1719.field8204) * (float) this.field1768 / var8);
        int var11 = (int) (((float) arg5 * this.field1719.field8197 + (float) arg3 * this.field1719.field8182 + (float) arg4 * this.field1719.field8221 + this.field1719.field8204) * (float) this.field1768 / var9);
        if ((float) var10 < this.field1785 && (float) var11 < this.field1785) {
            var7 |= 1;
        } else if ((float) var10 > this.field1763 && (float) var11 > this.field1763) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field1719.field8195 + (float) arg0 * this.field1719.field8184 + (float) arg1 * this.field1719.field8208 + this.field1719.field8186) * (float) this.field1815 / var8);
        int var13 = (int) (((float) arg5 * this.field1719.field8195 + (float) arg3 * this.field1719.field8184 + (float) arg4 * this.field1719.field8208 + this.field1719.field8186) * (float) this.field1815 / var9);
        if (this.field1732 > (float) var12 && (float) var13 < this.field1732) {
            var7 |= 4;
        } else if (this.field1740 < (float) var12 && (float) var13 > this.field1740) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "(I)V")
    private final void method874(int arg0) {
        if (this.field1569 == null) {
            this.field1629 = this.field1657 = 1;
        } else {
            Dimension var2 = this.field1569.getSize();
            this.field1629 = var2.width;
            this.field1657 = var2.height;
        }
        ++field1583;
        if (arg0 == 31388) {
            this.field1559 = this.field1629;
            this.field1528 = this.field1657;
            this.method906((byte) 18);
            this.method936((byte) -35);
            this.method875(true);
            this.method863(26588);
            this.method816(8652);
            this.method892(-23496);
            this.method435();
        }
    }

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "(Z)V")
    private final void method875(boolean arg0) {
        this.field1793 = false;
        ++field1568;
        this.method877(arg0);
        if (class62.field759 == this.field1806) {
            this.method928((byte) -83);
        }
    }

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "(I)V")
    public abstract void method876(int arg0);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field1639;
    }

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "(Z)V")
    private final void method877(boolean arg0) {
        ++field1656;
        if (!arg0) {
            this.field1748 = 51;
        }
        if (!this.field1793) {
            float[] var2 = this.field1790;
            float var3 = (float) this.field1745;
            float var4 = (float) this.field1736;
            float var5 = (float) (-this.field1738) * this.field1777 / (float) this.field1815;
            float var6 = (float) (-this.field1818) * this.field1777 / (float) this.field1768;
            float var7 = (float) (-this.field1818 + this.field1559) * this.field1777 / (float) this.field1768;
            float var8 = (float) (this.field1528 - this.field1738) * this.field1777 / (float) this.field1815;
            if (var6 != var7 && var5 != var8) {
                var2[14] = var3 / (-var4 + var3);
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[4] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[10] = 1.0F / (var3 - var4);
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[1] = 0.0F;
                var2[9] = 0.0F;
            } else {
                var2[13] = 0.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
            }
            this.method851((byte) 12);
            this.field1793 = true;
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(II)I")
    public final int method410(int arg0, int arg1) {
        ++field1647;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILcga;)V")
    public final void method878(int arg0, class485 arg1) {
        this.field1788[this.field1779] = arg1;
        if (arg0 != 3) {
            method910('v', 102, -113);
        }
        ++field1564;
        this.method847(1);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "()Z")
    public final boolean method390() {
        ++field1686;
        return false;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIZZ)V")
    private final void method879(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        ++field1642;
        boolean var7 = arg5 & this.method449();
        if (!var7 && (~arg1 == -5 || arg1 == 8 || ~arg1 == -10)) {
            arg1 = 2;
            arg3 = arg1 != 4 ? 1 : arg0 & 1;
            arg0 = 0;
        }
        if (arg1 != 0 && arg4) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (arg2 != -10) {
            this.field1806 = null;
        }
        if (~this.field1724 == ~arg1) {
            if (~this.field1724 != -1) {
                this.field1775[Integer.MAX_VALUE & this.field1724].method610(arg4, 122);
                if (this.field1772 != arg0 || ~this.field1771 != ~arg3) {
                    this.field1775[this.field1724 & Integer.MAX_VALUE].method602(arg2 + -26417, arg0, arg3);
                    this.field1771 = arg3;
                    this.field1772 = arg0;
                }
                return;
            }
        } else {
            if (~this.field1724 != -1) {
                this.field1775[Integer.MAX_VALUE & this.field1724].method603(true);
            }
            if (arg1 != 0) {
                this.field1744 = this.field1775[Integer.MAX_VALUE & arg1];
                this.field1744.method611(true, arg4);
                this.field1744.method610(arg4, 114);
                this.field1744.method602(-26427, arg0, arg3);
            } else {
                this.field1744 = null;
            }
            this.field1724 = arg1;
            this.field1772 = arg0;
            this.field1771 = arg3;
        }
    }

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "(I)V")
    public final void method880(int arg0) {
        this.method858(0, class76.field922, 2);
        int var2 = -89 / ((-83 - arg0) / 33);
        ++field1654;
    }

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "(B)V")
    private final void method881(byte arg0) {
        if (arg0 > 31) {
            this.method825(0, 8, this.field1828);
            ++field1685;
            this.method898(this.field1841, (byte) -15);
            this.method828(class753.field10498, 1, 0, 0);
        }
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "()Lofa;")
    public final class333 method421() {
        ++field1679;
        return new class615();
    }

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "(Z)V")
    public final void method882(boolean arg0) {
        ++field1618;
        this.field1741 = new class615[this.field1808];
        this.field1751 = new class50[this.field1808];
        this.field1804 = new class67[this.field1808];
        this.field1820 = new class50[this.field1808];
        this.field1788 = new class485[this.field1808];
        for (int var2 = 0; this.field1808 > var2; ++var2) {
            this.field1820[var2] = class312.field4469;
            this.field1751[var2] = class312.field4469;
            this.field1788[var2] = class577.field7568;
            this.field1741[var2] = new class615();
        }
        this.field1737 = new class87[this.field1764 + -2];
        this.field1809 = this.method861(1, class315.field4498, -65, 1, class408.field5668);
        this.method457(new class112(262144));
        this.field1840 = this.method899((byte) -122, new class502[] { new class502(new class143[] { class143.field2281, class143.field2285 }) });
        this.field1835 = this.method899((byte) -120, new class502[] { new class502(new class143[] { class143.field2281, class143.field2283 }) });
        this.field1837 = this.method899((byte) 30, new class502[] { new class502(class143.field2281), new class502(class143.field2283), new class502(class143.field2285), new class502(class143.field2282) });
        this.field1839 = this.method899((byte) -120, new class502[] { new class502(class143.field2281), new class502(class143.field2283), new class502(class143.field2285) });
        this.field1832 = new class608(this, 0, 0, false, false);
        this.field1838 = new class608(this, 0, 0, true, true);
        this.field1830 = new class608(this, 0, 0, false, false);
        this.field1836 = new class608(this, 0, 0, true, true);
        this.field1846 = new class608(this, 0, 0, false, false);
        this.field1827 = new class608(this, 0, 0, true, true);
        this.field1833 = new class608(this, 0, 0, false, false);
        this.field1826 = new class608(this, 0, 0, true, true);
        this.field1829 = new class608(this, 0, 0, false, arg0);
        this.field1845 = new class608(this, 0, 0, true, true);
        this.field1784 = new class347(this);
        this.field1844 = this.method818(-23469, true);
        this.method948(-43);
        this.field1699 = new class639(this);
        this.field1775[1] = this.method835(1, 6);
        this.field1775[2] = this.method835(2, 6);
        this.field1775[4] = this.method835(4, 6);
        this.field1775[5] = this.method835(5, 6);
        this.field1775[6] = this.method835(6, 6);
        this.field1775[7] = this.method835(7, 6);
        this.field1775[3] = this.method835(3, 6);
        this.field1775[8] = this.method835(8, 6);
        this.field1775[9] = this.method835(9, 6);
        if (!this.field1775[2].method605(4095)) {
            this.field1775[2] = this.method835(0, 6);
        }
        if (!this.field1775[4].method605(4095)) {
            this.field1775[4] = this.field1775[2];
        }
        if (!this.field1775[8].method605(4095)) {
            this.field1775[8] = this.field1775[4];
        }
        if (!this.field1775[9].method605(4095)) {
            this.field1775[9] = this.field1775[8];
        }
        this.method907(101);
        this.method435();
        this.method431();
    }

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "(I)V")
    private final void method883(int arg0) {
        ++field1643;
        if (class58.field703 == this.field1806) {
            float var2 = this.method853(-91);
            this.field1713.method3353(var2, 0.0F, var2, 13);
        }
        this.field1734 = false;
        this.method943(true);
        int var3 = -7 % ((arg0 - -71) / 41);
        if (this.field1744 != null) {
            this.field1744.method1138(3);
        }
    }

    @OriginalMember(owner = "client!rv", name = "HA", descriptor = "(IIII[I)V")
    public final void method398(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field1597;
        float var6 = this.field1719.method3352((byte) -111, (float) arg0, (float) arg1, (float) arg2);
        if (!((float) this.field1745 > var6) && !(var6 > (float) this.field1736)) {
            int var7 = (int) ((float) this.field1768 * this.field1719.method3363((float) arg2, (float) arg1, (float) arg0, 15) / (float) arg3);
            int var8 = (int) ((float) this.field1815 * this.field1719.method3346((float) arg0, false, (float) arg1, (float) arg2) / (float) arg3);
            arg4[1] = (int) ((float) var8 + -this.field1732);
            arg4[2] = (int) var6;
            arg4[0] = (int) ((float) var7 + -this.field1785);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "(I)V")
    public final void method884(int arg0) {
        if (~this.field1746 != -5) {
            this.method860(2963);
            this.method888(11073, false);
            this.method817(false, -8043);
            this.method923(false, 23394);
            this.method844((byte) 36, false);
            this.method856(-2, 18, false, false);
            this.method836(-129, 1);
            this.method887((byte) 115, 0);
            this.field1746 = 4;
        }
        if (arg0 == 1) {
            ++field1697;
        }
    }

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "()Z")
    public final boolean method512() {
        ++field1670;
        return this.field1749;
    }

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "(I)V")
    private final void method885(int arg0) {
        if (arg0 != 20719) {
            this.field1734 = true;
        }
        ++field1633;
        if (this.field1746 != 1) {
            this.method860(2963);
            this.method888(11073, false);
            this.method817(false, -8043);
            this.method923(false, 23394);
            this.method844((byte) 36, false);
            this.method856(-2, 62, false, false);
            this.method887((byte) 121, 1);
            this.method823(this.field1809, -8423);
            this.field1746 = 1;
        }
    }

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "(I)V")
    public void method501(int arg0) {
        if (this.field1819 != null) {
            this.field1819.method1824(5);
        }
        ++field1716;
        this.field1759 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "(I)V")
    private final void method886(int arg0) {
        if (!this.field1729) {
            float[] var2 = this.field1727;
            float var3 = (float) (-this.field1818 * this.field1745) / (float) this.field1768;
            float var4 = (float) ((-this.field1818 + this.field1559) * this.field1745) / (float) this.field1768;
            float var5 = (float) (this.field1745 * this.field1738) / (float) this.field1815;
            float var6 = (float) ((-this.field1528 + this.field1738) * this.field1745) / (float) this.field1815;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field1745 * 2.0F;
                var2[15] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[5] = var7 / (var5 - var6);
                var2[1] = 0.0F;
                var2[10] = this.field1747 = (float) this.field1736 / (float) (-this.field1736 + this.field1745);
                var2[2] = 0.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = -1.0F;
                var2[14] = this.field1814 = (float) (this.field1745 * this.field1736) / (float) (this.field1745 - this.field1736);
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[12] = 0.0F;
            } else {
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[10] = 1.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
            }
            this.method864(true);
            this.field1729 = true;
        }
        ++field1552;
        if (arg0 >= -12) {
            this.field1734 = true;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(BI)V")
    public final void method887(byte arg0, int arg1) {
        if (arg0 >= 102) {
            if (arg1 != 1) {
                if (~arg1 != -1) {
                    if (arg1 != 2) {
                        if (arg1 == 3) {
                            this.method849((byte) 106, class312.field4469, class759.field10559);
                        } else if (~arg1 == -5) {
                            this.method849((byte) 46, class569.field7475, class569.field7475);
                        }
                    } else {
                        this.method849((byte) 64, class99.field1265, class314.field4479);
                    }
                } else {
                    this.method849((byte) 76, class312.field4469, class312.field4469);
                }
            } else {
                this.method849((byte) 43, class99.field1265, class99.field1265);
            }
            ++field1626;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([IIIIIZ)Lhu;")
    public final class133 method495(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1625;
        return new class599(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(IZ)V")
    public final void method888(int arg0, boolean arg1) {
        if (arg0 != 11073) {
            this.field1835 = null;
        }
        ++field1614;
        if (this.field1807 != arg1) {
            this.field1807 = arg1;
            this.method815(true);
            this.field1746 &= -32;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BB)V")
    public final void method889(byte arg0, byte arg1) {
        this.method870(arg1 | arg1 << 8 | arg1 << 24 | arg1 << 16, false);
        ++field1624;
        if (arg0 <= 56) {
            this.field1816 = 0.8756865F;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZII[BLqda;II)Ltr;")
    public abstract class297 method890(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, class105 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "(B)V")
    public abstract void method891(byte arg0);

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "(I)V")
    public final void method892(int arg0) {
        if (arg0 == -23496) {
            ++field1548;
            if (class562.field7371 != this.field1806) {
                class173 var2 = this.field1806;
                this.field1806 = class562.field7371;
                if (var2.method1217((byte) 0)) {
                    this.method830(8);
                }
                this.field1801 = this.field1802;
                this.field1746 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILku;)V")
    public abstract void method893(int arg0, class380 arg1);

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(ZI)V")
    public abstract void method894(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method895(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[Ltn;)V")
    public final void method460(int arg0, class87[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field1737[var3] = arg1[var3];
        }
        ++field1669;
        this.field1761 = arg0;
        if (this.field1806.method1217((byte) 0)) {
            this.method833(0);
        }
    }

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "(I)I")
    public final int method896(int arg0) {
        ++field1641;
        if (arg0 < 53) {
            this.method921(-2);
        }
        return this.field1810;
    }

    @OriginalMember(owner = "client!rv", name = "EA", descriptor = "(IIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3) {
        ++field1536;
        if (!this.field1753) {
            throw new RuntimeException("");
        } else {
            this.field1810 = arg1;
            this.field1800 = arg0;
            this.field1792 = arg3;
            this.field1756 = arg2;
            if (this.field1733) {
                this.field1775[3].method3152((byte) 117);
                this.field1775[3].method1140(true);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "(I)V")
    public final void method897(int arg0) {
        this.field1713.method1725();
        ++field1688;
        this.field1710 = true;
        if (arg0 != 22551) {
            this.method819(116);
        }
        this.method883(arg0 ^ 22590);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lld;B)V")
    public abstract void method898(class171 arg0, byte arg1);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B[Llm;)Lld;")
    public abstract class171 method899(byte arg0, class502[] arg1);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lrh;Law;IIIII)V")
    public abstract void method900(class268 arg0, class76 arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method901(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(FFFIFFF)Z")
    private final boolean method902(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
        ++field1595;
        if (arg3 != -1) {
            return false;
        } else {
            Buffer var8 = this.field1828.method2599(-4448, true);
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method820((byte) -20, var8);
                if (Stream.method3739()) {
                    var9.method3733(arg1);
                    var9.method3733(arg0);
                    var9.method3733(arg5);
                    var9.method3733(arg4);
                    var9.method3733(arg2);
                    var9.method3733(arg6);
                } else {
                    var9.method3741(arg1);
                    var9.method3741(arg0);
                    var9.method3741(arg5);
                    var9.method3741(arg4);
                    var9.method3741(arg2);
                    var9.method3741(arg6);
                }
                var9.method3734();
                return this.field1828.method2601(-13472);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lofa;)V")
    public final void method481(class333 arg0) {
        this.field1719 = (class615) arg0;
        ++field1701;
        this.field1721.method1712(this.field1719);
        this.field1721.method3357(1);
        this.field1722.method3364((byte) 125, this.field1721);
        this.field1720.method3364((byte) 74, this.field1719);
        if (this.field1806.method1217((byte) 0)) {
            this.method830(8);
        }
    }

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)V")
    public final void method492(int arg0) {
        ++field1603;
    }

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "(I)[F")
    public final float[] method903(int arg0) {
        ++field1613;
        if (arg0 < 63) {
            this.method405(95, -102);
        }
        return this.field1802;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Luj;)V")
    public final void method508(class388 arg0) {
        this.field1784.method2072(this, arg0, -1, 0);
        ++field1652;
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "(IZ)Lam;")
    public abstract class633 method904(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "()Lofa;")
    public final class333 method474() {
        ++field1677;
        return this.field1719;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[BLqda;II)Lop;")
    public abstract class191 method905(int arg0, int arg1, byte[] arg2, class105 arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "(B)V")
    private final void method906(byte arg0) {
        ++field1616;
        this.field1750 = false;
        if (arg0 != 18) {
            this.method909((byte) -92);
        }
        if (class58.field703 == this.field1806) {
            this.method843(true);
            this.method928((byte) -91);
        }
    }

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "(I)V")
    public void method907(int arg0) {
        ++field1543;
        this.method922(-814);
        if (arg0 < 77) {
            this.method402();
        }
    }

    @OriginalMember(owner = "client!rv", name = "Y", descriptor = "()[I")
    public final int[] method469() {
        ++field1636;
        return new int[] { this.field1818, this.field1738, this.field1768, this.field1815 };
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(BZ)V")
    public final void method908(byte arg0, boolean arg1) {
        ++field1545;
        int var3 = -67 / ((arg0 - -34) / 45);
        if (!this.field1781 != !arg1) {
            this.field1781 = arg1;
            this.method815(true);
        }
    }

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "(B)V")
    public abstract void method909(byte arg0);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(CII)C")
    public static final char method910(char arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return (char) 65432;
        } else {
            ++field1691;
            if (~arg0 <= -193 && ~arg0 >= -256) {
                if (~arg0 <= -193 && ~arg0 >= -199) {
                    return 'A';
                }
                if (arg0 == 199) {
                    return 'C';
                }
                if (~arg0 <= -201 && arg0 <= 203) {
                    return 'E';
                }
                if (arg0 >= 204 && ~arg0 >= -208) {
                    return 'I';
                }
                if (arg0 >= 210 && arg0 <= 214) {
                    return 'O';
                }
                if (arg0 >= 217 && ~arg0 >= -221) {
                    return 'U';
                }
                if (~arg0 == -222) {
                    return 'Y';
                }
                if (~arg0 == -224) {
                    return 's';
                }
                if (~arg0 <= -225 && arg0 <= 230) {
                    return 'a';
                }
                if (~arg0 == -232) {
                    return 'c';
                }
                if (arg0 >= 232 && ~arg0 >= -236) {
                    return 'e';
                }
                if (~arg0 <= -237 && arg0 <= 239) {
                    return 'i';
                }
                if (~arg0 <= -243 && arg0 <= 246) {
                    return 'o';
                }
                if (arg0 >= 249 && arg0 <= 252) {
                    return 'u';
                }
                if (arg0 == 253 || arg0 == 255) {
                    return 'y';
                }
            }
            if (~arg0 == -339) {
                return 'O';
            } else if (~arg0 == -340) {
                return 'o';
            } else if (~arg0 == -377) {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILqt;ZZ)V")
    public abstract void method911(int arg0, int arg1, class637 arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "()Z")
    public final boolean method414() {
        ++field1672;
        return true;
    }

    @OriginalMember(owner = "client!rv", name = "N", descriptor = "(I)V")
    public static void method912(int arg0) {
        field1617 = null;
        if (arg0 != 3584) {
            method912(-79);
        }
    }

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "()Z")
    public final boolean method426() {
        ++field1554;
        return true;
    }

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "(B)Ljaa;")
    public final class615 method913(byte arg0) {
        ++field1540;
        if (!this.field1734) {
            this.field1723.method3368(this.field1721, this.field1713);
            this.field1734 = true;
        }
        if (arg0 < 5) {
            this.field1631 = null;
        }
        return this.field1723;
    }

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "(B)V")
    private final void method914(byte arg0) {
        this.field1825 = this.method904(106, false);
        ++field1690;
        this.field1825.method2603(12, -30987, 3096);
        int var2 = 0;
        int var3 = -105 / ((30 - arg0) / 48);
        while (var2 < 4) {
            Buffer var4 = this.field1825.method2599(-4448, true);
            if (var4 != null) {
                Stream var5 = this.method820((byte) -20, var4);
                var5.method3733(0.0F);
                var5.method3733(0.0F);
                var5.method3733(0.0F);
                for (int var6 = 0; var6 <= 256; ++var6) {
                    double var7 = (double) (var6 * 2) * 3.141592653589793D / 256.0D;
                    float var9 = (float) Math.cos(var7);
                    float var10 = (float) Math.sin(var7);
                    if (Stream.method3739()) {
                        var5.method3733(var10);
                        var5.method3733(var9);
                        var5.method3733(0.0F);
                    } else {
                        var5.method3741(var10);
                        var5.method3741(var9);
                        var5.method3741(0.0F);
                    }
                }
                var5.method3734();
                if (this.field1825.method2601(-13472)) {
                    break;
                }
            }
            ++var2;
        }
        this.field1834 = this.method899((byte) -128, new class502[] { new class502(class143.field2281) });
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(BI)V")
    public abstract void method915(byte arg0, int arg1);

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method484(Canvas arg0, int arg1, int arg2) {
        ++field1665;
        Object var4 = null;
        if (arg0 != null && this.field1566 != arg0) {
            if (this.field1572.containsKey(arg0)) {
                var4 = this.field1572.get(arg0);
            }
        } else {
            var4 = this.field1581;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method901(var4, arg0, 117);
            if (this.field1569 == arg0) {
                this.method874(31388);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "O", descriptor = "(I)Ljaa;")
    public final class615 method916(int arg0) {
        ++field1527;
        if (arg0 != 0) {
            this.field1773 = 51;
        }
        return this.field1741[this.field1779];
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method917(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(BZ)V")
    public final void method918(byte arg0, boolean arg1) {
        if (arg0 < 52) {
            this.field1767 = null;
        }
        ++field1556;
        if (this.field1758 != arg1) {
            this.field1758 = arg1;
            this.method834((byte) 126);
        }
    }

    @OriginalMember(owner = "client!rv", name = "X", descriptor = "(I)V")
    public final void method479(int arg0) {
        ++field1655;
        this.field1728 = 0;
        while (arg0 > 1) {
            ++this.field1728;
            arg0 >>= 1;
        }
        this.field1765 = 1 << this.field1728;
    }

    @OriginalMember(owner = "client!rv", name = "P", descriptor = "(I)V")
    public final void method919(int arg0) {
        if (arg0 != 6) {
            this.field1809 = null;
        }
        this.method892(-23496);
        ++field1651;
        this.method928((byte) -90);
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(IIIIII)Ltea;")
    public final class241 method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1551;
        return new class526(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rv", name = "Q", descriptor = "(I)V")
    public abstract void method920(int arg0);

    @OriginalMember(owner = "client!rv", name = "aa", descriptor = "(IIIIII)V")
    public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1694;
        this.method885(20719);
        this.method870(arg4, false);
        this.method840(0, 26, class362.field5101);
        this.method845(class362.field5101, (byte) 115, 0);
        this.method836(-129, arg5);
        this.field1713.method3366((float) arg3, (float) arg2, 1.0F, (byte) -49);
        this.field1713.method1730(arg0, arg1, 0);
        this.method842(68);
        this.method894(false, -127);
        this.method880(64);
        this.method894(true, -123);
        this.method845(class454.field6199, (byte) 95, 0);
        this.method840(0, -77, class454.field6199);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIF)Ltn;")
    public final class87 method413(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field1535;
        return new class591(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Lza;")
    public final class418 method408(int arg0) {
        ++field1534;
        class112 var2 = new class112(arg0);
        this.field1529.method11(var2, -106);
        return var2;
    }

    @OriginalMember(owner = "client!rv", name = "R", descriptor = "(I)V")
    public final void method921(int arg0) {
        ++field1676;
        Enumeration var2 = this.field1572.keys();
        while (var2.hasMoreElements()) {
            Canvas var4 = (Canvas) var2.nextElement();
            this.method895(var4, (byte) 115, this.field1572.get(var4));
        }
        this.field1843.method588(false);
        this.field1828.method588(false);
        this.field1825.method588(false);
        this.field1838.method3314(13783);
        int var3 = 55 / ((-49 - arg0) / 61);
        this.field1836.method3314(13783);
        this.field1827.method3314(13783);
        this.field1826.method3314(13783);
        this.field1845.method3314(13783);
        this.field1784.method2079((byte) -127);
        this.field1844.method588(false);
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lwu;II)V")
    public class111(Canvas arg0, Object arg1, class152 arg2, class376 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field1581 = this.field1577 = arg1;
            this.field1680 = arg3;
            this.field1569 = this.field1566 = arg0;
            this.field1778 = arg4;
            Dimension var7 = arg0.getSize();
            this.field1559 = this.field1629 = var7.width;
            this.field1528 = this.field1657 = var7.height;
            this.field1823 = arg5;
            class60.method519(false, true, true);
            if (super.field717 == null) {
                this.field1570 = new NativeInterface(0, this.field1823);
                this.field1819 = null;
            } else {
                this.field1819 = new class294(this, super.field717);
                this.field1570 = new NativeInterface(super.field717.method90(31363), this.field1823);
                for (int var8 = 0; ~super.field717.method90(31363) < ~var8; ++var8) {
                    class758 var9 = super.field717.method91(var8, (byte) 125);
                    if (var9 != null) {
                        this.field1570.initTextureMetrics(var8, var9.field10542, var9.field10537);
                    }
                }
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method487(32);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method395(Canvas arg0, int arg1, int arg2) {
        ++field1575;
        if (this.field1566 == arg0) {
            throw new RuntimeException();
        } else if (!this.field1572.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method917((byte) 3, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field1572.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "S", descriptor = "(I)V")
    private final void method922(int arg0) {
        ++field1708;
        this.method854(true);
        this.method891((byte) -115);
        this.method865((byte) 118);
        this.method833(arg0 + 814);
        this.method859((byte) -124);
        this.method939((byte) -32);
        this.method834((byte) 120);
        this.method837(arg0 ^ -5701);
        this.method869(arg0 + 732);
        this.method815(true);
        this.method935(16);
        if (arg0 != -814) {
            this.field1745 = -19;
        }
        this.method841(true);
        this.method932(false);
        this.method924(106);
        for (int var2 = this.field1808 - 1; var2 >= 0; --var2) {
            this.method934(var2, (byte) -65);
            this.method931(false);
            this.method945((byte) 119);
            this.method819(-72);
        }
        this.method848((byte) -116);
        this.method863(26588);
        this.method831((byte) 119);
        this.method943(true);
        this.method909((byte) 107);
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(ZI)V")
    public final void method923(boolean arg0, int arg1) {
        if (arg1 != 23394) {
            this.field1739 = 60;
        }
        if (!arg0 != !this.field1783) {
            this.field1783 = arg0;
            this.method837(5481);
            this.field1746 &= -32;
        }
        ++field1673;
    }

    @OriginalMember(owner = "client!rv", name = "T", descriptor = "(I)V")
    public abstract void method924(int arg0);

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "(Z)V")
    public final void method925(boolean arg0) {
        if (!arg0) {
            this.field1832 = null;
        }
        ++field1555;
        if (this.field1746 != 2) {
            this.method860(2963);
            this.method888(11073, false);
            this.method817(false, -8043);
            this.method923(false, 23394);
            this.method844((byte) 36, false);
            this.method856(-2, 119, false, false);
            this.field1746 = 2;
        }
    }

    @OriginalMember(owner = "client!rv", name = "U", descriptor = "(I)V")
    public abstract void method926(int arg0);

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "()Z")
    public final boolean method391() {
        ++field1628;
        return true;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[IBZI)Ltr;")
    public final class297 method927(int arg0, int[] arg1, byte arg2, boolean arg3, int arg4) {
        ++field1580;
        if (arg2 >= -32) {
            this.field1784 = null;
        }
        return this.method850(0, arg1, arg0, arg3, 0, arg4, -71);
    }

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "(B)V")
    private final void method928(byte arg0) {
        int var2 = -108 / ((arg0 - 20) / 63);
        this.method831((byte) 118);
        ++field1695;
        if (this.field1744 != null) {
            this.field1744.method1142(4095);
        }
    }

    @OriginalMember(owner = "client!rv", name = "V", descriptor = "(I)I")
    public final int method929(int arg0) {
        ++field1706;
        if (arg0 >= -87) {
            this.field1837 = null;
        }
        return this.field1756;
    }

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "([I)V")
    public final void method393(int[] arg0) {
        arg0[0] = this.field1780;
        arg0[3] = this.field1726;
        arg0[2] = this.field1739;
        ++field1532;
        arg0[1] = this.field1789;
    }

    @OriginalMember(owner = "client!rv", name = "P", descriptor = "(IIIII)V")
    public final void method428(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method412(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field1653;
    }

    @OriginalMember(owner = "client!rv", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1606;
    }

    @OriginalMember(owner = "client!rv", name = "W", descriptor = "(I)V")
    private final void method930(int arg0) {
        if (class169.field2604 != this.field1806) {
            class173 var2 = this.field1806;
            this.field1806 = class169.field2604;
            if (!var2.method1217((byte) 0)) {
                this.method830(8);
            }
            this.method886(-85);
            this.field1801 = this.field1727;
            this.method928((byte) -108);
            this.field1746 &= -8;
        }
        if (arg0 == -8) {
            ++field1574;
        }
    }

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "(Z)V")
    public abstract void method931(boolean arg0);

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "(Z)V")
    public abstract void method932(boolean arg0);

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "(B)V")
    public abstract void method933(byte arg0);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)V")
    public final void method934(int arg0, byte arg1) {
        ++field1558;
        if (this.field1779 != arg0) {
            this.field1779 = arg0;
            this.method933((byte) -13);
        }
        if (arg1 != -65) {
            this.method878(-67, (class485) null);
        }
    }

    @OriginalMember(owner = "client!rv", name = "Y", descriptor = "(I)V")
    public abstract void method935(int arg0);

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "(B)V")
    private final void method936(byte arg0) {
        this.field1729 = false;
        ++field1661;
        if (arg0 >= -15) {
            this.field1680 = null;
        }
        this.method886(-90);
        if (class169.field2604 == this.field1806) {
            this.method928((byte) -72);
        }
    }

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "(B)V")
    private final void method937(byte arg0) {
        if (class62.field759 != this.field1806) {
            class173 var2 = this.field1806;
            this.field1806 = class62.field759;
            if (!var2.method1217((byte) 0)) {
                this.method830(8);
            }
            this.method877(true);
            this.field1801 = this.field1790;
            this.method928((byte) -75);
            this.field1746 &= -8;
        }
        if (arg0 != -65) {
            this.method819(-81);
        }
        ++field1700;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lns;Lqda;I)Z")
    public abstract boolean method938(class408 arg0, class105 arg1, int arg2);

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "(B)V")
    public abstract void method939(byte arg0);

    @OriginalMember(owner = "client!rv", name = "Z", descriptor = "(I)V")
    private final void method940(int arg0) {
        ++field1671;
        if (this.field1744 != null) {
            this.field1744.method1140(true);
        }
        this.method935(16);
        if (arg0 != 0) {
            this.peer = -94L;
        }
    }

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "(B)V")
    private final void method941(byte arg0) {
        if (arg0 >= -88) {
            this.method448();
        }
        ++field1557;
        this.field1843 = this.method904(118, false);
        this.field1843.method2603(28, -30987, 140);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field1843.method2599(-4448, true);
            if (var3 != null) {
                Stream var4 = this.method820((byte) -20, var3);
                if (!Stream.method3739()) {
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(1.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(1.0F);
                    var4.method3741(0.0F);
                    var4.method3741(1.0F);
                    var4.method3741(1.0F);
                    var4.method3741(1.0F);
                    var4.method3741(0.0F);
                    var4.method3741(1.0F);
                    var4.method3741(1.0F);
                    var4.method3741(1.0F);
                    var4.method3741(1.0F);
                    var4.method3741(1.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(1.0F);
                    var4.method3741(0.0F);
                    var4.method3741(1.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                    var4.method3741(0.0F);
                } else {
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(1.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(1.0F);
                    var4.method3733(0.0F);
                    var4.method3733(1.0F);
                    var4.method3733(1.0F);
                    var4.method3733(1.0F);
                    var4.method3733(0.0F);
                    var4.method3733(1.0F);
                    var4.method3733(1.0F);
                    var4.method3733(1.0F);
                    var4.method3733(1.0F);
                    var4.method3733(1.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(1.0F);
                    var4.method3733(0.0F);
                    var4.method3733(1.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                    var4.method3733(0.0F);
                }
                var4.method3734();
                if (this.field1843.method2601(-13472)) {
                    break;
                }
            }
        }
        this.field1842 = this.method899((byte) 17, new class502[] { new class502(new class143[] { class143.field2281, class143.field2285, class143.field2285 }) });
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[I[I)Laa;")
    public final class490 method506(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field1683;
        return class312.method1913(arg2, 0, this, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "(Z)V")
    public abstract void method942(boolean arg0);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8) {
        ++field1678;
    }

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "(Z)V")
    public abstract void method943(boolean arg0);

    @OriginalMember(owner = "client!rv", name = "DA", descriptor = "(IIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3) {
        ++field1637;
        this.field1818 = arg0;
        this.field1738 = arg1;
        this.field1815 = arg3;
        this.field1768 = arg2;
        this.method875(true);
        this.method936((byte) -18);
        this.method892(-23496);
        this.method816(8652);
    }

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "(B)V")
    public final void method944(byte arg0) {
        ++field1530;
        if (arg0 != -77) {
            this.method899((byte) 53, (class502[]) null);
        }
        if (this.field1746 != 8) {
            this.method930(-8);
            this.method888(11073, true);
            this.method923(true, 23394);
            this.method844((byte) 36, true);
            this.method836(-129, 1);
            this.field1746 = 8;
        }
    }

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "(B)V")
    public abstract void method945(byte arg0);

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "(B)V")
    public final void method946(byte arg0) {
        ++field1591;
        if (arg0 > -9) {
            this.field1740 = -0.39482835F;
        }
        if (~this.field1746 != -17) {
            this.method937((byte) -65);
            this.method888(11073, true);
            this.method923(true, 23394);
            this.method844((byte) 36, true);
            this.method836(-129, 1);
            this.field1746 = 16;
        }
    }

    @OriginalMember(owner = "client!rv", name = "ab", descriptor = "(I)I")
    public final int method947(int arg0) {
        if (arg0 != -8) {
            this.method479(57);
        }
        ++field1684;
        return this.field1800;
    }

    @OriginalMember(owner = "client!rv", name = "ra", descriptor = "(IIII)V")
    public final void method490(int arg0, int arg1, int arg2, int arg3) {
        this.field1753 = true;
        this.field1792 = arg3;
        this.field1756 = arg2;
        this.field1800 = arg0;
        ++field1646;
        this.field1810 = arg1;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lrc;[Ljn;Z)Lda;")
    public final class60 method425(class539 arg0, class720[] arg1, boolean arg2) {
        ++field1567;
        return new class570(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public final void method420(int arg0) {
        ++field1546;
        if (arg0 >= 128 && arg0 <= 1024) {
            if (this.field1819 != null) {
                this.field1819.method1825(1000);
            }
            this.field1725 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "()Lofa;")
    public final class333 method451() {
        ++field1576;
        return this.field1831;
    }

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "(ILaa;II)V")
    public final void method432(int arg0, class490 arg1, int arg2, int arg3) {
        ++field1579;
        class431 var5 = (class431) arg1;
        class297 var6 = var5.field5937;
        this.method925(true);
        this.method823(var6, -8423);
        this.method836(-129, 1);
        this.method849((byte) 40, class99.field1265, class99.field1265);
        this.method840(0, 80, class362.field5101);
        this.method870(arg0, false);
        this.field1713.method3366((float) this.field1528, (float) this.field1559, 0.0F, (byte) -49);
        this.method842(85);
        this.field1741[0].method3366(var6.method597((float) this.field1528, -113), var6.method591(-2092, (float) this.field1559), 1.0F, (byte) -49);
        this.field1741[0].method3353(var6.method591(-2092, (float) (-arg2)), 0.0F, var6.method597((float) (-arg3), -95), 13);
        this.field1788[0] = class91.field1105;
        this.method847(1);
        this.method880(-123);
        this.method819(-83);
        this.method840(0, -118, class454.field6199);
    }

    @OriginalMember(owner = "client!rv", name = "bb", descriptor = "(I)V")
    public final void method948(int arg0) {
        ++field1660;
        if (arg0 > -38) {
            this.method909((byte) -95);
        }
        Hashtable var2 = new Hashtable();
        if (this.field1572 != null && !this.field1572.isEmpty()) {
            Enumeration var3 = this.field1572.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method917((byte) 3, var4));
            }
        }
        this.field1572 = var2;
        this.method941((byte) -121);
        this.method862(12);
        this.method914((byte) -76);
        this.field1784.method2073(107, this);
    }

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "(III)V")
    public final void method476(int arg0, int arg1, int arg2) {
        ++field1578;
        if (~this.field1786 != ~arg0 || ~this.field1730 != ~arg1 || ~this.field1795 != ~arg2) {
            this.field1795 = arg2;
            this.field1730 = arg1;
            this.field1786 = arg0;
            this.method940(0);
            this.method815(true);
        }
    }

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "(IIIIIII)I")
    public final int method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1696;
        int var8 = 0;
        float var9 = (float) arg2 * this.field1719.field8225 + (float) arg0 * this.field1719.field8199 + (float) arg1 * this.field1719.field8215 + this.field1719.field8177;
        float var10 = (float) arg5 * this.field1719.field8225 + (float) arg3 * this.field1719.field8199 + (float) arg4 * this.field1719.field8215 + this.field1719.field8177;
        if ((float) this.field1745 > var9 && (float) this.field1745 > var10) {
            var8 |= 16;
        } else if ((float) this.field1736 < var9 && var10 > (float) this.field1736) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field1719.field8197 + (float) arg0 * this.field1719.field8182 + (float) arg1 * this.field1719.field8221 + this.field1719.field8204) * (float) this.field1768 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field1719.field8197 + (float) arg3 * this.field1719.field8182 + (float) arg4 * this.field1719.field8221 + this.field1719.field8204) * (float) this.field1768 / (float) arg6);
        if (this.field1785 > (float) var11 && this.field1785 > (float) var12) {
            var8 |= 1;
        } else if (this.field1763 < (float) var11 && this.field1763 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field1719.field8195 + (float) arg0 * this.field1719.field8184 + (float) arg1 * this.field1719.field8208 + this.field1719.field8186) * (float) this.field1815 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field1719.field8195 + (float) arg3 * this.field1719.field8184 + (float) arg4 * this.field1719.field8208 + this.field1719.field8186) * (float) this.field1815 / (float) arg6);
        if (this.field1732 > (float) var13 && this.field1732 > (float) var14) {
            var8 |= 4;
        } else if (this.field1740 < (float) var13 && (float) var14 > this.field1740) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!rv", name = "XA", descriptor = "()I")
    public final int method402() {
        ++field1601;
        return this.field1736;
    }
}
