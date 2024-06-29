import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class403 extends class216 {

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field5569;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public int field5570;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field5565;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "[Lbm;")
    public static class325[] field5567 = new class325[4];

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5566 = new String[100];

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field5563 = new String[100];

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5562;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(Z)V", line = 6)
    public static void method2490(boolean arg0) {
        if (arg0) {
            field5562 = null;
            field5567 = null;
            field5563 = null;
            field5566 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JB)V", line = 24)
    public static final void method2491(long arg0, byte arg1) {
        field5572++;
        class88.field1232.field5048 = 0;
        class88.field1232.method2280(21, 1537846408);
        class88.field1232.method2256(arg0, 64);
        class445.field6240 = 0;
        class123.field1850 = 0;
        if (arg1 < 103) {
            method2492((class419) null, true);
        }
        class284.field3868 = 1;
        class436.field6158 = -3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lrd;Z)I", line = 46)
    public static final int method2492(class419 arg0, boolean arg1) {
        field5571++;
        class233 var2 = arg0.field5807;
        if (var2.field3327 != null) {
            var2 = var2.method1524((byte) 126);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1) {
            field5566 = null;
        }
        int var3 = var2.field3281;
        class60 var4 = arg0.method1283((byte) 119);
        if (arg0.field2597) {
            var3 = var2.field3298;
        } else if (arg0.field2587 == var4.field765 || arg0.field2587 == var4.field782 || arg0.field2587 == var4.field786 || arg0.field2587 == var4.field769) {
            var3 = var2.field3314;
        } else if (arg0.field2587 == var4.field770 || arg0.field2587 == var4.field806 || arg0.field2587 == var4.field814 || arg0.field2587 == var4.field802) {
            var3 = var2.field3293;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILij;)V", line = 94)
    public static final void method2493(int arg0, class316 arg1) {
        if (arg0 != 100) {
            field5562 = null;
        }
        field5568++;
        class43.field574 = arg1;
        class232.field3263 = class43.field574.method1934((byte) 28, 4);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIII)V", line = 106)
    public class403(int arg0, int arg1, int arg2, int arg3) {
        this.field5569 = arg1;
        this.field5570 = arg3;
        this.field5565 = arg2;
        this.field5561 = arg0;
    }
}
