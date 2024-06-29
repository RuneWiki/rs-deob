import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class129 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    public static int[] field2098 = new int[2];

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Leda;")
    public static class116 field2097 = new class116(92, -2);

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lbl;")
    public static class350 field2099;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(JI)I")
    public final int method1015(long arg0, int arg1) {
        field2100++;
        long var4 = this.method899(92);
        if (var4 > (long) arg1) {
            class564.method3300((byte) 127, var4);
        }
        return this.method896(arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)J")
    public abstract long method899(int arg0);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method1016(byte arg0) {
        field2098 = null;
        field2099 = null;
        field2097 = null;
        if (arg0 < 126) {
            field2097 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(JI)I")
    public abstract int method896(long arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public abstract void method900(boolean arg0);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)J")
    public abstract long method898(int arg0);
}
