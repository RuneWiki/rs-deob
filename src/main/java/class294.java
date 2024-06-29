import java.awt.Container;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class294 extends class118 {

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    private int field4464 = 4096;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    private int field4466 = 16;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    private int field4471 = 0;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    private int field4473 = 0;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    private int field4476 = 2000;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Z")
    public static boolean field4467 = false;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "[Lgr;")
    public static class379[] field4472 = new class379[14];

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "[I")
    public static int[] field4474 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "[I")
    public static int[] field4470 = new int[500];

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "Ljg;")
    public static class241 field4479 = new class241(8);

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4475;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (arg0 != 1) {
            this.method20(-121, 49);
        }
        if (super.field1537.field5756) {
            int var4 = this.field4464 >> 1;
            int[][] var5 = super.field1537.method2394(0);
            Random var6 = new Random((long) this.field4473);
            for (int var7 = 0; this.field4476 > var7; ++var7) {
                int var8 = ~this.field4464 >= -1 ? this.field4471 : -var4 + this.field4471 + class330.method2028(63, this.field4464, var6);
                int var9 = (var8 & 4081) >> 4;
                int var10 = class330.method2028(78, class440.field6474, var6);
                int var11 = class330.method2028(-93, class289.field4403, var6);
                int var12 = (class47.field582[var9] * this.field4466 >> 12) + var10;
                int var13 = (class280.field4293[var9] * this.field4466 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class330.method2028(26, 4096, var6) >> 2);
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = var26 - -1024 - -((var28 - var10) * var25);
                        int var30 = var28 & class87.field1230;
                        int var31 = class438.field6441 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1829(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~arg4 > -2) {
            arg4 = 1;
        }
        ++field4478;
        int var6 = -50 / ((arg1 - 41) / 44);
        if (~arg5 > -2) {
            arg5 = 1;
        }
        int var7 = arg5 - 334;
        if (var7 >= 0) {
            if (var7 > 100) {
                var7 = 100;
            }
        } else {
            var7 = 0;
        }
        int var8 = (-class450.field6618 + class114.field1512) * var7 / 100 + class450.field6618;
        if (~var8 > ~class314.field4761) {
            var8 = class314.field4761;
        } else if (~var8 < ~class454.field6745) {
            var8 = class454.field6745;
        }
        int var9 = var8 * 512 * arg5 / (arg4 * 334);
        if (class107.field1428 <= var9) {
            if (var9 > class455.field6760) {
                short var10 = class455.field6760;
                var8 = arg4 * 334 * var10 / (arg5 * 512);
                if (var8 < class314.field4761) {
                    var8 = class314.field4761;
                    int var11 = arg4 * var10 * 334 / (var8 * 512);
                    int var12 = (-var11 + arg5) / 2;
                    if (arg0) {
                        class196.field2965.method433();
                        class196.field2965.method1615(arg4, -16777216, var12, arg2, arg3, (byte) -119);
                        class196.field2965.method1615(arg4, -16777216, var12, arg2, arg3 + arg5 + -var12, (byte) -119);
                    }
                    arg3 += var12;
                    arg5 -= var12 * 2;
                }
            }
        } else {
            short var13 = class107.field1428;
            var8 = var13 * 334 * arg4 / (arg5 * 512);
            if (var8 > class454.field6745) {
                var8 = class454.field6745;
                int var14 = arg5 * var8 * 512 / (var13 * 334);
                int var15 = (-var14 + arg4) / 2;
                if (arg0) {
                    class196.field2965.method433();
                    class196.field2965.method1615(var15, -16777216, arg5, arg2, arg3, (byte) -119);
                    class196.field2965.method1615(var15, -16777216, arg5, arg2 + arg4 + -var15, arg3, (byte) -119);
                }
                arg2 += var15;
                arg4 -= var15 * 2;
            }
        }
        class442.field6498 = arg5 * var8 / 334;
        class177.field2687 = (short) arg4;
        class94.field1310 = arg3;
        class272.field4165 = (short) arg5;
        class371.field5413 = arg2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field4469;
        if (arg1 == 1) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (arg0 == 4) {
                                this.field4464 = arg2.method2323(-88);
                            }
                        } else {
                            this.field4471 = arg2.method2323(-89);
                        }
                    } else {
                        this.field4466 = arg2.method2343(arg1 ^ 254);
                    }
                } else {
                    this.field4476 = arg2.method2323(-51);
                }
            } else {
                this.field4473 = arg2.method2343(255);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZIIBI)V")
    public static final void method1830(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field4468;
        if (arg1) {
            class458.method2841((byte) 76);
        }
        if (class90.field1277 != null && (arg0 != 3 || ~class57.field767 != ~arg5 || class243.field3646 != arg2)) {
            class187.method1139(class90.field1277, 0, class79.field1043);
            class90.field1277 = null;
        }
        if (arg0 == 3 && class90.field1277 == null) {
            class90.field1277 = class28.method162(0, 0, arg2, class79.field1043, 0, arg5);
            if (class90.field1277 != null) {
                class243.field3646 = arg2;
                class57.field767 = arg5;
                class36.method206(-18199, class79.field1043);
            }
        }
        if (arg0 == 3 && class90.field1277 == null) {
            method1830(class376.field5479, true, -1, arg3, (byte) -57, -1);
        } else {
            Container var7;
            if (class90.field1277 == null) {
                if (class143.field1914 != null) {
                    Insets var6 = class143.field1914.getInsets();
                    class71.field933 = class143.field1914.getSize().width - var6.right - var6.left;
                    class204.field3063 = class143.field1914.getSize().height - var6.bottom - var6.top;
                    var7 = class143.field1914;
                } else {
                    var7 = class79.field1043.field3583;
                    class71.field933 = var7.getSize().width;
                    class204.field3063 = var7.getSize().height;
                }
            } else {
                class204.field3063 = arg2;
                class71.field933 = arg5;
                var7 = class90.field1277;
            }
            if (~arg0 != -2) {
                if (class229.field3504 < 96 && class405.field6032 == 0) {
                    int var8 = class71.field933 > 1024 ? 1024 : class71.field933;
                    int var9 = ~class204.field3063 >= -769 ? class204.field3063 : 768;
                    class184.field2777 = (class71.field933 - var8) / 2;
                    class221.field3368 = var8;
                    class161.field2232 = var9;
                    class113.field1498 = 0;
                } else {
                    class221.field3368 = class71.field933;
                    class161.field2232 = class204.field3063;
                    class113.field1498 = 0;
                    class184.field2777 = 0;
                }
            } else {
                class184.field2777 = (-class68.field886 + class71.field933) / 2;
                class161.field2232 = class88.field1262;
                class113.field1498 = 0;
                class221.field3368 = class68.field886;
            }
            if (class454.field6750 != 0) {
                boolean var10000;
                if (~class221.field3368 > -1025 && class161.field2232 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg1) {
                class388.method2399(true, class405.field6032);
            } else {
                class170.field2631.setSize(class221.field3368, class161.field2232);
                if (class196.field2965 != null) {
                    class196.field2965.method391();
                }
                if (class143.field1914 == var7) {
                    Insets var10 = class143.field1914.getInsets();
                    class170.field2631.setLocation(var10.left - -class184.field2777, class113.field1498 + var10.top);
                } else {
                    class170.field2631.setLocation(class184.field2777, class113.field1498);
                }
            }
            if (arg0 >= 2) {
                class140.field1884 = true;
            } else {
                class140.field1884 = false;
            }
            if (class6.field69 != -1) {
                class39.method224(40, true);
            }
            if (class301.field4543 != null && (~class19.field263 == -31 || class19.field263 == 25)) {
                class364.method2185(17147);
            }
            for (int var11 = 0; ~var11 > -101; ++var11) {
                class6.field71[var11] = true;
            }
            if (arg4 > -46) {
                field4470 = null;
            }
            class207.field3094 = true;
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
    public static void method1831(byte arg0) {
        int var1 = -79 / ((arg0 - -25) / 59);
        field4472 = null;
        field4479 = null;
        field4474 = null;
        field4470 = null;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
    public static final void method1832(int arg0) {
        ++field4465;
        if (arg0 != -3) {
            method1829(false, 49, -122, 109, 86, -76);
        }
        for (class236 var1 = (class236) class303.field4577.method2128(-78); var1 != null; var1 = (class236) class303.field4577.method2128(-109)) {
            class154.method950(false, var1);
        }
        int var2;
        int var3;
        if (class360.method2172(arg0 ^ -61)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class88.field1263;
            var3 = class88.field1263;
        }
        client.method2798();
        for (int var4 = var3; var2 >= var4; ++var4) {
            client.method2794();
            client.method2801(var4);
            client.method2797(var4);
        }
        client.method2786();
        client.method2800();
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        ++field4477;
        if (arg0 <= 103) {
            this.field4476 = 42;
        }
        class316.method1927((byte) 105);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class294() {
        super(0, true);
    }
}
