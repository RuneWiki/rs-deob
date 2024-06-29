import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class482 {

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public int field6506;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public int field6508;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public int field6507;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public int field6504;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "[I")
    public static int[] field6505 = new int[50];

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Lpja;")
    public static class43 field6502 = new class43(4);

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "[I")
    public static int[] field6509 = new int[14];

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Z")
    public static boolean field6510 = true;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public static void method2758(byte arg0) {
        int var1 = -30 / ((arg0 + 34) / 56);
        field6502 = null;
        field6505 = null;
        field6509 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)Lgt;")
    public final class482 method2759(int arg0, int arg1) {
        if (arg0 == -29096) {
            field6503++;
            return new class482(this.field6507, arg1, this.field6508, this.field6506);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIII)V")
    public class482(int arg0, int arg1, int arg2, int arg3) {
        this.field6506 = arg3;
        this.field6508 = arg2;
        this.field6507 = arg0;
        this.field6504 = arg1;
    }
}
