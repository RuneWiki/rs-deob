import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public abstract class class271 {

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field3700 = 0;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I")
    public abstract int method715(int arg0, int arg1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public abstract void method714(boolean arg0);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)J")
    public abstract long method716(byte arg0);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIZ)Lae;")
    public static final class163 method1546(int arg0, int arg1, boolean arg2) {
        field3701++;
        if (!arg2) {
            return null;
        }
        class163 var3 = (class163) class348.field4771.method979((byte) 28, (long) arg1 << 32 | (long) arg0);
        if (var3 == null) {
            var3 = new class163(arg1, arg0);
            class348.field4771.method990(var3.field7342, (byte) 110, var3);
        }
        return var3;
    }
}
