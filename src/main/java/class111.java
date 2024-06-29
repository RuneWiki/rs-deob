import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class111 {

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    private int field1806 = 32;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "J")
    private long field1803 = class293.method1985((byte) -71);

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    private int field1813 = 0;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "J")
    private long field1814 = 0L;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    private int field1816 = 0;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "[Lwf;")
    private class18[] field1812 = new class18[8];

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    private int field1819 = 0;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "J")
    private long field1817 = 0L;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "[Lwf;")
    private class18[] field1820 = new class18[8];

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    private int field1823 = 0;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Z")
    private boolean field1822 = true;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lmh;")
    public static class62 field1797 = class201.method1405(true, ")3)3)3");

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Llb;")
    public static class109 field1810 = new class109();

    @OriginalMember(owner = "client!je", name = "G", descriptor = "Lmh;")
    public static class62 field1824 = class201.method1405(true, "mapscene");

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Lmh;")
    public static class62 field1826 = class201.method1405(true, "(R");

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field1827 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    private int field1815;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Lwf;")
    private class18 field1809;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "Z")
    public static boolean field1825;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "[I")
    public int[] field1804;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V", line = 4)
    public void method851() throws Exception {
        field1802++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 11)
    public final void method852(boolean arg0) {
        field1800++;
        this.field1822 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([II)V", line = 20)
    private final void method853(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class75.field1219) {
            var3 = arg1 << 1;
        }
        class231.method1634(arg0, 0, var3);
        this.field1823 -= arg1;
        if (this.field1809 != null && this.field1823 <= 0) {
            this.field1823 += class151.field2393 >> 4;
            class199.method1391(this.field1809, -85);
            this.method857(61, this.field1809.method77(), this.field1809);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class18 var10 = null;
                        class18 var11 = this.field1820[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class279 var12 = var11.field177;
                                if (var12 == null || var12.field4786 <= var8) {
                                    var11.field178 = true;
                                    int var13 = var11.method71();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4786 += var13;
                                    }
                                    if (var4 >= this.field1806) {
                                        break label105;
                                    }
                                    class18 var14 = var11.method74();
                                    if (var14 != null) {
                                        int var15 = var11.field175;
                                        while (var14 != null) {
                                            this.method857(109, var15 * var14.method77() >> 8, var14);
                                            var14 = var11.method68();
                                        }
                                    }
                                    class18 var16 = var11.field176;
                                    var11.field176 = null;
                                    if (var10 == null) {
                                        this.field1820[var7] = var16;
                                    } else {
                                        var10.field176 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1812[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field176;
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
                class18 var18 = this.field1820[var17];
                this.field1820[var17] = this.field1812[var17] = null;
                while (var18 != null) {
                    class18 var19 = var18.field176;
                    var18.field176 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1823 < 0) {
            this.field1823 = 0;
        }
        if (this.field1809 != null) {
            this.field1809.method65(arg0, 0, arg1);
        }
        this.field1803 = class293.method1985((byte) -71);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 179)
    public final synchronized void method854(int arg0) {
        field1796++;
        if (class114.field1895 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class114.field1895.field3959[var3] == this) {
                    class114.field1895.field3959[var3] = null;
                }
                if (class114.field1895.field3959[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class114.field1895.field3967 = true;
                while (class114.field1895.field3960) {
                    class99.method792(-1, 50L);
                }
                class114.field1895 = null;
            }
        }
        this.method858();
        this.field1804 = null;
        if (arg0 != -16385) {
            this.method858();
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V", line = 225)
    public void method855() throws Exception {
        field1794++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILwf;)V", line = 241)
    public final synchronized void method856(int arg0, class18 arg1) {
        field1805++;
        if (arg0 != -13346) {
            this.field1823 = 21;
        }
        this.field1809 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILwf;)V", line = 255)
    private final void method857(int arg0, int arg1, class18 arg2) {
        field1792++;
        int var4 = arg1 >> 5;
        class18 var5 = this.field1812[var4];
        if (var5 == null) {
            this.field1820[var4] = arg2;
        } else {
            var5.field176 = arg2;
        }
        if (arg0 < 2) {
            this.field1812 = (class18[]) null;
        }
        this.field1812[var4] = arg2;
        arg2.field175 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V", line = 276)
    public void method858() {
        field1808++;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 284)
    public final synchronized void method859(int arg0) {
        field1793++;
        if (this.field1804 == null) {
            return;
        }
        long var2 = class293.method1985((byte) -71);
        try {
            if ((long) arg0 != this.field1814) {
                if (var2 < this.field1814) {
                    return;
                }
                this.method862(this.field1818);
                this.field1814 = 0L;
                this.field1822 = true;
            }
            int var4 = this.method864();
            if (this.field1816 - var4 > this.field1813) {
                this.field1813 = this.field1816 - var4;
            }
            int var5 = this.field1821 + this.field1815;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field1818) {
                var4 = 0;
                this.field1818 += 1024;
                if (this.field1818 > 16384) {
                    this.field1818 = 16384;
                }
                this.method858();
                this.method862(this.field1818);
                this.field1822 = true;
                if (var5 + 256 > this.field1818) {
                    var5 = this.field1818 - 256;
                    this.field1815 = var5 - this.field1821;
                }
            }
            while (var4 < var5) {
                var4 += 256;
                this.method853(this.field1804, 256);
                this.method851();
            }
            if (var2 > this.field1817) {
                if (this.field1822) {
                    this.field1822 = false;
                } else if (this.field1813 == 0 && this.field1819 == 0) {
                    this.method858();
                    this.field1814 = var2 + 2000L;
                    return;
                } else {
                    this.field1815 = Math.min(this.field1819, this.field1813);
                    this.field1819 = this.field1813;
                }
                this.field1817 = var2 + 2000L;
                this.field1813 = 0;
            }
            this.field1816 = var4;
        } catch (Exception var9) {
            this.method858();
            this.field1814 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field1803 + 500000L)) {
                var2 = this.field1803;
            }
            while (var2 > this.field1803 + 5000L) {
                this.method865(256, 0);
                this.field1803 += (long) (256000 / class151.field2393);
            }
        } catch (Exception var8) {
            this.field1803 = var2;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z", line = 409)
    public static final boolean method860(int arg0, int arg1) {
        field1799++;
        if (arg1 == 453521696) {
            return ((arg0 & 0x1B083120) >> 28) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V", line = 429)
    public final synchronized void method861(int arg0) {
        this.field1822 = true;
        field1795++;
        try {
            if (arg0 < 112) {
                this.method852(false);
            }
            this.method855();
        } catch (Exception var3) {
            this.method858();
            this.field1814 = class293.method1985((byte) -71) + 2000L;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 450)
    public void method862(int arg0) throws Exception {
        field1811++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 458)
    public static void method863(byte arg0) {
        field1797 = null;
        field1810 = null;
        if (arg0 != 73) {
            field1827 = -20;
        }
        field1826 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()I", line = 471)
    public int method864() throws Exception {
        field1807++;
        return this.field1818;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V", line = 480)
    private final void method865(int arg0, int arg1) {
        this.field1823 -= arg0;
        field1798++;
        if (this.field1823 < 0) {
            this.field1823 = 0;
        }
        if (arg1 != 0) {
            method863((byte) 47);
        }
        if (this.field1809 != null) {
            this.field1809.method69(arg0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 512)
    public void method866(Component arg0) throws Exception {
        field1801++;
    }
}
