import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class103 {

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1574 = "cyan:";

    @OriginalMember(owner = "client!co", name = "f", descriptor = "[I")
    public static int[] field1575 = new int[2048];

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1581 = "Checking for updates - ";

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "[S")
    public static short[] field1579;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method723(boolean arg0) {
        field1570++;
        if (class34.field454 == null || class229.field3652 == null) {
            class34.field454 = new int[256];
            class229.field3652 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class34.field454[var1] = (int) (Math.sin(var2) * 4096.0D);
                class229.field3652[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0) {
            field1575 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I", line = 36)
    public static final int method724(int arg0, int arg1) {
        if (arg0 != -9756) {
            method724(102, -42);
        }
        field1580++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V", line = 48)
    public static final void method725(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1576++;
        class21.field313.field3129 = 0;
        class21.field313.method1365(-32769, arg2);
        class21.field313.method1365(-32769, arg0);
        class21.field313.method1365(-32769, arg4);
        class21.field313.method1368(arg3, arg2 ^ 0x12A8);
        class21.field313.method1368(arg1, arg2 ^ 0x12A8);
        class310.field4847 = 0;
        class250.field3976 = -3;
        class329.field5116 = 1;
        class102.field1568 = 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)V", line = 65)
    public static final void method726(byte arg0, int arg1) {
        field1572++;
        if (!class204.method1498((byte) -106, arg1) || arg0 <= 121) {
            return;
        }
        class160[] var2 = class21.field309[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class160 var4 = var2[var3];
            if (var4 != null) {
                var4.field2618 = 1;
                var4.field2600 = 0;
                var4.field2605 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 117)
    public static final void method727(int arg0) {
        field1577++;
        if (class329.field5116 == arg0) {
            return;
        }
        try {
            if ((++class310.field4847) > 2000) {
                if (class69.field901 != null) {
                    class69.field901.method2095(8737);
                    class69.field901 = null;
                }
                if (class102.field1568 >= 1) {
                    class329.field5116 = 0;
                    class250.field3976 = -5;
                    return;
                }
                if (class206.field3366 == class127.field1890) {
                    class206.field3366 = class130.field1920;
                } else {
                    class206.field3366 = class127.field1890;
                }
                class310.field4847 = 0;
                class102.field1568++;
                class329.field5116 = 1;
            }
            if (class329.field5116 == 1) {
                class142.field2128 = class264.field4183.method41(class206.field3366, class246.field3908, -1);
                class329.field5116 = 2;
            }
            if (class329.field5116 == 2) {
                if (class142.field2128.field3488 == 2) {
                    throw new IOException();
                }
                if (class142.field2128.field3488 != 1) {
                    return;
                }
                class69.field901 = new class300((Socket) class142.field2128.field3490, class264.field4183);
                class142.field2128 = null;
                class69.field901.method2101(class21.field313.field3128, (byte) 18, 0, class21.field313.field3129);
                if (class154.field2355 != null) {
                    class154.field2355.method656((byte) 10);
                }
                if (class296.field4640 != null) {
                    class296.field4640.method656((byte) 10);
                }
                int var1 = class69.field901.method2099(0);
                if (class154.field2355 != null) {
                    class154.field2355.method656((byte) 10);
                }
                if (class296.field4640 != null) {
                    class296.field4640.method656((byte) 10);
                }
                if (var1 != 21) {
                    class250.field3976 = var1;
                    class329.field5116 = 0;
                    class69.field901.method2095(arg0 ^ 0x2221);
                    class69.field901 = null;
                    return;
                }
                class329.field5116 = 3;
            }
            if (class329.field5116 == 3) {
                if (class69.field901.method2100(0) < 1) {
                    return;
                }
                class299.field4662 = new String[class69.field901.method2099(0)];
                class329.field5116 = 4;
            }
            if (class329.field5116 == 4) {
                if (class69.field901.method2100(0) < (class299.field4662.length * 8)) {
                    return;
                }
                class336.field5213.field3129 = 0;
                class69.field901.method2092(class299.field4662.length * 8, 15167, class336.field5213.field3128, 0);
                for (int var2 = 0; var2 < class299.field4662.length; var2++) {
                    class299.field4662[var2] = class336.method2313((byte) -110, class336.field5213.method1346(2));
                }
                class329.field5116 = 0;
                class250.field3976 = 21;
                class69.field901.method2095(arg0 ^ 0x2221);
                class69.field901 = null;
                return;
            }
        } catch (IOException var4) {
            if (class69.field901 != null) {
                class69.field901.method2095(8737);
                class69.field901 = null;
            }
            if (class102.field1568 >= 1) {
                class250.field3976 = -4;
                class329.field5116 = 0;
            } else {
                class310.field4847 = 0;
                if (class206.field3366 == class127.field1890) {
                    class206.field3366 = class130.field1920;
                } else {
                    class206.field3366 = class127.field1890;
                }
                class102.field1568++;
                class329.field5116 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V", line = 268)
    public static void method728(int arg0) {
        field1575 = null;
        field1579 = null;
        field1581 = null;
        field1574 = null;
        if (arg0 < 42) {
            field1574 = (String) null;
        }
    }
}
