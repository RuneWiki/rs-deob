import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class54 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field878 = -1;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field880 = 64;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field882 = 0;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field885 = "glow2:";

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field883 = "Attack";

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lpf;")
    public static class294 field877;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "[[B")
    public static byte[][] field884;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method369(int arg0) {
        class100.field1575 = null;
        field881++;
        class81.field1305 = null;
        class241.field3625 = null;
        if (arg0 != -12212) {
            method370(-121, (class248) null, true, -54, false, 27, 116, 49, (byte) 107, 75, 10, -106);
        }
        class288.field4315 = null;
        class212.field3179 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILfl;ZIZIIIBIII)V")
    public static final void method370(int arg0, class248 arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        field879++;
        int var12 = 1 % ((arg8 + 90) / 34);
        if (arg11 < 0 || arg11 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var15 = arg1.method1593((byte) 27);
                if (var15 == 0) {
                    return;
                }
                if (var15 == 1) {
                    arg1.method1593((byte) 27);
                    return;
                }
                if (var15 <= 49) {
                    arg1.method1593((byte) 27);
                }
            }
        }
        if (!arg2 && !arg4) {
            class221.field3333[arg7][arg11][arg5] = 0;
        }
        while (true) {
            int var13 = arg1.method1593((byte) 27);
            if (var13 == 0) {
                if (arg2) {
                    class67.field1072[0][arg3 + arg11][arg5 + arg9] = class297.field4695[0][arg3 + arg11][arg5 + arg9];
                    return;
                } else if (arg7 == 0) {
                    class67.field1072[0][arg3 + arg11][arg5 + arg9] = -class217.method1397(arg10 + 932731, 1, arg0 + 556238) * 8;
                    return;
                } else {
                    class67.field1072[arg7][arg11 + arg3][arg5 + arg9] = class67.field1072[arg7 - 1][arg3 + arg11][arg5 + arg9] - 240;
                    return;
                }
            }
            if (var13 == 1) {
                int var14 = arg1.method1593((byte) 27);
                if (arg2) {
                    class67.field1072[0][arg3 + arg11][arg5 + arg9] = var14 * 8 + class297.field4695[0][arg3 + arg11][arg5 + arg9];
                    return;
                }
                if (var14 == 1) {
                    var14 = 0;
                }
                if (arg7 != 0) {
                    class67.field1072[arg7][arg11 + arg3][arg5 + arg9] = class67.field1072[arg7 - 1][arg3 + arg11][arg5 + arg9] - (var14 * 8);
                    return;
                }
                class67.field1072[0][arg3 + arg11][arg5 + arg9] = -var14 * 8;
                return;
            }
            if (var13 <= 49) {
                if (arg4) {
                    arg1.method1593((byte) 27);
                } else {
                    class70.field1108[arg7][arg11][arg5] = arg1.method1604(4);
                    class20.field226[arg7][arg11][arg5] = (byte) ((var13 - 2) / 4);
                    class139.field2040[arg7][arg11][arg5] = (byte) class94.method598(3, var13 + arg6 - 2);
                }
            } else if (var13 <= 81) {
                if (!arg2 && !arg4) {
                    class221.field3333[arg7][arg11][arg5] = (byte) (var13 - 49);
                }
            } else if (!arg4) {
                class243.field3644[arg7][arg11][arg5] = (byte) (var13 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method371(byte arg0) {
        field883 = null;
        field885 = null;
        if (arg0 == -89) {
            field884 = null;
            field877 = null;
        }
    }
}
