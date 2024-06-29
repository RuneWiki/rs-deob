import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class335 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4569 = null;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field4570 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lwo;")
    public static class285 field4572;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILuo;Lgd;I)V", line = 5)
    public static final void method2147(int arg0, int arg1, int arg2, int arg3, class118 arg4, class172 arg5, int arg6) {
        if (class342.field4655 < 100) {
            class395.method2449(arg5, arg4, (byte) 127);
        }
        field4568++;
        arg4.method774(arg1, arg2, arg1 + arg6, arg0 + arg2);
        if (class342.field4655 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg1;
            arg4.method789(arg1, arg2, arg6, arg0, -16777216, 0);
            int var9 = arg2 + (arg0 / 2) - var7 - 18;
            arg4.method748(var8 - 152, var9, 304, 34, class87.field1006[class283.field3692].getRGB(), 0);
            arg4.method789(var8 - 150, var9 + 2, class342.field4655 * 3, 30, class295.field3898[class283.field3692].getRGB(), 0);
            class210.field2544.method204(-1, var8, class131.field1476[class283.field3692].getRGB(), var7 + var9, false, class87.field1009.method434(class373.field5057, -8192));
            return;
        }
        int var10 = class54.field633 - ((int) ((float) arg6 / class224.field2811));
        int var11 = (int) ((float) arg0 / class224.field2811) + class394.field5366;
        int var12 = class54.field633 + ((int) ((float) arg6 / class224.field2811));
        class57.field658 = (int) ((float) (arg0 * 2) / class224.field2811);
        class296.field3948 = (int) ((float) (arg6 * 2) / class224.field2811);
        class287.field3782 = class394.field5366 - (int) ((float) arg0 / class224.field2811);
        class221.field2734 = class54.field633 - (int) ((float) arg6 / class224.field2811);
        int var13 = class394.field5366 - ((int) ((float) arg0 / class224.field2811));
        class224.method1375(class224.field2825 + var10, var11 - -class224.field2815, class224.field2825 + var12, class224.field2815 + var13, arg1, arg2, arg1 + arg6, arg2 - -1 + arg0);
        class224.method1362(arg4);
        class270 var14 = class224.method1374(arg4);
        class190.method1178(var14, 0, arg4, arg3, false);
        if (class76.field943 > 0) {
            class390.field5325--;
            if (class390.field5325 == 0) {
                class390.field5325 = 20;
                class76.field943--;
            }
        }
        if (!class139.field1615) {
            return;
        }
        int var15 = arg6 + arg1 - 5;
        int var16 = arg2 + arg0 - 8;
        class55.field636.method208(var15, (byte) 108, var16, "Fps:" + field4570, -1, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class55.field636.method208(var15, (byte) 118, var20, "Mem:" + var18 + "k", -1, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 86)
    public static void method2148(byte arg0) {
        field4569 = null;
        if (arg0 != -56) {
            method2150(51, (int[]) null, (int[]) null, (class131) null, (int[]) null);
        }
        field4572 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Lhm;", line = 104)
    public static final class330 method2149(byte arg0) {
        field4567++;
        try {
            return new class445();
        } catch (Throwable var2) {
            try {
                return (class330) Class.forName("f").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return arg0 == -57 ? new class317() : null;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[I[ILbe;[I)V", line = 129)
    public static final void method2150(int arg0, int[] arg1, int[] arg2, class131 arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && arg3.field2435.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field2435[var9] = null;
                    } else {
                        class156 var10 = class430.method2621((byte) -113, var6);
                        int var11 = var10.field1804;
                        class265 var12 = arg3.field2435[var9];
                        if (var12 != null) {
                            if (var12.field3407 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field2435[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3409 = 1;
                                    var12.field3411 = 0;
                                    var12.field3415 = var8;
                                    var12.field3413 = 0;
                                    var12.field3412 = 0;
                                    class325.method2038(arg3.field1516, arg3.field1514, class143.field1684 == arg3, var10, 0, (byte) -100);
                                } else if (var11 == 2) {
                                    var12.field3413 = 0;
                                }
                            } else if (var10.field1827 >= class430.method2621((byte) -79, var12.field3407).field1827) {
                                var12 = arg3.field2435[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class265 var13 = arg3.field2435[var9] = new class265();
                            var13.field3411 = 0;
                            var13.field3412 = 0;
                            var13.field3407 = var6;
                            var13.field3415 = var8;
                            var13.field3413 = 0;
                            var13.field3409 = 1;
                            class325.method2038(arg3.field1516, arg3.field1514, class143.field1684 == arg3, var10, 0, (byte) -100);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg0 != 1) {
            method2149((byte) -1);
        }
        field4566++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 230)
    public static final void method2151(int arg0) {
        if (class181.field2107 != null) {
            class181.field2107.method2465((byte) -85);
            class181.field2107 = null;
        }
        field4571++;
        class290.method1846(-127);
        class431.method2627();
        for (int var1 = 0; var1 < 4; var1++) {
            class156.field1815[var1].method2313(-78);
        }
        class102.method615(-100, false);
        System.gc();
        class293.method1873(1, 2);
        class346.field4702 = -1;
        class344.field4679 = false;
        class298.method1894(6865, true);
        class278.field3608 = 0;
        class108.field1296 = 0;
        class383.field5241 = false;
        if (arg0 < 54) {
            return;
        }
        class234.field3069 = 0;
        class129.field1432 = 0;
        for (int var2 = 0; var2 < class307.field4159.length; var2++) {
            class307.field4159[var2] = null;
        }
        class450.field6291 = 0;
        class106.field1263 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class212.field2584[var3] = null;
            class299.field3998[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class220.field2726[var4] = null;
        }
        class76.field939.method2216((byte) -115);
        class250.method1625(125);
        class219.field2703 = 0;
        class5.method20((byte) 125);
        class141.method902((byte) 0);
        class72.method430((byte) -82);
        class169.method1074(true, -87);
        try {
            class443.method2743(class401.field5525.field6077, -24425, "loggedout");
        } catch (Throwable var5) {
        }
    }
}
