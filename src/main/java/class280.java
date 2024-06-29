import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class280 {

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
    public static int[] field4288 = new int[5];

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Lpf;")
    public static class425 field4287 = new class425(70, 7);

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Loa;")
    public static class149 field4291 = new class149(64);

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Liq;")
    public static class134 field4290;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Liq;")
    public static class134 field4294;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[I")
    public static int[] field4293;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1727(int arg0, byte[] arg1) {
        field4286++;
        class385 var2 = new class385(arg1);
        int var3 = var2.method2343(arg0 ^ 0xF6);
        int var4 = var2.method2354(255);
        if (arg0 != 9) {
            method1729(-93, (class261) null, (class96) null);
        }
        if (var4 < 0 || class170.field2627 != 0 && class170.field2627 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method2356((byte) -23, var7, var4, 0);
            return var7;
        } else {
            int var5 = var2.method2354(255);
            if (var5 < 0 || !(class170.field2627 == 0 || var5 <= class170.field2627)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class392.method2419(var6, var5, arg1, var4, 9);
            } else {
                class110.field1454.method1942(112, var2, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method1728(int arg0) {
        field4287 = null;
        field4288 = null;
        field4294 = null;
        field4290 = null;
        if (arg0 != -6788) {
            method1728(-63);
        }
        field4293 = null;
        field4291 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILdr;Lec;)V")
    public static final void method1729(int arg0, class261 arg1, class96 arg2) {
        field4289++;
        if (class223.field3379 == null) {
            return;
        }
        if (class425.field6248 < 10) {
            if (!class223.field3378.method820(0, class223.field3379.field5106)) {
                class425.field6248 = class135.field1786.method810(class223.field3379.field5106, (byte) -90) / 10;
                return;
            }
            class105.method659(71);
            class425.field6248 = 10;
        }
        if (class425.field6248 == 10) {
            class223.field3394 = class223.field3379.field5092 >> 6 << 6;
            class223.field3405 = class223.field3379.field5102 >> 6 << 6;
            class223.field3403 = (class223.field3379.field5101 >> 6 << 6) + 64 - class223.field3405;
            class223.field3402 = (class223.field3379.field5112 >> 6 << 6) + 64 - class223.field3394;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class223.field3379.method2084(class113.field1500.field1902, (byte) -114, (class113.field1500.field1892 >> 7) + class112.field1487, (class113.field1500.field1900 >> 7) + class17.field250, var3)) {
                var4 = var3[1] - class223.field3394;
                var5 = var3[2] - class223.field3405;
            }
            if (!class154.field2109 && var4 >= 0 && class223.field3402 > var4 && var5 >= 0 && class223.field3403 > var5) {
                int var6 = var4 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class217.field3305 = var7;
                class295.field4480 = var6;
            } else if (class95.field1325 == -1 || class54.field731 == -1) {
                class223.field3379.method2079(class223.field3379.field5099 & 0x3FFF, (byte) 118, (class223.field3379.field5099 & 0xFFFC318) >> 14, var3);
                class217.field3305 = var3[2] - class223.field3405;
                class295.field4480 = var3[1] - class223.field3394;
            } else {
                class223.field3379.method2079(class54.field731, (byte) 93, class95.field1325, var3);
                class154.field2109 = false;
                class54.field731 = -1;
                class95.field1325 = -1;
                if (var3 != null) {
                    class217.field3305 = var3[2] - class223.field3405;
                    class295.field4480 = var3[1] - class223.field3394;
                }
            }
            if (class223.field3379.field5097 == 37) {
                class223.field3388 = 3.0F;
                class223.field3385 = 3.0F;
            } else if (class223.field3379.field5097 == 50) {
                class223.field3388 = 4.0F;
                class223.field3385 = 4.0F;
            } else if (class223.field3379.field5097 == 75) {
                class223.field3388 = 6.0F;
                class223.field3385 = 6.0F;
            } else if (class223.field3379.field5097 == 100) {
                class223.field3388 = 8.0F;
                class223.field3385 = 8.0F;
            } else if (class223.field3379.field5097 == 200) {
                class223.field3388 = 16.0F;
                class223.field3385 = 16.0F;
            } else {
                class223.field3388 = 8.0F;
                class223.field3385 = 8.0F;
            }
            class223.field3387 = (int) class223.field3388 >> 1;
            class223.field3384 = class388.method2396(true, class223.field3387);
            class353.method2116(false);
            class223.method1357();
            class298.field4502 = new class398();
            class223.field3390 += (int) (Math.random() * 5.0D) - 2;
            if (class223.field3390 < -8) {
                class223.field3390 = -8;
            }
            class223.field3381 += (int) (Math.random() * 5.0D) - 2;
            if (class223.field3390 > 8) {
                class223.field3390 = 8;
            }
            if (class223.field3381 < -16) {
                class223.field3381 = -16;
            }
            if (class223.field3381 > 16) {
                class223.field3381 = 16;
            }
            class223.method1356(arg2, class223.field3390 >> 2 << 10, class223.field3381 >> 1);
            class238.method1432(256, -1, 1024);
            class37.method213(256, 256, -120);
            class304.method1869(false, 4096);
            class410.method2574(256, -59);
            class425.field6248 = 20;
        } else if (class425.field6248 == 20) {
            class14.method82(50, true);
            class223.method1346(arg1, class223.field3390, class223.field3381);
            class425.field6248 = 60;
            class14.method82(50, true);
            class341.method2078(0);
        } else if (class425.field6248 == 60) {
            if (class223.field3378.method815((byte) -86, class223.field3379.field5106 + "_staticelements")) {
                if (!class223.field3378.method820(0, class223.field3379.field5106 + "_staticelements")) {
                    return;
                }
                class223.field3382 = class112.method683((byte) 120, class66.field859, class223.field3379.field5106 + "_staticelements", class223.field3378);
            } else {
                class223.field3382 = new class378(0);
            }
            class223.method1351();
            class425.field6248 = 70;
            class14.method82(50, true);
            class341.method2078(0);
        } else if (class425.field6248 == 70) {
            class103.field1402 = new class290(arg1, 11, true, class170.field2631);
            class425.field6248 = 73;
            class14.method82(50, true);
            class341.method2078(0);
        } else if (class425.field6248 == 73) {
            class227.field3432 = new class290(arg1, 12, true, class170.field2631);
            class425.field6248 = 76;
            class14.method82(50, true);
            class341.method2078(0);
        } else if (class425.field6248 == 76) {
            class167.field2393 = new class290(arg1, 14, true, class170.field2631);
            class425.field6248 = 79;
            class14.method82(50, true);
            class341.method2078(0);
        } else if (class425.field6248 == 79) {
            class416.field6179 = new class290(arg1, 17, true, class170.field2631);
            class425.field6248 = 82;
            class14.method82(50, true);
            class341.method2078(0);
        } else if (class425.field6248 == 82) {
            class177.field2684 = new class290(arg1, 19, true, class170.field2631);
            class425.field6248 = 85;
            class14.method82(50, true);
            class341.method2078(0);
        } else {
            int var8 = 11 % ((-arg0 - 35) / 48);
            if (class425.field6248 == 85) {
                class146.field2028 = new class290(arg1, 22, true, class170.field2631);
                class425.field6248 = 88;
                class14.method82(50, true);
                class341.method2078(0);
            } else if (class425.field6248 == 88) {
                class347.field5189 = new class290(arg1, 26, true, class170.field2631);
                class425.field6248 = 91;
                class14.method82(50, true);
                class341.method2078(0);
            } else {
                class82.field1105 = new class290(arg1, 30, true, class170.field2631);
                class425.field6248 = 100;
                class14.method82(50, true);
                class341.method2078(0);
                System.gc();
            }
        }
    }
}
