import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class112 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Ldh;")
    private class159 field1869 = new class159();

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Ldh;")
    private class159 field1878 = new class159();

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Ldh;")
    private class159 field1880 = new class159();

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Ldh;")
    private class159 field1883 = new class159();

    @OriginalMember(owner = "client!el", name = "A", descriptor = "Lbg;")
    private class194 field1890 = new class194(4);

    @OriginalMember(owner = "client!el", name = "C", descriptor = "B")
    private byte field1892 = 0;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public volatile int field1894 = 0;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public volatile int field1893 = 0;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "Lbg;")
    private class194 field1891 = new class194(8);

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field1866 = 0;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lmh;")
    private static class128 field1867 = class22.method156(127, "green:");

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Lmh;")
    public static class128 field1873 = field1867;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
    public static int[] field1876 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Lmh;")
    public static class128 field1872 = field1867;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "J")
    private long field1889;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Luc;")
    private class180 field1887;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "Lgm;")
    private class281 field1895;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[Lfb;")
    public static class55[] field1879;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[[Lac;")
    public static class154[][] field1885;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)I", line = 5)
    public final int method671(byte arg0) {
        field1875++;
        if (arg0 >= -27) {
            this.method677(42);
        }
        return this.field1869.method1058((byte) -94) + this.field1878.method1058((byte) -90);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)Z", line = 24)
    public final boolean method672(boolean arg0) {
        field1864++;
        if (!arg0) {
            this.method679(69);
        }
        return this.method679(0) >= 20;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLuc;I)V", line = 35)
    public final void method673(boolean arg0, class180 arg1, int arg2) {
        field1877++;
        if (this.field1887 != null) {
            try {
                this.field1887.method1229(false);
            } catch (Exception var11) {
            }
            this.field1887 = null;
        }
        this.field1887 = arg1;
        this.method676((byte) 119);
        this.method682((byte) 91, arg0);
        this.field1895 = null;
        this.field1891.field3380 = arg2;
        while (true) {
            class281 var5 = (class281) this.field1878.method1047((byte) -126);
            if (var5 == null) {
                while (true) {
                    class281 var6 = (class281) this.field1883.method1047((byte) -108);
                    if (var6 == null) {
                        if (this.field1892 != 0) {
                            try {
                                this.field1890.field3380 = 0;
                                this.field1890.method1352(7528, 4);
                                this.field1890.method1352(7528, this.field1892);
                                this.field1890.method1324(0, 15803);
                                this.field1887.method1228(this.field1890.field3417, 0, false, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field1887.method1229(false);
                                } catch (Exception var9) {
                                }
                                this.field1887 = null;
                                this.field1893++;
                            }
                        }
                        this.field1888 = 0;
                        this.field1889 = class71.method470(true);
                        return;
                    }
                    this.field1880.method1046(0, var6);
                }
            }
            this.field1869.method1046(0, var5);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Z", line = 101)
    public final boolean method674(int arg0) {
        field1871++;
        int var2 = -126 % ((arg0 + 34) / 44);
        return this.method671((byte) -58) >= 20;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 112)
    public final void method675(int arg0) {
        if (this.field1887 != null) {
            this.field1887.method1229(false);
        }
        int var2 = -48 / ((arg0 + 52) / 54);
        field1870++;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V", line = 128)
    private final void method676(byte arg0) {
        field1886++;
        if (this.field1887 == null) {
            return;
        }
        int var2 = -41 % ((24 - arg0) / 48);
        try {
            this.field1890.field3380 = 0;
            this.field1890.method1352(7528, 6);
            this.field1890.method1338(99, 3);
            this.field1887.method1228(this.field1890.field3417, 0, false, 4);
        } catch (IOException var6) {
            try {
                this.field1887.method1229(false);
            } catch (Exception var5) {
            }
            this.field1893++;
            this.field1887 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)Z", line = 162)
    public final boolean method677(int arg0) {
        if (this.field1887 != null) {
            long var2 = class71.method470(true);
            int var4 = (int) (var2 - this.field1889);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1888 += var4;
            this.field1889 = var2;
            if (this.field1888 > 30000) {
                try {
                    this.field1887.method1229(false);
                } catch (Exception var30) {
                }
                this.field1887 = null;
            }
        }
        field1882++;
        if (this.field1887 == null) {
            return this.method671((byte) -59) == 0 && this.method679(0) == 0;
        }
        try {
            for (class281 var6 = (class281) this.field1869.method1053((byte) -54); var6 != null; var6 = (class281) this.field1869.method1051((byte) -102)) {
                this.field1890.field3380 = 0;
                this.field1890.method1352(7528, 1);
                this.field1890.method1338(86, (int) var6.field3876);
                this.field1887.method1228(this.field1890.field3417, 0, false, 4);
                this.field1878.method1046(0, var6);
            }
            if (arg0 != 2216) {
                this.field1895 = (class281) null;
            }
            for (class281 var7 = (class281) this.field1880.method1053((byte) -108); var7 != null; var7 = (class281) this.field1880.method1051((byte) -6)) {
                this.field1890.field3380 = 0;
                this.field1890.method1352(7528, 0);
                this.field1890.method1338(105, (int) var7.field3876);
                this.field1887.method1228(this.field1890.field3417, 0, false, 4);
                this.field1883.method1046(0, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1887.method1230((byte) 67);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                byte var10 = 0;
                if (this.field1895 == null) {
                    var10 = 8;
                } else if (this.field1895.field4854 == 0) {
                    var10 = 1;
                }
                this.field1888 = 0;
                if (var10 <= 0) {
                    int var11 = this.field1895.field4857.field3417.length - this.field1895.field4856;
                    int var12 = 512 - this.field1895.field4854;
                    if (var12 > (var11 - this.field1895.field4857.field3380)) {
                        var12 = var11 - this.field1895.field4857.field3380;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field1887.method1227(this.field1895.field4857.field3417, (byte) -81, this.field1895.field4857.field3380, var12);
                    if (this.field1892 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field1895.field4857.field3417[this.field1895.field4857.field3380 + var13] = (byte) class233.method1599(this.field1895.field4857.field3417[this.field1895.field4857.field3380 + var13], this.field1892);
                        }
                    }
                    this.field1895.field4854 += var12;
                    this.field1895.field4857.field3380 += var12;
                    if (this.field1895.field4857.field3380 == var11) {
                        this.field1895.method1521(-3810);
                        this.field1895.field5018 = false;
                        this.field1895 = null;
                    } else if (this.field1895.field4854 == 512) {
                        this.field1895.field4854 = 0;
                    }
                } else {
                    int var14 = var10 - this.field1891.field3380;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field1887.method1227(this.field1891.field3417, (byte) -81, this.field1891.field3380, var14);
                    if (this.field1892 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field1891.field3417[this.field1891.field3380 + var15] = (byte) class233.method1599(this.field1891.field3417[this.field1891.field3380 + var15], this.field1892);
                        }
                    }
                    this.field1891.field3380 += var14;
                    if (var10 <= this.field1891.field3380) {
                        if (this.field1895 == null) {
                            this.field1891.field3380 = 0;
                            int var16 = this.field1891.method1325(7627);
                            int var17 = this.field1891.method1308(arg0 - 2255);
                            int var18 = this.field1891.method1325(7627);
                            boolean var19 = (var18 & 0x80) != 0;
                            long var20 = (long) ((var16 << 16) + var17);
                            Object var22 = null;
                            int var23 = this.field1891.method1350(false);
                            int var24 = var18 & 0x7F;
                            class281 var25;
                            if (var19) {
                                for (var25 = (class281) this.field1883.method1053((byte) -34); var25 != null && var25.field3876 != var20; var25 = (class281) this.field1883.method1051((byte) 29)) {
                                }
                            } else {
                                for (var25 = (class281) this.field1878.method1053((byte) -52); var25 != null && var25.field3876 != var20; var25 = (class281) this.field1878.method1051((byte) -123)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var24 == 0 ? 5 : 9;
                            this.field1895 = var25;
                            this.field1895.field4857 = new class194(this.field1895.field4856 + var26 + var23);
                            this.field1895.field4857.method1352(arg0 + 5312, var24);
                            this.field1895.field4857.method1337(arg0 ^ 0xFFFFF76C, var23);
                            this.field1895.field4854 = 8;
                            this.field1891.field3380 = 0;
                        } else if (this.field1895.field4854 != 0) {
                            throw new IOException();
                        } else if (this.field1891.field3417[0] == -1) {
                            this.field1895.field4854 = 1;
                            this.field1891.field3380 = 0;
                        } else {
                            this.field1895 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field1887.method1229(false);
            } catch (Exception var29) {
            }
            this.field1893++;
            this.field1887 = null;
            return this.method671((byte) -81) == 0 && this.method679(0) == 0;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIBZI)Lgm;", line = 438)
    public final class281 method678(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        if (arg0 > -54) {
            this.field1892 = 104;
        }
        long var6 = (long) ((arg1 << 16) + arg4);
        class281 var8 = new class281();
        var8.field3876 = var6;
        var8.field5015 = arg3;
        field1884++;
        var8.field4856 = arg2;
        if (arg3) {
            if (this.method671((byte) -66) >= 20) {
                throw new RuntimeException();
            }
            this.field1869.method1046(0, var8);
        } else if (this.method679(0) < 20) {
            this.field1880.method1046(0, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)I", line = 477)
    private final int method679(int arg0) {
        field1868++;
        return arg0 == 0 ? this.field1880.method1058((byte) -107) + this.field1883.method1058((byte) -126) : 9;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)V", line = 488)
    public static void method680(byte arg0) {
        field1879 = null;
        field1873 = null;
        field1872 = null;
        field1885 = (class154[][]) null;
        int var1 = 35 % ((arg0 + 52) / 54);
        field1867 = null;
        field1876 = null;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V", line = 523)
    public final void method681(int arg0) {
        field1865++;
        if (this.field1887 == null) {
            return;
        }
        try {
            this.field1890.field3380 = arg0;
            this.field1890.method1352(7528, 7);
            this.field1890.method1338(107, 0);
            this.field1887.method1228(this.field1890.field3417, 0, false, 4);
        } catch (IOException var5) {
            try {
                this.field1887.method1229(false);
            } catch (Exception var4) {
            }
            this.field1887 = null;
            this.field1893++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BZ)V", line = 548)
    public final void method682(byte arg0, boolean arg1) {
        field1881++;
        int var3 = -1 % ((arg0 - 36) / 49);
        if (this.field1887 == null) {
            return;
        }
        try {
            this.field1890.field3380 = 0;
            this.field1890.method1352(7528, arg1 ? 2 : 3);
            this.field1890.method1338(78, 0);
            this.field1887.method1228(this.field1890.field3417, 0, false, 4);
        } catch (IOException var7) {
            try {
                this.field1887.method1229(false);
            } catch (Exception var6) {
            }
            this.field1893++;
            this.field1887 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V", line = 598)
    public final void method683(int arg0) {
        field1874++;
        this.field1892 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 > -104) {
            field1885 = (class154[][]) ((class154[][]) null);
        }
        this.field1894++;
    }
}
