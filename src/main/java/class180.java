import java.awt.Frame;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class180 {

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2796 = 1;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Z")
    public static boolean field2800 = true;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field2792 = -1;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field2797;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        if (arg0 != -1) {
            field2796 = -86;
        }
        field2797 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static final void method1203(byte arg0) {
        field2798++;
        if (class189.field2916 == 0) {
            return;
        }
        try {
            int var1 = 28 / ((-arg0 - 30) / 58);
            if ((++class72.field1044) > 1500) {
                if (class103.field1551 != null) {
                    class103.field1551.method1277(false);
                    class103.field1551 = null;
                }
                if (class144.field2266 >= 1) {
                    class198.field3133 = -5;
                    class189.field2916 = 0;
                    return;
                }
                class72.field1044 = 0;
                class144.field2266++;
                if (class58.field795 == class137.field2129) {
                    class137.field2129 = class249.field3962;
                } else {
                    class137.field2129 = class58.field795;
                }
                class189.field2916 = 1;
            }
            if (class189.field2916 == 1) {
                class63.field947 = class259.field4254.method1776(class137.field2129, class178.field2765, (byte) -33);
                class189.field2916 = 2;
            }
            if (class189.field2916 == 2) {
                if (class63.field947.field725 == 2) {
                    throw new IOException();
                }
                if (class63.field947.field725 != 1) {
                    return;
                }
                class103.field1551 = new class189((Socket) class63.field947.field723, class259.field4254);
                class63.field947 = null;
                class103.field1551.method1275(0, true, class276.field4572.field3272, class276.field4572.field3234);
                if (class199.field3155 != null) {
                    class199.field3155.method1152((byte) -17);
                }
                if (class60.field921 != null) {
                    class60.field921.method1152((byte) -17);
                }
                int var2 = class103.field1551.method1276(106);
                if (class199.field3155 != null) {
                    class199.field3155.method1152((byte) -17);
                }
                if (class60.field921 != null) {
                    class60.field921.method1152((byte) -17);
                }
                if (var2 != 101) {
                    class198.field3133 = var2;
                    class189.field2916 = 0;
                    class103.field1551.method1277(false);
                    class103.field1551 = null;
                    return;
                }
                class189.field2916 = 3;
            }
            if (class189.field2916 == 3 && class103.field1551.method1283((byte) -123) >= 2) {
                int var3 = class103.field1551.method1276(36) << 8 | class103.field1551.method1276(63);
                class74.method477(var3, (byte) -102);
                if (class285.field4763 == -1) {
                    class198.field3133 = 6;
                    class189.field2916 = 0;
                    class103.field1551.method1277(false);
                    class103.field1551 = null;
                } else {
                    class189.field2916 = 0;
                    class103.field1551.method1277(false);
                    class103.field1551 = null;
                    class264.method1823(49);
                }
            }
        } catch (IOException var4) {
            if (class103.field1551 != null) {
                class103.field1551.method1277(false);
                class103.field1551 = null;
            }
            if (class144.field2266 >= 1) {
                class198.field3133 = -4;
                class189.field2916 = 0;
            } else {
                class72.field1044 = 0;
                class189.field2916 = 1;
                class144.field2266++;
                if (class58.field795 == class137.field2129) {
                    class137.field2129 = class249.field3962;
                } else {
                    class137.field2129 = class58.field795;
                }
            }
        }
    }
}
