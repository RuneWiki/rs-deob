import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class651 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Llw;")
    public static class233 field9246 = new class233(1);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field9249 = 0;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lnha;")
    public static class686 field9248 = new class686();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lab;")
    public static class651 field9244;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public abstract void method2916(int arg0);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
    public abstract boolean method2922(byte arg0);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Z")
    public abstract boolean method2918(int arg0);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
    public abstract boolean method2929(byte arg0);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)I")
    public abstract int method2915(int arg0);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lck;")
    public abstract class703 method2925(byte arg0);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public static void method3663(int arg0) {
        field9248 = null;
        field9244 = null;
        field9246 = null;
        if (arg0 != 1) {
            method3663(-54);
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)Z")
    public final boolean method3664(byte arg0) {
        if (arg0 != -98) {
            field9249 = -7;
        }
        field9245++;
        return this.method2929((byte) -120) || this.method2918(-16656) || this.method2922((byte) -38);
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)I")
    public abstract int method2921(byte arg0);

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)V")
    public abstract void method2930(byte arg0);
}
