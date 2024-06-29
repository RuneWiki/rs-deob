import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class244 {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "[I")
    public static int[] field4375 = new int[64];

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Llc;")
    public static class143 field4381 = class66.method374("null", -1);

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Llc;")
    private static class143 field4382 = class66.method374("K", -1);

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4380 = 0;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Llc;")
    public static class143 field4383 = class66.method374("Clientscript error in: ", -1);

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Llc;")
    public static class143 field4386 = field4382;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Llc;")
    public static class143 field4385 = class66.method374("Hidden)2", -1);

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Llc;")
    public static class143 field4377 = field4382;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lje;BLje;)V")
    public static final void method1620(class61 arg0, byte arg1, class61 arg2) {
        field4374++;
        if (arg0.field1158 != null) {
            arg0.method349(0);
        }
        arg0.field1164 = arg2;
        arg0.field1158 = arg2.field1158;
        arg0.field1158.field1164 = arg0;
        if (arg1 >= -96) {
            method1625(-74, 33, -74, 42, false, -32);
        }
        arg0.field1164.field1158 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBI)V")
    public static final void method1621(int arg0, byte arg1, int arg2) {
        field4376++;
        if (arg1 < 51) {
            return;
        }
        class149 var3 = class49.method300(2, arg0);
        int var4 = var3.field2750;
        int var5 = var3.field2737;
        int var6 = var3.field2738;
        int var7 = class13.field238[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class207.method1444(var4, arg2 << var5 & var8 | ~var8 & class145.field2603[var4], -44);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method1622(int arg0) {
        field4385 = null;
        field4377 = null;
        field4382 = null;
        field4386 = null;
        field4381 = null;
        field4375 = null;
        if (arg0 == -3) {
            field4383 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public static final void method1623(int arg0) {
        field4373++;
        if (arg0 != 23049) {
            method1622(71);
        }
        for (int var1 = 0; var1 < class268.field4809; var1++) {
            int var2 = class135.field2379[var1];
            class187 var3 = class259.field4648[var2];
            int var4 = class161.field2902.method1265(arg0 - 22923);
            if ((var4 & 0x40) != 0) {
                var3.field4182 = class161.field2902.method1261(2);
                if (var3.field4182 == 65535) {
                    var3.field4182 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field4117 = class161.field2902.method1270((byte) 13);
                var3.field4174 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var5 = class161.field2902.method1259(6385);
                int var6 = class161.field2902.method1260((byte) 81);
                if (var5 == 65535) {
                    var5 = -1;
                }
                class267.method1774(true, var6, var5, var3);
            }
            if ((var4 & 0x20) != 0) {
                var3.field4119 = class161.field2902.method1275(128);
                int var7 = class161.field2902.method1266(118);
                var3.field4175 = 0;
                var3.field4107 = 0;
                if (var3.field4119 == 65535) {
                    var3.field4119 = -1;
                }
                var3.field4132 = class146.field2635 + (var7 & 0xFFFF);
                if (var3.field4132 > class146.field2635) {
                    var3.field4107 = -1;
                }
                var3.field4152 = var7 >> 16;
                if (var3.field4119 != -1 && class146.field2635 == var3.field4132) {
                    int var8 = class122.method742(-64, var3.field4119).field3090;
                    if (var8 != -1) {
                        class104 var9 = class164.method1081(var8, -21331);
                        if (var9 != null && var9.field1829 != null) {
                            class274.method1805(var9, 0, var3.field4108, var3.field4178, false, (byte) -66);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field4158 = class161.field2902.method1235(arg0 - 52579);
                var3.field4162 = class161.field2902.method1259(6385);
            }
            if ((var4 & 0x80) != 0) {
                int var10 = class161.field2902.method1250((byte) 92);
                int var11 = class161.field2902.method1250((byte) 121);
                var3.method1560(class146.field2635, var11, var10, 0);
                var3.field4116 = class146.field2635 + 300;
                var3.field4143 = class161.field2902.method1260((byte) 122);
            }
            if ((var4 & 0x4) != 0) {
                int var12 = class161.field2902.method1265(113);
                int var13 = class161.field2902.method1250((byte) 100);
                var3.method1560(class146.field2635, var13, var12, 0);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field3384.method487(115)) {
                    class5.method22(120, var3);
                }
                var3.method1219((byte) 101, class154.method1018(-128, class161.field2902.method1235(arg0 - 52579)));
                var3.method1557(6622, var3.field3384.field1531);
                var3.field4142 = var3.field3384.field1571;
                var3.field4181 = var3.field3384.field1519;
                var3.field4125 = var3.field3384.field1555;
                var3.field4137 = var3.field3384.field1556;
                var3.field4114 = var3.field3384.field1553;
                var3.field4113 = var3.field3384.field1528;
                var3.field4141 = var3.field3384.field1551;
                var3.field4157 = var3.field3384.field1525;
                if (var3.field3384.method487(104)) {
                    class266.method1772((class209) null, 0, var3.field4115[0], var3.field4148[0], class170.field3044, 128, (class32) null, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lpl;")
    public static final class168 method1624(Throwable arg0, String arg1) {
        class168 var2;
        if ((arg0 instanceof class168)) {
            var2 = (class168) arg0;
            var2.field2996 = var2.field2996 + ' ' + arg1;
        } else {
            var2 = new class168(arg0, arg1);
        }
        field4378++;
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4379++;
        int var6 = arg3;
        int var7 = 0;
        int var8 = arg1 * arg1;
        if (arg4) {
            method1625(8, 36, 16, -55, false, 54);
        }
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = var9 - (var12 - 1) * var11;
        int var14 = (1 - var12) * var8 + var10;
        int var15 = ((arg3 << 1) - 3) * var11;
        int var16 = var8 << 2;
        int var17 = ((var7 << 1) + 3) * var10;
        int var18 = var9 << 2;
        int var19 = (var7 + 1) * var18;
        if (class188.field3398 <= arg5 && class239.field4321 >= arg5) {
            int var20 = class83.method476(true, class31.field481, arg0 + arg1, class9.field173);
            int var21 = class83.method476(!arg4, class31.field481, arg0 - arg1, class9.field173);
            class289.method1927(class15.field268[arg5], arg2, var21, -79, var20);
        }
        int var22 = (arg3 - 1) * var16;
        while (var6 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var17;
                    var7++;
                    var17 += var18;
                    var13 += var19;
                    var19 += var18;
                }
            }
            if (var13 < 0) {
                var13 += var19;
                var7++;
                var19 += var18;
                var14 += var17;
                var17 += var18;
            }
            var6--;
            var13 += -var15;
            var14 += -var22;
            var22 -= var16;
            var15 -= var16;
            int var23 = arg5 - var6;
            int var24 = arg5 + var6;
            if (var24 >= class188.field3398 && class239.field4321 >= var23) {
                int var25 = class83.method476(true, class31.field481, arg0 + var7, class9.field173);
                int var26 = class83.method476(true, class31.field481, arg0 - var7, class9.field173);
                if (var23 >= class188.field3398) {
                    class289.method1927(class15.field268[var23], arg2, var26, -109, var25);
                }
                if (class239.field4321 >= var24) {
                    class289.method1927(class15.field268[var24], arg2, var26, -119, var25);
                }
            }
        }
    }
}
