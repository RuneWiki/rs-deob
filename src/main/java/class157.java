import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class157 {

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Z")
    public static volatile boolean field2771 = true;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lcd;")
    public static class64 field2769 = class44.method335((byte) 71, ")2");

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lcd;")
    public static class64 field2772 = class44.method335((byte) 71, "logo");

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lcd;")
    public static class64 field2767 = class44.method335((byte) 71, "::qa_op_test");

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lcd;")
    public static class64 field2776 = class44.method335((byte) 71, "loginscreen");

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lcd;")
    private static class64 field2774 = class44.method335((byte) 71, "Please wait)3)3)3");

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lcd;")
    public static class64 field2777 = field2774;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[[Lrc;")
    public static class313[][] field2770 = new class313[13][13];

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2768;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[S")
    public static short[] field2766;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZZ[Lwf;III[BII)V", line = 7)
    public static final void method1130(int arg0, int arg1, boolean arg2, boolean arg3, class54[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field2775++;
        if (!arg3) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg9 + var11 > 0 && (arg9 + var11) < 103 && (arg0 + var12) > 0 && arg0 + var12 < 103) {
                        arg4[arg1].field905[arg9 + var11][arg0 + var12] = class224.method1614(arg4[arg1].field905[arg9 + var11][arg0 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg3) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class13 var14 = new class13(arg8);
        if (arg2) {
            field2767 = (class64) null;
        }
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg5 == var15 && var16 >= arg10 && (arg10 + 8) > var16 && var17 >= arg7 && (arg7 + 8) > var17) {
                        class117.method831(arg1, -19940, 0, class313.method2169((byte) 60, arg6, var17 & 0x7, var16 & 0x7) + arg0, class218.method1563(arg6, var16 & 0x7, true, var17 & 0x7) + arg9, arg6, var14, 0, arg3);
                    } else {
                        class117.method831(0, -19940, 0, -1, -1, 0, var14, 0, arg3);
                    }
                }
            }
        }
        if (!class123.field2216 || arg3) {
            return;
        }
        class313 var18 = null;
        while (true) {
            int var20;
            label100: do {
                while (var14.field281 < var14.field254.length) {
                    int var19 = var14.method152((byte) -116);
                    if (var19 != 0) {
                        if (var19 != 1) {
                            throw new IllegalStateException();
                        }
                        var20 = var14.method152((byte) -126);
                        continue label100;
                    }
                    var18 = new class313(var14);
                }
                if (var18 == null) {
                    var18 = new class313();
                }
                field2770[arg9 >> 3][arg0 >> 3] = var18;
                return;
            } while (var20 <= 0);
            for (int var21 = 0; var21 < var20; var21++) {
                class220 var22 = new class220(var14);
                int var23 = var22.field3730 >> 7;
                int var24 = var22.field3734 >> 7;
                if (var22.field3717 == arg5 && var23 >= arg10 && (arg10 + 8) > var23 && arg7 <= var24 && var24 < (arg7 + 8)) {
                    int var25 = (arg9 << 7) + class220.method1568(var22.field3730 & 0x3FF, var22.field3734 & 0x3FF, arg6, 104);
                    int var26 = (arg0 << 7) + class301.method2095(-102, var22.field3734 & 0x3FF, arg6, var22.field3730 & 0x3FF);
                    var22.field3730 = var25;
                    var22.field3734 = var26;
                    int var27 = var22.field3734 >> 7;
                    int var28 = var22.field3730 >> 7;
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        var22.field3744 = class96.field1764[var22.field3717][var28][var27] - var22.field3744;
                        class177.method1239(var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 159)
    public static void method1131(int arg0) {
        field2767 = null;
        field2769 = null;
        field2772 = null;
        field2766 = null;
        field2770 = (class313[][]) null;
        if (arg0 == 12203) {
            field2776 = null;
            field2777 = null;
            field2774 = null;
            field2768 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 207)
    public static final void method1132(int arg0) {
        field2773++;
        if (arg0 != -1868475513) {
            field2767 = (class64) null;
        }
        class233.field3944.method1198(false);
        class56.field947.method1198(false);
        class280.field4824.method1198(false);
    }
}
