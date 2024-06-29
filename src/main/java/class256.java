import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class256 {

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lr;Lfa;B)V", line = 4)
    public static final void method1708(class166 arg0, class209 arg1, byte arg2) {
        field3925++;
        if (class25.field336 == null) {
            return;
        }
        if (class658.field9235 < 10) {
            if (!class25.field333.method3001(class25.field336.field4813, false)) {
                class658.field9235 = class75.field1310.method2996(class25.field336.field4813, (byte) -80) / 10;
                return;
            }
            class492.method2855(3);
            class658.field9235 = 10;
        }
        if (class658.field9235 == 10) {
            class25.field365 = class25.field336.field4825 >> 6 << 6;
            class25.field366 = class25.field336.field4819 >> 6 << 6;
            class25.field359 = (class25.field336.field4811 >> 6 << 6) + 64 - class25.field365;
            class25.field360 = (class25.field336.field4820 >> 6 << 6) + 64 - class25.field366;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class25.field336.method2054(class648.field9106.field3019, (class648.field9106.field3024 >> 9) + class109.field1672, 0, (class648.field9106.field3029 >> 9) + class203.field2874, var3)) {
                var5 = var3[2] - class25.field366;
                var4 = var3[1] - class25.field365;
            }
            if (!class120.field1825 && var4 >= 0 && var4 < class25.field359 && var5 >= 0 && var5 < class25.field360) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                class671.field9481 = var7;
                class199.field2808 = var6;
            } else if (class120.field1824 == -1 || class491.field6980 == -1) {
                class25.field336.method2053((byte) 79, var3, class25.field336.field4814 & 0x3FFF, class25.field336.field4814 >> 14 & 0x3FFF);
                class671.field9481 = var3[2] - class25.field366;
                class199.field2808 = var3[1] - class25.field365;
            } else {
                class25.field336.method2053((byte) 79, var3, class491.field6980, class120.field1824);
                if (var3 != null) {
                    class671.field9481 = var3[2] - class25.field366;
                    class199.field2808 = var3[1] - class25.field365;
                }
                class491.field6980 = -1;
                class120.field1824 = -1;
                class120.field1825 = false;
            }
            if (class25.field336.field4816 == 37) {
                class25.field343 = 3.0F;
                class25.field341 = 3.0F;
            } else if (class25.field336.field4816 == 50) {
                class25.field343 = 4.0F;
                class25.field341 = 4.0F;
            } else if (class25.field336.field4816 == 75) {
                class25.field343 = 6.0F;
                class25.field341 = 6.0F;
            } else if (class25.field336.field4816 == 100) {
                class25.field343 = 8.0F;
                class25.field341 = 8.0F;
            } else if (class25.field336.field4816 == 200) {
                class25.field343 = 16.0F;
                class25.field341 = 16.0F;
            } else {
                class25.field343 = 8.0F;
                class25.field341 = 8.0F;
            }
            class25.field345 = (int) class25.field343 >> 1;
            class25.field347 = class483.method2814(-24169, class25.field345);
            class167.method1159((byte) -33);
            class25.method304();
            class569.field8030 = new class46();
            class25.field350 += (int) (Math.random() * 5.0D) - 2;
            if (class25.field350 < -8) {
                class25.field350 = -8;
            }
            class25.field349 += (int) (Math.random() * 5.0D) - 2;
            if (class25.field350 > 8) {
                class25.field350 = 8;
            }
            if (class25.field349 < -16) {
                class25.field349 = -16;
            }
            if (class25.field349 > 16) {
                class25.field349 = 16;
            }
            class25.method299(arg1, class25.field350 >> 2 << 10, class25.field349 >> 1);
            class25.field339.method811(1024, -90, 256);
            class25.field337.method3068(34, 256, 256);
            class25.field335.method2620(4096, 0);
            class31.field493.method588(256, -8);
            class658.field9235 = 20;
        } else if (class658.field9235 == 20) {
            class109.method857(true, true);
            class25.method291(arg0, class25.field350, class25.field349);
            class658.field9235 = 60;
            class109.method857(true, true);
            class588.method3324((byte) 118);
        } else if (class658.field9235 == 60) {
            if (class25.field333.method2992((byte) -123, class25.field336.field4813 + "_staticelements")) {
                if (!class25.field333.method3001(class25.field336.field4813 + "_staticelements", false)) {
                    return;
                }
                class25.field342 = class204.method1354(class25.field333, class25.field336.field4813 + "_staticelements", class267.field4035, -23336);
            } else {
                class25.field342 = new class585(0);
            }
            class25.method288();
            class658.field9235 = 70;
            class109.method857(true, true);
            class588.method3324((byte) 32);
        } else if (class658.field9235 == 70) {
            class218.field3055 = new class324(arg0, 11, true, class31.field486);
            class658.field9235 = 73;
            class109.method857(true, true);
            class588.method3324((byte) 65);
        } else if (class658.field9235 == 73) {
            class300.field4468 = new class324(arg0, 12, true, class31.field486);
            class658.field9235 = 76;
            class109.method857(true, true);
            class588.method3324((byte) 63);
        } else if (class658.field9235 == 76) {
            class371.field5299 = new class324(arg0, 14, true, class31.field486);
            class658.field9235 = 79;
            class109.method857(true, true);
            class588.method3324((byte) 38);
        } else if (class658.field9235 == 79) {
            class80.field1360 = new class324(arg0, 17, true, class31.field486);
            class658.field9235 = 82;
            class109.method857(true, true);
            class588.method3324((byte) 62);
        } else if (class658.field9235 == 82) {
            class652.field9167 = new class324(arg0, 19, true, class31.field486);
            class658.field9235 = 85;
            class109.method857(true, true);
            class588.method3324((byte) 113);
        } else if (class658.field9235 == 85) {
            class85.field1405 = new class324(arg0, 22, true, class31.field486);
            class658.field9235 = 88;
            class109.method857(true, true);
            class588.method3324((byte) 113);
        } else if (class658.field9235 == 88) {
            class617.field8596 = new class324(arg0, 26, true, class31.field486);
            class658.field9235 = 91;
            class109.method857(true, true);
            class588.method3324((byte) 36);
        } else {
            if (arg2 > -38) {
                field3924 = 110;
            }
            class268.field4044 = new class324(arg0, 30, true, class31.field486);
            class658.field9235 = 100;
            class109.method857(true, true);
            class588.method3324((byte) 105);
            System.gc();
        }
    }
}
