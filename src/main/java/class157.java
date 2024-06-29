import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class157 implements class557 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([IIJLlj;)Ljava/lang/String;")
    public final String method1095(int[] arg0, int arg1, long arg2, class570 arg3) {
        field2483++;
        if (class587.field7784 == arg3) {
            class676 var6 = class672.field9519.method3324((byte) 126, arg0[0]);
            return var6.method3781((int) arg2, (byte) -105);
        } else if (class191.field2806 == arg3 || class194.field2833 == arg3) {
            class577 var7 = class193.field2826.method1047((int) arg2, arg1 ^ 0xFFFFB55D);
            return var7.field7679;
        } else if (class702.field9895 == arg3 || class488.field6589 == arg3 || class384.field5120 == arg3) {
            return class672.field9519.method3324((byte) -38, arg0[0]).method3781((int) arg2, (byte) -115);
        } else {
            if (arg1 != 19106) {
                field2484 = 99;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I")
    public static final int method1096(byte arg0) {
        field2488++;
        if (arg0 != 95) {
            method1096((byte) -123);
        }
        return class201.field2935 == null ? 0 : class201.field2935.length * 2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public static final void method1097(int arg0, int arg1, int arg2) {
        class24 var3 = class703.field9899[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field396 != null) {
            var3.field396 = null;
        }
        if (var3.field413 != null) {
            var3.field413 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIIBIII)Z")
    public static final boolean method1098(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field2482++;
        int var9 = class199.field2897.field5643[0];
        int var10 = class199.field2897.field5649[0];
        if (var9 < 0 || class34.field530 <= var9 || var10 < 0 || class34.field531 <= var10) {
            return false;
        } else if (arg6 >= 0 && class34.field530 > arg6 && arg4 >= 0 && arg4 < class34.field531) {
            int var11 = class119.method933(var9, arg0, arg6, arg1, var10, arg2, 2, class591.field7820[class199.field2897.field8609], class199.field2897.method2317((byte) 40), arg7, arg4, arg3, arg8, class204.field2953, class629.field8482);
            if (arg5 != 105) {
                return false;
            } else if (var11 < 1) {
                return false;
            } else {
                class123.field2061 = class629.field8482[var11 - 1];
                class476.field6353 = class204.field2953[var11 - 1];
                class227.field3199 = false;
                class174.method1177(arg5 - 95);
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZI)V")
    public static final void method1099(int arg0, int arg1, boolean arg2, int arg3) {
        field2486++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -48001) {
            method1096((byte) -69);
        }
        class443.field6071 = arg1;
        class100.field1496 = arg3;
        class79.field1234 = arg2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lpe;")
    public static final class571 method1100(byte arg0, int arg1) {
        field2487++;
        class47[] var2 = class521.field6965;
        synchronized (class521.field6965) {
            class571 var3;
            if (arg1 >= class521.field6965.length || class521.field6965[arg1].method330(3)) {
                var3 = new class571();
                var3.field7581 = new class552[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field7581[var4] = new class552();
                }
            } else {
                var3 = (class571) class521.field6965[arg1].method325(119);
                var3.method2787(false);
                int var10002 = class16.field240[arg1]--;
            }
            if (arg0 >= -100) {
                method1097(-83, 51, 44);
            }
            return var3;
        }
    }
}
