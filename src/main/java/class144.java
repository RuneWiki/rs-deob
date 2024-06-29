import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class144 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[S")
    public static short[] field2129 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field2132 = 1;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 7)
    public static void method1000(byte arg0) {
        field2129 = null;
        if (arg0 >= -104) {
            field2132 = -69;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[Lat;I)V", line = 24)
    public static final void method1001(byte arg0, class444[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class444 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field6477 == 0) {
                    if (var4.field6491 != null) {
                        method1001((byte) 89, var4.field6491, arg2);
                    }
                    class91 var5 = (class91) class425.field6168.method1592((byte) -25, (long) var4.field6469);
                    if (var5 != null) {
                        class264.method1554((byte) 84, arg2, var5.field1460);
                    }
                }
                if (arg2 == 0 && var4.field6530 != null) {
                    class414 var6 = new class414();
                    var6.field5900 = var4.field6530;
                    var6.field5896 = var4;
                    class47.method313(var6);
                }
                if (arg2 == 1 && var4.field6445 != null) {
                    if (var4.field6510 >= 0) {
                        class444 var7 = class22.method138(48, var4.field6469);
                        if (var7 == null || var7.field6491 == null || var7.field6491.length <= var4.field6510 || var7.field6491[var4.field6510] != var4) {
                            continue;
                        }
                    }
                    class414 var8 = new class414();
                    var8.field5896 = var4;
                    var8.field5900 = var4.field6445;
                    class47.method313(var8);
                }
            }
        }
        if (arg0 > 20) {
            field2130++;
        }
    }
}
