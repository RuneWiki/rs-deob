import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class336 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[Lri;")
    public static class414[] field4674 = new class414[128];

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1995(int arg0) {
        if (arg0 == Integer.MAX_VALUE) {
            class506.field7522.method80(class123.field2023, class26.field362, class595.field8618);
            field4678++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lph;", line = 17)
    public static final class699 method1996(byte arg0) {
        field4676++;
        if (arg0 < 109) {
            field4674 = null;
        }
        class699 var1 = class514.method3052((byte) -111);
        var1.field9909 = null;
        var1.field9900 = 0;
        var1.field9908 = new class373(5000);
        return var1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I", line = 35)
    public static final int method1997(int arg0, int arg1) {
        field4677++;
        if (arg0 != 255) {
            method1995(-83);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILr;)V", line = 52)
    public static final void method1998(int arg0, class98 arg1) {
        field4675++;
        int var2 = class150.field2534;
        int var3 = class485.field6918;
        int var4 = class69.field1093;
        int var5 = class273.field3904 - 3;
        byte var6 = 20;
        if (class221.field3304 == null || class473.field6795 == null) {
            if (class468.field6754.method2077(0, class217.field3261) && class468.field6754.method2077(0, class66.field949)) {
                class221.field3304 = arg1.method772(class628.method3550(class468.field6754, class217.field3261, 0), true);
                class628 var7 = class628.method3550(class468.field6754, class66.field949, 0);
                class473.field6795 = arg1.method772(var7, true);
                var7.method3542();
                class296.field4184 = arg1.method772(var7, true);
            } else {
                arg1.method824(var2, var3, var4, var6, 255 - class518.field7649 << 24 | class359.field5009, 1);
            }
        }
        if (class221.field3304 != null && class473.field6795 != null) {
            int var8 = (var4 - (class473.field6795.method12() * 2)) / class221.field3304.method12();
            for (int var9 = 0; var9 < var8; var9++) {
                class221.field3304.method1638(class473.field6795.method12() + var2 + (class221.field3304.method12() * var9), var3);
            }
            class473.field6795.method1638(var2, var3);
            class296.field4184.method1638(var4 + (var2 - class296.field4184.method12()), var3);
        }
        class148.field2503.method2394((byte) 109, var2 + 3, class343.field4773.method2059(class238.field3511, true), -1, -16777216 | class437.field6295, var3 + 14);
        arg1.method824(var2, var3 + var6, var4, var5 - var6, class359.field5009 | -class518.field7649 + 255 << 24, 1);
        int var10 = class313.field4336.method310(false);
        int var11 = class313.field4336.method321(125);
        int var12 = 0;
        if (arg0 != 4) {
            method1998(39, null);
        }
        for (class673 var13 = (class673) class150.field2533.method3905(arg0 - 126); var13 != null; var13 = (class673) class150.field2533.method3899(arg0 ^ 0x4)) {
            int var31 = (class400.field5784 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var2 < var10 && var10 < (var2 + var4) && (var31 - 13) < var11 && var11 < (var31 + 4) && var13.field9553) {
                arg1.method824(var2, var31 - 12, var4, 16, class92.field1347 | 255 - class107.field1759 << 24, 1);
            }
            var12++;
        }
        if ((class564.field8257 == null || class608.field8738 == null || class288.field4049 == null) && class468.field6754.method2077(0, class180.field2851) && class468.field6754.method2077(0, class196.field3067) && class468.field6754.method2077(0, class346.field4887)) {
            class628 var14 = class628.method3550(class468.field6754, class196.field3067, 0);
            class608.field8738 = arg1.method772(var14, true);
            var14.method3542();
            class618.field8822 = arg1.method772(var14, true);
            class564.field8257 = arg1.method772(class628.method3550(class468.field6754, class180.field2851, 0), true);
            class628 var15 = class628.method3550(class468.field6754, class346.field4887, 0);
            class288.field4049 = arg1.method772(var15, true);
            var15.method3542();
            class314.field4360 = arg1.method772(var15, true);
        }
        if (class564.field8257 != null && class608.field8738 != null && class288.field4049 != null) {
            int var16 = (var4 - class288.field4049.method12() * 2) / class564.field8257.method12();
            for (int var17 = 0; var17 < var16; var17++) {
                class564.field8257.method1638(var2 + class288.field4049.method12() + (var17 * class564.field8257.method12()), -class564.field8257.method17() + var3 + var5);
            }
            int var18 = (var5 - var6 - class288.field4049.method17()) / class608.field8738.method17();
            for (int var19 = 0; var19 < var18; var19++) {
                class608.field8738.method1638(var2, var3 + var6 + class608.field8738.method17() * var19);
                class618.field8822.method1638(var2 + var4 - class618.field8822.method12(), var19 * class608.field8738.method17() + var3 + var6);
            }
            class288.field4049.method1638(var2, var3 + var5 - class288.field4049.method17());
            class314.field4360.method1638(var4 + (var2 - class288.field4049.method12()), -class288.field4049.method17() + var3 + var5);
        }
        int var20 = 0;
        for (class673 var21 = (class673) class150.field2533.method3905(-121); var21 != null; var21 = (class673) class150.field2533.method3899(arg0 - 4)) {
            int var22 = var3 + ((class400.field5784 - (var20 + 1)) * 16) + var6 + 13;
            int var23 = class437.field6295 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && var22 - 13 < var11 && (var22 + 4) > var11 && var21.field9553) {
                var23 = class366.field5088 | 0xFF000000;
            }
            int[] var24 = null;
            if (class586.method3382(var21.field9544, (byte) 45)) {
                var24 = class430.field6132.method42((int) var21.field9543, false).field6159;
            } else if (var21.field9550 != -1) {
                var24 = class430.field6132.method42(var21.field9550, false).field6159;
            } else if (class642.method3609((byte) 125, var21.field9544)) {
                class6 var27 = (class6) class314.field4359.method2818(-22803, (long) ((int) var21.field9543));
                if (var27 != null) {
                    class88 var28 = var27.field49;
                    class528 var29 = var28.field1309;
                    if (var29.field7758 != null) {
                        var29 = var29.method3110(class230.field3404, false);
                    }
                    if (var29 != null) {
                        var24 = var29.field7763;
                    }
                }
            } else if (class140.method1092(var21.field9544, -116)) {
                Object var25 = null;
                class119 var26;
                if (var21.field9544 == 1008) {
                    var26 = class14.field224.method2834(arg0 ^ 0x4, (int) var21.field9543);
                } else {
                    var26 = class14.field224.method2834(0, (int) (var21.field9543 >>> 32 & 0x7FFFFFFFL));
                }
                if (var26.field1924 != null) {
                    var26 = var26.method969(class230.field3404, arg0 ^ 0x58);
                }
                if (var26 != null) {
                    var24 = var26.field1948;
                }
            }
            String var30 = class115.method931(arg0 ^ 0x4, var21);
            if (var24 != null) {
                var30 = var30 + class192.method1356(var24, (byte) 102);
            }
            class148.field2503.method2396(var22, var30, class106.field1755, var2 + 3, var23, class252.field3646, (byte) -90, 0);
            var20++;
            if (var21.field9539) {
                class160.field2601.method1638(class246.field3584.method2870(true, var30) + (var2 + 5), var22 + -12);
            }
        }
        class345.method2095(class150.field2534, class485.field6918, class69.field1093, class273.field3904, (byte) -23);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Z", line = 255)
    public static final boolean method1999(int arg0, int arg1) {
        field4679++;
        if (arg0 != -23706) {
            field4674 = null;
        }
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V", line = 267)
    public static void method2000(byte arg0) {
        field4674 = null;
        if (arg0 != -102) {
            field4674 = null;
        }
    }
}
