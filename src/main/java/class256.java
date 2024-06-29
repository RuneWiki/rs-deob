import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class256 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Z")
    public static boolean field4144 = true;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    public static int[] field4147 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lo;")
    public static class139 field4148;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Ltb;")
    public class347 field4146;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(JI)V")
    public static final void method1752(long arg0, int arg1) {
        field4149++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != 2) {
            method1752(47L, -19);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZ)V")
    public static final void method1753(byte arg0, boolean arg1) {
        for (class407 var2 = (class407) class541.field7904.method2123(89); var2 != null; var2 = (class407) class541.field7904.method2126((byte) 61)) {
            if (var2.field6148 != null) {
                class411.field6231.method482(var2.field6148);
                var2.field6148 = null;
            }
            if (var2.field6144 != null) {
                class411.field6231.method482(var2.field6144);
                var2.field6144 = null;
            }
            var2.method3149(69);
        }
        field4145++;
        int var3 = -93 / ((arg0 - 65) / 46);
        if (!arg1) {
            return;
        }
        for (class407 var4 = (class407) class354.field5492.method2123(-27); var4 != null; var4 = (class407) class354.field5492.method2126((byte) 61)) {
            if (var4.field6148 != null) {
                class411.field6231.method482(var4.field6148);
                var4.field6148 = null;
            }
            var4.method3149(99);
        }
        for (class407 var5 = (class407) class249.field4049.method1119(false); var5 != null; var5 = (class407) class249.field4049.method1121((byte) 58)) {
            if (var5.field6148 != null) {
                class411.field6231.method482(var5.field6148);
                var5.field6148 = null;
            }
            var5.method3149(49);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method1754(byte arg0) {
        field4148 = null;
        if (arg0 > -42) {
            field4144 = true;
        }
        field4147 = null;
    }
}
