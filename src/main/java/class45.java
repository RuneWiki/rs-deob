import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class45 extends class739 {

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    private int field746 = 4;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    private int field753 = 4;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "[I")
    public static int[] field750 = new int[14];

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "[[[B")
    public static byte[][][] field745;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lha;Ld;I)V")
    public static final void method444(class543 arg0, class267 arg1, int arg2) {
        ++field752;
        if (class664.field9481 != null) {
            if (~class499.field7172 > -11) {
                if (!class664.field9480.method2604(class664.field9481.field9740, -70)) {
                    class499.field7172 = class585.field8351.method2603(class664.field9481.field9740, false) / 10;
                    return;
                }
                class585.method3444(-14756);
                class499.field7172 = 10;
            }
            if (~class499.field7172 == -11) {
                class664.field9502 = class664.field9481.field9738 >> 6 << 6;
                class664.field9498 = class664.field9481.field9734 >> 6 << 6;
                class664.field9508 = (class664.field9481.field9743 >> 6 << 6) + -class664.field9502 - -64;
                class664.field9509 = (class664.field9481.field9733 >> 6 << 6) + -class664.field9498 - -64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class664.field9481.method3889(var3, (class108.field1536.field3916 >> 9) + class71.field1085, class108.field1536.field3920, class41.field693 - -(class108.field1536.field3923 >> 9), 689)) {
                    var4 = var3[1] - class664.field9502;
                    var5 = var3[2] - class664.field9498;
                }
                if (!class160.field2305 && var4 >= 0 && class664.field9508 > var4 && var5 >= 0 && var5 < class664.field9509) {
                    int var6 = var5 + (int) (Math.random() * 10.0D) + -5;
                    int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                    class78.field1135 = var6;
                    class488.field7039 = var7;
                } else if (~class378.field5502 != 0 && ~class105.field1473 != 0) {
                    class664.field9481.method3888(var3, (byte) 42, class378.field5502, class105.field1473);
                    if (var3 != null) {
                        class488.field7039 = var3[1] + -class664.field9502;
                        class78.field1135 = var3[2] - class664.field9498;
                    }
                    class160.field2305 = false;
                    class105.field1473 = -1;
                    class378.field5502 = -1;
                } else {
                    class664.field9481.method3888(var3, (byte) 42, class664.field9481.field9735 >> 14 & 16383, class664.field9481.field9735 & 16383);
                    class78.field1135 = var3[2] + -class664.field9498;
                    class488.field7039 = var3[1] - class664.field9502;
                }
                if (~class664.field9481.field9728 != -38) {
                    if (class664.field9481.field9728 != 50) {
                        if (~class664.field9481.field9728 == -76) {
                            class664.field9492 = 6.0F;
                            class664.field9493 = 6.0F;
                        } else if (class664.field9481.field9728 != 100) {
                            if (~class664.field9481.field9728 == -201) {
                                class664.field9492 = 16.0F;
                                class664.field9493 = 16.0F;
                            } else {
                                class664.field9492 = 8.0F;
                                class664.field9493 = 8.0F;
                            }
                        } else {
                            class664.field9492 = 8.0F;
                            class664.field9493 = 8.0F;
                        }
                    } else {
                        class664.field9492 = 4.0F;
                        class664.field9493 = 4.0F;
                    }
                } else {
                    class664.field9492 = 3.0F;
                    class664.field9493 = 3.0F;
                }
                class664.field9486 = (int) class664.field9492 >> 1;
                class664.field9494 = class247.method1682(class664.field9486, 7);
                class91.method710(false);
                class664.method3791();
                class524.field7613 = new class611();
                class664.field9489 += (int) (Math.random() * 5.0D) + -2;
                if (class664.field9489 < -8) {
                    class664.field9489 = -8;
                }
                class664.field9487 += -2 + (int) (5.0D * Math.random());
                if (class664.field9489 > 8) {
                    class664.field9489 = 8;
                }
                if (~class664.field9487 > 15) {
                    class664.field9487 = -16;
                }
                if (class664.field9487 > 16) {
                    class664.field9487 = 16;
                }
                class664.method3783(arg1, class664.field9489 >> 2 << 10, class664.field9487 >> 1);
                class664.field9482.method2690(64, 1024, 256);
                class664.field9483.method4087(256, 256, true);
                class664.field9478.method2681(arg2 + 14848, 4096);
                class215.field3233.method1141(256, (byte) -89);
                class499.field7172 = 20;
            } else if (~class499.field7172 == -21) {
                class254.method1701((byte) -128, true);
                class664.method3792(arg0, class664.field9489, class664.field9487);
                class499.field7172 = 60;
                class254.method1701((byte) -127, true);
                class486.method2966((byte) 47);
            } else if (~class499.field7172 == -61) {
                if (class664.field9480.method2605(-2, class664.field9481.field9740 + "_staticelements")) {
                    if (!class664.field9480.method2604(class664.field9481.field9740 + "_staticelements", -111)) {
                        return;
                    }
                    class664.field9490 = class108.method797(-1, class502.field7304, class664.field9480, class664.field9481.field9740 + "_staticelements");
                } else {
                    class664.field9490 = new class494(0);
                }
                class664.method3800();
                class499.field7172 = 70;
                class254.method1701((byte) -128, true);
                class486.method2966((byte) 55);
            } else if (~class499.field7172 == -71) {
                class713.field10039 = new class336(arg0, 11, true, class95.field1383);
                class499.field7172 = 73;
                class254.method1701((byte) -128, true);
                class486.method2966((byte) -95);
            } else if (class499.field7172 == 73) {
                class196.field2867 = new class336(arg0, 12, true, class95.field1383);
                class499.field7172 = 76;
                class254.method1701((byte) -127, true);
                class486.method2966((byte) -63);
            } else if (~class499.field7172 == -77) {
                class611.field8741 = new class336(arg0, 14, true, class95.field1383);
                class499.field7172 = 79;
                class254.method1701((byte) -128, true);
                class486.method2966((byte) -81);
            } else if (~class499.field7172 == -80) {
                class748.field10424 = new class336(arg0, 17, true, class95.field1383);
                class499.field7172 = 82;
                class254.method1701((byte) -128, true);
                class486.method2966((byte) 113);
            } else if (class499.field7172 == 82) {
                class126.field1743 = new class336(arg0, 19, true, class95.field1383);
                class499.field7172 = 85;
                class254.method1701((byte) -128, true);
                class486.method2966((byte) 100);
            } else if (class499.field7172 == 85) {
                class157.field2257 = new class336(arg0, 22, true, class95.field1383);
                class499.field7172 = 88;
                class254.method1701((byte) -127, true);
                class486.method2966((byte) -112);
            } else if (class499.field7172 == 88) {
                class417.field5972 = new class336(arg0, 26, true, class95.field1383);
                class499.field7172 = 91;
                class254.method1701((byte) -128, true);
                class486.method2966((byte) 100);
            } else {
                class64.field1008 = new class336(arg0, 30, true, class95.field1383);
                class499.field7172 = 100;
                class254.method1701((byte) -127, true);
                class486.method2966((byte) -111);
                System.gc();
                if (arg2 != 1535) {
                    field755 = 85;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field751;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field10317.field2170) {
                int var4 = class399.field5703 / this.field746;
                int var5 = class505.field7350 / this.field753;
                int[] var6;
                if (var5 <= 0) {
                    var6 = this.method4127(0, 106, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method4127(class505.field7350 * var7 / var5, 126, 0);
                }
                for (int var8 = 0; var8 < class399.field5703; ++var8) {
                    if (~var4 < -1) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class399.field5703 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field754;
        if (arg2 != 1) {
            this.method445(true, 114);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field753 = arg0.method2886(true);
            }
        } else {
            this.field746 = arg0.method2886(true);
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public static void method446(int arg0) {
        int var1 = -65 % ((36 - arg0) / 46);
        field750 = null;
        field745 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLgt;)V")
    public static final void method447(byte arg0, class571 arg1) {
        ++field747;
        for (class654 var2 = (class654) class337.field4661.method3565(111); var2 != null; var2 = (class654) class337.field4661.method3561((byte) 85)) {
            if (var2.field9383 == arg1) {
                if (var2.field9375 != null) {
                    class593.field8429.method3652(var2.field9375);
                    var2.field9375 = null;
                }
                var2.method2656((byte) 121);
                return;
            }
        }
        if (arg0 >= -47) {
            method447((byte) 60, (class571) null);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field749;
        if (arg1 != 8213) {
            this.method112((class479) null, -98, (byte) -30);
        }
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int var4 = class399.field5703 / this.field746;
            int var5 = class505.field7350 / this.field753;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method4124(0, 0, true);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method4124(class505.field7350 * var7 / var5, 0, true);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class399.field5703 > var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class399.field5703 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class45() {
        super(1, false);
    }
}
