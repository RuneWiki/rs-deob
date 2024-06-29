import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class404 implements class126 {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Lrn;")
    public class380 field5715;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public int field5717;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public int field5718;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public int field5720;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public int field5719;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "Ljava/lang/String;")
    public String field5713;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "Lhv;")
    public class97 field5716;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Ljv;")
    public final class606 method472(byte arg0) {
        if (arg0 == -110) {
            field5714++;
            return class689.field9732;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;Lrn;Lhv;IIII)V")
    public class404(String arg0, class380 arg1, class97 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5715 = arg1;
        this.field5717 = arg5;
        this.field5718 = arg4;
        this.field5720 = arg3;
        this.field5719 = arg6;
        this.field5713 = arg0;
        this.field5716 = arg2;
    }
}
