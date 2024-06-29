import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class139 extends class589 {

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Z")
    public boolean field1871 = false;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    private int field1877 = 0;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Lpw;")
    public class733 field1878 = new class733();

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "Lpw;")
    private class733 field1882 = new class733();

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "Z")
    private boolean field1889 = false;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "J")
    private long field1880;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lvja;")
    public class290 field1870;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lls;")
    public class150 field1874;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Lrfa;")
    public class212 field1869;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Lsaa;")
    public class345 field1875;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    private int field1884;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "[Loq;")
    public static class378[] field1881;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ldt;I)V")
    public static final void method962(class254 arg0, int arg1) {
        field1867++;
        byte[] var2 = new byte[arg1];
        if (class351.field5121 != null) {
            try {
                class351.field5121.method2203(-5442, 0L);
                class351.field5121.method2201(var2, arg1 - 24);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1716(var2, 24, 0, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZBLha;J)V")
    public final void method963(int arg0, boolean arg1, byte arg2, class66 arg3, long arg4) {
        field1872++;
        if (this.field1871) {
            arg1 = false;
        } else if (this.field1869.field2748 > class758.field10380) {
            arg1 = false;
        } else if (class552.field7617 > class290.field4144[class758.field10380]) {
            arg1 = false;
        } else if (this.field1889) {
            arg1 = false;
        } else if (this.field1869.field2718 != -1) {
            int var7 = (int) (arg4 - this.field1880);
            if (this.field1869.field2753 || var7 <= this.field1869.field2718) {
                var7 %= this.field1869.field2718;
            } else {
                arg1 = false;
            }
            if (!this.field1869.field2721 && this.field1869.field2770 > var7) {
                arg1 = false;
            }
            if (this.field1869.field2721 && this.field1869.field2770 <= var7) {
                arg1 = false;
            }
        }
        int var8 = -52 % ((arg2 - 70) / 53);
        if (arg1) {
            class563.field7714++;
            int var9 = (this.field1878.field9929 + this.field1878.field9923 + this.field1878.field9914) / 3;
            int var10 = (this.field1878.field9915 + this.field1878.field9912 + this.field1878.field9919) / 3;
            int var11 = (this.field1878.field9928 + this.field1878.field9925 + this.field1878.field9927) / 3;
            if (this.field1878.field9913 != var9 || this.field1878.field9921 != var10 || this.field1878.field9926 != var11) {
                this.field1878.field9926 = var11;
                this.field1878.field9913 = var9;
                this.field1878.field9921 = var10;
                int var12 = this.field1878.field9923 - this.field1878.field9929;
                int var13 = this.field1878.field9919 - this.field1878.field9912;
                int var14 = this.field1878.field9925 - this.field1878.field9928;
                int var15 = this.field1878.field9914 - this.field1878.field9929;
                int var16 = this.field1878.field9915 - this.field1878.field9912;
                int var17 = this.field1878.field9927 - this.field1878.field9928;
                this.field1884 = var13 * var17 - var14 * var16;
                this.field1890 = var14 * var15 - (var12 * var17);
                this.field1886 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field1884 <= 32767 && this.field1890 <= 32767 && this.field1886 <= 32767 && this.field1884 >= -32767 && this.field1890 >= -32767 && this.field1886 >= -32767) {
                        int var18 = (int) Math.sqrt((double) (this.field1886 * this.field1886 + this.field1890 * this.field1890 + this.field1884 * this.field1884));
                        if (var18 <= 0) {
                            var18 = 1;
                        }
                        this.field1884 = this.field1884 * 32767 / var18;
                        this.field1890 = this.field1890 * 32767 / var18;
                        this.field1886 = this.field1886 * 32767 / var18;
                        if (this.field1869.field2759 > 0 || this.field1869.field2767 > 0) {
                            int var19 = (int) (Math.atan2((double) this.field1886, (double) this.field1884) * 2607.5945876176133D);
                            int var20 = (int) (Math.atan2((double) this.field1890, Math.sqrt((double) (this.field1886 * this.field1886 + this.field1884 * this.field1884))) * 2607.5945876176133D);
                            this.field1883 = this.field1869.field2759 - this.field1869.field2734;
                            this.field1885 = this.field1869.field2767 - this.field1869.field2749;
                            this.field1888 = this.field1869.field2734 + var19 - (this.field1883 >> 1);
                            this.field1887 = this.field1869.field2749 + var20 - (this.field1885 >> 1);
                        }
                        break;
                    }
                    this.field1884 >>= 0x1;
                    this.field1890 >>= 0x1;
                    this.field1886 >>= 0x1;
                }
            }
            this.field1877 += (int) ((double) arg0 * ((double) this.field1869.field2757 + Math.random() * (double) (this.field1869.field2760 - this.field1869.field2757)));
            if (this.field1877 > 63) {
                int var21 = this.field1877 >> 6;
                this.field1877 &= 0x3F;
                for (int var22 = 0; var22 < var21; var22++) {
                    int var23;
                    int var24;
                    int var25;
                    if (this.field1869.field2759 <= 0 && this.field1869.field2767 <= 0) {
                        var23 = this.field1890;
                        var24 = this.field1884;
                        var25 = this.field1886;
                    } else {
                        int var26 = (int) ((double) this.field1883 * Math.random()) + this.field1888;
                        int var27 = var26 & 0x3FFF;
                        int var28 = class110.field1524[var27];
                        int var29 = class110.field1523[var27];
                        int var30 = (int) ((double) this.field1885 * Math.random()) + this.field1887;
                        int var31 = var30 & 0x1FFF;
                        int var32 = class110.field1524[var31];
                        int var33 = class110.field1523[var31];
                        byte var34 = 13;
                        var23 = (var33 << 1) * -1;
                        var24 = var29 * var32 >> var34;
                        var25 = var28 * var32 >> var34;
                    }
                    float var35 = (float) Math.random();
                    float var36 = (float) Math.random();
                    if (var35 + var36 > 1.0F) {
                        var36 = 1.0F - var36;
                        var35 = 1.0F - var35;
                    }
                    float var37 = 1.0F - (var35 + var36);
                    int var38 = (int) ((float) this.field1878.field9914 * var37 + (float) this.field1878.field9929 * var35 + (float) this.field1878.field9923 * var36);
                    int var39 = (int) ((float) this.field1878.field9915 * var37 + (float) this.field1878.field9919 * var36 + (float) this.field1878.field9912 * var35);
                    int var40 = (int) ((float) this.field1878.field9927 * var37 + (float) this.field1878.field9928 * var35 + (float) this.field1878.field9925 * var36);
                    int var41 = (int) ((float) this.field1882.field9914 * var37 + (float) this.field1882.field9929 * var35 + (float) this.field1882.field9923 * var36);
                    int var42 = (int) ((float) this.field1882.field9915 * var37 + (float) this.field1882.field9919 * var36 + (float) this.field1882.field9912 * var35);
                    int var43 = (int) ((float) this.field1882.field9927 * var37 + (float) this.field1882.field9928 * var35 + (float) this.field1882.field9925 * var36);
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = var40 - var43;
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = (int) ((double) var43 + Math.random() * (double) var46);
                    int var50 = this.field1869.field2739 + ((int) (Math.random() * (double) (this.field1869.field2786 - this.field1869.field2739)));
                    int var51 = this.field1869.field2731 + (int) (Math.random() * (double) (this.field1869.field2758 - this.field1869.field2731));
                    int var52 = (int) (Math.random() * (double) (this.field1869.field2737 - this.field1869.field2747)) + this.field1869.field2747;
                    int var55;
                    if (this.field1869.field2777) {
                        double var53 = Math.random();
                        var55 = (int) ((double) this.field1869.field2719 * var53 + (double) this.field1869.field2722) | (int) ((double) this.field1869.field2751 * var53 + (double) this.field1869.field2738) << 16 | (int) ((double) this.field1869.field2730 * var53 + (double) this.field1869.field2717) << 8 | (int) ((double) this.field1869.field2782 + Math.random() * (double) this.field1869.field2745) << 24;
                    } else {
                        var55 = (int) ((double) this.field1869.field2782 + (double) this.field1869.field2745 * Math.random()) << 24 | (int) ((double) this.field1869.field2717 + (double) this.field1869.field2730 * Math.random()) << 8 | (int) ((double) this.field1869.field2751 * Math.random() + (double) this.field1869.field2738) << 16 | (int) ((double) this.field1869.field2722 + Math.random() * (double) this.field1869.field2719);
                    }
                    int var56 = this.field1869.field2750;
                    if (!arg3.method448() && !this.field1869.field2732) {
                        var56 = -1;
                    }
                    if (class548.field7570 == class109.field1522) {
                        new class713(this, var47, var48, var49, var24, var23, var25, var50, var51, var55, var52, var56, this.field1869.field2723, this.field1869.field2726);
                    } else {
                        class713 var58 = class341.field4772[class548.field7570];
                        class548.field7570 = class548.field7570 + 1 & 0x3FF;
                        var58.method3949(this, var47, var48, var49, var24, var23, var25, var50, var51, var55, var52, var56, this.field1869.field2723, this.field1869.field2726);
                    }
                }
            }
        }
        if (!this.field1878.method4044(false, this.field1882)) {
            class733 var59 = this.field1882;
            this.field1882 = this.field1878;
            this.field1878 = var59;
            this.field1878.field9925 = this.field1870.field4135;
            this.field1878.field9929 = this.field1870.field4146;
            this.field1878.field9919 = this.field1870.field4147;
            this.field1878.field9927 = this.field1870.field4131;
            this.field1878.field9912 = this.field1870.field4129;
            this.field1878.field9928 = this.field1870.field4132;
            this.field1878.field9914 = this.field1870.field4149;
            this.field1878.field9915 = this.field1870.field4139;
            this.field1878.field9926 = this.field1882.field9926;
            this.field1878.field9913 = this.field1882.field9913;
            this.field1878.field9923 = this.field1870.field4136;
            this.field1878.field9921 = this.field1882.field9921;
        }
        this.field1879 = 0;
        for (class713 var60 = (class713) this.field1875.method2189((byte) 6); var60 != null; var60 = (class713) this.field1875.method2192(0)) {
            var60.method3952(arg4, arg0);
            this.field1879++;
        }
        class428.field6216 += this.field1879;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public final void method964(int arg0) {
        this.field1878.field9919 = this.field1870.field4147;
        this.field1878.field9915 = this.field1870.field4139;
        if (arg0 != -12231) {
            this.method966(65L, (byte) -102, null);
        }
        this.field1878.field9912 = this.field1870.field4129;
        this.field1878.field9923 = this.field1870.field4136;
        this.field1878.field9928 = this.field1870.field4132;
        this.field1878.field9927 = this.field1870.field4131;
        this.field1878.field9925 = this.field1870.field4135;
        this.field1878.field9914 = this.field1870.field4149;
        field1866++;
        this.field1878.field9929 = this.field1870.field4146;
        if (this.field1878.field9929 == this.field1878.field9923 && this.field1878.field9923 == this.field1878.field9914 && this.field1878.field9919 == this.field1878.field9912 && this.field1878.field9919 == this.field1878.field9915 && this.field1878.field9928 == this.field1878.field9925 && this.field1878.field9927 == this.field1878.field9925) {
            this.field1889 = true;
        } else if (this.field1889) {
            this.field1882.field9919 = this.field1878.field9919;
            this.field1882.field9923 = this.field1878.field9923;
            this.field1882.field9915 = this.field1878.field9915;
            this.field1882.field9929 = this.field1878.field9929;
            this.field1882.field9925 = this.field1878.field9925;
            this.field1889 = false;
            this.field1882.field9927 = this.field1878.field9927;
            this.field1882.field9928 = this.field1878.field9928;
            this.field1882.field9912 = this.field1878.field9912;
            this.field1882.field9914 = this.field1878.field9914;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIILjava/awt/Canvas;)Llea;")
    public static final class637 method965(int arg0, int arg1, int arg2, Canvas arg3) {
        if (arg2 >= -19) {
            method967(95);
        }
        field1876++;
        try {
            Class var4 = Class.forName("aba");
            class637 var5 = (class637) var4.getDeclaredConstructor().newInstance();
            var5.method1261(arg1, 59, arg0, arg3);
            return var5;
        } catch (Throwable var7) {
            class234 var6 = new class234();
            var6.method1261(arg1, 84, arg0, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(JBLha;)V")
    public final void method966(long arg0, byte arg1, class66 arg2) {
        field1873++;
        for (class713 var5 = (class713) this.field1875.method2189((byte) 44); var5 != null; var5 = (class713) this.field1875.method2192(arg1 + 75)) {
            var5.method3951(arg2, arg0);
        }
        if (arg1 != -75) {
            this.field1882 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static void method967(int arg0) {
        if (arg0 != 382002753) {
            method967(-43);
        }
        field1881 = null;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lha;Lvja;Lls;J)V")
    public class139(class66 arg0, class290 arg1, class150 arg2, long arg3) {
        this.field1880 = arg3;
        this.field1870 = arg1;
        this.field1874 = arg2;
        this.field1869 = this.field1870.method1862(-55);
        if (!arg0.method448() && this.field1869.field2742 != -1) {
            this.field1869 = class774.method4260((byte) -67, this.field1869.field2742);
        }
        this.field1875 = new class345();
        this.field1877 = (int) ((double) this.field1877 + Math.random() * 64.0D);
        this.method964(-12231);
        this.field1882.field9914 = this.field1878.field9914;
        this.field1882.field9919 = this.field1878.field9919;
        this.field1882.field9927 = this.field1878.field9927;
        this.field1882.field9912 = this.field1878.field9912;
        this.field1882.field9925 = this.field1878.field9925;
        this.field1882.field9923 = this.field1878.field9923;
        this.field1882.field9915 = this.field1878.field9915;
        this.field1882.field9928 = this.field1878.field9928;
        this.field1882.field9929 = this.field1878.field9929;
    }
}
