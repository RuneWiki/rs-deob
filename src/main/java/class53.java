import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class53 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field1073 = 0;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field1075 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 5)
    public static final void method411(int arg0) {
        if (~class38.field730 == arg0 && class249.field3893) {
            class9.method79((byte) -101, 28);
        }
        field1077++;
        if (class38.field730 == 30) {
            class9.method79((byte) -101, 25);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 19)
    public static final void method412(int arg0, int arg1, int arg2) {
        field1072++;
        class2 var3 = class212.method1433(arg0, 5, -13802);
        var3.method13((byte) -1);
        var3.field39 = arg2;
        if (arg1 > -88) {
            method415((byte) -16, 97);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 44)
    public static final void method413(boolean arg0) {
        if (!arg0) {
            field1073 = -69;
        }
        field1078++;
        try {
            if (class18.field327 == 1) {
                int var1 = class29.field561.method2198(false);
                if (var1 > 0 && class29.field561.method2220(-1901)) {
                    int var2 = var1 - class177.field2846;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class29.field561.method2231(var2, -55);
                    return;
                }
                class29.field561.method2199(-71);
                class29.field561.method2194((byte) -38);
                if (class147.field2402 == null) {
                    class18.field327 = 0;
                } else {
                    class18.field327 = 2;
                }
                class298.field4529 = null;
                class116.field2044 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class29.field561.method2199(-43);
            class298.field4529 = null;
            class147.field2402 = null;
            class116.field2044 = null;
            class18.field327 = 0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 92)
    public static final void method414(String arg0, int arg1, byte arg2) {
        field1074++;
        class2 var3 = class212.method1433(arg1, 3, arg2 ^ 0x35E7);
        var3.method13((byte) -1);
        var3.field41 = arg0;
        if (arg2 != -15) {
            method416(8, -93, -77, 92, 38);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V", line = 110)
    public static final void method415(byte arg0, int arg1) {
        class204.field3339.method1883(2047773287, arg1);
        field1071++;
        if (arg0 > -101) {
            field1073 = 53;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V", line = 125)
    public static final void method416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1076++;
        class336.field5148 = -1;
        class250.field3923 = class9.field199 * arg2 / arg1;
        class318.field4808 = class163.field2629 * arg3 / arg4;
        class345.field5353 = -1;
        class264.method1760((byte) -12);
        if (arg0 != 2538) {
            method415((byte) 51, 97);
        }
    }
}
