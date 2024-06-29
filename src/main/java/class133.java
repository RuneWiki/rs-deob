import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class133 extends class246 {

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field1950 = 0;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field1953 = 99;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Z")
    public static boolean field1955;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILgk;II)V")
    public static final void method914(int arg0, class224 arg1, int arg2, int arg3) {
        if (arg0 < 11) {
            method918(-62, -76, -87, -15, -128);
        }
        if (arg1.field483 == arg3 && arg3 != -1) {
            class220 var4 = class108.method781(arg3, -1);
            int var5 = var4.field3406;
            if (var5 == 1) {
                arg1.field453 = 1;
                arg1.field437 = 0;
                arg1.field410 = 0;
                arg1.field412 = 0;
                arg1.field475 = arg2;
                class244.method1664(arg1.field455, class185.field2687 == arg1, arg1.field412, arg1.field425, 8890, var4);
            }
            if (var5 == 2) {
                arg1.field410 = 0;
            }
        } else if (arg3 == -1 || arg1.field483 == -1 || class108.method781(arg3, -1).field3427 >= class108.method781(arg1.field483, -1).field3427) {
            arg1.field437 = 0;
            arg1.field410 = 0;
            arg1.field412 = 0;
            arg1.field475 = arg2;
            arg1.field483 = arg3;
            arg1.field453 = 1;
            arg1.field426 = arg1.field441;
            if (arg1.field483 != -1) {
                class244.method1664(arg1.field455, class185.field2687 == arg1, arg1.field412, arg1.field425, 8890, class108.method781(arg1.field483, -1));
            }
        }
        field1951++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method915(int arg0, Component arg1) {
        arg1.addMouseListener(class42.field738);
        if (arg0 < 44) {
            field1956 = 84;
        }
        field1949++;
        arg1.addMouseMotionListener(class42.field738);
        arg1.addFocusListener(class42.field738);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method916(byte arg0, String arg1) {
        field1957++;
        if (arg0 != -38) {
            field1950 = 91;
        }
        int var2 = class106.method773(false, arg1);
        if (var2 != -1) {
            int[] var3 = class90.field1362.method1872((byte) -106, class154.field2251.field3738[var2] >> 14 & 0x3FFF, (class154.field2251.field3738[var2] & 0x332E18D0) >> 28, class154.field2251.field3738[var2] & 0x3FFF);
            class145.method996(var3[1], arg0 + 32198, var3[2]);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
    public static final int method917(int arg0, int arg1, int arg2) {
        field1947++;
        int var3 = class61.method507(4, 54, arg1 + 45365, arg2 - -91923) - (-(class61.method507(2, 85, arg1 + 10294, arg2 - -37821) - 128 >> 1) - (class61.method507(1, 36, arg1, arg2) + -128 >> 2)) - 128;
        if (arg0 != 0) {
            method916((byte) -67, (String) null);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public static final void method918(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1948++;
        class105 var5 = class9.method72(arg4, -1, arg1);
        var5.method763(false);
        var5.field1540 = arg2;
        var5.field1545 = arg0;
        var5.field1553 = arg3;
    }
}
