import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class100 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    private int field1748 = 32;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "J")
    private long field1751 = class136.method950(8954);

    @OriginalMember(owner = "client!el", name = "F", descriptor = "J")
    private long field1777 = 0L;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "[Lvg;")
    private class224[] field1783 = new class224[8];

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    private int field1785 = 0;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "Z")
    private boolean field1780 = true;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    private int field1782 = 0;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    private int field1778 = 0;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "[Lvg;")
    private class224[] field1773 = new class224[8];

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    private int field1787 = 0;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "J")
    private long field1775 = 0L;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Lvf;")
    public static class265 field1757 = class87.method582(-46, "(Udns");

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field1768 = -1;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Lvf;")
    public static class265 field1765 = class87.method582(-46, ",Mcran)2titre ouvert");

    @OriginalMember(owner = "client!el", name = "C", descriptor = "Z")
    public static boolean field1774 = false;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Ldg;")
    public static class276 field1753 = new class276(4);

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field1784 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field1786 = 0;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    private int field1779;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Lfl;")
    public static class192 field1746;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lvg;")
    private class224 field1762;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "Lsb;")
    public static class92 field1781;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[I")
    public int[] field1767;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
    public void method386() throws Exception {
        field1770++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I")
    public static int method662(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public void method382(int arg0) throws Exception {
        field1755++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([II)V")
    private final void method663(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class51.field1080) {
            var3 = arg1 << 1;
        }
        class194.method1341(arg0, 0, var3);
        this.field1778 -= arg1;
        if (this.field1762 != null && this.field1778 <= 0) {
            this.field1778 += class125.field2242 >> 4;
            class145.method998(this.field1762, (byte) 118);
            this.method665(this.field1762, -108, this.field1762.method1200());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class224 var10 = null;
                        class224 var11 = this.field1783[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class128 var12 = var11.field3990;
                                if (var12 == null || var12.field2277 <= var8) {
                                    var11.field3993 = true;
                                    int var13 = var11.method174();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2277 += var13;
                                    }
                                    if (var4 >= this.field1748) {
                                        break label107;
                                    }
                                    class224 var14 = var11.method211();
                                    if (var14 != null) {
                                        int var15 = var11.field3991;
                                        while (var14 != null) {
                                            this.method665(var14, 124, var15 * var14.method1200() >> 8);
                                            var14 = var11.method182();
                                        }
                                    }
                                    class224 var16 = var11.field3992;
                                    var11.field3992 = null;
                                    if (var10 == null) {
                                        this.field1783[var7] = var16;
                                    } else {
                                        var10.field3992 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1773[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3992;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class224 var18 = this.field1783[var17];
                this.field1783[var17] = this.field1773[var17] = null;
                while (var18 != null) {
                    class224 var19 = var18.field3992;
                    var18.field3992 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1778 < 0) {
            this.field1778 = 0;
        }
        if (this.field1762 != null) {
            this.field1762.method192(arg0, 0, arg1);
        }
        this.field1751 = class136.method950(8954);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLjava/util/Random;I)I")
    public static final int method664(byte arg0, Random arg1, int arg2) {
        if (arg0 != -86) {
            field1746 = null;
        }
        field1759++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class209.method1433(127, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class110.method728(1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lvg;II)V")
    private final void method665(class224 arg0, int arg1, int arg2) {
        field1766++;
        int var4 = arg2 >> 5;
        class224 var5 = this.field1773[var4];
        if (var5 == null) {
            this.field1783[var4] = arg0;
        } else {
            var5.field3992 = arg0;
        }
        this.field1773[var4] = arg0;
        arg0.field3991 = arg2;
        int var6 = 31 / ((arg1 - 77) / 47);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()V")
    public void method384() {
        field1771++;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)I")
    public static final int method666(int arg0, int arg1) {
        field1769++;
        return arg1 == 2000 ? arg0 >>> 8 : -96;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public final synchronized void method667(boolean arg0) {
        field1747++;
        if (class66.field1272 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class66.field1272.field2767[var3] == this) {
                    class66.field1272.field2767[var3] = null;
                }
                if (class66.field1272.field2767[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class66.field1272.field2768 = true;
                while (class66.field1272.field2766) {
                    class19.method136(1, 50L);
                }
                class66.field1272 = null;
            }
        }
        if (!arg0) {
            this.method384();
            this.field1767 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()I")
    public int method385() throws Exception {
        field1752++;
        return this.field1772;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1765 = null;
        if (arg0 != 1455624928) {
            method668(68);
        }
        field1757 = null;
        field1746 = null;
        field1781 = null;
        field1753 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)V")
    public final synchronized void method669(boolean arg0) {
        field1754++;
        if (this.field1767 == null) {
            return;
        }
        long var2 = class136.method950(8954);
        try {
            if (this.field1775 != 0L) {
                if (var2 < this.field1775) {
                    return;
                }
                this.method382(this.field1772);
                this.field1780 = true;
                this.field1775 = 0L;
            }
            int var4 = this.method385();
            int var5 = this.field1779 + this.field1776;
            if ((this.field1787 - var4) > this.field1782) {
                this.field1782 = this.field1787 - var4;
            }
            if (!arg0) {
                field1746 = null;
            }
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field1772) {
                this.field1772 += 1024;
                if (this.field1772 > 16384) {
                    this.field1772 = 16384;
                }
                var4 = 0;
                this.method384();
                this.method382(this.field1772);
                if (var5 + 256 > this.field1772) {
                    var5 = this.field1772 - 256;
                    this.field1779 = var5 - this.field1776;
                }
                this.field1780 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method663(this.field1767, 256);
                this.method383();
            }
            if (var2 > this.field1777) {
                if (this.field1780) {
                    this.field1780 = false;
                } else if (this.field1782 == 0 && this.field1785 == 0) {
                    this.method384();
                    this.field1775 = var2 + 2000L;
                    return;
                } else {
                    this.field1779 = Math.min(this.field1785, this.field1782);
                    this.field1785 = this.field1782;
                }
                this.field1782 = 0;
                this.field1777 = var2 + 2000L;
            }
            this.field1787 = var4;
        } catch (Exception var7) {
            this.method384();
            this.field1775 = var2 + 2000L;
        }
        try {
            if (this.field1751 + 500000L < var2) {
                var2 = this.field1751;
            }
            while (var2 > (this.field1751 + 5000L)) {
                this.method673(256, (byte) -13);
                this.field1751 += (long) (256000 / class125.field2242);
            }
        } catch (Exception var6) {
            this.field1751 = var2;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public final synchronized void method670(int arg0) {
        this.field1780 = true;
        int var2 = 6 / ((arg0 + 39) / 37);
        field1750++;
        try {
            this.method386();
        } catch (Exception var3) {
            this.method384();
            this.field1775 = class136.method950(8954) + 2000L;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method387(Component arg0) throws Exception {
        field1761++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILvg;)V")
    public final synchronized void method671(int arg0, class224 arg1) {
        if (arg0 > -54) {
            this.method675(-67);
        }
        field1758++;
        this.field1762 = arg1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILvf;)Lue;")
    public static final class13 method672(int arg0, class265 arg1) {
        field1764++;
        for (class13 var2 = (class13) class48.field1032.method789((byte) -103); var2 != null; var2 = (class13) class48.field1032.method787((byte) -76)) {
            if (var2.field410.method1776((byte) -127, arg1)) {
                return var2;
            }
        }
        int var3 = 78 / ((arg0 - 81) / 36);
        return null;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()V")
    public void method383() throws Exception {
        field1756++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)V")
    private final void method673(int arg0, byte arg1) {
        this.field1778 -= arg0;
        field1760++;
        if (this.field1778 < 0) {
            this.field1778 = 0;
        }
        int var3 = 4 / ((48 - arg1) / 47);
        if (this.field1762 != null) {
            this.field1762.method208(arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILfl;)V")
    public static final void method674(int arg0, class192 arg1) {
        field1749++;
        if (class145.field2718) {
            return;
        }
        class35.method300();
        if (arg0 != 5992) {
            field1781 = null;
        }
        class144.field2686 = class280.method1909(true, class98.field1725, arg1);
        int var2 = class50.field1053;
        int var3 = var2 * 956 / 503;
        class144.field2686.method600((class26.field706 - var3) / 2, 0, var3, var2);
        class139.field2534 = class189.method1295(arg1, false, class62.field1231);
        class139.field2534.method277(class26.field706 / 2 - class139.field2534.field2925 / 2, 18);
        class145.field2718 = true;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
    public final void method675(int arg0) {
        field1763++;
        this.field1780 = true;
        if (arg0 != 0) {
            field1757 = null;
        }
    }
}
