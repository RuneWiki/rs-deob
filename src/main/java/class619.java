import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class619 {

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "[I")
    public static int[] field8829 = new int[2];

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "Lso;")
    public static class99 field8831 = null;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public int field8828;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
    public int field8830;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public int field8833;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public int field8834;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "J")
    public static long field8832;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "()V")
    public static final void method3496() {
        for (int var0 = 0; var0 < class355.field4980.length; var0++) {
            class355.field4980[var0].method1305();
        }
        class355.field4980 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z")
    public static final boolean method3497(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field8835++;
            return (class176.method1287(arg1, arg0, (byte) -37) | class312.method1885(arg1, arg0, true) | class216.method1459(false, arg1, arg0)) & class462.method2685(arg0, arg2 ^ 0x417F, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
    public static void method3498(boolean arg0) {
        field8829 = null;
        field8831 = null;
        if (!arg0) {
            method3498(true);
        }
    }
}
