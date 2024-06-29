import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class237 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
    public static int[] field3947 = new int[5];

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 12)
    public static void method1641(int arg0) {
        field3947 = null;
        if (arg0 <= 0) {
            field3944 = -70;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIII)Z", line = 30)
    public static final boolean method1642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lfk;I)V", line = 67)
    public static final void method1643(class40 arg0, int arg1) {
        field3945++;
        class31 var2 = null;
        class79.field1291 = 3;
        class20.method110(true, true);
        class63.field959 = false;
        class304.field5199 = true;
        class314.field5328 = true;
        class9.field133 = 0;
        class229.field3788 = true;
        class190.field3048 = true;
        class136.field2259 = true;
        class293.field5023 = 0;
        class136.field2262 = true;
        class250.field4222 = 0;
        class301.field5169 = 127;
        class298.field5094 = true;
        class25.field392 = 127;
        class264.field4469 = 0;
        class13.field176 = 2;
        class289.field4979 = 0;
        class114.field1921 = true;
        class143.field2392 = true;
        class258.field4390 = true;
        class184.field2963 = 255;
        class150.field2546 = true;
        try {
            class169 var3 = arg0.method235(false, "runescape");
            while (var3.field2833 == 0) {
                class137.method1027(1L, 0);
            }
            if (var3.field2833 == 1) {
                var2 = (class31) var3.field2832;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method179(0)];
                while (var5.length > var4) {
                    int var6 = var2.method182(var5.length - var4, var5, var4, false);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class47.method282((byte) -114, new class70(var5));
            }
            if (arg1 >= -6) {
                field3944 = 116;
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method177((byte) -86);
            }
        } catch (Exception var9) {
        }
    }
}
