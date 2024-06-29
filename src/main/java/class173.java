import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class173 extends class391 {

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    private int field2635;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    private int field2634;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    private int field2630;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field2638 = 1339;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field2636 = 0;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Lap;")
    public static class310 field2640 = new class310(23, 12);

    @OriginalMember(owner = "client!f", name = "v", descriptor = "[I")
    public static int[] field2641 = new int[2];

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lnl;")
    public static class435 field2642;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(III)V", line = 6)
    public final void method1254(int arg0, int arg1, int arg2) {
        if (arg2 <= 120) {
            field2636 = -127;
        }
        ++field2631;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V", line = 16)
    public final void method1255(int arg0, int arg1, int arg2) {
        int var4 = -3 % ((-42 - arg2) / 37);
        ++field2633;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(III)V", line = 29)
    public final void method1256(int arg0, int arg1, int arg2) {
        ++field2632;
        int var4 = this.field2630 * arg2 >> 12;
        int var5 = this.field2629 * arg2 >> 12;
        int var6 = this.field2634 * arg1 >> 12;
        int var7 = this.field2635 * arg1 >> 12;
        if (arg0 == 9329) {
            class371.method2266(var4, var6, var5, -17232, super.field5406, var7);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIII)V", line = 50)
    public class173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2629 = arg2;
        this.field2635 = arg3;
        this.field2634 = arg1;
        this.field2630 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 63)
    public static void method1257(int arg0) {
        if (arg0 > -102) {
            method1257(17);
        }
        field2641 = null;
        field2642 = null;
        field2640 = null;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V", line = 94)
    public static final void method1258(int arg0) {
        if (arg0 >= 15) {
            ++field2637;
            if (class73.field1043 != null) {
                if (~class73.field1043.field3979 == -2) {
                    class73.field1043 = null;
                    return;
                }
                if (~class73.field1043.field3979 == -3) {
                    class349.method2161(class394.field5438, 12241, 2, class130.field1783);
                    class73.field1043 = null;
                    return;
                }
            }
        }
    }
}
