import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class53 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lwu;")
    public static class376 field654;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method365(byte arg0, int arg1, int arg2) {
        if (arg0 >= -78) {
            field655 = 63;
        }
        field656++;
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 17)
    public static void method366(int arg0) {
        if (arg0 != -23011) {
            field654 = null;
        }
        field654 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILns;)I", line = 34)
    public static final int method367(int arg0, class408 arg1) {
        field652++;
        if (arg0 != 5126) {
            return 88;
        } else if (class408.field5662 == arg1) {
            return 5120;
        } else if (class408.field5666 == arg1) {
            return 5122;
        } else if (class408.field5667 == arg1) {
            return 5124;
        } else if (class408.field5668 == arg1) {
            return 5121;
        } else if (class408.field5669 == arg1) {
            return 5123;
        } else if (class408.field5670 == arg1) {
            return 5125;
        } else if (class408.field5671 == arg1) {
            return 5131;
        } else if (class408.field5672 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([Ljava/awt/Rectangle;IB)V", line = 79)
    public static final void method368(Rectangle[] arg0, int arg1, byte arg2) throws class149 {
        if (class410.field5681 == 1) {
            class45.field585.method446(arg0, arg1, class186.field2817, class55.field664);
        } else {
            class45.field585.method446(arg0, arg1, 0, 0);
        }
        field653++;
        if (arg2 <= 111) {
            field654 = null;
        }
    }
}
