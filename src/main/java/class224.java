import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class224 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method1504(int arg0) {
        class248.field4058.method200((byte) 85);
        int var1 = class248.field4058.method198(1, (byte) 0);
        field3771++;
        if (var1 == 0) {
            return;
        }
        int var2 = class248.field4058.method198(2, (byte) 0);
        if (var2 == 0) {
            class60.field1051[class292.field4664++] = 2047;
        } else if (arg0 == var2) {
            int var3 = class248.field4058.method198(3, (byte) 0);
            class273.field4378.method534(1, arg0 ^ 0xFFFFFFB7, var3);
            int var4 = class248.field4058.method198(1, (byte) 0);
            if (var4 == 1) {
                class60.field1051[class292.field4664++] = 2047;
            }
        } else if (var2 == 2) {
            if (class248.field4058.method198(1, (byte) 0) == 1) {
                int var6 = class248.field4058.method198(3, (byte) 0);
                class273.field4378.method534(2, -13, var6);
                int var7 = class248.field4058.method198(3, (byte) 0);
                class273.field4378.method534(2, 110, var7);
            } else {
                int var5 = class248.field4058.method198(3, (byte) 0);
                class273.field4378.method534(0, arg0 - 95, var5);
            }
            int var8 = class248.field4058.method198(1, (byte) 0);
            if (var8 == 1) {
                class60.field1051[class292.field4664++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class248.field4058.method198(1, (byte) 0);
            class176.field2886 = class248.field4058.method198(2, (byte) 0);
            int var10 = class248.field4058.method198(7, (byte) 0);
            int var11 = class248.field4058.method198(1, (byte) 0);
            if (var11 == 1) {
                class60.field1051[class292.field4664++] = 2047;
            }
            int var12 = class248.field4058.method198(7, (byte) 0);
            class273.field4378.method1949(var12, var9 == 1, var10, 32);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static final void method1505(int arg0) {
        field3770++;
        if (class132.field2303) {
            return;
        }
        class132.field2303 = true;
        int var1 = -36 / ((arg0 + 67) / 56);
        if (class173.field2852) {
            class195.field3151 = (float) ((int) class195.field3151 + 47 & 0xFFFFFFF0);
        } else {
            class158.field2659 += (12.0F - class158.field2659) / 2.0F;
        }
        class114.field2059 = true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIILtb;IJIIII)Z")
    public static final boolean method1506(int arg0, int arg1, int arg2, int arg3, class184 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class274.method1800(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public static final void method1507(int arg0, int arg1) {
        field3769++;
        if (~arg1 == arg0 || !class110.method766(-13786, arg1)) {
            return;
        }
        class46[] var2 = class115.field2068[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class46 var4 = var2[var3];
            if (var4.field651 != null) {
                class198 var5 = new class198();
                var5.field3204 = var4.field651;
                var5.field3205 = var4;
                class140.method983(false, var5, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLdl;)Ldl;")
    public static final class46 method1508(byte arg0, class46 arg1) {
        field3768++;
        if (arg0 >= -122) {
            return null;
        } else if (arg1.field660 == -1) {
            int var2 = arg1.field786 >>> 16;
            class154 var3 = new class154(class41.field607);
            for (class194 var4 = (class194) var3.method1053((byte) -18); var4 != null; var4 = (class194) var3.method1055((byte) -22)) {
                if (var4.field3128 == var2) {
                    return class108.method760(-29533, (int) var4.field1515);
                }
            }
            return null;
        } else {
            return class108.method760(-29533, arg1.field660);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)I")
    public static final int method1509(int arg0, int arg1) {
        field3772++;
        return arg1 == 2047 ? arg0 & 0xFF : 119;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLch;)Lch;")
    public abstract class93 method89(byte arg0, class93 arg1);
}
