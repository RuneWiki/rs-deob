import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class645 extends class122 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Ldg;")
    public static class376 field9060 = new class376(46, 1);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/lang/String;")
    public static String field9063 = "";

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 3)
    public static void method3581(int arg0) {
        if (arg0 != -1) {
            field9060 = null;
        }
        field9063 = null;
        field9060 = null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 17)
    public static final void method3582(int arg0) {
        field9059++;
        for (int var1 = 0; var1 < class8.field83; var1++) {
            class603 var4 = class106.field1642[var1];
            boolean var5 = false;
            if (var4.field8519 == null) {
                var4.field8520--;
                if (var4.field8520 < (var4.method3400(985960808) ? -1500 : -10)) {
                    var5 = true;
                } else {
                    if (var4.field8517 == 1 && var4.field8522 == null) {
                        var4.field8522 = class468.method2764(class199.field2813, var4.field8524, 0);
                        if (var4.field8522 == null) {
                            continue;
                        }
                        var4.field8520 += var4.field8522.method2765();
                    } else if (var4.method3400(985960808) && (var4.field8512 == null || var4.field8516 == null)) {
                        if (var4.field8512 == null) {
                            var4.field8512 = class359.method2189(class424.field6162, var4.field8524);
                        }
                        if (var4.field8512 == null) {
                            continue;
                        }
                        if (var4.field8516 == null) {
                            var4.field8516 = var4.field8512.method2188(new int[] { 22050 });
                            if (var4.field8516 == null) {
                                continue;
                            }
                        }
                    }
                    if (var4.field8520 < 0) {
                        int var6;
                        if (var4.field8515 == 0) {
                            var6 = (var4.field8517 == 3 ? class287.field4270.field3691 : class287.field4270.field3697) * var4.field8527 >> 8;
                        } else {
                            int var7 = var4.field8515 >> 24 & 0x3;
                            if (class648.field9106.field3019 == var7) {
                                int var8 = var4.field8515 & 0xFF << 9;
                                int var9 = var4.field8515 >> 16 & 0xFF;
                                int var10 = (var9 << 9) - (class648.field9106.field3024 - 256);
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var4.field8515 >> 8 & 0xFF;
                                int var12 = (var11 << 9) + 256 - class648.field9106.field3029;
                                if (var12 < 0) {
                                    var12 = -var12;
                                }
                                int var13 = var10 + var12 - 512;
                                if (var13 > var8) {
                                    var4.field8520 = -99999;
                                    continue;
                                }
                                if (var13 < 0) {
                                    var13 = 0;
                                }
                                var6 = class287.field4270.field3687 * var4.field8527 * (var8 - var13) / var8 >> 8;
                            } else {
                                var6 = 0;
                            }
                        }
                        if (var6 > 0) {
                            class250 var14 = null;
                            if (var4.field8517 == 1) {
                                var14 = var4.field8522.method2766().method1677(class37.field630);
                            } else if (var4.method3400(985960808)) {
                                var14 = var4.field8516;
                            }
                            class557 var15 = var4.field8519 = class557.method3182(var14, 100, var6);
                            var15.method3192(var4.field8511 - 1);
                            class627.field8780.method2107(var15);
                        }
                    }
                }
            } else if (!var4.field8519.method3675(true)) {
                var5 = true;
            }
            if (var5) {
                class8.field83--;
                for (int var16 = var1; var16 < class8.field83; var16++) {
                    class106.field1642[var16] = class106.field1642[var16 + 1];
                }
                var1--;
            }
        }
        int var2 = 17 % ((-arg0 - 7) / 34);
        if (class43.field701 && !class165.method1146(true)) {
            if (class287.field4270.field3701 != 0 && class392.field5800 != -1) {
                class345.method2142(class287.field4270.field3701, 0, 0, class652.field9171, false, class392.field5800);
            }
            class43.field701 = false;
        } else if (class287.field4270.field3701 != 0 && class392.field5800 != -1 && !class165.method1146(true)) {
            class88.field1474++;
            class135 var3 = class688.method3794(class603.field8526, class583.field8198, (byte) 38);
            var3.field1978.method3868(class392.field5800, -318419336);
            class19.method223(var3, 0);
            class392.field5800 = -1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 194)
    public static final boolean method3583(int arg0, String arg1) {
        field9061++;
        int var2 = -119 / ((arg0 - 10) / 63);
        return class535.method3045(10, arg1, true, (byte) 39);
    }
}
