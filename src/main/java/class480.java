import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class480 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public int field6594 = -1;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public int field6600 = 2;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public int field6596 = 64;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public int field6595 = 1;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public int field6597 = 64;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Z")
    public boolean field6602 = false;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Z")
    public boolean field6603 = false;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZILol;)V", line = 15)
    public final void method2841(boolean arg0, int arg1, class431 arg2) {
        if (!arg0) {
            this.method2842(-89, null, -94, false);
        }
        while (true) {
            int var4 = arg2.method2557(14929);
            if (var4 == 0) {
                field6599++;
                return;
            }
            this.method2842(var4, arg2, arg1, true);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILol;IZ)V", line = 37)
    private final void method2842(int arg0, class431 arg1, int arg2, boolean arg3) {
        if (arg0 == 1) {
            this.field6594 = arg1.method2565((byte) -94);
            if (this.field6594 == 65535) {
                this.field6594 = -1;
            }
        } else if (arg0 == 2) {
            this.field6596 = arg1.method2565((byte) -91) + 1;
            this.field6597 = arg1.method2565((byte) -119) + 1;
        } else if (arg0 == 3) {
            arg1.method2529(71);
        } else if (arg0 == 4) {
            this.field6600 = arg1.method2557(14929);
        } else if (arg0 == 5) {
            this.field6595 = arg1.method2557(14929);
        } else if (arg0 == 6) {
            this.field6603 = true;
        } else if (arg0 == 7) {
            this.field6602 = true;
        }
        if (arg3) {
            field6593++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lup;Z)I", line = 99)
    public static final int method2843(class547 arg0, boolean arg1) {
        if (arg1) {
            return 68;
        }
        field6601++;
        if (class165.field2523 == arg0) {
            return 9216;
        } else if (class431.field5982 == arg0) {
            return 34065;
        } else if (class297.field4312 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
