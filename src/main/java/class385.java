import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class385 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lqe;")
    public static class469 field5814 = new class469(73, -1);

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "[F")
    public static float[] field5816 = new float[2];

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lpga;")
    public static class536 field5817;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 12)
    public static void method2477(boolean arg0) {
        field5814 = null;
        if (arg0) {
            field5814 = null;
        }
        field5817 = null;
        field5816 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lvd;I)V", line = 24)
    public static final void method2478(class39 arg0, int arg1) {
        if (arg1 == 2048) {
            class268.field3837 = arg0;
            field5815++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)Z", line = 47)
    public static final boolean method2479(int arg0, byte arg1, int arg2) {
        if (arg1 == 8) {
            field5813++;
            return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public abstract void method2473(byte arg0);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)Z")
    public abstract boolean method2474(int arg0, byte arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public abstract void method2475(int arg0);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Loc;")
    public abstract class204 method2476(int arg0);
}
