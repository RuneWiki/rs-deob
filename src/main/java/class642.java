import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class642 extends class270 {

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public int field9084;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public int field9080;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public int field9083;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public int field9082;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public int field9081;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "Z")
    public boolean field9085;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "Lbca;")
    public static class604 field9079 = new class604("", 11);

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 8)
    public static void method3608(int arg0) {
        field9079 = null;
        if (arg0 != 11) {
            method3608(-1);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIIZ)V", line = 24)
    public class642(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field9084 = arg1;
        this.field9080 = arg3;
        this.field9083 = arg2;
        this.field9082 = arg4;
        this.field9081 = arg0;
        this.field9085 = arg5;
    }
}
