import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class17 extends class61 {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Z")
    public static volatile boolean field374 = true;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "[Ld;")
    public static class75[] field377 = new class75[27];

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Lij;")
    private static class50 field378 = class78.method578(126, "Loading config )2 ");

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "[S")
    public static short[] field379 = new short[500];

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "Lij;")
    public static class50 field383 = field378;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lwd;IIIIIIZZ)V")
    public static final void method131(class217 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        field384++;
        if (arg3 >= 0 && arg3 < 104 && arg5 >= 0 && arg5 < 104) {
            if (!arg8) {
                class210.field3495[arg2][arg3][arg5] = 0;
            }
            while (true) {
                int var9 = arg0.method1487(255);
                if (var9 == 0) {
                    if (arg8) {
                        class245.field4257[0][arg3][arg5] = class254.field4390[0][arg3][arg5];
                    } else if (arg2 == 0) {
                        class245.field4257[0][arg3][arg5] = -class204.method1376(94, arg3 + arg4 + 932731, arg5 + 556238 + arg6) * 8;
                    } else {
                        class245.field4257[arg2][arg3][arg5] = class245.field4257[arg2 - 1][arg3][arg5] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg0.method1487(255);
                    if (arg8) {
                        class245.field4257[0][arg3][arg5] = class254.field4390[0][arg3][arg5] + (var10 * 8);
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg2 == 0) {
                            class245.field4257[0][arg3][arg5] = -var10 * 8;
                        } else {
                            class245.field4257[arg2][arg3][arg5] = class245.field4257[arg2 - 1][arg3][arg5] - var10 * 8;
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class102.field1869[arg2][arg3][arg5] = arg0.method1444((byte) -97);
                    class186.field3056[arg2][arg3][arg5] = (byte) ((var9 - 2) / 4);
                    class130.field2280[arg2][arg3][arg5] = (byte) class51.method413(arg1 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class203.field3383[arg2][arg3][arg5] = (byte) (var9 - 81);
                } else if (!arg8) {
                    class210.field3495[arg2][arg3][arg5] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg0.method1487(255);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg0.method1487(255);
                    break;
                }
                if (var11 <= 49) {
                    arg0.method1487(255);
                }
            }
        }
        if (!arg7) {
            field378 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)J")
    public static final long method132(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        return var3 == null || var3.field1251 == null ? 0L : var3.field1251.field1868;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method133(int arg0) {
        field377 = null;
        if (arg0 != -1) {
            method132(-94, 122, 91);
        }
        field383 = null;
        field379 = null;
        field378 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLda;)Lek;")
    public static final class169 method134(int arg0, byte arg1, class22 arg2) {
        field380++;
        if (class182.method1237((byte) 43, arg0, arg2)) {
            int var3 = 39 % ((arg1 + 53) / 55);
            return class132.method930(22675);
        } else {
            return null;
        }
    }
}
