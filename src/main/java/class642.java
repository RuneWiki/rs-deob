import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class642 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Ltea;")
    public static class708 field8930 = new class708(16);

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field8933 = 0;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Z")
    public static boolean field8932 = false;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Len;")
    public static class368 field8931;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(JI)I")
    public abstract int method615(long arg0, int arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public abstract void method613(int arg0);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(JI)I")
    public final int method3536(long arg0, int arg1) {
        if (arg1 != 16) {
            return 28;
        }
        field8929++;
        long var4 = this.method616(arg1 - 16);
        if (var4 > 0L) {
            class122.method905(var4, -6145);
        }
        return this.method615(arg0, 0);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)J")
    public abstract long method616(int arg0);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)J")
    public abstract long method612(byte arg0);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
    public static void method3537(byte arg0) {
        field8931 = null;
        field8930 = null;
        if (arg0 != 110) {
            field8930 = null;
        }
    }
}
