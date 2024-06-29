import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class316 extends class601 {

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    private int field3929 = 2048;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "I")
    private int field3937 = 3072;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    private int field3934 = 1024;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "Lrn;")
    public static class633 field3938 = new class633(66, 11);

    @OriginalMember(owner = "client!er", name = "S", descriptor = "Lgp;")
    public static class576 field3940 = new class576(4, 1);

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!er", name = "R", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!er", name = "T", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "J")
    public static long field3931;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method1847(class570 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class398.field5275 = arg0;
        class514.field6556 = arg1;
        class70.field955 = class514.field6556 > 1 && class398.field5275.method906();
        class88.field1221 = arg2;
        class722.field9480 = 1 << class88.field1221;
        class686.field8834 = class722.field9480 >> 1;
        Math.sqrt((double) (class686.field8834 * class686.field8834 + class686.field8834 * class686.field8834));
        class78.field1121 = arg3;
        class330.field4039 = arg4;
        class559.field7102 = arg5;
        class76.field1069 = arg6;
        class506.field6473 = class343.method1991((byte) 109);
        class176.method1130(4754);
        class137.field1810 = new class766[arg3][class330.field4039][class559.field7102];
        class383.field4790 = new class358[arg3];
        if (arg7) {
            class656.field8465 = new int[class330.field4039][class559.field7102];
            class329.field4032 = new byte[class330.field4039][class559.field7102];
            class490.field6303 = new short[class330.field4039][class559.field7102];
            class324.field4002 = new class766[1][class330.field4039][class559.field7102];
            class735.field9973 = new class358[1];
        } else {
            class656.field8465 = null;
            class329.field4032 = null;
            class490.field6303 = null;
            class324.field4002 = null;
            class735.field9973 = null;
        }
        if (arg8) {
            class412.field5464 = new long[arg3][arg4][arg5];
            class491.field6306 = new class739[65535];
            class620.field7851 = new boolean[65535];
            class451.field5892 = 0;
        } else {
            class412.field5464 = null;
            class491.field6306 = null;
            class620.field7851 = null;
            class451.field5892 = 0;
        }
        class395.method2290(false);
        class177.field2327 = new class210[2];
        class336.field4089 = new class210[2];
        class640.field8187 = new class210[2];
        class486.field6263 = new class210[10000];
        class304.field3830 = 0;
        class166.field2215 = new class210[5000];
        class418.field5516 = 0;
        class757.field10327 = new class620[5000];
        class100.field1332 = 0;
        class145.field1873 = new boolean[class76.field1069 + class76.field1069 + 1][class76.field1069 + class76.field1069 + 1];
        class56.field726 = new boolean[class76.field1069 + class76.field1069 + 2][class76.field1069 + class76.field1069 + 2];
        class19.field176 = new int[class76.field1069 + class76.field1069 + 2];
        class108.field1468 = class108.field1466;
        if (class70.field955) {
            class301.field3804 = new boolean[arg3][class76.field1069 + class76.field1069 + 1][class76.field1069 + class76.field1069 + 1];
            class787.field10783 = new boolean[arg3][][];
            if (class166.field2206 != null) {
                class17.method74();
            }
            class166.field2206 = new class710[class514.field6556];
            class398.field5275.method939(class166.field2206.length + 1);
            class398.field5275.method995(0);
            for (int var9 = 0; var9 < class166.field2206.length; ++var9) {
                class166.field2206[var9] = new class710(var9 + 1, class398.field5275);
                (new Thread(class166.field2206[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class514.field6556 == 2) {
                var10 = 4;
                class106.field1448 = 2;
            } else if (class514.field6556 == 3) {
                var10 = 6;
                class106.field1448 = 3;
            } else {
                var10 = 8;
                class106.field1448 = 4;
            }
            class520.field6609 = new class322[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class520.field6609[var11] = new class322(class206.field2836[class514.field6556 - 2][var11]);
            }
        } else {
            class106.field1448 = 1;
        }
        class309.field3868 = new int[class106.field1448 - 1];
        class45.field507 = new int[class106.field1448 - 1];
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
    public final void method292(byte arg0) {
        this.field3929 = -this.field3934 + this.field3937;
        if (arg0 <= 44) {
            this.field3937 = -124;
        }
        ++field3932;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field3936;
        if (arg1 >= -76) {
            this.method638(61, 108);
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(arg0, 27123, 0);
            for (int var5 = 0; ~class418.field5518 < ~var5; ++var5) {
                var3[var5] = this.field3934 - -(var4[var5] * this.field3929 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
    public class316() {
        super(1, false);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(II)I")
    public static final int method1848(int arg0, int arg1) {
        ++field3935;
        int var2 = -94 % ((arg1 - -54) / 35);
        if (~arg0 != -6408 && ~arg0 != -34844 && arg0 != 34837) {
            if (arg0 != 6408 && arg0 != 34842 && ~arg0 != -34837) {
                if (arg0 != 6406 && arg0 != 34844) {
                    if (~arg0 != -6410 && arg0 != 34846) {
                        if (arg0 != 6410 && ~arg0 != -34848) {
                            if (arg0 == 6402) {
                                return 6402;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6410;
                        }
                    } else {
                        return 6409;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method1849(int arg0, byte[] arg1) {
        if (arg0 >= -104) {
            field3938 = null;
        }
        ++field3928;
        return class289.method1750(-128, arg1.length, arg1, 0);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
    public static final void method1850(byte arg0) {
        int var1 = 120 % ((arg0 - -63) / 36);
        class70.method417(2);
        ++field3933;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLtia;)V")
    public static final void method1851(boolean arg0, class740 arg1) {
        arg1.method4021((byte) 48);
        ++field3930;
        int var2 = class330.field4043;
        if (!arg0) {
            field3940 = null;
        }
        class33 var3 = class422.field5564 = class263.field3508[var2] = new class33();
        var3.field4737 = var2;
        int var4 = arg1.method4023(arg0, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = 16383 & var4 >> 14;
        int var7 = var4 & 16383;
        var3.field4767[0] = -class714.field9407 + var6;
        var3.field2896 = (var3.field4767[0] << 9) - -(var3.method190((byte) 56) << 8);
        var3.field4758[0] = -class240.field3293 + var7;
        var3.field2900 = (var3.field4758[0] << 9) + (var3.method190((byte) -102) << 8);
        class309.field3877 = var3.field2895 = var3.field2889 = var5;
        if (class433.method2484(var3.field4758[0], 0, var3.field4767[0])) {
            ++var3.field2889;
        }
        if (class26.field229[var2] != null) {
            var3.method177(class26.field229[var2], -1);
        }
        class20.field189 = 0;
        class503.field6451[class20.field189++] = var2;
        class130.field1735[var2] = 0;
        class194.field2702 = 0;
        for (int var8 = 1; var8 < 2048; ++var8) {
            if (~var2 != ~var8) {
                int var9 = arg1.method4023(arg0, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 255;
                int var12 = 255 & var9;
                class750 var13 = class420.field5533[var8] = new class750();
                var13.field10233 = false;
                var13.field10230 = -1;
                var13.field10232 = (var10 << 28) + (var11 << 14) + var12;
                var13.field10227 = false;
                var13.field10226 = 0;
                class119.field1604[class194.field2702++] = var8;
                class130.field1735[var8] = 0;
            }
        }
        arg1.method4030(false);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field3939;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field7646 = ~arg0.method1509(true) == -2;
                }
            } else {
                this.field3937 = arg0.method1553((byte) 39);
            }
        } else {
            this.field3934 = arg0.method1553((byte) -115);
        }
        int var5 = 64 / ((arg2 - 40) / 52);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
    public static void method1852(boolean arg0) {
        field3940 = null;
        if (arg0) {
            method1849(88, (byte[]) null);
        }
        field3938 = null;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[[I")
    public final int[][] method638(int arg0, int arg1) {
        if (arg0 != 2017) {
            field3931 = 94L;
        }
        ++field3927;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[][] var4 = this.method3247((byte) -95, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class418.field5518 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field3929 >> 12) + this.field3934;
                var9[var11] = (var6[var11] * this.field3929 >> 12) + this.field3934;
                var10[var11] = (var7[var11] * this.field3929 >> 12) + this.field3934;
            }
        }
        return var3;
    }
}
