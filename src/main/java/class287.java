import java.awt.Canvas;
import java.awt.event.FocusListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class287 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Z")
    public static boolean field4907 = false;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field4906 = 0;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Lcd;")
    public static class64 field4911 = class44.method335((byte) 71, "<col=ffff00>");

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Lcd;", line = 29)
    public static final class64 method1982(byte arg0) {
        class64 var1 = class296.field5103;
        if (class3.field33 != 0) {
            var1 = class163.field2870;
        }
        int var2 = 39 % ((5 - arg0) / 61);
        field4909++;
        class64 var3 = class188.field3240;
        if (class145.field2560 != null) {
            var3 = class104.method768(new class64[] { class104.field1925, class145.field2560 }, false);
        }
        return class104.method768(new class64[] { class246.field4286, var1, class138.field2462, class310.method2149(class253.field4411, (byte) 107), class10.field208, class310.method2149(class188.field3241, (byte) 110), var3, class75.field1416 }, false);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 50)
    public static void method1983(byte arg0) {
        if (arg0 == 8) {
            field4911 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lkh;B)V", line = 70)
    public static final void method1984(class13 arg0, byte arg1) {
        if (arg1 != -76) {
            field4907 = false;
        }
        field4910++;
        byte[] var2 = new byte[24];
        if (class161.field2838 != null) {
            try {
                class161.field2838.method1492(0L, true);
                int var3 = 0;
                class161.field2838.method1485((byte) 111, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method157(24, true, var2, 0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)V", line = 152)
    public static final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4908++;
        int var6 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg4);
        int var7 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg3);
        int var8 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg0);
        int var9 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg1);
        int var10 = 11 % ((arg5 + 36) / 49);
        for (int var11 = var6; var11 <= var7; var11++) {
            class31.method268(var9, 125, var8, class124.field2241[var11], arg2);
        }
    }
}
