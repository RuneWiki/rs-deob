import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class536 {

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public int field7368;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "Lmc;")
    private class381 field7371;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "[I")
    public static int[] field7369 = new int[8];

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "[B")
    public static byte[] field7370 = new byte[2048];

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(III)V")
    public static final void method3029(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        if (var3 != null && var3.field9227 != null) {
            var3.field9227 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7371.method2309(this.field7368, (byte) -114);
        field7367++;
        super.finalize();
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILic;)V")
    public static final void method3030(int arg0, class617 arg1) {
        field7366++;
        if (arg0 != 12667) {
            method3030(-12, null);
        }
        class86.field1059.method40(true);
        class86.field1059 = arg1;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
    public static void method3031(byte arg0) {
        if (arg0 == -36) {
            field7370 = null;
            field7369 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lmc;II)V")
    public class536(class381 arg0, int arg1, int arg2) {
        this.field7368 = arg2;
        this.field7371 = arg0;
    }
}
