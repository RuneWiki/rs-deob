import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class199 extends class110 {

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public int field3887 = 0;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public int field3891 = -1;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "Leh;")
    public static class47 field3880 = class195.method1282((byte) -4, "mapscene");

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Leh;")
    private static class47 field3882 = class195.method1282((byte) -4, "Enter your username (V password)3");

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field3884 = 0;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "Leh;")
    public static class47 field3890 = field3882;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Lah;")
    public static class9 field3881;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method1307(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        field3886++;
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        int var3 = -102 / ((-arg0 - 15) / 60);
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)I")
    public static final int method1308(int arg0, int arg1, int arg2) {
        field3877++;
        int var3 = class55.method478(arg1 - 1, arg2 + -1, -74) + class55.method478(arg1 + 1, arg2 + -1, -74) + class55.method478(arg1 - 1, arg2 + 1, -64) + class55.method478(arg1 + 1, arg2 + 1, -71);
        int var4 = class55.method478(arg1 - 1, arg2, arg0 - 1464) + class55.method478(arg1 + 1, arg2, -70) + class55.method478(arg1, arg2 + -1, -93) + class55.method478(arg1, arg2 + 1, -95);
        if (arg0 != 1424) {
            method1309(-16);
        }
        int var5 = class55.method478(arg1, arg2, arg0 - 1507);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static void method1309(int arg0) {
        field3881 = null;
        field3880 = null;
        field3890 = null;
        if (arg0 != -1) {
            method1308(98, 98, -6);
        }
        field3882 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = 2048 - arg1 & 0x7FF;
        int var8 = 2048 - arg4 & 0x7FF;
        field3893++;
        int var9 = 0;
        int var10 = arg5;
        int var11 = 0;
        if (var7 != 0) {
            int var12 = class17.field350[var7];
            int var13 = class17.field341[var7];
            int var14 = var11 * var12 - arg5 * var13 >> 16;
            var10 = var11 * var13 + arg5 * var12 >> 16;
            var11 = var14;
        }
        if (arg6 != 122) {
            field3892 = -122;
        }
        if (var8 != 0) {
            int var15 = class17.field350[var8];
            int var16 = class17.field341[var8];
            int var17 = var9 * var15 + var10 * var16 >> 16;
            var10 = var10 * var15 - var9 * var16 >> 16;
            var9 = var17;
        }
        class194.field3787 = arg1;
        class188.field3655 = arg0 - var11;
        class53.field1036 = arg4;
        class98.field2086 = arg2 - var10;
        class33.field639 = arg3 - var9;
    }
}
