import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class127 {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    private int field1783 = 32;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Z")
    private boolean field1790 = false;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "J")
    private long field1787 = class223.method1433((byte) -114);

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "[Lta;")
    private class262[] field1807 = new class262[8];

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "J")
    private long field1810 = 0L;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "Z")
    private boolean field1814 = true;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    private int field1806 = 0;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    private int field1809 = 0;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "J")
    private long field1812 = 0L;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "[Lta;")
    private class262[] field1817 = new class262[8];

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    private int field1819 = 0;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    private int field1816 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1782 = 100;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Lta;")
    private class262 field1796;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
    public int[] field1788;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "[I")
    public static int[] field1794;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public final synchronized void method848(int arg0) {
        field1799++;
        this.field1814 = true;
        try {
            this.method9();
            if (arg0 != 1582) {
                method852(98, false);
            }
        } catch (Exception var2) {
            this.method10();
            this.field1810 = class223.method1433((byte) -124) + 2000L;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public static final void method849(int arg0, int arg1) {
        if (arg0 <= 55) {
            method853(-34);
        }
        field1786++;
        class77.field1073.method536(-48, arg1);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public final synchronized void method850(int arg0) {
        field1795++;
        if (this.field1790) {
            return;
        }
        long var2 = class223.method1433((byte) -127);
        try {
            if (var2 > this.field1787 + 500000L) {
                this.field1787 = var2 - 500000L;
            }
            while ((this.field1787 + 5000L) < var2) {
                this.method854(-5293, 256);
                this.field1787 += (long) (256000 / class60.field845);
            }
        } catch (Exception var8) {
            this.field1787 = var2;
        }
        if (this.field1788 == null) {
            return;
        }
        try {
            if (this.field1810 != 0L) {
                if (this.field1810 > var2) {
                    return;
                }
                this.method12(this.field1815);
                this.field1810 = 0L;
                this.field1814 = true;
            }
            int var4 = this.method14();
            int var5 = this.field1818 + this.field1813;
            if (this.field1819 < this.field1816 - var4) {
                this.field1819 = this.field1816 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            int var6 = -8 / ((-arg0 - 3) / 57);
            if ((var5 + 256) > this.field1815) {
                this.field1815 += 1024;
                if (this.field1815 > 16384) {
                    this.field1815 = 16384;
                }
                var4 = 0;
                this.method10();
                this.method12(this.field1815);
                this.field1814 = true;
                if (var5 + 256 > this.field1815) {
                    var5 = this.field1815 - 256;
                    this.field1813 = var5 - this.field1818;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method861(this.field1788, 256);
                this.method11();
            }
            if (this.field1812 < var2) {
                if (this.field1814) {
                    this.field1814 = false;
                } else if (this.field1819 == 0 && this.field1806 == 0) {
                    this.method10();
                    this.field1810 = var2 + 2000L;
                    return;
                } else {
                    this.field1813 = Math.min(this.field1806, this.field1819);
                    this.field1806 = this.field1819;
                }
                this.field1819 = 0;
                this.field1812 = var2 + 2000L;
            }
            this.field1816 = var4;
        } catch (Exception var7) {
            this.method10();
            this.field1810 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public void method12(int arg0) throws Exception {
        field1808++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IJ)V")
    public static final void method851(int arg0, long arg1) {
        field1784++;
        if (arg0 != -9623) {
            method849(29, -16);
        }
        if (arg1 != 0L) {
            class281.field4359.method1864(7, (byte) -69);
            class281.field4359.method1451(arg1, (byte) -24);
            class148.field2045++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
    public static final void method852(int arg0, boolean arg1) {
        class108.field1503.method536(-48, arg0);
        field1780++;
        if (arg1) {
            method852(43, false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()V")
    public void method10() {
        field1811++;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    public static final void method853(int arg0) {
        class108.field1503.method546(-90762264);
        if (arg0 >= -31) {
            method852(55, false);
        }
        field1801++;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()V")
    public void method11() throws Exception {
        field1798++;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)V")
    private final void method854(int arg0, int arg1) {
        this.field1809 -= arg1;
        if (this.field1809 < 0) {
            this.field1809 = 0;
        }
        if (arg0 == -5293) {
            if (this.field1796 != null) {
                this.field1796.method356(arg1);
            }
            field1803++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method13(Component arg0) throws Exception {
        field1785++;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()I")
    public int method14() throws Exception {
        field1804++;
        return this.field1815;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public static final void method855(int arg0) {
        class6.field48.method546(-90762264);
        field1793++;
        class236.field3594.method546(-90762264);
        if (arg0 != -6220) {
            method851(47, -51L);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLta;)V")
    public final synchronized void method856(byte arg0, class262 arg1) {
        this.field1796 = arg1;
        field1792++;
        if (arg0 >= -58) {
            this.field1816 = 18;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public final void method857(byte arg0) {
        if (arg0 == -36) {
            field1791++;
            this.field1814 = true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public static void method858(int arg0) {
        if (arg0 <= 37) {
            field1781 = -127;
        }
        field1794 = null;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
    public final synchronized void method859(int arg0) {
        if (class254.field3885 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class254.field3885.field3945[var3] == this) {
                    class254.field3885.field3945[var3] = null;
                }
                if (class254.field3885.field3945[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class254.field3885.field3950 = true;
                while (class254.field3885.field3947) {
                    class28.method182(50L, 126);
                }
                class254.field3885 = null;
            }
        }
        this.method10();
        field1789++;
        this.field1788 = null;
        int var4 = -90 / ((14 - arg0) / 61);
        this.field1790 = true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lta;IB)V")
    private final void method860(class262 arg0, int arg1, byte arg2) {
        field1800++;
        if (arg2 > -25) {
            method855(-114);
        }
        int var4 = arg1 >> 5;
        class262 var5 = this.field1817[var4];
        if (var5 == null) {
            this.field1807[var4] = arg0;
        } else {
            var5.field3957 = arg0;
        }
        this.field1817[var4] = arg0;
        arg0.field3959 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()V")
    public void method9() throws Exception {
        field1797++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([II)V")
    private final void method861(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class286.field4477) {
            var3 = arg1 << 1;
        }
        class115.method777(arg0, 0, var3);
        this.field1809 -= arg1;
        if (this.field1796 != null && this.field1809 <= 0) {
            this.field1809 += class60.field845 >> 4;
            class104.method683(11, this.field1796);
            this.method860(this.field1796, this.field1796.method746(), (byte) -92);
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
                        class262 var10 = null;
                        class262 var11 = this.field1807[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class260 var12 = var11.field3958;
                                if (var12 == null || var12.field3944 <= var8) {
                                    var11.field3956 = true;
                                    int var13 = var11.method362();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3944 += var13;
                                    }
                                    if (var4 >= this.field1783) {
                                        break label107;
                                    }
                                    class262 var14 = var11.method355();
                                    if (var14 != null) {
                                        int var15 = var11.field3959;
                                        while (var14 != null) {
                                            this.method860(var14, var15 * var14.method746() >> 8, (byte) -121);
                                            var14 = var11.method358();
                                        }
                                    }
                                    class262 var16 = var11.field3957;
                                    var11.field3957 = null;
                                    if (var10 == null) {
                                        this.field1807[var7] = var16;
                                    } else {
                                        var10.field3957 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1817[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3957;
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
                class262 var18 = this.field1807[var17];
                this.field1807[var17] = this.field1817[var17] = null;
                while (var18 != null) {
                    class262 var19 = var18.field3957;
                    var18.field3957 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1809 < 0) {
            this.field1809 = 0;
        }
        if (this.field1796 != null) {
            this.field1796.method361(arg0, 0, arg1);
        }
        this.field1787 = class223.method1433((byte) -116);
    }
}
