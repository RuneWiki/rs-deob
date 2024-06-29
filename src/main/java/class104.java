import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class104 extends class90 implements class146 {

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Lp;")
    private class445 field1605 = new class445();

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Lpo;")
    private class202 field1607 = new class385();

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public int field1608 = 8;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Z")
    private boolean field1610 = false;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    private int field1615 = -1;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public int field1619 = 3;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "[Lep;")
    private class146[] field1618 = new class146[4];

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "Lvq;")
    private class22 field1612 = new class22();

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "Lvq;")
    private class22 field1621 = new class22();

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Lvq;")
    private class22 field1622 = new class22();

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Lvq;")
    private class22 field1623 = new class22();

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "Lvq;")
    private class22 field1624 = new class22();

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lvq;")
    private class22 field1625 = new class22();

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lvq;")
    private class22 field1626 = new class22();

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "I")
    public int field1639 = -1;

    @OriginalMember(owner = "client!ge", name = "Jb", descriptor = "Z")
    private boolean field1662 = true;

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
    public int field1640 = 3584;

    @OriginalMember(owner = "client!ge", name = "ac", descriptor = "I")
    private int field1679 = -1;

    @OriginalMember(owner = "client!ge", name = "ic", descriptor = "F")
    public float field1687 = 1.0F;

    @OriginalMember(owner = "client!ge", name = "Tb", descriptor = "F")
    public float field1672 = 3584.0F;

    @OriginalMember(owner = "client!ge", name = "Db", descriptor = "I")
    public int field1656 = 512;

    @OriginalMember(owner = "client!ge", name = "Xb", descriptor = "I")
    private int field1676 = 8448;

    @OriginalMember(owner = "client!ge", name = "mc", descriptor = "I")
    public int field1691 = 50;

    @OriginalMember(owner = "client!ge", name = "Cc", descriptor = "F")
    private float field1707 = 1.0F;

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "[F")
    private float[] field1633 = new float[16];

    @OriginalMember(owner = "client!ge", name = "Zb", descriptor = "I")
    private int field1678 = -1;

    @OriginalMember(owner = "client!ge", name = "Sb", descriptor = "[F")
    private float[] field1671 = new float[4];

    @OriginalMember(owner = "client!ge", name = "rc", descriptor = "[F")
    private float[] field1696 = new float[4];

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    public int field1630 = -1;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "F")
    public float field1628 = 1.0F;

    @OriginalMember(owner = "client!ge", name = "yc", descriptor = "I")
    private int field1703 = 0;

    @OriginalMember(owner = "client!ge", name = "Hb", descriptor = "I")
    private int field1660 = 0;

    @OriginalMember(owner = "client!ge", name = "lc", descriptor = "I")
    public int field1690 = 512;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public int field1632 = 0;

    @OriginalMember(owner = "client!ge", name = "Hc", descriptor = "F")
    public float field1712 = 1.0F;

    @OriginalMember(owner = "client!ge", name = "sc", descriptor = "F")
    public float field1697 = 3584.0F;

    @OriginalMember(owner = "client!ge", name = "wc", descriptor = "F")
    public float field1701 = -1.0F;

    @OriginalMember(owner = "client!ge", name = "Mb", descriptor = "I")
    private int field1665 = 0;

    @OriginalMember(owner = "client!ge", name = "Bc", descriptor = "I")
    public int field1706 = -1;

    @OriginalMember(owner = "client!ge", name = "Cb", descriptor = "I")
    private int field1655 = 0;

    @OriginalMember(owner = "client!ge", name = "Dc", descriptor = "[F")
    private float[] field1708 = new float[4];

    @OriginalMember(owner = "client!ge", name = "Gc", descriptor = "F")
    public float field1711 = -1.0F;

    @OriginalMember(owner = "client!ge", name = "Xc", descriptor = "I")
    private int field1728 = 0;

    @OriginalMember(owner = "client!ge", name = "Qc", descriptor = "I")
    private int field1721 = 0;

    @OriginalMember(owner = "client!ge", name = "dd", descriptor = "I")
    private int field1734 = 8448;

    @OriginalMember(owner = "client!ge", name = "bd", descriptor = "I")
    private int field1732 = 0;

    @OriginalMember(owner = "client!ge", name = "ed", descriptor = "F")
    private float field1735 = 1.0F;

    @OriginalMember(owner = "client!ge", name = "Yc", descriptor = "I")
    public int field1729 = 0;

    @OriginalMember(owner = "client!ge", name = "qc", descriptor = "F")
    private float field1695 = 0.0F;

    @OriginalMember(owner = "client!ge", name = "Jc", descriptor = "[F")
    public float[] field1714 = new float[4];

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1596;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Lcj;")
    public class181 field1606;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Ljaggl/context;")
    private context field1603;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Ljaggl/opengl;")
    public opengl field1604;

    @OriginalMember(owner = "client!ge", name = "Wc", descriptor = "Z")
    public boolean field1727;

    @OriginalMember(owner = "client!ge", name = "Ec", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!ge", name = "Zc", descriptor = "Ljava/lang/String;")
    private String field1730;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "Ljava/lang/String;")
    private String field1629;

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "Z")
    private boolean field1643;

    @OriginalMember(owner = "client!ge", name = "Kc", descriptor = "Z")
    public boolean field1715;

    @OriginalMember(owner = "client!ge", name = "Ob", descriptor = "Z")
    public boolean field1667;

    @OriginalMember(owner = "client!ge", name = "oc", descriptor = "Z")
    private boolean field1693;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "Z")
    public boolean field1635;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Lwi;")
    public class213 field1597;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lkb;")
    private class80 field1594;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Laa;")
    private class274 field1601;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Lgh;")
    private class38 field1598;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1595 = Boolean.FALSE;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "[F")
    private static float[] field1600 = new float[4];

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "[I")
    private static int[] field1602 = new int[1000];

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "[F")
    private static float[] field1599 = new float[4];

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "F")
    private float field1638;

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "F")
    public float field1641;

    @OriginalMember(owner = "client!ge", name = "ub", descriptor = "F")
    public float field1647;

    @OriginalMember(owner = "client!ge", name = "wb", descriptor = "F")
    public float field1649;

    @OriginalMember(owner = "client!ge", name = "Bb", descriptor = "F")
    private float field1654;

    @OriginalMember(owner = "client!ge", name = "Gb", descriptor = "F")
    public float field1659;

    @OriginalMember(owner = "client!ge", name = "Kb", descriptor = "F")
    private float field1663;

    @OriginalMember(owner = "client!ge", name = "dc", descriptor = "F")
    public float field1682;

    @OriginalMember(owner = "client!ge", name = "ec", descriptor = "F")
    public float field1683;

    @OriginalMember(owner = "client!ge", name = "zc", descriptor = "F")
    public float field1704;

    @OriginalMember(owner = "client!ge", name = "fd", descriptor = "F")
    public float field1736;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!ge", name = "zb", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!ge", name = "Ab", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!ge", name = "Pb", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "client!ge", name = "Ub", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!ge", name = "gc", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!ge", name = "xc", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "client!ge", name = "Fc", descriptor = "I")
    private int field1710;

    @OriginalMember(owner = "client!ge", name = "Mc", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!ge", name = "Nc", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!ge", name = "ad", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!ge", name = "cd", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!ge", name = "gd", descriptor = "I")
    private int field1737;

    @OriginalMember(owner = "client!ge", name = "hd", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!ge", name = "xb", descriptor = "J")
    private long field1650;

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "Ljd;")
    public class130 field1642;

    @OriginalMember(owner = "client!ge", name = "Ib", descriptor = "Lbi;")
    private class138 field1661;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Lep;")
    private class146 field1613;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "Ljm;")
    private class160 field1631;

    @OriginalMember(owner = "client!ge", name = "bc", descriptor = "Ljm;")
    private class160 field1680;

    @OriginalMember(owner = "client!ge", name = "vc", descriptor = "Ljm;")
    private class160 field1700;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "Llb;")
    public class208 field1627;

    @OriginalMember(owner = "client!ge", name = "Ac", descriptor = "Llb;")
    public class208 field1705;

    @OriginalMember(owner = "client!ge", name = "Vc", descriptor = "Llb;")
    public class208 field1726;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "Luq;")
    private class233 field1637;

    @OriginalMember(owner = "client!ge", name = "yb", descriptor = "Lgp;")
    private class259 field1651;

    @OriginalMember(owner = "client!ge", name = "Wb", descriptor = "Lgp;")
    public class259 field1675;

    @OriginalMember(owner = "client!ge", name = "tb", descriptor = "Lef;")
    private class343 field1646;

    @OriginalMember(owner = "client!ge", name = "vb", descriptor = "Lfl;")
    public class385 field1648;

    @OriginalMember(owner = "client!ge", name = "jc", descriptor = "Lfl;")
    public class385 field1688;

    @OriginalMember(owner = "client!ge", name = "Qb", descriptor = "Lrh;")
    public class70 field1669;

    @OriginalMember(owner = "client!ge", name = "cc", descriptor = "Lrh;")
    public class70 field1681;

    @OriginalMember(owner = "client!ge", name = "kc", descriptor = "Lrh;")
    public class70 field1689;

    @OriginalMember(owner = "client!ge", name = "tc", descriptor = "Lrh;")
    public class70 field1698;

    @OriginalMember(owner = "client!ge", name = "Rc", descriptor = "Lrh;")
    public class70 field1722;

    @OriginalMember(owner = "client!ge", name = "Uc", descriptor = "Lrh;")
    public class70 field1725;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "Z")
    private boolean field1636;

    @OriginalMember(owner = "client!ge", name = "sb", descriptor = "Z")
    public boolean field1645;

    @OriginalMember(owner = "client!ge", name = "Eb", descriptor = "Z")
    public boolean field1657;

    @OriginalMember(owner = "client!ge", name = "Fb", descriptor = "Z")
    private boolean field1658;

    @OriginalMember(owner = "client!ge", name = "Lb", descriptor = "Z")
    public boolean field1664;

    @OriginalMember(owner = "client!ge", name = "Nb", descriptor = "Z")
    public boolean field1666;

    @OriginalMember(owner = "client!ge", name = "Vb", descriptor = "Z")
    private boolean field1674;

    @OriginalMember(owner = "client!ge", name = "Yb", descriptor = "Z")
    public boolean field1677;

    @OriginalMember(owner = "client!ge", name = "fc", descriptor = "Z")
    private boolean field1684;

    @OriginalMember(owner = "client!ge", name = "hc", descriptor = "Z")
    private boolean field1686;

    @OriginalMember(owner = "client!ge", name = "nc", descriptor = "Z")
    private boolean field1692;

    @OriginalMember(owner = "client!ge", name = "uc", descriptor = "Z")
    private boolean field1699;

    @OriginalMember(owner = "client!ge", name = "Ic", descriptor = "Z")
    public boolean field1713;

    @OriginalMember(owner = "client!ge", name = "Lc", descriptor = "Z")
    private boolean field1716;

    @OriginalMember(owner = "client!ge", name = "Oc", descriptor = "Z")
    private boolean field1719;

    @OriginalMember(owner = "client!ge", name = "Pc", descriptor = "Z")
    private boolean field1720;

    @OriginalMember(owner = "client!ge", name = "Sc", descriptor = "Z")
    private boolean field1723;

    @OriginalMember(owner = "client!ge", name = "Tc", descriptor = "Z")
    private boolean field1724;

    @OriginalMember(owner = "client!ge", name = "rb", descriptor = "[Ljm;")
    private class160[] field1644;

    @OriginalMember(owner = "client!ge", name = "pc", descriptor = "[Lmo;")
    private class195[] field1694;

    @OriginalMember(owner = "client!ge", name = "Rb", descriptor = "[Z")
    private boolean[] field1670;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([I)V")
    public final void method708(int[] arg0) {
        arg0[0] = this.field1732;
        arg0[1] = this.field1655;
        arg0[2] = this.field1703;
        arg0[3] = this.field1728;
    }

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "()V")
    private final void method853() {
        field1599[0] = this.field1712 * this.field1683;
        field1599[1] = this.field1687 * this.field1683;
        field1599[2] = this.field1683 * this.field1628;
        field1599[3] = 1.0F;
        this.field1604.glLightModelfv(2899, field1599, 0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljm;)V")
    public final void method854(class160 arg0) {
        class233 var2 = arg0.field2431;
        this.method872(var2);
        var2.method1275(arg0);
        this.field1631 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(Z)V")
    public final void method855(boolean arg0) {
        if (this.field1724 != arg0) {
            this.field1724 = arg0;
            this.method871();
        }
    }

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "()Lca;")
    public final class414 method856() {
        return this.field1661 == null ? null : this.field1661.method1123((byte) 11);
    }

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "()F")
    public final float method689() {
        return this.field1682;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    public final void method857(int arg0) {
        if (this.field1717 != arg0) {
            this.field1604.glActiveTexture(arg0 + 33984);
            this.field1717 = arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)V")
    public final synchronized void method858(int arg0, int arg1) {
        class9 var3 = new class9(arg1);
        var3.field499 = (long) arg0;
        this.field1621.method148((byte) 109, var3);
    }

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "()Lep;")
    public final class146 method859() {
        return this.field1613;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
    public final void method860() {
    }

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "()I")
    public final int method737() {
        int var1 = this.field1738;
        this.field1738 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "()V")
    private final void method861() {
        field1599[0] = this.field1712 * this.field1701;
        field1599[1] = this.field1701 * this.field1687;
        field1599[2] = this.field1701 * this.field1628;
        field1599[3] = 1.0F;
        this.field1604.glLightfv(16384, 4609, field1599, 0);
        field1599[0] = -this.field1711 * this.field1712;
        field1599[1] = -this.field1711 * this.field1687;
        field1599[2] = -this.field1711 * this.field1628;
        field1599[3] = 1.0F;
        this.field1604.glLightfv(16385, 4609, field1599, 0);
    }

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "()V")
    public final void method862() {
        this.field1604.glLightfv(16384, 4611, this.field1696, 0);
        this.field1604.glLightfv(16385, 4611, this.field1671, 0);
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
    public final void method863(int arg0) {
        field1599[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field1599[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field1599[2] = (float) (arg0 & 0xFF) / 255.0F;
        field1599[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field1604.glTexEnvfv(8960, 8705, field1599, 0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII)V")
    public final void method696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1604.glLineWidth((float) arg5);
        this.method762(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field1604.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(Z)V")
    public final void method864(boolean arg0) {
        if (this.field1674 != arg0) {
            this.field1674 = arg0;
            this.method865();
            this.field1710 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()Z")
    public final boolean method670() {
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "()Z")
    public final boolean method763() {
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "()V")
    private final void method865() {
        this.field1604.glDepthMask(this.field1674 && this.field1662);
    }

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "()V")
    public final void method866() {
        if (this.field1710 == 16) {
            return;
        }
        this.method921();
        this.method867(true);
        this.method913(true);
        this.method864(true);
        this.method868(1);
        this.method884(1);
        this.field1710 = 16;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(Z)V")
    public final void method867(boolean arg0) {
        if (this.field1699 != arg0) {
            this.field1699 = arg0;
            this.method906();
            this.field1710 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(IIIIII)V")
    public final void method711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method909();
        this.method868(arg5);
        this.field1604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1719) {
            this.field1604.glDisable(32925);
        }
        this.field1604.glBegin(2);
        this.field1604.glVertex2f(var7, var8);
        this.field1604.glVertex2f(var7, var10);
        this.field1604.glVertex2f(var9, var10);
        this.field1604.glVertex2f(var9, var8);
        this.field1604.glEnd();
        if (this.field1719) {
            this.field1604.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)V")
    public final void method868(int arg0) {
        if (this.field1653 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 2;
            var3 = false;
            var4 = true;
        } else if (arg0 == 129) {
            var2 = 3;
            var3 = false;
            var4 = true;
        } else if (arg0 == 130) {
            var2 = 4;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field1658 != var3) {
            this.field1604.glColorMask(var3, var3, var3, true);
            this.field1658 = var3;
        }
        if (this.field1686 != var4) {
            if (var4) {
                this.field1604.glEnable(3008);
            } else {
                this.field1604.glDisable(3008);
            }
            this.field1686 = var4;
        }
        if (this.field1718 != var2) {
            if (var2 == 1) {
                this.field1604.glEnable(3042);
                this.field1604.glBlendEquation(32774);
                this.field1604.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field1604.glEnable(3042);
                this.field1604.glBlendEquation(32774);
                this.field1604.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field1604.glEnable(3042);
                this.field1604.glBlendEquation(32778);
                this.field1604.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field1604.glEnable(3042);
                this.field1604.glBlendEquation(32774);
                this.field1604.glBlendFunc(774, 1);
            } else {
                this.field1604.glDisable(3042);
            }
            this.field1718 = var2;
        }
        this.field1653 = arg0;
        this.field1710 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[Luc;)V")
    public final void method755(int arg0, class59[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class59 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field1600[0] = (float) var4.field942;
            field1600[1] = (float) var4.field944;
            field1600[2] = (float) var4.field945;
            field1600[3] = 1.0F;
            this.field1604.glLightfv(var5, 4611, field1600, 0);
            int var6 = var4.field948;
            float var7 = var4.field941 / 255.0F;
            field1600[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field1600[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field1600[2] = (float) (var6 & 0xFF) * var7;
            this.field1604.glLightfv(var5, 4609, field1600, 0);
            this.field1604.glLightf(var5, 4617, 1.0F / (float) (var4.field943 * var4.field943));
            this.field1604.glEnable(var5);
        }
        while (var3 < this.field1665) {
            this.field1604.glDisable(var3 + 16386);
            var3++;
        }
        this.field1665 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public final void method706(int arg0) {
        this.method868(0);
        this.field1604.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field1604.glClear(16384);
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(IIIII)V")
    public final void method750(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Lrc;Lpo;[Ltc;I)V")
    public final void method756(class100[] arg0, class202 arg1, class290[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method530(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "()V")
    public final void method722() {
        int var1 = this.field1732;
        int var2 = this.field1703;
        int var3 = this.field1655;
        int var4 = this.field1728;
        this.method751();
        this.field1604.glReadBuffer(1028);
        this.field1604.glDrawBuffer(1029);
        this.method897();
        this.method867(false);
        this.method911(false);
        this.method913(false);
        this.method864(false);
        this.method929((class195) null);
        this.method899(-2);
        this.method884(0);
        this.method868(0);
        this.field1604.glMatrixMode(5889);
        this.field1604.glLoadIdentity();
        this.field1604.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field1604.glMatrixMode(5888);
        this.field1604.glLoadIdentity();
        this.field1604.glRasterPos2i(0, 0);
        this.field1604.glCopyPixels(0, 0, this.field1611, this.field1617, 6144);
        this.field1604.glFlush();
        this.field1604.glReadBuffer(1029);
        this.field1604.glDrawBuffer(1029);
        this.method752(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lep;)V")
    public final void method869(class146 arg0) {
        if (this.field1615 < 0 || this.field1618[this.field1615] != arg0) {
            throw new RuntimeException();
        }
        this.field1618[this.field1615--] = null;
        arg0.method904();
        if (this.field1615 >= 0) {
            this.field1613 = this.field1618[this.field1615];
            this.field1613.method860();
        }
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "()V")
    public final void method688() {
        if (this.field1604 != null) {
            try {
                this.field1601.method1957();
            } catch (Throwable var4) {
            }
            this.field1604 = null;
        }
        if (this.field1603 != null) {
            this.method926();
            try {
                this.field1603.destroy();
            } catch (Throwable var3) {
            }
            this.field1603 = null;
        }
        if (this.field1610) {
            class19.method127(false, true, true);
            this.field1610 = false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
    public final void method672(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1732 < arg0) {
            this.field1732 = arg0;
        }
        if (this.field1703 > arg2) {
            this.field1703 = arg2;
        }
        if (this.field1655 < arg1) {
            this.field1655 = arg1;
        }
        if (this.field1728 > arg3) {
            this.field1728 = arg3;
        }
        this.field1604.glEnable(3089);
        this.method881();
        this.method916();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FF)V")
    public final void method693(float arg0, float arg1) {
        if (this.field1659 == arg0 && this.field1682 == arg1) {
            return;
        }
        this.field1659 = arg0;
        this.field1682 = arg1;
        this.method896();
        this.method885();
        if (this.field1668 == 3) {
            this.method917();
        } else if (this.field1668 == 2) {
            this.method908();
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)V")
    public final void method870(int arg0, int arg1) {
        if (this.field1717 != 0) {
            this.field1604.glTexEnvi(8960, 34161, arg0);
            this.field1604.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field1676 != arg0) {
            this.field1604.glTexEnvi(8960, 34161, arg0);
            this.field1676 = arg0;
            var3 = true;
        }
        if (this.field1734 != arg1) {
            this.field1604.glTexEnvi(8960, 34162, arg1);
            this.field1734 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field1710 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(IIIIII)V")
    public final void method762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method909();
        this.method868(arg5);
        this.field1604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field1604.glBegin(2);
        this.field1604.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field1604.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field1604.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "()Lpo;")
    public final class202 method748() {
        return new class385();
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(IIIII)V")
    public final void method729(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method909();
        this.method868(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field1604.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field1604.glBegin(1);
        this.field1604.glVertex2f(var6, var7);
        this.field1604.glVertex2f((float) arg2 + var6, var7);
        this.field1604.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "()V")
    private final void method871() {
        if (this.field1636 && !this.field1724) {
            this.field1604.glEnable(2896);
        } else {
            this.field1604.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "()Lpo;")
    public final class202 method709() {
        return this.field1607;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Luq;)V")
    public final void method872(class233 arg0) {
        if (this.field1637 != arg0 && this.field1643) {
            this.field1604.glBindBufferARB(34962, arg0.method978());
            this.field1637 = arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lgp;)V")
    public final void method873(class259 arg0) {
        if (this.field1651 != arg0 && this.field1643) {
            this.field1604.glBindBufferARB(34963, arg0.method978());
            this.field1651 = arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Loe;")
    public final class229 method703(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "()I")
    public final int method671() {
        return this.field1620 + this.field1616 + this.field1609;
    }

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "(I)I")
    public final int method874(int arg0) {
        if (arg0 == 6406 || arg0 == 6409) {
            return 1;
        } else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408 || arg0 == 34847) {
            return 4;
        } else if (arg0 == 34843) {
            return 6;
        } else if (arg0 == 34842) {
            return 8;
        } else if (arg0 == 6402) {
            return 3;
        } else if (arg0 == 6401) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)V")
    public final void method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method909();
        this.method868(arg5);
        this.field1604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1719) {
            this.field1604.glDisable(32925);
        }
        this.field1604.glBegin(7);
        this.field1604.glVertex2f(var7, var8);
        this.field1604.glVertex2f(var7, var10);
        this.field1604.glVertex2f(var9, var10);
        this.field1604.glVertex2f(var9, var8);
        this.field1604.glEnd();
        if (this.field1719) {
            this.field1604.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method728(Rectangle[] arg0, int arg1) {
        this.method749();
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
    public final void method768(int arg0, int arg1, int arg2) {
        this.field1657 = true;
        this.field1678 = arg1;
        this.field1706 = arg2;
        this.method910();
        this.method906();
        this.field1594.method630(false, 3, 15010, false);
        this.field1594.method631(true, arg0, 7);
    }

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "()I")
    public final int method740() {
        int var1 = this.field1737;
        this.field1737 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "()V")
    public final void method764() {
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[BIZ)Lgp;")
    public final class259 method875(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class259) (this.field1643 && !arg3 || this.field1693 ? new class194(this, arg0, arg1, arg2, arg3) : new class114(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method909();
        this.method868(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field1604.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field1604.glBegin(1);
        this.field1604.glVertex2f(var6, var7);
        this.field1604.glVertex2f(var6, (float) arg2 + var7);
        this.field1604.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "()V")
    public final void method876() {
        boolean var1 = this.field1680 != null;
        if (this.field1720 != var1) {
            if (var1) {
                this.field1604.glEnableClientState(32884);
            } else {
                this.field1604.glDisableClientState(32884);
            }
            this.field1720 = var1;
        }
        this.field1680 = null;
        boolean var2 = this.field1700 != null;
        if (this.field1716 != var2) {
            if (var2) {
                this.field1604.glEnableClientState(32885);
            } else {
                this.field1604.glDisableClientState(32885);
            }
            this.field1716 = var2;
        }
        this.field1700 = null;
        boolean var3 = this.field1631 != null;
        if (this.field1692 != var3) {
            if (var3) {
                this.field1604.glEnableClientState(32886);
            } else {
                this.field1604.glDisableClientState(32886);
            }
            this.field1692 = var3;
        }
        this.field1631 = null;
        for (int var4 = 0; var4 < this.field1634; var4++) {
            boolean var5 = this.field1644[var4] != null;
            if (this.field1670[var4] != var5) {
                this.field1604.glClientActiveTexture(var4 + 33984);
                if (var5) {
                    this.field1604.glEnableClientState(32888);
                } else {
                    this.field1604.glDisableClientState(32888);
                }
                this.field1670[var4] = var5;
            }
            this.field1644[var4] = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "()V")
    private final void method877() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field1603.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class134.method1106(1000L, 10);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lgp;III)V")
    public final void method878(class259 arg0, int arg1, int arg2, int arg3) {
        this.method873(arg0);
        arg0.method977(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(FFF)V")
    private final void method879(float arg0, float arg1, float arg2) {
        this.field1604.glMatrixMode(5890);
        if (this.field1684) {
            this.field1604.glLoadIdentity();
        }
        this.field1604.glTranslatef(arg0, arg1, arg2);
        this.field1604.glMatrixMode(5888);
        this.field1684 = true;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)V")
    public final void method880(int arg0, int arg1, int arg2) {
        this.field1604.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "()V")
    private final void method881() {
        this.field1641 = (float) (this.field1732 - this.field1729);
        this.field1649 = (float) (this.field1703 - this.field1729);
        this.field1704 = (float) (this.field1655 - this.field1632);
        this.field1736 = (float) (this.field1728 - this.field1632);
    }

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "()Z")
    public final boolean method716() {
        return this.field1598.method326();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIIII)Lof;")
    public final class421 method715(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class438(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "(I)V")
    public final synchronized void method882(int arg0) {
        class9 var2 = new class9(arg0);
        this.field1626.method148((byte) 98, var2);
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)V")
    public final void method883(int arg0, int arg1) {
        this.field1660 = arg0;
        this.field1721 = arg1;
        this.field1604.glViewport(arg0, arg1, this.field1611, this.field1617);
        this.method916();
    }

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "()Z")
    public final boolean method747() {
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FFF)V")
    public final void method726(float arg0, float arg1, float arg2) {
        class38.field586 = arg0;
        class38.field590 = arg1;
        class38.field595 = arg2;
    }

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "(I)V")
    public final void method884(int arg0) {
        if (arg0 == 0) {
            this.method870(7681, 7681);
        } else if (arg0 == 1) {
            this.method870(8448, 8448);
        } else if (arg0 == 2) {
            this.method870(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public final void method676(boolean arg0) {
        this.field1662 = arg0;
        this.method865();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqi;Lqi;FLqi;)Lqi;")
    public final class207 method710(class207 arg0, class207 arg1, float arg2, class207 arg3) {
        if (arg0 != null && arg1 != null && this.field1664 && this.field1635) {
            class261 var5 = null;
            class138 var6 = (class138) arg0;
            class138 var7 = (class138) arg1;
            class414 var8 = var6.method1123((byte) 11);
            class414 var9 = var7.method1123((byte) 11);
            if (var8 != null && var9 != null) {
                int var10 = var8.field6003 > var9.field6003 ? var8.field6003 : var9.field6003;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class261) {
                    class261 var11 = (class261) arg3;
                    if (var11.method1877(-73) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class261(this, var10);
                }
                var5.method1878(arg2, (byte) 111, var8, var9);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIII)V")
    public final void method680(int arg0, int arg1, int arg2, int arg3) {
        this.field1601.method1964(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "()V")
    private final void method885() {
        this.field1672 = (this.field1633[14] - (float) this.field1640) / this.field1633[10];
        this.field1697 = (float) this.field1640 - this.field1682;
    }

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "(I)I")
    public final int method886(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "()V")
    public final void method887() {
        if (this.field1710 == 8) {
            return;
        }
        this.method912();
        this.method867(true);
        this.method913(true);
        this.method864(true);
        this.method868(1);
        this.method884(1);
        this.field1710 = 8;
    }

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "()Z")
    public final boolean method760() {
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IFFFFF)V")
    public final void method712(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field1679 != arg0;
        if (var7 || this.field1701 != arg1 || this.field1711 != arg2) {
            this.field1679 = arg0;
            this.field1701 = arg1;
            this.field1711 = arg2;
            if (var7) {
                this.field1712 = (float) (this.field1679 & 0xFF0000) / 1.671168E7F;
                this.field1687 = (float) (this.field1679 & 0xFFFF) / 65535.0F;
                this.field1628 = (float) (this.field1679 & 0xFF) / 255.0F;
                this.method853();
            }
            this.method861();
        }
        if (this.field1696[0] == arg3 && this.field1696[1] == arg4 && this.field1696[2] == arg5) {
            return;
        }
        this.field1696[0] = arg3;
        this.field1696[1] = arg4;
        this.field1696[2] = arg5;
        this.field1671[0] = -arg3;
        this.field1671[1] = -arg4;
        this.field1671[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field1714[0] = arg3 * var8;
        this.field1714[1] = arg4 * var8;
        this.field1714[2] = arg5 * var8;
        this.field1708[0] = -this.field1714[0];
        this.field1708[1] = -this.field1714[1];
        this.field1708[2] = -this.field1714[2];
        this.method862();
        this.field1731 = (int) (arg3 * 256.0F / arg4);
        this.field1673 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    public final int method677(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "(I)V")
    public final synchronized void method888(int arg0) {
        class9 var2 = new class9(arg0);
        this.field1625.method148((byte) 119, var2);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()Z")
    public final boolean method668() {
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(III)V")
    public final void method889(int arg0, int arg1, int arg2) {
        this.field1604.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field1604.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(II)V")
    public final synchronized void method890(int arg0, int arg1) {
        class9 var3 = new class9(arg1);
        var3.field499 = (long) arg0;
        this.field1622.method148((byte) 101, var3);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)I")
    public final int method713(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "()Z")
    public final boolean method700() {
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(III)V")
    public final void method891(int arg0, int arg1, int arg2) {
        this.field1604.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field1604.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "()V")
    public final void method741() {
        this.field1601.method1960();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field1646 == null || this.field1646.field3038 < arg2 || this.field1646.field3039 < arg3) {
            this.field1646 = class343.method2209(false, 6406, 6406, arg6, this, 3553, arg2, arg3);
            this.field1646.method1574(false, false);
            var10 = this.field1646.field4855;
            var11 = this.field1646.field4857;
        } else {
            this.field1646.method1571(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field1646.field4855 / (float) this.field1646.field3039;
            var11 = (float) arg2 * this.field1646.field4857 / (float) this.field1646.field3038;
        }
        this.method933();
        this.method929(this.field1646);
        this.method868(arg8);
        this.field1604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method863(arg5);
        this.method870(34165, 34165);
        this.method891(0, 34166, 768);
        this.method891(2, 5890, 770);
        this.method889(0, 34166, 770);
        this.method889(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field1604.glBegin(7);
        this.field1604.glTexCoord2f(0.0F, 0.0F);
        this.field1604.glVertex2f(var12, var13);
        this.field1604.glTexCoord2f(0.0F, var11);
        this.field1604.glVertex2f(var12, var15);
        this.field1604.glTexCoord2f(var10, var11);
        this.field1604.glVertex2f(var14, var15);
        this.field1604.glTexCoord2f(var10, 0.0F);
        this.field1604.glVertex2f(var14, var13);
        this.field1604.glEnd();
        this.method891(0, 5890, 768);
        this.method891(2, 34166, 770);
        this.method889(0, 5890, 770);
        this.method889(2, 34166, 770);
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "()V")
    public final void method684() {
        this.field1611 = this.field1596.getWidth();
        this.field1617 = this.field1596.getHeight();
        this.field1604.glViewport(this.field1660, this.field1721, this.field1611, this.field1617);
        this.method897();
        this.method751();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[[I[[IIII)Lnc;")
    public final class126 method727(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class312(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILrn;II)V")
    public final void method766(int arg0, class134 arg1, int arg2, int arg3) {
        class318 var5 = (class318) arg1;
        class343 var6 = var5.field4604;
        this.method933();
        this.method929(var5.field4604);
        this.method868(1);
        this.method870(7681, 8448);
        this.method891(0, 34167, 768);
        float var7 = var6.field4857 / (float) var6.field4856;
        float var8 = var6.field4855 / (float) var6.field4853;
        this.field1604.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field1604.glBegin(7);
        this.field1604.glTexCoord2f((float) (this.field1732 - arg2) * var7, (float) (this.field1655 - arg3) * var8);
        this.field1604.glVertex2i(this.field1732, this.field1655);
        this.field1604.glTexCoord2f((float) (this.field1732 - arg2) * var7, (float) (this.field1728 - arg3) * var8);
        this.field1604.glVertex2i(this.field1732, this.field1728);
        this.field1604.glTexCoord2f((float) (this.field1703 - arg2) * var7, (float) (this.field1728 - arg3) * var8);
        this.field1604.glVertex2i(this.field1703, this.field1728);
        this.field1604.glTexCoord2f((float) (this.field1703 - arg2) * var7, (float) (this.field1655 - arg3) * var8);
        this.field1604.glVertex2i(this.field1703, this.field1655);
        this.field1604.glEnd();
        this.method891(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lpo;)V")
    public final void method673(class202 arg0) {
        this.field1648 = (class385) arg0;
        this.field1688.method2440((byte) -12, this.field1648);
        if (this.field1668 != 1) {
            this.method915();
        }
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "()Z")
    public final boolean method683() {
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)V")
    public final void method754(int arg0, int arg1) {
        if (this.field1639 == arg0 && this.field1630 == arg1) {
            return;
        }
        this.field1639 = arg0;
        this.field1630 = arg1;
        if (!this.field1657) {
            this.method910();
            this.method906();
        }
    }

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "()Z")
    public final boolean method707() {
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(FF)V")
    public final void method892(float arg0, float arg1) {
        this.field1707 = arg0;
        this.field1695 = arg1;
        if (!this.field1657) {
            this.method910();
        }
    }

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "()V")
    public final void method751() {
        this.field1732 = 0;
        this.field1655 = 0;
        this.field1703 = this.field1611;
        this.field1728 = this.field1617;
        this.field1604.glDisable(3089);
        this.method881();
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public final synchronized void method745(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field1621.method152((byte) 59)) {
            class9 var4 = (class9) this.field1621.method150(0);
            field1602[var2++] = (int) var4.field499;
            this.field1620 -= var4.field117;
            if (var2 == 1000) {
                this.field1604.glDeleteBuffersARB(var2, field1602, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1604.glDeleteBuffersARB(var2, field1602, 0);
            var2 = 0;
        }
        while (!this.field1622.method152((byte) 59)) {
            class9 var5 = (class9) this.field1622.method150(0);
            field1602[var2++] = (int) var5.field499;
            this.field1616 -= var5.field117;
            if (var2 == 1000) {
                this.field1604.glDeleteTextures(var2, field1602, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1604.glDeleteTextures(var2, field1602, 0);
            var2 = 0;
        }
        while (!this.field1623.method152((byte) 59)) {
            class9 var6 = (class9) this.field1623.method150(0);
            field1602[var2++] = var6.field117;
            if (var2 == 1000) {
                this.field1604.glDeleteFramebuffersEXT(var2, field1602, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1604.glDeleteFramebuffersEXT(var2, field1602, 0);
            var2 = 0;
        }
        while (!this.field1624.method152((byte) 59)) {
            class9 var7 = (class9) this.field1624.method150(0);
            field1602[var2++] = (int) var7.field499;
            this.field1609 -= var7.field117;
            if (var2 == 1000) {
                this.field1604.glDeleteRenderbuffersEXT(var2, field1602, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1604.glDeleteRenderbuffersEXT(var2, field1602, 0);
            var2 = 0;
        }
        while (!this.field1625.method152((byte) 59)) {
            class9 var8 = (class9) this.field1625.method150(0);
            field1602[var2++] = (int) var8.field499;
            if (var2 == 1000) {
                this.field1604.glDeleteProgramsARB(var2, field1602, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1604.glDeleteProgramsARB(var2, field1602, 0);
            boolean var9 = false;
        }
        while (!this.field1612.method152((byte) 59)) {
            class9 var10 = (class9) this.field1612.method150(0);
            this.field1604.glDeleteLists((int) var10.field499, var10.field117);
        }
        while (!this.field1626.method152((byte) 59)) {
            class9 var11 = (class9) this.field1626.method150(0);
            this.field1604.glDeleteObjectARB(var11.field117);
        }
        while (!this.field1612.method152((byte) 59)) {
            class9 var12 = (class9) this.field1612.method150(0);
            this.field1604.glDeleteLists((int) var12.field499, var12.field117);
        }
        if (this.method671() > 100663296 && class10.method63(-21149) > this.field1650 + 60000L) {
            System.gc();
            this.field1650 = class10.method63(-21149);
        }
        this.field1614 = var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "(I)V")
    public final synchronized void method893(int arg0) {
        class9 var2 = new class9(arg0);
        this.field1623.method148((byte) 80, var2);
    }

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "()V")
    public final void method894() {
        this.field1604.glPopMatrix();
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I[BIZ)Luq;")
    public final class233 method895(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class233) (this.field1643 && !arg3 || this.field1693 ? new class449(this, arg0, arg1, arg2, arg3) : new class166(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "()V")
    private final void method896() {
        if (this.field1682 == 0.0F) {
            this.field1633[10] = this.field1654;
            this.field1633[14] = this.field1663;
        } else {
            float var1 = this.field1659 / (this.field1682 + this.field1659);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field1663 * (1.0F - var1) / this.field1682;
            this.field1633[10] = this.field1654 + var3;
            this.field1633[14] = this.field1663 * var2;
        }
        this.method885();
    }

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "()V")
    public final void method897() {
        if (this.field1668 != 0) {
            this.field1668 = 0;
            this.field1710 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()I")
    public final int method898() {
        return this.field1617;
    }

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "(I)V")
    public final void method899(int arg0) {
        this.method900(arg0, true);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method725(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
    public final void method758(int arg0) {
        this.method877();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Loe;)V")
    public final void method767(class229 arg0) {
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
    public final void method900(int arg0, boolean arg1) {
        this.method924(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
    public final void method717(int arg0, int arg1, int arg2) {
        if (!this.field1657) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field1678 = arg1;
        this.field1706 = arg2;
        this.method910();
        this.field1594.method631(true, arg0, 7);
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(II)V")
    public final synchronized void method901(int arg0, int arg1) {
        class9 var3 = new class9(arg1);
        var3.field499 = (long) arg0;
        this.field1623.method148((byte) 105, var3);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Ljm;)V")
    public final void method902(class160 arg0) {
        class233 var2 = arg0.field2431;
        this.method872(var2);
        var2.method1276(arg0);
        this.field1680 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field1648.field5522 + (float) arg0 * this.field1648.field5520 + (float) arg1 * this.field1648.field5519 + this.field1648.field5516;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field1648.field5522 + (float) arg3 * this.field1648.field5520 + (float) arg4 * this.field1648.field5519 + this.field1648.field5516;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field1691) || !(var8 < (float) this.field1691)) || !(!(var7 > (float) this.field1640) || !(var8 > (float) this.field1640))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field1648.field5528 + (float) arg0 * this.field1648.field5518 + (float) arg1 * this.field1648.field5525 + this.field1648.field5524) * (float) this.field1656 / var7);
        int var10 = (int) (((float) arg5 * this.field1648.field5528 + (float) arg3 * this.field1648.field5518 + (float) arg4 * this.field1648.field5525 + this.field1648.field5524) * (float) this.field1656 / var8);
        if ((float) var9 < this.field1641 && (float) var10 < this.field1641 || (float) var9 > this.field1649 && (float) var10 > this.field1649) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field1648.field5527 + (float) arg0 * this.field1648.field5517 + (float) arg1 * this.field1648.field5521 + this.field1648.field5526) * (float) this.field1690 / var7);
            int var12 = (int) (((float) arg5 * this.field1648.field5527 + (float) arg3 * this.field1648.field5517 + (float) arg4 * this.field1648.field5521 + this.field1648.field5526) * (float) this.field1690 / var8);
            return (!((float) var11 < this.field1704) || !((float) var12 < this.field1704)) && (!((float) var11 > this.field1736) || !((float) var12 > this.field1736));
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public final void method701(int arg0) {
        this.method926();
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(IIII)V")
    public final void method704(int arg0, int arg1, int arg2, int arg3) {
        this.field1729 = arg0;
        this.field1632 = arg1;
        this.field1656 = arg2;
        this.field1690 = arg3;
        float var5 = (float) (-this.field1729 * this.field1691) / (float) this.field1656;
        float var6 = (float) (-this.field1632 * this.field1691) / (float) this.field1690;
        float var7 = (float) ((this.field1611 - this.field1729) * this.field1691) / (float) this.field1656;
        float var8 = (float) ((this.field1617 - this.field1632) * this.field1691) / (float) this.field1690;
        this.method918(var5, var7, -var8, -var6, (float) this.field1691, (float) this.field1640);
        if (this.field1668 != 1) {
            this.method897();
        }
        this.method885();
        this.method881();
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lep;)V")
    public final void method903(class146 arg0) {
        if (this.field1615 >= 3) {
            throw new RuntimeException();
        }
        if (this.field1615 >= 0) {
            this.field1618[this.field1615].method904();
        }
        this.field1613 = this.field1618[++this.field1615] = arg0;
        this.field1613.method860();
    }

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "()Z")
    public final boolean method697() {
        return this.field1719;
    }

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "()I")
    public final int method757() {
        return 4;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()V")
    public final void method904() {
    }

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "()V")
    public final void method749() {
        try {
            this.field1603.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
    public final void method731(boolean arg0) {
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjm;)V")
    public final void method905(int arg0, class160 arg1) {
        class233 var3 = arg1.field2431;
        this.method872(var3);
        var3.method1278(arg0, arg1);
        this.field1644[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "()V")
    private final void method906() {
        if (this.field1699 && this.field1657 | this.field1630 >= 0) {
            this.field1604.glEnable(2912);
        } else {
            this.field1604.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FFFF)V")
    public final void method907(float arg0, float arg1, float arg2, float arg3) {
        field1599[0] = arg0;
        field1599[1] = arg1;
        field1599[2] = arg2;
        field1599[3] = arg3;
        this.field1604.glTexEnvfv(8960, 8705, field1599, 0);
    }

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "()V")
    private final void method908() {
        this.field1604.glMatrixMode(5889);
        this.field1604.glLoadMatrixf(this.field1633, 0);
        this.field1604.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "()I")
    public final int method744() {
        return this.field1691;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(F)V")
    public final void method699(float arg0) {
        if (this.field1683 != arg0) {
            this.field1683 = arg0;
            this.method853();
        }
    }

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "()V")
    private final void method909() {
        if (this.field1710 == 1) {
            return;
        }
        this.method932();
        this.method867(false);
        this.method911(false);
        this.method913(false);
        this.method864(false);
        this.method929((class195) null);
        this.method899(-2);
        this.method884(0);
        this.field1710 = 1;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(IIII)[I")
    public final int[] method695(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field1604.glReadPixels(arg0, this.field1617 - arg1 - var6, arg2, 1, 32993, this.field1709, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "()V")
    public final void method682() {
        if (this.field1598.method1701(-120)) {
            this.field1601.method1961(this.field1598);
            this.field1597.method1622(-1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqi;)V")
    public final void method678(class207 arg0) {
        this.field1661 = (class138) arg0;
    }

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "()V")
    private final void method910() {
        int var1;
        if (this.field1657) {
            this.field1604.glFogf(2915, 0.0F);
            this.field1604.glFogf(2916, 1.0F);
            var1 = this.field1678;
        } else {
            this.field1638 = (float) (this.field1640 - 256) - this.field1695;
            this.field1647 = this.field1638 - (float) this.field1630 * this.field1707;
            if (this.field1647 < (float) this.field1691) {
                this.field1647 = (float) this.field1691;
            }
            this.field1604.glFogf(2915, this.field1647);
            this.field1604.glFogf(2916, this.field1638);
            var1 = this.field1639;
        }
        field1599[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field1599[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field1599[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field1604.glFogfv(2918, field1599, 0);
    }

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "()F")
    public final float method759() {
        return this.field1659;
    }

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "()Z")
    public final boolean method724() {
        if (!this.field1598.method1701(-68)) {
            if (!this.field1601.method1962(this.field1598)) {
                return false;
            }
            this.field1597.method1622(-1);
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "()I")
    public final int method702() {
        return this.field1640;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(Z)V")
    public final void method911(boolean arg0) {
        if (this.field1636 != arg0) {
            this.field1636 = arg0;
            this.method871();
            this.field1710 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "()Z")
    public final boolean method705() {
        return class177.field2652 == null || !class177.field2652.startsWith("mac");
    }

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "()Z")
    public final boolean method730() {
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "()V")
    public final void method912() {
        if (this.field1668 != 2) {
            this.field1668 = 2;
            this.method908();
            this.method915();
            this.field1710 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(Z)V")
    public final void method913(boolean arg0) {
        if (this.field1723 == arg0) {
            return;
        }
        if (arg0) {
            this.field1604.glEnable(2929);
        } else {
            this.field1604.glDisable(2929);
        }
        this.field1723 = arg0;
        this.field1710 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "()V")
    private final void method914() {
        this.method899(-2);
        for (int var1 = this.field1733 - 1; var1 >= 0; var1--) {
            this.method857(var1);
            this.method929((class195) null);
            this.field1604.glTexEnvi(8960, 8704, 34160);
        }
        this.method870(8448, 8448);
        this.method891(2, 34168, 770);
        this.method927();
        this.field1604.glEnable(3042);
        this.field1604.glBlendFunc(770, 771);
        this.field1718 = 1;
        this.field1604.glEnable(3008);
        this.field1604.glAlphaFunc(516, 0.0F);
        this.field1686 = true;
        this.field1604.glColorMask(true, true, true, true);
        this.field1658 = true;
        this.method867(true);
        this.method911(true);
        this.method913(true);
        this.method864(true);
        this.method897();
        this.field1604.setSwapInterval(0);
        this.field1604.glShadeModel(7425);
        this.field1604.glClearDepth(1.0F);
        this.field1604.glDepthFunc(515);
        this.field1604.glPolygonMode(1028, 6914);
        this.field1604.glEnable(2884);
        this.field1604.glCullFace(1029);
        this.field1604.glMatrixMode(5888);
        this.field1604.glLoadIdentity();
        this.field1604.glColorMaterial(1028, 5634);
        this.field1604.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field1604.glLightfv(var4, 4608, var2, 0);
            this.field1604.glLightf(var4, 4615, 0.0F);
            this.field1604.glLightf(var4, 4616, 0.0F);
        }
        this.field1604.glEnable(16384);
        this.field1604.glEnable(16385);
        this.field1604.glFogf(2914, 0.95F);
        this.field1604.glFogi(2917, 9729);
        this.field1604.glHint(3156, 4353);
        this.field1679 = this.field1639 = -1;
        this.method751();
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public final void method714(boolean arg0) {
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lhe;)V")
    public final void method753(class30 arg0) {
        this.field1605.method2788(this, arg0);
    }

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "()V")
    private final void method915() {
        this.field1604.glLoadIdentity();
        this.field1604.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field1604.glMultMatrixf(this.field1648.method2442((byte) -128), 0);
        this.method862();
    }

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "()Z")
    public final boolean method743() {
        return this.field1598.method1701(-99);
    }

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "()V")
    private final void method916() {
        if (this.field1732 <= this.field1703 && this.field1655 <= this.field1728) {
            this.field1604.glScissor(this.field1732 + this.field1660, this.field1721 + this.field1617 - this.field1728, this.field1703 - this.field1732, this.field1728 - this.field1655);
        } else {
            this.field1604.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "()V")
    private final void method917() {
        float var1 = (float) (-this.field1729) * this.field1735 / (float) this.field1656;
        float var2 = (float) (-this.field1632) * this.field1735 / (float) this.field1690;
        float var3 = (float) (this.field1611 - this.field1729) * this.field1735 / (float) this.field1656;
        float var4 = (float) (this.field1617 - this.field1632) * this.field1735 / (float) this.field1690;
        this.field1604.glMatrixMode(5889);
        this.field1604.glLoadIdentity();
        this.field1604.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field1691 - this.field1682), (double) ((float) this.field1640 - this.field1682));
        this.field1604.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(IIII)V")
    public final void method752(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field1611) {
            arg2 = this.field1611;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field1617) {
            arg3 = this.field1617;
        }
        this.field1732 = arg0;
        this.field1655 = arg1;
        this.field1703 = arg2;
        this.field1728 = arg3;
        this.field1604.glEnable(3089);
        this.method881();
        this.method916();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FFFFFF)V")
    private final void method918(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var7 = arg4 * 2.0F;
        float[] var8 = this.field1633;
        var8[0] = var7 / (arg1 - arg0);
        var8[1] = 0.0F;
        var8[2] = 0.0F;
        var8[3] = 0.0F;
        var8[4] = 0.0F;
        var8[5] = var7 / (arg3 - arg2);
        var8[6] = 0.0F;
        var8[7] = 0.0F;
        var8[8] = (arg0 + arg1) / (arg1 - arg0);
        var8[9] = (arg2 + arg3) / (arg3 - arg2);
        var8[10] = this.field1654 = -(arg4 + arg5) / (arg5 - arg4);
        var8[11] = -1.0F;
        var8[12] = 0.0F;
        var8[13] = 0.0F;
        var8[14] = this.field1663 = -(arg5 * var7) / (arg5 - arg4);
        var8[15] = 0.0F;
        this.method896();
    }

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "()I")
    private final int method919() {
        int var1 = 0;
        this.field1730 = this.field1604.glGetString(7936);
        this.field1629 = this.field1604.glGetString(7937);
        String var2 = this.field1730.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field1604.glGetString(7938);
        String[] var4 = class169.method1289(var3.replace('.', ' '), ' ', 26329);
        if (var4.length >= 2) {
            try {
                int var5 = class36.method259(var4[0], (byte) 127);
                int var6 = class36.method259(var4[1], (byte) 97);
                this.field1652 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field1652 < 12) {
            var1 |= 0x2;
        }
        if (!this.field1604.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field1604.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field1604.glGetIntegerv(34018, var8, 0);
        this.field1733 = var8[0];
        this.field1604.glGetIntegerv(34929, var8, 0);
        this.field1634 = var8[0];
        this.field1604.glGetIntegerv(34930, var8, 0);
        this.field1685 = var8[0];
        if (this.field1733 < 2 || this.field1634 < 2 || this.field1685 < 2) {
            var1 |= 0x10;
        }
        this.field1727 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field1643 = this.field1604.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field1719 = this.field1604.isExtensionAvailable("GL_ARB_multisample");
        this.field1677 = this.field1604.isExtensionAvailable("GL_ARB_vertex_program");
        this.field1604.isExtensionAvailable("GL_ARB_fragment_program");
        this.field1604.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field1645 = this.field1604.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field1715 = this.field1604.isExtensionAvailable("GL_EXT_texture3D");
        this.field1666 = this.field1604.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field1664 = this.field1604.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field1667 = this.field1604.isExtensionAvailable("GL_ARB_texture_float");
        this.field1713 = false;
        this.field1635 = this.field1604.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "()V")
    public final void method742() {
        this.method864(true);
        this.field1604.glClear(256);
    }

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "(I)I")
    public final int method920(int arg0) {
        if (arg0 == 0) {
            return 7681;
        } else if (arg0 == 1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lhb;Z)Lof;")
    public final class421 method734(class344 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field4863 * arg0.field4859];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4860 == null) {
            for (int var8 = 0; var8 < arg0.field4863; var8++) {
                for (int var9 = 0; var9 < arg0.field4859; var9++) {
                    int var10 = arg0.field4858[arg0.field4862[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field4863; var6++) {
                for (int var7 = 0; var7 < arg0.field4859; var7++) {
                    var3[var5++] = arg0.field4860[var4] << 24 | arg0.field4858[arg0.field4862[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class421 var11 = this.method715(var3, 0, arg0.field4859, arg0.field4859, arg0.field4863);
        var11.method1468(arg0.field4866, arg0.field4865, arg0.field4861, arg0.field4864);
        return var11;
    }

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "()V")
    private final void method921() {
        if (this.field1668 != 3) {
            this.field1668 = 3;
            this.method917();
            this.method915();
            this.field1710 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Lrc;Lhe;Lpo;[Ltc;I)V")
    public final void method690(class100[] arg0, class30 arg1, class202 arg2, class290[] arg3, int arg4) {
        this.method756(arg0, arg2, arg3, arg4);
        this.method753(arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIILrn;II)V")
    public final void method719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, int arg7, int arg8) {
        class318 var10 = (class318) arg6;
        class343 var11 = var10.field4604;
        this.method933();
        this.method929(var10.field4604);
        this.method868(arg5);
        this.method870(7681, 8448);
        this.method891(0, 34167, 768);
        float var12 = var11.field4857 / (float) var11.field4856;
        float var13 = var11.field4855 / (float) var11.field4853;
        this.field1604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field1604.glBegin(1);
        this.field1604.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field1604.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field1604.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field1604.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field1604.glEnd();
        this.method891(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lfl;)V")
    public final void method922(class385 arg0) {
        this.field1604.glPushMatrix();
        this.field1604.glMultMatrixf(arg0.method2442((byte) -128), 0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[I)V")
    public final void method746(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field1648.field5522 + (float) arg0 * this.field1648.field5520 + (float) arg1 * this.field1648.field5519 + this.field1648.field5516;
        if ((var5 < (float) this.field1691) || (var5 > (float) this.field1640)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field1648.field5528 + (float) arg0 * this.field1648.field5518 + (float) arg1 * this.field1648.field5525 + this.field1648.field5524) * (float) this.field1656 / var5);
        int var7 = (int) (((float) arg2 * this.field1648.field5527 + (float) arg0 * this.field1648.field5517 + (float) arg1 * this.field1648.field5521 + this.field1648.field5526) * (float) this.field1690 / var5);
        if ((float) var6 >= this.field1641 && (float) var6 <= this.field1649 && (float) var7 >= this.field1704 && (float) var7 <= this.field1736) {
            arg3[0] = (int) ((float) var6 - this.field1641);
            arg3[1] = (int) ((float) var7 - this.field1704);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lbs;[Lhb;Z)Lpi;")
    public final class220 method765(class186 arg0, class344[] arg1, boolean arg2) {
        return new class149(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "()V")
    public final void method923() {
        if (this.field1710 == 4) {
            return;
        }
        this.method932();
        this.method867(false);
        this.method911(false);
        this.method913(false);
        this.method864(false);
        this.method899(-2);
        this.method868(1);
        this.method884(1);
        this.field1710 = 4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Leb;IIII)Lrc;")
    public final class100 method735(class382 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class70(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZZ)V")
    public final void method924(int arg0, boolean arg1, boolean arg2) {
        if (this.field1702 != arg0) {
            if (arg0 < 0) {
                this.method927();
                this.method929((class195) null);
                if (!this.field1657) {
                    this.field1594.method630(arg2, 0, 15010, arg1);
                }
            } else {
                class208 var4 = this.field1597.method1623(arg0, true);
                class200 var5 = this.field1606.method1412(arg0, (byte) -78);
                if (var5.field2911 == 0 && var5.field2929 == 0) {
                    this.method927();
                } else {
                    int var6 = var5.field2931 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method879((float) (this.field1614 % var7 * var5.field2911) / (float) var7, (float) (this.field1614 % var7 * var5.field2929) / (float) var7, 0.0F);
                }
                if (this.field1657) {
                    this.field1594.method630(arg2, 3, 15010, arg1);
                    this.method929(var4);
                } else {
                    this.field1594.method630(arg2, var5.field2930, 15010, arg1);
                    this.field1594.method631(false, var5.field2912, 7);
                    if (!this.field1594.method632(var4, 8)) {
                        this.method929(var4);
                    }
                }
            }
            this.field1702 = arg0;
        }
        this.field1710 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Ljm;)V")
    public final void method925(class160 arg0) {
        class233 var2 = arg0.field2431;
        this.method872(var2);
        var2.method1279(arg0);
        this.field1700 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "()V")
    private final void method926() {
        try {
            this.field1603.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "()V")
    private final void method927() {
        if (this.field1684) {
            this.field1604.glMatrixMode(5890);
            this.field1604.glLoadIdentity();
            this.field1604.glMatrixMode(5888);
            this.field1684 = false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(F)V")
    public final void method928(float arg0) {
        if (this.field1735 != arg0) {
            this.field1735 = arg0;
            if (this.field1668 == 3) {
                this.method917();
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lmo;)V")
    public final void method929(class195 arg0) {
        class195 var2 = this.field1694[this.field1717];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field1604.glDisable(var2.field2860);
            } else {
                if (var2 == null) {
                    this.field1604.glEnable(arg0.field2860);
                } else if (arg0.field2860 != var2.field2860) {
                    this.field1604.glDisable(var2.field2860);
                    this.field1604.glEnable(arg0.field2860);
                }
                this.field1604.glBindTexture(arg0.field2860, arg0.method1502());
            }
            this.field1694[this.field1717] = arg0;
        }
        this.field1710 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "()V")
    public final void method761() {
        this.field1594.method630(false, 0, 15010, false);
        this.field1657 = false;
        this.method910();
        this.method906();
    }

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "()V")
    private final void method930() {
        this.field1648 = new class385();
        this.field1688 = new class385();
        this.field1694 = new class195[this.field1733];
        this.field1670 = new boolean[this.field1634];
        this.field1644 = new class160[this.field1634];
        this.field1627 = new class208(this, 3553, 6408, 1, 1);
        this.field1705 = new class208(this, 3553, 6408, 1, 1);
        this.field1726 = new class208(this, 3553, 6408, 1, 1);
        this.field1698 = new class70(this);
        this.field1669 = new class70(this);
        this.field1725 = new class70(this);
        this.field1681 = new class70(this);
        this.field1722 = new class70(this);
        this.field1689 = new class70(this);
        this.field1675 = this.method875(5123, (byte[]) null, 1024, true);
        if (this.field1635) {
            this.field1642 = new class130(this);
        }
        this.field1605.method2785(this);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
    public final void method738(int arg0, int arg1) {
        if (this.field1691 == arg0 && this.field1640 == arg1) {
            return;
        }
        this.field1691 = arg0;
        this.field1640 = arg1;
        this.method897();
        this.method885();
        this.method910();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lrc;Lhe;Lpo;Ltc;I)V")
    public final void method698(class100 arg0, class30 arg1, class202 arg2, class290 arg3, int arg4) {
        arg0.method530(arg2, arg3, arg4);
        this.method753(arg1);
    }

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "()Z")
    public final boolean method694() {
        return this.field1594.method633((byte) -103, 3);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIIII)Lqi;")
    public final class207 method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field1664 ? new class411(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Luq;")
    public final class233 method931(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class233) (this.field1643 && !arg2 || this.field1693 ? new class449(this, arg0, arg1, arg2) : new class166(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ge", name = "rb", descriptor = "()V")
    private final void method932() {
        if (this.field1668 == 1) {
            return;
        }
        this.field1604.glMatrixMode(5889);
        this.field1604.glLoadIdentity();
        this.field1604.glOrtho(0.0D, (double) this.field1611, (double) this.field1617, 0.0D, -1.0D, 1.0D);
        this.field1604.glMatrixMode(5888);
        this.field1604.glLoadIdentity();
        this.field1668 = 1;
        this.field1710 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public final void method732(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZ)Lof;")
    public final class421 method686(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class438(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ge", name = "sb", descriptor = "()V")
    public final void method933() {
        if (this.field1710 == 2) {
            return;
        }
        this.method932();
        this.method867(false);
        this.method911(false);
        this.method913(false);
        this.method864(false);
        this.method899(-2);
        this.field1710 = 2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[I[I)Lrn;")
    public final class134 method674(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class318.method2133(arg2, this, arg1, arg0, arg3, 0);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lcj;IILvj;)V")
    public class104(Canvas arg0, class181 arg1, int arg2, int arg3, class177 arg4) {
        this.field1596 = arg0;
        this.field1606 = arg1;
        this.field1431 = arg2;
        int var6 = 0;
        while (!this.field1596.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class134.method1106(1000L, 10);
        }
        this.field1596.setIgnoreRepaint(true);
        try {
            if (!field1595) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field1595 = Boolean.TRUE;
                } else {
                    class131 var7 = arg4.method1377(this.getClass(), 0);
                    while (var7.field2121 == 0) {
                        class134.method1106(100L, 10);
                    }
                    if (var7.field2121 == 1) {
                        field1595 = Boolean.TRUE;
                    }
                }
            }
            if (!field1595) {
                throw new RuntimeException("");
            }
            this.field1603 = new context();
            if (!this.field1603.choosePixelFormat(this.field1596, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field1603.createContext()) {
                this.method877();
                this.field1604 = this.field1603.getGL();
                int var8 = this.method919();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field1709 = this.field1727 ? 33639 : 5121;
                String var9 = this.field1730.toLowerCase();
                String var10 = this.field1629.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class169.method1289(var10.replace('/', ' '), ' ', 26329);
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class341.method2202((byte) 114, var16.substring(1, 3))) {
                                    var16 = var16.substring(1);
                                    var13 = true;
                                }
                                if (var16.equals("hd")) {
                                    var12 = true;
                                } else {
                                    if (var16.startsWith("hd")) {
                                        var16 = var16.substring(2);
                                        var12 = true;
                                    }
                                    if (var16.length() >= 4 && class341.method2202((byte) 114, var16.substring(0, 4))) {
                                        var11 = class36.method259(var16.substring(0, 4), (byte) 118);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field1643 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field1715 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field1667 = false;
                    }
                    this.field1693 = this.field1643;
                }
                if (var9.contains("intel")) {
                    this.field1635 = false;
                }
                if (this.field1643) {
                    try {
                        int[] var18 = new int[1];
                        this.field1604.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method903(this);
                this.method684();
                this.method930();
                new class31(this);
                this.field1597 = new class213(this, this.field1606);
                class369.method2350((byte) -125, true, true);
                this.field1610 = true;
                this.field1594 = new class80(this);
                this.field1601 = new class274(this);
                this.field1598 = new class38(this);
                this.method914();
                this.field1604.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field1603.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class134.method1106(100L, 10);
                    }
                }
                this.field1604.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method688();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }
}
