import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public abstract class class239 extends class374 {

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "[I")
    public static int[] field3474 = new int[256];

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "Lmia;")
    public static class63 field3471 = new class63(5, 2);

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field3475 = 1403;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "[I")
    public static int[] field3476 = new int[1000];

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "Lsca;")
    public static class46 field3477;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "Lmk;")
    public static class56 field3470;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)Lpf;")
    public abstract class584 method1582(byte arg0);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
    public static void method1583(int arg0) {
        if (arg0 != 15126) {
            field3477 = null;
        }
        field3470 = null;
        field3476 = null;
        field3477 = null;
        field3471 = null;
        field3474 = null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIILqj;)V")
    public static final void method1584(int arg0, int arg1, int arg2, class511 arg3) {
        if (arg1 == -11) {
            class183.field2805[arg2][arg0] = arg3;
            field3473++;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)Z")
    public static final boolean method1585(int arg0, byte arg1) {
        field3472++;
        if (arg1 <= 76) {
            field3477 = null;
        }
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }
}
