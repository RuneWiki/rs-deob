import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class141 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[Lkh;")
    public static class117[] field2560 = new class117[1000];

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lkh;")
    public static class117 field2563 = class224.method1450((byte) -108, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
    public static int[] field2561 = new int[2000];

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lkh;")
    private static class117 field2566 = class224.method1450((byte) -75, "Select");

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lkh;")
    public static class117 field2567 = class224.method1450((byte) -38, "Null");

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lkh;")
    public static class117 field2565 = field2566;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILnc;)Lkh;")
    public static final class117 method959(byte arg0, int arg1, class145 arg2) {
        field2562++;
        try {
            int var3 = 36 / ((arg0 - 58) / 51);
            class117 var4 = new class117();
            var4.field2213 = arg2.method1003(-75);
            if (var4.field2213 > arg1) {
                var4.field2213 = arg1;
            }
            var4.field2196 = new byte[var4.field2213];
            arg2.field2643 += class11.field378.method1454(var4.field2196, var4.field2213, arg2.field2643, 0, arg2.field2613, 0);
            return var4;
        } catch (Exception var5) {
            return class66.field1266;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method960(byte arg0) {
        if (arg0 != -29) {
            method959((byte) -18, -42, null);
        }
        field2561 = null;
        field2567 = null;
        field2560 = null;
        field2565 = null;
        field2566 = null;
        field2563 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static final void method961(int arg0) {
        field2564++;
        if (class5.field79 > 0) {
            class212.method1393(2);
            return;
        }
        class94.method647(40, (byte) -101);
        class106.field1935 = class207.field3717;
        class207.field3717 = null;
        if (arg0 != -1) {
            method959((byte) -36, -123, null);
        }
    }
}
