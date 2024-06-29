import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class278 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4286 = 0;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4288 = 0;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[Z")
    public static boolean[] field4292 = new boolean[8];

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field4293 = 0;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1829(boolean arg0) {
        if (!arg0) {
            method1831(24);
        }
        field4292 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V", line = 18)
    public static final void method1830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class207 var7 = class276.method1812(true, arg3, arg0);
        field4291++;
        if (var7 != null && var7.field3278 != null) {
            class120 var8 = new class120();
            var8.field1845 = var7;
            var8.field1837 = var7.field3278;
            class122.method834((byte) 115, var8);
        }
        class197.field2954 = arg3;
        class310.field4920 = arg6;
        class161.field2499 = arg1;
        class133.field2097 = arg4;
        class253.field3934 = arg0;
        class139.field2150 = arg5;
        class120.field1841 = true;
        if (arg2 == 16925) {
            class277.method1822(4096, var7);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[Lfi;", line = 46)
    public static final class288[] method1831(int arg0) {
        field4294++;
        if (arg0 != -16) {
            return (class288[]) null;
        }
        if (class76.field1146 == null) {
            int var1 = 0;
            class288[] var2 = class24.method178(class89.field1359, (byte) 99);
            class288[] var3 = new class288[var2.length];
            label55: for (int var4 = 0; var4 < var2.length; var4++) {
                class288 var5 = var2[var4];
                if ((var5.field4411 <= 0 || var5.field4411 >= 24) && var5.field4414 >= 800 && var5.field4406 >= 600) {
                    for (int var6 = 0; var6 < var1; var6++) {
                        class288 var7 = var3[var6];
                        if (var5.field4414 == var7.field4414 && var5.field4406 == var7.field4406) {
                            if (var7.field4411 < var5.field4411) {
                                var3[var6] = var5;
                            }
                            continue label55;
                        }
                    }
                    var3[var1] = var5;
                    var1++;
                }
            }
            class76.field1146 = new class288[var1];
            class223.method1502(var3, 0, class76.field1146, 0, var1);
            int[] var8 = new int[class76.field1146.length];
            for (int var9 = 0; var9 < class76.field1146.length; var9++) {
                class288 var10 = class76.field1146[var9];
                var8[var9] = var10.field4414 * var10.field4406;
            }
            class143.method1005(var8, class76.field1146, -103);
        }
        return class76.field1146;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V", line = 134)
    public static final void method1832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4287++;
        class87.field1305[0].method159(arg1, arg5);
        if (arg0 != -15) {
            method1832(1, -13, -119, -34, 100, -21);
        }
        class87.field1305[1].method159(arg1, arg4 + arg5 - 16);
        int var6 = (arg4 - 32) * arg4 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg2 / (arg3 - arg4);
        if (!class333.field5166) {
            class57.method375(arg1, arg5 + 16, 16, arg4 - 32, class120.field1839);
            class57.method375(arg1, arg5 + var7 + 16, 16, var6, class291.field4500);
            class57.method389(arg1, arg5 + var7 + 16, var6, class293.field4515);
            class57.method389(arg1 + 1, arg5 - -16 + var7, var6, class293.field4515);
            class57.method385(arg1, arg5 + var7 + 16, 16, class293.field4515);
            class57.method385(arg1, arg5 + var7 + 17, 16, class293.field4515);
            class57.method389(arg1 + 15, arg5 + 16 + var7, var6, class269.field4152);
            class57.method389(arg1 + 14, var7 + 17 + arg5, var6 - 1, class269.field4152);
            class57.method385(arg1, arg5 + var6 + var7 + 15, 16, class269.field4152);
            class57.method385(arg1 + 1, arg5 - (-14 - var6) + var7, 15, class269.field4152);
            return;
        }
        class238.method1636(arg1, arg5 + 16, 16, arg4 - 32, class120.field1839);
        class238.method1636(arg1, arg5 + var7 + 16, 16, var6, class291.field4500);
        class238.method1637(arg1, arg5 + var7 + 16, var6, class293.field4515);
        class238.method1637(arg1 + 1, arg5 + var7 - -16, var6, class293.field4515);
        class238.method1626(arg1, arg5 + var7 + 16, 16, class293.field4515);
        class238.method1626(arg1, arg5 + var7 + 17, 16, class293.field4515);
        class238.method1637(arg1 + 15, arg5 + 16 + var7, var6, class269.field4152);
        class238.method1637(arg1 + 14, var7 + 17 + arg5, var6 - 1, class269.field4152);
        class238.method1626(arg1, arg5 + var7 + var6 + 15, 16, class269.field4152);
        class238.method1626(arg1 + 1, arg5 + 14 + var6 + var7, 15, class269.field4152);
    }
}
