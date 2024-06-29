import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class71 extends class98 {

    @OriginalMember(owner = "client!jv", name = "F", descriptor = "J")
    public static long field893 = 0L;

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
    public static int field896 = 0;

    @OriginalMember(owner = "client!jv", name = "M", descriptor = "[I")
    public static int[] field900 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!jv", name = "G", descriptor = "Z")
    public static boolean field894 = false;

    @OriginalMember(owner = "client!jv", name = "H", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!jv", name = "J", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!jv", name = "N", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!jv", name = "P", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!jv", name = "Q", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!jv", name = "K", descriptor = "Lsba;")
    private class200 field898;

    @OriginalMember(owner = "client!jv", name = "E", descriptor = "Lpca;")
    public static class665 field892;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 3)
    public final String method725(String arg0, int arg1, byte arg2) {
        field901++;
        if (this.field898 == null) {
            return arg0;
        } else {
            int var4 = 22 / ((46 - arg2) / 43);
            class420 var5 = (class420) this.field898.method1558((long) arg1, (byte) -93);
            return var5 == null ? arg0 : var5.field6425;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 22)
    public static void method726(int arg0) {
        field900 = null;
        if (arg0 != 7578) {
            field900 = null;
        }
        field892 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIZ)Z", line = 38)
    public static final boolean method727(int arg0, int arg1, boolean arg2) {
        field897++;
        return arg2 ? true : (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIZII)V", line = 54)
    public static final void method728(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field895++;
        if (class476.field7061 != null && (arg2 != 3 || class17.field282.field4896 != arg5 || class17.field282.field4857 != arg4)) {
            class405.method2595(class402.field6207, 2, class476.field7061);
            class476.field7061 = null;
        }
        if (arg2 == 3 && class476.field7061 == null) {
            class476.field7061 = class515.method3121(arg4, 0, arg5, class402.field6207, 0, arg0 - 2);
            if (class476.field7061 != null) {
                class17.field282.field4857 = arg4;
                class17.field282.field4896 = arg5;
                class17.field282.method2094(false, class402.field6207);
            }
        }
        if (arg2 == 3 && class476.field7061 == null) {
            method728(2, arg1, class17.field282.field4865, true, -1, -1);
            return;
        }
        Container var6;
        if (class476.field7061 != null) {
            class101.field1659 = arg4;
            var6 = class476.field7061;
            class235.field3727 = arg5;
        } else if (class598.field8470 == null) {
            if (class450.field6772 == null) {
                var6 = class64.field825;
            } else {
                var6 = class450.field6772;
            }
            class235.field3727 = var6.getSize().width;
            class101.field1659 = var6.getSize().height;
        } else {
            Insets var7 = class598.field8470.getInsets();
            int var10001 = var7.right + var7.left;
            class235.field3727 = class598.field8470.getSize().width - var10001;
            int var10 = -var7.top;
            class101.field1659 = class598.field8470.getSize().height + var10 - var7.bottom;
            var6 = class598.field8470;
        }
        if (arg2 == 1) {
            class425.field6468 = 0;
            class56.field732 = class585.field8333;
            class290.field4596 = (class235.field3727 - class585.field8333) / 2;
            class259.field4147 = class95.field1487;
        } else {
            class255.method1805((byte) -126);
        }
        if (class660.field9192 != class182.field3060) {
            boolean var10000;
            if (class56.field732 < 1024 && class259.field4147 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class507.method3079(2);
        } else {
            class271.field4377.setSize(class56.field732, class259.field4147);
            class627.field8857.method291(class271.field4377);
            if (class598.field8470 == var6) {
                Insets var8 = class598.field8470.getInsets();
                class271.field4377.setLocation(class290.field4596 + var8.left, var8.top - -class425.field6468);
            } else {
                class271.field4377.setLocation(class290.field4596, class425.field6468);
            }
        }
        if (arg2 >= 2) {
            class129.field2120 = true;
        } else {
            class129.field2120 = false;
        }
        if (class528.field7706 != -1) {
            class351.method2359((byte) 65, true);
        }
        if (class499.field7329 != null && class650.method3744(arg0 ^ 0xFFFFFFF1, class682.field9564)) {
            class695.method3924(true);
        }
        if (arg0 != 2) {
            method726(-12);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class532.field7753[var9] = true;
        }
        class245.field3910 = true;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lie;B)V", line = 181)
    public final void method729(class6 arg0, byte arg1) {
        field902++;
        while (true) {
            int var3 = arg0.method70(-9059);
            if (var3 == 0) {
                if (arg1 == -82) {
                    return;
                } else {
                    field899 = -15;
                    return;
                }
            }
            this.method731(var3, -2, arg0);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(III)I", line = 212)
    public final int method730(int arg0, int arg1, int arg2) {
        if (arg0 != 3) {
            return 20;
        }
        field903++;
        if (this.field898 == null) {
            return arg1;
        } else {
            class160 var4 = (class160) this.field898.method1558((long) arg2, (byte) -93);
            return var4 == null ? arg1 : var4.field2728;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILie;)V", line = 237)
    private final void method731(int arg0, int arg1, class6 arg2) {
        if (arg1 != -2) {
            method726(-30);
        }
        field904++;
        if (arg0 != 249) {
            return;
        }
        int var4 = arg2.method70(-9059);
        if (this.field898 == null) {
            int var5 = class413.method2636(var4, arg1 ^ 0xFFFFFF81);
            this.field898 = new class200(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method70(-9059) == 1;
            int var8 = arg2.method86(-31);
            class66 var9;
            if (var7) {
                var9 = new class420(arg2.method42((byte) -96));
            } else {
                var9 = new class160(arg2.method72(-46));
            }
            this.field898.method1564((long) var8, var9, (byte) 90);
        }
    }
}
