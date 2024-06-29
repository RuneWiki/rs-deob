import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class53 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "[I")
    public static int[] field718 = new int[5];

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Lbt;")
    public static class48 field720;

    @OriginalMember(owner = "client!gp", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field717++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 16)
    public static void method476(int arg0) {
        field720 = null;
        field718 = null;
        if (arg0 < 4) {
            method478(null, (byte) -93, null);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)[I", line = 28)
    public static final int[] method477(byte arg0) {
        field716++;
        if (arg0 >= -124) {
            method477((byte) 26);
        }
        return new int[] { class45.field608, class643.field8772, class117.field1484 };
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lfw;BLha;)I", line = 45)
    public static final int method478(class63 arg0, byte arg1, class66 arg2) {
        field719++;
        if (arg0.field853 != -1) {
            return arg0.field853;
        }
        if (arg0.field856 != -1) {
            class359 var3 = arg2.field890.method1138(arg0.field856, 107);
            if (!var3.field4464) {
                return var3.field4448;
            }
        }
        if (arg1 >= -83) {
            method476(50);
        }
        return arg0.field857;
    }
}
