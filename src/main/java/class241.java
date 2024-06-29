import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public abstract class class241 extends class251 {

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "Lbg;")
    public static class310 field3632 = new class310(21, 3);

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field3635 = new String[100];

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
    public static int field3636 = -1;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "[I")
    public static int[] field3634;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1446(int arg0, int arg1) {
        field3631++;
        int var2 = class369.field5424 - class249.field3823;
        if (var2 >= 100) {
            class408.field5928 = 1;
            return;
        }
        int var3 = (int) class376.field5483;
        if (var3 < (class175.field2744 >> 8)) {
            var3 = class175.field2744 >> 8;
        }
        if (class169.field2628[4] && var3 < (class307.field4646[4] + 128)) {
            var3 = class307.field4646[4] + 128;
        }
        int var4 = (int) class23.field289 + class388.field5620 & 0x3FFF;
        class423.method2475(class7.method38(class286.field4329.field3218, class362.field5339, class286.field4329.field3222, (byte) -54) - 50, class394.field5754, -46, class10.field132, var4, arg1, var3, ((var3 >> 3) * 3) + 600 << 0);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class290.field4403 = (int) ((float) (class290.field4403 - class24.field320) * var5 + (float) class24.field320);
        class288.field4373 = (int) ((float) (class288.field4373 - class2.field8) * var5 + (float) class2.field8);
        class243.field3655 = (int) ((float) (class243.field3655 - class435.field6382) * var5 + (float) class435.field6382);
        class456.field6999 = (int) ((float) (class456.field6999 - class414.field5997) * var5 + (float) class414.field5997);
        int var6 = class16.field226 - class253.field3861;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        if (arg0 != -5120) {
            method1446(64, -26);
        }
        class16.field226 = (int) ((float) var6 * var5 + (float) class253.field3861);
        class16.field226 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[B)[B", line = 49)
    public static final byte[] method1447(int arg0, byte[] arg1) {
        field3630++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class356.method2184(arg1, arg0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "(I)V", line = 63)
    public static void method1448(int arg0) {
        if (arg0 != 18261) {
            method1447(115, null);
        }
        field3635 = null;
        field3634 = null;
        field3632 = null;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V", line = 82)
    public class241(int arg0) {
        this.field3633 = arg0;
    }

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1449(int arg0);

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "(I)Z")
    public abstract boolean method1450(int arg0);
}
