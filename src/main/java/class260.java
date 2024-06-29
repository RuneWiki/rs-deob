import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class260 {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Lqc;")
    public class442 field3559 = new class442();

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Z")
    public boolean field3566 = false;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lng;")
    public static class190 field3555 = new class190(500);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3561 = 0;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[S")
    public static short[] field3562 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1602(int arg0) {
        field3555 = null;
        if (arg0 != 24723) {
            field3561 = 93;
        }
        field3562 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Lie;")
    public static final class4 method1603(int arg0, int arg1, int arg2) {
        field3558++;
        class4 var3 = new class4();
        if (arg0 < 60) {
            return null;
        }
        var3.field55 = -1;
        var3.field62 = -1;
        var3.field63 = arg1 + 6;
        var3.field49 = arg2 + 5 + 1;
        var3.field53 = new int[var3.field63][var3.field49];
        var3.method24((byte) -118);
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static final void method1604(boolean arg0) {
        field3557++;
        if (class430.field6193 == 0) {
            return;
        }
        try {
            if ((++class286.field3940) > 1500) {
                if (class199.field2749 != null) {
                    class199.field2749.method1593(3);
                    class199.field2749 = null;
                }
                if (class230.field3071 >= 1) {
                    class430.field6193 = 0;
                    class163.field2296 = -5;
                    return;
                }
                class286.field3940 = 0;
                if (class34.field530 == class232.field3140) {
                    class34.field530 = class188.field2616;
                } else {
                    class34.field530 = class232.field3140;
                }
                class430.field6193 = 1;
                class230.field3071++;
            }
            if (class430.field6193 == 1) {
                class311.field4250 = class204.field2772.method2239(class61.field932, class34.field530, 0);
                class430.field6193 = 2;
            }
            if (class430.field6193 == 2) {
                if (class311.field4250.field4068 == 2) {
                    throw new IOException();
                }
                if (class311.field4250.field4068 != 1) {
                    return;
                }
                class199.field2749 = new class258((Socket) class311.field4250.field4070, class204.field2772);
                class311.field4250 = null;
                class199.field2749.method1579(0, 5000, class442.field6400.field5258, class442.field6400.field5273);
                if (class326.field4451 != null) {
                    class326.field4451.method1475(923);
                }
                if (class64.field993 != null) {
                    class64.field993.method1475(923);
                }
                int var1 = class199.field2749.method1591(0);
                if (class326.field4451 != null) {
                    class326.field4451.method1475(923);
                }
                if (class64.field993 != null) {
                    class64.field993.method1475(923);
                }
                if (var1 != 101) {
                    class163.field2296 = var1;
                    class430.field6193 = 0;
                    class199.field2749.method1593(3);
                    class199.field2749 = null;
                    return;
                }
                class430.field6193 = 3;
            }
            if (!arg0) {
                field3555 = null;
            }
            if (class430.field6193 == 3 && class199.field2749.method1580(1031) >= 2) {
                int var2 = class199.field2749.method1591(0) << 8 | class199.field2749.method1591(0);
                class72.method485((byte) 91, var2);
                if (class393.field5755 == -1) {
                    class430.field6193 = 0;
                    class163.field2296 = 6;
                    class199.field2749.method1593(3);
                    class199.field2749 = null;
                } else {
                    class430.field6193 = 0;
                    class199.field2749.method1593(3);
                    class199.field2749 = null;
                    class5.method39(32343);
                }
            }
        } catch (IOException var3) {
            if (class199.field2749 != null) {
                class199.field2749.method1593(3);
                class199.field2749 = null;
            }
            if (class230.field3071 >= 1) {
                class163.field2296 = -4;
                class430.field6193 = 0;
            } else {
                if (class34.field530 == class232.field3140) {
                    class34.field530 = class188.field2616;
                } else {
                    class34.field530 = class232.field3140;
                }
                class430.field6193 = 1;
                class286.field3940 = 0;
                class230.field3071++;
            }
        }
    }
}
