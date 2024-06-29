import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class456 extends class136 {

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private int field6708;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Lho;")
    public static class102 field6705 = new class102(15, 0, 1, 0);

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field6706 = -1;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILiv;)V", line = 3)
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field6704;
        if (arg0 != 4) {
            this.method82(3, 83);
        }
        if (~arg1 == -1) {
            this.field6708 = (arg2.method577(255) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V", line = 31)
    public class456(int arg0) {
        super(0, true);
        this.field6708 = 4096;
        this.field6708 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V", line = 41)
    public static void method2751(byte arg0) {
        field6705 = null;
        if (arg0 != -9) {
            field6707 = -89;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I", line = 57)
    public final int[] method82(int arg0, int arg1) {
        ++field6703;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = -80 / ((67 - arg0) / 50);
        if (super.field1957.field7031) {
            class201.method1409(var3, 0, class467.field6889, this.field6708);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 79)
    public class456() {
        this(4096);
    }
}
