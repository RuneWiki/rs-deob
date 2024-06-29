import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class127 {

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Z")
    private boolean field1819 = false;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    private int field1835 = 32;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "J")
    private long field1810 = class86.method509(false);

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Z")
    private boolean field1837 = true;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    private int field1846 = 0;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "J")
    private long field1841 = 0L;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "J")
    private long field1840 = 0L;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[Lic;")
    private class160[] field1838 = new class160[8];

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    private int field1844 = 0;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "[Lic;")
    private class160[] field1839 = new class160[8];

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    private int field1843 = 0;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    private int field1842 = 0;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[I")
    public static int[] field1816 = new int[32];

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
    public static int[] field1828 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1830 = "Connected to update server";

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[Lhl;")
    public static class137[] field1825 = new class137[4];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lic;")
    private class160 field1831;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    public int[] field1813;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()I")
    public int method107() throws Exception {
        field1811++;
        return this.field1845;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final synchronized void method824(int arg0) {
        if (arg0 != 23610) {
            return;
        }
        if (class20.field243 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class20.field243.field480[var3] == this) {
                    class20.field243.field480[var3] = null;
                }
                if (class20.field243.field480[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class20.field243.field479 = true;
                while (class20.field243.field481) {
                    class247.method1595(50L, (byte) -83);
                }
                class20.field243 = null;
            }
        }
        this.method109();
        field1834++;
        this.field1813 = null;
        this.field1819 = true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
    private final void method825(int arg0, byte arg1) {
        field1818++;
        if (arg1 != -45) {
            this.method834((byte) 83);
        }
        this.field1842 -= arg0;
        if (this.field1842 < 0) {
            this.field1842 = 0;
        }
        if (this.field1831 != null) {
            this.field1831.method190(arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Lgk;")
    public static final class259 method826(int arg0, int arg1, int arg2) {
        field1821++;
        class259 var3 = new class259();
        if (arg2 != 10) {
            method832(true, (String) null);
        }
        for (class71 var4 = (class71) class28.field342.method1890((byte) 88); var4 != null; var4 = (class71) class28.field342.method1889(false)) {
            if (var4.field843 && var4.method430(1, arg0, arg1)) {
                var3.method1656(var4, (byte) -89);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public void method112(int arg0) throws Exception {
        field1812++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method111(Component arg0) throws Exception {
        field1829++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([II)V")
    private final void method827(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class152.field2211) {
            var3 = arg1 << 1;
        }
        class194.method1258(arg0, 0, var3);
        this.field1842 -= arg1;
        if (this.field1831 != null && this.field1842 <= 0) {
            this.field1842 += class50.field571 >> 4;
            class116.method747((byte) -114, this.field1831);
            this.method828(this.field1831, (byte) -121, this.field1831.method1063());
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
                        class160 var10 = null;
                        class160 var11 = this.field1839[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class191 var12 = var11.field2313;
                                if (var12 == null || var12.field2759 <= var8) {
                                    var11.field2314 = true;
                                    int var13 = var11.method193();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2759 += var13;
                                    }
                                    if (var4 >= this.field1835) {
                                        break label107;
                                    }
                                    class160 var14 = var11.method196();
                                    if (var14 != null) {
                                        int var15 = var11.field2311;
                                        while (var14 != null) {
                                            this.method828(var14, (byte) -103, var15 * var14.method1063() >> 8);
                                            var14 = var11.method195();
                                        }
                                    }
                                    class160 var16 = var11.field2312;
                                    var11.field2312 = null;
                                    if (var10 == null) {
                                        this.field1839[var7] = var16;
                                    } else {
                                        var10.field2312 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1838[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2312;
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
                class160 var18 = this.field1839[var17];
                this.field1839[var17] = this.field1838[var17] = null;
                while (var18 != null) {
                    class160 var19 = var18.field2312;
                    var18.field2312 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1842 < 0) {
            this.field1842 = 0;
        }
        if (this.field1831 != null) {
            this.field1831.method188(arg0, 0, arg1);
        }
        this.field1810 = class86.method509(false);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lic;BI)V")
    private final void method828(class160 arg0, byte arg1, int arg2) {
        field1833++;
        int var4 = arg2 >> 5;
        class160 var5 = this.field1838[var4];
        if (var5 == null) {
            this.field1839[var4] = arg0;
        } else {
            var5.field2312 = arg0;
        }
        this.field1838[var4] = arg0;
        arg0.field2311 = arg2;
        int var6 = -77 / ((arg1 + 18) / 52);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public final synchronized void method829(byte arg0) {
        field1814++;
        int var2 = 49 % ((arg0 + 26) / 32);
        this.field1837 = true;
        try {
            this.method108();
        } catch (Exception var3) {
            this.method109();
            this.field1841 = class86.method509(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method830(int arg0) {
        field1827++;
        if (arg0 == 32237) {
            this.field1837 = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()V")
    public void method110() throws Exception {
        field1826++;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()V")
    public void method109() {
        field1809++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIIII)V")
    public static final void method831(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class133 var6 = class6.field94[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class245 var7 = var6.field1918;
        if (var7 != null) {
            int var8 = var7.field3563;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class256 var10 = var6.field1914;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3707;
        int var12 = var10.field3687;
        int var13 = var10.field3702;
        int var14 = var10.field3691;
        int[] var15 = class282.field4304[var11];
        int[] var16 = class21.field255[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method832(boolean arg0, String arg1) {
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        field1817++;
        byte var4 = 2;
        int var5 = 0;
        if (!arg0) {
            return null;
        }
        while (var2 > var5) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class173.method1126(true, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
            var5++;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()V")
    public void method108() throws Exception {
        field1822++;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)Z")
    public static final boolean method833(int arg0, int arg1, int arg2) {
        field1815++;
        if (arg1 != -1) {
            method831((int[]) null, -9, -46, -1, -30, 51);
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        class273 var3 = class164.method1081(0, arg2);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1745((byte) 127, arg0);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public final synchronized void method834(byte arg0) {
        field1820++;
        if (this.field1819) {
            return;
        }
        long var2 = class86.method509(false);
        try {
            if (var2 > this.field1810 + 500000L) {
                this.field1810 = var2 - 500000L;
            }
            while (var2 > (this.field1810 + 5000L)) {
                this.method825(256, (byte) -45);
                this.field1810 += (long) (256000 / class50.field571);
            }
        } catch (Exception var7) {
            this.field1810 = var2;
        }
        if (this.field1813 == null) {
            return;
        }
        try {
            if (this.field1841 != 0L) {
                if (this.field1841 > var2) {
                    return;
                }
                this.method112(this.field1845);
                this.field1837 = true;
                this.field1841 = 0L;
            }
            int var4 = this.method107();
            if (this.field1846 - var4 > this.field1844) {
                this.field1844 = this.field1846 - var4;
            }
            int var5 = this.field1847 + this.field1836;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1845 < var5 + 256) {
                this.field1845 += 1024;
                if (this.field1845 > 16384) {
                    this.field1845 = 16384;
                }
                var4 = 0;
                this.method109();
                this.method112(this.field1845);
                this.field1837 = true;
                if (this.field1845 < var5 + 256) {
                    var5 = this.field1845 - 256;
                    this.field1836 = var5 - this.field1847;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method827(this.field1813, 256);
                this.method110();
            }
            if (this.field1840 < var2) {
                if (this.field1837) {
                    this.field1837 = false;
                } else if (this.field1844 == 0 && this.field1843 == 0) {
                    this.method109();
                    this.field1841 = var2 + 2000L;
                    return;
                } else {
                    this.field1836 = Math.min(this.field1843, this.field1844);
                    this.field1843 = this.field1844;
                }
                this.field1840 = var2 + 2000L;
                this.field1844 = 0;
            }
            this.field1846 = var4;
        } catch (Exception var6) {
            this.method109();
            this.field1841 = var2 + 2000L;
        }
        if (arg0 != -95) {
            field1828 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public static void method835(int arg0) {
        if (arg0 != -11383) {
            method826(43, -68, -81);
        }
        field1816 = null;
        field1825 = null;
        field1830 = null;
        field1828 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZC)Z")
    public static final boolean method836(boolean arg0, char arg1) {
        field1832++;
        if (arg0) {
            method832(false, (String) null);
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lic;B)V")
    public final synchronized void method837(class160 arg0, byte arg1) {
        if (arg1 != -22) {
            method826(-113, -42, 91);
        }
        field1824++;
        this.field1831 = arg0;
    }
}
