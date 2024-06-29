import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class273 {

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Lvg;")
    public static class622 field3563 = new class622(110, 12);

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "[Lhq;")
    public static class47[] field3565 = new class47[14];

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3566 = new String[200];

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLmv;)V", line = 8)
    public static final void method1627(byte arg0, class295 arg1) {
        if (arg0 >= -111) {
            method1627((byte) -29, null);
        }
        class119.field1776 = arg1;
        field3556++;
    }

    @OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;", line = 21)
    public final String toString() {
        field3561++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(IIII)V", line = 29)
    public class273(int arg0, int arg1, int arg2, int arg3) {
        this.field3559 = arg0;
        this.field3560 = arg3;
        this.field3557 = arg2;
        this.field3558 = arg1;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 41)
    public static void method1628(int arg0) {
        field3566 = null;
        field3563 = null;
        if (arg0 < 21) {
            method1628(-49);
        }
        field3565 = null;
    }
}
