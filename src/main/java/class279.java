import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class279 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Llc;")
    public static class143 field4920 = class66.method374("Versteckt", -1);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lgf;")
    public static class7 field4923;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[I")
    public static int[] field4922;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[Lfe;")
    public static class212[] field4924;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method1841(boolean arg0) {
        field4923 = null;
        field4924 = null;
        field4922 = null;
        field4920 = null;
        if (arg0) {
            field4924 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lh;I)Lcj;")
    public static final class281 method1842(class190 arg0, int arg1) {
        if (arg1 != 13613) {
            field4924 = null;
        }
        field4918++;
        return new class281(arg0.method1274((byte) 74), arg0.method1274((byte) -21), arg0.method1274((byte) -49), arg0.method1274((byte) -86), arg0.method1282(123), arg0.method1282(111), arg0.method1265(114));
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
    public static final void method1843(int arg0, int arg1, int arg2) {
        if (class211.field3926 != arg1 && arg0 != -1) {
            class129.method778(class14.field254, arg0, 2627, false, 0, class211.field3926);
            class175.field3142 = true;
        }
        field4916++;
    }
}
