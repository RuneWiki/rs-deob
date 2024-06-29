import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class219 {

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Z")
    public static boolean field3797 = false;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field3796 = 0;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[I")
    public static int[] field3800 = new int[5];

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lhi;")
    public static class82 field3805 = class95.method664((byte) -78, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lnb;")
    public static class125 field3803;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Z")
    public static boolean field3799;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 5)
    public static void method1549(byte arg0) {
        field3805 = null;
        if (arg0 >= 42) {
            field3800 = null;
            field3803 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1550(int arg0) {
        field3793++;
        if (class67.field1048 != null) {
            class67.field1048.method758((byte) -53);
        }
        if (class142.field2435 != null) {
            class142.field2435.method758((byte) -14);
        }
        class305.method2108(22050, true, class308.field5238, 2);
        class67.field1048 = class256.method1829(22050, (byte) 28, class55.field881, class122.field2134, 0);
        class67.field1048.method753(class166.field2901, (byte) 18);
        class142.field2435 = class256.method1829(2048, (byte) 28, class55.field881, class122.field2134, 1);
        class142.field2435.method753(field3803, (byte) 18);
        if (arg0 != 64) {
            method1551(110, -12, 46, (byte) 91, -118, -82);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIBII)V", line = 45)
    public static final void method1551(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= (arg1 + arg4); var6++) {
            for (int var7 = arg0; var7 <= (arg0 + arg5); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class255.field4389[arg2][var7][var6] = 127;
                }
            }
        }
        field3794++;
        for (int var8 = arg1; var8 < (arg1 + arg4); var8++) {
            for (int var9 = arg0; var9 < arg0 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class245.field4255[arg2][var9][var8] = arg2 > 0 ? class245.field4255[arg2 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class245.field4255[arg2][arg0][var10] = class245.field4255[arg2][arg0 - 1][var10];
                }
            }
        }
        if (arg3 < 34) {
            field3805 = (class82) null;
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var11 = arg0 + 1; var11 < arg0 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class245.field4255[arg2][var11][arg1] = class245.field4255[arg2][var11][arg1 - 1];
                }
            }
        }
        if (arg0 < 0 || arg1 < 0 || arg0 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 > 0 && class245.field4255[arg2][arg0 - 1][arg1] != 0) {
                class245.field4255[arg2][arg0][arg1] = class245.field4255[arg2][arg0 - 1][arg1];
            } else if (arg1 > 0 && class245.field4255[arg2][arg0][arg1 - 1] != 0) {
                class245.field4255[arg2][arg0][arg1] = class245.field4255[arg2][arg0][arg1 - 1];
            } else if (arg0 > 0 && arg1 > 0 && class245.field4255[arg2][arg0 - 1][arg1 - 1] != 0) {
                class245.field4255[arg2][arg0][arg1] = class245.field4255[arg2][arg0 - 1][arg1 - 1];
            }
        } else if (arg0 > 0 && class245.field4255[arg2 - 1][arg0 - 1][arg1] != class245.field4255[arg2][arg0 - 1][arg1]) {
            class245.field4255[arg2][arg0][arg1] = class245.field4255[arg2][arg0 - 1][arg1];
        } else if (arg1 > 0 && class245.field4255[arg2 - 1][arg0][arg1 - 1] != class245.field4255[arg2][arg0][arg1 - 1]) {
            class245.field4255[arg2][arg0][arg1] = class245.field4255[arg2][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && class245.field4255[arg2 - 1][arg0 - 1][arg1 - 1] != class245.field4255[arg2][arg0 - 1][arg1 - 1]) {
            class245.field4255[arg2][arg0][arg1] = class245.field4255[arg2][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 169)
    public static final void method1552(int arg0) {
        field3801++;
        if (arg0 != 1) {
            method1550(97);
        }
        if (class209.field3670 != null) {
            class308.method2128(true, class209.field3670);
            class209.field3670 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIB)V", line = 187)
    public static final void method1553(int arg0, int arg1, byte arg2) {
        if (arg2 < 46) {
            method1552(-21);
        }
        field3795++;
        if (class54.field858 != arg1) {
            class24.field329 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class24.field329[var3] = (var3 << 12) / arg1;
            }
            class65.field1024 = arg1 - 1;
            class54.field858 = arg1;
            class131.field2278 = arg1 == 64 ? 2048 : 4096;
        }
        if (class133.field2294 == arg0) {
            return;
        }
        if (class54.field858 == arg0) {
            class273.field4607 = class24.field329;
        } else {
            class273.field4607 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class273.field4607[var4] = (var4 << 12) / arg0;
            }
        }
        class209.field3684 = arg0 - 1;
        class133.field2294 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIILrm;IJ)Z", line = 238)
    public static final boolean method1554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class175 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class323.method2231(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
