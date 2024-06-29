import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class327 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ltm;")
    public static class412 field4754 = new class412();

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljw;")
    public static class581 field4758 = new class581(64, 4);

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "J")
    public static long field4755;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[Lvr;")
    public static class147[] field4757;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method2068(int arg0) {
        if (arg0 == -12648) {
            field4757 = null;
            field4758 = null;
            field4754 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZIII)V")
    public static final void method2069(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4756++;
        if (!arg1 && class474.field6604 == arg0 && class351.field5157 == arg2 && class610.field8296 == class387.field5634 || class712.field9959.field1320.method4251(126) == 1) {
            return;
        }
        class351.field5157 = arg2;
        class387.field5634 = class610.field8296;
        class474.field6604 = arg0;
        if (class712.field9959.field1320.method4251(17) == 1) {
            class387.field5634 = 0;
        }
        class300.method1901(arg3, 2);
        class660.method3653(class105.field1452, class379.field5542, class7.field76, true, -122, class474.field6551.method2780(121, class38.field589));
        int var5 = class121.field1765;
        int var6 = class230.field3147;
        class121.field1765 = (class474.field6604 - (class597.field8132 >> 4)) * 8;
        class230.field3147 = (class351.field5157 - (class628.field8800 >> 4)) * 8;
        class177.field2370 = class375.method2326(class474.field6604 * 8, class351.field5157 * 8);
        class217.field2906 = null;
        int var7 = class121.field1765 - var5;
        int var8 = class230.field3147 - var6;
        if (arg3 == 11) {
            for (int var9 = 0; var9 < class184.field2457; var9++) {
                class174 var10 = class495.field6850[var9];
                if (var10 != null) {
                    class192 var11 = var10.field2336;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field1890[var12] -= var7;
                        var11.field1884[var12] -= var8;
                    }
                    var11.field2259 -= var8 * 512;
                    var11.field2257 -= var7 * 512;
                }
            }
        } else {
            class688.field9678 = 0;
            boolean var13 = false;
            int var14 = (class597.field8132 - 1) * 512;
            int var15 = (class628.field8800 - 1) * 512;
            for (int var16 = 0; var16 < class184.field2457; var16++) {
                class174 var30 = class495.field6850[var16];
                if (var30 != null) {
                    class192 var31 = var30.field2336;
                    var31.field2259 -= var8 * 512;
                    var31.field2257 -= var7 * 512;
                    if (var31.field2257 >= 0 && var31.field2257 <= var14 && var31.field2259 >= 0 && var15 >= var31.field2259) {
                        boolean var32 = true;
                        for (int var33 = 0; var33 < 10; var33++) {
                            var31.field1890[var33] -= var7;
                            var31.field1884[var33] -= var8;
                            if (var31.field1890[var33] < 0 || class597.field8132 <= var31.field1890[var33] || var31.field1884[var33] < 0 || var31.field1884[var33] >= class628.field8800) {
                                var32 = false;
                            }
                        }
                        if (var32) {
                            class382.field5588[class688.field9678++] = var31.field1812;
                        } else {
                            var31.method1328(null, false);
                            var13 = true;
                            var30.method792((byte) -93);
                        }
                    } else {
                        var31.method1328(null, false);
                        var13 = true;
                        var30.method792((byte) -121);
                    }
                }
            }
            if (var13) {
                class184.field2457 = class234.field3169.method3963((byte) 120);
                class234.field3169.method3952(0, class495.field6850);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class73 var28 = class599.field8149[var17];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1890[var29] -= var7;
                    var28.field1884[var29] -= var8;
                }
                var28.field2257 -= var7 * 512;
                var28.field2259 -= var8 * 512;
            }
        }
        class553[] var18 = class581.field7771;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class553 var27 = var18[var19];
            if (var27 != null) {
                var27.field7469 -= var7 * 512;
                var27.field7464 -= var8 * 512;
            }
        }
        class139 var20 = (class139) class496.field6853.method2551((byte) -108);
        if (arg4 < 52) {
            method2069(57, true, 38, 12, -39);
        }
        while (var20 != null) {
            var20.field2033 -= var8;
            var20.field2034 -= var7;
            if (class184.field2474 != 4 && (var20.field2034 < 0 || var20.field2033 < 0 || var20.field2034 >= class597.field8132 || var20.field2033 >= class628.field8800)) {
                var20.method792((byte) -104);
            }
            var20 = (class139) class496.field6853.method2542(-103);
        }
        for (class139 var21 = (class139) class583.field7785.method2551((byte) -108); var21 != null; var21 = (class139) class583.field7785.method2542(-107)) {
            var21.field2034 -= var7;
            var21.field2033 -= var8;
            if (class184.field2474 != 4 && (var21.field2034 < 0 || var21.field2033 < 0 || class597.field8132 <= var21.field2034 || class628.field8800 <= var21.field2033)) {
                var21.method792((byte) -99);
            }
        }
        if (class184.field2474 != 4) {
            for (class193 var22 = (class193) class558.field7516.method3960(0); var22 != null; var22 = (class193) class558.field7516.method3955((byte) 60)) {
                int var23 = (int) (var22.field1409 & 0x3FFFL);
                int var24 = var23 - class121.field1765;
                int var25 = (int) (var22.field1409 >> 14 & 0x3FFFL);
                int var26 = var25 - class230.field3147;
                if (var24 < 0 || var26 < 0 || var24 >= class597.field8132 || class628.field8800 <= var26) {
                    var22.method792((byte) -122);
                }
            }
        }
        if (class779.field10689 != 0) {
            class692.field9714 -= var8;
            class779.field10689 -= var7;
        }
        class272.method1771(0);
        if (arg3 != 11) {
            class563.field7552 -= var8;
            class634.field8856 -= var7 * 512;
            class76.field1101 -= var7;
            class350.field5138 -= var8 * 512;
            class596.field8129 -= var7;
            class383.field5608 -= var8;
            if (Math.abs(var7) > class597.field8132 || Math.abs(var8) > class628.field8800) {
                class596.method3322((byte) 53);
            }
        } else if (class502.field6938 == 4) {
            class734.field10175 -= var8 * 512;
            class262.field3888 -= var7 * 512;
            class400.field5843 -= var8 * 512;
            class500.field6902 -= var7 * 512;
        } else {
            class502.field6938 = 1;
            class704.field9868 = -1;
            class518.field7072 = -1;
        }
        class686.method3810(104);
        class322.method2039(-61);
        class229.field3116.method2549(-64);
        class765.field10575.method2549(-83);
        class237.field3201.method113(0);
        class501.method2897((byte) 50);
    }
}
