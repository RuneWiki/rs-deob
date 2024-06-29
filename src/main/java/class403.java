import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class403 extends class354 {

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[[I")
    public static int[][] field5103 = new int[6][];

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5104 = 0;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
    public static boolean field5106 = false;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lwo;)V")
    public class403(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static void method2245(int arg0) {
        field5103 = null;
        if (arg0 != -2) {
            field5103 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field5101;
        return arg0 != 3 ? -85 : 1;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)I")
    public final int method2246(byte arg0) {
        ++field5107;
        int var2 = -66 / ((7 - arg0) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        ++field5102;
        super.field4545 = arg1;
        if (arg0 != -1) {
            this.method391(42, -102);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(ILwo;)V")
    public class403(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 != 6384) {
            field5104 = 84;
        }
        if (~super.field4545 != -2 && ~super.field4545 != -1) {
            super.field4545 = this.method393((byte) 126);
        }
        ++field5108;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field5105;
        int var2 = -18 / ((arg0 - 37) / 63);
        return 1;
    }
}
