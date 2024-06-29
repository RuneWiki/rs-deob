import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class657 extends class201 {

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field9493 = 0;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "Z")
    public static boolean field9498 = false;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)V", line = 7)
    public static final void method3753(boolean arg0, int arg1) {
        field9497++;
        if (arg0 && class182.field2250 != null) {
            class358.field5088 = class182.field2250.field4025;
        } else {
            class358.field5088 = -1;
        }
        class123.field1537 = 0;
        class182.field2250 = null;
        class501.field7292 = null;
        class50.field537 = null;
        class182.method1052();
        class182.field2258.method718(-118);
        class34.field391 = null;
        class112.field1376 = null;
        class181.field2229 = null;
        class182.field2251 = null;
        class270.field3784 = null;
        int var2 = 126 / ((arg1 - 18) / 53);
        class270.field3786 = null;
        class581.field8365 = null;
        class574.field8285 = null;
        class212.field2909 = -1;
        class59.field682 = -1;
        class1.field5 = null;
        class240.field3407 = null;
        if (class182.field2242 != null) {
            class182.field2242.method1020((byte) 1);
            class182.field2242.method1013(128, -123, 64);
        }
        if (class182.field2248 != null) {
            class182.field2248.method110(64, 64, 124);
        }
        if (class182.field2243 != null) {
            class182.field2243.method1502(64, (byte) 121);
        }
        class300.field4421.method1259(64, 1808421224);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 58)
    public static final void method3754(int arg0, String arg1) {
        field9496++;
        class117.method726("", -1, arg0, arg1, "", 0, "");
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Z", line = 69)
    public static final boolean method3755(byte arg0) {
        field9494++;
        if (class133.field1673 < 1) {
            return false;
        } else {
            if (arg0 != -103) {
                method3753(false, 12);
            }
            return class646.field9321 != class197.field2667 || class315.field4597 >= 2;
        }
    }
}
