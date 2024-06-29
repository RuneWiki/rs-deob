import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class665 {

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Luda;")
    public static class549 field9458 = new class549();

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "Leba;")
    public static class550 field9463 = new class550(28, 6);

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field9471 = 50;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field9468 = new String[field9471];

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "[I")
    public static int[] field9470 = new int[field9471];

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "[I")
    public static int[] field9464 = new int[field9471];

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "[I")
    public static int[] field9467 = new int[field9471];

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "[I")
    public static int[] field9465 = new int[field9471];

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "[I")
    public static int[] field9469 = new int[field9471];

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "[I")
    public static int[] field9466 = new int[field9471];

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public int field9461;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "Ljava/lang/String;")
    public String field9460;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)I", line = 3)
    public static int method3789(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V", line = 11)
    public static final void method3790(byte arg0, int arg1) {
        field9462++;
        if (!class602.field8408.field4343) {
            arg1 = -1;
        }
        if (class431.field5790 == arg1) {
            return;
        }
        if (arg0 >= -55) {
            method3790((byte) 27, 6);
        }
        if (arg1 != -1) {
            class382 var2 = class130.field1802.method2432(1, arg1);
            class92 var3 = var2.method2187((byte) -123);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class312.field4206.method2228(new Point(var2.field5053, var2.field5044), true, var3.method514(), class583.field7996, var3.method507(), var3.method519());
                class431.field5790 = arg1;
            }
        }
        if (arg1 == -1 && class431.field5790 != -1) {
            class312.field4206.method2228(new Point(), true, -1, class583.field7996, -1, null);
            class431.field5790 = -1;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lhe;II)V", line = 54)
    public static final void method3791(class231 arg0, int arg1, int arg2) {
        if (arg2 != 6144) {
            return;
        }
        field9457++;
        int var3 = -1;
        int var4 = 0;
        if (arg0.field3036 > class327.field4404) {
            class372.method2142(11883, arg0);
        } else if (class327.field4404 > arg0.field2984) {
            class516.method2932(arg0, false, arg2 - 6067);
            var4 = class694.field9790;
            var3 = class696.field9853;
        } else {
            class363.method2121(arg0, 9437);
        }
        if (arg0.field398 < 512 || arg0.field397 < 512 || class703.field9886 * 512 - 512 <= arg0.field398 || arg0.field397 >= class431.field5789 * 512 - 512) {
            arg0.field3036 = 0;
            arg0.field3048 = -1;
            arg0.field2989 = null;
            var3 = -1;
            arg0.field2984 = 0;
            arg0.field3064 = -1;
            arg0.field3022 = -1;
            var4 = 0;
            arg0.field398 = arg0.field3088[0] * 512 + (arg0.method1435((byte) 110) * 256);
            arg0.field397 = arg0.field3086[0] * 512 + (arg0.method1435((byte) 86) * 256);
            arg0.method1438((byte) -98);
        }
        if (class408.field5369 == arg0 && (arg0.field398 < 6144 || arg0.field397 < 6144 || arg0.field398 >= (class703.field9886 * 512 - 6144) || (class431.field5789 - 12) * 512 <= arg0.field397)) {
            arg0.field3064 = -1;
            arg0.field3022 = -1;
            arg0.field3048 = -1;
            var3 = -1;
            arg0.field2984 = 0;
            arg0.field3036 = 0;
            var4 = 0;
            arg0.field2989 = null;
            arg0.field398 = arg0.field3088[0] * 512 + arg0.method1435((byte) 127) * 256;
            arg0.field397 = arg0.field3086[0] * 512 + arg0.method1435((byte) 124) * 256;
            arg0.method1438((byte) -110);
        }
        int var5 = class338.method1978((byte) 104, arg0);
        class293.method1735(var4, var5, arg0, -6145, var3);
        class115.method675(arg0, var3, (byte) -116);
        class104.method572(arg0, -1);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 125)
    public static void method3792(int arg0) {
        field9469 = null;
        field9465 = null;
        field9463 = null;
        field9468 = null;
        field9466 = null;
        field9458 = null;
        field9467 = null;
        if (arg0 != -1) {
            field9471 = -84;
        }
        field9464 = null;
        field9470 = null;
    }
}
