import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class469 {

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field6568 = 0;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[I")
    public static int[] field6565 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 8)
    public static final String method2669(int arg0, String arg1) {
        field6564++;
        String var2 = class456.method2628(37, class482.method2727(12544, arg1));
        if (arg0 != 0) {
            field6565 = null;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)Z", line = 25)
    public static final boolean method2670(int arg0, byte arg1, int arg2) {
        field6567++;
        if (arg1 >= -62) {
            return true;
        } else {
            return (arg2 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 43)
    public static void method2671(int arg0) {
        if (arg0 == -748) {
            field6565 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZIII)V", line = 59)
    public static final void method2672(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6566++;
        if (!arg1 && class357.field5117 == arg3 && class326.field4813 == arg0 && class233.field3305 == class122.field1683 || class274.field3872.method2433(0, class429.field6020)) {
            return;
        }
        class357.field5117 = arg3;
        class326.field4813 = arg0;
        class122.field1683 = class233.field3305;
        if (class274.field3872.method2433(0, class429.field6020)) {
            class122.field1683 = 0;
        }
        class94.method690(arg4, (byte) 125);
        class364.method2133(class9.field99.method42(class666.field9377, arg2 ^ 0x4C75), 0, class668.field9418, true);
        int var5 = class511.field6989;
        class511.field6989 = (class357.field5117 - (class86.field1185 >> 4)) * 8;
        int var6 = class124.field1726;
        class124.field1726 = (class326.field4813 - (class526.field7212 >> 4)) * 8;
        class466.field6555 = class148.method1027(class357.field5117 * 8, class326.field4813 * 8);
        class663.field9360 = null;
        int var7 = class511.field6989 - var5;
        if (arg2 != 1) {
            field6568 = -120;
        }
        int var8 = class124.field1726 - var6;
        if (arg4 == 11) {
            for (int var17 = 0; var17 < class679.field9578; var17++) {
                class178 var30 = class252.field3537[var17];
                if (var30 != null) {
                    class225 var31 = var30.field2634;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field6483[var32] -= var7;
                        var31.field6477[var32] -= var8;
                    }
                    var31.field514 -= var8 * 512;
                    var31.field509 -= var7 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class602.field8365 = 0;
            int var10 = class86.field1185 * 512 - 512;
            int var11 = (class526.field7212 - 1) * 512;
            for (int var12 = 0; var12 < class679.field9578; var12++) {
                class178 var13 = class252.field3537[var12];
                if (var13 != null) {
                    class225 var14 = var13.field2634;
                    var14.field514 -= var8 * 512;
                    var14.field509 -= var7 * 512;
                    if (var14.field509 >= 0 && var14.field509 <= var10 && var14.field514 >= 0 && var14.field514 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field6483[var16] -= var7;
                            var14.field6477[var16] -= var8;
                            if (var14.field6483[var16] < 0 || class86.field1185 <= var14.field6483[var16] || var14.field6477[var16] < 0 || class526.field7212 <= var14.field6477[var16]) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class594.field8262[class602.field8365++] = var14.field6388;
                        } else {
                            var14.method1443(0, null);
                            var9 = true;
                            var13.method2971(1);
                        }
                    } else {
                        var14.method1443(0, null);
                        var9 = true;
                        var13.method2971(1);
                    }
                }
            }
            if (var9) {
                class679.field9578 = class323.field4762.method2057(0);
                class323.field4762.method2059((byte) -88, class252.field3537);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class286 var28 = class495.field6821[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field6483[var29] -= var7;
                    var28.field6477[var29] -= var8;
                }
                var28.field509 -= var7 * 512;
                var28.field514 -= var8 * 512;
            }
        }
        class375[] var19 = class652.field9219;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class375 var27 = var19[var20];
            if (var27 != null) {
                var27.field5310 -= var8 * 512;
                var27.field5322 -= var7 * 512;
            }
        }
        for (class81 var21 = (class81) class138.field1938.method1270((byte) -25); var21 != null; var21 = (class81) class138.field1938.method1282(0)) {
            var21.field1121 -= var7;
            var21.field1127 -= var8;
            if (class161.field2465 != 4 && (var21.field1121 < 0 || var21.field1127 < 0 || class86.field1185 <= var21.field1121 || var21.field1127 >= class526.field7212)) {
                var21.method2971(1);
            }
        }
        if (class161.field2465 != 4) {
            for (class435 var22 = (class435) class179.field2656.method2066(false); var22 != null; var22 = (class435) class179.field2656.method2062(arg2 - 19705)) {
                int var23 = (int) (var22.field7311 & 0x3FFFL);
                int var24 = var23 - class511.field6989;
                int var25 = (int) (var22.field7311 >> 14 & 0x3FFFL);
                int var26 = var25 - class124.field1726;
                if (var24 < 0 || var26 < 0 || var24 >= class86.field1185 || var26 >= class526.field7212) {
                    var22.method2971(1);
                }
            }
        }
        if (class247.field3508 != 0) {
            class178.field2636 -= var8;
            class247.field3508 -= var7;
        }
        class648.method3607((byte) -37);
        if (arg4 != 11) {
            class117.field1563 -= var8 * 512;
            class528.field7231 -= var8;
            class663.field9356 -= var7;
            class172.field2572 -= var7 * 512;
            class407.field5738 -= var7;
            class576.field7741 -= var8;
            if (Math.abs(var7) > class86.field1185 || Math.abs(var8) > class526.field7212) {
                class353.method2098((byte) -101);
            }
        } else if (class670.field9445 == 4) {
            class30.field363 -= var8 * 512;
            class264.field3734 -= var7 * 512;
            class652.field9218 -= var8 * 512;
            class581.field8108 -= var7 * 512;
        } else {
            class670.field9445 = 1;
        }
        class535.method2960((byte) -118);
        class690.method3799(20445);
        class83.field1161.method1269((byte) 97);
        class364.field5199.method1269((byte) 120);
        class179.field2655.method3683(14962);
        class575.method3158((byte) -82);
    }
}
