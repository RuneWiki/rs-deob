import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class318 extends class35 {

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public int field4800;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "[I")
    public static int[] field4805 = new int[14];

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field4799 = 0;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Lth;")
    public static class55 field4798 = new class55();

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "I")
    public static int field4807 = 64;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "Z")
    public static boolean field4809 = true;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 4)
    public static void method2188(int arg0) {
        if (arg0 != 0) {
            method2192((byte) 35, -125);
        }
        field4805 = null;
        field4798 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIIIZI)V", line = 17)
    public static final void method2189(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4806++;
        if (arg1) {
            class249.method1655();
        }
        if (class177.field2866 != null && (arg4 != 3 || class180.field2902 != arg6 || class171.field2757 != arg0)) {
            class266.method1771(class177.field2849, class177.field2866, true);
            class177.field2866 = null;
        }
        if (arg4 == 3 && class177.field2866 == null) {
            class177.field2866 = class183.method1143((byte) -73, 0, arg0, class177.field2849, arg6, 0);
            if (class177.field2866 != null) {
                class171.field2757 = arg0;
                class180.field2902 = arg6;
                class271.method1824(arg3 ^ 0x2699, class177.field2849);
            }
        }
        if (arg4 == 3 && class177.field2866 == null) {
            method2189(-1, true, arg2, 9977, class52.field1051, true, -1);
            return;
        }
        Container var7;
        if (class177.field2866 != null) {
            var7 = class177.field2866;
        } else if (class283.field4376 == null) {
            var7 = class177.field2849.field2139;
        } else {
            var7 = class283.field4376;
        }
        class61.field1183 = var7.getSize().width;
        class177.field2864 = var7.getSize().height;
        if (class283.field4376 == var7) {
            Insets var8 = class283.field4376.getInsets();
            class177.field2864 -= var8.top + var8.bottom;
            class61.field1183 -= var8.right + var8.left;
        }
        if (arg4 < 2) {
            class88.field1658 = 765;
            class123.field2122 = 0;
            class134.field2257 = 503;
            class294.field4488 = (class61.field1183 - 765) / 2;
        } else {
            class88.field1658 = class61.field1183;
            class134.field2257 = class177.field2864;
            class123.field2122 = 0;
            class294.field4488 = 0;
        }
        if (arg5) {
            class327.method2260((byte) 115, class216.field3456);
            class196.method1258(class216.field3456, 52);
            if (class240.field3751 != null) {
                class240.field3751.method548((byte) -77, class216.field3456);
            }
            class72.field1506.method1640(-2);
            class122.method790(class216.field3456, arg3 ^ 0xFFFFD940);
            class200.method1279((byte) -11, class216.field3456);
            if (class240.field3751 != null) {
                class240.field3751.method542(class216.field3456, (byte) -125);
            }
        } else {
            if (class249.field3893) {
                class249.method1649(class88.field1658, class134.field2257);
            }
            class216.field3456.setSize(class88.field1658, class134.field2257);
            if (class283.field4376 == var7) {
                Insets var9 = class283.field4376.getInsets();
                class216.field3456.setLocation(class294.field4488 + var9.left, class123.field2122 + var9.top);
            } else {
                class216.field3456.setLocation(class294.field4488, class123.field2122);
            }
        }
        if (arg4 == 0 && arg2 > 0) {
            class249.method1665(class216.field3456);
        }
        if (arg1 && arg4 > 0) {
            class216.field3456.setIgnoreRepaint(true);
            if (!class23.field467) {
                class71.method543();
                class330.field5055 = null;
                class330.field5055 = class296.method1983(class216.field3456, 8217, class134.field2257, class88.field1658);
                class270.method1800();
                if (class38.field730 == 5) {
                    class291.method1959(true, 2, class214.field3428);
                } else {
                    class188.method1200(false, class219.field3478, false);
                }
                try {
                    Graphics var10 = class216.field3456.getGraphics();
                    class330.field5055.method265(0, var10, 0, (byte) -112);
                } catch (Exception var14) {
                }
                class334.method2300(0);
                if (arg2 == 0) {
                    class330.field5055 = class296.method1983(class216.field3456, 8217, 503, 765);
                } else {
                    class330.field5055 = null;
                }
                class107 var12 = class177.field2849.method818(class72.field1506.getClass(), 0);
                while (var12.field1852 == 0) {
                    class127.method843(-107, 100L);
                }
                if (var12.field1852 == 1) {
                    class23.field467 = true;
                }
            }
            if (class23.field467) {
                class249.method1685(class216.field3456, class219.field3477 * 2);
            }
        }
        if (!class249.field3893 && arg4 > 0) {
            method2189(-1, true, arg2, 9977, 0, true, -1);
            return;
        }
        if (arg4 > 0 && arg2 == 0) {
            class52.field1050.setPriority(5);
            class330.field5055 = null;
            class20.method139();
            ((class52) class284.field4393).method394(200, -86);
            if (class334.field5115) {
                class284.method1920(0.7F);
            }
            if (class210.field3387 == null) {
                class210.field3387 = new class336[13][13];
            }
            class310.method2085(4, 104, 104);
            class60.method463(104, 104);
            class55.method421(0);
        } else if (arg4 == 0 && arg2 > 0) {
            class52.field1050.setPriority(1);
            class330.field5055 = class296.method1983(class216.field3456, 8217, 503, 765);
            class20.method166();
            class275.method1841();
            ((class52) class284.field4393).method394(20, -106);
            if (class334.field5115) {
                if (class331.field5068 == 1) {
                    class284.method1920(0.9F);
                }
                if (class331.field5068 == 2) {
                    class284.method1920(0.8F);
                }
                if (class331.field5068 == 3) {
                    class284.method1920(0.7F);
                }
                if (class331.field5068 == 4) {
                    class284.method1920(0.6F);
                }
            }
            class16.method118();
            class55.method421(arg3 ^ 0x26F9);
        }
        class180.field2899 = !class19.method127(68);
        if (arg1) {
            class72.method551(741);
        }
        if (arg4 < 2) {
            class196.field3153 = false;
        } else {
            class196.field3153 = true;
        }
        if (class158.field2580 != -1) {
            class86.method600((byte) -20, true);
        }
        if (class177.field2860 != null && (class38.field730 == 30 || class38.field730 == 25)) {
            class35.method284(arg3 - 9880);
        }
        if (arg3 != 9977) {
            method2188(32);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class337.field5220[var13] = true;
        }
        class246.field3815 = true;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(ZI)Z", line = 251)
    public static final boolean method2190(boolean arg0, int arg1) {
        class79.field1565 = arg1 + 1 & 0xFFFF;
        if (arg0) {
            field4808 = 108;
        }
        class212.field3418 = true;
        field4802++;
        return true;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)I", line = 277)
    public static final int method2191(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field4807 = 6;
        }
        field4797++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)I", line = 302)
    public static final int method2192(byte arg0, int arg1) {
        if (arg0 == -128) {
            field4803++;
            return arg1 >>> 10;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V", line = 316)
    public class318(int arg0, int arg1) {
        this.field4801 = arg1;
        this.field4800 = arg0;
    }
}
