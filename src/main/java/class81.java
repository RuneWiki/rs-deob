import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 {

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    private int field1812 = 32;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "J")
    private long field1811 = class44.method375((byte) 10);

    @OriginalMember(owner = "client!le", name = "r", descriptor = "J")
    private long field1818 = 0L;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Z")
    private boolean field1826 = true;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "[Lbe;")
    private class13[] field1822 = new class13[8];

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[Lbe;")
    private class13[] field1825 = new class13[8];

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    private int field1821 = 0;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    private int field1830 = 0;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "J")
    private long field1833 = 0L;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    private int field1832 = 0;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    private int field1834 = 0;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Loa;")
    private static class98 field1824 = class38.method349(255, "Login limit exceeded)3");

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Loa;")
    public static class98 field1806 = field1824;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lja;")
    public static class63 field1802 = new class63();

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Loa;")
    public static class98 field1831 = class38.method349(255, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field1835 = 10;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "Ln;")
    public static class90 field1836 = new class90(128);

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Z")
    public static boolean field1837 = false;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Loa;")
    public static class98 field1838 = class38.method349(255, ")1");

    @OriginalMember(owner = "client!le", name = "M", descriptor = "Loa;")
    public static class98 field1839 = class38.method349(255, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lbe;")
    private class13 field1801;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    public int[] field1804;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public void method288() throws Exception {
        field1810++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
    public int method289() throws Exception {
        field1816++;
        return this.field1819;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public final synchronized void method647(int arg0) {
        field1807++;
        if (class120.field2701 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class120.field2701.field231[var3] == this) {
                    class120.field2701.field231[var3] = null;
                }
                if (class120.field2701.field231[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class120.field2701.field226 = true;
                while (class120.field2701.field236) {
                    class82.method691(50L, (byte) -81);
                }
                class120.field2701 = null;
            }
        }
        this.method287();
        if (arg0 == 21102) {
            this.field1804 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method291(Component arg0) throws Exception {
        field1813++;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
    public void method286() throws Exception {
        field1828++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([II)V")
    private final void method648(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class32.field782) {
            var3 = arg1 << 1;
        }
        int var4 = 0;
        var3 -= 7;
        while (var4 < var3) {
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
        }
        var3 += 7;
        while (var4 < var3) {
            arg0[var4++] = 0;
        }
        this.field1832 -= arg1;
        if (this.field1801 != null && this.field1832 <= 0) {
            this.field1832 += class8.field194 >> 4;
            client.method208(this.field1801, (byte) 107);
            this.method654((byte) -66, this.field1801.method145(), this.field1801);
            int var5 = 0;
            int var6 = 255;
            int var7 = 7;
            label114: while (var6 != 0) {
                int var8;
                int var9;
                if (var7 < 0) {
                    var8 = var7 & 0x3;
                    var9 = -(var7 >> 2);
                } else {
                    var8 = var7;
                    var9 = 0;
                }
                for (int var10 = var6 >>> var8 & 0x11111111; var10 != 0; var10 >>>= 0x4) {
                    if ((var10 & 0x1) != 0) {
                        var6 &= ~(0x1 << var8);
                        class13 var11 = null;
                        class13 var12 = this.field1822[var8];
                        label108: while (true) {
                            while (true) {
                                if (var12 == null) {
                                    break label108;
                                }
                                class23 var13 = var12.field285;
                                if (var13 == null || var13.field575 <= var9) {
                                    var12.field286 = true;
                                    int var14 = var12.method109();
                                    var5 += var14;
                                    if (var13 != null) {
                                        var13.field575 += var14;
                                    }
                                    if (var5 >= this.field1812) {
                                        break label114;
                                    }
                                    class13 var15 = var12.method113();
                                    if (var15 != null) {
                                        int var16 = var12.field284;
                                        while (var15 != null) {
                                            this.method654((byte) -109, var16 * var15.method145() >> 8, var15);
                                            var15 = var12.method110();
                                        }
                                    }
                                    class13 var17 = var12.field283;
                                    var12.field283 = null;
                                    if (var11 == null) {
                                        this.field1822[var8] = var17;
                                    } else {
                                        var11.field283 = var17;
                                    }
                                    if (var17 == null) {
                                        this.field1825[var8] = var11;
                                    }
                                    var12 = var17;
                                } else {
                                    var6 |= 0x1 << var8;
                                    var11 = var12;
                                    var12 = var12.field283;
                                }
                            }
                        }
                    }
                    var8 += 4;
                    var9++;
                }
                var7--;
            }
            for (int var18 = 0; var18 < 8; var18++) {
                class13 var19 = this.field1822[var18];
                this.field1822[var18] = this.field1825[var18] = null;
                while (var19 != null) {
                    class13 var20 = var19.field283;
                    var19.field283 = null;
                    var19 = var20;
                }
            }
        }
        if (this.field1832 < 0) {
            this.field1832 = 0;
        }
        if (this.field1801 != null) {
            this.field1801.method119(arg0, 0, arg1);
        }
        this.field1811 = class44.method375((byte) 6);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public final void method649(byte arg0) {
        this.field1826 = true;
        field1809++;
        if (arg0 > -51) {
            this.method649((byte) 28);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1839 = null;
        field1838 = null;
        if (arg0 != -6463) {
            method650(97);
        }
        field1836 = null;
        field1802 = null;
        field1831 = null;
        field1806 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILbe;)V")
    public final synchronized void method651(int arg0, class13 arg1) {
        field1803++;
        this.field1801 = arg1;
        if (arg0 > -105) {
            method650(-100);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
    private final void method652(int arg0, int arg1) {
        field1817++;
        this.field1832 -= arg1;
        if (arg0 != -8019) {
            this.method287();
        }
        if (this.field1832 < 0) {
            this.field1832 = 0;
        }
        if (this.field1801 != null) {
            this.field1801.method112(arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
    public void method287() {
        field1805++;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public final synchronized void method653(int arg0) {
        field1829++;
        if (this.field1804 == null) {
            return;
        }
        if (arg0 != 5000) {
            field1806 = null;
        }
        long var2 = class44.method375((byte) 39);
        try {
            if (this.field1833 != 0L) {
                if (this.field1833 > var2) {
                    return;
                }
                this.method290(this.field1819);
                this.field1833 = 0L;
                this.field1826 = true;
            }
            int var4 = this.method289();
            if (this.field1830 - var4 > this.field1821) {
                this.field1821 = this.field1830 - var4;
            }
            int var5 = this.field1827 + this.field1820;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1819) {
                this.field1819 += 1024;
                var4 = 0;
                if (this.field1819 > 16384) {
                    this.field1819 = 16384;
                }
                this.method287();
                this.method290(this.field1819);
                this.field1826 = true;
                if (this.field1819 < var5 + 256) {
                    var5 = this.field1819 - 256;
                    this.field1820 = var5 - this.field1827;
                }
            }
            while (var4 < var5) {
                this.method648(this.field1804, 256);
                this.method286();
                var4 += 256;
            }
            if (var2 > this.field1818) {
                if (this.field1826) {
                    this.field1826 = false;
                } else if (this.field1821 == 0 && this.field1834 == 0) {
                    this.method287();
                    this.field1833 = var2 + 2000L;
                    return;
                } else {
                    this.field1820 = Math.min(this.field1834, this.field1821);
                    this.field1834 = this.field1821;
                }
                this.field1818 = var2 + 2000L;
                this.field1821 = 0;
            }
            this.field1830 = var4;
        } catch (Exception var7) {
            this.method287();
            this.field1833 = var2 + 2000L;
        }
        try {
            if (var2 > this.field1811 + 500000L) {
                var2 = this.field1811;
            }
            while (var2 > this.field1811 + 5000L) {
                this.method652(arg0 ^ 0xFFFFF325, 256);
                this.field1811 += 256000 / class8.field194;
            }
        } catch (Exception var6) {
            this.field1811 = var2;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILbe;)V")
    private final void method654(byte arg0, int arg1, class13 arg2) {
        field1808++;
        int var4 = arg1 >> 5;
        class13 var5 = this.field1825[var4];
        if (var5 == null) {
            this.field1822[var4] = arg2;
        } else {
            var5.field283 = arg2;
        }
        this.field1825[var4] = arg2;
        arg2.field284 = arg1;
        if (arg0 >= -40) {
            field1836 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public final synchronized void method655(byte arg0) {
        field1814++;
        this.field1826 = true;
        try {
            this.method288();
        } catch (Exception var3) {
            this.method287();
            this.field1833 = class44.method375((byte) 108) + 2000L;
        }
        int var2 = 115 % ((arg0 + 48) / 37);
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public void method290(int arg0) throws Exception {
        field1815++;
    }
}
