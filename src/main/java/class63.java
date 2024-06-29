import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 extends RuntimeException {

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/lang/String;")
    public String field1554;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1560;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lmb;")
    public static class84 field1555 = class79.method672(true, "(U(Y");

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lmb;")
    private static class84 field1565 = class79.method672(true, "Malformed login packet)3");

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lmb;")
    private static class84 field1559 = class79.method672(true, "M");

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lmb;")
    public static class84 field1566 = field1559;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Z")
    public static boolean field1569 = false;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lmb;")
    public static class84 field1571 = class79.method672(true, ": ");

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lmb;")
    public static class84 field1561 = field1565;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lsd;")
    public static class122 field1562;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lnb;")
    public static class90 field1556;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ldf;IIBI)V")
    public static final void method571(class28 arg0, int arg1, int arg2, byte arg3, int arg4) {
        client.field490.method599(-121);
        class120.field2872.method979(0, 0);
        field1564++;
        if (arg3 <= 75) {
            method572((byte) -85);
        }
        arg0.method202(class106.field2564, 55, 28, 16777215, true);
        if (arg1 == 0) {
            arg0.method202(class33.field737, 55, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg0.method202(class131.field3151, 55, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg0.method202(class77.field1928, 55, 41, 16711680, true);
        }
        if (arg1 == 3) {
            arg0.method202(client.field491, 55, 41, 65535, true);
        }
        arg0.method202(class123.field2984, 184, 28, 16777215, true);
        if (arg4 == 0) {
            arg0.method202(class33.field737, 184, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg0.method202(class131.field3151, 184, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg0.method202(class77.field1928, 184, 41, 16711680, true);
        }
        arg0.method202(class118.field2834, 324, 28, 16777215, true);
        if (arg2 == 0) {
            arg0.method202(class33.field737, 324, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg0.method202(class131.field3151, 324, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg0.method202(class77.field1928, 324, 41, 16711680, true);
        }
        arg0.method220(class49.field1053, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class92.field2296.getGraphics();
            client.field490.method122(var5, 0, 453, 0);
        } catch (Exception var6) {
            class92.field2296.repaint();
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method572(byte arg0) {
        field1562 = null;
        field1555 = null;
        field1566 = null;
        if (arg0 <= 45) {
            method576(-75);
        }
        field1556 = null;
        field1559 = null;
        field1565 = null;
        field1561 = null;
        field1571 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILsd;)V")
    public static final void method573(int arg0, class122 arg1) {
        int var2 = 23 % ((arg0 - 19) / 58);
        class69.field1688 = arg1;
        field1567++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Z")
    public static final boolean method574(int arg0, int arg1) {
        if (arg0 > -125) {
            method576(125);
        }
        field1568++;
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class63(Throwable arg0, String arg1) {
        this.field1554 = arg1;
        this.field1560 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V")
    public static final void method575(boolean arg0, int arg1) {
        field1557++;
        class125.method1027(118);
        class95.field2369++;
        if (class95.field2369 < 50 && !arg0) {
            return;
        }
        if (arg1 <= 101) {
            field1562 = null;
        }
        class95.field2369 = 0;
        if (class60.field1485 || class125.field3030 == null) {
            return;
        }
        class84.field2084++;
        class80.field1978.method769((byte) 81, 229);
        try {
            class125.field3030.method45(0, class80.field1978.field1128, (byte) 87, class80.field1978.field1084);
            class80.field1978.field1128 = 0;
        } catch (IOException var2) {
            class60.field1485 = true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lnc;")
    public static final class91 method576(int arg0) {
        if (arg0 != 17) {
            return null;
        }
        field1572++;
        try {
            return (class91) Class.forName("ac").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class107();
        }
    }
}
