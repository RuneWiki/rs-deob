import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class81 extends class374 {

    @OriginalMember(owner = "client!gm", name = "nb", descriptor = "Z")
    private boolean field1657 = true;

    @OriginalMember(owner = "client!gm", name = "ac", descriptor = "I")
    private int field1696 = 0;

    @OriginalMember(owner = "client!gm", name = "Xb", descriptor = "I")
    private int field1693 = 0;

    @OriginalMember(owner = "client!gm", name = "ub", descriptor = "I")
    private int field1664 = 0;

    @OriginalMember(owner = "client!gm", name = "bc", descriptor = "Z")
    private boolean field1697 = false;

    @OriginalMember(owner = "client!gm", name = "ic", descriptor = "I")
    private int field1704 = 0;

    @OriginalMember(owner = "client!gm", name = "rc", descriptor = "I")
    private int field1713 = 0;

    @OriginalMember(owner = "client!gm", name = "kc", descriptor = "Lda;")
    private class44 field1706;

    @OriginalMember(owner = "client!gm", name = "xb", descriptor = "Ler;")
    private class70 field1667;

    @OriginalMember(owner = "client!gm", name = "zb", descriptor = "Ler;")
    private class70 field1669;

    @OriginalMember(owner = "client!gm", name = "mb", descriptor = "Ler;")
    private class70 field1656;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "Ler;")
    private class70 field1645;

    @OriginalMember(owner = "client!gm", name = "mc", descriptor = "Lni;")
    private class365 field1708;

    @OriginalMember(owner = "client!gm", name = "Gb", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!gm", name = "hc", descriptor = "I")
    private int field1703;

    @OriginalMember(owner = "client!gm", name = "Zb", descriptor = "[I")
    private int[] field1695;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "[I")
    private int[] field1643;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "[I")
    private int[] field1613;

    @OriginalMember(owner = "client!gm", name = "Lb", descriptor = "[S")
    private short[] field1681;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "[I")
    private int[] field1614;

    @OriginalMember(owner = "client!gm", name = "uc", descriptor = "[Lkh;")
    private class13[] field1716;

    @OriginalMember(owner = "client!gm", name = "Rb", descriptor = "[Lfi;")
    private class393[] field1687;

    @OriginalMember(owner = "client!gm", name = "kb", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "[Lkd;")
    private class187[] field1610;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "[Lgq;")
    private class359[] field1619;

    @OriginalMember(owner = "client!gm", name = "gc", descriptor = "[S")
    private short[] field1702;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "S")
    private short field1633;

    @OriginalMember(owner = "client!gm", name = "qc", descriptor = "[S")
    private short[] field1712;

    @OriginalMember(owner = "client!gm", name = "sc", descriptor = "[S")
    private short[] field1714;

    @OriginalMember(owner = "client!gm", name = "tc", descriptor = "[B")
    private byte[] field1715;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "[S")
    private short[] field1628;

    @OriginalMember(owner = "client!gm", name = "wb", descriptor = "[F")
    private float[] field1666;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "[S")
    private short[] field1629;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "[S")
    private short[] field1606;

    @OriginalMember(owner = "client!gm", name = "nc", descriptor = "[S")
    private short[] field1709;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "[F")
    private float[] field1624;

    @OriginalMember(owner = "client!gm", name = "Mb", descriptor = "S")
    private short field1682;

    @OriginalMember(owner = "client!gm", name = "Nb", descriptor = "[S")
    private short[] field1683;

    @OriginalMember(owner = "client!gm", name = "vc", descriptor = "[B")
    private byte[] field1717;

    @OriginalMember(owner = "client!gm", name = "ib", descriptor = "[S")
    private short[] field1652;

    @OriginalMember(owner = "client!gm", name = "Db", descriptor = "[S")
    private short[] field1673;

    @OriginalMember(owner = "client!gm", name = "jb", descriptor = "[I")
    private int[] field1653;

    @OriginalMember(owner = "client!gm", name = "ob", descriptor = "[[I")
    private int[][] field1658;

    @OriginalMember(owner = "client!gm", name = "Ob", descriptor = "[[I")
    private int[][] field1684;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "[[I")
    private int[][] field1608;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "[I")
    public static int[] field1639 = new int[5];

    @OriginalMember(owner = "client!gm", name = "Jb", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!gm", name = "Ib", descriptor = "B")
    private byte field1678;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!gm", name = "eb", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!gm", name = "fb", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!gm", name = "gb", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!gm", name = "hb", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!gm", name = "lb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!gm", name = "pb", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!gm", name = "rb", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!gm", name = "sb", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!gm", name = "tb", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!gm", name = "vb", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!gm", name = "Ab", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!gm", name = "Bb", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!gm", name = "Cb", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!gm", name = "Eb", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!gm", name = "Hb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!gm", name = "Kb", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!gm", name = "Qb", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!gm", name = "Sb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!gm", name = "Tb", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!gm", name = "Ub", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!gm", name = "Vb", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!gm", name = "Wb", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!gm", name = "Yb", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!gm", name = "cc", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!gm", name = "dc", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!gm", name = "ec", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!gm", name = "fc", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!gm", name = "jc", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!gm", name = "lc", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!gm", name = "oc", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!gm", name = "pc", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "Lgg;")
    private class118 field1626;

    @OriginalMember(owner = "client!gm", name = "qb", descriptor = "Laf;")
    private class302 field1660;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "Lna;")
    private class35 field1636;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "S")
    private short field1621;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "S")
    private short field1630;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "S")
    private short field1638;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "S")
    private short field1640;

    @OriginalMember(owner = "client!gm", name = "db", descriptor = "S")
    private short field1647;

    @OriginalMember(owner = "client!gm", name = "yb", descriptor = "S")
    private short field1668;

    @OriginalMember(owner = "client!gm", name = "Pb", descriptor = "S")
    private short field1685;

    @OriginalMember(owner = "client!gm", name = "Fb", descriptor = "[I")
    public static int[] field1675;

    @OriginalMember(owner = "client!gm", name = "MA", descriptor = "()I")
    public final int method716() {
        if (!this.field1697) {
            this.method759((byte) -83);
        }
        field1705++;
        return this.field1685;
    }

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "(SS)V")
    public final void method717(short arg0, short arg1) {
        field1635++;
        class16 var3 = this.field1706.field4358;
        for (int var4 = 0; var4 < this.field1713; var4++) {
            if (this.field1629[var4] == arg0) {
                this.field1629[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class486 var7 = var3.method105(-124, arg0 & 0xFFFF);
            var5 = var7.field7139;
            var6 = var7.field7146;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class486 var10 = var3.method105(-126, arg1 & 0xFFFF);
            var8 = var10.field7139;
            var9 = var10.field7146;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field1619 != null) {
            for (int var11 = 0; var11 < this.field1654; var11++) {
                class359 var12 = this.field1619[var11];
                class187 var13 = this.field1610[var11];
                var13.field2995 = var13.field2995 & 0xFF000000 | class97.field1892[this.field1673[var12.field5280] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1645 != null) {
            this.field1645.field1401 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
    public final void method718() {
        field1646++;
        if (this.field1696 <= 0 || this.field1693 <= 0) {
            return;
        }
        this.method719(true, false);
        if ((this.field1678 & 0x10) == 0 && this.field1708.field5332 == null) {
            this.method757(false, 52);
        }
        this.method752(5);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZZ)V")
    private final void method719(boolean arg0, boolean arg1) {
        field1665++;
        boolean var3 = this.field1645 != null && this.field1645.field1401 == null;
        boolean var4 = this.field1656 != null && this.field1656.field1401 == null;
        boolean var5 = this.field1667 != null && this.field1667.field1401 == null;
        boolean var6 = this.field1669 != null && this.field1669.field1401 == null;
        if (arg1) {
            var3 &= (this.field1678 & 0x2) != 0;
            var5 &= (this.field1678 & 0x1) != 0;
            var6 &= (this.field1678 & 0x8) != 0;
            var4 &= (this.field1678 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        if (!arg0) {
            this.field1624 = null;
        }
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field1696 * var7 <= this.field1706.field934.field4408.length) {
            this.field1706.field934.field4399 = 0;
        } else {
            this.field1706.field934 = new class364((this.field1696 + 100) * var7);
        }
        class364 var12 = this.field1706.field934;
        if (var5) {
            if (this.field1706.field924) {
                for (int var13 = 0; var13 < this.field1664; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field1613[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field1614[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field1643[var13]);
                    int var17 = this.field1695[var13];
                    int var18 = this.field1695[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field1606[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field4399 = var7 * var20;
                        var12.method1862((byte) -115, var14);
                        var12.method1862((byte) -115, var15);
                        var12.method1862((byte) -115, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1664; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field1613[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field1614[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field1643[var21]);
                    int var25 = this.field1695[var21];
                    int var26 = this.field1695[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field1606[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field4399 = var7 * var28;
                        var12.method1812(true, var22);
                        var12.method1812(true, var23);
                        var12.method1812(arg0, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field1656 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field1636 == null) {
                    var29 = this.field1717;
                    var30 = this.field1714;
                    var31 = this.field1709;
                    var32 = this.field1628;
                } else {
                    var31 = this.field1636.field540;
                    var29 = this.field1636.field538;
                    var30 = this.field1636.field539;
                    var32 = this.field1636.field534;
                }
                float var33 = this.field1706.field863[0];
                float var34 = this.field1706.field863[1];
                float var35 = this.field1706.field863[2];
                float var36 = this.field1706.field937;
                float var37 = this.field1706.field938 * 768.0F / (float) this.field1633;
                float var38 = this.field1706.field905 * 768.0F / (float) this.field1633;
                for (int var39 = 0; var39 < this.field1713; var39++) {
                    int var40 = this.method765(-3, this.field1682, this.field1715[var39], this.field1629[var39], this.field1673[var39]);
                    float var41 = (float) (var40 >>> 24) * this.field1706.field862;
                    float var42 = (float) (var40 >> 16 & 0xFF) * this.field1706.field864;
                    float var43 = (float) (var40 >> 8 & 0xFF) * this.field1706.field919;
                    short var44 = this.field1652[var39];
                    short var45 = (short) var29[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var32[var44] * var35 + (float) var30[var44] * var34 + (float) var31[var44] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var32[var44] * var35 + (float) var30[var44] * var34 + (float) var31[var44] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var36 + (var46 < 0.0F ? var38 : var37) * var46;
                    int var48 = (int) (var41 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var42 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var43 * var47);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field4399 = var9 + (var7 * var44);
                    var12.method1814(var48, true);
                    var12.method1814(var49, true);
                    var12.method1814(var50, true);
                    var12.method1814(255 - (this.field1715[var39] & 0xFF), true);
                    short var51 = this.field1702[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var32[var51] * var35 + (float) var30[var51] * var34 + (float) var31[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var32[var51] * var35 + (float) var30[var51] * var34 + (float) var31[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + var53 * (var53 < 0.0F ? var38 : var37);
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var42 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var43 * var54);
                    var12.field4399 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method1814(var55, arg0);
                    var12.method1814(var56, true);
                    var12.method1814(var57, true);
                    var12.method1814(255 - (this.field1715[var39] & 0xFF), arg0);
                    short var58 = this.field1683[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var32[var58] * var35 + (float) var30[var58] * var34 + (float) var31[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var32[var58] * var35 + (float) var30[var58] * var34 + (float) var31[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var36 + ((var60 < 0.0F) ? var38 : var37) * var60;
                    int var62 = (int) (var41 * var61);
                    int var63 = (int) (var42 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var43 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field4399 = var7 * var58 + var9;
                    var12.method1814(var62, arg0);
                    var12.method1814(var63, true);
                    var12.method1814(var64, true);
                    var12.method1814(255 - (this.field1715[var39] & 0xFF), true);
                }
            } else {
                for (int var65 = 0; var65 < this.field1713; var65++) {
                    int var66 = this.method765(-3, this.field1682, this.field1715[var65], this.field1629[var65], this.field1673[var65]);
                    var12.field4399 = this.field1652[var65] * var7 + var9;
                    var12.method1862((byte) -115, var66);
                    var12.field4399 = this.field1702[var65] * var7 + var9;
                    var12.method1862((byte) -115, var66);
                    var12.field4399 = this.field1683[var65] * var7 + var9;
                    var12.method1862((byte) -115, var66);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field1636 == null) {
                var67 = this.field1717;
                var68 = this.field1709;
                var69 = this.field1628;
                var70 = this.field1714;
            } else {
                var69 = this.field1636.field534;
                var67 = this.field1636.field538;
                var68 = this.field1636.field540;
                var70 = this.field1636.field539;
            }
            float var71 = 3.0F / (float) this.field1633;
            float var72 = 3.0F / (float) (this.field1633 + (this.field1633 / 2));
            var12.field4399 = var10;
            if (this.field1706.field924) {
                for (int var76 = 0; var76 < this.field1696; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2234((float) var68[var76] * var72, -1933021816);
                        var12.method2234((float) var70[var76] * var72, -1933021816);
                        var12.method2234((float) var69[var76] * var72, -1933021816);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2234((float) var68[var76] * var78, -1933021816);
                        var12.method2234((float) var70[var76] * var78, -1933021816);
                        var12.method2234((float) var69[var76] * var78, -1933021816);
                    }
                    var12.field4399 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field1696; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2232((byte) -50, (float) var68[var73] * var72);
                        var12.method2232((byte) 105, (float) var70[var73] * var72);
                        var12.method2232((byte) 112, (float) var69[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2232((byte) 107, (float) var68[var73] * var75);
                        var12.method2232((byte) -41, (float) var70[var73] * var75);
                        var12.method2232((byte) -57, (float) var69[var73] * var75);
                    }
                    var12.field4399 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field4399 = var11;
            if (this.field1706.field924) {
                for (int var79 = 0; var79 < this.field1696; var79++) {
                    var12.method2234(this.field1624[var79], -1933021816);
                    var12.method2234(this.field1666[var79], -1933021816);
                    var12.field4399 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field1696; var80++) {
                    var12.method2232((byte) 118, this.field1624[var80]);
                    var12.method2232((byte) 106, this.field1666[var80]);
                    var12.field4399 += var7 - 8;
                }
            }
        }
        var12.field4399 = this.field1696 * var7;
        class118 var81;
        if (arg1) {
            if (this.field1626 == null) {
                this.field1626 = this.field1706.method283(var12.field4399, var7, -96, var12.field4408, true);
            } else {
                this.field1626.method951(var12.field4408, 16700, var12.field4399, var7);
            }
            this.field1678 = 0;
            var81 = this.field1626;
        } else {
            var81 = this.field1706.method283(var12.field4399, var7, -90, var12.field4408, false);
            this.field1657 = true;
        }
        if (var5) {
            this.field1667.field1403 = var8;
            this.field1667.field1401 = var81;
        }
        if (var6) {
            this.field1669.field1401 = var81;
            this.field1669.field1403 = var11;
        }
        if (var3) {
            this.field1645.field1403 = var9;
            this.field1645.field1401 = var81;
        }
        if (var4) {
            this.field1656.field1403 = var10;
            this.field1656.field1401 = var81;
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()[Lkh;")
    public final class13[] method720() {
        field1623++;
        return this.field1716;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lc;Lpr;II)V")
    public final void method721(class124 arg0, class313 arg1, int arg2, int arg3) {
        field1689++;
        if (this.field1696 == 0) {
            return;
        }
        class242 var5 = this.field1706.field904;
        class242 var6 = (class242) arg0;
        if (!this.field1697) {
            this.method759((byte) -71);
        }
        class460.field6857 = var5.field3741 * var6.field3730 + var5.field3740 * var6.field3735 + var5.field3730 * var6.field3746;
        class513.field7451 = var5.field3741 * var6.field3736 + var5.field3740 * var6.field3733 + var5.field3730 * var6.field3764 + var5.field3736;
        float var7 = (float) this.field1647 * class460.field6857 + class513.field7451;
        float var8 = (float) this.field1630 * class460.field6857 + class513.field7451;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field1668 + var7;
            var10 = var8 - (float) this.field1668;
        } else {
            var9 = (float) this.field1668 + var8;
            var10 = (float) (-this.field1668) + var7;
        }
        if ((var10 >= this.field1706.field828) || (var9 <= (float) this.field1706.field922)) {
            return;
        }
        class529.field7722 = var5.field3734 * var6.field3730 + var5.field3744 * var6.field3735 + var5.field3735 * var6.field3746;
        class270.field4103 = var5.field3734 * var6.field3736 + var5.field3744 * var6.field3733 + var5.field3735 * var6.field3764 + var5.field3733;
        float var11 = (float) this.field1647 * class529.field7722 + class270.field4103;
        float var12 = (float) this.field1630 * class529.field7722 + class270.field4103;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = (var12 - (float) this.field1668) * (float) this.field1706.field913;
            var13 = ((float) this.field1668 + var11) * (float) this.field1706.field913;
        } else {
            var13 = ((float) this.field1668 + var12) * (float) this.field1706.field913;
            var14 = ((float) (-this.field1668) + var11) * (float) this.field1706.field913;
        }
        if ((var14 / (float) arg2 >= this.field1706.field931) || (this.field1706.field848 >= var13 / (float) arg2)) {
            return;
        }
        class2.field52 = var5.field3759 * var6.field3736 + var5.field3763 * var6.field3733 + var5.field3746 * var6.field3764 + var5.field3764;
        class370.field5439 = var5.field3759 * var6.field3730 + var5.field3763 * var6.field3735 + var5.field3746 * var6.field3746;
        float var15 = (float) this.field1647 * class370.field5439 + class2.field52;
        float var16 = (float) this.field1630 * class370.field5439 + class2.field52;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) this.field1668 + var15) * (float) this.field1706.field867;
            var17 = (var16 - (float) this.field1668) * (float) this.field1706.field867;
        } else {
            var17 = ((float) (-this.field1668) + var15) * (float) this.field1706.field867;
            var18 = ((float) this.field1668 + var16) * (float) this.field1706.field867;
        }
        if ((var17 / (float) arg2 >= this.field1706.field838) || (var18 / (float) arg2 <= this.field1706.field847)) {
            return;
        }
        if (arg1 != null || this.field1619 != null) {
            class433.field6444 = var5.field3734 * var6.field3740 + var5.field3744 * var6.field3744 + var5.field3735 * var6.field3763;
            class515.field7478 = var5.field3759 * var6.field3741 + var5.field3763 * var6.field3734 + var5.field3746 * var6.field3759;
            class209.field3341 = var5.field3759 * var6.field3740 + var5.field3763 * var6.field3744 + var5.field3746 * var6.field3763;
            class506.field7378 = var5.field3741 * var6.field3741 + var5.field3740 * var6.field3734 + var5.field3730 * var6.field3759;
            class429.field6415 = var5.field3741 * var6.field3740 + var5.field3740 * var6.field3744 + var5.field3730 * var6.field3763;
            class189.field3031 = var5.field3734 * var6.field3741 + var5.field3744 * var6.field3734 + var5.field3735 * var6.field3759;
        }
        if (arg1 != null) {
            int var19 = this.field1685 + this.field1621 >> 1;
            int var20 = this.field1640 + this.field1638 >> 1;
            int var21 = (int) ((float) var20 * class189.field3031 + (float) this.field1647 * class529.field7722 + (float) var19 * class433.field6444 + class270.field4103);
            int var22 = (int) ((float) var20 * class515.field7478 + (float) this.field1647 * class370.field5439 + (float) var19 * class209.field3341 + class2.field52);
            int var23 = (int) ((float) var20 * class506.field7378 + (float) this.field1647 * class460.field6857 + (float) var19 * class429.field6415 + class513.field7451);
            int var24 = (int) ((float) var20 * class189.field3031 + (float) this.field1630 * class529.field7722 + (float) var19 * class433.field6444 + class270.field4103);
            int var25 = (int) ((float) var20 * class515.field7478 + (float) this.field1630 * class370.field5439 + (float) var19 * class209.field3341 + class2.field52);
            int var26 = (int) ((float) var20 * class506.field7378 + (float) this.field1630 * class460.field6857 + (float) var19 * class429.field6415 + class513.field7451);
            arg1.field4722 = this.field1706.field913 * var24 / arg2 + this.field1706.field945;
            arg1.field4717 = this.field1706.field870 + (this.field1706.field867 * var25 / arg2);
            arg1.field4718 = this.field1706.field867 * var22 / arg2 + this.field1706.field870;
            arg1.field4719 = this.field1706.field913 * var21 / arg2 + this.field1706.field945;
            if (this.field1706.field922 > var23 && var26 < this.field1706.field922) {
                arg1.field4721 = true;
                arg1.field4720 = (var21 + this.field1668) * this.field1706.field913 / arg2 + this.field1706.field945 - arg1.field4719;
            }
        }
        this.field1706.method378((float) arg2, 30677);
        this.field1706.method443((byte) 122);
        this.field1706.method438(var6, 118);
        this.method735(-126);
        this.field1706.method343(86);
        this.method762(3);
    }

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "()I")
    public final int method722() {
        field1692++;
        if (!this.field1697) {
            this.method759((byte) -77);
        }
        return this.field1668;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lc;Lpr;I)V")
    public final void method723(class124 arg0, class313 arg1, int arg2) {
        field1615++;
        if (this.field1696 == 0) {
            return;
        }
        class242 var4 = this.field1706.field904;
        if (!this.field1697) {
            this.method759((byte) -75);
        }
        class242 var5 = (class242) arg0;
        this.method739(3, var5);
        class513.field7451 = var4.field3741 * var5.field3736 + var4.field3740 * var5.field3733 + var4.field3730 * var5.field3764 + var4.field3736;
        class460.field6857 = var4.field3741 * var5.field3730 + var4.field3740 * var5.field3735 + var4.field3730 * var5.field3746;
        float var6 = (float) this.field1647 * class460.field6857 + class513.field7451;
        float var7 = (float) this.field1630 * class460.field6857 + class513.field7451;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) this.field1668 + var6;
            var9 = (float) (-this.field1668) + var7;
        } else {
            var8 = (float) this.field1668 + var7;
            var9 = var6 - (float) this.field1668;
        }
        if ((this.field1706.field846 <= var9) || ((float) this.field1706.field922 >= var8)) {
            return;
        }
        class529.field7722 = var4.field3734 * var5.field3730 + var4.field3744 * var5.field3735 + var4.field3735 * var5.field3746;
        class270.field4103 = var4.field3734 * var5.field3736 + var4.field3744 * var5.field3733 + var4.field3735 * var5.field3764 + var4.field3733;
        float var10 = (float) this.field1647 * class529.field7722 + class270.field4103;
        float var11 = (float) this.field1630 * class529.field7722 + class270.field4103;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var13 = ((float) (-this.field1668) + var11) * (float) this.field1706.field913;
            var12 = ((float) this.field1668 + var10) * (float) this.field1706.field913;
        } else {
            var12 = ((float) this.field1668 + var11) * (float) this.field1706.field913;
            var13 = ((float) (-this.field1668) + var10) * (float) this.field1706.field913;
        }
        if ((var13 / var8 >= this.field1706.field931) || (this.field1706.field848 >= var12 / var8)) {
            return;
        }
        class370.field5439 = var4.field3759 * var5.field3730 + var4.field3763 * var5.field3735 + var4.field3746 * var5.field3746;
        class2.field52 = var4.field3759 * var5.field3736 + var4.field3763 * var5.field3733 + var4.field3746 * var5.field3764 + var4.field3764;
        float var14 = (float) this.field1647 * class370.field5439 + class2.field52;
        float var15 = (float) this.field1630 * class370.field5439 + class2.field52;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = (var15 - (float) this.field1668) * (float) this.field1706.field867;
            var17 = ((float) this.field1668 + var14) * (float) this.field1706.field867;
        } else {
            var16 = (var14 - (float) this.field1668) * (float) this.field1706.field867;
            var17 = ((float) this.field1668 + var15) * (float) this.field1706.field867;
        }
        if ((var16 / var8 >= this.field1706.field838) || (var17 / var8 <= this.field1706.field847)) {
            return;
        }
        if (arg1 != null || this.field1619 != null) {
            class433.field6444 = var4.field3734 * var5.field3740 + var4.field3744 * var5.field3744 + var4.field3735 * var5.field3763;
            class506.field7378 = var4.field3741 * var5.field3741 + var4.field3740 * var5.field3734 + var4.field3730 * var5.field3759;
            class429.field6415 = var4.field3741 * var5.field3740 + var4.field3740 * var5.field3744 + var4.field3730 * var5.field3763;
            class209.field3341 = var4.field3759 * var5.field3740 + var4.field3763 * var5.field3744 + var4.field3746 * var5.field3763;
            class515.field7478 = var4.field3759 * var5.field3741 + var4.field3763 * var5.field3734 + var4.field3746 * var5.field3759;
            class189.field3031 = var4.field3734 * var5.field3741 + var4.field3744 * var5.field3734 + var4.field3735 * var5.field3759;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1685 + this.field1621 >> 1;
            int var21 = this.field1640 + this.field1638 >> 1;
            int var22 = (int) ((float) var21 * class189.field3031 + (float) this.field1647 * class529.field7722 + (float) var20 * class433.field6444 + class270.field4103);
            int var23 = (int) ((float) var21 * class515.field7478 + (float) this.field1647 * class370.field5439 + (float) var20 * class209.field3341 + class2.field52);
            int var24 = (int) ((float) var21 * class506.field7378 + (float) this.field1647 * class460.field6857 + (float) var20 * class429.field6415 + class513.field7451);
            if (var24 < this.field1706.field922) {
                var18 = true;
            } else {
                arg1.field4719 = this.field1706.field945 + (this.field1706.field913 * var22 / var24);
                arg1.field4718 = this.field1706.field870 + (this.field1706.field867 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * class189.field3031 + (float) this.field1630 * class529.field7722 + (float) var20 * class433.field6444 + class270.field4103);
            int var26 = (int) ((float) var21 * class515.field7478 + (float) this.field1630 * class370.field5439 + (float) var20 * class209.field3341 + class2.field52);
            int var27 = (int) ((float) var21 * class506.field7378 + (float) this.field1630 * class460.field6857 + (float) var20 * class429.field6415 + class513.field7451);
            if (this.field1706.field922 <= var27) {
                arg1.field4717 = this.field1706.field870 + (this.field1706.field867 * var26 / var27);
                arg1.field4722 = this.field1706.field913 * var25 / var27 + this.field1706.field945;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field1706.field922 > var24 && var27 < this.field1706.field922) {
                    var19 = false;
                } else if (var24 < this.field1706.field922) {
                    int var28 = (var27 - this.field1706.field922 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field4719 = this.field1706.field913 * var29 / this.field1706.field922 + this.field1706.field945;
                    arg1.field4718 = this.field1706.field867 * var30 / this.field1706.field922 + this.field1706.field870;
                } else if (this.field1706.field922 > var27) {
                    int var31 = (var24 - this.field1706.field922 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field4719 = this.field1706.field913 * var32 / this.field1706.field922 + this.field1706.field945;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field4718 = this.field1706.field870 + (this.field1706.field867 * var33 / this.field1706.field922);
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field4720 = this.field1706.field945 + ((this.field1668 + var25) * this.field1706.field913 / var27) - arg1.field4722;
                } else {
                    arg1.field4720 = (this.field1668 + var22) * this.field1706.field913 / var24 + this.field1706.field945 - arg1.field4719;
                }
                arg1.field4721 = true;
            }
        }
        this.field1706.method304((byte) 124);
        this.field1706.method438(var5, 117);
        this.method735(-125);
        this.field1706.method343(118);
        this.method762(3);
    }

    @OriginalMember(owner = "client!gm", name = "va", descriptor = "(I[IIIIIZ)V")
    public final void method724(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1648++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            class184.field2959 = 0;
            int var12 = 0;
            class159.field2576 = 0;
            class466.field6930 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field1658.length > var14) {
                    int[] var15 = this.field1658[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class184.field2959 += this.field1613[var17];
                        class159.field2576 += this.field1614[var17];
                        var12++;
                        class466.field6930 += this.field1643[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class184.field2959 = var11;
                class159.field2576 = var9;
                class466.field6930 = var10;
            } else {
                class159.field2576 = class159.field2576 / var12 + var9;
                class466.field6930 = class466.field6930 / var12 + var10;
                class184.field2959 = class184.field2959 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field1658.length > var22) {
                    int[] var23 = this.field1658[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1613[var25] += var20;
                        this.field1614[var25] += var18;
                        this.field1643[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field1658.length > var45) {
                    int[] var46 = this.field1658[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1613[var48] -= class184.field2959;
                            this.field1614[var48] -= class159.field2576;
                            this.field1643[var48] -= class466.field6930;
                            if (arg4 != 0) {
                                int var49 = class407.field6169[arg4];
                                int var50 = class407.field6168[arg4];
                                int var51 = this.field1614[var48] * var49 + this.field1613[var48] * var50 + 32767 >> 15;
                                this.field1614[var48] = this.field1614[var48] * var50 + 32767 - (this.field1613[var48] * var49) >> 15;
                                this.field1613[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class407.field6169[arg2];
                                int var53 = class407.field6168[arg2];
                                int var54 = this.field1614[var48] * var53 + 32767 - (this.field1643[var48] * var52) >> 15;
                                this.field1643[var48] = this.field1614[var48] * var52 + this.field1643[var48] * var53 + 32767 >> 15;
                                this.field1614[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class407.field6169[arg3];
                                int var56 = class407.field6168[arg3];
                                int var57 = this.field1643[var48] * var55 + this.field1613[var48] * var56 + 32767 >> 15;
                                this.field1643[var48] = this.field1643[var48] * var56 + 32767 - (this.field1613[var48] * var55) >> 15;
                                this.field1613[var48] = var57;
                            }
                            this.field1613[var48] += class184.field2959;
                            this.field1614[var48] += class159.field2576;
                            this.field1643[var48] += class466.field6930;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1613[var59] -= class184.field2959;
                            this.field1614[var59] -= class159.field2576;
                            this.field1643[var59] -= class466.field6930;
                            if (arg2 != 0) {
                                int var60 = class407.field6169[arg2];
                                int var61 = class407.field6168[arg2];
                                int var62 = this.field1614[var59] * var61 + 32767 - this.field1643[var59] * var60 >> 15;
                                this.field1643[var59] = this.field1643[var59] * var61 + (this.field1614[var59] * var60 + 32767) >> 15;
                                this.field1614[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class407.field6169[arg4];
                                int var64 = class407.field6168[arg4];
                                int var65 = this.field1614[var59] * var63 + this.field1613[var59] * var64 + 32767 >> 15;
                                this.field1614[var59] = this.field1614[var59] * var64 + 32767 - (this.field1613[var59] * var63) >> 15;
                                this.field1613[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class407.field6169[arg3];
                                int var67 = class407.field6168[arg3];
                                int var68 = this.field1613[var59] * var67 + (this.field1643[var59] * var66 + 32767) >> 15;
                                this.field1643[var59] = this.field1643[var59] * var67 + 32767 - (this.field1613[var59] * var66) >> 15;
                                this.field1613[var59] = var68;
                            }
                            this.field1613[var59] += class184.field2959;
                            this.field1614[var59] += class159.field2576;
                            this.field1643[var59] += class466.field6930;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field1658.length) {
                        int[] var29 = this.field1658[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1695[var31];
                            int var33 = this.field1695[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1606[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class407.field6169[arg4];
                                    int var37 = class407.field6168[arg4];
                                    int var38 = this.field1714[var35] * var36 + this.field1709[var35] * var37 + 32767 >> 15;
                                    this.field1714[var35] = (short) (this.field1714[var35] * var37 + 32767 - (this.field1709[var35] * var36) >> 15);
                                    this.field1709[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class407.field6169[arg2];
                                    int var40 = class407.field6168[arg2];
                                    int var41 = this.field1714[var35] * var40 + 32767 - (this.field1628[var35] * var39) >> 15;
                                    this.field1628[var35] = (short) (this.field1714[var35] * var39 + this.field1628[var35] * var40 + 32767 >> 15);
                                    this.field1714[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class407.field6169[arg3];
                                    int var43 = class407.field6168[arg3];
                                    int var44 = this.field1709[var35] * var43 + (this.field1628[var35] * var42 + 32767) >> 15;
                                    this.field1628[var35] = (short) (this.field1628[var35] * var43 + 32767 - (this.field1709[var35] * var42) >> 15);
                                    this.field1709[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field1656 == null && this.field1645 != null) {
                    this.field1645.field1401 = null;
                }
                if (this.field1656 != null) {
                    this.field1656.field1401 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field1658.length) {
                    int[] var71 = this.field1658[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1613[var73] -= class184.field2959;
                        this.field1614[var73] -= class159.field2576;
                        this.field1643[var73] -= class466.field6930;
                        this.field1613[var73] = this.field1613[var73] * arg2 >> 7;
                        this.field1614[var73] = this.field1614[var73] * arg3 >> 7;
                        this.field1643[var73] = this.field1643[var73] * arg4 >> 7;
                        this.field1613[var73] += class184.field2959;
                        this.field1614[var73] += class159.field2576;
                        this.field1643[var73] += class466.field6930;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1608 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field1608.length) {
                        int[] var79 = this.field1608[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field1715[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field1715[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field1645 != null) {
                            this.field1645.field1401 = null;
                        }
                    }
                }
                if (this.field1619 != null) {
                    for (int var75 = 0; var75 < this.field1654; var75++) {
                        class359 var76 = this.field1619[var75];
                        class187 var77 = this.field1610[var75];
                        var77.field2995 = var77.field2995 & 0xFFFFFF | 255 - (this.field1715[var76.field5280] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1608 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field1608.length > var87) {
                        int[] var88 = this.field1608[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field1673[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD58) >> 10;
                            int var93 = (var91 & 0x3AD) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = var92 + arg2 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var94;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field1673[var90] = (short) class418.method2558(class418.method2558(var96 << 7, var95 << 10), var97);
                        }
                        if (var88.length > 0 && this.field1645 != null) {
                            this.field1645.field1401 = null;
                        }
                    }
                }
                if (this.field1619 != null) {
                    for (int var84 = 0; var84 < this.field1654; var84++) {
                        class359 var85 = this.field1619[var84];
                        class187 var86 = this.field1610[var84];
                        var86.field2995 = var86.field2995 & 0xFF000000 | class97.field1892[this.field1673[var85.field5280] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1684 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field1684.length) {
                        int[] var100 = this.field1684[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class187 var102 = this.field1610[var100[var101]];
                            var102.field2994 += arg2;
                            var102.field2997 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1684 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field1684.length) {
                        int[] var105 = this.field1684[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class187 var107 = this.field1610[var105[var106]];
                            var107.field3000 = var107.field3000 * arg2 >> 7;
                            var107.field3002 = var107.field3002 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1684 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field1684.length) {
                    int[] var110 = this.field1684[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class187 var112 = this.field1610[var110[var111]];
                        var112.field3001 = var112.field3001 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "(I)V")
    public final void method725(int arg0) {
        field1663++;
        int var2 = class407.field6169[arg0];
        int var3 = class407.field6168[arg0];
        for (int var4 = 0; var4 < this.field1664; var4++) {
            int var5 = this.field1614[var4] * var3 - this.field1643[var4] * var2 >> 15;
            this.field1643[var4] = this.field1643[var4] * var3 + this.field1614[var4] * var2 >> 15;
            this.field1614[var4] = var5;
        }
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
        this.field1697 = false;
    }

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "()V")
    public final void method726() {
        for (int var1 = 0; var1 < this.field1664; var1++) {
            this.field1643[var1] = -this.field1643[var1];
        }
        field1612++;
        for (int var2 = 0; var2 < this.field1696; var2++) {
            this.field1628[var2] = (short) (-this.field1628[var2]);
        }
        for (int var3 = 0; var3 < this.field1713; var3++) {
            short var4 = this.field1652[var3];
            this.field1652[var3] = this.field1683[var3];
            this.field1683[var3] = var4;
        }
        if (this.field1656 == null && this.field1645 != null) {
            this.field1645.field1401 = null;
        }
        if (this.field1656 != null) {
            this.field1656.field1401 = null;
        }
        if (this.field1708 != null) {
            this.field1708.field5332 = null;
        }
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
        this.field1697 = false;
    }

    @OriginalMember(owner = "client!gm", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final void method727(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1632++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class159.field2576 = 0;
            class184.field2959 = 0;
            int var13 = 0;
            class466.field6930 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1658.length) {
                    int[] var16 = this.field1658[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1681 == null || (arg6 & this.field1681[var18]) != 0) {
                            class184.field2959 += this.field1613[var18];
                            class159.field2576 += this.field1614[var18];
                            class466.field6930 += this.field1643[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class159.field2576 = class159.field2576 / var13 + var10;
                class466.field6930 = class466.field6930 / var13 + var12;
                class184.field2959 = class184.field2959 / var13 + var11;
                class83.field1734 = true;
            } else {
                class159.field2576 = var10;
                class466.field6930 = var12;
                class184.field2959 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 16384 >> 15;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field1658.length > var26) {
                    int[] var27 = this.field1658[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1681 == null || (arg6 & this.field1681[var29]) != 0) {
                            this.field1613[var29] += var23;
                            this.field1614[var29] += var24;
                            this.field1643[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field1658.length) {
                        int[] var50 = this.field1658[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field1681 == null || (this.field1681[var52] & arg6) != 0) {
                                this.field1613[var52] -= class184.field2959;
                                this.field1614[var52] -= class159.field2576;
                                this.field1643[var52] -= class466.field6930;
                                if (arg4 != 0) {
                                    int var53 = class407.field6169[arg4];
                                    int var54 = class407.field6168[arg4];
                                    int var55 = this.field1614[var52] * var53 + this.field1613[var52] * var54 + 32767 >> 15;
                                    this.field1614[var52] = this.field1614[var52] * var54 + 32767 - (this.field1613[var52] * var53) >> 15;
                                    this.field1613[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class407.field6169[arg2];
                                    int var57 = class407.field6168[arg2];
                                    int var58 = this.field1614[var52] * var57 - (this.field1643[var52] * var56 - 32767) >> 15;
                                    this.field1643[var52] = this.field1643[var52] * var57 + (this.field1614[var52] * var56 + 32767) >> 15;
                                    this.field1614[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class407.field6169[arg3];
                                    int var60 = class407.field6168[arg3];
                                    int var61 = this.field1643[var52] * var59 + this.field1613[var52] * var60 + 32767 >> 15;
                                    this.field1643[var52] = this.field1643[var52] * var60 - (this.field1613[var52] * var59 - 32767) >> 15;
                                    this.field1613[var52] = var61;
                                }
                                this.field1613[var52] += class184.field2959;
                                this.field1614[var52] += class159.field2576;
                                this.field1643[var52] += class466.field6930;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field1658.length > var32) {
                            int[] var33 = this.field1658[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field1681 == null || (this.field1681[var35] & arg6) != 0) {
                                    int var36 = this.field1695[var35];
                                    int var37 = this.field1695[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field1606[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class407.field6169[arg4];
                                            int var41 = class407.field6168[arg4];
                                            int var42 = this.field1714[var39] * var40 + (this.field1709[var39] * var41 + 32767) >> 15;
                                            this.field1714[var39] = (short) (this.field1714[var39] * var41 + 32767 - (this.field1709[var39] * var40) >> 15);
                                            this.field1709[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class407.field6169[arg2];
                                            int var44 = class407.field6168[arg2];
                                            int var45 = this.field1714[var39] * var44 + 32767 - (this.field1628[var39] * var43) >> 15;
                                            this.field1628[var39] = (short) (this.field1628[var39] * var44 + this.field1714[var39] * var43 + 32767 >> 15);
                                            this.field1714[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class407.field6169[arg3];
                                            int var47 = class407.field6168[arg3];
                                            int var48 = this.field1709[var39] * var47 + this.field1628[var39] * var46 + 32767 >> 15;
                                            this.field1628[var39] = (short) (this.field1628[var39] * var47 + 32767 - (this.field1709[var39] * var46) >> 15);
                                            this.field1709[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1656 == null && this.field1645 != null) {
                        this.field1645.field1401 = null;
                    }
                    if (this.field1656 != null) {
                        this.field1656.field1401 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class83.field1734) {
                    int var68 = arg7[3] * class159.field2576 + arg7[0] * class184.field2959 + arg7[6] * class466.field6930 + 16384 >> 15;
                    int var69 = arg7[1] * class184.field2959 + arg7[7] * class466.field6930 + arg7[4] * class159.field2576 + 16384 >> 15;
                    int var70 = var65 + var68;
                    int var71 = arg7[2] * class184.field2959 + arg7[5] * class159.field2576 + (arg7[8] * class466.field6930) + 16384 >> 15;
                    int var72 = var66 + var69;
                    int var73 = var67 + var71;
                    class159.field2576 = var72;
                    class184.field2959 = var70;
                    class83.field1734 = false;
                    class466.field6930 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class407.field6168[arg2];
                int var76 = class407.field6169[arg2];
                int var77 = class407.field6168[arg3];
                int var78 = class407.field6169[arg3];
                int var79 = class407.field6168[arg4];
                int var80 = class407.field6169[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[0] = var77 * var79 + (var78 * var82) + 16384 >> 15;
                var74[1] = -var77 * var80 + var78 * var81 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[6] = -var78 * var79 + var77 * var82 + 16384 >> 15;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[7] = var78 * var80 + var77 * var81 + 16384 >> 15;
                int var83 = var74[1] * -class159.field2576 + var74[2] * -class466.field6930 + var74[0] * -class184.field2959 + 16384 >> 15;
                int var84 = var74[5] * -class466.field6930 + var74[4] * -class159.field2576 + var74[3] * -class184.field2959 + 16384 >> 15;
                int var85 = var74[7] * -class159.field2576 + var74[6] * -class184.field2959 + var74[8] * -class466.field6930 + 16384 >> 15;
                int var86 = class184.field2959 + var83;
                int var87 = class159.field2576 + var84;
                int var88 = class466.field6930 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[2] * var67 + (var74[0] * var65 + (var74[1] * var66)) + 16384 >> 15;
                int var92 = var74[5] * var67 + var74[3] * var65 + var74[4] * var66 + 16384 >> 15;
                int var93 = var87 + var92;
                int var94 = var86 + var91;
                int var95 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 16384 >> 15;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var93 + arg7[0] * var94 + 16384 >> 15;
                int var100 = arg7[3] * var94 + (arg7[4] * var93) + arg7[5] * var96 + 16384 >> 15;
                int var101 = arg7[8] * var96 + arg7[7] * var93 + arg7[6] * var94 + 16384 >> 15;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field1658.length) {
                        int[] var107 = this.field1658[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field1681 == null || (arg6 & this.field1681[var109]) != 0) {
                                int var110 = this.field1643[var109] * var97[2] + this.field1614[var109] * var97[1] + this.field1613[var109] * var97[0] + 16384 >> 15;
                                int var111 = this.field1643[var109] * var97[5] + this.field1614[var109] * var97[4] + this.field1613[var109] * var97[3] + 16384 >> 15;
                                int var112 = var103 + var110;
                                int var113 = var102 + var111;
                                int var114 = this.field1614[var109] * var97[7] + this.field1643[var109] * var97[8] + this.field1613[var109] * var97[6] + 16384 >> 15;
                                this.field1613[var109] = var112;
                                int var115 = var104 + var114;
                                this.field1614[var109] = var113;
                                this.field1643[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field1658.length) {
                        int[] var124 = this.field1658[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field1681 == null || (this.field1681[var126] & arg6) != 0) {
                                this.field1613[var126] -= class184.field2959;
                                this.field1614[var126] -= class159.field2576;
                                this.field1643[var126] -= class466.field6930;
                                this.field1613[var126] = this.field1613[var126] * arg2 >> 7;
                                this.field1614[var126] = this.field1614[var126] * arg3 >> 7;
                                this.field1643[var126] = this.field1643[var126] * arg4 >> 7;
                                this.field1613[var126] += class184.field2959;
                                this.field1614[var126] += class159.field2576;
                                this.field1643[var126] += class466.field6930;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class83.field1734) {
                    int var133 = arg7[0] * class184.field2959 + (arg7[3] * class159.field2576) - (-(arg7[6] * class466.field6930) - 16384) >> 15;
                    int var134 = arg7[4] * class159.field2576 + arg7[7] * class466.field6930 + arg7[1] * class184.field2959 + 16384 >> 15;
                    int var135 = arg7[8] * class466.field6930 + arg7[5] * class159.field2576 + arg7[2] * class184.field2959 + 16384 >> 15;
                    int var136 = var130 + var133;
                    int var137 = var131 + var134;
                    class184.field2959 = var136;
                    int var138 = var132 + var135;
                    class159.field2576 = var137;
                    class466.field6930 = var138;
                    class83.field1734 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class184.field2959 * var139 + 16384 >> 15;
                int var143 = -class159.field2576 * var140 + 16384 >> 15;
                int var144 = -class466.field6930 * var141 + 16384 >> 15;
                int var145 = class184.field2959 + var142;
                int var146 = var143 + class159.field2576;
                int var147 = class466.field6930 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var145 + var149;
                int var152 = var132 * var141 + 16384 >> 15;
                int var153 = var146 + var150;
                int var154 = var147 + var152;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[1] * var153 + arg7[0] * var151 + arg7[2] * var154 + 16384 >> 15;
                int var158 = arg7[3] * var151 + arg7[4] * var153 + arg7[5] * var154 + 16384 >> 15;
                int var159 = arg7[8] * var154 + arg7[7] * var153 + arg7[6] * var151 + 16384 >> 15;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field1658.length) {
                        int[] var165 = this.field1658[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field1681 == null || (this.field1681[var167] & arg6) != 0) {
                                int var168 = this.field1643[var167] * var155[2] + this.field1613[var167] * var155[0] - (-(this.field1614[var167] * var155[1]) - 16384) >> 15;
                                int var169 = this.field1614[var167] * var155[4] + (this.field1613[var167] * var155[3] - (-(this.field1643[var167] * var155[5]) - 16384)) >> 15;
                                int var170 = this.field1613[var167] * var155[6] + this.field1614[var167] * var155[7] + this.field1643[var167] * var155[8] + 16384 >> 15;
                                int var171 = var160 + var169;
                                int var172 = var161 + var168;
                                this.field1613[var167] = var172;
                                int var173 = var162 + var170;
                                this.field1614[var167] = var171;
                                this.field1643[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1608 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field1608.length) {
                        int[] var182 = this.field1608[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field1712 == null || (arg6 & this.field1712[var184]) != 0) {
                                int var185 = (this.field1715[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field1715[var184] = (byte) var185;
                                if (this.field1645 != null) {
                                    this.field1645.field1401 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1619 != null) {
                    for (int var178 = 0; var178 < this.field1654; var178++) {
                        class359 var179 = this.field1619[var178];
                        class187 var180 = this.field1610[var178];
                        var180.field2995 = var180.field2995 & 0xFFFFFF | 255 - (this.field1715[var179.field5280] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1608 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field1608.length > var190) {
                        int[] var191 = this.field1608[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field1712 == null || (this.field1712[var193] & arg6) != 0) {
                                int var194 = this.field1673[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD5B) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field1673[var193] = (short) class418.method2558(var200, class418.method2558(var198 << 7, var197 << 10));
                                if (this.field1645 != null) {
                                    this.field1645.field1401 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1619 != null) {
                    for (int var187 = 0; var187 < this.field1654; var187++) {
                        class359 var188 = this.field1619[var187];
                        class187 var189 = this.field1610[var187];
                        var189.field2995 = var189.field2995 & 0xFF000000 | class97.field1892[this.field1673[var188.field5280] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1684 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field1684.length) {
                        int[] var203 = this.field1684[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class187 var205 = this.field1610[var203[var204]];
                            var205.field2997 += arg3;
                            var205.field2994 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1684 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field1684.length) {
                        int[] var208 = this.field1684[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class187 var210 = this.field1610[var208[var209]];
                            var210.field3002 = var210.field3002 * arg3 >> 7;
                            var210.field3000 = var210.field3000 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1684 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field1684.length) {
                    int[] var213 = this.field1684[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class187 var215 = this.field1610[var213[var214]];
                        var215.field3001 = var215.field3001 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "()I")
    public final int method728() {
        field1680++;
        if (!this.field1697) {
            this.method759((byte) -110);
        }
        return this.field1640;
    }

    @OriginalMember(owner = "client!gm", name = "pa", descriptor = "()I")
    public final int method729() {
        field1607++;
        return this.field1633;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    public final void method730(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1664; var4++) {
            if (arg0 != 0) {
                this.field1613[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1614[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1643[var4] += arg2;
            }
        }
        field1609++;
        this.field1697 = false;
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "EA", descriptor = "(Li;)Li;")
    public final class31 method731(class31 arg0) {
        field1662++;
        if (this.field1696 == 0) {
            return null;
        }
        if (!this.field1697) {
            this.method759((byte) -44);
        }
        int var2;
        int var3;
        if (this.field1706.field881 > 0) {
            var2 = this.field1621 - (this.field1706.field881 * this.field1630 >> 8) >> this.field1706.field807;
            var3 = this.field1685 - (this.field1706.field881 * this.field1647 >> 8) >> this.field1706.field807;
        } else {
            var2 = this.field1621 - (this.field1706.field881 * this.field1647 >> 8) >> this.field1706.field807;
            var3 = this.field1685 - (this.field1706.field881 * this.field1630 >> 8) >> this.field1706.field807;
        }
        int var4;
        int var5;
        if (this.field1706.field900 > 0) {
            var4 = this.field1640 - (this.field1706.field900 * this.field1630 >> 8) >> this.field1706.field807;
            var5 = this.field1638 - (this.field1706.field900 * this.field1647 >> 8) >> this.field1706.field807;
        } else {
            var4 = this.field1640 - (this.field1706.field900 * this.field1647 >> 8) >> this.field1706.field807;
            var5 = this.field1638 - (this.field1706.field900 * this.field1630 >> 8) >> this.field1706.field807;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class134 var8 = (class134) arg0;
        class134 var9;
        if (var8 != null && var8.method1023(var6, var7, false)) {
            var9 = var8;
            var8.method1025(0);
        } else {
            var9 = new class134(this.field1706, var6, var7);
        }
        var9.method1020(var5, var4, var2, var3, 4);
        this.method753((byte) 40, var9);
        return var9;
    }

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "(I)V")
    public final void method732(int arg0) {
        this.field1703 = arg0;
        field1644++;
        if (this.field1636 != null && (this.field1703 & 0x10000) == 0) {
            this.field1714 = this.field1636.field539;
            this.field1628 = this.field1636.field534;
            this.field1709 = this.field1636.field540;
            this.field1717 = this.field1636.field538;
            this.field1636 = null;
        }
        this.field1657 = true;
        this.method752(5);
    }

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "()I")
    public final int method733() {
        field1637++;
        return this.field1682;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILgm;ILgm;ZZ)Le;")
    private final class374 method734(int arg0, class81 arg1, int arg2, class81 arg3, boolean arg4, boolean arg5) {
        field1631++;
        arg1.field1696 = this.field1696;
        arg1.field1678 = 0;
        arg1.field1713 = this.field1713;
        arg1.field1664 = this.field1664;
        arg1.field1676 = this.field1676;
        arg1.field1654 = this.field1654;
        arg1.field1703 = arg2;
        arg1.field1693 = this.field1693;
        arg1.field1633 = this.field1633;
        arg1.field1704 = this.field1704;
        arg1.field1682 = this.field1682;
        boolean var7 = class5.method33(true, this.field1676, arg2);
        boolean var8 = class5.method39(1447, this.field1676, arg2);
        boolean var9 = class408.method2529(arg2, this.field1676, -1);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg1.field1613 = this.field1613;
            } else if (arg3.field1613 == null || arg3.field1613.length < this.field1704) {
                arg1.field1613 = arg3.field1613 = new int[this.field1704];
            } else {
                arg1.field1613 = arg3.field1613;
            }
            if (!var8) {
                arg1.field1614 = this.field1614;
            } else if (arg3.field1614 == null || this.field1704 > arg3.field1614.length) {
                arg1.field1614 = arg3.field1614 = new int[this.field1704];
            } else {
                arg1.field1614 = arg3.field1614;
            }
            if (!var9) {
                arg1.field1643 = this.field1643;
            } else if (arg3.field1643 == null || this.field1704 > arg3.field1643.length) {
                arg1.field1643 = arg3.field1643 = new int[this.field1704];
            } else {
                arg1.field1643 = arg3.field1643;
            }
            for (int var11 = 0; var11 < this.field1704; var11++) {
                if (var7) {
                    arg1.field1613[var11] = this.field1613[var11];
                }
                if (var8) {
                    arg1.field1614[var11] = this.field1614[var11];
                }
                if (var9) {
                    arg1.field1643[var11] = this.field1643[var11];
                }
            }
        } else {
            arg1.field1613 = this.field1613;
            arg1.field1614 = this.field1614;
            arg1.field1643 = this.field1643;
        }
        if (class128.method1006(arg2, this.field1676, true)) {
            arg1.field1667 = arg3.field1667;
            if (arg5) {
                arg1.field1678 = (byte) (arg1.field1678 | 0x1);
            }
            arg1.field1667.field1401 = this.field1667.field1401;
            arg1.field1667.field1403 = this.field1667.field1403;
        } else if (class33.method230(true, this.field1676, arg2)) {
            arg1.field1667 = this.field1667;
        } else {
            arg1.field1667 = null;
        }
        if (class280.method1754((byte) -125, arg2, this.field1676)) {
            if (arg3.field1673 == null || arg3.field1673.length < this.field1713) {
                arg1.field1673 = arg3.field1673 = new short[this.field1713];
            } else {
                arg1.field1673 = arg3.field1673;
            }
            for (int var12 = 0; var12 < this.field1713; var12++) {
                arg1.field1673[var12] = this.field1673[var12];
            }
        } else {
            arg1.field1673 = this.field1673;
        }
        if (class355.method2192(arg2, (byte) 85, this.field1676)) {
            if (arg3.field1715 == null || arg3.field1715.length < this.field1713) {
                arg1.field1715 = arg3.field1715 = new byte[this.field1713];
            } else {
                arg1.field1715 = arg3.field1715;
            }
            for (int var13 = 0; var13 < this.field1713; var13++) {
                arg1.field1715[var13] = this.field1715[var13];
            }
        } else {
            arg1.field1715 = this.field1715;
        }
        if (class181.method1237(arg2, 0, this.field1676)) {
            arg1.field1645 = arg3.field1645;
            if (arg5) {
                arg1.field1678 = (byte) (arg1.field1678 | 0x2);
            }
            arg1.field1645.field1401 = this.field1645.field1401;
            arg1.field1645.field1403 = this.field1645.field1403;
        } else if (class419.method2561(-1, this.field1676, arg2)) {
            arg1.field1645 = this.field1645;
        } else {
            arg1.field1645 = null;
        }
        if (class71.method611(arg2, this.field1676, arg0 + 1477)) {
            if (arg3.field1709 == null || this.field1696 > arg3.field1709.length) {
                int var14 = this.field1696;
                arg1.field1714 = arg3.field1714 = new short[var14];
                arg1.field1628 = arg3.field1628 = new short[var14];
                arg1.field1709 = arg3.field1709 = new short[var14];
            } else {
                arg1.field1714 = arg3.field1714;
                arg1.field1709 = arg3.field1709;
                arg1.field1628 = arg3.field1628;
            }
            if (this.field1636 == null) {
                for (int var18 = 0; var18 < this.field1696; var18++) {
                    arg1.field1709[var18] = this.field1709[var18];
                    arg1.field1714[var18] = this.field1714[var18];
                    arg1.field1628[var18] = this.field1628[var18];
                }
            } else {
                if (arg3.field1636 == null) {
                    arg3.field1636 = new class35();
                }
                class35 var15 = arg1.field1636 = arg3.field1636;
                if (var15.field540 == null || this.field1696 > var15.field540.length) {
                    int var16 = this.field1696;
                    var15.field534 = new short[var16];
                    var15.field540 = new short[var16];
                    var15.field538 = new byte[var16];
                    var15.field539 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field1696; var17++) {
                    arg1.field1709[var17] = this.field1709[var17];
                    arg1.field1714[var17] = this.field1714[var17];
                    arg1.field1628[var17] = this.field1628[var17];
                    var15.field540[var17] = this.field1636.field540[var17];
                    var15.field539[var17] = this.field1636.field539[var17];
                    var15.field534[var17] = this.field1636.field534[var17];
                    var15.field538[var17] = this.field1636.field538[var17];
                }
            }
            arg1.field1717 = this.field1717;
        } else {
            arg1.field1717 = this.field1717;
            arg1.field1628 = this.field1628;
            arg1.field1714 = this.field1714;
            arg1.field1636 = this.field1636;
            arg1.field1709 = this.field1709;
        }
        if (class491.method2966(0, arg2, this.field1676)) {
            if (arg5) {
                arg1.field1678 = (byte) (arg1.field1678 | 0x4);
            }
            arg1.field1656 = arg3.field1656;
            arg1.field1656.field1401 = this.field1656.field1401;
            arg1.field1656.field1403 = this.field1656.field1403;
        } else if (class362.method2219((byte) 32, this.field1676, arg2)) {
            arg1.field1656 = this.field1656;
        } else {
            arg1.field1656 = null;
        }
        if (class160.method1145(arg2, arg0 + 1311, this.field1676)) {
            if (arg3.field1624 == null || arg3.field1624.length < this.field1713) {
                int var19 = this.field1696;
                arg1.field1624 = arg3.field1624 = new float[var19];
                arg1.field1666 = arg3.field1666 = new float[var19];
            } else {
                arg1.field1624 = arg3.field1624;
                arg1.field1666 = arg3.field1666;
            }
            for (int var20 = 0; var20 < this.field1696; var20++) {
                arg1.field1624[var20] = this.field1624[var20];
                arg1.field1666[var20] = this.field1666[var20];
            }
        } else {
            arg1.field1666 = this.field1666;
            arg1.field1624 = this.field1624;
        }
        if (class379.method2332(this.field1676, arg2, 126)) {
            if (arg5) {
                arg1.field1678 = (byte) (arg1.field1678 | 0x8);
            }
            arg1.field1669 = arg3.field1669;
            arg1.field1669.field1401 = this.field1669.field1401;
            arg1.field1669.field1403 = this.field1669.field1403;
        } else if (class321.method2058(2048, arg2, this.field1676)) {
            arg1.field1669 = this.field1669;
        } else {
            arg1.field1669 = null;
        }
        if (class172.method1194((byte) 27, arg2, this.field1676)) {
            if (arg3.field1652 == null || this.field1713 > arg3.field1652.length) {
                int var21 = this.field1713;
                arg1.field1702 = arg3.field1702 = new short[var21];
                arg1.field1683 = arg3.field1683 = new short[var21];
                arg1.field1652 = arg3.field1652 = new short[var21];
            } else {
                arg1.field1683 = arg3.field1683;
                arg1.field1652 = arg3.field1652;
                arg1.field1702 = arg3.field1702;
            }
            for (int var22 = 0; var22 < this.field1713; var22++) {
                arg1.field1652[var22] = this.field1652[var22];
                arg1.field1702[var22] = this.field1702[var22];
                arg1.field1683[var22] = this.field1683[var22];
            }
        } else {
            arg1.field1652 = this.field1652;
            arg1.field1683 = this.field1683;
            arg1.field1702 = this.field1702;
        }
        if (class205.method1397(-26108, arg2, this.field1676)) {
            arg1.field1708 = arg3.field1708;
            if (arg5) {
                arg1.field1678 = (byte) (arg1.field1678 | 0x10);
            }
            arg1.field1708.field5332 = this.field1708.field5332;
        } else if (class188.method1279(this.field1676, false, arg2)) {
            arg1.field1708 = this.field1708;
        } else {
            arg1.field1708 = null;
        }
        if (class31.method217(this.field1676, arg2, -20008)) {
            if (arg3.field1629 == null || arg3.field1629.length < this.field1713) {
                int var23 = this.field1713;
                arg1.field1629 = arg3.field1629 = new short[var23];
            } else {
                arg1.field1629 = arg3.field1629;
            }
            for (int var24 = 0; var24 < this.field1713; var24++) {
                arg1.field1629[var24] = this.field1629[var24];
            }
        } else {
            arg1.field1629 = this.field1629;
        }
        if (!class284.method1779(arg0 ^ 0xFFFFFA89, this.field1676, arg2)) {
            arg1.field1610 = this.field1610;
        } else if (arg3.field1610 == null || this.field1654 > arg3.field1610.length) {
            int var26 = this.field1654;
            arg1.field1610 = arg3.field1610 = new class187[var26];
            for (int var27 = 0; var27 < this.field1654; var27++) {
                arg1.field1610[var27] = this.field1610[var27].method1273(true);
            }
        } else {
            arg1.field1610 = arg3.field1610;
            for (int var25 = 0; var25 < this.field1654; var25++) {
                arg1.field1610[var25].method1278(-2, this.field1610[var25]);
            }
        }
        arg1.field1681 = this.field1681;
        arg1.field1687 = this.field1687;
        arg1.field1658 = this.field1658;
        arg1.field1695 = this.field1695;
        arg1.field1608 = this.field1608;
        if (this.field1697) {
            arg1.field1668 = this.field1668;
            arg1.field1697 = true;
            arg1.field1630 = this.field1630;
            arg1.field1621 = this.field1621;
            arg1.field1647 = this.field1647;
            arg1.field1638 = this.field1638;
            arg1.field1640 = this.field1640;
            arg1.field1685 = this.field1685;
        } else {
            arg1.field1697 = false;
        }
        arg1.field1619 = this.field1619;
        arg1.field1684 = this.field1684;
        arg1.field1606 = this.field1606;
        if (arg0 != -1366) {
            this.field1682 = -15;
        }
        arg1.field1716 = this.field1716;
        arg1.field1712 = this.field1712;
        arg1.field1653 = this.field1653;
        return arg1;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    private final void method735(int arg0) {
        field1711++;
        if (this.field1693 == 0) {
            return;
        }
        if (arg0 > -124) {
            this.method732(-29);
        }
        if (this.field1678 != 0) {
            this.method719(true, true);
        }
        this.method719(true, false);
        if (this.field1708 != null) {
            if (this.field1708.field5332 == null) {
                this.method757((this.field1678 & 0x10) != 0, -124);
            }
            if (this.field1708.field5332 != null) {
                this.field1706.method386(this.field1656 != null, -8);
                this.field1706.method352(-128, this.field1667, this.field1669, this.field1656, this.field1645);
                int var2 = this.field1653.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field1653[var3];
                    int var5 = this.field1653[var3 + 1];
                    int var6 = this.field1629[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field1706.method341(var6, true, this.field1656 != null);
                    this.field1706.method370((var5 - var4) * 3, 4, -124, var4 * 3, this.field1708.field5332);
                }
            }
        }
        this.method752(5);
    }

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "()I")
    public final int method736() {
        field1691++;
        if (!this.field1697) {
            this.method759((byte) -81);
        }
        return this.field1647;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()[Lfi;")
    public final class393[] method737() {
        field1627++;
        return this.field1687;
    }

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "(III)V")
    public final void method738(int arg0, int arg1, int arg2) {
        field1641++;
        for (int var4 = 0; var4 < this.field1664; var4++) {
            if (arg0 != 128) {
                this.field1613[var4] = this.field1613[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1614[var4] = this.field1614[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1643[var4] = this.field1643[var4] * arg2 >> 7;
            }
        }
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
        this.field1697 = false;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILoq;)V")
    private final void method739(int arg0, class242 arg1) {
        if (this.field1687 != null) {
            for (int var3 = 0; var3 < this.field1687.length; var3++) {
                class393 var4 = this.field1687[var3];
                class393 var5 = var4;
                if (var4.field5989 != null) {
                    var5 = var4.field5989;
                }
                var5.field5988 = (int) ((float) this.field1643[var4.field6004] * arg1.field3734 + (float) this.field1614[var4.field6004] * arg1.field3735 + (float) this.field1613[var4.field6004] * arg1.field3744 + arg1.field3733);
                var5.field5997 = (int) ((float) this.field1643[var4.field6004] * arg1.field3759 + (float) this.field1614[var4.field6004] * arg1.field3746 + (float) this.field1613[var4.field6004] * arg1.field3763 + arg1.field3764);
                var5.field6002 = (int) ((float) this.field1643[var4.field6004] * arg1.field3741 + (float) this.field1614[var4.field6004] * arg1.field3730 + (float) this.field1613[var4.field6004] * arg1.field3740 + arg1.field3736);
                var5.field6005 = (int) ((float) this.field1643[var4.field6001] * arg1.field3734 + (float) this.field1614[var4.field6001] * arg1.field3735 + (float) this.field1613[var4.field6001] * arg1.field3744 + arg1.field3733);
                var5.field5999 = (int) ((float) this.field1643[var4.field6001] * arg1.field3759 + (float) this.field1614[var4.field6001] * arg1.field3746 + (float) this.field1613[var4.field6001] * arg1.field3763 + arg1.field3764);
                var5.field5994 = (int) ((float) this.field1643[var4.field6001] * arg1.field3741 + (float) this.field1614[var4.field6001] * arg1.field3730 + (float) this.field1613[var4.field6001] * arg1.field3740 + arg1.field3736);
                var5.field6003 = (int) ((float) this.field1643[var4.field5996] * arg1.field3734 + (float) this.field1614[var4.field5996] * arg1.field3735 + (float) this.field1613[var4.field5996] * arg1.field3744 + arg1.field3733);
                var5.field5990 = (int) ((float) this.field1643[var4.field5996] * arg1.field3759 + (float) this.field1614[var4.field5996] * arg1.field3746 + (float) this.field1613[var4.field5996] * arg1.field3763 + arg1.field3764);
                var5.field5993 = (int) ((float) this.field1643[var4.field5996] * arg1.field3741 + (float) this.field1614[var4.field5996] * arg1.field3730 + (float) this.field1613[var4.field5996] * arg1.field3740 + arg1.field3736);
            }
        }
        if (arg0 != 3) {
            this.field1715 = null;
        }
        field1670++;
        if (this.field1716 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field1716.length; var6++) {
            class13 var7 = this.field1716[var6];
            class13 var8 = var7;
            if (var7.field237 != null) {
                var8 = var7.field237;
            }
            if (var7.field235 == null) {
                var7.field235 = arg1.method833();
            } else {
                var7.field235.method828(arg1);
            }
            var8.field243 = (int) ((float) this.field1643[var7.field236] * arg1.field3734 + (float) this.field1614[var7.field236] * arg1.field3735 + (float) this.field1613[var7.field236] * arg1.field3744 + arg1.field3733);
            var8.field241 = (int) ((float) this.field1643[var7.field236] * arg1.field3759 + (float) this.field1614[var7.field236] * arg1.field3746 + (float) this.field1613[var7.field236] * arg1.field3763 + arg1.field3764);
            var8.field240 = (int) ((float) this.field1643[var7.field236] * arg1.field3741 + (float) this.field1614[var7.field236] * arg1.field3730 + (float) this.field1613[var7.field236] * arg1.field3740 + arg1.field3736);
        }
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "()Z")
    public final boolean method740() {
        field1699++;
        if (this.field1658 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1704; var1++) {
            this.field1613[var1] <<= 0x4;
            this.field1614[var1] <<= 0x4;
            this.field1643[var1] <<= 0x4;
        }
        class159.field2576 = 0;
        class184.field2959 = 0;
        class466.field6930 = 0;
        return true;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method741(class374 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1655++;
        class81 var6 = (class81) arg0;
        if (this.field1713 == 0 || var6.field1713 == 0) {
            return;
        }
        int var7 = var6.field1664;
        int[] var8 = var6.field1613;
        int[] var9 = var6.field1614;
        int[] var10 = var6.field1643;
        short[] var11 = var6.field1709;
        short[] var12 = var6.field1714;
        short[] var13 = var6.field1628;
        byte[] var14 = var6.field1717;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1636 == null) {
            var18 = null;
            var16 = null;
            var17 = null;
            var15 = null;
        } else {
            var15 = this.field1636.field538;
            var16 = this.field1636.field539;
            var17 = this.field1636.field540;
            var18 = this.field1636.field534;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1636 == null) {
            var22 = null;
            var19 = null;
            var20 = null;
            var21 = null;
        } else {
            var19 = var6.field1636.field538;
            var20 = var6.field1636.field534;
            var21 = var6.field1636.field540;
            var22 = var6.field1636.field539;
        }
        int[] var23 = var6.field1695;
        short[] var24 = var6.field1606;
        if (!var6.field1697) {
            var6.method759((byte) -79);
        }
        short var25 = var6.field1647;
        short var26 = var6.field1630;
        short var27 = var6.field1621;
        short var28 = var6.field1685;
        short var29 = var6.field1640;
        short var30 = var6.field1638;
        for (int var31 = 0; var31 < this.field1664; var31++) {
            int var32 = this.field1614[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field1613[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field1643[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1695[var31];
                        int var37 = this.field1695[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1606[var38] - 1;
                            if (var35 == -1 || this.field1717[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = var23[var39];
                                    int var42 = -1;
                                    for (int var43 = var41; var43 < var40; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var17 == null) {
                                            this.field1636 = new class35();
                                            var17 = this.field1636.field540 = class281.method1758(this.field1709, 78);
                                            var16 = this.field1636.field539 = class281.method1758(this.field1714, 116);
                                            var18 = this.field1636.field534 = class281.method1758(this.field1628, 108);
                                            var15 = this.field1636.field538 = class508.method3044(this.field1717, 31);
                                        }
                                        if (var21 == null) {
                                            class35 var44 = var6.field1636 = new class35();
                                            var21 = var44.field540 = class281.method1758(var11, 117);
                                            var22 = var44.field539 = class281.method1758(var12, 116);
                                            var20 = var44.field534 = class281.method1758(var13, 83);
                                            var19 = var44.field538 = class508.method3044(var14, 112);
                                        }
                                        short var45 = this.field1709[var35];
                                        short var46 = this.field1714[var35];
                                        short var47 = this.field1628[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field1717[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var21[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var19[var52] += var50;
                                            }
                                        }
                                        byte var53 = var14[var42];
                                        int var54 = this.field1695[var31 + 1];
                                        short var55 = var12[var42];
                                        short var56 = var13[var42];
                                        int var57 = this.field1695[var31];
                                        short var58 = var11[var42];
                                        for (int var59 = var57; var59 < var54; var59++) {
                                            int var60 = this.field1606[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var58;
                                                var16[var60] += var55;
                                                var18[var60] += var56;
                                                var15[var60] += var53;
                                            }
                                        }
                                        if (this.field1656 == null && this.field1645 != null) {
                                            this.field1645.field1401 = null;
                                        }
                                        if (this.field1656 != null) {
                                            this.field1656.field1401 = null;
                                        }
                                        if (var6.field1656 == null && var6.field1645 != null) {
                                            var6.field1645.field1401 = null;
                                        }
                                        if (var6.field1656 != null) {
                                            var6.field1656.field1401 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1698++;
        if (arg1 != 255) {
            this.method765(-123, -52, (byte) -42, (short) 3, 61);
        }
        if (arg5 > arg6 && arg7 > arg6 && arg2 > arg6) {
            return false;
        } else if (arg6 > arg5 && arg6 > arg7 && arg6 > arg2) {
            return false;
        } else if (arg3 > arg8 && arg8 < arg0 && arg4 > arg8) {
            return false;
        } else {
            return arg8 <= arg3 || arg8 <= arg0 || arg4 >= arg8;
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "()V")
    public static final void method743() {
        for (int var0 = 0; var0 < class229.field3555; var0++) {
            class402 var1 = class62.field1266[var0];
            class1.method7(var1);
            class62.field1266[var0] = null;
        }
        class229.field3555 = 0;
    }

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "()I")
    public final int method744() {
        if (!this.field1697) {
            this.method759((byte) -52);
        }
        field1690++;
        return this.field1630;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFJIILpn;IBII)S")
    private final short method745(float arg0, float arg1, long arg2, int arg3, int arg4, class528 arg5, int arg6, byte arg7, int arg8, int arg9) {
        field1672++;
        int var12 = this.field1695[arg4];
        int var13 = this.field1695[arg4 + 1];
        int var14 = 0;
        int var15 = var12;
        if (arg7 >= -31) {
            this.method727(10, null, -82, 57, -18, true, -9, null);
        }
        while (var15 < var13) {
            short var16 = this.field1606[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class496.field7293[var15] == arg2) {
                return (short) (var16 - 1);
            }
            var15++;
        }
        this.field1606[var14] = (short) (this.field1696 + 1);
        class496.field7293[var14] = arg2;
        this.field1709[this.field1696] = (short) arg9;
        this.field1714[this.field1696] = (short) arg8;
        this.field1628[this.field1696] = (short) arg6;
        this.field1717[this.field1696] = (byte) arg3;
        this.field1624[this.field1696] = arg1;
        this.field1666[this.field1696] = arg0;
        return (short) (this.field1696++);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BIZ)Le;")
    public final class374 method746(byte arg0, int arg1, boolean arg2) {
        field1625++;
        class81 var4;
        class81 var5;
        if (arg0 == 1) {
            var5 = this.field1706.field851;
            var4 = this.field1706.field943;
        } else if (arg0 == 2) {
            var4 = this.field1706.field908;
            var5 = this.field1706.field835;
        } else if (arg0 == 3) {
            var4 = this.field1706.field832;
            var5 = this.field1706.field906;
        } else if (arg0 == 4) {
            var4 = this.field1706.field855;
            var5 = this.field1706.field856;
        } else if (arg0 == 5) {
            var4 = this.field1706.field942;
            var5 = this.field1706.field869;
        } else {
            var4 = var5 = new class81(this.field1706);
        }
        return this.method734(-1366, var4, arg1, var5, arg2, arg0 != 0);
    }

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "(I)V")
    public final void method747(int arg0) {
        this.field1682 = (short) arg0;
        field1616++;
        if (this.field1645 != null) {
            this.field1645.field1401 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "(I)V")
    public final void method748(int arg0) {
        field1659++;
        this.field1633 = (short) arg0;
        if (this.field1645 != null) {
            this.field1645.field1401 = null;
        }
        if (this.field1656 != null) {
            this.field1656.field1401 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "(I)V")
    public final void method749(int arg0) {
        field1677++;
        int var2 = class407.field6169[arg0];
        int var3 = class407.field6168[arg0];
        for (int var4 = 0; var4 < this.field1664; var4++) {
            int var7 = this.field1643[var4] * var2 + (this.field1613[var4] * var3) >> 15;
            this.field1643[var4] = this.field1643[var4] * var3 - this.field1613[var4] * var2 >> 15;
            this.field1613[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1696; var5++) {
            int var6 = this.field1709[var5] * var3 + this.field1628[var5] * var2 >> 15;
            this.field1628[var5] = (short) (this.field1628[var5] * var3 - (this.field1709[var5] * var2) >> 15);
            this.field1709[var5] = (short) var6;
        }
        if (this.field1656 == null && this.field1645 != null) {
            this.field1645.field1401 = null;
        }
        if (this.field1656 != null) {
            this.field1656.field1401 = null;
        }
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
        this.field1697 = false;
    }

    @OriginalMember(owner = "client!gm", name = "ta", descriptor = "()I")
    public final int method750() {
        if (!this.field1697) {
            this.method759((byte) -69);
        }
        field1707++;
        return this.field1621;
    }

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "()I")
    public final int method751() {
        field1661++;
        if (!this.field1697) {
            this.method759((byte) -78);
        }
        return this.field1638;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
    private final void method752(int arg0) {
        field1617++;
        if (!this.field1657) {
            return;
        }
        this.field1657 = false;
        if (this.field1687 == null && this.field1716 == null && this.field1619 == null) {
            if (this.field1613 != null && !class31.method219(this.field1703, arg0 - 6, this.field1676)) {
                if (this.field1667 != null && this.field1667.field1401 == null) {
                    this.field1657 = true;
                } else {
                    if (!this.field1697) {
                        this.method759((byte) -44);
                    }
                    this.field1613 = null;
                }
            }
            if (this.field1614 != null && !class378.method2320(this.field1676, this.field1703, 0)) {
                if (this.field1667 != null && this.field1667.field1401 == null) {
                    this.field1657 = true;
                } else {
                    if (!this.field1697) {
                        this.method759((byte) -62);
                    }
                    this.field1614 = null;
                }
            }
            if (this.field1643 != null && !class106.method908(0, this.field1676, this.field1703)) {
                if (this.field1667 != null && this.field1667.field1401 == null) {
                    this.field1657 = true;
                } else {
                    if (!this.field1697) {
                        this.method759((byte) -107);
                    }
                    this.field1643 = null;
                }
            }
        }
        if (this.field1606 != null && this.field1613 == null && this.field1614 == null && this.field1643 == null) {
            this.field1695 = null;
            this.field1606 = null;
        }
        if (this.field1717 != null && !class420.method2569(this.field1676, this.field1703, (byte) 31)) {
            if (this.field1656 == null) {
                if (this.field1645 != null && this.field1645.field1401 == null) {
                    this.field1657 = true;
                } else {
                    this.field1709 = this.field1714 = this.field1628 = null;
                    this.field1717 = null;
                }
            } else if (this.field1656.field1401 == null) {
                this.field1657 = true;
            } else {
                this.field1717 = null;
                this.field1709 = this.field1714 = this.field1628 = null;
            }
        }
        if (this.field1673 != null && !class112.method933(this.field1703, this.field1676, true)) {
            if (this.field1645 != null && this.field1645.field1401 == null) {
                this.field1657 = true;
            } else {
                this.field1673 = null;
            }
        }
        if (arg0 != 5) {
            return;
        }
        if (this.field1715 != null && !class505.method3031(126, this.field1703, this.field1676)) {
            if (this.field1645 != null && this.field1645.field1401 == null) {
                this.field1657 = true;
            } else {
                this.field1715 = null;
            }
        }
        if (this.field1624 != null && !class285.method1785(this.field1676, false, this.field1703)) {
            if (this.field1669 != null && this.field1669.field1401 == null) {
                this.field1657 = true;
            } else {
                this.field1624 = this.field1666 = null;
            }
        }
        if (this.field1629 != null && !class281.method1759(this.field1676, -69, this.field1703)) {
            if (this.field1645 != null && this.field1645.field1401 == null) {
                this.field1657 = true;
            } else {
                this.field1629 = null;
            }
        }
        if (this.field1652 != null && !class363.method2229(this.field1703, true, this.field1676)) {
            if ((this.field1708 == null || this.field1708.field5332 != null) && (this.field1645 == null || this.field1645.field1401 != null)) {
                this.field1652 = this.field1702 = this.field1683 = null;
            } else {
                this.field1657 = true;
            }
        }
        if (this.field1608 != null && !client.method1380(this.field1703, (byte) -109, this.field1676)) {
            this.field1608 = null;
            this.field1712 = null;
        }
        if (this.field1658 != null && !class455.method2718(this.field1676, -1, this.field1703)) {
            this.field1658 = null;
            this.field1681 = null;
        }
        if (this.field1684 != null && !class353.method2187(this.field1676, (byte) 116, this.field1703)) {
            this.field1684 = null;
        }
        if (this.field1653 != null && (this.field1703 & 0x800) == 0 && (this.field1703 & 0x40000) == 0) {
            this.field1653 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLtj;)V")
    private final void method753(byte arg0, class134 arg1) {
        if (this.field1706.field947.length < this.field1696) {
            this.field1706.field951 = new int[this.field1696];
            this.field1706.field947 = new int[this.field1696];
        }
        field1649++;
        int[] var3 = this.field1706.field947;
        int[] var4 = this.field1706.field951;
        for (int var5 = 0; var5 < this.field1664; var5++) {
            int var17 = (this.field1613[var5] - (this.field1614[var5] * this.field1706.field881 >> 8) >> this.field1706.field807) - arg1.field2242;
            int var18 = (this.field1643[var5] - (this.field1614[var5] * this.field1706.field900 >> 8) >> this.field1706.field807) - arg1.field2244;
            int var19 = this.field1695[var5];
            int var20 = this.field1695[var5 + 1];
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field1606[var21] - 1;
                if (var22 == -1) {
                    break;
                }
                var3[var22] = var17;
                var4[var22] = var18;
            }
        }
        for (int var6 = 0; var6 < this.field1693; var6++) {
            if (this.field1715 == null || this.field1715[var6] <= 128) {
                short var8 = this.field1652[var6];
                short var9 = this.field1702[var6];
                short var10 = this.field1683[var6];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var3[var10];
                int var14 = var4[var8];
                int var15 = var4[var9];
                int var16 = var4[var10];
                if ((var11 - var12) * (var15 - var16) - ((var15 - var14) * (var13 - var12)) > 0) {
                    arg1.method1022(var14, (byte) 11, var15, var12, var13, var11, var16);
                }
            }
        }
        int var7 = 13 / ((-arg0 - 50) / 60);
    }

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "(I)V")
    public final void method754(int arg0) {
        field1651++;
        int var2 = class407.field6169[arg0];
        int var3 = class407.field6168[arg0];
        for (int var4 = 0; var4 < this.field1664; var4++) {
            int var5 = this.field1614[var4] * var2 + this.field1613[var4] * var3 >> 15;
            this.field1614[var4] = this.field1614[var4] * var3 - this.field1613[var4] * var2 >> 15;
            this.field1613[var4] = var5;
        }
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
        this.field1697 = false;
    }

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "(SS)V")
    public final void method755(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1713; var3++) {
            if (this.field1673[var3] == arg0) {
                this.field1673[var3] = arg1;
            }
        }
        field1620++;
        if (this.field1619 != null) {
            for (int var4 = 0; var4 < this.field1654; var4++) {
                class359 var5 = this.field1619[var4];
                class187 var6 = this.field1610[var4];
                var6.field2995 = class97.field1892[this.field1673[var5.field5280] & 0xFFFF] & 0xFFFFFF | var6.field2995 & 0xFF000000;
            }
        }
        if (this.field1645 != null) {
            this.field1645.field1401 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)V")
    public final void method756(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1713; var5++) {
            int var9 = this.field1673[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x388) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field1673[var5] = (short) class418.method2558(var12, class418.method2558(var11 << 7, var10 << 10));
        }
        field1686++;
        if (this.field1619 != null) {
            for (int var6 = 0; var6 < this.field1654; var6++) {
                class359 var7 = this.field1619[var6];
                class187 var8 = this.field1610[var6];
                var8.field2995 = class97.field1892[this.field1673[var7.field5280] & 0xFFFF] & 0xFFFFFF | var8.field2995 & 0xFF000000;
            }
        }
        if (this.field1645 != null) {
            this.field1645.field1401 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V")
    private final void method757(boolean arg0, int arg1) {
        field1642++;
        if (this.field1706.field934.field4408.length < this.field1693 * 6) {
            this.field1706.field934 = new class364((this.field1693 + 100) * 6);
        } else {
            this.field1706.field934.field4399 = 0;
        }
        class364 var3 = this.field1706.field934;
        if (this.field1706.field924) {
            for (int var5 = 0; var5 < this.field1693; var5++) {
                var3.method1865(this.field1652[var5], 812856296);
                var3.method1865(this.field1702[var5], 812856296);
                var3.method1865(this.field1683[var5], 812856296);
            }
        } else {
            for (int var4 = 0; var4 < this.field1693; var4++) {
                var3.method1852(-95, this.field1652[var4]);
                var3.method1852(123, this.field1702[var4]);
                var3.method1852(103, this.field1683[var4]);
            }
        }
        if (var3.field4399 == 0) {
            return;
        }
        if (arg0) {
            if (this.field1660 == null) {
                this.field1660 = this.field1706.method406(var3.field4399, -81, true, 5123, var3.field4408);
            } else {
                this.field1660.method1902(var3.field4408, var3.field4399, -24568, 5123);
            }
            this.field1708.field5332 = this.field1660;
        } else {
            this.field1708.field5332 = this.field1706.method406(var3.field4399, -114, false, 5123, var3.field4408);
        }
        int var6 = 69 / ((arg1 + 66) / 54);
        if (!arg0) {
            this.field1657 = true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "KA", descriptor = "()V")
    public final void method758() {
        field1694++;
        for (int var1 = 0; var1 < this.field1704; var1++) {
            this.field1613[var1] = this.field1613[var1] + 7 >> 4;
            this.field1614[var1] = this.field1614[var1] + 7 >> 4;
            this.field1643[var1] = this.field1643[var1] + 7 >> 4;
        }
        this.field1697 = false;
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    private final void method759(byte arg0) {
        field1701++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1664; var10++) {
            int var11 = this.field1613[var10];
            int var12 = this.field1614[var10];
            int var13 = this.field1643[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field1685 = (short) var5;
        this.field1621 = (short) var2;
        this.field1630 = (short) var6;
        this.field1638 = (short) var7;
        if (arg0 > -40) {
            return;
        }
        this.field1647 = (short) var3;
        this.field1640 = (short) var4;
        this.field1668 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field1697 = true;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
    public static void method760(boolean arg0) {
        field1675 = null;
        field1639 = null;
        if (!arg0) {
            method743();
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()Z")
    public final boolean method761() {
        field1618++;
        if (this.field1629 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1629.length; var1++) {
            if (this.field1629[var1] != -1 && !this.field1706.field4358.method108(false, this.field1629[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
    private final void method762(int arg0) {
        field1700++;
        if (arg0 != 3) {
            method766(null, (byte) 83, null);
        }
        if (this.field1619 == null) {
            return;
        }
        class242 var2 = this.field1706.field802;
        float var3 = this.field1706.method417();
        float var4 = this.field1706.method431();
        this.field1706.method377(-1767680616);
        this.field1706.method273(false);
        this.field1706.method386(false, -8);
        this.field1706.method352(75, this.field1706.field903, this.field1706.field892, null, null);
        for (int var5 = 0; var5 < this.field1654; var5++) {
            class359 var6 = this.field1619[var5];
            class187 var7 = this.field1610[var5];
            if (!var6.field5271 || !this.field1706.method334()) {
                float var8 = (float) (this.field1613[var6.field5283] + this.field1613[var6.field5279] + this.field1613[var6.field5275]) * 0.3333333F;
                float var9 = (float) (this.field1614[var6.field5283] + this.field1614[var6.field5279] + this.field1614[var6.field5275]) * 0.3333333F;
                float var10 = (float) (this.field1643[var6.field5279] - (-this.field1643[var6.field5283] - this.field1643[var6.field5275])) * 0.3333333F;
                float var11 = class189.field3031 * var10 + class529.field7722 * var9 + class433.field6444 * var8 + class270.field4103;
                float var12 = class515.field7478 * var10 + class370.field5439 * var9 + class209.field3341 * var8 + class2.field52;
                float var13 = class506.field7378 * var10 + class460.field6857 * var9 + class429.field6415 * var8 + class513.field7451;
                var2.method1583((float) var7.field2997 - var12, (float) var7.field2994 + var11, -var13, -43, var6.field5277 * var7.field3000 >> 7, var7.field3001, var6.field5284 * var7.field3002 >> 7);
                this.field1706.method436(var2, -109);
                this.field1706.method385(var4, var3 - (float) var6.field5276 * 1.5F);
                int var14 = var7.field2995;
                OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                this.field1706.method430(var6.field5272, (byte) -92);
                this.field1706.method340((byte) 113, var6.field5270);
                this.field1706.method288((byte) 5, var6.field5278);
                this.field1706.method312(7, 0, 4, 7111);
            }
        }
        this.field1706.method385(var4, var3);
        this.field1706.method273(true);
        this.field1706.method343(-1);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method763(int arg0, int arg1, class124 arg2, boolean arg3) {
        field1674++;
        class242 var5 = (class242) arg2;
        class242 var6 = this.field1706.field904;
        float var7 = var5.field3736 * var6.field3734 + var5.field3764 * var6.field3735 + var5.field3733 * var6.field3744 + var6.field3733;
        float var8 = var5.field3736 * var6.field3759 + var5.field3764 * var6.field3746 + var5.field3733 * var6.field3763 + var6.field3764;
        class460.field6857 = var5.field3730 * var6.field3741 + var5.field3746 * var6.field3730 + var5.field3735 * var6.field3740;
        float var9 = var5.field3736 * var6.field3741 + var5.field3764 * var6.field3730 + var5.field3733 * var6.field3740 + var6.field3736;
        class429.field6415 = var5.field3740 * var6.field3741 + var5.field3763 * var6.field3730 + var5.field3744 * var6.field3740;
        class506.field7378 = var5.field3741 * var6.field3741 + var5.field3759 * var6.field3730 + var5.field3734 * var6.field3740;
        class529.field7722 = var5.field3730 * var6.field3734 + var5.field3746 * var6.field3735 + var5.field3735 * var6.field3744;
        class370.field5439 = var5.field3730 * var6.field3759 + var5.field3746 * var6.field3746 + var5.field3735 * var6.field3763;
        class189.field3031 = var5.field3741 * var6.field3734 + var5.field3759 * var6.field3735 + var5.field3734 * var6.field3744;
        class209.field3341 = var5.field3740 * var6.field3759 + var5.field3763 * var6.field3746 + var5.field3744 * var6.field3763;
        class433.field6444 = var5.field3740 * var6.field3734 + var5.field3763 * var6.field3735 + var5.field3744 * var6.field3744;
        class515.field7478 = var5.field3741 * var6.field3759 + var5.field3759 * var6.field3746 + var5.field3734 * var6.field3763;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field1706.field913;
        int var16 = this.field1706.field867;
        if (!this.field1697) {
            this.method759((byte) -101);
        }
        class443.field6579[0] = this.field1621;
        class502.field7344[0] = this.field1647;
        class443.field6579[1] = this.field1685;
        class352.field5197[0] = this.field1640;
        class502.field7344[1] = this.field1647;
        class352.field5197[1] = this.field1640;
        class443.field6579[2] = this.field1621;
        class502.field7344[2] = this.field1630;
        class443.field6579[3] = this.field1685;
        class352.field5197[2] = this.field1640;
        class502.field7344[3] = this.field1630;
        class352.field5197[3] = this.field1640;
        class443.field6579[4] = this.field1621;
        class502.field7344[4] = this.field1647;
        class443.field6579[5] = this.field1685;
        class352.field5197[4] = this.field1638;
        class502.field7344[5] = this.field1647;
        class443.field6579[6] = this.field1621;
        class352.field5197[5] = this.field1638;
        class502.field7344[6] = this.field1630;
        class352.field5197[6] = this.field1638;
        class443.field6579[7] = this.field1685;
        class502.field7344[7] = this.field1630;
        class352.field5197[7] = this.field1638;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class443.field6579[var17];
            float var39 = (float) class502.field7344[var17];
            float var40 = (float) class352.field5197[var17];
            float var41 = class506.field7378 * var40 + class460.field6857 * var39 + class429.field6415 * var38 + var9;
            float var42 = class515.field7478 * var40 + class370.field5439 * var39 + class209.field3341 * var38 + var8;
            float var43 = class189.field3031 * var40 + class529.field7722 * var39 + class433.field6444 * var38 + var7;
            if ((float) this.field1706.field922 <= var41) {
                float var44 = (float) var15 * var43 / var41 + (float) this.field1706.field945;
                float var45 = (float) var16 * var42 / var41 + (float) this.field1706.field870;
                if (var44 < var11) {
                    var11 = var44;
                }
                if (var12 < var44) {
                    var12 = var44;
                }
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && var13 < (float) arg1 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field1706.field947.length < this.field1696) {
                this.field1706.field951 = new int[this.field1696];
                this.field1706.field947 = new int[this.field1696];
            }
            int[] var18 = this.field1706.field947;
            int[] var19 = this.field1706.field951;
            for (int var20 = 0; var20 < this.field1664; var20++) {
                float var22 = (float) this.field1613[var20];
                float var23 = (float) this.field1643[var20];
                float var24 = (float) this.field1614[var20];
                float var25 = class515.field7478 * var23 + class370.field5439 * var24 + class209.field3341 * var22 + var8;
                float var26 = class189.field3031 * var23 + class529.field7722 * var24 + class433.field6444 * var22 + var7;
                float var27 = class506.field7378 * var23 + class460.field6857 * var24 + class429.field6415 * var22 + var9;
                if (var27 >= (float) this.field1706.field922) {
                    int var28 = (int) ((float) var15 * var26 / var27 + (float) this.field1706.field945);
                    int var29 = (int) ((float) var16 * var25 / var27 + (float) this.field1706.field870);
                    int var30 = this.field1695[var20];
                    int var31 = this.field1695[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field1606[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field1695[var20];
                    int var35 = this.field1695[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field1606[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field1606[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field1713; var21++) {
                if (var18[this.field1652[var21]] != -999999 && var18[this.field1702[var21]] != -999999 && var18[this.field1683[var21]] != -999999 && this.method742(var18[this.field1702[var21]], 255, var19[this.field1683[var21]], var18[this.field1652[var21]], var18[this.field1683[var21]], var19[this.field1652[var21]], arg1, var19[this.field1702[var21]], arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gm", name = "da", descriptor = "(IILya;Lya;III)V")
    public final void method764(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6) {
        field1611++;
        if (!this.field1697) {
            this.method759((byte) -124);
        }
        int var8 = this.field1621 + arg4;
        int var9 = this.field1685 + arg4;
        int var10 = this.field1640 + arg6;
        int var11 = this.field1638 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || var9 + arg2.field552 >> arg2.field558 >= arg2.field551 || var10 < 0 || arg2.field554 <= (arg2.field552 + var11 >> arg2.field558)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field552 + var9 >> arg3.field558) >= arg3.field551 || var10 < 0 || (arg3.field552 + var11 >> arg3.field558) >= arg3.field554) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field558;
            int var13 = arg2.field552 - (1 - var9) >> arg2.field558;
            int var14 = var10 >> arg2.field558;
            int var15 = arg2.field552 + var11 - 1 >> arg2.field558;
            if (arg5 == arg2.method177(var12, var14) && arg5 == arg2.method177(var13, var14) && arg2.method177(var12, var15) == arg5 && arg5 == arg2.method177(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field1664; var16++) {
                this.field1614[var16] = this.field1614[var16] + arg2.method186(this.field1613[var16] + arg4, this.field1643[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field1647;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field1664; var18++) {
                int var19 = (this.field1614[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field1614[var18] += (arg2.method186(this.field1613[var18] + arg4, this.field1643[var18] - -arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = (arg1 >> 8 & 0xFF) * 4;
            int var31 = (arg1 & 0xFF099A) >> 16 << 6;
            int var32 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var29 >> 1) < 0 || ((var29 >> 1) + arg4 + arg2.field552) >= (arg2.field551 << arg2.field558) || (arg6 - (var30 >> 1)) < 0 || arg2.field554 << arg2.field558 <= (var30 >> 1) + arg6 + arg2.field552) {
                return;
            }
            this.method2299(var31, arg6, arg5, arg2, var30, var29, arg4, 0, var32);
        } else if (arg0 == 4) {
            int var27 = this.field1630 - this.field1647;
            for (int var28 = 0; var28 < this.field1664; var28++) {
                this.field1614[var28] += arg3.method186(this.field1613[var28] + arg4, this.field1643[var28] + arg6) + var27 - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field1630 - this.field1647;
            for (int var21 = 0; var21 < this.field1664; var21++) {
                int var22 = this.field1613[var21] + arg4;
                int var23 = this.field1643[var21] + arg6;
                int var24 = arg2.method186(var22, var23);
                int var25 = arg3.method186(var22, var23);
                int var26 = var24 - var25;
                this.field1614[var21] = ((this.field1614[var21] << 8) / var20 * var26 >> 8) + var24 - arg5;
            }
        }
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
        this.field1697 = false;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIBSI)I")
    private final int method765(int arg0, int arg1, byte arg2, short arg3, int arg4) {
        if (arg0 != -3) {
            return 82;
        }
        field1671++;
        int var6 = class97.field1892[class383.method2356(arg4, arg1, false)];
        if (arg3 != -1) {
            class486 var7 = this.field1706.field4358.method105(arg0 - 124, arg3 & 0xFFFF);
            int var8 = var7.field7139 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 <= 127) {
                    var9 = arg1 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field7146 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var14 & 0xFF00) + ((var13 << 8 & 0xFF00CB) + (var15 >> 8));
            }
        }
        return (var6 << 8) + 255 - (arg2 & 0xFF);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
    public static final void method766(String arg0, byte arg1, String arg2) {
        int var3 = 6 % ((-arg1 - 20) / 53);
        field1710++;
        class68.field1382 = 1;
        class405.field6102 = -1;
        class414.method2546(arg0, (byte) -116, arg2);
    }

    @OriginalMember(owner = "client!gm", name = "za", descriptor = "(IIII)V")
    public final void method767(int arg0, int arg1, int arg2, int arg3) {
        field1622++;
        if (arg0 == 0) {
            class159.field2576 = 0;
            int var5 = 0;
            class184.field2959 = 0;
            class466.field6930 = 0;
            for (int var6 = 0; var6 < this.field1664; var6++) {
                class184.field2959 += this.field1613[var6];
                class159.field2576 += this.field1614[var6];
                var5++;
                class466.field6930 += this.field1643[var6];
            }
            if (var5 > 0) {
                class466.field6930 = class466.field6930 / var5 + arg3;
                class184.field2959 = class184.field2959 / var5 + arg1;
                class159.field2576 = class159.field2576 / var5 + arg2;
            } else {
                class184.field2959 = arg1;
                class159.field2576 = arg2;
                class466.field6930 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1664; var7++) {
                this.field1613[var7] += arg1;
                this.field1614[var7] += arg2;
                this.field1643[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1664; var8++) {
                this.field1613[var8] -= class184.field2959;
                this.field1614[var8] -= class159.field2576;
                this.field1643[var8] -= class466.field6930;
                if (arg3 != 0) {
                    int var9 = class407.field6169[arg3];
                    int var10 = class407.field6168[arg3];
                    int var11 = this.field1614[var8] * var9 + this.field1613[var8] * var10 + 32767 >> 15;
                    this.field1614[var8] = this.field1614[var8] * var10 + 32767 - (this.field1613[var8] * var9) >> 15;
                    this.field1613[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class407.field6169[arg1];
                    int var13 = class407.field6168[arg1];
                    int var14 = this.field1614[var8] * var13 + 32767 - this.field1643[var8] * var12 >> 15;
                    this.field1643[var8] = this.field1614[var8] * var12 + this.field1643[var8] * var13 + 32767 >> 15;
                    this.field1614[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class407.field6169[arg2];
                    int var16 = class407.field6168[arg2];
                    int var17 = this.field1643[var8] * var15 + (this.field1613[var8] * var16) + 32767 >> 15;
                    this.field1643[var8] = this.field1643[var8] * var16 - (this.field1613[var8] * var15 - 32767) >> 15;
                    this.field1613[var8] = var17;
                }
                this.field1613[var8] += class184.field2959;
                this.field1614[var8] += class159.field2576;
                this.field1643[var8] += class466.field6930;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1664; var18++) {
                this.field1613[var18] -= class184.field2959;
                this.field1614[var18] -= class159.field2576;
                this.field1643[var18] -= class466.field6930;
                this.field1613[var18] = this.field1613[var18] * arg1 / 128;
                this.field1614[var18] = this.field1614[var18] * arg2 / 128;
                this.field1643[var18] = this.field1643[var18] * arg3 / 128;
                this.field1613[var18] += class184.field2959;
                this.field1614[var18] += class159.field2576;
                this.field1643[var18] += class466.field6930;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1713; var19++) {
                int var23 = (this.field1715[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1715[var19] = (byte) var23;
            }
            if (this.field1645 != null) {
                this.field1645.field1401 = null;
            }
            if (this.field1619 != null) {
                for (int var20 = 0; var20 < this.field1654; var20++) {
                    class359 var21 = this.field1619[var20];
                    class187 var22 = this.field1610[var20];
                    var22.field2995 = var22.field2995 & 0xFFFFFF | 255 - (this.field1715[var21.field5280] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1713; var24++) {
                int var28 = this.field1673[var24] & 0xFFFF;
                int var29 = (var28 & 0xFE5C) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = var29 + arg1 & 0x3F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field1673[var24] = (short) class418.method2558(var34, class418.method2558(var33 << 7, var32 << 10));
            }
            if (this.field1645 != null) {
                this.field1645.field1401 = null;
            }
            if (this.field1619 != null) {
                for (int var25 = 0; var25 < this.field1654; var25++) {
                    class359 var26 = this.field1619[var25];
                    class187 var27 = this.field1610[var25];
                    var27.field2995 = var27.field2995 & 0xFF000000 | class97.field1892[this.field1673[var26.field5280] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1654; var35++) {
                class187 var36 = this.field1610[var35];
                var36.field2997 += arg2;
                var36.field2994 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1654; var37++) {
                class187 var38 = this.field1610[var37];
                var38.field3000 = var38.field3000 * arg1 >> 7;
                var38.field3002 = var38.field3002 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1654; var39++) {
                class187 var40 = this.field1610[var39];
                var40.field3001 = var40.field3001 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "RA", descriptor = "()I")
    public final int method768() {
        field1688++;
        return this.field1703;
    }

    @OriginalMember(owner = "client!gm", name = "ma", descriptor = "(I)V")
    public final void method769(int arg0) {
        field1650++;
        int var2 = class407.field6169[arg0];
        int var3 = class407.field6168[arg0];
        for (int var4 = 0; var4 < this.field1664; var4++) {
            int var5 = this.field1643[var4] * var2 + this.field1613[var4] * var3 >> 15;
            this.field1643[var4] = this.field1643[var4] * var3 - (this.field1613[var4] * var2) >> 15;
            this.field1613[var4] = var5;
        }
        this.field1697 = false;
        if (this.field1667 != null) {
            this.field1667.field1401 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lda;)V")
    public class81(class44 arg0) {
        this.field1706 = arg0;
        this.field1667 = new class70(null, 5126, 3, 0);
        this.field1669 = new class70(null, 5126, 2, 0);
        this.field1656 = new class70(null, 5126, 3, 0);
        this.field1645 = new class70(null, 5121, 4, 0);
        this.field1708 = new class365();
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lda;Lpn;IIII)V")
    public class81(class44 arg0, class528 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1676 = arg5;
        this.field1703 = arg2;
        this.field1706 = arg0;
        if (class33.method230(true, arg5, arg2)) {
            this.field1667 = new class70(null, 5126, 3, 0);
        }
        if (class321.method2058(2048, arg2, arg5)) {
            this.field1669 = new class70(null, 5126, 2, 0);
        }
        if (class362.method2219((byte) 32, arg5, arg2)) {
            this.field1656 = new class70(null, 5126, 3, 0);
        }
        if (class419.method2561(-1, arg5, arg2)) {
            this.field1645 = new class70(null, 5121, 4, 0);
        }
        if (class188.method1279(arg5, false, arg2)) {
            this.field1708 = new class365();
        }
        class16 var7 = arg0.field4358;
        this.field1695 = new int[arg1.field7675 + 1];
        int[] var8 = new int[arg1.field7680];
        for (int var9 = 0; var9 < arg1.field7680; var9++) {
            if ((arg1.field7669 == null || arg1.field7669[var9] != 2) && (arg1.field7705 == null || arg1.field7705[var9] == -1 || !var7.method105(-128, arg1.field7705[var9] & 0xFFFF).field7161)) {
                var8[this.field1713++] = var9;
                this.field1695[arg1.field7706[var9]]++;
                this.field1695[arg1.field7699[var9]]++;
                this.field1695[arg1.field7684[var9]]++;
            }
        }
        this.field1693 = this.field1713;
        long[] var10 = new long[this.field1713];
        boolean var11 = (this.field1703 & 0x100) != 0;
        label496: for (int var12 = 0; var12 < this.field1713; var12++) {
            int var180 = var8[var12];
            class486 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7713 != null) {
                for (int var186 = 0; var186 < arg1.field7713.length; var186++) {
                    class132 var187 = arg1.field7713[var186];
                    if (var187.field2217 == var180) {
                        class236 var188 = class435.method2609(0, var187.field2216);
                        if (var188.field3634) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field1693--;
                            continue label496;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7705 != null) {
                var189 = arg1.field7705[var180];
                if (var189 != -1) {
                    var181 = var7.method105(-125, var189 & 0xFFFF);
                    var185 = var181.field7163;
                    var184 = var181.field7141;
                }
            }
            boolean var190 = arg1.field7704 != null && arg1.field7704[var180] != 0 || var181 != null && !var181.field7148;
            if ((var11 || var190) && arg1.field7690 != null) {
                var182 += arg1.field7690[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class381.method2343(var10, var8, 0);
        this.field1643 = arg1.field7667;
        this.field1704 = arg1.field7687;
        this.field1613 = arg1.field7664;
        this.field1664 = arg1.field7675;
        this.field1681 = arg1.field7716;
        this.field1614 = arg1.field7702;
        this.field1716 = arg1.field7696;
        class475[] var13 = new class475[this.field1664];
        this.field1687 = arg1.field7672;
        if (arg1.field7713 != null) {
            this.field1654 = arg1.field7713.length;
            this.field1610 = new class187[this.field1654];
            this.field1619 = new class359[this.field1654];
            for (int var14 = 0; var14 < this.field1654; var14++) {
                class132 var15 = arg1.field7713[var14];
                class236 var16 = class435.method2609(0, var15.field2216);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1713; var18++) {
                    if (var8[var18] == var15.field2217) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class97.field1892[arg1.field7674[var15.field2217] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7704 == null ? 0 : arg1.field7704[var15.field2217]) << 24;
                this.field1619[var14] = new class359(var17, arg1.field7706[var15.field2217], arg1.field7699[var15.field2217], arg1.field7684[var15.field2217], var16.field3641, var16.field3640, var16.field3632, var16.field3633, var16.field3631, var16.field3634, var16.field3635, var15.field2215);
                this.field1610[var14] = new class187(var20);
            }
        }
        int var21 = this.field1713 * 3;
        this.field1702 = new short[this.field1713];
        this.field1633 = (short) arg4;
        if (arg1.field7673 != null) {
            this.field1712 = new short[this.field1713];
        }
        this.field1714 = new short[var21];
        this.field1715 = new byte[this.field1713];
        this.field1628 = new short[var21];
        this.field1666 = new float[var21];
        this.field1629 = new short[this.field1713];
        this.field1606 = new short[var21];
        this.field1709 = new short[var21];
        this.field1624 = new float[var21];
        this.field1682 = (short) arg3;
        this.field1683 = new short[this.field1713];
        this.field1717 = new byte[var21];
        this.field1652 = new short[this.field1713];
        this.field1673 = new short[this.field1713];
        class496.field7293 = new long[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7675; var23++) {
            int var179 = this.field1695[var23];
            this.field1695[var23] = var22;
            var22 += var179;
            var13[var23] = new class475();
        }
        this.field1695[arg1.field7675] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7711 != null) {
            int var28 = arg1.field7671;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field1713; var36++) {
                int var43 = var8[var36];
                if (arg1.field7711[var43] != -1) {
                    int var44 = arg1.field7711[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7706[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7699[var43];
                        } else {
                            var46 = arg1.field7684[var43];
                        }
                        int var47 = arg1.field7664[var46];
                        int var48 = arg1.field7702[var46];
                        int var49 = arg1.field7667[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var26 = new int[var28];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7709[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field7718[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 <= 0) {
                            var40 = 1.0F;
                            var41 = (float) (-var39) / 1024.0F;
                        } else {
                            var41 = 1.0F;
                            var40 = (float) var39 / 1024.0F;
                        }
                        var42 = 64.0F / (float) arg1.field7692[var37];
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field7692[var37];
                        var41 = 64.0F / (float) arg1.field7718[var37];
                        var40 = 64.0F / (float) arg1.field7691[var37];
                    } else {
                        var41 = (float) arg1.field7718[var37] / 1024.0F;
                        var42 = (float) arg1.field7692[var37] / 1024.0F;
                        var40 = (float) arg1.field7691[var37] / 1024.0F;
                    }
                    var27[var37] = class196.method1320(arg1.field7666[var37], arg1.field7676[var37], var40, class490.method2960(arg1.field7688[var37], 255), 0, var42, arg1.field7703[var37], var41);
                }
            }
        }
        class372[] var50 = new class372[arg1.field7680];
        for (int var51 = 0; var51 < arg1.field7680; var51++) {
            short var158 = arg1.field7706[var51];
            short var159 = arg1.field7699[var51];
            short var160 = arg1.field7684[var51];
            int var161 = this.field1613[var159] - this.field1613[var158];
            int var162 = this.field1614[var159] - this.field1614[var158];
            int var163 = this.field1643[var159] - this.field1643[var158];
            int var164 = this.field1613[var160] - this.field1613[var158];
            int var165 = this.field1614[var160] - this.field1614[var158];
            int var166 = this.field1643[var160] - this.field1643[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - var162 * var164;
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var169 * var169 + (var168 * var168)));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field7669 == null ? 0 : arg1.field7669[var51];
            if (var174 == 0) {
                class475 var175 = var13[var158];
                var175.field7037++;
                var175.field7039 += var172;
                var175.field7046 += var171;
                var175.field7041 += var173;
                class475 var176 = var13[var159];
                var176.field7039 += var172;
                var176.field7046 += var171;
                var176.field7041 += var173;
                var176.field7037++;
                class475 var177 = var13[var160];
                var177.field7037++;
                var177.field7046 += var171;
                var177.field7039 += var172;
                var177.field7041 += var173;
            } else if (var174 == 1) {
                class372 var178 = var50[var51] = new class372();
                var178.field5450 = var173;
                var178.field5451 = var172;
                var178.field5448 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field1713; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7674[var68] & 0xFFFF;
            short var70;
            if (arg1.field7705 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7705[var68];
            }
            int var71;
            if (arg1.field7711 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7711[var68];
            }
            int var72;
            if (arg1.field7704 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7704[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var75 = 1.0F;
                    var76 = 1.0F;
                    var80 = 2;
                    var74 = 1.0F;
                    var73 = 0.0F;
                    var78 = 0.0F;
                    var79 = 1;
                    var77 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7709[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field7706[var68];
                        short var112 = arg1.field7699[var68];
                        short var113 = arg1.field7684[var68];
                        short var114 = arg1.field7703[var71];
                        short var115 = arg1.field7676[var71];
                        short var116 = arg1.field7666[var71];
                        float var117 = (float) arg1.field7664[var114];
                        float var118 = (float) arg1.field7702[var114];
                        float var119 = (float) arg1.field7667[var114];
                        float var120 = (float) arg1.field7664[var115] - var117;
                        float var121 = (float) arg1.field7702[var115] - var118;
                        float var122 = (float) arg1.field7667[var115] - var119;
                        float var123 = (float) arg1.field7664[var116] - var117;
                        float var124 = (float) arg1.field7702[var116] - var118;
                        float var125 = (float) arg1.field7667[var116] - var119;
                        float var126 = (float) arg1.field7664[var111] - var117;
                        float var127 = (float) arg1.field7702[var111] - var118;
                        float var128 = (float) arg1.field7667[var111] - var119;
                        float var129 = (float) arg1.field7664[var112] - var117;
                        float var130 = (float) arg1.field7702[var112] - var118;
                        float var131 = (float) arg1.field7667[var112] - var119;
                        float var132 = (float) arg1.field7664[var113] - var117;
                        float var133 = (float) arg1.field7702[var113] - var118;
                        float var134 = (float) arg1.field7667[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var122 * var135 - var120 * var137;
                        float var143 = var121 * var137 - var122 * var136;
                        float var144 = var120 * var136 - (var121 * var135);
                        float var145 = 1.0F / (var125 * var144 + var123 * var143 + var124 * var142);
                        var76 = (var131 * var144 + var129 * var143 + var130 * var142) * var145;
                        var74 = (var128 * var144 + var126 * var143 + var127 * var142) * var145;
                        var78 = (var134 * var144 + var132 * var143 + var133 * var142) * var145;
                    } else {
                        short var83 = arg1.field7706[var68];
                        short var84 = arg1.field7699[var68];
                        short var85 = arg1.field7684[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field7689[var71];
                        float var91 = (float) arg1.field7694[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field7691[var71] / 1024.0F;
                            class36.method245(var92, var88, arg1.field7667[var83], var91, var89, arg1.field7664[var83], arg1.field7702[var83], var86, var87, (byte) -105, var90);
                            var74 = class278.field4197;
                            var73 = class484.field7127;
                            class36.method245(var92, var88, arg1.field7667[var84], var91, var89, arg1.field7664[var84], arg1.field7702[var84], var86, var87, (byte) -105, var90);
                            var76 = class278.field4197;
                            var75 = class484.field7127;
                            class36.method245(var92, var88, arg1.field7667[var85], var91, var89, arg1.field7664[var85], arg1.field7702[var85], var86, var87, (byte) -105, var90);
                            var78 = class278.field4197;
                            var77 = class484.field7127;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > var93)) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var93 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var92;
                                }
                                if ((var93 < var75 - var73)) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var73 - var75 > var93) {
                                    var79 = 2;
                                    var75 += var92;
                                }
                            } else {
                                if ((var93 < var76 - var74)) {
                                    var79 = 1;
                                    var76 -= var92;
                                } else if (var93 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var92;
                                }
                                if ((var78 - var74 > var93)) {
                                    var78 -= var92;
                                    var80 = 1;
                                } else if (var93 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field7683[var71] / 256.0F;
                            float var95 = (float) arg1.field7677[var71] / 256.0F;
                            int var96 = arg1.field7664[var84] - arg1.field7664[var83];
                            int var97 = arg1.field7702[var84] - arg1.field7702[var83];
                            int var98 = arg1.field7667[var84] - arg1.field7667[var83];
                            int var99 = arg1.field7664[var85] - arg1.field7664[var83];
                            int var100 = arg1.field7702[var85] - arg1.field7702[var83];
                            int var101 = arg1.field7667[var85] - arg1.field7667[var83];
                            int var102 = var97 * var101 - var98 * var100;
                            int var103 = var98 * var99 - var96 * var101;
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field7718[var71];
                            float var106 = 64.0F / (float) arg1.field7692[var71];
                            float var107 = 64.0F / (float) arg1.field7691[var71];
                            float var108 = (var89[2] * (float) var104 + var89[1] * (float) var103 + var89[0] * (float) var102) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class130.method1013(2, var108, var110, var109);
                            class316.method1993(var95, var88, var89, var86, var87, var94, var90, arg1.field7664[var83], arg1.field7702[var83], (byte) -32, var91, var81, arg1.field7667[var83]);
                            var73 = class457.field6777;
                            var74 = class195.field3141;
                            class316.method1993(var95, var88, var89, var86, var87, var94, var90, arg1.field7664[var84], arg1.field7702[var84], (byte) -123, var91, var81, arg1.field7667[var84]);
                            var76 = class195.field3141;
                            var75 = class457.field6777;
                            class316.method1993(var95, var88, var89, var86, var87, var94, var90, arg1.field7664[var85], arg1.field7702[var85], (byte) -53, var91, var81, arg1.field7667[var85]);
                            var78 = class195.field3141;
                            var77 = class457.field6777;
                        } else if (var82 == 3) {
                            class28.method200(var88, var89, arg1.field7667[var83], var90, var87, var86, 0, var91, arg1.field7664[var83], arg1.field7702[var83]);
                            var73 = class173.field2795;
                            var74 = class409.field6192;
                            class28.method200(var88, var89, arg1.field7667[var84], var90, var87, var86, 0, var91, arg1.field7664[var84], arg1.field7702[var84]);
                            var76 = class409.field6192;
                            var75 = class173.field2795;
                            class28.method200(var88, var89, arg1.field7667[var85], var90, var87, var86, 0, var91, arg1.field7664[var85], arg1.field7702[var85]);
                            var77 = class173.field2795;
                            var78 = class409.field6192;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field7669 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7669[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field7706[var68];
                short var153 = arg1.field7699[var68];
                short var154 = arg1.field7684[var68];
                class475 var155 = var13[var152];
                this.field1652[var52] = this.method745(var74, var73, var150, var155.field7037, var152, arg1, var155.field7039, (byte) -75, var155.field7041, var155.field7046);
                class475 var156 = var13[var153];
                this.field1702[var52] = this.method745(var76, var75, (long) var79 + var150, var156.field7037, var153, arg1, var156.field7039, (byte) -41, var156.field7041, var156.field7046);
                class475 var157 = var13[var154];
                this.field1683[var52] = this.method745(var78, var77, (long) var80 + var150, var157.field7037, var154, arg1, var157.field7039, (byte) -81, var157.field7041, var157.field7046);
            } else if (var146 == 1) {
                class372 var147 = var50[var68];
                long var148 = ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32) + (long) ((var147.field5451 + 256 << 22) + (var147.field5450 + 256 << 12) + (var147.field5448 <= 0 ? 2048 : 1024) + (var71 << 2));
                this.field1652[var52] = this.method745(var74, var73, var148, 0, arg1.field7706[var68], arg1, var147.field5451, (byte) -107, var147.field5450, var147.field5448);
                this.field1702[var52] = this.method745(var76, var75, (long) var79 + var148, 0, arg1.field7699[var68], arg1, var147.field5451, (byte) -70, var147.field5450, var147.field5448);
                this.field1683[var52] = this.method745(var78, var77, (long) var80 + var148, 0, arg1.field7684[var68], arg1, var147.field5451, (byte) -127, var147.field5450, var147.field5448);
            }
            if (arg1.field7705 == null) {
                this.field1629[var52] = -1;
            } else {
                this.field1629[var52] = arg1.field7705[var68];
            }
            if (arg1.field7704 != null) {
                this.field1715[var52] = arg1.field7704[var68];
            }
            if (arg1.field7673 != null) {
                this.field1712[var52] = arg1.field7673[var68];
            }
            this.field1673[var52] = arg1.field7674[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field1693; var55++) {
            short var67 = this.field1629[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field1653 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field1693; var58++) {
            short var66 = this.field1629[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field1653[var56++] = var58;
            }
        }
        this.field1653[var56] = this.field1693;
        class496.field7293 = null;
        this.field1709 = class191.method1293(this.field1709, (byte) 49, this.field1696);
        this.field1714 = class191.method1293(this.field1714, (byte) 49, this.field1696);
        this.field1628 = class191.method1293(this.field1628, (byte) 49, this.field1696);
        this.field1717 = class57.method519(this.field1717, (byte) -125, this.field1696);
        this.field1624 = class304.method1946(this.field1624, 93, this.field1696);
        this.field1666 = class304.method1946(this.field1666, 88, this.field1696);
        if (arg1.field7710 != null && class455.method2718(this.field1676, -1, arg2)) {
            this.field1658 = arg1.method3123((byte) 36);
        }
        if (arg1.field7713 != null && class353.method2187(this.field1676, (byte) 106, arg2)) {
            this.field1684 = arg1.method3122(27306);
        }
        if (arg1.field7700 != null && client.method1380(arg2, (byte) -109, this.field1676)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field1713; var61++) {
                int var65 = arg1.field7700[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field1608 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field1608[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field1713; var63++) {
                int var64 = arg1.field7700[var8[var63]];
                if (var64 >= 0) {
                    this.field1608[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
