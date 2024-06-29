import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class425 extends Exception {

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "[Lta;")
    public static class27[] field5891;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lig;[Lkb;)V", line = 8)
    public static final void method2591(class674 arg0, class757[] arg1) {
        if (class561.field7980) {
            int var2 = arg0.method344(-23, arg1);
            class646.field9160.method2106(var2, arg1);
        }
        if (class52.field741 == class435.field5969) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class743) {
                var5 = ((class743) arg0).field10352;
                var6 = ((class743) arg0).field10357;
            } else {
                var5 = arg0.field9490 >> class509.field7106;
                var6 = arg0.field9489 >> class509.field7106;
            }
            class646.field9160.method2186(class155.field2126[0].method1960(arg0.field9490, arg0.field9489, 126), class116.method767(var5, var6), class375.method2259(var5, var6), class419.method2538(var5, var6));
        }
        class596 var7 = arg0.method278(class646.field9160, 2274);
        if (var7 == null) {
            return;
        }
        if (arg0.field9496) {
            class247[] var8 = var7.field8579;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class247 var10 = var8[var9];
                if (var10.field3431) {
                    class217.method1422(var10.field3432 + var10.field3430, var10.field3433 + var10.field3432, -103, var10.field3428 - var10.field3432, var10.field3429 - var10.field3432);
                }
            }
        }
        if (var7.field8578) {
            var7.field8575 = arg0;
            if (class659.field9305) {
                class321 var11 = class365.field4690;
                synchronized (class365.field4690) {
                    class365.field4690.method1878(0, var7);
                    return;
                }
            }
            class365.field4690.method1878(0, var7);
            return;
        }
        class149.method957(var7, 0);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIILha;BLd;)V", line = 79)
    public static final void method2592(int arg0, int arg1, int arg2, int arg3, class545 arg4, byte arg5, class268 arg6) {
        field5890++;
        if (class265.field3619 < 100) {
            class574.method3421(arg4, arg6, -126);
        }
        arg4.method2097(arg3, arg2, arg3 + arg0, arg1 + arg2);
        if (class265.field3619 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg3;
            int var9 = arg1 / 2 + arg2 - var7 - 18;
            arg4.method2194(arg3, arg2, arg0, arg1, -16777216, 0);
            arg4.method2166(var8 - 152, var9, 304, 34, class282.field3739[class225.field3153].getRGB(), 0);
            arg4.method2194(var8 - 150, var9 + 2, class265.field3619 * 3, 30, class408.field5670[class225.field3153].getRGB(), 0);
            class743.field10354.method2434(var8, class337.field4334[class225.field3153].getRGB(), class138.field1854.method891(-2041650704, class369.field4721), true, -1, var7 + var9);
            return;
        }
        int var10 = class538.field7524 - ((int) ((float) arg0 / class531.field7430));
        int var11 = class29.field372 + ((int) ((float) arg1 / class531.field7430));
        int var12 = (int) ((float) arg0 / class531.field7430) + class538.field7524;
        class186.field2736 = class29.field372 - ((int) ((float) arg1 / class531.field7430));
        class14.field196 = (int) ((float) (arg1 * 2) / class531.field7430);
        if (arg5 > -78) {
            field5891 = null;
        }
        class121.field1660 = class538.field7524 - ((int) ((float) arg0 / class531.field7430));
        int var13 = class29.field372 - ((int) ((float) arg1 / class531.field7430));
        class274.field3685 = (int) ((float) (arg0 * 2) / class531.field7430);
        class531.method3154(class531.field7447 + var10, class531.field7452 + var11, class531.field7447 + var12, class531.field7452 + var13, arg3, arg2, arg0 + arg3, arg1 + 1 + arg2);
        class531.method3170(arg4);
        class522 var14 = class531.method3152(arg4);
        class453.method2729(0, (byte) 89, 0, var14, arg4);
        if (class536.field7505 > 0) {
            class137.field1830--;
            if (class137.field1830 == 0) {
                class536.field7505--;
                class137.field1830 = 20;
            }
        }
        if (!class222.field3119) {
            return;
        }
        int var15 = arg3 + arg0 - 5;
        int var16 = arg1 + arg2 - 8;
        class339.field4345.method2422(16776960, var15, -1, var16, 18127, "Fps:" + class38.field527);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class339.field4345.method2422(var19, var15, -1, var20, 18127, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V", line = 161)
    public static void method2593(int arg0) {
        field5891 = null;
        if (arg0 != 2) {
            field5891 = null;
        }
    }
}
