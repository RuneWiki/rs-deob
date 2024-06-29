import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class372 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public static int[] field5410 = new int[100];

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Loq;")
    public static class120 field5412 = null;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field5415 = -1;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5413 = "Loading - please wait.";

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static final void method2409(boolean arg0) {
        field5419++;
        if (class281.field4096 == 0) {
            return;
        }
        try {
            if ((++class420.field6216) > 1500) {
                if (class191.field2558 != null) {
                    class191.field2558.method1398((byte) -117);
                    class191.field2558 = null;
                }
                if (class100.field1394 >= 1) {
                    class281.field4096 = 0;
                    class102.field1416 = -5;
                    return;
                }
                class420.field6216 = 0;
                if (class393.field5627 == class110.field1565) {
                    class393.field5627 = class308.field4528;
                } else {
                    class393.field5627 = class110.field1565;
                }
                class100.field1394++;
                class281.field4096 = 1;
            }
            if (class281.field4096 == 1) {
                class384.field5557 = class76.field1085.method261(-5159, class393.field5627, class354.field5129);
                class281.field4096 = 2;
            }
            if (class281.field4096 == 2) {
                if (class384.field5557.field6308 == 2) {
                    throw new IOException();
                }
                if (class384.field5557.field6308 != 1) {
                    return;
                }
                class191.field2558 = new class233((Socket) class384.field5557.field6309, class76.field1085);
                class384.field5557 = null;
                class191.field2558.method1401(3, 0, class185.field2507.field3029, class185.field2507.field3040);
                if (class230.field3073 != null) {
                    class230.field3073.method1203(500000);
                }
                if (class281.field4093 != null) {
                    class281.field4093.method1203(500000);
                }
                int var1 = class191.field2558.method1399(-7573);
                if (class230.field3073 != null) {
                    class230.field3073.method1203(500000);
                }
                if (class281.field4093 != null) {
                    class281.field4093.method1203(500000);
                }
                if (var1 != 101) {
                    class102.field1416 = var1;
                    class281.field4096 = 0;
                    class191.field2558.method1398((byte) -89);
                    class191.field2558 = null;
                    return;
                }
                class281.field4096 = 3;
            }
            if (!arg0) {
                method2410((byte) -16);
            }
            if (class281.field4096 == 3 && class191.field2558.method1394(arg0) >= 2) {
                int var2 = class191.field2558.method1399(-7573) << 8 | class191.field2558.method1399(-7573);
                class237.method1428(var2, true);
                if (class43.field616 == -1) {
                    class102.field1416 = 6;
                    class281.field4096 = 0;
                    class191.field2558.method1398((byte) -94);
                    class191.field2558 = null;
                } else {
                    class281.field4096 = 0;
                    class191.field2558.method1398((byte) 122);
                    class191.field2558 = null;
                    class26.method187(21274);
                }
            }
        } catch (IOException var3) {
            if (class191.field2558 != null) {
                class191.field2558.method1398((byte) 87);
                class191.field2558 = null;
            }
            if (class100.field1394 < 1) {
                if (class393.field5627 == class110.field1565) {
                    class393.field5627 = class308.field4528;
                } else {
                    class393.field5627 = class110.field1565;
                }
                class100.field1394++;
                class420.field6216 = 0;
                class281.field4096 = 1;
            } else {
                class281.field4096 = 0;
                class102.field1416 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method2410(byte arg0) {
        field5410 = null;
        field5413 = null;
        field5412 = null;
        int var1 = -66 % ((34 - arg0) / 52);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lii;ILge;BII)V")
    public static final void method2411(class405 arg0, int arg1, class104 arg2, byte arg3, int arg4, int arg5) {
        field5414++;
        int var6 = -109 % ((-arg3 - 10) / 43);
        class399 var7 = class59.method414(arg2.field1496, (byte) 57);
        if (var7.field5940 == -1) {
            return;
        }
        int var8;
        if (arg2.field1511) {
            int var9 = arg2.field1457 + arg4;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class67 var10 = var7.method2574(arg2.field1446, arg0, var8, 0);
        if (var10 == null) {
            return;
        }
        int var11 = arg2.field1489;
        int var12 = arg2.field1506;
        if ((var8 & 0x1) == 1) {
            var11 = arg2.field1506;
            var12 = arg2.field1489;
        }
        int var13 = var10.method411();
        int var14 = var10.method409();
        if (var7.field5947) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field5956 == 0) {
            var10.method453(arg5, arg1 + 4 - (var12 * 4), var13, var14);
        } else {
            var10.method402(arg5, arg1 - ((var12 - 1) * 4), var13, var14, 1, var7.field5956 | 0xFF000000, 1);
        }
    }
}
