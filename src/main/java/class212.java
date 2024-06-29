import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class212 {

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Liga;")
    public static class91 field2926 = new class91(14, 3);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Lae;")
    public static class283 field2925;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Lwia;")
    public static class305 field2927;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Ltv;")
    public static class481 field2928;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 13)
    public static final void method1331(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field2924++;
        class115 var5 = class446.method2705(arg1, -124, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field1477 != null) {
            class114 var6 = new class114();
            var6.field1381 = arg2;
            var6.field1384 = var5.field1477;
            var6.field1374 = arg4;
            var6.field1378 = var5;
            class700.method3959(var6);
        }
        if (class664.field9331 != 10 || !client.method779(var5).method1108(-112857776, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class744.field10250++;
            class116 var7 = class248.method1672(class84.field1023, class510.field6926, arg3 ^ 0x50C4);
            class699.method3946(var5.field1458, (byte) -127, arg0, arg1, var7);
            class443.method2655(0, var7);
        }
        if (arg4 == 2) {
            class208.field2907++;
            class116 var8 = class248.method1672(class84.field1023, class679.field9498, -20647);
            class699.method3946(var5.field1458, (byte) -101, arg0, arg1, var8);
            class443.method2655(0, var8);
        }
        if (arg4 == 3) {
            class284.field4086++;
            class116 var9 = class248.method1672(class84.field1023, class650.field9079, arg3 ^ 0x50C4);
            class699.method3946(var5.field1458, (byte) -123, arg0, arg1, var9);
            class443.method2655(arg3 ^ 0xFFFFFF9D, var9);
        }
        if (arg4 == 4) {
            class672.field9436++;
            class116 var10 = class248.method1672(class84.field1023, class128.field1664, -20647);
            class699.method3946(var5.field1458, (byte) -88, arg0, arg1, var10);
            class443.method2655(arg3 + 99, var10);
        }
        if (arg3 != -99) {
            field2927 = null;
        }
        if (arg4 == 5) {
            class266.field3871++;
            class116 var11 = class248.method1672(class84.field1023, class387.field5522, -20647);
            class699.method3946(var5.field1458, (byte) -80, arg0, arg1, var11);
            class443.method2655(0, var11);
        }
        if (arg4 == 6) {
            class176.field2229++;
            class116 var12 = class248.method1672(class84.field1023, class777.field10692, -20647);
            class699.method3946(var5.field1458, (byte) -125, arg0, arg1, var12);
            class443.method2655(arg3 ^ 0xFFFFFF9D, var12);
        }
        if (arg4 == 7) {
            class31.field291++;
            class116 var13 = class248.method1672(class84.field1023, class53.field637, -20647);
            class699.method3946(var5.field1458, (byte) -123, arg0, arg1, var13);
            class443.method2655(arg3 ^ 0xFFFFFF9D, var13);
        }
        if (arg4 == 8) {
            class322.field4554++;
            class116 var14 = class248.method1672(class84.field1023, class771.field10606, arg3 ^ 0x50C4);
            class699.method3946(var5.field1458, (byte) -106, arg0, arg1, var14);
            class443.method2655(0, var14);
        }
        if (arg4 == 9) {
            class714.field9927++;
            class116 var15 = class248.method1672(class84.field1023, class314.field4508, arg3 ^ 0x50C4);
            class699.method3946(var5.field1458, (byte) -95, arg0, arg1, var15);
            class443.method2655(0, var15);
        }
        if (arg4 == 10) {
            class368.field5287++;
            class116 var16 = class248.method1672(class84.field1023, class462.field6461, -20647);
            class699.method3946(var5.field1458, (byte) -102, arg0, arg1, var16);
            class443.method2655(0, var16);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 153)
    public static void method1332(int arg0) {
        field2926 = null;
        field2925 = null;
        field2927 = null;
        if (arg0 != 3) {
            field2927 = null;
        }
        field2928 = null;
    }
}
