import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class632 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Ltm;")
    public static class334 field8877 = new class334(26, 4);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lpia;")
    public static class54 field8881;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIIII)I")
    public static final int method3577(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -94) {
            return 60;
        }
        field8882++;
        int var5 = arg4 & 0xF;
        int var6 = var5 < 8 ? arg3 : arg2;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg3 : arg1);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z")
    public static final boolean method3578(int arg0, int arg1) {
        field8879++;
        if (arg1 > -124) {
            field8881 = null;
        }
        return arg0 == 21 || arg0 == 5 || arg0 == 45 || arg0 == 48 || arg0 == 51 || arg0 == 20 || arg0 == 10;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLha;)V")
    public static final void method3579(boolean arg0, class544 arg1) {
        field8880++;
        if (!arg0) {
            field8875 = -104;
        }
        int var2 = 0;
        int var3 = 0;
        if (class250.field3989) {
            var2 = class499.method3028(0);
            var3 = class545.method3197(121);
        }
        int var4 = -10660793;
        class612.method3497(var4, -16777216, class677.field9542 + var3, class232.field3742, arg1, -2, class662.field9427, class713.field10029 + var2);
        class257.field4034.method2483(var4, class713.field10029 + var2 + 3, class641.field9017.method3621(120, class467.field6804), class677.field9542 + var3 + 14, -67, -1);
        int var5 = var2 + class651.field9244.method2915(-8463);
        int var6 = class651.field9244.method2921((byte) -124) + var3;
        if (class467.field6801) {
            int var10 = 0;
            for (class180 var11 = (class180) class26.field263.method3772(arg0); var11 != null; var11 = (class180) class26.field263.method3780(23774)) {
                int var15 = var10 * 16 + var3 + class677.field9542 + 31;
                var10++;
                if (var11.field3056 == 1) {
                    class336.method2153((byte) -118, class677.field9542 + var3, arg1, var15, var5, class232.field3742, (class208) var11.field3055.field9552.field3449, var6, class662.field9427, -256, class713.field10029 + var2, -1);
                } else {
                    class76.method687(-256, var5, var15, class662.field9427, class232.field3742, arg1, var6, class713.field10029 + var2, class677.field9542 + var3, (byte) -53, -1, var11);
                }
            }
            if (class74.field1107 != null) {
                class612.method3497(var4, -16777216, class85.field1258, class304.field4621, arg1, -2, class265.field4129, class598.field8460);
                class257.field4034.method2483(var4, class598.field8460 + 3, class74.field1107.field3061, class85.field1258 + 14, -80, -1);
                int var12 = 0;
                for (class208 var13 = (class208) class74.field1107.field3055.method3772(true); var13 != null; var13 = (class208) class74.field1107.field3055.method3780(23774)) {
                    int var14 = class85.field1258 + (var12 * 16) + 31;
                    class336.method2153((byte) -56, class85.field1258, arg1, var14, var5, class304.field4621, var13, var6, class265.field4129, -256, class598.field8460, -1);
                    var12++;
                }
                class403.method2491(-98, class265.field4129, class85.field1258, class304.field4621, class598.field8460);
            }
        } else {
            int var7 = 0;
            for (class208 var8 = (class208) class344.field5093.method3463((byte) -50); var8 != null; var8 = (class208) class344.field5093.method3469((byte) 107)) {
                int var9 = (class608.field8588 - var7 - 1) * 16 + (class677.field9542 + var3 + 31);
                class336.method2153((byte) -39, class677.field9542 + var3, arg1, var9, var5, class232.field3742, var8, var6, class662.field9427, -256, class713.field10029 + var2, -1);
                var7++;
            }
        }
        class403.method2491(-67, class662.field9427, class677.field9542 + var3, class232.field3742, class713.field10029 + var2);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method3580(int arg0) {
        field8877 = null;
        if (arg0 == -31343) {
            field8881 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static final void method3581(byte arg0) {
        field8878++;
        if (arg0 < -94) {
            class145.field2239.method76(-96);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
    public static final void method3582(byte arg0) {
        field8876++;
        short var1 = 1024;
        short var2 = 3072;
        if (class141.field2211) {
            var2 = 4096;
            if (class711.field10015) {
                var1 = 2048;
            }
        }
        if ((float) var1 > class490.field7077) {
            class490.field7077 = var1;
        }
        while (class261.field4064 >= 16384.0F) {
            class261.field4064 -= 16384.0F;
        }
        if (class490.field7077 > (float) var2) {
            class490.field7077 = var2;
        }
        while (class261.field4064 < 0.0F) {
            class261.field4064 += 16384.0F;
        }
        int var3 = class701.field9907 >> 9;
        int var4 = class141.field2213 >> 9;
        int var5 = class232.method1611(class141.field2213, class701.field9907, class582.field8234, (byte) -100);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && (class191.field3229 - 4) > var3 && var4 < (class314.field4720 - 4)) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class582.field8234;
                    if (var9 < 3 && class584.method3365(false, var7, var8)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class343.field5086.field1974 != null && class343.field5086.field1974[var9] != null) {
                        var10 = (class343.field5086.field1974[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class211.field3511 != null && class211.field3511[var9] != null) {
                        int var11 = var5 - (class211.field3511[var9].method2160(-113, var8, var7) - var10);
                        if (var6 < var11) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (arg0 <= 44) {
            field8877 = null;
        }
        if (var12 > class87.field1282) {
            class87.field1282 += (var12 - class87.field1282) / 24;
        } else if (class87.field1282 > var12) {
            class87.field1282 += (var12 - class87.field1282) / 80;
        }
    }
}
