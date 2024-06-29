import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class90 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lw;")
    public static class107 field1494 = null;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[[I")
    public static int[][] field1495 = new int[104][104];

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "D")
    public static double field1502 = -1.0D;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "F")
    public static float field1496;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Ldd;")
    public static class265 field1500;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method638(byte arg0) {
        field1494 = null;
        field1500 = null;
        if (arg0 > -68) {
            field1500 = null;
        }
        field1495 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lff;I)V")
    public static final void method639(class3 arg0, int arg1) {
        field1501++;
        if (arg1 <= 62) {
            field1499 = 108;
        }
        class150.field2640 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 5415) {
            method640(-63, -117, -72, 57, -4, 117, -72, 47);
        }
        field1497++;
        if (class225.method1534(-1, arg1)) {
            client.method826(class100.field1704[arg1], -1, arg6, arg0, arg4, arg2, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public static final int method641(int arg0) {
        field1498++;
        try {
            if (arg0 != -3) {
                method638((byte) -118);
            }
            if (class235.field4021 == 0) {
                if ((class155.method1133(123) - 5000L) < class175.field3053) {
                    return 0;
                }
                class216.field3722 = class234.field4017.method942(class208.field3582, class27.field446, 11);
                class122.field2269 = class155.method1133(126);
                class235.field4021 = 1;
            }
            if (class122.field2269 + 30000L < class155.method1133(arg0 ^ 0xFFFFFF80)) {
                return class251.method1750((byte) 102, 1000);
            }
            if (class235.field4021 == 1) {
                if (class216.field3722.field4605 == 2) {
                    return class251.method1750((byte) 85, 1001);
                }
                if (class216.field3722.field4605 != 1) {
                    return -1;
                }
                class211.field3638 = new class236((Socket) class216.field3722.field4604, class234.field4017);
                class216.field3722 = null;
                class140.field2505.field4124 = 0;
                int var1 = 0;
                if (class31.field488) {
                    var1 = class250.field4330;
                }
                class140.field2505.method1652(85, (byte) 41);
                class140.field2505.method1625((byte) 127, var1);
                class211.field3638.method1599(true, class140.field2505.field4124, class140.field2505.field4144, 0);
                if (class20.field335 != null) {
                    class20.field335.method536((byte) 14);
                }
                if (class80.field1362 != null) {
                    class80.field1362.method536((byte) 14);
                }
                int var2 = class211.field3638.method1604((byte) 78);
                if (class20.field335 != null) {
                    class20.field335.method536((byte) 14);
                }
                if (class80.field1362 != null) {
                    class80.field1362.method536((byte) 14);
                }
                if (var2 != 0) {
                    return class251.method1750((byte) 127, var2);
                }
                class235.field4021 = 2;
            }
            if (class235.field4021 == 2) {
                if (class211.field3638.method1598(0) < 2) {
                    return -1;
                }
                class9.field163 = class211.field3638.method1604((byte) 78);
                class9.field163 <<= 0x8;
                class9.field163 += class211.field3638.method1604((byte) 78);
                class188.field3295 = new byte[class9.field163];
                class235.field4021 = 3;
                class221.field3770 = 0;
            }
            if (class235.field4021 != 3) {
                return -1;
            }
            int var3 = class211.field3638.method1598(0);
            if (var3 < 1) {
                return -1;
            }
            if ((class9.field163 - class221.field3770) < var3) {
                var3 = class9.field163 - class221.field3770;
            }
            class211.field3638.method1603(2000, class188.field3295, class221.field3770, var3);
            class221.field3770 += var3;
            if (class221.field3770 < class9.field163) {
                return -1;
            } else if (class5.method59(class188.field3295, (byte) 126)) {
                int var4 = 0;
                class62.field1053 = new class36[class17.field248];
                for (int var5 = class259.field4477; var5 <= class52.field908; var5++) {
                    class36 var6 = class71.method486(var5, true);
                    if (var6 != null) {
                        class62.field1053[var4++] = var6;
                    }
                }
                class211.field3638.method1605(-97);
                class211.field3638 = null;
                class55.field956 = 0;
                class188.field3295 = null;
                class235.field4021 = 0;
                class175.field3053 = class155.method1133(arg0 + 128);
                return 0;
            } else {
                return class251.method1750((byte) 104, 1002);
            }
        } catch (IOException var7) {
            return class251.method1750((byte) 127, 1003);
        }
    }
}
