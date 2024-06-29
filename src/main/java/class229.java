import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class229 extends class176 {

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILada;Loe;III)V")
    public class229(int arg0, class267 arg1, class15 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3452 = arg5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Lof;")
    public final class475 method473(int arg0) {
        field3451++;
        return arg0 == 6 ? class463.field6467 : null;
    }
}
