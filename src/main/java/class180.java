import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class180 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ldd;")
    public static class35 field3681 = method1196((byte) 126, "<br>(X");

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Ldd;")
    public static class35 field3684 = method1196((byte) 126, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Ldd;")
    public static class35 field3689 = method1196((byte) 126, "scrollbar");

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Ldd;")
    public static class35 field3688 = method1196((byte) 126, ")4l");

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Ldd;")
    private static class35 field3685 = method1196((byte) -15, "Please enter your password)3");

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ldd;")
    public static class35 field3682 = field3685;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIILfd;)V")
    public static final void method1194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class55 arg7) {
        field3686++;
        if (class74.field1787) {
            class61.field1493 = 32;
        } else {
            class61.field1493 = 0;
        }
        if (arg2 != 16) {
            return;
        }
        class74.field1787 = false;
        if (class166.field3364 != 0) {
            if (arg5 >= arg3 && arg5 < arg3 + 16 && arg0 >= arg4 && arg4 + 16 > arg0) {
                arg7.field1310 -= 4;
                class137.method937(arg7, (byte) -85);
            } else if (arg3 <= arg5 && arg5 < arg3 + 16 && arg0 >= arg4 + arg1 - 16 && arg4 + arg1 > arg0) {
                arg7.field1310 += 4;
                class137.method937(arg7, (byte) -85);
            } else if (arg3 - class61.field1493 <= arg5 && arg3 + class61.field1493 + 16 > arg5 && arg0 >= arg4 + 16 && arg0 < arg1 + arg4 - 16) {
                int var8 = (arg1 - 32) * arg1 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - var8 / 2 - arg4 - 16;
                int var10 = arg1 - var8 - 32;
                arg7.field1310 = (arg6 - arg1) * var9 / var10;
                class137.method937(arg7, (byte) -85);
                class74.field1787 = true;
            }
        }
        if (class166.field3367 == 0) {
            return;
        }
        int var11 = arg7.field1249;
        if (arg3 - var11 <= arg5 && arg0 >= arg4 && arg5 < arg3 + 16 && arg4 + arg1 >= arg0) {
            arg7.field1310 += class166.field3367 * 45;
            class137.method937(arg7, (byte) -85);
            return;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lve;I)V")
    public static final void method1195(class202 arg0, int arg1) {
        field3683++;
        if (arg0.field4033 != null) {
            arg0.field4033.field3391 = 0;
        }
        if (arg1 > -24) {
            field3684 = null;
        }
        arg0.field4036 = false;
        for (class202 var2 = arg0.method704(); var2 != null; var2 = arg0.method682()) {
            method1195(var2, -94);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)Ldd;")
    public static final class35 method1196(byte arg0, String arg1) {
        field3687++;
        int var2 = 125 % ((65 - arg0) / 61);
        byte[] var3 = arg1.getBytes();
        int var4 = var3.length;
        int var5 = 0;
        class35 var6 = new class35();
        var6.field730 = new byte[var4];
        while (var5 < var4) {
            int var7 = var3[var5++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var4 <= var5) {
                    break;
                }
                int var8 = var3[var5++] & 0xFF;
                var6.field730[var6.field758++] = (byte) ((var7 - 40) * 43 + var8 - 48);
            } else if (var7 != 0) {
                var6.field730[var6.field758++] = (byte) var7;
            }
        }
        var6.method318(0);
        return var6.method333(-2512);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1197(byte arg0) {
        field3681 = null;
        field3689 = null;
        field3682 = null;
        field3688 = null;
        field3685 = null;
        if (arg0 < 32) {
            field3688 = null;
        }
        field3684 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)I")
    public abstract int method1018(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public abstract void method1017(int arg0);
}
