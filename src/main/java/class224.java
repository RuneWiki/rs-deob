import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class224 {

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public int field2897;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Lup;")
    public static class277 field2894;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBI)Z", line = 12)
    public static final boolean method1272(int arg0, byte arg1, int arg2) {
        if (arg1 >= -87) {
            field2894 = null;
        }
        field2893++;
        return class489.method2751(arg2, 16, arg0) & class296.method1769(arg0, arg2, 2048);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1273(byte arg0) {
        field2890++;
        if (arg0 > -74) {
            return;
        }
        for (int var1 = 0; var1 < class84.field1169; var1++) {
            int var2 = class665.field9261[var1];
            class706 var3 = (class706) class681.field9475.method2552((long) var2, -1);
            if (var3 != null) {
                class215 var4 = var3.field9890;
                class692.method3902(var4, var4.field2589.field3619, -12212);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lnt;Z)Z", line = 59)
    public final boolean method1274(class224 arg0, boolean arg1) {
        field2896++;
        if (this.field2886 == arg0.field2886 && this.field2888 == arg0.field2888 && this.field2892 == arg0.field2892) {
            return true;
        } else {
            if (!arg1) {
                method1276(64, 32, 21, 60);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIB)V", line = 74)
    public static final void method1275(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -93 / ((46 - arg4) / 45);
        field2885++;
        int var6 = class724.field10114;
        if (var6 == 0) {
            return;
        }
        if (var6 == 1) {
            class724.field10114 = 2;
            class504.field6851 = arg1;
            class130.field1683 = arg0;
            class590.field8236 = arg2;
            class234.field3049 = arg3;
        } else if (var6 == 2) {
            if (arg2 > class590.field8236) {
                class590.field8236 = arg2;
            }
            if (arg0 > class130.field1683) {
                class130.field1683 = arg0;
            }
            if (arg3 < class234.field3049) {
                class234.field3049 = arg3;
            }
            if (class504.field6851 > arg1) {
                class504.field6851 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V", line = 133)
    public static final void method1276(int arg0, int arg1, int arg2, int arg3) {
        field2887++;
        if (class689.field9653 == arg0 && class581.field8134 == arg2 && class582.field8158 == arg1) {
            return;
        }
        class689.field9653 = arg0;
        class581.field8134 = arg2;
        class315.field4252 = true;
        class582.field8158 = arg1;
        double var4 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class302.field4083 = -var10 * var12;
        class572.field8053 = var14;
        class721.field10081 = var10 * var14;
        class275.field3675 = var8 * var12;
        class242.field3147 = 0.0D;
        if (arg3 == 25980) {
            class161.field2029 = var10;
            class376.field5222 = var12;
            class247.field3208 = var8;
            class412.field5822 = -var8 * var14;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 194)
    public static void method1277(int arg0) {
        field2894 = null;
        if (arg0 != 0) {
            field2894 = null;
        }
    }
}
