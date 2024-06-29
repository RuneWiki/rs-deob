import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class222 extends class283 {

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[I")
    public static int[] field3790 = new int[1000];

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Ljf;")
    public static class229 field3787 = class212.method1457((byte) 110, "<col=ffffff>");

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field3791 = 0;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[I")
    public static int[] field3795 = new int[128];

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Ljf;")
    private static class229 field3793 = class212.method1457((byte) 113, "glow2:");

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Ljf;")
    public static class229 field3796 = class212.method1457((byte) 76, ":chalreq:");

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Ljf;")
    public static class229 field3789 = field3793;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Z")
    public static boolean field3792 = false;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Ljf;")
    public static class229 field3788 = field3793;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public int field3798;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Ljf;")
    public class229 field3785;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Ljf;")
    public class229 field3794;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[B)Z", line = 13)
    public static final boolean method1529(int arg0, byte[] arg1) {
        class14 var2 = new class14(arg1);
        field3786++;
        int var3 = var2.method93(false);
        if (arg0 != -1742) {
            method1531((byte) 5);
        }
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method93(false) == 1;
        if (var4) {
            class143.method999(var2, true);
        }
        class146.method1013(var2, 65535);
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Lch;", line = 51)
    public final class140 method1530(byte arg0) {
        field3797++;
        if (arg0 != -100) {
            method1529(2, (byte[]) null);
        }
        return class226.field3880[this.field4855];
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 66)
    public static void method1531(byte arg0) {
        field3790 = null;
        field3796 = null;
        field3789 = null;
        field3795 = null;
        field3788 = null;
        if (arg0 != -65) {
            field3795 = (int[]) null;
        }
        field3793 = null;
        field3787 = null;
    }
}
