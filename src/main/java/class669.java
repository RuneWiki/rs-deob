import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class669 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    public static int[] field9508 = new int[8];

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljj;")
    public static class398 field9510 = new class398(41, 4);

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lvi;")
    public static class560 field9511 = new class560(4);

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field9513 = -1;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lcb;")
    public static class318 field9512 = new class318(92, 8);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field9514 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static final void method3708(boolean arg0) {
        if (arg0) {
            class145.field1841 = class644.field9128;
            class397.field5666 = class185.field2270;
        } else {
            class145.field1841 = class285.field3867;
            class397.field5666 = class249.field3345;
        }
        class87.field1079 = class145.field1841.length;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
    public static final int method3709(int arg0, int arg1, int arg2) {
        field9505++;
        if (class254.field3512 == -1) {
            return 1;
        }
        if (class161.field2038 != arg0) {
            class564.method3180(arg0, (byte) 32);
            if (class161.field2038 != arg0) {
                return -1;
            }
        }
        try {
            Dimension var3 = class249.field3351.getSize();
            class82.method463(class243.field3177.method1491(class350.field5121, (byte) 127), class395.field5658, 54, true);
            class238 var4 = class646.method3591(class284.field3839, class254.field3512, 0, 0);
            long var5 = method3713(0);
            class9.field103.method1984();
            class488.field6582.method609(0, class49.field656, 0);
            class9.field103.method1887(class488.field6582);
            class9.field103.method1875(var3.width / 2, var3.height / 2, 512, 512);
            class9.field103.method1986(1.0F);
            class9.field103.method1991(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class629 var7 = class9.field103.method1784(var4, 2048, 64, 64, 768);
            if (arg1 != -21664) {
                method3710(null);
            }
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class9.field103.method806(0);
                class9.field103.method821();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class108.field1302.method609((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class33.field327), 0, (var10 + 1) * class33.field327);
                        var7.method665(class108.field1302, null, 0);
                        var8++;
                        if (method3713(0) - var5 >= (long) arg2) {
                            break label45;
                        }
                    }
                }
            }
            class9.field103.method827();
            long var12 = (long) (var8 * 1000) / (method3713(0) - var5);
            class9.field103.method806(0);
            class9.field103.method821();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lku;)V")
    public static final void method3710(class123 arg0) {
        if (class334.field4895 >= 65535) {
            return;
        }
        class329 var1 = arg0.field1591;
        class660.field9370[class334.field4895] = arg0;
        class453.field6183[class334.field4895] = false;
        class334.field4895++;
        int var2 = arg0.field1590;
        if (arg0.field1594) {
            var2 = 0;
        }
        int var3 = arg0.field1590;
        if (arg0.field1582) {
            var3 = class87.field1079 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2114((byte) -122) + class49.field656 - var1.method2110(true) >> class428.field5949;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2114((byte) -110) + var1.method2110(true) - class49.field656 >> class428.field5949;
            if (var7 >= class334.field4887) {
                var7 = class334.field4887 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field1596[var5++];
                int var10 = (var1.method2112(0) + class49.field656 - var1.method2110(true) >> class428.field5949) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class149.field1872) {
                    var11 = class149.field1872 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class369.field5304[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class369.field5304[var4][var12][var8] = var13 | (long) class334.field4895;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class369.field5304[var4][var12][var8] = var13 | (long) class334.field4895 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class369.field5304[var4][var12][var8] = var13 | (long) class334.field4895 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class369.field5304[var4][var12][var8] = var13 | (long) class334.field4895 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method3711(int arg0) {
        field9508 = null;
        field9511 = null;
        if (arg0 != 16777215) {
            method3710(null);
        }
        field9510 = null;
        field9512 = null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)Z")
    public static final boolean method3712(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field9509++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)J")
    public static final synchronized long method3713(int arg0) {
        field9507++;
        if (arg0 != 0) {
            method3710(null);
        }
        long var1 = System.currentTimeMillis();
        if (class217.field2799 > var1) {
            class512.field6902 += class217.field2799 - var1;
        }
        class217.field2799 = var1;
        return class512.field6902 + var1;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static final void method3714(int arg0) {
        if (arg0 != -29745) {
            method3713(-33);
        }
        field9506++;
        if (class316.field4599 == -1) {
            return;
        }
        int var1 = class592.field8107.method268((byte) -90);
        int var2 = class592.field8107.method269((byte) -25);
        class8 var3 = (class8) class690.field9744.method374((byte) 119);
        if (var3 != null) {
            var1 = var3.method51(1);
            var2 = var3.method49((byte) -31);
        }
        class665.method3688(0, class316.field4599, var2, 0, class211.field2763, 0, class303.field4059, (byte) 114, 0, var1);
        if (class29.field285 != null) {
            class312.method1895(var1, var2, (byte) 107);
        }
    }
}
