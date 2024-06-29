import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class217 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1463(int arg0, int arg1, int arg2, int arg3) {
        field3259++;
        class28.field398.method169(arg1, arg0, arg3, class490.field7032);
        int var4 = class490.field7032[2];
        if (arg2 != 11420) {
            method1465(92, -41, -62);
        }
        if (var4 < 50) {
            return false;
        } else {
            class490.field7032[1] = class490.field7032[1] * class452.field6505 / var4 + class683.field9717;
            class490.field7032[0] = class490.field7032[0] * class314.field4356 / var4 + class520.field7673;
            class490.field7032[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method1464(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field3260++;
        if (class520.field7670 == null) {
            return;
        }
        if (class520.field7670.field8787 == 1) {
            class520.field7670 = null;
            return;
        }
        if (class520.field7670.field8787 == 2) {
            class660.method3715((byte) 106, class573.field8422, 2, class608.field8737);
            class520.field7670 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public static final void method1465(int arg0, int arg1, int arg2) {
        field3258++;
        if ((class161.field2616 < class161.field2614)) {
            class161.field2616 = (float) ((double) class161.field2616 / 30.0D + (double) class161.field2616);
            if (class161.field2614 < class161.field2616) {
                class161.field2616 = class161.field2614;
            }
            class105.method881((byte) 124);
            class161.field2617 = (int) class161.field2616 >> 1;
            class161.field2613 = class322.method1925(2, class161.field2617);
        } else if (class161.field2614 < class161.field2616) {
            class161.field2616 = (float) ((double) class161.field2616 - (double) class161.field2616 / 30.0D);
            if (class161.field2614 > class161.field2616) {
                class161.field2616 = class161.field2614;
            }
            class105.method881((byte) -88);
            class161.field2617 = (int) class161.field2616 >> 1;
            class161.field2613 = class322.method1925(2, class161.field2617);
        }
        if (arg0 != -31578) {
            method1464(21);
        }
        if (class34.field480 != -1 && class371.field5147 != -1) {
            int var3 = class34.field480 - class404.field5808;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class371.field5147 - class438.field6298;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class404.field5808 += var3;
            class438.field6298 += var4;
            if (var3 == 0 && var4 == 0) {
                class371.field5147 = -1;
                class34.field480 = -1;
            }
            class105.method881((byte) 125);
        }
        if (class440.field6371 > 0) {
            class106.field1751--;
            if (class106.field1751 == 0) {
                class106.field1751 = 100;
                class440.field6371--;
            }
        } else {
            class530.field7820 = -1;
            class277.field3924 = -1;
        }
        if (!class88.field1300 || class521.field7684 == null) {
            return;
        }
        for (class436 var5 = (class436) class521.field7684.method3905(-114); var5 != null; var5 = (class436) class521.field7684.method3899(0)) {
            class30 var6 = class161.field2609.method2837(var5.field6280.field954, arg0 ^ 0x7B04);
            if (var5.method2556(arg1, -101, arg2)) {
                if (var6.field413 != null) {
                    if (var6.field413[4] != null) {
                        class476.method2787(var6.field444, (long) var5.field6280.field954, -1, 0, true, (byte) -26, var6.field413[4], 1012, var6.field434, false, -1);
                    }
                    if (var6.field413[3] != null) {
                        class476.method2787(var6.field444, (long) var5.field6280.field954, -1, 0, true, (byte) -26, var6.field413[3], 1002, var6.field434, false, -1);
                    }
                    if (var6.field413[2] != null) {
                        class476.method2787(var6.field444, (long) var5.field6280.field954, -1, 0, true, (byte) -26, var6.field413[2], 1007, var6.field434, false, -1);
                    }
                    if (var6.field413[1] != null) {
                        class476.method2787(var6.field444, (long) var5.field6280.field954, -1, 0, true, (byte) -26, var6.field413[1], 1010, var6.field434, false, -1);
                    }
                    if (var6.field413[0] != null) {
                        class476.method2787(var6.field444, (long) var5.field6280.field954, -1, 0, true, (byte) -26, var6.field413[0], 1006, var6.field434, false, -1);
                    }
                }
                if (!var5.field6280.field947) {
                    var5.field6280.field947 = true;
                    class362.method2169(class564.field8234, var5.field6280.field954, var6.field444);
                }
                if (var5.field6280.field947) {
                    class362.method2169(class264.field3792, var5.field6280.field954, var6.field444);
                }
            } else if (var5.field6280.field947) {
                var5.field6280.field947 = false;
                class362.method2169(class425.field6055, var5.field6280.field954, var6.field444);
            }
        }
    }
}
