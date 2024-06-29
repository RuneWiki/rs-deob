import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public abstract class class454 {

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "[S")
    public static short[] field6195 = new short[256];

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "Lqt;")
    public static class637 field6199 = new class637();

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "Lkaa;")
    public static class47 field6201 = new class47(48, 3);

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public int field6198;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public int field6203;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
    public static void method2580(int arg0) {
        field6195 = null;
        field6201 = null;
        field6199 = null;
        if (arg0 != 0) {
            field6199 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
    public static final void method2581(int arg0) {
        class164.field2494.method403(class329.field4694, class473.field6490, class444.field6112);
        int var1 = 10 / ((arg0 - 50) / 60);
        field6196++;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)Z")
    public final boolean method2582(boolean arg0) {
        field6200++;
        if (arg0) {
            return (this.field6194 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)Z")
    public final boolean method2583(int arg0) {
        if (arg0 != 0) {
            this.field6194 = -50;
        }
        field6202++;
        return (this.field6194 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)Z")
    public final boolean method2584(int arg0) {
        field6193++;
        if (arg0 <= 13) {
            method2581(76);
        }
        return (this.field6194 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "(I)Z")
    public final boolean method2585(int arg0) {
        field6197++;
        if (arg0 != 1) {
            field6195 = null;
        }
        return (this.field6194 & 0x1) != 0;
    }
}
