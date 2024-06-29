import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class126 extends class335 {

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
    private int field1840;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
    private int field1837;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    private int field1827;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "Z")
    public static boolean field1834 = false;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "Lth;")
    public static class57 field1833 = new class57(64);

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "[I")
    public static int[] field1844 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    private int field1824;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    private int field1832;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    private int field1841;

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Lof;")
    public static class223 field1825;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "Lkc;")
    public static class29 field1846;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "[B")
    private byte[] field1838;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "[[[B")
    public static byte[][][] field1826;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIILh;Lh;IIJ)V", line = 8)
    public static final void method930(int arg0, int arg1, int arg2, int arg3, class111 arg4, class111 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class11 var10 = new class11();
        var10.field172 = arg8;
        var10.field177 = arg1 * 128 + 64;
        var10.field168 = arg2 * 128 + 64;
        var10.field175 = arg3;
        var10.field165 = arg4;
        var10.field174 = arg5;
        var10.field170 = arg6;
        var10.field166 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class302.field4502[var11][arg1][arg2] == null) {
                class302.field4502[var11][arg1][arg2] = new class167(var11, arg1, arg2);
            }
        }
        class302.field4502[arg0][arg1][arg2].field2387 = var10;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIFFF)V", line = 34)
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1840 = (int) (arg7 * 4096.0F);
        this.field1837 = (int) (arg6 * 4096.0F);
        this.field1827 = this.field1836 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V", line = 49)
    public final void method931(int arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field1824 = 4096;
            this.field1841 = this.field1837 - (arg0 >= 0 ? arg0 : -arg0);
            this.field1841 = this.field1841 * this.field1841 >> 12;
            this.field1832 = this.field1841;
        } else {
            this.field1824 = this.field1841 * this.field1840 >> 12;
            if (this.field1824 < 0) {
                this.field1824 = 0;
            } else if (this.field1824 > 4096) {
                this.field1824 = 4096;
            }
            this.field1841 = this.field1837 - (arg0 >= 0 ? arg0 : -arg0);
            this.field1841 = this.field1841 * this.field1841 >> 12;
            this.field1841 = this.field1841 * this.field1824 >> 12;
            this.field1832 += this.field1841 * this.field1827 >> 12;
            this.field1827 = this.field1836 * this.field1827 >> 12;
        }
        if (arg1 < 44) {
            this.method937((byte) 2);
        }
        field1845++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 90)
    public final void method932(byte arg0) {
        this.field1832 >>= 0x4;
        if (this.field1832 < 0) {
            this.field1832 = 0;
        } else if (this.field1832 > 255) {
            this.field1832 = 255;
        }
        this.field1827 = this.field1836;
        field1842++;
        this.method935(this.field1839++, (byte) this.field1832);
        if (arg0 > -93) {
            method933((class361) null, 107, (class361) null);
        }
        this.field1832 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lph;ILph;)V", line = 119)
    public static final void method933(class361 arg0, int arg1, class361 arg2) {
        if (arg1 <= 110) {
            method934(121);
        }
        class272.field4124 = arg2;
        field1830++;
        class343.field5316 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 131)
    public static void method934(int arg0) {
        if (arg0 != 24120) {
            method936((byte) 99, 112, -23, 76, -16, 105);
        }
        field1846 = null;
        field1833 = null;
        field1844 = null;
        field1825 = null;
        field1826 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(IB)V", line = 146)
    public void method935(int arg0, byte arg1) {
        this.field1838[arg0] = arg1;
        field1831++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BIIIII)V", line = 157)
    public static final void method936(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1828++;
        if (arg1 == arg2) {
            class362.method2545(arg5, arg3, arg1, arg4, (byte) 5);
            return;
        }
        if (arg0 != -113) {
            field1844 = (int[]) null;
        }
        if (arg3 - arg1 >= class355.field5452 && class348.field5378 >= (arg1 + arg3) && class326.field4901 <= (arg5 - arg2) && arg2 + arg5 <= class261.field3911) {
            class203.method1472(arg4, arg1, true, arg3, arg2, arg5);
        } else {
            class253.method1859(arg5, arg4, arg3, arg0 ^ 0x2E, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)V", line = 180)
    public final void method937(byte arg0) {
        field1835++;
        int var2 = 90 / ((arg0 - 60) / 57);
        this.field1832 = 0;
        this.field1839 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 190)
    public static final void method938(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class18.field295 * 128) {
            arg0 = class18.field295 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class146.field2109 * 128) {
            arg2 = class146.field2109 * 128 - 1;
        }
        class232.field3505 = class345.field5339[arg3];
        class273.field4151 = class345.field5343[arg3];
        class351.field5413 = class345.field5339[arg4];
        class170.field2454 = class345.field5343[arg4];
        class7.field142 = arg0;
        class253.field3770 = arg1;
        field1843 = arg2;
        class351.field5419 = arg0 / 128;
        class294.field4433 = arg2 / 128;
        class99.field1401 = class351.field5419 - class261.field3975;
        if (class99.field1401 < 0) {
            class99.field1401 = 0;
        }
        class107.field1542 = class294.field4433 - class261.field3975;
        if (class107.field1542 < 0) {
            class107.field1542 = 0;
        }
        class88.field1241 = class351.field5419 + class261.field3975;
        if (class88.field1241 > class18.field295) {
            class88.field1241 = class18.field295;
        }
        class207.field3032 = class294.field4433 + class261.field3975;
        if (class207.field3032 > class146.field2109) {
            class207.field3032 = class146.field2109;
        }
        short var15;
        if (class141.field2031) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class261.field3975 + class261.field3975 + 2; var16++) {
            for (int var17 = 0; var17 < class261.field3975 + class261.field3975 + 2; var17++) {
                int var18 = (var16 - class261.field3975 << 7) - (class7.field142 & 0x7F);
                int var19 = (var17 - class261.field3975 << 7) - (field1843 & 0x7F);
                int var20 = class351.field5419 + var16 - class261.field3975;
                int var21 = class294.field4433 + var17 - class261.field3975;
                if (var20 >= 0 && var21 >= 0 && var20 < class18.field295 && var21 < class146.field2109) {
                    int var22;
                    if (class240.field3567 == null) {
                        var22 = class287.field4340[0][var20][var21] + 128 - class253.field3770;
                    } else {
                        var22 = class240.field3567[0][var20][var21] + 128 - class253.field3770;
                    }
                    int var23 = class287.field4340[3][var20][var21] - class253.field3770 - 1000;
                    class48.field721[var16][var17] = class157.method1133(var18, var23, var22, var19, var15);
                } else {
                    class48.field721[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class261.field3975 + class261.field3975 + 1; var24++) {
            for (int var25 = 0; var25 < class261.field3975 + class261.field3975 + 1; var25++) {
                class322.field4852[var24][var25] = class48.field721[var24][var25] || class48.field721[var24 + 1][var25] || class48.field721[var24][var25 + 1] || class48.field721[var24 + 1][var25 + 1];
            }
        }
        class134.field1954 = arg6;
        class47.field715 = arg7;
        class75.field1098 = arg8;
        class58.field856 = arg9;
        class129.field1870 = arg10;
        class315.method2199();
        if (class129.field1875 != null) {
            class119.method892(true);
            class150.method1064(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class141.field2031) {
                class249.field3700 = false;
                class2.method9(0, 10691, 0);
                class222.method1628((float[]) null);
                class268.method1989();
            }
            class119.method892(false);
        }
        class150.method1064(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
