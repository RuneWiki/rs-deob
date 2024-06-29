import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class461 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lda;")
    public class67 field6590 = null;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lkf;")
    public class263 field6592 = null;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "F")
    public static float field6591;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ[B)[B", line = 6)
    public static final byte[] method2743(int arg0, boolean arg1, byte[] arg2) {
        if (arg1) {
            method2743(54, true, null);
        }
        field6593++;
        byte[] var3 = new byte[arg0];
        class42.method288(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lda;)V", line = 26)
    public class461(class67 arg0) {
        this.field6590 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lda;Lkf;)V", line = 33)
    public class461(class67 arg0, class263 arg1) {
        this.field6590 = arg0;
        this.field6592 = arg1;
    }
}
