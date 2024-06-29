import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class296 {

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Z")
    public static boolean field4689 = false;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lek;")
    public static class220 field4687;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lkh;")
    public static class251 field4688;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[[[B")
    public static byte[][][] field4685;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[[[I")
    public static int[][][] field4683;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 13)
    public static void method2113(int arg0) {
        field4688 = null;
        field4687 = null;
        if (arg0 < -82) {
            field4683 = (int[][][]) null;
            field4685 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Loe;", line = 27)
    public static final class225 method2114(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3364;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)I", line = 37)
    public static final int method2115(boolean arg0) {
        field4682++;
        return arg0 ? -84 : 15;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIIZIILjj;III)V", line = 55)
    public static final void method2116(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class44 arg8, int arg9, int arg10, int arg11) {
        if (arg6 > -112) {
            method2113(-96);
        }
        field4686++;
        if (arg11 < 0 || arg11 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var14 = arg8.method286((byte) -89);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg8.method286((byte) -85);
                    break;
                }
                if (var14 <= 49) {
                    arg8.method286((byte) -64);
                }
            }
            return;
        }
        if (!arg0 && !arg5) {
            class129.field2025[arg3][arg11][arg1] = 0;
        }
        while (true) {
            int var12 = arg8.method286((byte) -120);
            if (var12 == 0) {
                if (arg0) {
                    class110.field1642[0][arg11 + arg2][arg1 + arg9] = class97.field1380[0][arg2 + arg11][arg1 + arg9];
                } else if (arg3 == 0) {
                    class110.field1642[0][arg2 + arg11][arg1 + arg9] = -class261.method1865(-106, arg7 + 932731, 556238 - -arg10) * 8;
                } else {
                    class110.field1642[arg3][arg11 + arg2][arg1 + arg9] = class110.field1642[arg3 - 1][arg2 + arg11][arg1 + arg9] - 240;
                }
                break;
            }
            if (var12 == 1) {
                int var13 = arg8.method286((byte) -100);
                if (arg0) {
                    class110.field1642[0][arg2 + arg11][arg1 + arg9] = class97.field1380[0][arg2 + arg11][arg1 + arg9] + (var13 * 8);
                } else {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg3 == 0) {
                        class110.field1642[0][arg11 + arg2][arg1 + arg9] = -var13 * 8;
                    } else {
                        class110.field1642[arg3][arg2 + arg11][arg1 + arg9] = class110.field1642[arg3 - 1][arg11 + arg2][arg1 + arg9] - var13 * 8;
                    }
                }
                break;
            }
            if (var12 > 49) {
                if (var12 > 81) {
                    if (!arg5) {
                        class180.field2987[arg3][arg11][arg1] = (byte) (var12 - 81);
                    }
                } else if (!arg0 && !arg5) {
                    class129.field2025[arg3][arg11][arg1] = (byte) (var12 - 49);
                }
            } else if (arg5) {
                arg8.method286((byte) -121);
            } else {
                class145.field2259[arg3][arg11][arg1] = arg8.method246((byte) -84);
                field4685[arg3][arg11][arg1] = (byte) ((var12 - 2) / 4);
                class199.field3240[arg3][arg11][arg1] = (byte) client.method767(arg4 + var12 - 2, 3);
            }
        }
    }
}
