import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class120 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1502 = 0;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZILta;Ljava/lang/String;)V", line = 13)
    public static final void method745(boolean arg0, int arg1, class181 arg2, String arg3) {
        field1503++;
        if (arg1 >= -35) {
            field1502 = -54;
        }
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class261.field3710.method2559((byte) 26, null, arg3, 250);
        int var8 = class261.field3710.method2557(null, 250, 0, arg3) * 13;
        class413.field6264.method394(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class413.field6264.method299(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - -var4 + var4, -1, 0);
        arg2.method1029(1, -122, var6, var8, 0, -1, null, 1, 0, var5, arg3, null, null, 0, -1, var7);
        class465.method2848(var5 - var4, var6 - var4, var4 + var8 + var4, (byte) -36, var7 + var4 + var4);
        if (arg0) {
            try {
                class413.field6264.method338();
            } catch (class27 var9) {
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLqf;)V", line = 48)
    public static final void method746(byte arg0, class593 arg1) {
        field1504++;
        if (arg0 != 9) {
            method746((byte) 41, null);
        }
        class593 var2 = class443.method2769((byte) 63, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class581.field8366;
            var4 = class298.field4407;
        } else {
            var4 = var2.field8518;
            var3 = var2.field8570;
        }
        class496.method2973(var4, false, false, var3, arg1);
        class641.method3655((byte) 121, arg1, var4, var3);
    }
}
