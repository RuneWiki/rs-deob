import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class139 extends class205 {

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "[Z")
    public static boolean[] field2123 = new boolean[100];

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
    public static int[] field2124 = new int[5];

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "[[I")
    public static int[][] field2127 = new int[104][104];

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[B")
    public static byte[] field2120 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "Lna;")
    public static class26 field2122 = class69.method505(":", (byte) -127);

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 25)
    public static void method928(byte arg0) {
        field2124 = null;
        field2120 = null;
        field2123 = null;
        if (arg0 != 104) {
            field2122 = (class26) null;
        }
        field2122 = null;
        field2127 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 39)
    public static final void method929(int arg0) {
        field2126++;
        if (arg0 != 0) {
            field2120 = (byte[]) null;
        }
        if (!class324.method2250(90) && class279.field4651 != class109.field1737) {
            class233.method1568(class279.field4651, class116.field1829, class8.field99, class13.field221.field3890[0], false, class13.field221.field3904[0], true);
        } else if (class279.field4651 != class258.field4202 && class131.method886(arg0, class279.field4651)) {
            class258.field4202 = class279.field4651;
            class82.method631(arg0 + 9179409);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 72)
    public static final void method930(Component arg0, int arg1) {
        field2128++;
        if (arg1 == -9320) {
            arg0.removeKeyListener(class320.field5503);
            arg0.removeFocusListener(class320.field5503);
            class283.field4737 = -1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 86)
    public static final void method931(byte arg0) {
        field2125++;
        if (arg0 != 81) {
            method930((Component) null, 14);
        }
        if (class194.field3024 == 0) {
            return;
        }
        try {
            if (++class55.field902 > 1500) {
                if (class88.field1449 != null) {
                    class88.field1449.method2018(14821);
                    class88.field1449 = null;
                }
                if (class193.field3013 >= 1) {
                    class170.field2658 = -5;
                    class194.field3024 = 0;
                    return;
                }
                class55.field902 = 0;
                class193.field3013++;
                class194.field3024 = 1;
                if (class280.field4662 == class269.field4443) {
                    class269.field4443 = class291.field4848;
                } else {
                    class269.field4443 = class280.field4662;
                }
            }
            if (class194.field3024 == 1) {
                class224.field3544 = class45.field712.method1056((byte) 8, class122.field1910, class269.field4443);
                class194.field3024 = 2;
            }
            if (class194.field3024 == 2) {
                if (class224.field3544.field2811 == 2) {
                    throw new IOException();
                }
                if (class224.field3544.field2811 != 1) {
                    return;
                }
                class88.field1449 = new class285((Socket) class224.field3544.field2812, class45.field712);
                class224.field3544 = null;
                class88.field1449.method2014(false, 0, class114.field1789.field1280, class114.field1789.field1301);
                if (class166.field2580 != null) {
                    class166.field2580.method393(83);
                }
                if (class23.field329 != null) {
                    class23.field329.method393(120);
                }
                int var1 = class88.field1449.method2012(0);
                if (class166.field2580 != null) {
                    class166.field2580.method393(59);
                }
                if (class23.field329 != null) {
                    class23.field329.method393(113);
                }
                if (var1 != 101) {
                    class170.field2658 = var1;
                    class194.field3024 = 0;
                    class88.field1449.method2018(14821);
                    class88.field1449 = null;
                    return;
                }
                class194.field3024 = 3;
            }
            if (class194.field3024 == 3) {
                if (class88.field1449.method2015(-18358) < 2) {
                    return;
                }
                int var2 = class88.field1449.method2012(0) << 8 | class88.field1449.method2012(0);
                class290.method2041(var2, (byte) -16);
                if (class263.field4309 == -1) {
                    class194.field3024 = 0;
                    class170.field2658 = 6;
                    class88.field1449.method2018(14821);
                    class88.field1449 = null;
                    return;
                }
                class194.field3024 = 0;
                class88.field1449.method2018(arg0 + 14740);
                class88.field1449 = null;
                class284.method2008(0);
                return;
            }
        } catch (IOException var4) {
            if (class88.field1449 != null) {
                class88.field1449.method2018(14821);
                class88.field1449 = null;
            }
            if (class193.field3013 < 1) {
                if (class280.field4662 == class269.field4443) {
                    class269.field4443 = class291.field4848;
                } else {
                    class269.field4443 = class280.field4662;
                }
                class194.field3024 = 1;
                class55.field902 = 0;
                class193.field3013++;
            } else {
                class170.field2658 = -4;
                class194.field3024 = 0;
            }
        }
    }
}
