import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class106 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field1853 = -1;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field1852 = 2;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Z")
    public boolean field1861 = false;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field1854 = -1;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Z")
    private boolean field1859 = false;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public int field1874 = -1;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field1871 = -1;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field1868 = -1;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public int field1877 = 99;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public int field1876 = 5;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field1851 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ljd;")
    public static class85 field1850 = class221.method1499("m", (byte) 117);

    @OriginalMember(owner = "client!de", name = "p", descriptor = "[J")
    public static long[] field1865 = new long[256];

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Ljd;")
    public static class85 field1864 = class221.method1499(")3runescape)3com)4l=", (byte) -94);

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Ljd;")
    public static class85 field1880;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public int[] field1857;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "[I")
    public int[] field1863;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "[I")
    private int[] field1867;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "[I")
    private int[] field1870;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "[[I")
    public int[][] field1872;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIILqb;IJ)Z")
    public static final boolean method727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class56 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class180.method1236(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method728(int arg0) {
        if (arg0 == 2) {
            field1864 = null;
            field1865 = null;
            field1880 = null;
            field1850 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lik;B)V")
    public final void method729(class247 arg0, byte arg1) {
        if (arg1 >= -54) {
            field1879 = -119;
        }
        while (true) {
            int var3 = arg0.method1711((byte) -67);
            if (var3 == 0) {
                field1873++;
                return;
            }
            this.method737(arg0, var3, -1);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILwb;)Lwb;")
    public final class26 method730(int arg0, int arg1, class26 arg2) {
        field1875++;
        int var4 = this.field1857[arg1];
        class7 var5 = class228.method1531(-31683, var4 >> 16);
        if (arg0 != -1092982864) {
            this.field1852 = 70;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method183(true, true);
        }
        class7 var7 = null;
        int var8 = 0;
        if (this.field1867 != null && this.field1867.length > arg1) {
            int var9 = this.field1867[arg1];
            var7 = class228.method1531(-31683, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class26 var11 = arg2.method183(!var5.method33((byte) 58, var6), !this.field1859);
            var11.method176(var5, var6, this.field1859);
            return var11;
        } else {
            class26 var10 = arg2.method183(!var5.method33((byte) 58, var6) & !var7.method33((byte) 58, var8), !this.field1859);
            var10.method176(var5, var6, this.field1859);
            var10.method176(var7, var8, this.field1859);
            return var10;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZLwb;)Lwb;")
    public final class26 method731(int arg0, int arg1, boolean arg2, class26 arg3) {
        field1866++;
        int var5 = this.field1857[arg1];
        class7 var6 = class228.method1531(-31683, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method183(true, true);
        }
        int var8 = arg0 & 0x3;
        class26 var9 = arg3.method183(!var6.method33((byte) 58, var7), !this.field1859);
        if (var8 == 1) {
            var9.method189();
        } else if (var8 == 2) {
            var9.method181();
        } else if (var8 == 3) {
            var9.method184();
        }
        if (arg2) {
            this.method731(122, -53, false, (class26) null);
        }
        var9.method176(var6, var7, this.field1859);
        if (var8 == 1) {
            var9.method184();
        } else if (var8 == 2) {
            var9.method181();
        } else if (var8 == 3) {
            var9.method189();
        }
        return var9;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method732(byte arg0, Component arg1) {
        field1878++;
        arg1.removeKeyListener(class79.field1450);
        if (arg0 != 21) {
            method727(20, 92, 96, 8, 40, -126, (class56) null, -52, -88L);
        }
        arg1.removeFocusListener(class79.field1450);
        class214.field3765 = -1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lwb;BI)Lwb;")
    public final class26 method733(class26 arg0, byte arg1, int arg2) {
        int var4 = this.field1857[arg2];
        if (arg1 != 69) {
            this.field1876 = -75;
        }
        class7 var5 = class228.method1531(-31683, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field1856++;
        if (var5 == null) {
            return arg0.method183(true, true);
        } else {
            class26 var7 = arg0.method183(!var5.method33((byte) 58, var6), !this.field1859);
            var7.method176(var5, var6, this.field1859);
            return var7;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public final void method734(int arg0) {
        if (~this.field1854 == arg0) {
            if (this.field1870 == null) {
                this.field1854 = 0;
            } else {
                this.field1854 = 2;
            }
        }
        if (this.field1868 == -1) {
            if (this.field1870 == null) {
                this.field1868 = 0;
            } else {
                this.field1868 = 2;
            }
        }
        field1860++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBIII)V")
    public static final void method735(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1869++;
        if (arg0 <= class1.field6 && arg4 >= class34.field522) {
            boolean var6;
            if (class217.field3802 > arg1) {
                var6 = false;
                arg1 = class217.field3802;
            } else if (arg1 <= class83.field1513) {
                var6 = true;
            } else {
                var6 = false;
                arg1 = class83.field1513;
            }
            boolean var7;
            if (arg5 < class217.field3802) {
                var7 = false;
                arg5 = class217.field3802;
            } else if (class83.field1513 >= arg5) {
                var7 = true;
            } else {
                arg5 = class83.field1513;
                var7 = false;
            }
            if (class34.field522 <= arg0) {
                class183.method1260(arg3, arg1, 27, class146.field2488[arg0++], arg5);
            } else {
                arg0 = class34.field522;
            }
            if (arg4 <= class1.field6) {
                class183.method1260(arg3, arg1, -17, class146.field2488[arg4--], arg5);
            } else {
                arg4 = class1.field6;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg4; var8++) {
                    int[] var9 = class146.field2488[var8];
                    var9[arg1] = var9[arg5] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg0; var10 <= arg4; var10++) {
                    class146.field2488[var10][arg1] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg0; var11 <= arg4; var11++) {
                    class146.field2488[var11][arg5] = arg3;
                }
            }
        }
        int var12 = 32 / ((51 - arg2) / 44);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILwb;Lde;II)Lwb;")
    public final class26 method736(int arg0, class26 arg1, class106 arg2, int arg3, int arg4) {
        field1855++;
        int var6 = this.field1857[arg4];
        class7 var7 = class228.method1531(-31683, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method733(arg1, (byte) 69, arg0);
        }
        int var9 = arg2.field1857[arg0];
        class7 var10 = class228.method1531(arg3 - 97218, var9 >> 16);
        int var11 = var9 & arg3;
        if (var10 == null) {
            class26 var12 = arg1.method183(!var7.method33((byte) 58, var8), !this.field1859);
            var12.method176(var7, var8, this.field1859);
            return var12;
        } else {
            class26 var13 = arg1.method183(!var7.method33((byte) 58, var8) & !var10.method33((byte) 58, var11), !arg2.field1859 & !this.field1859);
            var13.method180(var7, var8, var10, var11, this.field1870, arg2.field1859 | this.field1859);
            return var13;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lik;II)V")
    private final void method737(class247 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method729((class247) null, (byte) 42);
        }
        field1862++;
        if (arg1 == 1) {
            int var4 = arg0.method1694((byte) -100);
            this.field1863 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1863[var5] = arg0.method1694((byte) -100);
            }
            this.field1857 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1857[var6] = arg0.method1694((byte) -100);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1857[var7] = (arg0.method1694((byte) -100) << 16) + this.field1857[var7];
            }
        } else if (arg1 == 2) {
            this.field1853 = arg0.method1694((byte) -100);
        } else if (arg1 == 3) {
            int var15 = arg0.method1711((byte) -67);
            this.field1870 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field1870[var16] = arg0.method1711((byte) -67);
            }
            this.field1870[var15] = 9999999;
        } else if (arg1 == 4) {
            this.field1861 = true;
        } else if (arg1 == 5) {
            this.field1876 = arg0.method1711((byte) -67);
        } else if (arg1 == 6) {
            this.field1871 = arg0.method1694((byte) -100);
        } else if (arg1 == 7) {
            this.field1874 = arg0.method1694((byte) -100);
        } else if (arg1 == 8) {
            this.field1877 = arg0.method1711((byte) -67);
        } else if (arg1 == 9) {
            this.field1854 = arg0.method1711((byte) -67);
        } else if (arg1 == 10) {
            this.field1868 = arg0.method1711((byte) -67);
        } else if (arg1 == 11) {
            this.field1852 = arg0.method1711((byte) -67);
        } else if (arg1 == 12) {
            int var8 = arg0.method1711((byte) -67);
            this.field1867 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1867[var9] = arg0.method1694((byte) -100);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field1867[var10] += arg0.method1694((byte) -100) << 16;
            }
        } else if (arg1 == 13) {
            int var11 = arg0.method1694((byte) -100);
            this.field1872 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method1711((byte) -67);
                if (var13 > 0) {
                    this.field1872[var12] = new int[var13];
                    this.field1872[var12][0] = arg0.method1691(arg2 + 19389);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field1872[var12][var14] = arg0.method1694((byte) -100);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1859 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLwb;)Lwb;")
    public final class26 method738(int arg0, boolean arg1, class26 arg2) {
        field1858++;
        int var4 = this.field1857[arg0];
        class7 var5 = class228.method1531(-31683, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method170(true, true);
        } else {
            class26 var7 = arg2.method170(!var5.method33((byte) 58, var6), !this.field1859);
            var7.method176(var5, var6, this.field1859);
            return arg1 ? var7 : null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1865[var0] = var1;
        }
        field1879 = 0;
        field1880 = class221.method1499(" loggt sich aus)3", (byte) 105);
    }
}
