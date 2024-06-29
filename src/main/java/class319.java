import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class319 {

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Z")
    public static volatile boolean field4532 = false;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field4533 = 0;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "([SI)[S")
    public static final short[] method2064(short[] arg0, int arg1) {
        field4531++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 <= 95) {
            field4533 = -101;
        }
        short[] var2 = new short[arg0.length];
        class421.method2535(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)I")
    public static final int method2065(int arg0) {
        field4530++;
        if (class137.field1850 == 0) {
            class410.field5801.method2461(true, new class726("jaclib"));
            if (class410.field5801.method2459((byte) -100).method1777(true) != 100) {
                return 1;
            }
            if (!((class726) class410.field5801.method2459((byte) -74)).method4003(false)) {
                class723.field9821.method4216(32387);
            }
            class137.field1850 = 1;
        }
        if (class137.field1850 == 1) {
            class304.field4336 = class410.method2464(1);
            class410.field5800.method2461(true, new class264(class382.field5556));
            class410.field5802.method2461(true, new class726("jaggl"));
            class410.field5803.method2461(true, new class726("jagdx"));
            class410.field5804.method2461(true, new class726("jagmisc"));
            class410.field5805.method2461(true, new class726("sw3d"));
            class410.field5806.method2461(true, new class726("hw3d"));
            class410.field5807.method2461(true, new class726("jagtheora"));
            class410.field5808.method2461(true, new class264(class270.field3942));
            class410.field5809.method2461(true, new class264(class737.field10006));
            class410.field5810.method2461(true, new class264(class677.field9085));
            class410.field5811.method2461(true, new class264(class415.field5995));
            class410.field5812.method2461(true, new class264(class187.field2451));
            class410.field5813.method2461(true, new class264(class204.field2634));
            class410.field5814.method2461(true, new class264(class16.field162));
            class410.field5815.method2461(true, new class264(class755.field10224));
            class410.field5816.method2461(true, new class264(class291.field4154));
            class410.field5817.method2461(true, new class264(class623.field8412));
            class410.field5818.method2461(true, new class264(class304.field4329));
            class410.field5819.method2461(true, new class264(class73.field992));
            class410.field5820.method2461(true, new class264(class384.field5579));
            class410.field5821.method2461(true, new class264(class677.field9086));
            class410.field5822.method2461(true, new class550(class333.field4720, "huffman"));
            class410.field5823.method2461(true, new class264(class548.field7565));
            class410.field5824.method2461(true, new class264(class235.field3135));
            class410.field5825.method2461(true, new class264(class410.field5827));
            class410.field5826.method2461(true, new class545(class627.field8494, "details"));
            for (int var1 = 0; var1 < class304.field4336.length; var1++) {
                if (class304.field4336[var1].method2459((byte) -68) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class410[] var3 = class304.field4336;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class410 var5 = var3[var4];
                int var6 = var5.method2460(-22959);
                int var7 = var5.method2459((byte) -89).method1777(true);
                var2 += var6 * var7 / 100;
            }
            class137.field1850 = 2;
            class122.field1681 = var2;
        }
        if (class304.field4336 == null) {
            return 100;
        }
        if (arg0 < 57) {
            method2065(17);
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class410[] var11 = class304.field4336;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class410 var16 = var11[var12];
            int var17 = var16.method2460(-22959);
            int var18 = var16.method2459((byte) -71).method1777(true);
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class726) class410.field5804.method2459((byte) -69)).method4003(false)) {
                class723.field9821.method4222(124);
            }
            if (!((class726) class410.field5807.method2459((byte) -114)).method4003(false)) {
                class350.field5102 = class723.field9821.method4224((byte) 127);
            }
            class304.field4336 = null;
        }
        int var13 = var9 - class122.field1681;
        int var14 = var8 - class122.field1681;
        int var15 = var14 > 0 ? var13 * 100 / var14 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2066(int arg0, byte arg1, int arg2) {
        field4534++;
        return arg1 <= 68 ? false : false;
    }
}
