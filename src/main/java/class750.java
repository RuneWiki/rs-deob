import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class750 {

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field10228 = 0;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Z")
    public static boolean field10229 = true;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public int field10226;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public int field10230;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
    public static int field10231;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
    public int field10232;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "Z")
    public boolean field10227;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "Z")
    public boolean field10233;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIZ)V")
    public static final void method4068(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field10231++;
        class614 var5 = class497.method2759(19, 5977, (long) arg0 << 32 | (long) arg2);
        var5.method3277(639);
        if (!arg4) {
            method4068(-98, 102, -24, -117, false);
        }
        var5.field7742 = arg1;
        var5.field7746 = arg3;
    }
}
