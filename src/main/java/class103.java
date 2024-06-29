import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class103 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[I")
    private int[] field1873;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "[I")
    private int[] field1888;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lq;")
    private class123 field1884;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lq;")
    private class123 field1883;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[Lq;")
    private class123[] field1876;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Leb;")
    public static class230 field1879 = class68.method589(0, "mem=");

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Leb;")
    public static class230 field1886 = class68.method589(0, ")3");

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Laj;")
    public static class46 field1874 = new class46(16);

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Lbh;")
    public static class7 field1891;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "[Leb;")
    public static class230[] field1889;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[Lge;")
    public static class69[] field1890;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method865(int arg0, int arg1, byte[] arg2, int arg3) {
        field1875++;
        if (arg1 != -28714) {
            return true;
        }
        boolean var4 = true;
        class14 var5 = new class14(arg2);
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method152((byte) 102);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                int var13;
                class194 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method202(arg1 + 28826);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method200(255);
                                    }
                                    int var10 = var5.method202(13);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var5.method200(255) >> 2;
                                    var14 = var11 + arg0;
                                    var15 = arg3 + var12;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class251.method1776(var6, 65280);
                } while (var13 == 22 && !class123.field2163 && var16.field3429 == 0 && var16.field3461 != 1 && !var16.field3492);
                var9 = true;
                if (!var16.method1390(128)) {
                    class231.field4013++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lnb;Lkk;I)Z")
    public final boolean method866(class199 arg0, class223 arg1, int arg2) {
        field1877++;
        for (int var4 = 0; var4 < this.field1873.length; var4++) {
            if (!arg1.method1550(this.field1873[var4], 25648)) {
                return false;
            }
        }
        if (arg2 != -1) {
            method865(-52, 89, (byte[]) null, 65);
        }
        for (int var5 = 0; var5 < this.field1888.length; var5++) {
            if (!arg0.method721(-102, this.field1888[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lkk;Lkk;Lkk;BLkk;)V")
    public static final void method867(class223 arg0, class223 arg1, class223 arg2, byte arg3, class223 arg4) {
        field1881++;
        class231.field4023 = arg4;
        class51.field883 = arg0;
        class252.field4520 = arg1;
        class102.field1871 = arg2;
        if (arg3 < -68) {
            class99.field1839 = new class245[class252.field4520.method1522(-127)][];
            class128.field2237 = new boolean[class252.field4520.method1522(-126)];
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static final void method868(byte arg0) {
        if (class99.field1830 < class128.field2302) {
            class99.field1830 = (float) ((double) class99.field1830 / 30.0D + (double) class99.field1830);
            if (class128.field2302 < class99.field1830) {
                class99.field1830 = class128.field2302;
            }
            class38.method343(112);
        } else if (class99.field1830 > class128.field2302) {
            class99.field1830 = (float) ((double) class99.field1830 - (double) class99.field1830 / 30.0D);
            if (class128.field2302 > class99.field1830) {
                class99.field1830 = class128.field2302;
            }
            class38.method343(119);
        }
        if (arg0 >= -3) {
            field1886 = null;
        }
        field1887++;
        if (class68.field1270 == -1 || class160.field2858 == -1) {
            return;
        }
        int var1 = class68.field1270 - class149.field2671;
        int var2 = class160.field2858 - class79.field1446;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class79.field1446 += var2;
        class149.field2671 += var1;
        if (var1 == 0 && var2 == 0) {
            class68.field1270 = -1;
            class160.field2858 = -1;
        }
        class38.method343(123);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZDILkk;ZILnb;Z)[I")
    public final int[] method869(boolean arg0, double arg1, int arg2, class223 arg3, boolean arg4, int arg5, class199 arg6, boolean arg7) {
        class21.method232((byte) 33, arg1);
        field1885++;
        class197.field3538 = arg3;
        class149.field2666 = arg6;
        class18.method222(arg5, -557025620, arg2);
        int[] var10 = new int[arg2 * arg5];
        for (int var11 = 0; var11 < this.field1876.length; var11++) {
            this.field1876[var11].method964(arg2, arg5, -57);
        }
        int var12;
        byte var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var14 = arg2 - 1;
            var13 = -1;
        } else {
            var12 = arg2;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        if (!arg4) {
            this.field1884 = null;
        }
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1884.field2147) {
                int[] var22 = this.field1884.method4(var16, (byte) 82);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field1884.method2(var16, 26080);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class52.field894[var24];
                int var27 = class52.field894[var25];
                int var28 = var21[var23] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                int var29 = class52.field894[var28];
                var10[var15++] = (var26 << 16) + var29 + (var27 << 8);
                if (arg7) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1876.length; var17++) {
            this.field1876[var17].method961(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    public static final void method870(byte arg0) {
        field1880++;
        for (class96 var1 = (class96) class37.field690.method839(128); var1 != null; var1 = (class96) class37.field690.method834((byte) 82)) {
            class58 var3 = var1.field1729;
            if (class124.field2174 != var3.field1088 || class259.field4584 > var3.field1090) {
                var1.method518(110);
            } else if (var3.field1123 <= class259.field4584) {
                if (var3.field1125 > 0) {
                    class109 var4 = class168.field2963[var3.field1125 - 1];
                    if (var4 != null && var4.field2274 >= 0 && var4.field2274 < 13312 && var4.field2300 >= 0 && var4.field2300 < 13312) {
                        var3.method501(-36, var4.field2300, var4.field2274, class259.field4584, class37.method333(var4.field2300, 1637367879, var3.field1088, var4.field2274) - var3.field1124);
                    }
                }
                if (var3.field1125 < 0) {
                    int var5 = -var3.field1125 - 1;
                    class260 var6;
                    if (class33.field615 == var5) {
                        var6 = class56.field1033;
                    } else {
                        var6 = class230.field4011[var5];
                    }
                    if (var6 != null && var6.field2274 >= 0 && var6.field2274 < 13312 && var6.field2300 >= 0 && var6.field2300 < 13312) {
                        var3.method501(113, var6.field2300, var6.field2274, class259.field4584, class37.method333(var6.field2300, 1637367879, var3.field1088, var6.field2274) - var3.field1124);
                    }
                }
                var3.method499(-4187, class219.field3771);
                class227.method1569(class124.field2174, (int) var3.field1120, (int) var3.field1083, (int) var3.field1122, 60, var3, var3.field1098, -1L, false);
            }
        }
        int var2 = 36 % ((-arg0 - 8) / 50);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1878++;
        if (arg1 != 1054212176) {
            field1890 = null;
        }
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 0;
        int var10 = 2048 - arg3 & 0x7FF;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = class3.field21[var8];
            var11 = -arg2 * var13 >> 16;
            int var14 = class3.field24[var8];
            var12 = arg2 * var14 >> 16;
        }
        if (var10 != 0) {
            int var15 = class3.field24[var10];
            int var16 = class3.field21[var10];
            var9 = var12 * var16 >> 16;
            var12 = var12 * var15 >> 16;
        }
        class263.field4681 = arg6 - var11;
        class77.field1403 = arg5 - var12;
        class176.field3099 = arg0 - var9;
        class248.field4397 = arg3;
        class111.field2004 = arg4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method872(int arg0) {
        field1886 = null;
        field1874 = null;
        field1891 = null;
        field1889 = null;
        if (arg0 == 0) {
            field1890 = null;
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class103() {
        this.field1873 = new int[0];
        this.field1888 = new int[0];
        this.field1884 = new class162();
        this.field1884.field2156 = 1;
        this.field1883 = new class162();
        this.field1876 = new class123[] { this.field1884, this.field1883 };
        this.field1883.field2156 = 1;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lfk;)V")
    public class103(class14 arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = arg0.method200(255);
        int[][] var5 = new int[var4][];
        this.field1876 = new class123[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            class123 var16 = class264.method1830((byte) -49, arg0);
            if (var16.method968(93) >= 0) {
                var2++;
            }
            if (var16.method963(-84) >= 0) {
                var3++;
            }
            int var17 = var16.field2155.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method200(255);
            }
            this.field1876[var6] = var16;
        }
        this.field1888 = new int[var3];
        this.field1873 = new int[var2];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var4; var9++) {
            class123 var11 = this.field1876[var9];
            int var12 = var11.field2155.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2155[var13] = this.field1876[var5[var9][var13]];
            }
            int var14 = var11.method968(88);
            int var15 = var11.method963(-124);
            if (var14 > 0) {
                this.field1873[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1888[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field1884 = this.field1876[arg0.method200(255)];
        this.field1883 = this.field1876[arg0.method200(255)];
    }
}
