import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class360 {

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field4834 = 100;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "Z")
    public static boolean field4833 = false;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIB)Z", line = 10)
    public static final boolean method2113(int arg0, int arg1, byte arg2) {
        field4835++;
        int var3 = 23 % ((arg2 - 8) / 61);
        return class458.method2628(true, arg1, arg0) || class615.method3420(arg1, arg0, 5225);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(FIFI[BFFFLvaa;IIIII)V", line = 24)
    public static final void method2114(float arg0, int arg1, float arg2, int arg3, byte[] arg4, float arg5, float arg6, float arg7, class265 arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field4836++;
        int var14 = arg3 * arg11;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg9; var16++) {
            arg8.method711(0, arg3, arg6 / (float) arg3, arg13, arg11, arg0 / (float) arg11, var15, arg1 ^ 0x2ADE, arg5 / (float) arg13, arg7 * 127.0F, arg12);
            int var19 = arg10;
            arg0 *= 2.0F;
            arg6 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg4[var19] = (byte) ((int) ((float) arg4[var19] + var15[var20]));
                var19++;
            }
            arg5 *= 2.0F;
            arg7 = arg2 * arg7;
        }
        if (arg1 != 127) {
            method2114(-0.6552184F, -39, -0.17009696F, -32, null, 2.4238904F, -0.40658557F, -0.002544979F, null, -99, -77, -121, 6, -7);
        }
        int var17 = arg10;
        for (int var18 = 0; var18 < var14; var18++) {
            arg4[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 75)
    public static final int method2115(int arg0, String arg1, int arg2) {
        field4837++;
        if (arg2 < 5) {
            field4834 = -71;
        }
        return class252.method1476(true, arg1, arg0, true);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)[Lwd;", line = 90)
    public static final class357[] method2116(byte arg0) {
        int var1 = 24 / ((arg0 - 10) / 48);
        field4832++;
        return new class357[] { class470.field6745, class430.field6099, class485.field6990, class221.field2717, class243.field3001, class407.field5436, class314.field3899, class647.field9131, class61.field628, class299.field3723, class71.field695, class362.field4853, class591.field8345, class361.field4843 };
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lqg;", line = 103)
    public static final class216 method2117(int arg0, int arg1) {
        if (arg1 != 8919) {
            return null;
        }
        field4831++;
        class216[] var2 = class127.method724(arg1 - 8919);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class216 var4 = var2[var3];
            if (var4.field2609 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lmga;I)Lmga;")
    public abstract class691 method2112(class691 arg0, int arg1);
}
