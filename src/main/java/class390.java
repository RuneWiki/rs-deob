import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class390 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field5593 = -2;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "J")
    public long field5600;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lpf;")
    public static class348 field5596;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lpl;")
    public class390 field5597;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lpl;")
    public class390 field5601;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 7)
    public final void method2467(byte arg0) {
        field5598++;
        if (this.field5601 == null) {
            return;
        }
        this.field5601.field5597 = this.field5597;
        int var2 = 119 % ((4 - arg0) / 59);
        this.field5597.field5601 = this.field5601;
        this.field5597 = null;
        this.field5601 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V", line = 30)
    public static final void method2468(int arg0, int arg1, int arg2) {
        if (arg2 >= -31) {
            return;
        }
        field5599++;
        if (class269.field3751 != arg0) {
            class296.field4148 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class296.field4148[var3] = (var3 << 12) / arg0;
            }
            class343.field4677 = arg0 - 1;
            class269.field3751 = arg0;
            class191.field2634 = arg0 * 32;
        }
        if (class413.field5862 == arg1) {
            return;
        }
        if (class269.field3751 == arg1) {
            class277.field3873 = class296.field4148;
        } else {
            class277.field3873 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class277.field3873[var4] = (var4 << 12) / arg1;
            }
        }
        class413.field5862 = arg1;
        class123.field1710 = arg1 - 1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 78)
    public static void method2469(int arg0) {
        int var1 = -116 / ((arg0 - 29) / 49);
        field5596 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)Z", line = 89)
    public final boolean method2470(byte arg0) {
        field5595++;
        int var2 = -89 / ((-arg0 - 41) / 61);
        return this.field5601 != null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIZIIZ)V", line = 105)
    public static final void method2471(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field5594++;
        if (arg1 < arg2) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg1;
            class437 var9 = class198.field2753[var7];
            class198.field2753[var7] = class198.field2753[arg2];
            class198.field2753[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (class46.method409(arg6, 23590, class198.field2753[var10], arg3, var9, arg4, arg0) <= 0) {
                    class437 var11 = class198.field2753[var10];
                    class198.field2753[var10] = class198.field2753[var8];
                    class198.field2753[var8++] = var11;
                }
            }
            class198.field2753[arg2] = class198.field2753[var8];
            class198.field2753[var8] = var9;
            method2471(arg0, arg1, var8 - 1, arg3, arg4, 2, arg6);
            method2471(arg0, var8 + 1, arg2, arg3, arg4, 2, arg6);
        }
        if (arg5 != 2) {
            method2471(-80, -83, -35, false, -50, 2, true);
        }
    }
}
