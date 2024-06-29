import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class190 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Ljj;")
    public static class156 field2821 = new class156(16);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method1470(int arg0) {
        field2824++;
        class18 var1 = class297.field4395;
        synchronized (class297.field4395) {
            class297.field4395.method112(arg0 - 6);
            if (arg0 != 6) {
                field2823 = -108;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method1471(int arg0) {
        if (arg0 != 0) {
            field2821 = null;
        }
        field2821 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method1472(boolean arg0);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([BI)V")
    public abstract void method1473(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)I")
    public static final int method1474(int arg0) {
        field2822++;
        return arg0 == 6 ? 6 : 92;
    }
}
