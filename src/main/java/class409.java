import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class409 implements class258 {

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public int field5923;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public int field5913;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Ljava/lang/String;")
    public String field5921;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public int field5925;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field5919;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public int field5911;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public int field5909;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public int field5910;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Lsc;")
    public class320 field5912;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public int field5920;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public int field5922;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Lia;")
    public class547 field5915;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "[I")
    public static int[] field5918 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Lsl;")
    public static class427 field5924 = new class427(64);

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "[Z")
    public static boolean[] field5926 = new boolean[5];

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Lfu;")
    public static class360 field5928;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Lph;")
    public final class598 method474(int arg0) {
        if (arg0 != 6686) {
            this.field5915 = null;
        }
        field5917++;
        return class230.field3462;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lr;Lfa;I)V")
    public static final void method2498(class167 arg0, class214 arg1, int arg2) {
        field5916++;
        if (class407.field5871 == null) {
            return;
        }
        if (class660.field9506 < 10) {
            if (!class407.field5866.method2232(1, class407.field5871.field7876)) {
                class660.field9506 = class613.field8924.method2227(class407.field5871.field7876, 24383) / 10;
                return;
            }
            class479.method2910((byte) 127);
            class660.field9506 = 10;
        }
        if (class660.field9506 == arg2) {
            class407.field5902 = class407.field5871.field7884 >> 6 << 6;
            class407.field5899 = class407.field5871.field7873 >> 6 << 6;
            class407.field5882 = (class407.field5871.field7880 >> 6 << 6) + 64 - class407.field5902;
            class407.field5892 = (class407.field5871.field7883 >> 6 << 6) + 64 - class407.field5899;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class407.field5871.method3176(class33.field967 + (class532.field7456.field9806 >> 9), -119, (class532.field7456.field9815 >> 9) + class323.field4749, var3, class532.field7456.field9814)) {
                var5 = var3[2] - class407.field5902;
                var4 = var3[1] - class407.field5899;
            }
            if (!class590.field8488 && var4 >= 0 && var4 < class407.field5892 && var5 >= 0 && var5 < class407.field5882) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class243.field3674 = var7;
                class254.field3763 = var6;
            } else if (class398.field5798 == -1 || class394.field5758 == -1) {
                class407.field5871.method3174((class407.field5871.field7875 & 0xFFFF171) >> 14, class407.field5871.field7875 & 0x3FFF, var3, 0);
                class254.field3763 = var3[2] - class407.field5902;
                class243.field3674 = var3[1] - class407.field5899;
            } else {
                class407.field5871.method3174(class398.field5798, class394.field5758, var3, arg2 - 10);
                class394.field5758 = -1;
                class398.field5798 = -1;
                if (var3 != null) {
                    class243.field3674 = var3[1] - class407.field5899;
                    class254.field3763 = var3[2] - class407.field5902;
                }
                class590.field8488 = false;
            }
            if (class407.field5871.field7878 == 37) {
                class407.field5874 = 3.0F;
                class407.field5876 = 3.0F;
            } else if (class407.field5871.field7878 == 50) {
                class407.field5874 = 4.0F;
                class407.field5876 = 4.0F;
            } else if (class407.field5871.field7878 == 75) {
                class407.field5874 = 6.0F;
                class407.field5876 = 6.0F;
            } else if (class407.field5871.field7878 == 100) {
                class407.field5874 = 8.0F;
                class407.field5876 = 8.0F;
            } else if (class407.field5871.field7878 == 200) {
                class407.field5874 = 16.0F;
                class407.field5876 = 16.0F;
            } else {
                class407.field5874 = 8.0F;
                class407.field5876 = 8.0F;
            }
            class407.field5881 = (int) class407.field5874 >> 1;
            class407.field5878 = class698.method3900((byte) 14, class407.field5881);
            class628.method3597((byte) -118);
            class407.method2493();
            class38.field1052 = new class158();
            class407.field5877 += (int) (Math.random() * 5.0D) - 2;
            if (class407.field5877 < -8) {
                class407.field5877 = -8;
            }
            class407.field5873 += (int) (Math.random() * 5.0D) - 2;
            if (class407.field5877 > 8) {
                class407.field5877 = 8;
            }
            if (class407.field5873 < -16) {
                class407.field5873 = -16;
            }
            if (class407.field5873 > 16) {
                class407.field5873 = 16;
            }
            class407.method2484(arg1, class407.field5877 >> 2 << 10, class407.field5873 >> 1);
            class407.field5864.method3356((byte) 123, 256, 1024);
            class407.field5865.method2797((byte) 96, 256, 256);
            class407.field5869.method3513(4096, (byte) -78);
            class661.field9519.method622(256, (byte) 108);
            class660.field9506 = 20;
        } else if (class660.field9506 == 20) {
            class694.method3889(arg2 + 10422, true);
            class407.method2481(arg0, class407.field5877, class407.field5873);
            class660.field9506 = 60;
            class694.method3889(10432, true);
            class438.method2652(true);
        } else if (class660.field9506 == 60) {
            if (class407.field5866.method2226(class407.field5871.field7876 + "_staticelements", (byte) 21)) {
                if (!class407.field5866.method2232(1, class407.field5871.field7876 + "_staticelements")) {
                    return;
                }
                class407.field5875 = class115.method1020(class407.field5871.field7876 + "_staticelements", class407.field5866, class294.field4411, (byte) 19);
            } else {
                class407.field5875 = new class193(0);
            }
            class407.method2474();
            class660.field9506 = 70;
            class694.method3889(10432, true);
            class438.method2652(true);
        } else if (class660.field9506 == 70) {
            class580.field8422 = new class360(arg0, 11, true, class699.field9853);
            class660.field9506 = 73;
            class694.method3889(10432, true);
            class438.method2652(true);
        } else if (class660.field9506 == 73) {
            class216.field3281 = new class360(arg0, 12, true, class699.field9853);
            class660.field9506 = 76;
            class694.method3889(10432, true);
            class438.method2652(true);
        } else if (class660.field9506 == 76) {
            class297.field4450 = new class360(arg0, 14, true, class699.field9853);
            class660.field9506 = 79;
            class694.method3889(arg2 ^ 0x28CA, true);
            class438.method2652(true);
        } else if (class660.field9506 == 79) {
            class247.field3717 = new class360(arg0, 17, true, class699.field9853);
            class660.field9506 = 82;
            class694.method3889(10432, true);
            class438.method2652(true);
        } else if (class660.field9506 == 82) {
            class244.field3690 = new class360(arg0, 19, true, class699.field9853);
            class660.field9506 = 85;
            class694.method3889(10432, true);
            class438.method2652(true);
        } else if (class660.field9506 == 85) {
            class436.field6297 = new class360(arg0, 22, true, class699.field9853);
            class660.field9506 = 88;
            class694.method3889(arg2 ^ 0x28CA, true);
            class438.method2652(true);
        } else if (class660.field9506 == 88) {
            class20.field846 = new class360(arg0, 26, true, class699.field9853);
            class660.field9506 = 91;
            class694.method3889(10432, true);
            class438.method2652(true);
        } else {
            field5928 = new class360(arg0, 30, true, class699.field9853);
            class660.field9506 = 100;
            class694.method3889(10432, true);
            class438.method2652(true);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static void method2499(int arg0) {
        field5924 = null;
        field5926 = null;
        field5928 = null;
        if (arg0 < 7) {
            method2498(null, null, -29);
        }
        field5918 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;Lsc;Lia;IIIIIIIIII)V")
    public class409(String arg0, class320 arg1, class547 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field5923 = arg9;
        this.field5913 = arg11;
        this.field5921 = arg0;
        this.field5925 = arg4;
        this.field5919 = arg3;
        this.field5911 = arg5;
        this.field5909 = arg12;
        this.field5914 = arg10;
        this.field5910 = arg6;
        this.field5912 = arg1;
        this.field5920 = arg7;
        this.field5922 = arg8;
        this.field5915 = arg2;
    }
}
