import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class246 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "[I")
    public static int[] field3700 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3705 = "glow2:";

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[Ltb;")
    public static class220[] field3709 = new class220[0];

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Llb;")
    public static class211 field3710;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "[I")
    public static int[] field3707;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1700(boolean arg0) {
        field3705 = null;
        field3709 = null;
        if (!arg0) {
            method1703(-74, true);
        }
        field3700 = null;
        field3707 = null;
        field3710 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lfk;I)V", line = 38)
    public static final void method1701(class45 arg0, int arg1) {
        if (arg1 != -18005) {
            return;
        }
        field3702++;
        for (class117 var2 = (class117) class200.field3169.method986(false); var2 != null; var2 = (class117) class200.field3169.method982(14877)) {
            if (var2.field1828 == arg0) {
                if (var2.field1842 != null) {
                    class200.field3165.method2162(var2.field1842);
                    var2.field1842 = null;
                }
                var2.method1554((byte) -83);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)I", line = 74)
    public static final int method1702(int arg0, int arg1, int arg2) {
        int var3 = 1;
        field3706++;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (~arg1 == arg2) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)Luh;", line = 98)
    public static final class277 method1703(int arg0, boolean arg1) {
        field3704++;
        class277 var2 = (class277) class270.field4064.method816((long) arg0, (byte) 73);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            byte[] var3 = class158.field2357.method1507(arg0, (byte) 69, 26);
            class277 var4 = new class277();
            if (var3 != null) {
                var4.method1949(new class35(var3), (byte) 123);
            }
            class270.field4064.method817(var4, (long) arg0, (byte) -103);
            return var4;
        } else {
            return (class277) null;
        }
    }
}
