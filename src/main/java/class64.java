import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class64 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "[[Z")
    public static boolean[][] field1307 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "Lph;")
    public static class459 field1311;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1308++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class73.method640(class43.field600, (byte) -98, class467.field6940, arg0 + arg2);
        int var10 = class73.method640(class43.field600, (byte) -66, class467.field6940, arg2 - arg0);
        class503.method3027(var10, (byte) 127, var9, arg3, class316.field4797[arg1]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class372.field5455 && class216.field3415 >= var11) {
                    int var13 = class73.method640(class43.field600, (byte) -82, class467.field6940, arg2 + var5);
                    int var14 = class73.method640(class43.field600, (byte) -91, class467.field6940, arg2 - var5);
                    if (class216.field3415 >= var12) {
                        class503.method3027(var14, (byte) 127, var13, arg3, class316.field4797[var12]);
                    }
                    if (class372.field5455 <= var11) {
                        class503.method3027(var14, (byte) 127, var13, arg3, class316.field4797[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class372.field5455 && var15 <= class216.field3415) {
                int var17 = class73.method640(class43.field600, (byte) -83, class467.field6940, arg2 + var6);
                int var18 = class73.method640(class43.field600, (byte) -124, class467.field6940, arg2 - var6);
                if (class216.field3415 >= var16) {
                    class503.method3027(var18, (byte) 127, var17, arg3, class316.field4797[var16]);
                }
                if (var15 >= class372.field5455) {
                    class503.method3027(var18, (byte) 127, var17, arg3, class316.field4797[var15]);
                }
            }
        }
        if (arg4 != 576) {
            field1307 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILjava/lang/String;)V", line = 79)
    public static final void method568(int arg0, String arg1) {
        field1306++;
        if (!class233.field3597) {
            return;
        }
        boolean var2 = false;
        int var3 = class229.field3560;
        int[] var4 = class316.field4782;
        for (int var5 = arg0; var5 < var3; var5++) {
            class366 var6 = class73.field1444[var4[var5]];
            if (var6 != null && class15.field266 != var6 && var6.field5381 != null && var6.field5381.equalsIgnoreCase(arg1)) {
                class473.field7002++;
                class459.method2765(class140.field2331, (byte) 87);
                class335.field5062.method1862((byte) -115, class506.field7383);
                class335.field5062.method1830((byte) -106, 0);
                class335.field5062.method1861(false, class160.field2579);
                class335.field5062.method1853(var4[var5], 14);
                class335.field5062.method1853(class341.field5130, arg0 + 20);
                var2 = true;
                class377.method2317(-1, 0, var6.field7870[0], true, var6.method2241(-15), var6.field7866[0], -2, var6.method2241(-107), 0);
                break;
            }
        }
        if (!var2) {
            class475.method2843((byte) -98, class456.field6770.method1977(class146.field2452, 66) + arg1);
        }
        if (class233.field3597) {
            class320.method2056(-92);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V", line = 128)
    public static final void method569(byte arg0) {
        field1309++;
        if (arg0 != -96) {
            method568(-92, null);
        }
        class419.field6312 = 0;
        class127.field2172 = -1;
        class205.field3284 = -1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZB)V", line = 148)
    public static final void method570(boolean arg0, byte arg1) {
        while (true) {
            if (class219.field3446.method262(class234.field3606, 30881) >= 15) {
                int var2 = class219.field3446.method261(15, 0);
                if (var2 != 32767) {
                    boolean var3 = false;
                    class435 var4 = (class435) class209.field3337.method1622((long) var2, -127);
                    if (var4 == null) {
                        class163 var5 = new class163();
                        var5.field7789 = var2;
                        var4 = new class435(var5);
                        class209.field3337.method1618(var4, (long) var2, -1);
                        class525.field7636[class334.field5054++] = var4;
                        var3 = true;
                    }
                    class163 var6 = var4.field6471;
                    class515.field7477[class341.field5128++] = var2;
                    var6.field7796 = class62.field1268;
                    if (var6.field2613 != null && var6.field2613.method482(48)) {
                        class432.method2593(var6, (byte) 65);
                    }
                    int var7 = class219.field3446.method261(3, 0) + 4 << 11 & 0x3EE3;
                    var6.method1159(arg1 ^ 0xFFFFFFB3, class102.field1942.method847(class219.field3446.method261(14, 0), 0));
                    int var8 = class219.field3446.method261(1, arg1 + 77);
                    if (var8 == 1) {
                        class403.field6093[class238.field3675++] = var2;
                    }
                    int var9;
                    if (arg0) {
                        var9 = class219.field3446.method261(8, 0);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = class219.field3446.method261(5, 0);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    int var10 = class219.field3446.method261(1, 0);
                    int var11 = class219.field3446.method261(2, 0);
                    int var12;
                    if (arg0) {
                        var12 = class219.field3446.method261(8, arg1 ^ 0xFFFFFFB3);
                        if (var12 > 127) {
                            var12 -= 256;
                        }
                    } else {
                        var12 = class219.field3446.method261(5, 0);
                        if (var12 > 15) {
                            var12 -= 32;
                        }
                    }
                    var6.method3164(var6.field2613.field1050, -1);
                    var6.field7778 = var6.field2613.field1065 << 3;
                    if (var3) {
                        var6.method3156(true, 120, var7);
                    }
                    var6.method1153(var10 == 1, (byte) 41, class15.field266.field7866[0] + var9, var6.method2241(-62), class15.field266.field7870[0] + var12, var11);
                    if (var6.field2613.method482(55)) {
                        class504.method3028(var6.field7870[0], (byte) 86, null, null, var6.field7866[0], 0, var6.field6084, var6);
                    }
                    continue;
                }
            }
            field1310++;
            if (arg1 != -77) {
                field1307 = null;
            }
            class219.field3446.method264(arg1 + 100);
            return;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 254)
    public static void method571(int arg0) {
        field1307 = null;
        if (arg0 != -1) {
            method567(26, -86, -53, -46, 53);
        }
        field1311 = null;
    }
}
