import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class432 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Ltq;")
    public static class376 field6221;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lfj;II)V")
    public static final void method2710(class396 arg0, int arg1, int arg2) {
        field6219++;
        int var3 = -1;
        int var4 = 0;
        if (class189.field2726 < arg0.field5579) {
            class11.method79(false, arg0);
        } else if (arg0.field5636 >= class189.field2726) {
            class355.method2266(arg0, (byte) -102);
        } else {
            class127.method791(true, arg0, false);
            var3 = class295.field4114;
            var4 = class39.field445;
        }
        if (arg0.field3284 < arg1 || arg0.field3269 < 128 || class176.field2403 * 128 - 128 <= arg0.field3284 || (class383.field5395 * 128 - 128) <= arg0.field3269) {
            arg0.field5612 = -1;
            arg0.field5579 = 0;
            arg0.field5611 = -1;
            arg0.field5636 = 0;
            arg0.field3284 = arg0.field5677[0] * 128 + arg0.method242(arg1 - 30257) * 64;
            arg0.field3269 = arg0.field5664[0] * 128 + arg0.method242(arg1 - 30257) * 64;
            arg0.method2530((byte) -117);
        }
        if (class384.field5422 == arg0 && (arg0.field3284 < 1536 || arg0.field3269 < 1536 || (class176.field2403 - 12) * 128 <= arg0.field3284 || ((class383.field5395 - 12) * 128) <= arg0.field3269)) {
            arg0.field5579 = 0;
            arg0.field5611 = -1;
            arg0.field5612 = -1;
            arg0.field5636 = 0;
            arg0.field3284 = arg0.field5677[0] * 128 + (arg0.method242(-30129) * 64);
            arg0.field3269 = arg0.field5664[0] * 128 + (arg0.method242(-30129) * 64);
            arg0.method2530((byte) -123);
        }
        int var5 = class54.method309(arg0, 0);
        class102.method569(var4, var3, var5, arg0, false);
        class318.method2083(true, arg0);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILfj;IILfj;IIB)V")
    public static final void method2711(int arg0, int arg1, int arg2, class396 arg3, int arg4, int arg5, class396 arg6, int arg7, int arg8, byte arg9) {
        field6218++;
        int var10 = arg6.method245(-1);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class381 var12 = (class381) class340.field4820.method1625((long) var10, arg9 - 43);
        if (var12 == null) {
            class375[] var13 = class375.method2401(class298.field4178, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class151.field1873.method596(var13[0], true);
            class340.field4820.method1622((byte) 13, var12, (long) var10);
        }
        if (arg9 != 43) {
            method2713((byte) 67);
        }
        client.method1115(arg3.field3284, arg3.field3269, true, arg7 >> 1, arg3.method242(-30129) * 64, arg1, arg0, 0, arg8 >> 1);
        int var14 = class207.field2955[0] + arg4 - 18;
        int var15 = arg5 / 4 * 18 + var14;
        int var16 = arg2 + class207.field2955[1] - 16 - 54;
        int var17 = arg5 % 4 * 18 + var16;
        var12.method2446(var15, var17);
        if (arg3 == arg6) {
            class151.field1873.method830(-256, 1, 18, 18, var17 - 1, var15 - 1);
        }
        class278 var18 = class64.method364((byte) -116);
        var18.field3935 = var17 + 16;
        var18.field3933 = var17;
        var18.field3934 = var15 + 16;
        var18.field3937 = arg6;
        var18.field3936 = var15;
        class272.field3856.method2511(-121, var18);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static void method2712(int arg0) {
        field6221 = null;
        if (arg0 >= -84) {
            method2710((class396) null, -7, -113);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
    public static final void method2713(byte arg0) {
        if (arg0 != -16) {
            field6221 = null;
        }
        class101 var1 = class26.field322;
        synchronized (class26.field322) {
            class26.field322.method561(489974055);
        }
        field6222++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBZII)V")
    public static final void method2714(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field6217++;
        class389.field5493 = 0L;
        int var5 = class26.method180(-75);
        if (arg0 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (!class151.field1873.method606()) {
            arg2 = true;
        }
        class125.method784(6521, arg3, arg0, arg4, arg2, var5);
        int var6 = 46 / ((36 - arg1) / 48);
    }
}
