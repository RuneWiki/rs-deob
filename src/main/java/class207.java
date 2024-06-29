import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class207 {

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Z")
    public boolean field2623 = true;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field2620 = 0;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "C")
    private char field2622;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Ljava/lang/String;")
    public String field2632;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "[I")
    public static int[] field2621;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILes;)V", line = 3)
    private final void method1244(int arg0, int arg1, class630 arg2) {
        field2624++;
        if (arg0 != -6) {
            this.method1245(-90);
        }
        if (arg1 == 1) {
            this.field2622 = class670.method3763((byte) 72, arg2.method3480(-20933));
        } else if (arg1 == 2) {
            this.field2627 = arg2.method3483(arg0 ^ 0xFFFFFFB2);
        } else if (arg1 == 4) {
            this.field2623 = false;
        } else if (arg1 == 5) {
            this.field2632 = arg2.method3500((byte) 117);
            return;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Z", line = 32)
    public final boolean method1245(int arg0) {
        if (arg0 == 0) {
            field2628++;
            return this.field2622 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIFIFII[FII)V", line = 44)
    public static final void method1246(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, int arg6, int arg7, float[] arg8, int arg9, int arg10) {
        int var11 = arg6 - arg2;
        int var12 = arg0 - arg9;
        field2630++;
        int var13 = arg4 - arg7;
        float var14 = arg8[2] * (float) var13 + arg8[1] * (float) var12 + arg8[0] * (float) var11;
        float var15 = arg8[5] * (float) var13 + arg8[arg10] * (float) var12 + arg8[3] * (float) var11;
        float var16 = arg8[8] * (float) var13 + arg8[7] * (float) var12 + arg8[6] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg5 != 1.0F) {
            var17 = arg5 * var17;
        }
        float var18 = var15 + arg3 + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class204.field2593 = var18;
        class273.field3444 = var17;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLes;)V", line = 94)
    public final void method1247(byte arg0, class630 arg1) {
        if (arg0 >= -77) {
            this.method1245(108);
        }
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                field2631++;
                return;
            }
            this.method1244(-6, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)V", line = 116)
    public static void method1248(boolean arg0) {
        field2621 = null;
        if (arg0) {
            field2629 = 59;
        }
    }
}
