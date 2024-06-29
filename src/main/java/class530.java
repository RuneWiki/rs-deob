import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class530 {

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public int field7475 = 0;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field7476 = 2048;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public int field7474 = 0;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public int field7478 = 2048;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "[I")
    public static int[] field7472 = new int[1];

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field7473 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lkha;")
    public static class687 field7471;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILtn;I)V")
    private final void method3029(int arg0, class179 arg1, int arg2) {
        if (arg0 == 1) {
            this.field7474 = arg1.method1094(255);
        } else if (arg0 == 2) {
            this.field7476 = arg1.method1107(false);
        } else if (arg0 == 3) {
            this.field7478 = arg1.method1107(false);
        } else if (arg0 == 4) {
            this.field7475 = arg1.method1137((byte) -124);
        }
        if (arg2 < 76) {
            this.field7478 = 55;
        }
        field7477++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILtn;)V")
    public final void method3030(int arg0, class179 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                field7470++;
                return;
            }
            this.method3029(var3, arg1, 93);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method3031(int arg0) {
        if (arg0 != 0) {
            field7471 = null;
        }
        field7472 = null;
        field7471 = null;
    }
}
