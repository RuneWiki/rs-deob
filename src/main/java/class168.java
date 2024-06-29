import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class168 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "[Z")
    public static boolean[] field2127 = new boolean[8];

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field2125 = 3;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field2128 = -1;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2129 = "Close";

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 13)
    public static void method891(byte arg0) {
        if (arg0 <= 71) {
            method892(true);
        }
        field2127 = null;
        field2129 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method892(boolean arg0) {
        if (class443.field6450 > class443.field6457) {
            class443.field6457 = (float) ((double) class443.field6457 / 30.0D + (double) class443.field6457);
            if (class443.field6457 > class443.field6450) {
                class443.field6457 = class443.field6450;
            }
            class176.method925(true);
            class443.field6451 = (int) class443.field6457 >> 1;
            class443.field6456 = class132.method714(class443.field6451, 97);
        } else if (class443.field6457 > class443.field6450) {
            class443.field6457 = (float) ((double) class443.field6457 - (double) class443.field6457 / 30.0D);
            if (class443.field6450 > class443.field6457) {
                class443.field6457 = class443.field6450;
            }
            class176.method925(true);
            class443.field6451 = (int) class443.field6457 >> 1;
            class443.field6456 = class132.method714(class443.field6451, 38);
        }
        field2126++;
        if (class428.field6284 != -1 && class68.field715 != -1) {
            int var1 = class428.field6284 - class98.field1165;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class68.field715 - class158.field2027;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class98.field1165 += var1;
            class158.field2027 += var2;
            if (var1 == 0 && var2 == 0) {
                class428.field6284 = -1;
                class68.field715 = -1;
            }
            class176.method925(arg0);
        }
        if (class435.field6352 > 0) {
            class340.field4550--;
            if (class340.field4550 == 0) {
                class340.field4550 = 100;
                class435.field6352--;
            }
        } else {
            class205.field2768 = -1;
            class230.field3169 = -1;
        }
        if (class40.field403 && class338.field4512 != null) {
            for (class330 var3 = (class330) class338.field4512.method814((byte) 90); var3 != null; var3 = (class330) class338.field4512.method827(-28)) {
                class228 var4 = class283.method1668(-77, var3.field4402.field2903);
                if (class40.field415 == 0 && var3.method1889(class306.field4146, 90, class337.field4493)) {
                    if (var4.field3154 != null) {
                        if (var4.field3154[4] != null) {
                            class380.method2342(var4.field3133, var4.field3123, (byte) -127, (long) var3.field4402.field2903, -1, var4.field3154[4], 0, 1005);
                        }
                        if (var4.field3154[3] != null) {
                            class380.method2342(var4.field3133, var4.field3123, (byte) -102, (long) var3.field4402.field2903, -1, var4.field3154[3], 0, 1008);
                        }
                        if (var4.field3154[2] != null) {
                            class380.method2342(var4.field3133, var4.field3123, (byte) -100, (long) var3.field4402.field2903, -1, var4.field3154[2], 0, 1004);
                        }
                        if (var4.field3154[1] != null) {
                            class380.method2342(var4.field3133, var4.field3123, (byte) -101, (long) var3.field4402.field2903, -1, var4.field3154[1], 0, 1012);
                        }
                        if (var4.field3154[0] != null) {
                            class380.method2342(var4.field3133, var4.field3123, (byte) -92, (long) var3.field4402.field2903, -1, var4.field3154[0], 0, 1009);
                        }
                    }
                    if (!var3.field4402.field2902) {
                        var3.field4402.field2902 = true;
                        class277.method1522(15, var3.field4402.field2903, var4.field3133);
                    }
                    if (var3.field4402.field2902) {
                        class277.method1522(17, var3.field4402.field2903, var4.field3133);
                    }
                } else if (var3.field4402.field2902) {
                    var3.field4402.field2902 = false;
                    class277.method1522(16, var3.field4402.field2903, var4.field3133);
                }
            }
        }
        if (!arg0) {
            method892(false);
        }
    }
}
