import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class365 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "F")
    public static float field4777;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "F")
    public static float field4778;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lep;B)V")
    public static final void method2011(class382 arg0, byte arg1) {
        field4775++;
        if (!class477.field6938) {
            return;
        }
        if (arg0.field5114 != null) {
            class382 var2 = class657.method3708(class292.field3767, (byte) -60, class411.field5451);
            if (var2 != null) {
                class676 var3 = new class676();
                var3.field9580 = arg0.field5114;
                var3.field9578 = var2;
                var3.field9585 = arg0;
                class364.method1998(var3);
            }
        }
        class118.field1355++;
        class480.method2802(class229.field2920, 16751);
        if (arg1 <= 90) {
            return;
        }
        class334.field4314.method2554(arg0.field5055, 255);
        class334.field4314.method2511(class411.field5451, true);
        class334.field4314.method2540(arg0.field5073, 89);
        class334.field4314.method2521(-1531903640, class420.field5591);
        class334.field4314.method2566(class292.field3767, true);
        class334.field4314.method2540(arg0.field5110, -53);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BIIIII)V")
    public static final void method2012(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4776++;
        if (arg5 >= arg1) {
            return;
        }
        int var6 = arg3 + arg5;
        int var7 = arg1 - arg5 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg1 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg2 == 32951362) {
                            return;
                        } else {
                            method2011(null, (byte) -55);
                            return;
                        }
                    }
                    arg0[var6++] = 1;
                }
            }
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
        }
    }
}
