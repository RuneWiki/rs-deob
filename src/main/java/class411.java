import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class411 extends class634 {

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "Lwd;")
    public static class272 field5613 = new class272(1);

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field5617 = 0;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "[F")
    public static float[] field5618 = new float[4];

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "Ljava/lang/String;")
    public static String field5619 = "";

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "[Lhu;")
    public static class131[] field5616;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)I", line = 4)
    public static final int method2519(int arg0, int arg1, int arg2) {
        ++field5612;
        if (~class166.field1851 == 0) {
            return 1;
        } else {
            if (class654.field9334.field9850.method1512(arg0 ^ -128) != arg2) {
                class404.method2477(class486.field6917.method2936(class489.field6978, arg0 + 125), arg2, true, arg0 + -85);
                if (arg2 != class654.field9334.field9850.method1512(112)) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class618.field8849.getSize();
                class192.method1170(class720.field10104, true, arg0 ^ -8069, class275.field3370, class486.field6917.method2936(class489.field6978, arg0 ^ -107), class740.field10344);
                class260 var4 = class359.method2109(4763, 0, class557.field7980, class166.field1851);
                long var5 = class652.method3700(~arg0);
                class275.field3370.method393();
                class667.field9490.method1019(0, class598.field8523, 0);
                class275.field3370.method339(class667.field9490);
                class275.field3370.method400(var3.width / 2, var3.height / 2, 512, 512);
                class275.field3370.method360(1.0F);
                class275.field3370.method325(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class470 var7 = class275.field3370.method383(var4, 2048, 64, 64, 768);
                int var8 = arg0;
                label41: for (int var9 = 0; ~var9 > -501; ++var9) {
                    class275.field3370.method378(0);
                    class275.field3370.method319();
                    for (int var10 = 15; var10 >= 0; --var10) {
                        for (int var11 = 0; ~var11 >= ~var10; ++var11) {
                            class672.field9542.method1019((int) (((float) var11 - (float) var10 / 2.0F) * (float) class559.field7987), 0, (var10 - -1) * class559.field7987);
                            var7.method228(class672.field9542, (class569) null, 0);
                            ++var8;
                            if (~(class652.method3700(-1) + -var5) <= ~((long) arg1)) {
                                break label41;
                            }
                        }
                    }
                }
                class275.field3370.method334();
                long var12 = (long) (var8 * 1000) / (-var5 + class652.method3700(arg0 + -1));
                class275.field3370.method378(0);
                class275.field3370.method319();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V", line = 87)
    public static void method2520(int arg0) {
        field5616 = null;
        field5618 = null;
        field5619 = null;
        field5613 = null;
        if (arg0 <= 100) {
            field5619 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(BI)[I", line = 103)
    public final int[] method13(byte arg0, int arg1) {
        if (arg0 > -55) {
            return null;
        } else {
            ++field5614;
            int[] var3 = super.field9114.method1858(100, arg1);
            if (super.field9114.field3897) {
                int[][] var4 = this.method3642(0, arg1, true);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~var8 > ~class635.field9139; ++var8) {
                    var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V", line = 142)
    public static final void method2521(int arg0) {
        ++field5611;
        class541.field7786 = 0;
        if (arg0 > -12) {
            method2520(69);
        }
        int var1 = (class90.field937.field4635 >> 9) + class464.field6624;
        int var2 = (class90.field937.field4629 >> 9) + class181.field2144;
        if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && ~var2 >= -3137) {
            class541.field7786 = 1;
        }
        if (~var1 <= -3073 && var1 <= 3118 && ~var2 <= -9493 && ~var2 >= -9536) {
            class541.field7786 = 1;
        }
        if (class541.field7786 == 1 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
            class541.field7786 = 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V", line = 170)
    public static final void method2522(int arg0) {
        ++field5615;
        try {
            if (class446.field6457 == 1) {
                int var1 = class41.field465.method1356(false);
                if (~var1 < -1 && class41.field465.method1376(113)) {
                    int var2 = var1 - class231.field2696;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class41.field465.method1380(arg0 ^ -23, var2);
                    return;
                }
                class41.field465.method1363(17768);
                class41.field465.method1383((byte) 0);
                if (class462.field6583 == null) {
                    class446.field6457 = 0;
                } else {
                    class446.field6457 = 2;
                }
                class688.field9714 = null;
                class664.field9448 = null;
            }
            if (arg0 != 23) {
                method2523(79, -35);
            }
            if (~class446.field6457 == -4) {
                int var3 = class41.field465.method1356(false);
                if (~var3 > ~class30.field344 && class41.field465.method1376(arg0 + 83)) {
                    int var4 = class215.field2505 + var3;
                    if (~class30.field344 > ~var4) {
                        var4 = class30.field344;
                    }
                    class41.field465.method1380(arg0 ^ -23, var4);
                } else {
                    class446.field6457 = 0;
                    class215.field2505 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class41.field465.method1363(17768);
            class446.field6457 = 0;
            class688.field9714 = null;
            class664.field9448 = null;
            class462.field6583 = null;
            class344.field4471 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Z", line = 236)
    public static final boolean method2523(int arg0, int arg1) {
        ++field5610;
        if (~arg1 != -5 && arg1 != 23 && ~arg1 != -50 && arg1 != 30 && arg1 != 16) {
            if (arg0 < 72) {
                method2521(-87);
            }
            return ~arg1 == -60 || ~arg1 == -1012;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 262)
    public class411() {
        super(1, true);
    }
}
