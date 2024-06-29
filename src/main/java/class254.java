import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class254 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "F")
    public static float field4045 = 0.0F;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Laga;")
    public static class618 field4046;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
    public static int[] field4047;

    @OriginalMember(owner = "client!ja", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field4044++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I", line = 17)
    public final int method1799(int arg0, int arg1, int arg2) {
        field4050++;
        int var4 = class56.field732 > arg2 ? class56.field732 : arg2;
        if (class250.field4005 == this) {
            return 0;
        }
        int var5 = 121 / ((-arg0 - 57) / 52);
        if (class563.field8093 == this) {
            return var4 - arg1;
        } else if (class219.field3576 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFFI)I", line = 41)
    public static final int method1800(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 >= -105) {
            return -115;
        }
        field4048++;
        float var4 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return (arg1 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg0 > 0.0F ? 2 : 3;
        } else if ((arg2 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIB[BI)V", line = 93)
    public static final void method1801(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        field4049++;
        if (arg1 <= arg0) {
            return;
        }
        int var6 = arg0 + arg2;
        int var7 = arg1 - arg0 >> 2;
        if (arg3 != 82) {
            method1800(0.99605477F, 0.07846647F, -0.051514756F, -111);
        }
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg1 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 122)
    public static void method1802(byte arg0) {
        if (arg0 != -25) {
            field4045 = -0.51355946F;
        }
        field4047 = null;
        field4046 = null;
    }
}
