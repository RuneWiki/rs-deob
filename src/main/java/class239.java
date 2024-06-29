import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class239 {

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public static int[] field3972 = new int[32];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Lob;I)V", line = 5)
    public static final void method1685(int arg0, class78[] arg1, int arg2) {
        field3967++;
        if (arg2 != -1) {
            method1688((byte) 19);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class78 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1231 == 0) {
                    if (var4.field1363 != null) {
                        method1685(arg0, var4.field1363, -1);
                    }
                    class172 var5 = (class172) class137.field2440.method1672((long) var4.field1235, arg2 ^ 0xFFFFB2CF);
                    if (var5 != null) {
                        class30.method248(arg0, 39, var5.field2985);
                    }
                }
                if (arg0 == 0 && var4.field1291 != null) {
                    class180 var6 = new class180();
                    var6.field3099 = var4;
                    var6.field3102 = var4.field1291;
                    class31.method257(arg2 ^ 0x7F44, var6);
                }
                if (arg0 == 1 && var4.field1335 != null) {
                    if (var4.field1276 >= 0) {
                        class78 var7 = class61.method419((byte) 28, var4.field1235);
                        if (var7 == null || var7.field1363 == null || var7.field1363.length <= var4.field1276 || var7.field1363[var4.field1276] != var4) {
                            continue;
                        }
                    }
                    class180 var8 = new class180();
                    var8.field3102 = var4.field1335;
                    var8.field3099 = var4;
                    class31.method257(-32581, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)I", line = 94)
    public static final int method1686(int arg0, int arg1, int arg2) {
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        if (arg1 == 7229) {
            field3971++;
            int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
            return var5 >> 19 & 0xFF;
        } else {
            return -101;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 110)
    public static final void method1687(int arg0) {
        class233.field3871++;
        field3969++;
        if (arg0 != 64) {
            field3970 = -9;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Lvi;", line = 121)
    public static final class237 method1688(byte arg0) {
        field3973++;
        if (arg0 != -90) {
            field3970 = 97;
        }
        try {
            return (class237) Class.forName("tm").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class102();
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 145)
    public static void method1689(int arg0) {
        field3972 = null;
        if (arg0 > -123) {
            method1689(-68);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILrk;Lrk;IIJ)V", line = 154)
    public static final void method1690(int arg0, int arg1, int arg2, int arg3, class255 arg4, class255 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class273 var10 = new class273();
        var10.field4526 = arg8;
        var10.field4535 = arg1 * 128 + 64;
        var10.field4533 = arg2 * 128 + 64;
        var10.field4530 = arg3;
        var10.field4527 = arg4;
        var10.field4534 = arg5;
        var10.field4528 = arg6;
        var10.field4525 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class288.field4856[var11][arg1][arg2] == null) {
                class288.field4856[var11][arg1][arg2] = new class225(var11, arg1, arg2);
            }
        }
        class288.field4856[arg0][arg1][arg2].field3753 = var10;
    }
}
