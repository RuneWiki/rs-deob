import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class17 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Z")
    public static boolean field200 = false;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "S")
    public static short field199 = 256;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Ljava/lang/String;")
    public static String field198 = "Loaded input handler";

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[I")
    public static int[] field202 = new int[14];

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
    public static final void method120(byte arg0, int arg1) {
        field203++;
        int var2 = 80 % ((58 - arg0) / 61);
        class92.field1306.method1832(arg1, (byte) -83);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method121(int arg0) {
        if (arg0 > -21) {
            field198 = null;
        }
        field202 = null;
        field198 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static final void method122(int arg0) {
        field204++;
        if (class95.field1429 == 0) {
            return;
        }
        try {
            if (++class62.field883 > 2000) {
                if (class149.field2395 != null) {
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                }
                if (class102.field1539 >= 1) {
                    class104.field1736 = -5;
                    class95.field1429 = 0;
                    return;
                }
                if (class233.field3697 == class223.field3541) {
                    class223.field3541 = class75.field1027;
                } else {
                    class223.field3541 = class233.field3697;
                }
                class102.field1539++;
                class95.field1429 = 1;
                class62.field883 = 0;
            }
            if (class95.field1429 == 1) {
                class270.field4367 = class250.field4006.method1672(-3, class223.field3541, class111.field1920);
                class95.field1429 = 2;
            }
            if (class95.field1429 == 2) {
                if (class270.field4367.field2271 == 2) {
                    throw new IOException();
                }
                if (class270.field4367.field2271 != 1) {
                    return;
                }
                class149.field2395 = new class186((Socket) class270.field4367.field2266, class250.field4006);
                class270.field4367 = null;
                class149.field2395.method1272(class83.field1148.field4195, 0, class83.field1148.field4198, arg0 - 2395);
                if (class226.field3580 != null) {
                    class226.field3580.method735(arg0 - 2283);
                }
                if (class147.field2361 != null) {
                    class147.field2361.method735(0);
                }
                int var1 = class149.field2395.method1270(0);
                if (class226.field3580 != null) {
                    class226.field3580.method735(0);
                }
                if (class147.field2361 != null) {
                    class147.field2361.method735(0);
                }
                if (var1 != 21) {
                    class104.field1736 = var1;
                    class95.field1429 = 0;
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                    return;
                }
                class95.field1429 = 3;
            }
            if (class95.field1429 == 3) {
                if (class149.field2395.method1274(29491) < 1) {
                    return;
                }
                class227.field3586 = new String[class149.field2395.method1270(0)];
                class95.field1429 = 4;
            }
            if (arg0 != 2283) {
                field202 = null;
            }
            if (class95.field1429 == 4 && class149.field2395.method1274(29491) >= (class227.field3586.length * 8)) {
                class166.field2709.field4195 = 0;
                class149.field2395.method1275(class227.field3586.length * 8, class166.field2709.field4198, arg0 ^ 0x2700, 0);
                for (int var2 = 0; var2 < class227.field3586.length; var2++) {
                    class227.field3586[var2] = class245.method1610(70, class166.field2709.method1740((byte) 126));
                }
                class104.field1736 = 21;
                class95.field1429 = 0;
                class149.field2395.method1276(-1);
                class149.field2395 = null;
            }
        } catch (IOException var3) {
            if (class149.field2395 != null) {
                class149.field2395.method1276(-1);
                class149.field2395 = null;
            }
            if (class102.field1539 >= 1) {
                class95.field1429 = 0;
                class104.field1736 = -4;
            } else {
                class95.field1429 = 1;
                if (class233.field3697 == class223.field3541) {
                    class223.field3541 = class75.field1027;
                } else {
                    class223.field3541 = class233.field3697;
                }
                class62.field883 = 0;
                class102.field1539++;
            }
        }
    }
}
