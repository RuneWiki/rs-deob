import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class153 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1999 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZZII)V")
    public static final void method831(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field2000++;
        if (class134.method708(-115, arg3)) {
            class374.method2288(-1, arg2, arg4, class508.field7087[arg3], arg0, 0);
            if (arg1) {
                field1999 = -63;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static final void method832(int arg0) {
        int var1 = 120 / ((-arg0 - 10) / 46);
        class200.method1279();
        field2001++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lqa;ILn;)V")
    public static final void method833(class167 arg0, int arg1, class473 arg2) {
        field1998++;
        if (class614.field8826 == null) {
            return;
        }
        if (class345.field4777 < 10) {
            if (!class614.field8827.method2072(class614.field8826.field3440, false)) {
                class345.field4777 = class154.field2007.method2044(class614.field8826.field3440, true) / 10;
                return;
            }
            class541.method3005(33);
            class345.field4777 = 10;
        }
        if (class345.field4777 == 10) {
            class614.field8848 = class614.field8826.field3430 >> 6 << 6;
            class614.field8850 = class614.field8826.field3434 >> 6 << 6;
            class614.field8856 = (class614.field8826.field3425 >> 6 << 6) + 64 - class614.field8850;
            class614.field8851 = (class614.field8826.field3441 >> 6 << 6) + 64 - class614.field8848;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class614.field8826.method1654((class147.field1899.field6368 >> 9) + class58.field786, var3, arg1 ^ 0xFFFFFFF6, (class147.field1899.field6362 >> 9) + class525.field7310, class147.field1899.field6358)) {
                var4 = var3[1] - class614.field8850;
                var5 = var3[2] - class614.field8848;
            }
            if (!class173.field2242 && var4 >= 0 && var4 < class614.field8856 && var5 >= 0 && class614.field8851 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class80.field1091 = var6;
                class2.field20 = var7;
            } else if (class231.field2949 == -1 || class194.field2523 == -1) {
                class614.field8826.method1653(var3, (class614.field8826.field3438 & 0xFFFE421) >> 14, class614.field8826.field3438 & 0x3FFF, (byte) -48);
                class80.field1091 = var3[1] - class614.field8850;
                class2.field20 = var3[2] - class614.field8848;
            } else {
                class614.field8826.method1653(var3, class231.field2949, class194.field2523, (byte) -35);
                class194.field2523 = -1;
                class231.field2949 = -1;
                if (var3 != null) {
                    class2.field20 = var3[2] - class614.field8848;
                    class80.field1091 = var3[1] - class614.field8850;
                }
                class173.field2242 = false;
            }
            if (class614.field8826.field3427 == 37) {
                class614.field8831 = 3.0F;
                class614.field8837 = 3.0F;
            } else if (class614.field8826.field3427 == 50) {
                class614.field8831 = 4.0F;
                class614.field8837 = 4.0F;
            } else if (class614.field8826.field3427 == 75) {
                class614.field8831 = 6.0F;
                class614.field8837 = 6.0F;
            } else if (class614.field8826.field3427 == 100) {
                class614.field8831 = 8.0F;
                class614.field8837 = 8.0F;
            } else if (class614.field8826.field3427 == 200) {
                class614.field8831 = 16.0F;
                class614.field8837 = 16.0F;
            } else {
                class614.field8831 = 8.0F;
                class614.field8837 = 8.0F;
            }
            class614.field8839 = (int) class614.field8831 >> 1;
            class614.field8838 = class338.method2137(class614.field8839, 1649632961);
            class168.method1000((byte) -27);
            class614.method3521();
            class612.field8795 = new class568();
            class614.field8835 += (int) (Math.random() * 5.0D) - 2;
            if (class614.field8835 < -8) {
                class614.field8835 = -8;
            }
            if (class614.field8835 > 8) {
                class614.field8835 = 8;
            }
            class614.field8830 += (int) (Math.random() * 5.0D) - 2;
            if (class614.field8830 < -16) {
                class614.field8830 = -16;
            }
            if (class614.field8830 > 16) {
                class614.field8830 = 16;
            }
            class614.method3513(arg2, class614.field8835 >> 2 << 10, class614.field8830 >> 1);
            class614.field8823.method1542(256, false, 1024);
            class614.field8824.method2480(arg1 - 19224, 256, 256);
            class614.field8825.method1092(-41, 4096);
            class643.field9328.method1291(256, 1344661505);
            class345.field4777 = 20;
        } else if (class345.field4777 == 20) {
            class451.method2627((byte) 120, true);
            class614.method3508(arg0, class614.field8835, class614.field8830);
            class345.field4777 = 60;
            class451.method2627((byte) 120, true);
            class49.method266(arg1 - 86);
        } else if (class345.field4777 == 60) {
            if (class614.field8827.method2065((byte) -65, class614.field8826.field3440 + "_staticelements")) {
                if (!class614.field8827.method2072(class614.field8826.field3440 + "_staticelements", false)) {
                    return;
                }
                class614.field8832 = class123.method664(class502.field6984, (byte) 63, class614.field8827, class614.field8826.field3440 + "_staticelements");
            } else {
                class614.field8832 = new class106(0);
            }
            class614.method3522();
            class345.field4777 = 70;
            class451.method2627((byte) 120, true);
            class49.method266(-1);
        } else if (class345.field4777 == 70) {
            class212.field2731 = new class346(arg0, 11, true, class141.field1806);
            class345.field4777 = 73;
            class451.method2627((byte) 120, true);
            class49.method266(-1);
        } else if (class345.field4777 == 73) {
            class525.field7308 = new class346(arg0, 12, true, class141.field1806);
            class345.field4777 = 76;
            class451.method2627((byte) 120, true);
            class49.method266(arg1 - 86);
        } else if (class345.field4777 == 76) {
            class342.field4757 = new class346(arg0, 14, true, class141.field1806);
            class345.field4777 = 79;
            class451.method2627((byte) 120, true);
            class49.method266(-1);
        } else if (class345.field4777 == 79) {
            class630.field9183 = new class346(arg0, 17, true, class141.field1806);
            class345.field4777 = 82;
            class451.method2627((byte) 120, true);
            class49.method266(-1);
        } else if (class345.field4777 == 82) {
            class536.field7473 = new class346(arg0, 19, true, class141.field1806);
            class345.field4777 = 85;
            class451.method2627((byte) 120, true);
            class49.method266(-1);
        } else if (class345.field4777 == arg1) {
            class211.field2725 = new class346(arg0, 22, true, class141.field1806);
            class345.field4777 = 88;
            class451.method2627((byte) 120, true);
            class49.method266(arg1 ^ 0xFFFFFFAA);
        } else if (class345.field4777 == 88) {
            class321.field4440 = new class346(arg0, 26, true, class141.field1806);
            class345.field4777 = 91;
            class451.method2627((byte) 120, true);
            class49.method266(arg1 ^ 0xFFFFFFAA);
        } else {
            class58.field784 = new class346(arg0, 30, true, class141.field1806);
            class345.field4777 = 100;
            class451.method2627((byte) 120, true);
            class49.method266(arg1 ^ 0xFFFFFFAA);
            System.gc();
        }
    }
}
