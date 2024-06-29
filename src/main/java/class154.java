import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class154 {

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "Lbm;")
    private class684 field1880;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "Lup;")
    private class521 field1877;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "[B")
    public byte[] field1876;

    @OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
    private int field1870;

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
    private int field1882;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "[I")
    public static int[] field1872 = new int[5];

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "Lus;")
    public static class328 field1885 = new class328(74, 3);

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "J")
    public static long field1891 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!jga", name = "t", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!jga", name = "u", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "Lkha;")
    public static class687 field1871;

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "[[Lpn;")
    private class315[][] field1883;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZIIIZ[[Z)V")
    public final void method953(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5) {
        this.field1880.method3745(false, 111);
        field1879++;
        this.field1880.method3765(false, -32);
        this.field1880.method3737(3793, 1);
        if (!arg0) {
            return;
        }
        this.field1880.method3781(-3, 1);
        this.field1880.method3725(false, 90, -2, false);
        float var7 = 1.0F / (float) (this.field1880.field9558 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field1882; var8++) {
                int var9 = var8 << this.field1886;
                int var10 = var8 + 1 << this.field1886;
                label145: for (int var11 = 0; var11 < this.field1870; var11++) {
                    if (this.field1883[var11][var8] != null) {
                        int var12 = var11 << this.field1886;
                        int var13 = var11 + 1 << this.field1886;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if ((-arg3) <= (var14 - arg2) && var14 - arg2 <= arg3) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((var15 - arg1) >= (-arg3) && var15 - arg1 <= arg3 && arg5[var14 + arg3 - arg2][var15 + arg3 - arg1]) {
                                        class462 var16 = this.field1880.method3729(1);
                                        var16.method2738(var7, 1.0F, var7, 13);
                                        var16.method1973(-var11, -var8, 0);
                                        this.field1880.method3771(0, class641.field8858);
                                        this.field1883[var11][var8].method1846(-123);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1882; var17++) {
                int var18 = var17 << this.field1886;
                int var19 = var17 + 1 << this.field1886;
                for (int var20 = 0; var20 < this.field1870; var20++) {
                    class315 var21 = this.field1883[var20][var17];
                    if (var21 != null) {
                        class246 var22 = this.field1880.method3712(var21.field4036 * 3, (byte) 103);
                        Buffer var23 = var22.method1518((byte) 63, true);
                        if (var23 != null) {
                            Stream var24 = this.field1880.method3772(var23, 4);
                            int var25 = 0;
                            int var26 = var20 << this.field1886;
                            int var27 = var20 + 1 << this.field1886;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (-arg3 <= var28 - arg1 && var28 - arg1 <= arg3) {
                                    int var30 = this.field1877.field5569 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if (-arg3 <= var31 - arg2 && arg3 >= (var31 - arg2) && arg5[var31 + arg3 - arg2][arg3 + var28 - arg1]) {
                                            short[] var32 = this.field1877.field7338[var30];
                                            if (var32 != null) {
                                                if (Stream.method2226()) {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method2233(var32[var33] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method2224(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method2223();
                            if (var22.method1517((byte) 123) && var25 > 0) {
                                class462 var29 = this.field1880.method3729(1);
                                var29.method2738(var7, 1.0F, var7, 13);
                                var29.method1973(-var20, -var17, 0);
                                this.field1880.method3771(0, class641.field8858);
                                var21.method1844(1, var25 / 3, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field1880.method3734((byte) -14);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLtn;)V")
    public static final void method954(byte arg0, class179 arg1) {
        field1889++;
        for (int var2 = 0; var2 < class642.field8864; var2++) {
            int var3 = arg1.method1158(-32768);
            int var4 = arg1.method1107(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class233.field3018[var3] != null) {
                class233.field3018[var3].field8464 = var4;
            }
        }
        if (arg0 != 59) {
            method954((byte) -107, null);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIBII)V")
    private final void method955(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1874++;
        if (this.field1883 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg0 + arg3 - 1 - 1 >> 7;
        if (arg2 <= 88) {
            this.field1878 = -46;
        }
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class315[] var11 = this.field1883[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field4045 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZILr;I)V")
    public final void method956(boolean arg0, int arg1, class108 arg2, int arg3) {
        field1884++;
        class162 var5 = (class162) arg2;
        int var6 = var5.field2077 + arg3 + 1;
        int var7 = var5.field2076 + arg1 + 1;
        int var8 = this.field1878 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2078;
        int var11 = var5.field2069;
        int var12 = this.field1878 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var8 += this.field1878 * var14;
            var9 += var11 * var14;
        }
        if (this.field1869 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field1869;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var9 += var16;
            var8 += var16;
            var12 += var16;
            var7 = 1;
            var11 -= var16;
        }
        if (this.field1878 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field1878;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class450.method2649(var10, var5.field2072, this.field1876, arg0, var11, var8, var9, var13, var12);
            this.method955(var11, var6, (byte) 101, var7, var10);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V")
    public final void method957(boolean arg0) {
        field1890++;
        this.field1883 = new class315[this.field1870][this.field1882];
        for (int var2 = 0; var2 < this.field1882; var2++) {
            for (int var3 = 0; var3 < this.field1870; var3++) {
                this.field1883[var3][var2] = new class315(this.field1880, this, this.field1877, var3, var2, this.field1886, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field1883[var3][var2].field4036 == 0) {
                    this.field1883[var3][var2] = null;
                }
            }
        }
        if (arg0) {
            this.field1870 = -34;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBLr;I)V")
    public final void method958(int arg0, byte arg1, class108 arg2, int arg3) {
        field1888++;
        class162 var5 = (class162) arg2;
        int var6 = var5.field2077 + arg0 + 1;
        int var7 = var5.field2076 + arg3 + 1;
        int var8 = this.field1878 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2078;
        int var11 = var5.field2069;
        int var12 = this.field1878 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var9 += var11 * var14;
            var8 += this.field1878 * var14;
            var10 -= var14;
        }
        if (this.field1869 <= var6 + var10) {
            int var15 = var6 + 1 - (-var10 - -this.field1869);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var7 = 1;
            var8 += var16;
            var13 += var16;
            var12 += var16;
            var11 -= var16;
        }
        if (this.field1878 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field1878;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        int var18 = 2 / ((arg1 - 56) / 34);
        if (var11 > 0 && var10 > 0) {
            class466.method2753(var11, var9, 5, var12, var8, this.field1876, var13, var5.field2072, var10);
            this.method955(var11, var6, (byte) 95, var7, var10);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
    public static final void method959(int arg0) {
        field1881++;
        if (arg0 >= -74) {
            return;
        }
        class499.field7048 = null;
        class572.field7983 = null;
        class440.field6182 = null;
        class105.field1287 = null;
        class289.field3681 = null;
        class618.field8656 = null;
        class497.field7033 = null;
        class688.field9783 = null;
        class1.field5 = null;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lbm;Lup;)V")
    public class154(class684 arg0, class521 arg1) {
        this.field1880 = arg0;
        this.field1877 = arg1;
        this.field1878 = (this.field1877.field5569 * this.field1877.field5561 >> this.field1880.field9570) + 2;
        this.field1869 = (this.field1877.field5562 * this.field1877.field5561 >> this.field1880.field9570) + 2;
        this.field1876 = new byte[this.field1878 * this.field1869];
        this.field1886 = 7 - (this.field1877.field5570 - this.field1880.field9570);
        this.field1870 = this.field1877.field5569 >> this.field1886;
        this.field1882 = this.field1877.field5562 >> this.field1886;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILdfa;)V")
    public static final void method960(int arg0, class757 arg1) {
        for (int var2 = 0; var2 < class2.field8; var2++) {
            int var3 = class199.field2549[var2];
            class546 var4 = class447.field6287[var3];
            int var5 = arg1.method1094(255);
            if ((var5 & 0x20) != 0) {
                var5 += arg1.method1094(255) << 8;
            }
            if ((var5 & 0x1000) != 0) {
                var5 += arg1.method1094(255) << 16;
            }
            class266.method1597(var5, var4, (byte) -11, var3, arg1);
        }
        if (arg0 > -78) {
            method960(-8, null);
        }
        field1875++;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method961(class108 arg0, int arg1, int arg2, int arg3) {
        field1887++;
        class162 var5 = (class162) arg0;
        int var6 = var5.field2077 + arg1 + 1;
        int var7 = var5.field2076 + arg3 + 1;
        int var8 = var7 + (this.field1878 * var6);
        int var9 = var5.field2078;
        int var10 = var5.field2069;
        int var11 = 32 / ((arg2 + 52) / 32);
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var6 = 1;
            var9 -= var12;
            var8 += this.field1878 * var12;
        }
        int var13 = this.field1878 - var10;
        if (this.field1869 <= (var6 + var9)) {
            int var14 = var9 + var6 + 1 - this.field1869;
            var9 -= var14;
        }
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var7 = 1;
            var13 += var15;
            var8 += var15;
            var10 -= var15;
        }
        if ((var7 + var10) >= this.field1878) {
            int var16 = var7 + var10 + 1 - this.field1878;
            var13 += var16;
            var10 -= var16;
        }
        if (var10 > 0 && var9 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field1878 + var13;
            return class107.method734(var18, var10, var8, this.field1876, var9, 114, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V")
    public static void method962(int arg0) {
        field1872 = null;
        field1871 = null;
        if (arg0 != 3) {
            method960(67, null);
        }
        field1885 = null;
    }
}
