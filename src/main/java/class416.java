import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class416 {

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field6365 = -1;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "Lrl;")
    public static class672 field6368 = new class672(27, 7);

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "Ljea;")
    public class416 field6366;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "Ljea;")
    public class416 field6367;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IBI)B")
    public static final byte method2646(int arg0, byte arg1, int arg2) {
        if (arg1 != 43) {
            return 1;
        }
        field6372++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
    public static void method2647(int arg0) {
        field6368 = null;
        int var1 = -56 / ((-arg0 - 9) / 46);
    }

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(B)V")
    public final void method2648(byte arg0) {
        field6371++;
        if (arg0 != -25) {
            method2646(-26, (byte) -1, 85);
        }
        if (this.field6366 != null) {
            this.field6366.field6367 = this.field6367;
            this.field6367.field6366 = this.field6366;
            this.field6366 = null;
            this.field6367 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2649(int arg0, boolean arg1) {
        if (arg1) {
            field6370++;
            return (arg0 & -arg0) == arg0;
        } else {
            return false;
        }
    }
}
