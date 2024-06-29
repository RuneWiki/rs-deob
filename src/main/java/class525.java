import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class525 {

    @OriginalMember(owner = "client!um", name = "d", descriptor = "[Ldb;")
    public static class326[] field7059 = new class326[75];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Lea;")
    public static class547 field7056 = new class547(74, 11);

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[[I")
    public static int[][] field7061 = new int[128][128];

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lha;Ld;I)V")
    public static final void method2910(class60 arg0, class152 arg1, int arg2) {
        field7060++;
        if (class642.field8928 == null || arg2 < 47) {
            return;
        }
        if (class491.field6703 < 10) {
            if (!class642.field8926.method2881(class642.field8928.field3951, 0)) {
                class491.field6703 = class226.field2933.method2888(29952, class642.field8928.field3951) / 10;
                return;
            }
            class143.method893(false);
            class491.field6703 = 10;
        }
        if (class491.field6703 == 10) {
            class642.field8950 = class642.field8928.field3938 >> 6 << 6;
            class642.field8947 = class642.field8928.field3937 >> 6 << 6;
            class642.field8956 = (class642.field8928.field3960 >> 6 << 6) + 64 - class642.field8950;
            class642.field8961 = (class642.field8928.field3948 >> 6 << 6) + 64 - class642.field8947;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class642.field8928.method1762(class653.field9086.field2175, var3, -90, (class653.field9086.field2165 >> 9) + class133.field1704, (class653.field9086.field2170 >> 9) + class99.field1313)) {
                var5 = var3[2] - class642.field8950;
                var4 = var3[1] - class642.field8947;
            }
            if (!class552.field7808 && var4 >= 0 && class642.field8961 > var4 && var5 >= 0 && class642.field8956 > var5) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class510.field6893 = var7;
                class450.field6297 = var6;
            } else if (class194.field2326 == -1 || class55.field562 == -1) {
                class642.field8928.method1759((byte) 117, class642.field8928.field3934 & 0x3FFF, var3, (class642.field8928.field3934 & 0xFFFC780) >> 14);
                class450.field6297 = var3[2] - class642.field8950;
                class510.field6893 = var3[1] - class642.field8947;
            } else {
                class642.field8928.method1759((byte) 100, class55.field562, var3, class194.field2326);
                if (var3 != null) {
                    class510.field6893 = var3[1] - class642.field8947;
                    class450.field6297 = var3[2] - class642.field8950;
                }
                class55.field562 = -1;
                class194.field2326 = -1;
                class552.field7808 = false;
            }
            if (class642.field8928.field3936 == 37) {
                class642.field8936 = 3.0F;
                class642.field8940 = 3.0F;
            } else if (class642.field8928.field3936 == 50) {
                class642.field8936 = 4.0F;
                class642.field8940 = 4.0F;
            } else if (class642.field8928.field3936 == 75) {
                class642.field8936 = 6.0F;
                class642.field8940 = 6.0F;
            } else if (class642.field8928.field3936 == 100) {
                class642.field8936 = 8.0F;
                class642.field8940 = 8.0F;
            } else if (class642.field8928.field3936 == 200) {
                class642.field8936 = 16.0F;
                class642.field8940 = 16.0F;
            } else {
                class642.field8936 = 8.0F;
                class642.field8940 = 8.0F;
            }
            class642.field8941 = (int) class642.field8936 >> 1;
            class642.field8944 = class702.method3958(class642.field8941, (byte) 126);
            class582.method3255(-1);
            class642.method3611();
            class600.field8354 = new class108();
            class642.field8935 += (int) (Math.random() * 5.0D) - 2;
            if (class642.field8935 < -8) {
                class642.field8935 = -8;
            }
            class642.field8943 += (int) (Math.random() * 5.0D) - 2;
            if (class642.field8935 > 8) {
                class642.field8935 = 8;
            }
            if (class642.field8943 < -16) {
                class642.field8943 = -16;
            }
            if (class642.field8943 > 16) {
                class642.field8943 = 16;
            }
            class642.method3618(arg1, class642.field8935 >> 2 << 10, class642.field8943 >> 1);
            class642.field8929.method1649(256, -30502, 1024);
            class642.field8931.method1370(119, 256, 256);
            class642.field8934.method4113(-129, 4096);
            class465.field6445.method1838(256, (byte) -90);
            class491.field6703 = 20;
        } else if (class491.field6703 == 20) {
            class226.method1348((byte) 86, true);
            class642.method3619(arg0, class642.field8935, class642.field8943);
            class491.field6703 = 60;
            class226.method1348((byte) 85, true);
            class170.method986(false);
        } else if (class491.field6703 == 60) {
            if (class642.field8926.method2868(class642.field8928.field3951 + "_staticelements", 0)) {
                if (!class642.field8926.method2881(class642.field8928.field3951 + "_staticelements", 0)) {
                    return;
                }
                class642.field8938 = class511.method2833(77, class262.field3431, class642.field8926, class642.field8928.field3951 + "_staticelements");
            } else {
                class642.field8938 = new class137(0);
            }
            class642.method3616();
            class491.field6703 = 70;
            class226.method1348((byte) 65, true);
            class170.method986(false);
        } else if (class491.field6703 == 70) {
            class660.field9216 = new class119(arg0, 11, true, class725.field10121);
            class491.field6703 = 73;
            class226.method1348((byte) 80, true);
            class170.method986(false);
        } else if (class491.field6703 == 73) {
            class266.field3527 = new class119(arg0, 12, true, class725.field10121);
            class491.field6703 = 76;
            class226.method1348((byte) 46, true);
            class170.method986(false);
        } else if (class491.field6703 == 76) {
            class660.field9208 = new class119(arg0, 14, true, class725.field10121);
            class491.field6703 = 79;
            class226.method1348((byte) 96, true);
            class170.method986(false);
        } else if (class491.field6703 == 79) {
            class291.field3851 = new class119(arg0, 17, true, class725.field10121);
            class491.field6703 = 82;
            class226.method1348((byte) 94, true);
            class170.method986(false);
        } else if (class491.field6703 == 82) {
            class460.field6377 = new class119(arg0, 19, true, class725.field10121);
            class491.field6703 = 85;
            class226.method1348((byte) 49, true);
            class170.method986(false);
        } else if (class491.field6703 == 85) {
            class636.field8840 = new class119(arg0, 22, true, class725.field10121);
            class491.field6703 = 88;
            class226.method1348((byte) 104, true);
            class170.method986(false);
        } else if (class491.field6703 == 88) {
            class621.field8702 = new class119(arg0, 26, true, class725.field10121);
            class491.field6703 = 91;
            class226.method1348((byte) 60, true);
            class170.method986(false);
        } else {
            class681.field9490 = new class119(arg0, 30, true, class725.field10121);
            class491.field6703 = 100;
            class226.method1348((byte) 62, true);
            class170.method986(false);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lte;")
    public abstract class615 method2911(byte arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
    public abstract void method2912(int arg0, boolean arg1);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[B")
    public abstract byte[] method2913(int arg0, int arg1);

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
    public static void method2914(byte arg0) {
        if (arg0 == -69) {
            field7059 = null;
            field7061 = null;
            field7056 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method2915(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg3 && arg8 == arg9 && arg5 == arg6 && arg2 == arg7) {
            class456.method2549(arg5, arg1, arg7, arg8, arg0, 21597);
        } else {
            int var10 = arg0;
            int var11 = arg8;
            int var12 = arg0 * 3;
            int var13 = arg8 * 3;
            int var14 = arg3 * 3;
            int var15 = arg9 * 3;
            int var16 = arg6 * 3;
            int var17 = arg2 * 3;
            int var18 = arg5 + var14 - var16 - arg0;
            int var19 = var15 + arg7 - arg8 - var17;
            int var20 = var16 - var14 - (var14 - var12);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg0 + (var27 - (-var29 - var31) >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg8;
                class456.method2549(var33, arg1, var34, var11, var10, 21597);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg4 == -67) {
            field7058++;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static final void method2916(int arg0) {
        field7057++;
        if (class659.field9197 == null) {
            return;
        }
        class659.field9197 = null;
        if (arg0 != 70) {
            method2915(-45, -2, -88, -42, (byte) -67, 70, -12, -2, 77, 14);
        }
        class640.method3603(class638.field8859, -1, class438.field6139, class596.field8309, class746.field10362);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)I")
    public abstract int method2917(int arg0, byte arg1);
}
